package com.kwad.sdk.utils;

import com.kwad.sdk.service.ServiceProvider;
/* loaded from: classes3.dex */
public abstract class aw implements Runnable {
    public abstract void doTask();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            doTask();
        } catch (Throwable th) {
            com.kwad.sdk.service.a.d dVar = (com.kwad.sdk.service.a.d) ServiceProvider.get(com.kwad.sdk.service.a.d.class);
            if (dVar != null) {
                dVar.gatherException(th);
            }
        }
    }
}
