package com.vungle.publisher;

import com.vungle.publisher.gw;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class gz implements MembersInjector<gw.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<gw> c;

    static {
        a = !gz.class.desiredAssertionStatus();
    }

    public gz(Provider<ci> provider, Provider<gw> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<gw.a> a(Provider<ci> provider, Provider<gw> provider2) {
        return new gz(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(gw.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.a = this.c;
    }
}
