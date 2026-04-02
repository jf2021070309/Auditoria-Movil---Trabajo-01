package com.kwad.sdk.utils;

import android.content.Context;
/* loaded from: classes3.dex */
public abstract class j<T> {
    protected boolean IO;
    protected boolean aIm = false;

    public j(boolean z) {
        this.IO = z;
    }

    public final void aO(boolean z) {
        this.IO = z;
    }

    public final T bQ(Context context) {
        if (this.IO && !this.aIm) {
            try {
                return bR(context);
            } catch (Throwable th) {
                com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                return null;
            }
        }
        return null;
    }

    protected abstract T bR(Context context);
}
