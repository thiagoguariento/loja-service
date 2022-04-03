package br.com.guariento.controller

import br.com.guariento.dto.input.VendaInput
import br.com.guariento.service.VendaService
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller("/vendas")
class VendaController(
        private val vendaService: VendaService
) {

    @Post
    fun realizarVenda(@Body vendaInput: VendaInput){
        vendaService.realizarVenda(vendaInput)
    }
}