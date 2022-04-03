package br.com.guariento.dto.input

import java.math.BigDecimal

class VendaInput(
        val cliente: String,
        val veiculo: Long,
        val valor: BigDecimal,
        val quantidadeParcelas: Int
)