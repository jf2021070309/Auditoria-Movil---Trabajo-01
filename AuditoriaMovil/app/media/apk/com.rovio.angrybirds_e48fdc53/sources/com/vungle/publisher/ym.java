package com.vungle.publisher;

import com.vungle.publisher.cz;
import com.vungle.publisher.env.r;
import com.vungle.publisher.fg;
import com.vungle.publisher.ic;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ym implements MembersInjector<yk> {
    static final /* synthetic */ boolean a;
    private final Provider<qg> b;
    private final Provider<cz.b> c;
    private final Provider<fg.a> d;
    private final Provider<vc> e;
    private final Provider<r> f;
    private final Provider<ic.a> g;

    static {
        a = !ym.class.desiredAssertionStatus();
    }

    public ym(Provider<qg> provider, Provider<cz.b> provider2, Provider<fg.a> provider3, Provider<vc> provider4, Provider<r> provider5, Provider<ic.a> provider6) {
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

    public static MembersInjector<yk> a(Provider<qg> provider, Provider<cz.b> provider2, Provider<fg.a> provider3, Provider<vc> provider4, Provider<r> provider5, Provider<ic.a> provider6) {
        return new ym(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(yk ykVar) {
        if (ykVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        ykVar.a = this.b.get();
        ykVar.b = this.c.get();
        ykVar.c = this.d.get();
        ykVar.d = this.e.get();
        ykVar.e = this.f.get();
        ykVar.f = this.g.get();
    }
}
