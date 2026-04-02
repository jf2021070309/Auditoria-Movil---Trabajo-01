package com.kwad.sdk.ranger;

import okhttp3.EventListener;
/* loaded from: classes3.dex */
public class c implements EventListener.Factory {
    public static final String TAG = "Ranger_" + c.class.getSimpleName();
    EventListener aGL;
    a aGM;

    /* loaded from: classes3.dex */
    public interface a {
    }

    public c(Object obj, a aVar) {
        this.aGL = (EventListener) obj;
        this.aGM = aVar;
    }
}
