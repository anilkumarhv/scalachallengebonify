package controllers

import javax.inject.{Inject, Qualifier, Singleton}
import model.{User, UserInfo}
import play.api.http
import play.api.http.Writeable
import play.api.libs.json.{JsObject, Json, Writes}
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents, Request}
import service.UserService

@Singleton
class UserController @Inject()(cc: ControllerComponents, userService: UserService) extends AbstractController(cc) {

  def getAll() = Action { implicit request: Request[AnyContent] =>
    //Ok(Json.toJson(userService.getAll))
    implicit val userWrites: Writes[User] = new Writes[User] {
      def writes(user: User): JsObject = Json.obj(
        "id" -> user.id,
        "name" -> user.name,
        "dept" -> user.dept,
      )
    }

    Ok {
      Json.toJson(userService.getAll)
    }

  }

  def get(id: Int): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    implicit val userWrites: Writes[User] = new Writes[User] {
      def writes(user: User): JsObject = Json.obj(
        "id" -> user.id,
        "name" -> user.name,
        "dept" -> user.dept,
      )
    }

    Ok {
      Json.toJson(userService.getUserById(id))
    }
  }

  def getUserInfo(name: String, queryType: String): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    implicit val userWrites: Writes[UserInfo] = new Writes[UserInfo] {
      def writes(user: UserInfo): JsObject = Json.obj(
        "type" -> user.infoType,
        "value" -> user.value,
      )
    }

    Ok {
      Json.toJson(userService.getUserInfo(name, queryType))
    }
  }

}
