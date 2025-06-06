package com.example.sq_ch13_ex1.models;

import java.math.BigDecimal;

public record TransferRequest (
        long senderAccountId,
        long receiverAccountId,
        BigDecimal amount
) {}

//public class TransferRequest {
//    private long senderAccountId;
//    private long receiverAccountId;
//    private BigDecimal amount;
//
//    public long getSenderAccountId() {
//        return senderAccountId;
//    }
//
//    public void setSenderAccountId(long senderAccountId) {
//        this.senderAccountId = senderAccountId;
//    }
//
//    public long getReceiverAccountId() {
//        return receiverAccountId;
//    }
//
//    public void setReceiverAccountId(long receiverAccountId) {
//        this.receiverAccountId = receiverAccountId;
//    }
//
//    public BigDecimal getAmount() {
//        return amount;
//    }
//
//    public void setAmount(BigDecimal amount) {
//        this.amount = amount;
//    }
//}
