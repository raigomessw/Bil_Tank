 open class Vehicle (var driver: Driver?= null,) {

    open fun drive() {

    }

}
 class Car() : Vehicle() {
     private var mph= 10
     private var destination =100

     override fun drive() {
         if (driver == null) {
             println("!!!Car didn’t drive - there’s no driver!!!")
         } else if (driver!!.name != "" && driver!!.age < 18 ) {
             println("Car didn't drive - ${driver!!.name} is ${driver!!.age}, must be 18 or older to drive!!")
         }else{
             destination -= mph
             println("Car drove $mph miles - $destination miles to go!!")
         }


     }
 }
    class MilitaryTank() : Vehicle() {
        private var mph1= 5
        private var destination =2000

        override fun drive() {
            if (driver == null){
                println("!!!MilitaryTank didn’t drive - there’s no driver!!!")
            } else if (driver!!.name != "" && driver!!.age < 25 ) {
            println("MilitaryTank didn't drive - ${driver!!.name} is ${driver!!.age}, must be 25 or older to drive!!")
            }else {
            destination -= mph1
            println("MilitaryTank drove $mph1 miles - $destination miles to go!!")
            }
        }
    }






