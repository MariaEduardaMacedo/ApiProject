package ForumApi.ApiProject.Controller

import ForumApi.ApiProject.Model.Curso
import ForumApi.ApiProject.Model.Resposta
import ForumApi.ApiProject.Model.Topico
import ForumApi.ApiProject.Model.Usuario
import ForumApi.ApiProject.Service.TopicoService.TopicoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Arrays

@RestController
@RequestMapping("/topicos")
class TopicoController(
    private val service : TopicoService
) {

    @GetMapping
    fun listar() : List<Topico>{
        return  service.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id : Long)  : Topico{
        return service.buscarPorId(id)
    }


}