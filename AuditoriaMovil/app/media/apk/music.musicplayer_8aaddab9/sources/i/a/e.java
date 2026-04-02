package i.a;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes2.dex */
public final class e<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount");

    /* renamed from: b  reason: collision with root package name */
    public final j0<T>[] f8973b;
    public volatile /* synthetic */ int notCompletedCount;

    /* loaded from: classes2.dex */
    public final class a extends k1 {
        private volatile /* synthetic */ Object _disposer = null;

        /* renamed from: e  reason: collision with root package name */
        public final j<List<? extends T>> f8974e;

        /* renamed from: f  reason: collision with root package name */
        public p0 f8975f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(j<? super List<? extends T>> jVar) {
            this.f8974e = jVar;
        }

        @Override // h.o.b.l
        public /* bridge */ /* synthetic */ h.k invoke(Throwable th) {
            o(th);
            return h.k.a;
        }

        @Override // i.a.y
        public void o(Throwable th) {
            if (th != null) {
                Object B = this.f8974e.B(th);
                if (B != null) {
                    this.f8974e.b0(B);
                    b bVar = (b) this._disposer;
                    if (bVar == null) {
                        return;
                    }
                    bVar.b();
                    return;
                }
                return;
            }
            if (e.a.decrementAndGet(e.this) == 0) {
                j<List<? extends T>> jVar = this.f8974e;
                j0<T>[] j0VarArr = e.this.f8973b;
                ArrayList arrayList = new ArrayList(j0VarArr.length);
                for (j0<T> j0Var : j0VarArr) {
                    arrayList.add(j0Var.h());
                }
                jVar.resumeWith(arrayList);
            }
        }

        public final void q(e<T>.b bVar) {
            this._disposer = bVar;
        }
    }

    /* loaded from: classes2.dex */
    public final class b extends h {
        public final e<T>.a[] a;

        public b(e eVar, e<T>.a[] aVarArr) {
            this.a = aVarArr;
        }

        @Override // i.a.i
        public void a(Throwable th) {
            b();
        }

        public final void b() {
            for (e<T>.a aVar : this.a) {
                p0 p0Var = aVar.f8975f;
                if (p0Var == null) {
                    h.o.c.j.k("handle");
                    throw null;
                }
                p0Var.dispose();
            }
        }

        @Override // h.o.b.l
        public h.k invoke(Throwable th) {
            b();
            return h.k.a;
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("DisposeHandlersOnCancel[");
            y.append(this.a);
            y.append(']');
            return y.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(j0<? extends T>[] j0VarArr) {
        this.f8973b = j0VarArr;
        this.notCompletedCount = j0VarArr.length;
    }
}
