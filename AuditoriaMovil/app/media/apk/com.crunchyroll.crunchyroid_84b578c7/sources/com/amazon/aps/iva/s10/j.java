package com.amazon.aps.iva.s10;

import androidx.recyclerview.widget.n;
import com.amazon.aps.iva.r10.a0;
import com.amazon.aps.iva.r10.j0;
/* compiled from: HistoryDiffCallback.kt */
/* loaded from: classes2.dex */
public final class j extends n.e<a0> {
    public static final j a = new j();

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(a0 a0Var, a0 a0Var2) {
        a0 a0Var3 = a0Var;
        a0 a0Var4 = a0Var2;
        com.amazon.aps.iva.yb0.j.f(a0Var3, "oldItem");
        com.amazon.aps.iva.yb0.j.f(a0Var4, "newItem");
        return com.amazon.aps.iva.yb0.j.a(a0Var3, a0Var4);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(a0 a0Var, a0 a0Var2) {
        a0 a0Var3 = a0Var;
        a0 a0Var4 = a0Var2;
        com.amazon.aps.iva.yb0.j.f(a0Var3, "oldItem");
        com.amazon.aps.iva.yb0.j.f(a0Var4, "newItem");
        return com.amazon.aps.iva.yb0.j.a(a0Var3.getAdapterId(), a0Var4.getAdapterId());
    }

    @Override // androidx.recyclerview.widget.n.e
    public final Object getChangePayload(a0 a0Var, a0 a0Var2) {
        a0 a0Var3 = a0Var;
        a0 a0Var4 = a0Var2;
        com.amazon.aps.iva.yb0.j.f(a0Var3, "oldItem");
        com.amazon.aps.iva.yb0.j.f(a0Var4, "newItem");
        if ((a0Var3 instanceof com.amazon.aps.iva.r10.l) && (a0Var4 instanceof com.amazon.aps.iva.r10.l)) {
            j0 j0Var = ((com.amazon.aps.iva.r10.l) a0Var3).c;
            j0 j0Var2 = ((com.amazon.aps.iva.r10.l) a0Var4).c;
            if (j0Var != j0Var2) {
                return j0Var2;
            }
        }
        return null;
    }
}
