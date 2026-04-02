package com.amazon.aps.iva.nc;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: ResourceRecycler.java */
/* loaded from: classes.dex */
public final class z {
    public boolean a;
    public final Handler b = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: ResourceRecycler.java */
    /* loaded from: classes.dex */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((w) message.obj).b();
                return true;
            }
            return false;
        }
    }

    public final synchronized void a(w<?> wVar, boolean z) {
        if (!this.a && !z) {
            this.a = true;
            wVar.b();
            this.a = false;
        }
        this.b.obtainMessage(1, wVar).sendToTarget();
    }
}
