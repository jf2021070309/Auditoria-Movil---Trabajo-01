package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.o0.e0;
/* compiled from: TextField.kt */
/* loaded from: classes.dex */
public final class r3 {
    public static final float a = 20;
    public static final float b = 10;
    public static final float c = 4;

    /* compiled from: TextField.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, ? extends com.amazon.aps.iva.kb0.q>, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.i2.e0 h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ boolean j;
        public final /* synthetic */ com.amazon.aps.iva.i2.p0 k;
        public final /* synthetic */ com.amazon.aps.iva.c0.l l;
        public final /* synthetic */ boolean m;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> n;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> o;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> p;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> q;
        public final /* synthetic */ e3 r;
        public final /* synthetic */ int s;
        public final /* synthetic */ int t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.amazon.aps.iva.i2.e0 e0Var, boolean z, boolean z2, com.amazon.aps.iva.i2.p0 p0Var, com.amazon.aps.iva.c0.l lVar, boolean z3, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar2, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar3, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar4, e3 e3Var, int i, int i2) {
            super(3);
            this.h = e0Var;
            this.i = z;
            this.j = z2;
            this.k = p0Var;
            this.l = lVar;
            this.m = z3;
            this.n = pVar;
            this.o = pVar2;
            this.p = pVar3;
            this.q = pVar4;
            this.r = e3Var;
            this.s = i;
            this.t = i2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, ? extends com.amazon.aps.iva.kb0.q> pVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
            int i;
            com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, ? extends com.amazon.aps.iva.kb0.q> pVar2 = pVar;
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            int intValue = num.intValue();
            com.amazon.aps.iva.yb0.j.f(pVar2, "innerTextField");
            if ((intValue & 14) == 0) {
                if (iVar2.v(pVar2)) {
                    i = 4;
                } else {
                    i = 2;
                }
                intValue |= i;
            }
            int i2 = intValue;
            if ((i2 & 91) == 18 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = com.amazon.aps.iva.o0.e0.a;
                g3 g3Var = g3.a;
                String str = this.h.a.b;
                boolean z = this.i;
                boolean z2 = this.j;
                com.amazon.aps.iva.i2.p0 p0Var = this.k;
                com.amazon.aps.iva.c0.l lVar = this.l;
                boolean z3 = this.m;
                com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> pVar3 = this.n;
                com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> pVar4 = this.o;
                com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> pVar5 = this.p;
                com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> pVar6 = this.q;
                e3 e3Var = this.r;
                int i3 = this.s;
                int i4 = ((i3 >> 3) & 896) | ((i2 << 3) & 112);
                int i5 = this.t;
                int i6 = ((i5 >> 3) & 7168) | i4 | ((i5 << 9) & 57344) | ((i5 >> 6) & 458752) | ((i5 << 18) & 3670016);
                int i7 = i3 << 3;
                g3Var.a(str, pVar2, z, z2, p0Var, lVar, z3, pVar3, pVar4, pVar5, pVar6, e3Var, null, iVar2, i6 | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), ((i3 >> 27) & 14) | 3072 | ((i5 >> 24) & 112), 4096);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: TextField.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ e3 A;
        public final /* synthetic */ int B;
        public final /* synthetic */ int C;
        public final /* synthetic */ int D;
        public final /* synthetic */ com.amazon.aps.iva.i2.e0 h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.i2.e0, com.amazon.aps.iva.kb0.q> i;
        public final /* synthetic */ com.amazon.aps.iva.a1.f j;
        public final /* synthetic */ boolean k;
        public final /* synthetic */ boolean l;
        public final /* synthetic */ com.amazon.aps.iva.c2.a0 m;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> n;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> o;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> p;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> q;
        public final /* synthetic */ boolean r;
        public final /* synthetic */ com.amazon.aps.iva.i2.p0 s;
        public final /* synthetic */ com.amazon.aps.iva.j0.u0 t;
        public final /* synthetic */ com.amazon.aps.iva.j0.t0 u;
        public final /* synthetic */ boolean v;
        public final /* synthetic */ int w;
        public final /* synthetic */ int x;
        public final /* synthetic */ com.amazon.aps.iva.c0.l y;
        public final /* synthetic */ com.amazon.aps.iva.f1.u0 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(com.amazon.aps.iva.i2.e0 e0Var, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.i2.e0, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.a1.f fVar, boolean z, boolean z2, com.amazon.aps.iva.c2.a0 a0Var, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar2, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar3, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar4, boolean z3, com.amazon.aps.iva.i2.p0 p0Var, com.amazon.aps.iva.j0.u0 u0Var, com.amazon.aps.iva.j0.t0 t0Var, boolean z4, int i, int i2, com.amazon.aps.iva.c0.l lVar2, com.amazon.aps.iva.f1.u0 u0Var2, e3 e3Var, int i3, int i4, int i5) {
            super(2);
            this.h = e0Var;
            this.i = lVar;
            this.j = fVar;
            this.k = z;
            this.l = z2;
            this.m = a0Var;
            this.n = pVar;
            this.o = pVar2;
            this.p = pVar3;
            this.q = pVar4;
            this.r = z3;
            this.s = p0Var;
            this.t = u0Var;
            this.u = t0Var;
            this.v = z4;
            this.w = i;
            this.x = i2;
            this.y = lVar2;
            this.z = u0Var2;
            this.A = e3Var;
            this.B = i3;
            this.C = i4;
            this.D = i5;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            r3.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, iVar, com.amazon.aps.iva.ff0.b.I(this.B | 1), com.amazon.aps.iva.ff0.b.I(this.C), this.D);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: TextField.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.a1.f h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> k;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> l;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> m;
        public final /* synthetic */ boolean n;
        public final /* synthetic */ float o;
        public final /* synthetic */ com.amazon.aps.iva.d0.o1 p;
        public final /* synthetic */ int q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar2, com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.a1.f, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> qVar, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar3, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar4, boolean z, float f, com.amazon.aps.iva.d0.o1 o1Var, int i) {
            super(2);
            this.h = fVar;
            this.i = pVar;
            this.j = pVar2;
            this.k = qVar;
            this.l = pVar3;
            this.m = pVar4;
            this.n = z;
            this.o = f;
            this.p = o1Var;
            this.q = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            r3.b(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, iVar, com.amazon.aps.iva.ff0.b.I(this.q | 1));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x01b3, code lost:
        if (r7.H(r64) == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:316:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.amazon.aps.iva.i2.e0 r51, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.i2.e0, com.amazon.aps.iva.kb0.q> r52, com.amazon.aps.iva.a1.f r53, boolean r54, boolean r55, com.amazon.aps.iva.c2.a0 r56, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r57, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r58, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r59, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r60, boolean r61, com.amazon.aps.iva.i2.p0 r62, com.amazon.aps.iva.j0.u0 r63, com.amazon.aps.iva.j0.t0 r64, boolean r65, int r66, int r67, com.amazon.aps.iva.c0.l r68, com.amazon.aps.iva.f1.u0 r69, com.amazon.aps.iva.m0.e3 r70, com.amazon.aps.iva.o0.i r71, int r72, int r73, int r74) {
        /*
            Method dump skipped, instructions count: 1460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.m0.r3.a(com.amazon.aps.iva.i2.e0, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.a1.f, boolean, boolean, com.amazon.aps.iva.c2.a0, com.amazon.aps.iva.xb0.p, com.amazon.aps.iva.xb0.p, com.amazon.aps.iva.xb0.p, com.amazon.aps.iva.xb0.p, boolean, com.amazon.aps.iva.i2.p0, com.amazon.aps.iva.j0.u0, com.amazon.aps.iva.j0.t0, boolean, int, int, com.amazon.aps.iva.c0.l, com.amazon.aps.iva.f1.u0, com.amazon.aps.iva.m0.e3, com.amazon.aps.iva.o0.i, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x02d8, code lost:
        if (r2 < r13) goto L122;
     */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v5, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.amazon.aps.iva.a1.f r23, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r24, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r25, com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.a1.f, ? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r26, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r27, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r28, boolean r29, float r30, com.amazon.aps.iva.d0.o1 r31, com.amazon.aps.iva.o0.i r32, int r33) {
        /*
            Method dump skipped, instructions count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.m0.r3.b(com.amazon.aps.iva.a1.f, com.amazon.aps.iva.xb0.p, com.amazon.aps.iva.xb0.p, com.amazon.aps.iva.xb0.q, com.amazon.aps.iva.xb0.p, com.amazon.aps.iva.xb0.p, boolean, float, com.amazon.aps.iva.d0.o1, com.amazon.aps.iva.o0.i, int):void");
    }

    public static final int c(int i, boolean z, int i2, int i3, int i4, int i5, long j, float f, com.amazon.aps.iva.d0.o1 o1Var) {
        float f2;
        float f3 = c * f;
        float d = o1Var.d() * f;
        float a2 = o1Var.a() * f;
        int max = Math.max(i, i5);
        if (z) {
            f2 = i2 + f3 + max + a2;
        } else {
            f2 = d + max + a2;
        }
        return Math.max(com.amazon.aps.iva.ob0.f.a(f2), Math.max(Math.max(i3, i4), com.amazon.aps.iva.o2.a.i(j)));
    }
}
