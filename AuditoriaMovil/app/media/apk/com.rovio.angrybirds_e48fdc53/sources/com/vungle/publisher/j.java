package com.vungle.publisher;

import com.vungle.publisher.c;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class j implements MembersInjector<c.a> {
    static final /* synthetic */ boolean a;
    private final Provider<qg> b;
    private final Provider<com.vungle.publisher.log.g> c;

    static {
        a = !j.class.desiredAssertionStatus();
    }

    public j(Provider<qg> provider, Provider<com.vungle.publisher.log.g> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<c.a> a(Provider<qg> provider, Provider<com.vungle.publisher.log.g> provider2) {
        return new j(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(c.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.eventBus = this.b.get();
        aVar.b = this.c.get();
    }
}
