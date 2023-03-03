import java.util.*

class Carteira {

    var CAR_DATA = String()
    var CAR_DESPESA = ""
    var CAR_TIPO = "" //armazena D ou C
    var CAR_VALOR = 0

    //teste git
    fun construtor(_data:String, _despesa:String, _valor:Int, _tipo:String = "D"): Carteira {

        val _oCar = this
        _oCar.CAR_DATA = _data
        _oCar.CAR_DESPESA = _despesa
        _oCar.CAR_VALOR = _valor
        _oCar.CAR_TIPO = _tipo

        return _oCar
    }

    fun imprimir(_oCar: Carteira) {
        println("${_oCar.CAR_DATA.toString()}, ${_oCar.CAR_DESPESA}, ${_oCar.CAR_VALOR}")
    }

    fun imprimirLista(_lCar: List<Carteira>) {
        for (obj in _lCar) {
            imprimir(obj)
        }
    }

    fun verListaCarteira(): List<Carteira> {
        val _loCar = ArrayList<Carteira>()
        //val _loCar = MutableList<Carteira>)

        _loCar.add(Carteira().construtor("20/02/2023", "shop de vinho", 16, "D"))
        _loCar.add(Carteira().construtor("20/02/2023", "cerveja", 42))
        _loCar.add(Carteira().construtor("20/02/2023", "frango com farofa", 35))
        _loCar.add(Carteira().construtor("21/02/2023", "camiseta", 160))
        _loCar.add(Carteira().construtor("21/02/2023", "estacionamento", 13))
        _loCar.add(Carteira().construtor("21/02/2023", "sorvete", 990))
        _loCar.add(Carteira().construtor("21/02/2023", "salario", 1500, "C"))

        return _loCar
    }

    fun totalizaCarteira(_loCar: List<Carteira>) {

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

    }
}