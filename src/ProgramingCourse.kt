class ProgramingCourse(id: Int,
                       name: String,
                       description: String,
                       var matchPrograming: String,
                       var developArea: String,
                       ) : Course(id, name, description){

    val courses = mutableListOf<ProgramingCourse>()



    override fun startCourse(nameCourse: String): String {
        return "Has iniciado el curso de programación $this.name"
    }


    fun getAllCourse () : MutableList<ProgramingCourse> {
        return this.courses
    }

    fun addCourse (course: ProgramingCourse) : String {

        return if (course.name.length > 0 && course.description.length > 0) {
            this.courses.add(course)

            Course.SUCCESS_REGISTER
        } else {
            Course.ERROR
        }
    }

    fun deleteCourse (id: Int) : String {
        var delted: Boolean = false
        var objCourse: ProgramingCourse

        for (i in 0 until this.courses.size){
            if (this.courses.get(i).id == id){
                objCourse = this.courses.get(i)
                this.courses.remove(objCourse)
                delted = true
            }
        }
        return if (delted) Course.SUCCESS_REGISTER else Course.ERROR
    }

    fun updateCourse (course : ProgramingCourse) : String {

        return ""
    }

}