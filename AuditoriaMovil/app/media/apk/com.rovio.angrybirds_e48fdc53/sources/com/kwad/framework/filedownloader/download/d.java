package com.kwad.framework.filedownloader.download;

import android.database.sqlite.SQLiteFullException;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.kwad.framework.filedownloader.exception.FileDownloadOutOfSpaceException;
import com.kwad.sdk.crash.utils.h;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes.dex */
public final class d implements Handler.Callback {
    private final com.kwad.framework.filedownloader.d.c acI;
    private volatile Thread ace;
    private final a adq;
    private final int adr;
    private final int ads;
    private final int adt;
    private long adu;
    private HandlerThread adv;
    private volatile boolean ady;
    private Handler handler;
    private volatile boolean adw = false;
    private volatile long adc = 0;
    private final AtomicLong adx = new AtomicLong();
    private boolean adz = true;
    private final com.kwad.framework.filedownloader.b.a acD = b.us().uu();

    /* loaded from: classes.dex */
    public static class a {
        private boolean adA;
        private Exception adB;
        private int adC;

        final void aX(boolean z) {
            this.adA = z;
        }

        final void bp(int i) {
            this.adC = i;
        }

        final void f(Exception exc) {
            this.adB = exc;
        }

        public final Exception getException() {
            return this.adB;
        }

        public final int te() {
            return this.adC;
        }

        public final boolean uU() {
            return this.adA;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(com.kwad.framework.filedownloader.d.c cVar, int i, int i2, int i3) {
        this.acI = cVar;
        this.ads = i2 < 5 ? 5 : i2;
        this.adt = i3;
        this.adq = new a();
        this.adr = i;
    }

    private boolean I(long j) {
        if (!this.adz) {
            return this.adu != -1 && this.adx.get() >= this.adu && j - this.adc >= ((long) this.ads);
        }
        this.adz = false;
        return true;
    }

    private void a(SQLiteFullException sQLiteFullException) {
        int id = this.acI.getId();
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "the data of the task[%d] is dirty, because the SQLite full exception[%s], so remove it from the database directly.", Integer.valueOf(id), sQLiteFullException.toString());
        }
        this.acI.bk(sQLiteFullException.toString());
        this.acI.d((byte) -1);
        this.acD.bi(id);
        this.acD.bh(id);
    }

    private void a(Exception exc, int i) {
        Exception d = d(exc);
        this.adq.f(d);
        this.adq.bp(this.adr - i);
        this.acI.d((byte) 5);
        this.acI.bk(d.toString());
        this.acD.a(this.acI.getId(), d);
        c((byte) 5);
    }

    private void b(long j, boolean z) {
        if (this.acI.vp() == this.acI.getTotal()) {
            this.acD.c(this.acI.getId(), this.acI.vp());
            return;
        }
        if (this.ady) {
            this.ady = false;
            this.acI.d((byte) 3);
        }
        if (z) {
            this.adc = j;
            c((byte) 3);
            this.adx.set(0L);
        }
    }

    private synchronized void b(Message message) {
        if (!this.adv.isAlive()) {
            if (com.kwad.framework.filedownloader.f.d.aeU) {
                com.kwad.framework.filedownloader.f.d.c(this, "require callback %d but the host thread of the flow has already dead, what is occurred because of there are several reason can final this flow on different thread.", Integer.valueOf(message.what));
            }
            return;
        }
        try {
            this.handler.sendMessage(message);
        } catch (IllegalStateException e) {
            if (this.adv.isAlive()) {
                throw e;
            }
            if (com.kwad.framework.filedownloader.f.d.aeU) {
                com.kwad.framework.filedownloader.f.d.c(this, "require callback %d but the host thread of the flow has already dead, what is occurred because of there are several reason can final this flow on different thread.", Integer.valueOf(message.what));
            }
        }
    }

    private void c(byte b) {
        if (b != -2) {
            com.kwad.framework.filedownloader.message.e.vj().s(com.kwad.framework.filedownloader.message.f.a(b, this.acI, this.adq));
        } else if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "High concurrent cause, Already paused and we don't need to call-back to Task in here, %d", Integer.valueOf(this.acI.getId()));
        }
    }

    private Exception d(Exception exc) {
        long length;
        String uH = this.acI.uH();
        if ((this.acI.isChunked() || com.kwad.framework.filedownloader.f.e.vR().afa) && (exc instanceof IOException) && new File(uH).exists()) {
            long availableBytes = h.getAvailableBytes(uH);
            if (availableBytes <= 4096) {
                File file = new File(uH);
                if (file.exists()) {
                    length = file.length();
                } else {
                    com.kwad.framework.filedownloader.f.d.a(this, exc, "Exception with: free space isn't enough, and the target file not exist.", new Object[0]);
                    length = 0;
                }
                return Build.VERSION.SDK_INT >= 9 ? new FileDownloadOutOfSpaceException(availableBytes, 4096L, length, exc) : new FileDownloadOutOfSpaceException(availableBytes, 4096L, length);
            }
            return exc;
        }
        return exc;
    }

    private void e(Exception exc) {
        Exception d = d(exc);
        if (!(d instanceof SQLiteFullException)) {
            try {
                this.acI.d((byte) -1);
                this.acI.bk(exc.toString());
                this.acD.a(this.acI.getId(), d, this.acI.vp());
            } catch (SQLiteFullException e) {
                d = e;
            }
            this.adq.f(d);
            c((byte) -1);
        }
        a((SQLiteFullException) d);
        this.adq.f(d);
        c((byte) -1);
    }

    private static long f(long j, long j2) {
        if (j2 <= 0) {
            return -1L;
        }
        if (j == -1) {
            return 1L;
        }
        long j3 = j / (j2 + 1);
        if (j3 <= 0) {
            return 1L;
        }
        return j3;
    }

    private void uQ() {
        String uH = this.acI.uH();
        String targetFilePath = this.acI.getTargetFilePath();
        File file = new File(uH);
        try {
            File file2 = new File(targetFilePath);
            if (file2.exists()) {
                long length = file2.length();
                if (!file2.delete()) {
                    throw new IOException(com.kwad.framework.filedownloader.f.f.b("Can't delete the old file([%s], [%d]), so can't replace it with the new downloaded one.", targetFilePath, Long.valueOf(length)));
                }
                com.kwad.framework.filedownloader.f.d.d(this, "The target file([%s], [%d]) will be replaced with the new downloaded file[%d]", targetFilePath, Long.valueOf(length), Long.valueOf(file.length()));
            }
            if (!file.renameTo(file2)) {
                throw new IOException(com.kwad.framework.filedownloader.f.f.b("Can't rename the  temp downloaded file(%s) to the target file(%s)", uH, targetFilePath));
            }
            if (!file.exists() || file.delete()) {
                return;
            }
            com.kwad.framework.filedownloader.f.d.d(this, "delete the temp file(%s) failed, on completed downloading.", uH);
        } catch (Throwable th) {
            if (file.exists() && !file.delete()) {
                com.kwad.framework.filedownloader.f.d.d(this, "delete the temp file(%s) failed, on completed downloading.", uH);
            }
            throw th;
        }
    }

    private void uR() {
        uQ();
        this.acI.d((byte) -3);
        this.acD.d(this.acI.getId(), this.acI.getTotal());
        this.acD.bh(this.acI.getId());
        c((byte) -3);
        if (com.kwad.framework.filedownloader.f.e.vR().afb) {
            com.kwad.framework.filedownloader.services.f.f(this.acI);
        }
    }

    private boolean uS() {
        if (this.acI.isChunked()) {
            com.kwad.framework.filedownloader.d.c cVar = this.acI;
            cVar.N(cVar.vp());
        } else if (this.acI.vp() != this.acI.getTotal()) {
            c(new FileDownloadGiveUpRetryException(com.kwad.framework.filedownloader.f.f.b("sofar[%d] not equal total[%d]", Long.valueOf(this.acI.vp()), Long.valueOf(this.acI.getTotal()))));
            return true;
        }
        return false;
    }

    private void uT() {
        this.acI.d((byte) -2);
        this.acD.e(this.acI.getId(), this.acI.vp());
        c((byte) -2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Exception exc, int i, long j) {
        this.adx.set(0L);
        this.acI.M(-j);
        Handler handler = this.handler;
        if (handler == null) {
            a(exc, i);
        } else {
            b(handler.obtainMessage(5, i, 0, exc));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z, long j, String str, String str2) {
        String vq = this.acI.vq();
        if (vq != null && !vq.equals(str)) {
            throw new IllegalArgumentException(com.kwad.framework.filedownloader.f.f.b("callback onConnected must with precondition succeed, but the etag is changes(%s != %s)", str, vq));
        }
        this.adq.aX(z);
        this.acI.d((byte) 2);
        this.acI.N(j);
        this.acI.bj(str);
        this.acI.bl(str2);
        this.acD.a(this.acI.getId(), j, str, str2);
        c((byte) 2);
        this.adu = f(j, this.adt);
        this.ady = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Exception exc) {
        e(exc);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[DONT_GENERATE] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            r0 = 1
            r4.adw = r0
            int r1 = r5.what
            r2 = 3
            r3 = 0
            if (r1 == r2) goto L17
            r2 = 5
            if (r1 == r2) goto Ld
            goto L1e
        Ld:
            java.lang.Object r1 = r5.obj     // Catch: java.lang.Throwable -> L2a
            java.lang.Exception r1 = (java.lang.Exception) r1     // Catch: java.lang.Throwable -> L2a
            int r5 = r5.arg1     // Catch: java.lang.Throwable -> L2a
            r4.a(r1, r5)     // Catch: java.lang.Throwable -> L2a
            goto L1e
        L17:
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L2a
            r4.b(r1, r0)     // Catch: java.lang.Throwable -> L2a
        L1e:
            r4.adw = r3
            java.lang.Thread r5 = r4.ace
            if (r5 == 0) goto L29
            java.lang.Thread r5 = r4.ace
            java.util.concurrent.locks.LockSupport.unpark(r5)
        L29:
            return r0
        L2a:
            r5 = move-exception
            r4.adw = r3
            java.lang.Thread r0 = r4.ace
            if (r0 == 0) goto L36
            java.lang.Thread r0 = r4.ace
            java.util.concurrent.locks.LockSupport.unpark(r0)
        L36:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.framework.filedownloader.download.d.handleMessage(android.os.Message):boolean");
    }

    public final boolean isAlive() {
        HandlerThread handlerThread = this.adv;
        return handlerThread != null && handlerThread.isAlive();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void onProgress(long j) {
        this.adx.addAndGet(j);
        this.acI.M(j);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean I = I(elapsedRealtime);
        Handler handler = this.handler;
        if (handler == null) {
            b(elapsedRealtime, I);
        } else if (I) {
            b(handler.obtainMessage(3));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void uK() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.adv.quit();
            this.ace = Thread.currentThread();
            while (this.adw) {
                LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(100L));
            }
            this.ace = null;
        }
    }

    public final void uL() {
        this.acI.d((byte) 1);
        this.acD.bj(this.acI.getId());
        c((byte) 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void uM() {
        this.acI.d((byte) 6);
        c((byte) 6);
        this.acD.be(this.acI.getId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void uN() {
        HandlerThread handlerThread = new HandlerThread("source-status-callback", 10);
        this.adv = handlerThread;
        handlerThread.start();
        this.handler = new Handler(this.adv.getLooper(), this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void uO() {
        uT();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void uP() {
        if (uS()) {
            return;
        }
        uR();
    }
}
