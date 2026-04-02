package com.vungle.publisher.log;

import android.content.Context;
import com.vungle.publisher.env.AndroidDevice;
import com.vungle.publisher.env.o;
import com.vungle.publisher.sv;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class i implements MembersInjector<g> {
    static final /* synthetic */ boolean a;
    private final Provider<Context> b;
    private final Provider<d> c;
    private final Provider<a> d;
    private final Provider<AndroidDevice> e;
    private final Provider<sv> f;
    private final Provider<o> g;

    static {
        a = !i.class.desiredAssertionStatus();
    }

    public i(Provider<Context> provider, Provider<d> provider2, Provider<a> provider3, Provider<AndroidDevice> provider4, Provider<sv> provider5, Provider<o> provider6) {
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

    public static MembersInjector<g> a(Provider<Context> provider, Provider<d> provider2, Provider<a> provider3, Provider<AndroidDevice> provider4, Provider<sv> provider5, Provider<o> provider6) {
        return new i(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(g gVar) {
        if (gVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        gVar.d = this.b.get();
        gVar.e = this.c.get();
        gVar.f = this.d.get();
        gVar.g = this.e.get();
        gVar.h = this.f.get();
        gVar.i = this.g.get();
    }
}
