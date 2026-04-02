package com.kwad.sdk.components;

import android.content.Intent;
/* loaded from: classes.dex */
public interface h {
    void a(i iVar);

    void callTKBridge(String str);

    void callbackPageStatus(boolean z, String str);

    String getClassName();

    Intent getIntent();

    String getTemplateString();

    String getUrl();
}
