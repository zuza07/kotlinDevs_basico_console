import java.util.*
import kotlin.collections.ArrayList

class Cliente {


    var CLI_CODIGO = 0
    var CLI_NOME = ""
    var CLI_DTNASCIMENTO = Date()
    var CLI_ENDERECO = ""
    var CLI_CIDADE = ""

    fun construtor(_codigo: Int, _nome: String, _endereco:String, _cidade:String ): Cliente {

        val oCli = Cliente()

        oCli.CLI_CODIGO = _codigo
        oCli.CLI_NOME = _nome
        oCli.CLI_ENDERECO = _endereco
        oCli.CLI_CIDADE = _cidade
        return oCli
    }

    fun imprime(_ocli: Cliente) {
        println("${_ocli.CLI_CODIGO} - ${_ocli.CLI_NOME}, ${_ocli.CLI_ENDERECO}, cidade/sp ${_ocli.CLI_CIDADE}")
    }

    fun imprimeLista(_lista: ArrayList<Cliente>) {

        //for while repeat = são laços
        for (_ocli in _lista) {
            imprime(_ocli)
        }

    }

}