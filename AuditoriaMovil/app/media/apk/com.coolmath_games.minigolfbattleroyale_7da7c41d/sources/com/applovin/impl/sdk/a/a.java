package com.applovin.impl.sdk.a;

import android.net.Uri;
import com.applovin.impl.adview.j;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.vungle.warren.analytics.AnalyticsEvent;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a extends g {
    private final String a;
    private final String b;
    private final String c;

    public a(JSONObject jSONObject, JSONObject jSONObject2, b bVar, k kVar) {
        super(jSONObject, jSONObject2, bVar, kVar);
        this.a = c();
        this.b = i();
        this.c = aO();
    }

    private String aO() {
        return getStringFromAdObject("stream_url", "");
    }

    @Override // com.applovin.impl.sdk.a.g
    public void a() {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", this.a);
            JsonUtils.putString(this.adObject, "stream_url", this.c);
        }
    }

    public void a(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "video", uri.toString());
        }
    }

    public void a(String str) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", str);
        }
    }

    @Override // com.applovin.impl.sdk.a.g
    public JSONObject b() {
        JSONObject deepCopy;
        synchronized (this.fullResponseLock) {
            deepCopy = JsonUtils.deepCopy(this.fullResponse);
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(deepCopy, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
            JsonUtils.putString(jSONObject, "html", this.a);
            JsonUtils.putString(jSONObject, "video", this.b);
            JsonUtils.putString(jSONObject, "stream_url", this.c);
        }
        return deepCopy;
    }

    public String c() {
        String string;
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, "html", null);
        }
        return string;
    }

    @Override // com.applovin.impl.sdk.a.g
    public String d() {
        return this.b;
    }

    public String e() {
        return this.c;
    }

    @Override // com.applovin.impl.sdk.a.g
    public boolean f() {
        return this.adObject.has("stream_url");
    }

    public void g() {
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    @Override // com.applovin.impl.sdk.a.g
    public Uri h() {
        String aO = aO();
        if (StringUtils.isValidString(aO)) {
            return Uri.parse(aO);
        }
        String i = i();
        if (StringUtils.isValidString(i)) {
            return Uri.parse(i);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public boolean hasVideoUrl() {
        return h() != null;
    }

    public String i() {
        return getStringFromAdObject("video", "");
    }

    @Override // com.applovin.impl.sdk.a.g
    public Uri j() {
        String stringFromAdObject = getStringFromAdObject(AnalyticsEvent.Ad.clickUrl, "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.a.g
    public Uri k() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        return StringUtils.isValidString(stringFromAdObject) ? Uri.parse(stringFromAdObject) : j();
    }

    public float l() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    public boolean m() {
        return getBooleanFromAdObject("close_button_graphic_hidden", false);
    }

    public boolean n() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", false);
        }
        return true;
    }

    public j.a o() {
        return a(getIntFromAdObject("expandable_style", j.a.INVISIBLE.a()));
    }
}
