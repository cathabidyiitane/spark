package three

/**
  * Created by gouyangyang on 2018/6/10/010.
  */
object TupleOps {

  def main(args: Array[String]): Unit = {
    val triple = (100,"Scala","Spark")
    println(triple._1)
    println(triple._2)
    println(triple._3)
  }

}
