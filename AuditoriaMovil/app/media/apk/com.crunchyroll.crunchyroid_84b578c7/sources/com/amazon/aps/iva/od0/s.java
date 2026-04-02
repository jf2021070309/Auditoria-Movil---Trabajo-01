package com.amazon.aps.iva.od0;

import com.amazon.aps.iva.od0.c;
import com.amazon.aps.iva.od0.o;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import org.apache.commons.codec.binary.Hex;
/* compiled from: RopeByteString.java */
/* loaded from: classes4.dex */
public final class s extends com.amazon.aps.iva.od0.c {
    public static final int[] i;
    public final int c;
    public final com.amazon.aps.iva.od0.c d;
    public final com.amazon.aps.iva.od0.c e;
    public final int f;
    public final int g;
    public int h;

    /* compiled from: RopeByteString.java */
    /* loaded from: classes4.dex */
    public static class a {
        public final Stack<com.amazon.aps.iva.od0.c> a = new Stack<>();

        public final void a(com.amazon.aps.iva.od0.c cVar) {
            if (cVar.j()) {
                int size = cVar.size();
                int[] iArr = s.i;
                int binarySearch = Arrays.binarySearch(iArr, size);
                if (binarySearch < 0) {
                    binarySearch = (-(binarySearch + 1)) - 1;
                }
                int i = iArr[binarySearch + 1];
                Stack<com.amazon.aps.iva.od0.c> stack = this.a;
                if (!stack.isEmpty() && stack.peek().size() < i) {
                    int i2 = iArr[binarySearch];
                    com.amazon.aps.iva.od0.c pop = stack.pop();
                    while (!stack.isEmpty() && stack.peek().size() < i2) {
                        pop = new s(stack.pop(), pop);
                    }
                    s sVar = new s(pop, cVar);
                    while (!stack.isEmpty()) {
                        int[] iArr2 = s.i;
                        int binarySearch2 = Arrays.binarySearch(iArr2, sVar.c);
                        if (binarySearch2 < 0) {
                            binarySearch2 = (-(binarySearch2 + 1)) - 1;
                        }
                        if (stack.peek().size() >= iArr2[binarySearch2 + 1]) {
                            break;
                        }
                        sVar = new s(stack.pop(), sVar);
                    }
                    stack.push(sVar);
                    return;
                }
                stack.push(cVar);
            } else if (cVar instanceof s) {
                s sVar2 = (s) cVar;
                a(sVar2.d);
                a(sVar2.e);
            } else {
                String valueOf = String.valueOf(cVar.getClass());
                throw new IllegalArgumentException(defpackage.b.c(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
            }
        }
    }

    /* compiled from: RopeByteString.java */
    /* loaded from: classes4.dex */
    public static class b implements Iterator<o> {
        public final Stack<s> b = new Stack<>();
        public o c;

        public b(com.amazon.aps.iva.od0.c cVar) {
            while (cVar instanceof s) {
                s sVar = (s) cVar;
                this.b.push(sVar);
                cVar = sVar.d;
            }
            this.c = (o) cVar;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public final o next() {
            o oVar;
            boolean z;
            o oVar2 = this.c;
            if (oVar2 != null) {
                while (true) {
                    Stack<s> stack = this.b;
                    if (stack.isEmpty()) {
                        oVar = null;
                        break;
                    }
                    Object obj = stack.pop().e;
                    while (obj instanceof s) {
                        s sVar = (s) obj;
                        stack.push(sVar);
                        obj = sVar.d;
                    }
                    oVar = (o) obj;
                    if (oVar.c.length == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        break;
                    }
                }
                this.c = oVar;
                return oVar2;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.c != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: RopeByteString.java */
    /* loaded from: classes4.dex */
    public class c implements c.a {
        public final b b;
        public o.a c;
        public int d;

        public c(s sVar) {
            b bVar = new b(sVar);
            this.b = bVar;
            this.c = new o.a();
            this.d = sVar.c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.d > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        public final byte nextByte() {
            if (!this.c.hasNext()) {
                this.c = new o.a();
            }
            this.d--;
            return this.c.nextByte();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 1;
        while (i2 > 0) {
            arrayList.add(Integer.valueOf(i2));
            int i4 = i3 + i2;
            i3 = i2;
            i2 = i4;
        }
        arrayList.add(Integer.MAX_VALUE);
        i = new int[arrayList.size()];
        int i5 = 0;
        while (true) {
            int[] iArr = i;
            if (i5 < iArr.length) {
                iArr[i5] = ((Integer) arrayList.get(i5)).intValue();
                i5++;
            } else {
                return;
            }
        }
    }

    public /* synthetic */ s() {
        throw null;
    }

    public s(com.amazon.aps.iva.od0.c cVar, com.amazon.aps.iva.od0.c cVar2) {
        this.h = 0;
        this.d = cVar;
        this.e = cVar2;
        int size = cVar.size();
        this.f = size;
        this.c = cVar2.size() + size;
        this.g = Math.max(cVar.g(), cVar2.g()) + 1;
    }

    public final boolean equals(Object obj) {
        boolean w;
        int q;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.amazon.aps.iva.od0.c)) {
            return false;
        }
        com.amazon.aps.iva.od0.c cVar = (com.amazon.aps.iva.od0.c) obj;
        int size = cVar.size();
        int i2 = this.c;
        if (i2 != size) {
            return false;
        }
        if (i2 == 0) {
            return true;
        }
        if (this.h != 0 && (q = cVar.q()) != 0 && this.h != q) {
            return false;
        }
        b bVar = new b(this);
        o next = bVar.next();
        b bVar2 = new b(cVar);
        o next2 = bVar2.next();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int length = next.c.length - i3;
            int length2 = next2.c.length - i4;
            int min = Math.min(length, length2);
            if (i3 == 0) {
                w = next.w(next2, i4, min);
            } else {
                w = next2.w(next, i3, min);
            }
            if (!w) {
                return false;
            }
            i5 += min;
            if (i5 >= i2) {
                if (i5 == i2) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == length) {
                next = bVar.next();
                i3 = 0;
            } else {
                i3 += min;
            }
            if (min == length2) {
                next2 = bVar2.next();
                i4 = 0;
            } else {
                i4 += min;
            }
        }
    }

    @Override // com.amazon.aps.iva.od0.c
    public final void f(byte[] bArr, int i2, int i3, int i4) {
        int i5 = i2 + i4;
        com.amazon.aps.iva.od0.c cVar = this.d;
        int i6 = this.f;
        if (i5 <= i6) {
            cVar.f(bArr, i2, i3, i4);
            return;
        }
        com.amazon.aps.iva.od0.c cVar2 = this.e;
        if (i2 >= i6) {
            cVar2.f(bArr, i2 - i6, i3, i4);
            return;
        }
        int i7 = i6 - i2;
        cVar.f(bArr, i2, i3, i7);
        cVar2.f(bArr, 0, i3 + i7, i4 - i7);
    }

    @Override // com.amazon.aps.iva.od0.c
    public final int g() {
        return this.g;
    }

    public final int hashCode() {
        int i2 = this.h;
        if (i2 == 0) {
            int i3 = this.c;
            i2 = o(i3, 0, i3);
            if (i2 == 0) {
                i2 = 1;
            }
            this.h = i2;
        }
        return i2;
    }

    @Override // com.amazon.aps.iva.od0.c
    public final boolean j() {
        if (this.c >= i[this.g]) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.od0.c
    public final boolean k() {
        int p = this.d.p(0, 0, this.f);
        com.amazon.aps.iva.od0.c cVar = this.e;
        if (cVar.p(p, 0, cVar.size()) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.od0.c, java.lang.Iterable
    /* renamed from: l */
    public final c.a iterator() {
        return new c(this);
    }

    @Override // com.amazon.aps.iva.od0.c
    public final int o(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        com.amazon.aps.iva.od0.c cVar = this.d;
        int i6 = this.f;
        if (i5 <= i6) {
            return cVar.o(i2, i3, i4);
        }
        com.amazon.aps.iva.od0.c cVar2 = this.e;
        if (i3 >= i6) {
            return cVar2.o(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return cVar2.o(cVar.o(i2, i3, i7), 0, i4 - i7);
    }

    @Override // com.amazon.aps.iva.od0.c
    public final int p(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        com.amazon.aps.iva.od0.c cVar = this.d;
        int i6 = this.f;
        if (i5 <= i6) {
            return cVar.p(i2, i3, i4);
        }
        com.amazon.aps.iva.od0.c cVar2 = this.e;
        if (i3 >= i6) {
            return cVar2.p(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return cVar2.p(cVar.p(i2, i3, i7), 0, i4 - i7);
    }

    @Override // com.amazon.aps.iva.od0.c
    public final int q() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.od0.c
    public final String r() throws UnsupportedEncodingException {
        byte[] bArr;
        int i2 = this.c;
        if (i2 == 0) {
            bArr = i.a;
        } else {
            byte[] bArr2 = new byte[i2];
            f(bArr2, 0, 0, i2);
            bArr = bArr2;
        }
        return new String(bArr, Hex.DEFAULT_CHARSET_NAME);
    }

    @Override // com.amazon.aps.iva.od0.c
    public final int size() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.od0.c
    public final void u(OutputStream outputStream, int i2, int i3) throws IOException {
        int i4 = i2 + i3;
        com.amazon.aps.iva.od0.c cVar = this.d;
        int i5 = this.f;
        if (i4 <= i5) {
            cVar.u(outputStream, i2, i3);
            return;
        }
        com.amazon.aps.iva.od0.c cVar2 = this.e;
        if (i2 >= i5) {
            cVar2.u(outputStream, i2 - i5, i3);
            return;
        }
        int i6 = i5 - i2;
        cVar.u(outputStream, i2, i6);
        cVar2.u(outputStream, 0, i3 - i6);
    }
}
