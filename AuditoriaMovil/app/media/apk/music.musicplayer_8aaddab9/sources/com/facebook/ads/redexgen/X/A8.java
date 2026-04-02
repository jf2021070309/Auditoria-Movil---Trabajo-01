package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public class A8 extends AbstractC0907Sb {
    @Nullable
    public N2 A00;
    @Nullable
    public InterfaceC0815Om A01;
    @Nullable
    public PW A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    @Nullable
    public RelativeLayout A06;
    public S1 A07;
    public final C1046Xo A08;
    public final N0 A09;
    public final ME A0A;
    public final LF A0B;
    public final L2 A0C;
    public final AbstractC0704Ka A0D;
    public final String A0E;
    public final Paint A0F;
    public final Path A0G;
    public final RectF A0H;
    public final C0806Od A0I;
    public static String[] A0J = {"dJoea1DbFsfm9GTpKIzcXYdmCRfBe4FS", "N1xc2MysRccxXRgwDgHXZSQeh7bFq7uk", "3nDu3mubCrSGPsHb", "SUxuavEQD34fwSKO8hxc7w", "hmAyL1Y1BI3zOyZEMNvfuG", "1nycCDmAbpyAo4RWRzHJ2ixoeiRT", "fh6VcnyoMwgZMcb2oBIx6", "bmD"};
    public static final int A0L = (int) (C0739Lm.A00 * 0.0f);
    public static final int A0M = (int) (C0739Lm.A00 * 9.0f);
    public static final int A0K = (int) (C0739Lm.A00 * 9.0f);

    public A8(C0806Od c0806Od, boolean z, String str, S1 s1) {
        super(c0806Od, z);
        this.A0G = new Path();
        this.A0H = new RectF();
        this.A0D = new AD(this);
        this.A09 = new AC(this);
        this.A0B = new AB(this);
        this.A0A = new AA(this);
        this.A0C = new A9(this);
        this.A0I = c0806Od;
        this.A07 = s1;
        this.A0E = str;
        this.A08 = c0806Od.A05();
        setGravity(17);
        int i2 = A0L;
        setPadding(i2, 0, i2, i2);
        ML.A0M(this, 0);
        setUpView(this.A08);
        this.A0F = new Paint();
        this.A0F.setColor(-16777216);
        this.A0F.setStyle(Paint.Style.FILL);
        this.A0F.setAlpha(16);
        this.A0F.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        if (this.A0I.A0A() != null && this.A02 != null) {
            this.A0I.A0A().A8o(this.A02.getSimpleVideoView());
            if (JQ.A1T(getContext())) {
                this.A0I.A0A().A07(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (this.A0I.A0A() != null) {
            this.A0I.A0A().A05();
            if (this.A02 != null) {
                this.A0I.A0A().AFL(this.A02.getSimpleVideoView());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        if (this.A01 == null) {
            return;
        }
        if (!A0i() || !this.A05) {
            boolean A0i = A0i();
            String[] strArr = A0J;
            if (strArr[3].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[3] = "whWH7G9NZGoicUCMK8TGye";
            strArr2[4] = "jQqQ2QRGHP0rmsCqitHuog";
            if (A0i || !this.A04) {
                return;
            }
        }
        this.A01.AA1();
    }

    private void A03(@Nullable View view) {
        RelativeLayout.LayoutParams layoutParams;
        if (view == null || (layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.addRule(13, -1);
        view.setLayoutParams(layoutParams);
    }

    public static void A04(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        ML.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.X.OZ
    public final boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.OZ
    public final boolean A0c() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0907Sb
    public final void A0e() {
        PW pw;
        if (A0i() && (pw = this.A02) != null) {
            pw.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0907Sb
    public final void A0f() {
        if (A0i()) {
            A0g();
            PW pw = this.A02;
            if (pw != null) {
                pw.A05(EnumC0853Pz.A02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0907Sb
    public final void A0g() {
        PW pw;
        float volume = this.A07.A0P().getVolume();
        if (A0i() && (pw = this.A02) != null && volume != pw.getVolume()) {
            this.A02.setVolume(volume);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0907Sb
    public final boolean A0h() {
        PW pw;
        return A0i() && (pw = this.A02) != null && pw.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0907Sb
    public final boolean A0i() {
        return this.A03;
    }

    public final void A0j(Map<String, String> map) {
        PW pw = this.A02;
        if (pw != null) {
            pw.A02();
            if (A0i()) {
                this.A02.A04(getAdEventManager(), this.A0E, map);
            }
        }
    }

    @Nullable
    public final PW getVideoView() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.OZ, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A0G.reset();
        this.A0H.set(0.0f, 0.0f, getWidth(), getHeight());
        int i2 = 0;
        boolean z = getResources().getConfiguration().orientation == 1;
        if (z) {
            i2 = A0K;
        }
        this.A0G.addRoundRect(this.A0H, i2, i2, Path.Direction.CW);
        canvas.drawPath(this.A0G, this.A0F);
        this.A0H.set(A0L, 0.0f, getWidth() - A0L, getHeight() - A0L);
        if (z) {
            i2 = A0M;
        }
        this.A0G.addRoundRect(this.A0H, i2, i2, Path.Direction.CW);
        canvas.clipPath(this.A0G);
        super.onDraw(canvas);
    }

    public void setImageUrl(String str) {
        N2 n2 = this.A00;
        if (n2 != null) {
            n2.setVisibility(0);
            new AsyncTaskC0925St(this.A00, this.A08).A04().A06(new C0920So(this, null)).A07(str);
        }
        PW pw = this.A02;
        if (pw != null) {
            pw.setVisibility(8);
        }
    }

    public void setIsVideo(boolean z) {
        this.A03 = z;
    }

    public void setOnAssetsLoadedListener(InterfaceC0815Om interfaceC0815Om) {
        this.A01 = interfaceC0815Om;
    }

    public void setUpImageView(C1046Xo c1046Xo) {
        this.A00 = new N2(c1046Xo);
        A04(this.A00);
    }

    public void setUpMediaContainer(C1046Xo c1046Xo) {
        this.A06 = new RelativeLayout(c1046Xo);
        A04(this.A06);
        N2 n2 = this.A00;
        if (n2 != null) {
            this.A06.addView(n2);
            A03(this.A00);
        }
        PW pw = this.A02;
        if (pw != null) {
            this.A06.addView(pw);
            A03(this.A02);
        }
        addView(this.A06);
    }

    public void setUpVideoView(C1046Xo c1046Xo) {
        this.A02 = new PW(c1046Xo, new C0692Jo(this.A0E, getAdEventManager()));
        A04(this.A02);
    }

    private void setUpView(C1046Xo c1046Xo) {
        setUpImageView(c1046Xo);
        setUpVideoView(c1046Xo);
        setUpMediaContainer(c1046Xo);
    }

    public void setVideoPlaceholderUrl(String str) {
        PW pw = this.A02;
        if (pw != null) {
            pw.setPlaceholderUrl(str);
        }
    }

    public void setVideoUrl(String str) {
        N2 n2 = this.A00;
        if (n2 != null) {
            if (A0J[5].length() == 10) {
                throw new RuntimeException();
            }
            A0J[2] = "s54OOOYMcUndmM7F";
            n2.setVisibility(8);
        }
        PW pw = this.A02;
        if (pw != null) {
            pw.setVisibility(0);
            this.A02.setVideoURI(str);
            this.A02.A03(this.A0D);
            this.A02.A03(this.A09);
            this.A02.A03(this.A0B);
            this.A02.A03(this.A0A);
            this.A02.A03(this.A0C);
        }
    }
}
