package com.amazon.aps.iva.js;

import com.google.android.gms.common.Scopes;
/* compiled from: EmailProperty.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.is.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str) {
        super("emailAddress", str);
        com.amazon.aps.iva.yb0.j.f(str, Scopes.EMAIL);
    }
}
