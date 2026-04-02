package com.ss.android.downloadlib.rb;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.umeng.analytics.pro.bg;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class q {
    public static JSONObject dr() {
        return com.ss.android.downloadlib.addownload.wb.ll().optJSONObject(bg.aw);
    }

    public static JSONObject dr(DownloadModel downloadModel) {
        if (downloadModel == null) {
            return null;
        }
        if (downloadModel.isAd()) {
            return dr();
        }
        return downloadModel.getDownloadSettings();
    }

    public static DownloadSetting ge(DownloadModel downloadModel) {
        return DownloadSetting.obtain(dr(downloadModel));
    }

    public static DownloadSetting dr(com.ss.android.downloadad.api.dr.dr drVar) {
        if (drVar == null) {
            return DownloadSetting.obtainGlobal();
        }
        if (drVar.i() != 0) {
            return DownloadSetting.obtain(drVar.i());
        }
        if (drVar.o()) {
            return DownloadSetting.obtain(dr());
        }
        if (drVar.de() != null) {
            return DownloadSetting.obtain(drVar.de());
        }
        return DownloadSetting.obtainGlobal();
    }

    public static int dr(DownloadSetting downloadSetting) {
        return downloadSetting.optInt("external_storage_permission_path_type", 0);
    }

    public static int o(DownloadModel downloadModel) {
        return dr(ge(downloadModel));
    }

    public static boolean ge(com.ss.android.downloadad.api.dr.dr drVar) {
        return dr(drVar).optInt("pause_reserve_on_wifi", 0) == 1 && drVar.lp();
    }

    public static double dr(int i) {
        return DownloadSetting.obtain(i).optDouble("clean_min_install_size", PangleAdapterUtils.CPM_DEFLAUT_VALUE);
    }

    public static long ge(int i) {
        return DownloadSetting.obtain(i).optLong("storage_min_size", 0L);
    }

    public static long o(int i) {
        return DownloadSetting.obtain(i).optLong("clean_fetch_apk_head_time_out", 800L);
    }

    public static boolean g(int i) {
        return DownloadSetting.obtain(i).optLong("clean_fetch_apk_switch", 0L) == 1;
    }

    public static boolean q(int i) {
        return DownloadSetting.obtain(i).optLong("clean_space_before_download_switch", 0L) == 1;
    }

    public static boolean bn(int i) {
        return DownloadSetting.obtain(i).optInt("clean_space_switch", 0) == 1;
    }

    public static boolean rb(int i) {
        return DownloadSetting.obtain(i).optInt("clean_app_cache_dir", 0) == 1;
    }

    public static boolean ge(DownloadSetting downloadSetting) {
        return downloadSetting != null && downloadSetting.optInt("kllk_need_rename_apk", 0) == 1;
    }

    public static boolean ge() {
        if (DownloadSetting.obtainGlobal().optBugFix("fix_notification_anr")) {
            return true;
        }
        return false;
    }

    public static boolean o() {
        return com.ss.android.downloadlib.addownload.wb.ll().optInt("is_enable_start_install_again") == 1;
    }

    public static long g() {
        long optLong = com.ss.android.downloadlib.addownload.wb.ll().optLong("start_install_interval");
        if (optLong == 0) {
            return 300000L;
        }
        return optLong;
    }

    public static long q() {
        long optLong = com.ss.android.downloadlib.addownload.wb.ll().optLong("next_install_min_interval");
        if (optLong == 0) {
            return 10000L;
        }
        return optLong;
    }
}
