package com.amazon.aps.iva.qi;

import androidx.recyclerview.widget.n;
import com.amazon.aps.iva.yb0.j;
/* compiled from: WatchMusicSummaryDiffCallback.kt */
/* loaded from: classes.dex */
public final class b extends n.e<g> {
    public static final b a = new b();

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(g gVar, g gVar2) {
        g gVar3 = gVar;
        g gVar4 = gVar2;
        j.f(gVar3, "oldItem");
        j.f(gVar4, "newItem");
        return j.a(gVar3, gVar4);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(g gVar, g gVar2) {
        g gVar3 = gVar;
        g gVar4 = gVar2;
        j.f(gVar3, "oldItem");
        j.f(gVar4, "newItem");
        return j.a(gVar3.b, gVar4.b);
    }
}
