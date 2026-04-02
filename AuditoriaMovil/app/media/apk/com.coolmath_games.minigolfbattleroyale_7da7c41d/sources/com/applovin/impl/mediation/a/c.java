package com.applovin.impl.mediation.a;

import android.os.SystemClock;
import com.applovin.impl.sdk.k;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c extends a {
    private final AtomicReference<com.applovin.impl.sdk.b.c> c;
    private final AtomicBoolean d;
    private final AtomicBoolean e;

    private c(c cVar, com.applovin.impl.mediation.g gVar) {
        super(cVar.I(), cVar.H(), gVar, cVar.b);
        this.e = new AtomicBoolean();
        this.c = cVar.c;
        this.d = cVar.d;
    }

    public c(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        super(jSONObject, jSONObject2, null, kVar);
        this.e = new AtomicBoolean();
        this.c = new AtomicReference<>();
        this.d = new AtomicBoolean();
    }

    public void A() {
        this.d.set(true);
    }

    public com.applovin.impl.sdk.b.c B() {
        return this.c.getAndSet(null);
    }

    public boolean C() {
        return b("show_nia", a("show_nia", (Boolean) false)).booleanValue();
    }

    public String D() {
        return b("nia_title", a("nia_title", ""));
    }

    public String E() {
        return b("nia_message", a("nia_message", ""));
    }

    public String F() {
        return b("nia_button_title", a("nia_button_title", ""));
    }

    public AtomicBoolean G() {
        return this.e;
    }

    @Override // com.applovin.impl.mediation.a.a
    public a a(com.applovin.impl.mediation.g gVar) {
        return new c(this, gVar);
    }

    public void a(com.applovin.impl.sdk.b.c cVar) {
        this.c.set(cVar);
    }

    public long q() {
        long b = b("ad_expiration_ms", -1L);
        return b >= 0 ? b : a("ad_expiration_ms", ((Long) this.b.a(com.applovin.impl.sdk.c.a.E)).longValue());
    }

    public long r() {
        long b = b("ad_hidden_timeout_ms", -1L);
        return b >= 0 ? b : a("ad_hidden_timeout_ms", ((Long) this.b.a(com.applovin.impl.sdk.c.a.H)).longValue());
    }

    public boolean s() {
        if (b("schedule_ad_hidden_on_ad_dismiss", (Boolean) false).booleanValue()) {
            return true;
        }
        return a("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.b.a(com.applovin.impl.sdk.c.a.I)).booleanValue();
    }

    public long t() {
        long b = b("ad_hidden_on_ad_dismiss_callback_delay_ms", -1L);
        return b >= 0 ? b : a("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.b.a(com.applovin.impl.sdk.c.a.J)).longValue());
    }

    public long u() {
        if (m() > 0) {
            return SystemClock.elapsedRealtime() - m();
        }
        return -1L;
    }

    public long v() {
        long b = b("fullscreen_display_delay_ms", -1L);
        return b >= 0 ? b : ((Long) this.b.a(com.applovin.impl.sdk.c.a.w)).longValue();
    }

    public long w() {
        return b("ahdm", ((Long) this.b.a(com.applovin.impl.sdk.c.a.x)).longValue());
    }

    public String x() {
        return b("bcode", "");
    }

    public String y() {
        return a("mcode", "");
    }

    public boolean z() {
        return this.d.get();
    }
}
