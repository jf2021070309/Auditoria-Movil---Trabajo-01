package com.amazon.aps.iva.v4;

import com.amazon.aps.iva.v4.z;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
/* compiled from: CodedInputStreamReader.java */
/* loaded from: classes.dex */
public final class j implements d1 {
    public final i a;
    public int b;
    public int c;
    public int d = 0;

    public j(i iVar) {
        Charset charset = y.a;
        if (iVar != null) {
            this.a = iVar;
            iVar.d = this;
            return;
        }
        throw new NullPointerException("input");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.v4.d1
    public final <T> void a(List<T> list, e1<T> e1Var, o oVar) throws IOException {
        int u;
        int i = this.b;
        if ((i & 7) == 3) {
            do {
                list.add(f(e1Var, oVar));
                i iVar = this.a;
                if (!iVar.c() && this.d == 0) {
                    u = iVar.u();
                } else {
                    return;
                }
            } while (u == i);
            this.d = u;
            return;
        }
        int i2 = z.c;
        throw new z.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.v4.d1
    public final <T> void b(List<T> list, e1<T> e1Var, o oVar) throws IOException {
        int u;
        int i = this.b;
        if ((i & 7) == 2) {
            do {
                list.add(g(e1Var, oVar));
                i iVar = this.a;
                if (!iVar.c() && this.d == 0) {
                    u = iVar.u();
                } else {
                    return;
                }
            } while (u == i);
            this.d = u;
            return;
        }
        int i2 = z.c;
        throw new z.a();
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final void c() throws IOException {
        j(2);
        i iVar = this.a;
        iVar.e(iVar.v());
        throw null;
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final <T> T d(e1<T> e1Var, o oVar) throws IOException {
        j(2);
        return (T) g(e1Var, oVar);
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final <T> T e(e1<T> e1Var, o oVar) throws IOException {
        j(3);
        return (T) f(e1Var, oVar);
    }

    public final <T> T f(e1<T> e1Var, o oVar) throws IOException {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            T newInstance = e1Var.newInstance();
            e1Var.b(newInstance, this, oVar);
            e1Var.makeImmutable(newInstance);
            if (this.b == this.c) {
                return newInstance;
            }
            throw z.e();
        } finally {
            this.c = i;
        }
    }

    public final <T> T g(e1<T> e1Var, o oVar) throws IOException {
        i iVar = this.a;
        int v = iVar.v();
        if (iVar.a < iVar.b) {
            int e = iVar.e(v);
            T newInstance = e1Var.newInstance();
            iVar.a++;
            e1Var.b(newInstance, this, oVar);
            e1Var.makeImmutable(newInstance);
            iVar.a(0);
            iVar.a--;
            iVar.d(e);
            return newInstance;
        }
        throw new z("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // com.amazon.aps.iva.v4.d1
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

    @Override // com.amazon.aps.iva.v4.d1
    public final int getTag() {
        return this.b;
    }

    public final void h(List<String> list, boolean z) throws IOException {
        String readString;
        int u;
        int u2;
        if ((this.b & 7) == 2) {
            boolean z2 = list instanceof e0;
            i iVar = this.a;
            if (z2 && !z) {
                e0 e0Var = (e0) list;
                do {
                    e0Var.c(readBytes());
                    if (iVar.c()) {
                        return;
                    }
                    u2 = iVar.u();
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
                if (iVar.c()) {
                    return;
                }
                u = iVar.u();
            } while (u == this.b);
            this.d = u;
            return;
        }
        throw z.b();
    }

    public final void i(int i) throws IOException {
        if (this.a.b() == i) {
            return;
        }
        throw z.f();
    }

    public final void j(int i) throws IOException {
        if ((this.b & 7) == i) {
            return;
        }
        throw z.b();
    }

    public final void k(int i) throws IOException {
        if ((i & 3) == 0) {
            return;
        }
        throw z.e();
    }

    public final void l(int i) throws IOException {
        if ((i & 7) == 0) {
            return;
        }
        throw z.e();
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final boolean readBool() throws IOException {
        j(0);
        return this.a.f();
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final void readBoolList(List<Boolean> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof e;
        i iVar = this.a;
        if (z) {
            e eVar = (e) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int b = iVar.b() + iVar.v();
                    do {
                        eVar.addBoolean(iVar.f());
                    } while (iVar.b() < b);
                    i(b);
                    return;
                }
                throw z.b();
            }
            do {
                eVar.addBoolean(iVar.f());
                if (iVar.c()) {
                    return;
                }
                u2 = iVar.u();
            } while (u2 == this.b);
            this.d = u2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = iVar.b() + iVar.v();
                do {
                    list.add(Boolean.valueOf(iVar.f()));
                } while (iVar.b() < b2);
                i(b2);
                return;
            }
            throw z.b();
        }
        do {
            list.add(Boolean.valueOf(iVar.f()));
            if (iVar.c()) {
                return;
            }
            u = iVar.u();
        } while (u == this.b);
        this.d = u;
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final h readBytes() throws IOException {
        j(2);
        return this.a.g();
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final void readBytesList(List<h> list) throws IOException {
        int u;
        if ((this.b & 7) == 2) {
            do {
                list.add(readBytes());
                i iVar = this.a;
                if (iVar.c()) {
                    return;
                }
                u = iVar.u();
            } while (u == this.b);
            this.d = u;
            return;
        }
        throw z.b();
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final double readDouble() throws IOException {
        j(1);
        return this.a.h();
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final void readDoubleList(List<Double> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof m;
        i iVar = this.a;
        if (z) {
            m mVar = (m) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i == 2) {
                    int v = iVar.v();
                    l(v);
                    int b = iVar.b() + v;
                    do {
                        mVar.addDouble(iVar.h());
                    } while (iVar.b() < b);
                    return;
                }
                throw z.b();
            }
            do {
                mVar.addDouble(iVar.h());
                if (iVar.c()) {
                    return;
                }
                u2 = iVar.u();
            } while (u2 == this.b);
            this.d = u2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int v2 = iVar.v();
                l(v2);
                int b2 = iVar.b() + v2;
                do {
                    list.add(Double.valueOf(iVar.h()));
                } while (iVar.b() < b2);
                return;
            }
            throw z.b();
        }
        do {
            list.add(Double.valueOf(iVar.h()));
            if (iVar.c()) {
                return;
            }
            u = iVar.u();
        } while (u == this.b);
        this.d = u;
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final int readEnum() throws IOException {
        j(0);
        return this.a.i();
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final void readEnumList(List<Integer> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof x;
        i iVar = this.a;
        if (z) {
            x xVar = (x) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int b = iVar.b() + iVar.v();
                    do {
                        xVar.addInt(iVar.i());
                    } while (iVar.b() < b);
                    i(b);
                    return;
                }
                throw z.b();
            }
            do {
                xVar.addInt(iVar.i());
                if (iVar.c()) {
                    return;
                }
                u2 = iVar.u();
            } while (u2 == this.b);
            this.d = u2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = iVar.b() + iVar.v();
                do {
                    list.add(Integer.valueOf(iVar.i()));
                } while (iVar.b() < b2);
                i(b2);
                return;
            }
            throw z.b();
        }
        do {
            list.add(Integer.valueOf(iVar.i()));
            if (iVar.c()) {
                return;
            }
            u = iVar.u();
        } while (u == this.b);
        this.d = u;
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final int readFixed32() throws IOException {
        j(5);
        return this.a.j();
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final void readFixed32List(List<Integer> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof x;
        i iVar = this.a;
        if (z) {
            x xVar = (x) list;
            int i = this.b & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        xVar.addInt(iVar.j());
                        if (iVar.c()) {
                            return;
                        }
                        u2 = iVar.u();
                    } while (u2 == this.b);
                    this.d = u2;
                    return;
                }
                throw z.b();
            }
            int v = iVar.v();
            k(v);
            int b = iVar.b() + v;
            do {
                xVar.addInt(iVar.j());
            } while (iVar.b() < b);
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(iVar.j()));
                    if (iVar.c()) {
                        return;
                    }
                    u = iVar.u();
                } while (u == this.b);
                this.d = u;
                return;
            }
            throw z.b();
        }
        int v2 = iVar.v();
        k(v2);
        int b2 = iVar.b() + v2;
        do {
            list.add(Integer.valueOf(iVar.j()));
        } while (iVar.b() < b2);
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final long readFixed64() throws IOException {
        j(1);
        return this.a.k();
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final void readFixed64List(List<Long> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof g0;
        i iVar = this.a;
        if (z) {
            g0 g0Var = (g0) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i == 2) {
                    int v = iVar.v();
                    l(v);
                    int b = iVar.b() + v;
                    do {
                        g0Var.addLong(iVar.k());
                    } while (iVar.b() < b);
                    return;
                }
                throw z.b();
            }
            do {
                g0Var.addLong(iVar.k());
                if (iVar.c()) {
                    return;
                }
                u2 = iVar.u();
            } while (u2 == this.b);
            this.d = u2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int v2 = iVar.v();
                l(v2);
                int b2 = iVar.b() + v2;
                do {
                    list.add(Long.valueOf(iVar.k()));
                } while (iVar.b() < b2);
                return;
            }
            throw z.b();
        }
        do {
            list.add(Long.valueOf(iVar.k()));
            if (iVar.c()) {
                return;
            }
            u = iVar.u();
        } while (u == this.b);
        this.d = u;
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final float readFloat() throws IOException {
        j(5);
        return this.a.l();
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final void readFloatList(List<Float> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof u;
        i iVar = this.a;
        if (z) {
            u uVar = (u) list;
            int i = this.b & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        uVar.addFloat(iVar.l());
                        if (iVar.c()) {
                            return;
                        }
                        u2 = iVar.u();
                    } while (u2 == this.b);
                    this.d = u2;
                    return;
                }
                throw z.b();
            }
            int v = iVar.v();
            k(v);
            int b = iVar.b() + v;
            do {
                uVar.addFloat(iVar.l());
            } while (iVar.b() < b);
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Float.valueOf(iVar.l()));
                    if (iVar.c()) {
                        return;
                    }
                    u = iVar.u();
                } while (u == this.b);
                this.d = u;
                return;
            }
            throw z.b();
        }
        int v2 = iVar.v();
        k(v2);
        int b2 = iVar.b() + v2;
        do {
            list.add(Float.valueOf(iVar.l()));
        } while (iVar.b() < b2);
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final int readInt32() throws IOException {
        j(0);
        return this.a.m();
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final void readInt32List(List<Integer> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof x;
        i iVar = this.a;
        if (z) {
            x xVar = (x) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int b = iVar.b() + iVar.v();
                    do {
                        xVar.addInt(iVar.m());
                    } while (iVar.b() < b);
                    i(b);
                    return;
                }
                throw z.b();
            }
            do {
                xVar.addInt(iVar.m());
                if (iVar.c()) {
                    return;
                }
                u2 = iVar.u();
            } while (u2 == this.b);
            this.d = u2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = iVar.b() + iVar.v();
                do {
                    list.add(Integer.valueOf(iVar.m()));
                } while (iVar.b() < b2);
                i(b2);
                return;
            }
            throw z.b();
        }
        do {
            list.add(Integer.valueOf(iVar.m()));
            if (iVar.c()) {
                return;
            }
            u = iVar.u();
        } while (u == this.b);
        this.d = u;
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final long readInt64() throws IOException {
        j(0);
        return this.a.n();
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final void readInt64List(List<Long> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof g0;
        i iVar = this.a;
        if (z) {
            g0 g0Var = (g0) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int b = iVar.b() + iVar.v();
                    do {
                        g0Var.addLong(iVar.n());
                    } while (iVar.b() < b);
                    i(b);
                    return;
                }
                throw z.b();
            }
            do {
                g0Var.addLong(iVar.n());
                if (iVar.c()) {
                    return;
                }
                u2 = iVar.u();
            } while (u2 == this.b);
            this.d = u2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = iVar.b() + iVar.v();
                do {
                    list.add(Long.valueOf(iVar.n()));
                } while (iVar.b() < b2);
                i(b2);
                return;
            }
            throw z.b();
        }
        do {
            list.add(Long.valueOf(iVar.n()));
            if (iVar.c()) {
                return;
            }
            u = iVar.u();
        } while (u == this.b);
        this.d = u;
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final int readSFixed32() throws IOException {
        j(5);
        return this.a.o();
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final void readSFixed32List(List<Integer> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof x;
        i iVar = this.a;
        if (z) {
            x xVar = (x) list;
            int i = this.b & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        xVar.addInt(iVar.o());
                        if (iVar.c()) {
                            return;
                        }
                        u2 = iVar.u();
                    } while (u2 == this.b);
                    this.d = u2;
                    return;
                }
                throw z.b();
            }
            int v = iVar.v();
            k(v);
            int b = iVar.b() + v;
            do {
                xVar.addInt(iVar.o());
            } while (iVar.b() < b);
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(iVar.o()));
                    if (iVar.c()) {
                        return;
                    }
                    u = iVar.u();
                } while (u == this.b);
                this.d = u;
                return;
            }
            throw z.b();
        }
        int v2 = iVar.v();
        k(v2);
        int b2 = iVar.b() + v2;
        do {
            list.add(Integer.valueOf(iVar.o()));
        } while (iVar.b() < b2);
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final long readSFixed64() throws IOException {
        j(1);
        return this.a.p();
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final void readSFixed64List(List<Long> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof g0;
        i iVar = this.a;
        if (z) {
            g0 g0Var = (g0) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i == 2) {
                    int v = iVar.v();
                    l(v);
                    int b = iVar.b() + v;
                    do {
                        g0Var.addLong(iVar.p());
                    } while (iVar.b() < b);
                    return;
                }
                throw z.b();
            }
            do {
                g0Var.addLong(iVar.p());
                if (iVar.c()) {
                    return;
                }
                u2 = iVar.u();
            } while (u2 == this.b);
            this.d = u2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int v2 = iVar.v();
                l(v2);
                int b2 = iVar.b() + v2;
                do {
                    list.add(Long.valueOf(iVar.p()));
                } while (iVar.b() < b2);
                return;
            }
            throw z.b();
        }
        do {
            list.add(Long.valueOf(iVar.p()));
            if (iVar.c()) {
                return;
            }
            u = iVar.u();
        } while (u == this.b);
        this.d = u;
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final int readSInt32() throws IOException {
        j(0);
        return this.a.q();
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final void readSInt32List(List<Integer> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof x;
        i iVar = this.a;
        if (z) {
            x xVar = (x) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int b = iVar.b() + iVar.v();
                    do {
                        xVar.addInt(iVar.q());
                    } while (iVar.b() < b);
                    i(b);
                    return;
                }
                throw z.b();
            }
            do {
                xVar.addInt(iVar.q());
                if (iVar.c()) {
                    return;
                }
                u2 = iVar.u();
            } while (u2 == this.b);
            this.d = u2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = iVar.b() + iVar.v();
                do {
                    list.add(Integer.valueOf(iVar.q()));
                } while (iVar.b() < b2);
                i(b2);
                return;
            }
            throw z.b();
        }
        do {
            list.add(Integer.valueOf(iVar.q()));
            if (iVar.c()) {
                return;
            }
            u = iVar.u();
        } while (u == this.b);
        this.d = u;
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final long readSInt64() throws IOException {
        j(0);
        return this.a.r();
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final void readSInt64List(List<Long> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof g0;
        i iVar = this.a;
        if (z) {
            g0 g0Var = (g0) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int b = iVar.b() + iVar.v();
                    do {
                        g0Var.addLong(iVar.r());
                    } while (iVar.b() < b);
                    i(b);
                    return;
                }
                throw z.b();
            }
            do {
                g0Var.addLong(iVar.r());
                if (iVar.c()) {
                    return;
                }
                u2 = iVar.u();
            } while (u2 == this.b);
            this.d = u2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = iVar.b() + iVar.v();
                do {
                    list.add(Long.valueOf(iVar.r()));
                } while (iVar.b() < b2);
                i(b2);
                return;
            }
            throw z.b();
        }
        do {
            list.add(Long.valueOf(iVar.r()));
            if (iVar.c()) {
                return;
            }
            u = iVar.u();
        } while (u == this.b);
        this.d = u;
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final String readString() throws IOException {
        j(2);
        return this.a.s();
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final void readStringList(List<String> list) throws IOException {
        h(list, false);
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final void readStringListRequireUtf8(List<String> list) throws IOException {
        h(list, true);
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final String readStringRequireUtf8() throws IOException {
        j(2);
        return this.a.t();
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final int readUInt32() throws IOException {
        j(0);
        return this.a.v();
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final void readUInt32List(List<Integer> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof x;
        i iVar = this.a;
        if (z) {
            x xVar = (x) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int b = iVar.b() + iVar.v();
                    do {
                        xVar.addInt(iVar.v());
                    } while (iVar.b() < b);
                    i(b);
                    return;
                }
                throw z.b();
            }
            do {
                xVar.addInt(iVar.v());
                if (iVar.c()) {
                    return;
                }
                u2 = iVar.u();
            } while (u2 == this.b);
            this.d = u2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = iVar.b() + iVar.v();
                do {
                    list.add(Integer.valueOf(iVar.v()));
                } while (iVar.b() < b2);
                i(b2);
                return;
            }
            throw z.b();
        }
        do {
            list.add(Integer.valueOf(iVar.v()));
            if (iVar.c()) {
                return;
            }
            u = iVar.u();
        } while (u == this.b);
        this.d = u;
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final long readUInt64() throws IOException {
        j(0);
        return this.a.w();
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final void readUInt64List(List<Long> list) throws IOException {
        int u;
        int u2;
        boolean z = list instanceof g0;
        i iVar = this.a;
        if (z) {
            g0 g0Var = (g0) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int b = iVar.b() + iVar.v();
                    do {
                        g0Var.addLong(iVar.w());
                    } while (iVar.b() < b);
                    i(b);
                    return;
                }
                throw z.b();
            }
            do {
                g0Var.addLong(iVar.w());
                if (iVar.c()) {
                    return;
                }
                u2 = iVar.u();
            } while (u2 == this.b);
            this.d = u2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int b2 = iVar.b() + iVar.v();
                do {
                    list.add(Long.valueOf(iVar.w()));
                } while (iVar.b() < b2);
                i(b2);
                return;
            }
            throw z.b();
        }
        do {
            list.add(Long.valueOf(iVar.w()));
            if (iVar.c()) {
                return;
            }
            u = iVar.u();
        } while (u == this.b);
        this.d = u;
    }

    @Override // com.amazon.aps.iva.v4.d1
    public final boolean skipField() throws IOException {
        int i;
        i iVar = this.a;
        if (!iVar.c() && (i = this.b) != this.c) {
            return iVar.x(i);
        }
        return false;
    }
}
