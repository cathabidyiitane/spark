

/**
  * Created by gouyangyang on 2018/4/24/024.
  */
object SessionAggrStatAccumulatorTest {
  def main(args: Array[String]) {
    val cc = TestString()
//    println("大写转换：" + cc.changeUpper("abcde"))
//    println("小写转换：" + cc.changeLower("QWER"))
//    println("顺序反转：" + cc.reverseStr("123456789"))
//    println("删除指定位置的元素：" + cc.dropElement("0987654321"))
//    println("获取指定位置的元素：" + cc.subString("1234567"))
//    println("获取序列：" + cc.sequnceStr("qazxsw"))
//    println("添加元素：" + cc.addElement("1234qwer"))
    println("获取元素所在的下标：" + cc.getIndex("f"))
    println("获取指定下标的元素值：" + cc.getCharAt(2))
    println("是否包含指定字符：" + cc.containsIs("g")) //返回值是true或者false
  }

  case class TestString() {
    lazy val str = "abcdefghijklmnopqrstuvwxyz"

    //大写转换
    def changeUpper(str: String) = {
      str.map(_.toUpper)
    }

    //小写转换
    def changeLower(str: String) = {
      str.map(_.toLower)
    }

    //反转
    def reverseStr(str: String) = {
      str.reverse
    }

    //剔除元素
    def dropElement(str: String) = {
      str.drop(2) //剔除下标为2之前的元素
    }

    //截取指定位置的元素
    def subString(str: String) = {
      str.slice(1, 3) //前包后不包
    }

    //获取序列
    def sequnceStr(str: String) = {
      val s: Seq[Char] = str
      s
    }

    //获取序列
    def addElement(str: String) = {
      str.concat("hello")
    }

    //获得下标
    def getIndex(str2: String) = {
      str.indexOf("f")
    }

    //获取指定下标的元素
    def getCharAt(i: Int) = {
      str.charAt(i)
    }

    //是否包含该元素
    def containsIs(foo: String) = {
      str.contains(foo)
    }
  }

}
