package com.fyber.inneractive.sdk.player.c.a;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class a {
    private static final int[] a = {1, 2, 3, 6};
    private static final int[] b = {48000, 44100, 32000};
    private static final int[] c = {24000, 22050, 16000};
    private static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a() {
        return 1536;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0051a {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        /* synthetic */ C0051a(String str, int i, int i2, int i3, int i4, byte b) {
            this(str, i, i2, i3, i4);
        }

        private C0051a(String str, int i, int i2, int i3, int i4) {
            this.a = str;
            this.c = i;
            this.b = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    public static com.fyber.inneractive.sdk.player.c.h a(com.fyber.inneractive.sdk.player.c.k.k kVar, String str, String str2, com.fyber.inneractive.sdk.player.c.c.a aVar) {
        int i = b[(kVar.d() & 192) >> 6];
        int d2 = kVar.d();
        int i2 = d[(d2 & 56) >> 3];
        if ((d2 & 4) != 0) {
            i2++;
        }
        return com.fyber.inneractive.sdk.player.c.h.a(str, "audio/ac3", -1, -1, i2, i, null, aVar, str2);
    }

    public static com.fyber.inneractive.sdk.player.c.h b(com.fyber.inneractive.sdk.player.c.k.k kVar, String str, String str2, com.fyber.inneractive.sdk.player.c.c.a aVar) {
        kVar.d(2);
        int i = b[(kVar.d() & 192) >> 6];
        int d2 = kVar.d();
        int i2 = d[(d2 & 14) >> 1];
        if ((d2 & 1) != 0) {
            i2++;
        }
        return com.fyber.inneractive.sdk.player.c.h.a(str, "audio/eac3", -1, -1, i2, i, null, aVar, str2);
    }

    public static int a(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        return a((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    public static int a(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }

    private static int a(int i, int i2) {
        int i3 = i2 / 2;
        if (i >= 0) {
            int[] iArr = b;
            if (i >= iArr.length || i2 < 0) {
                return -1;
            }
            int[] iArr2 = f;
            if (i3 >= iArr2.length) {
                return -1;
            }
            int i4 = iArr[i];
            if (i4 == 44100) {
                return (iArr2[i3] + (i2 % 2)) * 2;
            }
            int i5 = e[i3];
            return i4 == 32000 ? i5 * 6 : i5 * 4;
        }
        return -1;
    }

    public static C0051a a(com.fyber.inneractive.sdk.player.c.k.j jVar) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6 = (jVar.b * 8) + jVar.c;
        jVar.b(40);
        boolean z = jVar.c(5) == 16;
        jVar.a(i6);
        int i7 = 6;
        if (z) {
            jVar.b(21);
            int c2 = (jVar.c(11) + 1) * 2;
            int c3 = jVar.c(2);
            if (c3 == 3) {
                i5 = c[jVar.c(2)];
            } else {
                i7 = a[jVar.c(2)];
                i5 = b[c3];
            }
            i4 = jVar.c(3);
            i3 = i7 * 256;
            i = c2;
            i2 = i5;
            str = "audio/eac3";
        } else {
            jVar.b(32);
            int c4 = jVar.c(2);
            int a2 = a(c4, jVar.c(6));
            jVar.b(8);
            int c5 = jVar.c(3);
            if ((c5 & 1) != 0 && c5 != 1) {
                jVar.b(2);
            }
            if ((c5 & 4) != 0) {
                jVar.b(2);
            }
            if (c5 == 2) {
                jVar.b(2);
            }
            i = a2;
            i2 = b[c4];
            i3 = 1536;
            str = "audio/ac3";
            i4 = c5;
        }
        return new C0051a(str, d[i4] + (jVar.a() ? 1 : 0), i2, i, i3, (byte) 0);
    }
}
