package service.impl

import Dao.UserDao
import javax.inject.{Inject, Named, Singleton}
import model.{User, UserInfo}
import service.UserService

@Singleton
@Named
class UserServiceImpl @Inject()(userDao: UserDao) extends UserService {
  override def getAll: List[User] = {
    userDao.getAll
  }

  override def getUserById(id: Long): User = {
    val users = userDao.getAll
    users.find(u => u.id == id).get

  }

  override def getUserInfo(userName: String, query: String): Option[Option[UserInfo]] = {

    userDao.getUserInfo(userName, query)
  }
}
