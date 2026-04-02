package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Rm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0892Rm extends C4H<C0890Rk> {
    public final int A00;
    public final C1046Xo A01;
    public final List<String> A02;

    public C0892Rm(C1046Xo c1046Xo, List<String> screenshotUrls, int i2) {
        this.A02 = screenshotUrls;
        this.A00 = i2;
        this.A01 = c1046Xo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A01 */
    public final C0890Rk A06(ViewGroup viewGroup, int i2) {
        return new C0890Rk(new C0891Rl(this.A01));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A02 */
    public final void A0E(C0890Rk c0890Rk, int leftMargin) {
        int i2;
        String str = this.A02.get(leftMargin);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i3 = this.A00;
        int startSpacing = i3 * 4;
        if (leftMargin == 0) {
            i3 = startSpacing;
        }
        int startSpacing2 = A0D();
        if (leftMargin >= startSpacing2 - 1) {
            int startSpacing3 = this.A00;
            i2 = startSpacing3 * 4;
        } else {
            i2 = this.A00;
        }
        marginLayoutParams.setMargins(i3, 0, i2, 0);
        c0890Rk.A0l().setLayoutParams(marginLayoutParams);
        c0890Rk.A0l().A00(str);
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A02.size();
    }
}
