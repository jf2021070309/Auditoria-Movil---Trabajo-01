package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.q3.l;
import com.amazon.aps.iva.q3.p;
import com.amazon.aps.iva.x3.c;
import java.util.WeakHashMap;
/* loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final float DEFAULT_ALPHA_END_DISTANCE = 0.5f;
    private static final float DEFAULT_ALPHA_START_DISTANCE = 0.0f;
    private static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5f;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;
    private boolean interceptingEvents;
    OnDismissListener listener;
    private boolean requestingDisallowInterceptTouchEvent;
    private boolean sensitivitySet;
    c viewDragHelper;
    private float sensitivity = DEFAULT_ALPHA_START_DISTANCE;
    int swipeDirection = 2;
    float dragDismissThreshold = 0.5f;
    float alphaStartSwipeDistance = DEFAULT_ALPHA_START_DISTANCE;
    float alphaEndSwipeDistance = 0.5f;
    private final c.AbstractC0840c dragCallback = new c.AbstractC0840c() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1
        private static final int INVALID_POINTER_ID = -1;
        private int activePointerId = -1;
        private int originalCapturedViewLeft;

        private boolean shouldDismiss(View view, float f) {
            boolean z;
            int i = (f > SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE ? 1 : (f == SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE ? 0 : -1));
            if (i != 0) {
                WeakHashMap<View, r0> weakHashMap = g0.a;
                if (g0.e.d(view) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = SwipeDismissBehavior.this.swipeDirection;
                if (i2 == 2) {
                    return true;
                }
                if (i2 == 0) {
                    if (z) {
                        if (f >= SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE) {
                            return false;
                        }
                    } else if (i <= 0) {
                        return false;
                    }
                    return true;
                } else if (i2 != 1) {
                    return false;
                } else {
                    if (z) {
                        if (i <= 0) {
                            return false;
                        }
                    } else if (f >= SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE) {
                        return false;
                    }
                    return true;
                }
            }
            if (Math.abs(view.getLeft() - this.originalCapturedViewLeft) < Math.round(view.getWidth() * SwipeDismissBehavior.this.dragDismissThreshold)) {
                return false;
            }
            return true;
        }

        @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            boolean z;
            int width;
            int width2;
            int width3;
            WeakHashMap<View, r0> weakHashMap = g0.a;
            if (g0.e.d(view) == 1) {
                z = true;
            } else {
                z = false;
            }
            int i3 = SwipeDismissBehavior.this.swipeDirection;
            if (i3 == 0) {
                if (z) {
                    width = this.originalCapturedViewLeft - view.getWidth();
                    width2 = this.originalCapturedViewLeft;
                } else {
                    width = this.originalCapturedViewLeft;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 == 1) {
                if (z) {
                    width = this.originalCapturedViewLeft;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                } else {
                    width = this.originalCapturedViewLeft - view.getWidth();
                    width2 = this.originalCapturedViewLeft;
                }
            } else {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = view.getWidth() + this.originalCapturedViewLeft;
            }
            return SwipeDismissBehavior.clamp(width, i, width2);
        }

        @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
        public int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
        public void onViewCaptured(View view, int i) {
            this.activePointerId = i;
            this.originalCapturedViewLeft = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.requestingDisallowInterceptTouchEvent = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.requestingDisallowInterceptTouchEvent = false;
            }
        }

        @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
        public void onViewDragStateChanged(int i) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i);
            }
        }

        @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            float width = view.getWidth() * SwipeDismissBehavior.this.alphaStartSwipeDistance;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.alphaEndSwipeDistance;
            float abs = Math.abs(i - this.originalCapturedViewLeft);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE);
            } else {
                view.setAlpha(SwipeDismissBehavior.clamp((float) SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE, 1.0f - SwipeDismissBehavior.fraction(width, width2, abs), 1.0f));
            }
        }

        @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
        public void onViewReleased(View view, float f, float f2) {
            int i;
            boolean z;
            OnDismissListener onDismissListener;
            this.activePointerId = -1;
            int width = view.getWidth();
            if (shouldDismiss(view, f)) {
                if (f >= SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE) {
                    int left = view.getLeft();
                    int i2 = this.originalCapturedViewLeft;
                    if (left >= i2) {
                        i = i2 + width;
                        z = true;
                    }
                }
                i = this.originalCapturedViewLeft - width;
                z = true;
            } else {
                i = this.originalCapturedViewLeft;
                z = false;
            }
            if (SwipeDismissBehavior.this.viewDragHelper.q(i, view.getTop())) {
                SettleRunnable settleRunnable = new SettleRunnable(view, z);
                WeakHashMap<View, r0> weakHashMap = g0.a;
                g0.d.m(view, settleRunnable);
            } else if (z && (onDismissListener = SwipeDismissBehavior.this.listener) != null) {
                onDismissListener.onDismiss(view);
            }
        }

        @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
        public boolean tryCaptureView(View view, int i) {
            int i2 = this.activePointerId;
            if ((i2 == -1 || i2 == i) && SwipeDismissBehavior.this.canSwipeDismissView(view)) {
                return true;
            }
            return false;
        }
    };

    /* loaded from: classes3.dex */
    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i);
    }

    /* loaded from: classes3.dex */
    public class SettleRunnable implements Runnable {
        private final boolean dismiss;
        private final View view;

        public SettleRunnable(View view, boolean z) {
            this.view = view;
            this.dismiss = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnDismissListener onDismissListener;
            c cVar = SwipeDismissBehavior.this.viewDragHelper;
            if (cVar != null && cVar.g()) {
                View view = this.view;
                WeakHashMap<View, r0> weakHashMap = g0.a;
                g0.d.m(view, this);
            } else if (this.dismiss && (onDismissListener = SwipeDismissBehavior.this.listener) != null) {
                onDismissListener.onDismiss(this.view);
            }
        }
    }

    public static float clamp(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    private void ensureViewDragHelper(ViewGroup viewGroup) {
        c cVar;
        if (this.viewDragHelper == null) {
            if (this.sensitivitySet) {
                cVar = c.h(viewGroup, this.sensitivity, this.dragCallback);
            } else {
                cVar = new c(viewGroup.getContext(), viewGroup, this.dragCallback);
            }
            this.viewDragHelper = cVar;
        }
    }

    public static float fraction(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    private void updateAccessibilityActions(View view) {
        g0.k(1048576, view);
        g0.i(0, view);
        if (canSwipeDismissView(view)) {
            g0.l(view, l.a.n, null, new p() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.2
                @Override // com.amazon.aps.iva.q3.p
                public boolean perform(View view2, p.a aVar) {
                    boolean z;
                    boolean z2 = false;
                    if (!SwipeDismissBehavior.this.canSwipeDismissView(view2)) {
                        return false;
                    }
                    WeakHashMap<View, r0> weakHashMap = g0.a;
                    if (g0.e.d(view2) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i = SwipeDismissBehavior.this.swipeDirection;
                    if ((i == 0 && z) || (i == 1 && !z)) {
                        z2 = true;
                    }
                    int width = view2.getWidth();
                    if (z2) {
                        width = -width;
                    }
                    view2.offsetLeftAndRight(width);
                    view2.setAlpha(SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE);
                    OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
                    if (onDismissListener != null) {
                        onDismissListener.onDismiss(view2);
                    }
                    return true;
                }
            });
        }
    }

    public boolean canSwipeDismissView(View view) {
        return true;
    }

    public int getDragState() {
        c cVar = this.viewDragHelper;
        if (cVar != null) {
            return cVar.a;
        }
        return 0;
    }

    public OnDismissListener getListener() {
        return this.listener;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.interceptingEvents;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.interceptingEvents = false;
            }
        } else {
            z = coordinatorLayout.isPointInChildBounds(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.interceptingEvents = z;
        }
        if (!z) {
            return false;
        }
        ensureViewDragHelper(coordinatorLayout);
        if (!this.requestingDisallowInterceptTouchEvent && this.viewDragHelper.r(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v, i);
        WeakHashMap<View, r0> weakHashMap = g0.a;
        if (g0.d.c(v) == 0) {
            g0.d.s(v, 1);
            updateAccessibilityActions(v);
        }
        return onLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.viewDragHelper != null) {
            if (!this.requestingDisallowInterceptTouchEvent || motionEvent.getActionMasked() != 3) {
                this.viewDragHelper.k(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }

    public void setDragDismissDistance(float f) {
        this.dragDismissThreshold = clamp((float) DEFAULT_ALPHA_START_DISTANCE, f, 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f) {
        this.alphaEndSwipeDistance = clamp((float) DEFAULT_ALPHA_START_DISTANCE, f, 1.0f);
    }

    public void setListener(OnDismissListener onDismissListener) {
        this.listener = onDismissListener;
    }

    public void setSensitivity(float f) {
        this.sensitivity = f;
        this.sensitivitySet = true;
    }

    public void setStartAlphaSwipeDistance(float f) {
        this.alphaStartSwipeDistance = clamp((float) DEFAULT_ALPHA_START_DISTANCE, f, 1.0f);
    }

    public void setSwipeDirection(int i) {
        this.swipeDirection = i;
    }

    public static int clamp(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }
}
