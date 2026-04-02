package com.amazon.aps.iva.el;
/* compiled from: PlayerControlsVisibility.kt */
/* loaded from: classes2.dex */
public enum c0 {
    SHOWN,
    HIDDEN,
    FORCE_SHOWN;

    public final boolean isVisible() {
        if (this != SHOWN && this != FORCE_SHOWN) {
            return false;
        }
        return true;
    }
}
