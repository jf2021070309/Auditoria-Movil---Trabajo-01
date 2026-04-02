package com.vungle.publisher;

import com.vungle.publisher.log.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes4.dex */
abstract class vy<T> extends vz<T> {
    protected abstract T c(JSONObject jSONObject);

    public final T a(String str) {
        if (str == null) {
            return null;
        }
        return c(new JSONObject(str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T[] a(JSONArray jSONArray) {
        T[] tArr = null;
        if (jSONArray != null) {
            int length = jSONArray.length();
            tArr = b(length);
            for (int i = 0; i < length; i++) {
                tArr[i] = c(jSONArray.optJSONObject(i));
            }
        }
        return tArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(JSONObject jSONObject, String str, Object obj) {
        if (obj == null) {
            Object opt = jSONObject.opt(str);
            if (opt == null) {
                Logger.d(Logger.PROTOCOL_TAG, "null " + str + " is required input");
            } else {
                Logger.d(Logger.PROTOCOL_TAG, "invalid " + str + ": " + opt);
            }
        } else if ((obj instanceof String) && ((String) obj).length() == 0) {
            Logger.d(Logger.PROTOCOL_TAG, "empty " + str + " is required input");
        } else if ((obj instanceof JSONArray) && ((JSONArray) obj).length() == 0) {
            Logger.d(Logger.PROTOCOL_TAG, "empty array " + str + " is required input");
        }
    }
}
