package com.ellation.crunchyroll.ui.userratingbar;

import com.amazon.aps.iva.wy.b;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.x50.m;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserRatingBarPresenter.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B/\u0012\u0006\u00102\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\u0006\u0010'\u001a\u00020\u0014¢\u0006\u0004\b3\u00104J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J(\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J(\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0006H\u0016J\u0018\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011H\u0016R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010*\u001a\u0004\u0018\u00010)8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010(R\u0016\u00101\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010&¨\u00065"}, d2 = {"Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingBarPresenterImpl;", "Lcom/amazon/aps/iva/wy/b;", "Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingBarView;", "Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingBarPresenter;", "Lcom/amazon/aps/iva/kb0/q;", "cancelAction", "", "rating", "setRating", "starId", "Lcom/ellation/crunchyroll/ui/userratingbar/AnimatedRatingStarType;", "starType", "showRating", "setContentDescription", "onBind", "measuredWidth", "measuredHeight", "", "eventX", "eventY", "", "onInterceptTouchEvent", "onActionUp", "onActionMove", "onRatingStarSelected", "onStarDragged", "userRating", "playAnimationWithDelay", "xCoordinate", "viewWidth", "calculateStartIdFromPosition", "Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingBarPresenterDelegate;", "delegate", "Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingBarPresenterDelegate;", "Lcom/amazon/aps/iva/x50/m;", "delayedCall", "Lcom/amazon/aps/iva/x50/m;", "starsCount", "I", "isRtl", "Z", "Lcom/ellation/crunchyroll/ui/userratingbar/RatingBarActionListener;", "ratingBarActionListener", "Lcom/ellation/crunchyroll/ui/userratingbar/RatingBarActionListener;", "getRatingBarActionListener", "()Lcom/ellation/crunchyroll/ui/userratingbar/RatingBarActionListener;", "setRatingBarActionListener", "(Lcom/ellation/crunchyroll/ui/userratingbar/RatingBarActionListener;)V", "shouldAllowTouchEvents", "lastDraggedPosition", "view", "<init>", "(Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingBarView;Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingBarPresenterDelegate;Lcom/amazon/aps/iva/x50/m;IZ)V", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class UserRatingBarPresenterImpl extends b<UserRatingBarView> implements UserRatingBarPresenter {
    private final m delayedCall;
    private final UserRatingBarPresenterDelegate delegate;
    private final boolean isRtl;
    private int lastDraggedPosition;
    private RatingBarActionListener ratingBarActionListener;
    private boolean shouldAllowTouchEvents;
    private final int starsCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRatingBarPresenterImpl(UserRatingBarView userRatingBarView, UserRatingBarPresenterDelegate userRatingBarPresenterDelegate, m mVar, int i, boolean z) {
        super(userRatingBarView, new j[0]);
        com.amazon.aps.iva.yb0.j.f(userRatingBarView, "view");
        com.amazon.aps.iva.yb0.j.f(userRatingBarPresenterDelegate, "delegate");
        com.amazon.aps.iva.yb0.j.f(mVar, "delayedCall");
        this.delegate = userRatingBarPresenterDelegate;
        this.delayedCall = mVar;
        this.starsCount = i;
        this.isRtl = z;
        this.lastDraggedPosition = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelAction() {
        this.lastDraggedPosition = -1;
        RatingBarActionListener ratingBarActionListener = getRatingBarActionListener();
        if (ratingBarActionListener != null) {
            ratingBarActionListener.onRatingCancelled();
        }
    }

    private final void setContentDescription(int i, AnimatedRatingStarType animatedRatingStarType) {
        if (animatedRatingStarType != AnimatedRatingStarType.RATED && animatedRatingStarType != AnimatedRatingStarType.ANIMATE_FROM_SCALE_TO_END) {
            getView().setNotRatedStarContentDescription(i);
        } else {
            getView().setRatedStarContentDescription(i);
        }
    }

    private final void setRating(int i) {
        AnimatedRatingStarType animatedRatingStarType;
        int i2 = this.starsCount;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 < i) {
                animatedRatingStarType = AnimatedRatingStarType.RATED;
            } else {
                animatedRatingStarType = AnimatedRatingStarType.NOT_RATED;
            }
            showRating(i3, animatedRatingStarType);
            setContentDescription(i3, animatedRatingStarType);
        }
    }

    private final void showRating(int i, AnimatedRatingStarType animatedRatingStarType) {
        getView().showRating(i, animatedRatingStarType);
    }

    @Override // com.ellation.crunchyroll.ui.userratingbar.UserRatingBarPresenter
    public int calculateStartIdFromPosition(float f, float f2) {
        int i;
        if (f < 0.0f) {
            i = 0;
        } else if (f >= f2) {
            i = this.starsCount - 1;
        } else {
            i = (int) ((f * this.starsCount) / f2);
        }
        if (this.isRtl) {
            return (this.starsCount - i) - 1;
        }
        return i;
    }

    @Override // com.ellation.crunchyroll.ui.userratingbar.UserRatingBarPresenter
    public RatingBarActionListener getRatingBarActionListener() {
        return this.ratingBarActionListener;
    }

    @Override // com.ellation.crunchyroll.ui.userratingbar.UserRatingBarPresenter
    public void onActionMove(int i, int i2, float f, float f2) {
        if (this.shouldAllowTouchEvents) {
            getView().requestDisallowInterceptTouchEvent(true);
            this.delegate.checkViewBoundsAndPerformAction(f, i, f2, i2, new UserRatingBarPresenterImpl$onActionMove$1(this, f, i), new UserRatingBarPresenterImpl$onActionMove$2(this));
        }
    }

    @Override // com.ellation.crunchyroll.ui.userratingbar.UserRatingBarPresenter
    public void onActionUp(int i, int i2, float f, float f2) {
        if (this.shouldAllowTouchEvents) {
            getView().requestDisallowInterceptTouchEvent(false);
            this.delegate.checkViewBoundsAndPerformAction(f, i, f2, i2, new UserRatingBarPresenterImpl$onActionUp$1(this, f, i), new UserRatingBarPresenterImpl$onActionUp$2(this));
        }
    }

    @Override // com.ellation.crunchyroll.ui.userratingbar.UserRatingBarPresenter
    public void onBind(int i) {
        setRating(i);
    }

    @Override // com.ellation.crunchyroll.ui.userratingbar.UserRatingBarPresenter
    public boolean onInterceptTouchEvent(int i, int i2, float f, float f2) {
        RatingBarActionListener ratingBarActionListener;
        if (!this.shouldAllowTouchEvents && (ratingBarActionListener = getRatingBarActionListener()) != null) {
            ratingBarActionListener.onRatingTouchIntercept(new UserRatingBarPresenterImpl$onInterceptTouchEvent$1(this, f, i, f2, i2));
            return true;
        }
        return true;
    }

    @Override // com.ellation.crunchyroll.ui.userratingbar.UserRatingBarPresenter
    public void onRatingStarSelected(int i) {
        if (this.lastDraggedPosition == -1) {
            getView().performHapticFeedback();
        }
        this.lastDraggedPosition = -1;
        RatingBarActionListener ratingBarActionListener = getRatingBarActionListener();
        if (ratingBarActionListener != null) {
            ratingBarActionListener.onUserRatingClick(UserRatingStarNumber.Companion.fromNumber(i + 1));
        }
    }

    @Override // com.ellation.crunchyroll.ui.userratingbar.UserRatingBarPresenter
    public void onStarDragged(int i) {
        int i2 = this.lastDraggedPosition;
        if (i2 == -1) {
            int i3 = this.starsCount;
            for (int i4 = 0; i4 < i3; i4++) {
                if (i4 < i) {
                    getView().showRating(i4, AnimatedRatingStarType.SCALED);
                } else if (i4 == i) {
                    getView().showRating(i4, AnimatedRatingStarType.ANIMATE_FROM_START_TO_SCALE);
                    getView().animateStar(i4);
                } else {
                    getView().showRating(i4, AnimatedRatingStarType.NOT_RATED);
                }
            }
            getView().performHapticFeedback();
        } else if (i > i2) {
            int i5 = i2 + 1;
            if (i5 <= i) {
                while (true) {
                    getView().showRating(i5, AnimatedRatingStarType.ANIMATE_FROM_START_TO_SCALE);
                    getView().animateStar(i5);
                    if (i5 == i) {
                        break;
                    }
                    i5++;
                }
            }
            getView().performHapticFeedback();
        } else if (i < i2) {
            int i6 = i + 1;
            if (i6 <= i2) {
                while (true) {
                    getView().showRating(i2, AnimatedRatingStarType.ANIMATE_FROM_SCALE_TO_START);
                    getView().animateStar(i2);
                    if (i2 == i6) {
                        break;
                    }
                    i2--;
                }
            }
            getView().performHapticFeedback();
        }
        this.lastDraggedPosition = i;
    }

    @Override // com.ellation.crunchyroll.ui.userratingbar.UserRatingBarPresenter
    public void playAnimationWithDelay(int i) {
        int i2 = this.starsCount;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 < i) {
                AnimatedRatingStarType animatedRatingStarType = AnimatedRatingStarType.ANIMATE_FROM_SCALE_TO_END;
                showRating(i3, animatedRatingStarType);
                setContentDescription(i3, animatedRatingStarType);
                this.delayedCall.b(new UserRatingBarPresenterImpl$playAnimationWithDelay$1(this, i3), i3 * 50);
            } else {
                AnimatedRatingStarType animatedRatingStarType2 = AnimatedRatingStarType.NOT_RATED;
                showRating(i3, animatedRatingStarType2);
                setContentDescription(i3, animatedRatingStarType2);
            }
        }
    }

    @Override // com.ellation.crunchyroll.ui.userratingbar.UserRatingBarPresenter
    public void setRatingBarActionListener(RatingBarActionListener ratingBarActionListener) {
        this.ratingBarActionListener = ratingBarActionListener;
    }
}
