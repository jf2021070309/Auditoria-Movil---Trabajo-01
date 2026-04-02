package c.i.j;

import ch.qos.logback.core.CoreConstants;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public final class f {
    public static final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static char[] f2129b = new char[24];

    public static int a(int i2, int i3, boolean z, int i4) {
        if (i2 > 99 || (z && i4 >= 3)) {
            return i3 + 3;
        }
        if (i2 > 9 || (z && i4 >= 2)) {
            return i3 + 2;
        }
        if (z || i2 > 0) {
            return i3 + 1;
        }
        return 0;
    }

    public static void b(long j2, PrintWriter printWriter, int i2) {
        synchronized (a) {
            printWriter.print(new String(f2129b, 0, c(j2, i2)));
        }
    }

    public static int c(long j2, int i2) {
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j3 = j2;
        if (f2129b.length < i2) {
            f2129b = new char[i2];
        }
        char[] cArr = f2129b;
        if (j3 == 0) {
            int i8 = i2 - 1;
            while (i8 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j3 > 0) {
            c2 = '+';
        } else {
            c2 = CoreConstants.DASH_CHAR;
            j3 = -j3;
        }
        int i9 = (int) (j3 % 1000);
        int floor = (int) Math.floor(j3 / 1000);
        if (floor > 86400) {
            i3 = floor / 86400;
            floor -= 86400 * i3;
        } else {
            i3 = 0;
        }
        if (floor > 3600) {
            i4 = floor / 3600;
            floor -= i4 * 3600;
        } else {
            i4 = 0;
        }
        if (floor > 60) {
            int i10 = floor / 60;
            i5 = floor - (i10 * 60);
            i6 = i10;
        } else {
            i5 = floor;
            i6 = 0;
        }
        if (i2 != 0) {
            int a2 = a(i3, 1, false, 0);
            int a3 = a(i4, 1, a2 > 0, 2) + a2;
            int a4 = a(i6, 1, a3 > 0, 2) + a3;
            int a5 = a(i5, 1, a4 > 0, 2) + a4;
            i7 = 0;
            for (int a6 = a(i9, 2, true, a5 > 0 ? 3 : 0) + 1 + a5; a6 < i2; a6++) {
                cArr[i7] = ' ';
                i7++;
            }
        } else {
            i7 = 0;
        }
        cArr[i7] = c2;
        int i11 = i7 + 1;
        boolean z = i2 != 0;
        int d2 = d(cArr, i3, 'd', i11, false, 0);
        int d3 = d(cArr, i4, 'h', d2, d2 != i11, z ? 2 : 0);
        int d4 = d(cArr, i6, 'm', d3, d3 != i11, z ? 2 : 0);
        int d5 = d(cArr, i5, 's', d4, d4 != i11, z ? 2 : 0);
        int d6 = d(cArr, i9, 'm', d5, true, (!z || d5 == i11) ? 0 : 3);
        cArr[d6] = 's';
        return d6 + 1;
    }

    public static int d(char[] cArr, int i2, char c2, int i3, boolean z, int i4) {
        int i5;
        if (z || i2 > 0) {
            if ((!z || i4 < 3) && i2 <= 99) {
                i5 = i3;
            } else {
                int i6 = i2 / 100;
                cArr[i3] = (char) (i6 + 48);
                i5 = i3 + 1;
                i2 -= i6 * 100;
            }
            if ((z && i4 >= 2) || i2 > 9 || i3 != i5) {
                int i7 = i2 / 10;
                cArr[i5] = (char) (i7 + 48);
                i5++;
                i2 -= i7 * 10;
            }
            cArr[i5] = (char) (i2 + 48);
            int i8 = i5 + 1;
            cArr[i8] = c2;
            return i8 + 1;
        }
        return i3;
    }
}
