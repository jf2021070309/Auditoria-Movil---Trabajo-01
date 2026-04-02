package com.amazon.aps.iva.ey;

import android.app.Activity;
import android.content.Context;
import com.amazon.aps.iva.vx.k;
import com.amazon.aps.iva.vx.n;
import com.amazon.aps.iva.ws.d;
import com.amazon.aps.iva.ws.f;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: HeroView.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.a<c> {
    public final /* synthetic */ a h;
    public final /* synthetic */ Context i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, Context context) {
        super(0);
        this.h = aVar;
        this.i = context;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final c invoke() {
        k kVar = i.f;
        if (kVar != null) {
            n f = kVar.f();
            Context context = this.i;
            Activity a = q.a(context);
            j.c(a);
            com.amazon.aps.iva.ix.j a2 = f.a(a);
            k kVar2 = i.f;
            if (kVar2 != null) {
                n f2 = kVar2.f();
                Activity a3 = q.a(context);
                j.c(a3);
                com.amazon.aps.iva.ix.l b = f2.b(a3);
                f a4 = d.a.a(com.amazon.aps.iva.ls.a.HOME);
                boolean c = com.amazon.aps.iva.aq.k.n(context).c();
                a aVar = this.h;
                j.f(aVar, "view");
                j.f(a2, "showPageRouter");
                j.f(b, "watchScreenRouter");
                return new d(aVar, a2, b, a4, c);
            }
            j.m("dependencies");
            throw null;
        }
        j.m("dependencies");
        throw null;
    }
}
