package com.vungle.publisher;

import com.vungle.publisher.im;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class io implements Factory<im.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<im.a> b;

    static {
        a = !io.class.desiredAssertionStatus();
    }

    public io(MembersInjector<im.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public im.a get() {
        return (im.a) MembersInjectors.injectMembers(this.b, new im.a());
    }

    public static Factory<im.a> a(MembersInjector<im.a> membersInjector) {
        return new io(membersInjector);
    }
}
