package three

/**
  * Created by gouyangyang on 2018/6/10/010.
  */
object MapOperations {

  def main(args: Array[String]): Unit = {

    val ages = Map("Rocky" -> 27, "Spark" -> 5)
    //  _ 占位符不是一个具体的值，他只是为这个变量占一个位
    for ((k, _) <- ages) { //placeholder
      println("Key is " + k)
    }
  }
}
