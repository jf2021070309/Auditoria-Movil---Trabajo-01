package com.amazon.aps.iva.kf;

import androidx.recyclerview.widget.n;
/* compiled from: ConnectedAppsAdapter.kt */
/* loaded from: classes.dex */
public final class z extends n.e<c0> {
    public static final z a = new z();

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(c0 c0Var, c0 c0Var2) {
        c0 c0Var3 = c0Var;
        c0 c0Var4 = c0Var2;
        com.amazon.aps.iva.yb0.j.f(c0Var3, "first");
        com.amazon.aps.iva.yb0.j.f(c0Var4, "second");
        return com.amazon.aps.iva.yb0.j.a(c0Var3, c0Var4);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(c0 c0Var, c0 c0Var2) {
        c0 c0Var3 = c0Var;
        c0 c0Var4 = c0Var2;
        com.amazon.aps.iva.yb0.j.f(c0Var3, "first");
        com.amazon.aps.iva.yb0.j.f(c0Var4, "second");
        if (c0Var3.b == c0Var4.b) {
            return true;
        }
        return false;
    }
}
