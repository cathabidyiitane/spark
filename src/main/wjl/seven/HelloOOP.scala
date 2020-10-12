package seven

/**
  * Created by gouyangyang on 2018/9/20/020.
  */
object HelloOOP {
  def main(args: Array[String]): Unit = {
    val person = new Person
    person.increment()
    person.increment()
    println(person.current)
  }
  val student = new Student
  println(student.name)
}


class Person {
  private var age = 0
  def increment() {
    age += 1
  }

  def current = age
  def act(person: Person): Unit = {
    person.age
  }
}

class Student {
  private var privateAge = 0;
  val name = "Scala"
  def age = privateAge
  def isYounger(other: Student) = privateAge < other.privateAge
}