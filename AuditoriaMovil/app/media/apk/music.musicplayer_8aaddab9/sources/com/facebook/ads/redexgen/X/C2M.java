package com.facebook.ads.redexgen.X;

import android.os.Build;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.2M  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C2M extends F6 {
    public C2M(C1046Xo c1046Xo) {
        super(c1046Xo);
        setCarouselLayoutManager(c1046Xo);
    }

    @Nullable
    public S0 getFullscreenCarouselRecyclerViewAdapter() {
        if (getAdapter() instanceof S0) {
            return (S0) getAdapter();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.F6
    public c0 getLayoutManager() {
        return (c0) super.getLayoutManager();
    }

    private void setCarouselLayoutManager(C1046Xo c1046Xo) {
        c0 c0Var = new c0(c1046Xo, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c0Var.A1V(true);
        }
        super.setLayoutManager(c0Var);
    }

    @Override // com.facebook.ads.redexgen.X.F6
    public void setLayoutManager(C4T c4t) {
    }
}
