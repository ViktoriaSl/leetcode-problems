package leetcode

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows
 * like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 */
object ZigzagConversion extends App {

  def convert(s: String, numRows: Int): String = {
    var resulting = Array.fill(numRows)("")
    var i = 0
    var j = 0
    var raw = 0

    numRows match {
      case 1 => s
      case _ =>
        while (i < s.length) {

          if ((j / numRows) % 2 == 1) {
            raw = raw - 1

            if (!(raw == 0 || raw == numRows - 1)) {
              resulting(raw) = (resulting(raw) + s(i))
              i = i + 1
            }
          } else {
            resulting(raw) = (resulting(raw) + s(i))

            raw = raw + 1
            i = i + 1
          }

          j = j + 1

        }

        resulting.mkString("")
    }
  }

}
