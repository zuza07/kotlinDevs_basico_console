//teste de alteracao 28/02/2023

fun main(args: Array<String>) {

    //aula02(10, "Teste do zuza")
    //aula03()

    //aula04()
    aula05()
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
    val locli = ArrayList<Cliente>()

    locli.add(Cliente().construtor(1, "Eduardo Zuza", "Francisco Alves", "Sorocaba"))
    locli.add(Cliente().construtor(2, "Alexandre", "Francisco Alves", "Itu"))
    locli.add(Cliente().construtor(3, "Edinaldo", "Francisco Alves", "Sorocaba"))

    //Cliente().imprime(locli[1])
    Cliente().imprimeLista(locli)
}

fun aula05() {

    val _loCar = ArrayList<Carteira>()
    //val _loCar = MutableList<Carteira>)


    _loCar.add(Carteira().construtor("20/02/2023", "shop de vinho", 16, "D"))
    _loCar.add(Carteira().construtor("20/02/2023", "cerveja", 42))
    _loCar.add(Carteira().construtor("20/02/2023", "frango com farofa", 35))
    _loCar.add(Carteira().construtor("21/02/2023", "camiseta", 160))
    _loCar.add(Carteira().construtor("21/02/2023", "estacionamento", 13))
    _loCar.add(Carteira().construtor("21/02/2023", "sorvete", 990))
    _loCar.add(Carteira().construtor("21/02/2023", "salario", 1500, "C"))

    Carteira().imprimirLista(_loCar)

    var cTotal = 0
    for (obj in _loCar) {
        if (obj.CAR_TIPO.equals("C")) {
            cTotal = cTotal + obj.CAR_VALOR
        } else {
            cTotal = cTotal - obj.CAR_VALOR
        }
    }
    println("Total ${cTotal}")


    var cCredito = 0
    var cDebito = 0
    for (obj in _loCar) {
        if (obj.CAR_TIPO.equals("C")) {
            cCredito = cCredito + obj.CAR_VALOR
        } else {
            cDebito = cDebito + obj.CAR_VALOR
        }
    }
    //tarefa a desenvolver, descobrir a lógica para a impressão abaixo
    println("Credito = ${cCredito}  - Débito = ${cDebito}        SALDO = ${cCredito - cDebito}")

    //teste 123456
}