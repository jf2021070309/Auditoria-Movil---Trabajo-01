package com.amazon.aps.iva.js;
/* compiled from: BillingNotificationActionProperty.kt */
/* loaded from: classes2.dex */
public enum b {
    PAYMENT_UPDATE("Payment Update"),
    RENEW("Renew"),
    NOT_NOW("Not Now");
    
    private final String value;

    b(String str) {
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
