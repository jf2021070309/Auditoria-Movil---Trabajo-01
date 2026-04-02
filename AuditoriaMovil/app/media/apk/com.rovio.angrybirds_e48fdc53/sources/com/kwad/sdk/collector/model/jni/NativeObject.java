package com.kwad.sdk.collector.model.jni;
/* loaded from: classes.dex */
public abstract class NativeObject {
    protected long mPtr;

    public abstract void destroy();

    public long getNativePtr() {
        return this.mPtr;
    }
}
