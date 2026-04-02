package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1;

import java.io.IOException;
/* loaded from: classes.dex */
public final class e {
    static final bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f a = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    static final String[] c = new String[64];
    static final String[] d = new String[256];

    static {
        int i;
        String[] strArr;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr2 = d;
            if (i3 >= strArr2.length) {
                break;
            }
            strArr2[i3] = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a("%8s", Integer.toBinaryString(i3)).replace(' ', '0');
            i3++;
        }
        String[] strArr3 = c;
        strArr3[0] = "";
        strArr3[1] = "END_STREAM";
        int[] iArr = {1};
        strArr3[8] = "PADDED";
        for (int i4 = 0; i4 < 1; i4++) {
            c[iArr[i4] | 8] = strArr[i] + "|PADDED";
        }
        String[] strArr4 = c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr5 = c;
                int i9 = i8 | i6;
                strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                strArr5[i9 | 8] = strArr5[i8] + '|' + strArr5[i6] + "|PADDED";
            }
        }
        while (true) {
            String[] strArr6 = c;
            if (i2 >= strArr6.length) {
                return;
            }
            if (strArr6[i2] == null) {
                strArr6[i2] = d[i2];
            }
            i2++;
        }
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IllegalArgumentException a(String str, Object... objArr) {
        throw new IllegalArgumentException(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(str, objArr));
    }

    static String a(byte b2, byte b3) {
        String str;
        String str2;
        if (b3 == 0) {
            return "";
        }
        if (b2 != 2 && b2 != 3) {
            if (b2 == 4 || b2 == 6) {
                return b3 == 1 ? "ACK" : d[b3];
            } else if (b2 != 7 && b2 != 8) {
                String[] strArr = c;
                String str3 = b3 < strArr.length ? strArr[b3] : d[b3];
                if (b2 == 5 && (b3 & 4) != 0) {
                    str = "HEADERS";
                    str2 = "PUSH_PROMISE";
                } else if (b2 != 0 || (b3 & 32) == 0) {
                    return str3;
                } else {
                    str = "PRIORITY";
                    str2 = "COMPRESSED";
                }
                return str3.replace(str, str2);
            }
        }
        return d[b3];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(boolean z, int i, int i2, byte b2, byte b3) {
        String[] strArr = b;
        return bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), b2 < strArr.length ? strArr[b2] : bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a("0x%02x", Byte.valueOf(b2)), a(b2, b3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IOException b(String str, Object... objArr) throws IOException {
        throw new IOException(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(str, objArr));
    }
}
