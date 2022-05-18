import java.util.*

open class Course (var id: Int, var name: String, var description: String ) {

    companion object{
            const val SUCCESS_REGISTER = "REGISTRO EXITOSO"
            const val SUCCESS_DELETE = "ELIMINACIÓN EXITOSA"

            const val ERROR = "ERROR"
            const val INFO = "INFORMACIÓN"

    }
    
    open fun startCourse (nameCourse : String ): String {
        return "El curso $nameCourse a iniciado"
    }

    open fun finishCourse (nameCourse : String ): String {
        return "El curso $nameCourse a finalizado"
    }


    open fun getAllCourse () : MutableList<Course>? {
        return null;
    }

    open fun addCourse ( course: Course) : String {

        return "";
    }

    open fun deleteCourse (id: Int) : String {

        return "";
    }

    open fun updateCourse (course : Course) : String {

        return "";
    }


}