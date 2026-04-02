package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public final class PW extends FrameLayout {
    public static final int A07 = (int) (C0739Lm.A00 * 16.0f);
    public AL A00;
    @Nullable
    public AnonymousClass88 A01;
    public C0690Jm A02;
    public C04087m A03;
    public C03896p A04;
    public final C1046Xo A05;
    public final C0692Jo A06;

    public PW(C1046Xo c1046Xo, C0692Jo c0692Jo) {
        super(c1046Xo);
        this.A06 = c0692Jo;
        this.A05 = c1046Xo;
        setUpView(c1046Xo);
    }

    public final void A01() {
        this.A00.A0e(true, 10);
    }

    public final void A02() {
        AnonymousClass88 anonymousClass88 = this.A01;
        if (anonymousClass88 != null) {
            anonymousClass88.A0g();
            this.A01 = null;
        }
    }

    public final void A03(AbstractC04429c abstractC04429c) {
        this.A00.getEventBus().A05(abstractC04429c);
    }

    public final void A04(InterfaceC0684Jg interfaceC0684Jg, String str, Map<String, String> extraParams) {
        A02();
        this.A01 = new AnonymousClass88(this.A05, interfaceC0684Jg, this.A00, str, extraParams);
    }

    public final void A05(EnumC0853Pz enumC0853Pz) {
        this.A00.A0b(enumC0853Pz, 13);
    }

    public final boolean A06() {
        return this.A00.A0k();
    }

    public Q8 getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return this.A00.getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A03.setImage(str);
    }

    private void setUpPlugins(C1046Xo c1046Xo) {
        this.A00.A0X();
        this.A03 = new C04087m(c1046Xo);
        this.A00.A0c(this.A03);
        this.A02 = new C0690Jm(c1046Xo, this.A06);
        this.A00.A0c(new C04147u(c1046Xo));
        this.A00.A0c(this.A02);
        this.A04 = new C03896p(c1046Xo, true, this.A06);
        this.A00.A0c(this.A04);
        this.A00.A0c(new KM(this.A04, QC.A03, true, true));
        if (!this.A00.A0g() && !JQ.A1v(c1046Xo)) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        int i2 = A07;
        layoutParams.setMargins(i2, i2, i2, i2);
        this.A02.setLayoutParams(layoutParams);
        this.A00.addView(this.A02);
    }

    private void setUpVideo(C1046Xo c1046Xo) {
        this.A00 = new AL(c1046Xo);
        this.A00.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        ML.A0K(this.A00);
        addView(this.A00);
        setOnClickListener(new PV(this));
    }

    private void setUpView(C1046Xo c1046Xo) {
        setUpVideo(c1046Xo);
        setUpPlugins(c1046Xo);
    }

    public void setVideoURI(String str) {
        this.A00.setVideoURI(str);
    }

    public void setVolume(float f2) {
        this.A00.setVolume(f2);
        this.A02.A09();
    }
}
