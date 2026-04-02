package com.kwad.sdk.crash.model.message;

import android.text.TextUtils;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.crash.d;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a {
    private JSONObject aAC = new JSONObject();

    private void put(String str, Object obj) {
        try {
            this.aAC.put(str, obj);
        } catch (Throwable th) {
            c.printStackTraceOnly(th);
        }
    }

    public final void ey(String str) {
        put(d.aAc, str);
    }

    public final void putInt(String str, int i) {
        put(str, Integer.valueOf(i));
    }

    public final void putString(String str, String str2) {
        if (TextUtils.isEmpty(str2) || str2.length() > 100) {
            c.d("ExceptionCollector", "string value to long ,max is 100");
        } else {
            put(str, str2);
        }
    }

    public final String toString() {
        return this.aAC.toString();
    }
}
