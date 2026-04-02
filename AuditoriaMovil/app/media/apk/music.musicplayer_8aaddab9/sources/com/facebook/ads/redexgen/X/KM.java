package com.facebook.ads.redexgen.X;

import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.os.Handler;
import android.view.View;
import androidx.annotation.Nullable;
@TargetApi(12)
/* loaded from: assets/audience_network.dex */
public final class KM implements Q0 {
    public static String[] A0B = {"82Zz8oCZg8zkkbzw8opl2Yz4CtrF2SDp", "9Qv", "sj5N5SmrmBRQmWue5o8rJw6ys3alFtJa", "lBA7odrZYL425", "CSSBUKaIJSWMhqfJuWGnuyX4cipoTk5I", "IDQP5gLMbSSnC18VVbdsGZXvkzghwpNg", "Yf1MSxzKxHs57zUlY7hI2xykX4pHUq1P", "T3bn0lMwtbok5v0PvXD6574OGDOrX6LS"};
    public View A00;
    @Nullable
    public Q8 A01;
    @Nullable
    public QC A02;
    public boolean A03;
    public final Handler A04;
    public final N0 A05;
    public final ME A06;
    public final LF A07;
    public final AbstractC0706Kc A08;
    public final boolean A09;
    public final boolean A0A;

    public KM(View view, QC qc, boolean z) {
        this(view, qc, z, false);
    }

    public KM(View view, @Nullable QC qc, boolean z, boolean z2) {
        this.A06 = new ME() { // from class: com.facebook.ads.redexgen.X.7r
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(AnonymousClass85 anonymousClass85) {
                KM.this.A06(1, 0);
            }
        };
        this.A07 = new LF() { // from class: com.facebook.ads.redexgen.X.7q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(C0731Le c0731Le) {
                boolean z3;
                QC qc2;
                boolean z4;
                z3 = KM.this.A03;
                if (!z3) {
                    return;
                }
                qc2 = KM.this.A02;
                if (qc2 != QC.A03) {
                    z4 = KM.this.A09;
                    if (!z4) {
                        KM.this.A06(0, 8);
                        return;
                    }
                }
                KM.this.A02 = null;
                KM.this.A05();
            }
        };
        this.A05 = new N0() { // from class: com.facebook.ads.redexgen.X.7p
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(AnonymousClass86 anonymousClass86) {
                QC qc2;
                View view2;
                View view3;
                qc2 = KM.this.A02;
                if (qc2 == QC.A04) {
                    return;
                }
                view2 = KM.this.A00;
                view2.setAlpha(1.0f);
                view3 = KM.this.A00;
                view3.setVisibility(0);
            }
        };
        this.A08 = new C04107o(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z;
        this.A0A = z2;
        A08(view, qc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        this.A00.animate().alpha(0.0f).setDuration(500L).setListener(new QB(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(int i2, int i3) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i2);
        this.A00.setVisibility(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(View view, QC qc) {
        this.A02 = qc;
        this.A00 = view;
        this.A00.clearAnimation();
        if (qc == QC.A04) {
            this.A00.setAlpha(0.0f);
            String[] strArr = A0B;
            if (strArr[5].charAt(26) == strArr[0].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[5] = "3OWa54Sl5zOXBo6RskK22JrE4LW5JWKj";
            strArr2[0] = "lt7hksMEFpJVhV2333OBcIopOVPW9bfy";
            this.A00.setVisibility(8);
            return;
        }
        this.A00.setAlpha(1.0f);
        this.A00.setVisibility(0);
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void A8o(Q8 q8) {
        this.A01 = q8;
        q8.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void AFL(Q8 q8) {
        A06(1, 0);
        q8.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}
