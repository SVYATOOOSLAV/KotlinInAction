package baseKotlin.part3.strings

fun parsePath1(path: String){
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir: $directory, name: $fileName, ext: $extension")
}

fun parsePath2(path: String){
    //при использовании тройных кавычек не надо экранировать слэш
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val mathResult = regex.matchEntire(path)
    if(mathResult != null){
        val (directory, fileName, extension) = mathResult.destructured
        println("Dir: $directory, name: $fileName, ext: $extension")
    }
}


fun main(){
    parsePath1("kotlin/baseKotlin/part3/strings/parsePathExample.kt")
    parsePath2("kotlin/baseKotlin/part3/strings/parsePathExample.kt")
}