package seventeen

/**
  * @author gouyangyang on 2018/9/26/026 13:43
  */
package spark {
  package navigation {

    private[spark] class Navigator {
      protected[navigation] def useStarChart() {}

      class LegOfJourney {
        private[Navigator] val distance = 100
      }

      private[this] var speed = 200
    }

  }

  package launch {

    import seventeen.spark.navigation._

    object Vehicle {
      private[launch] val guide = new Navigator
    }

  }

}

class PackageOps_Advanced {

  import PackageOps_Advanced.power

  private def canMakeItTrue = power > 10001
}

object PackageOps_Advanced {
  private def power = 10000

  def makeItTrue(p: PackageOps_Advanced): Boolean = {
    val result = p.canMakeItTrue
    result
  }
}
