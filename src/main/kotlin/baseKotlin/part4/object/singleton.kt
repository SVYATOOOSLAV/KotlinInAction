package baseKotlin.part4.`object`

import java.io.File

object Payroll{ // Объявление класса с единственным экземляром этого класса
    val allEmployees = arrayListOf<String>()

    fun calculateSalary(){
        for(person in allEmployees){
            //
        }
    }

    fun showEmployees(){
        allEmployees.forEach { person -> println(person) }
    }
}

object CaseInsensitiveFileComparator : Comparator<File>{
    override fun compare(o1: File, o2: File): Int {
        return o1.path.compareTo(o2.path, ignoreCase = true)
    }
}

data class Person(val name: String){
    object CaseInsensitiveFileComparator : Comparator<Person>{
        override fun compare(p1: Person, p2: Person): Int =
             p1.name.compareTo(p2.name)
    }
}

fun main(){
    val firstPayroll = Payroll
    firstPayroll.allEmployees.add("Svyat")
    val secondPayroll = Payroll
    secondPayroll.allEmployees.add("Kirill")

    println(firstPayroll.showEmployees())
    //println(secondPayroll.showEmployees())

    println(CaseInsensitiveFileComparator.compare(File("/User"), File("/user")))

    val files = listOf(File("/Z"), File("/a"))
    println(files.sortedWith(CaseInsensitiveFileComparator))

    val persons = listOf(Person("Bob"), Person("Alice"))
    println(persons.sortedWith(Person.CaseInsensitiveFileComparator))
}