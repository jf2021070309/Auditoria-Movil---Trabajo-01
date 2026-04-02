package androidx.compose.foundation.gestures;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.ui.focus.FocusTargetNode;
import com.amazon.aps.iva.a0.d0;
import com.amazon.aps.iva.a0.p1;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a1.h;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.b0.b0;
import com.amazon.aps.iva.b0.f0;
import com.amazon.aps.iva.b0.l0;
import com.amazon.aps.iva.b0.p0;
import com.amazon.aps.iva.b0.q0;
import com.amazon.aps.iva.b0.r0;
import com.amazon.aps.iva.b0.s0;
import com.amazon.aps.iva.b0.t0;
import com.amazon.aps.iva.b0.v0;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.n0;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.ob0.g;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.t1.i;
import com.amazon.aps.iva.v1.s1;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: Scrollable.kt */
/* loaded from: classes.dex */
public final class a {
    public static final c a = new c(null);
    public static final d b = new d();
    public static final i<Boolean> c = com.amazon.aps.iva.cq.b.a0(b.h);
    public static final C0012a d = new C0012a();

    /* compiled from: Scrollable.kt */
    /* renamed from: androidx.compose.foundation.gestures.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0012a implements h {
        @Override // com.amazon.aps.iva.ob0.g
        public final <R> R fold(R r, p<? super R, ? super g.b, ? extends R> pVar) {
            j.f(pVar, "operation");
            return pVar.invoke(r, this);
        }

        @Override // com.amazon.aps.iva.ob0.g
        public final <E extends g.b> E get(g.c<E> cVar) {
            j.f(cVar, "key");
            return (E) g.b.a.a(this, cVar);
        }

        @Override // com.amazon.aps.iva.ob0.g
        public final g minusKey(g.c<?> cVar) {
            j.f(cVar, "key");
            return g.b.a.b(this, cVar);
        }

        @Override // com.amazon.aps.iva.ob0.g
        public final g plus(g gVar) {
            j.f(gVar, "context");
            return g.a.a(this, gVar);
        }

        @Override // com.amazon.aps.iva.a1.h
        public final float t() {
            return 1.0f;
        }
    }

    /* compiled from: Scrollable.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public static final b h = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: Scrollable.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.ScrollableKt$NoOpOnDragStarted$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements q<g0, com.amazon.aps.iva.e1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.e1.c cVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            long j = cVar.a;
            return new c(dVar).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            x.i0(obj);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Scrollable.kt */
    /* loaded from: classes.dex */
    public static final class e extends l implements q<f, com.amazon.aps.iva.o0.i, Integer, f> {
        public final /* synthetic */ f0 h;
        public final /* synthetic */ t0 i;
        public final /* synthetic */ boolean j;
        public final /* synthetic */ com.amazon.aps.iva.c0.l k;
        public final /* synthetic */ b0 l;
        public final /* synthetic */ p1 m;
        public final /* synthetic */ boolean n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(p1 p1Var, b0 b0Var, f0 f0Var, t0 t0Var, com.amazon.aps.iva.c0.l lVar, boolean z, boolean z2) {
            super(3);
            this.h = f0Var;
            this.i = t0Var;
            this.j = z;
            this.k = lVar;
            this.l = b0Var;
            this.m = p1Var;
            this.n = z2;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final f invoke(f fVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
            f fVar2;
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            t1.c(num, fVar, "$this$composed", iVar2, -629830927);
            e0.b bVar = e0.a;
            iVar2.s(773894976);
            iVar2.s(-492369756);
            Object t = iVar2.t();
            i.a.C0550a c0550a = i.a.a;
            if (t == c0550a) {
                n0 n0Var = new n0(x0.g(iVar2));
                iVar2.n(n0Var);
                t = n0Var;
            }
            iVar2.G();
            g0 g0Var = ((n0) t).b;
            iVar2.G();
            boolean z = this.j;
            Boolean valueOf = Boolean.valueOf(z);
            f0 f0Var = this.h;
            t0 t0Var = this.i;
            Object[] objArr = {g0Var, f0Var, t0Var, valueOf};
            iVar2.s(-568225417);
            boolean z2 = false;
            for (int i = 0; i < 4; i++) {
                z2 |= iVar2.H(objArr[i]);
            }
            Object t2 = iVar2.t();
            if (z2 || t2 == c0550a) {
                t2 = new com.amazon.aps.iva.b0.c(g0Var, f0Var, t0Var, z);
                iVar2.n(t2);
            }
            iVar2.G();
            f.a aVar = f.a.c;
            s1 s1Var = FocusableKt.a;
            aVar.o(s1Var);
            f a = androidx.compose.ui.focus.b.a(s1Var, d0.h);
            j.f(a, "<this>");
            f o = a.o(FocusTargetNode.FocusTargetElement.c).o(((com.amazon.aps.iva.b0.c) t2).o);
            com.amazon.aps.iva.c0.l lVar = this.k;
            f0 f0Var2 = this.h;
            boolean z3 = this.j;
            t0 t0Var2 = this.i;
            p1 p1Var = this.m;
            boolean z4 = this.n;
            iVar2.s(-2012025036);
            e0.b bVar2 = e0.a;
            iVar2.s(-1730185954);
            b0 b0Var = this.l;
            if (b0Var == null) {
                b0Var = com.amazon.aps.iva.aq.j.p(iVar2);
            }
            b0 b0Var2 = b0Var;
            iVar2.G();
            iVar2.s(-492369756);
            Object t3 = iVar2.t();
            if (t3 == c0550a) {
                t3 = com.amazon.aps.iva.cq.b.c0(new com.amazon.aps.iva.o1.b());
                iVar2.n(t3);
            }
            iVar2.G();
            q1 q1Var = (q1) t3;
            q1 h0 = com.amazon.aps.iva.cq.b.h0(new v0(f0Var2, z3, q1Var, t0Var2, b0Var2, p1Var), iVar2);
            Boolean valueOf2 = Boolean.valueOf(z4);
            iVar2.s(1157296644);
            boolean H = iVar2.H(valueOf2);
            Object t4 = iVar2.t();
            if (H || t4 == c0550a) {
                t4 = new s0(h0, z4);
                iVar2.n(t4);
            }
            iVar2.G();
            com.amazon.aps.iva.o1.a aVar2 = (com.amazon.aps.iva.o1.a) t4;
            iVar2.s(-492369756);
            Object t5 = iVar2.t();
            if (t5 == c0550a) {
                t5 = new l0(h0);
                iVar2.n(t5);
            }
            iVar2.G();
            l0 l0Var = (l0) t5;
            iVar2.s(-1485272842);
            iVar2.G();
            c cVar = a.a;
            p0 p0Var = p0.h;
            iVar2.s(1157296644);
            boolean H2 = iVar2.H(h0);
            Object t6 = iVar2.t();
            if (H2 || t6 == c0550a) {
                t6 = new q0(h0);
                iVar2.n(t6);
            }
            iVar2.G();
            com.amazon.aps.iva.xb0.a aVar3 = (com.amazon.aps.iva.xb0.a) t6;
            iVar2.s(511388516);
            boolean H3 = iVar2.H(q1Var) | iVar2.H(h0);
            Object t7 = iVar2.t();
            if (H3 || t7 == c0550a) {
                t7 = new r0(q1Var, h0, null);
                iVar2.n(t7);
            }
            iVar2.G();
            f a2 = androidx.compose.ui.input.nestedscroll.a.a(o.o(new DraggableElement(l0Var, p0Var, f0Var2, z4, lVar, aVar3, cVar, (q) t7, false)).o(new MouseWheelScrollElement(h0)), aVar2, (com.amazon.aps.iva.o1.b) q1Var.getValue());
            iVar2.G();
            if (this.n) {
                fVar2 = com.amazon.aps.iva.b0.d0.c;
            } else {
                fVar2 = aVar;
            }
            f o2 = a2.o(fVar2);
            iVar2.G();
            return o2;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.amazon.aps.iva.p1.c r5, com.amazon.aps.iva.ob0.d r6) {
        /*
            boolean r0 = r6 instanceof com.amazon.aps.iva.b0.o0
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.b0.o0 r0 = (com.amazon.aps.iva.b0.o0) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.b0.o0 r0 = new com.amazon.aps.iva.b0.o0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.p1.c r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            com.amazon.aps.iva.ab.x.i0(r6)
        L34:
            r0.h = r5
            r0.j = r3
            java.lang.Object r6 = com.amazon.aps.iva.p1.c.h1(r5, r0)
            if (r6 != r1) goto L3f
            goto L4c
        L3f:
            com.amazon.aps.iva.p1.m r6 = (com.amazon.aps.iva.p1.m) r6
            int r2 = r6.c
            r4 = 6
            if (r2 != r4) goto L48
            r2 = r3
            goto L49
        L48:
            r2 = 0
        L49:
            if (r2 == 0) goto L34
            r1 = r6
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.a.a(com.amazon.aps.iva.p1.c, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public static final f b(f fVar, t0 t0Var, f0 f0Var, p1 p1Var, boolean z, boolean z2, b0 b0Var, com.amazon.aps.iva.c0.l lVar) {
        j.f(fVar, "<this>");
        j.f(t0Var, "state");
        return com.amazon.aps.iva.a1.e.a(fVar, com.amazon.aps.iva.v1.t1.a, new e(p1Var, b0Var, f0Var, t0Var, lVar, z2, z));
    }

    /* compiled from: Scrollable.kt */
    /* loaded from: classes.dex */
    public static final class d implements com.amazon.aps.iva.b0.n0 {
        @Override // com.amazon.aps.iva.b0.n0
        public final float a(float f) {
            return f;
        }
    }
}
