package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.d.c;
import com.iab.omid.library.applovin.d.e;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class VastProperties {
    private final boolean a;

    /* renamed from: b  reason: collision with root package name */
    private final Float f4773b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4774c;

    /* renamed from: d  reason: collision with root package name */
    private final Position f4775d;

    private VastProperties(boolean z, Float f2, boolean z2, Position position) {
        this.a = z;
        this.f4773b = f2;
        this.f4774c = z2;
        this.f4775d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f2, boolean z, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f2), z, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.a);
            if (this.a) {
                jSONObject.put("skipOffset", this.f4773b);
            }
            jSONObject.put("autoPlay", this.f4774c);
            jSONObject.put("position", this.f4775d);
        } catch (JSONException e2) {
            c.a("VastProperties: JSON error", e2);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f4775d;
    }

    public Float getSkipOffset() {
        return this.f4773b;
    }

    public boolean isAutoPlay() {
        return this.f4774c;
    }

    public boolean isSkippable() {
        return this.a;
    }
}
