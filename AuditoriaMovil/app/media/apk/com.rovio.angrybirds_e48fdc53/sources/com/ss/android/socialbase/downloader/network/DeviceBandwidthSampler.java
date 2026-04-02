package com.ss.android.socialbase.downloader.network;

import android.net.TrafficStats;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.thread.DownloadWatchDog;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes3.dex */
public class DeviceBandwidthSampler {
    public static volatile boolean isWifi;
    private long mLastTimeReading;
    private static final String TAG = DeviceBandwidthSampler.class.getSimpleName();
    private static long sPreviousBytes = -1;
    private static volatile DeviceBandwidthSampler instance = null;
    private final NetTrafficManager mNetTrafficManager = NetTrafficManager.getInstance();
    private final AtomicInteger mSamplingCounter = new AtomicInteger();
    private final SamplingHandler mHandler = new SamplingHandler(DownloadWatchDog.getThreadLooper());

    public static DeviceBandwidthSampler getInstance() {
        if (instance == null) {
            synchronized (DeviceBandwidthSampler.class) {
                if (instance == null) {
                    instance = new DeviceBandwidthSampler();
                }
            }
        }
        return instance;
    }

    private DeviceBandwidthSampler() {
    }

    public void startSampling() {
        try {
            String str = TAG;
            Logger.i(str, "startSampling: mSamplingCounter = " + this.mSamplingCounter);
            if (this.mSamplingCounter.getAndIncrement() == 0) {
                this.mHandler.startSamplingThread();
                this.mLastTimeReading = SystemClock.uptimeMillis();
            }
        } catch (Throwable th) {
        }
    }

    public void stopSampling() {
        try {
            String str = TAG;
            Logger.i(str, "stopSampling: mSamplingCounter = " + this.mSamplingCounter);
            if (this.mSamplingCounter.decrementAndGet() == 0) {
                this.mHandler.stopSamplingThread();
                addFinalSample();
            }
        } catch (Throwable th) {
        }
    }

    public static long getAllRxBytesWifi() {
        return TrafficStats.getTotalRxBytes() - TrafficStats.getMobileRxBytes();
    }

    public static void updateWifiStatus() {
        isWifi = DownloadUtils.isWifi(DownloadComponentManager.getAppContext());
    }

    protected void addSample() {
        long mobileRxBytes;
        try {
            updateWifiStatus();
            if (isWifi) {
                mobileRxBytes = getAllRxBytesWifi();
            } else {
                mobileRxBytes = TrafficStats.getMobileRxBytes();
            }
            long j = sPreviousBytes;
            long j2 = mobileRxBytes - j;
            if (j >= 0) {
                synchronized (this) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.mNetTrafficManager.addBandwidth(j2, uptimeMillis - this.mLastTimeReading);
                    this.mLastTimeReading = uptimeMillis;
                }
            }
            sPreviousBytes = mobileRxBytes;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void addFinalSample() {
        addSample();
        sPreviousBytes = -1L;
    }

    public boolean isSampling() {
        return this.mSamplingCounter.get() != 0;
    }

    /* loaded from: classes3.dex */
    private class SamplingHandler extends Handler {
        private static final int MSG_START = 1;
        static final long SAMPLE_TIME = 1000;

        public SamplingHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                DeviceBandwidthSampler.this.addSample();
                sendEmptyMessageDelayed(1, 1000L);
            }
        }

        public void startSamplingThread() {
            sendEmptyMessage(1);
        }

        public void stopSamplingThread() {
            removeMessages(1);
        }
    }
}
