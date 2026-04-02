package com.kwad.sdk.core.download.a;

import com.kwad.sdk.api.KsAppDownloadListener;
/* loaded from: classes.dex */
public abstract class a implements KsAppDownloadListener {
    public String downloadId;

    public a() {
    }

    public a(String str) {
        this.downloadId = str;
    }

    public final String nB() {
        return this.downloadId;
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public void onDownloadStarted() {
    }

    public void onPaused(int i) {
    }
}
