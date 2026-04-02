package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* loaded from: assets/audience_network.dex */
public class QG extends L7 {
    public static String[] A04 = {"pUIboC8CwdUMtM1tPR8iEtPz8p", "ladzvmq", "gZiIZXhhpFNWaRiPv", "vQtAVDGFp8M", "7j30UYRlUEXcM4Kd2wK", "XchzO9Mtzl1GyvdPdWlZd1J0iwZmFx3H", "VTwPVxpRcW0", "YPnzN72MuP4y3lnuBhqZ0NoSyY"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Q8 A02;
    public final /* synthetic */ EnumC0866Qm A03;

    public QG(Q8 q8, EnumC0866Qm enumC0866Qm, int i2, int i3) {
        this.A02 = q8;
        this.A03 = enumC0866Qm;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        C1046Xo c1046Xo;
        Handler handler;
        C04419b c04419b;
        C1046Xo c1046Xo2;
        C04419b c04419b2;
        C0716Ko c0716Ko;
        Handler handler2;
        C1046Xo c1046Xo3;
        C04419b c04419b3;
        Handler handler3;
        C1046Xo c1046Xo4;
        C1046Xo c1046Xo5;
        C04419b c04419b4;
        C0731Le c0731Le;
        Handler handler4;
        C1046Xo c1046Xo6;
        C1046Xo c1046Xo7;
        Handler handler5;
        C04419b c04419b5;
        C04419b c04419b6;
        C0776Mz c0776Mz;
        C1046Xo c1046Xo8;
        C04419b c04419b7;
        if (this.A03 == EnumC0866Qm.A07) {
            this.A02.A0L(EnumC0691Jn.A0o);
            c1046Xo8 = this.A02.A09;
            c1046Xo8.A0D().A2v();
            c04419b7 = this.A02.A0A;
            c04419b7.A02(Q8.A0C());
        } else if (this.A03 == EnumC0866Qm.A03) {
            this.A02.A0L(EnumC0691Jn.A0j);
            this.A02.A03 = true;
            c04419b6 = this.A02.A0A;
            c0776Mz = Q8.A0F;
            c04419b6.A02(c0776Mz);
            this.A02.A0K(this.A00);
        } else {
            EnumC0866Qm enumC0866Qm = this.A03;
            EnumC0866Qm enumC0866Qm2 = EnumC0866Qm.A06;
            String[] strArr = A04;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A04[5] = "Wlqb3PCyph61UkVVxo7ng7VZa1hYfmo4";
            if (enumC0866Qm == enumC0866Qm2) {
                this.A02.A0L(EnumC0691Jn.A0i);
                c1046Xo7 = this.A02.A09;
                c1046Xo7.A0D().A2n();
                this.A02.A03 = true;
                handler5 = this.A02.A06;
                handler5.removeCallbacksAndMessages(null);
                c04419b5 = this.A02.A0A;
                int i2 = this.A01;
                c04419b5.A02(new AnonymousClass86(i2, i2));
                this.A02.A0K(this.A01);
            } else if (this.A03 == EnumC0866Qm.A0A) {
                c1046Xo4 = this.A02.A09;
                if (JQ.A1F(c1046Xo4)) {
                    c1046Xo6 = this.A02.A09;
                    c1046Xo6.A09().ACo();
                }
                this.A02.A0L(EnumC0691Jn.A0m);
                c1046Xo5 = this.A02.A09;
                c1046Xo5.A0D().A32();
                c04419b4 = this.A02.A0A;
                c0731Le = Q8.A0G;
                c04419b4.A02(c0731Le);
                handler4 = this.A02.A06;
                handler4.removeCallbacksAndMessages(null);
                this.A02.A0H();
            } else if (this.A03 == EnumC0866Qm.A05) {
                this.A02.A0L(EnumC0691Jn.A0l);
                c1046Xo3 = this.A02.A09;
                c1046Xo3.A0D().A2r();
                c04419b3 = this.A02.A0A;
                final int i3 = this.A00;
                c04419b3.A02(new N8(i3) { // from class: com.facebook.ads.redexgen.X.85
                });
                handler3 = this.A02.A06;
                handler3.removeCallbacksAndMessages(null);
                this.A02.A0K(this.A00);
            } else if (this.A03 == EnumC0866Qm.A04) {
                this.A02.A0L(EnumC0691Jn.A0k);
                c1046Xo2 = this.A02.A09;
                c1046Xo2.A0D().A2o();
                c04419b2 = this.A02.A0A;
                c0716Ko = Q8.A0J;
                c04419b2.A02(c0716Ko);
                handler2 = this.A02.A06;
                handler2.removeCallbacksAndMessages(null);
            } else if (this.A03 == EnumC0866Qm.A09) {
                this.A02.A0L(EnumC0691Jn.A0i);
                c1046Xo = this.A02.A09;
                c1046Xo.A0D().A2x();
                this.A02.A03 = true;
                handler = this.A02.A06;
                handler.removeCallbacksAndMessages(null);
                c04419b = this.A02.A0A;
                c04419b.A02(new AnonymousClass86(this.A00, this.A01));
                this.A02.A0K(this.A00);
            }
        }
    }
}
