import java.util.*

fun main() {
    do{
        println("1) Commercial\n" +
                "2) Residential\n" +
                "3) Exit\n")
        var i = readln().toInt()

        if (i==1){
            println("Multi-Housing? Y/N")
            var multi = readln().uppercase(Locale.getDefault())
            println("Name?")
            var name = readln()
            println("Phone Number?")
            var phoneNum = readln()
            println("Address?")
            var address = readln()
            println("Square footage?")
            var sqrFeet = readln().toDouble()
            println("Property Name?")
            var propName = readln()

            var isMulti:Boolean
            if(multi.equals("Y")){
                isMulti = true
            }
            else{
                isMulti = false
            }
            var customer = Commercial(propName, isMulti, name,
                phoneNum, address, sqrFeet)
            customer.calculateCommercial()
        }
        else if(i==2){
            println("Age?")
            var age = readln().toInt()
            println("Name?")
            var name = readln()
            println("Phone Number?")
            var phoneNum = readln()
            println("Address?")
            var address = readln()
            println("Square footage?")
            var sqrFeet = readln().toDouble()

            var senior:Boolean
            if(age>64) {
                senior = true
            }
            else {
                senior = false
            }
            var customer = Residential(senior, name, phoneNum, address, sqrFeet)
            customer.calculateResidential()
        }

    }while(i<3)
}