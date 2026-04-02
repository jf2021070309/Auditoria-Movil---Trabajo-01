package com.amazon.aps.iva.ee;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.auth.screen.OtpActivity;
/* compiled from: OtpFlowRouter.kt */
/* loaded from: classes.dex */
public final class g extends l implements p<com.amazon.aps.iva.h.c<a>, a, q> {
    public static final g h = new g();

    public g() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.h.c<a> cVar, a aVar) {
        com.amazon.aps.iva.h.c<a> cVar2 = cVar;
        a aVar2 = aVar;
        j.f(cVar2, "launcher");
        j.f(aVar2, "input");
        int i = OtpActivity.n;
        cVar2.a(aVar2);
        return q.a;
    }
}
