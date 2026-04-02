package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* renamed from: com.facebook.ads.redexgen.X.Kj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0711Kj {
    public static byte[] A07;
    public static final MO A08;
    public static final Executor A09;
    public long A00;
    @Nullable
    public Ki A01;
    @Nullable
    public Map<String, String> A02;
    public final C2D A03;
    public final C1046Xo A04;
    public final C0712Kk A05;
    public final String A06;

    public static String A05(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 80);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{61, 62, 108, 50, 110, 105, 59, 104, 122, 105, 107, 119, 117, 78, 65, 68, 72, 67, 89, 82, 95, 72, 92, 88, 72, 94, 89, 82, 68, 73, 98, 88, 11, 121, 101, 17, 11, 100, 101, 10, 108, 99, 102, 102, 10, 88, 79, 73, 79, 67, 92, 79, 78, 20, 53, 122, 28, 51, 54, 54, 122, 63, 40, 40, 53, 40, 122, 57, 53, 62, 63, 122, 1, Byte.MAX_VALUE, 41, 7, 122, Byte.MAX_VALUE, 41, 15, 13, 6, 13, 26, 1, 11, 81, 90, 75, 72, 80, 77, 84, 40, 41, 0, 47, 42, 42, 14, 41, 41, 45};
    }

    static {
        A0A();
        A08 = new MO();
        A09 = Executors.newCachedThreadPool(A08);
    }

    public C0711Kj(C1046Xo c1046Xo) {
        this(c1046Xo, C2E.A00(c1046Xo.A00()));
    }

    public C0711Kj(C1046Xo c1046Xo, C2D c2d) {
        this.A00 = -1L;
        this.A04 = c1046Xo;
        this.A05 = C0712Kk.A00();
        this.A06 = C0715Kn.A01(c1046Xo);
        this.A03 = c2d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0876Qw A03(long j2, C0709Kg c0709Kg) {
        return new Tr(this, c0709Kg, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        C1046Xo c1046Xo = this.A04;
        if (c1046Xo == null || !RD.A0A(c1046Xo)) {
            return;
        }
        AnonymousClass90 anonymousClass90 = new AnonymousClass90(A05(8, 5, FacebookMediationAdapter.ERROR_NULL_CONTEXT));
        anonymousClass90.A03(1);
        this.A04.A06().A8y(A05(86, 7, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION), C04398z.A1m, anonymousClass90);
    }

    private void A0B(int i2, String str) {
        String A05 = A05(93, 10, 22);
        KU.A05(A05, A05(37, 16, 122), A05(0, 8, 90));
        KU.A04(A05, String.format(Locale.US, A05(53, 26, 10), Integer.valueOf(i2), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(KG kg) {
        Ki ki = this.A01;
        if (ki != null) {
            ki.AAh(kg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(KG kg) {
        MF.A00(new C0947Tp(this, kg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(C0946To c0946To) {
        Ki ki = this.A01;
        if (ki != null) {
            ki.ACP(c0946To);
        }
    }

    private void A0L(C0946To c0946To) {
        InterfaceC04198a A04;
        MF.A00(new C0948Tq(this, c0946To));
        if (JQ.A1g(this.A04) && (A04 = this.A04.A04()) != null) {
            A04.A5T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(String str, long j2, C0709Kg c0709Kg) {
        String str2;
        try {
            try {
                C0714Km A06 = this.A05.A06(this.A04, str, j2);
                C9H A00 = A06.A00();
                C1045Xn A002 = this.A04.A00();
                A002.A01().A8s(A002, str);
                if (A00 != null) {
                    JQ.A0O(this.A04).A27(A00.A08());
                    this.A04.A06().A9U();
                    this.A03.A0N(A00.A06());
                    Kf.A05(A00.A05().A0B(), c0709Kg);
                    MZ.A01(this.A04, A09, A00);
                    AnonymousClass90 anonymousClass90 = new AnonymousClass90(A05(30, 7, 123) + C0740Ln.A02());
                    anonymousClass90.A04(1);
                    anonymousClass90.A08(false);
                    this.A04.A06().A9O(A05(79, 7, 56), C04398z.A1M, anonymousClass90);
                }
                int i2 = C0710Kh.A00[A06.A01().ordinal()];
                if (i2 == 1) {
                    C0946To c0946To = (C0946To) A06;
                    if (A00 != null) {
                        if (A00.A05().A0E()) {
                            Kf.A07(str, c0709Kg);
                        }
                        if (this.A02 != null) {
                            str2 = this.A02.get(A05(13, 17, 93));
                        } else {
                            str2 = null;
                        }
                        if (!TextUtils.isEmpty(A06.A02()) && !TextUtils.isEmpty(str2)) {
                            this.A04.A01().AE7(this.A04, str2, A06.A02());
                        }
                    }
                    this.A04.A0D().A2k(MC.A01(this.A00));
                    A0L(c0946To);
                } else if (i2 != 2) {
                    AdErrorType adErrorType = AdErrorType.UNKNOWN_RESPONSE;
                    this.A04.A0D().A2j(MC.A01(this.A00), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                    A0D(KG.A01(adErrorType, str));
                } else {
                    C0945Tn c0945Tn = (C0945Tn) A06;
                    String A04 = c0945Tn.A04();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c0945Tn.A03(), AdErrorType.ERROR_MESSAGE);
                    A0B(c0945Tn.A03(), A04);
                    if (A04 == null) {
                        A04 = str;
                    }
                    this.A04.A0D().A2j(MC.A01(this.A00), adErrorTypeFromCode.getErrorCode(), A04, adErrorTypeFromCode.isPublicError());
                    A0D(KG.A01(adErrorTypeFromCode, A04));
                }
            } catch (Exception e2) {
                e = e2;
                String message = e.getMessage();
                AdErrorType adErrorType2 = AdErrorType.PARSER_FAILURE;
                this.A04.A0D().A2j(MC.A01(this.A00), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
                A0D(KG.A01(adErrorType2, message));
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(String str, long j2, C0709Kg c0709Kg) {
        A09.execute(new C0949Ts(this, str, j2, c0709Kg));
    }

    public final void A0O(C0709Kg c0709Kg) {
        this.A00 = System.currentTimeMillis();
        AnonymousClass98.A0B(this.A04);
        if (Kf.A08(c0709Kg)) {
            MQ.A06.execute(new C0951Tu(this));
            String A02 = Kf.A02(c0709Kg);
            if (A02 != null) {
                this.A04.A0D().AFS();
                A0N(A02, 0L, c0709Kg);
                return;
            }
            AdErrorType adErrorType = AdErrorType.LOAD_TOO_FREQUENTLY;
            this.A04.A0D().A2j(MC.A01(this.A00), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage(), adErrorType.isPublicError());
            A0D(KG.A01(adErrorType, null));
            return;
        }
        A09.execute(new C0950Tt(this, c0709Kg));
    }

    public final void A0P(Ki ki) {
        this.A01 = ki;
    }
}
