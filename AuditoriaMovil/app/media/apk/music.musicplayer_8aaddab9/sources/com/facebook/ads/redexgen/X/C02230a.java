package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.api.CommonStatusCodes;
@RequiresApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
/* renamed from: com.facebook.ads.redexgen.X.0a  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C02230a extends C02260d {
    @Override // com.facebook.ads.redexgen.X.AnonymousClass37
    public final C3P A08(View view, C3P c3p) {
        WindowInsets windowInsets = (WindowInsets) C3P.A01(c3p);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (dispatchApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return C3P.A00(windowInsets);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass37
    public final C3P A09(View view, C3P c3p) {
        WindowInsets windowInsets = (WindowInsets) C3P.A01(c3p);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return C3P.A00(windowInsets);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass37
    public final void A0B(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass37
    public final void A0F(View view, final InterfaceC02912s interfaceC02912s) {
        if (interfaceC02912s == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.36
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    return (WindowInsets) C3P.A01(interfaceC02912s.A9y(view2, C3P.A00(windowInsets)));
                }
            });
        }
    }
}
