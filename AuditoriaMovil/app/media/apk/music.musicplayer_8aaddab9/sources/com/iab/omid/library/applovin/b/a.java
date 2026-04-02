package com.iab.omid.library.applovin.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/* loaded from: classes2.dex */
public class a {
    private static a a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.applovin.adsession.a> f4776b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.applovin.adsession.a> f4777c = new ArrayList<>();

    private a() {
    }

    public static a a() {
        return a;
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar) {
        this.f4776b.add(aVar);
    }

    public Collection<com.iab.omid.library.applovin.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f4776b);
    }

    public void b(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean d2 = d();
        this.f4777c.add(aVar);
        if (d2) {
            return;
        }
        f.a().b();
    }

    public Collection<com.iab.omid.library.applovin.adsession.a> c() {
        return Collections.unmodifiableCollection(this.f4777c);
    }

    public void c(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean d2 = d();
        this.f4776b.remove(aVar);
        this.f4777c.remove(aVar);
        if (!d2 || d()) {
            return;
        }
        f.a().c();
    }

    public boolean d() {
        return this.f4777c.size() > 0;
    }
}
