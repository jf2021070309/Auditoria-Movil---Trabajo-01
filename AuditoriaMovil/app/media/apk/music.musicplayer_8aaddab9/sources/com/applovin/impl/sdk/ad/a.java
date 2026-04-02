package com.applovin.impl.sdk.ad;

import android.net.Uri;
import com.applovin.impl.adview.i;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a extends e {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3841b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3842c;

    /* renamed from: d  reason: collision with root package name */
    private final com.applovin.impl.sdk.a.c f3843d;

    public a(JSONObject jSONObject, JSONObject jSONObject2, b bVar, m mVar) {
        super(jSONObject, jSONObject2, bVar, mVar);
        this.a = b();
        this.f3841b = h();
        this.f3842c = aJ();
        this.f3843d = new com.applovin.impl.sdk.a.c(this);
    }

    private String aJ() {
        return getStringFromAdObject("stream_url", "");
    }

    @Override // com.applovin.impl.sdk.ad.e
    public void a() {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", this.a);
            JsonUtils.putString(this.adObject, "stream_url", this.f3842c);
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

    public String b() {
        String string;
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, "html", "");
        }
        return string;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public String c() {
        return this.f3841b;
    }

    public String d() {
        return this.f3842c;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public boolean e() {
        return this.adObject.has("stream_url");
    }

    public void f() {
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri g() {
        String aJ = aJ();
        if (StringUtils.isValidString(aJ)) {
            return Uri.parse(aJ);
        }
        String h2 = h();
        if (StringUtils.isValidString(h2)) {
            return Uri.parse(h2);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.a.a
    public com.applovin.impl.sdk.a.b getAdEventTracker() {
        return this.f3843d;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        JSONObject deepCopy;
        synchronized (this.fullResponseLock) {
            deepCopy = JsonUtils.deepCopy(this.fullResponse);
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(deepCopy, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
            JsonUtils.putString(jSONObject, "html", this.a);
            JsonUtils.putString(jSONObject, "video", this.f3841b);
            JsonUtils.putString(jSONObject, "stream_url", this.f3842c);
        }
        return deepCopy;
    }

    public String h() {
        return getStringFromAdObject("video", "");
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        return g() != null;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri i() {
        String stringFromAdObject = getStringFromAdObject("click_url", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.e, com.applovin.impl.sdk.a.a
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri j() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        return StringUtils.isValidString(stringFromAdObject) ? Uri.parse(stringFromAdObject) : i();
    }

    public float k() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    public boolean l() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", Boolean.FALSE);
        }
        return true;
    }

    public i.a m() {
        return a(getIntFromAdObject("expandable_style", i.a.INVISIBLE.a()));
    }
}
