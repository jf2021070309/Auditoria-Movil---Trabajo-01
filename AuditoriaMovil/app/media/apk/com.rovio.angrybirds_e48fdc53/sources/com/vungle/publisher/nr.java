package com.vungle.publisher;

import com.vungle.publisher.nk;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class nr implements MembersInjector<nk.a> {
    static final /* synthetic */ boolean a;
    private final Provider<qg> b;

    static {
        a = !nr.class.desiredAssertionStatus();
    }

    public nr(Provider<qg> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<nk.a> a(Provider<qg> provider) {
        return new nr(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(nk.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.eventBus = this.b.get();
    }
}
