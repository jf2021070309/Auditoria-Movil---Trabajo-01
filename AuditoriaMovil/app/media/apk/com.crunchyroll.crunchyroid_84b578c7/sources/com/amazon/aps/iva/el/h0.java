package com.amazon.aps.iva.el;
/* compiled from: PlayerSizeState.kt */
/* loaded from: classes2.dex */
public enum h0 {
    MINIMIZED,
    FULL_SCREEN,
    FULL_SCREEN_LOCKED;

    public final boolean isFullscreen() {
        if (this != FULL_SCREEN && this != FULL_SCREEN_LOCKED) {
            return false;
        }
        return true;
    }
}
