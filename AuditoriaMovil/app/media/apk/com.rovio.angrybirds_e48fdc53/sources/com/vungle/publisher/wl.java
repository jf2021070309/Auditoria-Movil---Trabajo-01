package com.vungle.publisher;

import com.vungle.publisher.m;
import com.vungle.publisher.wj;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class wl implements MembersInjector<wj.a> {
    static final /* synthetic */ boolean a;
    private final Provider<m.a> b;

    static {
        a = !wl.class.desiredAssertionStatus();
    }

    public wl(Provider<m.a> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<wj.a> a(Provider<m.a> provider) {
        return new wl(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(wj.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b.get();
    }
}
