package com.amazon.aps.iva.ue0;

import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.se0.j0;
import com.amazon.aps.iva.ue0.i;
import com.amazon.aps.iva.xe0.h;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
/* compiled from: AbstractChannel.kt */
/* loaded from: classes4.dex */
public abstract class a<E> extends com.amazon.aps.iva.ue0.b<E> implements com.amazon.aps.iva.ue0.f<E> {

    /* compiled from: AbstractChannel.kt */
    /* renamed from: com.amazon.aps.iva.ue0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0763a<E> implements h<E> {
        public final a<E> a;
        public Object b = com.amazon.aps.iva.a0.k.h;

        public C0763a(a<E> aVar) {
            this.a = aVar;
        }

        @Override // com.amazon.aps.iva.ue0.h
        public final Object a(com.amazon.aps.iva.qb0.c cVar) {
            com.amazon.aps.iva.xe0.l lVar;
            Object obj = this.b;
            com.amazon.aps.iva.xe0.s sVar = com.amazon.aps.iva.a0.k.h;
            boolean z = false;
            if (obj != sVar) {
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    if (jVar.e != null) {
                        Throwable v = jVar.v();
                        int i = com.amazon.aps.iva.xe0.r.a;
                        throw v;
                    }
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            a<E> aVar = this.a;
            Object A = aVar.A();
            this.b = A;
            if (A != sVar) {
                if (A instanceof j) {
                    j jVar2 = (j) A;
                    if (jVar2.e != null) {
                        Throwable v2 = jVar2.v();
                        int i2 = com.amazon.aps.iva.xe0.r.a;
                        throw v2;
                    }
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            com.amazon.aps.iva.se0.n o = com.amazon.aps.iva.aq.k.o(com.amazon.aps.iva.a60.b.s(cVar));
            d dVar = new d(this, o);
            while (true) {
                if (aVar.s(dVar)) {
                    o.w(new e(dVar));
                    break;
                }
                Object A2 = aVar.A();
                this.b = A2;
                if (A2 instanceof j) {
                    j jVar3 = (j) A2;
                    if (jVar3.e == null) {
                        o.resumeWith(Boolean.FALSE);
                    } else {
                        o.resumeWith(com.amazon.aps.iva.ab.x.H(jVar3.v()));
                    }
                } else if (A2 != sVar) {
                    Boolean bool = Boolean.TRUE;
                    com.amazon.aps.iva.xb0.l<E, com.amazon.aps.iva.kb0.q> lVar2 = aVar.b;
                    if (lVar2 != null) {
                        lVar = new com.amazon.aps.iva.xe0.l(lVar2, A2, o.f);
                    } else {
                        lVar = null;
                    }
                    o.P(bool, lVar);
                }
            }
            Object q = o.q();
            com.amazon.aps.iva.pb0.a aVar2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            return q;
        }

        @Override // com.amazon.aps.iva.ue0.h
        public final E next() {
            E e = (E) this.b;
            if (!(e instanceof j)) {
                com.amazon.aps.iva.xe0.s sVar = com.amazon.aps.iva.a0.k.h;
                if (e != sVar) {
                    this.b = sVar;
                    return e;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            Throwable v = ((j) e).v();
            int i = com.amazon.aps.iva.xe0.r.a;
            throw v;
        }
    }

    /* compiled from: AbstractChannel.kt */
    /* loaded from: classes4.dex */
    public static class b<E> extends r<E> {
        public final com.amazon.aps.iva.se0.m<Object> e;
        public final int f;

        public b(com.amazon.aps.iva.se0.n nVar, int i) {
            this.e = nVar;
            this.f = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.ue0.t
        public final com.amazon.aps.iva.xe0.s a(Object obj) {
            i iVar;
            if (this.f == 1) {
                iVar = new i(obj);
            } else {
                iVar = obj;
            }
            if (this.e.e(iVar, q(obj)) == null) {
                return null;
            }
            return com.amazon.aps.iva.ff0.b.c;
        }

        @Override // com.amazon.aps.iva.ue0.t
        public final void e(E e) {
            this.e.l();
        }

        @Override // com.amazon.aps.iva.ue0.r
        public final void r(j<?> jVar) {
            int i = this.f;
            com.amazon.aps.iva.se0.m<Object> mVar = this.e;
            if (i == 1) {
                mVar.resumeWith(new i(new i.a(jVar.e)));
            } else {
                mVar.resumeWith(com.amazon.aps.iva.ab.x.H(jVar.v()));
            }
        }

        @Override // com.amazon.aps.iva.xe0.h
        public final String toString() {
            StringBuilder sb = new StringBuilder("ReceiveElement@");
            sb.append(j0.e(this));
            sb.append("[receiveMode=");
            return b2.b(sb, this.f, ']');
        }
    }

    /* compiled from: AbstractChannel.kt */
    /* loaded from: classes4.dex */
    public static final class c<E> extends b<E> {
        public final com.amazon.aps.iva.xb0.l<E, com.amazon.aps.iva.kb0.q> g;

        public c(com.amazon.aps.iva.se0.n nVar, int i, com.amazon.aps.iva.xb0.l lVar) {
            super(nVar, i);
            this.g = lVar;
        }

        @Override // com.amazon.aps.iva.ue0.r
        public final com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> q(E e) {
            return new com.amazon.aps.iva.xe0.l(this.g, e, this.e.getContext());
        }
    }

    /* compiled from: AbstractChannel.kt */
    /* loaded from: classes4.dex */
    public static class d<E> extends r<E> {
        public final C0763a<E> e;
        public final com.amazon.aps.iva.se0.m<Boolean> f;

        public d(C0763a c0763a, com.amazon.aps.iva.se0.n nVar) {
            this.e = c0763a;
            this.f = nVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.ue0.t
        public final com.amazon.aps.iva.xe0.s a(Object obj) {
            if (this.f.e(Boolean.TRUE, q(obj)) == null) {
                return null;
            }
            return com.amazon.aps.iva.ff0.b.c;
        }

        @Override // com.amazon.aps.iva.ue0.t
        public final void e(E e) {
            this.e.b = e;
            this.f.l();
        }

        @Override // com.amazon.aps.iva.ue0.r
        public final com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> q(E e) {
            com.amazon.aps.iva.xb0.l<E, com.amazon.aps.iva.kb0.q> lVar = this.e.a.b;
            if (lVar != null) {
                return new com.amazon.aps.iva.xe0.l(lVar, e, this.f.getContext());
            }
            return null;
        }

        @Override // com.amazon.aps.iva.ue0.r
        public final void r(j<?> jVar) {
            com.amazon.aps.iva.xe0.s z;
            Throwable th = jVar.e;
            com.amazon.aps.iva.se0.m<Boolean> mVar = this.f;
            if (th == null) {
                z = mVar.d(Boolean.FALSE, null);
            } else {
                z = mVar.z(jVar.v());
            }
            if (z != null) {
                this.e.b = jVar;
                mVar.l();
            }
        }

        @Override // com.amazon.aps.iva.xe0.h
        public final String toString() {
            return "ReceiveHasNext@" + j0.e(this);
        }
    }

    /* compiled from: AbstractChannel.kt */
    /* loaded from: classes4.dex */
    public final class e extends com.amazon.aps.iva.se0.f {
        public final r<?> b;

        public e(r<?> rVar) {
            this.b = rVar;
        }

        @Override // com.amazon.aps.iva.se0.l
        public final void a(Throwable th) {
            if (this.b.n()) {
                a.this.getClass();
            }
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q invoke(Throwable th) {
            a(th);
            return com.amazon.aps.iva.kb0.q.a;
        }

        public final String toString() {
            return "RemoveReceiveOnCancel[" + this.b + ']';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes4.dex */
    public static final class f extends h.a {
        public final /* synthetic */ a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.amazon.aps.iva.xe0.h hVar, a aVar) {
            super(hVar);
            this.d = aVar;
        }

        @Override // com.amazon.aps.iva.xe0.a
        public final com.amazon.aps.iva.xe0.s c(Object obj) {
            com.amazon.aps.iva.xe0.h hVar = (com.amazon.aps.iva.xe0.h) obj;
            if (this.d.v()) {
                return null;
            }
            return com.amazon.aps.iva.a0.k.k;
        }
    }

    /* compiled from: AbstractChannel.kt */
    @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", l = {633}, m = "receiveCatching-JP2dKIU")
    /* loaded from: classes4.dex */
    public static final class g extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public final /* synthetic */ a<E> i;
        public int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a<E> aVar, com.amazon.aps.iva.ob0.d<? super g> dVar) {
            super(dVar);
            this.i = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            Object j = this.i.j(this);
            if (j == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return j;
            }
            return new i(j);
        }
    }

    public Object A() {
        while (true) {
            v p = p();
            if (p == null) {
                return com.amazon.aps.iva.a0.k.h;
            }
            if (p.t() != null) {
                p.q();
                return p.r();
            }
            p.u();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.amazon.aps.iva.ue0.a$b] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.amazon.aps.iva.ue0.b, com.amazon.aps.iva.ue0.a, com.amazon.aps.iva.ue0.a<E>] */
    public final Object B(int i, com.amazon.aps.iva.qb0.c cVar) {
        c cVar2;
        Object obj;
        com.amazon.aps.iva.se0.n o = com.amazon.aps.iva.aq.k.o(com.amazon.aps.iva.a60.b.s(cVar));
        com.amazon.aps.iva.xb0.l<E, com.amazon.aps.iva.kb0.q> lVar = this.b;
        if (lVar == null) {
            cVar2 = new b(o, i);
        } else {
            cVar2 = new c(o, i, lVar);
        }
        while (true) {
            if (s(cVar2)) {
                o.w(new e(cVar2));
                break;
            }
            Object A = A();
            if (A instanceof j) {
                cVar2.r((j) A);
                break;
            } else if (A != com.amazon.aps.iva.a0.k.h) {
                if (cVar2.f == 1) {
                    obj = new i(A);
                } else {
                    obj = A;
                }
                o.P(obj, cVar2.q(A));
            }
        }
        Object q = o.q();
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        return q;
    }

    @Override // com.amazon.aps.iva.ue0.s
    public final void a(CancellationException cancellationException) {
        if (w()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(getClass().getSimpleName().concat(" was cancelled"));
        }
        y(r(cancellationException));
    }

    @Override // com.amazon.aps.iva.ue0.s
    public boolean isEmpty() {
        return x();
    }

    @Override // com.amazon.aps.iva.ue0.s
    public final h<E> iterator() {
        return new C0763a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // com.amazon.aps.iva.ue0.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.ue0.i<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amazon.aps.iva.ue0.a.g
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.aps.iva.ue0.a$g r0 = (com.amazon.aps.iva.ue0.a.g) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.ue0.a$g r0 = new com.amazon.aps.iva.ue0.a$g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r5)
            goto L52
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r5)
            java.lang.Object r5 = r4.A()
            com.amazon.aps.iva.xe0.s r2 = com.amazon.aps.iva.a0.k.h
            if (r5 == r2) goto L49
            boolean r0 = r5 instanceof com.amazon.aps.iva.ue0.j
            if (r0 == 0) goto L48
            com.amazon.aps.iva.ue0.j r5 = (com.amazon.aps.iva.ue0.j) r5
            java.lang.Throwable r5 = r5.e
            com.amazon.aps.iva.ue0.i$a r0 = new com.amazon.aps.iva.ue0.i$a
            r0.<init>(r5)
            r5 = r0
        L48:
            return r5
        L49:
            r0.j = r3
            java.lang.Object r5 = r4.B(r3, r0)
            if (r5 != r1) goto L52
            return r1
        L52:
            com.amazon.aps.iva.ue0.i r5 = (com.amazon.aps.iva.ue0.i) r5
            java.lang.Object r5 = r5.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ue0.a.j(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.ue0.b
    public final t<E> n() {
        t<E> n = super.n();
        if (n != null) {
            boolean z = n instanceof j;
        }
        return n;
    }

    @Override // com.amazon.aps.iva.ue0.s
    public final Object o(com.amazon.aps.iva.qb0.c cVar) {
        Object A = A();
        if (A != com.amazon.aps.iva.a0.k.h && !(A instanceof j)) {
            return A;
        }
        return B(0, cVar);
    }

    @Override // com.amazon.aps.iva.ue0.s
    public final Object q() {
        Object A = A();
        if (A == com.amazon.aps.iva.a0.k.h) {
            return i.b;
        }
        if (A instanceof j) {
            return new i.a(((j) A).e);
        }
        return A;
    }

    public boolean s(r<? super E> rVar) {
        int p;
        com.amazon.aps.iva.xe0.h k;
        boolean t = t();
        com.amazon.aps.iva.xe0.g gVar = this.c;
        if (t) {
            do {
                k = gVar.k();
                if (!(!(k instanceof v))) {
                }
            } while (!k.f(rVar, gVar));
            return true;
        }
        f fVar = new f(rVar, this);
        do {
            com.amazon.aps.iva.xe0.h k2 = gVar.k();
            if (!(!(k2 instanceof v))) {
                break;
            }
            p = k2.p(rVar, gVar, fVar);
            if (p == 1) {
                return true;
            }
        } while (p != 2);
        return false;
    }

    public abstract boolean t();

    public abstract boolean v();

    public boolean w() {
        j jVar;
        com.amazon.aps.iva.xe0.h j = this.c.j();
        j jVar2 = null;
        if (j instanceof j) {
            jVar = (j) j;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            com.amazon.aps.iva.ue0.b.i(jVar);
            jVar2 = jVar;
        }
        if (jVar2 != null && v()) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        if (!(this.c.j() instanceof v) && v()) {
            return true;
        }
        return false;
    }

    public void y(boolean z) {
        j<?> f2 = f();
        if (f2 != null) {
            Object obj = null;
            while (true) {
                com.amazon.aps.iva.xe0.h k = f2.k();
                if (k instanceof com.amazon.aps.iva.xe0.g) {
                    z(obj, f2);
                    return;
                } else if (!k.n()) {
                    ((com.amazon.aps.iva.xe0.n) k.i()).a.l();
                } else {
                    obj = com.amazon.aps.iva.ab.t.t(obj, (v) k);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    public void z(Object obj, j<?> jVar) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((v) obj).s(jVar);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                ((v) arrayList.get(size)).s(jVar);
            }
        }
    }
}
