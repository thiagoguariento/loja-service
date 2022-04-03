package br.com.guariento.service

import br.com.guariento.dto.input.VendaInput
import br.com.guariento.http.VeiculoHttp
import jakarta.inject.Singleton

@Singleton
class VendaService(
        private val veiculoHttp: VeiculoHttp
) {

    fun realizarVenda(vendaInput: VendaInput){
        val veiculo = veiculoHttp.findById(vendaInput.veiculo)
        println(veiculo)
    }
}