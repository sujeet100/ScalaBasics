case class Position(x: Int, y: Int)

//up, down, left, right

sealed trait Action

case object UP extends Action

case object DOWN extends Action

case object LEFT extends Action

case object RIGHT extends Action


def move(pos: Position, action: Action): Position = {
  action match {
    case UP    => Position(pos.x, pos.y + 1)
    case DOWN  => Position(pos.x, pos.y - 1)
    case LEFT  => Position(pos.x - 1, pos.y)
    case RIGHT => Position(pos.x + 1, pos.y)
    case _     => pos
  }

}

def isGameOver(pos: Position) = {
  pos match {
    case Position(x, y) if x < 0 || y < 0 => true
    case Position(5, 5)                   => true
    case _                                => false
  }
}

val p = Position(0, 0)
val n = move(p, LEFT)
move(n, RIGHT)

isGameOver(p)
isGameOver(Position(-1, 1))
isGameOver(Position(1, -1))
