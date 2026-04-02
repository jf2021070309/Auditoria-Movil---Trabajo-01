package com.amazon.aps.iva.ez;

import com.amazon.aps.iva.kb0.q;
/* compiled from: Resource.kt */
/* loaded from: classes2.dex */
public abstract class g<T> {

    /* compiled from: Resource.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> extends g<T> {
        public final Throwable a;
        public final T b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, Throwable th) {
            com.amazon.aps.iva.yb0.j.f(th, "error");
            this.a = th;
            this.b = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, aVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, aVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = this.a.hashCode() * 31;
            T t = this.b;
            if (t == null) {
                hashCode = 0;
            } else {
                hashCode = t.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public final String toString() {
            return "Failure(error=" + this.a + ", data=" + this.b + ")";
        }
    }

    /* compiled from: Resource.kt */
    /* loaded from: classes2.dex */
    public static final class c<T> extends g<T> {
        public final T a;
        public final Long b;

        public c(T t, Long l) {
            this.a = t;
            this.b = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, cVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, cVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int i = 0;
            T t = this.a;
            if (t == null) {
                hashCode = 0;
            } else {
                hashCode = t.hashCode();
            }
            int i2 = hashCode * 31;
            Long l = this.b;
            if (l != null) {
                i = l.hashCode();
            }
            return i2 + i;
        }

        public final String toString() {
            return "Success(data=" + this.a + ", timestamp=" + this.b + ")";
        }
    }

    public final c<T> a() {
        if (this instanceof c) {
            return (c) this;
        }
        return null;
    }

    public final void b(com.amazon.aps.iva.xb0.l<? super Throwable, q> lVar) {
        if (this instanceof a) {
            lVar.invoke(((a) this).a);
        }
    }

    public final void c(com.amazon.aps.iva.xb0.l<? super T, q> lVar) {
        if (this instanceof b) {
            lVar.invoke((T) ((b) this).a);
        }
    }

    public final <R> g<R> d(com.amazon.aps.iva.xb0.l<? super T, ? extends R> lVar, com.amazon.aps.iva.xb0.l<? super T, ? extends R> lVar2) {
        g<R> aVar;
        com.amazon.aps.iva.yb0.j.f(lVar2, "transform");
        R r = null;
        if (this instanceof c) {
            return new c(lVar2.invoke((T) ((c) this).a), null);
        }
        if (this instanceof b) {
            if (lVar != null) {
                r = lVar.invoke((T) ((b) this).a);
            }
            aVar = new b<>(r);
        } else if (this instanceof a) {
            a aVar2 = (a) this;
            Object obj = (T) aVar2.b;
            if (obj != null) {
                r = lVar2.invoke(obj);
            }
            aVar = new a<>(r, aVar2.a);
        } else {
            throw new com.amazon.aps.iva.kb0.h();
        }
        return aVar;
    }

    public final void e(com.amazon.aps.iva.xb0.l<? super T, q> lVar) {
        if (this instanceof c) {
            lVar.invoke((T) ((c) this).a);
        }
    }

    /* compiled from: Resource.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> extends g<T> {
        public final T a;

        public b(T t) {
            this.a = t;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && com.amazon.aps.iva.yb0.j.a(this.a, ((b) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            T t = this.a;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public final String toString() {
            return "Loading(data=" + this.a + ")";
        }

        public b() {
            this(null);
        }
    }
}
