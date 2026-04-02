package com.vungle.publisher;

import com.vungle.publisher.my;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ng implements MembersInjector<my.b.a> {
    static final /* synthetic */ boolean a;
    private final Provider<my.b> b;

    static {
        a = !ng.class.desiredAssertionStatus();
    }

    public ng(Provider<my.b> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<my.b.a> a(Provider<my.b> provider) {
        return new ng(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(my.b.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b.get();
    }
}
