package com.vungle.warren;

import com.vungle.warren.error.VungleException;
import java.util.concurrent.ExecutorService;
/* loaded from: classes2.dex */
class InitCallbackWrapper implements InitCallback {
    private final InitCallback callback;
    private final ExecutorService executorService;

    /* JADX INFO: Access modifiers changed from: package-private */
    public InitCallbackWrapper(ExecutorService executorService, InitCallback initCallback) {
        this.callback = initCallback;
        this.executorService = executorService;
    }

    @Override // com.vungle.warren.InitCallback
    public void onSuccess() {
        if (this.callback == null) {
            return;
        }
        this.executorService.execute(new Runnable() { // from class: com.vungle.warren.InitCallbackWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                InitCallbackWrapper.this.callback.onSuccess();
            }
        });
    }

    @Override // com.vungle.warren.InitCallback
    public void onError(final VungleException vungleException) {
        if (this.callback == null) {
            return;
        }
        this.executorService.execute(new Runnable() { // from class: com.vungle.warren.InitCallbackWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                InitCallbackWrapper.this.callback.onError(vungleException);
            }
        });
    }

    @Override // com.vungle.warren.InitCallback
    public void onAutoCacheAdAvailable(final String str) {
        if (this.callback == null) {
            return;
        }
        this.executorService.execute(new Runnable() { // from class: com.vungle.warren.InitCallbackWrapper.3
            @Override // java.lang.Runnable
            public void run() {
                InitCallbackWrapper.this.callback.onAutoCacheAdAvailable(str);
            }
        });
    }
}
