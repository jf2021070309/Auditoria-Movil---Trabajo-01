package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RequiresApi;
import java.util.List;
@RequiresApi(19)
/* renamed from: com.facebook.ads.redexgen.X.3f  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03033f {
    public static Object A00(final InterfaceC03023e interfaceC03023e) {
        return new AccessibilityNodeProvider() { // from class: com.facebook.ads.redexgen.X.3d
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
                return (AccessibilityNodeInfo) InterfaceC03023e.this.A4C(i2);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i2) {
                return InterfaceC03023e.this.A5N(str, i2);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo findFocus(int i2) {
                return (AccessibilityNodeInfo) InterfaceC03023e.this.A5O(i2);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final boolean performAction(int i2, int i3, Bundle bundle) {
                return InterfaceC03023e.this.AD6(i2, i3, bundle);
            }
        };
    }
}
