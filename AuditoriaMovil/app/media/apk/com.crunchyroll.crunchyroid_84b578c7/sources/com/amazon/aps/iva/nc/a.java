package com.amazon.aps.iva.nc;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
/* compiled from: ActiveResources.java */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* compiled from: ActiveResources.java */
    /* renamed from: com.amazon.aps.iva.nc.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0533a implements Runnable {
        public final /* synthetic */ Runnable b;

        public RunnableC0533a(Runnable runnable) {
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            this.b.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new RunnableC0533a(runnable), "glide-active-resources");
    }
}
