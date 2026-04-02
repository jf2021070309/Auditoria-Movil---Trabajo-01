package com.ellation.crunchyroll.cast;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye.h;
import com.ellation.crunchyroll.cast.ChromecastMessengerInternal;
import kotlin.Metadata;
/* compiled from: ChromecastUserStatusInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/ellation/crunchyroll/cast/ChromecastUserStatusInteractor;", "", "Lcom/amazon/aps/iva/kb0/q;", "onSignIn", "onSignOut", "onMaturityStatusUpdate", "onSubscriptionStatusUpdate", "Companion", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface ChromecastUserStatusInteractor {
    public static final Companion Companion = Companion.$$INSTANCE;

    void onMaturityStatusUpdate();

    void onSignIn();

    void onSignOut();

    void onSubscriptionStatusUpdate();

    /* compiled from: ChromecastUserStatusInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/ellation/crunchyroll/cast/ChromecastUserStatusInteractor$Companion;", "", "Lcom/ellation/crunchyroll/cast/ChromecastUserStatusInteractor;", "create", "Lcom/amazon/aps/iva/ye/h;", "messenger", "<init>", "()V", "cast_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ChromecastUserStatusInteractor create() {
            return new ChromecastUserStatusInteractorImpl(ChromecastMessengerInternal.Companion.create$default(ChromecastMessengerInternal.Companion, "urn:x-cast:etp.user_status", null, null, 6, null));
        }

        public final ChromecastUserStatusInteractor create(h hVar) {
            j.f(hVar, "messenger");
            return new ChromecastUserStatusInteractorImpl(hVar);
        }
    }
}
