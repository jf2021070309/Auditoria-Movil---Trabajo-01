package com.applovin.impl.sdk.network;

import android.content.SharedPreferences;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class f {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final v f4215b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f4216c;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList<g> f4218e;

    /* renamed from: d  reason: collision with root package name */
    private final Object f4217d = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<g> f4219f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private final Set<g> f4220g = new HashSet();

    public f(m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.a = mVar;
        this.f4215b = mVar.B();
        this.f4216c = mVar.L().getSharedPreferences("com.applovin.sdk.impl.postbackQueue.domain", 0);
        this.f4218e = b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final g gVar, final AppLovinPostbackListener appLovinPostbackListener) {
        v vVar = this.f4215b;
        vVar.b("PersistentPostbackManager", "Preparing to submit postback..." + gVar);
        if (this.a.c()) {
            this.f4215b.b("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
            return;
        }
        synchronized (this.f4217d) {
            if (this.f4220g.contains(gVar)) {
                v vVar2 = this.f4215b;
                vVar2.b("PersistentPostbackManager", "Skip pending postback: " + gVar.b());
                return;
            }
            gVar.l();
            c();
            int intValue = ((Integer) this.a.a(com.applovin.impl.sdk.c.b.cN)).intValue();
            if (gVar.k() <= intValue) {
                synchronized (this.f4217d) {
                    this.f4220g.add(gVar);
                }
                this.a.X().dispatchPostbackRequest(h.b(this.a).a(gVar.b()).c(gVar.c()).a(gVar.d()).b(gVar.a()).b(gVar.e()).a(gVar.f() != null ? new JSONObject(gVar.f()) : null).d(gVar.h()).c(gVar.g()).h(gVar.i()).g(gVar.j()).a(), new AppLovinPostbackListener() { // from class: com.applovin.impl.sdk.network.f.2
                    @Override // com.applovin.sdk.AppLovinPostbackListener
                    public void onPostbackFailure(String str, int i2) {
                        v vVar3 = f.this.f4215b;
                        StringBuilder z = e.a.d.a.a.z("Failed to submit postback with errorCode ", i2, ". Will retry later...  Postback: ");
                        z.append(gVar);
                        vVar3.c("PersistentPostbackManager", z.toString());
                        f.this.e(gVar);
                        j.a(appLovinPostbackListener, str, i2);
                    }

                    @Override // com.applovin.sdk.AppLovinPostbackListener
                    public void onPostbackSuccess(String str) {
                        f.this.d(gVar);
                        v vVar3 = f.this.f4215b;
                        StringBuilder y = e.a.d.a.a.y("Successfully submitted postback: ");
                        y.append(gVar);
                        vVar3.b("PersistentPostbackManager", y.toString());
                        f.this.d();
                        j.a(appLovinPostbackListener, str);
                    }
                });
                return;
            }
            v vVar3 = this.f4215b;
            vVar3.d("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + intValue + ". Dequeuing postback: " + gVar);
            d(gVar);
        }
    }

    private ArrayList<g> b() {
        Set<String> set = (Set) this.a.b(com.applovin.impl.sdk.c.d.p, new LinkedHashSet(0), this.f4216c);
        ArrayList<g> arrayList = new ArrayList<>(Math.max(1, set.size()));
        int intValue = ((Integer) this.a.a(com.applovin.impl.sdk.c.b.cN)).intValue();
        v vVar = this.f4215b;
        StringBuilder y = e.a.d.a.a.y("Deserializing ");
        y.append(set.size());
        y.append(" postback(s).");
        vVar.b("PersistentPostbackManager", y.toString());
        for (String str : set) {
            try {
                g gVar = new g(new JSONObject(str), this.a);
                if (gVar.k() < intValue) {
                    arrayList.add(gVar);
                } else {
                    v vVar2 = this.f4215b;
                    vVar2.b("PersistentPostbackManager", "Skipping deserialization because maximum attempt count exceeded for postback: " + gVar);
                }
            } catch (Throwable th) {
                v vVar3 = this.f4215b;
                vVar3.b("PersistentPostbackManager", "Unable to deserialize postback request from json: " + str, th);
            }
        }
        v vVar4 = this.f4215b;
        StringBuilder y2 = e.a.d.a.a.y("Successfully loaded postback queue with ");
        y2.append(arrayList.size());
        y2.append(" postback(s).");
        vVar4.b("PersistentPostbackManager", y2.toString());
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(g gVar) {
        synchronized (this.f4217d) {
            this.f4218e.add(gVar);
            c();
            v vVar = this.f4215b;
            vVar.b("PersistentPostbackManager", "Enqueued postback: " + gVar);
        }
    }

    private void c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.f4218e.size());
        Iterator<g> it = this.f4218e.iterator();
        while (it.hasNext()) {
            try {
                linkedHashSet.add(it.next().n().toString());
            } catch (Throwable th) {
                this.f4215b.b("PersistentPostbackManager", "Unable to serialize postback request to JSON.", th);
            }
        }
        this.a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<HashSet>>) com.applovin.impl.sdk.c.d.p, (com.applovin.impl.sdk.c.d<HashSet>) linkedHashSet, this.f4216c);
        this.f4215b.b("PersistentPostbackManager", "Wrote updated postback queue to disk.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(g gVar) {
        a(gVar, (AppLovinPostbackListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        synchronized (this.f4217d) {
            Iterator<g> it = this.f4219f.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
            this.f4219f.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(g gVar) {
        synchronized (this.f4217d) {
            this.f4220g.remove(gVar);
            this.f4218e.remove(gVar);
            c();
        }
        v vVar = this.f4215b;
        vVar.b("PersistentPostbackManager", "Dequeued successfully transmitted postback: " + gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(g gVar) {
        synchronized (this.f4217d) {
            this.f4220g.remove(gVar);
            this.f4219f.add(gVar);
        }
    }

    public void a() {
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.sdk.network.f.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (f.this.f4217d) {
                    if (f.this.f4218e != null) {
                        Iterator it = new ArrayList(f.this.f4218e).iterator();
                        while (it.hasNext()) {
                            f.this.c((g) it.next());
                        }
                    }
                }
            }
        };
        if (!((Boolean) this.a.a(com.applovin.impl.sdk.c.b.cO)).booleanValue()) {
            runnable.run();
            return;
        }
        this.a.S().a(new z(this.a, runnable), o.a.POSTBACKS);
    }

    public void a(g gVar) {
        a(gVar, true);
    }

    public void a(g gVar, boolean z) {
        a(gVar, z, (AppLovinPostbackListener) null);
    }

    public void a(final g gVar, boolean z, final AppLovinPostbackListener appLovinPostbackListener) {
        if (StringUtils.isValidString(gVar.b())) {
            if (z) {
                gVar.m();
            }
            Runnable runnable = new Runnable() { // from class: com.applovin.impl.sdk.network.f.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (f.this.f4217d) {
                        f.this.b(gVar);
                        f.this.a(gVar, appLovinPostbackListener);
                    }
                }
            };
            if (!Utils.isMainThread()) {
                runnable.run();
                return;
            }
            this.a.S().a(new z(this.a, runnable), o.a.POSTBACKS);
        }
    }
}
