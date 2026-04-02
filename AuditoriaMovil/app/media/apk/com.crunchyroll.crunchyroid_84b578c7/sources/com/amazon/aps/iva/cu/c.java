package com.amazon.aps.iva.cu;

import com.amazon.aps.iva.yb0.j;
import java.io.IOException;
/* compiled from: InitialLoadingException.kt */
/* loaded from: classes2.dex */
public final class c extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Throwable th) {
        super("Comments refresh failed", th);
        j.f(th, "e");
    }
}
