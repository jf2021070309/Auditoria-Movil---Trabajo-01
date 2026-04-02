package com.vungle.publisher;

import android.content.Context;
import com.vungle.publisher.ro;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class rq implements MembersInjector<ro.a> {
    static final /* synthetic */ boolean a;
    private final Provider<Context> b;
    private final Provider<mv> c;
    private final Provider<zo> d;

    static {
        a = !rq.class.desiredAssertionStatus();
    }

    public rq(Provider<Context> provider, Provider<mv> provider2, Provider<zo> provider3) {
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

    public static MembersInjector<ro.a> a(Provider<Context> provider, Provider<mv> provider2, Provider<zo> provider3) {
        return new rq(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ro.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b.get();
        aVar.b = this.c.get();
        aVar.c = this.d.get();
    }
}
