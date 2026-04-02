package com.kwad.sdk.core.videocache;

import com.kwad.sdk.utils.ao;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j {
    private final l awV;
    private final com.kwad.sdk.core.videocache.a awW;
    private volatile Thread axa;
    private volatile boolean kX;
    private final Object awX = new Object();
    private final Object awY = new Object();
    private volatile int axb = -1;
    private final AtomicInteger awZ = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        private a() {
        }

        /* synthetic */ a(j jVar, byte b) {
            this();
        }

        @Override // java.lang.Runnable
        public final void run() {
            j.this.DN();
        }
    }

    public j(l lVar, com.kwad.sdk.core.videocache.a aVar) {
        this.awV = (l) ao.checkNotNull(lVar);
        this.awW = (com.kwad.sdk.core.videocache.a) ao.checkNotNull(aVar);
    }

    private void DK() {
        int i = this.awZ.get();
        if (i <= 0) {
            return;
        }
        this.awZ.set(0);
        throw new ProxyCacheException("Error reading source " + i + " times");
    }

    private synchronized void DL() {
        boolean z = (this.axa == null || this.axa.getState() == Thread.State.TERMINATED) ? false : true;
        if (!this.kX && !this.awW.isCompleted() && !z) {
            a aVar = new a(this, (byte) 0);
            this.axa = new Thread(aVar, "Source reader for " + this.awV);
            this.axa.start();
        }
    }

    private void DM() {
        synchronized (this.awX) {
            try {
                try {
                    this.awX.wait(1000L);
                } catch (InterruptedException e) {
                    throw new ProxyCacheException("Waiting source data is interrupted!", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        r2 = r2 + r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void DN() {
        /*
            r8 = this;
            r0 = -1
            r2 = 0
            com.kwad.sdk.core.videocache.a r4 = r8.awW     // Catch: java.lang.Throwable -> L49
            long r2 = r4.DA()     // Catch: java.lang.Throwable -> L49
            com.kwad.sdk.core.videocache.l r4 = r8.awV     // Catch: java.lang.Throwable -> L49
            r4.ah(r2)     // Catch: java.lang.Throwable -> L49
            com.kwad.sdk.core.videocache.l r4 = r8.awV     // Catch: java.lang.Throwable -> L49
            long r0 = r4.length()     // Catch: java.lang.Throwable -> L49
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L49
        L19:
            com.kwad.sdk.core.videocache.l r5 = r8.awV     // Catch: java.lang.Throwable -> L49
            int r5 = r5.read(r4)     // Catch: java.lang.Throwable -> L49
            r6 = -1
            if (r5 == r6) goto L42
            java.lang.Object r6 = r8.awY     // Catch: java.lang.Throwable -> L49
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L49
            boolean r7 = r8.isStopped()     // Catch: java.lang.Throwable -> L3f
            if (r7 == 0) goto L33
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3f
        L2c:
            r8.DP()
            r8.h(r2, r0)
            return
        L33:
            com.kwad.sdk.core.videocache.a r7 = r8.awW     // Catch: java.lang.Throwable -> L3f
            r7.d(r4, r5)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3f
            long r5 = (long) r5
            long r2 = r2 + r5
            r8.h(r2, r0)     // Catch: java.lang.Throwable -> L49
            goto L19
        L3f:
            r4 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3f
            throw r4     // Catch: java.lang.Throwable -> L49
        L42:
            r8.tryComplete()     // Catch: java.lang.Throwable -> L49
            r8.DO()     // Catch: java.lang.Throwable -> L49
            goto L2c
        L49:
            r4 = move-exception
            java.util.concurrent.atomic.AtomicInteger r5 = r8.awZ     // Catch: java.lang.Throwable -> L53
            r5.incrementAndGet()     // Catch: java.lang.Throwable -> L53
            onError(r4)     // Catch: java.lang.Throwable -> L53
            goto L2c
        L53:
            r4 = move-exception
            r8.DP()
            r8.h(r2, r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.core.videocache.j.DN():void");
    }

    private void DO() {
        this.axb = 100;
        cz(this.axb);
    }

    private void DP() {
        try {
            this.awV.close();
        } catch (ProxyCacheException e) {
            onError(new ProxyCacheException("Error closing source " + this.awV, e));
        }
    }

    private void h(long j, long j2) {
        i(j, j2);
        synchronized (this.awX) {
            this.awX.notifyAll();
        }
    }

    private void i(long j, long j2) {
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        int i2 = i == 0 ? 100 : (int) ((((float) j) / ((float) j2)) * 100.0f);
        boolean z = i2 != this.axb;
        if ((i >= 0) && z) {
            cz(i2);
        }
        this.axb = i2;
    }

    private boolean isStopped() {
        return Thread.currentThread().isInterrupted() || this.kX;
    }

    private static void onError(Throwable th) {
        if (th instanceof InterruptedProxyCacheException) {
            com.kwad.sdk.core.e.c.d("ProxyCache", "ProxyCache is interrupted");
        } else {
            com.kwad.sdk.core.e.c.e("ProxyCache", "ProxyCache error");
        }
    }

    private void tryComplete() {
        synchronized (this.awY) {
            if (!isStopped() && this.awW.DA() == this.awV.length()) {
                this.awW.complete();
            }
        }
    }

    public final int a(byte[] bArr, long j, int i) {
        k.b(bArr, j, 8192);
        while (!this.awW.isCompleted() && this.awW.DA() < 8192 + j && !this.kX) {
            DL();
            DM();
            DK();
        }
        int a2 = this.awW.a(bArr, j, 8192);
        if (this.awW.isCompleted() && this.axb != 100) {
            this.axb = 100;
            cz(100);
        }
        return a2;
    }

    protected void cz(int i) {
    }

    public final void shutdown() {
        synchronized (this.awY) {
            com.kwad.sdk.core.e.c.d("ProxyCache", "Shutdown proxy for " + this.awV);
            try {
                this.kX = true;
                if (this.axa != null) {
                    this.axa.interrupt();
                }
                this.awW.close();
            } catch (ProxyCacheException e) {
                onError(e);
            }
        }
    }
}
