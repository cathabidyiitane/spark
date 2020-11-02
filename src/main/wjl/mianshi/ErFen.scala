package mianshi

/**
  * @author gouyangyang on 2018/10/5/005 08:58
  */
object ErFen {
  def main(args: Array[String]) {
    //var z:Array[Int] = new Array[Int](14);
    // var z = new Array[Int](14);
    var z = Array(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27);
    var y: Int = search(z, 15);
    if (y == -1) {
      println("要查找的值不存在");
    }
  }

  def search(arr: Array[Int], des: Int): Int = {
    var x: Int = 1;
    var low: Int = 0;
    var high: Int = arr.length - 1;
    while (low <= high) {
      println("第" + x + "次比较");
      x += 1;
      var mid: Int = (high + low) / 2;
      if (des == arr(mid)) {
        println(des + "找到了，在第" + mid + "个位置");
        return mid;
      } else if (des < arr(mid)) {
        println(arr(mid) + "比" + des + "大，继续查找");
        high = mid - 1;
      } else {
        println(arr(mid) + "比" + des + "小，继续查找");
        low = mid + 1;
      }
    }
    return -1;
  }
}
