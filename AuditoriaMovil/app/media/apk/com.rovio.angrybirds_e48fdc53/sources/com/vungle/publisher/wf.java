package com.vungle.publisher;

import com.vungle.publisher.m;
import com.vungle.publisher.wd;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class wf implements MembersInjector<wd.a> {
    static final /* synthetic */ boolean a;
    private final Provider<m.a> b;

    static {
        a = !wf.class.desiredAssertionStatus();
    }

    public wf(Provider<m.a> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<wd.a> a(Provider<m.a> provider) {
        return new wf(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(wd.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b.get();
    }
}
