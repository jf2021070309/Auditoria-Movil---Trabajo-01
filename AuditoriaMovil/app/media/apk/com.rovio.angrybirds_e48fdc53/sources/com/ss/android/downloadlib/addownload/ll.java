package com.ss.android.downloadlib.addownload;

import com.ss.android.download.api.model.DownloadShortInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
/* loaded from: classes3.dex */
public class ll {
    public static int dr(int i, int i2) {
        if (i2 <= 0 || i2 >= 100 || !dr(i)) {
            return i2;
        }
        return (int) (Math.sqrt(i2) * 10.0d);
    }

    public static long dr(int i, long j, long j2) {
        if (!dr(i)) {
            return j;
        }
        if (j <= 0) {
            return 0L;
        }
        if (j2 <= 0) {
            return j;
        }
        return (j2 * dr(i, (int) ((j * 100) / j2))) / 100;
    }

    public static DownloadShortInfo dr(DownloadShortInfo downloadShortInfo) {
        if (downloadShortInfo == null || !dr((int) downloadShortInfo.id)) {
            return downloadShortInfo;
        }
        downloadShortInfo.currentBytes = dr((int) downloadShortInfo.id, downloadShortInfo.currentBytes, downloadShortInfo.totalBytes);
        return downloadShortInfo;
    }

    private static boolean dr(int i) {
        return DownloadSetting.obtain(i).optInt("pause_optimise_pretend_download_percent_switch", 0) == 1 && DownloadSetting.obtain(i).optInt("pause_optimise_switch", 0) == 1;
    }
}
