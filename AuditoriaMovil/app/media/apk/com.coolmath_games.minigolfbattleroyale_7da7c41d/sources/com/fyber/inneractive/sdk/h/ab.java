package com.fyber.inneractive.sdk.h;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.h.y;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class ab<T> implements y<T> {
    private Map<String, String> a;
    private g b;
    final r<T> d;
    e e;
    y.a f;
    public volatile boolean c = false;
    private volatile int g = ai.a;

    @Override // com.fyber.inneractive.sdk.h.y
    public void a(w<T> wVar, String str, String str2) {
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public byte[] e() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final String f() {
        return "application/json; charset=utf-8";
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public String i() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public a<T> j() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public com.fyber.inneractive.sdk.config.a.s o() {
        return null;
    }

    public ab(r<T> rVar, e eVar) {
        this.d = rVar;
        this.e = eVar;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public Map<String, String> d() {
        return this.a;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final boolean l() {
        return this.c;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final g a(String str) throws Exception {
        try {
            if (this.f != null) {
                this.f.a("sdkInitNetworkRequest");
            }
            this.b = this.e.a(this, a(), str);
            if (this.f != null) {
                this.f.a("sdkGotServerResponse");
            }
            return this.b;
        } catch (al e) {
            IAlog.a("failed read network response", e, new Object[0]);
            throw e;
        } catch (b e2) {
            IAlog.a("failed start network request", e2, new Object[0]);
            throw e2;
        } catch (Exception e3) {
            IAlog.a("failed start network request", e3, new Object[0]);
            throw e3;
        }
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final void n() {
        try {
            if (this.b != null) {
                g gVar = this.b;
                if (gVar.b != null) {
                    try {
                        gVar.b.close();
                    } catch (Throwable unused) {
                    }
                }
            }
            this.e.a();
        } catch (Exception unused2) {
        }
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final void a(final T t, final Exception exc, final boolean z) {
        com.fyber.inneractive.sdk.util.m.a().post(new Runnable() { // from class: com.fyber.inneractive.sdk.h.ab.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                ab.this.d.a(t, exc, z);
            }
        });
    }

    private static String a() {
        for (int i = 0; !IAConfigManager.b().c.compareAndSet(true, true) && i < 25; i++) {
            IAlog.b("UserAgentProvider | waiting on user agent", new Object[0]);
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
        }
        return IAConfigManager.b().a();
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final void a(int i) {
        this.g = i;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final int p() {
        return this.g;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public ak q() {
        return new ak(IAConfigManager.c().a.a("connect_timeout", 5000, 1), IAConfigManager.c().a.a("read_timeout", 5000, 1));
    }
}
