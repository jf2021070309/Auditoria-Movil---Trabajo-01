package com.amazon.aps.iva.fy;

import android.app.Activity;
import android.content.Context;
import com.amazon.aps.iva.vx.k;
import com.amazon.aps.iva.vx.n;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: HeroMusicView.kt */
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
            com.amazon.aps.iva.ii.a e = f.e(a);
            boolean c = com.amazon.aps.iva.aq.k.n(context).c();
            a aVar = this.h;
            j.f(aVar, "view");
            j.f(e, "musicRouter");
            return new d(aVar, e, c);
        }
        j.m("dependencies");
        throw null;
    }
}
