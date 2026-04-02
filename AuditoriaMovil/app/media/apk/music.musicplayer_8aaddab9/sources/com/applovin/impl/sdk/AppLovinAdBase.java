package com.applovin.impl.sdk;

import android.graphics.Color;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class AppLovinAdBase implements com.applovin.impl.sdk.a.a {
    public final JSONObject adObject;
    public final Object adObjectLock;
    private final long createdAtMillis;
    public final JSONObject fullResponse;
    public final Object fullResponseLock;
    public final int responseHash;
    public final m sdk;

    public AppLovinAdBase(JSONObject jSONObject, JSONObject jSONObject2, m mVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.adObject = jSONObject;
        this.fullResponse = jSONObject2;
        this.sdk = mVar;
        this.adObjectLock = new Object();
        this.fullResponseLock = new Object();
        this.createdAtMillis = System.currentTimeMillis();
        char[] charArray = jSONObject.toString().toCharArray();
        Arrays.sort(charArray);
        this.responseHash = new String(charArray).hashCode();
    }

    public boolean containsKeyForAdObject(String str) {
        boolean has;
        synchronized (this.adObjectLock) {
            has = this.adObject.has(str);
        }
        return has;
    }

    public abstract long getAdIdNumber();

    public boolean getBooleanFromAdObject(String str, Boolean bool) {
        boolean booleanValue;
        synchronized (this.adObjectLock) {
            booleanValue = JsonUtils.getBoolean(this.adObject, str, bool).booleanValue();
        }
        return booleanValue;
    }

    public boolean getBooleanFromFullResponse(String str, boolean z) {
        boolean booleanValue;
        synchronized (this.fullResponseLock) {
            booleanValue = JsonUtils.getBoolean(this.fullResponse, str, Boolean.valueOf(z)).booleanValue();
        }
        return booleanValue;
    }

    public String getClCode() {
        String stringFromAdObject = getStringFromAdObject("clcode", "");
        return StringUtils.isValidString(stringFromAdObject) ? stringFromAdObject : getStringFromFullResponse("clcode", "");
    }

    public int getColorFromAdObject(String str, int i2) {
        String stringFromAdObject = getStringFromAdObject(str, null);
        return StringUtils.isValidString(stringFromAdObject) ? Color.parseColor(stringFromAdObject) : i2;
    }

    public long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    public String getDspName() {
        return getStringFromFullResponse("dsp_name", "");
    }

    public long getFetchLatencyMillis() {
        return getLongFromFullResponse("ad_fetch_latency_millis", -1L);
    }

    public long getFetchResponseSize() {
        return getLongFromFullResponse("ad_fetch_response_size", -1L);
    }

    public float getFloatFromAdObject(String str, float f2) {
        float f3;
        synchronized (this.adObjectLock) {
            f3 = JsonUtils.getFloat(this.adObject, str, f2);
        }
        return f3;
    }

    public float getFloatFromFullResponse(String str, float f2) {
        float f3;
        synchronized (this.fullResponseLock) {
            f3 = JsonUtils.getFloat(this.fullResponse, str, f2);
        }
        return f3;
    }

    public int getIntFromAdObject(String str, int i2) {
        int i3;
        synchronized (this.adObjectLock) {
            i3 = JsonUtils.getInt(this.adObject, str, i2);
        }
        return i3;
    }

    public int getIntFromFullResponse(String str, int i2) {
        int i3;
        synchronized (this.fullResponseLock) {
            i3 = JsonUtils.getInt(this.fullResponse, str, i2);
        }
        return i3;
    }

    public List<Integer> getIntegerListFromAdObject(String str, List<Integer> list) {
        List<Integer> integerList;
        synchronized (this.adObjectLock) {
            integerList = JsonUtils.getIntegerList(this.adObject, str, list);
        }
        return integerList;
    }

    public JSONObject getJsonObjectFromAdObject(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.adObjectLock) {
            jSONObject2 = JsonUtils.getJSONObject(this.adObject, str, jSONObject);
        }
        return jSONObject2;
    }

    public JSONObject getJsonObjectFromFullResponse(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.fullResponseLock) {
            jSONObject2 = JsonUtils.getJSONObject(this.fullResponse, str, jSONObject);
        }
        return jSONObject2;
    }

    public long getLongFromAdObject(String str, long j2) {
        long j3;
        synchronized (this.adObjectLock) {
            j3 = JsonUtils.getLong(this.adObject, str, j2);
        }
        return j3;
    }

    public long getLongFromFullResponse(String str, long j2) {
        long j3;
        synchronized (this.fullResponseLock) {
            j3 = JsonUtils.getLong(this.fullResponse, str, j2);
        }
        return j3;
    }

    public String getPrimaryKey() {
        return getStringFromAdObject("pk", "NA");
    }

    public m getSdk() {
        return this.sdk;
    }

    public String getSecondaryKey1() {
        return getStringFromAdObject("sk1", null);
    }

    public String getSecondaryKey2() {
        return getStringFromAdObject("sk2", null);
    }

    public String getStringFromAdObject(String str, String str2) {
        String string;
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, str, str2);
        }
        return string;
    }

    public String getStringFromFullResponse(String str, String str2) {
        String string;
        synchronized (this.fullResponseLock) {
            string = JsonUtils.getString(this.fullResponse, str, str2);
        }
        return string;
    }
}
