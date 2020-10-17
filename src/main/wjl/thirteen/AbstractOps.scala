package thirteen

/**
  * @author gouyangyang on 2018/9/26/026 09:30
  */
class AbstractClass {
  //使用占位符，只有在var时候可以使用占位符.val的时候是不能使用占位符的。
  var id: Int = _ //注意 这种方式必须声明为var
  //不可以定义为val 原因是因为_的值不明确
}

abstract class SuperTeacher(val name: String) {
  var id: Int
  var age: Int

  def teach
}

class TeacherForMaths(name: String) extends SuperTeacher(name) {
  //复写抽象类的成员，可以加override，可以不加，加上的话语义理解比较好
  override var id = name.hashCode()
  override var age = 29

  override def teach = println("teaching Math");
}

/**
  * 抽象类、抽象字段、抽象方法
  */
object AbstractOps {
  def main(args: Array[String]): Unit = {
    val teacher = new TeacherForMaths("Spark")
    teacher.teach
    println("teacher.id:" + teacher.id)
    println("teacher.age:" + teacher.age)
  }
}