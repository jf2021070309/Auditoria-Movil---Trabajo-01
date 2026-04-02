package com.facebook.unity;

import android.os.Bundle;
import android.util.Log;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class UnityParams {
    JSONObject json;

    public UnityParams(String str) throws JSONException {
        this.json = new JSONObject(str);
    }

    public UnityParams(JSONObject jSONObject) {
        this.json = jSONObject;
    }

    public UnityParams(Map<String, Serializable> map) {
        this.json = new JSONObject(map);
    }

    public static UnityParams parse(String str, String str2) {
        try {
            return new UnityParams(str);
        } catch (JSONException unused) {
            Log.e(FB.TAG, str2);
            return null;
        }
    }

    public static UnityParams parse(String str) {
        return parse(str, "couldn't parse params: " + str);
    }

    public String getString(String str) {
        try {
            return this.json.getString(str);
        } catch (JSONException unused) {
            String str2 = FB.TAG;
            Log.e(str2, "cannot get string " + str + " from " + toString());
            return "";
        }
    }

    public double getDouble(String str) {
        try {
            return this.json.getDouble(str);
        } catch (JSONException unused) {
            String str2 = FB.TAG;
            Log.e(str2, "cannot get double " + str + " from " + toString());
            return 0.0d;
        }
    }

    public UnityParams getParamsObject(String str) {
        try {
            return new UnityParams(this.json.getJSONObject(str));
        } catch (JSONException unused) {
            String str2 = FB.TAG;
            Log.e(str2, "cannot get object " + str + " from " + toString());
            return null;
        }
    }

    public void put(String str, Object obj) {
        try {
            this.json.put(str, obj);
        } catch (JSONException unused) {
            String str2 = FB.TAG;
            Log.e(str2, "couldn't add key " + str + " to " + toString());
        }
    }

    public boolean has(String str) {
        return this.json.has(str) && !this.json.isNull(str);
    }

    public Boolean hasString(String str) {
        return Boolean.valueOf(has(str) && getString(str) != "");
    }

    public Bundle getStringParams() {
        Bundle bundle = new Bundle();
        Iterator<String> keys = this.json.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                String string = this.json.getString(next);
                if (string != null) {
                    bundle.putString(next, string);
                }
            } catch (JSONException unused) {
            }
        }
        return bundle;
    }

    public String toString() {
        return this.json.toString();
    }
}
