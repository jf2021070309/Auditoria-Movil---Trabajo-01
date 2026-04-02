package com.vungle.warren;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.vungle.warren.tasks.CacheBustJob;
import com.vungle.warren.tasks.CleanupJob;
import com.vungle.warren.tasks.JobRunner;
import com.vungle.warren.utility.ActivityManager;
/* loaded from: classes2.dex */
public class CacheBustManager implements CacheBustCallback {
    public static final String CACHE_BUST_INTERVAL = "cache_bust_interval";
    private static final int DEFAULT_REFRESH_RATE = 0;
    static final long MINIMUM_REFRESH_RATE = 900000;
    public static final String NEXT_CACHE_BUST = "next_cache_bust";
    public static final int NO_VALUE = Integer.MIN_VALUE;
    private boolean hasStopped;
    private JobRunner jobRunner;
    long refreshRate = 0;
    private long overrideRefreshRate = -2147483648L;

    /* JADX INFO: Access modifiers changed from: protected */
    public CacheBustManager(JobRunner jobRunner) {
        this.jobRunner = jobRunner;
        if (ActivityManager.getInstance().isInitialized()) {
            setLifecycleListener();
            return;
        }
        Log.e(CacheBustManager.class.getSimpleName(), "No lifecycle listener set");
        VungleLogger.error(CacheBustManager.class.getSimpleName() + "#deliverError", "No lifecycle listener set");
    }

    public void startBust() {
        if (this.refreshRate == 0) {
            this.jobRunner.execute(CacheBustJob.makeJobInfo());
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong(CACHE_BUST_INTERVAL, this.refreshRate);
        bundle.putLong(NEXT_CACHE_BUST, SystemClock.elapsedRealtime() + this.refreshRate);
        this.jobRunner.execute(CacheBustJob.makeJobInfo().setReschedulePolicy(this.refreshRate, 0).setExtras(bundle));
    }

    void overrideRefreshRate(long j) {
        this.overrideRefreshRate = j;
        this.refreshRate = j;
    }

    public void setRefreshRate(long j) {
        long j2 = this.overrideRefreshRate;
        if (j2 != -2147483648L) {
            this.refreshRate = j2;
        } else {
            this.refreshRate = j > 0 ? Math.max(j, 900000L) : 0L;
        }
    }

    @Override // com.vungle.warren.CacheBustCallback
    public void onCacheBust() {
        this.jobRunner.execute(CleanupJob.makeJobInfo());
    }

    private void setLifecycleListener() {
        ActivityManager.getInstance().addListener(new ActivityManager.LifeCycleCallback() { // from class: com.vungle.warren.CacheBustManager.1
            @Override // com.vungle.warren.utility.ActivityManager.LifeCycleCallback
            public void onStart() {
                super.onStart();
                if (!CacheBustManager.this.hasStopped || CacheBustManager.this.refreshRate == 0) {
                    return;
                }
                CacheBustManager.this.hasStopped = false;
                Bundle bundle = new Bundle();
                bundle.putLong(CacheBustManager.CACHE_BUST_INTERVAL, CacheBustManager.this.refreshRate);
                bundle.putLong(CacheBustManager.NEXT_CACHE_BUST, SystemClock.elapsedRealtime() + CacheBustManager.this.refreshRate);
                CacheBustManager.this.jobRunner.execute(CacheBustJob.makeJobInfo().setDelay(CacheBustManager.this.refreshRate).setReschedulePolicy(CacheBustManager.this.refreshRate, 0).setExtras(bundle));
            }

            @Override // com.vungle.warren.utility.ActivityManager.LifeCycleCallback
            public void onStop() {
                super.onStop();
                CacheBustManager.this.jobRunner.cancelPendingJob(CacheBustJob.TAG);
                CacheBustManager.this.hasStopped = true;
            }
        });
    }
}
