package com.amazon.aps.iva.i7;

import com.amazon.aps.iva.g1.n;
import com.amazon.aps.iva.q5.f0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.u;
import com.amazon.aps.iva.t5.v;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: Id3Decoder.java */
/* loaded from: classes.dex */
public final class g extends com.amazon.aps.iva.ab.a {
    public static final n b = new n(7);
    public final a a;

    /* compiled from: Id3Decoder.java */
    /* loaded from: classes.dex */
    public interface a {
        boolean c(int i, int i2, int i3, int i4, int i5);
    }

    /* compiled from: Id3Decoder.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final boolean b;
        public final int c;

        public b(int i, int i2, boolean z) {
            this.a = i;
            this.b = z;
            this.c = i2;
        }
    }

    public g(a aVar) {
        this.a = aVar;
    }

    public static String A(byte[] bArr, int i, int i2, Charset charset) {
        if (i2 > i && i2 <= bArr.length) {
            return new String(bArr, i, i2 - i, charset);
        }
        return "";
    }

    public static ImmutableList B(int i, byte[] bArr, int i2) {
        if (i2 >= bArr.length) {
            return ImmutableList.of("");
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        int F = F(i2, bArr, i);
        while (i2 < F) {
            builder.add((ImmutableList.Builder) new String(bArr, i2, F - i2, D(i)));
            i2 = C(i) + F;
            F = F(i2, bArr, i);
        }
        ImmutableList build = builder.build();
        if (build.isEmpty()) {
            return ImmutableList.of("");
        }
        return build;
    }

    public static int C(int i) {
        if (i != 0 && i != 3) {
            return 2;
        }
        return 1;
    }

    public static Charset D(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return Charsets.ISO_8859_1;
                }
                return Charsets.UTF_8;
            }
            return Charsets.UTF_16BE;
        }
        return Charsets.UTF_16;
    }

    public static String E(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int F(int i, byte[] bArr, int i2) {
        int G = G(i, bArr);
        if (i2 != 0 && i2 != 3) {
            while (G < bArr.length - 1) {
                if ((G - i) % 2 == 0 && bArr[G + 1] == 0) {
                    return G;
                }
                G = G(G + 1, bArr);
            }
            return bArr.length;
        }
        return G;
    }

    public static int G(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int H(int i, v vVar) {
        byte[] bArr = vVar.a;
        int i2 = vVar.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 < i2 + i) {
                if ((bArr[i3] & UnsignedBytes.MAX_VALUE) == 255 && bArr[i4] == 0) {
                    System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                    i--;
                }
                i3 = i4;
            } else {
                return i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
        if ((r10 & 128) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean I(com.amazon.aps.iva.t5.v r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.i7.g.I(com.amazon.aps.iva.t5.v, int, int, boolean):boolean");
    }

    public static com.amazon.aps.iva.i7.a t(int i, int i2, v vVar) {
        int G;
        String str;
        byte[] copyOfRange;
        int u = vVar.u();
        Charset D = D(u);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        vVar.d(0, bArr, i3);
        if (i2 == 2) {
            String str2 = "image/" + Ascii.toLowerCase(new String(bArr, 0, 3, Charsets.ISO_8859_1));
            if ("image/jpg".equals(str2)) {
                str2 = "image/jpeg";
            }
            str = str2;
            G = 2;
        } else {
            G = G(0, bArr);
            String lowerCase = Ascii.toLowerCase(new String(bArr, 0, G, Charsets.ISO_8859_1));
            if (lowerCase.indexOf(47) == -1) {
                str = "image/".concat(lowerCase);
            } else {
                str = lowerCase;
            }
        }
        int i4 = bArr[G + 1] & UnsignedBytes.MAX_VALUE;
        int i5 = G + 2;
        int F = F(i5, bArr, u);
        String str3 = new String(bArr, i5, F - i5, D);
        int C = C(u) + F;
        if (i3 <= C) {
            copyOfRange = g0.e;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, C, i3);
        }
        return new com.amazon.aps.iva.i7.a(str, str3, i4, copyOfRange);
    }

    public static c u(v vVar, int i, int i2, boolean z, int i3, a aVar) {
        long j;
        long j2;
        int i4 = vVar.b;
        int G = G(i4, vVar.a);
        String str = new String(vVar.a, i4, G - i4, Charsets.ISO_8859_1);
        vVar.F(G + 1);
        int e = vVar.e();
        int e2 = vVar.e();
        long v = vVar.v();
        if (v == 4294967295L) {
            j = -1;
        } else {
            j = v;
        }
        long v2 = vVar.v();
        if (v2 == 4294967295L) {
            j2 = -1;
        } else {
            j2 = v2;
        }
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (vVar.b < i5) {
            h x = x(i2, vVar, z, i3, aVar);
            if (x != null) {
                arrayList.add(x);
            }
        }
        return new c(str, e, e2, j, j2, (h[]) arrayList.toArray(new h[0]));
    }

    public static d v(v vVar, int i, int i2, boolean z, int i3, a aVar) {
        boolean z2;
        boolean z3;
        int i4 = vVar.b;
        int G = G(i4, vVar.a);
        String str = new String(vVar.a, i4, G - i4, Charsets.ISO_8859_1);
        vVar.F(G + 1);
        int u = vVar.u();
        if ((u & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((u & 1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int u2 = vVar.u();
        String[] strArr = new String[u2];
        for (int i5 = 0; i5 < u2; i5++) {
            int i6 = vVar.b;
            int G2 = G(i6, vVar.a);
            strArr[i5] = new String(vVar.a, i6, G2 - i6, Charsets.ISO_8859_1);
            vVar.F(G2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (vVar.b < i7) {
            h x = x(i2, vVar, z, i3, aVar);
            if (x != null) {
                arrayList.add(x);
            }
        }
        return new d(str, z2, z3, strArr, (h[]) arrayList.toArray(new h[0]));
    }

    public static e w(int i, v vVar) {
        if (i < 4) {
            return null;
        }
        int u = vVar.u();
        Charset D = D(u);
        byte[] bArr = new byte[3];
        vVar.d(0, bArr, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        vVar.d(0, bArr2, i2);
        int F = F(0, bArr2, u);
        String str2 = new String(bArr2, 0, F, D);
        int C = C(u) + F;
        return new e(str, str2, A(bArr2, C, F(C, bArr2, u), D));
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x021a, code lost:
        if (r13 == 67) goto L110;
     */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.amazon.aps.iva.i7.h, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.aps.iva.i7.h x(int r18, com.amazon.aps.iva.t5.v r19, boolean r20, int r21, com.amazon.aps.iva.i7.g.a r22) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.i7.g.x(int, com.amazon.aps.iva.t5.v, boolean, int, com.amazon.aps.iva.i7.g$a):com.amazon.aps.iva.i7.h");
    }

    public static f y(int i, v vVar) {
        byte[] copyOfRange;
        int u = vVar.u();
        Charset D = D(u);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        vVar.d(0, bArr, i2);
        int G = G(0, bArr);
        String str = new String(bArr, 0, G, Charsets.ISO_8859_1);
        int i3 = G + 1;
        int F = F(i3, bArr, u);
        String A = A(bArr, i3, F, D);
        int C = C(u) + F;
        int F2 = F(C, bArr, u);
        String A2 = A(bArr, C, F2, D);
        int C2 = C(u) + F2;
        if (i2 <= C2) {
            copyOfRange = g0.e;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, C2, i2);
        }
        return new f(str, copyOfRange, A, A2);
    }

    public static j z(int i, v vVar) {
        int z = vVar.z();
        int w = vVar.w();
        int w2 = vVar.w();
        int u = vVar.u();
        int u2 = vVar.u();
        u uVar = new u();
        uVar.n(vVar.c, vVar.a);
        uVar.o(vVar.b * 8);
        int i2 = ((i - 10) * 8) / (u + u2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = uVar.i(u);
            int i5 = uVar.i(u2);
            iArr[i3] = i4;
            iArr2[i3] = i5;
        }
        return new j(z, w, iArr, iArr2, w2);
    }

    @Override // com.amazon.aps.iva.ab.a
    public final f0 e(com.amazon.aps.iva.d7.b bVar, ByteBuffer byteBuffer) {
        return s(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.q5.f0 s(int r12, byte[] r13) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.i7.g.s(int, byte[]):com.amazon.aps.iva.q5.f0");
    }
}
