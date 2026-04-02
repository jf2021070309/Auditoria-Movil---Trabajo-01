package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import com.kuaishou.weapon.p0.jni.Engine;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class aw {
    private JSONObject a;

    public aw(Context context) {
        if (Engine.loadSuccess) {
            try {
                String pqr = Engine.getInstance(context).pqr(Integer.valueOf(cj.g).intValue(), 1, 0, "");
                if (TextUtils.isEmpty(pqr)) {
                    return;
                }
                this.a = new JSONObject(pqr);
            } catch (Throwable th) {
            }
        }
    }

    public String a(String str) {
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            try {
                return jSONObject.optString(str, null);
            } catch (Exception e) {
            }
        }
        return null;
    }

    public Set a(int i) {
        HashSet hashSet = new HashSet();
        if (i == 1) {
            hashSet.add("HeapTaskDa");
            hashSet.add("queued-wor");
            hashSet.add("JDWP");
            hashSet.add("dTi");
            hashSet.add("MessageHan");
            hashSet.add("MediaPrefe");
            hashSet.add("CleanupRef");
            hashSet.add("GeoLocatio");
            hashSet.add("securityai");
            hashSet.add("Connectivi");
            hashSet.add("PatchManag");
            hashSet.add("CronetInte");
            hashSet.add("AegonLogge");
            hashSet.add("Countly");
            hashSet.add("DownloadSt");
            hashSet.add("GoogleApiH");
            hashSet.add("PlatformSe");
            hashSet.add("MemoryInfr");
            hashSet.add("CronetLibr");
            hashSet.add("Dex2OatIni");
            hashSet.add("EncodeApiH");
            hashSet.add("CookieMons");
        }
        return hashSet;
    }

    public Set a(Context context, String str, int i) {
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString(str);
                Set a = a(i);
                if (TextUtils.isEmpty(string) || string.length() <= 3) {
                    return null;
                }
                JSONArray jSONArray = new JSONArray(string);
                HashSet hashSet = new HashSet();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String string2 = jSONArray.getString(i2);
                    if (!string2.contains("azeroth") && !string2.contains("OkHttp") && !string2.contains("retrofit")) {
                        int i3 = 0;
                        do {
                            if (!string2.contains(" ")) {
                                break;
                            }
                            string2 = string2.replace(" ", "");
                            i3++;
                        } while (i3 <= 200);
                        String replace = string2.replace("\n", "").replace("\t", "").replace("\u200b", "");
                        if (replace.startsWith(":")) {
                            replace = replace.substring(1);
                        }
                        String substring = replace.length() > 10 ? replace.substring(0, 10) : replace;
                        if (replace.contains("ridge")) {
                            hashSet.add(replace);
                        }
                        String packageName = context.getPackageName();
                        if (!replace.contains(packageName) && !packageName.contains(replace) && !a.contains(substring) && !b(i).contains(substring)) {
                            hashSet.add(replace);
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    return hashSet;
                }
                return null;
            } catch (Throwable th) {
                return null;
            }
        }
        return null;
    }

    public Set b(int i) {
        HashSet hashSet = new HashSet();
        if (i == 1) {
            hashSet.add("AudioTrack");
            hashSet.add("processrea");
            hashSet.add("RemitDatab");
            hashSet.add("BrowserBlo");
            hashSet.add("game_push");
            hashSet.add("Godzilla:I");
            hashSet.add("IndexedDB");
            hashSet.add("ScopeRetry");
            hashSet.add("RobustPatc");
            hashSet.add("FrescoIoBo");
            hashSet.add("key_config");
        }
        return hashSet;
    }
}
