package com.amazon.aps.iva.ma0;

import com.amazon.aps.iva.a6.m;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.ka0.t;
import com.amazon.aps.iva.ka0.y;
import com.amazon.aps.iva.ka0.z;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.yb0.j;
import java.lang.ref.WeakReference;
/* compiled from: ErrorBinding.kt */
/* loaded from: classes4.dex */
public final class a implements t.a<m> {
    public static final /* synthetic */ l<Object>[] b = {e.b(a.class, "playerListener", "getPlayerListener()Landroidx/media3/common/Player$Listener;", 0)};
    public final com.amazon.aps.iva.ba0.a a = new com.amazon.aps.iva.ba0.a(null);

    @Override // com.amazon.aps.iva.ka0.t.a
    public final void a(m mVar, y yVar) {
        m mVar2 = mVar;
        j.f(mVar2, "player");
        j.f(yVar, "collector");
        b bVar = new b(yVar);
        mVar2.u(bVar);
        l<Object> lVar = b[0];
        com.amazon.aps.iva.ba0.a aVar = this.a;
        aVar.getClass();
        j.f(lVar, "property");
        aVar.a = new WeakReference<>(bVar);
    }

    @Override // com.amazon.aps.iva.ka0.t.a
    public final void b(m mVar, y yVar) {
        m mVar2 = mVar;
        j.f(yVar, "collector");
        l<?>[] lVarArr = y.y;
        l<?> lVar = lVarArr[0];
        z zVar = yVar.r;
        y.a<?> value = zVar.getValue(yVar, lVar);
        if (value != null) {
            value.a("player unbound");
        }
        zVar.c(yVar, lVarArr[0], null);
        l0.c cVar = (l0.c) this.a.getValue(this, b[0]);
        if (cVar != null) {
            mVar2.t0(cVar);
        }
    }
}
