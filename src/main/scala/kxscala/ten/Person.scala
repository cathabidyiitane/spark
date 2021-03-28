package kxscala.ten

/**
  * scala 中的Triat可以定义具体field，此时继承trait的类就获得了trait中定义的field
  * 但是这种获取field 的方法与继承class 是不同的;如果是继承class获取的field,实际上是定义在父类中的;
  * 而继承trait获取的field,就直接被添加到了类中
  *
  * @author gouyangyang on 2018/12/28/028 12:02
  */
// Scala中的Triat可以定义具体field，此时继承trait的类就自动获得了trait中定义的field
// 但是这种获取field的方式与继承class是不同的：如果是继承class获取的field，实际是定义在父类中的；而继承trait获取的field，就直接被添加到了类中

//trait Person {
//  val eyeNum: Int = 2

  //class Student(val name: String) extends Person {
  //  def sayHello = println("Hi, I'm " + name + ", I have " + eyeNum + " eyes.")
  //}

//}