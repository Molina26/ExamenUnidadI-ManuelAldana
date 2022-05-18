open class Course (var id: Int, var name: String, var description: String ) {

    companion object{
            const val SUCCESS = "REGISTRO EXITOSOS"
            const val ERROR = "REGISTRO EXITOSOS"
            const val INFO = "REGISTRO EXITOSOS"

    }
    
    open fun startCourse (nameCourse : String ): String {
        return "El curso $nameCourse a iniciado"
    }

    open fun finishCourse (nameCourse : String ): String {
        return "El curso $nameCourse a finalizado"
    }
    

}