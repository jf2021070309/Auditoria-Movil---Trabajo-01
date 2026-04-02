package com.vungle.publisher;

import com.vungle.publisher.iz;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class jd implements MembersInjector<iz> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<iz.a> c;

    static {
        a = !jd.class.desiredAssertionStatus();
    }

    public jd(Provider<ci> provider, Provider<iz.a> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<iz> a(Provider<ci> provider, Provider<iz.a> provider2) {
        return new jd(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(iz izVar) {
        if (izVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        izVar.v = this.b.get();
        izVar.a = this.c.get();
    }
}
