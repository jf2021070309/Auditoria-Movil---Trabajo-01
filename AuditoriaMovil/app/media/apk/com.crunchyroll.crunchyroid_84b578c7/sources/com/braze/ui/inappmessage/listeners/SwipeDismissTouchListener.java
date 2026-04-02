package com.braze.ui.inappmessage.listeners;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.amazon.aps.iva.ac.a;
/* loaded from: classes.dex */
public class SwipeDismissTouchListener implements View.OnTouchListener {
    private final long mAnimationTime;
    private final DismissCallbacks mCallbacks;
    private float mDownX;
    private float mDownY;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int mSlop;
    private boolean mSwiping;
    private int mSwipingSlop;
    private final Object mToken;
    private float mTranslationX;
    private VelocityTracker mVelocityTracker;
    private final View mView;
    private int mViewWidth = 1;

    /* loaded from: classes.dex */
    public interface DismissCallbacks {
        boolean canDismiss(Object obj);

        void onDismiss(View view, Object obj);
    }

    public SwipeDismissTouchListener(View view, Object obj, DismissCallbacks dismissCallbacks) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.mSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mAnimationTime = view.getContext().getResources().getInteger(17694720);
        this.mView = view;
        this.mToken = obj;
        this.mCallbacks = dismissCallbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performDismiss$0(ViewGroup.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.mView.setLayoutParams(layoutParams);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        motionEvent.offsetLocation(this.mTranslationX, 0.0f);
        if (this.mViewWidth < 2) {
            this.mViewWidth = this.mView.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            boolean z5 = true;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3 && this.mVelocityTracker != null) {
                        this.mView.animate().translationX(0.0f).alpha(1.0f).setDuration(this.mAnimationTime).setListener(null);
                        this.mVelocityTracker.recycle();
                        this.mVelocityTracker = null;
                        this.mTranslationX = 0.0f;
                        this.mDownX = 0.0f;
                        this.mDownY = 0.0f;
                        this.mSwiping = false;
                    }
                } else {
                    VelocityTracker velocityTracker = this.mVelocityTracker;
                    if (velocityTracker != null) {
                        velocityTracker.addMovement(motionEvent);
                        float rawX = motionEvent.getRawX() - this.mDownX;
                        float rawY = motionEvent.getRawY() - this.mDownY;
                        if (Math.abs(rawX) > this.mSlop && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                            this.mSwiping = true;
                            if (rawX > 0.0f) {
                                i2 = this.mSlop;
                            } else {
                                i2 = -this.mSlop;
                            }
                            this.mSwipingSlop = i2;
                            this.mView.getParent().requestDisallowInterceptTouchEvent(true);
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                            this.mView.onTouchEvent(obtain);
                            obtain.recycle();
                        }
                        if (this.mSwiping) {
                            this.mTranslationX = rawX;
                            this.mView.setTranslationX(rawX - this.mSwipingSlop);
                            return true;
                        }
                    }
                }
            } else if (this.mVelocityTracker != null) {
                float rawX2 = motionEvent.getRawX() - this.mDownX;
                this.mVelocityTracker.addMovement(motionEvent);
                this.mVelocityTracker.computeCurrentVelocity(1000);
                float xVelocity = this.mVelocityTracker.getXVelocity();
                float abs = Math.abs(xVelocity);
                float abs2 = Math.abs(this.mVelocityTracker.getYVelocity());
                if (Math.abs(rawX2) > this.mViewWidth / 2 && this.mSwiping) {
                    if (rawX2 > 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (this.mMinFlingVelocity <= abs && abs <= this.mMaxFlingVelocity && abs2 < abs && this.mSwiping) {
                    if (xVelocity < 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (rawX2 < 0.0f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 == z3) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (this.mVelocityTracker.getXVelocity() <= 0.0f) {
                        z5 = false;
                    }
                    boolean z6 = z5;
                    z5 = z4;
                    z = z6;
                } else {
                    z = false;
                    z5 = false;
                }
                if (z5) {
                    ViewPropertyAnimator animate = this.mView.animate();
                    if (z) {
                        i = this.mViewWidth;
                    } else {
                        i = -this.mViewWidth;
                    }
                    animate.translationX(i).alpha(0.0f).setDuration(this.mAnimationTime).setListener(new AnimatorListenerAdapter() { // from class: com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            SwipeDismissTouchListener.this.performDismiss();
                        }
                    });
                } else if (this.mSwiping) {
                    this.mView.animate().translationX(0.0f).alpha(1.0f).setDuration(this.mAnimationTime).setListener(null);
                }
                this.mVelocityTracker.recycle();
                this.mVelocityTracker = null;
                this.mTranslationX = 0.0f;
                this.mDownX = 0.0f;
                this.mDownY = 0.0f;
                this.mSwiping = false;
            }
            return false;
        }
        this.mDownX = motionEvent.getRawX();
        this.mDownY = motionEvent.getRawY();
        if (this.mCallbacks.canDismiss(this.mToken)) {
            VelocityTracker obtain2 = VelocityTracker.obtain();
            this.mVelocityTracker = obtain2;
            obtain2.addMovement(motionEvent);
        }
        return false;
    }

    @TargetApi(12)
    public void performDismiss() {
        final ViewGroup.LayoutParams layoutParams = this.mView.getLayoutParams();
        final int height = this.mView.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(this.mAnimationTime);
        duration.addListener(new AnimatorListenerAdapter() { // from class: com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SwipeDismissTouchListener.this.mCallbacks.onDismiss(SwipeDismissTouchListener.this.mView, SwipeDismissTouchListener.this.mToken);
                SwipeDismissTouchListener.this.mView.setAlpha(1.0f);
                SwipeDismissTouchListener.this.mView.setTranslationX(0.0f);
                layoutParams.height = height;
                SwipeDismissTouchListener.this.mView.setLayoutParams(layoutParams);
            }
        });
        duration.addUpdateListener(new a(0, this, layoutParams));
        duration.start();
    }
}
