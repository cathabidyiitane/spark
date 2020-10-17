package twelve

/**
  * @author gouyangyang on 2018/9/26/026 09:16
  */
/**
  * 重写 ：可以重写成员变量和成员方法（重写字段或者方法）
  * 子类继承父类
  */
class OverrideOperation {
}

/**
  * woker 继承自person ，name，age，salary是woker的成员变量
  * 子类必须把父类的主构造器中的参数都填充满（和java不同：继承时采用 super使用父类的成员）
  *
  * @param name
  * @param age
  * @param salary
  */

class Worker(name: String, age: Int, val salary: Long) extends Person1(name, age) {
  println("This is the subClass of person,primary constructor of woker")
  override val school = "Spark" // 复写字段或者是方法都要进行 添加重写
  override def toString = "I am a worker !" + super.sleep

}

class Person1(val name: String, var age: Int) {
  println("The primarry constructor of Person")
  val school = "BJU"

  def sleep = "8 hours"

  override def toString = "I am a person !"
}

object Person {
  def main(args: Array[String]): Unit = {
    // 构建时先构建父类
    val w = new Worker("spark", 5, 100000)
    println("School :" + w.school)
    println(w.toString())
  }
}
