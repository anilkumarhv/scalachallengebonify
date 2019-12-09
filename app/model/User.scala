package model

case class UserInfo(infoType:String,value:String)

case class User(id: Int, name: String, dept: String, userInfo: List[UserInfo])
