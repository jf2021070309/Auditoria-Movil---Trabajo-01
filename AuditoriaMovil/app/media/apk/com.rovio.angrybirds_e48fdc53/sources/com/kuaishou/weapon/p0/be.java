package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.kuaishou.weapon.p0.jni.Engine;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class be {
    private JSONObject a;

    public be(Context context, int i) {
        if (Engine.loadSuccess) {
            try {
                String pqr = Engine.getInstance(context).pqr(Integer.valueOf(cj.c).intValue(), 5, i, "");
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
                return jSONObject.getString(str);
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    public Set a(Set set) {
        if (set != null) {
            try {
                if (set.size() > 0) {
                    HashSet hashSet = new HashSet();
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!a(set, str)) {
                            hashSet.add(str);
                        }
                    }
                    return hashSet;
                }
            } catch (Exception e) {
            }
        }
        return null;
    }

    public JSONObject a() {
        return this.a;
    }

    public JSONObject a(JSONArray jSONArray) {
        String str;
        if (jSONArray != null && jSONArray.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    String string = jSONArray.getString(i);
                    if (string.contains("data/data")) {
                        if (string.contains("libjnigraphics.so")) {
                            jSONObject.put(AppEventsConstants.EVENT_PARAM_VALUE_NO, 1);
                            str = "0-p";
                        } else if (string.contains("libandroid.so")) {
                            jSONObject.put("1", 1);
                            str = "1-p";
                        } else if (string.contains("libjavacrypto.so")) {
                            jSONObject.put("2", 1);
                            str = "2-p";
                        } else if (string.contains("libRSCpuRef.so")) {
                            jSONObject.put("3", 1);
                            str = "3-p";
                        }
                        jSONObject.put(str, string);
                    }
                }
                if (jSONObject.length() > 0) {
                    return jSONObject;
                }
                return null;
            } catch (Exception e) {
            }
        }
        return null;
    }

    public boolean a(Set set, String str) {
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!str2.equals(str) && str2.contains(str)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public JSONArray b(String str) {
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString(str);
                if (TextUtils.isEmpty(string) || string.length() <= 2) {
                    return null;
                }
                JSONArray jSONArray = new JSONArray(string);
                HashSet hashSet = new HashSet();
                for (int i = 0; i < jSONArray.length(); i++) {
                    hashSet.add((String) jSONArray.get(i));
                }
                Set a = a(hashSet);
                if (a == null || a.size() <= 0) {
                    return null;
                }
                return new JSONArray((Collection) a);
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }
}
