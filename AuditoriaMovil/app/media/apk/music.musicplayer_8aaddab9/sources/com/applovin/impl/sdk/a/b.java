package com.applovin.impl.sdk.a;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class b {
    public final AppLovinAdBase a;

    /* renamed from: b  reason: collision with root package name */
    public final m f3794b;

    /* renamed from: c  reason: collision with root package name */
    public final v f3795c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3796d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3797e;

    /* renamed from: f  reason: collision with root package name */
    public AdSession f3798f;

    /* renamed from: g  reason: collision with root package name */
    public AdEvents f3799g;

    public b(AppLovinAdBase appLovinAdBase) {
        this.a = appLovinAdBase;
        this.f3794b = appLovinAdBase.getSdk();
        this.f3795c = appLovinAdBase.getSdk().B();
        StringBuilder y = e.a.d.a.a.y("AdEventTracker:");
        y.append(appLovinAdBase.getAdIdNumber());
        y.append(":");
        y.append(appLovinAdBase.getDspName());
        this.f3796d = y.toString();
    }

    public abstract AdSessionConfiguration a();

    public abstract AdSessionContext a(WebView webView);

    public void a(View view) {
        a(view, Collections.emptyList());
    }

    public void a(final View view, final List<d> list) {
        a("update main view: " + view, new Runnable() { // from class: com.applovin.impl.sdk.a.b.4
            @Override // java.lang.Runnable
            public void run() {
                b.this.f3798f.registerAdView(view);
                b.this.f3798f.removeAllFriendlyObstructions();
                for (d dVar : list) {
                    if (dVar.a() != null) {
                        try {
                            b.this.f3798f.addFriendlyObstruction(dVar.a(), dVar.b(), dVar.c());
                        } catch (Throwable th) {
                            b bVar = b.this;
                            v vVar = bVar.f3795c;
                            String str = bVar.f3796d;
                            vVar.b(str, "Failed to add friendly obstruction (" + dVar + ")", th);
                        }
                    }
                }
            }
        });
    }

    public void a(AdSession adSession) {
    }

    public void a(final String str) {
        a("track error", new Runnable() { // from class: com.applovin.impl.sdk.a.b.5
            @Override // java.lang.Runnable
            public void run() {
                b.this.f3798f.error(ErrorType.VIDEO, str);
            }
        });
    }

    public void a(final String str, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.b.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    b bVar = b.this;
                    if (bVar.f3797e) {
                        v vVar = bVar.f3795c;
                        String str2 = bVar.f3796d;
                        vVar.b(str2, "Running operation: " + str);
                        runnable.run();
                    }
                } catch (Throwable th) {
                    b bVar2 = b.this;
                    v vVar2 = bVar2.f3795c;
                    String str3 = bVar2.f3796d;
                    StringBuilder y = e.a.d.a.a.y("Failed to run operation: ");
                    y.append(str);
                    vVar2.b(str3, y.toString(), th);
                }
            }
        });
    }

    public void b() {
        b(null);
    }

    public void b(final WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                AdSessionContext a;
                if (!b.this.a.isOpenMeasurementEnabled()) {
                    b bVar = b.this;
                    bVar.f3795c.c(bVar.f3796d, "Skip starting session - Open Measurement disabled");
                    return;
                }
                b bVar2 = b.this;
                if (bVar2.f3798f != null) {
                    v vVar = bVar2.f3795c;
                    String str = bVar2.f3796d;
                    StringBuilder y = e.a.d.a.a.y("Attempting to start session again for ad: ");
                    y.append(b.this.a);
                    vVar.d(str, y.toString());
                    return;
                }
                bVar2.f3795c.b(bVar2.f3796d, "Starting session");
                AdSessionConfiguration a2 = b.this.a();
                if (a2 == null || (a = b.this.a(webView)) == null) {
                    return;
                }
                try {
                    b.this.f3798f = AdSession.createAdSession(a2, a);
                    try {
                        b bVar3 = b.this;
                        bVar3.f3799g = AdEvents.createAdEvents(bVar3.f3798f);
                        b bVar4 = b.this;
                        bVar4.a(bVar4.f3798f);
                        b.this.f3798f.start();
                        b bVar5 = b.this;
                        bVar5.f3797e = true;
                        bVar5.f3795c.b(bVar5.f3796d, "Session started");
                    } catch (Throwable th) {
                        b bVar6 = b.this;
                        bVar6.f3795c.b(bVar6.f3796d, "Failed to create ad events", th);
                    }
                } catch (Throwable th2) {
                    b bVar7 = b.this;
                    bVar7.f3795c.b(bVar7.f3796d, "Failed to create session", th2);
                }
            }
        });
    }

    public void c() {
        a("track loaded", new Runnable() { // from class: com.applovin.impl.sdk.a.b.2
            @Override // java.lang.Runnable
            public void run() {
                b.this.f3799g.loaded();
            }
        });
    }

    public void d() {
        a("track impression event", new Runnable() { // from class: com.applovin.impl.sdk.a.b.3
            @Override // java.lang.Runnable
            public void run() {
                b.this.f3799g.impressionOccurred();
            }
        });
    }

    public void e() {
        a("stop session", new Runnable() { // from class: com.applovin.impl.sdk.a.b.6
            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                bVar.f3797e = false;
                bVar.f3798f.finish();
                b.this.f3798f = null;
            }
        });
    }
}
