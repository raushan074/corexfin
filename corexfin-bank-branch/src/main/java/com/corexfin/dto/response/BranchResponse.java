package com.corexfin.dto.response;

import java.sql.Timestamp;

public class BranchResponse extends SuccessResponse {
    private String id;
    private String bankId;

    public BranchResponse() {}

    public BranchResponse(String id, String bankId) {
        this.id = id;
        this.bankId = bankId;
    }

    public BranchResponse(String message, boolean status, int httpStatus, String path, Timestamp timestamp, String id, String bankId) {
        super(message, status, httpStatus, path, timestamp);
        this.id = id;
        this.bankId = bankId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    @Override
    public String toString() {
        return "BranchResponse{" +
                "id='" + id + '\'' +
                ", bankId='" + bankId + '\'' +
                ", message='" + message + '\'' +
                ", status=" + status +
                ", httpStatus=" + httpStatus +
                ", path='" + path + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
