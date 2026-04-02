package com.amazon.aps.iva.v1;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* loaded from: classes.dex */
public final class j {
    public static final j a = new j();

    public final void a(AccessibilityNodeInfo accessibilityNodeInfo, List<String> list) {
        com.amazon.aps.iva.yb0.j.f(accessibilityNodeInfo, "node");
        com.amazon.aps.iva.yb0.j.f(list, "data");
        accessibilityNodeInfo.setAvailableExtraData(list);
    }
}
