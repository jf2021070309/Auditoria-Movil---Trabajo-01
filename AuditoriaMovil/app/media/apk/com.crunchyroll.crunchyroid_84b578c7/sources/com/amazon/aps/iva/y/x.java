package com.amazon.aps.iva.y;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.q1;
/* compiled from: AnimatedVisibility.kt */
/* loaded from: classes.dex */
public final class x {

    /* compiled from: AnimatedVisibility.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1", f = "AnimatedVisibility.kt", l = {748}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.z.a1<f0> i;
        public final /* synthetic */ q1<Boolean> j;

        /* compiled from: AnimatedVisibility.kt */
        /* renamed from: com.amazon.aps.iva.y.x$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0876a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
            public final /* synthetic */ com.amazon.aps.iva.z.a1<f0> h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0876a(com.amazon.aps.iva.z.a1<f0> a1Var) {
                super(0);
                this.h = a1Var;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final Boolean invoke() {
                boolean z;
                com.amazon.aps.iva.z.a1<f0> a1Var = this.h;
                f0 b = a1Var.b();
                f0 f0Var = f0.Visible;
                if (b != f0Var && a1Var.d() != f0Var) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        /* compiled from: AnimatedVisibility.kt */
        /* loaded from: classes.dex */
        public static final class b implements com.amazon.aps.iva.ve0.g<Boolean> {
            public final /* synthetic */ q1<Boolean> b;

            public b(q1<Boolean> q1Var) {
                this.b = q1Var;
            }

            @Override // com.amazon.aps.iva.ve0.g
            public final Object a(Boolean bool, com.amazon.aps.iva.ob0.d dVar) {
                this.b.setValue(Boolean.valueOf(bool.booleanValue()));
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.z.a1<f0> a1Var, q1<Boolean> q1Var, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = a1Var;
            this.j = q1Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.ve0.j0 m0 = com.amazon.aps.iva.cq.b.m0(new C0876a(this.i));
                b bVar = new b(this.j);
                this.h = 1;
                if (m0.c(bVar, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.z.a1<T> h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<T, Boolean> i;
        public final /* synthetic */ com.amazon.aps.iva.a1.f j;
        public final /* synthetic */ r0 k;
        public final /* synthetic */ t0 l;
        public final /* synthetic */ com.amazon.aps.iva.xb0.q<y, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> m;
        public final /* synthetic */ int n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(com.amazon.aps.iva.z.a1<T> a1Var, com.amazon.aps.iva.xb0.l<? super T, Boolean> lVar, com.amazon.aps.iva.a1.f fVar, r0 r0Var, t0 t0Var, com.amazon.aps.iva.xb0.q<? super y, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> qVar, int i) {
            super(2);
            this.h = a1Var;
            this.i = lVar;
            this.j = fVar;
            this.k = r0Var;
            this.l = t0Var;
            this.m = qVar;
            this.n = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            x.a(this.h, this.i, this.j, this.k, this.l, this.m, iVar, com.amazon.aps.iva.ff0.b.I(this.n | 1));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.z.a1<T> h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<T, Boolean> i;
        public final /* synthetic */ com.amazon.aps.iva.a1.f j;
        public final /* synthetic */ r0 k;
        public final /* synthetic */ t0 l;
        public final /* synthetic */ com.amazon.aps.iva.xb0.q<y, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> m;
        public final /* synthetic */ int n;
        public final /* synthetic */ int o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(com.amazon.aps.iva.z.a1<T> a1Var, com.amazon.aps.iva.xb0.l<? super T, Boolean> lVar, com.amazon.aps.iva.a1.f fVar, r0 r0Var, t0 t0Var, com.amazon.aps.iva.xb0.q<? super y, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> qVar, int i, int i2) {
            super(2);
            this.h = a1Var;
            this.i = lVar;
            this.j = fVar;
            this.k = r0Var;
            this.l = t0Var;
            this.m = qVar;
            this.n = i;
            this.o = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            x.b(this.h, this.i, this.j, this.k, this.l, this.m, iVar, com.amazon.aps.iva.ff0.b.I(this.n | 1), this.o);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Boolean, Boolean> {
        public static final d h = new d();

        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(Boolean bool) {
            return Boolean.valueOf(bool.booleanValue());
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ boolean h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ r0 j;
        public final /* synthetic */ t0 k;
        public final /* synthetic */ String l;
        public final /* synthetic */ com.amazon.aps.iva.xb0.q<y, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> m;
        public final /* synthetic */ int n;
        public final /* synthetic */ int o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(boolean z, com.amazon.aps.iva.a1.f fVar, r0 r0Var, t0 t0Var, String str, com.amazon.aps.iva.xb0.q<? super y, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> qVar, int i, int i2) {
            super(2);
            this.h = z;
            this.i = fVar;
            this.j = r0Var;
            this.k = t0Var;
            this.l = str;
            this.m = qVar;
            this.n = i;
            this.o = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            x.c(this.h, this.i, this.j, this.k, this.l, this.m, iVar, com.amazon.aps.iva.ff0.b.I(this.n | 1), this.o);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x065a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void a(com.amazon.aps.iva.z.a1<T> r23, com.amazon.aps.iva.xb0.l<? super T, java.lang.Boolean> r24, com.amazon.aps.iva.a1.f r25, com.amazon.aps.iva.y.r0 r26, com.amazon.aps.iva.y.t0 r27, com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.y.y, ? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r28, com.amazon.aps.iva.o0.i r29, int r30) {
        /*
            Method dump skipped, instructions count: 1980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.y.x.a(com.amazon.aps.iva.z.a1, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.y.r0, com.amazon.aps.iva.y.t0, com.amazon.aps.iva.xb0.q, com.amazon.aps.iva.o0.i, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void b(com.amazon.aps.iva.z.a1<T> r17, com.amazon.aps.iva.xb0.l<? super T, java.lang.Boolean> r18, com.amazon.aps.iva.a1.f r19, com.amazon.aps.iva.y.r0 r20, com.amazon.aps.iva.y.t0 r21, com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.y.y, ? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r22, com.amazon.aps.iva.o0.i r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.y.x.b(com.amazon.aps.iva.z.a1, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.y.r0, com.amazon.aps.iva.y.t0, com.amazon.aps.iva.xb0.q, com.amazon.aps.iva.o0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(boolean r17, com.amazon.aps.iva.a1.f r18, com.amazon.aps.iva.y.r0 r19, com.amazon.aps.iva.y.t0 r20, java.lang.String r21, com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.y.y, ? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r22, com.amazon.aps.iva.o0.i r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.y.x.c(boolean, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.y.r0, com.amazon.aps.iva.y.t0, java.lang.String, com.amazon.aps.iva.xb0.q, com.amazon.aps.iva.o0.i, int, int):void");
    }

    public static final f0 d(com.amazon.aps.iva.z.a1 a1Var, com.amazon.aps.iva.xb0.l lVar, Object obj, com.amazon.aps.iva.o0.i iVar) {
        f0 f0Var;
        iVar.s(361571134);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        iVar.y(-721837504, a1Var);
        if (a1Var.e()) {
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                f0Var = f0.Visible;
            } else if (((Boolean) lVar.invoke(a1Var.b())).booleanValue()) {
                f0Var = f0.PostExit;
            } else {
                f0Var = f0.PreEnter;
            }
        } else {
            iVar.s(-492369756);
            Object t = iVar.t();
            if (t == i.a.a) {
                t = com.amazon.aps.iva.cq.b.c0(Boolean.FALSE);
                iVar.n(t);
            }
            iVar.G();
            q1 q1Var = (q1) t;
            if (((Boolean) lVar.invoke(a1Var.b())).booleanValue()) {
                q1Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                f0Var = f0.Visible;
            } else if (((Boolean) q1Var.getValue()).booleanValue()) {
                f0Var = f0.PostExit;
            } else {
                f0Var = f0.PreEnter;
            }
        }
        iVar.F();
        iVar.G();
        return f0Var;
    }
}
