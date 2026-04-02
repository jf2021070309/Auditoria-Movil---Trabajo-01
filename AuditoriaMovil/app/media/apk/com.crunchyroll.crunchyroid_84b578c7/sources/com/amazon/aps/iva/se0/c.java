package com.amazon.aps.iva.se0;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: Await.kt */
/* loaded from: classes4.dex */
public final class c<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(c.class, "notCompletedCount");
    public final m0<T>[] a;
    volatile /* synthetic */ int notCompletedCount;

    /* compiled from: Await.kt */
    /* loaded from: classes4.dex */
    public final class a extends n1 {
        private volatile /* synthetic */ Object _disposer = null;
        public final m<List<? extends T>> f;
        public t0 g;

        public a(n nVar) {
            this.f = nVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q invoke(Throwable th) {
            q(th);
            return com.amazon.aps.iva.kb0.q.a;
        }

        @Override // com.amazon.aps.iva.se0.y
        public final void q(Throwable th) {
            if (th != null) {
                if (this.f.z(th) != null) {
                    this.f.l();
                    b bVar = (b) this._disposer;
                    if (bVar != null) {
                        bVar.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (c.b.decrementAndGet(c.this) == 0) {
                m<List<? extends T>> mVar = this.f;
                m0<T>[] m0VarArr = c.this.a;
                ArrayList arrayList = new ArrayList(m0VarArr.length);
                for (m0<T> m0Var : m0VarArr) {
                    arrayList.add(m0Var.i());
                }
                mVar.resumeWith(arrayList);
            }
        }

        public final void s(c<T>.b bVar) {
            this._disposer = bVar;
        }
    }

    /* compiled from: Await.kt */
    /* loaded from: classes4.dex */
    public final class b extends k {
        public final c<T>.a[] b;

        public b(a[] aVarArr) {
            this.b = aVarArr;
        }

        @Override // com.amazon.aps.iva.se0.l
        public final void a(Throwable th) {
            b();
        }

        public final void b() {
            for (c<T>.a aVar : this.b) {
                t0 t0Var = aVar.g;
                if (t0Var != null) {
                    t0Var.dispose();
                } else {
                    com.amazon.aps.iva.yb0.j.m("handle");
                    throw null;
                }
            }
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
            b();
            return com.amazon.aps.iva.kb0.q.a;
        }

        public final String toString() {
            return "DisposeHandlersOnCancel[" + this.b + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(m0<? extends T>[] m0VarArr) {
        this.a = m0VarArr;
        this.notCompletedCount = m0VarArr.length;
    }
}
