package ForumApi.ApiProject.Service.TopicoService

import ForumApi.ApiProject.Model.Curso
import ForumApi.ApiProject.Model.Topico
import ForumApi.ApiProject.Model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicoService (
    private var topicos : List<Topico> //Aqui esse Array está funcionando como um banco de dados em memória
){

    init{
        val topico = Topico (
            id = 1,
            titulo = "Duvida Kotlin",
            mensagem = "Variáveis Kotlin",
            curso = Curso(
                id = 1,
                "Kotlin",
                "Programacao"
            ),
            autor = Usuario (
                id = 1,
                nome = "Ana da Silva",
                email = "ana@email.com"
            )
        )
        val topico2 = Topico (
            id = 2,
            titulo = "Duvida Kotlin 2",
            mensagem = "Variáveis Kotlin 2",
            curso = Curso(
                id = 1,
                "Kotlin",
                "Programacao"
            ),
            autor = Usuario (
                id = 1,
                nome = "Ana da Silva",
                email = "ana@email.com"
            )
        )
        val topico3 = Topico (
            id = 3,
            titulo = "Duvida Kotlin3",
            mensagem = "Variáveis Kotlin3",
            curso = Curso(
                id = 1,
                "Kotlin",
                "Programacao"
            ),
            autor = Usuario (
                id = 1,
                nome = "Ana da Silva",
                email = "ana@email.com"
            )
        )

        topicos = Arrays.asList(topico, topico2,topico3)
    }

    fun listar() : List<Topico>{
        return topicos
    }

    fun buscarPorId(id : Long): Topico {

        return topicos.stream().filter(
            { t -> t.id == id}
        ).findFirst().get()

    }


}