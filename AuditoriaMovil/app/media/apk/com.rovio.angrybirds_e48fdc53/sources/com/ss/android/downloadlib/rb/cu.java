package com.ss.android.downloadlib.rb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
/* loaded from: classes3.dex */
public class cu extends Handler {
    WeakReference<dr> dr;

    /* loaded from: classes3.dex */
    public interface dr {
        void dr(Message message);
    }

    public cu(Looper looper, dr drVar) {
        super(looper);
        this.dr = new WeakReference<>(drVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        dr drVar = this.dr.get();
        if (drVar != null && message != null) {
            drVar.dr(message);
        }
    }
}
