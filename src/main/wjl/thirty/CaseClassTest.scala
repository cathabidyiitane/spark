package thirty

/**
  * http://www.cnblogs.com/72808ljup/p/5518546.html
  * 1.自定义操作符
  * 2.操作付默认左结合调用.除了以:结尾的操作符是右结合调用
  *
  * @author gouyangyang on 2018/10/19/019 08:38
  */
object CaseClassTest {
  val a: myInt = new myInt(1)
  val b: myInt = new myInt(2)
  val c: myInt = new myInt(3)

  println(a +++ b)
  println((c ---: b ---: a).value) //：结尾的操作符右结合,相当于(a.---:(b)).---:(c) = 1-2-3
}

class myInt(val value: Int) {
  def +++(a: myInt): Int = { // 定义操作符 +++
    a.value + value // 要使a.value能够访问，主构造器的字段要生命成val.使getter,setter方法为public
  }

  // 操作符默认左结合,除了以:结尾的操作符使o结合的右.比如::
  def ---:(a: myInt): myInt = {
    new myInt(this.value - a.value)
  }
}
/**
  * 二.apply,update,ubapply去名调用
  *
  * 1.apply(param)方法
  *
  * （1）apply对象通常声明在半生对象中,用来构造对象
  * （2）cala把apply()方法的调用简化成了(param)
  * 2.
  * update(param)方法
  * update()方法的调用,简化成了(param)=
  *
  * 3.unapply方法
  * （1）当用未初始化的变量放在一个类()里,和等式右侧的对象进行匹配时,则这些未初始化的变量调用该类的unapply方法进行初始化
  * （2）unapply()方法返回的结果使Option[元祖]类型的,要么是None,要么是Some[T]
  *
  *
  * Case class
  * 1.什么事样例类:经过scala编译器优化后，被更好的用于模式匹配规则的类
  * (1)Case class 的每个参数默认以val(不变形式)存在，除非显式的声明为var
  * (2)自动产生伴生对象,且伴生对象中自动产生的
  *
  */