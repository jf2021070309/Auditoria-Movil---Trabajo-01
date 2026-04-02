package com.ss.android.downloadlib.addownload;

import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class xu {
    public static boolean dr(int i) {
        return i == 0 || i == 1;
    }

    public static boolean ge(int i) {
        return i == 2 || i == 1;
    }

    public static boolean dr(DownloadModel downloadModel) {
        return downloadModel.isAd() && (downloadModel instanceof AdDownloadModel) && downloadModel.getModelType() == 1;
    }

    public static boolean ge(DownloadModel downloadModel) {
        return downloadModel != null && downloadModel.getModelType() == 2;
    }

    public static boolean dr(DownloadModel downloadModel, IDownloadButtonClickListener iDownloadButtonClickListener) {
        return downloadModel.isAd() && iDownloadButtonClickListener != null;
    }

    public static int dr(com.ss.android.downloadlib.addownload.ge.q qVar, boolean z, com.ss.android.socialbase.appdownloader.bn bnVar) {
        int i;
        String str;
        if (bnVar == null || TextUtils.isEmpty(bnVar.dr()) || bnVar.getContext() == null) {
            return 0;
        }
        try {
            i = dr(bnVar, bnVar.dr());
        } catch (Throwable th) {
            wb.i().dr(th, "redirectSavePathIfPossible");
            i = 4;
        }
        bnVar.dr(i);
        if (i == 0) {
            bnVar.dr(new com.ss.android.downloadlib.o.dr());
        }
        if (!bnVar.b()) {
            bnVar.dr(new com.ss.android.downloadlib.o.ge());
        }
        int dr = com.ss.android.socialbase.appdownloader.g.wb().dr(bnVar);
        com.ss.android.downloadad.api.dr.ge dr2 = dr(qVar, dr);
        com.ss.android.downloadlib.addownload.ge.bn.dr().dr(dr2);
        dr2.rb(dr);
        dr2.xu(System.currentTimeMillis());
        dr2.ll(0L);
        DownloadSetting obtain = DownloadSetting.obtain(bnVar.yd());
        if (!dr(bnVar, obtain, dr) && qVar.ge.isShowToast()) {
            String startToast = qVar.ge.getStartToast();
            if (TextUtils.isEmpty(startToast)) {
                startToast = obtain.optString("download_start_toast_text");
            }
            if (!TextUtils.isEmpty(startToast)) {
                str = startToast;
            } else {
                str = z ? "已开始下载，可在\"我的\"里查看管理" : "已开始下载";
            }
            wb.o().dr(2, bnVar.getContext(), qVar.ge, str, null, 0);
        }
        return dr;
    }

    private static com.ss.android.downloadad.api.dr.ge dr(com.ss.android.downloadlib.addownload.ge.q qVar, int i) {
        com.ss.android.downloadad.api.dr.ge geVar = new com.ss.android.downloadad.api.dr.ge(qVar.ge, qVar.o, qVar.g, i);
        boolean z = true;
        if (DownloadSetting.obtain(i).optInt("download_event_opt", 1) > 1) {
            try {
                String packageName = qVar.ge.getPackageName();
                if (!TextUtils.isEmpty(packageName)) {
                    if (wb.getContext().getPackageManager().getPackageInfo(packageName, 0) == null) {
                        z = false;
                    }
                    geVar.xu(z);
                }
            } catch (Throwable th) {
            }
        }
        return geVar;
    }

    private static boolean dr(com.ss.android.socialbase.appdownloader.bn bnVar, DownloadSetting downloadSetting, int i) {
        String optString;
        JSONArray optJSONArray = downloadSetting.optJSONArray(DownloadSettingKeys.KEY_AH_PLANS);
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return false;
        }
        int length = optJSONArray.length();
        int i2 = 0;
        JSONObject jSONObject = null;
        while (true) {
            if (i2 < length) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                if (optJSONObject != null && ((optString = optJSONObject.optString("type")) == "plan_c" || com.ss.android.socialbase.appdownloader.bn.dr.dr(optJSONObject))) {
                    char c = 65535;
                    switch (optString.hashCode()) {
                        case -985763637:
                            if (optString.equals("plan_a")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -985763636:
                            if (optString.equals("plan_b")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -985763635:
                            if (optString.equals("plan_c")) {
                                c = 7;
                                break;
                            }
                            break;
                        case -985763634:
                            if (optString.equals("plan_d")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -985763633:
                            if (optString.equals("plan_e")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -985763632:
                            if (optString.equals("plan_f")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -985763631:
                            if (optString.equals("plan_g")) {
                                c = 6;
                                break;
                            }
                            break;
                        case -985763630:
                            if (optString.equals("plan_h")) {
                                c = 5;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            if (com.ss.android.socialbase.appdownloader.ge.dr(optJSONObject, downloadSetting).ge == 0) {
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (com.ss.android.socialbase.appdownloader.ge.ge(optJSONObject, downloadSetting).ge == 0) {
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            jSONObject = optJSONObject;
                            continue;
                    }
                }
                i2++;
            }
        }
        if (jSONObject != null) {
            if (jSONObject.optInt(DownloadSettingKeys.AhPlans.KEY_ALLOW_UNKNOWN_SOURCE_ON_STARTUP) == 1) {
                return com.ss.android.socialbase.appdownloader.ge.dr(DownloadComponentManager.getAppContext(), (Intent) null, jSONObject, i, new com.ss.android.socialbase.appdownloader.dr());
            }
        }
        return false;
    }

    public static String dr(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return null;
        }
        try {
            String extra = downloadInfo.getExtra();
            if (!TextUtils.isEmpty(extra)) {
                return new JSONObject(extra).optString("notification_jump_url", null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static int dr(com.ss.android.socialbase.appdownloader.bn bnVar, String str) {
        DownloadSetting obtain = DownloadSetting.obtain(bnVar.yd());
        JSONObject optJSONObject = obtain.optJSONObject(DownloadSettingKeys.KEY_ANTI_HIJACK_DIR);
        if (optJSONObject == null || TextUtils.isEmpty(optJSONObject.optString(DownloadSettingKeys.AntiHijackDir.KEY_ANTI_HIJACK_DIR_NAME))) {
            return -1;
        }
        String ge = bnVar.ge();
        String xq = bnVar.xq();
        if (TextUtils.isEmpty(xq)) {
            xq = com.ss.android.socialbase.appdownloader.o.dr(str, ge, bnVar.yk(), true);
        }
        if (xq.length() > 255) {
            xq = xq.substring(xq.length() - 255);
        }
        if (TextUtils.isEmpty(ge)) {
            ge = xq;
        }
        String o = bnVar.o();
        if (TextUtils.isEmpty(o)) {
            o = com.ss.android.socialbase.appdownloader.o.ge();
        }
        String str2 = o + File.separator + com.ss.android.socialbase.appdownloader.o.dr(ge, obtain);
        DownloadInfo dr = com.ss.android.socialbase.appdownloader.g.wb().dr(bnVar.getContext(), str);
        if (dr != null && dr.isSavePathRedirected()) {
            bnVar.o(dr.getSavePath());
            try {
                bnVar.dr(new JSONObject(dr.getDownloadSettingString()));
                return 0;
            } catch (Throwable th) {
                return 0;
            }
        } else if (dr == null && AdBaseConstants.MIME_APK.equalsIgnoreCase(com.ss.android.socialbase.appdownloader.g.wb().dr(xq, bnVar.yk()))) {
            int dr2 = com.ss.android.socialbase.appdownloader.ge.dr(obtain);
            if (dr2 == 0) {
                bnVar.o(str2);
                return dr2;
            }
            return dr2;
        } else if (dr != null) {
            return 8;
        } else {
            return 9;
        }
    }
}
