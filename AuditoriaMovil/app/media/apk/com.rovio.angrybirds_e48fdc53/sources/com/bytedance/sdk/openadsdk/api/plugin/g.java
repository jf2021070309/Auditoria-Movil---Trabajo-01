package com.bytedance.sdk.openadsdk.api.plugin;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import bolts.MeasurementEvent;
import com.bytedance.sdk.openadsdk.AdConfig;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTCustomController;
import com.bytedance.sdk.openadsdk.api.plugin.rb;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.qq.e.comm.pi.ACTD;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g {
    private static SharedPreferences o;
    private static ScheduledExecutorService ge = Executors.newSingleThreadScheduledExecutor(new rb.ge("tt_pangle_thread_pl_report"));
    private static final List<Pair<String, JSONObject>> g = new ArrayList();
    static final Map<String, String> dr = new HashMap();
    private static volatile boolean q = false;

    public static void dr(Context context) {
        o = context.getSharedPreferences("tt_sdk_settings_other", 0);
    }

    public static final void dr(int i, String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("duration", Long.valueOf(j));
            jSONObject.putOpt(PluginConstants.KEY_ERROR_CODE, Integer.valueOf(i));
            jSONObject.putOpt(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        q("plugin_load_failed", jSONObject);
    }

    public static void dr(String str, JSONObject jSONObject) {
        q("zeus_" + str, jSONObject);
    }

    public static void dr() {
        if (!q) {
            try {
                q = true;
                ge.shutdown();
            } catch (Throwable th) {
            }
        }
    }

    private static void q(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        TTAdManager adManager = TTAdSdk.getAdManager();
        if (adManager != null) {
            Bundle bundle = new Bundle();
            bundle.putInt(NativeProtocol.WEB_DIALOG_ACTION, 1);
            bundle.putString(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY, str);
            bundle.putString("event_extra", jSONObject.toString());
            adManager.getExtra(Bundle.class, bundle);
            return;
        }
        ge(str, jSONObject);
    }

    public static final void ge(int i, String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("duration", Long.valueOf(j));
            jSONObject.putOpt(PluginConstants.KEY_ERROR_CODE, Integer.valueOf(i));
            jSONObject.putOpt(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ge("plugin_load_failed", jSONObject);
    }

    public static void ge(final String str, final JSONObject jSONObject) {
        if (!q) {
            ge.execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.plugin.g.1
                @Override // java.lang.Runnable
                public void run() {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(g.bn(str, jSONObject));
                    g.o(arrayList);
                }
            });
        }
    }

    public static void dr(final List<JSONObject> list) {
        if (!q) {
            if (list != null && list.isEmpty() && g.isEmpty()) {
                return;
            }
            ge.execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.plugin.g.2
                @Override // java.lang.Runnable
                public void run() {
                    g.o(list);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject bn(String str, JSONObject jSONObject) {
        String str2 = "5.3.0.5";
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            jSONObject.put("support_abi", Arrays.toString(Build.VERSION.SDK_INT >= 21 ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2}));
            jSONObject2.put("ad_sdk_version", "5.3.0.5");
            String dr2 = bn.dr("com.byted.pangle");
            if (!TextUtils.isEmpty(dr2)) {
                str2 = dr2;
            }
            jSONObject2.put(PluginConstants.KEY_PLUGIN_VERSION, str2);
            jSONObject2.put("timestamp", System.currentTimeMillis() / 1000);
            jSONObject2.put("is_plugin", true);
            jSONObject2.put("event_extra", jSONObject != null ? jSONObject.toString() : "");
            jSONObject2.put("type", str);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("model", Build.MODEL);
            jSONObject3.put("vendor", Build.MANUFACTURER);
            Map<String, String> map = dr;
            jSONObject3.put("imei", map.get("imei"));
            jSONObject3.put("oaid", map.get("oaid"));
            jSONObject2.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, jSONObject3);
        } catch (JSONException e) {
        }
        return jSONObject2;
    }

    public static void o(String str, JSONObject jSONObject) {
        g.add(new Pair<>(str, jSONObject));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(List<JSONObject> list) {
        if (list == null) {
            return;
        }
        SharedPreferences sharedPreferences = o;
        String format = String.format("https://%s%s", sharedPreferences != null ? sharedPreferences.getString("url_alog", "api-access.pangolin-sdk-toutiao.com") : "api-access.pangolin-sdk-toutiao.com", "/api/ad/union/sdk/stats/batch/");
        JSONObject jSONObject = new JSONObject();
        try {
            List<Pair<String, JSONObject>> list2 = g;
            if (list2.size() > 0) {
                Iterator<Pair<String, JSONObject>> it = list2.iterator();
                while (it.hasNext()) {
                    Pair<String, JSONObject> next = it.next();
                    list.add(bn((String) next.first, (JSONObject) next.second));
                    it.remove();
                }
            }
            jSONObject.put("stats_list", new JSONArray((Collection) list));
        } catch (JSONException e) {
        }
        com.bytedance.sdk.openadsdk.api.plugin.dr.o.dr().dr(true, format, com.bytedance.sdk.openadsdk.api.plugin.ge.ge.dr(jSONObject).toString().getBytes());
    }

    public static void dr(final Bundle bundle) {
        if (!q) {
            ge.execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.plugin.g.3
                @Override // java.lang.Runnable
                public void run() {
                    Bundle bundle2 = bundle;
                    if (bundle2 == null) {
                        return;
                    }
                    try {
                        String string = bundle2.getString(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY);
                        String string2 = bundle.getString("event_extra");
                        JSONObject jSONObject = TextUtils.isEmpty(string2) ? new JSONObject() : new JSONObject(string2);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(g.bn(string, jSONObject));
                        g.o(arrayList);
                    } catch (Exception e) {
                    }
                }
            });
        }
    }

    public static void dr(AdConfig adConfig) {
        if (adConfig == null) {
            return;
        }
        Map<String, String> map = dr;
        map.put(ACTD.APPID_KEY, adConfig.getAppId());
        Object extra = adConfig.getExtra("plugin_update_conf");
        if (extra instanceof Integer) {
            String num = ((Integer) extra).toString();
            if (num == null) {
                num = "2";
            }
            map.put("plugin_update_conf", num);
        }
        TTCustomController customController = adConfig.getCustomController();
        if (customController != null) {
            try {
                map.put("oaid", customController.getDevOaid());
                map.put("imei", customController.getDevImei());
            } catch (Exception e) {
            }
        }
    }
}
