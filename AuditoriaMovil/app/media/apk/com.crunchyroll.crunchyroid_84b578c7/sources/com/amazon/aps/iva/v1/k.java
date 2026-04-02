package com.amazon.aps.iva.v1;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
/* compiled from: AndroidAccessibilityManager.android.kt */
/* loaded from: classes.dex */
public final class k implements i {
    public k(Context context) {
        Object systemService = context.getSystemService("accessibility");
        com.amazon.aps.iva.yb0.j.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
    }
}
