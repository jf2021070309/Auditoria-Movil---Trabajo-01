package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
/* compiled from: Button.kt */
/* loaded from: classes.dex */
public final class z {

    /* compiled from: Button.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.a2.c0, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.a2.c0 c0Var) {
            com.amazon.aps.iva.a2.c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            com.amazon.aps.iva.a2.y.d(c0Var2, 0);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Button.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.o0.p3<com.amazon.aps.iva.f1.x> h;
        public final /* synthetic */ com.amazon.aps.iva.d0.o1 i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.d0.x1, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(com.amazon.aps.iva.o0.p3<com.amazon.aps.iva.f1.x> p3Var, com.amazon.aps.iva.d0.o1 o1Var, com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.d0.x1, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> qVar, int i) {
            super(2);
            this.h = p3Var;
            this.i = o1Var;
            this.j = qVar;
            this.k = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = com.amazon.aps.iva.o0.e0.a;
                com.amazon.aps.iva.o0.l0.a(new com.amazon.aps.iva.o0.h2[]{e0.a.b(Float.valueOf(com.amazon.aps.iva.f1.x.d(this.h.getValue().a)))}, com.amazon.aps.iva.v0.b.b(iVar2, -1699085201, new b0(this.i, this.j, this.k)), iVar2, 56);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Button.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ boolean j;
        public final /* synthetic */ com.amazon.aps.iva.c0.l k;
        public final /* synthetic */ y l;
        public final /* synthetic */ com.amazon.aps.iva.f1.u0 m;
        public final /* synthetic */ com.amazon.aps.iva.a0.p n;
        public final /* synthetic */ w o;
        public final /* synthetic */ com.amazon.aps.iva.d0.o1 p;
        public final /* synthetic */ com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.d0.x1, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> q;
        public final /* synthetic */ int r;
        public final /* synthetic */ int s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.a1.f fVar, boolean z, com.amazon.aps.iva.c0.l lVar, y yVar, com.amazon.aps.iva.f1.u0 u0Var, com.amazon.aps.iva.a0.p pVar, w wVar, com.amazon.aps.iva.d0.o1 o1Var, com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.d0.x1, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> qVar, int i, int i2) {
            super(2);
            this.h = aVar;
            this.i = fVar;
            this.j = z;
            this.k = lVar;
            this.l = yVar;
            this.m = u0Var;
            this.n = pVar;
            this.o = wVar;
            this.p = o1Var;
            this.q = qVar;
            this.r = i;
            this.s = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            z.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, iVar, com.amazon.aps.iva.ff0.b.I(this.r | 1), this.s);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r34, com.amazon.aps.iva.a1.f r35, boolean r36, com.amazon.aps.iva.c0.l r37, com.amazon.aps.iva.m0.y r38, com.amazon.aps.iva.f1.u0 r39, com.amazon.aps.iva.a0.p r40, com.amazon.aps.iva.m0.w r41, com.amazon.aps.iva.d0.o1 r42, com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.d0.x1, ? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r43, com.amazon.aps.iva.o0.i r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.m0.z.a(com.amazon.aps.iva.xb0.a, com.amazon.aps.iva.a1.f, boolean, com.amazon.aps.iva.c0.l, com.amazon.aps.iva.m0.y, com.amazon.aps.iva.f1.u0, com.amazon.aps.iva.a0.p, com.amazon.aps.iva.m0.w, com.amazon.aps.iva.d0.o1, com.amazon.aps.iva.xb0.q, com.amazon.aps.iva.o0.i, int, int):void");
    }

    public static final void b(com.amazon.aps.iva.xb0.a aVar, g0 g0Var, com.amazon.aps.iva.v0.a aVar2, com.amazon.aps.iva.o0.i iVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "onClick");
        iVar.s(288797557);
        f.a aVar3 = f.a.c;
        iVar.s(-492369756);
        Object t = iVar.t();
        if (t == i.a.a) {
            t = new com.amazon.aps.iva.c0.m();
            iVar.n(t);
        }
        iVar.G();
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        a(aVar, aVar3, true, (com.amazon.aps.iva.c0.l) t, null, ((y2) iVar.i(z2.a)).a, null, g0Var, x.d, aVar2, iVar, 805306368, 0);
        iVar.G();
    }
}
