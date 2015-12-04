// @SOURCE:/mnt/kup/projects/Drexel/CS575SofDes/As/A3/CS-575-Final-Project-Web/conf/routes
// @HASH:688033b331b1afc0038e97eb64d28c9c76c197fe
// @DATE:Thu Dec 03 21:55:37 EST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
package controllers {

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseUsers {


// @LINE:15
def updateUser(firstName:String, lastName:String): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "user/" + implicitly[PathBindable[String]].unbind("firstName", dynamicString(firstName)) + "/" + implicitly[PathBindable[String]].unbind("lastName", dynamicString(lastName)))
}
                        

// @LINE:16
def deleteUser(idNumber:Int): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "user/" + implicitly[PathBindable[Int]].unbind("idNumber", idNumber))
}
                        

// @LINE:13
def findUsers(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users")
}
                        

// @LINE:14
def createUser(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "user")
}
                        

}
                          

// @LINE:19
class ReverseAssets {


// @LINE:19
def versioned(file:Asset): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
}
                        

}
                          

// @LINE:10
// @LINE:9
// @LINE:8
class ReverseApplication {


// @LINE:9
def randomUUID(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "randomUUID")
}
                        

// @LINE:8
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:10
def admin(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "admin")
}
                        

}
                          
}
                  


// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseUsers {


// @LINE:15
def updateUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.updateUser",
   """
      function(firstName,lastName) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("firstName", encodeURIComponent(firstName)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lastName", encodeURIComponent(lastName))})
      }
   """
)
                        

// @LINE:16
def deleteUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.deleteUser",
   """
      function(idNumber) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("idNumber", idNumber)})
      }
   """
)
                        

// @LINE:13
def findUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.findUsers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
      }
   """
)
                        

// @LINE:14
def createUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.createUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
      }
   """
)
                        

}
              

// @LINE:19
class ReverseAssets {


// @LINE:19
def versioned : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.versioned",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:10
// @LINE:9
// @LINE:8
class ReverseApplication {


// @LINE:9
def randomUUID : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.randomUUID",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "randomUUID"})
      }
   """
)
                        

// @LINE:8
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:10
def admin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.admin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
      }
   """
)
                        

}
              
}
        


// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
package controllers.ref {


// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseUsers {


// @LINE:15
def updateUser(firstName:String, lastName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Users]).updateUser(firstName, lastName), HandlerDef(this.getClass.getClassLoader, "", "controllers.Users", "updateUser", Seq(classOf[String], classOf[String]), "PUT", """""", _prefix + """user/$firstName<[^/]+>/$lastName<[^/]+>""")
)
                      

// @LINE:16
def deleteUser(idNumber:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Users]).deleteUser(idNumber), HandlerDef(this.getClass.getClassLoader, "", "controllers.Users", "deleteUser", Seq(classOf[Int]), "PUT", """""", _prefix + """user/$idNumber<[^/]+>""")
)
                      

// @LINE:13
def findUsers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Users]).findUsers(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Users", "findUsers", Seq(), "GET", """ User management API""", _prefix + """users""")
)
                      

// @LINE:14
def createUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Users]).createUser(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Users", "createUser", Seq(), "POST", """""", _prefix + """user""")
)
                      

}
                          

// @LINE:19
class ReverseAssets {


// @LINE:19
def versioned(path:String, file:Asset): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.versioned(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "versioned", Seq(classOf[String], classOf[Asset]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:10
// @LINE:9
// @LINE:8
class ReverseApplication {


// @LINE:9
def randomUUID(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).randomUUID(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "randomUUID", Seq(), "GET", """""", _prefix + """randomUUID""")
)
                      

// @LINE:8
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Single endpoint for serving AngularJS""", _prefix + """""")
)
                      

// @LINE:10
def admin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).admin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "admin", Seq(), "GET", """""", _prefix + """admin""")
)
                      

}
                          
}
        
    