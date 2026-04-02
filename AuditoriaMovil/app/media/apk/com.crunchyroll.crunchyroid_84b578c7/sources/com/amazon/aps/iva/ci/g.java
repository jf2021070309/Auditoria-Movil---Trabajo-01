package com.amazon.aps.iva.ci;

import androidx.recyclerview.widget.n;
import com.amazon.aps.iva.yb0.j;
/* compiled from: MusicItemDiffCallback.kt */
/* loaded from: classes.dex */
public final class g extends n.e<h> {
    public static final g a = new g();

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(h hVar, h hVar2) {
        h hVar3 = hVar;
        h hVar4 = hVar2;
        j.f(hVar3, "oldItem");
        j.f(hVar4, "newItem");
        return j.a(hVar3, hVar4);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(h hVar, h hVar2) {
        h hVar3 = hVar;
        h hVar4 = hVar2;
        j.f(hVar3, "oldItem");
        j.f(hVar4, "newItem");
        return j.a(hVar3.a, hVar4.a);
    }
}
