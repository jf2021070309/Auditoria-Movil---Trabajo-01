package com.ss.android.downloadlib.rb;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.ss.android.socialbase.appdownloader.rb;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class bn {
    public static void dr(DownloadInfo downloadInfo, JSONObject jSONObject) {
        try {
            o(downloadInfo, jSONObject);
            com.ss.android.downloadad.api.dr.ge dr = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(downloadInfo);
            if (dr == null) {
                return;
            }
            jSONObject.put("is_update_download", dr.ff() ? 1 : 2);
            dr(dr, jSONObject);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void ge(DownloadInfo downloadInfo, JSONObject jSONObject) {
        com.ss.android.downloadad.api.dr.ge dr;
        double d;
        if (jSONObject == null || (dr = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(downloadInfo)) == null) {
            return;
        }
        try {
            o(downloadInfo, jSONObject);
            jSONObject.putOpt("time_after_click", Long.valueOf(System.currentTimeMillis() - dr.ed()));
            jSONObject.putOpt("click_download_size", Long.valueOf(dr.p()));
            jSONObject.putOpt("download_length", Long.valueOf(downloadInfo.getCurBytes()));
            jSONObject.putOpt("download_apk_size", Long.valueOf(downloadInfo.getTotalBytes()));
            dr.at();
            com.ss.android.downloadlib.addownload.ge.ll.dr().dr(dr);
            jSONObject.put("click_pause_times", dr.j());
            long totalBytes = downloadInfo.getTotalBytes();
            long curBytes = downloadInfo.getCurBytes();
            if (curBytes >= 0 && totalBytes > 0) {
                d = curBytes / totalBytes;
            } else {
                d = PangleAdapterUtils.CPM_DEFLAUT_VALUE;
            }
            jSONObject.put("download_percent", d);
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_STATUS, downloadInfo.getRealStatus());
            long currentTimeMillis = System.currentTimeMillis();
            long l = dr.l();
            if (l > 0) {
                jSONObject.put("time_from_start_download", currentTimeMillis - l);
            }
            long rt = dr.rt();
            if (rt > 0) {
                jSONObject.put("time_from_download_resume", currentTimeMillis - rt);
            }
            jSONObject.putOpt("fail_status", Integer.valueOf(dr.a()));
            jSONObject.putOpt("fail_msg", dr.bg());
            jSONObject.put("download_failed_times", dr.n());
            jSONObject.put("can_show_notification", com.ss.android.socialbase.appdownloader.q.g.dr() ? 1 : 2);
            jSONObject.put("first_speed_time", downloadInfo.getFirstSpeedTime());
            jSONObject.put("all_connect_time", downloadInfo.getAllConnectTime());
            jSONObject.put("download_prepare_time", downloadInfo.getDownloadPrepareTime());
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_TIME, downloadInfo.getRealDownloadTime() + downloadInfo.getAllConnectTime() + downloadInfo.getDownloadPrepareTime());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void o(DownloadInfo downloadInfo, JSONObject jSONObject) {
        if (downloadInfo != null) {
            try {
                jSONObject.putOpt(MonitorConstants.EXTRA_DOWNLOAD_TOTAL_BYTES, Long.valueOf(downloadInfo.getTotalBytes()));
                jSONObject.putOpt(MonitorConstants.EXTRA_DOWNLOAD_CUR_BYTES, Long.valueOf(downloadInfo.getCurBytes()));
                jSONObject.putOpt(MonitorConstants.EXTRA_DOWNLOAD_CHUNK_COUNT, Integer.valueOf(downloadInfo.getChunkCount()));
                jSONObject.putOpt("app_name", downloadInfo.getTitle());
                jSONObject.putOpt(MonitorConstants.EXTRA_DOWNLOAD_NETWORK_QUALITY, downloadInfo.getNetworkQuality());
                jSONObject.putOpt(MonitorConstants.EXTRA_DOWNLOAD_SAVE_PATH, downloadInfo.getSavePath());
                jSONObject.putOpt("file_name", downloadInfo.getName());
                jSONObject.putOpt(MonitorConstants.EXTRA_DOWNLOAD_STATUS, Integer.valueOf(downloadInfo.getRealStatus()));
                com.ss.android.downloadad.api.dr.ge dr = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(downloadInfo.getId());
                if (dr != null) {
                    jSONObject.putOpt("click_download_time", Long.valueOf(dr.ed()));
                    jSONObject.putOpt("click_download_size", Long.valueOf(dr.p()));
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        int i = 1;
        jSONObject.putOpt("permission_notification", Integer.valueOf(com.ss.android.socialbase.appdownloader.q.g.dr() ? 1 : 2));
        jSONObject.putOpt("network_available", Integer.valueOf(DownloadUtils.isNetworkConnected(com.ss.android.downloadlib.addownload.wb.getContext()) ? 1 : 2));
        if (!DownloadUtils.isWifi(com.ss.android.downloadlib.addownload.wb.getContext())) {
            i = 2;
        }
        jSONObject.putOpt("network_is_wifi", Integer.valueOf(i));
    }

    public static void dr(com.ss.android.downloadad.api.dr.ge geVar, JSONObject jSONObject) {
        if (jSONObject == null || geVar == null) {
            return;
        }
        try {
            jSONObject.put("is_patch_apply_handled", geVar.r() ? 1 : 0);
            jSONObject.put("origin_mime_type", geVar.tw());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void dr(JSONObject jSONObject, int i) {
        if (jSONObject == null) {
            return;
        }
        JSONArray optJSONArray = DownloadSetting.obtain(i).optJSONArray("ah_report_config");
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                try {
                    String string = optJSONArray.getString(i2);
                    rb.dr dr = com.ss.android.socialbase.appdownloader.bn.dr.dr(string);
                    if (dr != null) {
                        String replaceAll = string.replaceAll("\\.", "_");
                        jSONObject.put(replaceAll, dr.bn() + "_" + dr.rb());
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        try {
            jSONObject.put("is_unknown_source_enabled", com.ss.android.socialbase.appdownloader.ge.dr(DownloadComponentManager.getAppContext()) ? 1 : 2);
        } catch (Throwable th2) {
        }
    }

    public static JSONObject dr(JSONObject jSONObject, com.ss.android.downloadad.api.dr.dr drVar) {
        yk.dr(jSONObject, "open_url", yk.dr(drVar.bn(), "open_url_not_exist"));
        return jSONObject;
    }

    public static JSONObject ge(JSONObject jSONObject, com.ss.android.downloadad.api.dr.dr drVar) {
        yk.dr(jSONObject, com.ss.android.socialbase.appdownloader.bn.q.ll().replaceAll("\\.", "_"), Integer.valueOf(yk.ge(com.ss.android.downloadlib.addownload.wb.getContext(), com.ss.android.socialbase.appdownloader.bn.q.ll())));
        return jSONObject;
    }

    public static void dr(JSONObject jSONObject) {
        try {
            jSONObject.putOpt("harmony_api_version", com.ss.android.socialbase.appdownloader.bn.g.dr());
            jSONObject.putOpt("harmony_release_type", com.ss.android.socialbase.appdownloader.bn.g.o());
            jSONObject.putOpt("harmony_build_version", com.ss.android.socialbase.appdownloader.bn.g.g());
            int i = 1;
            jSONObject.putOpt("pure_mode", Integer.valueOf(com.ss.android.socialbase.appdownloader.bn.g.dr(com.ss.android.downloadlib.addownload.wb.getContext()) ? 1 : 2));
            jSONObject.putOpt("pure_mode_enable", Integer.valueOf(com.ss.android.socialbase.appdownloader.bn.g.q() ? 1 : 2));
            jSONObject.putOpt("harmony_version", com.ss.android.socialbase.appdownloader.bn.g.ge());
            jSONObject.putOpt("pure_enhanced_mode", Integer.valueOf(com.ss.android.socialbase.appdownloader.bn.g.ge(com.ss.android.downloadlib.addownload.wb.getContext()) ? 1 : 2));
            if (!com.ss.android.socialbase.appdownloader.bn.g.bn()) {
                i = 2;
            }
            jSONObject.putOpt("pure_enhanced_mode_enable", Integer.valueOf(i));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
