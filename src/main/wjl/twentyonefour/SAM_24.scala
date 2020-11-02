package twentyonefour

import java.awt.event.{ActionEvent, ActionListener}
import javax.swing.{JButton, JFrame}

/**
  * @author gouyangyang on 2018/10/12/012 16:41
  */
object SAM_24 {
  def main(args: Array[String]): Unit = {
    var data = 0
    val frame = new JFrame("sam testing")
    val jButton = new JButton("counter")

    implicit def convertedAction(action: (ActionEvent) => Unit) =
    //convertedAction这个名字是什么无所谓，但是ActionEvent类型必须和下面的addActionListener里参数类型相同
      new ActionListener {
        override def actionPerformed(event: ActionEvent) {
          action(event)
        }
      }

    jButton.addActionListener((event: ActionEvent) => {
      data += 1;
      println(data)
    })
    frame.setContentPane(jButton)
    frame.pack()
    frame.setVisible(true)
  }
}
