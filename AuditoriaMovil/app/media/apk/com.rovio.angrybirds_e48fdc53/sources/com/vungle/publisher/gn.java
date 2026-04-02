package com.vungle.publisher;

import com.vungle.publisher.gl;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class gn implements Factory<gl.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<gl.a> b;

    static {
        a = !gn.class.desiredAssertionStatus();
    }

    public gn(MembersInjector<gl.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public gl.a get() {
        return (gl.a) MembersInjectors.injectMembers(this.b, new gl.a());
    }

    public static Factory<gl.a> a(MembersInjector<gl.a> membersInjector) {
        return new gn(membersInjector);
    }
}
