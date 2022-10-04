import java.text.DecimalFormat

class Residential constructor(var isSenior:Boolean, name:String,
                              phoneNumber:String, address:String, squareFootage:Double):
                            Customer(name, phoneNumber, address, squareFootage){
    private val rate = 6.0
    private var weeklyCharge = 0.0
    private val moneyFormat = DecimalFormat("$#,###.00")
    init {

    }
    fun calculateResidential(){
        if(isSenior){
            weeklyCharge = (rate*(squareFootage.toDouble()/1000.0)) - (rate*(squareFootage.toDouble()/1000.0))*0.15
        }
        else{
            weeklyCharge = rate*(squareFootage.toDouble()/1000.0)
        }
        println(
                "Owner's Name: $name\n" +
                "Phone Number: $phoneNumber\n" +
                "Address: $address\n" +
                "Square Footage: $squareFootage\n" +
                "Weekly charge: ${moneyFormat.format(weeklyCharge)}")
    }
}