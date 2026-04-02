package com.amazon.aps.iva.t30;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ellation.crunchyroll.model.Panel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
/* compiled from: ContainerSearchResultItemDelegate.kt */
/* loaded from: classes2.dex */
public class d implements r {
    public final com.amazon.aps.iva.r30.c a;
    public final com.amazon.aps.iva.n70.d<Panel> b;
    public final com.amazon.aps.iva.r30.a c;
    public final com.amazon.aps.iva.xb0.a<Boolean> d;

    public d(com.amazon.aps.iva.r30.c cVar, com.amazon.aps.iva.nt.a aVar, com.amazon.aps.iva.r30.b bVar, com.amazon.aps.iva.xb0.a aVar2) {
        com.amazon.aps.iva.yb0.j.f(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.a = cVar;
        this.b = aVar;
        this.c = bVar;
        this.d = aVar2;
    }

    @Override // com.amazon.aps.iva.t30.r
    public final void b(RecyclerView.f0 f0Var, com.amazon.aps.iva.s30.h hVar) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
        com.amazon.aps.iva.s30.k kVar = (com.amazon.aps.iva.s30.k) hVar;
        ((com.amazon.aps.iva.z70.a) f0Var).b1(com.amazon.aps.iva.v0.b.c(-535427396, new c(hVar, this), true));
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
