package com.amazon.aps.iva.me0;
/* compiled from: WrappedValues.java */
/* loaded from: classes4.dex */
public final class e {
    public static final a a = new a();

    /* compiled from: WrappedValues.java */
    /* loaded from: classes4.dex */
    public static class a {
        public final String toString() {
            return "NULL_VALUE";
        }
    }

    /* compiled from: WrappedValues.java */
    /* loaded from: classes4.dex */
    public static final class b {
        public final Throwable a;

        public b(Throwable th) {
            this.a = th;
        }

        public static /* synthetic */ void a(int i) {
            String str;
            int i2;
            if (i != 1) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i != 1) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            Object[] objArr = new Object[i2];
            if (i != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i != 1) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i != 1) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        public final String toString() {
            return this.a.toString();
        }
    }

    public static void a(Object obj) {
        if (obj instanceof b) {
            Throwable th = ((b) obj).a;
            if (th != null) {
                throw th;
            }
            b.a(1);
            throw null;
        }
    }
}
