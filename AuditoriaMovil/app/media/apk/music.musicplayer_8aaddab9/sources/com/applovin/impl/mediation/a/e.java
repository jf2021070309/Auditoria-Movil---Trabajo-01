package com.applovin.impl.mediation.a;

import com.applovin.impl.sdk.m;
import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class e extends a {
    public e(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.g gVar, m mVar) {
        super(map, jSONObject, jSONObject2, gVar, mVar);
    }

    public int D() {
        MaxAdFormat format = getFormat();
        com.applovin.impl.sdk.c.b<Integer> bVar = format == MaxAdFormat.BANNER ? com.applovin.impl.sdk.c.b.bO : format == MaxAdFormat.MREC ? com.applovin.impl.sdk.c.b.bQ : format == MaxAdFormat.LEADER ? com.applovin.impl.sdk.c.b.bS : format == MaxAdFormat.NATIVE ? com.applovin.impl.sdk.c.b.bU : null;
        if (bVar != null) {
            return b("viewability_min_width", ((Integer) this.f3334b.a(bVar)).intValue());
        }
        return 0;
    }

    public int E() {
        MaxAdFormat format = getFormat();
        com.applovin.impl.sdk.c.b<Integer> bVar = format == MaxAdFormat.BANNER ? com.applovin.impl.sdk.c.b.bP : format == MaxAdFormat.MREC ? com.applovin.impl.sdk.c.b.bR : format == MaxAdFormat.LEADER ? com.applovin.impl.sdk.c.b.bT : format == MaxAdFormat.NATIVE ? com.applovin.impl.sdk.c.b.bV : null;
        if (bVar != null) {
            return b("viewability_min_height", ((Integer) this.f3334b.a(bVar)).intValue());
        }
        return 0;
    }

    public float F() {
        return a("viewability_min_alpha", ((Float) this.f3334b.a(com.applovin.impl.sdk.c.b.bW)).floatValue() / 100.0f);
    }

    public int G() {
        return b("viewability_min_pixels", -1);
    }

    public boolean H() {
        return G() >= 0;
    }

    public long I() {
        return b("viewability_timer_min_visible_ms", ((Long) this.f3334b.a(com.applovin.impl.sdk.c.b.bX)).longValue());
    }
}
