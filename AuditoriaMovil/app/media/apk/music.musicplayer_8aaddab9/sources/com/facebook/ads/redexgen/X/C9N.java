package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.9N  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9N {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"qrNp1wG", "4f9SKAEMWw8LBpPH9ClfYFaSVVluVAOE", "62aVnpwn360RV3u8SEcmxFYidJmBvefX", "Gce9ySP9MgoEln4cNVrEo5sJO8CSkBrv", "GAv6eBsy68sSiadtgyjEU9blJSusD372", "OMedkGV5dbFzDsS0dZcen", "wlEAAxVLaYYUt0VSnPi", "2B4l1t7rFez9Iyb0KdS6JKEUq9HBo8Fu"};
    public static final AtomicBoolean A04;
    public static final AtomicBoolean A05;
    public static final AtomicBoolean A06;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[1].charAt(3) == 'A') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[4] = "IDfTBPjSyvL4biEe7dLkbKSavqcQmadb";
            strArr[2] = "Oy3yacq1X2KDRnpIDSUXWs28RTZJmhMt";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 60);
            i5++;
        }
    }

    public static void A03() {
        A02 = new byte[]{-57, -52, -60, -58, -60, -7, -56, -54, -66, -70, -71, -19, -36, -31, -35, -26, -37, -35, -58, -35, -20, -17, -25, -22, -29, -62, -77, -70, -113, -40, -35, -40, -29, -40, -48, -37, -40, -23, -48, -29, -40, -34, -35, -113, -30, -29, -48, -31, -29, -44, -45, -60, -43, -36, -111, -24, -46, -28, -111, -46, -35, -29, -42, -46, -43, -22, -111, -38, -33, -38, -27, -38, -46, -35, -38, -21, -42, -43, -110, -111, -60, -36, -38, -31, -31, -38, -33, -40, -97, -62, -40, -34, -119, -51, -40, -41, -112, -35, -119, -52, -54, -43, -43, -119, -86, -34, -51, -46, -50, -41, -52, -50, -73, -50, -35, -32, -40, -37, -44, -86, -51, -36, -105, -46, -41, -46, -35, -46, -54, -43, -46, -29, -50, -111, -110, -105, -119, -68, -40, -42, -50, -119, -49, -34, -41, -52, -35, -46, -40, -41, -54, -43, -46, -35, -30, -119, -42, -54, -30, -119, -41, -40, -35, -119, -32, -40, -37, -44, -119, -39, -37, -40, -39, -50, -37, -43, -30, -105, -66, -51, -58, -31, -33, -24, -33, -20, -29, -35, -9, -4, -9, 2, -9, -17, -6, -9, 8, -13, 5, 10, 5, 16, 5, -3, 8, 5, 22, 1, -60, -59, -68, 10, 11, 16, -68, -1, -3, 8, 8, 1, 0, -54};
    }

    static {
        A03();
        A06 = new AtomicBoolean();
        A04 = new AtomicBoolean();
        A05 = new AtomicBoolean();
    }

    public static InterfaceC0724Kx A00() {
        return new XY();
    }

    public static LD A01(C1045Xn c1045Xn) {
        return new XX(c1045Xn);
    }

    public static void A04(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        MF.A01.execute(new XZ(initListener, initResult));
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A06(C1045Xn c1045Xn) {
        if (JS.A0P(c1045Xn) && !A05.getAndSet(true)) {
            try {
                C04308p reportHandler = new C04308p(Thread.getDefaultUncaughtExceptionHandler(), c1045Xn, new XV());
                Thread.setDefaultUncaughtExceptionHandler(reportHandler);
            } catch (Exception e2) {
                c1045Xn.A06().A8y(A02(181, 7, 62), C04398z.A1N, new AnonymousClass90(e2));
            }
        }
    }

    public static void A07(C1045Xn c1045Xn) {
        A0G(c1045Xn, null, null, 3);
    }

    public static void A08(C1045Xn c1045Xn) {
        A0G(c1045Xn, null, null, 3);
    }

    public static void A09(C1045Xn c1045Xn) {
        if (JQ.A1W(c1045Xn)) {
            A0E(c1045Xn, 0);
        }
        if (JQ.A1b(c1045Xn)) {
            A0B(c1045Xn);
        }
    }

    public static void A0A(C1045Xn c1045Xn) {
        if (JQ.A1X(c1045Xn)) {
            A0F(c1045Xn, null, 3);
        }
    }

    public static void A0B(C1045Xn c1045Xn) {
        MQ.A06.execute(new C1032Xa(c1045Xn));
    }

    public static void A0C(C1045Xn c1045Xn) {
        C04338t.A0C(c1045Xn, new XU(c1045Xn), new C1036Xe(), BuildConfigApi.isDebug());
        c1045Xn.A08();
        AnonymousClass68.A04(c1045Xn, null);
    }

    public static void A0E(C1045Xn c1045Xn, int i2) {
        C8T.A01(c1045Xn);
        if (A04.getAndSet(true)) {
            return;
        }
        if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isDebuggerOn()) {
            KU.A02();
        }
        A06(c1045Xn);
        LA.A00(JQ.A0k(c1045Xn), BuildConfigApi.isDebug(), A00(), A01(c1045Xn));
        AnonymousClass61.A03(JQ.A02(c1045Xn));
        RD.A09(new XW(c1045Xn));
        if (i2 == 3) {
            Log.e(A02(8, 17, 60), A02(89, 89, 45));
            c1045Xn.A06().A9G(A02(178, 3, 33), C04398z.A0J, new AnonymousClass90(A02(198, 24, 96)));
        }
        ActivityUtils.A04(c1045Xn, AudienceNetworkActivity.class);
        MQ.A05(c1045Xn);
        C0695Jr.A05(c1045Xn);
        C02420u.A0C(c1045Xn);
        if (JQ.A0s(c1045Xn)) {
            C03474y.A00(c1045Xn);
        }
        if (JQ.A1F(c1045Xn)) {
            XM.A02().A7M(c1045Xn);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A0F(C1045Xn c1045Xn, @Nullable AudienceNetworkAds.InitListener initListener, int i2) {
        C8T.A01(c1045Xn);
        boolean z = false;
        synchronized (C9N.class) {
            if (!A00) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3 && !A01) {
                        A01 = true;
                        z = true;
                    }
                }
                A00 = true;
                z = true;
            }
        }
        if (z) {
            A0E(c1045Xn, i2);
            MQ.A08.execute(new C1033Xb(c1045Xn, initListener));
        } else if (i2 != 1) {
        } else {
            String A022 = A02(51, 38, 53);
            if (initListener != null) {
                A04(initListener, new C9M(true, A022));
            } else {
                Log.w(A02(8, 17, 60), A022);
            }
        }
    }

    public static void A0G(C1045Xn c1045Xn, @Nullable MultithreadedBundleWrapper multithreadedBundleWrapper, @Nullable AudienceNetworkAds.InitListener initListener, int i2) {
        KU.A05(A02(188, 10, 82), A02(25, 26, 51), A02(0, 8, 87));
        RD.A06();
        A0F(c1045Xn, initListener, i2);
    }

    public static synchronized boolean A0H() {
        boolean z;
        synchronized (C9N.class) {
            z = A00;
        }
        return z;
    }
}
