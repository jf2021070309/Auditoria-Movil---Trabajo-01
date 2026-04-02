package com.vungle.publisher;

import com.vungle.publisher.gk;
import com.vungle.publisher.li;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class hj implements MembersInjector<gk> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<gk.a> c;
    private final Provider<li.a> d;

    static {
        a = !hj.class.desiredAssertionStatus();
    }

    public hj(Provider<ci> provider, Provider<gk.a> provider2, Provider<li.a> provider3) {
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

    public static MembersInjector<gk> a(Provider<ci> provider, Provider<gk.a> provider2, Provider<li.a> provider3) {
        return new hj(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(gk gkVar) {
        if (gkVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        gkVar.v = this.b.get();
        gkVar.x = this.c.get();
        gkVar.y = this.d.get();
    }
}
