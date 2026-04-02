package com.ss.android.downloadlib.addownload.ge;

import com.ss.android.downloadlib.rb.yk;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class dr {
    public String bn;
    public long dr;
    public String g;
    public long ge;
    public long o;
    public String q;
    public String rb;
    public volatile long xu;

    public dr() {
    }

    public dr(long j, long j2, long j3, String str, String str2, String str3, String str4) {
        this.dr = j;
        this.ge = j2;
        this.o = j3;
        this.g = str;
        this.q = str2;
        this.bn = str3;
        this.rb = str4;
    }

    public JSONObject dr() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mDownloadId", this.dr);
            jSONObject.put("mAdId", this.ge);
            jSONObject.put("mExtValue", this.o);
            jSONObject.put("mPackageName", this.g);
            jSONObject.put("mAppName", this.q);
            jSONObject.put("mLogExtra", this.bn);
            jSONObject.put("mFileName", this.rb);
            jSONObject.put("mTimeStamp", this.xu);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static dr dr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        dr drVar = new dr();
        try {
            drVar.dr = yk.dr(jSONObject, "mDownloadId");
            drVar.ge = yk.dr(jSONObject, "mAdId");
            drVar.o = yk.dr(jSONObject, "mExtValue");
            drVar.g = jSONObject.optString("mPackageName");
            drVar.q = jSONObject.optString("mAppName");
            drVar.bn = jSONObject.optString("mLogExtra");
            drVar.rb = jSONObject.optString("mFileName");
            drVar.xu = yk.dr(jSONObject, "mTimeStamp");
            return drVar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
