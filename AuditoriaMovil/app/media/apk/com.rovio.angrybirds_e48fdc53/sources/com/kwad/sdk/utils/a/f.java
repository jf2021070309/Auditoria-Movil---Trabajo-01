package com.kwad.sdk.utils.a;

import java.util.concurrent.Executor;
/* loaded from: classes3.dex */
public final class f implements Executor {
    private Runnable aLD;
    private Runnable aLE;

    private Runnable c(final Runnable runnable) {
        return new Runnable() { // from class: com.kwad.sdk.utils.a.f.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    runnable.run();
                } finally {
                    f.this.scheduleNext();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void scheduleNext() {
        Runnable runnable = this.aLE;
        this.aLD = runnable;
        this.aLE = null;
        if (runnable != null) {
            d.getExecutor().execute(this.aLD);
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        if (this.aLD == null) {
            this.aLD = c(runnable);
            d.getExecutor().execute(this.aLD);
            return;
        }
        if (this.aLE == null) {
            this.aLE = c(runnable);
        }
    }
}
