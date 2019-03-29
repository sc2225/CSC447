
import scala.annotation.tailrec

@tailrec
def flatten [X] (xss:List[List[X]]) : List[X] = {
  xss match {
    case Nil     => Nil
    case ys::yss => ys ::: flatten (yss)
  }
}