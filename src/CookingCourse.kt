
class CookingCourse(id: Int = 0, name: String = "", description: String = "", var countryOfCourse : String = "", var tipeOfFood : String = "") : Course(id, name, description){

    val courses = mutableListOf<CookingCourse>()

    fun add(course : CookingCourse): String{
        return if(courses.contains(course)){
            "EL CURSO ESTA DUPLICADO";
        }else{
            this.courses.add(course);
            Course.SUCCESS_REGISTER;
        }
    }

    fun update(course : CookingCourse): String{
        var bandera : Boolean = false;
        for(courseOut in this.courses){
            if(courseOut.id == course.id){
                bandera = true;
                this.courses.remove(courseOut);
                this.courses.add(course);
            }
        }
        return if(bandera){
            "MODIFICACION EXITOSA";
        }else{
            Course.ERROR;
        }
    }
    fun remove(element : Int) : String {

        return if (!courses.isEmpty()) {
            courses.removeAt(element)
            if (courses.removeAt(element) != null) {
               "El curso se ha eliminado correctamente"
            } else {
                "Ha ocurrido un error"
            }
        } else {
            "No hay cursos a eliminar"
        }
    }

    fun get(element: Int) : () -> CookingCourse {
        return {
            courses.get(element)
        }
    }

    fun getAll() : MutableList<CookingCourse> {
        return this.courses
    }

}