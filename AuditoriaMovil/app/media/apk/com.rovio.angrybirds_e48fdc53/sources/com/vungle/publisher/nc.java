package com.vungle.publisher;

import com.vungle.publisher.my;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class nc implements MembersInjector<my.a> {
    static final /* synthetic */ boolean a;
    private final Provider<my> b;

    static {
        a = !nc.class.desiredAssertionStatus();
    }

    public nc(Provider<my> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<my.a> a(Provider<my> provider) {
        return new nc(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(my.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b;
    }
}
