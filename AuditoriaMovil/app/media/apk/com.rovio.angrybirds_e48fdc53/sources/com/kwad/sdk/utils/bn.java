package com.kwad.sdk.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
/* loaded from: classes3.dex */
public final class bn extends Handler {
    private WeakReference<a> aKC;

    /* loaded from: classes3.dex */
    public interface a {
        void a(Message message);
    }

    public bn(a aVar) {
        this.aKC = new WeakReference<>(aVar);
    }

    public bn(a aVar, Looper looper) {
        super(looper);
        this.aKC = new WeakReference<>(aVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference<a> weakReference;
        a aVar;
        try {
            weakReference = this.aKC;
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            return;
        }
        aVar.a(message);
        super.handleMessage(message);
    }
}
