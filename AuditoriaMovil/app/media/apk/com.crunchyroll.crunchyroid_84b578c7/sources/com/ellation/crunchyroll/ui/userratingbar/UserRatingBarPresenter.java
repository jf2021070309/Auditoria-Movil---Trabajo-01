package com.ellation.crunchyroll.ui.userratingbar;

import android.content.Intent;
import android.content.res.Configuration;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.x50.m;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: UserRatingBarPresenter.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H&J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&J(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH&J(\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH&J(\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH&R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00178&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingBarPresenter;", "Lcom/amazon/aps/iva/wy/k;", "", "rating", "Lcom/amazon/aps/iva/kb0/q;", "onBind", "starId", "onRatingStarSelected", "onStarDragged", "userRating", "playAnimationWithDelay", "", "xCoordinate", "viewWidth", "calculateStartIdFromPosition", "measuredWidth", "measuredHeight", "eventX", "eventY", "", "onInterceptTouchEvent", "onActionMove", "onActionUp", "Lcom/ellation/crunchyroll/ui/userratingbar/RatingBarActionListener;", "getRatingBarActionListener", "()Lcom/ellation/crunchyroll/ui/userratingbar/RatingBarActionListener;", "setRatingBarActionListener", "(Lcom/ellation/crunchyroll/ui/userratingbar/RatingBarActionListener;)V", "ratingBarActionListener", "Companion", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface UserRatingBarPresenter extends k {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: UserRatingBarPresenter.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingBarPresenter$Companion;", "", "Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingBarView;", "view", "Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingBarPresenterDelegate;", "delegate", "Lcom/amazon/aps/iva/x50/m;", "delayedCall", "", "starsCount", "", "isRtl", "Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingBarPresenter;", "create", "<init>", "()V", "widgets_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final UserRatingBarPresenter create(UserRatingBarView userRatingBarView, UserRatingBarPresenterDelegate userRatingBarPresenterDelegate, m mVar, int i, boolean z) {
            j.f(userRatingBarView, "view");
            j.f(userRatingBarPresenterDelegate, "delegate");
            j.f(mVar, "delayedCall");
            return new UserRatingBarPresenterImpl(userRatingBarView, userRatingBarPresenterDelegate, mVar, i, z);
        }
    }

    /* compiled from: UserRatingBarPresenter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void onActivityResult(UserRatingBarPresenter userRatingBarPresenter, int i, int i2, Intent intent) {
        }

        public static void onConfigurationChanged(UserRatingBarPresenter userRatingBarPresenter, Configuration configuration) {
        }

        public static void onCreate(UserRatingBarPresenter userRatingBarPresenter) {
        }

        public static void onDestroy(UserRatingBarPresenter userRatingBarPresenter) {
        }

        public static void onNewIntent(UserRatingBarPresenter userRatingBarPresenter, Intent intent) {
            j.f(intent, "intent");
        }

        public static void onPause(UserRatingBarPresenter userRatingBarPresenter) {
        }

        public static void onResume(UserRatingBarPresenter userRatingBarPresenter) {
        }

        public static void onStart(UserRatingBarPresenter userRatingBarPresenter) {
        }

        public static void onStop(UserRatingBarPresenter userRatingBarPresenter) {
        }
    }

    int calculateStartIdFromPosition(float f, float f2);

    RatingBarActionListener getRatingBarActionListener();

    void onActionMove(int i, int i2, float f, float f2);

    void onActionUp(int i, int i2, float f, float f2);

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onActivityResult(int i, int i2, Intent intent);

    void onBind(int i);

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onConfigurationChanged(Configuration configuration);

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onCreate();

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onDestroy();

    boolean onInterceptTouchEvent(int i, int i2, float f, float f2);

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onNewIntent(Intent intent);

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onPause();

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onPreDestroy();

    void onRatingStarSelected(int i);

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onResume();

    void onStarDragged(int i);

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onStart();

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onStop();

    void playAnimationWithDelay(int i);

    void setRatingBarActionListener(RatingBarActionListener ratingBarActionListener);
}
