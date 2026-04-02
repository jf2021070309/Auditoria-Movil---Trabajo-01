package com.applovin.impl.sdk.network;

import android.content.SharedPreferences;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.y;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class f {
    private final k a;
    private final r b;
    private final SharedPreferences c;
    private final ArrayList<g> e;
    private final Object d = new Object();
    private final ArrayList<g> f = new ArrayList<>();
    private final Set<g> g = new HashSet();

    public f(k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.a = kVar;
        this.b = kVar.z();
        this.c = kVar.J().getSharedPreferences("com.applovin.sdk.impl.postbackQueue.domain", 0);
        this.e = b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final g gVar, final AppLovinPostbackListener appLovinPostbackListener) {
        r rVar = this.b;
        rVar.b("PersistentPostbackManager", "Preparing to submit postback..." + gVar);
        if (this.a.c()) {
            this.b.b("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
            return;
        }
        synchronized (this.d) {
            if (this.g.contains(gVar)) {
                r rVar2 = this.b;
                rVar2.b("PersistentPostbackManager", "Skip pending postback: " + gVar.b());
                return;
            }
            gVar.l();
            c();
            int intValue = ((Integer) this.a.a(com.applovin.impl.sdk.c.b.cN)).intValue();
            if (gVar.k() <= intValue) {
                synchronized (this.d) {
                    this.g.add(gVar);
                }
                this.a.V().dispatchPostbackRequest(h.b(this.a).a(gVar.b()).c(gVar.c()).a(gVar.d()).b(gVar.a()).b(gVar.e()).a(gVar.f() != null ? new JSONObject(gVar.f()) : null).d(gVar.h()).c(gVar.g()).h(gVar.i()).g(gVar.j()).a(), new AppLovinPostbackListener() { // from class: com.applovin.impl.sdk.network.f.2
                    @Override // com.applovin.sdk.AppLovinPostbackListener
                    public void onPostbackFailure(String str, int i) {
                        r rVar3 = f.this.b;
                        rVar3.c("PersistentPostbackManager", "Failed to submit postback with errorCode " + i + ". Will retry later...  Postback: " + gVar);
                        f.this.e(gVar);
                        com.applovin.impl.sdk.utils.i.a(appLovinPostbackListener, str, i);
                    }

                    @Override // com.applovin.sdk.AppLovinPostbackListener
                    public void onPostbackSuccess(String str) {
                        f.this.d(gVar);
                        r rVar3 = f.this.b;
                        rVar3.b("PersistentPostbackManager", "Successfully submitted postback: " + gVar);
                        f.this.d();
                        com.applovin.impl.sdk.utils.i.a(appLovinPostbackListener, str);
                    }
                });
                return;
            }
            r rVar3 = this.b;
            rVar3.d("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + intValue + ". Dequeuing postback: " + gVar);
            d(gVar);
        }
    }

    private ArrayList<g> b() {
        Set<String> set = (Set) this.a.b(com.applovin.impl.sdk.c.d.n, new LinkedHashSet(0), this.c);
        ArrayList<g> arrayList = new ArrayList<>(Math.max(1, set.size()));
        int intValue = ((Integer) this.a.a(com.applovin.impl.sdk.c.b.cN)).intValue();
        r rVar = this.b;
        rVar.b("PersistentPostbackManager", "Deserializing " + set.size() + " postback(s).");
        for (String str : set) {
            try {
                g gVar = new g(new JSONObject(str), this.a);
                if (gVar.k() < intValue) {
                    arrayList.add(gVar);
                } else {
                    r rVar2 = this.b;
                    rVar2.b("PersistentPostbackManager", "Skipping deserialization because maximum attempt count exceeded for postback: " + gVar);
                }
            } catch (Throwable th) {
                r rVar3 = this.b;
                rVar3.b("PersistentPostbackManager", "Unable to deserialize postback request from json: " + str, th);
            }
        }
        r rVar4 = this.b;
        rVar4.b("PersistentPostbackManager", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(g gVar) {
        synchronized (this.d) {
            this.e.add(gVar);
            c();
            r rVar = this.b;
            rVar.b("PersistentPostbackManager", "Enqueued postback: " + gVar);
        }
    }

    private void c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.e.size());
        Iterator<g> it = this.e.iterator();
        while (it.hasNext()) {
            try {
                linkedHashSet.add(it.next().n().toString());
            } catch (Throwable th) {
                this.b.b("PersistentPostbackManager", "Unable to serialize postback request to JSON.", th);
            }
        }
        this.a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<HashSet>>) com.applovin.impl.sdk.c.d.n, (com.applovin.impl.sdk.c.d<HashSet>) linkedHashSet, this.c);
        this.b.b("PersistentPostbackManager", "Wrote updated postback queue to disk.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(g gVar) {
        a(gVar, (AppLovinPostbackListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        synchronized (this.d) {
            Iterator<g> it = this.f.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
            this.f.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(g gVar) {
        synchronized (this.d) {
            this.g.remove(gVar);
            this.e.remove(gVar);
            c();
        }
        r rVar = this.b;
        rVar.b("PersistentPostbackManager", "Dequeued successfully transmitted postback: " + gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(g gVar) {
        synchronized (this.d) {
            this.g.remove(gVar);
            this.f.add(gVar);
        }
    }

    public void a() {
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.sdk.network.f.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (f.this.d) {
                    if (f.this.e != null) {
                        for (g gVar : new ArrayList(f.this.e)) {
                            f.this.c(gVar);
                        }
                    }
                }
            }
        };
        if (!((Boolean) this.a.a(com.applovin.impl.sdk.c.b.cO)).booleanValue()) {
            runnable.run();
            return;
        }
        this.a.Q().a(new y(this.a, runnable), o.a.POSTBACKS);
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
                    synchronized (f.this.d) {
                        f.this.b(gVar);
                        f.this.a(gVar, appLovinPostbackListener);
                    }
                }
            };
            if (!Utils.isMainThread()) {
                runnable.run();
                return;
            }
            this.a.Q().a(new y(this.a, runnable), o.a.POSTBACKS);
        }
    }
}
