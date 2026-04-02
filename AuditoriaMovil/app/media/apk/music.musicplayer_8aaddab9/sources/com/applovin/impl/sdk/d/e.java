package com.applovin.impl.sdk.d;
/* loaded from: classes.dex */
public final class e {
    private long a;

    /* renamed from: b  reason: collision with root package name */
    private long f3989b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3990c;

    /* renamed from: d  reason: collision with root package name */
    private long f3991d;

    /* renamed from: e  reason: collision with root package name */
    private long f3992e;

    /* renamed from: f  reason: collision with root package name */
    private int f3993f;

    /* renamed from: g  reason: collision with root package name */
    private Exception f3994g;

    public void a() {
        this.f3990c = true;
    }

    public void a(int i2) {
        this.f3993f = i2;
    }

    public void a(long j2) {
        this.a += j2;
    }

    public void a(Exception exc) {
        this.f3994g = exc;
    }

    public void b(long j2) {
        this.f3989b += j2;
    }

    public boolean b() {
        return this.f3990c;
    }

    public long c() {
        return this.a;
    }

    public long d() {
        return this.f3989b;
    }

    public void e() {
        this.f3991d++;
    }

    public void f() {
        this.f3992e++;
    }

    public long g() {
        return this.f3991d;
    }

    public long h() {
        return this.f3992e;
    }

    public Exception i() {
        return this.f3994g;
    }

    public int j() {
        return this.f3993f;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("CacheStatsTracker{totalDownloadedBytes=");
        y.append(this.a);
        y.append(", totalCachedBytes=");
        y.append(this.f3989b);
        y.append(", isHTMLCachingCancelled=");
        y.append(this.f3990c);
        y.append(", htmlResourceCacheSuccessCount=");
        y.append(this.f3991d);
        y.append(", htmlResourceCacheFailureCount=");
        y.append(this.f3992e);
        y.append('}');
        return y.toString();
    }
}
