package okhttp3.internal.publicsuffix;

import e.j.d.w;
import h.o.c.j;
import j.i0.c;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import k.g;
import k.l;
import k.n;
import k.o;
import k.r;
import k.y;
import org.slf4j.Marker;
/* loaded from: classes2.dex */
public final class PublicSuffixDatabase {
    public static final byte[] a = {42};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f9948b = new String[0];

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f9949c = {Marker.ANY_MARKER};

    /* renamed from: d  reason: collision with root package name */
    public static final PublicSuffixDatabase f9950d = new PublicSuffixDatabase();

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f9951e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final CountDownLatch f9952f = new CountDownLatch(1);

    /* renamed from: g  reason: collision with root package name */
    public byte[] f9953g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f9954h;

    public static String a(byte[] bArr, byte[][] bArr2, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int length = bArr.length;
        int i6 = 0;
        while (i6 < length) {
            int i7 = (i6 + length) / 2;
            while (i7 > -1 && bArr[i7] != 10) {
                i7--;
            }
            int i8 = i7 + 1;
            int i9 = 1;
            while (true) {
                i3 = i8 + i9;
                if (bArr[i3] == 10) {
                    break;
                }
                i9++;
            }
            int i10 = i3 - i8;
            int i11 = i2;
            boolean z2 = false;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (z2) {
                    i4 = 46;
                    z = false;
                } else {
                    z = z2;
                    i4 = bArr2[i11][i12] & 255;
                }
                i5 = i4 - (bArr[i8 + i13] & 255);
                if (i5 == 0) {
                    i13++;
                    i12++;
                    if (i13 == i10) {
                        break;
                    } else if (bArr2[i11].length != i12) {
                        z2 = z;
                    } else if (i11 == bArr2.length - 1) {
                        break;
                    } else {
                        i11++;
                        z2 = true;
                        i12 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i5 >= 0) {
                if (i5 <= 0) {
                    int i14 = i10 - i13;
                    int length2 = bArr2[i11].length - i12;
                    while (true) {
                        i11++;
                        if (i11 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i11].length;
                    }
                    if (length2 >= i14) {
                        if (length2 <= i14) {
                            return new String(bArr, i8, i10, c.f9276i);
                        }
                    }
                }
                i6 = i3 + 1;
            }
            length = i8 - 1;
        }
        return null;
    }

    public final void b() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        Logger logger = o.a;
        j.e(resourceAsStream, "<this>");
        g l2 = w.l(new l(new n(resourceAsStream, new y())));
        try {
            r rVar = (r) l2;
            byte[] bArr = new byte[rVar.readInt()];
            rVar.f(bArr);
            byte[] bArr2 = new byte[rVar.readInt()];
            rVar.f(bArr2);
            synchronized (this) {
                this.f9953g = bArr;
                this.f9954h = bArr2;
            }
            this.f9952f.countDown();
        } finally {
            c.e(l2);
        }
    }
}
