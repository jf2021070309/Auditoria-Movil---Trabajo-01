package com.amazon.aps.iva.kq;

import android.content.Context;
import com.amazon.aps.iva.cq.c;
import com.amazon.aps.iva.nr.d;
import com.amazon.aps.iva.sp.f;
import com.amazon.aps.iva.vp.e;
import com.amazon.aps.iva.vp.h;
import com.amazon.aps.iva.yb0.j;
import java.util.concurrent.ExecutorService;
/* compiled from: LogFilePersistenceStrategy.kt */
/* loaded from: classes2.dex */
public final class a extends h {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(com.amazon.aps.iva.xp.a r10, android.content.Context r11, java.util.concurrent.ExecutorService r12, com.amazon.aps.iva.iq.a r13, com.amazon.aps.iva.gq.a r14) {
        /*
            r9 = this;
            java.lang.String r0 = "consentProvider"
            com.amazon.aps.iva.yb0.j.f(r10, r0)
            java.lang.String r0 = "internalLogger"
            com.amazon.aps.iva.yb0.j.f(r13, r0)
            java.lang.String r1 = "logEventMapper"
            com.amazon.aps.iva.yb0.j.f(r14, r1)
            com.amazon.aps.iva.up.c r1 = new com.amazon.aps.iva.up.c
            java.lang.String r5 = "logs"
            r2 = r1
            r3 = r10
            r4 = r11
            r6 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            com.amazon.aps.iva.gq.b r5 = new com.amazon.aps.iva.gq.b
            com.amazon.aps.iva.lq.a r10 = new com.amazon.aps.iva.lq.a
            r10.<init>(r14)
            com.amazon.aps.iva.lq.b r11 = new com.amazon.aps.iva.lq.b
            r11.<init>()
            r5.<init>(r10, r11)
            com.amazon.aps.iva.sp.f r6 = com.amazon.aps.iva.sp.f.g
            com.amazon.aps.iva.iq.a r7 = com.amazon.aps.iva.dq.c.a
            com.amazon.aps.iva.yb0.j.f(r7, r0)
            com.amazon.aps.iva.vp.e r8 = new com.amazon.aps.iva.vp.e
            r8.<init>(r7)
            r2 = r9
            r3 = r1
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.kq.a.<init>(com.amazon.aps.iva.xp.a, android.content.Context, java.util.concurrent.ExecutorService, com.amazon.aps.iva.iq.a, com.amazon.aps.iva.gq.a):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.amazon.aps.iva.xp.a aVar, Context context, ExecutorService executorService, c cVar, com.amazon.aps.iva.rp.c cVar2, com.amazon.aps.iva.oq.b bVar, com.amazon.aps.iva.aq.b bVar2, String str, com.amazon.aps.iva.iq.a aVar2, com.amazon.aps.iva.gq.c cVar3) {
        super(new com.amazon.aps.iva.up.c(aVar, context, "tracing", executorService, aVar2), executorService, new d(new com.amazon.aps.iva.nr.a(cVar, cVar2, bVar, bVar2), new com.amazon.aps.iva.nr.b(cVar3), new com.amazon.aps.iva.nr.c(str)), f.h, aVar2, new e(aVar2));
        j.f(aVar, "consentProvider");
        j.f(cVar, "timeProvider");
        j.f(cVar2, "networkInfoProvider");
        j.f(bVar, "userInfoProvider");
        j.f(bVar2, "appVersionProvider");
        j.f(str, "envName");
        j.f(aVar2, "internalLogger");
        j.f(cVar3, "spanEventMapper");
    }
}
