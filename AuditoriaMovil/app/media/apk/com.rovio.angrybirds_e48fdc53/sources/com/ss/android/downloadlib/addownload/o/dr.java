package com.ss.android.downloadlib.addownload.o;

import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.downloadlib.rb.t;
import com.ss.android.downloadlib.rb.yk;
import com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceCallback;
import com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceHandler;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
/* loaded from: classes3.dex */
public class dr implements IDownloadDiskSpaceHandler {
    private int dr;

    public void dr(int i) {
        this.dr = i;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceHandler
    public boolean cleanUpDisk(long j, long j2, IDownloadDiskSpaceCallback iDownloadDiskSpaceCallback) {
        long j3;
        DownloadSetting obtain = DownloadSetting.obtain(this.dr);
        if (dr(obtain)) {
            long currentTimeMillis = System.currentTimeMillis();
            g.dr().o();
            long dr = yk.dr(0L);
            dr();
            long dr2 = yk.dr(0L);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (dr2 >= j2) {
                j3 = 0;
            } else {
                long ge = ge(obtain);
                if (ge <= 0) {
                    j3 = ge;
                } else {
                    dr2 = yk.dr(0L);
                    j3 = ge;
                }
            }
            t.ge("AppDownloadDiskSpaceHandler", "cleanUpDisk, byteRequired = " + j2 + ", byteAvailableAfter = " + dr2 + ", cleaned = " + (dr2 - dr), null);
            dr(dr, dr2, j2, currentTimeMillis2, j3);
            if (dr2 < j2) {
                return false;
            }
            if (iDownloadDiskSpaceCallback != null) {
                iDownloadDiskSpaceCallback.onDiskCleaned();
                return true;
            }
            return true;
        }
        return false;
    }

    private boolean dr(DownloadSetting downloadSetting) {
        if (downloadSetting.optInt("clear_space_use_disk_handler", 0) != 1) {
            return false;
        }
        return System.currentTimeMillis() - g.dr().ge() >= downloadSetting.optLong("clear_space_min_time_interval", TTAdConstant.AD_MAX_EVENT_TIME);
    }

    private void dr() {
        com.ss.android.download.api.config.q il = wb.il();
        if (il != null) {
            il.dr();
        }
        o.dr();
        o.ge();
    }

    private long ge(DownloadSetting downloadSetting) {
        long optLong = downloadSetting.optLong("clear_space_sleep_time", 0L);
        if (optLong <= 0) {
            return 0L;
        }
        if (optLong > PushUIConfig.dismissTime) {
            optLong = 5000;
        }
        t.ge("AppDownloadDiskSpaceHandler", "waiting for space clear, sleepTime = " + optLong, null);
        try {
            Thread.sleep(optLong);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.ge("AppDownloadDiskSpaceHandler", "waiting end!", null);
        return optLong;
    }

    private void dr(long j, long j2, long j3, long j4, long j5) {
        boolean z;
        DownloadInfo downloadInfo = Downloader.getInstance(wb.getContext()).getDownloadInfo(this.dr);
        if (downloadInfo == null) {
            return;
        }
        if (j2 <= j3) {
            z = false;
        } else {
            z = true;
        }
        try {
            com.ss.android.downloadlib.dr.dr().dr(downloadInfo, j, j2, j3, j4, j5, z);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
