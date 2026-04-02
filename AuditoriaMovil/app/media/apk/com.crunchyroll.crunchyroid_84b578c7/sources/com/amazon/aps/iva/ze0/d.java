package com.amazon.aps.iva.ze0;

import com.amazon.aps.iva.gy.t;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.m;
import com.amazon.aps.iva.se0.n;
import com.amazon.aps.iva.se0.t0;
import com.amazon.aps.iva.xe0.s;
import com.amazon.aps.iva.yb0.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: Mutex.kt */
/* loaded from: classes4.dex */
public final class d implements com.amazon.aps.iva.ze0.c {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_state");
    volatile /* synthetic */ Object _state;

    /* compiled from: Mutex.kt */
    /* loaded from: classes4.dex */
    public final class a extends b {
        public final m<q> g;

        /* compiled from: Mutex.kt */
        /* renamed from: com.amazon.aps.iva.ze0.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0917a extends l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
            public final /* synthetic */ d h;
            public final /* synthetic */ a i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0917a(d dVar, a aVar) {
                super(1);
                this.h = dVar;
                this.i = aVar;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(Throwable th) {
                this.h.d(this.i.e);
                return q.a;
            }
        }

        public a(Object obj, n nVar) {
            super(obj);
            this.g = nVar;
        }

        @Override // com.amazon.aps.iva.ze0.d.b
        public final void q() {
            this.g.l();
        }

        @Override // com.amazon.aps.iva.ze0.d.b
        public final boolean r() {
            if (!b.f.compareAndSet(this, 0, 1)) {
                return false;
            }
            if (this.g.e(q.a, new C0917a(d.this, this)) == null) {
                return false;
            }
            return true;
        }

        @Override // com.amazon.aps.iva.xe0.h
        public final String toString() {
            return "LockCont[" + this.e + ", " + this.g + "] for " + d.this;
        }
    }

    /* compiled from: Mutex.kt */
    /* loaded from: classes4.dex */
    public abstract class b extends com.amazon.aps.iva.xe0.h implements t0 {
        public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(b.class, "isTaken");
        public final Object e;
        private volatile /* synthetic */ int isTaken = 0;

        public b(Object obj) {
            this.e = obj;
        }

        public abstract void q();

        public abstract boolean r();
    }

    /* compiled from: Mutex.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.xe0.g {
        public volatile Object owner;

        public c(Object obj) {
            this.owner = obj;
        }

        @Override // com.amazon.aps.iva.xe0.h
        public final String toString() {
            return defpackage.b.b(new StringBuilder("LockedQueue["), this.owner, ']');
        }
    }

    /* compiled from: Mutex.kt */
    /* renamed from: com.amazon.aps.iva.ze0.d$d  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0918d extends com.amazon.aps.iva.xe0.a<d> {
        public final c b;

        public C0918d(c cVar) {
            this.b = cVar;
        }

        @Override // com.amazon.aps.iva.xe0.a
        public final void b(d dVar, Object obj) {
            Object obj2;
            d dVar2 = dVar;
            if (obj == null) {
                obj2 = t.h;
            } else {
                obj2 = this.b;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.a;
            while (!atomicReferenceFieldUpdater.compareAndSet(dVar2, this, obj2) && atomicReferenceFieldUpdater.get(dVar2) == this) {
            }
        }

        @Override // com.amazon.aps.iva.xe0.a
        public final s c(Object obj) {
            boolean z;
            d dVar = (d) obj;
            c cVar = this.b;
            if (cVar.i() == cVar) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            return t.d;
        }
    }

    public d(boolean z) {
        com.amazon.aps.iva.ze0.b bVar;
        if (z) {
            bVar = t.g;
        } else {
            bVar = t.h;
        }
        this._state = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0092, code lost:
        r9.w(new com.amazon.aps.iva.se0.z1(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
        r8 = r9.q();
        r9 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a0, code lost:
        if (r8 != r9) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a3, code lost:
        r8 = com.amazon.aps.iva.kb0.q.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a5, code lost:
        if (r8 != r9) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
        return com.amazon.aps.iva.kb0.q.a;
     */
    @Override // com.amazon.aps.iva.ze0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r8, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r9) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ze0.d.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.ze0.c
    public final boolean b(Object obj) {
        com.amazon.aps.iva.ze0.b bVar;
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            boolean z2 = false;
            if (obj2 instanceof com.amazon.aps.iva.ze0.b) {
                if (((com.amazon.aps.iva.ze0.b) obj2).a != t.f) {
                    return false;
                }
                if (obj == null) {
                    bVar = t.g;
                } else {
                    bVar = new com.amazon.aps.iva.ze0.b(obj);
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, bVar)) {
                        z2 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (z2) {
                    return true;
                }
            } else if (obj2 instanceof c) {
                if (((c) obj2).owner == obj) {
                    z = false;
                }
                if (z) {
                    return false;
                }
                throw new IllegalStateException(("Already locked by " + obj).toString());
            } else if (obj2 instanceof com.amazon.aps.iva.xe0.m) {
                ((com.amazon.aps.iva.xe0.m) obj2).a(this);
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    @Override // com.amazon.aps.iva.ze0.c
    public final boolean c() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof com.amazon.aps.iva.ze0.b) {
                if (((com.amazon.aps.iva.ze0.b) obj).a != t.f) {
                    return true;
                }
                return false;
            } else if (obj instanceof c) {
                return true;
            } else {
                if (obj instanceof com.amazon.aps.iva.xe0.m) {
                    ((com.amazon.aps.iva.xe0.m) obj).a(this);
                } else {
                    throw new IllegalStateException(("Illegal state " + obj).toString());
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.ze0.c
    public final void d(Object obj) {
        com.amazon.aps.iva.ze0.b bVar;
        boolean z;
        boolean z2;
        com.amazon.aps.iva.xe0.h hVar;
        c cVar;
        boolean z3;
        while (true) {
            Object obj2 = this._state;
            boolean z4 = true;
            if (obj2 instanceof com.amazon.aps.iva.ze0.b) {
                if (obj == null) {
                    if (((com.amazon.aps.iva.ze0.b) obj2).a != t.f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    if (((com.amazon.aps.iva.ze0.b) obj2).a == obj) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException(("Mutex is locked by " + bVar.a + " but expected " + obj).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                com.amazon.aps.iva.ze0.b bVar2 = t.h;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, bVar2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z4) {
                    return;
                }
            } else if (obj2 instanceof com.amazon.aps.iva.xe0.m) {
                ((com.amazon.aps.iva.xe0.m) obj2).a(this);
            } else if (obj2 instanceof c) {
                if (obj != null) {
                    if (((c) obj2).owner == obj) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        throw new IllegalStateException(("Mutex is locked by " + cVar.owner + " but expected " + obj).toString());
                    }
                }
                c cVar2 = (c) obj2;
                while (true) {
                    hVar = (com.amazon.aps.iva.xe0.h) cVar2.i();
                    if (hVar == cVar2) {
                        hVar = null;
                        break;
                    } else if (hVar.n()) {
                        break;
                    } else {
                        ((com.amazon.aps.iva.xe0.n) hVar.i()).a.l();
                    }
                }
                if (hVar == null) {
                    C0918d c0918d = new C0918d(cVar2);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c0918d)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                z4 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z4 && c0918d.a(this) == null) {
                        return;
                    }
                } else {
                    b bVar3 = (b) hVar;
                    if (bVar3.r()) {
                        Object obj3 = bVar3.e;
                        if (obj3 == null) {
                            obj3 = t.e;
                        }
                        cVar2.owner = obj3;
                        bVar3.q();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    public final String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof com.amazon.aps.iva.ze0.b) {
                return defpackage.b.b(new StringBuilder("Mutex["), ((com.amazon.aps.iva.ze0.b) obj).a, ']');
            }
            if (obj instanceof com.amazon.aps.iva.xe0.m) {
                ((com.amazon.aps.iva.xe0.m) obj).a(this);
            } else if (obj instanceof c) {
                return defpackage.b.b(new StringBuilder("Mutex["), ((c) obj).owner, ']');
            } else {
                throw new IllegalStateException(("Illegal state " + obj).toString());
            }
        }
    }
}
