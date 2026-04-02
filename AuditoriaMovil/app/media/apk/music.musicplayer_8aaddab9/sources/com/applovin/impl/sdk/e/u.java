package com.applovin.impl.sdk.e;

import android.text.TextUtils;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract class u<T> extends a implements b.c<T> {
    private final com.applovin.impl.sdk.network.c<T> a;

    /* renamed from: c  reason: collision with root package name */
    private final b.c<T> f4088c;

    /* renamed from: d  reason: collision with root package name */
    public b.a f4089d;

    /* renamed from: e  reason: collision with root package name */
    private o.a f4090e;

    /* renamed from: f  reason: collision with root package name */
    private com.applovin.impl.sdk.c.b<String> f4091f;

    /* renamed from: g  reason: collision with root package name */
    private com.applovin.impl.sdk.c.b<String> f4092g;

    public u(com.applovin.impl.sdk.network.c<T> cVar, com.applovin.impl.sdk.m mVar) {
        this(cVar, mVar, false);
    }

    public u(com.applovin.impl.sdk.network.c<T> cVar, final com.applovin.impl.sdk.m mVar, boolean z) {
        super("TaskRepeatRequest", mVar, z);
        this.f4090e = o.a.BACKGROUND;
        this.f4091f = null;
        this.f4092g = null;
        if (cVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.a = cVar;
        this.f4089d = new b.a();
        this.f4088c = new b.c<T>() { // from class: com.applovin.impl.sdk.e.u.1
            @Override // com.applovin.impl.sdk.network.b.c
            public void a(int i2, String str, T t) {
                u uVar;
                com.applovin.impl.sdk.c.b bVar;
                boolean z2 = false;
                boolean z3 = i2 < 200 || i2 >= 500;
                boolean z4 = i2 == 429;
                if ((i2 != -1009) && (z3 || z4 || u.this.a.m())) {
                    String f2 = u.this.a.f();
                    if (u.this.a.h() > 0) {
                        u uVar2 = u.this;
                        StringBuilder z5 = e.a.d.a.a.z("Unable to send request due to server failure (code ", i2, "). ");
                        z5.append(u.this.a.h());
                        z5.append(" attempts left, retrying in ");
                        z5.append(TimeUnit.MILLISECONDS.toSeconds(u.this.a.k()));
                        z5.append(" seconds...");
                        uVar2.c(z5.toString());
                        int h2 = u.this.a.h() - 1;
                        u.this.a.a(h2);
                        if (h2 == 0) {
                            u uVar3 = u.this;
                            uVar3.c(uVar3.f4091f);
                            if (StringUtils.isValidString(f2) && f2.length() >= 4) {
                                u.this.b("Switching to backup endpoint " + f2);
                                u.this.a.a(f2);
                                z2 = true;
                            }
                        }
                        long millis = (((Boolean) mVar.a(com.applovin.impl.sdk.c.b.dg)).booleanValue() && z2) ? 0L : u.this.a.l() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, u.this.a.i())) : u.this.a.k();
                        o S = mVar.S();
                        u uVar4 = u.this;
                        S.a(uVar4, uVar4.f4090e, millis);
                        return;
                    }
                    if (f2 == null || !f2.equals(u.this.a.a())) {
                        uVar = u.this;
                        bVar = uVar.f4091f;
                    } else {
                        uVar = u.this;
                        bVar = uVar.f4092g;
                    }
                    uVar.c(bVar);
                }
                u.this.a(i2, str, t);
            }

            @Override // com.applovin.impl.sdk.network.b.c
            public void a(T t, int i2) {
                u.this.a.a(0);
                u.this.a((u) t, i2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <ST> void c(com.applovin.impl.sdk.c.b<ST> bVar) {
        if (bVar != null) {
            com.applovin.impl.sdk.c.c K = d().K();
            K.a((com.applovin.impl.sdk.c.b<?>) bVar, (Object) bVar.b());
            K.a();
        }
    }

    public abstract void a(int i2, String str, T t);

    public void a(com.applovin.impl.sdk.c.b<String> bVar) {
        this.f4091f = bVar;
    }

    public void a(o.a aVar) {
        this.f4090e = aVar;
    }

    public abstract void a(T t, int i2);

    public void b(com.applovin.impl.sdk.c.b<String> bVar) {
        this.f4092g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i2;
        com.applovin.impl.sdk.network.b R = d().R();
        if (!d().c() && !d().d()) {
            com.applovin.impl.sdk.v.i("AppLovinSdk", "AppLovin SDK is disabled");
            i2 = -22;
        } else if (StringUtils.isValidString(this.a.a()) && this.a.a().length() >= 4) {
            if (TextUtils.isEmpty(this.a.b())) {
                this.a.b(this.a.e() != null ? "POST" : "GET");
            }
            R.a(this.a, this.f4089d, this.f4088c);
            return;
        } else {
            d("Task has an invalid or null request endpoint.");
            i2 = AppLovinErrorCodes.INVALID_URL;
        }
        a(i2, null, null);
    }
}
