package com.amazon.aps.iva.ue0;

import com.amazon.aps.iva.ee0.f1;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ConflatedChannel.kt */
/* loaded from: classes4.dex */
public final class m<E> extends a<E> {
    public final ReentrantLock e;
    public Object f;

    public m(com.amazon.aps.iva.xb0.l<? super E, com.amazon.aps.iva.kb0.q> lVar) {
        super(lVar);
        this.e = new ReentrantLock();
        this.f = com.amazon.aps.iva.a0.k.e;
    }

    @Override // com.amazon.aps.iva.ue0.a
    public final Object A() {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            Object obj = this.f;
            com.amazon.aps.iva.xe0.s sVar = com.amazon.aps.iva.a0.k.e;
            if (obj == sVar) {
                Object f = f();
                if (f == null) {
                    f = com.amazon.aps.iva.a0.k.h;
                }
                return f;
            }
            this.f = sVar;
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.amazon.aps.iva.ue0.b
    public final String e() {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            return "(value=" + this.f + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.amazon.aps.iva.ue0.a, com.amazon.aps.iva.ue0.s
    public final boolean isEmpty() {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            return x();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.amazon.aps.iva.ue0.b
    public final boolean k() {
        return false;
    }

    @Override // com.amazon.aps.iva.ue0.b
    public final boolean l() {
        return false;
    }

    @Override // com.amazon.aps.iva.ue0.b
    public final Object m(E e) {
        com.amazon.aps.iva.xb0.l<E, com.amazon.aps.iva.kb0.q> lVar;
        t<E> n;
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            j<?> f = f();
            if (f != null) {
                return f;
            }
            Object obj = this.f;
            com.amazon.aps.iva.xe0.s sVar = com.amazon.aps.iva.a0.k.e;
            if (obj == sVar) {
                do {
                    n = n();
                    if (n != null) {
                        if (n instanceof j) {
                            return n;
                        }
                    }
                } while (n.a(e) == null);
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                reentrantLock.unlock();
                n.e(e);
                return n.b();
            }
            Object obj2 = this.f;
            com.amazon.aps.iva.xe0.y yVar = null;
            if (obj2 != sVar && (lVar = this.b) != null) {
                yVar = f1.m(lVar, obj2, null);
            }
            this.f = e;
            if (yVar == null) {
                return com.amazon.aps.iva.a0.k.f;
            }
            throw yVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.amazon.aps.iva.ue0.a
    public final boolean s(r<? super E> rVar) {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            return super.s(rVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.amazon.aps.iva.ue0.a
    public final boolean t() {
        return false;
    }

    @Override // com.amazon.aps.iva.ue0.a
    public final boolean v() {
        boolean z;
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            if (this.f == com.amazon.aps.iva.a0.k.e) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.amazon.aps.iva.ue0.a
    public final void y(boolean z) {
        com.amazon.aps.iva.xb0.l<E, com.amazon.aps.iva.kb0.q> lVar;
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            com.amazon.aps.iva.xe0.s sVar = com.amazon.aps.iva.a0.k.e;
            Object obj = this.f;
            com.amazon.aps.iva.xe0.y yVar = null;
            if (obj != sVar && (lVar = this.b) != null) {
                yVar = f1.m(lVar, obj, null);
            }
            this.f = sVar;
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            reentrantLock.unlock();
            super.y(z);
            if (yVar == null) {
                return;
            }
            throw yVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
