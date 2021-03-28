package kxscala.ten

/** https://www.cnblogs.com/HeQiangJava/p/6711527.html
  *
  * @author gouyangyang on 2018/12/28/028 15:37
  *         trait 调用链
  *         Scala 中支持当类继承多个trait后,一次调用多个trait中的同一个方法，只要让多个trait的同一个方法，在最后都执行super方法即可
  *         类中调用多个trait中都有的这个方法时，首先会从最右边trait的方法开始执行，然后依次往左执行，形成一个调用链接条
  *         这样特性非常强大，其实就相当于设计模式中的责任链模式一种具体实现依赖
  */
trait Handler {
  def handle(data: String) {}
}

trait DataValidHandler extends Handler {


}



