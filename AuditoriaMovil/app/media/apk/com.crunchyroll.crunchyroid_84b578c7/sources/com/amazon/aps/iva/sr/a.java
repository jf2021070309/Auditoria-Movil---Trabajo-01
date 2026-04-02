package com.amazon.aps.iva.sr;

import android.content.Context;
import com.amazon.aps.iva.br.a;
import com.amazon.aps.iva.kp.b;
import com.amazon.aps.iva.lp.c;
import com.amazon.aps.iva.sp.g;
import java.io.File;
import java.util.concurrent.ExecutorService;
/* compiled from: WebViewRumFeature.kt */
/* loaded from: classes2.dex */
public final class a extends c<Object, b.d.c> {
    public static final a f = new a();

    @Override // com.amazon.aps.iva.lp.c
    public final g<Object> a(Context context, b.d.c cVar) {
        com.amazon.aps.iva.xp.a aVar = com.amazon.aps.iva.lp.a.j;
        ExecutorService c = com.amazon.aps.iva.lp.a.c();
        com.amazon.aps.iva.iq.a aVar2 = com.amazon.aps.iva.dq.c.a;
        int i = com.amazon.aps.iva.br.a.r;
        return new b(aVar, context, c, aVar2, new File(a.C0152a.a(context), "last_view_event"));
    }

    @Override // com.amazon.aps.iva.lp.c
    public final com.amazon.aps.iva.qp.c b(b.d.c cVar) {
        return new com.amazon.aps.iva.cr.a(cVar.a, com.amazon.aps.iva.lp.a.n, com.amazon.aps.iva.lp.a.r, com.amazon.aps.iva.lp.a.s, com.amazon.aps.iva.lp.a.b(), com.amazon.aps.iva.lp.a.a(), com.amazon.aps.iva.lp.a.p);
    }
}
