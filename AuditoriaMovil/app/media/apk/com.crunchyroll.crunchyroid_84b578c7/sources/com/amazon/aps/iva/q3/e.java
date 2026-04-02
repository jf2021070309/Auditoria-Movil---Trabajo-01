package com.amazon.aps.iva.q3;

import android.view.accessibility.AccessibilityManager;
/* compiled from: AccessibilityManagerCompat.java */
/* loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final d a;

    public e(d dVar) {
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.a.equals(((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.a.onTouchExplorationStateChanged(z);
    }
}
