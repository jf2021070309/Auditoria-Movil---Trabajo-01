package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.9z  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC04649z extends AbstractC0907Sb {
    public RelativeLayout A00;
    public N2 A01;
    public InterfaceC0815Om A02;
    public S1 A03;
    public PW A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Path A09;
    public final RectF A0A;
    public final C1046Xo A0B;
    public final N0 A0C;
    public final ME A0D;
    public final LF A0E;
    public final L2 A0F;
    public final AbstractC0704Ka A0G;
    public final String A0H;
    public static final int A0J = (int) (C0739Lm.A00 * 1.0f);
    public static final int A0K = (int) (C0739Lm.A00 * 4.0f);
    public static final int A0I = (int) (C0739Lm.A00 * 6.0f);

    public abstract void A0j(C1046Xo c1046Xo);

    public AbstractC04649z(C0806Od c0806Od, boolean z, String str, S1 s1) {
        super(c0806Od, z);
        this.A09 = new Path();
        this.A0A = new RectF();
        this.A0G = new A5(this);
        this.A0C = new A4(this);
        this.A0E = new A3(this);
        this.A0D = new A2(this);
        this.A0F = new A1(this);
        this.A03 = s1;
        this.A0H = str;
        this.A0B = c0806Od.A05();
        setGravity(17);
        int i2 = A0J;
        setPadding(i2, 0, i2, i2);
        ML.A0M(this, 0);
        setUpView(this.A0B);
        this.A08 = new Paint();
        this.A08.setColor(-16777216);
        this.A08.setStyle(Paint.Style.FILL);
        this.A08.setAlpha(16);
        this.A08.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (this.A02 == null) {
            return;
        }
        if ((A0i() && this.A07) || (!A0i() && this.A06)) {
            this.A02.AA1();
        }
    }

    private void A02(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        ML.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.X.OZ
    public boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.OZ
    public final boolean A0c() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0907Sb
    public final void A0e() {
        if (A0i()) {
            this.A04.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0907Sb
    public final void A0f() {
        if (A0i()) {
            A0g();
            this.A04.A05(EnumC0853Pz.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0907Sb
    public final void A0g() {
        float volume = this.A03.A0P().getVolume();
        if (A0i() && volume != this.A04.getVolume()) {
            this.A04.setVolume(volume);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0907Sb
    public final boolean A0h() {
        return A0i() && this.A04.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0907Sb
    public final boolean A0i() {
        return this.A05;
    }

    public final void A0k(Map<String, String> map) {
        this.A04.A02();
        if (A0i()) {
            this.A04.A04(getAdEventManager(), this.A0H, map);
        }
    }

    public final RelativeLayout getMediaContainer() {
        return this.A00;
    }

    public final PW getVideoView() {
        return this.A04;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A09.reset();
        this.A0A.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.A09;
        RectF rectF = this.A0A;
        int i2 = A0I;
        path.addRoundRect(rectF, i2, i2, Path.Direction.CW);
        canvas.drawPath(this.A09, this.A08);
        this.A0A.set(A0J, 0.0f, getWidth() - A0J, getHeight() - A0J);
        Path path2 = this.A09;
        RectF rectF2 = this.A0A;
        int i3 = A0K;
        path2.addRoundRect(rectF2, i3, i3, Path.Direction.CW);
        canvas.clipPath(this.A09);
        super.onDraw(canvas);
    }

    public void setAdTitleAndDescription(String str, String str2) {
        getTitleDescContainer().A01(str, str2, null, true, false);
    }

    public void setCTAInfo(C1L c1l, Map<String, String> map) {
        getCtaButton().setCta(c1l, this.A0H, map);
    }

    public void setImageUrl(String str) {
        this.A01.setVisibility(0);
        this.A04.setVisibility(8);
        new AsyncTaskC0925St(this.A01, this.A0B).A04().A06(new C0906Sa(this, null)).A07(str);
    }

    public void setIsVideo(boolean z) {
        this.A05 = z;
    }

    public void setOnAssetsLoadedListener(InterfaceC0815Om interfaceC0815Om) {
        this.A02 = interfaceC0815Om;
    }

    public void setUpImageView(C1046Xo c1046Xo) {
        this.A01 = new N2(c1046Xo);
        A02(this.A01);
    }

    public void setUpMediaContainer(C1046Xo c1046Xo) {
        this.A00 = new RelativeLayout(c1046Xo);
        A02(this.A00);
    }

    public void setUpVideoView(C1046Xo c1046Xo) {
        this.A04 = new PW(c1046Xo, new C0692Jo(this.A0H, getAdEventManager()));
        A02(this.A04);
    }

    private void setUpView(C1046Xo c1046Xo) {
        setUpImageView(c1046Xo);
        setUpVideoView(c1046Xo);
        setUpMediaContainer(c1046Xo);
        this.A00.addView(this.A01);
        this.A00.addView(this.A04);
        A0j(c1046Xo);
    }

    public void setVideoPlaceholderUrl(String str) {
        this.A04.setPlaceholderUrl(str);
    }

    public void setVideoUrl(String str) {
        this.A01.setVisibility(8);
        this.A04.setVisibility(0);
        this.A04.setVideoURI(str);
        this.A04.A03(this.A0G);
        this.A04.A03(this.A0C);
        this.A04.A03(this.A0E);
        this.A04.A03(this.A0D);
        this.A04.A03(this.A0F);
    }
}
