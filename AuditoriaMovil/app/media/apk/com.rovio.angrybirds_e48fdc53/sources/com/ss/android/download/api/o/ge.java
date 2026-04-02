package com.ss.android.download.api.o;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class ge {
    public static long dr(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return 0L;
        }
        try {
            return Long.valueOf(jSONObject.optString(str)).longValue();
        } catch (NumberFormatException e) {
            return 0L;
        }
    }

    public static boolean dr(DownloadSetting downloadSetting, String str) {
        if (downloadSetting != null && downloadSetting.optInt("apk_update_handler_enable", 1) == 1) {
            return "application/ttpatch".equals(str);
        }
        return false;
    }

    public static JSONObject dr(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject2;
    }

    public static JSONObject dr(JSONObject jSONObject) {
        return dr(jSONObject, new JSONObject());
    }

    public static JSONObject dr(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        if (jSONObjectArr == null || jSONObjectArr.length == 0) {
            return jSONObject;
        }
        for (JSONObject jSONObject2 : jSONObjectArr) {
            if (jSONObject2 != null) {
                dr(jSONObject2, jSONObject);
            }
        }
        return jSONObject;
    }

    public static String dr(String... strArr) {
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }
}
