package okhttp3.internal;

import com.amazon.aps.iva.ef0.e;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.yb0.j;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: hostnames.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002\u001a\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u00020\u0003¨\u0006\u000f"}, d2 = {"decodeIpv4Suffix", "", "input", "", "pos", "", "limit", "address", "", "addressOffset", "decodeIpv6", "Ljava/net/InetAddress;", "inet6AddressToAscii", "containsInvalidHostnameAsciiCodes", "toCanonicalHost", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (j.h(charAt, 31) <= 0 || j.h(charAt, 127) >= 0 || q.q0(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (j.h(charAt, 48) < 0 || j.h(charAt, 57) > 0) {
                    break;
                } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        if (i4 != i3 + 4) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0076, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.net.InetAddress decodeIpv6(java.lang.String r11, int r12, int r13) {
        /*
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = -1
            r4 = r2
            r5 = r3
            r6 = r5
        L9:
            r7 = 0
            if (r12 >= r13) goto L77
            if (r4 != r0) goto Lf
            return r7
        Lf:
            int r8 = r12 + 2
            if (r8 > r13) goto L26
            java.lang.String r9 = "::"
            boolean r9 = com.amazon.aps.iva.oe0.m.g0(r12, r11, r9, r2)
            if (r9 == 0) goto L26
            if (r5 == r3) goto L1e
            return r7
        L1e:
            int r4 = r4 + 2
            r5 = r4
            if (r8 != r13) goto L24
            goto L77
        L24:
            r6 = r8
            goto L49
        L26:
            if (r4 == 0) goto L48
            java.lang.String r8 = ":"
            boolean r8 = com.amazon.aps.iva.oe0.m.g0(r12, r11, r8, r2)
            if (r8 == 0) goto L33
            int r12 = r12 + 1
            goto L48
        L33:
            java.lang.String r8 = "."
            boolean r12 = com.amazon.aps.iva.oe0.m.g0(r12, r11, r8, r2)
            if (r12 == 0) goto L47
            int r12 = r4 + (-2)
            boolean r11 = decodeIpv4Suffix(r11, r6, r13, r1, r12)
            if (r11 != 0) goto L44
            return r7
        L44:
            int r4 = r4 + 2
            goto L77
        L47:
            return r7
        L48:
            r6 = r12
        L49:
            r8 = r2
            r12 = r6
        L4b:
            if (r12 >= r13) goto L5d
            char r9 = r11.charAt(r12)
            int r9 = okhttp3.internal.Util.parseHexDigit(r9)
            if (r9 == r3) goto L5d
            int r8 = r8 << 4
            int r8 = r8 + r9
            int r12 = r12 + 1
            goto L4b
        L5d:
            int r9 = r12 - r6
            if (r9 == 0) goto L76
            r10 = 4
            if (r9 <= r10) goto L65
            goto L76
        L65:
            int r7 = r4 + 1
            int r9 = r8 >>> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r1[r4] = r9
            int r4 = r7 + 1
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r1[r7] = r8
            goto L9
        L76:
            return r7
        L77:
            if (r4 == r0) goto L88
            if (r5 != r3) goto L7c
            return r7
        L7c:
            int r11 = r4 - r5
            int r12 = 16 - r11
            java.lang.System.arraycopy(r1, r5, r1, r12, r11)
            int r0 = r0 - r4
            int r0 = r0 + r5
            java.util.Arrays.fill(r1, r5, r0, r2)
        L88:
            java.net.InetAddress r11 = java.net.InetAddress.getByAddress(r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.HostnamesKt.decodeIpv6(java.lang.String, int, int):java.net.InetAddress");
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        e eVar = new e();
        while (i2 < bArr.length) {
            if (i2 == i) {
                eVar.L(58);
                i2 += i4;
                if (i2 == 16) {
                    eVar.L(58);
                }
            } else {
                if (i2 > 0) {
                    eVar.L(58);
                }
                eVar.N((Util.and(bArr[i2], 255) << 8) | Util.and(bArr[i2 + 1], 255));
                i2 += 2;
            }
        }
        return eVar.A();
    }

    public static final String toCanonicalHost(String str) {
        InetAddress decodeIpv6;
        j.f(str, "<this>");
        boolean z = false;
        if (q.i0(str, ":", false)) {
            if (m.h0(str, "[", false) && m.Y(str, "]", false)) {
                decodeIpv6 = decodeIpv6(str, 1, str.length() - 1);
            } else {
                decodeIpv6 = decodeIpv6(str, 0, str.length());
            }
            if (decodeIpv6 == null) {
                return null;
            }
            byte[] address = decodeIpv6.getAddress();
            if (address.length == 16) {
                return inet6AddressToAscii(address);
            }
            if (address.length == 4) {
                return decodeIpv6.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        try {
            String ascii = IDN.toASCII(str);
            j.e(ascii, "toASCII(host)");
            Locale locale = Locale.US;
            j.e(locale, "US");
            String lowerCase = ascii.toLowerCase(locale);
            j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase.length() == 0) {
                z = true;
            }
            if (z) {
                return null;
            }
            if (containsInvalidHostnameAsciiCodes(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
