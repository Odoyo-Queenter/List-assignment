import javax.management.MBeanRegistration

fun main(){
    var call = names(listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"))
    println(call)

    var x=height(listOf(40,60,20))
    println(x)

    var queen = person("Queenter",24,56,58)
    var mary = person("Mary",30,156,70)
    var faith = person("Faith",4,100,13)

    var people = listOf(queen,mary,faith)
    var adults = people.sortedByDescending { p -> p. age}
    println(adults)

    var kimberly = person("Kimberly",3,120,15)
    var gedion = person("Gedion",6,170,17)

    var list = mutableListOf(kimberly,gedion)
    println(people.plus(list))

    var audi = Car("KWD705",40)
    var volvo = Car("KWT605",60)
    var wish = Car("QFT254",20)

    var myCars = listOf(audi,volvo,wish)
    println(covarage(myCars))





}
//1.Given a list of 10 strings,write a function that returns a list of the strings
//at given indices i.e index 2,4,6 etc.

//2. Given a list of people's heights in metres. Write a function that rfeturns
//the avarage height and the total height

//3. Given a list of person objects, each with the attributes ,name ,age, height and weight.
//sort the list in order of descending age.

//4. Given a list similar to the one above , write a function
// in which you will create 2 more people objects and add them
// to the list at one go.

//5. Write a function that takes in a list of Car objects each with a
// registration and mileage attribute and returns the avarage mileage
//of all the vehicles in the list

fun names(name:List<String>):List<String>{
    var identity = mutableListOf<String>()
    name.forEachIndexed { index, s ->
        if (index %2 ==0){
            identity.add(s)
        }
    }
    return identity
}

fun height(numb:List<Int>):String {
    var heights = numb.sum()
    var meters = numb.average()
    var total = "$heights,$meters"

    return  total
    println(total)
}

data class person(var name:String, var age:Int,var height:Int, var weight:Int)


    fun individual(individuals:List<Any>):List<Any>{
        return listOf()
    }



data class Car(var registration: String, var mileage: Int)



fun covarage(numbs:List<Car>):Int {
    var mile = 0
    numbs.forEach { m -> m.mileage
        mile += m.mileage
    }
    var  miles = mile/numbs.count()
    return miles
}
