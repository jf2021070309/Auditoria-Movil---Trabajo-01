package com.amazon.aps.iva.ci;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
/* compiled from: MusicAssetsAdapter.kt */
/* loaded from: classes.dex */
public final class e extends v<h, com.amazon.aps.iva.z70.a> {
    public final l<h, q> b;
    public final com.amazon.aps.iva.n70.d<h> c;
    public final boolean d;
    public final DurationFormatter e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DurationFormatter durationFormatter, com.amazon.aps.iva.n70.d dVar, l lVar, boolean z) {
        super(g.a);
        j.f(durationFormatter, "durationFormatter");
        this.b = lVar;
        this.c = dVar;
        this.d = z;
        this.e = durationFormatter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        com.amazon.aps.iva.z70.a aVar = (com.amazon.aps.iva.z70.a) f0Var;
        j.f(aVar, "holder");
        aVar.b1(com.amazon.aps.iva.v0.b.c(1500324649, new d(this, (h) this.a.f.get(i)), true));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        j.e(context, "parent.context");
        return new com.amazon.aps.iva.z70.a(context);
    }
}
