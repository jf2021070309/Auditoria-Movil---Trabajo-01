package com.vungle.publisher;

import com.vungle.publisher.dk;
import com.vungle.publisher.jn;
import dagger.MembersInjector;
import javax.inject.Provider;
/* renamed from: com.vungle.publisher.do  reason: invalid class name */
/* loaded from: classes4.dex */
public final class Cdo implements MembersInjector<dk> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<jn.a> c;
    private final Provider<dk.a> d;

    static {
        a = !Cdo.class.desiredAssertionStatus();
    }

    public Cdo(Provider<ci> provider, Provider<jn.a> provider2, Provider<dk.a> provider3) {
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

    public static MembersInjector<dk> a(Provider<ci> provider, Provider<jn.a> provider2, Provider<dk.a> provider3) {
        return new Cdo(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(dk dkVar) {
        if (dkVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        dkVar.v = this.b.get();
        dkVar.e = this.c.get();
        dkVar.f = this.d.get();
    }
}
