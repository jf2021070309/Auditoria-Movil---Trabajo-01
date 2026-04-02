package com.amazon.aps.iva.v4;

import com.amazon.aps.iva.v4.b0;
import com.amazon.aps.iva.v4.p0;
import com.amazon.aps.iva.v4.s.b;
import com.amazon.aps.iva.v4.w;
import com.amazon.aps.iva.v4.y;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;
/* compiled from: FieldSet.java */
/* loaded from: classes.dex */
public final class s<T extends b<T>> {
    public static final s d = new s(0);
    public final h1<T, Object> a;
    public boolean b;
    public boolean c;

    /* compiled from: FieldSet.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[r1.values().length];
            b = iArr;
            try {
                iArr[r1.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[r1.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[r1.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[r1.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[r1.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[r1.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[r1.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[r1.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[r1.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[r1.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[r1.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[r1.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[r1.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[r1.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[r1.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[r1.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[r1.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[r1.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[s1.values().length];
            a = iArr2;
            try {
                iArr2[s1.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[s1.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[s1.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[s1.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[s1.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[s1.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[s1.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[s1.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[s1.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    /* loaded from: classes.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        w.a d(p0.a aVar, p0 p0Var);

        s1 getLiteJavaType();

        void getLiteType();

        void getNumber();

        void isPacked();

        void isRepeated();
    }

    public s() {
        int i = h1.i;
        this.a = new g1(16);
    }

    public static int b(r1 r1Var, int i, Object obj) {
        int t = k.t(i);
        if (r1Var == r1.GROUP) {
            t *= 2;
        }
        return c(r1Var, obj) + t;
    }

    public static int c(r1 r1Var, Object obj) {
        switch (a.b[r1Var.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                Logger logger = k.b;
                return 8;
            case 2:
                ((Float) obj).floatValue();
                Logger logger2 = k.b;
                return 4;
            case 3:
                return k.x(((Long) obj).longValue());
            case 4:
                return k.x(((Long) obj).longValue());
            case 5:
                return k.k(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                Logger logger3 = k.b;
                return 8;
            case 7:
                ((Integer) obj).intValue();
                Logger logger4 = k.b;
                return 4;
            case 8:
                ((Boolean) obj).booleanValue();
                Logger logger5 = k.b;
                return 1;
            case 9:
                Logger logger6 = k.b;
                return ((p0) obj).getSerializedSize();
            case 10:
                if (obj instanceof b0) {
                    return k.m((b0) obj);
                }
                Logger logger7 = k.b;
                int serializedSize = ((p0) obj).getSerializedSize();
                return k.v(serializedSize) + serializedSize;
            case 11:
                if (obj instanceof h) {
                    Logger logger8 = k.b;
                    int size = ((h) obj).size();
                    return k.v(size) + size;
                }
                return k.s((String) obj);
            case 12:
                if (obj instanceof h) {
                    Logger logger9 = k.b;
                    int size2 = ((h) obj).size();
                    return k.v(size2) + size2;
                }
                Logger logger10 = k.b;
                int length = ((byte[]) obj).length;
                return k.v(length) + length;
            case 13:
                return k.v(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger11 = k.b;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger12 = k.b;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return k.v((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return k.x((longValue >> 63) ^ (longValue << 1));
            case 18:
                if (obj instanceof y.a) {
                    return k.k(((y.a) obj).getNumber());
                }
                return k.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b<?> bVar, Object obj) {
        bVar.getLiteType();
        bVar.getNumber();
        bVar.isRepeated();
        return b(null, 0, obj);
    }

    public static int f(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.getLiteJavaType() == s1.MESSAGE) {
            bVar.isRepeated();
            bVar.isPacked();
            if (value instanceof b0) {
                ((b) entry.getKey()).getNumber();
                return k.m((b0) value) + k.t(3) + k.u(2, 0) + (k.t(1) * 2);
            }
            ((b) entry.getKey()).getNumber();
            int u = k.u(2, 0) + (k.t(1) * 2);
            int t = k.t(3);
            int serializedSize = ((p0) value).getSerializedSize();
            return k.v(serializedSize) + serializedSize + t + u;
        }
        return d(bVar, value);
    }

    public static <T extends b<T>> boolean j(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() == s1.MESSAGE) {
            key.isRepeated();
            Object value = entry.getValue();
            if (value instanceof p0) {
                if (!((p0) value).isInitialized()) {
                    return false;
                }
            } else if (value instanceof b0) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    public static void n(b bVar, Object obj) {
        bVar.getLiteType();
        Charset charset = y.a;
        obj.getClass();
        int[] iArr = a.a;
        throw null;
    }

    /* renamed from: a */
    public final s<T> clone() {
        h1<T, Object> h1Var;
        s<T> sVar = new s<>();
        int i = 0;
        while (true) {
            h1Var = this.a;
            if (i >= h1Var.e()) {
                break;
            }
            Map.Entry<T, Object> d2 = h1Var.d(i);
            sVar.m(d2.getKey(), d2.getValue());
            i++;
        }
        for (Map.Entry<T, Object> entry : h1Var.g()) {
            sVar.m(entry.getKey(), entry.getValue());
        }
        sVar.c = this.c;
        return sVar;
    }

    public final Object e(T t) {
        Object obj = this.a.get(t);
        if (obj instanceof b0) {
            return ((b0) obj).a(null);
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        return this.a.equals(((s) obj).a);
    }

    public final int g() {
        h1<T, Object> h1Var;
        int i = 0;
        int i2 = 0;
        while (true) {
            h1Var = this.a;
            if (i >= h1Var.e()) {
                break;
            }
            Map.Entry<T, Object> d2 = h1Var.d(i);
            i2 += d(d2.getKey(), d2.getValue());
            i++;
        }
        for (Map.Entry<T, Object> entry : h1Var.g()) {
            i2 += d(entry.getKey(), entry.getValue());
        }
        return i2;
    }

    public final boolean h() {
        return this.a.isEmpty();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean i() {
        int i = 0;
        while (true) {
            h1<T, Object> h1Var = this.a;
            if (i < h1Var.e()) {
                if (!j(h1Var.d(i))) {
                    return false;
                }
                i++;
            } else {
                for (Map.Entry<T, Object> entry : h1Var.g()) {
                    if (!j(entry)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public final Iterator<Map.Entry<T, Object>> k() {
        boolean z = this.c;
        h1<T, Object> h1Var = this.a;
        if (z) {
            return new b0.b(h1Var.entrySet().iterator());
        }
        return h1Var.entrySet().iterator();
    }

    public final void l(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        byte[] value = entry.getValue();
        if (value instanceof b0) {
            value = ((b0) value).a(null);
        }
        key.isRepeated();
        s1 liteJavaType = key.getLiteJavaType();
        s1 s1Var = s1.MESSAGE;
        h1<T, Object> h1Var = this.a;
        if (liteJavaType == s1Var) {
            Object e = e(key);
            if (e == null) {
                if (value instanceof byte[]) {
                    byte[] bArr = (byte[]) value;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    value = bArr2;
                }
                h1Var.put(key, value);
                return;
            }
            h1Var.put(key, key.d(((p0) e).toBuilder(), (p0) value).c());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr3 = (byte[]) value;
            byte[] bArr4 = new byte[bArr3.length];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            value = bArr4;
        }
        h1Var.put(key, value);
    }

    public final void m(T t, Object obj) {
        t.isRepeated();
        n(t, obj);
        throw null;
    }

    public s(int i) {
        int i2 = h1.i;
        g1 g1Var = new g1(0);
        this.a = g1Var;
        if (!this.b) {
            g1Var.i();
            this.b = true;
        }
        if (this.b) {
            return;
        }
        g1Var.i();
        this.b = true;
    }
}
