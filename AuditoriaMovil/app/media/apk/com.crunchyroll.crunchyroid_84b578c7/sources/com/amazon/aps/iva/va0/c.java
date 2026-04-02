package com.amazon.aps.iva.va0;

import com.amazon.aps.iva.yb0.j;
/* compiled from: JsonValidator.kt */
/* loaded from: classes4.dex */
public final class c extends RuntimeException {
    public c() {
        super("Incomplete token at end of data");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str) {
        super(str);
        j.g(str, "message");
    }
}
