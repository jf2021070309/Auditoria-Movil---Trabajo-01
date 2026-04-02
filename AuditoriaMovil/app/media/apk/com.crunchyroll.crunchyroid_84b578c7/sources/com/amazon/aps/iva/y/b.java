package com.amazon.aps.iva.y;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.y.r;
import com.amazon.aps.iva.z.a1;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: S
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: AnimatedContent.kt */
/* loaded from: classes.dex */
public final class b {

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* compiled from: AnimatedContent.kt */
    /* loaded from: classes.dex */
    public static final class a<S> extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<q<S>, e0> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final e0 invoke(Object obj) {
            com.amazon.aps.iva.yb0.j.f((q) obj, "$this$null");
            return new e0(g0.b(com.amazon.aps.iva.z.k.d(220, 90, null, 4), 2).b(new s0(new k1(null, null, null, new b1(0.92f, com.amazon.aps.iva.f1.b1.b, com.amazon.aps.iva.z.k.d(220, 90, null, 4)), 7))), g0.c(com.amazon.aps.iva.z.k.d(90, 0, null, 6), 2), 0.0f, 12);
        }
    }

    /* compiled from: AnimatedContent.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.z.a1<S> h;
        public final /* synthetic */ S i;
        public final /* synthetic */ int j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<q<S>, e0> k;
        public final /* synthetic */ r<S> l;
        public final /* synthetic */ com.amazon.aps.iva.y0.u<S> m;
        public final /* synthetic */ com.amazon.aps.iva.xb0.r<o, S, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(com.amazon.aps.iva.z.a1<S> a1Var, S s, int i, com.amazon.aps.iva.xb0.l<? super q<S>, e0> lVar, r<S> rVar, com.amazon.aps.iva.y0.u<S> uVar, com.amazon.aps.iva.xb0.r<? super o, ? super S, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> rVar2) {
            super(2);
            this.h = a1Var;
            this.i = s;
            this.j = i;
            this.k = lVar;
            this.l = rVar;
            this.m = uVar;
            this.n = rVar2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            Object obj;
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = com.amazon.aps.iva.o0.e0.a;
                iVar2.s(-492369756);
                e0 t = iVar2.t();
                i.a.C0550a c0550a = i.a.a;
                a1.b bVar2 = this.l;
                com.amazon.aps.iva.xb0.l<q<S>, e0> lVar = this.k;
                if (t == c0550a) {
                    t = lVar.invoke(bVar2);
                    iVar2.n(t);
                }
                iVar2.G();
                e0 e0Var = (e0) t;
                com.amazon.aps.iva.z.a1<S> a1Var = this.h;
                Object a = a1Var.c().a();
                S s = this.i;
                Boolean valueOf = Boolean.valueOf(com.amazon.aps.iva.yb0.j.a(a, s));
                iVar2.s(1157296644);
                boolean H = iVar2.H(valueOf);
                Object t2 = iVar2.t();
                if (H || t2 == c0550a) {
                    if (com.amazon.aps.iva.yb0.j.a(a1Var.c().a(), s)) {
                        obj = t0.a;
                    } else {
                        obj = lVar.invoke(bVar2).b;
                    }
                    t2 = obj;
                    iVar2.n(t2);
                }
                iVar2.G();
                t0 t0Var = (t0) t2;
                iVar2.s(-492369756);
                Object t3 = iVar2.t();
                if (t3 == c0550a) {
                    t3 = new r.a(com.amazon.aps.iva.yb0.j.a(s, a1Var.d()));
                    iVar2.n(t3);
                }
                iVar2.G();
                r.a aVar = (r.a) t3;
                r0 r0Var = e0Var.a;
                com.amazon.aps.iva.a1.f a2 = androidx.compose.ui.layout.b.a(f.a.c, new com.amazon.aps.iva.y.d(e0Var));
                aVar.c = com.amazon.aps.iva.yb0.j.a(s, a1Var.d());
                x.b(this.h, new e(s), a2.o(aVar), r0Var, t0Var, com.amazon.aps.iva.v0.b.b(iVar2, -1894897681, new h(this.l, this.i, this.m, this.n, this.j)), iVar2, (this.j & 14) | 196608, 0);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AnimatedContent.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.z.a1<S> h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<q<S>, e0> j;
        public final /* synthetic */ com.amazon.aps.iva.a1.a k;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<S, Object> l;
        public final /* synthetic */ com.amazon.aps.iva.xb0.r<o, S, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> m;
        public final /* synthetic */ int n;
        public final /* synthetic */ int o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(com.amazon.aps.iva.z.a1<S> a1Var, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.l<? super q<S>, e0> lVar, com.amazon.aps.iva.a1.a aVar, com.amazon.aps.iva.xb0.l<? super S, ? extends Object> lVar2, com.amazon.aps.iva.xb0.r<? super o, ? super S, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> rVar, int i, int i2) {
            super(2);
            this.h = a1Var;
            this.i = fVar;
            this.j = lVar;
            this.k = aVar;
            this.l = lVar2;
            this.m = rVar;
            this.n = i;
            this.o = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            b.a(this.h, this.i, this.j, this.k, this.l, this.m, iVar, com.amazon.aps.iva.ff0.b.I(this.n | 1), this.o);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x024d A[LOOP:2: B:134:0x024b->B:135:0x024d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0127 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0157 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S> void a(com.amazon.aps.iva.z.a1<S> r20, com.amazon.aps.iva.a1.f r21, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<S>, com.amazon.aps.iva.y.e0> r22, com.amazon.aps.iva.a1.a r23, com.amazon.aps.iva.xb0.l<? super S, ? extends java.lang.Object> r24, com.amazon.aps.iva.xb0.r<? super com.amazon.aps.iva.y.o, ? super S, ? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r25, com.amazon.aps.iva.o0.i r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.y.b.a(com.amazon.aps.iva.z.a1, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.a1.a, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.xb0.r, com.amazon.aps.iva.o0.i, int, int):void");
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* compiled from: AnimatedContent.kt */
    /* renamed from: com.amazon.aps.iva.y.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0874b<S> extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<S, S> {
        public static final C0874b h = new C0874b();

        public C0874b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final S invoke(S s) {
            return s;
        }
    }
}
