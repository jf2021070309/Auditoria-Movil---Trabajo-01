package com.applovin.impl.sdk.e;

import android.text.TextUtils;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract class t<T> extends a implements b.c<T> {
    private final com.applovin.impl.sdk.network.c<T> a;
    private final b.c<T> c;
    protected b.a d;
    private o.a e;
    private com.applovin.impl.sdk.c.b<String> f;
    private com.applovin.impl.sdk.c.b<String> g;

    public t(com.applovin.impl.sdk.network.c<T> cVar, com.applovin.impl.sdk.k kVar) {
        this(cVar, kVar, false);
    }

    public t(com.applovin.impl.sdk.network.c<T> cVar, final com.applovin.impl.sdk.k kVar, boolean z) {
        super("TaskRepeatRequest", kVar, z);
        this.e = o.a.BACKGROUND;
        this.f = null;
        this.g = null;
        if (cVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.a = cVar;
        this.d = new b.a();
        this.c = new b.c<T>() { // from class: com.applovin.impl.sdk.e.t.1
            @Override // com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, T t) {
                t tVar;
                com.applovin.impl.sdk.c.b bVar;
                boolean z2 = false;
                boolean z3 = i < 200 || i >= 500;
                boolean z4 = i == 429;
                if ((i != -1009) && (z3 || z4 || t.this.a.m())) {
                    String f = t.this.a.f();
                    if (t.this.a.h() > 0) {
                        t tVar2 = t.this;
                        tVar2.c("Unable to send request due to server failure (code " + i + "). " + t.this.a.h() + " attempts left, retrying in " + TimeUnit.MILLISECONDS.toSeconds(t.this.a.k()) + " seconds...");
                        int h = t.this.a.h() - 1;
                        t.this.a.a(h);
                        if (h == 0) {
                            t tVar3 = t.this;
                            tVar3.c(tVar3.f);
                            if (StringUtils.isValidString(f) && f.length() >= 4) {
                                t tVar4 = t.this;
                                tVar4.b("Switching to backup endpoint " + f);
                                t.this.a.a(f);
                                z2 = true;
                            }
                        }
                        long millis = (((Boolean) kVar.a(com.applovin.impl.sdk.c.b.dg)).booleanValue() && z2) ? 0L : t.this.a.l() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, t.this.a.i())) : t.this.a.k();
                        o Q = kVar.Q();
                        t tVar5 = t.this;
                        Q.a(tVar5, tVar5.e, millis);
                        return;
                    }
                    if (f == null || !f.equals(t.this.a.a())) {
                        tVar = t.this;
                        bVar = tVar.f;
                    } else {
                        tVar = t.this;
                        bVar = tVar.g;
                    }
                    tVar.c(bVar);
                }
                t.this.a(i, str, t);
            }

            @Override // com.applovin.impl.sdk.network.b.c
            public void a(T t, int i) {
                t.this.a.a(0);
                t.this.a((t) t, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <ST> void c(com.applovin.impl.sdk.c.b<ST> bVar) {
        if (bVar != null) {
            com.applovin.impl.sdk.c.c I = d().I();
            I.a((com.applovin.impl.sdk.c.b<?>) bVar, (Object) bVar.b());
            I.a();
        }
    }

    public abstract void a(int i, String str, T t);

    public void a(com.applovin.impl.sdk.c.b<String> bVar) {
        this.f = bVar;
    }

    public void a(o.a aVar) {
        this.e = aVar;
    }

    public abstract void a(T t, int i);

    public void b(com.applovin.impl.sdk.c.b<String> bVar) {
        this.g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        com.applovin.impl.sdk.network.b P = d().P();
        if (!d().c() && !d().d()) {
            com.applovin.impl.sdk.r.i("AppLovinSdk", "AppLovin SDK is disabled");
            i = -22;
        } else if (StringUtils.isValidString(this.a.a()) && this.a.a().length() >= 4) {
            if (TextUtils.isEmpty(this.a.b())) {
                this.a.b(this.a.e() != null ? "POST" : "GET");
            }
            P.a(this.a, this.d, this.c);
            return;
        } else {
            d("Task has an invalid or null request endpoint.");
            i = AppLovinErrorCodes.INVALID_URL;
        }
        a(i, null, null);
    }
}
