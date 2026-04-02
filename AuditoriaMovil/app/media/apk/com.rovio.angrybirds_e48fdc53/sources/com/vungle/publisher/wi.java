package com.vungle.publisher;

import com.vungle.publisher.m;
import com.vungle.publisher.wg;
import com.vungle.publisher.wp;
import com.vungle.publisher.wv;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class wi implements MembersInjector<wg.a> {
    static final /* synthetic */ boolean a;
    private final Provider<m.a> b;
    private final Provider<wp.a.C0335a> c;
    private final Provider<wv.a> d;

    static {
        a = !wi.class.desiredAssertionStatus();
    }

    public wi(Provider<m.a> provider, Provider<wp.a.C0335a> provider2, Provider<wv.a> provider3) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
        if (!a && provider3 == null) {
            throw new AssertionError();
        }
        this.d = provider3;
    }

    public static MembersInjector<wg.a> a(Provider<m.a> provider, Provider<wp.a.C0335a> provider2, Provider<wv.a> provider3) {
        return new wi(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(wg.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b.get();
        aVar.c = this.c.get();
        aVar.b = this.d.get();
    }
}
