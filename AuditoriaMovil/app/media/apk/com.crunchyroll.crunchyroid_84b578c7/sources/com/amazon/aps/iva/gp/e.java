package com.amazon.aps.iva.gp;

import com.amazon.aps.iva.qo.l;
import com.amazon.aps.iva.yb0.j;
/* compiled from: OfflineWatchScreenPresenterImpl.kt */
/* loaded from: classes2.dex */
public final class e extends l {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(com.amazon.aps.iva.qo.v r14, com.amazon.aps.iva.qo.w r15, com.amazon.aps.iva.ll.g r16, com.amazon.aps.iva.xo.d r17, com.amazon.aps.iva.ro.c r18, com.amazon.aps.iva.qo.u r19, com.amazon.aps.iva.gn.c r20, com.amazon.aps.iva.qo.a r21, com.amazon.aps.iva.gp.a.r r22, com.amazon.aps.iva.ye.f r23) {
        /*
            r13 = this;
            com.amazon.aps.iva.lo.d r0 = com.amazon.aps.iva.lo.c.a.a
            if (r0 == 0) goto L46
            com.amazon.aps.iva.cj.l r0 = r0.getPlayerFeature()
            com.amazon.aps.iva.cj.h r3 = r0.getPlayer()
            java.lang.String r0 = "view"
            r8 = r14
            com.amazon.aps.iva.yb0.j.f(r14, r0)
            java.lang.String r0 = "playerSettingsMonitor"
            r4 = r16
            com.amazon.aps.iva.yb0.j.f(r4, r0)
            java.lang.String r0 = "watchScreenRouter"
            r7 = r19
            com.amazon.aps.iva.yb0.j.f(r7, r0)
            java.lang.String r0 = "shareComponent"
            r5 = r20
            com.amazon.aps.iva.yb0.j.f(r5, r0)
            java.lang.String r0 = "backButtonHandler"
            r6 = r21
            com.amazon.aps.iva.yb0.j.f(r6, r0)
            java.lang.String r0 = "castStateProvider"
            r2 = r23
            com.amazon.aps.iva.yb0.j.f(r2, r0)
            java.lang.String r0 = "player"
            com.amazon.aps.iva.yb0.j.f(r3, r0)
            r1 = r13
            r9 = r15
            r10 = r18
            r11 = r17
            r12 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L46:
            java.lang.String r0 = "dependencies"
            com.amazon.aps.iva.yb0.j.m(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gp.e.<init>(com.amazon.aps.iva.qo.v, com.amazon.aps.iva.qo.w, com.amazon.aps.iva.ll.g, com.amazon.aps.iva.xo.d, com.amazon.aps.iva.ro.c, com.amazon.aps.iva.qo.u, com.amazon.aps.iva.gn.c, com.amazon.aps.iva.qo.a, com.amazon.aps.iva.gp.a$r, com.amazon.aps.iva.ye.f):void");
    }

    @Override // com.amazon.aps.iva.qo.l, com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        super.onCreate();
        getView().ud();
        getView().u0();
    }

    @Override // com.amazon.aps.iva.qo.l
    public final void r6(String str) {
        j.f(str, "assetId");
    }

    @Override // com.amazon.aps.iva.qo.l
    public final void s6(com.amazon.aps.iva.sf.e eVar) {
        j.f(eVar, "rating");
    }
}
