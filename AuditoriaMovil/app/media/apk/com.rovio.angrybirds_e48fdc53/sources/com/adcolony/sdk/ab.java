package com.adcolony.sdk;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.unity3d.ads.adunit.AdUnitActivity;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ab {
    private HashMap<String, aa> a;
    private ConcurrentHashMap<String, AdColonyInterstitial> b;
    private HashMap<String, v> c;
    private HashMap<String, AdColonyNativeAdViewListener> d;
    private HashMap<String, u> e;
    private HashMap<String, ad> f;

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(final d dVar) {
        final JSONObject b = dVar.b();
        final String b2 = as.b(b, "id");
        final v remove = this.c.remove(b2);
        final AdColonyNativeAdViewListener remove2 = this.d.remove(b2);
        if (remove == null && remove2 == null) {
            a(dVar.c(), b2);
            return false;
        } else if (a.d() && a.d()) {
            q.a(new Runnable() { // from class: com.adcolony.sdk.ab.1
                @Override // java.lang.Runnable
                public void run() {
                    u adColonyNativeAdView;
                    if (remove != null) {
                        adColonyNativeAdView = new u(a.c(), dVar, remove);
                        ab.this.e.put(b2, adColonyNativeAdView);
                    } else {
                        adColonyNativeAdView = new AdColonyNativeAdView(a.c(), dVar, remove2);
                        ab.this.e.put(b2, adColonyNativeAdView);
                    }
                    adColonyNativeAdView.setAdvertiserName(as.b(b, "name"));
                    adColonyNativeAdView.setTitle(as.b(b, "title"));
                    adColonyNativeAdView.setDescription(as.b(b, "description"));
                    adColonyNativeAdView.setImageFilepath(as.b(b, "thumb_filepath"));
                    adColonyNativeAdView.b();
                    if (remove != null) {
                        remove.a(adColonyNativeAdView);
                    } else {
                        remove2.onRequestFilled((AdColonyNativeAdView) adColonyNativeAdView);
                    }
                }
            });
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(d dVar) {
        String b = as.b(dVar.b(), "id");
        final v remove = this.c.remove(b);
        final AdColonyNativeAdViewListener remove2 = this.d.remove(b);
        if (remove == null && remove2 == null) {
            a(dVar.c(), b);
            return false;
        } else if (a.d()) {
            q.a(new Runnable() { // from class: com.adcolony.sdk.ab.4
                @Override // java.lang.Runnable
                public void run() {
                    boolean z = remove == null;
                    String str = z ? remove2.a : remove.a;
                    AdColonyZone adColonyZone = a.a().c().get(str);
                    if (adColonyZone == null) {
                        adColonyZone = new AdColonyZone(str);
                        adColonyZone.b(6);
                    }
                    if (z) {
                        remove2.onRequestNotFilled(adColonyZone);
                    } else {
                        remove.a(adColonyZone);
                    }
                }
            });
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.a = new HashMap<>();
        this.b = new ConcurrentHashMap<>();
        this.c = new HashMap<>();
        this.d = new HashMap<>();
        this.e = new HashMap<>();
        this.f = new HashMap<>();
        a.a("AdContainer.create", new f() { // from class: com.adcolony.sdk.ab.16
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                ab.this.j(dVar);
            }
        });
        a.a("AdContainer.destroy", new f() { // from class: com.adcolony.sdk.ab.21
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                ab.this.k(dVar);
            }
        });
        a.a("AdContainer.move_view_to_index", new f() { // from class: com.adcolony.sdk.ab.22
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                ab.this.l(dVar);
            }
        });
        a.a("AdContainer.move_view_to_front", new f() { // from class: com.adcolony.sdk.ab.24
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                ab.this.m(dVar);
            }
        });
        a.a("AdSession.finish_fullscreen_ad", new f() { // from class: com.adcolony.sdk.ab.25
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                ab.this.i(dVar);
            }
        });
        a.a("AdSession.start_fullscreen_ad", new f() { // from class: com.adcolony.sdk.ab.26
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                ab.this.h(dVar);
            }
        });
        a.a("AdSession.native_ad_view_available", new f() { // from class: com.adcolony.sdk.ab.27
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                ab.this.d(dVar);
            }
        });
        a.a("AdSession.native_ad_view_unavailable", new f() { // from class: com.adcolony.sdk.ab.12
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                ab.this.e(dVar);
            }
        });
        a.a("AdSession.expiring", new f() { // from class: com.adcolony.sdk.ab.23
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                ab.this.a(dVar);
            }
        });
        a.a("AdSession.audio_stopped", new f() { // from class: com.adcolony.sdk.ab.28
            @Override // com.adcolony.sdk.f
            public void a(final d dVar) {
                q.a(new Runnable() { // from class: com.adcolony.sdk.ab.28.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) ab.this.b.get(as.b(dVar.b(), "id"));
                        if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null) {
                            adColonyInterstitial.getListener().onAudioStopped(adColonyInterstitial);
                        }
                    }
                });
            }
        });
        a.a("AdSession.audio_started", new f() { // from class: com.adcolony.sdk.ab.29
            @Override // com.adcolony.sdk.f
            public void a(final d dVar) {
                q.a(new Runnable() { // from class: com.adcolony.sdk.ab.29.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) ab.this.b.get(as.b(dVar.b(), "id"));
                        if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null) {
                            adColonyInterstitial.getListener().onAudioStarted(adColonyInterstitial);
                        }
                    }
                });
            }
        });
        a.a("AudioPlayer.create", new f() { // from class: com.adcolony.sdk.ab.30
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                ab.this.n(dVar);
            }
        });
        a.a("AudioPlayer.destroy", new f() { // from class: com.adcolony.sdk.ab.31
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (ab.this.c(dVar)) {
                    ab.this.o(dVar);
                }
            }
        });
        a.a("AudioPlayer.play", new f() { // from class: com.adcolony.sdk.ab.32
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (ab.this.c(dVar)) {
                    ab.this.p(dVar);
                }
            }
        });
        a.a("AudioPlayer.pause", new f() { // from class: com.adcolony.sdk.ab.33
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (ab.this.c(dVar)) {
                    ab.this.q(dVar);
                }
            }
        });
        a.a("AudioPlayer.stop", new f() { // from class: com.adcolony.sdk.ab.2
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (ab.this.c(dVar)) {
                    ab.this.r(dVar);
                }
            }
        });
        a.a("AdSession.interstitial_available", new f() { // from class: com.adcolony.sdk.ab.3
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                ab.this.g(dVar);
            }
        });
        a.a("AdSession.interstitial_unavailable", new f() { // from class: com.adcolony.sdk.ab.5
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                ab.this.b(dVar);
            }
        });
        a.a("AdSession.has_audio", new f() { // from class: com.adcolony.sdk.ab.6
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                ab.this.f(dVar);
            }
        });
        a.a("WebView.prepare", new f() { // from class: com.adcolony.sdk.ab.7
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                JSONObject a = as.a();
                as.a(a, "success", true);
                dVar.a(a).a();
            }
        });
        a.a("AdSession.iap_event", new f() { // from class: com.adcolony.sdk.ab.8
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                JSONObject b = dVar.b();
                switch (as.c(b, "type")) {
                    case 2:
                        u uVar = (u) ab.this.e.get(as.b(b, "id"));
                        JSONObject f = as.f(b, "v4iap");
                        JSONArray g = as.g(f, "product_ids");
                        if (uVar != null && f != null && g.length() > 0) {
                            ((AdColonyNativeAdViewListener) uVar.getListener()).onIAPEvent((AdColonyNativeAdView) uVar, as.c(g, 0), as.c(f, "engagement_type"));
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        });
        a.a("AdSession.native_ad_view_finished", new f() { // from class: com.adcolony.sdk.ab.9
            @Override // com.adcolony.sdk.f
            public void a(final d dVar) {
                q.a(new Runnable() { // from class: com.adcolony.sdk.ab.9.1
                    @Override // java.lang.Runnable
                    public void run() {
                        u uVar = (u) ab.this.e.get(as.b(dVar.b(), "id"));
                        if (uVar != null && uVar.getListener() != null && (uVar instanceof AdColonyNativeAdView)) {
                            ((AdColonyNativeAdViewListener) uVar.getListener()).onNativeVideoFinished((AdColonyNativeAdView) uVar);
                        }
                    }
                });
            }
        });
        a.a("AdSession.native_ad_view_started", new f() { // from class: com.adcolony.sdk.ab.10
            @Override // com.adcolony.sdk.f
            public void a(final d dVar) {
                q.a(new Runnable() { // from class: com.adcolony.sdk.ab.10.1
                    @Override // java.lang.Runnable
                    public void run() {
                        u uVar = (u) ab.this.e.get(as.b(dVar.b(), "id"));
                        if (uVar != null && uVar.getListener() != null && (uVar instanceof AdColonyNativeAdView)) {
                            ((AdColonyNativeAdViewListener) uVar.getListener()).onNativeVideoStarted((AdColonyNativeAdView) uVar);
                        }
                    }
                });
            }
        });
        a.a("AdSession.destroy_native_ad_view", new f() { // from class: com.adcolony.sdk.ab.11
            @Override // com.adcolony.sdk.f
            public void a(final d dVar) {
                q.a(new Runnable() { // from class: com.adcolony.sdk.ab.11.1
                    @Override // java.lang.Runnable
                    public void run() {
                        JSONObject b = dVar.b();
                        u uVar = (u) ab.this.e.get(as.b(b, "id"));
                        if (uVar != null) {
                            uVar.a();
                            dVar.a(b).a();
                        }
                    }
                });
            }
        });
        a.a("AdSession.expanded", new f() { // from class: com.adcolony.sdk.ab.13
            @Override // com.adcolony.sdk.f
            public void a(final d dVar) {
                q.a(new Runnable() { // from class: com.adcolony.sdk.ab.13.1
                    @Override // java.lang.Runnable
                    public void run() {
                        dVar.a(dVar.b()).a();
                    }
                });
            }
        });
        a.a("AdSession.native_ad_muted", new f() { // from class: com.adcolony.sdk.ab.14
            @Override // com.adcolony.sdk.f
            public void a(final d dVar) {
                q.a(new Runnable() { // from class: com.adcolony.sdk.ab.14.1
                    @Override // java.lang.Runnable
                    public void run() {
                        JSONObject b = dVar.b();
                        u uVar = (u) ab.this.e.get(as.b(b, "id"));
                        boolean d = as.d(b, "muted");
                        ac listener = uVar != null ? uVar.getListener() : null;
                        if ((uVar instanceof AdColonyNativeAdView) && listener != null) {
                            if (d) {
                                ((AdColonyNativeAdViewListener) listener).onAudioStopped((AdColonyNativeAdView) uVar);
                                return;
                            } else {
                                ((AdColonyNativeAdViewListener) listener).onAudioStarted((AdColonyNativeAdView) uVar);
                                return;
                            }
                        }
                        if (uVar == null || listener == null) {
                        }
                    }
                });
            }
        });
    }

    boolean a(d dVar) {
        JSONObject b = dVar.b();
        String b2 = as.b(b, "id");
        switch (as.c(b, "type")) {
            case 0:
                au.b.b("Removing ad 1");
                final AdColonyInterstitial remove = this.b.remove(b2);
                if (remove == null || remove.getListener() == null) {
                    a(dVar.c(), b2);
                    return false;
                } else if (a.d()) {
                    q.a(new Runnable() { // from class: com.adcolony.sdk.ab.15
                        @Override // java.lang.Runnable
                        public void run() {
                            remove.a(true);
                            remove.getListener().onExpiring(remove);
                            ai o = a.a().o();
                            if (o.b() != null) {
                                o.b().dismiss();
                                o.a((AlertDialog) null);
                            }
                        }
                    });
                    break;
                } else {
                    return false;
                }
                break;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f(d dVar) {
        String b = as.b(dVar.b(), "id");
        JSONObject a = as.a();
        as.a(a, "id", b);
        if (!a.d()) {
            as.a(a, "has_audio", false);
            dVar.a(a).a();
            return false;
        }
        boolean a2 = q.a(q.a((Context) a.c()));
        double b2 = q.b(q.a((Context) a.c()));
        as.a(a, "has_audio", a2);
        as.a(a, "volume", b2);
        dVar.a(a).a();
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(d dVar) {
        String b = as.b(dVar.b(), "id");
        final AdColonyInterstitial adColonyInterstitial = this.b.get(b);
        if (adColonyInterstitial == null || adColonyInterstitial.getListener() == null) {
            a(dVar.c(), b);
            return false;
        } else if (a.d()) {
            adColonyInterstitial.a(as.b(dVar.b(), "ad_id"));
            adColonyInterstitial.b(as.b(dVar.b(), "creative_id"));
            q.a(new Runnable() { // from class: com.adcolony.sdk.ab.17
                @Override // java.lang.Runnable
                public void run() {
                    adColonyInterstitial.getListener().onRequestFilled(adColonyInterstitial);
                }
            });
            return true;
        } else {
            return false;
        }
    }

    boolean b(d dVar) {
        String b = as.b(dVar.b(), "id");
        au.b.b("Removing ad 2");
        final AdColonyInterstitial remove = this.b.remove(b);
        if (remove == null || remove.getListener() == null) {
            a(dVar.c(), b);
            return false;
        } else if (a.d()) {
            q.a(new Runnable() { // from class: com.adcolony.sdk.ab.18
                @Override // java.lang.Runnable
                public void run() {
                    AdColonyZone adColonyZone = a.a().c().get(remove.getZoneID());
                    if (adColonyZone == null) {
                        adColonyZone = new AdColonyZone(remove.getZoneID());
                        adColonyZone.b(6);
                    }
                    remove.getListener().onRequestNotFilled(adColonyZone);
                }
            });
            return true;
        } else {
            return false;
        }
    }

    boolean c(d dVar) {
        String b = as.b(dVar.b(), "ad_session_id");
        aa aaVar = this.a.get(b);
        ad adVar = this.f.get(b);
        if (aaVar == null || adVar == null) {
            au.g.b("Invalid AudioPlayer message!");
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, AdColonyNativeAdViewListener adColonyNativeAdViewListener, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions) {
        float j = a.a().k().j();
        String e = q.e();
        JSONObject a = as.a();
        as.a(a, "zone_id", str);
        as.b(a, "type", 2);
        as.b(a, "width", (int) (adColonyAdSize.a * j));
        as.b(a, "height", (int) (j * adColonyAdSize.b));
        as.a(a, "id", e);
        adColonyNativeAdViewListener.a = str;
        if (adColonyAdOptions != null && adColonyAdOptions.d != null) {
            as.a(a, "options", adColonyAdOptions.d);
        }
        this.d.put(e, adColonyNativeAdViewListener);
        new d("AdSession.on_request", 1, a).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyAdOptions adColonyAdOptions) {
        String e = q.e();
        af a = a.a();
        JSONObject a2 = as.a();
        as.a(a2, "zone_id", str);
        as.a(a2, "fullscreen", true);
        as.b(a2, "width", a.a.l());
        as.b(a2, "height", a.a.m());
        as.b(a2, "type", 0);
        as.a(a2, "id", e);
        au.b.a("AdSession request with id = ").b(e);
        AdColonyInterstitial adColonyInterstitial = new AdColonyInterstitial(e, adColonyInterstitialListener, str);
        this.b.put(e, adColonyInterstitial);
        if (adColonyAdOptions != null && adColonyAdOptions.d != null) {
            adColonyInterstitial.a(adColonyAdOptions);
            as.a(a2, "options", adColonyAdOptions.d);
        }
        au.a.b("Requesting AdColony interstitial advertisement.");
        new d("AdSession.on_request", 1, a2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h(d dVar) {
        if (a.d()) {
            JSONObject b = dVar.b();
            af a = a.a();
            String b2 = as.b(b, "id");
            AdColonyInterstitial adColonyInterstitial = this.b.get(b2);
            u uVar = this.e.get(b2);
            int a2 = as.a(b, AdUnitActivity.EXTRA_ORIENTATION, -1);
            boolean z = uVar != null;
            if (adColonyInterstitial == null && !z) {
                a(dVar.c(), b2);
                return false;
            }
            JSONObject a3 = as.a();
            as.a(a3, "id", b2);
            if (adColonyInterstitial != null) {
                adColonyInterstitial.a(as.c(a3, "module_id"));
                adColonyInterstitial.b(a2);
                adColonyInterstitial.a();
            } else if (z) {
                uVar.b = a2;
                a.a(uVar.getExpandedContainer());
                a.a(uVar);
                a.c().startActivity(new Intent(a.c(), AdColonyAdViewActivity.class));
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(d dVar) {
        JSONObject b = dVar.b();
        int c = as.c(b, "status");
        if (c == 5 || c == 1 || c == 0 || c == 6) {
            return false;
        }
        String b2 = as.b(b, "id");
        au.b.b("Removing ad 3");
        final AdColonyInterstitial remove = this.b.remove(b2);
        if (remove == null) {
            a(dVar.c(), b2);
            return false;
        }
        final AdColonyInterstitialListener listener = remove.getListener();
        au.b.b("Ad attempt finished. Attempting to contact ad listener.");
        if (listener != null && a.d()) {
            q.a(new Runnable() { // from class: com.adcolony.sdk.ab.19
                @Override // java.lang.Runnable
                public void run() {
                    a.a().c(false);
                    listener.onClosed(remove);
                }
            });
        }
        remove.a((aa) null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j(d dVar) {
        if (a.d()) {
            JSONObject b = dVar.b();
            String b2 = as.b(b, "ad_session_id");
            aa aaVar = new aa(a.c(), b2);
            aaVar.b(dVar);
            if (this.a.containsKey(b2)) {
                u uVar = this.e.get(b2);
                if (uVar == null) {
                    return false;
                }
                uVar.setExpandedContainer(aaVar);
                return true;
            }
            au.b.a("Inserting container into hash map tied to ad session id: ").b(b2);
            this.a.put(b2, aaVar);
            if (as.c(b, "width") == 0) {
                if (this.b.get(b2) == null) {
                    a(dVar.c(), b2);
                    return false;
                }
                this.b.get(b2).a(aaVar);
            } else {
                aaVar.a(false);
            }
            JSONObject a = as.a();
            as.a(a, "success", true);
            dVar.a(a).a();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k(d dVar) {
        String b = as.b(dVar.b(), "ad_session_id");
        aa aaVar = this.a.get(b);
        if (aaVar == null) {
            a(dVar.c(), b);
            return false;
        }
        a(aaVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final aa aaVar) {
        if (a.d()) {
            q.a(new Runnable() { // from class: com.adcolony.sdk.ab.20
                @Override // java.lang.Runnable
                public void run() {
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i2 >= aaVar.l().size()) {
                            break;
                        }
                        a.b(aaVar.m().get(i2), aaVar.l().get(i2));
                        i = i2 + 1;
                    }
                    aaVar.m().clear();
                    aaVar.l().clear();
                    aaVar.removeAllViews();
                    aaVar.d = null;
                    aaVar.c = null;
                    au.d.a("Destroying container tied to ad_session_id = ").b(aaVar.a());
                    for (ao aoVar : aaVar.f().values()) {
                        aoVar.b();
                    }
                    for (s sVar : aaVar.g().values()) {
                        if (!sVar.g()) {
                            a.a().a(sVar.a());
                            sVar.loadUrl("about:blank");
                            sVar.clearCache(true);
                            sVar.removeAllViews();
                            sVar.a(true);
                        }
                    }
                    au.d.a("Stopping and releasing all media players associated with VideoViews tied to ad_session_id = ").b(aaVar.a());
                    for (r rVar : aaVar.d().values()) {
                        rVar.d();
                        rVar.g();
                    }
                    aaVar.d().clear();
                    aaVar.e().clear();
                    aaVar.g().clear();
                    aaVar.f().clear();
                    aaVar.i().clear();
                    aaVar.k().clear();
                    aaVar.h().clear();
                    aaVar.j().clear();
                    aaVar.a = true;
                }
            });
            u uVar = this.e.get(aaVar.a());
            if (uVar == null || uVar.c()) {
                au.b.b("Removing ad 4");
                this.a.remove(aaVar.a());
                aaVar.c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2) {
        au.g.a("Message '").a(str).a("' sent with invalid id: ").b(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l(d dVar) {
        JSONObject b = dVar.b();
        String c = dVar.c();
        String b2 = as.b(b, "ad_session_id");
        int c2 = as.c(b, "view_id");
        aa aaVar = this.a.get(b2);
        View view = aaVar.k().get(Integer.valueOf(c2));
        if (aaVar == null) {
            a(c, b2);
            return false;
        } else if (view == null) {
            a(c, "" + c2);
            return false;
        } else {
            view.bringToFront();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m(d dVar) {
        u uVar;
        JSONObject b = dVar.b();
        String c = dVar.c();
        String b2 = as.b(b, "ad_session_id");
        int c2 = as.c(b, "view_id");
        aa aaVar = this.a.get(b2);
        if (aaVar == null) {
            a(c, b2);
            return false;
        }
        aa expandedContainer = (aaVar.c() != 0 || as.c(b, "id") != 1 || (uVar = this.e.get(b2)) == null || uVar.getExpandedContainer() == null) ? aaVar : uVar.getExpandedContainer();
        View view = expandedContainer.k().get(Integer.valueOf(c2));
        if (view == null) {
            a(c, "" + c2);
            return false;
        }
        expandedContainer.removeView(view);
        expandedContainer.addView(view, view.getLayoutParams());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n(d dVar) {
        String b = as.b(dVar.b(), "ad_session_id");
        aa aaVar = this.a.get(b);
        if (aaVar == null) {
            a(dVar.c(), b);
            return false;
        }
        ad adVar = this.f.get(b);
        if (adVar == null) {
            adVar = new ad(b, aaVar.b());
            this.f.put(b, adVar);
        }
        adVar.a(dVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o(d dVar) {
        String b = as.b(dVar.b(), "ad_session_id");
        ad adVar = this.f.get(b);
        if (adVar == null) {
            a(dVar.c(), b);
            return false;
        }
        adVar.d(dVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p(d dVar) {
        String b = as.b(dVar.b(), "ad_session_id");
        ad adVar = this.f.get(b);
        if (adVar == null) {
            a(dVar.c(), b);
            return false;
        }
        adVar.c(dVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q(d dVar) {
        String b = as.b(dVar.b(), "ad_session_id");
        ad adVar = this.f.get(b);
        if (adVar == null) {
            a(dVar.c(), b);
            return false;
        }
        adVar.b(dVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(d dVar) {
        String b = as.b(dVar.b(), "ad_session_id");
        ad adVar = this.f.get(b);
        if (adVar == null) {
            a(dVar.c(), b);
            return false;
        }
        adVar.e(dVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<String, aa> b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConcurrentHashMap<String, AdColonyInterstitial> c() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<String, u> d() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<String, ad> e() {
        return this.f;
    }
}
