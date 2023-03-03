//teste de alteracao 28/02/2023

fun main(args: Array<String>) {

    //aula02(10, "Teste do zuza")
    //aula03()

    //aula04()
    //aula05()
    aula06()
}


fun aula01() {

    var nome: String = "Hello word1"
    nome = "Eduardo"
    println(nome)

}

fun aula02(_valor5: Int, _nome: String) {

    val sTexto = _nome
    val iValor1: Int = 20 //Integer ou Int
    val iValor2 = 30
    val dValor3 = 5.4 //Double ou Float

    println("resultado soma aula02 " + (iValor1 + iValor2))

    println("resultado soma aula02 $sTexto abracadabra ${iValor1 + iValor2}")

    println("resultado soma aula02 $sTexto abracadabra ${iValor1 + iValor2 * dValor3} ")

    val iValor4 = 60

    println("resultado soma aula02 $sTexto abracadabra ${iValor1 + iValor4 * dValor3} ")

    println("resultado soma aula02 $sTexto abracadabra ${(iValor1 + iValor4) * _valor5}")
}

fun aula03() {

    val oCli = Cliente().construtor(1, "Eduardo Zuza", "Francisco Alves", "Sorocaba")
    val oCli1 = Cliente().construtor(2, "Alexandre", "Francisco Alves", "Sorocaba")

    Cliente().imprime(oCli)

//    println("${oCli.CLI_CODIGO} - ${oCli.CLI_NOME}")

//    println("${oCli1.CLI_CODIGO} - ${oCli1.CLI_NOME}")

}

fun aula04() {
    //lista de objetos

    //Cliente().imprime(locli[1])
    val loCli = Cliente().verListaCliente()
    Cliente().imprimeLista(loCli)

    Cliente().imprimeLista(loCli)
}

fun aula05() {

    val _loCar = Carteira().verListaCarteira()

    Carteira().imprimirLista(_loCar)
    Carteira().totalizaCarteira(_loCar)
    //teste 123456 7891
}

fun aula06() {
    val loCar = Carteira().verListaCarteira()
    Carteira().totalizaCarteira(loCar)
    //Carteira().imprimirLista(loCar)

    val loCli = Cliente().verListaCliente()
    Cliente().imprimeLista(loCli)

    println("")

    //lambda
    //val loCli88 = loCli.filter { a -> a.CLI_CIDADE.equals("Sorocaba") }
    Cliente().imprimeLista(loCli.filter { a -> a.CLI_CIDADE.equals("Serra") })

    /*
    for (obj in loCli) {
        if (obj.CLI_CIDADE.equals("Sorocaba")) {
            Cliente().imprime(obj)
        }
    }

     */


    //impresso da lista da carteira valores que sejam maiores que 100

    //lista de debitos

    //lista de créditos

    //lista somente das cidades referente ao cliente
}
