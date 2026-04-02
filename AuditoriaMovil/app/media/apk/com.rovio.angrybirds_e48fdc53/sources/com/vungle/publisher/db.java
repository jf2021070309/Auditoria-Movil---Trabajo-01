package com.vungle.publisher;

import com.vungle.publisher.cz;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class db implements Factory<cz.b> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<cz.b> b;

    static {
        a = !db.class.desiredAssertionStatus();
    }

    public db(MembersInjector<cz.b> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public cz.b get() {
        return (cz.b) MembersInjectors.injectMembers(this.b, new cz.b());
    }

    public static Factory<cz.b> a(MembersInjector<cz.b> membersInjector) {
        return new db(membersInjector);
    }
}
