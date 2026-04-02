package com.amazon.aps.iva.ei;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
/* compiled from: FeaturedMusicListAdapter.kt */
/* loaded from: classes.dex */
public final class d extends v<i, com.amazon.aps.iva.z70.a> {
    public final l<com.amazon.aps.iva.fi.a, q> b;
    public final com.amazon.aps.iva.n70.d<com.amazon.aps.iva.fi.a> c;
    public final DurationFormatter d;
    public final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DurationFormatter durationFormatter, com.amazon.aps.iva.gi.e eVar, com.crunchyroll.music.featuredmusic.a aVar, boolean z) {
        super(e.a);
        com.amazon.aps.iva.yb0.j.f(durationFormatter, "durationFormatter");
        this.b = aVar;
        this.c = eVar;
        this.d = durationFormatter;
        this.e = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        i d = d(i);
        if (d instanceof h) {
            return 100;
        }
        if (d instanceof j) {
            return 101;
        }
        throw new IllegalArgumentException(d(i).getClass().getName().concat(" not supported!"));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        com.amazon.aps.iva.z70.a aVar = (com.amazon.aps.iva.z70.a) f0Var;
        com.amazon.aps.iva.yb0.j.f(aVar, "holder");
        aVar.b1(com.amazon.aps.iva.v0.b.c(248169339, new c(this, i), true));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        com.amazon.aps.iva.yb0.j.e(context, "parent.context");
        return new com.amazon.aps.iva.z70.a(context);
    }
}
