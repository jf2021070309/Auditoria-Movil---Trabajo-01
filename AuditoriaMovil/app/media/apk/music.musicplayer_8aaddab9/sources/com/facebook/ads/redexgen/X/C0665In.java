package com.facebook.ads.redexgen.X;

import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.In  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0665In extends RelativeLayout implements Q0 {
    public static byte[] A08;
    public static final int A09;
    public int A00;
    public ObjectAnimator A01;
    public ProgressBar A02;
    public AbstractC04429c A03;
    public AbstractC04429c A04;
    public AbstractC04429c A05;
    public AbstractC04429c A06;
    @Nullable
    public Q8 A07;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 20);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A08 = new byte[]{-71, -69, -72, -80, -69, -82, -68, -68};
    }

    static {
        A03();
        A09 = (int) (C0739Lm.A00 * 6.0f);
    }

    public C0665In(C1046Xo c1046Xo) {
        this(c1046Xo, A09, -12549889, 0);
    }

    public C0665In(C1046Xo c1046Xo, int i2, int i3, int i4) {
        super(c1046Xo);
        this.A00 = -1;
        this.A06 = new L0() { // from class: com.facebook.ads.redexgen.X.64
            public static String[] A01 = {"5cZwmFwOCvoIimHKJKs7c8Wrfuwl5", "kR6Rx7ETQGlVhfpD5OxJcFg21Ovz094i", "oaAjYFLN3m9AYmyloxlSIBJp6ETHW3KF", "dCQrNLE74jmKWuOaqJJ4Sbhiwuuv5ad", "onBgfHhqxGhqxLvpU2wfKqg3mDsyExyq", "SCROov7hAW1gh5oss5LLtyUv0yBfa", "SAPoZVZ00ZwZwmL71sxtzrpJli3hIy2X", "TEn6j3AzMnGgqeyMrOghHZKrMbMLSMuC"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(AnonymousClass84 anonymousClass84) {
                Q8 q8;
                q8 = C0665In.this.A07;
                if (q8 != null) {
                    C0665In c0665In = C0665In.this;
                    String[] strArr = A01;
                    if (strArr[2].charAt(14) == strArr[4].charAt(14)) {
                        throw new RuntimeException();
                    }
                    A01[1] = "B8raFzKF2tgWcMrESvgtBPeFcOBIsHL1";
                    c0665In.A07(true);
                }
            }
        };
        this.A04 = new ME() { // from class: com.facebook.ads.redexgen.X.4p
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(AnonymousClass85 anonymousClass85) {
                C0665In.this.A02();
            }
        };
        this.A05 = new LF() { // from class: com.facebook.ads.redexgen.X.4h
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(C0731Le c0731Le) {
                Q8 q8;
                q8 = C0665In.this.A07;
                if (q8 != null) {
                    C0665In.this.A07(true);
                }
            }
        };
        this.A03 = new N0() { // from class: com.facebook.ads.redexgen.X.4V
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(AnonymousClass86 anonymousClass86) {
                Q8 q8;
                q8 = C0665In.this.A07;
                if (q8 != null) {
                    C0665In.this.A05();
                }
            }
        };
        this.A02 = new ProgressBar(c1046Xo, null, 16842872);
        A06(i3, i4);
        this.A02.setMax(10000);
        addView(this.A02, new RelativeLayout.LayoutParams(-1, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        ObjectAnimator objectAnimator = this.A01;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.A01.setTarget(null);
            this.A01 = null;
            this.A02.clearAnimation();
        }
    }

    public final void A05() {
        A02();
        this.A01 = ObjectAnimator.ofInt(this.A02, A01(0, 8, 53), 0, 0);
        this.A01.setDuration(0L);
        this.A01.setInterpolator(new LinearInterpolator());
        this.A01.start();
        this.A00 = -1;
    }

    public final void A06(int i2, int i3) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ColorDrawable(i3), new ColorDrawable(i3), new ScaleDrawable(new ColorDrawable(i2), 8388611, 1.0f, -1.0f)});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        this.A02.setProgressDrawable(layerDrawable);
    }

    public final void A07(boolean z) {
        if (this.A07 == null) {
            return;
        }
        A02();
        int currentPositionInMillis = this.A07.getCurrentPositionInMillis();
        int duration = this.A07.getDuration();
        int i2 = duration > 0 ? (currentPositionInMillis * 10000) / duration : 0;
        int i3 = this.A00;
        if (i3 >= i2 || duration <= currentPositionInMillis) {
            return;
        }
        if (z) {
            this.A01 = ObjectAnimator.ofInt(this.A02, A01(0, 8, 53), i3, i2);
            ObjectAnimator objectAnimator = this.A01;
            int progress = Math.min(250, duration - currentPositionInMillis);
            objectAnimator.setDuration(progress);
            this.A01.setInterpolator(new LinearInterpolator());
            this.A01.start();
        } else {
            this.A02.setProgress(i2);
        }
        this.A00 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void A8o(Q8 q8) {
        this.A07 = q8;
        q8.getEventBus().A03(this.A04, this.A05, this.A06, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void AFL(Q8 q8) {
        q8.getEventBus().A04(this.A06, this.A05, this.A04, this.A03);
        this.A07 = null;
    }
}
