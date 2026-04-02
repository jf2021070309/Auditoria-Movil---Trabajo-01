package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class QH implements View.OnClickListener {
    public final /* synthetic */ C03896p A00;

    public QH(C03896p c03896p) {
        this.A00 = c03896p;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View v;
        C0692Jo c0692Jo;
        C1046Xo c1046Xo;
        Q8 videoView;
        Q8 videoView2;
        Q8 videoView3;
        C0692Jo c0692Jo2;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            v = this.A00.getVideoView();
            if (v != null) {
                c0692Jo = this.A00.A02;
                if (c0692Jo != null) {
                    c0692Jo2 = this.A00.A02;
                    c0692Jo2.A02(EnumC0691Jn.A0n, null);
                }
                c1046Xo = this.A00.A01;
                c1046Xo.A0D().A2s();
                int[] iArr = QI.A00;
                videoView = this.A00.getVideoView();
                int i2 = iArr[videoView.getState().ordinal()];
                if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                    videoView2 = this.A00.getVideoView();
                    videoView2.A0b(EnumC0853Pz.A04, 12);
                } else if (i2 == 5) {
                    videoView3 = this.A00.getVideoView();
                    videoView3.A0e(true, 8);
                }
            }
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
