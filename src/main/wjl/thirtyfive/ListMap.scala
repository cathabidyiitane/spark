package thirtyfive

/**
  * @author gouyangyang on 2019/3/8/008 09:28
  */
object ListMap {

  def main(args: Array[String]): Unit = {
    //println(List(1, 2, 3, 4, 6) map (_ + 1))
    // map(_+1)为对List元素+1的执行函数,等价于map(item=>item+1)
    val data = List("Scala", "Hadoop", "Spark")
//    println(data map (_.length))
//    println(data map (_.toList.reverse.mkString))

    // tolist 将字符串重新转换为list,reverse.mkString将字符串颠倒,输出结果 为list(alacS,poodaH,krapS）
    println(data.map(_.toList))
    println(data.flatMap(_.toList))

    //结果为：list（S,c,a,l,a,H,a,d,o,o,p,S,p,a,r,k）

//    println(List.range(1, 10) flatMap (i => List.range(1, i) map (j => (i, j))))
//    //j=>(i,j) 为tuple元组,结合floatmap和map; range(i,j)为左闭右开
//
//    var sum = 0;
//    List(1, 2, 3, 4, 5) foreach (sum += _)
//    println("sum : " + sum)
//
//    println(List(1, 2, 3, 4, 6, 7, 8, 9, 10) filter (_ % 2 ==0))  //取偶
//
//    println(data filter(_.length==5))
  }

}
