package twentyseven

/**
  * 1.scala 是没有java和switch case 语法的,相对应的,Scala 提供了更加强大的 match  case 语法，既模式匹配，类似替代switch case，match case也被称为模式匹配
  * 2.scala的match case 与Javas和witch case最大的不同点在于，java的switch case仅能匹配变量的值,比比1、2、3等；而Scala的match case可以匹配各种情况，比如变量的类型、集合的元素
  * 有值或者无值
  *
  * @author gouyangyang on 2018/10/17/017 17:59
  */
object TestMatch {
  def judgeGrade(grade: String): Unit = {
    grade match {
      case "A" => println("Excellent")
      case "B" => println("Good")
      case "C" => println("Just so so")
      case _ => println("you need work harder")
    }
  }
}
