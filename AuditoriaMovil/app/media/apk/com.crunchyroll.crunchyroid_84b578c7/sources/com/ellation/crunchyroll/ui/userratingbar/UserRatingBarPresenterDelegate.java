package com.ellation.crunchyroll.ui.userratingbar;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.a;
import kotlin.Metadata;
/* compiled from: UserRatingBarPresenterDelegate.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJD\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\r"}, d2 = {"Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingBarPresenterDelegate;", "", "", "xCoordinate", "viewWidth", "yCoordinate", "viewHeight", "Lkotlin/Function0;", "Lcom/amazon/aps/iva/kb0/q;", "actionInBounds", "actionOutOfBounds", "checkViewBoundsAndPerformAction", "Companion", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface UserRatingBarPresenterDelegate {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: UserRatingBarPresenterDelegate.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingBarPresenterDelegate$Companion;", "", "()V", "create", "Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingBarPresenterDelegate;", "isRtl", "", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final UserRatingBarPresenterDelegate create(boolean z) {
            return new UserRatingBarPresenterDelegateImpl(z);
        }
    }

    void checkViewBoundsAndPerformAction(float f, float f2, float f3, float f4, a<q> aVar, a<q> aVar2);
}
