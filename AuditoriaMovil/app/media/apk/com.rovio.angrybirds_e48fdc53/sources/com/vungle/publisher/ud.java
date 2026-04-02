package com.vungle.publisher;

import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ud implements MembersInjector<ub> {
    static final /* synthetic */ boolean a;
    private final Provider<ue> b;

    static {
        a = !ud.class.desiredAssertionStatus();
    }

    public ud(Provider<ue> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<ub> a(Provider<ue> provider) {
        return new ud(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ub ubVar) {
        if (ubVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        ubVar.a = this.b.get();
    }
}
