package baseKotlin.part4.properties

interface IUser{
    val nickname: String // абстрактное свойства интерфейса
}

class PrivateUser(override val nickname: String) : IUser // properties primary constructor

class SubscribeUser(private val email: String) : IUser {
    override val nickname: String
        get() = email.substringBefore('@') // будет постоянно выбирать подстроку при вызове get()
}

class FacebookUser(var accountId: Int): IUser {
    override val nickname: String = getFacebookName(accountId) // один раз проинициализирует
    private fun getFacebookName(accountId: Int) = "nickname: $accountId"
}