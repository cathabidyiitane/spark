package twelve

/**
  *
  * scala 单继承
  *
  * @author gouyangyang on 2018/9/26/026 08:54
  */


class Employee {
  var salary: Float = 11100
}

class Programmer extends Employee {
  var bonus: Int = 5100
  println("Salary = " + salary)
  println("Bonus = " + bonus)
}


object Demo {
  def main(args: Array[String]): Unit = {
    new Programmer()
  }
}
