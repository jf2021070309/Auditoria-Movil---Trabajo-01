package com.vungle.publisher;

import com.vungle.publisher.gw;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ha implements MembersInjector<gw> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<gw.a> c;

    static {
        a = !ha.class.desiredAssertionStatus();
    }

    public ha(Provider<ci> provider, Provider<gw.a> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<gw> a(Provider<ci> provider, Provider<gw.a> provider2) {
        return new ha(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(gw gwVar) {
        if (gwVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        gwVar.v = this.b.get();
        gwVar.e = this.c.get();
    }
}
