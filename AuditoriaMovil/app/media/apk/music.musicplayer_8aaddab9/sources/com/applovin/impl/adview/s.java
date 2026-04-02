package com.applovin.impl.adview;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class s {
    private final int a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3259b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3260c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3261d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f3262e;

    /* renamed from: f  reason: collision with root package name */
    private final int f3263f;

    /* renamed from: g  reason: collision with root package name */
    private final int f3264g;

    /* renamed from: h  reason: collision with root package name */
    private final int f3265h;

    /* renamed from: i  reason: collision with root package name */
    private final float f3266i;

    /* renamed from: j  reason: collision with root package name */
    private final float f3267j;

    public s(JSONObject jSONObject, com.applovin.impl.sdk.m mVar) {
        com.applovin.impl.sdk.v B = mVar.B();
        StringBuilder y = e.a.d.a.a.y("Updating video button properties with JSON = ");
        y.append(JsonUtils.maybeConvertToIndentedString(jSONObject));
        B.c("VideoButtonProperties", y.toString());
        this.a = JsonUtils.getInt(jSONObject, "width", 64);
        this.f3259b = JsonUtils.getInt(jSONObject, "height", 7);
        this.f3260c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.f3261d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.f3262e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", Boolean.FALSE).booleanValue();
        this.f3263f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", 500);
        this.f3264g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", 500);
        this.f3265h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", 500);
        this.f3266i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.f3267j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.f3259b;
    }

    public int c() {
        return this.f3260c;
    }

    public int d() {
        return this.f3261d;
    }

    public boolean e() {
        return this.f3262e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.a == sVar.a && this.f3259b == sVar.f3259b && this.f3260c == sVar.f3260c && this.f3261d == sVar.f3261d && this.f3262e == sVar.f3262e && this.f3263f == sVar.f3263f && this.f3264g == sVar.f3264g && this.f3265h == sVar.f3265h && Float.compare(sVar.f3266i, this.f3266i) == 0 && Float.compare(sVar.f3267j, this.f3267j) == 0;
    }

    public long f() {
        return this.f3263f;
    }

    public long g() {
        return this.f3264g;
    }

    public long h() {
        return this.f3265h;
    }

    public int hashCode() {
        int i2 = ((((((((((((((this.a * 31) + this.f3259b) * 31) + this.f3260c) * 31) + this.f3261d) * 31) + (this.f3262e ? 1 : 0)) * 31) + this.f3263f) * 31) + this.f3264g) * 31) + this.f3265h) * 31;
        float f2 = this.f3266i;
        int floatToIntBits = (i2 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.f3267j;
        return floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
    }

    public float i() {
        return this.f3266i;
    }

    public float j() {
        return this.f3267j;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("VideoButtonProperties{widthPercentOfScreen=");
        y.append(this.a);
        y.append(", heightPercentOfScreen=");
        y.append(this.f3259b);
        y.append(", margin=");
        y.append(this.f3260c);
        y.append(", gravity=");
        y.append(this.f3261d);
        y.append(", tapToFade=");
        y.append(this.f3262e);
        y.append(", tapToFadeDurationMillis=");
        y.append(this.f3263f);
        y.append(", fadeInDurationMillis=");
        y.append(this.f3264g);
        y.append(", fadeOutDurationMillis=");
        y.append(this.f3265h);
        y.append(", fadeInDelay=");
        y.append(this.f3266i);
        y.append(", fadeOutDelay=");
        y.append(this.f3267j);
        y.append('}');
        return y.toString();
    }
}
