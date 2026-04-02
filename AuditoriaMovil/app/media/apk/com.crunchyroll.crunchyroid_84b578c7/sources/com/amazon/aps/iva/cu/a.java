package com.amazon.aps.iva.cu;

import com.amazon.aps.iva.yb0.j;
import java.io.IOException;
/* compiled from: InitialLoadingException.kt */
/* loaded from: classes2.dex */
public final class a extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Throwable th) {
        super("Initial loading failed", th);
        j.f(th, "e");
    }
}
