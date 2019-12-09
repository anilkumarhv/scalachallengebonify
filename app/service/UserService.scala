package service

import com.google.inject.ImplementedBy
import model.{User, UserInfo}
import service.impl.UserServiceImpl

@ImplementedBy(classOf[UserServiceImpl])
trait UserService {
def  getAll:List[User]
def getUserById(id:Long):User
def getUserInfo(userName:String,query: String):Option[Option[UserInfo]]
}