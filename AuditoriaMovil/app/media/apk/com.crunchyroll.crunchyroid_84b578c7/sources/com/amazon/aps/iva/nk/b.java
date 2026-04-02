package com.amazon.aps.iva.nk;
/* compiled from: AdState.kt */
/* loaded from: classes.dex */
public enum b {
    NOT_INITIALIZED,
    LOADED,
    PLAYING,
    PAUSED,
    COMPLETE,
    BUFFERING,
    ERROR;

    public final boolean isPlaying() {
        if (this == PLAYING) {
            return true;
        }
        return false;
    }
}
