package com.amazon.aps.iva.wa0;
/* compiled from: DoubleCheck.java */
/* loaded from: classes4.dex */
public final class a<T> implements com.amazon.aps.iva.jb0.a<T> {
    public static final Object c = new Object();
    public volatile com.amazon.aps.iva.jb0.a<T> a;
    public volatile Object b = c;

    public a(com.amazon.aps.iva.jb0.a<T> aVar) {
        this.a = aVar;
    }

    public static <P extends com.amazon.aps.iva.jb0.a<T>, T> com.amazon.aps.iva.jb0.a<T> a(P p) {
        if (p instanceof a) {
            return p;
        }
        return new a(p);
    }

    @Override // com.amazon.aps.iva.jb0.a
    public final T get() {
        boolean z;
        T t = (T) this.b;
        Object obj = c;
        if (t == obj) {
            synchronized (this) {
                t = this.b;
                if (t == obj) {
                    t = this.a.get();
                    Object obj2 = this.b;
                    if (obj2 != obj) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && obj2 != t) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t + ". This is likely due to a circular dependency.");
                    }
                    this.b = t;
                    this.a = null;
                }
            }
        }
        return t;
    }
}
