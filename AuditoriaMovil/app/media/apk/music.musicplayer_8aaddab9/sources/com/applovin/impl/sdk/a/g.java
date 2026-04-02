package com.applovin.impl.sdk.a;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.a.j;
import com.applovin.impl.a.l;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ErrorType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class g extends b {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ boolean f3810h = true;

    /* renamed from: i  reason: collision with root package name */
    private final com.applovin.impl.a.a f3811i;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicBoolean f3812j;

    /* renamed from: k  reason: collision with root package name */
    private MediaEvents f3813k;

    /* renamed from: l  reason: collision with root package name */
    private final VastProperties f3814l;

    /* renamed from: m  reason: collision with root package name */
    private final AtomicBoolean f3815m;

    /* renamed from: n  reason: collision with root package name */
    private final AtomicBoolean f3816n;
    private final AtomicBoolean o;
    private final AtomicBoolean p;

    public g(com.applovin.impl.a.a aVar) {
        super(aVar);
        this.f3812j = new AtomicBoolean();
        this.f3815m = new AtomicBoolean();
        this.f3816n = new AtomicBoolean();
        this.o = new AtomicBoolean();
        this.p = new AtomicBoolean();
        this.f3811i = aVar;
        this.f3814l = aVar.f() == -1 ? VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE) : VastProperties.createVastPropertiesForSkippableMedia((float) aVar.f(), true, Position.STANDALONE);
    }

    @Override // com.applovin.impl.sdk.a.b
    public AdSessionConfiguration a() {
        try {
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable th) {
            this.f3795c.b(this.f3796d, "Failed to create ad session configuration", th);
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.a.b
    public AdSessionContext a(WebView webView) {
        com.applovin.impl.a.f fVar;
        Set<j> set;
        if (f3810h || this.f3811i.aQ() != null) {
            ArrayList arrayList = new ArrayList();
            for (com.applovin.impl.a.b bVar : this.f3811i.aQ().a()) {
                List<com.applovin.impl.a.g> b2 = bVar.b();
                if (!b2.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (com.applovin.impl.a.g gVar : b2) {
                        if ("omid".equalsIgnoreCase(gVar.a())) {
                            arrayList2.add(gVar);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        set = bVar.d();
                        fVar = com.applovin.impl.a.f.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED;
                        l.a(set, fVar, this.f3794b);
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            try {
                                arrayList3.add(new URL(((com.applovin.impl.a.g) it.next()).b()));
                            } catch (Throwable th) {
                                this.f3795c.b(this.f3796d, "Failed to parse JavaScript resource url", th);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            String c2 = bVar.c();
                            String a = bVar.a();
                            if (!StringUtils.isValidString(c2) || StringUtils.isValidString(a)) {
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    URL url = (URL) it2.next();
                                    arrayList.add(StringUtils.isValidString(c2) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(a, url, c2) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                                }
                            }
                        }
                    }
                }
                set = bVar.d();
                fVar = com.applovin.impl.a.f.FAILED_TO_LOAD_RESOURCE;
                l.a(set, fVar, this.f3794b);
            }
            String e2 = this.f3794b.am().e();
            if (TextUtils.isEmpty(e2)) {
                this.f3795c.e(this.f3796d, "JavaScript SDK content not loaded successfully");
                return null;
            }
            try {
                return AdSessionContext.createNativeAdSessionContext(this.f3794b.am().d(), e2, arrayList, this.f3811i.getOpenMeasurementContentUrl(), this.f3811i.getOpenMeasurementCustomReferenceData());
            } catch (Throwable th2) {
                this.f3795c.b(this.f3796d, "Failed to create ad session context", th2);
                return null;
            }
        }
        throw new AssertionError();
    }

    public void a(final float f2, final boolean z) {
        if (this.f3815m.compareAndSet(false, true)) {
            a("track started", new Runnable() { // from class: com.applovin.impl.sdk.a.g.14
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f3813k.start(f2, z ? 0.0f : 1.0f);
                }
            });
        }
    }

    @Override // com.applovin.impl.sdk.a.b
    public void a(final View view, final List<d> list) {
        a("update main view: " + view, new Runnable() { // from class: com.applovin.impl.sdk.a.g.11
            @Override // java.lang.Runnable
            public void run() {
                g.this.f3798f.registerAdView(view);
                g.this.f3798f.removeAllFriendlyObstructions();
                for (d dVar : list) {
                    if (dVar.a() != null) {
                        try {
                            g.this.f3798f.addFriendlyObstruction(dVar.a(), dVar.b(), dVar.c());
                        } catch (Throwable th) {
                            g gVar = g.this;
                            v vVar = gVar.f3795c;
                            String str = gVar.f3796d;
                            vVar.b(str, "Failed to add friendly obstruction (" + dVar + ")", th);
                        }
                    }
                }
            }
        });
    }

    @Override // com.applovin.impl.sdk.a.b
    public void a(AdSession adSession) {
        try {
            this.f3813k = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th) {
            this.f3795c.b(this.f3796d, "Failed to create media events", th);
        }
    }

    @Override // com.applovin.impl.sdk.a.b
    public void a(final String str) {
        a("track error", new Runnable() { // from class: com.applovin.impl.sdk.a.g.12
            @Override // java.lang.Runnable
            public void run() {
                g.this.f3798f.error(ErrorType.VIDEO, str);
            }
        });
    }

    public void a(final boolean z) {
        a("track volume changed", new Runnable() { // from class: com.applovin.impl.sdk.a.g.7
            @Override // java.lang.Runnable
            public void run() {
                g.this.f3813k.volumeChange(z ? 0.0f : 1.0f);
            }
        });
    }

    @Override // com.applovin.impl.sdk.a.b
    public void c() {
        a("track loaded", new Runnable() { // from class: com.applovin.impl.sdk.a.g.1
            @Override // java.lang.Runnable
            public void run() {
                g gVar = g.this;
                gVar.f3799g.loaded(gVar.f3814l);
            }
        });
    }

    @Override // com.applovin.impl.sdk.a.b
    public void d() {
        a("track impression event", new Runnable() { // from class: com.applovin.impl.sdk.a.g.10
            @Override // java.lang.Runnable
            public void run() {
                g.this.f3799g.impressionOccurred();
            }
        });
    }

    @Override // com.applovin.impl.sdk.a.b
    public void e() {
        a("stop session", new Runnable() { // from class: com.applovin.impl.sdk.a.g.13
            @Override // java.lang.Runnable
            public void run() {
                g gVar = g.this;
                gVar.f3797e = false;
                gVar.f3798f.finish();
                g.this.f3798f = null;
            }
        });
    }

    public void f() {
        if (this.f3816n.compareAndSet(false, true)) {
            a("track first quartile", new Runnable() { // from class: com.applovin.impl.sdk.a.g.15
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f3813k.firstQuartile();
                }
            });
        }
    }

    public void g() {
        if (this.o.compareAndSet(false, true)) {
            a("track midpoint", new Runnable() { // from class: com.applovin.impl.sdk.a.g.16
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f3813k.midpoint();
                }
            });
        }
    }

    public void h() {
        if (this.p.compareAndSet(false, true)) {
            a("track third quartile", new Runnable() { // from class: com.applovin.impl.sdk.a.g.17
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f3813k.thirdQuartile();
                }
            });
        }
    }

    public void i() {
        a("track completed", new Runnable() { // from class: com.applovin.impl.sdk.a.g.2
            @Override // java.lang.Runnable
            public void run() {
                g.this.f3813k.complete();
            }
        });
    }

    public void j() {
        a("track paused", new Runnable() { // from class: com.applovin.impl.sdk.a.g.3
            @Override // java.lang.Runnable
            public void run() {
                g.this.f3813k.pause();
            }
        });
    }

    public void k() {
        a("track resumed", new Runnable() { // from class: com.applovin.impl.sdk.a.g.4
            @Override // java.lang.Runnable
            public void run() {
                g.this.f3813k.resume();
            }
        });
    }

    public void l() {
        if (this.f3812j.compareAndSet(false, true)) {
            a("buffer started", new Runnable() { // from class: com.applovin.impl.sdk.a.g.5
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f3813k.bufferStart();
                }
            });
        }
    }

    public void m() {
        if (this.f3812j.compareAndSet(true, false)) {
            a("buffer finished", new Runnable() { // from class: com.applovin.impl.sdk.a.g.6
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f3813k.bufferFinish();
                }
            });
        }
    }

    public void n() {
        a("track skipped", new Runnable() { // from class: com.applovin.impl.sdk.a.g.8
            @Override // java.lang.Runnable
            public void run() {
                g.this.f3813k.skipped();
            }
        });
    }

    public void o() {
        a("track clicked", new Runnable() { // from class: com.applovin.impl.sdk.a.g.9
            @Override // java.lang.Runnable
            public void run() {
                g.this.f3813k.adUserInteraction(InteractionType.CLICK);
            }
        });
    }
}
