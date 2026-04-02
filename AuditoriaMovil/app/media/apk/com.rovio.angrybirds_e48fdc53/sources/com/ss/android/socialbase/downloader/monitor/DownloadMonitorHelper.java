package com.ss.android.socialbase.downloader.monitor;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import com.ss.android.socialbase.downloader.constants.DownloadStatus;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.ss.android.socialbase.downloader.depend.AbsDownloadMonitorDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.IMonitorConfig;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadTTNetException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.network.AbsDownloadHttpConnection;
import com.ss.android.socialbase.downloader.network.IDefaultDownloadHttpConnection;
import com.ss.android.socialbase.downloader.network.IDownloadHttpConnection;
import com.ss.android.socialbase.downloader.segment.Segment;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class DownloadMonitorHelper {
    private static final String DEFAULT_MONITOR_SCENE = "default";

    public static void monitorSend(DownloadTask downloadTask, BaseException baseException, int i) {
        if (downloadTask == null) {
            return;
        }
        try {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo == null) {
                return;
            }
            IDownloadMonitorDepend monitorDepend = downloadTask.getMonitorDepend();
            boolean isMonitorStatus = DownloadStatus.isMonitorStatus(i);
            if (!isMonitorStatus && !(isMonitorStatus = isMonitorStatus(downloadInfo.getExtraMonitorStatus(), i)) && monitorDepend != null && (monitorDepend instanceof AbsDownloadMonitorDepend)) {
                isMonitorStatus = isMonitorStatus(((AbsDownloadMonitorDepend) monitorDepend).getAdditionalMonitorStatus(), i);
            }
            if (isMonitorStatus) {
                IDownloadDepend depend = downloadTask.getDepend();
                if (depend != null) {
                    depend.monitorLogSend(downloadInfo, baseException, i);
                }
                monitorSendWithTaskMonitor(monitorDepend, downloadInfo, baseException, i);
                monitorSendWithGlobalSdkMonitor(DownloadComponentManager.getDownloadMonitorListener(), downloadInfo, baseException, i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static boolean isMonitorStatus(int[] iArr, int i) {
        if (iArr != null && iArr.length > 0) {
            for (int i2 : iArr) {
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void monitorSendWithTaskMonitor(IDownloadMonitorDepend iDownloadMonitorDepend, DownloadInfo downloadInfo, BaseException baseException, int i) {
        if (iDownloadMonitorDepend == null) {
            return;
        }
        try {
            String eventPage = iDownloadMonitorDepend.getEventPage();
            if (TextUtils.isEmpty(eventPage)) {
                eventPage = "default";
            }
            JSONObject monitorJson = getMonitorJson(eventPage, downloadInfo, baseException, i);
            if (monitorJson == null) {
                monitorJson = new JSONObject();
            }
            iDownloadMonitorDepend.monitorLogSend(monitorJson);
        } catch (Throwable th) {
        }
    }

    public static void monitorSendWithGlobalSdkMonitor(IDownloadMonitorListener iDownloadMonitorListener, DownloadInfo downloadInfo, BaseException baseException, int i) {
        if (iDownloadMonitorListener == null || !downloadInfo.isNeedSDKMonitor() || TextUtils.isEmpty(downloadInfo.getMonitorScene())) {
            return;
        }
        try {
            JSONObject monitorJson = getMonitorJson(downloadInfo.getMonitorScene(), downloadInfo, baseException, i);
            if (monitorJson == null) {
                monitorJson = new JSONObject();
            }
            if (i == -1) {
                monitorJson.put("status", baseException.getErrorCode());
                iDownloadMonitorListener.monitorEvent("download_failed", monitorJson, null, null);
                return;
            }
            putMonitorJsonStatus(i, monitorJson, downloadInfo);
            iDownloadMonitorListener.monitorEvent("download_common", monitorJson, null, null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void putMonitorJsonStatus(int i, JSONObject jSONObject, DownloadInfo downloadInfo) throws JSONException {
        String str;
        if (i == -5) {
            str = "download_uncomplete";
        } else if (i == -4) {
            str = "download_cancel";
        } else if (i == -3) {
            double downloadSpeed = downloadInfo.getDownloadSpeed();
            if (downloadSpeed >= PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                jSONObject.put(MonitorConstants.DOWNLOAD_SPEED, downloadSpeed);
            }
            str = "download_success";
        } else if (i == -2) {
            str = "download_pause";
        } else if (i == 0) {
            str = "download_create";
        } else if (i == 2) {
            str = "download_start";
        } else if (i == 6) {
            str = "download_first_start";
        } else {
            str = "";
        }
        jSONObject.put("status", str);
    }

    public static String parseDevicePostfix(String str) {
        try {
            if (TextUtils.isDigitsOnly(str)) {
                return String.valueOf(Long.valueOf(str).longValue() % 100);
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static JSONObject getMonitorJson(String str, DownloadInfo downloadInfo, BaseException baseException, int i) {
        JSONObject jSONObject;
        String str2;
        String str3;
        String str4;
        int i2;
        String str5;
        String str6;
        String str7;
        String str8;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e) {
            e = e;
        }
        try {
            IMonitorConfig monitorConfig = DownloadComponentManager.getMonitorConfig();
            if (monitorConfig == null) {
                str2 = "";
                str3 = str2;
                str4 = str3;
                i2 = 0;
            } else {
                str2 = monitorConfig.getDeviceId();
                str3 = parseDevicePostfix(str2);
                str4 = monitorConfig.getAppId();
                i2 = monitorConfig.getUpdateVersion();
            }
            if (baseException == null || !(baseException instanceof DownloadTTNetException)) {
                str5 = "";
            } else {
                str5 = ((DownloadTTNetException) baseException).getRequestLog();
            }
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_PAGE, str);
            jSONObject.put("app_id", str4);
            jSONObject.put("device_id", str2);
            jSONObject.put(MonitorConstants.EXTRA_DEVICE_ID_POSTFIX, str3);
            jSONObject.put(MonitorConstants.EXTRA_UPDATE_VERSION, i2);
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_STATUS, i);
            if (downloadInfo != null) {
                jSONObject.put(DownloadSettingKeys.SETTING_TAG, DownloadSetting.obtain(downloadInfo.getId()).optString(DownloadSettingKeys.SETTING_TAG));
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_ID, downloadInfo.getId());
                jSONObject.put("name", downloadInfo.getName());
                jSONObject.put("url", downloadInfo.getUrl());
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_SAVE_PATH, downloadInfo.getSavePath());
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_TIME, downloadInfo.getDownloadTime());
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_CUR_BYTES, downloadInfo.getCurBytes());
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_TOTAL_BYTES, downloadInfo.getTotalBytes());
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_NETWORK_QUALITY, downloadInfo.getNetworkQuality());
                int i3 = 1;
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_ONLY_WIFI, downloadInfo.isOnlyWifi() ? 1 : 0);
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_NEED_HTTPS_DEGRADE, downloadInfo.isNeedHttpsToHttpRetry() ? 1 : 0);
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_HTTPS_DEGRADE_RETRY_USED, downloadInfo.isHttpsToHttpRetryUsed() ? 1 : 0);
                jSONObject.put("md5", downloadInfo.getMd5() == null ? "" : downloadInfo.getMd5());
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_CHUNK_COUNT, downloadInfo.getChunkCount());
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_IS_FORCE, downloadInfo.isForce() ? 1 : 0);
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_RETRY_COUNT, downloadInfo.getRetryCount());
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_CUR_RETRY_TIME, downloadInfo.getCurRetryTime());
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_NEED_RETRY_DELAY, downloadInfo.isNeedRetryDelay() ? 1 : 0);
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_NEED_REUSE_FIRST_CONNECTION, downloadInfo.isNeedReuseFirstConnection() ? 1 : 0);
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_DEFAULT_HTTP_SERVICE_BACKUP, downloadInfo.isNeedDefaultHttpServiceBackUp() ? 1 : 0);
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_RETRY_DELAY_STATUS, downloadInfo.getRetryDelayStatus().ordinal());
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_BACKUP_URL_USED, downloadInfo.isBackUpUrlUsed() ? 1 : 0);
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_BYTE_ERROR_RETRY_STATUS, downloadInfo.getByteInvalidRetryStatus().ordinal());
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_FORBIDDEN_HANDLER_STATUS, downloadInfo.getAsyncHandleStatus().ordinal());
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_NEED_INDEPENDENT_PROCESS, downloadInfo.isNeedIndependentProcess() ? 1 : 0);
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_HEAD_CONNECTION_ERROR_MSG, downloadInfo.getHeadConnectionException() != null ? downloadInfo.getHeadConnectionException() : "");
                jSONObject.put("extra", downloadInfo.getExtra() != null ? downloadInfo.getExtra() : "");
                if (!downloadInfo.isAddListenerToSameTask()) {
                    i3 = 0;
                }
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_ADD_LISTENER_TO_SAME_TASK, i3);
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_BACKUP_URL_COUNT, downloadInfo.getBackUpUrls() != null ? downloadInfo.getBackUpUrls().size() : 0);
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_CUR_BACKUP_URL_INDEX, downloadInfo.getBackUpUrls() != null ? downloadInfo.getCurBackUpUrlIndex() : -1);
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_FORBIDDEN_URLS, downloadInfo.getForbiddenBackupUrls() != null ? downloadInfo.getForbiddenBackupUrls().toString() : "");
                jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_TASK_ID, TextUtils.isEmpty(downloadInfo.getTaskId()) ? "" : downloadInfo.getTaskId());
                String url = downloadInfo.getUrl();
                if (TextUtils.isEmpty(url)) {
                    str6 = "";
                    str7 = str6;
                    str8 = str7;
                } else {
                    Uri parse = Uri.parse(url);
                    str7 = parse.getHost();
                    str8 = parse.getPath();
                    str6 = parse.getLastPathSegment();
                    if (!TextUtils.isEmpty(str8) && !TextUtils.isEmpty(str6)) {
                        try {
                            str8 = str8.substring(0, str8.length() - str6.length());
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
                jSONObject.put(MonitorConstants.URL_HOST, str7);
                jSONObject.put(MonitorConstants.URL_PATH, str8);
                jSONObject.put(MonitorConstants.URL_LAST_PATH_SEGMENT, str6);
            }
            jSONObject.put("error_code", baseException != null ? baseException.getErrorCode() : 0);
            jSONObject.put("error_msg", baseException != null ? baseException.getErrorMessage() : "");
            jSONObject.put(MonitorConstants.REQUEST_LOG, str5);
            return jSONObject;
        } catch (JSONException e2) {
            e = e2;
            jSONObject2 = jSONObject;
            e.printStackTrace();
            return jSONObject2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:11|(4:69|70|71|(2:73|74)(1:75))(1:13)|14|(2:49|(1:(13:57|(1:59)(2:60|61)|18|(2:22|23)|26|27|28|(1:30)|31|32|(1:44)|35|(2:39|40)(1:38)))(1:54))|17|18|(3:20|22|23)|26|27|28|(0)|31|32|(0)|42|44|35|(0)|39|40) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0120, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f4 A[Catch: JSONException -> 0x011f, all -> 0x0145, TryCatch #4 {JSONException -> 0x011f, blocks: (B:54:0x00b8, B:56:0x00f4, B:57:0x0105), top: B:79:0x00b8, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void monitorDownloadConnect(com.ss.android.socialbase.downloader.network.IDownloadHeadHttpConnection r14, java.lang.String r15, java.lang.String r16, long r17, java.lang.String r19, int r20, java.io.IOException r21, com.ss.android.socialbase.downloader.model.DownloadInfo r22) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.monitor.DownloadMonitorHelper.monitorDownloadConnect(com.ss.android.socialbase.downloader.network.IDownloadHeadHttpConnection, java.lang.String, java.lang.String, long, java.lang.String, int, java.io.IOException, com.ss.android.socialbase.downloader.model.DownloadInfo):void");
    }

    public static void monitorDownloadIO(DownloadSetting downloadSetting, DownloadInfo downloadInfo, String str, IDownloadHttpConnection iDownloadHttpConnection, boolean z, boolean z2, BaseException baseException, long j, long j2, boolean z3, long j3, long j4, long j5, JSONObject jSONObject) {
        monitorIO(MonitorConstants.DOWNLOAD_IO, downloadSetting.optInt(DownloadSettingKeys.MONITOR_DOWNLOAD_IO), downloadSetting, downloadInfo, str, null, null, iDownloadHttpConnection, z, z2, baseException, j, j2, z3, j3, j4, j5, null);
    }

    public static void monitorSegmentIO(DownloadSetting downloadSetting, DownloadInfo downloadInfo, String str, String str2, String str3, boolean z, IDownloadHttpConnection iDownloadHttpConnection, BaseException baseException, long j, long j2) {
        monitorIO(MonitorConstants.SEGMENT_IO, downloadSetting.optInt(DownloadSettingKeys.MONITOR_SEGMENT_IO), downloadSetting, downloadInfo, str, str2, str3, iDownloadHttpConnection, z, false, baseException, j, j2, false, -1L, -1L, -1L, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v3 */
    private static void monitorIO(String str, int i, DownloadSetting downloadSetting, DownloadInfo downloadInfo, String str2, String str3, String str4, IDownloadHttpConnection iDownloadHttpConnection, boolean z, boolean z2, BaseException baseException, long j, long j2, boolean z3, long j3, long j4, long j5, JSONObject jSONObject) {
        int i2;
        String str5;
        String str6;
        int i3;
        int i4;
        String str7;
        int i5;
        if (i <= 0 || j2 <= 0) {
            return;
        }
        try {
            Uri parse = Uri.parse(str2);
            String host = parse.getHost();
            String path = parse.getPath();
            String lastPathSegment = parse.getLastPathSegment();
            if (!TextUtils.isEmpty(path) && !TextUtils.isEmpty(lastPathSegment)) {
                try {
                    path = path.substring(0, path.length() - lastPathSegment.length());
                } catch (Throwable th) {
                }
            }
            if (z) {
                i2 = 1;
                str5 = null;
            } else if (z2) {
                i2 = 2;
                str5 = null;
            } else if (baseException != null) {
                if (!DownloadUtils.isNetworkConnected(DownloadComponentManager.getAppContext())) {
                    i2 = DownloadErrorCode.ERROR_NETWORK_NOT_AVAILABLE;
                } else {
                    i2 = baseException.getErrorCode();
                }
                str5 = baseException.getErrorMessage();
            } else {
                i2 = 0;
                str5 = null;
            }
            JSONObject jSONObject2 = new JSONObject();
            int i6 = -1;
            if (iDownloadHttpConnection == null) {
                str6 = "";
                i3 = -1;
                i4 = -1;
            } else {
                if (iDownloadHttpConnection instanceof IDefaultDownloadHttpConnection) {
                    i5 = 0;
                } else {
                    i5 = 1;
                }
                String responseHeaderField = iDownloadHttpConnection.getResponseHeaderField(DownloadUtils.X_CACHE);
                if (!TextUtils.isEmpty(responseHeaderField)) {
                    i6 = responseHeaderField.toLowerCase().contains("hit");
                }
                if (downloadSetting.optInt(DownloadSettingKeys.MONITOR_SLA, 1) == 1 && !z && !z2 && (iDownloadHttpConnection instanceof AbsDownloadHttpConnection)) {
                    ((AbsDownloadHttpConnection) iDownloadHttpConnection).monitorNetworkInfo(jSONObject2, true);
                }
                if (!(iDownloadHttpConnection instanceof AbsDownloadHttpConnection)) {
                    i3 = i5;
                    str6 = "";
                    i4 = i6;
                } else {
                    i3 = i5;
                    str6 = ((AbsDownloadHttpConnection) iDownloadHttpConnection).getRequestLog();
                    i4 = i6;
                }
            }
            double d = j / 1048576.0d;
            double d2 = j2;
            double nanos = d2 / TimeUnit.SECONDS.toNanos(1L);
            jSONObject2.put(DownloadSettingKeys.SETTING_TAG, downloadSetting.optString(DownloadSettingKeys.SETTING_TAG));
            jSONObject2.put(MonitorConstants.URL_HOST, host);
            jSONObject2.putOpt(MonitorConstants.HOST_IP, str3);
            jSONObject2.putOpt(MonitorConstants.HOST_REAL_IP, str4);
            jSONObject2.put(MonitorConstants.URL_PATH, path);
            jSONObject2.put(MonitorConstants.URL_LAST_PATH_SEGMENT, lastPathSegment);
            jSONObject2.put(MonitorConstants.NET_LIB, i3);
            jSONObject2.put(MonitorConstants.HIT_CDN_CACHE, i4);
            jSONObject2.put(MonitorConstants.STATUS_CODE, i2);
            jSONObject2.put(MonitorConstants.REQUEST_LOG, str6);
            if (str5 != null) {
                jSONObject2.put("error_msg", DownloadUtils.getFixLengthString(str5, downloadSetting.optInt(DownloadSettingKeys.KEY_EXCEPTION_MSG_LENGTH, TTAdConstant.SHOW_POLL_TIME_SPLASH_DEFAULT)));
            }
            jSONObject2.put(MonitorConstants.DOWNLOAD_SEC, nanos);
            jSONObject2.put(MonitorConstants.DOWNLOAD_MB, d);
            if (nanos > PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                jSONObject2.put(MonitorConstants.DOWNLOAD_SPEED, d / nanos);
            }
            if (z3) {
                jSONObject2.put(MonitorConstants.RW_READ_TIME, j3 / d2);
                jSONObject2.put(MonitorConstants.RW_WRITE_TIME, j4 / d2);
                jSONObject2.put(MonitorConstants.RW_SYNC_TIME, j5 / d2);
            }
            jSONObject2.put(MonitorConstants.PKG_NAME, downloadInfo.getPackageName());
            jSONObject2.put("name", downloadInfo.getTitle());
            if (i != 1 && i != 3) {
                str7 = str;
                if (i != 2 || i == 3) {
                    DownloadComponentManager.getEventListener().onEvent(downloadInfo.getId(), str7, jSONObject2);
                }
                return;
            }
            IDownloadMonitorListener downloadMonitorListener = DownloadComponentManager.getDownloadMonitorListener();
            if (downloadMonitorListener == null) {
                str7 = str;
            } else {
                str7 = str;
                downloadMonitorListener.monitorEvent(str7, jSONObject2, null, null);
            }
            if (i != 2) {
            }
            DownloadComponentManager.getEventListener().onEvent(downloadInfo.getId(), str7, jSONObject2);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void monitorSegmentsError(DownloadInfo downloadInfo, List<Segment> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(DBDefinition.SEGMENT_TABLE_NAME, Segment.toString(list));
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_CUR_BYTES, downloadInfo.getCurBytes());
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_TOTAL_BYTES, downloadInfo.getTotalBytes());
            InnerEventListener eventListener = DownloadComponentManager.getEventListener();
            if (eventListener != null) {
                eventListener.onEvent(downloadInfo.getId(), "segments_error", jSONObject);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
