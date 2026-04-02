package com.kwad.sdk.core.network;

import com.kwad.sdk.core.network.g;
import com.kwad.sdk.core.threads.GlobalThreadPools;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public abstract class a<R extends g> {
    private static final ExecutorService sExecutors = GlobalThreadPools.CV();
    private Future<?> mTask;

    /* JADX INFO: Access modifiers changed from: protected */
    public void cancel() {
        Future<?> future = this.mTask;
        if (future != null) {
            future.cancel(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract R createRequest();

    /* JADX INFO: Access modifiers changed from: protected */
    public void fetch() {
        try {
            this.mTask = getExecutor().submit(new Runnable() { // from class: com.kwad.sdk.core.network.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        a.this.fetchImpl();
                    } catch (Throwable th) {
                        com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                    }
                }
            });
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTrace(th);
        }
    }

    protected abstract void fetchImpl();

    protected ExecutorService getExecutor() {
        return sExecutors;
    }

    protected abstract void onResponse(R r, c cVar);
}
