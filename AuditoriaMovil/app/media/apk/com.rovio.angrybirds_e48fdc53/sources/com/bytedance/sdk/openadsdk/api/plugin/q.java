package com.bytedance.sdk.openadsdk.api.plugin;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class q {
    private String dr;
    private Map<String, Long> g = new HashMap();
    private long ge;
    private long o;

    private q(String str, long j) {
        this.dr = str;
        this.ge = j;
        this.o = j;
    }

    public static q dr(String str) {
        return new q(str, SystemClock.elapsedRealtime());
    }

    public long dr() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.ge;
        this.g.put(this.dr, Long.valueOf(elapsedRealtime));
        return elapsedRealtime;
    }

    public long ge(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.o;
        this.o = SystemClock.elapsedRealtime();
        this.g.put(str, Long.valueOf(elapsedRealtime));
        return elapsedRealtime;
    }

    public void dr(JSONObject jSONObject, long j) {
        if (jSONObject == null) {
            return;
        }
        for (Map.Entry<String, Long> entry : this.g.entrySet()) {
            String key = entry.getKey();
            Long value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value.longValue() > j) {
                try {
                    jSONObject.put(key, value);
                } catch (JSONException e) {
                }
            }
        }
    }
}
