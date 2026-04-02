package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.92  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass92 extends SF {
    @Nullable
    public OZ A00;
    public final ImageView A01;
    public final AnonymousClass57 A02;
    public final AtomicBoolean A03;
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;

    public AnonymousClass92(C1046Xo c1046Xo, NC nc, InterfaceC0684Jg interfaceC0684Jg, AnonymousClass18 anonymousClass18, C7U c7u, InterfaceC0761Mk interfaceC0761Mk) {
        super(c1046Xo, nc, interfaceC0684Jg, anonymousClass18, c7u, interfaceC0761Mk);
        this.A02 = new SE(this);
        this.A04 = new AtomicBoolean(false);
        this.A03 = new AtomicBoolean(false);
        this.A05 = new AtomicBoolean(false);
        this.A01 = new ImageView(getContext());
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setAdjustViewBounds(true);
        new AsyncTaskC0925St(this.A01, super.A03).A05(super.A01.A0N().A0D().A00(), super.A01.A0N().A0D().A01()).A06(new SD(this)).A07(super.A01.A0N().A0D().A07());
    }

    private OZ A01(int i2) {
        if (this.A01.getParent() != null) {
            ML.A0J(this.A01);
        }
        return C0803Oa.A00(new C0805Oc(super.A03, super.A04, this.A08, super.A01, this.A01, this.A0A, this.A06).A0E(this.A07.getToolbarHeight()).A0H(this.A07).A0D(i2).A0J(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A04.get() && this.A03.get()) {
            A0P();
        }
    }

    private void A06(int i2) {
        ML.A0J(this.A00);
        this.A00 = A01(i2);
        C1K colors = this.A00.getColors();
        OZ oz = this.A00;
        boolean z = true;
        ML.A0M(this, colors.A07(oz != null && (oz.A0c() || (this.A00 instanceof AbstractC0918Sm))));
        this.A07.A04(colors, this.A00.A0c());
        addView(this.A00, 0, SF.A0D);
        OZ oz2 = this.A00;
        setUpFullscreenMode((oz2 == null || !oz2.A0c()) ? false : false);
    }

    @Override // com.facebook.ads.redexgen.X.SF
    public final void A0Q() {
        ML.A0L(this.A00);
        ML.A0L(this.A07);
        this.A03.set(true);
        A05();
        int A03 = super.A01.A0N().A0D().A03();
        if (A03 > 0) {
            OZ oz = this.A00;
            if (oz != null) {
                oz.A0a();
            }
            A0R(A03, new SC(this));
            return;
        }
        this.A05.set(true);
        this.A07.setToolbarActionMode(getCloseButtonStyle());
    }

    @Override // com.facebook.ads.redexgen.X.SF
    public final void A0S(AnonymousClass59 anonymousClass59) {
        anonymousClass59.A0K(this.A02);
        A06(anonymousClass59.A0H().getResources().getConfiguration().orientation);
        addView(this.A07, new FrameLayout.LayoutParams(-1, this.A07.getToolbarHeight()));
        ML.A0H(this.A00);
        ML.A0H(this.A07);
    }

    @Override // com.facebook.ads.redexgen.X.SF
    public final boolean A0T() {
        OZ oz = this.A00;
        return oz != null && oz.A0d(false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void ABg(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void AC5(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        OZ oz = this.A00;
        if (oz != null) {
            return oz.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.SF, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A01.A0N().A0N()) {
            A06(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SF, com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void onDestroy() {
        if (JQ.A1F(super.A03)) {
            super.A03.A09().AFK(this.A01);
        }
        OZ oz = this.A00;
        if (oz != null) {
            oz.A0W();
        }
        super.onDestroy();
    }
}
