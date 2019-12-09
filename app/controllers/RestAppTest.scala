package controllers

import Dao.UserDao
import service.impl.UserServiceImpl

object RestAppTest extends App {
val userDao=new UserServiceImpl(new UserDao)

val info=userDao.getUserInfo("Anil","birthday")

println(info.get.get)

}
