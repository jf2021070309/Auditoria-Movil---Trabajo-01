package com.vungle.publisher;

import com.vungle.publisher.oy;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class pe implements MembersInjector<oy.a> {
    static final /* synthetic */ boolean a;
    private final Provider<qg> b;

    static {
        a = !pe.class.desiredAssertionStatus();
    }

    public pe(Provider<qg> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<oy.a> a(Provider<qg> provider) {
        return new pe(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(oy.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.eventBus = this.b.get();
    }
}
