package controllers

import javax.inject._
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}
//import play.api._
//import play.api.mvc._
//import play.api.libs.json._
//import scala.collection.mutable.ArrayBuffer


class RestController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action { implicit request: Request[AnyContent] =>
//    Ok(generateQuote(scala.util.Random.nextInt(10)))
// https://github.com/dan-mcm/inspiration-api/blob/master/app/controllers/InspirationController.scala
// https://auth0.com/blog/build-and-secure-a-scala-play-framework-api/
// 
  }

//  val connectionUrl = s"jdbc:postgresql://localhost:5432/inspiration_db?user=${sys.env("DB_USER")}&password=${sys.env("DB_PASS")}"
//
//  def generateQuote(random:Int): String = {
//    var output = ""
//
//    // connecting to postgres db for accessing data
//    Database.forURL(connectionUrl, driver = "org.postgresql.Driver") withSession {
//      implicit session =>
//        val quotes = TableQuery[Quotes]
//
//        // SELECT * FROM quotations WHERE id=randomInt
//        quotes.filter(_.index === random+1).list foreach { row =>
//          output = s"\n\n ${row._2}: ${row._3} \n"
//        }
//    }
//    output
//  }
}
