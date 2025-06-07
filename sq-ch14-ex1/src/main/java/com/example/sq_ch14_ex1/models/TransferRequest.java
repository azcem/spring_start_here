package com.example.sq_ch14_ex1.models;

import java.math.BigDecimal;

public record TransferRequest(
        long senderAccountId,
        long receiverAccountId,
        BigDecimal amount
) {
}
