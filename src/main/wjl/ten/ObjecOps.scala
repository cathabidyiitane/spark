package ten

/**
  * Created by gouyangyang on 2018/9/21/021.
  */
class University {
  val id = University.newStudenNo
  private var number = 0

  def aClass(number: Int) {
    this.number += number
  }
}

object University {
  private var studentNo = 0
  def newStudenNo = {
    studentNo += 1
    studentNo
  }
}

object ObjecOps {
  def main(args: Array[String]): Unit = {
    println(University.newStudenNo)
    println(University.newStudenNo)
  }
}
