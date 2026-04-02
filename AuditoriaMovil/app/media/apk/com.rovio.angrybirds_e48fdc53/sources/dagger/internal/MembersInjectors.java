package dagger.internal;

import dagger.MembersInjector;
/* loaded from: classes4.dex */
public final class MembersInjectors {
    public static <T> T injectMembers(MembersInjector<T> membersInjector, T t) {
        membersInjector.injectMembers(t);
        return t;
    }

    public static <T> MembersInjector<T> noOp() {
        return a.INSTANCE;
    }

    /* loaded from: classes4.dex */
    private enum a implements MembersInjector<Object> {
        INSTANCE;

        @Override // dagger.MembersInjector
        public void injectMembers(Object obj) {
            Preconditions.checkNotNull(obj);
        }
    }

    public static <T> MembersInjector<T> delegatingTo(MembersInjector<? super T> membersInjector) {
        return (MembersInjector) Preconditions.checkNotNull(membersInjector);
    }

    private MembersInjectors() {
    }
}
