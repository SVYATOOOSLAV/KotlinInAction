package baseKotlin.part4.constructor

open class User(val nickname: String)

class TwitterUser(nickname: String) : User(nickname)