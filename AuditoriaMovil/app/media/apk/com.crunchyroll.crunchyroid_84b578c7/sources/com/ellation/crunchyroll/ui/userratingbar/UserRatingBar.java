package com.ellation.crunchyroll.ui.userratingbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.amazon.aps.iva.bc0.b;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.e;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.h;
import com.amazon.aps.iva.xw.i;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: UserRatingBar.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010,\u001a\u00020+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\b\b\u0002\u0010/\u001a\u00020\u0003¢\u0006\u0004\b0\u00101J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0017J\u000e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0003J\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0003J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016R!\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u00062"}, d2 = {"Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingBar;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingBarView;", "", "starId", "Lcom/ellation/crunchyroll/ui/userratingbar/AnimatedRatingStarType;", "starType", "Lcom/amazon/aps/iva/kb0/q;", "showRating", "animateStar", "performHapticFeedback", "setRatedStarContentDescription", "setNotRatedStarContentDescription", "Landroid/view/MotionEvent;", "event", "", "onInterceptTouchEvent", "disallowIntercept", "requestDisallowInterceptTouchEvent", "onTouchEvent", "rating", "bind", "Lcom/ellation/crunchyroll/ui/userratingbar/RatingBarActionListener;", "ratingActionListener", "setRatingPickedListener", "userRating", "playAnimation", "", "Lcom/amazon/aps/iva/wy/k;", "setupPresenters", "", "Lcom/airbnb/lottie/LottieAnimationView;", "stars$delegate", "Lcom/amazon/aps/iva/bc0/b;", "getStars", "()Ljava/util/List;", "stars", "Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingBarPresenter;", "presenter$delegate", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/ellation/crunchyroll/ui/userratingbar/UserRatingBarPresenter;", "presenter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class UserRatingBar extends g implements UserRatingBarView {
    static final /* synthetic */ l<Object>[] $$delegatedProperties = {q.a(UserRatingBar.class, "stars", "getStars()Ljava/util/List;", 0)};
    public static final int $stable = 8;
    private final e presenter$delegate;
    private final b stars$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserRatingBar(Context context) {
        this(context, null, 0, 6, null);
        j.f(context, "context");
    }

    private final UserRatingBarPresenter getPresenter() {
        return (UserRatingBarPresenter) this.presenter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<LottieAnimationView> getStars() {
        return (List) this.stars$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.ellation.crunchyroll.ui.userratingbar.UserRatingBarView
    public void animateStar(int i) {
        LottieAnimationView lottieAnimationView = getStars().get(i);
        lottieAnimationView.l.add(LottieAnimationView.c.PLAY_OPTION);
        lottieAnimationView.f.j();
    }

    public final void bind(int i) {
        getPresenter().onBind(i);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        j.f(motionEvent, "event");
        return getPresenter().onInterceptTouchEvent(getMeasuredWidth(), getMeasuredHeight(), motionEvent.getX(), motionEvent.getY());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        j.f(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                getPresenter().onActionMove(getMeasuredWidth(), getMeasuredHeight(), motionEvent.getX(), motionEvent.getY());
            }
        } else {
            getPresenter().onActionUp(getMeasuredWidth(), getMeasuredHeight(), motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override // com.ellation.crunchyroll.ui.userratingbar.UserRatingBarView
    public void performHapticFeedback() {
        performHapticFeedback(1);
    }

    public final void playAnimation(int i) {
        getPresenter().playAnimationWithDelay(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.ellation.crunchyroll.ui.userratingbar.UserRatingBarView
    public void requestDisallowInterceptTouchEvent(boolean z) {
        getParent().getParent().requestDisallowInterceptTouchEvent(z);
    }

    @Override // com.ellation.crunchyroll.ui.userratingbar.UserRatingBarView
    public void setNotRatedStarContentDescription(int i) {
        getStars().get(i).setContentDescription(getContext().getString(R.string.desc_not_rated_star));
    }

    @Override // com.ellation.crunchyroll.ui.userratingbar.UserRatingBarView
    public void setRatedStarContentDescription(int i) {
        getStars().get(i).setContentDescription(getContext().getString(R.string.desc_rated_star));
    }

    public final void setRatingPickedListener(RatingBarActionListener ratingBarActionListener) {
        j.f(ratingBarActionListener, "ratingActionListener");
        getPresenter().setRatingBarActionListener(ratingBarActionListener);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public Set<k> setupPresenters() {
        return l1.H(getPresenter());
    }

    @Override // com.ellation.crunchyroll.ui.userratingbar.UserRatingBarView
    public void showRating(int i, AnimatedRatingStarType animatedRatingStarType) {
        j.f(animatedRatingStarType, "starType");
        getStars().get(i).f.t(animatedRatingStarType.getMarkerStart().getMarker(), animatedRatingStarType.getMarkerEnd().getMarker(), false);
        getStars().get(i).setSpeed(animatedRatingStarType.getSpeed());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j.f(context, "context");
    }

    public /* synthetic */ UserRatingBar(Context context, AttributeSet attributeSet, int i, int i2, com.amazon.aps.iva.yb0.e eVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.stars$delegate = new v(new h(new int[]{R.id.star_1, R.id.star_2, R.id.star_3, R.id.star_4, R.id.star_5}, i.h));
        this.presenter$delegate = f.b(new UserRatingBar$presenter$2(this, context));
        View.inflate(context, R.layout.user_rating_bar, this);
    }
}
