package sixteen

/**
  * @author gouyangyang on 2018/9/26/026 13:19
  */
package com.scala.spark

package object people {
  val defaultName = "Scala"
}

package people {

  class people {
    var name = defaultName
  }

}

import java.util.{HashMap => JavaHashMap}

import scala.{StringBuilder => _}

class PackageOps {}
package spark.navigation {

  abstract class Navigator {
    def act
  }
  package tests {

    // 在spark.navigation.tests包里
    class NavigatorSuite

  }

  package impls {

    class Action extends Navigator {
      def act = println("Action")
    }

  }

}

package hadoop {
  package navigation {

    class Navigator

  }

}

object PackageOps {
  def main(args: Array[String]): Unit = {
  }
}


/**
  * Scala包的隐式引用
  */ //java.lang包的所有内容
//_表示导入包中的所有的内容 等价于Java中的import java.lang.* //Predef对象中的所有的内容
