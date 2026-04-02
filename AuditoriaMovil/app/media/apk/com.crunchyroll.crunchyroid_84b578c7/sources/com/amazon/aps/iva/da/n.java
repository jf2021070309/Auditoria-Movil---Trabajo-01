package com.amazon.aps.iva.da;

import com.amazon.aps.iva.z9.f0;
/* compiled from: rememberLottieComposition.kt */
/* loaded from: classes.dex */
public final class n<T> implements f0 {
    public final /* synthetic */ com.amazon.aps.iva.se0.m<T> a;

    public n(com.amazon.aps.iva.se0.n nVar) {
        this.a = nVar;
    }

    @Override // com.amazon.aps.iva.z9.f0
    public final void a(T t) {
        com.amazon.aps.iva.se0.m<T> mVar = this.a;
        if (!mVar.c()) {
            mVar.resumeWith(t);
        }
    }
}
