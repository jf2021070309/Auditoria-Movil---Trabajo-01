package com.amazon.aps.iva.a9;

import android.view.View;
/* compiled from: Fade.java */
/* loaded from: classes.dex */
public final class c extends o {
    public final /* synthetic */ View a;

    public c(View view) {
        this.a = view;
    }

    @Override // com.amazon.aps.iva.a9.n.g
    public final void onTransitionEnd(n nVar) {
        i0 i0Var = z.a;
        i0Var.o(1.0f, this.a);
        i0Var.getClass();
        nVar.removeListener(this);
    }
}
