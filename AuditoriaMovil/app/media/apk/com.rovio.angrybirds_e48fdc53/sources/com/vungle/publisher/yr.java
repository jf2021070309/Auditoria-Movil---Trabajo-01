package com.vungle.publisher;

import com.vungle.publisher.co;
import com.vungle.publisher.cz;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class yr implements MembersInjector<yn> {
    static final /* synthetic */ boolean a;
    private final Provider<qg> b;
    private final Provider<cz.b> c;
    private final Provider<yk> d;
    private final Provider<tj> e;
    private final Provider<com.vungle.publisher.env.o> f;
    private final Provider<co.a> g;

    static {
        a = !yr.class.desiredAssertionStatus();
    }

    public yr(Provider<qg> provider, Provider<cz.b> provider2, Provider<yk> provider3, Provider<tj> provider4, Provider<com.vungle.publisher.env.o> provider5, Provider<co.a> provider6) {
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
        if (!a && provider4 == null) {
            throw new AssertionError();
        }
        this.e = provider4;
        if (!a && provider5 == null) {
            throw new AssertionError();
        }
        this.f = provider5;
        if (!a && provider6 == null) {
            throw new AssertionError();
        }
        this.g = provider6;
    }

    public static MembersInjector<yn> a(Provider<qg> provider, Provider<cz.b> provider2, Provider<yk> provider3, Provider<tj> provider4, Provider<com.vungle.publisher.env.o> provider5, Provider<co.a> provider6) {
        return new yr(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(yn ynVar) {
        if (ynVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        ynVar.eventBus = this.b.get();
        ynVar.d = this.c.get();
        ynVar.e = this.d.get();
        ynVar.f = this.e.get();
        ynVar.g = this.f.get();
        ynVar.h = this.g.get();
    }
}
