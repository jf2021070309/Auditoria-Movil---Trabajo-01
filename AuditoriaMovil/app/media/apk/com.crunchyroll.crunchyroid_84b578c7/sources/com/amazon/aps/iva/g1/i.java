package com.amazon.aps.iva.g1;

import com.amazon.aps.iva.f1.d0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
/* compiled from: Connector.kt */
/* loaded from: classes.dex */
public class i {
    public static final h e;
    public static final i f;
    public static final i g;
    public final c a;
    public final c b;
    public final c c;
    public final float[] d;

    /* compiled from: Connector.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    /* compiled from: Connector.kt */
    /* loaded from: classes.dex */
    public static final class b extends i {
        public final u h;
        public final u i;
        public final float[] j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u uVar, u uVar2, int i) {
            super(uVar, uVar2, uVar, uVar2, null);
            boolean z;
            float[] e;
            com.amazon.aps.iva.yb0.j.f(uVar2, "mDestination");
            this.h = uVar;
            this.i = uVar2;
            w wVar = uVar.d;
            w wVar2 = uVar2.d;
            boolean c = d.c(wVar, wVar2);
            float[] fArr = uVar.i;
            float[] fArr2 = uVar2.j;
            if (c) {
                e = d.e(fArr2, fArr);
            } else {
                float[] a = wVar.a();
                float[] a2 = wVar2.a();
                w wVar3 = com.amazon.aps.iva.aq.k.c;
                boolean c2 = d.c(wVar, wVar3);
                float[] fArr3 = com.amazon.aps.iva.aq.k.f;
                float[] fArr4 = com.amazon.aps.iva.g1.a.b.a;
                if (!c2) {
                    float[] copyOf = Arrays.copyOf(fArr3, 3);
                    com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, size)");
                    fArr = d.e(d.b(fArr4, a, copyOf), fArr);
                }
                if (!d.c(wVar2, wVar3)) {
                    float[] copyOf2 = Arrays.copyOf(fArr3, 3);
                    com.amazon.aps.iva.yb0.j.e(copyOf2, "copyOf(this, size)");
                    fArr2 = d.d(d.e(d.b(fArr4, a2, copyOf2), uVar2.i));
                }
                if (i == 3) {
                    z = true;
                } else {
                    z = false;
                }
                e = d.e(fArr2, z ? d.f(new float[]{a[0] / a2[0], a[1] / a2[1], a[2] / a2[2]}, fArr) : fArr);
            }
            this.j = e;
        }

        @Override // com.amazon.aps.iva.g1.i
        public final long a(float f, float f2, float f3, float f4) {
            u uVar = this.h;
            float f5 = (float) uVar.p.f(f);
            double d = f2;
            m mVar = uVar.p;
            float f6 = (float) mVar.f(d);
            float f7 = (float) mVar.f(f3);
            float[] fArr = this.j;
            float h = d.h(f5, f6, f7, fArr);
            float i = d.i(f5, f6, f7, fArr);
            float j = d.j(f5, f6, f7, fArr);
            u uVar2 = this.i;
            float f8 = (float) uVar2.m.f(h);
            double d2 = i;
            d0 d0Var = uVar2.m;
            return defpackage.i.b(f8, (float) d0Var.f(d2), (float) d0Var.f(j), f4, uVar2);
        }
    }

    static {
        new a();
        u uVar = g.c;
        com.amazon.aps.iva.yb0.j.f(uVar, FirebaseAnalytics.Param.SOURCE);
        e = new h(uVar);
        l lVar = g.t;
        f = new i(uVar, lVar, 0);
        g = new i(lVar, uVar, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(com.amazon.aps.iva.g1.c r12, com.amazon.aps.iva.g1.c r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "source"
            com.amazon.aps.iva.yb0.j.f(r12, r0)
            java.lang.String r0 = "destination"
            com.amazon.aps.iva.yb0.j.f(r13, r0)
            long r0 = com.amazon.aps.iva.g1.b.a
            long r2 = r12.b
            boolean r4 = com.amazon.aps.iva.g1.b.a(r2, r0)
            if (r4 == 0) goto L1a
            com.amazon.aps.iva.g1.c r4 = com.amazon.aps.iva.g1.d.a(r12)
            r8 = r4
            goto L1b
        L1a:
            r8 = r12
        L1b:
            long r4 = r13.b
            boolean r6 = com.amazon.aps.iva.g1.b.a(r4, r0)
            if (r6 == 0) goto L29
            com.amazon.aps.iva.g1.c r6 = com.amazon.aps.iva.g1.d.a(r13)
            r9 = r6
            goto L2a
        L29:
            r9 = r13
        L2a:
            r6 = 1
            r7 = 0
            r10 = 3
            if (r14 != r10) goto L31
            r14 = r6
            goto L32
        L31:
            r14 = r7
        L32:
            if (r14 != 0) goto L35
            goto L47
        L35:
            boolean r14 = com.amazon.aps.iva.g1.b.a(r2, r0)
            boolean r0 = com.amazon.aps.iva.g1.b.a(r4, r0)
            if (r14 == 0) goto L42
            if (r0 == 0) goto L42
            goto L47
        L42:
            if (r14 != 0) goto L4a
            if (r0 == 0) goto L47
            goto L4a
        L47:
            r14 = 0
            r10 = r14
            goto L7c
        L4a:
            if (r14 == 0) goto L4e
            r1 = r12
            goto L4f
        L4e:
            r1 = r13
        L4f:
            com.amazon.aps.iva.g1.u r1 = (com.amazon.aps.iva.g1.u) r1
            float[] r2 = com.amazon.aps.iva.aq.k.f
            com.amazon.aps.iva.g1.w r1 = r1.d
            if (r14 == 0) goto L5c
            float[] r14 = r1.a()
            goto L5d
        L5c:
            r14 = r2
        L5d:
            if (r0 == 0) goto L63
            float[] r2 = r1.a()
        L63:
            float[] r0 = new float[r10]
            r1 = r14[r7]
            r3 = r2[r7]
            float r1 = r1 / r3
            r0[r7] = r1
            r1 = r14[r6]
            r3 = r2[r6]
            float r1 = r1 / r3
            r0[r6] = r1
            r1 = 2
            r14 = r14[r1]
            r2 = r2[r1]
            float r14 = r14 / r2
            r0[r1] = r14
            r10 = r0
        L7c:
            r5 = r11
            r6 = r12
            r7 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.g1.i.<init>(com.amazon.aps.iva.g1.c, com.amazon.aps.iva.g1.c, int):void");
    }

    public long a(float f2, float f3, float f4, float f5) {
        c cVar = this.b;
        long e2 = cVar.e(f2, f3, f4);
        float intBitsToFloat = Float.intBitsToFloat((int) (e2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (e2 & 4294967295L));
        float g2 = cVar.g(f2, f3, f4);
        float[] fArr = this.d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            g2 *= fArr[2];
        }
        float f6 = intBitsToFloat2;
        float f7 = intBitsToFloat;
        return this.c.h(f7, f6, g2, f5, this.a);
    }

    public i(c cVar, c cVar2, c cVar3, c cVar4, float[] fArr) {
        com.amazon.aps.iva.yb0.j.f(cVar, FirebaseAnalytics.Param.SOURCE);
        com.amazon.aps.iva.yb0.j.f(cVar2, FirebaseAnalytics.Param.DESTINATION);
        com.amazon.aps.iva.yb0.j.f(cVar4, "transformDestination");
        this.a = cVar2;
        this.b = cVar3;
        this.c = cVar4;
        this.d = fArr;
    }
}
