package com.amazon.aps.iva.a9;

import com.amazon.aps.iva.k3.f;
/* compiled from: FragmentTransitionSupport.java */
/* loaded from: classes.dex */
public final class h implements f.a {
    public final /* synthetic */ n b;

    public h(n nVar) {
        this.b = nVar;
    }

    @Override // com.amazon.aps.iva.k3.f.a
    public final void onCancel() {
        this.b.cancel();
    }
}
