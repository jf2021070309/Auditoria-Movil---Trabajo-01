package com.vungle.publisher;

import android.content.Context;
import com.vungle.publisher.om;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class oo implements MembersInjector<om.a> {
    static final /* synthetic */ boolean a;
    private final Provider<Context> b;
    private final Provider<qg> c;
    private final Provider<lz> d;
    private final Provider<lw> e;

    static {
        a = !oo.class.desiredAssertionStatus();
    }

    public oo(Provider<Context> provider, Provider<qg> provider2, Provider<lz> provider3, Provider<lw> provider4) {
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
    }

    public static MembersInjector<om.a> a(Provider<Context> provider, Provider<qg> provider2, Provider<lz> provider3, Provider<lw> provider4) {
        return new oo(provider, provider2, provider3, provider4);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(om.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b.get();
        aVar.b = this.c.get();
        aVar.c = this.d.get();
        aVar.d = this.e.get();
    }
}
