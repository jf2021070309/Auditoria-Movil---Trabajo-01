package com.amazon.aps.iva.b8;

import com.amazon.aps.iva.b8.q;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.FutureCallback;
/* compiled from: MediaSessionImpl.java */
/* loaded from: classes.dex */
public final class s implements FutureCallback<q.e> {
    public final /* synthetic */ com.amazon.aps.iva.q5.l0 a;

    public s(com.amazon.aps.iva.q5.l0 l0Var) {
        this.a = l0Var;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onFailure(Throwable th) {
        if (th instanceof UnsupportedOperationException) {
            com.amazon.aps.iva.t5.p.h("UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
        } else {
            com.amazon.aps.iva.t5.p.d("Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
        }
        com.amazon.aps.iva.t5.g0.I(this.a);
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onSuccess(q.e eVar) {
        int i;
        q.e eVar2 = eVar;
        ImmutableList<com.amazon.aps.iva.q5.b0> immutableList = eVar2.a;
        int i2 = eVar2.b;
        if (i2 != -1) {
            i = Math.min(immutableList.size() - 1, i2);
        } else {
            i = 0;
        }
        long j = eVar2.c;
        com.amazon.aps.iva.q5.l0 l0Var = this.a;
        l0Var.y0(i, j, immutableList);
        if (l0Var.h() == 1) {
            l0Var.g();
        }
        l0Var.b();
    }
}
