package fifteen

/**
  * scala 多重继承
  * https://blog.csdn.net/abc7845129630/article/details/50055051
  *
  * @author gouyangyang on 2018/9/26/026 11:10
  */
class Human {
  println("Human")
}

trait TTeacher extends Human {
  println("TTeacher")

  def teach // 抽象方法
}

trait PianoPlayer extends Human {
  println("PianoPlayer")

  def playPiano = println("I'm playing piano....")

  //具体方法
}

class PianoTeacher extends Human with TTeacher with PianoPlayer {
  override def teach = println("I'm trianing student...")

  // 这里必须复写，否则无法构造对象PianoTeacher
}


object UserTrait {
  def main(args: Array[String]): Unit = {
    // 方法一
    val t1 = new PianoTeacher
    /**
      * 构造时结构为:
      * Human
      * TTeacher
      * PianoPlayer
      */

    t1.playPiano //row result: I'm playing piano....
    t1.teach //row result: I'm trianing student...
    println("------------------------------------------")

    //方法二 匿名类
    val t2 = new Human with TTeacher with PianoPlayer {
      override def teach = println("I'm teaching student...")
    }

    /**
      * 这种方式类似于Java中定义匿名实现接口的类的简化方式
      * new Interface({
      *
      * //@Override
      * public void fun(){
      * //to do something
      * }
      * });
      */

    t2.playPiano
    t2.teach
    /**
      * 结果为:
      * Human
      * TTeacher
      * PianoPlayer
      * I'm playing piano....
      * I'm teaching student...
      */
  }
}

/**
  * Scala中的实现AOP
  */
trait Action {
  def doAction
}

trait TBeforeAfter extends Action {
  /*注意 doAction虽然被复写 但仍然是abstract方法
  因为super.doAction并未实现 所以用abstract关键字标识*/
  abstract override def doAction {
    println("Initialization")
    super.doAction
    println("Destroyer")
  }
}

class Work extends Action {
  override def doAction = println("Working...")
}

object AOP {
  def main(args: Array[String]): Unit = {
    val w = new Work with TBeforeAfter
    //这里work实现了doAction，所以成功执行。
    w.doAction
    /**
      * result:
      * Initialization
      *   Working...
      * Destroyer
      */
  }
}


