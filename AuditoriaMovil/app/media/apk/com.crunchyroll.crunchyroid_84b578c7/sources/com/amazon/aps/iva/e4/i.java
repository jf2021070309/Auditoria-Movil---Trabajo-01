package com.amazon.aps.iva.e4;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: ByteString.java */
/* loaded from: classes.dex */
public abstract class i implements Iterable<Byte>, Serializable {
    public static final e c = new e(z.b);
    public static final c d;
    public int b = 0;

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            h hVar = (h) this;
            int i = hVar.b;
            if (i < hVar.c) {
                hVar.b = i + 1;
                return Byte.valueOf(hVar.d.f(i));
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public static final class b implements c {
        @Override // com.amazon.aps.iva.e4.i.c
        public final byte[] copyFrom(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public interface c {
        byte[] copyFrom(byte[] bArr, int i, int i2);
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public static abstract class d extends i {
        @Override // com.amazon.aps.iva.e4.i, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new h(this);
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public static class e extends d {
        public final byte[] e;

        public e(byte[] bArr) {
            bArr.getClass();
            this.e = bArr;
        }

        @Override // com.amazon.aps.iva.e4.i
        public byte b(int i) {
            return this.e[i];
        }

        @Override // com.amazon.aps.iva.e4.i
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i) || size() != ((i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                int i = this.b;
                int i2 = eVar.b;
                if (i != 0 && i2 != 0 && i != i2) {
                    return false;
                }
                int size = size();
                if (size <= eVar.size()) {
                    if (0 + size <= eVar.size()) {
                        int n = n() + size;
                        int n2 = n();
                        int n3 = eVar.n() + 0;
                        while (n2 < n) {
                            if (this.e[n2] != eVar.e[n3]) {
                                return false;
                            }
                            n2++;
                            n3++;
                        }
                        return true;
                    }
                    StringBuilder d = com.amazon.aps.iva.e4.e.d("Ran off end of other: 0, ", size, ", ");
                    d.append(eVar.size());
                    throw new IllegalArgumentException(d.toString());
                }
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            return obj.equals(this);
        }

        @Override // com.amazon.aps.iva.e4.i
        public byte f(int i) {
            return this.e[i];
        }

        @Override // com.amazon.aps.iva.e4.i
        public final boolean g() {
            int n = n();
            if (s1.a.c(this.e, n, size() + n) == 0) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.e4.i
        public final int j(int i, int i2) {
            int n = n() + 0;
            Charset charset = z.a;
            for (int i3 = n; i3 < n + i2; i3++) {
                i = (i * 31) + this.e[i3];
            }
            return i;
        }

        @Override // com.amazon.aps.iva.e4.i
        public final String k(Charset charset) {
            return new String(this.e, n(), size(), charset);
        }

        @Override // com.amazon.aps.iva.e4.i
        public final void l(g gVar) throws IOException {
            gVar.a(this.e, n(), size());
        }

        public int n() {
            return 0;
        }

        @Override // com.amazon.aps.iva.e4.i
        public int size() {
            return this.e.length;
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public static final class f implements c {
        @Override // com.amazon.aps.iva.e4.i.c
        public final byte[] copyFrom(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        c bVar;
        if (com.amazon.aps.iva.e4.d.a()) {
            bVar = new f();
        } else {
            bVar = new b();
        }
        d = bVar;
    }

    public static int d(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    throw new IndexOutOfBoundsException(com.amazon.aps.iva.j0.j0.e("Beginning index larger than ending index: ", i, ", ", i2));
                }
                throw new IndexOutOfBoundsException(com.amazon.aps.iva.j0.j0.e("End index: ", i2, " >= ", i3));
            }
            throw new IndexOutOfBoundsException(com.amazon.aps.iva.c80.a.d("Beginning index: ", i, " < 0"));
        }
        return i4;
    }

    public static e e(int i, byte[] bArr, int i2) {
        d(i, i + i2, bArr.length);
        return new e(d.copyFrom(bArr, i, i2));
    }

    public abstract byte b(int i);

    public abstract boolean equals(Object obj);

    public abstract byte f(int i);

    public abstract boolean g();

    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            int size = size();
            i = j(size, size);
            if (i == 0) {
                i = 1;
            }
            this.b = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new h(this);
    }

    public abstract int j(int i, int i2);

    public abstract String k(Charset charset);

    public abstract void l(g gVar) throws IOException;

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
