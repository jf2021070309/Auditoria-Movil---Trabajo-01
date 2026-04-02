package com.amazon.aps.iva.v4;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* compiled from: UnsafeUtil.java */
/* loaded from: classes.dex */
public final class o1 {
    public static final Unsafe a;
    public static final Class<?> b;
    public static final e c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

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
        @Override // com.amazon.aps.iva.v4.o1.e
        public final boolean c(Object obj, long j) {
            if (o1.g) {
                if (o1.i(obj, j) != 0) {
                    return true;
                }
                return false;
            } else if (o1.j(obj, j) != 0) {
                return true;
            } else {
                return false;
            }
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final byte d(Object obj, long j) {
            if (o1.g) {
                return o1.i(obj, j);
            }
            return o1.j(obj, j);
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final double e(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final float f(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final void k(Object obj, long j, boolean z) {
            if (o1.g) {
                o1.r(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                o1.s(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final void l(Object obj, long j, byte b) {
            if (o1.g) {
                o1.r(obj, j, b);
            } else {
                o1.s(obj, j, b);
            }
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final void m(Object obj, long j, double d) {
            p(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final void n(Object obj, long j, float f) {
            o(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final boolean s() {
            return false;
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes.dex */
    public static final class c extends e {
        @Override // com.amazon.aps.iva.v4.o1.e
        public final boolean c(Object obj, long j) {
            if (o1.g) {
                if (o1.i(obj, j) != 0) {
                    return true;
                }
                return false;
            } else if (o1.j(obj, j) != 0) {
                return true;
            } else {
                return false;
            }
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final byte d(Object obj, long j) {
            if (o1.g) {
                return o1.i(obj, j);
            }
            return o1.j(obj, j);
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final double e(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final float f(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final void k(Object obj, long j, boolean z) {
            if (o1.g) {
                o1.r(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                o1.s(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final void l(Object obj, long j, byte b) {
            if (o1.g) {
                o1.r(obj, j, b);
            } else {
                o1.s(obj, j, b);
            }
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final void m(Object obj, long j, double d) {
            p(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final void n(Object obj, long j, float f) {
            o(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final boolean s() {
            return false;
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes.dex */
    public static final class d extends e {
        @Override // com.amazon.aps.iva.v4.o1.e
        public final boolean c(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final byte d(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final double e(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final float f(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final void k(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final void l(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final void m(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final void n(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        @Override // com.amazon.aps.iva.v4.o1.e
        public final boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                o1.a(th);
                return false;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.amazon.aps.iva.v4.o1.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean s() {
            /*
                r11 = this;
                java.lang.String r0 = "copyMemory"
                java.lang.String r1 = "getLong"
                sun.misc.Unsafe r2 = r11.a
                java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 != 0) goto Lf
            Ld:
                r7 = r6
                goto L37
            Lf:
                java.lang.Class r7 = r2.getClass()     // Catch: java.lang.Throwable -> L32
                java.lang.String r8 = "objectFieldOffset"
                java.lang.Class[] r9 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L32
                java.lang.Class<java.lang.reflect.Field> r10 = java.lang.reflect.Field.class
                r9[r6] = r10     // Catch: java.lang.Throwable -> L32
                r7.getMethod(r8, r9)     // Catch: java.lang.Throwable -> L32
                java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L32
                r8[r6] = r3     // Catch: java.lang.Throwable -> L32
                java.lang.Class r9 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L32
                r8[r5] = r9     // Catch: java.lang.Throwable -> L32
                r7.getMethod(r1, r8)     // Catch: java.lang.Throwable -> L32
                java.lang.reflect.Field r7 = com.amazon.aps.iva.v4.o1.e()     // Catch: java.lang.Throwable -> L32
                if (r7 != 0) goto L30
                goto Ld
            L30:
                r7 = r5
                goto L37
            L32:
                r7 = move-exception
                com.amazon.aps.iva.v4.o1.a(r7)
                goto Ld
            L37:
                if (r7 != 0) goto L3a
                return r6
            L3a:
                java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L9c
                java.lang.String r7 = "getByte"
                java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L9c
                java.lang.Class r9 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L9c
                r8[r6] = r9     // Catch: java.lang.Throwable -> L9c
                r2.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L9c
                java.lang.String r7 = "putByte"
                java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L9c
                r8[r6] = r9     // Catch: java.lang.Throwable -> L9c
                java.lang.Class r10 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L9c
                r8[r5] = r10     // Catch: java.lang.Throwable -> L9c
                r2.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L9c
                java.lang.String r7 = "getInt"
                java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L9c
                r8[r6] = r9     // Catch: java.lang.Throwable -> L9c
                r2.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L9c
                java.lang.String r7 = "putInt"
                java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L9c
                r8[r6] = r9     // Catch: java.lang.Throwable -> L9c
                java.lang.Class r10 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L9c
                r8[r5] = r10     // Catch: java.lang.Throwable -> L9c
                r2.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L9c
                java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L9c
                r7[r6] = r9     // Catch: java.lang.Throwable -> L9c
                r2.getMethod(r1, r7)     // Catch: java.lang.Throwable -> L9c
                java.lang.String r1 = "putLong"
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L9c
                r7[r6] = r9     // Catch: java.lang.Throwable -> L9c
                r7[r5] = r9     // Catch: java.lang.Throwable -> L9c
                r2.getMethod(r1, r7)     // Catch: java.lang.Throwable -> L9c
                r1 = 3
                java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L9c
                r7[r6] = r9     // Catch: java.lang.Throwable -> L9c
                r7[r5] = r9     // Catch: java.lang.Throwable -> L9c
                r7[r4] = r9     // Catch: java.lang.Throwable -> L9c
                r2.getMethod(r0, r7)     // Catch: java.lang.Throwable -> L9c
                r7 = 5
                java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L9c
                r7[r6] = r3     // Catch: java.lang.Throwable -> L9c
                r7[r5] = r9     // Catch: java.lang.Throwable -> L9c
                r7[r4] = r3     // Catch: java.lang.Throwable -> L9c
                r7[r1] = r9     // Catch: java.lang.Throwable -> L9c
                r1 = 4
                r7[r1] = r9     // Catch: java.lang.Throwable -> L9c
                r2.getMethod(r0, r7)     // Catch: java.lang.Throwable -> L9c
                return r5
            L9c:
                r0 = move-exception
                com.amazon.aps.iva.v4.o1.a(r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v4.o1.d.s():boolean");
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

        public boolean r() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                o1.a(th);
                return false;
            }
        }

        public abstract boolean s();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    static {
        /*
            sun.misc.Unsafe r0 = p()
            com.amazon.aps.iva.v4.o1.a = r0
            java.lang.Class<?> r1 = com.amazon.aps.iva.v4.d.a
            com.amazon.aps.iva.v4.o1.b = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = f(r1)
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = f(r2)
            if (r0 != 0) goto L19
            goto L2f
        L19:
            boolean r3 = com.amazon.aps.iva.v4.d.a()
            if (r3 == 0) goto L31
            if (r1 == 0) goto L27
            com.amazon.aps.iva.v4.o1$c r1 = new com.amazon.aps.iva.v4.o1$c
            r1.<init>(r0)
            goto L36
        L27:
            if (r2 == 0) goto L2f
            com.amazon.aps.iva.v4.o1$b r1 = new com.amazon.aps.iva.v4.o1$b
            r1.<init>(r0)
            goto L36
        L2f:
            r1 = 0
            goto L36
        L31:
            com.amazon.aps.iva.v4.o1$d r1 = new com.amazon.aps.iva.v4.o1$d
            r1.<init>(r0)
        L36:
            com.amazon.aps.iva.v4.o1.c = r1
            r0 = 0
            if (r1 != 0) goto L3d
            r2 = r0
            goto L41
        L3d:
            boolean r2 = r1.s()
        L41:
            com.amazon.aps.iva.v4.o1.d = r2
            if (r1 != 0) goto L47
            r2 = r0
            goto L4b
        L47:
            boolean r2 = r1.r()
        L4b:
            com.amazon.aps.iva.v4.o1.e = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = c(r2)
            long r2 = (long) r2
            com.amazon.aps.iva.v4.o1.f = r2
            java.lang.Class<boolean[]> r2 = boolean[].class
            c(r2)
            d(r2)
            java.lang.Class<int[]> r2 = int[].class
            c(r2)
            d(r2)
            java.lang.Class<long[]> r2 = long[].class
            c(r2)
            d(r2)
            java.lang.Class<float[]> r2 = float[].class
            c(r2)
            d(r2)
            java.lang.Class<double[]> r2 = double[].class
            c(r2)
            d(r2)
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            c(r2)
            d(r2)
            java.lang.reflect.Field r2 = e()
            if (r2 == 0) goto L92
            if (r1 != 0) goto L8f
            goto L92
        L8f:
            r1.j(r2)
        L92:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r2) goto L9b
            r0 = 1
        L9b:
            com.amazon.aps.iva.v4.o1.g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v4.o1.<clinit>():void");
    }

    public static void a(Throwable th) {
        Logger logger = Logger.getLogger(o1.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static <T> T b(Class<T> cls) {
        try {
            return (T) a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int c(Class<?> cls) {
        if (e) {
            return c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (e) {
            c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        if (com.amazon.aps.iva.v4.d.a()) {
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

    public static boolean f(Class<?> cls) {
        if (!com.amazon.aps.iva.v4.d.a()) {
            return false;
        }
        try {
            Class<?> cls2 = b;
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

    public static boolean g(Object obj, long j) {
        return c.c(obj, j);
    }

    public static byte h(byte[] bArr, long j) {
        return c.d(bArr, f + j);
    }

    public static byte i(Object obj, long j) {
        return (byte) ((m(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte j(Object obj, long j) {
        return (byte) ((m(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static double k(Object obj, long j) {
        return c.e(obj, j);
    }

    public static float l(Object obj, long j) {
        return c.f(obj, j);
    }

    public static int m(Object obj, long j) {
        return c.g(obj, j);
    }

    public static long n(Object obj, long j) {
        return c.h(obj, j);
    }

    public static Object o(Object obj, long j) {
        return c.i(obj, j);
    }

    public static Unsafe p() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void q(byte[] bArr, long j, byte b2) {
        c.l(bArr, f + j, b2);
    }

    public static void r(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int m = m(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        t(obj, j2, ((255 & b2) << i) | (m & (~(255 << i))));
    }

    public static void s(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        t(obj, j2, ((255 & b2) << i) | (m(obj, j2) & (~(255 << i))));
    }

    public static void t(Object obj, long j, int i) {
        c.o(obj, j, i);
    }

    public static void u(Object obj, long j, long j2) {
        c.p(obj, j, j2);
    }

    public static void v(Object obj, long j, Object obj2) {
        c.q(obj, j, obj2);
    }
}
