package Dao

import model.{User, UserInfo}

class UserDao {

  import UserDao._

  def getAll: List[User] = {
    getAllUser
  }

  def getUser(id: Int): Option[User] = getUsers.collectFirst {
    case c if c.id == id => c
  }

  def getUserInfo(name: String, queryType: String): Option[Option[UserInfo]] = getUsers.collectFirst {
    case u if u.name.eq(name) => u.userInfo.collectFirst { case ui if ui.infoType == queryType => ui }
  }

}

object UserDao {
  def getAllUser: List[User] = {
    val users = List(
      User(1, "Anil", "IT", userInfo = List(UserInfo("location", "Bangalore"), UserInfo("birthday", "12-12-1991"))),
      User(2, "Ram", "HR", userInfo = List(UserInfo("location", "Tumkur"), UserInfo("birthday", "24-12-1990")))
    )
    users
  }

  def getUsers: Seq[User] = {
    val users = Seq(
      User(1, "Anil", "IT", userInfo = List(UserInfo("location", "Bangalore"), UserInfo("birthday", "12-12-1991"))),
      User(2, "Ram", "HR", userInfo = List(UserInfo("location", "Tumkur"), UserInfo("birthday", "24-12-1990")))
    )
    users
  }
}
