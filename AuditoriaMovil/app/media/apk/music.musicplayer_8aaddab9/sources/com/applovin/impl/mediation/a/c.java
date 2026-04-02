package com.applovin.impl.mediation.a;

import android.os.SystemClock;
import com.applovin.impl.sdk.m;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c extends a {

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<com.applovin.impl.sdk.b.c> f3330c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f3331d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f3332e;

    private c(c cVar, com.applovin.impl.mediation.g gVar) {
        super(cVar.W(), cVar.N(), cVar.M(), gVar, cVar.f3334b);
        this.f3332e = new AtomicBoolean();
        this.f3330c = cVar.f3330c;
        this.f3331d = cVar.f3331d;
    }

    public c(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, m mVar) {
        super(map, jSONObject, jSONObject2, null, mVar);
        this.f3332e = new AtomicBoolean();
        this.f3330c = new AtomicReference<>();
        this.f3331d = new AtomicBoolean();
    }

    public long A() {
        long b2 = b("fullscreen_display_delay_ms", -1L);
        return b2 >= 0 ? b2 : ((Long) this.f3334b.a(com.applovin.impl.sdk.c.a.A)).longValue();
    }

    public long B() {
        return b("ahdm", ((Long) this.f3334b.a(com.applovin.impl.sdk.c.a.B)).longValue());
    }

    public String C() {
        return b("bcode", "");
    }

    public String D() {
        return a("mcode", "");
    }

    public boolean E() {
        return this.f3331d.get();
    }

    public void F() {
        this.f3331d.set(true);
    }

    public com.applovin.impl.sdk.b.c G() {
        return this.f3330c.getAndSet(null);
    }

    public boolean H() {
        return b("show_nia", a("show_nia", Boolean.FALSE)).booleanValue();
    }

    public String I() {
        return b("nia_title", a("nia_title", ""));
    }

    public String J() {
        return b("nia_message", a("nia_message", ""));
    }

    public String K() {
        return b("nia_button_title", a("nia_button_title", ""));
    }

    public AtomicBoolean L() {
        return this.f3332e;
    }

    @Override // com.applovin.impl.mediation.a.a
    public a a(com.applovin.impl.mediation.g gVar) {
        return new c(this, gVar);
    }

    public void a(com.applovin.impl.sdk.b.c cVar) {
        this.f3330c.set(cVar);
    }

    public long v() {
        long b2 = b("ad_expiration_ms", -1L);
        return b2 >= 0 ? b2 : a("ad_expiration_ms", ((Long) this.f3334b.a(com.applovin.impl.sdk.c.a.H)).longValue());
    }

    public long w() {
        long b2 = b("ad_hidden_timeout_ms", -1L);
        return b2 >= 0 ? b2 : a("ad_hidden_timeout_ms", ((Long) this.f3334b.a(com.applovin.impl.sdk.c.a.K)).longValue());
    }

    public boolean x() {
        if (b("schedule_ad_hidden_on_ad_dismiss", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return a("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.f3334b.a(com.applovin.impl.sdk.c.a.L)).booleanValue();
    }

    public long y() {
        long b2 = b("ad_hidden_on_ad_dismiss_callback_delay_ms", -1L);
        return b2 >= 0 ? b2 : a("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.f3334b.a(com.applovin.impl.sdk.c.a.M)).longValue());
    }

    public long z() {
        if (r() > 0) {
            return SystemClock.elapsedRealtime() - r();
        }
        return -1L;
    }
}
