package wj.com.dt.scala.hello

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by gouyangyang on 2018/4/26/026.
  */
object Slice {


  def main(args: Array[String]): Unit = {

//    val sparkConf = new SparkConf().setAppName("Slice").setMaster("local")
//    val sc = new SparkContext(sparkConf)
  // 提取列表中从位置from到位置until(不含该位置)的元素列表
//    val nums = List(1,2,3,4,5)
//    val sliced = nums.slice(2,4) //List(3,4)
//    print(sliced)
    // 问题： 把 文本字符串"[1, 2, 3, 4, 5]" 转换成一个数组。
    // 答案：
    val x = "[1, 2, 3, 4, 5]"
    val y =x slice(1, x.length-1) replace(",","") split(" ")
    //var y1= x slice(1, x.length-1) replace(",","") split(" ") map(_.toInt)
    // 或者
    var y1= x.slice(1, x.length-1).replace(",","").split(" ").map(_.toInt)
    println(y)
    println(y1)







   // object try4 { def main(args: Array[String]) { println("=========================常用操作符===================")
      //val left = List(1,2,3) val right = List(4,5,6) //以下操作等价
      // println(left ++ right)
      // List(1,2,3,4,5,6) println(left ++: right)
      // List(1,2,3,4,5,6) println(right.++:(left))
      // List(1,2,3,4,5,6) println(right.:::(left))
      // List(1,2,3,4,5,6) //以下操作等价 println(0 +: left)
      // List(0,1,2,3) println(left.+:(0))
      // List(0,1,2,3)
      // 以下操作等价 println(left :+ 4)
      // List(1,2,3,4) println(left.:+(4))
      // List(1,2,3,4)
      // 以下操作等价 println(0 :: left)
      // List(0,1,2,3) println(left.::(0))
      // List(0,1,2,3) println("====================================================")
      // println("=========================map操作======================") val nums = List(1,2,3) val square = (x: Int) => x*x println(nums.map(num => num*num))
      // List(1,4,9) println(nums.map(math.pow(_,2))) //List(1.0, 4.0, 9.0) println(nums.map(square))
      // List(1,4,9) println("====================================================")
      // println("======================flatmap操作====================") val text = List("A,B,C","D,E,F") val textMapped = text.map(_.split(",").toList)
      // List(List(A, B, C), List(D, E, F)) println(textMapped) val textFlattened = textMapped.flatten
      // List(A, B, C, D, E, F) println(textFlattened) val textFlatMapped = text.flatMap(_.split(",").toList)
      // List(A, B, C, D, E, F) println(textFlatMapped)
      // println("====================================================")
      // println("=======================reduce操作=====================")
      // nums = List(1,2,3) println(nums.reduce((a,b) => a+b))
      // 6 println(nums.reduce(_+_)) //6 println(nums.sum)
      // 6 val doubles = List(2.0,2.0,3.0) val resultLeftReduce = doubles.reduceLeft(math.pow)
      // = pow( pow(2.0,2.0) , 3.0) = 64.0 println(resultLeftReduce) val resultRightReduce = doubles.reduceRight(math.pow)
      // = pow(2.0, pow(2.0,3.0)) = 256.0 println(resultRightReduce)
      // println("====================================================")
      // println("=========================fold操作======================") val nums2 = List(2,3,4) println(nums2.fold(1)(_+_))
      // = 1+2+3+4 = 10 val nums3 = List(2.0,3.0) println(nums3.foldLeft(4.0)(math.pow))
      // = pow(pow(4.0,2.0),3.0) = 4096 println(nums3.foldRight(1.0)(math.pow))
      // = pow(1.0,pow(2.0,3.0)) = 8.0 println("====================================================")
      // println("=========================filter操作====================")
      // val nums4 = List(1,2,3,4) val odd = nums4.filter( _ % 2 != 0)
      // List(1,3) println(odd) val even = nums4.filterNot( _ % 2 != 0)
      // List(2,4) println(even) println("====================================================")
      // println("=============diff, union, intersect操作===============")
      // val nums5 = List(1,2,3) val nums6 = List(2,3,4)
      // val diff1 = nums5 diff nums6
      // List(1) println(diff1)
      // val diff2 = nums6.diff(nums5)
      // List(4) println(diff2) val union1 = nums5 union nums6
      // List(1,2,3,2,3,4) println(union1) val union2 = nums6 ++ nums5
      // List(2,3,4,1,2,3) println(union2) val intersection = nums5 intersect nums6
      // List(2,3) println(intersection) println("====================================================")
      // println("==================groupBy, grouped操作================")
      // val data = List(("HomeWay","Male"),("XSDYM","Femail"),("Mr.Wang","Male"))
      // val group1 = data.groupBy(_._2)
      // Map("Male" -> List(("HomeWay","Male"),("Mr.Wang","Male")),"Female" -> List(("XSDYM","Femail"))) println(group1) val group2 = data.groupBy{case (name,sex) => sex}
      // Map("Male" -> List(("HomeWay","Male"),("Mr.Wang","Male")),"Female" -> List(("XSDYM","Femail"))) println(group2) val fixSizeGroup = data.grouped(2).toList
      // List(List((HomeWay,Male), (XSDYM,Femail)), List((Mr.Wang,Male)))
      // println(fixSizeGroup)
      // println("====================================================")
      // println("========================scan操作=====================") val nums7 = List(1,2,3)
      // println(nums7.scan(10)(_+_)) // List(10,10+1,10+1+2,10+1+2+3) = List(10,11,13,16) val nums8 = List(1.0,2.0,3.0)
      // println(nums8.scanLeft(2.0)(math.pow))
      // List(2.0,pow(2.0,1.0), pow(pow(2.0,1.0),2.0),pow(pow(pow(2.0,1.0),2.0),3.0) = List(2.0,2.0,4.0,64.0)
      // println(nums8.scanRight(2.0)(math.pow))
      // List(2.0,pow(3.0,2.0), pow(2.0,pow(3.0,2.0)), pow(1.0,pow(2.0,pow(3.0,2.0))) = List(1.0,512.0,9.0,2.0)
      // println("====================================================")
      // println("=========================take操作======================")
      // val nums9 = List(1,1,1,1,4,4,4,4) println(nums9.take(4))
      // List(1,1,1,1) println(nums9.takeRight(4))
      // List(4,4,4,4) println(nums9.takeWhile( _ == nums.head)) // List(1,1,1,1)
      // println("====================================================")
      // println("========================drop操作=====================")
      // val nums10 = List(1,1,1,1,4,4,4,4) println(nums10.drop(4))
      // List(4,4,4,4) println(nums10.dropRight(4))
      // List(1,1,1,1) println(nums10.dropWhile( _ == nums.head))
      // List(4,4,4,4) println("====================================================")
      // println("===============span,splitAt,partition操作=============")
      // val nums11 = List(1,1,1,2,3,2,1) val (prefix,suffix) = nums11.span( _ == 1)
      // prefix = List(1,1,1), suffix = List(2,3,2,1) println((prefix,suffix))
      // val (prefix2,suffix2) = nums11.splitAt(3) // prefix = List(1,1,1), suffix = List(2,3,2,1)
      // println((prefix2,suffix2)) val (prefix3,suffix3) = nums11.partition( _ == 1)
      // prefix = List(1,1,1,1), suffix = List(2,3,2) println((prefix3,suffix3))
      // println("====================================================")
      // println("========================padTo操作=====================") v
      // al nums12 = List(1,1,1) println(nums12.padTo(6,2))
      // println("====================================================")
      // println("=============combinations&permutations操作============")
      // val nums13 = List(1,1,3) println(nums13.combinations(2).toList)
      // List(List(1,1),List(1,3)) println(nums13.permutations.toList)
      // List(List(1,1,3),List(1,3,1),List(3,1,1))
      // println("====================================================")
      // println("========================zip操作======================")
      // val alphabet = List("A","B","C") val nums14 = List(1,2)
      // val zipped = alphabet zip nums14 // List(("A",1),("B",2))
      // println(zipped) val zippedAll = alphabet.zipAll(nums14,"*",-1)
      // List(("A",1),("B",2),("C",-1))
      // println(zippedAll) val zippedIndex = alphabet.zipWithIndex
      // List(("A",0),("B",1),("C",3))
      // println(zippedIndex) val (list1,list2) = zipped.unzip
      // list1 = List("A","B"), list2 = List(1,2)
      // println((list1,list2)) val (l1,l2,l3) = List((1, "one", '1'),(2, "two", '2'),(3, "three", '3')).unzip3
      // l1=List(1,2,3),l2=List("one","two","three"),l3=List('1','2','3')
      // println((l1,l2,l3))
      // println("====================================================")
      // println("=======================slice操作=====================") val nums15 = List(1,2,3,4,5)
      // println(nums15.slice(2,4)) //List(3,4) println("====================================================")
      // println("======================sliding操作====================") val nums16 = List(1,1,2,2,3,3,4,4) val groupStep1 = nums16.sliding(2,2).toList
      // List(List(1,1),List(2,2),List(3,3),List(4,4)) println(groupStep1) val groupStep2 = nums16.sliding(2).toList
      // List(List(1,1),List(1,2),List(2,2),List(2,3),List(3,3),List(3,4),List(4,4)) println(groupStep2)
      // println("====================================================")
      // println("======================updated操作====================")
      // val nums17 = List(1,2,3,3) val fixed = nums17.updated(3,4)
      // List(1,2,3,4) println(fixed) println("====================================================") } }









































  }
}
