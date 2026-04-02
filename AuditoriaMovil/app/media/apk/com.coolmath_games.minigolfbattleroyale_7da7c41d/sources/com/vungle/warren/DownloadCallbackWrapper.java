package com.vungle.warren;

import com.vungle.warren.AdLoader;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import java.util.concurrent.ExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class DownloadCallbackWrapper implements AdLoader.DownloadCallback {
    private final AdLoader.DownloadCallback downloadCallback;
    private final ExecutorService executorService;

    public DownloadCallbackWrapper(ExecutorService executorService, AdLoader.DownloadCallback downloadCallback) {
        this.downloadCallback = downloadCallback;
        this.executorService = executorService;
    }

    @Override // com.vungle.warren.AdLoader.DownloadCallback
    public void onDownloadCompleted(final AdRequest adRequest, final String str) {
        if (this.downloadCallback == null) {
            return;
        }
        this.executorService.execute(new Runnable() { // from class: com.vungle.warren.DownloadCallbackWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                DownloadCallbackWrapper.this.downloadCallback.onDownloadCompleted(adRequest, str);
            }
        });
    }

    @Override // com.vungle.warren.AdLoader.DownloadCallback
    public void onDownloadFailed(final VungleException vungleException, final AdRequest adRequest, final String str) {
        if (this.downloadCallback == null) {
            return;
        }
        this.executorService.execute(new Runnable() { // from class: com.vungle.warren.DownloadCallbackWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                DownloadCallbackWrapper.this.downloadCallback.onDownloadFailed(vungleException, adRequest, str);
            }
        });
    }

    @Override // com.vungle.warren.AdLoader.DownloadCallback
    public void onReady(final AdRequest adRequest, final Placement placement, final Advertisement advertisement) {
        if (this.downloadCallback == null) {
            return;
        }
        this.executorService.execute(new Runnable() { // from class: com.vungle.warren.DownloadCallbackWrapper.3
            @Override // java.lang.Runnable
            public void run() {
                DownloadCallbackWrapper.this.downloadCallback.onReady(adRequest, placement, advertisement);
            }
        });
    }
}
