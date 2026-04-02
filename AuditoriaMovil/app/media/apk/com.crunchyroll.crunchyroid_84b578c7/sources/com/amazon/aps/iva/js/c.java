package com.amazon.aps.iva.js;
/* compiled from: CheckoutSuccessActionProperty.kt */
/* loaded from: classes2.dex */
public enum c {
    CONTINUE("Continue"),
    LATER("Later");
    
    private final String value;

    c(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
