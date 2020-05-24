package wj.com.dt.scala.hello
import java.time.LocalDate
/**
  * Created by gouyangyang on 2018/5/2/002.
  */
object PlusDays {


  def main(args: Array[String]) {
    var nowdate = LocalDate.now()
    println("LocalDate.now()-->现在的时间是"+LocalDate.now())
    println("nowdate.plusDays-->明天是-->"+nowdate.plusDays(1))
    println("nowdate.minusDays-->昨天是-->"+nowdate.minusDays(1))
    println("nowdate.plusMonths-->今天加一个月-->"+nowdate.plusMonths(1))
    println("nowdate.minusMonths-->今天减一个月-->"+nowdate.minusMonths(1))
    println("nowdate.getDayOfYear-->今天是今年的第"+nowdate.getDayOfYear+"天")
    println("nowdate.getDayOfMonth->这个月有"+nowdate.getDayOfMonth+"天")
    println("nowdate.getDayOfWeek-->今天星期"+nowdate.getDayOfWeek)
    println("nowdate.getMonth-->这个月是"+nowdate.getMonth)
  }

}
