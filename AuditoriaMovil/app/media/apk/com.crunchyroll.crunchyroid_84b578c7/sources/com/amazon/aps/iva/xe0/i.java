package com.amazon.aps.iva.xe0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: classes4.dex */
public class i<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur = new j(8, false);

    public final boolean a(E e) {
        while (true) {
            j jVar = (j) this._cur;
            int a2 = jVar.a(e);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                if (a2 == 2) {
                    return false;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                j<E> e2 = jVar.e();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, e2) && atomicReferenceFieldUpdater.get(this) == jVar) {
                }
            }
        }
    }

    public final void b() {
        while (true) {
            j jVar = (j) this._cur;
            if (jVar.b()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            j<E> e = jVar.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, e) && atomicReferenceFieldUpdater.get(this) == jVar) {
            }
        }
    }

    public final int c() {
        return ((j) this._cur).c();
    }

    public final E d() {
        while (true) {
            j jVar = (j) this._cur;
            E e = (E) jVar.f();
            if (e != j.g) {
                return e;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            j<E> e2 = jVar.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, e2) && atomicReferenceFieldUpdater.get(this) == jVar) {
            }
        }
    }
}
