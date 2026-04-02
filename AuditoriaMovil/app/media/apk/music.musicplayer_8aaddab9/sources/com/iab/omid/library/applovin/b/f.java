package com.iab.omid.library.applovin.b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.applovin.b.b;
import com.iab.omid.library.applovin.walking.TreeWalker;
/* loaded from: classes2.dex */
public class f implements com.iab.omid.library.applovin.a.c, b.a {
    private static f a;

    /* renamed from: b  reason: collision with root package name */
    private float f4787b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    private final com.iab.omid.library.applovin.a.e f4788c;

    /* renamed from: d  reason: collision with root package name */
    private final com.iab.omid.library.applovin.a.b f4789d;

    /* renamed from: e  reason: collision with root package name */
    private com.iab.omid.library.applovin.a.d f4790e;

    /* renamed from: f  reason: collision with root package name */
    private a f4791f;

    public f(com.iab.omid.library.applovin.a.e eVar, com.iab.omid.library.applovin.a.b bVar) {
        this.f4788c = eVar;
        this.f4789d = bVar;
    }

    public static f a() {
        if (a == null) {
            a = new f(new com.iab.omid.library.applovin.a.e(), new com.iab.omid.library.applovin.a.b());
        }
        return a;
    }

    private a e() {
        if (this.f4791f == null) {
            this.f4791f = a.a();
        }
        return this.f4791f;
    }

    @Override // com.iab.omid.library.applovin.a.c
    public void a(float f2) {
        this.f4787b = f2;
        for (com.iab.omid.library.applovin.adsession.a aVar : e().c()) {
            aVar.getAdSessionStatePublisher().a(f2);
        }
    }

    public void a(Context context) {
        this.f4790e = this.f4788c.a(new Handler(), context, this.f4789d.a(), this);
    }

    @Override // com.iab.omid.library.applovin.b.b.a
    public void a(boolean z) {
        if (z) {
            TreeWalker.getInstance().a();
        } else {
            TreeWalker.getInstance().c();
        }
    }

    public void b() {
        b.a().a(this);
        b.a().b();
        TreeWalker.getInstance().a();
        this.f4790e.a();
    }

    public void c() {
        TreeWalker.getInstance().b();
        b.a().c();
        this.f4790e.b();
    }

    public float d() {
        return this.f4787b;
    }
}
