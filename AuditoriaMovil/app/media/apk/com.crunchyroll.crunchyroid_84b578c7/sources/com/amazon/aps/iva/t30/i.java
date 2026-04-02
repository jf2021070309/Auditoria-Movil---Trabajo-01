package com.amazon.aps.iva.t30;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
/* compiled from: EpisodeSearchResultItemDelegate.kt */
/* loaded from: classes2.dex */
public class i implements r {
    public final com.amazon.aps.iva.r30.c a;
    public final com.amazon.aps.iva.xb0.a<Boolean> b;
    public final com.amazon.aps.iva.mt.n c;
    public final DurationFormatter d;
    public final com.amazon.aps.iva.n70.d<Panel> e;

    public i(com.amazon.aps.iva.r30.c cVar, com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.mt.o oVar, DurationFormatter durationFormatter, com.amazon.aps.iva.nt.a aVar2) {
        com.amazon.aps.iva.yb0.j.f(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        com.amazon.aps.iva.yb0.j.f(durationFormatter, "durationFormatter");
        this.a = cVar;
        this.b = aVar;
        this.c = oVar;
        this.d = durationFormatter;
        this.e = aVar2;
    }

    @Override // com.amazon.aps.iva.t30.r
    public final void b(RecyclerView.f0 f0Var, com.amazon.aps.iva.s30.h hVar) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
        com.amazon.aps.iva.s30.k kVar = (com.amazon.aps.iva.s30.k) hVar;
        ((com.amazon.aps.iva.z70.a) f0Var).b1(com.amazon.aps.iva.v0.b.c(-1935030788, new h(this, hVar), true));
    }

    @Override // com.amazon.aps.iva.t30.r
    /* renamed from: c */
    public com.amazon.aps.iva.z70.a a(ViewGroup viewGroup) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        com.amazon.aps.iva.yb0.j.e(context, "parent.context");
        return new com.amazon.aps.iva.z70.a(context);
    }
}
