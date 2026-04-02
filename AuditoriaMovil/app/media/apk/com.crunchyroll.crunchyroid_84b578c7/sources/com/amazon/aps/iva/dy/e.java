package com.amazon.aps.iva.dy;

import androidx.recyclerview.widget.n;
import com.amazon.aps.iva.yb0.j;
/* compiled from: MusicAssetDiffCallback.kt */
/* loaded from: classes2.dex */
public final class e extends n.e<com.amazon.aps.iva.xx.n> {
    public static final e a = new e();

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(com.amazon.aps.iva.xx.n nVar, com.amazon.aps.iva.xx.n nVar2) {
        com.amazon.aps.iva.xx.n nVar3 = nVar;
        com.amazon.aps.iva.xx.n nVar4 = nVar2;
        j.f(nVar3, "oldItem");
        j.f(nVar4, "newItem");
        return j.a(nVar3, nVar4);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(com.amazon.aps.iva.xx.n nVar, com.amazon.aps.iva.xx.n nVar2) {
        com.amazon.aps.iva.xx.n nVar3 = nVar;
        com.amazon.aps.iva.xx.n nVar4 = nVar2;
        j.f(nVar3, "oldItem");
        j.f(nVar4, "newItem");
        return j.a(nVar3.a, nVar4.a);
    }
}
