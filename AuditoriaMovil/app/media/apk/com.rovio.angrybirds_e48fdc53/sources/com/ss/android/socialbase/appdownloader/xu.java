package com.ss.android.socialbase.appdownloader;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity;
import com.ss.android.socialbase.downloader.common.AppStatusManager;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import java.lang.ref.SoftReference;
import java.util.ArrayDeque;
import java.util.Queue;
/* loaded from: classes3.dex */
public class xu {
    private Handler bn;
    private final Queue<Integer> dr;
    private long g;
    private boolean ge;
    private long o;
    private SoftReference<JumpUnknownSourceActivity> q;
    private Runnable rb;

    private xu() {
        this.dr = new ArrayDeque();
        this.ge = false;
        this.bn = new Handler(Looper.getMainLooper());
        this.rb = new Runnable() { // from class: com.ss.android.socialbase.appdownloader.xu.1
            @Override // java.lang.Runnable
            public void run() {
                xu.this.o();
            }
        };
        AppStatusManager.getInstance().registerAppSwitchListener(new AppStatusManager.AppStatusChangeListener() { // from class: com.ss.android.socialbase.appdownloader.xu.2
            @Override // com.ss.android.socialbase.downloader.common.AppStatusManager.AppStatusChangeListener
            public void onAppForeground() {
                if (xu.this.dr.isEmpty()) {
                    return;
                }
                long optLong = DownloadSetting.obtainGlobal().optLong("install_on_resume_install_interval", 120000L);
                long currentTimeMillis = System.currentTimeMillis() - xu.this.g;
                if (currentTimeMillis < optLong) {
                    if (!xu.this.bn.hasCallbacks(xu.this.rb)) {
                        xu.this.bn.postDelayed(xu.this.rb, optLong - currentTimeMillis);
                        return;
                    }
                    return;
                }
                xu.this.g = System.currentTimeMillis();
                xu.this.o();
            }

            @Override // com.ss.android.socialbase.downloader.common.AppStatusManager.AppStatusChangeListener
            public void onAppBackground() {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        final Integer poll;
        if (Build.VERSION.SDK_INT >= 29 && !AppStatusManager.getInstance().isAppForeground()) {
            return;
        }
        synchronized (this.dr) {
            poll = this.dr.poll();
        }
        this.bn.removeCallbacks(this.rb);
        if (poll != null) {
            final Context appContext = DownloadComponentManager.getAppContext();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                ge(appContext, poll.intValue(), false);
            } else {
                this.bn.post(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.xu.3
                    @Override // java.lang.Runnable
                    public void run() {
                        xu.this.ge(appContext, poll.intValue(), false);
                    }
                });
            }
            this.bn.postDelayed(this.rb, 20000L);
            return;
        }
        this.ge = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dr(DownloadInfo downloadInfo, String str) {
        if (downloadInfo != null && !TextUtils.isEmpty(str)) {
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class dr {
        private static final xu dr = new xu();
    }

    public static xu dr() {
        return dr.dr;
    }

    public int dr(final Context context, final int i, final boolean z) {
        if (z) {
            return ge(context, i, z);
        }
        if (g()) {
            this.bn.postDelayed(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.xu.4
                @Override // java.lang.Runnable
                public void run() {
                    xu.this.dr(context, i, z);
                }
            }, 1000L);
            return 1;
        } else if (AppStatusManager.getInstance().isAppForeground()) {
            Logger.i("leaves", "on Foreground");
            return ge(context, i, z);
        } else if (ge.dr()) {
            return 1;
        } else {
            boolean z2 = Build.VERSION.SDK_INT < 29;
            if (this.dr.isEmpty() && !this.ge && z2) {
                return ge(context, i, z);
            }
            int optInt = DownloadSetting.obtainGlobal().optInt("install_queue_size", 3);
            synchronized (this.dr) {
                while (this.dr.size() > optInt) {
                    this.dr.poll();
                }
            }
            if (z2) {
                this.bn.removeCallbacks(this.rb);
                this.bn.postDelayed(this.rb, DownloadSetting.obtain(i).optLong("install_queue_timeout", 20000L));
            }
            synchronized (this.dr) {
                if (!this.dr.contains(Integer.valueOf(i))) {
                    this.dr.offer(Integer.valueOf(i));
                }
            }
            return 1;
        }
    }

    private boolean g() {
        return System.currentTimeMillis() - this.o < 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int ge(Context context, int i, boolean z) {
        int ge = o.ge(context, i, z);
        if (ge == 1) {
            this.ge = true;
        }
        this.o = System.currentTimeMillis();
        return ge;
    }

    public void dr(JumpUnknownSourceActivity jumpUnknownSourceActivity) {
        this.q = new SoftReference<>(jumpUnknownSourceActivity);
    }

    public JumpUnknownSourceActivity ge() {
        SoftReference<JumpUnknownSourceActivity> softReference = this.q;
        JumpUnknownSourceActivity jumpUnknownSourceActivity = softReference == null ? null : softReference.get();
        this.q = null;
        return jumpUnknownSourceActivity;
    }
}
