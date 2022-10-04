import java.text.DecimalFormat

class Commercial constructor(var propertyName:String, var multiProperty:Boolean, name:String, phoneNumber:String, address:String,
                             squareFootage:Double):
                             Customer(name, phoneNumber, address, squareFootage) {
    private val rate = 5.0
    private var weeklyCharge:Double = 0.0
    private val moneyFormat = DecimalFormat("$#,###.00")
     init {

     }
    fun calculateCommercial(){
        if(multiProperty){
            weeklyCharge = (rate*(squareFootage.toDouble()/1000.0)) - (rate*(squareFootage.toDouble()/1000.0))*0.10
        }
        else{
            weeklyCharge = rate*(squareFootage.toDouble()/1000.0)
        }
        println("Property Name: $propertyName\n" +
                "Owner's Name: $name\n" +
                "Phone Number: $phoneNumber\n" +
                "Address: $address\n" +
                "Square Footage: $squareFootage\n" +
                "Weekly charge: ${moneyFormat.format(weeklyCharge)}")
    }
}