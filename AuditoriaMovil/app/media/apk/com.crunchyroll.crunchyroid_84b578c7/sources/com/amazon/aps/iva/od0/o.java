package com.amazon.aps.iva.od0;

import com.amazon.aps.iva.od0.c;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.NoSuchElementException;
import org.apache.commons.codec.binary.Hex;
/* compiled from: LiteralByteString.java */
/* loaded from: classes4.dex */
public class o extends c {
    public final byte[] c;
    public int d = 0;

    /* compiled from: LiteralByteString.java */
    /* loaded from: classes4.dex */
    public class a implements c.a {
        public int b = 0;
        public final int c;

        public a() {
            this.c = o.this.c.length;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.b < this.c) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        public final byte nextByte() {
            try {
                byte[] bArr = o.this.c;
                int i = this.b;
                this.b = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public o(byte[] bArr) {
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c) || size() != ((c) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof o) {
            return w((o) obj, 0, size());
        }
        if (obj instanceof s) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(defpackage.b.c(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
    }

    @Override // com.amazon.aps.iva.od0.c
    public void f(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.c, i, bArr, i2, i3);
    }

    @Override // com.amazon.aps.iva.od0.c
    public final int g() {
        return 0;
    }

    public final int hashCode() {
        int i = this.d;
        if (i == 0) {
            int size = size();
            i = o(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.d = i;
        }
        return i;
    }

    @Override // com.amazon.aps.iva.od0.c
    public final boolean j() {
        return true;
    }

    @Override // com.amazon.aps.iva.od0.c
    public final boolean k() {
        byte[] bArr = this.c;
        if (com.amazon.aps.iva.a60.b.u(bArr, 0, bArr.length + 0) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.od0.c, java.lang.Iterable
    /* renamed from: l */
    public c.a iterator() {
        return new a();
    }

    @Override // com.amazon.aps.iva.od0.c
    public final int o(int i, int i2, int i3) {
        int x = x() + i2;
        for (int i4 = x; i4 < x + i3; i4++) {
            i = (i * 31) + this.c[i4];
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r1[r11] > (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
        if (r1[r11] > (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0095, code lost:
        if (r1[r11] > (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0098, code lost:
        r11 = r10;
     */
    @Override // com.amazon.aps.iva.od0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int p(int r10, int r11, int r12) {
        /*
            r9 = this;
            r0 = 0
            int r11 = r11 + r0
            int r12 = r12 + r11
            byte[] r1 = r9.c
            if (r10 == 0) goto L9c
            if (r11 < r12) goto Lb
            goto La0
        Lb:
            byte r2 = (byte) r10
            r3 = -65
            r4 = -1
            r5 = -32
            if (r2 >= r5) goto L1f
            r10 = -62
            if (r2 < r10) goto L9a
            int r10 = r11 + 1
            r11 = r1[r11]
            if (r11 <= r3) goto L98
            goto L9a
        L1f:
            r6 = -16
            r7 = -12
            if (r2 >= r6) goto L54
            int r10 = r10 >> 8
            int r10 = ~r10
            byte r10 = (byte) r10
            if (r10 != 0) goto L3f
            int r10 = r11 + 1
            r11 = r1[r11]
            if (r10 < r12) goto L3c
            if (r2 > r7) goto L9a
            if (r11 <= r3) goto L37
            goto L9a
        L37:
            int r10 = r11 << 8
        L39:
            r10 = r10 ^ r2
            goto La0
        L3c:
            r8 = r11
            r11 = r10
            r10 = r8
        L3f:
            if (r10 > r3) goto L9a
            r0 = -96
            if (r2 != r5) goto L47
            if (r10 < r0) goto L9a
        L47:
            r5 = -19
            if (r2 != r5) goto L4d
            if (r10 >= r0) goto L9a
        L4d:
            int r10 = r11 + 1
            r11 = r1[r11]
            if (r11 <= r3) goto L98
            goto L9a
        L54:
            int r5 = r10 >> 8
            int r5 = ~r5
            byte r5 = (byte) r5
            if (r5 != 0) goto L6a
            int r10 = r11 + 1
            r5 = r1[r11]
            if (r10 < r12) goto L68
            if (r2 > r7) goto L9a
            if (r5 <= r3) goto L65
            goto L9a
        L65:
            int r10 = r5 << 8
            goto L39
        L68:
            r11 = r10
            goto L6d
        L6a:
            int r10 = r10 >> 16
            byte r0 = (byte) r10
        L6d:
            if (r0 != 0) goto L84
            int r10 = r11 + 1
            r0 = r1[r11]
            if (r10 < r12) goto L83
            if (r2 > r7) goto L9a
            if (r5 > r3) goto L9a
            if (r0 <= r3) goto L7c
            goto L9a
        L7c:
            int r10 = r5 << 8
            r10 = r10 ^ r2
            int r11 = r0 << 16
            r10 = r10 ^ r11
            goto La0
        L83:
            r11 = r10
        L84:
            if (r5 > r3) goto L9a
            int r10 = r2 << 28
            int r5 = r5 + 112
            int r5 = r5 + r10
            int r10 = r5 >> 30
            if (r10 != 0) goto L9a
            if (r0 > r3) goto L9a
            int r10 = r11 + 1
            r11 = r1[r11]
            if (r11 <= r3) goto L98
            goto L9a
        L98:
            r11 = r10
            goto L9c
        L9a:
            r10 = r4
            goto La0
        L9c:
            int r10 = com.amazon.aps.iva.a60.b.u(r1, r11, r12)
        La0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.od0.o.p(int, int, int):int");
    }

    @Override // com.amazon.aps.iva.od0.c
    public final int q() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.od0.c
    public final String r() throws UnsupportedEncodingException {
        byte[] bArr = this.c;
        return new String(bArr, 0, bArr.length, Hex.DEFAULT_CHARSET_NAME);
    }

    @Override // com.amazon.aps.iva.od0.c
    public int size() {
        return this.c.length;
    }

    @Override // com.amazon.aps.iva.od0.c
    public final void u(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.c, x() + i, i2);
    }

    public final boolean w(o oVar, int i, int i2) {
        if (i2 <= oVar.size()) {
            if (i + i2 <= oVar.size()) {
                int x = x() + i2;
                int x2 = x();
                int x3 = oVar.x() + i;
                while (x2 < x) {
                    if (this.c[x2] != oVar.c[x3]) {
                        return false;
                    }
                    x2++;
                    x3++;
                }
                return true;
            }
            int size = oVar.size();
            StringBuilder sb = new StringBuilder(59);
            sb.append("Ran off end of other: ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(", ");
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        int size2 = size();
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Length too large: ");
        sb2.append(i2);
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public int x() {
        return 0;
    }
}
