package com.vungle.publisher.log;

import com.vungle.publisher.env.n;
import com.vungle.publisher.env.r;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class c implements MembersInjector<a> {
    static final /* synthetic */ boolean a;
    private final Provider<r> b;
    private final Provider<n> c;

    static {
        a = !c.class.desiredAssertionStatus();
    }

    public c(Provider<r> provider, Provider<n> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<a> a(Provider<r> provider, Provider<n> provider2) {
        return new c(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b.get();
        aVar.b = this.c.get();
    }
}
