package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import ch.qos.logback.core.net.SyslogConstants;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedVideoAdListener;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.cS  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1257cS implements AnonymousClass22 {
    public static byte[] A04;
    public static String[] A05 = {"l1o30ubgNMqwIxdsvAhdwl", "uEolzpc8zYF03u8DLAeDfs0A9wQx2vsd", "zKwy", "mFz9Za5MD8BXE4Lkxv", "Wms6Ep20", "", "s6yiLC", "izOiniaIEQHycLDhhOkzL"};
    public final AbstractC1269cf A00;
    public final InterfaceC02701w A01;
    public final AnonymousClass24 A02;
    public final C1046Xo A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{57, 28, 88, 23, 26, 18, 29, 27, 12, 88, 17, 11, 88, 22, 13, 20, 20, 56, 47, 52, 62, 54, 63, 37, 63, 34, 46, 40, 59, 41, 37, 49, 63, 35, 9, 13, 14, 58, 43, 38, 42, 33, 44, 42, 1, 42, 59, 56, 32, 61, 36, 98, 101, Byte.MAX_VALUE, 116, 110, 121, 121, 100, 121, 116, 104, 100, 111, 110, 116, 96, 110, 114, 14, 9, 19, 24, 21, 17, 24, 17, 14, 3, 2, 8, 24, 3, 18, 21, 6, 19, 14, 8, 9, 24, 12, 2, 30, 111, 108, 109, 100, 124, 106, 109, 117, 98, 111, 106, 103, 98, 119, 106, 108, 109, 124, 119, 106, 110, 102, 124, 104, 102, 122, 59, 19, 5, 5, 23, 17, 19, 76, 86, 96, 68, 94, 94, 68, 67, 74, 13, 79, 88, 67, 73, 65, 72, 13, 75, 66, 95, 13, 64, 72, 94, 94, 76, 74, 72, 8, 44, 54, 54, 44, 43, 34, 101, 39, 48, 43, 33, 41, 32, 101, 35, 42, 55, 101, 40, 32, 54, 54, 36, 34, 32, 107, 90, 93, 91, 86, 76, 91, 91, 70, 91, 86, 68, 76, 90, 90, 72, 78, 76, 86, 66, 76, 80, 5, 20, 13};
        String[] strArr = A05;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[1] = "11z8nLjTbJ8kXGgkHyQ0qsLYj80GB6ec";
        strArr2[2] = "E5wc";
    }

    static {
        A01();
    }

    public C1257cS(C1046Xo c1046Xo, AnonymousClass24 anonymousClass24, InterfaceC02701w interfaceC02701w, AbstractC1269cf abstractC1269cf) {
        this.A03 = c1046Xo;
        this.A02 = anonymousClass24;
        this.A01 = interfaceC02701w;
        this.A00 = abstractC1269cf;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass22
    public final void A7z(Message message) {
        com.facebook.ads.Ad A00 = this.A02.A00();
        String A002 = A00(203, 3, 16);
        if (A00 == null) {
            this.A03.A06().A8y(A002, C04398z.A0C, new AnonymousClass90(A00(0, 17, 12)));
            return;
        }
        int i2 = message.what;
        String A003 = A00(SyslogConstants.LOG_CLOCK, 9, 2);
        String A004 = A00(17, 17, 14);
        if (i2 != 10) {
            if (i2 == 2100) {
                this.A01.AEh();
                Bundle bundle = message.getData().getBundle(A004);
                if (bundle != null) {
                    this.A02.A01 = bundle.getLong(A00(94, 26, 87));
                    this.A02.A00 = bundle.getInt(A00(69, 25, 51));
                } else {
                    InterfaceC04388y A06 = this.A03.A06();
                    int i3 = C04398z.A0N;
                    A06.A8y(A002, i3, new AnonymousClass90(A00(129, 26, 89), A003 + message));
                }
                this.A02.A01(null);
            } else if (i2 != 2103) {
                if (i2 == 2106) {
                    this.A02.A01(null);
                } else if (i2 == 2110) {
                    this.A01.AEn();
                } else if (i2 != 2010) {
                    String[] strArr = A05;
                    if (strArr[6].length() == strArr[7].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A05;
                    strArr2[6] = "eimvHB";
                    strArr2[7] = "9nAYjps8XJWkdVKe7ORqJ";
                }
            }
            if (this.A02.A04 == null) {
                return;
            }
            int i4 = message.what;
            if (i4 == 2100) {
                this.A02.A04.onAdLoaded(A00);
                return;
            } else if (i4 != 2110) {
                switch (i4) {
                    case 2104:
                        this.A02.A04.onAdClicked(A00);
                        return;
                    case 2105:
                        this.A02.A04.onLoggingImpression(A00);
                        return;
                    case 2106:
                        if (this.A02.A04 instanceof RewardedVideoAdExtendedListener) {
                            ((RewardedVideoAdExtendedListener) this.A02.A04).onRewardedVideoActivityDestroyed();
                            return;
                        }
                        return;
                    default:
                        switch (i4) {
                            case AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS /* 3000 */:
                                this.A02.A04.onRewardedVideoCompleted();
                                return;
                            case 3001:
                                if (this.A02.A04 instanceof S2SRewardedVideoAdListener) {
                                    ((S2SRewardedVideoAdListener) this.A02.A04).onRewardServerSuccess();
                                    return;
                                }
                                return;
                            case AuthApiStatusCodes.AUTH_API_CLIENT_ERROR /* 3002 */:
                                if (this.A02.A04 instanceof S2SRewardedVideoAdListener) {
                                    ((S2SRewardedVideoAdListener) this.A02.A04).onRewardServerFailed();
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                }
            } else {
                this.A02.A04.onRewardedVideoClosed();
                return;
            }
        }
        Bundle bundle2 = message.getData();
        Bundle bundle3 = bundle2.getBundle(A004);
        if (bundle3 != null) {
            int i5 = bundle3.getInt(A00(51, 18, 95));
            String string = bundle3.getString(A00(182, 21, 125));
            AdError adError = new AdError(i5, string);
            this.A01.AEd(adError);
            if (this.A02.A04 != null) {
                this.A02.A04.onError(A00, adError);
            } else {
                Log.e(A00(34, 17, 59), string);
            }
        } else {
            this.A01.AEa(EnumC02691v.A05);
            InterfaceC04388y A062 = this.A03.A06();
            int i6 = C04398z.A0N;
            A062.A8y(A002, i6, new AnonymousClass90(A00(155, 27, 49), A003 + message));
        }
        AnonymousClass24 anonymousClass24 = this.A02;
        String[] strArr3 = A05;
        if (strArr3[1].length() != strArr3[2].length()) {
            String[] strArr4 = A05;
            strArr4[3] = "9bbWCvtTNy4UVYSvKE";
            strArr4[4] = "MUJHaNV8";
            anonymousClass24.A01(null);
            return;
        }
        String[] strArr5 = A05;
        strArr5[6] = "1K6GDc";
        strArr5[7] = "I0Fko4DemMWRrizY9fBW0";
        anonymousClass24.A01(null);
    }
}
