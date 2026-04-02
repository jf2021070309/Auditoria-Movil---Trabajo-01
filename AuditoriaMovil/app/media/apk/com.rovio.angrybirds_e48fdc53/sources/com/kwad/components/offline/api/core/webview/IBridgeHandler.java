package com.kwad.components.offline.api.core.webview;
/* loaded from: classes.dex */
public interface IBridgeHandler {
    String getKey();

    void handleJsCall(String str);

    void onDestroy();
}
