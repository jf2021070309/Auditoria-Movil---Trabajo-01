package com.amazon.aps.iva.od0;

import com.amazon.aps.iva.od0.g.b;
import com.amazon.aps.iva.od0.h;
import com.amazon.aps.iva.od0.i;
import com.amazon.aps.iva.od0.p;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.codec.binary.Hex;
/* compiled from: FieldSet.java */
/* loaded from: classes4.dex */
public final class g<FieldDescriptorType extends b<FieldDescriptorType>> {
    public static final g d = new g(0);
    public final t a;
    public boolean b;
    public boolean c = false;

    /* compiled from: FieldSet.java */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[y.values().length];
            b = iArr;
            try {
                iArr[y.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[y.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[y.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[y.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[y.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[y.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[y.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[y.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[y.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[y.BYTES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[y.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[y.SFIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[y.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[y.SINT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[y.SINT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[y.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[y.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[y.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[z.values().length];
            a = iArr2;
            try {
                iArr2[z.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[z.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[z.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[z.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[z.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[z.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[z.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[z.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[z.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    /* loaded from: classes4.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        h.b e(p.a aVar, p pVar);

        z getLiteJavaType();

        y getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    public g() {
        int i = u.g;
        this.a = new t(16);
    }

    public static int c(y yVar, Object obj) {
        switch (a.b[yVar.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                return 8;
            case 2:
                ((Float) obj).floatValue();
                return 4;
            case 3:
                return e.g(((Long) obj).longValue());
            case 4:
                return e.g(((Long) obj).longValue());
            case 5:
                return e.c(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                return 8;
            case 7:
                ((Integer) obj).intValue();
                return 4;
            case 8:
                ((Boolean) obj).booleanValue();
                return 1;
            case 9:
                try {
                    byte[] bytes = ((String) obj).getBytes(Hex.DEFAULT_CHARSET_NAME);
                    return e.f(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported.", e);
                }
            case 10:
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    return cVar.size() + e.f(cVar.size());
                }
                byte[] bArr = (byte[]) obj;
                return e.f(bArr.length) + bArr.length;
            case 11:
                return e.f(((Integer) obj).intValue());
            case 12:
                ((Integer) obj).intValue();
                return 4;
            case 13:
                ((Long) obj).longValue();
                return 8;
            case 14:
                int intValue = ((Integer) obj).intValue();
                return e.f((intValue >> 31) ^ (intValue << 1));
            case 15:
                long longValue = ((Long) obj).longValue();
                return e.g((longValue >> 63) ^ (longValue << 1));
            case 16:
                return ((p) obj).getSerializedSize();
            case 17:
                if (obj instanceof k) {
                    k kVar = (k) obj;
                    if (kVar.a) {
                        int serializedSize = kVar.b.getSerializedSize();
                        return e.f(serializedSize) + serializedSize;
                    }
                    throw null;
                }
                return e.e((p) obj);
            case 18:
                if (obj instanceof i.a) {
                    return e.c(((i.a) obj).getNumber());
                }
                return e.c(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b<?> bVar, Object obj) {
        y liteType = bVar.getLiteType();
        int number = bVar.getNumber();
        if (bVar.isRepeated()) {
            int i = 0;
            if (bVar.isPacked()) {
                for (Object obj2 : (List) obj) {
                    i += c(liteType, obj2);
                }
                return e.f(i) + e.h(number) + i;
            }
            for (Object obj3 : (List) obj) {
                int h = e.h(number);
                if (liteType == y.GROUP) {
                    h *= 2;
                }
                i += c(liteType, obj3) + h;
            }
            return i;
        }
        int h2 = e.h(number);
        if (liteType == y.GROUP) {
            h2 *= 2;
        }
        return c(liteType, obj) + h2;
    }

    public static boolean f(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        if (bVar.getLiteJavaType() == z.MESSAGE) {
            if (bVar.isRepeated()) {
                for (p pVar : (List) entry.getValue()) {
                    if (!pVar.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof p) {
                    if (!((p) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof k) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public static Object i(d dVar, y yVar) throws IOException {
        boolean z = true;
        switch (a.b[yVar.ordinal()]) {
            case 1:
                return Double.valueOf(Double.longBitsToDouble(dVar.j()));
            case 2:
                return Float.valueOf(Float.intBitsToFloat(dVar.i()));
            case 3:
                return Long.valueOf(dVar.l());
            case 4:
                return Long.valueOf(dVar.l());
            case 5:
                return Integer.valueOf(dVar.k());
            case 6:
                return Long.valueOf(dVar.j());
            case 7:
                return Integer.valueOf(dVar.i());
            case 8:
                if (dVar.l() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                int k = dVar.k();
                int i = dVar.b;
                int i2 = dVar.d;
                if (k <= i - i2 && k > 0) {
                    String str = new String(dVar.a, i2, k, Hex.DEFAULT_CHARSET_NAME);
                    dVar.d += k;
                    return str;
                } else if (k == 0) {
                    return "";
                } else {
                    return new String(dVar.h(k), Hex.DEFAULT_CHARSET_NAME);
                }
            case 10:
                return dVar.e();
            case 11:
                return Integer.valueOf(dVar.k());
            case 12:
                return Integer.valueOf(dVar.i());
            case 13:
                return Long.valueOf(dVar.j());
            case 14:
                int k2 = dVar.k();
                return Integer.valueOf((-(k2 & 1)) ^ (k2 >>> 1));
            case 15:
                long l = dVar.l();
                return Long.valueOf((-(l & 1)) ^ (l >>> 1));
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        if ((r3 instanceof com.amazon.aps.iva.od0.i.a) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        if ((r3 instanceof byte[]) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if ((r3 instanceof com.amazon.aps.iva.od0.k) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(com.amazon.aps.iva.od0.y r2, java.lang.Object r3) {
        /*
            r3.getClass()
            int[] r0 = com.amazon.aps.iva.od0.g.a.a
            com.amazon.aps.iva.od0.z r2 = r2.getJavaType()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L3c;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L33;
                case 7: goto L27;
                case 8: goto L1e;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r2 = r3 instanceof com.amazon.aps.iva.od0.p
            if (r2 != 0) goto L31
            boolean r2 = r3 instanceof com.amazon.aps.iva.od0.k
            if (r2 == 0) goto L30
            goto L31
        L1e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L31
            boolean r2 = r3 instanceof com.amazon.aps.iva.od0.i.a
            if (r2 == 0) goto L30
            goto L31
        L27:
            boolean r2 = r3 instanceof com.amazon.aps.iva.od0.c
            if (r2 != 0) goto L31
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L30
            goto L31
        L30:
            r0 = r1
        L31:
            r1 = r0
            goto L44
        L33:
            boolean r1 = r3 instanceof java.lang.String
            goto L44
        L36:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L44
        L39:
            boolean r1 = r3 instanceof java.lang.Double
            goto L44
        L3c:
            boolean r1 = r3 instanceof java.lang.Float
            goto L44
        L3f:
            boolean r1 = r3 instanceof java.lang.Long
            goto L44
        L42:
            boolean r1 = r3 instanceof java.lang.Integer
        L44:
            if (r1 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.od0.g.k(com.amazon.aps.iva.od0.y, java.lang.Object):void");
    }

    public static void l(e eVar, y yVar, int i, Object obj) throws IOException {
        if (yVar == y.GROUP) {
            eVar.x(i, 3);
            ((p) obj).a(eVar);
            eVar.x(i, 4);
            return;
        }
        eVar.x(i, yVar.getWireType());
        m(eVar, yVar, obj);
    }

    public static void m(e eVar, y yVar, Object obj) throws IOException {
        switch (a.b[yVar.ordinal()]) {
            case 1:
                double doubleValue = ((Double) obj).doubleValue();
                eVar.getClass();
                eVar.u(Double.doubleToRawLongBits(doubleValue));
                return;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                eVar.getClass();
                eVar.t(Float.floatToRawIntBits(floatValue));
                return;
            case 3:
                eVar.w(((Long) obj).longValue());
                return;
            case 4:
                eVar.w(((Long) obj).longValue());
                return;
            case 5:
                eVar.n(((Integer) obj).intValue());
                return;
            case 6:
                eVar.u(((Long) obj).longValue());
                return;
            case 7:
                eVar.t(((Integer) obj).intValue());
                return;
            case 8:
                eVar.q(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case 9:
                eVar.getClass();
                byte[] bytes = ((String) obj).getBytes(Hex.DEFAULT_CHARSET_NAME);
                eVar.v(bytes.length);
                eVar.s(bytes);
                return;
            case 10:
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    eVar.getClass();
                    eVar.v(cVar.size());
                    eVar.r(cVar);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                eVar.getClass();
                eVar.v(bArr.length);
                eVar.s(bArr);
                return;
            case 11:
                eVar.v(((Integer) obj).intValue());
                return;
            case 12:
                eVar.t(((Integer) obj).intValue());
                return;
            case 13:
                eVar.u(((Long) obj).longValue());
                return;
            case 14:
                int intValue = ((Integer) obj).intValue();
                eVar.v((intValue >> 31) ^ (intValue << 1));
                return;
            case 15:
                long longValue = ((Long) obj).longValue();
                eVar.w((longValue >> 63) ^ (longValue << 1));
                return;
            case 16:
                eVar.getClass();
                ((p) obj).a(eVar);
                return;
            case 17:
                eVar.p((p) obj);
                return;
            case 18:
                if (obj instanceof i.a) {
                    eVar.n(((i.a) obj).getNumber());
                    return;
                } else {
                    eVar.n(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public final void a(h.e eVar, Object obj) {
        List list;
        if (eVar.e) {
            k(eVar.d, obj);
            Object e = e(eVar);
            if (e == null) {
                list = new ArrayList();
                this.a.g(eVar, list);
            } else {
                list = (List) e;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final g<FieldDescriptorType> clone() {
        t tVar;
        g<FieldDescriptorType> gVar = (g<FieldDescriptorType>) new g();
        int i = 0;
        while (true) {
            tVar = this.a;
            if (i >= tVar.c.size()) {
                break;
            }
            u<K, V>.b bVar = tVar.c.get(i);
            gVar.j((b) bVar.getKey(), bVar.getValue());
            i++;
        }
        for (Map.Entry<Object, Object> entry : tVar.d()) {
            gVar.j((b) entry.getKey(), entry.getValue());
        }
        gVar.c = this.c;
        return gVar;
    }

    public final Object e(FieldDescriptorType fielddescriptortype) {
        Object obj = this.a.get(fielddescriptortype);
        if (obj instanceof k) {
            return ((k) obj).a();
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.List, java.lang.Object] */
    public final void g() {
        Map map;
        if (this.b) {
            return;
        }
        t tVar = this.a;
        if (!tVar.e) {
            for (int i = 0; i < tVar.c.size(); i++) {
                u<K, V>.b bVar = tVar.c.get(i);
                if (((b) bVar.getKey()).isRepeated()) {
                    bVar.setValue(Collections.unmodifiableList((List) bVar.getValue()));
                }
            }
            for (Map.Entry<Object, Object> entry : tVar.d()) {
                if (((b) entry.getKey()).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!tVar.e) {
            if (tVar.d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(tVar.d);
            }
            tVar.d = map;
            tVar.e = true;
        }
        this.b = true;
    }

    public final void h(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        byte[] value = entry.getValue();
        if (value instanceof k) {
            value = ((k) value).a();
        }
        boolean isRepeated = key.isRepeated();
        t tVar = this.a;
        if (isRepeated) {
            Object e = e(key);
            if (e == null) {
                e = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) e;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            tVar.g(key, e);
        } else if (key.getLiteJavaType() == z.MESSAGE) {
            Object e2 = e(key);
            if (e2 == null) {
                if (value instanceof byte[]) {
                    byte[] bArr3 = (byte[]) value;
                    byte[] bArr4 = new byte[bArr3.length];
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    value = bArr4;
                }
                tVar.g(key, value);
                return;
            }
            tVar.g(key, key.e(((p) e2).toBuilder(), (p) value).build());
        } else {
            if (value instanceof byte[]) {
                byte[] bArr5 = (byte[]) value;
                byte[] bArr6 = new byte[bArr5.length];
                System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                value = bArr6;
            }
            tVar.g(key, value);
        }
    }

    public final void j(FieldDescriptorType fielddescriptortype, Object obj) {
        if (fielddescriptortype.isRepeated()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    k(fielddescriptortype.getLiteType(), it.next());
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            k(fielddescriptortype.getLiteType(), obj);
        }
        if (obj instanceof k) {
            this.c = true;
        }
        this.a.g(fielddescriptortype, obj);
    }

    public g(int i) {
        int i2 = u.g;
        this.a = new t(0);
        g();
    }
}
