package com.ss.android.downloadlib;

import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.downloadlib.rb.t;
import com.ss.android.downloadlib.rb.yk;
import com.ss.android.socialbase.downloader.common.AppStatusManager;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class o implements com.ss.android.socialbase.appdownloader.o.xu {
    private static String dr = o.class.getSimpleName();
    private Handler ge = new Handler(Looper.getMainLooper());

    @Override // com.ss.android.socialbase.appdownloader.o.xu
    public void dr(DownloadInfo downloadInfo, BaseException baseException, int i) {
        final DownloadModel dr2;
        if (downloadInfo == null) {
            return;
        }
        if (i == -1 && baseException != null) {
            JSONObject jSONObject = new JSONObject();
            com.ss.android.downloadlib.rb.bn.o(downloadInfo, jSONObject);
            dr.dr(jSONObject, downloadInfo);
            t.dr("download_failed", jSONObject.toString());
        }
        com.ss.android.downloadad.api.dr.ge dr3 = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(downloadInfo);
        if (dr3 == null) {
            return;
        }
        try {
            if (i != -1) {
                if (i == -3) {
                    dr.dr(downloadInfo, dr3);
                    return;
                } else if (i == 2001) {
                    dr.dr().dr(downloadInfo, dr3, 2001);
                    return;
                } else if (i == 11) {
                    dr.dr().dr(downloadInfo, dr3, 2000);
                    if (!dr3.bk()) {
                        dr(downloadInfo, dr3);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            BaseException baseException2 = null;
            if (baseException != null) {
                if (DownloadSetting.obtain(downloadInfo.getId()).optInt("toast_without_network", 0) == 1 && baseException.getErrorCode() == 1049) {
                    this.ge.post(new Runnable() { // from class: com.ss.android.downloadlib.o.1
                        @Override // java.lang.Runnable
                        public void run() {
                            wb.o().dr(5, wb.getContext(), null, "无网络，请检查网络设置", null, 0);
                        }
                    });
                }
                if (DownloadUtils.isInsufficientSpaceError(baseException)) {
                    if (wb.yk() != null) {
                        wb.yk().dr(dr3.ge());
                    }
                    com.ss.android.downloadlib.g.dr.dr().dr("download_failed_for_space", dr3);
                    if (!dr3.os()) {
                        com.ss.android.downloadlib.g.dr.dr().dr("download_can_restart", dr3);
                        dr(downloadInfo);
                    }
                    if ((wb.yk() == null || !wb.yk().g()) && (dr2 = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(dr3.ge())) != null && dr2.isShowToast()) {
                        final DownloadSetting obtain = DownloadSetting.obtain(downloadInfo.getId());
                        if (obtain.optInt("show_no_enough_space_toast", 0) == 1) {
                            this.ge.post(new Runnable() { // from class: com.ss.android.downloadlib.o.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    wb.o().dr(2, wb.getContext(), dr2, obtain.optString("no_enough_space_toast_text", "您的存储空间不足，请清理后再试"), null, 0);
                                }
                            });
                        }
                    }
                }
                baseException2 = new BaseException(baseException.getErrorCode(), yk.dr(baseException.getMessage(), wb.ll().optInt(DownloadSettingKeys.KEY_EXCEPTION_MSG_LENGTH, TTAdConstant.SHOW_POLL_TIME_SPLASH_DEFAULT)));
            }
            com.ss.android.downloadlib.g.dr.dr().ge(downloadInfo, baseException2);
            rb.dr().dr(downloadInfo, baseException, "");
        } catch (Exception e) {
            wb.i().dr(e, "onAppDownloadMonitorSend");
        }
    }

    private void dr(final DownloadInfo downloadInfo, final com.ss.android.downloadad.api.dr.ge geVar) {
        final long dr2 = yk.dr(Environment.getDataDirectory(), -1L);
        long min = Math.min(524288000L, yk.dr(Environment.getDataDirectory()) / 10);
        final long totalBytes = downloadInfo.getTotalBytes();
        final double d = (totalBytes * 2.5d) + min;
        if (dr2 > -1 && totalBytes > -1) {
            double d2 = dr2;
            if (d2 < d && d - d2 > com.ss.android.downloadlib.addownload.g.ge()) {
                com.ss.android.downloadlib.addownload.g.dr(downloadInfo.getId());
            }
        }
        AppStatusManager.getInstance().registerAppSwitchListener(new AppStatusManager.AppStatusChangeListener() { // from class: com.ss.android.downloadlib.o.3
            @Override // com.ss.android.socialbase.downloader.common.AppStatusManager.AppStatusChangeListener
            public void onAppForeground() {
                if (!yk.ge(geVar)) {
                    long j = dr2;
                    if (j > -1 && totalBytes > -1 && j < d) {
                        com.ss.android.downloadlib.g.dr.dr().dr("clean_space_install", com.ss.android.downloadlib.addownload.g.dr("install_no_enough_space"), geVar);
                        if (com.ss.android.downloadlib.addownload.g.dr(downloadInfo, ((long) d) - dr2)) {
                            AppStatusManager.getInstance().unregisterAppSwitchListener(this);
                            geVar.rb(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                AppStatusManager.getInstance().unregisterAppSwitchListener(this);
            }

            @Override // com.ss.android.socialbase.downloader.common.AppStatusManager.AppStatusChangeListener
            public void onAppBackground() {
            }
        });
    }

    private void dr(DownloadInfo downloadInfo) {
        if (!com.ss.android.downloadlib.rb.q.bn(downloadInfo.getId())) {
            return;
        }
        g.dr().ge(new com.ss.android.downloadlib.addownload.o.ge(downloadInfo));
    }
}
