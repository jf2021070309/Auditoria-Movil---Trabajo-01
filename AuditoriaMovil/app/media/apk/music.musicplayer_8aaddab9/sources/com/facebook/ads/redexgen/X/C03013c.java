package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RequiresApi;
import java.util.List;
@RequiresApi(16)
/* renamed from: com.facebook.ads.redexgen.X.3c  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03013c {
    public static Object A00(final InterfaceC03003b interfaceC03003b) {
        return new AccessibilityNodeProvider() { // from class: com.facebook.ads.redexgen.X.3a
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
                return (AccessibilityNodeInfo) InterfaceC03003b.this.A4C(i2);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i2) {
                return InterfaceC03003b.this.A5N(str, i2);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final boolean performAction(int i2, int i3, Bundle bundle) {
                return InterfaceC03003b.this.AD6(i2, i3, bundle);
            }
        };
    }
}
