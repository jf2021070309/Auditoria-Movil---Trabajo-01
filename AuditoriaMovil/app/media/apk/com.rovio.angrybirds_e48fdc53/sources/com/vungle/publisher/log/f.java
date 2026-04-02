package com.vungle.publisher.log;

import com.vungle.publisher.env.r;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class f implements MembersInjector<d> {
    static final /* synthetic */ boolean a;
    private final Provider<r> b;

    static {
        a = !f.class.desiredAssertionStatus();
    }

    public f(Provider<r> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<d> a(Provider<r> provider) {
        return new f(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(d dVar) {
        if (dVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        dVar.b = this.b.get();
    }
}
