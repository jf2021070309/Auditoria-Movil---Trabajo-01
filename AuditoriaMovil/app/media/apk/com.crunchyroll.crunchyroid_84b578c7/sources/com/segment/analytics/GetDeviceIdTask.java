package com.segment.analytics;

import android.content.SharedPreferences;
import android.media.MediaDrm;
import android.os.Build;
import com.segment.analytics.AnalyticsContext;
import com.segment.analytics.internal.Utils;
import java.security.MessageDigest;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* loaded from: classes4.dex */
public class GetDeviceIdTask {
    private static final String DEVICE_ID_CACHE_KEY = "device.id";
    private final AnalyticsContext analyticsContext;
    private final ExecutorService executor = Executors.newFixedThreadPool(2);
    private final CountDownLatch latch;
    private final SharedPreferences segmentSharedPreference;

    public GetDeviceIdTask(AnalyticsContext analyticsContext, SharedPreferences sharedPreferences, CountDownLatch countDownLatch) {
        this.analyticsContext = analyticsContext;
        this.segmentSharedPreference = sharedPreferences;
        this.latch = countDownLatch;
    }

    private String byteArrayToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    private boolean cacheHit() {
        String string = this.segmentSharedPreference.getString(DEVICE_ID_CACHE_KEY, null);
        if (string != null) {
            updateDeviceId(string);
            return true;
        }
        return false;
    }

    private String getUniqueID() {
        MediaDrm mediaDrm;
        int i = Build.VERSION.SDK_INT;
        MediaDrm mediaDrm2 = null;
        try {
            mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
            try {
                byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(propertyByteArray);
                String byteArrayToHexString = byteArrayToHexString(messageDigest.digest());
                if (i >= 28) {
                    mediaDrm.release();
                } else {
                    mediaDrm.release();
                }
                return byteArrayToHexString;
            } catch (Exception unused) {
                if (mediaDrm != null) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        mediaDrm.release();
                    } else {
                        mediaDrm.release();
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                mediaDrm2 = mediaDrm;
                if (mediaDrm2 != null) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        mediaDrm2.release();
                    } else {
                        mediaDrm2.release();
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
            mediaDrm = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCache(String str) {
        SharedPreferences.Editor edit = this.segmentSharedPreference.edit();
        edit.putString(DEVICE_ID_CACHE_KEY, str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDeviceId(String str) {
        synchronized (this.analyticsContext) {
            if (!this.analyticsContext.containsKey("device")) {
                this.analyticsContext.put("device", (Object) new AnalyticsContext.Device());
            }
            ((AnalyticsContext.Device) this.analyticsContext.get("device")).put("id", (Object) str);
        }
    }

    public void execute() {
        if (cacheHit()) {
            return;
        }
        final Future<?> submit = this.executor.submit(new Runnable() { // from class: com.segment.analytics.GetDeviceIdTask.1
            @Override // java.lang.Runnable
            public void run() {
                String deviceId = GetDeviceIdTask.this.getDeviceId();
                if (!Thread.currentThread().isInterrupted()) {
                    GetDeviceIdTask.this.updateDeviceId(deviceId);
                    GetDeviceIdTask.this.updateCache(deviceId);
                }
            }
        });
        this.executor.execute(new Runnable() { // from class: com.segment.analytics.GetDeviceIdTask.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    submit.get(2L, TimeUnit.SECONDS);
                } catch (Exception unused) {
                    submit.cancel(true);
                    String uuid = UUID.randomUUID().toString();
                    GetDeviceIdTask.this.updateDeviceId(uuid);
                    GetDeviceIdTask.this.updateCache(uuid);
                }
                GetDeviceIdTask.this.latch.countDown();
                GetDeviceIdTask.this.executor.shutdownNow();
            }
        });
    }

    public String getDeviceId() {
        String uniqueID = getUniqueID();
        if (!Utils.isNullOrEmpty(uniqueID)) {
            return uniqueID;
        }
        return UUID.randomUUID().toString();
    }
}
