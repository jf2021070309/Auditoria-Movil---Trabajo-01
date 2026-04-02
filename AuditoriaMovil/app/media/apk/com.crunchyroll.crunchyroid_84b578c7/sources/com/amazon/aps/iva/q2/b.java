package com.amazon.aps.iva.q2;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.u0;
import com.amazon.aps.iva.o0.v0;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.u1.e;
import java.util.UUID;
/* compiled from: AndroidDialog.android.kt */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: AndroidDialog.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<v0, u0> {
        public final /* synthetic */ r h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r rVar) {
            super(1);
            this.h = rVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final u0 invoke(v0 v0Var) {
            com.amazon.aps.iva.yb0.j.f(v0Var, "$this$DisposableEffect");
            r rVar = this.h;
            rVar.show();
            return new com.amazon.aps.iva.q2.a(rVar);
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    /* renamed from: com.amazon.aps.iva.q2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0632b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ r h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> i;
        public final /* synthetic */ q j;
        public final /* synthetic */ com.amazon.aps.iva.o2.l k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0632b(r rVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, q qVar, com.amazon.aps.iva.o2.l lVar) {
            super(0);
            this.h = rVar;
            this.i = aVar;
            this.j = qVar;
            this.k = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            this.h.U2(this.i, this.j, this.k);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> h;
        public final /* synthetic */ q i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, q qVar, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, int i, int i2) {
            super(2);
            this.h = aVar;
            this.i = qVar;
            this.j = pVar;
            this.k = i;
            this.l = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            b.a(this.h, this.i, this.j, iVar, com.amazon.aps.iva.ff0.b.I(this.k | 1), this.l);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ p3<com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q>> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(q1 q1Var) {
            super(2);
            this.h = q1Var;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                b.b(48, 0, iVar2, com.amazon.aps.iva.a2.o.a(f.a.c, false, com.amazon.aps.iva.q2.c.h), com.amazon.aps.iva.v0.b.b(iVar2, -533674951, new com.amazon.aps.iva.q2.d(this.h)));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<UUID> {
        public static final e h = new e();

        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r16, com.amazon.aps.iva.q2.q r17, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r18, com.amazon.aps.iva.o0.i r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.q2.b.a(com.amazon.aps.iva.xb0.a, com.amazon.aps.iva.q2.q, com.amazon.aps.iva.xb0.p, com.amazon.aps.iva.o0.i, int, int):void");
    }

    public static final void b(int i, int i2, com.amazon.aps.iva.o0.i iVar, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.p pVar) {
        int i3;
        int i4;
        int i5;
        com.amazon.aps.iva.o0.j g = iVar.g(-1177876616);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (g.H(fVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (g.v(pVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 91) == 18 && g.h()) {
            g.A();
        } else {
            if (i6 != 0) {
                fVar = f.a.c;
            }
            e0.b bVar = e0.a;
            com.amazon.aps.iva.q2.e eVar = com.amazon.aps.iva.q2.e.a;
            g.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(g);
            c2 P = g.P();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar = e.a.b;
            com.amazon.aps.iva.v0.a a2 = com.amazon.aps.iva.s1.u.a(fVar);
            int i7 = (((((i3 << 3) & 112) | ((i3 >> 3) & 14)) << 9) & 7168) | 6;
            if (g.a instanceof com.amazon.aps.iva.o0.d) {
                g.z();
                if (g.M) {
                    g.w(aVar);
                } else {
                    g.m();
                }
                com.amazon.aps.iva.cq.b.k0(g, eVar, e.a.e);
                com.amazon.aps.iva.cq.b.k0(g, P, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (g.M || !com.amazon.aps.iva.yb0.j.a(g.e0(), Integer.valueOf(S))) {
                    defpackage.a.c(S, g, S, c0752a);
                }
                defpackage.b.d((i7 >> 3) & 112, a2, new x2(g), g, 2058660585);
                pVar.invoke(g, Integer.valueOf((i7 >> 9) & 14));
                g.U(false);
                g.U(true);
                g.U(false);
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new f(i, i2, fVar, pVar);
        }
    }
}
