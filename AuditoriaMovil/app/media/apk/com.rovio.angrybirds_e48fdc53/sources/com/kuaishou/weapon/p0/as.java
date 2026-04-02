package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import com.kuaishou.weapon.p0.jni.Engine;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class as extends df {
    private JSONObject a;

    public as(Context context, int i) {
        if (Engine.loadSuccess) {
            try {
                Engine engine = Engine.getInstance(context);
                int intValue = Integer.valueOf(cj.c).intValue();
                String a = a(context);
                if (TextUtils.isEmpty(a)) {
                    return;
                }
                String eopq = engine.eopq(intValue, 0, i, a);
                if (TextUtils.isEmpty(eopq)) {
                    return;
                }
                this.a = new JSONObject(eopq);
            } catch (Throwable th) {
            }
        }
    }

    private String a(Context context) {
        try {
            StringBuilder sb = new StringBuilder();
            h a = h.a(context, "re_po_rt");
            sb.append(a.b(de.aa, 1));
            sb.append(a.b(de.X, 1));
            sb.append(a.b(de.V, 1));
            sb.append(a.b(de.Z, 1));
            sb.append(a.b(de.ab, 1));
            sb.append(a.b(de.ad, 1));
            sb.append(a.b(de.Y, 1));
            sb.append(a.b(de.U, 1));
            sb.append(a.b(de.ag, 1));
            sb.append(a.b(de.ae, 1));
            sb.append(a.b(de.af, 1));
            return sb.toString();
        } catch (Exception e) {
            return "";
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

    public JSONObject a() {
        return this.a;
    }

    public String b(String str) {
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString(str);
                return !TextUtils.isEmpty(string) ? string.replace("\n", "").replace("\t", " ") : string;
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    public JSONArray c(String str) {
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString(str);
                if (TextUtils.isEmpty(string) || string.length() <= 3) {
                    return null;
                }
                String replaceAll = string.replaceAll("\\n", "");
                if (!TextUtils.isEmpty(replaceAll)) {
                    string = replaceAll;
                }
                JSONArray jSONArray = new JSONArray(string);
                if (jSONArray.length() > 1) {
                    return jSONArray;
                }
                return null;
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    public JSONObject d(String str) {
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString(str);
                if (TextUtils.isEmpty(string) || string.length() <= 2) {
                    return null;
                }
                JSONObject jSONObject2 = new JSONObject(string);
                if (jSONObject2.length() > 1) {
                    return jSONObject2;
                }
                return null;
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    public String e(String str) {
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString(str);
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                if (string.length() > 2) {
                    return string;
                }
                return null;
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }
}
