package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
/* loaded from: assets/audience_network.dex */
public abstract class SF extends FrameLayout implements InterfaceC0762Ml {
    public static final RelativeLayout.LayoutParams A0D = new RelativeLayout.LayoutParams(-1, -1);
    public boolean A00;
    public final AnonymousClass18 A01;
    public final C7U A02;
    public final C1046Xo A03;
    public final InterfaceC0684Jg A04;
    public final C0692Jo A05;
    public final MD A06;
    public final AbstractC0760Mj A07;
    public final InterfaceC0761Mk A08;
    public final NC A09;
    public final C0869Qp A0A;
    public final M8 A0B;
    @DoNotStrip
    public final AbstractC0868Qo A0C;

    public abstract void A0Q();

    public abstract void A0S(AnonymousClass59 anonymousClass59);

    public abstract boolean A0T();

    public SF(C1046Xo c1046Xo, NC nc, InterfaceC0684Jg interfaceC0684Jg, AnonymousClass18 anonymousClass18, C7U c7u, InterfaceC0761Mk interfaceC0761Mk) {
        super(c1046Xo);
        this.A0C = new SJ(this);
        this.A06 = new MD();
        this.A00 = false;
        this.A03 = c1046Xo;
        this.A09 = nc;
        this.A04 = interfaceC0684Jg;
        this.A01 = anonymousClass18;
        this.A02 = c7u;
        this.A08 = interfaceC0761Mk;
        this.A05 = new C0692Jo(this.A01.A0T(), this.A04);
        this.A0A = new C0869Qp(this, 1, new WeakReference(this.A0C), this.A03);
        this.A0A.A0W(this.A01.A0H());
        this.A0A.A0X(this.A01.A0I());
        this.A07 = A0N();
        this.A0B = new M8(this);
        this.A0B.A05(M7.A03);
    }

    private AbstractC0760Mj A0N() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A03, this.A08, this.A05, 1, this.A01.A0F());
        int A03 = this.A01.A0N().A0D().A03();
        fullScreenAdToolbar.setPageDetails(this.A01.A0Q(), this.A01.A0T(), A03, this.A01.A0R());
        fullScreenAdToolbar.A04(this.A01.A0M().A01(), true);
        if (A03 < 0 && this.A01.A0N().A0M()) {
            fullScreenAdToolbar.setToolbarActionMode(4);
        }
        fullScreenAdToolbar.setToolbarListener(new SG(this));
        return fullScreenAdToolbar;
    }

    private void A0O() {
        if (this.A01.A0N().A0P()) {
            PL A0B = new PJ(this.A03, this.A01.A0N().A0E(), this.A01.A0Q()).A08(this.A01.A0M().A01()).A0B();
            C0694Jq.A04(A0B, this.A05, EnumC0691Jn.A0U);
            addView(A0B, A0D);
            A0B.A04(new SH(this));
            return;
        }
        A0Q();
    }

    public final void A0P() {
        if (!this.A00) {
            this.A0A.A0U();
            this.A00 = true;
        }
    }

    public final void A0R(int i2, L7 l7) {
        new C0733Lg(i2, new SI(this, i2, l7)).A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void A8n(Intent intent, @Nullable Bundle bundle, AnonymousClass59 anonymousClass59) {
        this.A08.A3H(this, A0D);
        A0S(anonymousClass59);
        A0O();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void AEN(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        this.A0B.A03();
        if (!TextUtils.isEmpty(this.A01.A0T())) {
            this.A04.A8v(this.A01.A0T(), new OA().A03(this.A0A).A02(this.A06).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC0761Mk interfaceC0761Mk) {
    }

    public void setUpFullscreenMode(boolean z) {
        M7 m7;
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        if (z) {
            m7 = M7.A04;
        } else {
            m7 = M7.A03;
        }
        this.A0B.A05(m7);
    }
}
