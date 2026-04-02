package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfhi {
    private static WindowManager zzb;
    private static final String[] zzc = {"x", "y", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY};
    static float zza = Resources.getSystem().getDisplayMetrics().density;

    public static void zza(Context context) {
        if (context != null) {
            zza = context.getResources().getDisplayMetrics().density;
            zzb = (WindowManager) context.getSystemService("window");
        }
    }

    public static JSONObject zzb(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / zza);
            jSONObject.put("y", i2 / zza);
            jSONObject.put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, i3 / zza);
            jSONObject.put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, i4 / zza);
        } catch (JSONException e) {
            zzfhj.zza("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    public static void zzc(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
            sb.append("JSONException during JSONObject.put for name [");
            sb.append(str);
            sb.append("]");
            zzfhj.zza(sb.toString(), e);
        }
    }

    public static void zzd(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            zzfhj.zza("Error with setting ad session id", e);
        }
    }

    public static void zze(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            zzfhj.zza("Error with setting not visible reason", e);
        }
    }

    public static void zzf(JSONObject jSONObject, zzfhm zzfhmVar) {
        zzfgu zzb2 = zzfhmVar.zzb();
        JSONArray jSONArray = new JSONArray();
        ArrayList<String> zzc2 = zzfhmVar.zzc();
        int size = zzc2.size();
        for (int i = 0; i < size; i++) {
            jSONArray.put(zzc2.get(i));
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", zzb2.zzb());
            jSONObject.put("friendlyObstructionPurpose", zzb2.zzc());
            jSONObject.put("friendlyObstructionReason", zzb2.zzd());
        } catch (JSONException e) {
            zzfhj.zza("Error with setting friendly obstruction", e);
        }
    }

    public static void zzg(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            zzged.zzb(e);
        }
    }

    public static void zzh(JSONObject jSONObject) {
        float f;
        Point point;
        float f2 = 0.0f;
        if (Build.VERSION.SDK_INT >= 17) {
            if (zzb != null) {
                zzb.getDefaultDisplay().getRealSize(new Point(0, 0));
                f2 = point.x / zza;
                f = point.y / zza;
            }
            f = 0.0f;
        } else {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                float f3 = 0.0f;
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        double optDouble = optJSONObject.optDouble("x");
                        double optDouble2 = optJSONObject.optDouble("y");
                        double optDouble3 = optJSONObject.optDouble(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
                        double optDouble4 = optJSONObject.optDouble(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
                        f2 = Math.max(f2, (float) (optDouble + optDouble3));
                        f3 = Math.max(f3, (float) (optDouble2 + optDouble4));
                    }
                }
                f = f3;
            }
            f = 0.0f;
        }
        try {
            jSONObject.put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, f2);
            jSONObject.put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, f);
        } catch (JSONException e) {
            zzged.zzb(e);
        }
    }

    public static boolean zzi(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = zzc;
            int i = 0;
            while (true) {
                if (i < 4) {
                    String str = strArr[i];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (zzj(optJSONArray, optJSONArray2)) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                if (!optJSONArray.optString(i2, "").equals(optJSONArray2.optString(i2, ""))) {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (optJSONArray3 != null || optJSONArray4 != null) {
                        if (zzj(optJSONArray3, optJSONArray4)) {
                            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                                if (zzi(optJSONArray3.optJSONObject(i3), optJSONArray4.optJSONObject(i3))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean zzj(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
