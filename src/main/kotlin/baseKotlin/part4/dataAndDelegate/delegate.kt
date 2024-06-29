package baseKotlin.part4.dataAndDelegate
/*"""
Реализуем свою коллекцию через делегирование основных методов во внутреннюю коллекцию
"""*/
class CountingSet<T>(private val innerSet: MutableCollection<T> = HashSet<T>()) //декорируемый контейнер
    : MutableCollection<T> by innerSet{

    var objectsAdded = 0


    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }
}

fun main(){
    val cset = CountingSet<Int>()
    cset.add(1)
    println(cset.objectsAdded)
}