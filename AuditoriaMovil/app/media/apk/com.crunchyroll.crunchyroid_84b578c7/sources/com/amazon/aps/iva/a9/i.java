package com.amazon.aps.iva.a9;

import com.amazon.aps.iva.a9.n;
/* compiled from: FragmentTransitionSupport.java */
/* loaded from: classes.dex */
public final class i implements n.g {
    public final /* synthetic */ Runnable a;

    public i(com.amazon.aps.iva.n4.d dVar) {
        this.a = dVar;
    }

    @Override // com.amazon.aps.iva.a9.n.g
    public final void onTransitionEnd(n nVar) {
        this.a.run();
    }

    @Override // com.amazon.aps.iva.a9.n.g
    public final void onTransitionCancel(n nVar) {
    }

    @Override // com.amazon.aps.iva.a9.n.g
    public final void onTransitionPause(n nVar) {
    }

    @Override // com.amazon.aps.iva.a9.n.g
    public final void onTransitionResume(n nVar) {
    }

    @Override // com.amazon.aps.iva.a9.n.g
    public final void onTransitionStart(n nVar) {
    }
}
