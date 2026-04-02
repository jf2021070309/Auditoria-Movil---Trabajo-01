package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Timer;
/* renamed from: com.ironsource.mediationsdk.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0108b {
    public AbstractAdapter b;
    NetworkSettings c;
    String d;
    boolean e;
    public String f;
    public String g;
    Timer i;
    Timer j;
    int k;
    int l;
    public int m;
    public int n;
    private String r;
    private String t = "maxAdsPerSession";
    private String u = "maxAdsPerIteration";
    private String v = "maxAdsPerDay";
    int h = 0;
    private int s = 0;
    a a = a.NOT_INITIATED;
    IronSourceLoggerManager q = IronSourceLoggerManager.getLogger();
    protected Long o = null;
    protected Long p = null;

    /* renamed from: com.ironsource.mediationsdk.b$a */
    /* loaded from: classes2.dex */
    public enum a {
        NOT_INITIATED(0),
        INIT_FAILED(1),
        INITIATED(2),
        AVAILABLE(3),
        NOT_AVAILABLE(4),
        EXHAUSTED(5),
        CAPPED_PER_SESSION(6),
        INIT_PENDING(7),
        LOAD_PENDING(8),
        CAPPED_PER_DAY(9),
        NEEDS_RELOAD(10);
        
        public int l;

        a(int i) {
            this.l = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0108b(NetworkSettings networkSettings) {
        this.r = networkSettings.getProviderTypeForReflection();
        this.d = networkSettings.getProviderInstanceName();
        this.e = networkSettings.isMultipleInstances();
        this.c = networkSettings;
        this.f = networkSettings.getSubProviderId();
        this.g = networkSettings.getAdSourceNameForEvents();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(a aVar) {
        if (this.a == aVar) {
            return;
        }
        this.a = aVar;
        IronSourceLoggerManager ironSourceLoggerManager = this.q;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, "Smart Loading - " + this.d + " state changed to " + aVar.toString(), 0);
        if (this.b != null && (aVar == a.CAPPED_PER_SESSION || aVar == a.CAPPED_PER_DAY)) {
            this.b.setMediationState(aVar, k());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, String str2) {
        IronSourceLoggerManager ironSourceLoggerManager = this.q;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, str + " exception: " + this.d + " | " + str2, 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this.h >= this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return this.s >= this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        if (!a() && !b()) {
            if (!(this.a == a.CAPPED_PER_DAY)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.h++;
        this.s++;
        if (b()) {
            a(a.CAPPED_PER_SESSION);
        } else if (a()) {
            a(a.EXHAUSTED);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        try {
            if (this.i != null) {
                this.i.cancel();
            }
        } catch (Exception e) {
            a("stopInitTimer", e.getLocalizedMessage());
        } finally {
            this.i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        try {
            if (this.j != null) {
                this.j.cancel();
            }
        } catch (Exception e) {
            a("stopLoadTimer", e.getLocalizedMessage());
        } finally {
            this.j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void g();

    abstract void h();

    abstract void i();

    public final String j() {
        return this.e ? this.r : this.d;
    }

    protected abstract String k();

    public final Long l() {
        return this.o;
    }

    public final Long m() {
        return this.p;
    }
}
