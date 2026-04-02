package com.facebook.ads.redexgen.X;

import ch.qos.logback.core.net.SyslogConstants;
import java.io.IOException;
/* loaded from: assets/audience_network.dex */
public final class WV implements InterfaceC0527Cw {
    public static String[] A01 = {"QxyXczWrJPO3wVR2PYQEuzattRFJZIJg", "XsmQOXxz56F8ZFhcTY7SGeacCVF", "LQ6zZ9Zapjn1TRDyEulQRXNFGY7QAnZu", "xNUQQ3qsLAAUx2yJDK4JRdV8dnV4oHU2", "y0XWt2t2M5t5jOwvErVmSfYW64pV03wh", "08OFOgjSb41ktoPQP1wiTHuWkUblsKHS", "6O4T6stZYTO64A1eR5mIXItGp3sSNy8u", "W8gkc1teFinis0XUwJ8nE"};
    public final /* synthetic */ WU A00;

    public WV(WU wu) {
        this.A00 = wu;
    }

    public /* synthetic */ WV(WU wu, WW ww) {
        this(wu);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0527Cw
    public final void A3q(int i2, int i3, InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        this.A00.A0K(i2, i3, interfaceC0518Cd);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0527Cw
    public final void A5B(int i2) throws C0470Af {
        this.A00.A0I(i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0527Cw
    public final void A5Q(int i2, double d2) throws C0470Af {
        this.A00.A0J(i2, d2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0527Cw
    public final int A6S(int i2) {
        switch (i2) {
            case 131:
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
            case 155:
            case 159:
            case SyslogConstants.LOG_LOCAL6 /* 176 */:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case SyslogConstants.LOG_LOCAL4 /* 160 */:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                if (A01[5].charAt(21) != 'H') {
                    throw new RuntimeException();
                }
                A01[5] = "OUtMPH0VOq9GijvQqOpwMHvOHPexZJaI";
                return 5;
            default:
                return 0;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0527Cw
    public final void A8L(int i2, long j2) throws C0470Af {
        this.A00.A0L(i2, j2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0527Cw
    public final boolean A8X(int i2) {
        if (i2 != 357149030) {
            if (A01[3].charAt(17) != 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "tUcPl0tEvSxC8oU8uPz5JVtDe3SsNXw6";
            strArr[2] = "wRikutKgqwJwqf30vjhaLiDyNnSQZYBE";
            if (i2 != 524531317 && i2 != 475249515 && i2 != 374648427) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0527Cw
    public final void AF3(int i2, long j2, long j3) throws C0470Af {
        this.A00.A0M(i2, j2, j3);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0527Cw
    public final void AFB(int i2, String str) throws C0470Af {
        this.A00.A0N(i2, str);
    }
}
