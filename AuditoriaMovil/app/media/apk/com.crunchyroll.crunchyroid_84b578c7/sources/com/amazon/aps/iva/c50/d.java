package com.amazon.aps.iva.c50;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.b50.t;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: WatchlistItemProvider.kt */
/* loaded from: classes2.dex */
public final class d implements g {
    public final com.amazon.aps.iva.b50.b a;
    public final com.amazon.aps.iva.n70.d<t> b;

    public d(com.amazon.aps.iva.b50.d dVar, com.amazon.aps.iva.b50.h hVar) {
        this.a = dVar;
        this.b = hVar;
    }

    @Override // com.amazon.aps.iva.c50.g
    public final h a(Context context) {
        return new h(new e(context, this.a, this.b));
    }

    @Override // com.amazon.aps.iva.c50.g
    public final a b(ViewGroup viewGroup) {
        j.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.watchlist_empty_card, viewGroup, false);
        j.e(inflate, "from(parent.context).inf…rent, false\n            )");
        return new a(inflate);
    }
}
