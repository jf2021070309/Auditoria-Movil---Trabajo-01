package com.ironsource.sdk.k;

import android.os.Handler;
import android.os.Message;
import com.ironsource.environment.a;
import com.ironsource.sdk.g.e;
import com.ironsource.sdk.utils.Logger;
/* loaded from: classes2.dex */
public final class a extends Handler {
    public c a;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.a == null) {
            Logger.i("DownloadHandler", "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            if (message.what == 1016) {
                this.a.a((com.ironsource.sdk.h.c) message.obj);
                return;
            }
            this.a.a((com.ironsource.sdk.h.c) message.obj, new e(message.what, a.AnonymousClass1.a(message.what)));
        } catch (Throwable th) {
            Logger.i("DownloadHandler", "handleMessage | Got exception: " + th.getMessage());
            th.printStackTrace();
        }
    }
}
