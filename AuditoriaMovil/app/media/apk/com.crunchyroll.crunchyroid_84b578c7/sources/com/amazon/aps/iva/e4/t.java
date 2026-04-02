package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.c0;
import com.amazon.aps.iva.e4.q0;
import com.amazon.aps.iva.e4.t.b;
import com.amazon.aps.iva.e4.x;
import com.amazon.aps.iva.e4.z;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;
/* compiled from: FieldSet.java */
/* loaded from: classes.dex */
public final class t<T extends b<T>> {
    public static final t d = new t(0);
    public final j1<T, Object> a;
    public boolean b;
    public boolean c;

    /* compiled from: FieldSet.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[u1.values().length];
            b = iArr;
            try {
                iArr[u1.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[u1.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[u1.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[u1.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[u1.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[u1.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[u1.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[u1.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[u1.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[u1.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[u1.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[u1.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[u1.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[u1.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[u1.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[u1.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[u1.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[u1.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[v1.values().length];
            a = iArr2;
            try {
                iArr2[v1.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[v1.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[v1.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[v1.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[v1.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[v1.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[v1.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[v1.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[v1.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    /* loaded from: classes.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        x.a g(q0.a aVar, q0 q0Var);

        v1 getLiteJavaType();

        void getLiteType();

        void getNumber();

        void isPacked();

        void isRepeated();
    }

    public t() {
        int i = j1.i;
        this.a = new i1(16);
    }

    public static int b(u1 u1Var, int i, Object obj) {
        int t = l.t(i);
        if (u1Var == u1.GROUP) {
            t *= 2;
        }
        return c(u1Var, obj) + t;
    }

    public static int c(u1 u1Var, Object obj) {
        switch (a.b[u1Var.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                Logger logger = l.b;
                return 8;
            case 2:
                ((Float) obj).floatValue();
                Logger logger2 = l.b;
                return 4;
            case 3:
                return l.x(((Long) obj).longValue());
            case 4:
                return l.x(((Long) obj).longValue());
            case 5:
                return l.k(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                Logger logger3 = l.b;
                return 8;
            case 7:
                ((Integer) obj).intValue();
                Logger logger4 = l.b;
                return 4;
            case 8:
                ((Boolean) obj).booleanValue();
                Logger logger5 = l.b;
                return 1;
            case 9:
                Logger logger6 = l.b;
                return ((q0) obj).getSerializedSize();
            case 10:
                if (obj instanceof c0) {
                    return l.m((c0) obj);
                }
                Logger logger7 = l.b;
                int serializedSize = ((q0) obj).getSerializedSize();
                return l.v(serializedSize) + serializedSize;
            case 11:
                if (obj instanceof i) {
                    Logger logger8 = l.b;
                    int size = ((i) obj).size();
                    return l.v(size) + size;
                }
                return l.s((String) obj);
            case 12:
                if (obj instanceof i) {
                    Logger logger9 = l.b;
                    int size2 = ((i) obj).size();
                    return l.v(size2) + size2;
                }
                Logger logger10 = l.b;
                int length = ((byte[]) obj).length;
                return l.v(length) + length;
            case 13:
                return l.v(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger11 = l.b;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger12 = l.b;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return l.v((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return l.x((longValue >> 63) ^ (longValue << 1));
            case 18:
                if (obj instanceof z.a) {
                    return l.k(((z.a) obj).getNumber());
                }
                return l.k(((Integer) obj).intValue());
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
        if (bVar.getLiteJavaType() == v1.MESSAGE) {
            bVar.isRepeated();
            bVar.isPacked();
            if (value instanceof c0) {
                ((b) entry.getKey()).getNumber();
                return l.m((c0) value) + l.t(3) + l.u(2, 0) + (l.t(1) * 2);
            }
            ((b) entry.getKey()).getNumber();
            int u = l.u(2, 0) + (l.t(1) * 2);
            int t = l.t(3);
            int serializedSize = ((q0) value).getSerializedSize();
            return l.v(serializedSize) + serializedSize + t + u;
        }
        return d(bVar, value);
    }

    public static <T extends b<T>> boolean j(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() == v1.MESSAGE) {
            key.isRepeated();
            Object value = entry.getValue();
            if (value instanceof q0) {
                if (!((q0) value).isInitialized()) {
                    return false;
                }
            } else if (value instanceof c0) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if ((r2 instanceof com.amazon.aps.iva.e4.z.a) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        if ((r2 instanceof byte[]) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
        if ((r2 instanceof com.amazon.aps.iva.e4.c0) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(com.amazon.aps.iva.e4.u1 r1, java.lang.Object r2) {
        /*
            java.nio.charset.Charset r0 = com.amazon.aps.iva.e4.z.a
            r2.getClass()
            int[] r0 = com.amazon.aps.iva.e4.t.a.a
            com.amazon.aps.iva.e4.v1 r1 = r1.getJavaType()
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 0
            switch(r1) {
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L3c;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L33;
                case 7: goto L28;
                case 8: goto L1f;
                case 9: goto L16;
                default: goto L15;
            }
        L15:
            goto L44
        L16:
            boolean r1 = r2 instanceof com.amazon.aps.iva.e4.q0
            if (r1 != 0) goto L30
            boolean r1 = r2 instanceof com.amazon.aps.iva.e4.c0
            if (r1 == 0) goto L44
            goto L30
        L1f:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L30
            boolean r1 = r2 instanceof com.amazon.aps.iva.e4.z.a
            if (r1 == 0) goto L44
            goto L30
        L28:
            boolean r1 = r2 instanceof com.amazon.aps.iva.e4.i
            if (r1 != 0) goto L30
            boolean r1 = r2 instanceof byte[]
            if (r1 == 0) goto L44
        L30:
            r1 = 1
            r0 = r1
            goto L44
        L33:
            boolean r0 = r2 instanceof java.lang.String
            goto L44
        L36:
            boolean r0 = r2 instanceof java.lang.Boolean
            goto L44
        L39:
            boolean r0 = r2 instanceof java.lang.Double
            goto L44
        L3c:
            boolean r0 = r2 instanceof java.lang.Float
            goto L44
        L3f:
            boolean r0 = r2 instanceof java.lang.Long
            goto L44
        L42:
            boolean r0 = r2 instanceof java.lang.Integer
        L44:
            if (r0 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e4.t.n(com.amazon.aps.iva.e4.u1, java.lang.Object):void");
    }

    public static void o(l lVar, u1 u1Var, int i, Object obj) throws IOException {
        if (u1Var == u1.GROUP) {
            lVar.Q(i, 3);
            ((q0) obj).b(lVar);
            lVar.Q(i, 4);
            return;
        }
        lVar.Q(i, u1Var.getWireType());
        switch (a.b[u1Var.ordinal()]) {
            case 1:
                lVar.H(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 2:
                lVar.F(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 3:
                lVar.U(((Long) obj).longValue());
                return;
            case 4:
                lVar.U(((Long) obj).longValue());
                return;
            case 5:
                lVar.J(((Integer) obj).intValue());
                return;
            case 6:
                lVar.H(((Long) obj).longValue());
                return;
            case 7:
                lVar.F(((Integer) obj).intValue());
                return;
            case 8:
                lVar.z(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 9:
                ((q0) obj).b(lVar);
                return;
            case 10:
                lVar.L((q0) obj);
                return;
            case 11:
                if (obj instanceof i) {
                    lVar.D((i) obj);
                    return;
                } else {
                    lVar.P((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof i) {
                    lVar.D((i) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                lVar.B(bArr, bArr.length);
                return;
            case 13:
                lVar.S(((Integer) obj).intValue());
                return;
            case 14:
                lVar.F(((Integer) obj).intValue());
                return;
            case 15:
                lVar.H(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                lVar.S((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                lVar.U((longValue >> 63) ^ (longValue << 1));
                return;
            case 18:
                if (obj instanceof z.a) {
                    lVar.J(((z.a) obj).getNumber());
                    return;
                } else {
                    lVar.J(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: a */
    public final t<T> clone() {
        j1<T, Object> j1Var;
        t<T> tVar = new t<>();
        int i = 0;
        while (true) {
            j1Var = this.a;
            if (i >= j1Var.e()) {
                break;
            }
            Map.Entry<T, Object> d2 = j1Var.d(i);
            tVar.m(d2.getKey(), d2.getValue());
            i++;
        }
        for (Map.Entry<T, Object> entry : j1Var.g()) {
            tVar.m(entry.getKey(), entry.getValue());
        }
        tVar.c = this.c;
        return tVar;
    }

    public final Object e(T t) {
        Object obj = this.a.get(t);
        if (obj instanceof c0) {
            return ((c0) obj).a(null);
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        return this.a.equals(((t) obj).a);
    }

    public final int g() {
        j1<T, Object> j1Var;
        int i = 0;
        int i2 = 0;
        while (true) {
            j1Var = this.a;
            if (i >= j1Var.e()) {
                break;
            }
            Map.Entry<T, Object> d2 = j1Var.d(i);
            i2 += d(d2.getKey(), d2.getValue());
            i++;
        }
        for (Map.Entry<T, Object> entry : j1Var.g()) {
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
            j1<T, Object> j1Var = this.a;
            if (i < j1Var.e()) {
                if (!j(j1Var.d(i))) {
                    return false;
                }
                i++;
            } else {
                for (Map.Entry<T, Object> entry : j1Var.g()) {
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
        j1<T, Object> j1Var = this.a;
        if (z) {
            return new c0.b(j1Var.entrySet().iterator());
        }
        return j1Var.entrySet().iterator();
    }

    public final void l(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        byte[] value = entry.getValue();
        if (value instanceof c0) {
            value = ((c0) value).a(null);
        }
        key.isRepeated();
        v1 liteJavaType = key.getLiteJavaType();
        v1 v1Var = v1.MESSAGE;
        j1<T, Object> j1Var = this.a;
        if (liteJavaType == v1Var) {
            Object e = e(key);
            if (e == null) {
                if (value instanceof byte[]) {
                    byte[] bArr = (byte[]) value;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    value = bArr2;
                }
                j1Var.put(key, value);
                return;
            }
            j1Var.put(key, key.g(((q0) e).toBuilder(), (q0) value).c());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr3 = (byte[]) value;
            byte[] bArr4 = new byte[bArr3.length];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            value = bArr4;
        }
        j1Var.put(key, value);
    }

    public final void m(T t, Object obj) {
        t.isRepeated();
        t.getLiteType();
        n(null, obj);
        if (obj instanceof c0) {
            this.c = true;
        }
        this.a.put(t, obj);
    }

    public t(int i) {
        int i2 = j1.i;
        i1 i1Var = new i1(0);
        this.a = i1Var;
        if (!this.b) {
            i1Var.i();
            this.b = true;
        }
        if (this.b) {
            return;
        }
        i1Var.i();
        this.b = true;
    }
}
