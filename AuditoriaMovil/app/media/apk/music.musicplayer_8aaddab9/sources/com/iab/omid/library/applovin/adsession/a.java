package com.iab.omid.library.applovin.adsession;

import android.view.View;
import com.iab.omid.library.applovin.b.c;
import com.iab.omid.library.applovin.b.f;
import com.iab.omid.library.applovin.d.e;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class a extends AdSession {
    private static final Pattern a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b  reason: collision with root package name */
    private final AdSessionContext f4762b;

    /* renamed from: c  reason: collision with root package name */
    private final AdSessionConfiguration f4763c;

    /* renamed from: e  reason: collision with root package name */
    private com.iab.omid.library.applovin.e.a f4765e;

    /* renamed from: f  reason: collision with root package name */
    private AdSessionStatePublisher f4766f;

    /* renamed from: j  reason: collision with root package name */
    private boolean f4770j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f4771k;

    /* renamed from: l  reason: collision with root package name */
    private PossibleObstructionListener f4772l;

    /* renamed from: d  reason: collision with root package name */
    private final List<c> f4764d = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private boolean f4767g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4768h = false;

    /* renamed from: i  reason: collision with root package name */
    private final String f4769i = UUID.randomUUID().toString();

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f4763c = adSessionConfiguration;
        this.f4762b = adSessionContext;
        c(null);
        this.f4766f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.applovin.publisher.a(adSessionContext.getWebView()) : new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f4766f.a();
        com.iab.omid.library.applovin.b.a.a().a(this);
        this.f4766f.a(adSessionConfiguration);
    }

    private c a(View view) {
        for (c cVar : this.f4764d) {
            if (cVar.a().get() == view) {
                return cVar;
            }
        }
        return null;
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!a.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    private static void b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void c(View view) {
        this.f4765e = new com.iab.omid.library.applovin.e.a(view);
    }

    private void d(View view) {
        Collection<a> b2 = com.iab.omid.library.applovin.b.a.a().b();
        if (b2 == null || b2.isEmpty()) {
            return;
        }
        for (a aVar : b2) {
            if (aVar != this && aVar.e() == view) {
                aVar.f4765e.clear();
            }
        }
    }

    private void k() {
        if (this.f4770j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void l() {
        if (this.f4771k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    public List<c> a() {
        return this.f4764d;
    }

    public void a(List<com.iab.omid.library.applovin.e.a> list) {
        if (b()) {
            ArrayList arrayList = new ArrayList();
            for (com.iab.omid.library.applovin.e.a aVar : list) {
                View view = aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f4772l.onPossibleObstructionsDetected(this.f4769i, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        l();
        getAdSessionStatePublisher().a(jSONObject);
        this.f4771k = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f4768h) {
            return;
        }
        b(view);
        a(str);
        if (a(view) == null) {
            this.f4764d.add(new c(view, friendlyObstructionPurpose, str));
        }
    }

    public boolean b() {
        return this.f4772l != null;
    }

    public void c() {
        k();
        getAdSessionStatePublisher().g();
        this.f4770j = true;
    }

    public void d() {
        l();
        getAdSessionStatePublisher().h();
        this.f4771k = true;
    }

    public View e() {
        return this.f4765e.get();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f4768h) {
            throw new IllegalStateException("AdSession is finished");
        }
        e.a(errorType, "Error type is null");
        e.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f4767g && !this.f4768h;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.f4768h) {
            return;
        }
        this.f4765e.clear();
        removeAllFriendlyObstructions();
        this.f4768h = true;
        getAdSessionStatePublisher().f();
        com.iab.omid.library.applovin.b.a.a().c(this);
        getAdSessionStatePublisher().b();
        this.f4766f = null;
        this.f4772l = null;
    }

    public boolean g() {
        return this.f4767g;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public String getAdSessionId() {
        return this.f4769i;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f4766f;
    }

    public boolean h() {
        return this.f4768h;
    }

    public boolean i() {
        return this.f4763c.isNativeImpressionOwner();
    }

    public boolean j() {
        return this.f4763c.isNativeMediaEventsOwner();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f4768h) {
            return;
        }
        e.a(view, "AdView is null");
        if (e() == view) {
            return;
        }
        c(view);
        getAdSessionStatePublisher().i();
        d(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f4768h) {
            return;
        }
        this.f4764d.clear();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f4768h) {
            return;
        }
        b(view);
        c a2 = a(view);
        if (a2 != null) {
            this.f4764d.remove(a2);
        }
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f4772l = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f4767g) {
            return;
        }
        this.f4767g = true;
        com.iab.omid.library.applovin.b.a.a().b(this);
        this.f4766f.a(f.a().d());
        this.f4766f.a(this, this.f4762b);
    }
}
