package com.amazon.aps.iva.types;
/* loaded from: classes.dex */
public final class ApsIvaRejectResponse implements ApsIvaClientResponse {
    private static final String type = "reject";
    private final int errorCode;
    private final String message;

    public ApsIvaRejectResponse(IVAErrorCode iVAErrorCode, String str) {
        this.errorCode = iVAErrorCode.getErrorNumber().intValue();
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApsIvaRejectResponse)) {
            return false;
        }
        ApsIvaRejectResponse apsIvaRejectResponse = (ApsIvaRejectResponse) obj;
        if (this.errorCode != apsIvaRejectResponse.errorCode) {
            return false;
        }
        String str = this.message;
        String str2 = apsIvaRejectResponse.message;
        if (str != null ? str.equals(str2) : str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.message;
        int i = (this.errorCode + 59) * 59;
        if (str == null) {
            hashCode = 43;
        } else {
            hashCode = str.hashCode();
        }
        return i + hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ApsIvaRejectResponse(errorCode=");
        sb.append(this.errorCode);
        sb.append(", message=");
        return b.c(sb, this.message, ")");
    }
}
