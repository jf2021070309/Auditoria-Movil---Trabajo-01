package com.amazon.aps.iva.wd;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.i2.e0;
import com.amazon.aps.iva.m0.a4;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.wd.u;
import com.crunchyroll.crunchyroid.R;
/* compiled from: CreatePasswordScreenContent.kt */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: CreatePasswordScreenContent.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u uVar) {
            com.amazon.aps.iva.yb0.j.f(uVar, "it");
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CreatePasswordScreenContent.kt */
    /* renamed from: com.amazon.aps.iva.wd.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0821b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<u, com.amazon.aps.iva.kb0.q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0821b(com.amazon.aps.iva.xb0.l<? super u, com.amazon.aps.iva.kb0.q> lVar) {
            super(0);
            this.h = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            this.h.invoke(u.a.a);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CreatePasswordScreenContent.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ q1<e0> h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<u, com.amazon.aps.iva.kb0.q> i;
        public final /* synthetic */ q1<e0> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(q1<e0> q1Var, com.amazon.aps.iva.xb0.l<? super u, com.amazon.aps.iva.kb0.q> lVar, int i, q1<e0> q1Var2) {
            super(2);
            this.h = q1Var;
            this.i = lVar;
            this.j = q1Var2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = com.amazon.aps.iva.o0.e0.a;
                String E = defpackage.i.E(R.string.create_password_guide, iVar2);
                a0 a0Var = com.amazon.aps.iva.je.a.a;
                f.a aVar = f.a.c;
                float f = 16;
                a4.b(E, com.amazon.aps.iva.a2.o.a(androidx.compose.foundation.layout.d.i(aVar, 0.0f, f, 0.0f, 24, 5), false, com.amazon.aps.iva.wd.d.h), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, a0Var, iVar2, 0, 1572864, 65532);
                q1<com.amazon.aps.iva.i2.e0> q1Var = this.h;
                com.amazon.aps.iva.i2.e0 value = q1Var.getValue();
                String E2 = defpackage.i.E(R.string.email, iVar2);
                com.amazon.aps.iva.a1.f a = com.amazon.aps.iva.a2.o.a(aVar, false, e.h);
                iVar2.s(511388516);
                boolean H = iVar2.H(q1Var);
                com.amazon.aps.iva.xb0.l<u, com.amazon.aps.iva.kb0.q> lVar = this.i;
                boolean H2 = H | iVar2.H(lVar);
                Object t = iVar2.t();
                Object obj = i.a.a;
                if (H2 || t == obj) {
                    t = new f(q1Var, lVar);
                    iVar2.n(t);
                }
                iVar2.G();
                com.amazon.aps.iva.he.a.a(value, a, (com.amazon.aps.iva.xb0.l) t, E2, 6, iVar2, 24576, 0);
                q1<com.amazon.aps.iva.i2.e0> q1Var2 = this.j;
                com.amazon.aps.iva.i2.e0 value2 = q1Var2.getValue();
                String E3 = defpackage.i.E(R.string.create_password, iVar2);
                float f2 = 12;
                com.amazon.aps.iva.a1.f a2 = com.amazon.aps.iva.a2.o.a(androidx.compose.foundation.layout.d.i(aVar, 0.0f, f2, 0.0f, 0.0f, 13), false, g.h);
                iVar2.s(511388516);
                boolean H3 = iVar2.H(q1Var2) | iVar2.H(lVar);
                Object t2 = iVar2.t();
                if (H3 || t2 == obj) {
                    t2 = new h(q1Var2, lVar);
                    iVar2.n(t2);
                }
                iVar2.G();
                com.amazon.aps.iva.he.a.a(value2, a2, (com.amazon.aps.iva.xb0.l) t2, E3, 7, iVar2, 24576, 0);
                String E4 = defpackage.i.E(R.string.password_privacy_policy, iVar2);
                String E5 = defpackage.i.E(R.string.password_terms, iVar2);
                com.amazon.aps.iva.a1.f a3 = com.amazon.aps.iva.a2.o.a(androidx.compose.foundation.layout.d.i(aVar, 0.0f, f2, 0.0f, 0.0f, 13), false, i.h);
                iVar2.s(511388516);
                boolean H4 = iVar2.H(lVar) | iVar2.H(E5);
                Object t3 = iVar2.t();
                if (H4 || t3 == obj) {
                    t3 = new j(E5, lVar);
                    iVar2.n(t3);
                }
                iVar2.G();
                com.amazon.aps.iva.xb0.a aVar2 = (com.amazon.aps.iva.xb0.a) t3;
                iVar2.s(511388516);
                boolean H5 = iVar2.H(lVar) | iVar2.H(E4);
                Object t4 = iVar2.t();
                if (H5 || t4 == obj) {
                    t4 = new k(E4, lVar);
                    iVar2.n(t4);
                }
                iVar2.G();
                com.amazon.aps.iva.ke.d.a(0, 0, iVar2, a3, aVar2, (com.amazon.aps.iva.xb0.a) t4);
                com.amazon.aps.iva.a1.f a4 = com.amazon.aps.iva.a2.o.a(androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.d.i(aVar, 0.0f, f, 0.0f, 0.0f, 13)), false, l.h);
                String E6 = defpackage.i.E(R.string.create_account, iVar2);
                iVar2.s(1157296644);
                boolean H6 = iVar2.H(lVar);
                Object t5 = iVar2.t();
                if (H6 || t5 == obj) {
                    t5 = new com.amazon.aps.iva.wd.c(lVar);
                    iVar2.n(t5);
                }
                iVar2.G();
                com.amazon.aps.iva.zn.a.d((com.amazon.aps.iva.xb0.l) t5, E6, a4, false, null, iVar2, 0, 24);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CreatePasswordScreenContent.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ t h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<u, com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(t tVar, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.l<? super u, com.amazon.aps.iva.kb0.q> lVar, int i, int i2) {
            super(2);
            this.h = tVar;
            this.i = fVar;
            this.j = lVar;
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.amazon.aps.iva.wd.t r14, com.amazon.aps.iva.a1.f r15, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.wd.u, com.amazon.aps.iva.kb0.q> r16, com.amazon.aps.iva.o0.i r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wd.b.a(com.amazon.aps.iva.wd.t, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.o0.i, int, int):void");
    }
}
