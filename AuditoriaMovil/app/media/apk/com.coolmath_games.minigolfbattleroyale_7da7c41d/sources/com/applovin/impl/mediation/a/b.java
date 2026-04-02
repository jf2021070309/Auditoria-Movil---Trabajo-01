package com.applovin.impl.mediation.a;

import android.view.View;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b extends a {
    private b(b bVar, com.applovin.impl.mediation.g gVar) {
        super(bVar.I(), bVar.H(), gVar, bVar.b);
    }

    public b(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        super(jSONObject, jSONObject2, null, kVar);
    }

    public boolean A() {
        return B() >= 0;
    }

    public long B() {
        long b = b("ad_refresh_ms", -1L);
        return b >= 0 ? b : a("ad_refresh_ms", ((Long) this.b.a(com.applovin.impl.sdk.c.a.m)).longValue());
    }

    public boolean C() {
        return b("proe", (Boolean) this.b.a(com.applovin.impl.sdk.c.a.K)).booleanValue();
    }

    public long D() {
        return Utils.parseColor(b("bg_color", (String) null));
    }

    @Override // com.applovin.impl.mediation.a.a
    public a a(com.applovin.impl.mediation.g gVar) {
        return new b(this, gVar);
    }

    public int q() {
        int b = b("ad_view_width", -2);
        if (b == -2) {
            MaxAdFormat format = getFormat();
            if (format.isAdViewAd()) {
                return format.getSize().getWidth();
            }
            throw new IllegalStateException("Invalid ad format");
        }
        return b;
    }

    public int r() {
        int b = b("ad_view_height", -2);
        if (b == -2) {
            MaxAdFormat format = getFormat();
            if (format.isAdViewAd()) {
                return format.getSize().getHeight();
            }
            throw new IllegalStateException("Invalid ad format");
        }
        return b;
    }

    public View s() {
        if (!d() || this.a == null) {
            return null;
        }
        View a = this.a.a();
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Ad-view based ad is missing an ad view");
    }

    public long t() {
        return b("viewability_imp_delay_ms", ((Long) this.b.a(com.applovin.impl.sdk.c.b.bD)).longValue());
    }

    public int u() {
        MaxAdFormat format = getFormat();
        com.applovin.impl.sdk.c.b<Integer> bVar = format == MaxAdFormat.BANNER ? com.applovin.impl.sdk.c.b.bE : format == MaxAdFormat.MREC ? com.applovin.impl.sdk.c.b.bG : format == MaxAdFormat.LEADER ? com.applovin.impl.sdk.c.b.bI : null;
        if (bVar != null) {
            return b("viewability_min_width", ((Integer) this.b.a(bVar)).intValue());
        }
        return 0;
    }

    public int v() {
        MaxAdFormat format = getFormat();
        com.applovin.impl.sdk.c.b<Integer> bVar = format == MaxAdFormat.BANNER ? com.applovin.impl.sdk.c.b.bF : format == MaxAdFormat.MREC ? com.applovin.impl.sdk.c.b.bH : format == MaxAdFormat.LEADER ? com.applovin.impl.sdk.c.b.bJ : null;
        if (bVar != null) {
            return b("viewability_min_height", ((Integer) this.b.a(bVar)).intValue());
        }
        return 0;
    }

    public float w() {
        return a("viewability_min_alpha", ((Float) this.b.a(com.applovin.impl.sdk.c.a.bK)).floatValue() / 100.0f);
    }

    public int x() {
        return b("viewability_min_pixels", -1);
    }

    public boolean y() {
        return x() >= 0;
    }

    public long z() {
        return b("viewability_timer_min_visible_ms", ((Long) this.b.a(com.applovin.impl.sdk.c.a.bL)).longValue());
    }
}
