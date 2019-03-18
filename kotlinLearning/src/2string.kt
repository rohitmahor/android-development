fun main(args: Array<String>) {
    var fishName:String = ""

    when(fishName.length){
        0->println("error")
        in 3..12 ->println("good")
        else->println("ok")
    }

}