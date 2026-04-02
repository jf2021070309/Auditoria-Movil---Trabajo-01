package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import org.json.JSONException;
/* loaded from: assets/audience_network.dex */
public class Tr implements InterfaceC0876Qw {
    public static byte[] A03;
    public final /* synthetic */ long A00;
    public final /* synthetic */ C0709Kg A01;
    public final /* synthetic */ C0711Kj A02;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{103, 99, 53, 99, 53, 103, 52, 49, 109, 116, 104, 105, 98, 95, 68, 66, 87, 83, 78, 72, 73, 29, 7, 24, 46, 57, 61, 46, 57, 107, 46, 57, 57, 36, 57, 107, 36, 40, 40, 62, 57, 57, 46, 47, 108, 90, 77, 73, 90, 77, 31, 77, 90, 79, 83, 86, 90, 91, 31, 76, 74, 92, 92, 90, 76, 76, 89, 74, 83, 83, 70, 125, 44, 42, 45, 124, 44, 41, 75, 74, 103, 75, 73, 84, 72, 65, 80, 65, 95, 94, 117, 66, 66, 95, 66};
    }

    public Tr(C0711Kj c0711Kj, C0709Kg c0709Kg, long j2) {
        this.A02 = c0711Kj;
        this.A01 = c0709Kg;
        this.A00 = j2;
    }

    private final void A02(R8 r8) {
        C1046Xo c1046Xo;
        long j2;
        C1046Xo c1046Xo2;
        long j3;
        C0712Kk c0712Kk;
        C1046Xo c1046Xo3;
        C1046Xo c1046Xo4;
        long j4;
        Kf.A06(this.A01);
        try {
            InterfaceC0874Qu A00 = r8.A00();
            if (A00 != null) {
                String errorMsg = A00.A5o();
                c0712Kk = this.A02.A05;
                c1046Xo3 = this.A02.A04;
                C0714Km A06 = c0712Kk.A06(c1046Xo3, errorMsg, this.A00);
                if (A06.A01() == EnumC0713Kl.A03) {
                    C0945Tn c0945Tn = (C0945Tn) A06;
                    String finalErrMessage = c0945Tn.A04();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c0945Tn.A03(), AdErrorType.ERROR_MESSAGE);
                    if (finalErrMessage != null) {
                        errorMsg = finalErrMessage;
                    }
                    c1046Xo4 = this.A02.A04;
                    C0R A0D = c1046Xo4.A0D();
                    j4 = this.A02.A00;
                    A0D.A2j(MC.A01(j4), adErrorTypeFromCode.getErrorCode(), errorMsg, adErrorTypeFromCode.isPublicError());
                    this.A02.A0D(KG.A01(adErrorTypeFromCode, errorMsg));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String message = r8.getMessage();
            c1046Xo2 = this.A02.A04;
            C0R A0D2 = c1046Xo2.A0D();
            j3 = this.A02.A00;
            A0D2.A2j(MC.A01(j3), adErrorType.getErrorCode(), message, adErrorType.isPublicError());
            this.A02.A0D(KG.A01(adErrorType, message));
        } catch (JSONException e2) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String message2 = r8.getMessage();
            c1046Xo = this.A02.A04;
            C0R A0D3 = c1046Xo.A0D();
            j2 = this.A02.A00;
            long A01 = MC.A01(j2);
            int errorCode = adErrorType2.getErrorCode();
            StringBuilder sb = new StringBuilder();
            String errorMessage = A00(8, 15, 45);
            sb.append(errorMessage);
            String errorMessage2 = e2.getMessage();
            sb.append(errorMessage2);
            A0D3.A2j(A01, errorCode, sb.toString(), adErrorType2.isPublicError());
            this.A02.A0D(KG.A01(adErrorType2, message2));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0876Qw
    public final void AAK(InterfaceC0874Qu interfaceC0874Qu) {
        KU.A05(A00(78, 10, 46), A00(44, 27, 53), A00(71, 7, 18));
        if (interfaceC0874Qu != null) {
            String A5o = interfaceC0874Qu.A5o();
            Kf.A06(this.A01);
            this.A02.A0N(A5o, this.A00, this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0876Qw
    public final void AAi(Exception exc) {
        C1046Xo c1046Xo;
        long j2;
        KU.A05(A00(88, 7, 58), A00(23, 21, 65), A00(0, 8, 90));
        if (R8.class.equals(exc.getClass())) {
            A02((R8) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String message = exc.getMessage();
        c1046Xo = this.A02.A04;
        C0R A0D = c1046Xo.A0D();
        j2 = this.A02.A00;
        A0D.A2j(MC.A01(j2), adErrorType.getErrorCode(), message, adErrorType.isPublicError());
        this.A02.A0D(KG.A01(adErrorType, message));
    }
}
