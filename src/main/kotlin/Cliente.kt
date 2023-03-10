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

    fun imprimeLista(_lista: List<Cliente>) {

        //for while repeat = são laços
        for (_ocli in _lista) {
            imprime(_ocli)
        }

    }

    fun verListaCliente(): List<Cliente> {

        val locli = ArrayList<Cliente>()

        locli.add(Cliente().construtor(1, "Eduardo Zuza", "Francisco Alves", "Sorocaba"))
        locli.add(Cliente().construtor(2, "Alexandre", "Francisco Alves", "Serra"))
        locli.add(Cliente().construtor(3, "Edinaldo", "Francisco Alves", "Sorocaba"))
        locli.add(Cliente().construtor(4, "Renato", "Francisco Alves", "Sorocaba"))
        locli.add(Cliente().construtor(5, "Matheus", "Francisco Alves", "Sorocaba"))
        locli.add(Cliente().construtor(6, "Daniel", "Francisco Alves", "Serra"))

        return locli
    }

}