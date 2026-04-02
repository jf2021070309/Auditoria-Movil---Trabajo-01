package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Tt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0950Tt extends L7 {
    public static byte[] A02;
    public static String[] A03 = {"jAsZfZwQ15YE1xm95Uum6vWOaDH1Az8A", "fi77qJmjg5Rwb", "EORDPJJatEjTyV", "9q4WoxWSHvvys", "ZnqFv4LDFQ916SUcrxzb43hFVVFJOLFp", "nu1Fhr1q5Uq1RKDrD4GP42DLl0Uj", "wJhiR1cxoop1phUk5wYOXEGX7ooerIC3", "cvoiCCK"};
    public final /* synthetic */ C0709Kg A00;
    public final /* synthetic */ C0711Kj A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 119);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{10, 75, 89, 68, 71, 72, 72, 67, 84, 89, 77, 67, 95, 101, 68, 11, 69, 78, 95, 92, 68, 89, 64, 11, 72, 68, 69, 69, 78, 72, 95, 66, 68, 69};
    }

    static {
        A02();
    }

    public C0950Tt(C0711Kj c0711Kj, C0709Kg c0709Kg) {
        this.A01 = c0711Kj;
        this.A00 = c0709Kg;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        C1046Xo c1046Xo;
        C1046Xo c1046Xo2;
        C1046Xo c1046Xo3;
        C1046Xo c1046Xo4;
        C1046Xo c1046Xo5;
        long j2;
        C1046Xo c1046Xo6;
        String str;
        Map<? extends String, ? extends String> map;
        InterfaceC0876Qw A032;
        C1046Xo c1046Xo7;
        C1046Xo c1046Xo8;
        C1046Xo c1046Xo9;
        C1046Xo c1046Xo10;
        long j3;
        c1046Xo = this.A01.A04;
        if (MA.A00(c1046Xo) != M9.A07) {
            c1046Xo2 = this.A01.A04;
            AnonymousClass98.A08(c1046Xo2);
            c1046Xo3 = this.A01.A04;
            C03675s.A07(c1046Xo3);
            C0709Kg c0709Kg = this.A00;
            C9U A00 = C9U.A00();
            c1046Xo4 = this.A01.A04;
            boolean z = true;
            Map<String, String> A08 = c0709Kg.A08(A00.A01(c1046Xo4, true).A6V());
            this.A01.A02 = A08;
            try {
                c1046Xo7 = this.A01.A04;
                PackageManager packageManager = c1046Xo7.getPackageManager();
                if (packageManager != null) {
                    String A002 = A00(1, 12, 113);
                    StringBuilder sb = new StringBuilder();
                    c1046Xo8 = this.A01.A04;
                    sb.append(c1046Xo8.getPackageName());
                    sb.append(A00(0, 1, 93));
                    c1046Xo9 = this.A01.A04;
                    sb.append(packageManager.getInstallerPackageName(c1046Xo9.getPackageName()));
                    A08.put(A002, new String(Base64.encode(sb.toString().getBytes(), 2)));
                }
            } catch (Exception unused) {
            }
            try {
                if (this.A00.A05() != KL.A03 && this.A00.A05() != KL.A05 && this.A00.A05() != KL.A04 && this.A00.A05() != null) {
                    z = false;
                }
                c1046Xo6 = this.A01.A04;
                InterfaceC0875Qv A022 = RD.A02(z, c1046Xo6);
                str = this.A01.A06;
                R9 r9 = new R9();
                map = this.A01.A02;
                byte[] A082 = r9.A05(map).A08();
                A032 = this.A01.A03(MC.A00(), this.A00);
                A022.AD9(str, A082, A032);
                return;
            } catch (Exception e2) {
                AdErrorType adErrorType = AdErrorType.AD_REQUEST_FAILED;
                String message = e2.getMessage();
                c1046Xo5 = this.A01.A04;
                C0R A0D = c1046Xo5.A0D();
                String errorMessage = A03[5];
                if (errorMessage.length() == 14) {
                    throw new RuntimeException();
                }
                String[] strArr = A03;
                strArr[3] = "KP51TgwZ8p9oo";
                strArr[2] = "i0Q8y5VFLDaPT7";
                j2 = this.A01.A00;
                A0D.A2j(MC.A01(j2), adErrorType.getErrorCode(), message, adErrorType.isPublicError());
                this.A01.A0D(KG.A01(adErrorType, message));
                return;
            }
        }
        this.A01.A09();
        AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
        String A003 = A00(13, 21, 92);
        c1046Xo10 = this.A01.A04;
        C0R A0D2 = c1046Xo10.A0D();
        j3 = this.A01.A00;
        A0D2.A2j(MC.A01(j3), adErrorType2.getErrorCode(), A003, adErrorType2.isPublicError());
        this.A01.A0D(new KG(adErrorType2, A003));
    }
}
