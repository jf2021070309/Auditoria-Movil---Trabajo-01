package com.vungle.publisher;

import com.vungle.publisher.hk;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ho implements MembersInjector<hk> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<hk.a> c;

    static {
        a = !ho.class.desiredAssertionStatus();
    }

    public ho(Provider<ci> provider, Provider<hk.a> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<hk> a(Provider<ci> provider, Provider<hk.a> provider2) {
        return new ho(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(hk hkVar) {
        if (hkVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        hkVar.v = this.b.get();
        hkVar.c = this.c.get();
    }
}
