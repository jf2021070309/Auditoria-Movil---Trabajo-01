package com.ss.android.downloadlib;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Environment;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.kwad.library.solder.lib.ext.PluginError;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.downloadlib.addownload.ge.g;
import com.ss.android.downloadlib.addownload.ge.ll;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.downloadlib.rb.yk;
import com.ss.android.socialbase.appdownloader.ge;
import com.ss.android.socialbase.downloader.common.AppStatusManager;
import com.ss.android.socialbase.downloader.constants.DownloadStatus;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.ss.android.socialbase.downloader.depend.IOpenInstallerListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.network.NetTrafficManager;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationManager;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class dr implements com.ss.android.downloadad.api.dr, ge.o, AppStatusManager.AppStatusChangeListener, IOpenInstallerListener {
    private static String dr = dr.class.getSimpleName();
    private static volatile dr g;
    private long ge;
    private ge o;

    private dr() {
        com.ss.android.socialbase.appdownloader.ge.dr(this);
        AppStatusManager.getInstance().registerAppSwitchListener(this);
    }

    public static dr dr() {
        if (g == null) {
            synchronized (dr.class) {
                if (g == null) {
                    g = new dr();
                }
            }
        }
        return g;
    }

    public static synchronized void dr(DownloadInfo downloadInfo, com.ss.android.downloadad.api.dr.ge geVar) {
        synchronized (dr.class) {
            if (downloadInfo == null) {
                com.ss.android.downloadlib.q.o.dr().dr("onDownloadFinish info null");
            } else if (geVar == null) {
                com.ss.android.downloadlib.q.o.dr().dr("onDownloadFinish nativeModel null");
            } else if (geVar.f() != 1) {
            } else {
                com.ss.android.downloadlib.o.xu.dr().g(geVar);
                String o2 = o(downloadInfo, geVar);
                com.ss.android.downloadlib.addownload.ge.bn.dr().ge(downloadInfo.getUrl(), o2);
                Map<Long, com.ss.android.downloadad.api.dr.ge> dr2 = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(downloadInfo.getUrl(), o2);
                geVar.bn(System.currentTimeMillis());
                geVar.q(2);
                geVar.ge(o2);
                dr2.put(Long.valueOf(geVar.ge()), geVar);
                ll.dr().dr(dr2.values());
                ge(geVar);
                rb.dr().dr(downloadInfo, o2);
                if (AdBaseConstants.MIME_APK.equals(downloadInfo.getMimeType())) {
                    dr().dr(geVar);
                    dr().ge(downloadInfo, geVar);
                    if (geVar.xq()) {
                        com.ss.android.downloadlib.addownload.dr.dr.dr().dr(downloadInfo.getId(), geVar.ge(), geVar.yk(), o2, downloadInfo.getTitle(), geVar.g(), downloadInfo.getTargetFilePath());
                    }
                    com.ss.android.downloadlib.addownload.q.dr.dr(downloadInfo, geVar.ge(), geVar.g(), o2);
                }
            }
        }
    }

    public synchronized void dr(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (yk.dr()) {
            throw new RuntimeException("handleAppInstalled in main thread.");
        }
        final com.ss.android.downloadad.api.dr.ge dr2 = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(str);
        if (dr2 == null) {
            com.ss.android.downloadlib.addownload.ge.g.dr().dr(str);
            return;
        }
        com.ss.android.downloadlib.addownload.q dr3 = rb.dr().dr(dr2.dr());
        if (dr3 != null) {
            dr3.bn();
        }
        if (dr2.o.get()) {
            return;
        }
        if (DownloadSetting.obtain(dr2.i()).optInt("notification_opt_2") == 1) {
            DownloadNotificationManager.getInstance().cancelNotification(dr2.i());
        }
        new com.ss.android.downloadlib.ge.ge().dr(dr2, new com.ss.android.downloadlib.ge.rb() { // from class: com.ss.android.downloadlib.dr.1
            @Override // com.ss.android.downloadlib.ge.rb
            public void dr(boolean z) {
                String str2 = dr.dr;
                Logger.d(str2, "appBackForeground->" + z);
                if (z) {
                    boolean z2 = false;
                    if (com.ss.android.downloadlib.ge.bn.o(dr2)) {
                        z2 = com.ss.android.downloadlib.ge.dr.dr(str, dr2);
                    }
                    if (!z2 && com.ss.android.downloadlib.ge.bn.g(dr2) && dr2.ux() == 4) {
                        com.ss.android.downloadlib.addownload.dr.dr.dr().dr(dr2);
                    }
                } else if (!com.ss.android.downloadlib.ge.dr.dr(str, dr2) && dr2.ux() == 4) {
                    com.ss.android.downloadlib.addownload.dr.dr.dr().dr(dr2);
                }
            }
        }, com.ss.android.downloadlib.rb.q.dr(dr2).optInt("try_applink_delay_after_installed", 0));
        com.ss.android.downloadlib.o.xu.dr().bn(dr2);
        dr(str, dr2);
        com.ss.android.downloadlib.addownload.dr.dr.dr().ge(str);
        DownloadInfo dr4 = dr(Downloader.getInstance(wb.getContext()).getSuccessedDownloadInfosWithMimeType(AdBaseConstants.MIME_APK), str);
        if (dr4 != null) {
            if (DownloadSetting.obtain(dr4.getId()).optInt(DownloadSettingKeys.NO_HIDE_NOTIFICATION) != 1) {
                DownloadNotificationManager.getInstance().hideNotification(dr4.getId());
            }
            rb.dr().ge(dr4, str);
            com.ss.android.downloadlib.addownload.o.g.dr(dr4);
        } else {
            rb.dr().ge(null, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dr(DownloadInfo downloadInfo, com.ss.android.downloadad.api.dr.ge geVar, int i) {
        long max;
        if (downloadInfo == null || geVar == null) {
            return;
        }
        ge();
        long currentTimeMillis = System.currentTimeMillis();
        geVar.ge(currentTimeMillis);
        geVar.rb(yk.dr(Environment.getDataDirectory(), -1L));
        if (i != 2000) {
            max = 2000;
        } else {
            long optLong = DownloadSetting.obtain(downloadInfo.getId()).optLong("check_install_failed_delay_time", 120000L);
            if (optLong < 0) {
                return;
            }
            max = Math.max(optLong, 30000L);
        }
        ge geVar2 = new ge(geVar.ge(), downloadInfo.getId(), currentTimeMillis, i);
        g.dr().dr(geVar2, max);
        this.o = geVar2;
        ll.dr().dr(geVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class ge implements Runnable {
        private long dr;
        private int g;
        private int ge;
        private long o;
        private long q;

        private ge(long j, int i, long j2, int i2) {
            this.dr = j;
            this.ge = i;
            this.o = j2;
            this.g = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ge() {
            this.q = System.currentTimeMillis();
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (dr()) {
                    dr.dr().dr(this.dr, this.ge);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
            if (r9 < r1) goto L18;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        boolean dr() {
            /*
                Method dump skipped, instructions count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.dr.ge.dr():boolean");
        }

        private int dr(boolean z, com.ss.android.downloadad.api.dr.ge geVar, DownloadInfo downloadInfo, boolean z2, JSONObject jSONObject) {
            DownloadSetting obtain = DownloadSetting.obtain(downloadInfo.getId());
            int i = 1;
            if (obtain.optInt("install_failed_check_ttmd5", 1) == 1) {
                int checkMd5Status = downloadInfo.checkMd5Status();
                try {
                    jSONObject.put("ttmd5_status", checkMd5Status);
                } catch (Throwable th) {
                }
                if (!DownloadUtils.isMd5Valid(checkMd5Status)) {
                    return PluginError.ERROR_UPD_CAPACITY;
                }
            }
            int i2 = this.g;
            if (i2 != 2000) {
                return i2;
            }
            if (obtain.optInt("install_failed_check_signature", 1) == 1 && yk.g(wb.getContext(), geVar.q())) {
                if (!yk.dr(yk.xu(wb.getContext(), downloadInfo.getTargetFilePath()), yk.rb(wb.getContext(), geVar.q()))) {
                    return PluginError.ERROR_UPD_REQUEST;
                }
            }
            if (!z) {
                return 2002;
            }
            long j = this.q;
            long j2 = this.o;
            if (j > j2) {
                try {
                    jSONObject.put("install_time", j - j2);
                    if (geVar.e() <= this.o) {
                        i = 0;
                    }
                    jSONObject.put("install_again", i);
                } catch (Throwable th2) {
                }
                if (!z2) {
                    return 2003;
                }
                return PluginError.ERROR_UPD_EXTRACT;
            }
            return 2000;
        }
    }

    public void dr(final long j, int i) {
        long optLong = DownloadSetting.obtain(i).optLong("check_install_finish_hijack_delay_time", 900000L);
        if (optLong < 0) {
            return;
        }
        g.dr().dr(new Runnable() { // from class: com.ss.android.downloadlib.dr.2
            @Override // java.lang.Runnable
            public void run() {
                dr.dr().dr(j);
            }
        }, Math.max(optLong, 300000L));
    }

    public void dr(long j) {
        g.dr dr2;
        int i;
        try {
            com.ss.android.downloadad.api.dr.ge g2 = com.ss.android.downloadlib.addownload.ge.bn.dr().g(j);
            if (g2 != null && !yk.ge(g2) && !g2.o.get()) {
                Pair<g.dr, Integer> ge2 = com.ss.android.downloadlib.addownload.ge.g.dr().ge(g2);
                if (ge2 != null) {
                    dr2 = (g.dr) ge2.first;
                    i = ((Integer) ge2.second).intValue();
                } else {
                    dr2 = com.ss.android.downloadlib.addownload.ge.g.dr().dr(g2);
                    i = -1;
                }
                if (dr2 == null) {
                    return;
                }
                com.ss.android.downloadlib.addownload.ge.g.dr().ge(dr2.dr);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("installed_app_name", dr2.g);
                jSONObject.put("installed_pkg_name", dr2.dr);
                if (i != -1) {
                    jSONObject.put("error_code", i);
                    com.ss.android.downloadlib.rb.bn.dr(jSONObject, g2.i());
                    com.ss.android.downloadlib.g.dr.dr().ge("install_finish_hijack", jSONObject, g2);
                    return;
                }
                com.ss.android.downloadlib.g.dr.dr().ge("install_finish_may_hijack", jSONObject, g2);
            }
        } catch (Throwable th) {
            com.ss.android.downloadlib.q.o.dr().dr(th, "trySendInstallFinishHijack");
        }
    }

    public void dr(String str, com.ss.android.downloadad.api.dr.ge geVar) {
        if (geVar != null && yk.ge(geVar) && geVar.o.compareAndSet(false, true)) {
            com.ss.android.downloadlib.g.dr.dr().dr(geVar.wb(), "install_finish", dr(geVar, str, geVar.ux() != 4 ? 3 : 4), geVar);
            ll.dr().dr(geVar);
        }
    }

    private static DownloadInfo dr(List<DownloadInfo> list, String str) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        for (DownloadInfo downloadInfo : list) {
            if (downloadInfo != null) {
                if (str.equals(downloadInfo.getPackageName())) {
                    return downloadInfo;
                }
                if (yk.dr(wb.getContext(), downloadInfo.getTargetFilePath(), str)) {
                    return downloadInfo;
                }
            }
        }
        return null;
    }

    public static JSONObject dr(JSONObject jSONObject, DownloadInfo downloadInfo) {
        if (jSONObject == null || downloadInfo == null) {
            return jSONObject;
        }
        int i = 1;
        if (DownloadSetting.obtain(downloadInfo.getId()).optInt("download_event_opt", 1) == 0) {
            return jSONObject;
        }
        try {
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_ID, downloadInfo.getId());
            jSONObject.put("name", downloadInfo.getName());
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_CUR_BYTES, downloadInfo.getCurBytes());
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_TOTAL_BYTES, downloadInfo.getTotalBytes());
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_NETWORK_QUALITY, downloadInfo.getNetworkQuality());
            jSONObject.put(MonitorConstants.EXTRA_CUR_NETWORK_QUALITY, NetTrafficManager.getInstance().getCurrentNetworkQuality().name());
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_ONLY_WIFI, downloadInfo.isOnlyWifi() ? 1 : 0);
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_NEED_HTTPS_DEGRADE, downloadInfo.isNeedHttpsToHttpRetry() ? 1 : 0);
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_HTTPS_DEGRADE_RETRY_USED, downloadInfo.isHttpsToHttpRetryUsed() ? 1 : 0);
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_CHUNK_COUNT, downloadInfo.getChunkCount());
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_RETRY_COUNT, downloadInfo.getRetryCount());
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_CUR_RETRY_TIME, downloadInfo.getCurRetryTime());
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_NEED_RETRY_DELAY, downloadInfo.isNeedRetryDelay() ? 1 : 0);
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_BACKUP_URL_USED, downloadInfo.isBackUpUrlUsed() ? 1 : 0);
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_HEAD_CONNECTION_ERROR_MSG, downloadInfo.getHeadConnectionException() != null ? downloadInfo.getHeadConnectionException() : "");
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_NEED_INDEPENDENT_PROCESS, downloadInfo.isNeedIndependentProcess() ? 1 : 0);
            jSONObject.put(MonitorConstants.EXTRA_TOTAL_RETRY_COUNT, downloadInfo.getTotalRetryCount());
            jSONObject.put(MonitorConstants.EXTRA_CUR_RETRY_TIME_IN_TOTAL, downloadInfo.getCurRetryTimeInTotal());
            jSONObject.put(MonitorConstants.EXTRA_REAL_DOWNLOAD_TIME, downloadInfo.getRealDownloadTime());
            jSONObject.put("first_speed_time", downloadInfo.getFirstSpeedTime());
            jSONObject.put("all_connect_time", downloadInfo.getAllConnectTime());
            jSONObject.put("download_prepare_time", downloadInfo.getDownloadPrepareTime());
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_TIME, downloadInfo.getRealDownloadTime() + downloadInfo.getAllConnectTime() + downloadInfo.getDownloadPrepareTime());
            jSONObject.put(MonitorConstants.EXTRA_CHUNK_DOWNGRADE_UESD, downloadInfo.isChunkDowngradeRetryUsed() ? 1 : 0);
            jSONObject.put(MonitorConstants.EXTRA_NEED_CHUNK_DOWNGRADE_RETRY, downloadInfo.isNeedChunkDowngradeRetry() ? 1 : 0);
            jSONObject.put("failed_resume_count", downloadInfo.getFailedResumeCount());
            jSONObject.put(MonitorConstants.EXTRA_PRECONNECT_LEVEL, downloadInfo.getPreconnectLevel());
            jSONObject.put("md5", downloadInfo.getMd5());
            jSONObject.put("expect_file_length", downloadInfo.getExpectFileLength());
            jSONObject.put("retry_schedule_count", downloadInfo.getRetryScheduleCount());
            jSONObject.put("rw_concurrent", downloadInfo.isRwConcurrent() ? 1 : 0);
            double curBytes = downloadInfo.getCurBytes() / 1048576.0d;
            double realDownloadTime = downloadInfo.getRealDownloadTime() / 1000.0d;
            if (curBytes > PangleAdapterUtils.CPM_DEFLAUT_VALUE && realDownloadTime > PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                double d = curBytes / realDownloadTime;
                try {
                    jSONObject.put(MonitorConstants.DOWNLOAD_SPEED, d);
                } catch (Exception e) {
                }
                String str = dr;
                Logger.d(str, "download speed : " + d + "MB/s");
            }
            try {
                jSONObject.put("is_download_service_foreground", Downloader.getInstance(wb.getContext()).isDownloadServiceForeground(downloadInfo.getId()) ? 1 : 0);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (downloadInfo.getBackUpUrls() != null) {
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_BACKUP_URL_COUNT, downloadInfo.getBackUpUrls().size());
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_CUR_BACKUP_URL_INDEX, downloadInfo.getCurBackUpUrlIndex());
            }
            jSONObject.put("clear_space_restart_times", com.ss.android.downloadlib.addownload.o.g.dr().ge(downloadInfo.getUrl()));
            jSONObject.put("mime_type", downloadInfo.getMimeType());
            if (!DownloadUtils.isNetworkConnected(wb.getContext())) {
                i = 2;
            }
            jSONObject.put("network_available", i);
            jSONObject.put(MonitorConstants.STATUS_CODE, downloadInfo.getHttpStatusCode());
            ge(jSONObject, downloadInfo);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public static JSONObject ge(JSONObject jSONObject, DownloadInfo downloadInfo) {
        if (jSONObject == null || downloadInfo == null) {
            return jSONObject;
        }
        if (DownloadSetting.obtain(downloadInfo.getId()).optInt("download_event_opt", 1) == 0) {
            return jSONObject;
        }
        try {
            long dr2 = yk.dr(0L);
            double d = dr2;
            jSONObject.put("available_space", d / 1048576.0d);
            long totalBytes = downloadInfo.getTotalBytes();
            double d2 = totalBytes;
            jSONObject.put("apk_size", d2 / 1048576.0d);
            if (dr2 > 0 && totalBytes > 0) {
                jSONObject.put("available_space_ratio", d / d2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public void ge(DownloadInfo downloadInfo, final com.ss.android.downloadad.api.dr.ge geVar) {
        if (downloadInfo == null || geVar == null || DownloadSetting.obtain(downloadInfo.getId()).optInt("install_finish_check_ttmd5", 1) == 0) {
            return;
        }
        final String targetFilePath = downloadInfo.getTargetFilePath();
        if (TextUtils.isEmpty(targetFilePath)) {
            return;
        }
        g.dr().ge(new Runnable() { // from class: com.ss.android.downloadlib.dr.3
            @Override // java.lang.Runnable
            public void run() {
                String dr2 = com.ss.android.downloadlib.rb.dr.dr(targetFilePath);
                if (TextUtils.isEmpty(dr2)) {
                    return;
                }
                wb.getContext().getSharedPreferences("sp_ttdownloader_md5", 0).edit().putString(String.valueOf(geVar.ge()), dr2).apply();
            }
        });
    }

    private static void ge(com.ss.android.downloadad.api.dr.ge geVar) {
        if (geVar == null) {
            return;
        }
        String ci = TextUtils.isEmpty(geVar.ci()) ? "" : geVar.ci();
        DownloadInfo downloadInfo = Downloader.getInstance(wb.getContext()).getDownloadInfo(geVar.i());
        geVar.yk("");
        ll.dr().dr(geVar);
        JSONObject dr2 = dr(new JSONObject(), downloadInfo);
        int i = 1;
        try {
            dr2.putOpt("finish_reason", ci);
            dr2.putOpt("finish_from_reserve_wifi", Integer.valueOf(downloadInfo.isDownloadFromReserveWifi() ? 1 : 0));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.ss.android.downloadad.api.dr.ge dr3 = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(downloadInfo);
        com.ss.android.downloadlib.rb.bn.dr(dr2, downloadInfo.getId());
        try {
            dr2.put("download_failed_times", dr3.n());
            dr2.put("can_show_notification", com.ss.android.socialbase.appdownloader.q.g.dr() ? 1 : 2);
            if (downloadInfo.getExpectFileLength() > 0 && downloadInfo.getTotalBytes() > 0) {
                dr2.put("file_length_gap", downloadInfo.getExpectFileLength() - downloadInfo.getTotalBytes());
            }
            dr2.put("ttmd5_status", downloadInfo.getTTMd5CheckStatus());
            dr2.put("has_send_download_failed_finally", dr3.g.get() ? 1 : 2);
            if (!dr3.ff()) {
                i = 2;
            }
            dr2.put("is_update_download", i);
            com.ss.android.downloadlib.rb.bn.dr(dr3, dr2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        com.ss.android.downloadlib.g.dr.dr().ge("download_finish", dr2, geVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(com.ss.android.downloadad.api.dr.ge geVar) {
        SystemClock.sleep(20000L);
        int i = 15;
        while (i > 0) {
            if (yk.ge(geVar)) {
                dr(geVar.q());
                return;
            }
            i--;
            if (i != 0) {
                SystemClock.sleep(20000L);
            } else {
                return;
            }
        }
    }

    private int dr(com.ss.android.downloadad.api.dr.ge geVar, DownloadInfo downloadInfo, String str, JSONObject jSONObject) {
        int ge2 = com.ss.android.socialbase.appdownloader.o.ge(wb.getContext(), downloadInfo);
        int ge3 = yk.ge(wb.getContext(), str);
        if (ge2 > 0 && ge3 > 0 && ge2 != ge3) {
            return ge3 > ge2 ? 3011 : 3010;
        } else if (DownloadSetting.obtain(geVar.i()).optInt("install_finish_check_ttmd5", 1) == 1) {
            String string = wb.getContext().getSharedPreferences("sp_ttdownloader_md5", 0).getString(String.valueOf(geVar.ge()), null);
            if (TextUtils.isEmpty(string) && downloadInfo != null) {
                string = com.ss.android.downloadlib.rb.dr.dr(downloadInfo.getTargetFilePath());
            }
            int dr2 = com.ss.android.downloadlib.rb.dr.dr(string, com.ss.android.downloadlib.rb.dr.ge(str));
            try {
                jSONObject.put("ttmd5_status", dr2);
            } catch (Throwable th) {
            }
            if (dr2 == 0) {
                return 3000;
            }
            if (dr2 == 1) {
                return 3002;
            }
            return 3001;
        } else {
            return 3001;
        }
    }

    public static String o(DownloadInfo downloadInfo, com.ss.android.downloadad.api.dr.ge geVar) {
        File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
        String str = null;
        if (file.exists()) {
            try {
                PackageInfo packageArchiveInfo = wb.getContext().getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), com.ss.android.socialbase.appdownloader.o.dr());
                if (packageArchiveInfo != null) {
                    str = packageArchiveInfo.packageName;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(str) && !str.equals(downloadInfo.getPackageName())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("real_package_name", str);
                jSONObject.put("input_package_name", downloadInfo.getPackageName());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            com.ss.android.downloadlib.g.dr.dr().dr("embeded_ad", "package_name_error", jSONObject, geVar);
            return str;
        }
        return downloadInfo.getPackageName();
    }

    @Override // com.ss.android.socialbase.downloader.common.AppStatusManager.AppStatusChangeListener
    public void onAppForeground() {
        Logger.d(dr, "onAppForeground()");
        ge();
        dr(5);
    }

    @Override // com.ss.android.socialbase.downloader.common.AppStatusManager.AppStatusChangeListener
    public void onAppBackground() {
        Logger.d(dr, "onAppBackground()");
        dr(6);
    }

    synchronized void ge() {
        ge geVar = this.o;
        if (geVar != null) {
            geVar.ge();
            this.o = null;
        }
    }

    @Override // com.ss.android.downloadad.api.dr
    public void dr(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.ge < 120000) {
            return;
        }
        g.dr().dr(new RunnableC0292dr(i), this.ge > 0 ? 2000L : 8000L);
        this.ge = currentTimeMillis;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dr(ConcurrentHashMap<Long, com.ss.android.downloadad.api.dr.ge> concurrentHashMap, int i) {
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        for (com.ss.android.downloadad.api.dr.ge geVar : concurrentHashMap.values()) {
            if (geVar.o.get()) {
                if (currentTimeMillis - geVar.l() >= DownloadSetting.obtain(geVar.i()).optInt("start_event_expire_hours", 168) * 60 * 60 * 1000) {
                    arrayList.add(Long.valueOf(geVar.ge()));
                }
            } else if (geVar.f() == 1) {
                if (g(geVar) <= 0 && currentTimeMillis - geVar.l() >= DownloadSetting.obtain(geVar.i()).optInt("start_event_expire_hours", 168) * 60 * 60 * 1000) {
                    arrayList.add(Long.valueOf(geVar.ge()));
                }
            } else if (geVar.f() == 2) {
                if (!geVar.ss()) {
                    if (yk.ge(geVar)) {
                        if (geVar.ux() == 4) {
                            i = geVar.ux();
                        }
                        com.ss.android.downloadlib.g.dr.dr().dr(dr(geVar, geVar.q(), i), geVar);
                        arrayList.add(Long.valueOf(geVar.ge()));
                        com.ss.android.downloadlib.addownload.o.g.dr(geVar);
                    } else if (currentTimeMillis - geVar.l() >= DownloadSetting.obtain(geVar.i()).optInt("finish_event_expire_hours", 168) * 60 * 60 * 1000) {
                        arrayList.add(Long.valueOf(geVar.ge()));
                    } else if (TextUtils.isEmpty(geVar.q())) {
                        arrayList.add(Long.valueOf(geVar.ge()));
                    }
                }
            } else {
                arrayList.add(Long.valueOf(geVar.ge()));
            }
        }
        com.ss.android.downloadlib.addownload.ge.bn.dr().dr(arrayList);
    }

    @Override // com.ss.android.socialbase.appdownloader.ge.o
    public void dr(DownloadInfo downloadInfo, com.ss.android.socialbase.appdownloader.dr drVar) {
        JSONObject ge2;
        if (downloadInfo == null || drVar == null) {
            return;
        }
        JSONArray optJSONArray = DownloadSetting.obtain(downloadInfo.getId()).optJSONArray("ah_report_config");
        if (drVar.ge != 0) {
            downloadInfo.getTempCacheData().remove("intent");
        }
        if (optJSONArray != null && (ge2 = ge(downloadInfo, drVar)) != null) {
            downloadInfo.getTempCacheData().put("ah_ext_json", ge2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IOpenInstallerListener
    public void onOpenInstaller(final DownloadInfo downloadInfo, String str) {
        if (downloadInfo == null) {
            com.ss.android.downloadlib.q.o.dr().dr("info is null");
        } else if ((DownloadSetting.obtain(downloadInfo).optInt("check_applink_mode") & 2) != 0) {
            final JSONObject jSONObject = (JSONObject) downloadInfo.getTempCacheData().get("ah_ext_json");
            com.ss.android.downloadlib.ge.q.dr().ge(new com.ss.android.downloadlib.ge.g() { // from class: com.ss.android.downloadlib.dr.4
                @Override // com.ss.android.downloadlib.ge.g
                public void dr(boolean z) {
                    if (!z) {
                        Intent intent = (Intent) downloadInfo.getTempCacheData().get("intent");
                        if (intent == null) {
                            yk.dr(jSONObject, "backup", (Object) 2);
                        } else {
                            downloadInfo.getTempCacheData().remove("intent");
                            com.ss.android.socialbase.appdownloader.o.dr(wb.getContext(), intent);
                            yk.dr(jSONObject, "backup", (Object) 1);
                        }
                    }
                    com.ss.android.downloadad.api.dr.ge dr2 = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(downloadInfo);
                    if (dr2 != null) {
                        com.ss.android.downloadlib.g.dr.dr().dr(z ? "installer_delay_success" : "installer_delay_failed", jSONObject, dr2);
                    } else {
                        com.ss.android.downloadlib.q.o.dr().ge("ah nativeModel=null");
                    }
                    if (z) {
                        wb.z().dr(wb.getContext(), null, null, null, null, 1);
                    }
                }
            });
        }
    }

    private int g(com.ss.android.downloadad.api.dr.ge geVar) {
        int realStatus;
        double optDouble = DownloadSetting.obtain(geVar.i()).optDouble("download_failed_finally_hours", 48.0d);
        if (optDouble <= PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            return -1;
        }
        if (System.currentTimeMillis() - geVar.l() < optDouble * 60.0d * 60.0d * 1000.0d) {
            return 1;
        }
        if (geVar.g.get()) {
            return 0;
        }
        DownloadInfo downloadInfo = Downloader.getInstance(wb.getContext()).getDownloadInfo(geVar.i());
        if (downloadInfo == null || (realStatus = downloadInfo.getRealStatus()) == -3 || realStatus == -4) {
            return -1;
        }
        if (!DownloadStatus.isDownloading(realStatus) && geVar.g.compareAndSet(false, true)) {
            try {
                JSONObject jSONObject = new JSONObject();
                dr(jSONObject, downloadInfo);
                jSONObject.putOpt(MonitorConstants.EXTRA_DOWNLOAD_STATUS, Integer.valueOf(realStatus));
                jSONObject.putOpt("fail_status", Integer.valueOf(geVar.a()));
                jSONObject.putOpt("fail_msg", geVar.bg());
                jSONObject.put("download_failed_times", geVar.n());
                if (downloadInfo.getTotalBytes() > 0) {
                    jSONObject.put("download_percent", downloadInfo.getCurBytes() / downloadInfo.getTotalBytes());
                }
                jSONObject.put("is_update_download", geVar.ff() ? 1 : 2);
                com.ss.android.downloadlib.g.dr.dr().dr(geVar.wb(), "download_failed_finally", jSONObject, geVar);
                ll.dr().dr(geVar);
                return 0;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return 1;
    }

    private JSONObject ge(DownloadInfo downloadInfo, com.ss.android.socialbase.appdownloader.dr drVar) {
        com.ss.android.downloadad.api.dr.ge dr2 = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(downloadInfo);
        if (dr2 == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        drVar.dr(jSONObject);
        try {
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_ID, downloadInfo.getId());
            jSONObject.put("name", downloadInfo.getName());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        com.ss.android.downloadlib.rb.bn.dr(jSONObject, downloadInfo.getId());
        com.ss.android.downloadlib.g.dr.dr().dr("embeded_ad", "ah_result", jSONObject, dr2);
        return jSONObject;
    }

    public void dr(com.ss.android.downloadad.api.dr.ge geVar) {
        g.dr().dr(new o(geVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class o implements Runnable {
        private final com.ss.android.downloadad.api.dr.ge ge;

        public o(com.ss.android.downloadad.api.dr.ge geVar) {
            this.ge = geVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    this.ge.wb(true);
                    dr.this.o(this.ge);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } finally {
                this.ge.wb(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ss.android.downloadlib.dr$dr  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0292dr implements Runnable {
        private final int ge;

        public RunnableC0292dr(int i) {
            this.ge = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.ss.android.downloadlib.addownload.ge.bn.dr().ge();
                ConcurrentHashMap<Long, com.ss.android.downloadad.api.dr.ge> o = com.ss.android.downloadlib.addownload.ge.bn.dr().o();
                if (o != null && !o.isEmpty()) {
                    dr.this.dr(o, this.ge);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private JSONObject dr(com.ss.android.downloadad.api.dr.ge geVar, String str, int i) {
        com.ss.android.socialbase.appdownloader.dr dr2;
        JSONObject jSONObject = new JSONObject();
        try {
            DownloadInfo downloadInfo = Downloader.getInstance(wb.getContext()).getDownloadInfo(geVar.i());
            jSONObject.putOpt("scene", Integer.valueOf(i));
            com.ss.android.downloadlib.rb.bn.dr(jSONObject, geVar.i());
            com.ss.android.downloadlib.rb.bn.dr(geVar, jSONObject);
            jSONObject.put("is_update_download", geVar.ff() ? 1 : 2);
            jSONObject.put("install_after_back_app", geVar.jy() ? 1 : 2);
            jSONObject.putOpt("clean_space_install_params", geVar.zq() ? "1" : "2");
            if (downloadInfo != null) {
                dr(jSONObject, downloadInfo);
                try {
                    jSONObject.put("uninstall_resume_count", downloadInfo.getUninstallResumeCount());
                    if (geVar.e() > 0) {
                        jSONObject.put("install_time", System.currentTimeMillis() - geVar.e());
                    }
                } catch (Throwable th) {
                }
                String string = DownloadUtils.getString(downloadInfo.getTempCacheData().get("ah_attempt"), null);
                if (!TextUtils.isEmpty(string) && (dr2 = com.ss.android.socialbase.appdownloader.dr.dr(string)) != null) {
                    dr2.dr(jSONObject);
                }
            }
            int dr3 = dr(geVar, downloadInfo, str, jSONObject);
            jSONObject.put("fail_status", dr3);
            if (dr3 == 3000) {
                jSONObject.put("hijack", 2);
            } else if (dr3 == 3001) {
                jSONObject.put("hijack", 0);
            } else {
                jSONObject.put("hijack", 1);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return jSONObject;
    }

    public void dr(DownloadInfo downloadInfo, long j, long j2, long j3, long j4, long j5, boolean z) {
        com.ss.android.downloadad.api.dr.ge dr2 = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(downloadInfo);
        if (dr2 == null) {
            com.ss.android.downloadlib.q.o.dr().dr("trySendClearSpaceEvent nativeModel null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("space_before", Double.valueOf(j / 1048576.0d));
            jSONObject.putOpt("space_cleaned", Double.valueOf((j2 - j) / 1048576.0d));
            jSONObject.putOpt("clean_up_time_cost", Long.valueOf(j4));
            jSONObject.putOpt("is_download_restarted", Integer.valueOf(z ? 1 : 0));
            jSONObject.putOpt("byte_required", Long.valueOf(j3));
            jSONObject.putOpt("byte_required_after", Double.valueOf((j3 - j2) / 1048576.0d));
            jSONObject.putOpt("clear_sleep_time", Long.valueOf(j5));
            com.ss.android.downloadlib.rb.bn.o(downloadInfo, jSONObject);
            com.ss.android.downloadlib.g.dr.dr().dr("cleanup", jSONObject, dr2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
