package baseKotlin.part4.`object`

class User private constructor(val nickname:String){
    companion object{ //может содержать имя
        fun newSubscribingUser(email: String) = User(email.substringBefore('@')) // вызываем приватный конструктор
        fun newFacebookUser(accountId: Int) = User(getFacebookName(accountId))
        private fun getFacebookName(accountId: Int) = "nickname: $accountId"
    }
}

interface JSONFactory<T>{
    fun fromJSON(jsonText: String): T
}

private class PersonComp(val name: String){
    companion object : JSONFactory<PersonComp>{
        override fun fromJSON(jsonText: String): PersonComp {
            val name = jsonText.substringAfter("'").substringBefore("'")
            return PersonComp(name)
        }
    }
}

class PersonEmptyComp(val name: String){
    companion object{}
}

fun PersonEmptyComp.Companion.fromJson(json: String) : PersonEmptyComp{
    val name = json.substringAfter("'").substringBefore("'")
    return PersonEmptyComp(name)
}

fun main(){
    // fabric
    val subscribeUser = User.newSubscribingUser("bob@mail.ru")
    println(subscribeUser.nickname)

    // function in companion
    val person = PersonComp.fromJSON("{name: 'Dmitry'}")
    println(person.name)

    // extension function
    val personEmptyComp = PersonEmptyComp.fromJson("{name: 'Svyat'}")
    println(personEmptyComp.name)
}