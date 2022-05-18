import java.util.*

open class Course (var id: Int, var name: String, var description: String ) {

    companion object{
            const val SUCCESS_REGISTER = "REGISTRO EXITOSO"
            const val SUCCESS_DELETE = "ELIMINACIÓN EXITOSA"
            const val SUCCESS_GET = "CONSULTA EXITOSA"
            const val ERROR = "ERROR EN EL PROCESO"
            const val INFO = "INFORMACIÓN"

    }
    
    open fun startCourse (nameCourse : String ): String {
        return "El curso $nameCourse a iniciado"
    }

    open fun finishCourse (nameCourse : String ): String {
        return "El curso $nameCourse a finalizado"
    }



}