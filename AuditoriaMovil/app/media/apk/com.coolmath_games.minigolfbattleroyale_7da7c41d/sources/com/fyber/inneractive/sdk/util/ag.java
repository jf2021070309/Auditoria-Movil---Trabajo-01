package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class ag extends Handler {
    private final WeakReference<ah> a;

    public ag(Looper looper, ah ahVar) {
        super(looper);
        this.a = new WeakReference<>(ahVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        ah ahVar = (ah) q.a(this.a);
        if (ahVar != null) {
            ahVar.a(message);
        }
    }
}
