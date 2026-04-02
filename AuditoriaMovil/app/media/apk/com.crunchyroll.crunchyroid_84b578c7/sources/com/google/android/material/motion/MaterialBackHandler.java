package com.google.android.material.motion;

import com.amazon.aps.iva.e.b;
/* loaded from: classes3.dex */
public interface MaterialBackHandler {
    void cancelBackProgress();

    void handleBackInvoked();

    void startBackProgress(b bVar);

    void updateBackProgress(b bVar);
}
