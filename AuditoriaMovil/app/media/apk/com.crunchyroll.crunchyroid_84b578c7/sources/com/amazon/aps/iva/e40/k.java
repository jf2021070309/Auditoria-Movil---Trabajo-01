package com.amazon.aps.iva.e40;

import com.amazon.aps.iva.kb0.q;
/* compiled from: PremiumMembershipPresenter.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.g40.a, q> {
    public final /* synthetic */ m h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar) {
        super(1);
        this.h = mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
        if (r7 == false) goto L14;
     */
    @Override // com.amazon.aps.iva.xb0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.g40.a r7) {
        /*
            r6 = this;
            com.amazon.aps.iva.g40.a r7 = (com.amazon.aps.iva.g40.a) r7
            com.amazon.aps.iva.e40.m r0 = r6.h
            java.lang.String r1 = "premiumMembershipInfo"
            com.amazon.aps.iva.yb0.j.f(r7, r1)
            java.lang.String r1 = r7.a
            com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.g40.a, com.amazon.aps.iva.e40.f> r2 = r0.c     // Catch: com.amazon.aps.iva.rs.h -> L8b
            com.amazon.aps.iva.rh.a r3 = r0.f
            java.lang.Object r7 = r2.invoke(r7)     // Catch: com.amazon.aps.iva.rs.h -> L8b
            com.amazon.aps.iva.e40.f r7 = (com.amazon.aps.iva.e40.f) r7     // Catch: com.amazon.aps.iva.rs.h -> L8b
            com.amazon.aps.iva.wy.h r2 = r0.getView()     // Catch: com.amazon.aps.iva.rs.h -> L8b
            com.amazon.aps.iva.e40.n r2 = (com.amazon.aps.iva.e40.n) r2     // Catch: com.amazon.aps.iva.rs.h -> L8b
            int r4 = r7.a     // Catch: com.amazon.aps.iva.rs.h -> L8b
            r2.T7(r4)     // Catch: com.amazon.aps.iva.rs.h -> L8b
            java.lang.String r4 = r7.b     // Catch: com.amazon.aps.iva.rs.h -> L8b
            r2.o9(r4)     // Catch: com.amazon.aps.iva.rs.h -> L8b
            r2.db(r4)     // Catch: com.amazon.aps.iva.rs.h -> L8b
            java.lang.String r4 = r7.c     // Catch: com.amazon.aps.iva.rs.h -> L8b
            r2.J7(r4)     // Catch: com.amazon.aps.iva.rs.h -> L8b
            java.lang.String r4 = r7.d     // Catch: com.amazon.aps.iva.rs.h -> L8b
            r2.Ga(r4)     // Catch: com.amazon.aps.iva.rs.h -> L8b
            java.lang.String r4 = r7.e     // Catch: com.amazon.aps.iva.rs.h -> L8b
            r2.Lc(r4)     // Catch: com.amazon.aps.iva.rs.h -> L8b
            java.lang.String r7 = r7.f     // Catch: com.amazon.aps.iva.rs.h -> L8b
            r2.Xh(r7)     // Catch: com.amazon.aps.iva.rs.h -> L8b
            java.lang.String r7 = "crunchyroll.google.premium.monthly"
            boolean r2 = com.amazon.aps.iva.yb0.j.a(r1, r7)     // Catch: com.amazon.aps.iva.rs.h -> L8b
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L5a
            boolean r7 = com.amazon.aps.iva.yb0.j.a(r1, r7)     // Catch: com.amazon.aps.iva.rs.h -> L8b
            if (r7 != 0) goto L57
            java.lang.String r7 = "crunchyroll.google.fanpack.monthly"
            boolean r7 = com.amazon.aps.iva.yb0.j.a(r1, r7)     // Catch: com.amazon.aps.iva.rs.h -> L8b
            if (r7 == 0) goto L55
            goto L57
        L55:
            r7 = r4
            goto L58
        L57:
            r7 = r5
        L58:
            if (r7 == 0) goto L67
        L5a:
            com.amazon.aps.iva.wy.h r7 = r0.getView()     // Catch: com.amazon.aps.iva.rs.h -> L8b
            com.amazon.aps.iva.e40.n r7 = (com.amazon.aps.iva.e40.n) r7     // Catch: com.amazon.aps.iva.rs.h -> L8b
            boolean r7 = r7.x9()     // Catch: com.amazon.aps.iva.rs.h -> L8b
            if (r7 != 0) goto L67
            r4 = r5
        L67:
            if (r4 == 0) goto L83
            com.amazon.aps.iva.wy.h r7 = r0.getView()     // Catch: com.amazon.aps.iva.rs.h -> L8b
            com.amazon.aps.iva.e40.n r7 = (com.amazon.aps.iva.e40.n) r7     // Catch: com.amazon.aps.iva.rs.h -> L8b
            r7.G3()     // Catch: com.amazon.aps.iva.rs.h -> L8b
            com.amazon.aps.iva.wy.h r7 = r0.getView()     // Catch: com.amazon.aps.iva.rs.h -> L8b
            com.amazon.aps.iva.e40.n r7 = (com.amazon.aps.iva.e40.n) r7     // Catch: com.amazon.aps.iva.rs.h -> L8b
            java.lang.String r1 = r3.b(r1)     // Catch: com.amazon.aps.iva.rs.h -> L8b
            java.util.List r2 = r3.a()     // Catch: com.amazon.aps.iva.rs.h -> L8b
            r7.k8(r1, r2)     // Catch: com.amazon.aps.iva.rs.h -> L8b
        L83:
            com.amazon.aps.iva.f40.a r7 = r0.d     // Catch: com.amazon.aps.iva.rs.h -> L8b
            com.amazon.aps.iva.js.o0$a r1 = com.amazon.aps.iva.js.o0.a.a     // Catch: com.amazon.aps.iva.rs.h -> L8b
            r7.e(r1)     // Catch: com.amazon.aps.iva.rs.h -> L8b
            goto L97
        L8b:
            com.amazon.aps.iva.e40.n r7 = com.amazon.aps.iva.e40.m.q6(r0)
            r7.F7()
            com.amazon.aps.iva.f40.a r7 = r0.d
            r7.c()
        L97:
            com.amazon.aps.iva.e40.n r7 = com.amazon.aps.iva.e40.m.q6(r0)
            r7.b()
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e40.k.invoke(java.lang.Object):java.lang.Object");
    }
}
