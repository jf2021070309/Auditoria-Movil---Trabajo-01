package com.vungle.publisher;

import com.vungle.publisher.ns;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ny implements MembersInjector<ns.a.C0333a> {
    static final /* synthetic */ boolean a;
    private final Provider<ns.a> b;

    static {
        a = !ny.class.desiredAssertionStatus();
    }

    public ny(Provider<ns.a> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<ns.a.C0333a> a(Provider<ns.a> provider) {
        return new ny(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ns.a.C0333a c0333a) {
        if (c0333a == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        c0333a.a = this.b.get();
    }
}
