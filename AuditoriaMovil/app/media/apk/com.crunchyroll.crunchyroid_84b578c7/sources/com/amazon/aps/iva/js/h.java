package com.amazon.aps.iva.js;
/* compiled from: EmailVerificationStepProperty.kt */
/* loaded from: classes2.dex */
public enum h {
    REGISTRATION("registration"),
    POST_REGISTRATION("post registration");
    
    private final String value;

    h(String str) {
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
