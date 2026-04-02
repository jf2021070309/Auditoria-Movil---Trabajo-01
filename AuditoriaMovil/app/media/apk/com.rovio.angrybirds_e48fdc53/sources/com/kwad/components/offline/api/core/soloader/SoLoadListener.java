package com.kwad.components.offline.api.core.soloader;
/* loaded from: classes.dex */
public interface SoLoadListener {
    void onFailed(int i, Throwable th);

    void onLoaded();

    void onPreUpdate();
}
