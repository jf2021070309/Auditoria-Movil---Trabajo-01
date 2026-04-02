package com.amazon.aps.iva.v4;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
/* compiled from: ByteString.java */
/* loaded from: classes.dex */
public abstract class h implements Iterable<Byte>, Serializable {
    public static final f c = new f(y.c);
    public static final d d;
    public int b = 0;

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            com.amazon.aps.iva.v4.g gVar = (com.amazon.aps.iva.v4.g) this;
            int i = gVar.b;
            if (i < gVar.c) {
                gVar.b = i + 1;
                return Byte.valueOf(gVar.d.f(i));
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
    public static final class b implements d {
        @Override // com.amazon.aps.iva.v4.h.d
        public final byte[] copyFrom(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public static final class c extends f {
        public final int f;
        public final int g;

        public c(byte[] bArr, int i, int i2) {
            super(bArr);
            h.d(i, i + i2, bArr.length);
            this.f = i;
            this.g = i2;
        }

        @Override // com.amazon.aps.iva.v4.h.f, com.amazon.aps.iva.v4.h
        public final byte b(int i) {
            int i2 = this.g;
            if (((i2 - (i + 1)) | i) < 0) {
                if (i < 0) {
                    throw new ArrayIndexOutOfBoundsException(com.amazon.aps.iva.q.c0.a("Index < 0: ", i));
                }
                throw new ArrayIndexOutOfBoundsException(com.amazon.aps.iva.j0.j0.e("Index > length: ", i, ", ", i2));
            }
            return this.e[this.f + i];
        }

        @Override // com.amazon.aps.iva.v4.h.f, com.amazon.aps.iva.v4.h
        public final byte f(int i) {
            return this.e[this.f + i];
        }

        @Override // com.amazon.aps.iva.v4.h.f
        public final int o() {
            return this.f;
        }

        @Override // com.amazon.aps.iva.v4.h.f, com.amazon.aps.iva.v4.h
        public final int size() {
            return this.g;
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public interface d {
        byte[] copyFrom(byte[] bArr, int i, int i2);
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public static abstract class e extends h {
        @Override // com.amazon.aps.iva.v4.h, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new com.amazon.aps.iva.v4.g(this);
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public static class f extends e {
        public final byte[] e;

        public f(byte[] bArr) {
            bArr.getClass();
            this.e = bArr;
        }

        @Override // com.amazon.aps.iva.v4.h
        public byte b(int i) {
            return this.e[i];
        }

        @Override // com.amazon.aps.iva.v4.h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h) || size() != ((h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                int i = this.b;
                int i2 = fVar.b;
                if (i != 0 && i2 != 0 && i != i2) {
                    return false;
                }
                int size = size();
                if (size <= fVar.size()) {
                    if (0 + size <= fVar.size()) {
                        int o = o() + size;
                        int o2 = o();
                        int o3 = fVar.o() + 0;
                        while (o2 < o) {
                            if (this.e[o2] != fVar.e[o3]) {
                                return false;
                            }
                            o2++;
                            o3++;
                        }
                        return true;
                    }
                    StringBuilder d = com.amazon.aps.iva.e4.e.d("Ran off end of other: 0, ", size, ", ");
                    d.append(fVar.size());
                    throw new IllegalArgumentException(d.toString());
                }
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            return obj.equals(this);
        }

        @Override // com.amazon.aps.iva.v4.h
        public byte f(int i) {
            return this.e[i];
        }

        @Override // com.amazon.aps.iva.v4.h
        public final boolean g() {
            int o = o();
            if (p1.a.c(this.e, o, size() + o) == 0) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.v4.h
        public final int j(int i, int i2) {
            int o = o() + 0;
            Charset charset = y.a;
            for (int i3 = o; i3 < o + i2; i3++) {
                i = (i * 31) + this.e[i3];
            }
            return i;
        }

        @Override // com.amazon.aps.iva.v4.h
        public final f k(int i) {
            int d = h.d(0, i, size());
            if (d == 0) {
                return h.c;
            }
            return new c(this.e, o() + 0, d);
        }

        @Override // com.amazon.aps.iva.v4.h
        public final String l(Charset charset) {
            return new String(this.e, o(), size(), charset);
        }

        @Override // com.amazon.aps.iva.v4.h
        public final void n(com.amazon.aps.iva.v4.f fVar) throws IOException {
            fVar.a(this.e, o(), size());
        }

        public int o() {
            return 0;
        }

        @Override // com.amazon.aps.iva.v4.h
        public int size() {
            return this.e.length;
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public static final class g implements d {
        @Override // com.amazon.aps.iva.v4.h.d
        public final byte[] copyFrom(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        d bVar;
        if (com.amazon.aps.iva.v4.d.a()) {
            bVar = new g();
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

    public static f e(int i, byte[] bArr, int i2) {
        d(i, i + i2, bArr.length);
        return new f(d.copyFrom(bArr, i, i2));
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
        return new com.amazon.aps.iva.v4.g(this);
    }

    public abstract int j(int i, int i2);

    public abstract f k(int i);

    public abstract String l(Charset charset);

    public abstract void n(com.amazon.aps.iva.v4.f fVar) throws IOException;

    public abstract int size();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            str = com.amazon.aps.iva.ab.x.L(this);
        } else {
            str = com.amazon.aps.iva.ab.x.L(k(47)) + "...";
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
