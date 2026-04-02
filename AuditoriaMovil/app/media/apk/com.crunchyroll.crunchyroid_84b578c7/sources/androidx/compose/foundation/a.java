package androidx.compose.foundation;

import android.view.KeyEvent;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.c0.o;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.p1.m;
import com.amazon.aps.iva.p1.n;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.u1.g1;
import com.amazon.aps.iva.xb0.p;
import java.util.LinkedHashMap;
/* compiled from: Clickable.kt */
/* loaded from: classes.dex */
public abstract class a extends com.amazon.aps.iva.u1.j implements g1, com.amazon.aps.iva.n1.d {
    public com.amazon.aps.iva.c0.l q;
    public boolean r;
    public com.amazon.aps.iva.xb0.a<q> s;
    public final C0010a t;

    /* compiled from: Clickable.kt */
    /* renamed from: androidx.compose.foundation.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0010a {
        public o b;
        public final LinkedHashMap a = new LinkedHashMap();
        public long c = com.amazon.aps.iva.e1.c.b;
    }

    /* compiled from: Clickable.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", l = {718}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ o j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o oVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.j = oVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                com.amazon.aps.iva.c0.l lVar = a.this.q;
                this.h = 1;
                if (lVar.b(this.j, this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    /* compiled from: Clickable.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2$1", f = "Clickable.kt", l = {727}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ o j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(o oVar, com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(2, dVar);
            this.j = oVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new c(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((c) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                com.amazon.aps.iva.c0.l lVar = a.this.q;
                com.amazon.aps.iva.c0.p pVar = new com.amazon.aps.iva.c0.p(this.j);
                this.h = 1;
                if (lVar.b(pVar, this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    public a(com.amazon.aps.iva.c0.l lVar, boolean z, com.amazon.aps.iva.xb0.a aVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "interactionSource");
        com.amazon.aps.iva.yb0.j.f(aVar, "onClick");
        this.q = lVar;
        this.r = z;
        this.s = aVar;
        this.t = new C0010a();
    }

    @Override // com.amazon.aps.iva.u1.g1
    public final void C0(m mVar, n nVar, long j) {
        com.amazon.aps.iva.yb0.j.f(nVar, "pass");
        v1().C0(mVar, nVar, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // com.amazon.aps.iva.n1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D0(android.view.KeyEvent r13) {
        /*
            r12 = this;
            java.lang.String r0 = "event"
            com.amazon.aps.iva.yb0.j.f(r13, r0)
            boolean r0 = r12.r
            r1 = 3
            r2 = 160(0xa0, float:2.24E-43)
            r3 = 66
            r4 = 23
            r5 = 32
            r6 = 0
            androidx.compose.foundation.a$a r7 = r12.t
            r8 = 0
            r9 = 1
            if (r0 == 0) goto L6e
            int r0 = com.amazon.aps.iva.a0.w.b
            int r0 = com.amazon.aps.iva.n1.c.j(r13)
            r10 = 2
            if (r0 != r10) goto L22
            r0 = r9
            goto L23
        L22:
            r0 = r8
        L23:
            if (r0 == 0) goto L38
            long r10 = com.amazon.aps.iva.n1.c.i(r13)
            long r10 = r10 >> r5
            int r0 = (int) r10
            if (r0 == r4) goto L33
            if (r0 == r3) goto L33
            if (r0 == r2) goto L33
            r0 = r8
            goto L34
        L33:
            r0 = r9
        L34:
            if (r0 == 0) goto L38
            r0 = r9
            goto L39
        L38:
            r0 = r8
        L39:
            if (r0 == 0) goto L6e
            java.util.LinkedHashMap r0 = r7.a
            long r2 = com.amazon.aps.iva.n1.c.i(r13)
            com.amazon.aps.iva.n1.a r4 = new com.amazon.aps.iva.n1.a
            r4.<init>(r2)
            boolean r0 = r0.containsKey(r4)
            if (r0 != 0) goto Lba
            com.amazon.aps.iva.c0.o r0 = new com.amazon.aps.iva.c0.o
            long r2 = r7.c
            r0.<init>(r2)
            java.util.LinkedHashMap r2 = r7.a
            long r3 = com.amazon.aps.iva.n1.c.i(r13)
            com.amazon.aps.iva.n1.a r13 = new com.amazon.aps.iva.n1.a
            r13.<init>(r3)
            r2.put(r13, r0)
            com.amazon.aps.iva.se0.g0 r13 = r12.i1()
            androidx.compose.foundation.a$b r2 = new androidx.compose.foundation.a$b
            r2.<init>(r0, r6)
            com.amazon.aps.iva.se0.i.d(r13, r6, r6, r2, r1)
            goto Lb9
        L6e:
            boolean r0 = r12.r
            if (r0 == 0) goto Lba
            int r0 = com.amazon.aps.iva.a0.w.b
            int r0 = com.amazon.aps.iva.n1.c.j(r13)
            if (r0 != r9) goto L7c
            r0 = r9
            goto L7d
        L7c:
            r0 = r8
        L7d:
            if (r0 == 0) goto L92
            long r10 = com.amazon.aps.iva.n1.c.i(r13)
            long r10 = r10 >> r5
            int r0 = (int) r10
            if (r0 == r4) goto L8d
            if (r0 == r3) goto L8d
            if (r0 == r2) goto L8d
            r0 = r8
            goto L8e
        L8d:
            r0 = r9
        L8e:
            if (r0 == 0) goto L92
            r0 = r9
            goto L93
        L92:
            r0 = r8
        L93:
            if (r0 == 0) goto Lba
            java.util.LinkedHashMap r0 = r7.a
            long r2 = com.amazon.aps.iva.n1.c.i(r13)
            com.amazon.aps.iva.n1.a r13 = new com.amazon.aps.iva.n1.a
            r13.<init>(r2)
            java.lang.Object r13 = r0.remove(r13)
            com.amazon.aps.iva.c0.o r13 = (com.amazon.aps.iva.c0.o) r13
            if (r13 == 0) goto Lb4
            com.amazon.aps.iva.se0.g0 r0 = r12.i1()
            androidx.compose.foundation.a$c r2 = new androidx.compose.foundation.a$c
            r2.<init>(r13, r6)
            com.amazon.aps.iva.se0.i.d(r0, r6, r6, r2, r1)
        Lb4:
            com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r13 = r12.s
            r13.invoke()
        Lb9:
            r8 = r9
        Lba:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.D0(android.view.KeyEvent):boolean");
    }

    @Override // com.amazon.aps.iva.u1.g1
    public final void G0() {
        v1().G0();
    }

    @Override // com.amazon.aps.iva.a1.f.c
    public final void n1() {
        u1();
    }

    @Override // com.amazon.aps.iva.n1.d
    public final boolean s0(KeyEvent keyEvent) {
        com.amazon.aps.iva.yb0.j.f(keyEvent, "event");
        return false;
    }

    public final void u1() {
        C0010a c0010a = this.t;
        o oVar = c0010a.b;
        if (oVar != null) {
            this.q.a(new com.amazon.aps.iva.c0.n(oVar));
        }
        LinkedHashMap linkedHashMap = c0010a.a;
        for (o oVar2 : linkedHashMap.values()) {
            this.q.a(new com.amazon.aps.iva.c0.n(oVar2));
        }
        c0010a.b = null;
        linkedHashMap.clear();
    }

    public abstract androidx.compose.foundation.b v1();

    public final void w1(com.amazon.aps.iva.c0.l lVar, boolean z, com.amazon.aps.iva.xb0.a aVar) {
        if (!com.amazon.aps.iva.yb0.j.a(this.q, lVar)) {
            u1();
            this.q = lVar;
        }
        if (this.r != z) {
            if (!z) {
                u1();
            }
            this.r = z;
        }
        this.s = aVar;
    }
}
