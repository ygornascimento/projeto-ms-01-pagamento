package com.example.pagamento.infrastructure.client;

import com.example.pagamento.controller.request.CartaoRequestDTO;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class PagamentoClient {
    public Boolean verificaCartao(CartaoRequestDTO cartaoRequestDTO) {
        if(cartaoRequestDTO.getNumeroCartao().endsWith("8080")) {
            return true;
        }

        return false;
    }
}
