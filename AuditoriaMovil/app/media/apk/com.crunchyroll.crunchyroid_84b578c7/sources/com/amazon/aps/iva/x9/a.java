package com.amazon.aps.iva.x9;

import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.ListenableFuture;
/* compiled from: ConstraintTrackingWorker.java */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ ListenableFuture b;
    public final /* synthetic */ ConstraintTrackingWorker c;

    public a(ConstraintTrackingWorker constraintTrackingWorker, ListenableFuture listenableFuture) {
        this.c = constraintTrackingWorker;
        this.b = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.c.c) {
            if (this.c.d) {
                ConstraintTrackingWorker constraintTrackingWorker = this.c;
                constraintTrackingWorker.getClass();
                constraintTrackingWorker.e.h(new ListenableWorker.a.b());
            } else {
                this.c.e.j(this.b);
            }
        }
    }
}
