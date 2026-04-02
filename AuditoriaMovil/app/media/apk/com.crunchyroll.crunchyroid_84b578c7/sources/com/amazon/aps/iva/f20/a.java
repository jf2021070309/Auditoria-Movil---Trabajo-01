package com.amazon.aps.iva.f20;

import java.io.IOException;
/* compiled from: BillingVerifyException.kt */
/* loaded from: classes2.dex */
public final class a extends Throwable {
    public final String b;
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, IOException iOException) {
        super(iOException);
        com.amazon.aps.iva.yb0.j.f(str, "sku");
        com.amazon.aps.iva.yb0.j.f(str2, "title");
        this.b = str;
        this.c = str2;
    }
}
