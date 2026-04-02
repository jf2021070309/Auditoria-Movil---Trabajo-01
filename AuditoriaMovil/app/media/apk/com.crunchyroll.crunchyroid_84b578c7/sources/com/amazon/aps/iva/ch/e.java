package com.amazon.aps.iva.ch;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.concurrent.TimeUnit;
/* compiled from: InAppReviewLauncherImpl.kt */
/* loaded from: classes.dex */
public final class e extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ g h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar) {
        super(0);
        this.h = gVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        g gVar = this.h;
        com.amazon.aps.iva.dh.g gVar2 = gVar.a;
        long a = gVar.b.a();
        a aVar = gVar.c;
        j.f(aVar, "<this>");
        gVar2.a(TimeUnit.MINUTES.toMillis(aVar.a()) + a);
        return q.a;
    }
}
