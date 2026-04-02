package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.a0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
/* compiled from: CodedInputStreamReader.java */
/* loaded from: classes.dex */
public final class k implements f1 {
    public final j a;
    public int b;
    public int c;
    public int d = 0;

    /* compiled from: CodedInputStreamReader.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[u1.values().length];
            a = iArr;
            try {
                iArr[u1.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[u1.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[u1.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[u1.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[u1.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[u1.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[u1.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[u1.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[u1.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[u1.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[u1.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[u1.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[u1.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[u1.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[u1.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[u1.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[u1.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public k(j jVar) {
        Charset charset = z.a;
        if (jVar != null) {
            this.a = jVar;
            jVar.d = this;
            return;
        }
        throw new NullPointerException("input");
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final <T> T a(g1<T> g1Var, p pVar) throws IOException {
        k(2);
        return (T) h(g1Var, pVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
        r10.put(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.e4.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <K, V> void b(java.util.Map<K, V> r10, com.amazon.aps.iva.e4.j0.a<K, V> r11, com.amazon.aps.iva.e4.p r12) throws java.io.IOException {
        /*
            r9 = this;
            r0 = 2
            r9.k(r0)
            com.amazon.aps.iva.e4.j r1 = r9.a
            int r2 = r1.v()
            int r2 = r1.e(r2)
            K r3 = r11.b
            V r4 = r11.d
            r5 = r4
        L13:
            int r6 = r9.getFieldNumber()     // Catch: java.lang.Throwable -> L5e
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L57
            boolean r7 = r1.c()     // Catch: java.lang.Throwable -> L5e
            if (r7 == 0) goto L23
            goto L57
        L23:
            r7 = 1
            java.lang.String r8 = "Unable to parse map entry."
            if (r6 == r7) goto L42
            if (r6 == r0) goto L37
            boolean r6 = r9.skipField()     // Catch: com.amazon.aps.iva.e4.a0.a -> L4a java.lang.Throwable -> L5e
            if (r6 == 0) goto L31
            goto L13
        L31:
            com.amazon.aps.iva.e4.a0 r6 = new com.amazon.aps.iva.e4.a0     // Catch: com.amazon.aps.iva.e4.a0.a -> L4a java.lang.Throwable -> L5e
            r6.<init>(r8)     // Catch: com.amazon.aps.iva.e4.a0.a -> L4a java.lang.Throwable -> L5e
            throw r6     // Catch: com.amazon.aps.iva.e4.a0.a -> L4a java.lang.Throwable -> L5e
        L37:
            com.amazon.aps.iva.e4.u1 r6 = r11.c     // Catch: com.amazon.aps.iva.e4.a0.a -> L4a java.lang.Throwable -> L5e
            java.lang.Class r7 = r4.getClass()     // Catch: com.amazon.aps.iva.e4.a0.a -> L4a java.lang.Throwable -> L5e
            java.lang.Object r5 = r9.f(r6, r7, r12)     // Catch: com.amazon.aps.iva.e4.a0.a -> L4a java.lang.Throwable -> L5e
            goto L13
        L42:
            com.amazon.aps.iva.e4.u1 r6 = r11.a     // Catch: com.amazon.aps.iva.e4.a0.a -> L4a java.lang.Throwable -> L5e
            r7 = 0
            java.lang.Object r3 = r9.f(r6, r7, r7)     // Catch: com.amazon.aps.iva.e4.a0.a -> L4a java.lang.Throwable -> L5e
            goto L13
        L4a:
            boolean r6 = r9.skipField()     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L51
            goto L13
        L51:
            com.amazon.aps.iva.e4.a0 r10 = new com.amazon.aps.iva.e4.a0     // Catch: java.lang.Throwable -> L5e
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L5e
            throw r10     // Catch: java.lang.Throwable -> L5e
        L57:
            r10.put(r3, r5)     // Catch: java.lang.Throwable -> L5e
            r1.d(r2)
            return
        L5e:
            r10 = move-exception
            r1.d(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e4.k.b(java.util.Map, com.amazon.aps.iva.e4.j0$a, com.amazon.aps.iva.e4.p):void");
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final <T> T c(g1<T> g1Var, p pVar) throws IOException {
        k(3);
        return (T) g(g1Var, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.e4.f1
    public final <T> void d(List<T> list, g1<T> g1Var, p pVar) throws IOException {
        int u;
        int i = this.b;
        if ((i & 7) == 2) {
            do {
                list.add(h(g1Var, pVar));
                j jVar = this.a;
                if (!jVar.c() && this.d == 0) {
                    u = jVar.u();
                } else {
                    return;
                }
            } while (u == i);
            this.d = u;
            return;
        }
        int i2 = a0.b;
        throw new a0.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.e4.f1
    public final <T> void e(List<T> list, g1<T> g1Var, p pVar) throws IOException {
        int u;
        int i = this.b;
        if ((i & 7) == 3) {
            do {
                list.add(g(g1Var, pVar));
                j jVar = this.a;
                if (!jVar.c() && this.d == 0) {
                    u = jVar.u();
                } else {
                    return;
                }
            } while (u == i);
            this.d = u;
            return;
        }
        int i2 = a0.b;
        throw new a0.a();
    }

    public final Object f(u1 u1Var, Class<?> cls, p pVar) throws IOException {
        switch (a.a[u1Var.ordinal()]) {
            case 1:
                return Boolean.valueOf(readBool());
            case 2:
                return readBytes();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(readEnum());
            case 5:
                return Integer.valueOf(readFixed32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(readInt32());
            case 9:
                return Long.valueOf(readInt64());
            case 10:
                k(2);
                return h(c1.c.a(cls), pVar);
            case 11:
                return Integer.valueOf(readSFixed32());
            case 12:
                return Long.valueOf(readSFixed64());
            case 13:
                return Integer.valueOf(readSInt32());
            case 14:
                return Long.valueOf(readSInt64());
            case 15:
                return readStringRequireUtf8();
            case 16:
                return Integer.valueOf(readUInt32());
            case 17:
                return Long.valueOf(readUInt64());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public final <T> T g(g1<T> g1Var, p pVar) throws IOException {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            T newInstance = g1Var.newInstance();
            g1Var.a(newInstance, this, pVar);
            g1Var.makeImmutable(newInstance);
            if (this.b == this.c) {
                return newInstance;
            }
            throw a0.e();
        } finally {
            this.c = i;
        }
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final int getFieldNumber() throws IOException {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.u();
        }
        int i2 = this.b;
        if (i2 != 0 && i2 != this.c) {
            return i2 >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final int getTag() {
        return this.b;
    }

    public final <T> T h(g1<T> g1Var, p pVar) throws IOException {
        j jVar = this.a;
        int v = jVar.v();
        if (jVar.a < jVar.b) {
            int e = jVar.e(v);
            T newInstance = g1Var.newInstance();
            jVar.a++;
            g1Var.a(newInstance, this, pVar);
            g1Var.makeImmutable(newInstance);
            jVar.a(0);
            jVar.a--;
            jVar.d(e);
            return newInstance;
        }
        throw new a0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final void i(List<String> list, boolean z) throws IOException {
        String readString;
        int u;
        int u2;
        if ((this.b & 7) == 2) {
            boolean z2 = list instanceof f0;
            j jVar = this.a;
            if (z2 && !z) {
                f0 f0Var = (f0) list;
                do {
                    f0Var.v(readBytes());
                    if (jVar.c()) {
                        return;
                    }
                    u2 = jVar.u();
                } while (u2 == this.b);
                this.d = u2;
                return;
            }
            do {
                if (z) {
                    readString = readStringRequireUtf8();
                } else {
                    readString = readString();
                }
                list.add(readString);
                if (jVar.c()) {
                    return;
                }
                u = jVar.u();
            } while (u == this.b);
            this.d = u;
            return;
        }
        throw a0.b();
    }

    public final void j(int i) throws IOException {
        if (this.a.b() == i) {
            return;
        }
        throw a0.f();
    }

    public final void k(int i) throws IOException {
        if ((this.b & 7) == i) {
            return;
        }
        throw a0.b();
    }

    public final void l(int i) throws IOException {
        if ((i & 3) == 0) {
            return;
        }
        throw a0.e();
    }

    public final void m(int i) throws IOException {
        if ((i & 7) == 0) {
            return;
        }
        throw a0.e();
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final boolean readBool() throws IOException {
        k(0);
        return this.a.f();
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final void readBoolList(List<Boolean> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof f;
        j jVar = this.a;
        if (z) {
            f fVar = (f) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int b = jVar.b() + jVar.v();
                    do {
                        fVar.addBoolean(jVar.f());
                    } while (jVar.b() < b);
                    j(b);
                    return;
                }
                throw a0.b();
            }
            do {
                fVar.addBoolean(jVar.f());
                if (jVar.c()) {
                    return;
                }
                u2 = jVar.u();
            } while (u2 == this.b);
            this.d = u2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = jVar.b() + jVar.v();
                do {
                    list.add(Boolean.valueOf(jVar.f()));
                } while (jVar.b() < b2);
                j(b2);
                return;
            }
            throw a0.b();
        }
        do {
            list.add(Boolean.valueOf(jVar.f()));
            if (jVar.c()) {
                return;
            }
            u = jVar.u();
        } while (u == this.b);
        this.d = u;
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final i readBytes() throws IOException {
        k(2);
        return this.a.g();
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final void readBytesList(List<i> list) throws IOException {
        int u;
        if ((this.b & 7) == 2) {
            do {
                list.add(readBytes());
                j jVar = this.a;
                if (jVar.c()) {
                    return;
                }
                u = jVar.u();
            } while (u == this.b);
            this.d = u;
            return;
        }
        throw a0.b();
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final double readDouble() throws IOException {
        k(1);
        return this.a.h();
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final void readDoubleList(List<Double> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof n;
        j jVar = this.a;
        if (z) {
            n nVar = (n) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i == 2) {
                    int v = jVar.v();
                    m(v);
                    int b = jVar.b() + v;
                    do {
                        nVar.addDouble(jVar.h());
                    } while (jVar.b() < b);
                    return;
                }
                throw a0.b();
            }
            do {
                nVar.addDouble(jVar.h());
                if (jVar.c()) {
                    return;
                }
                u2 = jVar.u();
            } while (u2 == this.b);
            this.d = u2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int v2 = jVar.v();
                m(v2);
                int b2 = jVar.b() + v2;
                do {
                    list.add(Double.valueOf(jVar.h()));
                } while (jVar.b() < b2);
                return;
            }
            throw a0.b();
        }
        do {
            list.add(Double.valueOf(jVar.h()));
            if (jVar.c()) {
                return;
            }
            u = jVar.u();
        } while (u == this.b);
        this.d = u;
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final int readEnum() throws IOException {
        k(0);
        return this.a.i();
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final void readEnumList(List<Integer> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof y;
        j jVar = this.a;
        if (z) {
            y yVar = (y) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int b = jVar.b() + jVar.v();
                    do {
                        yVar.addInt(jVar.i());
                    } while (jVar.b() < b);
                    j(b);
                    return;
                }
                throw a0.b();
            }
            do {
                yVar.addInt(jVar.i());
                if (jVar.c()) {
                    return;
                }
                u2 = jVar.u();
            } while (u2 == this.b);
            this.d = u2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = jVar.b() + jVar.v();
                do {
                    list.add(Integer.valueOf(jVar.i()));
                } while (jVar.b() < b2);
                j(b2);
                return;
            }
            throw a0.b();
        }
        do {
            list.add(Integer.valueOf(jVar.i()));
            if (jVar.c()) {
                return;
            }
            u = jVar.u();
        } while (u == this.b);
        this.d = u;
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final int readFixed32() throws IOException {
        k(5);
        return this.a.j();
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final void readFixed32List(List<Integer> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof y;
        j jVar = this.a;
        if (z) {
            y yVar = (y) list;
            int i = this.b & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        yVar.addInt(jVar.j());
                        if (jVar.c()) {
                            return;
                        }
                        u2 = jVar.u();
                    } while (u2 == this.b);
                    this.d = u2;
                    return;
                }
                throw a0.b();
            }
            int v = jVar.v();
            l(v);
            int b = jVar.b() + v;
            do {
                yVar.addInt(jVar.j());
            } while (jVar.b() < b);
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(jVar.j()));
                    if (jVar.c()) {
                        return;
                    }
                    u = jVar.u();
                } while (u == this.b);
                this.d = u;
                return;
            }
            throw a0.b();
        }
        int v2 = jVar.v();
        l(v2);
        int b2 = jVar.b() + v2;
        do {
            list.add(Integer.valueOf(jVar.j()));
        } while (jVar.b() < b2);
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final long readFixed64() throws IOException {
        k(1);
        return this.a.k();
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final void readFixed64List(List<Long> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof h0;
        j jVar = this.a;
        if (z) {
            h0 h0Var = (h0) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i == 2) {
                    int v = jVar.v();
                    m(v);
                    int b = jVar.b() + v;
                    do {
                        h0Var.addLong(jVar.k());
                    } while (jVar.b() < b);
                    return;
                }
                throw a0.b();
            }
            do {
                h0Var.addLong(jVar.k());
                if (jVar.c()) {
                    return;
                }
                u2 = jVar.u();
            } while (u2 == this.b);
            this.d = u2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int v2 = jVar.v();
                m(v2);
                int b2 = jVar.b() + v2;
                do {
                    list.add(Long.valueOf(jVar.k()));
                } while (jVar.b() < b2);
                return;
            }
            throw a0.b();
        }
        do {
            list.add(Long.valueOf(jVar.k()));
            if (jVar.c()) {
                return;
            }
            u = jVar.u();
        } while (u == this.b);
        this.d = u;
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final float readFloat() throws IOException {
        k(5);
        return this.a.l();
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final void readFloatList(List<Float> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof v;
        j jVar = this.a;
        if (z) {
            v vVar = (v) list;
            int i = this.b & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        vVar.addFloat(jVar.l());
                        if (jVar.c()) {
                            return;
                        }
                        u2 = jVar.u();
                    } while (u2 == this.b);
                    this.d = u2;
                    return;
                }
                throw a0.b();
            }
            int v = jVar.v();
            l(v);
            int b = jVar.b() + v;
            do {
                vVar.addFloat(jVar.l());
            } while (jVar.b() < b);
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Float.valueOf(jVar.l()));
                    if (jVar.c()) {
                        return;
                    }
                    u = jVar.u();
                } while (u == this.b);
                this.d = u;
                return;
            }
            throw a0.b();
        }
        int v2 = jVar.v();
        l(v2);
        int b2 = jVar.b() + v2;
        do {
            list.add(Float.valueOf(jVar.l()));
        } while (jVar.b() < b2);
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final int readInt32() throws IOException {
        k(0);
        return this.a.m();
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final void readInt32List(List<Integer> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof y;
        j jVar = this.a;
        if (z) {
            y yVar = (y) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int b = jVar.b() + jVar.v();
                    do {
                        yVar.addInt(jVar.m());
                    } while (jVar.b() < b);
                    j(b);
                    return;
                }
                throw a0.b();
            }
            do {
                yVar.addInt(jVar.m());
                if (jVar.c()) {
                    return;
                }
                u2 = jVar.u();
            } while (u2 == this.b);
            this.d = u2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = jVar.b() + jVar.v();
                do {
                    list.add(Integer.valueOf(jVar.m()));
                } while (jVar.b() < b2);
                j(b2);
                return;
            }
            throw a0.b();
        }
        do {
            list.add(Integer.valueOf(jVar.m()));
            if (jVar.c()) {
                return;
            }
            u = jVar.u();
        } while (u == this.b);
        this.d = u;
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final long readInt64() throws IOException {
        k(0);
        return this.a.n();
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final void readInt64List(List<Long> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof h0;
        j jVar = this.a;
        if (z) {
            h0 h0Var = (h0) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int b = jVar.b() + jVar.v();
                    do {
                        h0Var.addLong(jVar.n());
                    } while (jVar.b() < b);
                    j(b);
                    return;
                }
                throw a0.b();
            }
            do {
                h0Var.addLong(jVar.n());
                if (jVar.c()) {
                    return;
                }
                u2 = jVar.u();
            } while (u2 == this.b);
            this.d = u2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = jVar.b() + jVar.v();
                do {
                    list.add(Long.valueOf(jVar.n()));
                } while (jVar.b() < b2);
                j(b2);
                return;
            }
            throw a0.b();
        }
        do {
            list.add(Long.valueOf(jVar.n()));
            if (jVar.c()) {
                return;
            }
            u = jVar.u();
        } while (u == this.b);
        this.d = u;
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final int readSFixed32() throws IOException {
        k(5);
        return this.a.o();
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final void readSFixed32List(List<Integer> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof y;
        j jVar = this.a;
        if (z) {
            y yVar = (y) list;
            int i = this.b & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        yVar.addInt(jVar.o());
                        if (jVar.c()) {
                            return;
                        }
                        u2 = jVar.u();
                    } while (u2 == this.b);
                    this.d = u2;
                    return;
                }
                throw a0.b();
            }
            int v = jVar.v();
            l(v);
            int b = jVar.b() + v;
            do {
                yVar.addInt(jVar.o());
            } while (jVar.b() < b);
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(jVar.o()));
                    if (jVar.c()) {
                        return;
                    }
                    u = jVar.u();
                } while (u == this.b);
                this.d = u;
                return;
            }
            throw a0.b();
        }
        int v2 = jVar.v();
        l(v2);
        int b2 = jVar.b() + v2;
        do {
            list.add(Integer.valueOf(jVar.o()));
        } while (jVar.b() < b2);
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final long readSFixed64() throws IOException {
        k(1);
        return this.a.p();
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final void readSFixed64List(List<Long> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof h0;
        j jVar = this.a;
        if (z) {
            h0 h0Var = (h0) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i == 2) {
                    int v = jVar.v();
                    m(v);
                    int b = jVar.b() + v;
                    do {
                        h0Var.addLong(jVar.p());
                    } while (jVar.b() < b);
                    return;
                }
                throw a0.b();
            }
            do {
                h0Var.addLong(jVar.p());
                if (jVar.c()) {
                    return;
                }
                u2 = jVar.u();
            } while (u2 == this.b);
            this.d = u2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int v2 = jVar.v();
                m(v2);
                int b2 = jVar.b() + v2;
                do {
                    list.add(Long.valueOf(jVar.p()));
                } while (jVar.b() < b2);
                return;
            }
            throw a0.b();
        }
        do {
            list.add(Long.valueOf(jVar.p()));
            if (jVar.c()) {
                return;
            }
            u = jVar.u();
        } while (u == this.b);
        this.d = u;
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final int readSInt32() throws IOException {
        k(0);
        return this.a.q();
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final void readSInt32List(List<Integer> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof y;
        j jVar = this.a;
        if (z) {
            y yVar = (y) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int b = jVar.b() + jVar.v();
                    do {
                        yVar.addInt(jVar.q());
                    } while (jVar.b() < b);
                    j(b);
                    return;
                }
                throw a0.b();
            }
            do {
                yVar.addInt(jVar.q());
                if (jVar.c()) {
                    return;
                }
                u2 = jVar.u();
            } while (u2 == this.b);
            this.d = u2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = jVar.b() + jVar.v();
                do {
                    list.add(Integer.valueOf(jVar.q()));
                } while (jVar.b() < b2);
                j(b2);
                return;
            }
            throw a0.b();
        }
        do {
            list.add(Integer.valueOf(jVar.q()));
            if (jVar.c()) {
                return;
            }
            u = jVar.u();
        } while (u == this.b);
        this.d = u;
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final long readSInt64() throws IOException {
        k(0);
        return this.a.r();
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final void readSInt64List(List<Long> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof h0;
        j jVar = this.a;
        if (z) {
            h0 h0Var = (h0) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int b = jVar.b() + jVar.v();
                    do {
                        h0Var.addLong(jVar.r());
                    } while (jVar.b() < b);
                    j(b);
                    return;
                }
                throw a0.b();
            }
            do {
                h0Var.addLong(jVar.r());
                if (jVar.c()) {
                    return;
                }
                u2 = jVar.u();
            } while (u2 == this.b);
            this.d = u2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = jVar.b() + jVar.v();
                do {
                    list.add(Long.valueOf(jVar.r()));
                } while (jVar.b() < b2);
                j(b2);
                return;
            }
            throw a0.b();
        }
        do {
            list.add(Long.valueOf(jVar.r()));
            if (jVar.c()) {
                return;
            }
            u = jVar.u();
        } while (u == this.b);
        this.d = u;
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final String readString() throws IOException {
        k(2);
        return this.a.s();
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final void readStringList(List<String> list) throws IOException {
        i(list, false);
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final void readStringListRequireUtf8(List<String> list) throws IOException {
        i(list, true);
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final String readStringRequireUtf8() throws IOException {
        k(2);
        return this.a.t();
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final int readUInt32() throws IOException {
        k(0);
        return this.a.v();
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final void readUInt32List(List<Integer> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof y;
        j jVar = this.a;
        if (z) {
            y yVar = (y) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int b = jVar.b() + jVar.v();
                    do {
                        yVar.addInt(jVar.v());
                    } while (jVar.b() < b);
                    j(b);
                    return;
                }
                throw a0.b();
            }
            do {
                yVar.addInt(jVar.v());
                if (jVar.c()) {
                    return;
                }
                u2 = jVar.u();
            } while (u2 == this.b);
            this.d = u2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = jVar.b() + jVar.v();
                do {
                    list.add(Integer.valueOf(jVar.v()));
                } while (jVar.b() < b2);
                j(b2);
                return;
            }
            throw a0.b();
        }
        do {
            list.add(Integer.valueOf(jVar.v()));
            if (jVar.c()) {
                return;
            }
            u = jVar.u();
        } while (u == this.b);
        this.d = u;
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final long readUInt64() throws IOException {
        k(0);
        return this.a.w();
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final void readUInt64List(List<Long> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof h0;
        j jVar = this.a;
        if (z) {
            h0 h0Var = (h0) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int b = jVar.b() + jVar.v();
                    do {
                        h0Var.addLong(jVar.w());
                    } while (jVar.b() < b);
                    j(b);
                    return;
                }
                throw a0.b();
            }
            do {
                h0Var.addLong(jVar.w());
                if (jVar.c()) {
                    return;
                }
                u2 = jVar.u();
            } while (u2 == this.b);
            this.d = u2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = jVar.b() + jVar.v();
                do {
                    list.add(Long.valueOf(jVar.w()));
                } while (jVar.b() < b2);
                j(b2);
                return;
            }
            throw a0.b();
        }
        do {
            list.add(Long.valueOf(jVar.w()));
            if (jVar.c()) {
                return;
            }
            u = jVar.u();
        } while (u == this.b);
        this.d = u;
    }

    @Override // com.amazon.aps.iva.e4.f1
    public final boolean skipField() throws IOException {
        int i;
        j jVar = this.a;
        if (!jVar.c() && (i = this.b) != this.c) {
            return jVar.x(i);
        }
        return false;
    }
}
