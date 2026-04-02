package com.amazon.aps.iva.j0;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.j0.p2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.u1.e;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: CoreTextField.kt */
/* loaded from: classes.dex */
public final class k {

    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.c2.y, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.c2.y yVar) {
            com.amazon.aps.iva.yb0.j.f(yVar, "it");
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CoreTextField.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2", f = "CoreTextField.kt", l = {336}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ p2 i;
        public final /* synthetic */ p3<Boolean> j;
        public final /* synthetic */ com.amazon.aps.iva.i2.f0 k;
        public final /* synthetic */ com.amazon.aps.iva.i2.e0 l;
        public final /* synthetic */ com.amazon.aps.iva.i2.l m;
        public final /* synthetic */ com.amazon.aps.iva.i2.q n;

        /* compiled from: CoreTextField.kt */
        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
            public final /* synthetic */ p3<Boolean> h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p3<Boolean> p3Var) {
                super(0);
                this.h = p3Var;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final Boolean invoke() {
                return Boolean.valueOf(this.h.getValue().booleanValue());
            }
        }

        /* compiled from: CoreTextField.kt */
        /* renamed from: com.amazon.aps.iva.j0.k$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0392b implements com.amazon.aps.iva.ve0.g<Boolean> {
            public final /* synthetic */ p2 b;
            public final /* synthetic */ com.amazon.aps.iva.i2.f0 c;
            public final /* synthetic */ com.amazon.aps.iva.i2.e0 d;
            public final /* synthetic */ com.amazon.aps.iva.i2.l e;
            public final /* synthetic */ com.amazon.aps.iva.i2.q f;

            public C0392b(p2 p2Var, com.amazon.aps.iva.i2.l lVar, com.amazon.aps.iva.i2.q qVar, com.amazon.aps.iva.i2.e0 e0Var, com.amazon.aps.iva.i2.f0 f0Var) {
                this.b = p2Var;
                this.c = f0Var;
                this.d = e0Var;
                this.e = lVar;
                this.f = qVar;
            }

            @Override // com.amazon.aps.iva.ve0.g
            public final Object a(Boolean bool, com.amazon.aps.iva.ob0.d dVar) {
                boolean booleanValue = bool.booleanValue();
                p2 p2Var = this.b;
                if (booleanValue && p2Var.b()) {
                    k.f(p2Var, this.e, this.f, this.d, this.c);
                } else {
                    k.e(p2Var);
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p2 p2Var, p3<Boolean> p3Var, com.amazon.aps.iva.i2.f0 f0Var, com.amazon.aps.iva.i2.e0 e0Var, com.amazon.aps.iva.i2.l lVar, com.amazon.aps.iva.i2.q qVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.i = p2Var;
            this.j = p3Var;
            this.k = f0Var;
            this.l = e0Var;
            this.m = lVar;
            this.n = qVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.i, this.j, this.k, this.l, this.m, this.n, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            p2 p2Var = this.i;
            try {
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    com.amazon.aps.iva.ve0.j0 m0 = com.amazon.aps.iva.cq.b.m0(new a(this.j));
                    p2 p2Var2 = this.i;
                    com.amazon.aps.iva.i2.f0 f0Var = this.k;
                    C0392b c0392b = new C0392b(p2Var2, this.m, this.n, this.l, f0Var);
                    this.h = 1;
                    if (m0.c(c0392b, this) == aVar) {
                        return aVar;
                    }
                }
                k.e(p2Var);
                return com.amazon.aps.iva.kb0.q.a;
            } catch (Throwable th) {
                k.e(p2Var);
                throw th;
            }
        }
    }

    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o0.v0, com.amazon.aps.iva.o0.u0> {
        public final /* synthetic */ com.amazon.aps.iva.l0.c0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.l0.c0 c0Var) {
            super(1);
            this.h = c0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.o0.u0 invoke(com.amazon.aps.iva.o0.v0 v0Var) {
            com.amazon.aps.iva.yb0.j.f(v0Var, "$this$DisposableEffect");
            return new com.amazon.aps.iva.j0.l(this.h);
        }
    }

    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o0.v0, com.amazon.aps.iva.o0.u0> {
        public final /* synthetic */ com.amazon.aps.iva.i2.f0 h;
        public final /* synthetic */ p2 i;
        public final /* synthetic */ com.amazon.aps.iva.i2.e0 j;
        public final /* synthetic */ com.amazon.aps.iva.i2.l k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.amazon.aps.iva.i2.f0 f0Var, p2 p2Var, com.amazon.aps.iva.i2.e0 e0Var, com.amazon.aps.iva.i2.l lVar) {
            super(1);
            this.h = f0Var;
            this.i = p2Var;
            this.j = e0Var;
            this.k = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [com.amazon.aps.iva.i2.n0, T, java.lang.Object] */
        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.o0.u0 invoke(com.amazon.aps.iva.o0.v0 v0Var) {
            com.amazon.aps.iva.yb0.j.f(v0Var, "$this$DisposableEffect");
            com.amazon.aps.iva.i2.f0 f0Var = this.h;
            if (f0Var != null) {
                p2 p2Var = this.i;
                if (p2Var.b()) {
                    com.amazon.aps.iva.i2.e0 e0Var = this.j;
                    com.amazon.aps.iva.yb0.j.f(e0Var, "value");
                    com.amazon.aps.iva.i2.h hVar = p2Var.c;
                    com.amazon.aps.iva.yb0.j.f(hVar, "editProcessor");
                    com.amazon.aps.iva.i2.l lVar = this.k;
                    com.amazon.aps.iva.yb0.j.f(lVar, "imeOptions");
                    p2.b bVar = p2Var.r;
                    com.amazon.aps.iva.yb0.j.f(bVar, "onValueChange");
                    p2.a aVar = p2Var.s;
                    com.amazon.aps.iva.yb0.j.f(aVar, "onImeActionPerformed");
                    com.amazon.aps.iva.yb0.d0 d0Var = new com.amazon.aps.iva.yb0.d0();
                    l1 l1Var = new l1(hVar, bVar, d0Var);
                    com.amazon.aps.iva.i2.z zVar = f0Var.a;
                    zVar.d(e0Var, lVar, l1Var, aVar);
                    ?? n0Var = new com.amazon.aps.iva.i2.n0(f0Var, zVar);
                    f0Var.b.set(n0Var);
                    d0Var.b = n0Var;
                    p2Var.d = n0Var;
                }
            }
            return new com.amazon.aps.iva.j0.m();
        }
    }

    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.o2.c A;
        public final /* synthetic */ com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q>, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> h;
        public final /* synthetic */ int i;
        public final /* synthetic */ p2 j;
        public final /* synthetic */ com.amazon.aps.iva.c2.a0 k;
        public final /* synthetic */ int l;
        public final /* synthetic */ int m;
        public final /* synthetic */ k2 n;
        public final /* synthetic */ com.amazon.aps.iva.i2.e0 o;
        public final /* synthetic */ com.amazon.aps.iva.i2.p0 p;
        public final /* synthetic */ com.amazon.aps.iva.a1.f q;
        public final /* synthetic */ com.amazon.aps.iva.a1.f r;
        public final /* synthetic */ com.amazon.aps.iva.a1.f s;
        public final /* synthetic */ com.amazon.aps.iva.a1.f t;
        public final /* synthetic */ com.amazon.aps.iva.g0.d u;
        public final /* synthetic */ com.amazon.aps.iva.l0.c0 v;
        public final /* synthetic */ boolean w;
        public final /* synthetic */ boolean x;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.c2.y, com.amazon.aps.iva.kb0.q> y;
        public final /* synthetic */ com.amazon.aps.iva.i2.q z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q>, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> qVar, int i, p2 p2Var, com.amazon.aps.iva.c2.a0 a0Var, int i2, int i3, k2 k2Var, com.amazon.aps.iva.i2.e0 e0Var, com.amazon.aps.iva.i2.p0 p0Var, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.a1.f fVar2, com.amazon.aps.iva.a1.f fVar3, com.amazon.aps.iva.a1.f fVar4, com.amazon.aps.iva.g0.d dVar, com.amazon.aps.iva.l0.c0 c0Var, boolean z, boolean z2, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.c2.y, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.i2.q qVar2, com.amazon.aps.iva.o2.c cVar) {
            super(2);
            this.h = qVar;
            this.i = i;
            this.j = p2Var;
            this.k = a0Var;
            this.l = i2;
            this.m = i3;
            this.n = k2Var;
            this.o = e0Var;
            this.p = p0Var;
            this.q = fVar;
            this.r = fVar2;
            this.s = fVar3;
            this.t = fVar4;
            this.u = dVar;
            this.v = c0Var;
            this.w = z;
            this.x = z2;
            this.y = lVar;
            this.z = qVar2;
            this.A = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = com.amazon.aps.iva.o0.e0.a;
                this.h.invoke(com.amazon.aps.iva.v0.b.b(iVar2, 2032502107, new com.amazon.aps.iva.j0.q(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A)), iVar2, Integer.valueOf(((this.i >> 12) & 112) | 6));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.i2.e0 h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.i2.e0, com.amazon.aps.iva.kb0.q> i;
        public final /* synthetic */ com.amazon.aps.iva.a1.f j;
        public final /* synthetic */ com.amazon.aps.iva.c2.a0 k;
        public final /* synthetic */ com.amazon.aps.iva.i2.p0 l;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.c2.y, com.amazon.aps.iva.kb0.q> m;
        public final /* synthetic */ com.amazon.aps.iva.c0.l n;
        public final /* synthetic */ com.amazon.aps.iva.f1.s o;
        public final /* synthetic */ boolean p;
        public final /* synthetic */ int q;
        public final /* synthetic */ int r;
        public final /* synthetic */ com.amazon.aps.iva.i2.l s;
        public final /* synthetic */ t0 t;
        public final /* synthetic */ boolean u;
        public final /* synthetic */ boolean v;
        public final /* synthetic */ com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q>, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> w;
        public final /* synthetic */ int x;
        public final /* synthetic */ int y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(com.amazon.aps.iva.i2.e0 e0Var, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.i2.e0, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.c2.a0 a0Var, com.amazon.aps.iva.i2.p0 p0Var, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.c2.y, com.amazon.aps.iva.kb0.q> lVar2, com.amazon.aps.iva.c0.l lVar3, com.amazon.aps.iva.f1.s sVar, boolean z, int i, int i2, com.amazon.aps.iva.i2.l lVar4, t0 t0Var, boolean z2, boolean z3, com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q>, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> qVar, int i3, int i4, int i5) {
            super(2);
            this.h = e0Var;
            this.i = lVar;
            this.j = fVar;
            this.k = a0Var;
            this.l = p0Var;
            this.m = lVar2;
            this.n = lVar3;
            this.o = sVar;
            this.p = z;
            this.q = i;
            this.r = i2;
            this.s = lVar4;
            this.t = t0Var;
            this.u = z2;
            this.v = z3;
            this.w = qVar;
            this.x = i3;
            this.y = i4;
            this.z = i5;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            k.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, iVar, com.amazon.aps.iva.ff0.b.I(this.x | 1), com.amazon.aps.iva.ff0.b.I(this.y), this.z);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.s1.q, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ p2 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(p2 p2Var) {
            super(1);
            this.h = p2Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.s1.q qVar) {
            com.amazon.aps.iva.s1.q qVar2 = qVar;
            com.amazon.aps.iva.yb0.j.f(qVar2, "it");
            q2 c = this.h.c();
            if (c != null) {
                c.c = qVar2;
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.h1.e, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ p2 h;
        public final /* synthetic */ com.amazon.aps.iva.i2.e0 i;
        public final /* synthetic */ com.amazon.aps.iva.i2.q j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(p2 p2Var, com.amazon.aps.iva.i2.e0 e0Var, com.amazon.aps.iva.i2.q qVar) {
            super(1);
            this.h = p2Var;
            this.i = e0Var;
            this.j = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0164 A[DONT_GENERATE] */
        @Override // com.amazon.aps.iva.xb0.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.h1.e r15) {
            /*
                Method dump skipped, instructions count: 370
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.j0.k.h.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.d1.w, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ p2 h;
        public final /* synthetic */ com.amazon.aps.iva.i2.f0 i;
        public final /* synthetic */ boolean j;
        public final /* synthetic */ boolean k;
        public final /* synthetic */ com.amazon.aps.iva.i2.e0 l;
        public final /* synthetic */ com.amazon.aps.iva.i2.l m;
        public final /* synthetic */ com.amazon.aps.iva.i2.q n;
        public final /* synthetic */ com.amazon.aps.iva.l0.c0 o;
        public final /* synthetic */ com.amazon.aps.iva.se0.g0 p;
        public final /* synthetic */ com.amazon.aps.iva.g0.d q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(p2 p2Var, com.amazon.aps.iva.i2.f0 f0Var, boolean z, boolean z2, com.amazon.aps.iva.i2.e0 e0Var, com.amazon.aps.iva.i2.l lVar, com.amazon.aps.iva.i2.q qVar, com.amazon.aps.iva.l0.c0 c0Var, com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.g0.d dVar) {
            super(1);
            this.h = p2Var;
            this.i = f0Var;
            this.j = z;
            this.k = z2;
            this.l = e0Var;
            this.m = lVar;
            this.n = qVar;
            this.o = c0Var;
            this.p = g0Var;
            this.q = dVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.d1.w wVar) {
            q2 c;
            com.amazon.aps.iva.d1.w wVar2 = wVar;
            com.amazon.aps.iva.yb0.j.f(wVar2, "it");
            p2 p2Var = this.h;
            if (p2Var.b() != wVar2.isFocused()) {
                p2Var.e.setValue(Boolean.valueOf(wVar2.isFocused()));
                com.amazon.aps.iva.i2.f0 f0Var = this.i;
                if (f0Var != null) {
                    if (p2Var.b() && this.j && !this.k) {
                        k.f(p2Var, this.m, this.n, this.l, f0Var);
                    } else {
                        k.e(p2Var);
                    }
                    if (wVar2.isFocused() && (c = p2Var.c()) != null) {
                        com.amazon.aps.iva.se0.i.d(this.p, null, null, new r(this.q, this.l, this.h, c, this.n, null), 3);
                    }
                }
                if (!wVar2.isFocused()) {
                    this.o.g(null);
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.s1.q, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ p2 h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ com.amazon.aps.iva.l0.c0 j;
        public final /* synthetic */ com.amazon.aps.iva.i2.e0 k;
        public final /* synthetic */ com.amazon.aps.iva.i2.q l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(p2 p2Var, com.amazon.aps.iva.l0.c0 c0Var, com.amazon.aps.iva.i2.q qVar, com.amazon.aps.iva.i2.e0 e0Var, boolean z) {
            super(1);
            this.h = p2Var;
            this.i = z;
            this.j = c0Var;
            this.k = e0Var;
            this.l = qVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.s1.q qVar) {
            com.amazon.aps.iva.s1.q qVar2 = qVar;
            com.amazon.aps.iva.yb0.j.f(qVar2, "it");
            p2 p2Var = this.h;
            p2Var.g = qVar2;
            if (this.i) {
                i0 a = p2Var.a();
                i0 i0Var = i0.Selection;
                com.amazon.aps.iva.l0.c0 c0Var = this.j;
                if (a == i0Var) {
                    if (p2Var.k) {
                        c0Var.n();
                    } else {
                        c0Var.k();
                    }
                    p2Var.l.setValue(Boolean.valueOf(com.amazon.aps.iva.l0.d0.b(c0Var, true)));
                    p2Var.m.setValue(Boolean.valueOf(com.amazon.aps.iva.l0.d0.b(c0Var, false)));
                } else if (p2Var.a() == i0.Cursor) {
                    p2Var.n.setValue(Boolean.valueOf(com.amazon.aps.iva.l0.d0.b(c0Var, true)));
                }
                k.g(p2Var, this.k, this.l);
            }
            q2 c = p2Var.c();
            if (c != null) {
                c.b = qVar2;
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CoreTextField.kt */
    /* renamed from: com.amazon.aps.iva.j0.k$k  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0393k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ p2 h;
        public final /* synthetic */ com.amazon.aps.iva.d1.r i;
        public final /* synthetic */ boolean j;
        public final /* synthetic */ com.amazon.aps.iva.l0.c0 k;
        public final /* synthetic */ com.amazon.aps.iva.i2.q l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0393k(p2 p2Var, com.amazon.aps.iva.d1.r rVar, boolean z, com.amazon.aps.iva.l0.c0 c0Var, com.amazon.aps.iva.i2.q qVar) {
            super(1);
            this.h = p2Var;
            this.i = rVar;
            this.j = z;
            this.k = c0Var;
            this.l = qVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.e1.c cVar) {
            com.amazon.aps.iva.i2.n0 n0Var;
            long j = cVar.a;
            boolean z = true;
            boolean z2 = !this.j;
            p2 p2Var = this.h;
            if (!p2Var.b()) {
                this.i.a();
            } else if (z2 && (n0Var = p2Var.d) != null && n0Var.a()) {
                n0Var.b.e();
            }
            if (p2Var.b()) {
                if (p2Var.a() != i0.Selection) {
                    q2 c = p2Var.c();
                    if (c != null) {
                        com.amazon.aps.iva.i2.h hVar = p2Var.c;
                        com.amazon.aps.iva.yb0.j.f(hVar, "editProcessor");
                        com.amazon.aps.iva.i2.q qVar = this.l;
                        com.amazon.aps.iva.yb0.j.f(qVar, "offsetMapping");
                        p2.b bVar = p2Var.r;
                        com.amazon.aps.iva.yb0.j.f(bVar, "onValueChange");
                        int a = qVar.a(c.b(j, true));
                        bVar.invoke(com.amazon.aps.iva.i2.e0.a(hVar.a, null, com.amazon.aps.iva.ab.x.f(a, a), 5));
                        if (p2Var.a.a.length() <= 0) {
                            z = false;
                        }
                        if (z) {
                            i0 i0Var = i0.Cursor;
                            com.amazon.aps.iva.yb0.j.f(i0Var, "<set-?>");
                            p2Var.j.setValue(i0Var);
                        }
                    }
                } else {
                    this.k.g(new com.amazon.aps.iva.e1.c(j));
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<k2> {
        public final /* synthetic */ com.amazon.aps.iva.b0.f0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(com.amazon.aps.iva.b0.f0 f0Var) {
            super(0);
            this.h = f0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final k2 invoke() {
            return new k2(this.h, 0.0f);
        }
    }

    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.a2.c0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.i2.l h;
        public final /* synthetic */ com.amazon.aps.iva.i2.o0 i;
        public final /* synthetic */ com.amazon.aps.iva.i2.e0 j;
        public final /* synthetic */ boolean k;
        public final /* synthetic */ boolean l;
        public final /* synthetic */ boolean m;
        public final /* synthetic */ p2 n;
        public final /* synthetic */ com.amazon.aps.iva.i2.q o;
        public final /* synthetic */ com.amazon.aps.iva.l0.c0 p;
        public final /* synthetic */ com.amazon.aps.iva.d1.r q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(com.amazon.aps.iva.i2.l lVar, com.amazon.aps.iva.i2.o0 o0Var, com.amazon.aps.iva.i2.e0 e0Var, boolean z, boolean z2, boolean z3, p2 p2Var, com.amazon.aps.iva.i2.q qVar, com.amazon.aps.iva.l0.c0 c0Var, com.amazon.aps.iva.d1.r rVar) {
            super(1);
            this.h = lVar;
            this.i = o0Var;
            this.j = e0Var;
            this.k = z;
            this.l = z2;
            this.m = z3;
            this.n = p2Var;
            this.o = qVar;
            this.p = c0Var;
            this.q = rVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.a2.c0 c0Var) {
            com.amazon.aps.iva.a2.c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            com.amazon.aps.iva.i2.l lVar = this.h;
            int i = lVar.e;
            com.amazon.aps.iva.fc0.l<Object>[] lVarArr = com.amazon.aps.iva.a2.y.a;
            com.amazon.aps.iva.a2.b0<com.amazon.aps.iva.i2.k> b0Var = com.amazon.aps.iva.a2.v.x;
            com.amazon.aps.iva.fc0.l<?>[] lVarArr2 = com.amazon.aps.iva.a2.y.a;
            b0Var.a(c0Var2, lVarArr2[14], new com.amazon.aps.iva.i2.k(i));
            com.amazon.aps.iva.c2.b bVar = this.i.a;
            com.amazon.aps.iva.yb0.j.f(bVar, "<set-?>");
            com.amazon.aps.iva.a2.v.v.a(c0Var2, lVarArr2[12], bVar);
            com.amazon.aps.iva.i2.e0 e0Var = this.j;
            com.amazon.aps.iva.a2.v.w.a(c0Var2, lVarArr2[13], new com.amazon.aps.iva.c2.z(e0Var.b));
            boolean z = this.k;
            if (!z) {
                c0Var2.b(com.amazon.aps.iva.a2.v.i, com.amazon.aps.iva.kb0.q.a);
            }
            boolean z2 = this.l;
            if (z2) {
                c0Var2.b(com.amazon.aps.iva.a2.v.A, com.amazon.aps.iva.kb0.q.a);
            }
            p2 p2Var = this.n;
            com.amazon.aps.iva.a2.y.a(c0Var2, new t(p2Var));
            boolean z3 = this.m;
            c0Var2.b(com.amazon.aps.iva.a2.k.h, new com.amazon.aps.iva.a2.a(null, new u(z3, z, p2Var, c0Var2)));
            c0Var2.b(com.amazon.aps.iva.a2.k.i, new com.amazon.aps.iva.a2.a(null, new v(this.m, this.k, this.n, c0Var2, this.j)));
            com.amazon.aps.iva.i2.q qVar = this.o;
            boolean z4 = this.k;
            com.amazon.aps.iva.i2.e0 e0Var2 = this.j;
            c0Var2.b(com.amazon.aps.iva.a2.k.g, new com.amazon.aps.iva.a2.a(null, new w(this.n, this.p, qVar, e0Var2, z4)));
            c0Var2.b(com.amazon.aps.iva.a2.k.j, new com.amazon.aps.iva.a2.a(null, new x(p2Var, lVar)));
            com.amazon.aps.iva.a2.y.b(c0Var2, null, new y(p2Var, this.q, z3));
            com.amazon.aps.iva.l0.c0 c0Var3 = this.p;
            c0Var2.b(com.amazon.aps.iva.a2.k.c, new com.amazon.aps.iva.a2.a(null, new z(c0Var3)));
            if (!com.amazon.aps.iva.c2.z.b(e0Var.b) && !z2) {
                c0Var2.b(com.amazon.aps.iva.a2.k.k, new com.amazon.aps.iva.a2.a(null, new a0(c0Var3)));
                if (z && !z3) {
                    c0Var2.b(com.amazon.aps.iva.a2.k.l, new com.amazon.aps.iva.a2.a(null, new b0(c0Var3)));
                }
            }
            if (z && !z3) {
                c0Var2.b(com.amazon.aps.iva.a2.k.m, new com.amazon.aps.iva.a2.a(null, new s(c0Var3)));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.a1.f h;
        public final /* synthetic */ com.amazon.aps.iva.l0.c0 i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.l0.c0 c0Var, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, int i) {
            super(2);
            this.h = fVar;
            this.i = c0Var;
            this.j = pVar;
            this.k = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.k | 1);
            com.amazon.aps.iva.l0.c0 c0Var = this.i;
            com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> pVar = this.j;
            k.b(this.h, c0Var, pVar, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CoreTextField.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1", f = "CoreTextField.kt", l = {1099}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class o extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.f0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ g1 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(g1 g1Var, com.amazon.aps.iva.ob0.d<? super o> dVar) {
            super(2, dVar);
            this.j = g1Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            o oVar = new o(this.j, dVar);
            oVar.i = obj;
            return oVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.p1.f0 f0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((o) create(f0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                this.h = 1;
                Object p = com.amazon.aps.iva.e.z.p(new v0((com.amazon.aps.iva.p1.f0) this.i, this.j, null), this);
                if (p != obj2) {
                    p = com.amazon.aps.iva.kb0.q.a;
                }
                if (p == obj2) {
                    return obj2;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.a2.c0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ long h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(long j) {
            super(1);
            this.h = j;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.a2.c0 c0Var) {
            com.amazon.aps.iva.a2.c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            c0Var2.b(com.amazon.aps.iva.l0.o.c, new com.amazon.aps.iva.l0.n(h0.Cursor, this.h));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.l0.c0 h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(com.amazon.aps.iva.l0.c0 c0Var, int i) {
            super(2);
            this.h = c0Var;
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            k.c(this.h, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:279:0x051f, code lost:
        if (r0.h == r14) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0616, code lost:
        if (r2 > ((r5 != null ? r5.longValue() : 0) + 5000)) goto L213;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x036f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x039d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x07d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0137  */
    /* JADX WARN: Type inference failed for: r0v33, types: [com.amazon.aps.iva.a1.f] */
    /* JADX WARN: Type inference failed for: r2v54, types: [com.amazon.aps.iva.a1.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.amazon.aps.iva.i2.e0 r59, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.i2.e0, com.amazon.aps.iva.kb0.q> r60, com.amazon.aps.iva.a1.f r61, com.amazon.aps.iva.c2.a0 r62, com.amazon.aps.iva.i2.p0 r63, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.c2.y, com.amazon.aps.iva.kb0.q> r64, com.amazon.aps.iva.c0.l r65, com.amazon.aps.iva.f1.s r66, boolean r67, int r68, int r69, com.amazon.aps.iva.i2.l r70, com.amazon.aps.iva.j0.t0 r71, boolean r72, boolean r73, com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q>, ? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r74, com.amazon.aps.iva.o0.i r75, int r76, int r77, int r78) {
        /*
            Method dump skipped, instructions count: 2433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.j0.k.a(com.amazon.aps.iva.i2.e0, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.c2.a0, com.amazon.aps.iva.i2.p0, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.c0.l, com.amazon.aps.iva.f1.s, boolean, int, int, com.amazon.aps.iva.i2.l, com.amazon.aps.iva.j0.t0, boolean, boolean, com.amazon.aps.iva.xb0.q, com.amazon.aps.iva.o0.i, int, int, int):void");
    }

    public static final void b(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.l0.c0 c0Var, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, com.amazon.aps.iva.o0.i iVar, int i2) {
        com.amazon.aps.iva.o0.j g2 = iVar.g(-20551815);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        g2.s(733328855);
        com.amazon.aps.iva.s1.d0 c2 = com.amazon.aps.iva.d0.f.c(a.C0097a.a, true, g2);
        g2.s(-1323940314);
        int S = com.amazon.aps.iva.cq.b.S(g2);
        com.amazon.aps.iva.o0.c2 P = g2.P();
        com.amazon.aps.iva.u1.e.o0.getClass();
        e.a aVar = e.a.b;
        com.amazon.aps.iva.v0.a a2 = com.amazon.aps.iva.s1.u.a(fVar);
        int i3 = ((((((i2 & 14) | 384) << 3) & 112) << 9) & 7168) | 6;
        if (g2.a instanceof com.amazon.aps.iva.o0.d) {
            g2.z();
            if (g2.M) {
                g2.w(aVar);
            } else {
                g2.m();
            }
            com.amazon.aps.iva.cq.b.k0(g2, c2, e.a.e);
            com.amazon.aps.iva.cq.b.k0(g2, P, e.a.d);
            e.a.C0752a c0752a = e.a.f;
            if (g2.M || !com.amazon.aps.iva.yb0.j.a(g2.e0(), Integer.valueOf(S))) {
                defpackage.a.c(S, g2, S, c0752a);
            }
            defpackage.b.d((i3 >> 3) & 112, a2, new x2(g2), g2, 2058660585);
            g2.s(-1985516685);
            pVar.invoke(g2, Integer.valueOf(((((i2 >> 3) & 112) | 8) >> 3) & 14));
            g2.U(false);
            g2.U(false);
            g2.U(true);
            g2.U(false);
            g2.U(false);
            com.amazon.aps.iva.o0.j2 X = g2.X();
            if (X != null) {
                X.d = new n(fVar, c0Var, pVar, i2);
                return;
            }
            return;
        }
        com.amazon.aps.iva.cq.b.W();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (((java.lang.Boolean) r0.n.getValue()).booleanValue() == true) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.amazon.aps.iva.l0.c0 r9, com.amazon.aps.iva.o0.i r10, int r11) {
        /*
            java.lang.String r0 = "manager"
            com.amazon.aps.iva.yb0.j.f(r9, r0)
            r0 = -1436003720(0xffffffffaa685278, float:-2.0634351E-13)
            com.amazon.aps.iva.o0.j r10 = r10.g(r0)
            com.amazon.aps.iva.o0.e0$b r0 = com.amazon.aps.iva.o0.e0.a
            com.amazon.aps.iva.j0.p2 r0 = r9.d
            r1 = 0
            if (r0 == 0) goto L23
            com.amazon.aps.iva.o0.y1 r0 = r0.n
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 != r2) goto L23
            goto L24
        L23:
            r2 = r1
        L24:
            if (r2 == 0) goto Ld1
            r0 = 1157296644(0x44faf204, float:2007.563)
            r10.s(r0)
            boolean r2 = r10.H(r9)
            java.lang.Object r3 = r10.e0()
            com.amazon.aps.iva.o0.i$a$a r4 = com.amazon.aps.iva.o0.i.a.a
            if (r2 != 0) goto L3a
            if (r3 != r4) goto L42
        L3a:
            com.amazon.aps.iva.l0.a0 r3 = new com.amazon.aps.iva.l0.a0
            r3.<init>(r9)
            r10.K0(r3)
        L42:
            r10.U(r1)
            com.amazon.aps.iva.j0.g1 r3 = (com.amazon.aps.iva.j0.g1) r3
            com.amazon.aps.iva.o0.q3 r2 = com.amazon.aps.iva.v1.d1.e
            java.lang.Object r2 = r10.i(r2)
            com.amazon.aps.iva.o2.c r2 = (com.amazon.aps.iva.o2.c) r2
            java.lang.String r5 = "density"
            com.amazon.aps.iva.yb0.j.f(r2, r5)
            com.amazon.aps.iva.i2.q r5 = r9.b
            com.amazon.aps.iva.i2.e0 r6 = r9.j()
            long r6 = r6.b
            int r8 = com.amazon.aps.iva.c2.z.c
            r8 = 32
            long r6 = r6 >> r8
            int r6 = (int) r6
            int r5 = r5.b(r6)
            com.amazon.aps.iva.j0.p2 r6 = r9.d
            r7 = 0
            if (r6 == 0) goto L70
            com.amazon.aps.iva.j0.q2 r6 = r6.c()
            goto L71
        L70:
            r6 = r7
        L71:
            com.amazon.aps.iva.yb0.j.c(r6)
            com.amazon.aps.iva.c2.y r6 = r6.a
            com.amazon.aps.iva.c2.x r8 = r6.a
            com.amazon.aps.iva.c2.b r8 = r8.a
            int r8 = r8.length()
            int r5 = com.amazon.aps.iva.aq.j.j(r5, r1, r8)
            com.amazon.aps.iva.e1.e r5 = r6.c(r5)
            float r6 = com.amazon.aps.iva.j0.k1.b
            float r2 = r2.P0(r6)
            r6 = 2
            float r6 = (float) r6
            float r2 = r2 / r6
            float r6 = r5.a
            float r2 = r2 + r6
            float r5 = r5.d
            long r5 = com.amazon.aps.iva.e1.d.d(r2, r5)
            com.amazon.aps.iva.a1.f$a r2 = com.amazon.aps.iva.a1.f.a.c
            com.amazon.aps.iva.j0.k$o r8 = new com.amazon.aps.iva.j0.k$o
            r8.<init>(r3, r7)
            com.amazon.aps.iva.a1.f r2 = com.amazon.aps.iva.p1.l0.a(r2, r3, r8)
            com.amazon.aps.iva.e1.c r3 = new com.amazon.aps.iva.e1.c
            r3.<init>(r5)
            r10.s(r0)
            boolean r0 = r10.H(r3)
            java.lang.Object r3 = r10.e0()
            if (r0 != 0) goto Lb7
            if (r3 != r4) goto Lbf
        Lb7:
            com.amazon.aps.iva.j0.k$p r3 = new com.amazon.aps.iva.j0.k$p
            r3.<init>(r5)
            r10.K0(r3)
        Lbf:
            r10.U(r1)
            com.amazon.aps.iva.xb0.l r3 = (com.amazon.aps.iva.xb0.l) r3
            com.amazon.aps.iva.a1.f r3 = com.amazon.aps.iva.a2.o.a(r2, r1, r3)
            r4 = 0
            r0 = 384(0x180, float:5.38E-43)
            r1 = r5
            r5 = r10
            r6 = r0
            com.amazon.aps.iva.j0.a.a(r1, r3, r4, r5, r6)
        Ld1:
            com.amazon.aps.iva.o0.j2 r10 = r10.X()
            if (r10 != 0) goto Ld8
            goto Ldf
        Ld8:
            com.amazon.aps.iva.j0.k$q r0 = new com.amazon.aps.iva.j0.k$q
            r0.<init>(r9, r11)
            r10.d = r0
        Ldf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.j0.k.c(com.amazon.aps.iva.l0.c0, com.amazon.aps.iva.o0.i, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
        if ((!r2) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(com.amazon.aps.iva.l0.c0 r7, boolean r8, com.amazon.aps.iva.o0.i r9, int r10) {
        /*
            r0 = 626339208(0x25552d88, float:1.8490232E-16)
            com.amazon.aps.iva.o0.j r9 = r9.g(r0)
            com.amazon.aps.iva.o0.e0$b r0 = com.amazon.aps.iva.o0.e0.a
            if (r8 == 0) goto Ld1
            com.amazon.aps.iva.j0.p2 r0 = r7.d
            r1 = 1
            if (r0 == 0) goto L26
            com.amazon.aps.iva.j0.q2 r0 = r0.c()
            if (r0 == 0) goto L26
            com.amazon.aps.iva.c2.y r0 = r0.a
            if (r0 == 0) goto L26
            com.amazon.aps.iva.j0.p2 r2 = r7.d
            if (r2 == 0) goto L21
            boolean r2 = r2.o
            goto L22
        L21:
            r2 = r1
        L22:
            r2 = r2 ^ r1
            if (r2 == 0) goto L26
            goto L27
        L26:
            r0 = 0
        L27:
            if (r0 != 0) goto L2b
            goto Ld4
        L2b:
            com.amazon.aps.iva.i2.e0 r2 = r7.j()
            long r2 = r2.b
            boolean r2 = com.amazon.aps.iva.c2.z.b(r2)
            r3 = 0
            if (r2 != 0) goto La4
            com.amazon.aps.iva.i2.q r2 = r7.b
            com.amazon.aps.iva.i2.e0 r4 = r7.j()
            long r4 = r4.b
            r6 = 32
            long r4 = r4 >> r6
            int r4 = (int) r4
            int r2 = r2.b(r4)
            com.amazon.aps.iva.i2.q r4 = r7.b
            com.amazon.aps.iva.i2.e0 r5 = r7.j()
            long r5 = r5.b
            int r5 = com.amazon.aps.iva.c2.z.c(r5)
            int r4 = r4.b(r5)
            com.amazon.aps.iva.n2.g r2 = r0.a(r2)
            int r4 = r4 - r1
            int r4 = java.lang.Math.max(r4, r3)
            com.amazon.aps.iva.n2.g r0 = r0.a(r4)
            r4 = -498388703(0xffffffffe24b3121, float:-9.370573E20)
            r9.s(r4)
            com.amazon.aps.iva.j0.p2 r4 = r7.d
            if (r4 == 0) goto L7f
            com.amazon.aps.iva.o0.y1 r4 = r4.l
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != r1) goto L7f
            r4 = r1
            goto L80
        L7f:
            r4 = r3
        L80:
            r5 = 518(0x206, float:7.26E-43)
            if (r4 == 0) goto L87
            com.amazon.aps.iva.l0.d0.a(r1, r2, r7, r9, r5)
        L87:
            r9.U(r3)
            com.amazon.aps.iva.j0.p2 r2 = r7.d
            if (r2 == 0) goto L9e
            com.amazon.aps.iva.o0.y1 r2 = r2.m
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != r1) goto L9e
            r2 = r1
            goto L9f
        L9e:
            r2 = r3
        L9f:
            if (r2 == 0) goto La4
            com.amazon.aps.iva.l0.d0.a(r3, r0, r7, r9, r5)
        La4:
            com.amazon.aps.iva.j0.p2 r0 = r7.d
            if (r0 == 0) goto Ld4
            com.amazon.aps.iva.i2.e0 r2 = r7.q
            com.amazon.aps.iva.c2.b r2 = r2.a
            java.lang.String r2 = r2.b
            com.amazon.aps.iva.i2.e0 r4 = r7.j()
            com.amazon.aps.iva.c2.b r4 = r4.a
            java.lang.String r4 = r4.b
            boolean r2 = com.amazon.aps.iva.yb0.j.a(r2, r4)
            r1 = r1 ^ r2
            if (r1 == 0) goto Lbf
            r0.k = r3
        Lbf:
            boolean r1 = r0.b()
            if (r1 == 0) goto Ld4
            boolean r0 = r0.k
            if (r0 == 0) goto Lcd
            r7.n()
            goto Ld4
        Lcd:
            r7.k()
            goto Ld4
        Ld1:
            r7.k()
        Ld4:
            com.amazon.aps.iva.o0.j2 r9 = r9.X()
            if (r9 != 0) goto Ldb
            goto Le2
        Ldb:
            com.amazon.aps.iva.j0.c0 r0 = new com.amazon.aps.iva.j0.c0
            r0.<init>(r7, r8, r10)
            r9.d = r0
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.j0.k.d(com.amazon.aps.iva.l0.c0, boolean, com.amazon.aps.iva.o0.i, int):void");
    }

    public static final void e(p2 p2Var) {
        boolean z;
        com.amazon.aps.iva.i2.n0 n0Var = p2Var.d;
        if (n0Var != null) {
            com.amazon.aps.iva.i2.h hVar = p2Var.c;
            com.amazon.aps.iva.yb0.j.f(hVar, "editProcessor");
            p2.b bVar = p2Var.r;
            com.amazon.aps.iva.yb0.j.f(bVar, "onValueChange");
            bVar.invoke(com.amazon.aps.iva.i2.e0.a(hVar.a, null, 0L, 3));
            com.amazon.aps.iva.i2.f0 f0Var = n0Var.a;
            f0Var.getClass();
            AtomicReference<com.amazon.aps.iva.i2.n0> atomicReference = f0Var.b;
            while (true) {
                if (atomicReference.compareAndSet(n0Var, null)) {
                    z = true;
                    break;
                } else if (atomicReference.get() != n0Var) {
                    z = false;
                    break;
                }
            }
            if (z) {
                f0Var.a.a();
            }
        }
        p2Var.d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.amazon.aps.iva.i2.n0, T, java.lang.Object] */
    public static final void f(p2 p2Var, com.amazon.aps.iva.i2.l lVar, com.amazon.aps.iva.i2.q qVar, com.amazon.aps.iva.i2.e0 e0Var, com.amazon.aps.iva.i2.f0 f0Var) {
        com.amazon.aps.iva.i2.h hVar = p2Var.c;
        com.amazon.aps.iva.yb0.j.f(f0Var, "textInputService");
        com.amazon.aps.iva.yb0.j.f(e0Var, "value");
        com.amazon.aps.iva.yb0.j.f(hVar, "editProcessor");
        com.amazon.aps.iva.yb0.j.f(lVar, "imeOptions");
        p2.b bVar = p2Var.r;
        com.amazon.aps.iva.yb0.j.f(bVar, "onValueChange");
        p2.a aVar = p2Var.s;
        com.amazon.aps.iva.yb0.j.f(aVar, "onImeActionPerformed");
        com.amazon.aps.iva.yb0.d0 d0Var = new com.amazon.aps.iva.yb0.d0();
        l1 l1Var = new l1(hVar, bVar, d0Var);
        com.amazon.aps.iva.i2.z zVar = f0Var.a;
        zVar.d(e0Var, lVar, l1Var, aVar);
        ?? n0Var = new com.amazon.aps.iva.i2.n0(f0Var, zVar);
        f0Var.b.set(n0Var);
        d0Var.b = n0Var;
        p2Var.d = n0Var;
        g(p2Var, e0Var, qVar);
    }

    public static final void g(p2 p2Var, com.amazon.aps.iva.i2.e0 e0Var, com.amazon.aps.iva.i2.q qVar) {
        com.amazon.aps.iva.y0.h h2 = com.amazon.aps.iva.y0.m.h((com.amazon.aps.iva.y0.h) com.amazon.aps.iva.y0.m.b.a(), null, false);
        try {
            com.amazon.aps.iva.y0.h j2 = h2.j();
            q2 c2 = p2Var.c();
            if (c2 == null) {
                com.amazon.aps.iva.y0.h.p(j2);
                return;
            }
            com.amazon.aps.iva.i2.n0 n0Var = p2Var.d;
            if (n0Var == null) {
                com.amazon.aps.iva.y0.h.p(j2);
                return;
            }
            com.amazon.aps.iva.s1.q qVar2 = p2Var.g;
            if (qVar2 == null) {
                com.amazon.aps.iva.y0.h.p(j2);
                return;
            }
            m1.a(e0Var, p2Var.a, c2.a, qVar2, n0Var, p2Var.b(), qVar);
            com.amazon.aps.iva.kb0.q qVar3 = com.amazon.aps.iva.kb0.q.a;
            com.amazon.aps.iva.y0.h.p(j2);
        } finally {
            h2.c();
        }
    }
}
