package com.amazon.aps.iva.e4;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* compiled from: UnsafeUtil.java */
/* loaded from: classes.dex */
public final class r1 {
    public static final Logger a = Logger.getLogger(r1.class.getName());
    public static final Unsafe b;
    public static final Class<?> c;
    public static final e d;
    public static final boolean e;
    public static final boolean f;
    public static final long g;
    public static final boolean h;

    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes.dex */
    public static class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() throws Exception {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            return a();
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes.dex */
    public static final class b extends e {
        @Override // com.amazon.aps.iva.e4.r1.e
        public final boolean c(Object obj, long j) {
            if (r1.h) {
                if (r1.h(obj, j) != 0) {
                    return true;
                }
                return false;
            } else if (r1.i(obj, j) != 0) {
                return true;
            } else {
                return false;
            }
        }

        @Override // com.amazon.aps.iva.e4.r1.e
        public final byte d(Object obj, long j) {
            if (r1.h) {
                return r1.h(obj, j);
            }
            return r1.i(obj, j);
        }

        @Override // com.amazon.aps.iva.e4.r1.e
        public final double e(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        @Override // com.amazon.aps.iva.e4.r1.e
        public final float f(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        @Override // com.amazon.aps.iva.e4.r1.e
        public final void k(Object obj, long j, boolean z) {
            if (r1.h) {
                r1.q(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                r1.r(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.amazon.aps.iva.e4.r1.e
        public final void l(Object obj, long j, byte b) {
            if (r1.h) {
                r1.q(obj, j, b);
            } else {
                r1.r(obj, j, b);
            }
        }

        @Override // com.amazon.aps.iva.e4.r1.e
        public final void m(Object obj, long j, double d) {
            p(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.amazon.aps.iva.e4.r1.e
        public final void n(Object obj, long j, float f) {
            o(obj, j, Float.floatToIntBits(f));
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes.dex */
    public static final class c extends e {
        @Override // com.amazon.aps.iva.e4.r1.e
        public final boolean c(Object obj, long j) {
            if (r1.h) {
                if (r1.h(obj, j) != 0) {
                    return true;
                }
                return false;
            } else if (r1.i(obj, j) != 0) {
                return true;
            } else {
                return false;
            }
        }

        @Override // com.amazon.aps.iva.e4.r1.e
        public final byte d(Object obj, long j) {
            if (r1.h) {
                return r1.h(obj, j);
            }
            return r1.i(obj, j);
        }

        @Override // com.amazon.aps.iva.e4.r1.e
        public final double e(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        @Override // com.amazon.aps.iva.e4.r1.e
        public final float f(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        @Override // com.amazon.aps.iva.e4.r1.e
        public final void k(Object obj, long j, boolean z) {
            if (r1.h) {
                r1.q(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                r1.r(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.amazon.aps.iva.e4.r1.e
        public final void l(Object obj, long j, byte b) {
            if (r1.h) {
                r1.q(obj, j, b);
            } else {
                r1.r(obj, j, b);
            }
        }

        @Override // com.amazon.aps.iva.e4.r1.e
        public final void m(Object obj, long j, double d) {
            p(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.amazon.aps.iva.e4.r1.e
        public final void n(Object obj, long j, float f) {
            o(obj, j, Float.floatToIntBits(f));
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes.dex */
    public static final class d extends e {
        @Override // com.amazon.aps.iva.e4.r1.e
        public final boolean c(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        @Override // com.amazon.aps.iva.e4.r1.e
        public final byte d(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        @Override // com.amazon.aps.iva.e4.r1.e
        public final double e(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        @Override // com.amazon.aps.iva.e4.r1.e
        public final float f(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        @Override // com.amazon.aps.iva.e4.r1.e
        public final void k(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // com.amazon.aps.iva.e4.r1.e
        public final void l(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // com.amazon.aps.iva.e4.r1.e
        public final void m(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // com.amazon.aps.iva.e4.r1.e
        public final void n(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes.dex */
    public static abstract class e {
        public final Unsafe a;

        public e(Unsafe unsafe) {
            this.a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j);

        public abstract byte d(Object obj, long j);

        public abstract double e(Object obj, long j);

        public abstract float f(Object obj, long j);

        public final int g(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public final long h(Object obj, long j) {
            return this.a.getLong(obj, j);
        }

        public final Object i(Object obj, long j) {
            return this.a.getObject(obj, j);
        }

        public final long j(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j, boolean z);

        public abstract void l(Object obj, long j, byte b);

        public abstract void m(Object obj, long j, double d);

        public abstract void n(Object obj, long j, float f);

        public final void o(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public final void p(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public final void q(Object obj, long j, Object obj2) {
            this.a.putObject(obj, j, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e4.r1.<clinit>():void");
    }

    public static <T> T a(Class<T> cls) {
        try {
            return (T) b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int b(Class<?> cls) {
        if (f) {
            return d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f) {
            d.b(cls);
        }
    }

    public static Field d() {
        Field field;
        Field field2;
        if (com.amazon.aps.iva.e4.d.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean e(Class<?> cls) {
        if (!com.amazon.aps.iva.e4.d.a()) {
            return false;
        }
        try {
            Class<?> cls2 = c;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean f(Object obj, long j) {
        return d.c(obj, j);
    }

    public static byte g(byte[] bArr, long j) {
        return d.d(bArr, g + j);
    }

    public static byte h(Object obj, long j) {
        return (byte) ((l(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte i(Object obj, long j) {
        return (byte) ((l(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static double j(Object obj, long j) {
        return d.e(obj, j);
    }

    public static float k(Object obj, long j) {
        return d.f(obj, j);
    }

    public static int l(Object obj, long j) {
        return d.g(obj, j);
    }

    public static long m(Object obj, long j) {
        return d.h(obj, j);
    }

    public static Object n(Object obj, long j) {
        return d.i(obj, j);
    }

    public static Unsafe o() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void p(byte[] bArr, long j, byte b2) {
        d.l(bArr, g + j, b2);
    }

    public static void q(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int l = l(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        s(obj, j2, ((255 & b2) << i) | (l & (~(255 << i))));
    }

    public static void r(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        s(obj, j2, ((255 & b2) << i) | (l(obj, j2) & (~(255 << i))));
    }

    public static void s(Object obj, long j, int i) {
        d.o(obj, j, i);
    }

    public static void t(Object obj, long j, long j2) {
        d.p(obj, j, j2);
    }

    public static void u(Object obj, long j, Object obj2) {
        d.q(obj, j, obj2);
    }
}
