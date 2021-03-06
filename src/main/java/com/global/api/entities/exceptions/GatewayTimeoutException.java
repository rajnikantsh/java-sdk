package com.global.api.entities.exceptions;

public class GatewayTimeoutException extends GatewayException {
    private String host;
    private int reversalCount = 0;
    private String reversalResponseCode;
    private String reversalResponseText;

    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public int getReversalCount() {
        return reversalCount;
    }
    public void setReversalCount(int reversalCount) {
        this.reversalCount = reversalCount;
    }
    public String getReversalResponseCode() {
        return reversalResponseCode;
    }
    public void setReversalResponseCode(String reversalResponseCode) {
        this.reversalResponseCode = reversalResponseCode;
    }
    public String getReversalResponseText() {
        return reversalResponseText;
    }
    public void setReversalResponseText(String reversalResponseText) {
        this.reversalResponseText = reversalResponseText;
    }

    public GatewayTimeoutException() {
        super("The gateway did not response with given timeout.");
    }
    public GatewayTimeoutException(Exception innerException) {
        super("The gateway did not response with given timeout.", innerException);
    }
}
