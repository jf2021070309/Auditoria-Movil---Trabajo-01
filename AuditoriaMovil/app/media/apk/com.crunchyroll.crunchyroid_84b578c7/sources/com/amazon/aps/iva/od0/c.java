package com.amazon.aps.iva.od0;

import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.od0.s;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
/* compiled from: ByteString.java */
/* loaded from: classes4.dex */
public abstract class c implements Iterable<Byte> {
    public static final o b = new o(new byte[0]);

    /* compiled from: ByteString.java */
    /* loaded from: classes4.dex */
    public interface a extends Iterator<Byte> {
    }

    public static c b(Iterator<c> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return b(it, i2).d(b(it, i - i2));
    }

    public static b n() {
        return new b();
    }

    public final c d(c cVar) {
        s sVar;
        c pop;
        int size = size();
        int size2 = cVar.size();
        if (size + size2 < 2147483647L) {
            int[] iArr = s.i;
            if (this instanceof s) {
                sVar = (s) this;
            } else {
                sVar = null;
            }
            if (cVar.size() == 0) {
                return this;
            }
            if (size() != 0) {
                int size3 = cVar.size() + size();
                if (size3 < 128) {
                    int size4 = size();
                    int size5 = cVar.size();
                    byte[] bArr = new byte[size4 + size5];
                    e(bArr, 0, 0, size4);
                    cVar.e(bArr, 0, size4, size5);
                    return new o(bArr);
                }
                if (sVar != null) {
                    c cVar2 = sVar.e;
                    if (cVar.size() + cVar2.size() < 128) {
                        int size6 = cVar2.size();
                        int size7 = cVar.size();
                        byte[] bArr2 = new byte[size6 + size7];
                        cVar2.e(bArr2, 0, 0, size6);
                        cVar.e(bArr2, 0, size6, size7);
                        return new s(sVar.d, new o(bArr2));
                    }
                }
                if (sVar != null) {
                    c cVar3 = sVar.d;
                    int g = cVar3.g();
                    c cVar4 = sVar.e;
                    if (g > cVar4.g()) {
                        if (sVar.g > cVar.g()) {
                            return new s(cVar3, new s(cVar4, cVar));
                        }
                    }
                }
                if (size3 >= s.i[Math.max(g(), cVar.g()) + 1]) {
                    pop = new s(this, cVar);
                } else {
                    s.a aVar = new s.a();
                    aVar.a(this);
                    aVar.a(cVar);
                    Stack<c> stack = aVar.a;
                    pop = stack.pop();
                    while (!stack.isEmpty()) {
                        pop = new s(stack.pop(), pop);
                    }
                }
                return pop;
            }
            return cVar;
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append("+");
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void e(byte[] bArr, int i, int i2, int i3) {
        if (i >= 0) {
            if (i2 >= 0) {
                if (i3 >= 0) {
                    int i4 = i + i3;
                    if (i4 <= size()) {
                        int i5 = i2 + i3;
                        if (i5 <= bArr.length) {
                            if (i3 > 0) {
                                f(bArr, i, i2, i3);
                                return;
                            }
                            return;
                        }
                        throw new IndexOutOfBoundsException(j0.c(34, "Target end offset < 0: ", i5));
                    }
                    throw new IndexOutOfBoundsException(j0.c(34, "Source end offset < 0: ", i4));
                }
                throw new IndexOutOfBoundsException(j0.c(23, "Length < 0: ", i3));
            }
            throw new IndexOutOfBoundsException(j0.c(30, "Target offset < 0: ", i2));
        }
        throw new IndexOutOfBoundsException(j0.c(30, "Source offset < 0: ", i));
    }

    public abstract void f(byte[] bArr, int i, int i2, int i3);

    public abstract int g();

    public abstract boolean j();

    public abstract boolean k();

    @Override // java.lang.Iterable
    /* renamed from: l */
    public abstract a iterator();

    public abstract int o(int i, int i2, int i3);

    public abstract int p(int i, int i2, int i3);

    public abstract int q();

    public abstract String r() throws UnsupportedEncodingException;

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract void u(OutputStream outputStream, int i, int i2) throws IOException;

    /* compiled from: ByteString.java */
    /* loaded from: classes4.dex */
    public static final class b extends OutputStream {
        public static final byte[] g = new byte[0];
        public int d;
        public int f;
        public final int b = 128;
        public final ArrayList<c> c = new ArrayList<>();
        public byte[] e = new byte[128];

        public final void a(int i) {
            this.c.add(new o(this.e));
            int length = this.d + this.e.length;
            this.d = length;
            this.e = new byte[Math.max(this.b, Math.max(i, length >>> 1))];
            this.f = 0;
        }

        public final void c() {
            int i = this.f;
            byte[] bArr = this.e;
            int length = bArr.length;
            ArrayList<c> arrayList = this.c;
            if (i < length) {
                if (i > 0) {
                    byte[] bArr2 = new byte[i];
                    System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
                    arrayList.add(new o(bArr2));
                }
            } else {
                arrayList.add(new o(this.e));
                this.e = g;
            }
            this.d += this.f;
            this.f = 0;
        }

        public final synchronized c f() {
            c b;
            c();
            ArrayList<c> arrayList = this.c;
            if (!(arrayList instanceof Collection)) {
                ArrayList<c> arrayList2 = new ArrayList<>();
                Iterator<c> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                arrayList = arrayList2;
            }
            if (arrayList.isEmpty()) {
                b = c.b;
            } else {
                b = c.b(arrayList.iterator(), arrayList.size());
            }
            return b;
        }

        public final String toString() {
            int i;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
                i = this.d + this.f;
            }
            objArr[1] = Integer.valueOf(i);
            return String.format("<ByteString.Output@%s size=%d>", objArr);
        }

        @Override // java.io.OutputStream
        public final synchronized void write(int i) {
            if (this.f == this.e.length) {
                a(1);
            }
            byte[] bArr = this.e;
            int i2 = this.f;
            this.f = i2 + 1;
            bArr[i2] = (byte) i;
        }

        @Override // java.io.OutputStream
        public final synchronized void write(byte[] bArr, int i, int i2) {
            byte[] bArr2 = this.e;
            int length = bArr2.length;
            int i3 = this.f;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                a(i4);
                System.arraycopy(bArr, i + length2, this.e, 0, i4);
                this.f = i4;
            }
        }
    }
}
