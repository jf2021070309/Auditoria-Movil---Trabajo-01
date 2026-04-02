package com.amazon.aps.iva.ka0;

import android.view.View;
import com.amazon.aps.iva.ka0.p;
import com.amazon.aps.iva.ka0.t;
/* compiled from: MuxDataSdk.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class m extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.r<Object, d0<View>, y, t.a<Object>, t<View, Object>> {
    public m(p.b bVar) {
        super(4, bVar, p.b.class, "defaultPlayerAdapter", "defaultPlayerAdapter(Ljava/lang/Object;Lcom/mux/stats/sdk/muxstats/MuxUiDelegate;Lcom/mux/stats/sdk/muxstats/MuxStateCollector;Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter$PlayerBinding;)Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter;", 0);
    }

    @Override // com.amazon.aps.iva.xb0.r
    public final t<View, Object> K(Object obj, d0<View> d0Var, y yVar, t.a<Object> aVar) {
        d0<View> d0Var2 = d0Var;
        y yVar2 = yVar;
        t.a<Object> aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(d0Var2, "p1");
        com.amazon.aps.iva.yb0.j.f(yVar2, "p2");
        com.amazon.aps.iva.yb0.j.f(aVar2, "p3");
        ((p.b) this.receiver).getClass();
        return new t<>(aVar2, yVar2, d0Var2, obj);
    }
}
