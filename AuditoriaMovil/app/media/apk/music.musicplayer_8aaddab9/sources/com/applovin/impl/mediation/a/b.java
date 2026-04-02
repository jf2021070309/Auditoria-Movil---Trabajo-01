package com.applovin.impl.mediation.a;

import android.view.View;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b extends e {
    private b(b bVar, com.applovin.impl.mediation.g gVar) {
        super(bVar.W(), bVar.N(), bVar.M(), gVar, bVar.f3334b);
    }

    public b(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, m mVar) {
        super(map, jSONObject, jSONObject2, null, mVar);
    }

    public long A() {
        long b2 = b("ad_refresh_ms", -1L);
        return b2 >= 0 ? b2 : a("ad_refresh_ms", ((Long) this.f3334b.a(com.applovin.impl.sdk.c.a.f3926m)).longValue());
    }

    public boolean B() {
        return b("proe", (Boolean) this.f3334b.a(com.applovin.impl.sdk.c.a.N)).booleanValue();
    }

    public long C() {
        return Utils.parseColor(b("bg_color", (String) null));
    }

    @Override // com.applovin.impl.mediation.a.a
    public a a(com.applovin.impl.mediation.g gVar) {
        return new b(this, gVar);
    }

    public int v() {
        int b2 = b("ad_view_width", -2);
        if (b2 == -2) {
            MaxAdFormat format = getFormat();
            if (format.isAdViewAd()) {
                return format.getSize().getWidth();
            }
            throw new IllegalStateException("Invalid ad format");
        }
        return b2;
    }

    public int w() {
        int b2 = b("ad_view_height", -2);
        if (b2 == -2) {
            MaxAdFormat format = getFormat();
            if (format.isAdViewAd()) {
                return format.getSize().getHeight();
            }
            throw new IllegalStateException("Invalid ad format");
        }
        return b2;
    }

    public View x() {
        com.applovin.impl.mediation.g gVar;
        if (!e() || (gVar = ((a) this).a) == null) {
            return null;
        }
        return gVar.a();
    }

    public long y() {
        return b("viewability_imp_delay_ms", ((Long) this.f3334b.a(com.applovin.impl.sdk.c.b.bN)).longValue());
    }

    public boolean z() {
        return A() >= 0;
    }
}
