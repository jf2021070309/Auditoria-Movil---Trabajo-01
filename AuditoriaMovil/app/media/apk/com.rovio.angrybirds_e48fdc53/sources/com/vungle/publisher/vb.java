package com.vungle.publisher;

import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class vb implements MembersInjector<uz> {
    static final /* synthetic */ boolean a;
    private final Provider<ue> b;

    static {
        a = !vb.class.desiredAssertionStatus();
    }

    public vb(Provider<ue> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<uz> a(Provider<ue> provider) {
        return new vb(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(uz uzVar) {
        if (uzVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        uzVar.a = this.b.get();
    }
}
