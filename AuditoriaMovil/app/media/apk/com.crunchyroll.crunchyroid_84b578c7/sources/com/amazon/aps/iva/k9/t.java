package com.amazon.aps.iva.k9;
/* compiled from: WorkInfo.java */
/* loaded from: classes.dex */
public enum t {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public boolean isFinished() {
        if (this != SUCCEEDED && this != FAILED && this != CANCELLED) {
            return false;
        }
        return true;
    }
}
