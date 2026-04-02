package com.vungle.publisher;

import com.vungle.publisher.c;
import com.vungle.publisher.hr;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class l implements MembersInjector<c.b> {
    static final /* synthetic */ boolean a;
    private final Provider<qg> b;
    private final Provider<hr.a> c;
    private final Provider<com.vungle.publisher.log.g> d;

    static {
        a = !l.class.desiredAssertionStatus();
    }

    public l(Provider<qg> provider, Provider<hr.a> provider2, Provider<com.vungle.publisher.log.g> provider3) {
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

    public static MembersInjector<c.b> a(Provider<qg> provider, Provider<hr.a> provider2, Provider<com.vungle.publisher.log.g> provider3) {
        return new l(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(c.b bVar) {
        if (bVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        bVar.eventBus = this.b.get();
        bVar.d = this.c.get();
        bVar.e = this.d.get();
    }
}
