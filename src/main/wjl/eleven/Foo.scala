package eleven

/**
  * Created by gouyangyang on 2018/9/24/024.
  */

class Foo(foo: String) {

}

object Foo {
  def apply(foo: String): Foo = {
    new Foo(foo)
  }
}
