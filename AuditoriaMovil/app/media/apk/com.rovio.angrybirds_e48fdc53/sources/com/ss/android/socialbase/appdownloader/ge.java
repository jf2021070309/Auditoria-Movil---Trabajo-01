package com.ss.android.socialbase.appdownloader;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ss.android.download.api.constant.BaseConstants;
import com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity;
import com.ss.android.socialbase.downloader.common.AppStatusManager;
import com.ss.android.socialbase.downloader.constants.DbJsonConstants;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.ss.android.socialbase.downloader.constants.SpJsonConstants;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.thread.WeakDownloadHandler;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class ge {
    private static final String dr = ge.class.getSimpleName();
    private static o ge;
    private static dr o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ss.android.socialbase.appdownloader.ge$ge  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0307ge {
        boolean dr(Context context);
    }

    /* loaded from: classes3.dex */
    public interface o {
        void dr(DownloadInfo downloadInfo, com.ss.android.socialbase.appdownloader.dr drVar);
    }

    public static boolean dr(Context context, DownloadInfo downloadInfo, Intent intent, boolean z) {
        JSONArray optJSONArray = DownloadSetting.obtain(downloadInfo.getId()).optJSONArray(DownloadSettingKeys.KEY_AH_PLANS);
        if (optJSONArray == null) {
            return false;
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (com.ss.android.socialbase.appdownloader.bn.dr.dr(optJSONObject) && dr(context, downloadInfo, intent, optJSONObject, z)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static boolean dr(Context context, DownloadInfo downloadInfo, Intent intent, JSONObject jSONObject, boolean z) {
        char c;
        boolean z2 = false;
        if (jSONObject == null || downloadInfo == null) {
            return false;
        }
        com.ss.android.socialbase.appdownloader.dr drVar = new com.ss.android.socialbase.appdownloader.dr();
        String optString = jSONObject.optString("type");
        if (!TextUtils.isEmpty(optString)) {
            DownloadSetting obtain = DownloadSetting.obtain(downloadInfo);
            drVar.dr = optString;
            switch (optString.hashCode()) {
                case -985763637:
                    if (optString.equals("plan_a")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -985763636:
                    if (optString.equals("plan_b")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -985763635:
                    if (optString.equals("plan_c")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -985763634:
                    if (optString.equals("plan_d")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -985763633:
                    if (optString.equals("plan_e")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -985763632:
                    if (optString.equals("plan_f")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -985763631:
                    if (optString.equals("plan_g")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -985763630:
                    if (optString.equals("plan_h")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    if (!downloadInfo.isSavePathRedirected()) {
                        drVar.ge = downloadInfo.getAntiHijackErrorCode(-1);
                        break;
                    }
                case 2:
                    com.ss.android.socialbase.appdownloader.dr dr2 = dr(jSONObject, obtain);
                    if (dr2.ge != 0) {
                        drVar = dr2;
                        break;
                    } else if (optString.equals("plan_f") && TextUtils.isEmpty(downloadInfo.getDBJsonString(DbJsonConstants.CONTENT_URI))) {
                        drVar.ge = downloadInfo.getAntiHijackErrorCode(10);
                        break;
                    } else {
                        z2 = dr(context, downloadInfo, jSONObject, drVar);
                        break;
                    }
                case 3:
                    com.ss.android.socialbase.appdownloader.dr dr3 = dr(jSONObject, obtain);
                    if (dr3.ge != 0) {
                        drVar = dr3;
                        break;
                    } else if (!downloadInfo.isSavePathRedirected()) {
                        drVar.ge = downloadInfo.getAntiHijackErrorCode(-1);
                        break;
                    } else {
                        z2 = ge(context, downloadInfo, jSONObject, drVar);
                        break;
                    }
                case 4:
                    drVar.dr = "plan_d";
                    if (!com.ss.android.socialbase.appdownloader.bn.q.o()) {
                        drVar.ge = 2;
                        break;
                    } else {
                        try {
                            com.ss.android.socialbase.appdownloader.o.dr(context, intent);
                            drVar.ge = 0;
                            z2 = true;
                            break;
                        } catch (Throwable th) {
                            drVar.ge = 4;
                            drVar.o = th.toString();
                            break;
                        }
                    }
                case 5:
                    com.ss.android.socialbase.appdownloader.dr ge2 = ge(jSONObject, obtain);
                    if (ge2.ge != 0) {
                        drVar = ge2;
                        break;
                    } else {
                        z2 = dr(context, downloadInfo, jSONObject, drVar, obtain);
                        break;
                    }
                case 6:
                    String dr4 = com.ss.android.socialbase.appdownloader.bn.o.dr(obtain.optString("bh"), obtain.optString("s"));
                    com.ss.android.socialbase.appdownloader.dr dr5 = dr(jSONObject, dr4, context, obtain);
                    if (dr5.ge != 0) {
                        drVar = dr5;
                        break;
                    } else {
                        String packageName = context.getPackageName();
                        if (com.ss.android.socialbase.appdownloader.bn.dr.dr(DownloadSetting.getGlobalSettings(), context, dr4)) {
                            try {
                                com.ss.android.socialbase.appdownloader.o.dr(context, intent);
                                drVar.ge = 0;
                                com.ss.android.socialbase.appdownloader.bn.dr.dr(DownloadSetting.getGlobalSettings(), context, packageName);
                                z2 = true;
                                break;
                            } catch (Throwable th2) {
                                try {
                                    drVar.ge = 1;
                                    drVar.o = th2.toString();
                                    break;
                                } finally {
                                    com.ss.android.socialbase.appdownloader.bn.dr.dr(DownloadSetting.getGlobalSettings(), context, packageName);
                                }
                            }
                        } else {
                            drVar.ge = 11;
                            break;
                        }
                    }
                case 7:
                    if (Build.VERSION.SDK_INT >= 26 || com.ss.android.socialbase.appdownloader.bn.q.ge()) {
                        if ((jSONObject.optInt(DownloadSettingKeys.AhPlans.KEY_JUMP_UNKNOWN_SOURCE_ENABLE_FOR_ALL, 0) == 1) || z) {
                            if (!(jSONObject.optInt(DownloadSettingKeys.AhPlans.KEY_ALLOW_UNKNOWN_SOURCE_ON_STARTUP) == 1)) {
                                z2 = dr(context, intent, jSONObject, downloadInfo.getId(), drVar);
                                break;
                            }
                        }
                    }
                    break;
            }
            if (z2) {
                downloadInfo.getTempCacheData().put("ah_attempt", drVar.dr());
            }
            if (ge != null) {
                downloadInfo.getTempCacheData().put("intent", intent);
                ge.dr(downloadInfo, drVar);
            }
        }
        return z2;
    }

    private static boolean dr(Context context, DownloadInfo downloadInfo, JSONObject jSONObject, com.ss.android.socialbase.appdownloader.dr drVar, DownloadSetting downloadSetting) {
        boolean z;
        String optString = jSONObject.optString("type");
        drVar.dr = optString;
        Intent ge2 = com.ss.android.socialbase.appdownloader.dr.g.dr(context, "vbi", jSONObject, downloadInfo).ge();
        StringBuilder sb = new StringBuilder();
        try {
            z = ge(context, ge2);
        } catch (Throwable th) {
            sb.append(optString);
            sb.append(" startActivity failed : ");
            sb.append(dr(th));
            dr(drVar, 1);
            z = false;
        }
        if (!z) {
            drVar.o = sb.toString();
        } else {
            drVar.ge = 0;
        }
        return true;
    }

    private static boolean dr(Context context, DownloadInfo downloadInfo, JSONObject jSONObject, com.ss.android.socialbase.appdownloader.dr drVar) {
        boolean z;
        if (context == null || jSONObject == null) {
            return false;
        }
        String optString = jSONObject.optString(DownloadSettingKeys.AhPlans.KEY_AH_DEVICE_PLANS);
        drVar.q = optString;
        if (TextUtils.isEmpty(optString)) {
            return false;
        }
        String[] split = optString.split(",");
        String savePath = downloadInfo.getSavePath();
        if (TextUtils.isEmpty(savePath)) {
            return false;
        }
        File file = new File(savePath);
        StringBuilder sb = new StringBuilder();
        String str = null;
        int length = split.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                z = false;
                break;
            }
            String str2 = split[i];
            com.ss.android.socialbase.appdownloader.dr.dr dr2 = com.ss.android.socialbase.appdownloader.dr.g.dr(context, str2, jSONObject, downloadInfo);
            if (dr2 != null) {
                Intent ge2 = dr2.ge();
                if (ge2 != null) {
                    if (dr(file, downloadInfo, jSONObject)) {
                        try {
                            dr(context, ge2, false);
                            str = str2;
                            break;
                        } catch (Throwable th) {
                            sb.append(str2);
                            sb.append(" startActivity failed : ");
                            sb.append(dr(th));
                            dr(drVar, 1);
                        }
                    } else {
                        dr(drVar, 6);
                        sb.append(str2);
                        sb.append(" createDescFile failed! ");
                    }
                } else {
                    dr(drVar, 3);
                    sb.append(str2);
                    sb.append(" resolveActivity failed! ");
                }
            }
            sb.append("  ");
            i++;
        }
        if (!z) {
            drVar.o = sb.toString();
        } else {
            drVar.g = str;
            drVar.ge = 0;
        }
        return z;
    }

    private static boolean ge(Context context, DownloadInfo downloadInfo, JSONObject jSONObject, com.ss.android.socialbase.appdownloader.dr drVar) {
        if (context == null || jSONObject == null) {
            return false;
        }
        String savePath = downloadInfo.getSavePath();
        if (TextUtils.isEmpty(savePath)) {
            return false;
        }
        drVar.g = "custom";
        com.ss.android.socialbase.appdownloader.dr.dr dr2 = com.ss.android.socialbase.appdownloader.dr.g.dr(context, "custom", jSONObject, downloadInfo);
        if (dr2 == null || !dr2.dr()) {
            drVar.ge = 3;
            return false;
        }
        Intent ge2 = dr2.ge();
        if (ge2 == null) {
            return false;
        }
        if (dr(new File(savePath), downloadInfo, jSONObject)) {
            if (ge(context, ge2)) {
                drVar.ge = 0;
                return true;
            }
            drVar.ge = 1;
        } else {
            drVar.ge = 6;
        }
        return false;
    }

    public static int dr(DownloadSetting downloadSetting) {
        JSONObject optJSONObject = downloadSetting.optJSONObject(DownloadSettingKeys.KEY_ANTI_HIJACK_DIR);
        if (!(optJSONObject == null ? false : !TextUtils.isEmpty(optJSONObject.optString(DownloadSettingKeys.AntiHijackDir.KEY_ANTI_HIJACK_DIR_NAME)))) {
            return 5;
        }
        if (!DownloadSetting.obtainGlobal().optBugFix(DownloadSettingKeys.BugFix.BUGFIX_GET_DOWNLOAD_INFO_BY_LIST)) {
            return 4;
        }
        JSONArray optJSONArray = downloadSetting.optJSONArray(DownloadSettingKeys.KEY_AH_PLANS);
        int i = -1;
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                if (com.ss.android.socialbase.appdownloader.bn.dr.dr(optJSONObject2)) {
                    String optString = optJSONObject2.optString("type");
                    if ("plan_a".equals(optString) || "plan_b".equals(optString) || "plan_e".equals(optString) || "plan_f".equals(optString)) {
                        com.ss.android.socialbase.appdownloader.dr dr2 = dr(optJSONObject2, downloadSetting);
                        int i3 = dr2.ge;
                        if (dr2.ge == 0) {
                            return 0;
                        }
                        i = i3;
                    } else if ("plan_d".equalsIgnoreCase(optString) || "plan_h".equalsIgnoreCase(optString)) {
                        return 0;
                    } else {
                        if ("plan_g".equalsIgnoreCase(optString)) {
                            com.ss.android.socialbase.appdownloader.dr ge2 = ge(optJSONObject2, downloadSetting);
                            int i4 = ge2.ge;
                            if (ge2.ge == 0) {
                                return 0;
                            }
                            i = i4;
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        return i;
    }

    public static com.ss.android.socialbase.appdownloader.dr dr(JSONObject jSONObject, DownloadSetting downloadSetting) {
        com.ss.android.socialbase.appdownloader.dr drVar = new com.ss.android.socialbase.appdownloader.dr();
        if (jSONObject == null) {
            return drVar;
        }
        String optString = jSONObject.optString("type");
        drVar.dr = optString;
        if ("plan_b".equals(optString)) {
            drVar.q = "custom";
            if (com.ss.android.socialbase.appdownloader.dr.g.dr(DownloadComponentManager.getAppContext(), "custom", jSONObject, downloadSetting)) {
                drVar.ge = 0;
                return drVar;
            }
            dr(drVar, 3);
        } else {
            String optString2 = jSONObject.optString(DownloadSettingKeys.AhPlans.KEY_AH_DEVICE_PLANS);
            drVar.q = optString2;
            if (!TextUtils.isEmpty(optString2)) {
                for (String str : optString2.split(",")) {
                    if (com.ss.android.socialbase.appdownloader.dr.g.dr(DownloadComponentManager.getAppContext(), str, jSONObject, downloadSetting)) {
                        drVar.ge = 0;
                        return drVar;
                    }
                    dr(drVar, 3);
                }
            }
        }
        return drVar;
    }

    public static com.ss.android.socialbase.appdownloader.dr ge(JSONObject jSONObject, DownloadSetting downloadSetting) {
        com.ss.android.socialbase.appdownloader.dr drVar = new com.ss.android.socialbase.appdownloader.dr();
        if (jSONObject == null) {
            return drVar;
        }
        drVar.dr = jSONObject.optString("type");
        drVar.q = "vbi";
        if (com.ss.android.socialbase.appdownloader.dr.g.dr(DownloadComponentManager.getAppContext(), "vbi", jSONObject, downloadSetting)) {
            drVar.ge = 0;
        } else {
            dr(drVar, 3);
        }
        return drVar;
    }

    public static com.ss.android.socialbase.appdownloader.dr dr(JSONObject jSONObject, String str, Context context, DownloadSetting downloadSetting) {
        com.ss.android.socialbase.appdownloader.dr drVar = new com.ss.android.socialbase.appdownloader.dr();
        if (jSONObject == null || !com.ss.android.socialbase.appdownloader.bn.q.ge()) {
            return drVar;
        }
        drVar.dr = jSONObject.optString("type");
        if (downloadSetting.optInt("bi", 0) == 1) {
            drVar.ge = 0;
            return drVar;
        }
        if (dr(context)) {
            drVar.ge = 2;
        } else if (com.ss.android.socialbase.appdownloader.bn.dr.dr(str) != null) {
            drVar.ge = 0;
        } else {
            drVar.ge = 9;
        }
        return drVar;
    }

    private static void dr(com.ss.android.socialbase.appdownloader.dr drVar, int i) {
        if (drVar.ge != -1) {
            drVar.ge = (drVar.ge * 10) + i;
        } else {
            drVar.ge = i;
        }
    }

    private static boolean dr(File file, DownloadInfo downloadInfo, JSONObject jSONObject) {
        String str;
        if (file == null) {
            return false;
        }
        String path = file.getPath();
        JSONObject optJSONObject = DownloadSetting.obtain(downloadInfo.getId()).optJSONObject(DownloadSettingKeys.KEY_ANTI_HIJACK_DIR);
        File file2 = null;
        if (optJSONObject == null) {
            str = null;
        } else {
            str = optJSONObject.optString(DownloadSettingKeys.AntiHijackDir.KEY_ANTI_HIJACK_INSTALL_DESC);
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str)) {
            file2 = new File(path + File.separator + str);
        }
        if (file2 != null) {
            try {
                if (file2.createNewFile()) {
                    file2.deleteOnExit();
                    return true;
                }
                return true;
            } catch (IOException e) {
                return false;
            }
        }
        return true;
    }

    public static boolean dr(Context context, Intent intent, JSONObject jSONObject, int i, com.ss.android.socialbase.appdownloader.dr drVar) {
        if (context == null || jSONObject == null) {
            return false;
        }
        long optLong = jSONObject.optLong(DownloadSettingKeys.AhPlans.KEY_JUMP_INTERVAL, 0L);
        if (optLong <= 0) {
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(DownloadConstants.SP_ANTI_HIJACK_CONFIG, 0);
        if ((System.currentTimeMillis() - sharedPreferences.getLong(SpJsonConstants.KEY_LAST_JUMP_UNKNOWN_SOURCE_TIME, 0L)) / 60000 < optLong || dr(context)) {
            return false;
        }
        sharedPreferences.edit().putLong(SpJsonConstants.KEY_LAST_JUMP_UNKNOWN_SOURCE_TIME, System.currentTimeMillis()).apply();
        if (jSONObject.optInt(DownloadSettingKeys.AhPlans.KEY_SHOW_UNKNOWN_SOURCE_DIALOG, 0) == 1) {
            Intent intent2 = new Intent(context, JumpUnknownSourceActivity.class);
            intent2.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
            intent2.putExtra("intent", intent);
            intent2.putExtra("config", jSONObject.toString());
            intent2.putExtra("id", i);
            try {
                if (dr(context, intent2, false)) {
                    g(i, jSONObject);
                }
                return true;
            } catch (Throwable th) {
                if (drVar != null) {
                    drVar.ge = 1;
                    drVar.o = "tryShowUnknownSourceDialog" + dr(th);
                }
                return false;
            }
        }
        if (dr(context, intent, i, jSONObject)) {
            o(i, jSONObject);
        }
        return true;
    }

    public static boolean dr(Context context, Intent intent, int i, JSONObject jSONObject) {
        try {
            if (com.ss.android.socialbase.appdownloader.bn.q.ge() && Build.VERSION.SDK_INT < 26 && !g(context)) {
                com.ss.android.socialbase.appdownloader.dr.bn bnVar = new com.ss.android.socialbase.appdownloader.dr.bn(context);
                if (bnVar.dr()) {
                    dr(context, intent, i, jSONObject, new InterfaceC0307ge() { // from class: com.ss.android.socialbase.appdownloader.ge.1
                        @Override // com.ss.android.socialbase.appdownloader.ge.InterfaceC0307ge
                        public boolean dr(Context context2) {
                            return ge.g(context2);
                        }
                    });
                    return ge(context, bnVar.ge());
                }
            } else if (Build.VERSION.SDK_INT < 26 || context.getApplicationInfo().targetSdkVersion < 26 || q(context)) {
                return false;
            } else {
                com.ss.android.socialbase.appdownloader.dr.ge geVar = new com.ss.android.socialbase.appdownloader.dr.ge(context);
                if (geVar.dr()) {
                    dr(context, intent, i, jSONObject, new InterfaceC0307ge() { // from class: com.ss.android.socialbase.appdownloader.ge.2
                        @Override // com.ss.android.socialbase.appdownloader.ge.InterfaceC0307ge
                        public boolean dr(Context context2) {
                            return ge.q(context2);
                        }
                    });
                    return ge(context, geVar.ge());
                }
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    public static boolean dr(Context context) {
        if (context == null) {
            return true;
        }
        try {
            if (com.ss.android.socialbase.appdownloader.bn.q.ge() && Build.VERSION.SDK_INT < 26) {
                return g(context);
            }
            if (Build.VERSION.SDK_INT < 26 || context.getApplicationInfo().targetSdkVersion < 26) {
                return true;
            }
            return q(context);
        } catch (Throwable th) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(Context context) {
        if (context == null) {
            return true;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "install_non_market_apps", 1) > 0;
        } catch (Throwable th) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Context context) {
        if (context == null) {
            return true;
        }
        try {
            return context.getPackageManager().canRequestPackageInstalls();
        } catch (Throwable th) {
            return true;
        }
    }

    public static boolean dr() {
        return q.dr == 1;
    }

    private static void g(int i, JSONObject jSONObject) {
        int i2 = 1;
        boolean z = jSONObject.optInt(DownloadSettingKeys.AhPlans.KEY_ALLOW_UNKNOWN_SOURCE_ON_STARTUP) == 1;
        JSONObject jSONObject2 = new JSONObject();
        if (!z) {
            i2 = 2;
        }
        try {
            jSONObject2.put("scene", i2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        DownloadComponentManager.getEventListener().onUnityEvent(i, MonitorConstants.UnityLabel.GUIDE_AUTH_DIALOG_SHOW, jSONObject2);
    }

    public static void dr(int i, JSONObject jSONObject) {
        int i2 = 1;
        boolean z = jSONObject.optInt(DownloadSettingKeys.AhPlans.KEY_ALLOW_UNKNOWN_SOURCE_ON_STARTUP) == 1;
        JSONObject jSONObject2 = new JSONObject();
        if (!z) {
            i2 = 2;
        }
        try {
            jSONObject2.put("scene", i2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        DownloadComponentManager.getEventListener().onUnityEvent(i, MonitorConstants.UnityLabel.GUIDE_AUTH_DIALOG_CONFIRM, jSONObject2);
    }

    public static void ge(int i, JSONObject jSONObject) {
        int i2 = 1;
        boolean z = jSONObject.optInt(DownloadSettingKeys.AhPlans.KEY_ALLOW_UNKNOWN_SOURCE_ON_STARTUP) == 1;
        JSONObject jSONObject2 = new JSONObject();
        if (!z) {
            i2 = 2;
        }
        try {
            jSONObject2.put("scene", i2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        DownloadComponentManager.getEventListener().onUnityEvent(i, MonitorConstants.UnityLabel.GUIDE_AUTH_DIALOG_CANCEL, jSONObject2);
    }

    public static void o(int i, JSONObject jSONObject) {
        int i2 = 1;
        boolean z = jSONObject.optInt(DownloadSettingKeys.AhPlans.KEY_ALLOW_UNKNOWN_SOURCE_ON_STARTUP) == 1;
        JSONObject jSONObject2 = new JSONObject();
        if (!z) {
            i2 = 2;
        }
        try {
            jSONObject2.put("scene", i2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        DownloadComponentManager.getEventListener().onUnityEvent(i, MonitorConstants.UnityLabel.GUIDE_AUTH_OPEN_SETTING, jSONObject2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ge(int i, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        int i2 = 1;
        try {
            jSONObject.put("scene", z ? 1 : 2);
            if (!z2) {
                i2 = 2;
            }
            jSONObject.put("result_code", i2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        DownloadComponentManager.getEventListener().onUnityEvent(i, MonitorConstants.UnityLabel.GUIDE_AUTH_RESULT, jSONObject);
    }

    private static void dr(Context context, Intent intent, int i, JSONObject jSONObject, InterfaceC0307ge interfaceC0307ge) {
        if (o != null) {
            AppStatusManager.getInstance().unregisterAppSwitchListener(o);
            o = null;
        }
        o = new dr(context, intent, i, jSONObject, interfaceC0307ge);
        AppStatusManager.getInstance().registerAppSwitchListener(o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean ge(Context context, Intent intent) {
        return dr(context, intent, true);
    }

    public static boolean dr(Context context, Intent intent, boolean z) {
        if (context == null || intent == null) {
            return false;
        }
        if (z) {
            try {
                intent.putExtra(BaseConstants.START_ONLY_FOR_ANDROID, true);
                context.startActivity(intent);
                return true;
            } catch (Throwable th) {
                return false;
            }
        }
        intent.putExtra(BaseConstants.START_ONLY_FOR_ANDROID, true);
        context.startActivity(intent);
        return true;
    }

    public static String dr(Throwable th) {
        String th2 = th.toString();
        if (th2.length() > 800) {
            return th2.substring(0, TTAdConstant.SHOW_POLL_TIME_SPLASH_DEFAULT);
        }
        return th2;
    }

    /* loaded from: classes3.dex */
    private static class g implements Callable<Boolean> {
        private final Context dr;
        private final long g;
        private final InterfaceC0307ge ge;
        private final Handler o;

        public g(Handler handler, Context context, InterfaceC0307ge interfaceC0307ge, long j) {
            this.dr = context;
            this.ge = interfaceC0307ge;
            this.o = handler;
            this.g = j;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() throws Exception {
            InterfaceC0307ge interfaceC0307ge;
            boolean z;
            try {
                interfaceC0307ge = this.ge;
            } catch (Throwable th) {
            }
            if (interfaceC0307ge != null) {
                long j = this.g;
                if (j > 0 && j <= 10000) {
                    Context context = this.dr;
                    if (context == null) {
                        z = false;
                    } else {
                        z = interfaceC0307ge.dr(context);
                    }
                    Message obtain = Message.obtain();
                    if (z) {
                        obtain.what = 2;
                        this.o.sendMessage(obtain);
                    } else {
                        obtain.what = 1;
                        this.o.sendMessageDelayed(obtain, this.g);
                    }
                    return false;
                }
            }
            return false;
        }
    }

    public static void dr(o oVar) {
        ge = oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class dr implements AppStatusManager.AppStatusChangeListener {
        private final q dr;
        private final int ge;
        private JSONObject o;

        public dr(Context context, Intent intent, int i, JSONObject jSONObject, InterfaceC0307ge interfaceC0307ge) {
            this.o = jSONObject;
            int optInt = jSONObject.optInt(DownloadSettingKeys.AhPlans.KEY_JUMP_UNKNWON_SOURCE_QUERY_INTERVAL, 1000);
            this.ge = optInt;
            this.dr = new q(context, intent, i, interfaceC0307ge, optInt);
        }

        @Override // com.ss.android.socialbase.downloader.common.AppStatusManager.AppStatusChangeListener
        public void onAppForeground() {
            if (!this.dr.ll) {
                Message obtain = Message.obtain();
                obtain.what = 2;
                this.dr.bn.sendMessage(obtain);
            }
            AppStatusManager.getInstance().unregisterAppSwitchListener(this);
            dr unused = ge.o = null;
        }

        @Override // com.ss.android.socialbase.downloader.common.AppStatusManager.AppStatusChangeListener
        public void onAppBackground() {
            int optInt = this.o.optInt(DownloadSettingKeys.AhPlans.KEY_JUMP_UNKNWON_SOURCE_WAIT_TIME_OUT, 20);
            Message obtain = Message.obtain();
            obtain.what = 1;
            this.dr.bn.sendMessage(obtain);
            if (optInt > 0 && optInt < 60) {
                Message obtain2 = Message.obtain();
                obtain2.what = 2;
                this.dr.bn.sendMessageDelayed(obtain2, optInt * 1000);
            }
        }
    }

    /* loaded from: classes3.dex */
    private static class q implements WeakDownloadHandler.IHandler {
        public static int dr;
        private static int ge;
        private final Handler bn;
        private final Intent g;
        private boolean ll = false;
        private final Context o;
        private final InterfaceC0307ge q;
        private final long rb;
        private Future<Boolean> xu;

        public q(Context context, Intent intent, int i, InterfaceC0307ge interfaceC0307ge, long j) {
            this.o = context;
            this.g = intent;
            ge = i;
            this.q = interfaceC0307ge;
            this.bn = new WeakDownloadHandler(Looper.getMainLooper(), this);
            this.rb = j;
        }

        @Override // com.ss.android.socialbase.downloader.thread.WeakDownloadHandler.IHandler
        public void handleMsg(Message message) {
            if (message != null) {
                if (message.what == 1) {
                    long j = this.rb;
                    if (j <= 0 || j > 10000) {
                        return;
                    }
                    dr = 1;
                    this.xu = DownloadComponentManager.getCPUThreadExecutor().submit(new g(this.bn, this.o, this.q, this.rb));
                } else if (message.what == 2) {
                    dr = 2;
                    this.bn.removeMessages(2);
                    this.bn.removeMessages(1);
                    Future<Boolean> future = this.xu;
                    if (future != null) {
                        future.cancel(true);
                    }
                    if (!this.ll && (Build.VERSION.SDK_INT < 29 || AppStatusManager.getInstance().isAppForeground())) {
                        Intent intent = this.g;
                        if (intent != null) {
                            ge.ge(this.o, intent);
                        } else {
                            DownloadInfo downloadInfo = Downloader.getInstance(this.o).getDownloadInfo(ge);
                            if (downloadInfo != null && downloadInfo.isDownloadOverStatus()) {
                                com.ss.android.socialbase.appdownloader.o.ge(this.o, ge, false);
                            }
                        }
                        this.ll = true;
                    }
                    ge.ge(ge, this.g == null, ge.dr(this.o));
                }
            }
        }
    }
}
