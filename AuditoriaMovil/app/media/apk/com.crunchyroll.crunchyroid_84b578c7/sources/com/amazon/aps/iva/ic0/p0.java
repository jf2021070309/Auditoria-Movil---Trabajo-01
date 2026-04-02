package com.amazon.aps.iva.ic0;

import java.lang.ref.SoftReference;
/* compiled from: ReflectProperties.java */
/* loaded from: classes4.dex */
public final class p0 {

    /* compiled from: ReflectProperties.java */
    /* loaded from: classes4.dex */
    public static class a<T> extends c<T> implements com.amazon.aps.iva.xb0.a<T> {
        public final com.amazon.aps.iva.xb0.a<T> c;
        public volatile SoftReference<Object> d;

        public a(T t, com.amazon.aps.iva.xb0.a<T> aVar) {
            if (aVar != null) {
                this.d = null;
                this.c = aVar;
                if (t != null) {
                    this.d = new SoftReference<>(t);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final T invoke() {
            T t;
            SoftReference<Object> softReference = this.d;
            c.a aVar = c.b;
            if (softReference != null && (t = (T) softReference.get()) != null) {
                if (t == aVar) {
                    return null;
                }
                return t;
            }
            T invoke = this.c.invoke();
            if (invoke != null) {
                aVar = invoke;
            }
            this.d = new SoftReference<>(aVar);
            return invoke;
        }
    }

    /* compiled from: ReflectProperties.java */
    /* loaded from: classes4.dex */
    public static class b<T> extends c<T> {
        public final com.amazon.aps.iva.xb0.a<T> c;
        public volatile Object d = null;

        public b(com.amazon.aps.iva.xb0.a<T> aVar) {
            this.c = aVar;
        }

        public final T invoke() {
            T t = (T) this.d;
            c.a aVar = c.b;
            if (t != null) {
                if (t == aVar) {
                    return null;
                }
                return t;
            }
            T invoke = this.c.invoke();
            if (invoke != null) {
                aVar = invoke;
            }
            this.d = aVar;
            return invoke;
        }
    }

    /* compiled from: ReflectProperties.java */
    /* loaded from: classes4.dex */
    public static abstract class c<T> {
        public static final a b = new a();

        /* compiled from: ReflectProperties.java */
        /* loaded from: classes4.dex */
        public static class a {
        }
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i != 1 && i != 2) {
            objArr[2] = "lazy";
        } else {
            objArr[2] = "lazySoft";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static <T> b<T> b(com.amazon.aps.iva.xb0.a<T> aVar) {
        return new b<>(aVar);
    }

    public static <T> a<T> c(com.amazon.aps.iva.xb0.a<T> aVar) {
        if (aVar != null) {
            return new a<>(null, aVar);
        }
        a(2);
        throw null;
    }
}
