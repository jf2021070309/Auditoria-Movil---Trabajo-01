package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class AE extends S1 {
    public static String[] A00 = {"4DJOkXe9rib7uWc4nLa4kcuSPdxs7gf4", "Dyxr4XzeXsq4jjw5BU630cyoQdL32ISv", "MScpZjpz", "3XC0FNsyX3k6WX9dbHhU9IwCEOagJZ1X", "JEKgPGdFYfe9RoD8dW0t8x0Mvi1GtEmi", "N5tdloXdcly7PUtxD1ZshZXdUDk2Lr2A", "5elKCHWntj6O1Wqi1faAvLWvEV4yzp2T", "JBMx9492vmjOwkRP6"};

    public AE(C2M c2m, int i2, @Nullable List<PU> list, @Nullable C0869Qp c0869Qp, @Nullable Bundle bundle) {
        super(c2m, i2, list, c0869Qp, bundle);
        c2m.A1j(this);
        this.A03 = new T3(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        int A27 = this.A0C.A27();
        if (this.A05 != null && A27 != -1 && A27 < this.A05.size() - 1) {
            A0V(A27 + 1);
        }
    }

    private void A01(int lastVisibleItem) {
        int A28 = this.A0C.A28();
        int A29 = this.A0C.A29();
        int visibleItem = this.A0C.A27();
        if (visibleItem != A28) {
            A0S(A28);
        }
        if (visibleItem != A29) {
            A0S(A29);
        }
        A0T(visibleItem);
        A0W(A28, A29, lastVisibleItem);
    }

    @Override // com.facebook.ads.redexgen.X.S1, com.facebook.ads.redexgen.X.C4Y
    public final void A0L(F6 f6, int i2) {
    }

    @Override // com.facebook.ads.redexgen.X.S1, com.facebook.ads.redexgen.X.C4Y
    public final void A0M(F6 f6, int i2, int i3) {
        if (this.A0C.A27() != -1) {
            AbstractC0907Sb abstractC0907Sb = (AbstractC0907Sb) this.A0C.A1q(this.A0C.A27());
            if (A00[2].length() == 4) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[3] = "IxYVUA16uQkbjXwNztolao4gyOA0tKzF";
            strArr[6] = "jcO9EzcXxFOxyF2BSjZiD0vteRj0mA5y";
            if (abstractC0907Sb != null && abstractC0907Sb.A0i() && !abstractC0907Sb.A0h()) {
                abstractC0907Sb.A0f();
            }
            A01(i2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.S1
    public final void A0Y(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.8f);
    }

    @Override // com.facebook.ads.redexgen.X.S1
    public final void A0a(AbstractC0907Sb abstractC0907Sb, boolean z) {
        A0Y(abstractC0907Sb, z);
        if (!z && abstractC0907Sb.A0h()) {
            abstractC0907Sb.A0e();
        }
    }

    @Override // com.facebook.ads.redexgen.X.S1
    public final boolean A0b(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.75f;
    }

    public final C0869Qp A0c() {
        return this.A04;
    }

    public final void A0d(C0869Qp c0869Qp) {
        this.A04 = c0869Qp;
    }

    public final void A0e(List<PU> list) {
        this.A05 = list;
    }
}
