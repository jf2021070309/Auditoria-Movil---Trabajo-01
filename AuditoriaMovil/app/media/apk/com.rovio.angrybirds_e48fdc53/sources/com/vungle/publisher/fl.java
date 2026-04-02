package com.vungle.publisher;

import com.vungle.publisher.fh;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class fl implements MembersInjector<fh> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<fh.a> c;

    static {
        a = !fl.class.desiredAssertionStatus();
    }

    public fl(Provider<ci> provider, Provider<fh.a> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<fh> a(Provider<ci> provider, Provider<fh.a> provider2) {
        return new fl(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(fh fhVar) {
        if (fhVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        fhVar.v = this.b.get();
        fhVar.e = this.c.get();
    }
}
