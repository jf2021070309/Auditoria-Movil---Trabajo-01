package com.amazon.aps.iva.m0;
/* compiled from: RadioButton.kt */
/* loaded from: classes.dex */
public final class x2 {
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float f;
    public static final float a = 24;
    public static final float e = 12;

    /* compiled from: RadioButton.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.h1.e, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.o0.p3<com.amazon.aps.iva.f1.x> h;
        public final /* synthetic */ com.amazon.aps.iva.o0.p3<com.amazon.aps.iva.o2.e> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.o0.p3<com.amazon.aps.iva.f1.x> p3Var, com.amazon.aps.iva.o0.p3<com.amazon.aps.iva.o2.e> p3Var2) {
            super(1);
            this.h = p3Var;
            this.i = p3Var2;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.h1.e eVar) {
            com.amazon.aps.iva.h1.e eVar2 = eVar;
            com.amazon.aps.iva.yb0.j.f(eVar2, "$this$Canvas");
            float P0 = eVar2.P0(x2.f);
            com.amazon.aps.iva.o0.p3<com.amazon.aps.iva.f1.x> p3Var = this.h;
            float f = P0 / 2;
            com.amazon.aps.iva.h1.e.D(eVar2, p3Var.getValue().a, eVar2.P0(x2.d) - f, 0L, new com.amazon.aps.iva.h1.i(P0, 0.0f, 0, 0, 30), 108);
            com.amazon.aps.iva.o0.p3<com.amazon.aps.iva.o2.e> p3Var2 = this.i;
            if (Float.compare(p3Var2.getValue().b, 0) > 0) {
                com.amazon.aps.iva.h1.e.D(eVar2, p3Var.getValue().a, eVar2.P0(p3Var2.getValue().b) - f, 0L, com.amazon.aps.iva.h1.h.a, 108);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: RadioButton.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ boolean h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> i;
        public final /* synthetic */ com.amazon.aps.iva.a1.f j;
        public final /* synthetic */ boolean k;
        public final /* synthetic */ com.amazon.aps.iva.c0.l l;
        public final /* synthetic */ w2 m;
        public final /* synthetic */ int n;
        public final /* synthetic */ int o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.a1.f fVar, boolean z2, com.amazon.aps.iva.c0.l lVar, w2 w2Var, int i, int i2) {
            super(2);
            this.h = z;
            this.i = aVar;
            this.j = fVar;
            this.k = z2;
            this.l = lVar;
            this.m = w2Var;
            this.n = i;
            this.o = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            x2.a(this.h, this.i, this.j, this.k, this.l, this.m, iVar, com.amazon.aps.iva.ff0.b.I(this.n | 1), this.o);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    static {
        float f2 = 2;
        b = f2;
        float f3 = 20;
        c = f3;
        d = f3 / f2;
        f = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0171  */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.amazon.aps.iva.m0.w2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r23, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r24, com.amazon.aps.iva.a1.f r25, boolean r26, com.amazon.aps.iva.c0.l r27, com.amazon.aps.iva.m0.w2 r28, com.amazon.aps.iva.o0.i r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.m0.x2.a(boolean, com.amazon.aps.iva.xb0.a, com.amazon.aps.iva.a1.f, boolean, com.amazon.aps.iva.c0.l, com.amazon.aps.iva.m0.w2, com.amazon.aps.iva.o0.i, int, int):void");
    }
}
