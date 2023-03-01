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

}