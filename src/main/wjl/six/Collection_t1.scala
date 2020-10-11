package six

/**
  * Created by gouyangyang on 2018/9/20/020.
  */
object Collection_t1 {

  def flatMap1(): Unit = {
    val li = List(1, 2, 3)
    val res = li.flatMap(x => x match {
      case 3 => List('a', 'b')
      case _ => List(x * 2)
    })
    println(res)
  }

  def map1(): Unit = {
    val li = List(1, 2, 3)
    val res = li.map(x => x match {
      case 3 => List('a', 'b')
      case _ => x * 2
    })
    println(res)
  }

  def main(args: Array[String]): Unit = {
    flatMap1()
    map1()
  }
}
