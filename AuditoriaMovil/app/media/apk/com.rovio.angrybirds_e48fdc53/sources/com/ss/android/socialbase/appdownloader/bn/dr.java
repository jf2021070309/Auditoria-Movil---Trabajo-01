package com.ss.android.socialbase.appdownloader.bn;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.TextUtils;
import com.ss.android.download.api.constant.BaseConstants;
import com.ss.android.socialbase.appdownloader.rb;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class dr {
    private static final HashMap<String, rb.dr> dr = new HashMap<>();

    public static boolean dr(JSONArray jSONArray, String str) {
        if (jSONArray == null || TextUtils.isEmpty(str)) {
            return false;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null && str.equals(optJSONObject.optString("type")) && dr(optJSONObject)) {
                return true;
            }
        }
        return false;
    }

    public static boolean dr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        return ge(jSONObject) && dr(jSONObject.optJSONArray(DownloadSettingKeys.AhPlans.KEY_AH_DEVICE_REQUIREMENTS)) && o(jSONObject);
    }

    public static boolean ge(JSONObject jSONObject) {
        if (jSONObject == null) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        String optString = jSONObject.optString(DownloadSettingKeys.AhPlans.KEY_ALLOW_OS_API_RANGE);
        int optInt = jSONObject.optInt(DownloadSettingKeys.AhPlans.KEY_MIN_OS_API, -1);
        if (TextUtils.isEmpty(optString)) {
            return optInt <= 0 || i >= optInt;
        }
        try {
            String[] split = optString.split("[-,]");
            for (int i2 = 0; i2 < split.length; i2 += 2) {
                int parseInt = Integer.parseInt(split[i2]);
                int parseInt2 = Integer.parseInt(split[i2 + 1]);
                if (i >= parseInt && i <= parseInt2) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean o(JSONObject jSONObject) {
        return jSONObject == null || bn.dr() || jSONObject.optInt(DownloadSettingKeys.AhPlans.KEY_SECURITY_MODE) != 1;
    }

    public static boolean dr(JSONArray jSONArray) {
        int length;
        String[] split;
        if (jSONArray == null || (length = jSONArray.length()) == 0) {
            return true;
        }
        boolean z = false;
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString(DownloadSettingKeys.AhPlans.DeviceRequirements.KEY_ANTI_HIJACK_PACKAGE_NAMES);
                JSONArray optJSONArray = optJSONObject.optJSONArray(DownloadSettingKeys.AhPlans.DeviceRequirements.KEY_ANTI_HIJACK_VERSION_ALLOW);
                JSONArray optJSONArray2 = optJSONObject.optJSONArray(DownloadSettingKeys.AhPlans.DeviceRequirements.KEY_ANTI_HIJACK_VERSION_BLOCK);
                String optString2 = optJSONObject.optString(DownloadSettingKeys.AhPlans.DeviceRequirements.KEY_ALLOW_VERSION_RANGE);
                if (TextUtils.isEmpty(optString)) {
                    return false;
                }
                for (String str : optString.split(",")) {
                    if (BaseConstants.SCHEME_MARKET.equals(str)) {
                        str = q.ll();
                    }
                    rb.dr ge = ge(str);
                    if (ge != null && !(z = dr(optJSONArray, optJSONArray2, optString2, ge))) {
                        return false;
                    }
                }
                continue;
            }
        }
        return z;
    }

    private static boolean dr(JSONArray jSONArray, JSONArray jSONArray2, String str, rb.dr drVar) {
        String rb = drVar.rb();
        int bn = drVar.bn();
        String str2 = bn + "_" + rb;
        if (!TextUtils.isEmpty(str)) {
            try {
                String[] split = str.split("[-,]");
                for (int i = 0; i < split.length; i += 2) {
                    int parseInt = Integer.parseInt(split[i]);
                    int parseInt2 = Integer.parseInt(split[i + 1]);
                    if (bn >= parseInt && bn <= parseInt2) {
                        return true;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (jSONArray != null && jSONArray.length() > 0) {
            if (ge(jSONArray, str2)) {
                return true;
            }
        } else if (jSONArray2 != null && jSONArray2.length() > 0 && !ge(jSONArray2, str2)) {
            return true;
        }
        return false;
    }

    private static boolean ge(JSONArray jSONArray, String str) {
        if (jSONArray == null || str == null) {
            return false;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            if (str.equalsIgnoreCase(jSONArray.optString(i).trim())) {
                return true;
            }
        }
        return false;
    }

    private static rb.dr ge(String str) {
        HashMap<String, rb.dr> hashMap = dr;
        if (hashMap.containsKey(str)) {
            rb.dr drVar = hashMap.get(str);
            if (drVar != null) {
                return drVar;
            }
            return null;
        }
        rb.dr ge = rb.ge(str);
        hashMap.put(str, ge);
        if (ge != null) {
            return ge;
        }
        return null;
    }

    public static rb.dr dr(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                rb.dr ge = ge(str);
                if (ge != null) {
                    return ge;
                }
            }
        } catch (Throwable th) {
        }
        return null;
    }

    public static boolean dr(JSONObject jSONObject, Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null || jSONObject == null) {
            return false;
        }
        String optString = jSONObject.optString("s");
        try {
            String dr2 = o.dr(jSONObject.optString("az"), optString);
            String dr3 = o.dr(jSONObject.optString("ba"), optString);
            Field declaredField = ContextWrapper.class.getDeclaredField(dr2);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(context);
            Field declaredField2 = obj.getClass().getDeclaredField(dr3);
            declaredField2.setAccessible(true);
            declaredField2.set(obj, str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
