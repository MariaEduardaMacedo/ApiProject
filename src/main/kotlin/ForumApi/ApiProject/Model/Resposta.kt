package ForumApi.ApiProject.Model

import java.time.LocalDateTime

data class Resposta(
    val id_resposta : Long? = null,
    val mensagem : String,
    val dataCriacao : LocalDateTime = LocalDateTime.now(),
    val autor : Usuario,
    val solucao : Boolean
)
