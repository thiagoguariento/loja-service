package br.com.guariento.controller

import br.com.guariento.dto.input.VendaInput
import br.com.guariento.service.VendaService
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import java.math.BigDecimal

@Controller("/vendas")
class VendaController(
        private val vendaService: VendaService
) {

    fun realizarVenda(@Body vendaInput: VendaInput){
        vendaService.realizarVenda(vendaInput)
    }
}