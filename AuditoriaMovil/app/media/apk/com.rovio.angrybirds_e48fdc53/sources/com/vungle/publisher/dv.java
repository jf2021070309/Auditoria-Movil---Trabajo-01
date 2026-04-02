package com.vungle.publisher;

import com.vungle.publisher.ds;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class dv implements MembersInjector<ds.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ds> b;

    static {
        a = !dv.class.desiredAssertionStatus();
    }

    public dv(Provider<ds> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<ds.a> a(Provider<ds> provider) {
        return new dv(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ds.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b;
    }
}
