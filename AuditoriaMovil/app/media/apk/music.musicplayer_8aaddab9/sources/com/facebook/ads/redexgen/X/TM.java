package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public abstract class TM extends RelativeLayout implements InterfaceC0762Ml {
    public static byte[] A0D;
    public static String[] A0E = {"fqT9snXDZkE2N6bIU2twhbCcrvrF5wQR", "W8MK3buqarkLhDixdfnbfGeXuw3i87xB", "M5iWaw3OwwKxChS5bTa9KUrj63pwu1Od", "QKu8TlGQ3D7NsDDaY", "OUnrWL6BanKvWJF", "644mHU9zQQHAcSiNB", "MqQzuM0GD0HqxOL2854PPJvoiao7nama", "mSpdOD621tCilusEUOf234Jx9LR3KzyX"};
    public View A00;
    @Nullable
    public C0733Lg A01;
    @Nullable
    public PL A02;
    public boolean A03;
    public boolean A04;
    public AnonymousClass19 A05;
    public final M8 A06;
    public final InterfaceC0761Mk A07;
    public final C1298d8 A08;
    public final C1046Xo A09;
    public final InterfaceC0684Jg A0A;
    public final C0692Jo A0B;
    public final AbstractC0760Mj A0C;

    public static String A0L(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A0O() {
        A0D = new byte[]{88, 84, 86, 21, 93, 90, 88, 94, 89, 84, 84, 80, 21, 90, 95, 72, 21, 82, 85, 79, 94, 73, 72, 79, 82, 79, 82, 90, 87, 21, 82, 86, 75, 73, 94, 72, 72, 82, 84, 85, 21, 87, 84, 92, 92, 94, 95};
    }

    public abstract boolean A0a();

    @ToolbarActionView$ToolbarActionMode
    public abstract int getCloseButtonStyle();

    static {
        A0O();
    }

    public TM(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, InterfaceC0761Mk interfaceC0761Mk, C1298d8 c1298d8) {
        super(c1046Xo);
        this.A04 = false;
        this.A03 = false;
        this.A09 = c1046Xo;
        this.A0A = interfaceC0684Jg;
        this.A07 = interfaceC0761Mk;
        this.A06 = new M8(this);
        this.A08 = c1298d8;
        this.A0B = new C0692Jo(this.A08.A0T(), this.A0A);
        this.A0C = new FullScreenAdToolbar(this.A09, getAudienceNetworkListener(), this.A0B, 0, this.A08.A0F());
    }

    private C1K A0K(int i2) {
        if (i2 == 1) {
            return this.A05.A01();
        }
        AnonymousClass19 anonymousClass19 = this.A05;
        if (A0E[2].charAt(7) != 'O') {
            throw new RuntimeException();
        }
        A0E[0] = "MYlveE6g4wScBr3MsnlZwbj0w3RA4Q0m";
        return anonymousClass19.A00();
    }

    private void A0M() {
        removeAllViews();
        ML.A0J(this);
    }

    private void A0N() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (A0X() && this.A02 == null) {
            this.A04 = true;
            this.A02 = new PJ(this.A09, this.A08.A0N().A0E(), this.A08.A0Q()).A08(this.A08.A0M().A01()).A0B();
            C0694Jq.A04(this.A02, this.A0B, EnumC0691Jn.A0U);
            this.A07.A3G(this, 0, layoutParams);
            this.A07.A3G(this.A02, 1, layoutParams);
            this.A02.A04(new TO(this));
            return;
        }
        this.A07.A3G(this, 0, layoutParams);
    }

    private void A0P(C1K c1k, boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0C.getToolbarHeight());
        layoutParams.addRule(10);
        this.A0C.A04(c1k, z);
        addView(this.A0C, layoutParams);
    }

    public final void A0S() {
        View view = this.A00;
        if (view == null || !(view instanceof OZ)) {
            return;
        }
        if (A0Y()) {
            ((OZ) this.A00).A0a();
        } else {
            ((OZ) this.A00).A0Z();
        }
    }

    public final void A0T(int i2) {
        this.A01 = new C0733Lg(i2, new TN(this, i2));
        this.A03 = true;
        A0S();
        this.A01.A07();
    }

    public final void A0U(View view, boolean z, int i2) {
        this.A00 = view;
        this.A06.A05(M7.A03);
        A0M();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, z ? 0 : this.A0C.getToolbarHeight(), 0, 0);
        layoutParams.addRule(12);
        addView(view, layoutParams);
        C1K A0K = A0K(i2);
        A0P(A0K, z);
        ML.A0M(this, A0K.A07(false));
        if (this.A07 != null) {
            A0N();
            String[] strArr = A0E;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0E[0] = "NsWlVTe7e8AxmZfep9MsD1WsEVvEb3lR";
            if (z && Build.VERSION.SDK_INT >= 19) {
                M8 m8 = this.A06;
                if (A0E[0].charAt(10) == 'o') {
                    throw new RuntimeException();
                }
                A0E[2] = "LlUUcmlOaTawHlOzciUSj9DhXPbTXBAe";
                m8.A05(M7.A04);
            }
        }
    }

    public final void A0V(AnonymousClass59 anonymousClass59) {
        this.A06.A04(anonymousClass59.A0H().getWindow());
        this.A05 = this.A08.A0M();
        C1B c1b = null;
        if (this.A08.A0N() != null && this.A08.A0N() != null) {
            c1b = this.A08.A0N();
        }
        this.A0C.setPageDetails(this.A08.A0Q(), this.A08.A0T(), c1b != null ? c1b.A0D().A03() : 0, this.A08.A0R());
        this.A0C.setToolbarListener(new TQ(this, anonymousClass59));
    }

    public final void A0W(AnonymousClass59 anonymousClass59) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new animation.Animation$AnimationListenerC0768Mr(this, this, anonymousClass59));
        startAnimation(alphaAnimation);
    }

    public final boolean A0X() {
        if (!this.A08.A0b().isEmpty()) {
            boolean A0P = this.A08.A0N().A0P();
            if (A0E[6].charAt(3) != 'z') {
                throw new RuntimeException();
            }
            A0E[2] = "rwsNokIOLx9Fj0KMvDMbhHWjcozH5rOe";
            if (A0P) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0Y() {
        return this.A03;
    }

    public final boolean A0Z() {
        return this.A04;
    }

    public void ABg(boolean z) {
        C0733Lg c0733Lg = this.A01;
        if (c0733Lg != null && c0733Lg.A05()) {
            this.A01.A06();
        }
    }

    public void AC5(boolean z) {
        C0733Lg c0733Lg = this.A01;
        if (c0733Lg != null && !c0733Lg.A04()) {
            this.A01.A07();
        }
    }

    public InterfaceC0684Jg getAdEventManager() {
        return this.A0A;
    }

    public InterfaceC0761Mk getAudienceNetworkListener() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.A06.A03();
        this.A0C.setToolbarListener(null);
        A0M();
    }

    public void setImpressionRecordingFlag(MD md) {
        md.A05();
        if (getAudienceNetworkListener() != null) {
            getAudienceNetworkListener().A3r(A0L(0, 47, 106));
        }
    }

    public void setListener(InterfaceC0761Mk interfaceC0761Mk) {
    }
}
