package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.6p  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03896p extends N9 {
    public final Paint A00;
    public final C1046Xo A01;
    @Nullable
    public final C0692Jo A02;
    public final N0 A03;
    public final ME A04;
    public final LF A05;
    public final QK A06;

    public C03896p(C1046Xo c1046Xo, boolean z, @Nullable C0692Jo c0692Jo) {
        super(c1046Xo);
        this.A04 = new ME() { // from class: com.facebook.ads.redexgen.X.7b
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(AnonymousClass85 anonymousClass85) {
                QK qk;
                qk = C03896p.this.A06;
                qk.setChecked(true);
            }
        };
        this.A05 = new LF() { // from class: com.facebook.ads.redexgen.X.7a
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(C0731Le c0731Le) {
                QK qk;
                qk = C03896p.this.A06;
                qk.setChecked(false);
            }
        };
        this.A03 = new N0() { // from class: com.facebook.ads.redexgen.X.7O
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(AnonymousClass86 anonymousClass86) {
                QK qk;
                qk = C03896p.this.A06;
                qk.setChecked(true);
            }
        };
        this.A02 = c0692Jo;
        this.A01 = c1046Xo;
        this.A06 = new QK(c1046Xo, z);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 23.76d), (int) (displayMetrics.density * 23.76d));
        layoutParams.addRule(13);
        this.A06.setLayoutParams(layoutParams);
        this.A06.setChecked(true);
        this.A06.setClickable(false);
        this.A00 = new Paint();
        this.A00.setStyle(Paint.Style.FILL);
        if (z) {
            this.A00.setColor(-1728053248);
        } else {
            this.A00.setColor(-1);
            this.A00.setAlpha(204);
        }
        ML.A0M(this, 0);
        addView(this.A06);
        setGravity(17);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 72.0d), (int) (displayMetrics.density * 72.0d));
        layoutParams2.addRule(13);
        setLayoutParams(layoutParams2);
    }

    @Override // com.facebook.ads.redexgen.X.N9
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A04, this.A05, this.A03);
        }
        setOnClickListener(new QH(this));
    }

    @Override // com.facebook.ads.redexgen.X.N9
    public final void A08() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A03, this.A05, this.A04);
        }
        super.A08();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int centerX = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        int i2 = centerX / 2;
        canvas.drawCircle(getPaddingLeft() + i2, getPaddingTop() + (centerX / 2), i2, this.A00);
        super.onDraw(canvas);
    }
}
