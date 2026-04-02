package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: assets/audience_network.dex */
public final class HF implements InterfaceC0875Qv {
    public static byte[] A07;
    public static String[] A08 = {"Z3ZBH3trhaxMswGoeO0i3WMhBsCqcWgs", "P814sFImmOC", "INcscN3Z5kcfIuBeknVxelrdNm8ANoXs", "RvJjsajerkLdUat3TDI8NPR3DDSWtO", "ZLSXhw", "wxtWSqUF9a7Aw2d1StIocmcoa4QX", "58xAXbC3p", "Zj1UZNXOzFX"};
    public static final String A09;
    public InterfaceC04388y A00;
    public Executor A01;
    public boolean A02;
    public R0 A03;
    public final R5 A04 = new Hm();
    public final RA A05;
    public final RB A06;

    public static String A07(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{16, 18, 55, 58, 95, 55, 53, 74, 71, 14, 74, 72, 15, 76, 90, 93, 67, 15, 14, 71, 93, 14, 64, 65, 90, 14, 79, 14, 88, 79, 66, 71, 74, 14, 123, 124, 98, 14, 65, 72, 14, 94, 102, 106, 9, 30, 106, 119, 106, 28, 16, 98, 100, 16, 13, 16, 55, 59, 111, 105, 98, 114, 117, 124, 59, 81, 17, 59, 50, 63, 46, 45, 59, 58, 94, 42, 55, 51, 59, 94, 67, 94, 1, 35, 50, 50, 47, 40, 33, 102, 50, 46, 35, 102, 46, 50, 50, 54, 102, 52, 35, 53, 54, 41, 40, 53, 35, 102, 50, 47, 43, 35, 34, 102, 41, 51, 50, 38, 13, 28, 31, 7, 26, 3, 72, 13, 26, 26, 7, 26, 34, 35, 49, 90, 79, 122, 107, 107, 119, 114, 120, 122, 111, 114, 116, 117, 52, 99, 54, 108, 108, 108, 54, 125, 116, 105, 118, 54, 110, 105, 119, 126, 117, 120, 116, Byte.MAX_VALUE, 126, Byte.MAX_VALUE, 32, 120, 115, 122, 105, 104, 126, 111, 38, 78, 79, 93, 54, 35, 47, 57, 62, 32, 108, 97, 39, 108, 97, 37, 24, 4, 4, 0, 94, 0, 2, 31, 8, 9, 56, 31, 3, 4, Byte.MAX_VALUE, 99, 99, 103, 57, 103, 101, 120, 111, 110, 71, 120, 101, 99, 52, 63, 46, 45, 53, 40, 49};
    }

    static {
        A0A();
        A09 = InterfaceC0875Qv.class.getSimpleName();
    }

    public HF(R0 r0, InterfaceC04388y interfaceC04388y, Executor executor) {
        A0B();
        this.A03 = r0;
        this.A06 = new H5(r0.A04());
        final RB rb = this.A06;
        this.A05 = new AbstractC0637Hk(rb) { // from class: com.facebook.ads.redexgen.X.4M
        };
        this.A01 = executor;
        this.A00 = interfaceC04388y;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStream = null;
        try {
            outputStream = this.A05.ACy(httpURLConnection);
            if (outputStream != null) {
                this.A05.AFo(outputStream, bArr);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
            }
            return responseCode;
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[Catch: Exception -> 0x00c0, all -> 0x013d, TryCatch #1 {Exception -> 0x00c0, blocks: (B:3:0x000b, B:5:0x0013, B:6:0x0017, B:8:0x002d, B:9:0x0036, B:11:0x004a, B:18:0x0059, B:21:0x0060, B:30:0x007f, B:29:0x0072, B:31:0x008b, B:33:0x0091, B:35:0x0097, B:36:0x009e, B:38:0x00a4, B:39:0x00a9, B:14:0x0051), top: B:88:0x000b, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4 A[Catch: Exception -> 0x00c0, all -> 0x013d, TryCatch #1 {Exception -> 0x00c0, blocks: (B:3:0x000b, B:5:0x0013, B:6:0x0017, B:8:0x002d, B:9:0x0036, B:11:0x004a, B:18:0x0059, B:21:0x0060, B:30:0x007f, B:29:0x0072, B:31:0x008b, B:33:0x0091, B:35:0x0097, B:36:0x009e, B:38:0x00a4, B:39:0x00a9, B:14:0x0051), top: B:88:0x000b, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9 A[Catch: Exception -> 0x00c0, all -> 0x013d, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c0, blocks: (B:3:0x000b, B:5:0x0013, B:6:0x0017, B:8:0x002d, B:9:0x0036, B:11:0x004a, B:18:0x0059, B:21:0x0060, B:30:0x007f, B:29:0x0072, B:31:0x008b, B:33:0x0091, B:35:0x0097, B:36:0x009e, B:38:0x00a4, B:39:0x00a9, B:14:0x0051), top: B:88:0x000b, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.ads.redexgen.X.InterfaceC0874Qu A01(com.facebook.ads.redexgen.X.R7 r9) throws com.facebook.ads.redexgen.X.R8 {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.HF.A01(com.facebook.ads.redexgen.X.R7):com.facebook.ads.redexgen.X.Qu");
    }

    @Nullable
    private final InterfaceC0874Qu A02(R7 r7) {
        if (this.A03.A04()) {
            A0C(r7);
        }
        InterfaceC0874Qu interfaceC0874Qu = null;
        try {
            interfaceC0874Qu = A01(r7);
            return interfaceC0874Qu;
        } catch (R8 e2) {
            this.A05.AAj(e2);
            return interfaceC0874Qu;
        } catch (Exception e3) {
            this.A05.AAj(new R8(e3, interfaceC0874Qu));
            return interfaceC0874Qu;
        }
    }

    @Nullable
    private final InterfaceC0874Qu A03(String str, R9 r9, R3 r3) {
        return A02(new C0634Hg(str, r9, r3));
    }

    @Nullable
    private final InterfaceC0874Qu A04(String str, String str2, byte[] bArr, R3 r3) {
        return A02(new HN(str, null, str2, bArr, r3));
    }

    private final InterfaceC0874Qu A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] bArr = null;
        try {
            inputStream = httpURLConnection.getErrorStream();
            if (inputStream != null) {
                bArr = this.A05.ADb(inputStream);
            }
            HK hk = new HK(httpURLConnection, bArr);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return hk;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final InterfaceC0874Qu A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] bArr = null;
        try {
            inputStream = this.A05.ACx(httpURLConnection);
            if (inputStream != null) {
                bArr = this.A05.ADb(inputStream);
            }
            HK hk = new HK(httpURLConnection, bArr);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return hk;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final HttpURLConnection A08(String str, Proxy proxy) throws IOException {
        try {
            new URL(str);
            TrafficStats.setThreadStatsTag(61453);
            return this.A05.ACw(str, proxy);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(str + A07(18, 19, 115), e2);
        }
    }

    public static Proxy A09() {
        Proxy proxy = Proxy.NO_PROXY;
        String property = System.getProperty(A07(192, 14, 45));
        String property2 = System.getProperty(A07(206, 14, 74));
        int i2 = -1;
        if (property2 != null) {
            try {
                i2 = Integer.parseInt(property2);
            } catch (NumberFormatException unused) {
                return proxy;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(property);
        String[] strArr = A08;
        String portStr = strArr[0];
        String proxyAddress = strArr[2];
        if (portStr.charAt(28) != proxyAddress.charAt(28)) {
            String[] strArr2 = A08;
            strArr2[3] = "UW2PAxLqNCWQ7bdKo0A7Pw4nSyNkIv";
            strArr2[6] = "26yRDH09B";
            if (!isEmpty && i2 > 0 && i2 <= 65535) {
                return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, i2));
            }
            return proxy;
        }
        throw new RuntimeException();
    }

    public static synchronized void A0B() {
        synchronized (HF.class) {
            if (CookieHandler.getDefault() == null) {
                CookieHandler.setDefault(new CookieManager());
            }
        }
    }

    private void A0C(R7 r7) {
        StringBuilder sb = new StringBuilder(A07(182, 10, 17));
        boolean equals = r7.A03().equals(R6.A06);
        String A072 = A07(41, 1, 33);
        if (equals && r7.A06() != null) {
            sb.append(A07(7, 5, 55));
            sb.append(new String(r7.A06(), Charset.forName(A07(130, 5, 42))));
            sb.append(A072);
        }
        Map<String, String> A06 = r7.A02().A06();
        String[] strArr = A08;
        if (strArr[1].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "s0c02ga9sXqOOqZgqzjFkG4II3gfLx";
        strArr2[6] = "iECV1gT3x";
        for (Map.Entry<String, String> entry : A06.entrySet()) {
            sb.append(A07(2, 5, 74));
            sb.append(entry.getKey());
            sb.append(A07(66, 1, 118));
            sb.append(entry.getValue());
            sb.append(A072);
        }
        sb.append(A07(0, 2, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD));
        sb.append(r7.A05());
        sb.append(A072);
        String sb2 = sb.toString();
        A0E(sb2, 1, (sb2.length() / 4000) + 1);
    }

    private void A0D(R7 r7, InterfaceC0876Qw interfaceC0876Qw) {
        this.A04.A5j(this, interfaceC0876Qw, this.A01).A5G(r7);
        if (this.A03.A04()) {
            A0C(r7);
        }
    }

    private void A0E(String str, int i2, int i3) {
        String str2 = A09 + A07(12, 6, 114) + i2 + A07(65, 1, 35) + i3;
        if (str.length() > 4000) {
            str.substring(0, 4000);
            A0E(str.substring(4000), i2 + 1, i3);
        }
    }

    private void A0F(String str, String str2, byte[] bArr, InterfaceC0876Qw interfaceC0876Qw, R3 r3) {
        A0D(new HN(str, null, str2, bArr, r3), interfaceC0876Qw);
    }

    private void A0G(HttpURLConnection httpURLConnection, R7 r7) {
        Map<String, String> A06 = r7.A02().A06();
        InterfaceC0873Qt A05 = r7.A02().A05();
        for (String str : A06.keySet()) {
            String name = A06.get(str);
            httpURLConnection.setRequestProperty(str, name);
        }
        if (A05 != null) {
            Map<String, String> A5V = A05.A5V(this.A03.A03());
            for (String str2 : A5V.keySet()) {
                String value = A5V.get(str2);
                httpURLConnection.setRequestProperty(str2, value);
            }
        }
    }

    private final void A0H(HttpURLConnection httpURLConnection, R7 r7) throws IOException {
        R3 A02 = r7.A02();
        httpURLConnection.setConnectTimeout(A02.A00());
        httpURLConnection.setReadTimeout(A02.A02());
        this.A05.ADF(httpURLConnection, r7.A03(), r7.A04());
    }

    private final boolean A0I(Throwable th, long j2, R7 r7) {
        R3 A02 = r7.A02();
        long currentTimeMillis = (System.currentTimeMillis() - j2) + 10;
        if (this.A06.A8Z()) {
            String str = A07(67, 15, 35) + currentTimeMillis + A07(42, 7, 23) + A02.A00() + A07(49, 7, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD) + A02.A02();
        }
        if (this.A02) {
            return currentTimeMillis >= ((long) A02.A02());
        }
        long A00 = A02.A00();
        if (A08[5].length() != 28) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[3] = "UT6xnSlzbr9JaeC9T1uoRQiwoDXC3Y";
        strArr[6] = "g5URFCrsk";
        return currentTimeMillis >= A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x017d, code lost:
        if (r25.A04 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017f, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a8, code lost:
        if (r25.A04 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ab, code lost:
        r0 = r25.A04.length;
        r0 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.X.InterfaceC0874Qu A0J(com.facebook.ads.redexgen.X.R7 r25) throws com.facebook.ads.redexgen.X.R8 {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.HF.A0J(com.facebook.ads.redexgen.X.R7):com.facebook.ads.redexgen.X.Qu");
    }

    public final R0 A0K() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Qv
    @Nullable
    @Deprecated
    public final InterfaceC0874Qu AD7(String str, Map<String, String> map) {
        return A03(str, new R9(map), this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Qv
    @Nullable
    @Deprecated
    public final InterfaceC0874Qu AD8(String str, byte[] bArr) {
        return A04(str, A07(135, 47, 70), bArr, this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Qv
    public final void AD9(String str, byte[] bArr, InterfaceC0876Qw interfaceC0876Qw) {
        A0F(str, A07(135, 47, 70), bArr, interfaceC0876Qw, this.A03.A00());
    }
}
