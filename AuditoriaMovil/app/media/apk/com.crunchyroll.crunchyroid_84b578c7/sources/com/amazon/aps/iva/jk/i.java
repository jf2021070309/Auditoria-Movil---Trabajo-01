package com.amazon.aps.iva.jk;

import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.rj.b;
import java.util.List;
/* compiled from: PlayerEventListenerForAds.kt */
/* loaded from: classes.dex */
public final class i implements l0.c {
    public final com.amazon.aps.iva.xb0.l<Boolean, com.amazon.aps.iva.kb0.q> b;
    public final com.amazon.aps.iva.xb0.l<List<Long>, com.amazon.aps.iva.kb0.q> c;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> d;
    public l0 e;

    public i(b.k kVar, b.l lVar, b.m mVar) {
        this.b = kVar;
        this.c = lVar;
        this.d = mVar;
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void O(l0 l0Var, l0.b bVar) {
        com.amazon.aps.iva.yb0.j.f(l0Var, "player");
        if (this.e == null) {
            this.e = l0Var;
        }
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void l0(int i, b0 b0Var) {
        if (b0Var == null) {
            return;
        }
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (z) {
            this.d.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090 A[SYNTHETIC] */
    @Override // com.amazon.aps.iva.q5.l0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q0(com.amazon.aps.iva.q5.r0 r11, int r12) {
        /*
            r10 = this;
            java.lang.String r12 = "timeline"
            com.amazon.aps.iva.yb0.j.f(r11, r12)
            boolean r12 = r11.r()
            if (r12 == 0) goto Lc
            return
        Lc:
            com.amazon.aps.iva.q5.l0 r12 = r10.e
            if (r12 == 0) goto Ld9
            com.amazon.aps.iva.mf0.a$a r0 = com.amazon.aps.iva.mf0.a.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ExoPlayer is playingAds: "
            r1.<init>(r2)
            boolean r2 = r12.o()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r0.a(r1, r3)
            boolean r0 = r12.o()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.amazon.aps.iva.xb0.l<java.lang.Boolean, com.amazon.aps.iva.kb0.q> r1 = r10.b
            r1.invoke(r0)
            int r12 = r12.p0()
            com.amazon.aps.iva.q5.r0$b r0 = new com.amazon.aps.iva.q5.r0$b
            r0.<init>()
            com.amazon.aps.iva.q5.r0$b r11 = r11.h(r12, r0, r2)
            com.amazon.aps.iva.q5.c r12 = r11.h
            int r12 = r12.c
            com.amazon.aps.iva.ec0.j r12 = com.amazon.aps.iva.aq.j.T(r2, r12)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = com.amazon.aps.iva.lb0.r.Y(r12)
            r0.<init>(r1)
            com.amazon.aps.iva.ec0.i r12 = r12.iterator()
        L59:
            boolean r1 = r12.d
            r3 = 1
            r4 = -1
            if (r1 == 0) goto L98
            int r1 = r12.b()
            com.amazon.aps.iva.q5.c r6 = r11.h
            com.amazon.aps.iva.q5.c$a r6 = r6.a(r1)
            int r7 = r6.c
            r8 = -1
            if (r7 != r8) goto L70
            goto L7f
        L70:
            r8 = r2
        L71:
            if (r8 >= r7) goto L81
            int[] r9 = r6.f
            r9 = r9[r8]
            if (r9 == 0) goto L7f
            if (r9 != r3) goto L7c
            goto L7f
        L7c:
            int r8 = r8 + 1
            goto L71
        L7f:
            r6 = r3
            goto L82
        L81:
            r6 = r2
        L82:
            r3 = r3 ^ r6
            if (r3 == 0) goto L86
            goto L90
        L86:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r4 = r11.d(r1)
            long r4 = r3.toMillis(r4)
        L90:
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r0.add(r1)
            goto L59
        L98:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r0.iterator()
        La1:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto Lbf
            java.lang.Object r0 = r12.next()
            r1 = r0
            java.lang.Number r1 = (java.lang.Number) r1
            long r6 = r1.longValue()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto Lb8
            r1 = r3
            goto Lb9
        Lb8:
            r1 = r2
        Lb9:
            if (r1 == 0) goto La1
            r11.add(r0)
            goto La1
        Lbf:
            com.amazon.aps.iva.mf0.a$a r12 = com.amazon.aps.iva.mf0.a.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ExoPlayer AdCuePoints: "
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r12.a(r0, r1)
            com.amazon.aps.iva.xb0.l<java.util.List<java.lang.Long>, com.amazon.aps.iva.kb0.q> r12 = r10.c
            r12.invoke(r11)
        Ld9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jk.i.q0(com.amazon.aps.iva.q5.r0, int):void");
    }
}
