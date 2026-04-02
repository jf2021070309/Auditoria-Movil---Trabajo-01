package h;

import java.io.Serializable;
/* loaded from: classes2.dex */
public final class h<T> implements d<T>, Serializable {
    public h.o.b.a<? extends T> a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f8926b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8927c;

    public h(h.o.b.a aVar, Object obj, int i2) {
        int i3 = i2 & 2;
        h.o.c.j.e(aVar, "initializer");
        this.a = aVar;
        this.f8926b = i.a;
        this.f8927c = this;
    }

    @Override // h.d
    public T getValue() {
        T t;
        T t2 = (T) this.f8926b;
        i iVar = i.a;
        if (t2 != iVar) {
            return t2;
        }
        synchronized (this.f8927c) {
            t = (T) this.f8926b;
            if (t == iVar) {
                h.o.b.a<? extends T> aVar = this.a;
                h.o.c.j.c(aVar);
                t = aVar.invoke();
                this.f8926b = t;
                this.a = null;
            }
        }
        return t;
    }

    public String toString() {
        return this.f8926b != i.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
