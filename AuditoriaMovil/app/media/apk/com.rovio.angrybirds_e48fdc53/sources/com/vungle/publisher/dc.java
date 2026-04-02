package com.vungle.publisher;

import com.vungle.publisher.cz;
import com.vungle.publisher.fg;
import com.vungle.publisher.gv;
import com.vungle.publisher.ic;
import com.vungle.publisher.ki;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class dc implements MembersInjector<cz.b> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<fg.a> c;
    private final Provider<ic.a> d;
    private final Provider<ki.a> e;
    private final Provider<gv.a> f;

    static {
        a = !dc.class.desiredAssertionStatus();
    }

    public dc(Provider<ci> provider, Provider<fg.a> provider2, Provider<ic.a> provider3, Provider<ki.a> provider4, Provider<gv.a> provider5) {
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
    }

    public static MembersInjector<cz.b> a(Provider<ci> provider, Provider<fg.a> provider2, Provider<ic.a> provider3, Provider<ki.a> provider4, Provider<gv.a> provider5) {
        return new dc(provider, provider2, provider3, provider4, provider5);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(cz.b bVar) {
        if (bVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        bVar.a = this.b.get();
        bVar.b = this.c.get();
        bVar.c = this.d.get();
        bVar.d = this.e.get();
        bVar.e = this.f.get();
    }
}
