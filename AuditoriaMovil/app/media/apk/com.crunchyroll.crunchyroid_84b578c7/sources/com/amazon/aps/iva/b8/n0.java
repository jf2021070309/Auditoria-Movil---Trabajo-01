package com.amazon.aps.iva.b8;

import com.amazon.aps.iva.b8.q;
import com.google.common.util.concurrent.FutureCallback;
import java.util.List;
/* compiled from: MediaSessionLegacyStub.java */
/* loaded from: classes.dex */
public final class n0 implements FutureCallback<List<com.amazon.aps.iva.q5.b0>> {
    public final /* synthetic */ q.d a;
    public final /* synthetic */ int b;
    public final /* synthetic */ m0 c;

    public n0(int i, q.d dVar, m0 m0Var) {
        this.c = m0Var;
        this.a = dVar;
        this.b = i;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onSuccess(List<com.amazon.aps.iva.q5.b0> list) {
        t tVar = this.c.b;
        com.amazon.aps.iva.t5.g0.U(tVar.j, tVar.a(this.a, new com.amazon.aps.iva.t5.n(this, this.b, 1, list)));
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onFailure(Throwable th) {
    }
}
