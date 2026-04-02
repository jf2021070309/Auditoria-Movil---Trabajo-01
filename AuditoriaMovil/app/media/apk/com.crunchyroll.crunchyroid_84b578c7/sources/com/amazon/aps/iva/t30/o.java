package com.amazon.aps.iva.t30;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
/* compiled from: MusicSearchResultItemDelegate.kt */
/* loaded from: classes2.dex */
public final class o implements r {
    public final com.amazon.aps.iva.r30.c a;
    public final com.amazon.aps.iva.n70.d<com.amazon.aps.iva.s30.j> b;
    public final DurationFormatter c;

    public o(com.amazon.aps.iva.r30.c cVar, com.amazon.aps.iva.gi.e eVar, DurationFormatter durationFormatter) {
        com.amazon.aps.iva.yb0.j.f(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        com.amazon.aps.iva.yb0.j.f(durationFormatter, "durationFormatter");
        this.a = cVar;
        this.b = eVar;
        this.c = durationFormatter;
    }

    @Override // com.amazon.aps.iva.t30.r
    public final RecyclerView.f0 a(ViewGroup viewGroup) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        com.amazon.aps.iva.yb0.j.e(context, "parent.context");
        return new com.amazon.aps.iva.z70.a(context);
    }

    @Override // com.amazon.aps.iva.t30.r
    public final void b(RecyclerView.f0 f0Var, com.amazon.aps.iva.s30.h hVar) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
        ((com.amazon.aps.iva.z70.a) f0Var).b1(com.amazon.aps.iva.v0.b.c(1715450940, new n(hVar, this), true));
    }
}
