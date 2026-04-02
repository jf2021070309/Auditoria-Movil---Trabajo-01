package com.amazon.aps.iva.ue0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.se0.j0;
import com.amazon.aps.iva.se0.z1;
import com.amazon.aps.iva.ue0.i;
import com.amazon.aps.iva.ue0.o;
import com.amazon.aps.iva.yb0.h0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: AbstractChannel.kt */
/* loaded from: classes4.dex */
public abstract class b<E> implements w<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "onCloseHandler");
    public final com.amazon.aps.iva.xb0.l<E, com.amazon.aps.iva.kb0.q> b;
    public final com.amazon.aps.iva.xe0.g c = new com.amazon.aps.iva.xe0.g();
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* JADX WARN: Multi-variable type inference failed */
    public b(com.amazon.aps.iva.xb0.l<? super E, com.amazon.aps.iva.kb0.q> lVar) {
        this.b = lVar;
    }

    public static final void c(b bVar, com.amazon.aps.iva.se0.n nVar, Object obj, j jVar) {
        com.amazon.aps.iva.xe0.y m;
        bVar.getClass();
        i(jVar);
        Throwable th = jVar.e;
        if (th == null) {
            th = new l("Channel was closed");
        }
        com.amazon.aps.iva.xb0.l<E, com.amazon.aps.iva.kb0.q> lVar = bVar.b;
        if (lVar != null && (m = f1.m(lVar, obj, null)) != null) {
            com.amazon.aps.iva.aq.k.f(m, th);
            nVar.resumeWith(com.amazon.aps.iva.ab.x.H(m));
            return;
        }
        nVar.resumeWith(com.amazon.aps.iva.ab.x.H(th));
    }

    public static void i(j jVar) {
        r rVar;
        Object obj = null;
        while (true) {
            com.amazon.aps.iva.xe0.h k = jVar.k();
            if (k instanceof r) {
                rVar = (r) k;
            } else {
                rVar = null;
            }
            if (rVar == null) {
                break;
            } else if (!rVar.n()) {
                ((com.amazon.aps.iva.xe0.n) rVar.i()).a.l();
            } else {
                obj = com.amazon.aps.iva.ab.t.t(obj, rVar);
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((r) obj).r(jVar);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                ((r) arrayList.get(size)).r(jVar);
            }
        }
    }

    @Override // com.amazon.aps.iva.ue0.w
    public final void b(o.b bVar) {
        boolean z;
        boolean z2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        while (true) {
            z = false;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, bVar)) {
                z2 = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(this) != null) {
                z2 = false;
                break;
            }
        }
        com.amazon.aps.iva.xe0.s sVar = com.amazon.aps.iva.a0.k.j;
        if (!z2) {
            Object obj = this.onCloseHandler;
            if (obj == sVar) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException("Another handler was already registered: " + obj);
        }
        j<?> f = f();
        if (f != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, bVar, sVar)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater2.get(this) != bVar) {
                    break;
                }
            }
            if (z) {
                bVar.invoke(f.e);
            }
        }
    }

    public Object d(x xVar) {
        boolean z;
        com.amazon.aps.iva.xe0.h k;
        boolean k2 = k();
        com.amazon.aps.iva.xe0.g gVar = this.c;
        if (k2) {
            do {
                k = gVar.k();
                if (k instanceof t) {
                    return k;
                }
            } while (!k.f(xVar, gVar));
            return null;
        }
        c cVar = new c(xVar, this);
        while (true) {
            com.amazon.aps.iva.xe0.h k3 = gVar.k();
            if (k3 instanceof t) {
                return k3;
            }
            int p = k3.p(xVar, gVar, cVar);
            z = true;
            if (p != 1) {
                if (p == 2) {
                    z = false;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            return com.amazon.aps.iva.a0.k.i;
        }
        return null;
    }

    public String e() {
        return "";
    }

    public final j<?> f() {
        j<?> jVar;
        com.amazon.aps.iva.xe0.h k = this.c.k();
        if (k instanceof j) {
            jVar = (j) k;
        } else {
            jVar = null;
        }
        if (jVar == null) {
            return null;
        }
        i(jVar);
        return jVar;
    }

    @Override // com.amazon.aps.iva.ue0.w
    public final Object g(E e, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        boolean z;
        x yVar;
        Object m = m(e);
        com.amazon.aps.iva.xe0.s sVar = com.amazon.aps.iva.a0.k.f;
        if (m == sVar) {
            return com.amazon.aps.iva.kb0.q.a;
        }
        com.amazon.aps.iva.se0.n o = com.amazon.aps.iva.aq.k.o(com.amazon.aps.iva.a60.b.s(dVar));
        while (true) {
            if (!(this.c.j() instanceof t) && l()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                com.amazon.aps.iva.xb0.l<E, com.amazon.aps.iva.kb0.q> lVar = this.b;
                if (lVar == null) {
                    yVar = new x(e, o);
                } else {
                    yVar = new y(e, o, lVar);
                }
                Object d2 = d(yVar);
                if (d2 == null) {
                    o.w(new z1(yVar));
                    break;
                } else if (d2 instanceof j) {
                    c(this, o, e, (j) d2);
                    break;
                } else if (d2 != com.amazon.aps.iva.a0.k.i && !(d2 instanceof r)) {
                    throw new IllegalStateException(("enqueueSend returned " + d2).toString());
                }
            }
            Object m2 = m(e);
            if (m2 == sVar) {
                o.resumeWith(com.amazon.aps.iva.kb0.q.a);
                break;
            } else if (m2 != com.amazon.aps.iva.a0.k.g) {
                if (m2 instanceof j) {
                    c(this, o, e, (j) m2);
                } else {
                    throw new IllegalStateException(("offerInternal returned " + m2).toString());
                }
            }
        }
        Object q = o.q();
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        if (q != aVar) {
            q = com.amazon.aps.iva.kb0.q.a;
        }
        if (q == aVar) {
            return q;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.ue0.w
    public final Object h(E e) {
        i.a aVar;
        Object m = m(e);
        if (m == com.amazon.aps.iva.a0.k.f) {
            return com.amazon.aps.iva.kb0.q.a;
        }
        if (m == com.amazon.aps.iva.a0.k.g) {
            j<?> f = f();
            if (f == null) {
                return i.b;
            }
            i(f);
            Throwable th = f.e;
            if (th == null) {
                th = new l("Channel was closed");
            }
            aVar = new i.a(th);
        } else if (m instanceof j) {
            j jVar = (j) m;
            i(jVar);
            Throwable th2 = jVar.e;
            if (th2 == null) {
                th2 = new l("Channel was closed");
            }
            aVar = new i.a(th2);
        } else {
            throw new IllegalStateException(("trySend returned " + m).toString());
        }
        return aVar;
    }

    public abstract boolean k();

    public abstract boolean l();

    public Object m(E e) {
        t<E> n;
        do {
            n = n();
            if (n == null) {
                return com.amazon.aps.iva.a0.k.g;
            }
        } while (n.a(e) == null);
        n.e(e);
        return n.b();
    }

    public t<E> n() {
        com.amazon.aps.iva.xe0.h hVar;
        com.amazon.aps.iva.xe0.h o;
        com.amazon.aps.iva.xe0.g gVar = this.c;
        while (true) {
            hVar = (com.amazon.aps.iva.xe0.h) gVar.i();
            if (hVar != gVar && (hVar instanceof t)) {
                if (((((t) hVar) instanceof j) && !hVar.m()) || (o = hVar.o()) == null) {
                    break;
                }
                o.l();
            }
        }
        hVar = null;
        return (t) hVar;
    }

    public final v p() {
        com.amazon.aps.iva.xe0.h hVar;
        com.amazon.aps.iva.xe0.h o;
        com.amazon.aps.iva.xe0.g gVar = this.c;
        while (true) {
            hVar = (com.amazon.aps.iva.xe0.h) gVar.i();
            if (hVar != gVar && (hVar instanceof v)) {
                if (((((v) hVar) instanceof j) && !hVar.m()) || (o = hVar.o()) == null) {
                    break;
                }
                o.l();
            }
        }
        hVar = null;
        return (v) hVar;
    }

    @Override // com.amazon.aps.iva.ue0.w
    public final boolean r(Throwable th) {
        boolean z;
        boolean z2;
        Object obj;
        com.amazon.aps.iva.xe0.s sVar;
        j jVar = new j(th);
        com.amazon.aps.iva.xe0.g gVar = this.c;
        while (true) {
            com.amazon.aps.iva.xe0.h k = gVar.k();
            z = false;
            if (!(!(k instanceof j))) {
                z2 = false;
                break;
            } else if (k.f(jVar, gVar)) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            jVar = (j) this.c.k();
        }
        i(jVar);
        if (z2 && (obj = this.onCloseHandler) != null && obj != (sVar = com.amazon.aps.iva.a0.k.j)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, sVar)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (z) {
                h0.e(1, obj);
                ((com.amazon.aps.iva.xb0.l) obj).invoke(th);
            }
        }
        return z2;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(j0.e(this));
        sb.append('{');
        com.amazon.aps.iva.xe0.h hVar = this.c;
        com.amazon.aps.iva.xe0.h j = hVar.j();
        if (j == hVar) {
            str2 = "EmptyQueue";
        } else {
            if (j instanceof j) {
                str = j.toString();
            } else if (j instanceof r) {
                str = "ReceiveQueued";
            } else if (j instanceof v) {
                str = "SendQueued";
            } else {
                str = "UNEXPECTED:" + j;
            }
            com.amazon.aps.iva.xe0.h k = hVar.k();
            if (k != j) {
                StringBuilder b = com.amazon.aps.iva.b6.x.b(str, ",queueSize=");
                int i = 0;
                for (com.amazon.aps.iva.xe0.h hVar2 = (com.amazon.aps.iva.xe0.h) hVar.i(); !com.amazon.aps.iva.yb0.j.a(hVar2, hVar); hVar2 = hVar2.j()) {
                    if (hVar2 instanceof com.amazon.aps.iva.xe0.h) {
                        i++;
                    }
                }
                b.append(i);
                str2 = b.toString();
                if (k instanceof j) {
                    str2 = str2 + ",closedForSend=" + k;
                }
            } else {
                str2 = str;
            }
        }
        sb.append(str2);
        sb.append('}');
        sb.append(e());
        return sb.toString();
    }

    @Override // com.amazon.aps.iva.ue0.w
    public final boolean u() {
        if (f() != null) {
            return true;
        }
        return false;
    }

    /* compiled from: AbstractChannel.kt */
    /* loaded from: classes4.dex */
    public static final class a<E> extends v {
        public final E e;

        public a(E e) {
            this.e = e;
        }

        @Override // com.amazon.aps.iva.ue0.v
        public final Object r() {
            return this.e;
        }

        @Override // com.amazon.aps.iva.ue0.v
        public final com.amazon.aps.iva.xe0.s t() {
            return com.amazon.aps.iva.ff0.b.c;
        }

        @Override // com.amazon.aps.iva.xe0.h
        public final String toString() {
            StringBuilder sb = new StringBuilder("SendBuffered@");
            sb.append(j0.e(this));
            sb.append('(');
            return defpackage.b.b(sb, this.e, ')');
        }

        @Override // com.amazon.aps.iva.ue0.v
        public final void q() {
        }

        @Override // com.amazon.aps.iva.ue0.v
        public final void s(j<?> jVar) {
        }
    }
}
