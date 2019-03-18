fun main(args: Array<String>) {
    var l:MutableList<Int>? = mutableListOf()

    for(i in 1..100){
        if(i%7 == 0){
            l?.add(i)?:0
        }
    }

    print(l)
}