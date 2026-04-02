package com.amazon.aps.iva.q;

import android.annotation.SuppressLint;
import android.view.View;
import com.amazon.aps.iva.q.a0;
/* compiled from: AppCompatSpinner.java */
/* loaded from: classes.dex */
public final class z extends m0 {
    public final /* synthetic */ a0.g k;
    public final /* synthetic */ a0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, View view, a0.g gVar) {
        super(view);
        this.l = a0Var;
        this.k = gVar;
    }

    @Override // com.amazon.aps.iva.q.m0
    public final com.amazon.aps.iva.p.f b() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.q.m0
    @SuppressLint({"SyntheticAccessor"})
    public final boolean c() {
        a0 a0Var = this.l;
        if (!a0Var.getInternalPopup().a()) {
            a0Var.g.g1(a0.c.b(a0Var), a0.c.a(a0Var));
            return true;
        }
        return true;
    }
}
