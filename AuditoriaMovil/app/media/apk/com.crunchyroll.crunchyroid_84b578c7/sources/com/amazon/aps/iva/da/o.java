package com.amazon.aps.iva.da;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.z9.f0;
/* compiled from: rememberLottieComposition.kt */
/* loaded from: classes.dex */
public final class o<T> implements f0 {
    public final /* synthetic */ com.amazon.aps.iva.se0.m<T> a;

    public o(com.amazon.aps.iva.se0.n nVar) {
        this.a = nVar;
    }

    @Override // com.amazon.aps.iva.z9.f0
    public final void a(Object obj) {
        Throwable th = (Throwable) obj;
        com.amazon.aps.iva.se0.m<T> mVar = this.a;
        if (!mVar.c()) {
            com.amazon.aps.iva.yb0.j.e(th, "e");
            mVar.resumeWith(x.H(th));
        }
    }
}
