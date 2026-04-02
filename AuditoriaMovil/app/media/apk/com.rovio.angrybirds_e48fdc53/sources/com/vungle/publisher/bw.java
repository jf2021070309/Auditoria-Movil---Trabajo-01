package com.vungle.publisher;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.vungle.publisher.log.Logger;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class bw {
    @Inject
    zl a;
    private final a b;
    private final c c;
    private final c d;
    private final c e;
    private final BlockingQueue<Runnable> f = new PriorityBlockingQueue();

    /* loaded from: classes4.dex */
    public enum b {
        deviceId,
        databaseWrite,
        requestWillPlayAd,
        reportAd,
        reportInstall,
        requestLocalAd,
        prepareLocalAd,
        prepareLocalViewable,
        downloadLocalAd,
        requestConfig,
        unfilledAd,
        deleteExpiredAds,
        deleteInactivePlacements,
        otherTask,
        externalNetworkRequest,
        clientEvent,
        appFingerprint,
        reportExceptions,
        sleepWakeup
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Inject
    public bw() {
        HandlerThread handlerThread = new HandlerThread("VungleAsyncMasterThread");
        handlerThread.start();
        this.c = new c(2, 2, 30, new LinkedBlockingQueue(), "VungleAsyncClientEventThread-");
        this.c.allowCoreThreadTimeOut(true);
        this.d = new c(2, 2, 30, new LinkedBlockingQueue(), "VungleAsyncExternalNetworkRequestThread-");
        this.d.allowCoreThreadTimeOut(true);
        this.b = new a(handlerThread.getLooper());
        this.e = new c(2, 2, 30, this.f, "VungleAsyncMainThread-");
        this.e.allowCoreThreadTimeOut(true);
    }

    public void a(Runnable runnable) {
        a(runnable, b.otherTask);
    }

    public void a(Runnable runnable, b bVar) {
        this.b.sendMessage(b(runnable, bVar));
    }

    public void a(Runnable runnable, b bVar, long j) {
        b(runnable, bVar, j - this.a.a());
    }

    public void a(Runnable runnable, long j) {
        b(runnable, b.otherTask, j);
    }

    public void b(Runnable runnable, b bVar, long j) {
        Logger.d(Logger.ASYNC_TAG, "scheduling " + bVar + " delayed " + j + " ms");
        this.b.sendMessageDelayed(b(runnable, bVar), j);
    }

    public void b(Runnable runnable, long j) {
        a(runnable, b.otherTask, 0L, j);
    }

    public void a(Runnable runnable, b bVar, long j, long j2) {
        this.b.sendMessageDelayed(c(runnable, bVar, j2), j);
    }

    Message b(Runnable runnable, b bVar) {
        a aVar = this.b;
        int ordinal = bVar.ordinal();
        aVar.getClass();
        return aVar.obtainMessage(ordinal, new a.RunnableC0331a(aVar, runnable, bVar));
    }

    Message c(Runnable runnable, b bVar, long j) {
        a aVar = this.b;
        int ordinal = bVar.ordinal();
        aVar.getClass();
        return aVar.obtainMessage(ordinal, new a.RunnableC0331a(runnable, bVar, j));
    }

    public void a(b bVar) {
        this.b.removeMessages(bVar.ordinal());
    }

    /* loaded from: classes4.dex */
    class c extends ThreadPoolExecutor {
        c(int i, int i2, int i3, BlockingQueue<Runnable> blockingQueue, final String str) {
            super(i, i2, i3, TimeUnit.SECONDS, blockingQueue, new ThreadFactory() { // from class: com.vungle.publisher.bw.c.1
                int a = 0;

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    StringBuilder append = new StringBuilder().append(str);
                    int i4 = this.a;
                    this.a = i4 + 1;
                    String sb = append.append(i4).toString();
                    Logger.v(Logger.ASYNC_TAG, "starting " + sb);
                    return new Thread(runnable, sb);
                }
            });
            allowCoreThreadTimeOut(true);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        protected void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
            if (th != null) {
                Logger.e(Logger.ASYNC_TAG, "error after executing runnable", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            c cVar;
            Object obj = message.obj;
            if (obj == null || !(obj instanceof RunnableC0331a)) {
                Logger.w(Logger.ASYNC_TAG, "unhandled message " + message);
                return;
            }
            b bVar = ((RunnableC0331a) obj).d;
            if (bVar == null) {
                cVar = bw.this.e;
            } else {
                switch (bVar) {
                    case clientEvent:
                        cVar = bw.this.c;
                        break;
                    case externalNetworkRequest:
                        c unused = bw.this.d;
                    default:
                        cVar = bw.this.e;
                        break;
                }
            }
            Logger.d(Logger.ASYNC_TAG, "processing " + obj);
            Logger.v(Logger.ASYNC_TAG, cVar + ", max pool size " + cVar.getMaximumPoolSize() + ", largest pool size " + cVar.getLargestPoolSize());
            cVar.execute((Runnable) obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.vungle.publisher.bw$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class RunnableC0331a implements Comparable<RunnableC0331a>, Runnable {
            private final Runnable b;
            private final long c;
            private final b d;

            RunnableC0331a(a aVar, Runnable runnable, b bVar) {
                this(runnable, bVar, -1L);
            }

            RunnableC0331a(Runnable runnable, b bVar, long j) {
                this.b = runnable;
                this.c = j;
                this.d = bVar;
            }

            @Override // java.lang.Comparable
            /* renamed from: a */
            public int compareTo(RunnableC0331a runnableC0331a) {
                return this.d.compareTo(runnableC0331a.d);
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    try {
                        this.b.run();
                    } finally {
                        try {
                            if (this.c > 0) {
                                a.this.postDelayed(this, this.c);
                            }
                        } catch (Exception e) {
                            Logger.e(Logger.ASYNC_TAG, "error rescheduling " + this, e);
                        }
                    }
                } catch (Exception e2) {
                    Logger.e(Logger.ASYNC_TAG, "error executing " + this, e2);
                    try {
                        if (this.c > 0) {
                            a.this.postDelayed(this, this.c);
                        }
                    } catch (Exception e3) {
                        Logger.e(Logger.ASYNC_TAG, "error rescheduling " + this, e3);
                    }
                }
            }

            public boolean equals(Object obj) {
                return obj != null && (obj instanceof RunnableC0331a) && b((RunnableC0331a) obj);
            }

            public boolean b(RunnableC0331a runnableC0331a) {
                return this.b.equals(runnableC0331a.b);
            }

            public int hashCode() {
                return this.b.hashCode();
            }

            public String toString() {
                return "{PriorityRunnable:: taskType: " + this.d + ", repeatMillis: " + this.c + "}";
            }
        }
    }
}
