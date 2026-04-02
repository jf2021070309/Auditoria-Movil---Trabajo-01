package com.vungle.publisher;

import android.content.Context;
import com.vungle.publisher.lf;
import com.vungle.publisher.my;
import com.vungle.publisher.og;
import com.vungle.publisher.rf;
import com.vungle.publisher.ro;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class nd implements MembersInjector<my> {
    static final /* synthetic */ boolean a;
    private final Provider<mq> b;
    private final Provider<com.vungle.publisher.env.i> c;
    private final Provider<qg> d;
    private final Provider<lf.b> e;
    private final Provider<Context> f;
    private final Provider<rf.a> g;
    private final Provider<my.b.a> h;
    private final Provider<rr> i;
    private final Provider<ro.a> j;
    private final Provider<og.a> k;

    static {
        a = !nd.class.desiredAssertionStatus();
    }

    public nd(Provider<mq> provider, Provider<com.vungle.publisher.env.i> provider2, Provider<qg> provider3, Provider<lf.b> provider4, Provider<Context> provider5, Provider<rf.a> provider6, Provider<my.b.a> provider7, Provider<rr> provider8, Provider<ro.a> provider9, Provider<og.a> provider10) {
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
        if (!a && provider7 == null) {
            throw new AssertionError();
        }
        this.h = provider7;
        if (!a && provider8 == null) {
            throw new AssertionError();
        }
        this.i = provider8;
        if (!a && provider9 == null) {
            throw new AssertionError();
        }
        this.j = provider9;
        if (!a && provider10 == null) {
            throw new AssertionError();
        }
        this.k = provider10;
    }

    public static MembersInjector<my> a(Provider<mq> provider, Provider<com.vungle.publisher.env.i> provider2, Provider<qg> provider3, Provider<lf.b> provider4, Provider<Context> provider5, Provider<rf.a> provider6, Provider<my.b.a> provider7, Provider<rr> provider8, Provider<ro.a> provider9, Provider<og.a> provider10) {
        return new nd(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(my myVar) {
        if (myVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        myVar.d = this.b.get();
        myVar.j = this.c.get();
        myVar.k = this.d.get();
        myVar.l = this.e.get();
        myVar.m = this.f.get();
        myVar.s = this.g.get();
        myVar.t = this.h.get();
        myVar.u = this.i.get();
        myVar.v = this.j.get();
        myVar.w = this.k.get();
    }
}
