package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.7e  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class View$OnClickListenerC04037e extends N9 implements View.OnClickListener {
    public static String[] A05 = {"dj2bca5KMhic7lU7SNdjndSTQwmssf52", "TPlcacN2BRfqpmqqou3eGj4ypEirHC", "lK1i5T", "LDnNwGMA5Xj1Rc4RK", "9vPtQslMJEvaRYxyY6ZiMi1q6kn3NQTo", "pbwCeIFhJ07zfEQSECI2TdcOW", "Wj7W52", "ztBFgo3EeJBil6N8wes8zN"};
    public final N0 A00;
    public final ME A01;
    public final LF A02;
    public final L2 A03;
    public final QK A04;

    public View$OnClickListenerC04037e(C1046Xo c1046Xo) {
        this(c1046Xo, null);
    }

    public View$OnClickListenerC04037e(C1046Xo c1046Xo, AttributeSet attributeSet) {
        this(c1046Xo, attributeSet, 0);
    }

    public View$OnClickListenerC04037e(C1046Xo c1046Xo, AttributeSet attributeSet, int i2) {
        super(c1046Xo, attributeSet, i2);
        this.A03 = new L2() { // from class: com.facebook.ads.redexgen.X.7l
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(L3 l3) {
                View$OnClickListenerC04037e.this.setVisibility(0);
            }
        };
        this.A01 = new ME() { // from class: com.facebook.ads.redexgen.X.7k
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(AnonymousClass85 anonymousClass85) {
                QK qk;
                qk = View$OnClickListenerC04037e.this.A04;
                qk.setChecked(true);
            }
        };
        this.A02 = new LF() { // from class: com.facebook.ads.redexgen.X.7g
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(C0731Le c0731Le) {
                QK qk;
                qk = View$OnClickListenerC04037e.this.A04;
                qk.setChecked(false);
            }
        };
        this.A00 = new N0() { // from class: com.facebook.ads.redexgen.X.7f
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(AnonymousClass86 anonymousClass86) {
                QK qk;
                qk = View$OnClickListenerC04037e.this.A04;
                qk.setChecked(true);
            }
        };
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A04 = new QK(c1046Xo);
        this.A04.setChecked(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 25.0f), (int) (displayMetrics.density * 25.0f));
        setVisibility(8);
        addView(this.A04, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.facebook.ads.redexgen.X.N9
    public final void A07() {
        super.A07();
        setOnClickListener(this);
        this.A04.setOnClickListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A00, this.A01, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.N9
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A01, this.A00, this.A03);
        }
        setOnClickListener(null);
        this.A04.setOnClickListener(null);
        super.A08();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            Q8 videoView = getVideoView();
            if (videoView == null) {
                return;
            }
            if (videoView.getState() == EnumC0866Qm.A07 || videoView.getState() == EnumC0866Qm.A05 || videoView.getState() == EnumC0866Qm.A06) {
                videoView.A0b(EnumC0853Pz.A04, 11);
            } else if (videoView.getState() == EnumC0866Qm.A0A) {
                videoView.A0e(true, 7);
            }
        } catch (Throwable th) {
            if (A05[5].length() != 25) {
                throw new RuntimeException();
            }
            A05[7] = "YsoDkb8mAWGLBYzRGBa3i8";
            C0726Kz.A00(th, this);
        }
    }

    public void setPauseAccessibilityLabel(@Nullable String str) {
        this.A04.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(@Nullable String str) {
        this.A04.setPlayAccessibilityLabel(str);
    }
}
