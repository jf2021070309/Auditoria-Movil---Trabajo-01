package com.amazon.aps.iva.js;
/* compiled from: FeedTypeProperty.kt */
/* loaded from: classes2.dex */
public enum k {
    COLLECTION("collection"),
    HERO("hero"),
    CARD("card"),
    RECOMMENDATION("recommendation");
    
    private final String value;

    k(String str) {
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
