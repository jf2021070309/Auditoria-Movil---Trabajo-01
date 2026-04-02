package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Nullable;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.7U  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7U {
    public static AnonymousClass00 A0A;
    public static List<String> A0B;
    public static byte[] A0C;
    public static String[] A0D = {"8gkZjHnxCvZyg7TzwjjGeSdvls9L7Gam", "fcbSC3ja3K2jNylkxCBC51G6bXitMdQ0", "2foOCT", "ocB0m3", "KfMQJM794wt5IuG", "feDb68pnVWWOEqV45c", "KnEa0S3Tnigt4irEXno07XBXpnYxFsFq", "aK1UKkDbG3zR1xh0x3umKxUvmkPLseuR"};
    public static final String A0E;
    public static final Map<String, AnonymousClass06> A0F;
    public long A00;
    public C0692Jo A01;
    public final C7V A03;
    public final C8U A04;
    public final boolean A08;
    public final boolean A09;
    public final Map<String, Bitmap> A07 = Collections.synchronizedMap(new HashMap());
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final List<Callable<Boolean>> A05 = new ArrayList();
    public final List<Callable<Boolean>> A06 = new ArrayList();

    public static String A08(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 10);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A0C = new byte[]{124, -81, Byte.MIN_VALUE, -83, -125, 124, -81, -80, 108, -104, 107, -102, 107, 107, 108, 103, 96, 126, Byte.MIN_VALUE, -123, -126, 61, -112, -111, 126, -113, -111, -126, -127, 75, -119, -89, -87, -82, -81, -76, -83, 102, -87, -75, -77, -74, -78, -85, -70, -85, -113, -83, -81, -76, -75, -70, -77, 108, -78, -83, -75, -72, -79, -80, Byte.MAX_VALUE, -99, -97, -92, -91, -86, -93, 92, -81, -80, -99, -82, -80, -95, -96, 106, 106, 106, 102, -103, -124, -122, -111, -107, -118, -112, -113, 65, -104, -119, -118, -115, -122, 65, -122, -103, -122, -124, -106, -107, -118, -113, -120, 65, -124, -126, -124, -119, -122, 65, -123, -112, -104, -113, -115, -112, -126, -123, -108, 79, -88, 123, -85, 123, 121, 120, Byte.MIN_VALUE, -79, -81, -79, -74, -77, -111, -67, -69, -66, -70, -77, -62, -73, -67, -68, -106, -67, -67, -71, 120, 118, 120, 125, 122, 91, 118, 126, -127, -118, -121, 122, 93, -124, -124, Byte.MIN_VALUE, -120, -101, -120, -122, -104, -105, -120, -24, -21, -35, -32, -27, -24, -38, -35, -40, -19, -30, -26, -34, -40, -26, -20, -96, -107, -100, -92};
    }

    static {
        A0E();
        A0E = C7U.class.getSimpleName();
        A0F = Collections.synchronizedMap(new HashMap());
    }

    public C7U(C8U c8u) {
        this.A04 = c8u;
        this.A03 = C7V.A06(c8u.A00());
        this.A08 = JQ.A1s(c8u);
        this.A09 = JQ.A1z(c8u, QZ.A03());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.07] */
    public static synchronized AnonymousClass00 A03(C1045Xn c1045Xn) {
        AnonymousClass00 anonymousClass00;
        synchronized (C7U.class) {
            if (A0A == null) {
                A0A = AnonymousClass01.A00(c1045Xn, new Object() { // from class: com.facebook.ads.redexgen.X.07
                    public int A00;
                    public int A01;
                    public boolean A02;
                    public boolean A03;
                    public boolean A04;

                    public final AnonymousClass07 A00(int i2) {
                        this.A00 = i2;
                        return this;
                    }

                    public final AnonymousClass07 A01(int i2) {
                        this.A01 = i2;
                        return this;
                    }

                    public final AnonymousClass07 A02(boolean z) {
                        this.A02 = z;
                        return this;
                    }

                    public final AnonymousClass07 A03(boolean z) {
                        this.A03 = z;
                        return this;
                    }

                    public final AnonymousClass07 A04(boolean z) {
                        this.A04 = z;
                        return this;
                    }

                    public final AnonymousClass08 A05() {
                        return new AnonymousClass08(this.A00, this.A02, this.A01, this.A03, this.A04);
                    }
                }.A00(JQ.A04(c1045Xn)).A02(c1045Xn.A03().A8P()).A01(-1).A03(JQ.A0j(c1045Xn)).A04(JQ.A1y(c1045Xn)).A05(), A05(c1045Xn));
            }
            anonymousClass00 = A0A;
        }
        return anonymousClass00;
    }

    public static AnonymousClass06 A04(C8U c8u, String str) {
        AnonymousClass06 anonymousClass06 = A0F.get(str);
        if (C7X.A06(c8u) && anonymousClass06 != null) {
            return new AnonymousClass06(anonymousClass06);
        }
        return new AnonymousClass06(str);
    }

    public static C0L A05(C1045Xn c1045Xn) {
        return new C1049Xr(c1045Xn);
    }

    public static synchronized List<String> A09(C8U c8u) {
        List<String> list;
        synchronized (C7U.class) {
            if (A0B == null) {
                A0B = new ArrayList();
                A0H(A0B, c8u);
            }
            list = A0B;
        }
        return list;
    }

    public static AtomicBoolean A0C(ArrayList<Callable<Boolean>> arrayList) {
        ArrayList<Future> arrayList2 = new ArrayList(arrayList.size());
        Iterator<Callable<Boolean>> it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A0D;
            if (strArr[3].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0D[5] = "";
            if (!hasNext) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                try {
                    for (Future future : arrayList2) {
                        Boolean bool = (Boolean) future.get();
                        atomicBoolean.set(atomicBoolean.get() && bool != null && bool.booleanValue());
                    }
                } catch (InterruptedException | ExecutionException e2) {
                    Log.e(A0E, A08(78, 42, 23), e2);
                    atomicBoolean.set(false);
                }
                return atomicBoolean;
            }
            arrayList2.add(MQ.A02().submit(it.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(EnumC0691Jn enumC0691Jn) {
        if (this.A01 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A08(173, 12, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION), MC.A04(this.A00));
        this.A01.A02(enumC0691Jn, hashMap);
    }

    public static void A0H(List<String> list, C8U c8u) {
        A0I(list, C1341dq.A01(c8u));
        A0I(list, C7V.A07(c8u));
    }

    public static void A0I(List<String> list, File file) {
        String path;
        if (file == null || (path = file.getPath()) == null) {
            return;
        }
        String[] strArr = A0D;
        if (strArr[3].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[3] = "Vghlgc";
        strArr2[2] = "qwUey9";
        if (path != A08(0, 0, 127)) {
            list.add(path.toLowerCase(Locale.getDefault()));
        }
    }

    @Nullable
    public final Bitmap A0K(String str) {
        return this.A07.get(str);
    }

    @Nullable
    public final Bitmap A0L(String str, int i2, int i3) {
        if (this.A08) {
            AnonymousClass06 A04 = A04(this.A04, str);
            A04.A03 = A08(185, 4, 35);
            A04.A01 = i3;
            A04.A00 = i2;
            return A03(this.A04.A00()).AE3(A04, true).A00();
        }
        return this.A03.A0E(this.A04, str, i2, i3, A08(169, 4, 114));
    }

    @Nullable
    public final File A0M(String str) {
        AnonymousClass06 A04 = A04(this.A04, str);
        A04.A03 = A08(185, 4, 35);
        return A03(this.A04.A00()).AE4(A04);
    }

    @Nullable
    public final File A0N(String str) {
        if (this.A08) {
            return A0M(str);
        }
        return this.A03.A0F(str);
    }

    public final String A0O(String str) {
        if (this.A08) {
            return A0P(str);
        }
        return this.A03.A0G(str);
    }

    public final String A0P(String cachedUrl) {
        AnonymousClass06 A04 = A04(this.A04, cachedUrl);
        A04.A03 = A08(185, 4, 35);
        String AE6 = A03(this.A04.A00()).AE6(A04);
        return AE6 != null ? AE6 : cachedUrl;
    }

    public final String A0Q(String str) {
        if (this.A09) {
            return str;
        }
        return A0P(str);
    }

    public final void A0R() {
        KU.A05(A08(127, 19, 68), A08(30, 16, 60), A08(SyslogConstants.LOG_CLOCK, 7, 61));
    }

    public final void A0S() {
        KU.A05(A08(146, 16, 11), A08(46, 14, 66), A08(8, 8, 44));
    }

    public final void A0T() {
        this.A07.clear();
    }

    public final void A0U(@Nullable C7M c7m, C7N c7n) {
        KU.A05(A08(162, 7, 25), A08(60, 18, 50), A08(0, 8, 64));
        this.A00 = System.currentTimeMillis();
        C7X.A02(this.A04, c7n, C7X.A07, A08(16, 14, 19), -1L);
        MQ.A03().execute(new C1050Xs(this, new ArrayList(this.A05), c7m, c7n, new ArrayList(this.A06)));
        this.A05.clear();
        this.A06.clear();
    }

    public final void A0V(final C7R c7r) {
        Callable<Boolean> callable = new Callable<Boolean>(c7r) { // from class: com.facebook.ads.redexgen.X.7S
            public static byte[] A02;
            public static String[] A03 = {"jwTNBF52XqMGgcVEiQTwvXvSBsl43Bcu", "zl9XISU", "9LwyCiCzMXmNgkxTRjX8XUqiNT4UlidW", "Jar4Zz8ck96tLH67JFbLbWmYESMeU49V", "Yd8bjyjazIom6Oxe2tnjIAJyfdSlHwWG", "VgUZ5KaBAYbzt3oMIew8EQ4BA2c", "hXTgBapwd4emagenALPcDOSBW5zmdf3H", "17k"};
            public final C7R A00;

            public static String A01(int i2, int i3, int i4) {
                byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
                int i5 = 0;
                while (true) {
                    int length = copyOfRange.length;
                    if (A03[1].length() == 32) {
                        throw new RuntimeException();
                    }
                    A03[3] = "";
                    if (i5 >= length) {
                        return new String(copyOfRange);
                    }
                    copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 48);
                    i5++;
                }
            }

            public static void A02() {
                A02 = new byte[]{-20, -16, -28, -22, -24};
            }

            static {
                A02();
            }

            {
                this.A00 = c7r;
            }

            private final Boolean A00() {
                C8U c8u;
                boolean z;
                C8U c8u2;
                AnonymousClass00 A032;
                boolean z2;
                boolean z3;
                C7V c7v;
                Map map;
                if (C0726Kz.A02(this)) {
                    return null;
                }
                try {
                    TrafficStats.setThreadStatsTag(61453);
                    AnonymousClass06 anonymousClass06 = new AnonymousClass06(this.A00.A07, this.A00.A06, this.A00.A05, A01(0, 5, 83), this.A00.A01, this.A00.A02);
                    anonymousClass06.A01 = this.A00.A04;
                    anonymousClass06.A00 = this.A00.A03;
                    c8u = C7U.this.A04;
                    if (C7X.A06(c8u)) {
                        map = C7U.A0F;
                        map.put(this.A00.A07, anonymousClass06);
                    }
                    z = C7U.this.A08;
                    boolean z4 = false;
                    if (A03[3].length() != 5) {
                        A03[4] = "CZcPy1KhLDdCOlGcBT5xxsnRB32IUDMD";
                        if (!z) {
                            c7v = C7U.this.A03;
                            if (c7v.A0D(this.A00) != null) {
                                z4 = true;
                            }
                        } else {
                            c8u2 = C7U.this.A04;
                            A032 = C7U.A03(c8u2.A00());
                            z4 = A032.AE3(anonymousClass06, false).A01();
                        }
                        C7Z c7z = this.A00.A00;
                        if (c7z != null && c7z.A02()) {
                            int A00 = c7z.A00();
                            int A01 = c7z.A01();
                            if (A00 <= 0 || A01 <= 0) {
                                z2 = C7U.this.A08;
                                if (z2) {
                                    A04(this.A00.A07, anonymousClass06);
                                } else {
                                    int i2 = this.A00.A03;
                                    int width = this.A00.A04;
                                    A03(i2, width);
                                }
                            } else {
                                z3 = C7U.this.A08;
                                if (z3) {
                                    anonymousClass06.A00 = A00;
                                    anonymousClass06.A01 = A01;
                                    A04(this.A00.A07, anonymousClass06);
                                } else {
                                    A03(A00, A01);
                                }
                            }
                        }
                        return Boolean.valueOf(z4);
                    }
                    throw new RuntimeException();
                } catch (Throwable th) {
                    C0726Kz.A00(th, this);
                    return null;
                }
            }

            private void A03(int i2, int i3) {
                C7V c7v;
                C8U c8u;
                Map map;
                c7v = C7U.this.A03;
                c8u = C7U.this.A04;
                Bitmap A0E2 = c7v.A0E(c8u, this.A00.A07, i2, i3, this.A00.A01);
                if (A0E2 == null) {
                    return;
                }
                map = C7U.this.A07;
                map.put(this.A00.A07, A0E2);
            }

            private void A04(String str, AnonymousClass06 anonymousClass06) {
                C8U c8u;
                AnonymousClass00 A032;
                Map map;
                c8u = C7U.this.A04;
                A032 = C7U.A03(c8u.A00());
                Bitmap A00 = A032.AE3(anonymousClass06, true).A00();
                if (A00 == null) {
                    return;
                }
                map = C7U.this.A07;
                map.put(str, A00);
            }

            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
                if (C0726Kz.A02(this)) {
                    return null;
                }
                try {
                    return A00();
                } catch (Throwable th) {
                    C0726Kz.A00(th, this);
                    return null;
                }
            }
        };
        if (!c7r.A02) {
            this.A05.add(callable);
        } else {
            this.A06.add(callable);
        }
    }

    public final void A0W(C7R c7r) {
        c7r.A02 = true;
        A0V(c7r);
    }

    public final void A0X(C7T c7t) {
        this.A05.add(new C7Q(this, c7t));
    }

    public final void A0Y(C7T c7t) {
        c7t.A05 = true;
        this.A06.add(new C7Q(this, c7t));
    }

    public final void A0Z(C7T c7t) {
        c7t.A05 = true;
        if (this.A09) {
            this.A06.add(new C7P(this, c7t));
        } else {
            this.A06.add(new C7Q(this, c7t));
        }
    }

    public final void A0a(C7T c7t) {
        if (this.A09) {
            this.A05.add(new C7P(this, c7t));
        } else {
            this.A05.add(new C7Q(this, c7t));
        }
    }

    public final void A0b(C0692Jo c0692Jo) {
        this.A01 = c0692Jo;
    }
}
