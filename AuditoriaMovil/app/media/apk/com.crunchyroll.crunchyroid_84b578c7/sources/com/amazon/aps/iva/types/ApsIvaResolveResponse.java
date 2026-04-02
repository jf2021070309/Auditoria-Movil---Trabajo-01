package com.amazon.aps.iva.types;
/* loaded from: classes.dex */
public final class ApsIvaResolveResponse implements ApsIvaClientResponse {
    private static final String type = "resolve";
    private Object value;

    public ApsIvaResolveResponse(Object obj) {
        this.value = obj;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApsIvaResolveResponse)) {
            return false;
        }
        Object obj2 = this.value;
        Object obj3 = ((ApsIvaResolveResponse) obj).value;
        if (obj2 != null ? obj2.equals(obj3) : obj3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Object obj = this.value;
        if (obj == null) {
            hashCode = 43;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode + 59;
    }

    public String toString() {
        return "ApsIvaResolveResponse(value=" + this.value + ")";
    }

    public ApsIvaResolveResponse() {
    }
}
