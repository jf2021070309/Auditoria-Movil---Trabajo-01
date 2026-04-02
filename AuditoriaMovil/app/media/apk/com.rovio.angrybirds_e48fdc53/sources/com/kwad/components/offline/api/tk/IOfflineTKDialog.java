package com.kwad.components.offline.api.tk;
/* loaded from: classes.dex */
public interface IOfflineTKDialog {
    void callTKBridge(String str);

    void callbackDialogDismiss();

    void callbackPageStatus(boolean z, String str);

    int getDialogId();

    String getStyleTemplate();

    void registerJSCallHandler(IOfflineTKCallHandler iOfflineTKCallHandler);
}
