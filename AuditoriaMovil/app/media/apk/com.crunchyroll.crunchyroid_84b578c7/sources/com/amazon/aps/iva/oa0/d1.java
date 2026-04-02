package com.amazon.aps.iva.oa0;

import android.os.Handler;
import android.os.HandlerThread;
/* compiled from: SingularWorkerThread.java */
/* loaded from: classes4.dex */
public final class d1 extends HandlerThread {
    public Handler b;

    public final Handler a() {
        synchronized (this) {
            if (this.b == null) {
                this.b = new Handler(getLooper());
            }
        }
        return this.b;
    }
}
