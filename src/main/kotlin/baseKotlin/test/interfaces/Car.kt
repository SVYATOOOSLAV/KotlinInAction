package baseKotlin.test.interfaces

class Car : Move {
    private var speed: Int = 0
    override fun increaseSpeed(score: Int) {
        speed += score
    }
}