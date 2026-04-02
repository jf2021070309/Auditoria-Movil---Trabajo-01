package com.amazon.aps.iva.ab0;
/* compiled from: NumberParseException.java */
/* loaded from: classes4.dex */
public final class c extends Exception {
    public final a b;
    public final String c;

    /* compiled from: NumberParseException.java */
    /* loaded from: classes4.dex */
    public enum a {
        INVALID_COUNTRY_CODE,
        NOT_A_NUMBER,
        TOO_SHORT_AFTER_IDD,
        TOO_SHORT_NSN,
        TOO_LONG
    }

    public c(a aVar, String str) {
        super(str);
        this.c = str;
        this.b = aVar;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "Error type: " + this.b + ". " + this.c;
    }
}
