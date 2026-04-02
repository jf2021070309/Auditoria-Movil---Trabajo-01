package com.me.game.pmupdatesdk.utils;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes7.dex */
public final class CachedThreadPool {
    private static volatile CachedThreadPool mIns = null;
    private ExecutorService mCachedService;
    private ExecutorService mFixedService;
    private ExecutorService mScheduledService;
    private ExecutorService mSingleService;

    private CachedThreadPool() {
    }

    public static CachedThreadPool getIns() {
        if (mIns == null) {
            synchronized (CachedThreadPool.class) {
                if (mIns == null) {
                    mIns = new CachedThreadPool();
                }
            }
        }
        return mIns;
    }

    public void executeFixed(Runnable req) {
        if (this.mFixedService == null) {
            this.mFixedService = Executors.newFixedThreadPool(5);
        }
        this.mFixedService.execute(req);
    }

    public void executeCached(Runnable req) {
        if (this.mCachedService == null) {
            synchronized (this) {
                if (this.mCachedService == null) {
                    this.mCachedService = Executors.newCachedThreadPool();
                }
            }
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.mCachedService.execute(req);
        } else {
            req.run();
        }
    }

    public void executeScheduled(Runnable req) {
        if (this.mScheduledService == null) {
            this.mScheduledService = Executors.newScheduledThreadPool(5);
        }
        this.mScheduledService.execute(req);
    }

    public void executeSingle(Runnable req) {
        if (this.mSingleService == null) {
            this.mSingleService = Executors.newSingleThreadExecutor();
        }
        this.mSingleService.execute(req);
    }
}
