package com.fyber.inneractive.sdk.player.c.f.a;

import android.util.Log;
import com.fyber.inneractive.sdk.player.c.k.t;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.UByte;
/* loaded from: classes.dex */
public final class g {
    public static final int a = t.e("ID3");
    public final a b;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(int i, int i2, int i3, int i4, int i5);
    }

    private static String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static int b(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public g() {
        this(null);
    }

    public g(a aVar) {
        this.b = aVar;
    }

    public static b a(com.fyber.inneractive.sdk.player.c.k.k kVar) {
        if (kVar.b() < 10) {
            Log.w("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int g = kVar.g();
        if (g != a) {
            Log.w("Id3Decoder", "Unexpected first three bytes of ID3 tag header: " + g);
            return null;
        }
        int d = kVar.d();
        boolean z = true;
        kVar.d(1);
        int d2 = kVar.d();
        int m = kVar.m();
        if (d == 2) {
            if ((d2 & 64) != 0) {
                Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (d == 3) {
            if ((d2 & 64) != 0) {
                int j = kVar.j();
                kVar.d(j);
                m -= j + 4;
            }
        } else if (d != 4) {
            Log.w("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + d);
            return null;
        } else {
            if ((d2 & 64) != 0) {
                int m2 = kVar.m();
                kVar.d(m2 - 4);
                m -= m2;
            }
            if ((d2 & 16) != 0) {
                m -= 10;
            }
        }
        if (d >= 4 || (d2 & 128) == 0) {
            z = false;
        }
        return new b(d, z, m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x028f, code lost:
        if (r13 == 67) goto L142;
     */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03ba A[Catch: all -> 0x03da, UnsupportedEncodingException -> 0x03de, TRY_LEAVE, TryCatch #5 {all -> 0x03da, blocks: (B:207:0x03ba, B:209:0x03d6, B:161:0x02a5, B:169:0x02e0, B:187:0x033f, B:189:0x035e, B:191:0x036c, B:198:0x037f, B:204:0x0399, B:205:0x03a9), top: B:230:0x0108 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fyber.inneractive.sdk.player.c.f.a.h a(int r20, com.fyber.inneractive.sdk.player.c.k.k r21, boolean r22, int r23, com.fyber.inneractive.sdk.player.c.f.a.g.a r24) {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.f.a.g.a(int, com.fyber.inneractive.sdk.player.c.k.k, boolean, int, com.fyber.inneractive.sdk.player.c.f.a.g$a):com.fyber.inneractive.sdk.player.c.f.a.h");
    }

    public static int a(com.fyber.inneractive.sdk.player.c.k.k kVar, int i) {
        byte[] bArr = kVar.a;
        int i2 = kVar.b;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= i) {
                return i;
            }
            if ((bArr[i2] & UByte.MAX_VALUE) == 255 && bArr[i3] == 0) {
                System.arraycopy(bArr, i2 + 2, bArr, i3, (i - i2) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    private static String a(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static int a(byte[] bArr, int i, int i2) {
        int a2 = a(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return a2;
        }
        while (a2 < bArr.length - 1) {
            if (a2 % 2 == 0 && bArr[a2 + 1] == 0) {
                return a2;
            }
            a2 = a(bArr, a2 + 1);
        }
        return bArr.length;
    }

    private static int a(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final boolean b;
        public final int c;

        public b(int i, boolean z, int i2) {
            this.a = i;
            this.b = z;
            this.c = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if ((r10 & 1) != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
        if ((r10 & 128) != 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.fyber.inneractive.sdk.player.c.k.k r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.f.a.g.a(com.fyber.inneractive.sdk.player.c.k.k, int, int, boolean):boolean");
    }

    private static c a(com.fyber.inneractive.sdk.player.c.k.k kVar, int i, int i2, boolean z, int i3, a aVar) throws UnsupportedEncodingException {
        int i4 = kVar.b;
        int a2 = a(kVar.a, i4);
        String str = new String(kVar.a, i4, a2 - i4, "ISO-8859-1");
        kVar.c(a2 + 1);
        int j = kVar.j();
        int j2 = kVar.j();
        long h = kVar.h();
        long j3 = h == 4294967295L ? -1L : h;
        long h2 = kVar.h();
        long j4 = h2 == 4294967295L ? -1L : h2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (kVar.b < i5) {
            h a3 = a(i2, kVar, z, i3, aVar);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        h[] hVarArr = new h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new c(str, j, j2, j3, j4, hVarArr);
    }

    private static d b(com.fyber.inneractive.sdk.player.c.k.k kVar, int i, int i2, boolean z, int i3, a aVar) throws UnsupportedEncodingException {
        int i4 = kVar.b;
        int a2 = a(kVar.a, i4);
        String str = new String(kVar.a, i4, a2 - i4, "ISO-8859-1");
        kVar.c(a2 + 1);
        int d = kVar.d();
        boolean z2 = (d & 2) != 0;
        boolean z3 = (d & 1) != 0;
        int d2 = kVar.d();
        String[] strArr = new String[d2];
        for (int i5 = 0; i5 < d2; i5++) {
            int i6 = kVar.b;
            int a3 = a(kVar.a, i6);
            strArr[i5] = new String(kVar.a, i6, a3 - i6, "ISO-8859-1");
            kVar.c(a3 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (kVar.b < i7) {
            h a4 = a(i2, kVar, z, i3, aVar);
            if (a4 != null) {
                arrayList.add(a4);
            }
        }
        h[] hVarArr = new h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new d(str, z2, z3, strArr, hVarArr);
    }
}
