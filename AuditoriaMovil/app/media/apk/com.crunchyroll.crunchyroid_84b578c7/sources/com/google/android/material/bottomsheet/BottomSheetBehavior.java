package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.amazon.aps.iva.e.b;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.p3.a;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.q3.l;
import com.amazon.aps.iva.q3.p;
import com.amazon.aps.iva.w3.a;
import com.amazon.aps.iva.x3.c;
import com.google.android.gms.cast.MediaError;
import com.google.android.material.R;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBottomContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.common.primitives.Ints;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements MaterialBackHandler {
    private static final int CORNER_ANIMATION_DURATION = 500;
    static final int DEFAULT_SIGNIFICANT_VEL_THRESHOLD = 500;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_BottomSheet_Modal;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int INVALID_POSITION = -1;
    private static final int NO_MAX_SIZE = -1;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "BottomSheetBehavior";
    static final int VIEW_INDEX_ACCESSIBILITY_DELEGATE_VIEW = 1;
    private static final int VIEW_INDEX_BOTTOM_SHEET = 0;
    WeakReference<View> accessibilityDelegateViewRef;
    int activePointerId;
    private ColorStateList backgroundTint;
    MaterialBottomContainerBackHelper bottomContainerBackHelper;
    private final ArrayList<BottomSheetCallback> callbacks;
    private int childHeight;
    int collapsedOffset;
    private final c.AbstractC0840c dragCallback;
    private boolean draggable;
    float elevation;
    final SparseIntArray expandHalfwayActionIds;
    private boolean expandedCornersRemoved;
    int expandedOffset;
    private boolean fitToContents;
    int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    int halfExpandedOffset;
    float halfExpandedRatio;
    private float hideFriction;
    boolean hideable;
    private boolean ignoreEvents;
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;
    private int insetBottom;
    private int insetTop;
    private ValueAnimator interpolatorAnimator;
    private int lastNestedScrollDy;
    int lastStableState;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private MaterialShapeDrawable materialShapeDrawable;
    private int maxHeight;
    private int maxWidth;
    private float maximumVelocity;
    private boolean nestedScrolled;
    WeakReference<View> nestedScrollingChildRef;
    private boolean paddingBottomSystemWindowInsets;
    private boolean paddingLeftSystemWindowInsets;
    private boolean paddingRightSystemWindowInsets;
    private boolean paddingTopSystemWindowInsets;
    int parentHeight;
    int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags;
    private ShapeAppearanceModel shapeAppearanceModelDefault;
    private boolean shouldRemoveExpandedCorners;
    private int significantVelocityThreshold;
    private boolean skipCollapsed;
    int state;
    private final BottomSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;
    boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;
    private VelocityTracker velocityTracker;
    c viewDragHelper;
    WeakReference<V> viewRef;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface SaveFlags {
    }

    /* loaded from: classes3.dex */
    public static class SavedState extends a {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        };
        boolean fitToContents;
        boolean hideable;
        int peekHeight;
        boolean skipCollapsed;
        final int state;

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // com.amazon.aps.iva.w3.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            this.fitToContents = parcel.readInt() == 1;
            this.hideable = parcel.readInt() == 1;
            this.skipCollapsed = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.state;
            this.peekHeight = ((BottomSheetBehavior) bottomSheetBehavior).peekHeight;
            this.fitToContents = ((BottomSheetBehavior) bottomSheetBehavior).fitToContents;
            this.hideable = bottomSheetBehavior.hideable;
            this.skipCollapsed = ((BottomSheetBehavior) bottomSheetBehavior).skipCollapsed;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface StableState {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface State {
    }

    /* loaded from: classes3.dex */
    public class StateSettlingTracker {
        private final Runnable continueSettlingRunnable;
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;

        private StateSettlingTracker() {
            this.continueSettlingRunnable = new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker.1
                @Override // java.lang.Runnable
                public void run() {
                    StateSettlingTracker.this.isContinueSettlingRunnablePosted = false;
                    c cVar = BottomSheetBehavior.this.viewDragHelper;
                    if (cVar != null && cVar.g()) {
                        StateSettlingTracker stateSettlingTracker = StateSettlingTracker.this;
                        stateSettlingTracker.continueSettlingToState(stateSettlingTracker.targetState);
                        return;
                    }
                    StateSettlingTracker stateSettlingTracker2 = StateSettlingTracker.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.state == 2) {
                        bottomSheetBehavior.setStateInternal(stateSettlingTracker2.targetState);
                    }
                }
            };
        }

        public void continueSettlingToState(int i) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.viewRef;
            if (weakReference != null && weakReference.get() != null) {
                this.targetState = i;
                if (!this.isContinueSettlingRunnablePosted) {
                    Runnable runnable = this.continueSettlingRunnable;
                    WeakHashMap<View, r0> weakHashMap = g0.a;
                    g0.d.m(BottomSheetBehavior.this.viewRef.get(), runnable);
                    this.isContinueSettlingRunnablePosted = true;
                }
            }
        }
    }

    public BottomSheetBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = HIDE_THRESHOLD;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = HIDE_FRICTION;
        this.callbacks = new ArrayList<>();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new c.AbstractC0840c() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            private long viewCapturedMillis;

            private boolean releasedLow(View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (top > (bottomSheetBehavior.getExpandedOffset() + bottomSheetBehavior.parentHeight) / 2) {
                    return true;
                }
                return false;
            }

            @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
            public int clampViewPositionHorizontal(View view, int i, int i2) {
                return view.getLeft();
            }

            @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
            public int clampViewPositionVertical(View view, int i, int i2) {
                return w.q(i, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
            }

            @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
            public int getViewVerticalDragRange(View view) {
                if (BottomSheetBehavior.this.canBeHiddenByDragging()) {
                    return BottomSheetBehavior.this.parentHeight;
                }
                return BottomSheetBehavior.this.collapsedOffset;
            }

            @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
            public void onViewDragStateChanged(int i) {
                if (i == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
            public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                BottomSheetBehavior.this.dispatchOnSlide(i2);
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
                if (r7.this$0.shouldExpandOnUpwardDrag(r0, (r9 * 100.0f) / r10.parentHeight) != false) goto L5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
                if (r9 > r7.this$0.halfExpandedOffset) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
                if (java.lang.Math.abs(r8.getTop() - r7.this$0.getExpandedOffset()) < java.lang.Math.abs(r8.getTop() - r7.this$0.halfExpandedOffset)) goto L5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00cf, code lost:
                if (r7.this$0.shouldSkipHalfExpandedStateWhenDragging() == false) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
                if (java.lang.Math.abs(r9 - r7.this$0.fitToContentsOffset) < java.lang.Math.abs(r9 - r7.this$0.collapsedOffset)) goto L5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x010d, code lost:
                if (r7.this$0.shouldSkipHalfExpandedStateWhenDragging() != false) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x0127, code lost:
                if (r7.this$0.shouldSkipHalfExpandedStateWhenDragging() == false) goto L6;
             */
            @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onViewReleased(android.view.View r8, float r9, float r10) {
                /*
                    Method dump skipped, instructions count: 308
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass5.onViewReleased(android.view.View, float, float):void");
            }

            @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
            public boolean tryCaptureView(View view, int i) {
                View view2;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i2 = bottomSheetBehavior.state;
                if (i2 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i2 == 3 && bottomSheetBehavior.activePointerId == i) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    if (weakReference != null) {
                        view2 = weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = System.currentTimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                if (weakReference2 == null || weakReference2.get() != view) {
                    return false;
                }
                return true;
            }
        };
    }

    private int addAccessibilityActionForState(View view, int i, int i2) {
        int i3;
        boolean z;
        com.amazon.aps.iva.p3.a aVar;
        String string = view.getResources().getString(i);
        p createAccessibilityViewCommandForState = createAccessibilityViewCommandForState(i2);
        ArrayList f = g0.f(view);
        int i4 = 0;
        while (true) {
            if (i4 < f.size()) {
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((l.a) f.get(i4)).a).getLabel())) {
                    i3 = ((l.a) f.get(i4)).a();
                    break;
                }
                i4++;
            } else {
                int i5 = 0;
                int i6 = -1;
                while (true) {
                    int[] iArr = g0.d;
                    if (i5 >= iArr.length || i6 != -1) {
                        break;
                    }
                    int i7 = iArr[i5];
                    boolean z2 = true;
                    for (int i8 = 0; i8 < f.size(); i8++) {
                        if (((l.a) f.get(i8)).a() != i7) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        i6 = i7;
                    }
                    i5++;
                }
                i3 = i6;
            }
        }
        if (i3 != -1) {
            l.a aVar2 = new l.a(null, i3, string, createAccessibilityViewCommandForState, null);
            View.AccessibilityDelegate d = g0.d(view);
            if (d == null) {
                aVar = null;
            } else if (d instanceof a.C0597a) {
                aVar = ((a.C0597a) d).a;
            } else {
                aVar = new com.amazon.aps.iva.p3.a(d);
            }
            if (aVar == null) {
                aVar = new com.amazon.aps.iva.p3.a();
            }
            g0.n(view, aVar);
            g0.k(aVar2.a(), view);
            g0.f(view).add(aVar2);
            g0.i(0, view);
        }
        return i3;
    }

    private void calculateCollapsedOffset() {
        int calculatePeekHeight = calculatePeekHeight();
        if (this.fitToContents) {
            this.collapsedOffset = Math.max(this.parentHeight - calculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = this.parentHeight - calculatePeekHeight;
        }
    }

    private float calculateCornerInterpolation(float f, RoundedCorner roundedCorner) {
        int radius;
        if (roundedCorner != null) {
            radius = roundedCorner.getRadius();
            float f2 = radius;
            if (f2 > 0.0f && f > 0.0f) {
                return f2 / f;
            }
        }
        return 0.0f;
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) ((1.0f - this.halfExpandedRatio) * this.parentHeight);
    }

    private float calculateInterpolationWithCornersRemoved() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        if (this.materialShapeDrawable != null && (weakReference = this.viewRef) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            V v = this.viewRef.get();
            if (isAtTopOfScreen() && (rootWindowInsets = v.getRootWindowInsets()) != null) {
                float topLeftCornerResolvedSize = this.materialShapeDrawable.getTopLeftCornerResolvedSize();
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                float calculateCornerInterpolation = calculateCornerInterpolation(topLeftCornerResolvedSize, roundedCorner);
                float topRightCornerResolvedSize = this.materialShapeDrawable.getTopRightCornerResolvedSize();
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                return Math.max(calculateCornerInterpolation, calculateCornerInterpolation(topRightCornerResolvedSize, roundedCorner2));
            }
            return 0.0f;
        }
        return 0.0f;
    }

    private int calculatePeekHeight() {
        int i;
        if (this.peekHeightAuto) {
            return Math.min(Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight) + this.insetBottom;
        }
        if (!this.gestureInsetBottomIgnored && !this.paddingBottomSystemWindowInsets && (i = this.gestureInsetBottom) > 0) {
            return Math.max(this.peekHeight, i + this.peekHeightGestureInsetBuffer);
        }
        return this.peekHeight + this.insetBottom;
    }

    private float calculateSlideOffsetWithTop(int i) {
        float f;
        float f2;
        int i2 = this.collapsedOffset;
        if (i <= i2 && i2 != getExpandedOffset()) {
            int i3 = this.collapsedOffset;
            f = i3 - i;
            f2 = i3 - getExpandedOffset();
        } else {
            int i4 = this.collapsedOffset;
            f = i4 - i;
            f2 = this.parentHeight - i4;
        }
        return f / f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canBeHiddenByDragging() {
        if (isHideable() && isHideableWhenDragging()) {
            return true;
        }
        return false;
    }

    private void clearAccessibilityAction(View view, int i) {
        if (view == null) {
            return;
        }
        g0.k(524288, view);
        g0.i(0, view);
        g0.k(262144, view);
        g0.i(0, view);
        g0.k(1048576, view);
        g0.i(0, view);
        int i2 = this.expandHalfwayActionIds.get(i, -1);
        if (i2 != -1) {
            g0.k(i2, view);
            g0.i(0, view);
            this.expandHalfwayActionIds.delete(i);
        }
    }

    private p createAccessibilityViewCommandForState(final int i) {
        return new p() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
            @Override // com.amazon.aps.iva.q3.p
            public boolean perform(View view, p.a aVar) {
                BottomSheetBehavior.this.setState(i);
                return true;
            }
        };
    }

    private void createMaterialShapeDrawableIfNeeded(Context context) {
        if (this.shapeAppearanceModelDefault == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModelDefault);
        this.materialShapeDrawable = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        ColorStateList colorStateList = this.backgroundTint;
        if (colorStateList != null) {
            this.materialShapeDrawable.setFillColor(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842801, typedValue, true);
        this.materialShapeDrawable.setTint(typedValue.data);
    }

    private void createShapeValueAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(calculateInterpolationWithCornersRemoved(), 1.0f);
        this.interpolatorAnimator = ofFloat;
        ofFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.materialShapeDrawable != null) {
                    BottomSheetBehavior.this.materialShapeDrawable.setInterpolation(floatValue);
                }
            }
        });
    }

    public static <V extends View> BottomSheetBehavior<V> from(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).a;
            if (cVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) cVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private int getChildMeasureSpec(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i3 = Math.min(size, i3);
            }
            return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), Ints.MAX_POWER_OF_TWO);
    }

    private int getTopOffsetForState(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return this.halfExpandedOffset;
                    }
                    throw new IllegalArgumentException(c0.a("Invalid state to get top offset: ", i));
                }
                return this.parentHeight;
            }
            return this.collapsedOffset;
        }
        return getExpandedOffset();
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    private boolean isAtTopOfScreen() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        this.viewRef.get().getLocationOnScreen(iArr);
        if (iArr[1] != 0) {
            return false;
        }
        return true;
    }

    private boolean isExpandedAndShouldRemoveCorners() {
        if (this.state == 3 && (this.shouldRemoveExpandedCorners || isAtTopOfScreen())) {
            return true;
        }
        return false;
    }

    private boolean isLayouting(V v) {
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            if (g0.g.b(v)) {
                return true;
            }
        }
        return false;
    }

    private void replaceAccessibilityActionForState(View view, l.a aVar, int i) {
        g0.l(view, aVar, null, createAccessibilityViewCommandForState(i));
    }

    private void reset() {
        this.activePointerId = -1;
        this.initialY = -1;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(SavedState savedState) {
        int i = this.saveFlags;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.peekHeight = savedState.peekHeight;
        }
        if (i == -1 || (i & 2) == 2) {
            this.fitToContents = savedState.fitToContents;
        }
        if (i == -1 || (i & 4) == 4) {
            this.hideable = savedState.hideable;
        }
        if (i == -1 || (i & 8) == 8) {
            this.skipCollapsed = savedState.skipCollapsed;
        }
    }

    private void runAfterLayout(V v, Runnable runnable) {
        if (isLayouting(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void setWindowInsetsListener(View view) {
        final boolean z;
        if (Build.VERSION.SDK_INT >= 29 && !isGestureInsetBottomIgnored() && !this.peekHeightAuto) {
            z = true;
        } else {
            z = false;
        }
        if (!this.paddingBottomSystemWindowInsets && !this.paddingLeftSystemWindowInsets && !this.paddingRightSystemWindowInsets && !this.marginLeftSystemWindowInsets && !this.marginRightSystemWindowInsets && !this.marginTopSystemWindowInsets && !z) {
            return;
        }
        ViewUtils.doOnApplyWindowInsets(view, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
            /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.amazon.aps.iva.p3.w0 onApplyWindowInsets(android.view.View r11, com.amazon.aps.iva.p3.w0 r12, com.google.android.material.internal.ViewUtils.RelativePadding r13) {
                /*
                    r10 = this;
                    r0 = 7
                    com.amazon.aps.iva.g3.f r0 = r12.a(r0)
                    r1 = 32
                    com.amazon.aps.iva.g3.f r1 = r12.a(r1)
                    com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    int r3 = r0.b
                    com.google.android.material.bottomsheet.BottomSheetBehavior.access$302(r2, r3)
                    boolean r2 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r11)
                    int r3 = r11.getPaddingBottom()
                    int r4 = r11.getPaddingLeft()
                    int r5 = r11.getPaddingRight()
                    com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$400(r6)
                    if (r6 == 0) goto L3c
                    com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    int r6 = r12.b()
                    com.google.android.material.bottomsheet.BottomSheetBehavior.access$502(r3, r6)
                    int r3 = r13.bottom
                    com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$500(r6)
                    int r3 = r3 + r6
                L3c:
                    com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$600(r6)
                    int r7 = r0.a
                    if (r6 == 0) goto L4e
                    if (r2 == 0) goto L4b
                    int r4 = r13.end
                    goto L4d
                L4b:
                    int r4 = r13.start
                L4d:
                    int r4 = r4 + r7
                L4e:
                    com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$700(r6)
                    int r8 = r0.c
                    if (r6 == 0) goto L61
                    if (r2 == 0) goto L5d
                    int r13 = r13.start
                    goto L5f
                L5d:
                    int r13 = r13.end
                L5f:
                    int r5 = r13 + r8
                L61:
                    android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                    android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                    com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$800(r2)
                    r6 = 0
                    r9 = 1
                    if (r2 == 0) goto L79
                    int r2 = r13.leftMargin
                    if (r2 == r7) goto L79
                    r13.leftMargin = r7
                    r2 = r9
                    goto L7a
                L79:
                    r2 = r6
                L7a:
                    com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    boolean r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$900(r7)
                    if (r7 == 0) goto L89
                    int r7 = r13.rightMargin
                    if (r7 == r8) goto L89
                    r13.rightMargin = r8
                    r2 = r9
                L89:
                    com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    boolean r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$1000(r7)
                    if (r7 == 0) goto L9a
                    int r7 = r13.topMargin
                    int r0 = r0.b
                    if (r7 == r0) goto L9a
                    r13.topMargin = r0
                    goto L9b
                L9a:
                    r9 = r2
                L9b:
                    if (r9 == 0) goto La0
                    r11.setLayoutParams(r13)
                La0:
                    int r13 = r11.getPaddingTop()
                    r11.setPadding(r4, r13, r5, r3)
                    boolean r11 = r2
                    if (r11 == 0) goto Lb2
                    com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    int r13 = r1.d
                    com.google.android.material.bottomsheet.BottomSheetBehavior.access$1102(r11, r13)
                Lb2:
                    com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$400(r11)
                    if (r11 != 0) goto Lbe
                    boolean r11 = r2
                    if (r11 == 0) goto Lc3
                Lbe:
                    com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    com.google.android.material.bottomsheet.BottomSheetBehavior.access$1200(r11, r6)
                Lc3:
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass4.onApplyWindowInsets(android.view.View, com.amazon.aps.iva.p3.w0, com.google.android.material.internal.ViewUtils$RelativePadding):com.amazon.aps.iva.p3.w0");
            }
        });
    }

    private boolean shouldHandleDraggingWithHelper() {
        if (this.viewDragHelper != null && (this.draggable || this.state == 1)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view, int i, boolean z) {
        boolean z2;
        int topOffsetForState = getTopOffsetForState(i);
        c cVar = this.viewDragHelper;
        if (cVar != null && (!z ? cVar.s(view, view.getLeft(), topOffsetForState) : cVar.q(view.getLeft(), topOffsetForState))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            setStateInternal(2);
            updateDrawableForTargetState(i, true);
            this.stateSettlingTracker.continueSettlingToState(i);
            return;
        }
        setStateInternal(i);
    }

    private void updateAccessibilityActions() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            updateAccessibilityActions(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.accessibilityDelegateViewRef;
        if (weakReference2 != null) {
            updateAccessibilityActions(weakReference2.get(), 1);
        }
    }

    private void updateDrawableForTargetState(int i, boolean z) {
        boolean isExpandedAndShouldRemoveCorners;
        ValueAnimator valueAnimator;
        if (i != 2 && this.expandedCornersRemoved != (isExpandedAndShouldRemoveCorners = isExpandedAndShouldRemoveCorners()) && this.materialShapeDrawable != null) {
            this.expandedCornersRemoved = isExpandedAndShouldRemoveCorners;
            float f = 1.0f;
            if (z && (valueAnimator = this.interpolatorAnimator) != null) {
                if (valueAnimator.isRunning()) {
                    this.interpolatorAnimator.reverse();
                    return;
                }
                float interpolation = this.materialShapeDrawable.getInterpolation();
                if (isExpandedAndShouldRemoveCorners) {
                    f = calculateInterpolationWithCornersRemoved();
                }
                this.interpolatorAnimator.setFloatValues(interpolation, f);
                this.interpolatorAnimator.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.interpolatorAnimator;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.interpolatorAnimator.cancel();
            }
            MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            if (this.expandedCornersRemoved) {
                f = calculateInterpolationWithCornersRemoved();
            }
            materialShapeDrawable.setInterpolation(f);
        }
    }

    private void updateImportantForAccessibility(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z) {
            if (this.importantForAccessibilityMap == null) {
                this.importantForAccessibilityMap = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if (childAt != this.viewRef.get()) {
                if (z) {
                    this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    if (this.updateImportantForAccessibilityOnSiblings) {
                        WeakHashMap<View, r0> weakHashMap = g0.a;
                        g0.d.s(childAt, 4);
                    }
                } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                    int intValue = this.importantForAccessibilityMap.get(childAt).intValue();
                    WeakHashMap<View, r0> weakHashMap2 = g0.a;
                    g0.d.s(childAt, intValue);
                }
            }
        }
        if (!z) {
            this.importantForAccessibilityMap = null;
        } else if (this.updateImportantForAccessibilityOnSiblings) {
            this.viewRef.get().sendAccessibilityEvent(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePeekHeight(boolean z) {
        V v;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state == 4 && (v = this.viewRef.get()) != null) {
                if (z) {
                    setState(4);
                } else {
                    v.requestLayout();
                }
            }
        }
    }

    public void addBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        if (!this.callbacks.contains(bottomSheetCallback)) {
            this.callbacks.add(bottomSheetCallback);
        }
    }

    public float calculateSlideOffset() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null && weakReference.get() != null) {
            return calculateSlideOffsetWithTop(this.viewRef.get().getTop());
        }
        return -1.0f;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.cancelBackProgress();
    }

    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    public void dispatchOnSlide(int i) {
        V v = this.viewRef.get();
        if (v != null && !this.callbacks.isEmpty()) {
            float calculateSlideOffsetWithTop = calculateSlideOffsetWithTop(i);
            for (int i2 = 0; i2 < this.callbacks.size(); i2++) {
                this.callbacks.get(i2).onSlide(v, calculateSlideOffsetWithTop);
            }
        }
    }

    public View findScrollingChild(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap<View, r0> weakHashMap = g0.a;
        if (g0.i.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
                if (findScrollingChild != null) {
                    return findScrollingChild;
                }
            }
        }
        return null;
    }

    public MaterialBottomContainerBackHelper getBackHelper() {
        return this.bottomContainerBackHelper;
    }

    public int getExpandedOffset() {
        int i;
        if (this.fitToContents) {
            return this.fitToContentsOffset;
        }
        int i2 = this.expandedOffset;
        if (this.paddingTopSystemWindowInsets) {
            i = 0;
        } else {
            i = this.insetTop;
        }
        return Math.max(i2, i);
    }

    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    public int getLastStableState() {
        return this.lastStableState;
    }

    public MaterialShapeDrawable getMaterialShapeDrawable() {
        return this.materialShapeDrawable;
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    public int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public int getSignificantVelocityThreshold() {
        return this.significantVelocityThreshold;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public int getState() {
        return this.state;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        b onHandleBackInvoked = materialBottomContainerBackHelper.onHandleBackInvoked();
        int i = 4;
        if (onHandleBackInvoked != null && Build.VERSION.SDK_INT >= 34) {
            if (this.hideable) {
                this.bottomContainerBackHelper.finishBackProgressNotPersistent(onHandleBackInvoked, new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        BottomSheetBehavior.this.setStateInternal(5);
                        WeakReference<V> weakReference = BottomSheetBehavior.this.viewRef;
                        if (weakReference != null && weakReference.get() != null) {
                            BottomSheetBehavior.this.viewRef.get().requestLayout();
                        }
                    }
                });
                return;
            }
            this.bottomContainerBackHelper.finishBackProgressPersistent(onHandleBackInvoked, null);
            setState(4);
            return;
        }
        if (this.hideable) {
            i = 5;
        }
        setState(i);
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    public boolean isHideableWhenDragging() {
        return true;
    }

    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    public boolean isShouldRemoveExpandedCorners() {
        return this.shouldRemoveExpandedCorners;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
        super.onAttachedToLayoutParams(fVar);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        View view;
        int i;
        c cVar;
        if (v.isShown() && this.draggable) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                reset();
            }
            if (this.velocityTracker == null) {
                this.velocityTracker = VelocityTracker.obtain();
            }
            this.velocityTracker.addMovement(motionEvent);
            View view2 = null;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.touchingScrollingChild = false;
                    this.activePointerId = -1;
                    if (this.ignoreEvents) {
                        this.ignoreEvents = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                this.initialY = (int) motionEvent.getY();
                if (this.state != 2) {
                    WeakReference<View> weakReference = this.nestedScrollingChildRef;
                    if (weakReference != null) {
                        view = weakReference.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.isPointInChildBounds(view, x, this.initialY)) {
                        this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.touchingScrollingChild = true;
                    }
                }
                if (this.activePointerId == -1 && !coordinatorLayout.isPointInChildBounds(v, x, this.initialY)) {
                    z = true;
                } else {
                    z = false;
                }
                this.ignoreEvents = z;
            }
            if (!this.ignoreEvents && (cVar = this.viewDragHelper) != null && cVar.r(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.nestedScrollingChildRef;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if (actionMasked != 2 || view2 == null || this.ignoreEvents || this.state == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.viewDragHelper == null || (i = this.initialY) == -1 || Math.abs(i - motionEvent.getY()) <= this.viewDragHelper.b) {
                return false;
            }
            return true;
        }
        this.ignoreEvents = true;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        WeakHashMap<View, r0> weakHashMap = g0.a;
        if (g0.d.b(coordinatorLayout) && !g0.d.b(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            setWindowInsetsListener(v);
            g0.p(v, new InsetsAnimationCallback(v));
            this.viewRef = new WeakReference<>(v);
            this.bottomContainerBackHelper = new MaterialBottomContainerBackHelper(v);
            MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            if (materialShapeDrawable != null) {
                g0.d.q(v, materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
                float f = this.elevation;
                if (f == -1.0f) {
                    f = g0.i.i(v);
                }
                materialShapeDrawable2.setElevation(f);
            } else {
                ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    g0.i.q(v, colorStateList);
                }
            }
            updateAccessibilityActions();
            if (g0.d.c(v) == 0) {
                g0.d.s(v, 1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = new c(coordinatorLayout.getContext(), coordinatorLayout, this.dragCallback);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentHeight = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.childHeight = height;
        int i2 = this.parentHeight;
        int i3 = i2 - height;
        int i4 = this.insetTop;
        if (i3 < i4) {
            if (this.paddingTopSystemWindowInsets) {
                int i5 = this.maxHeight;
                if (i5 != -1) {
                    i2 = Math.min(i2, i5);
                }
                this.childHeight = i2;
            } else {
                int i6 = i2 - i4;
                int i7 = this.maxHeight;
                if (i7 != -1) {
                    i6 = Math.min(i6, i7);
                }
                this.childHeight = i6;
            }
        }
        this.fitToContentsOffset = Math.max(0, this.parentHeight - this.childHeight);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i8 = this.state;
        if (i8 == 3) {
            v.offsetTopAndBottom(getExpandedOffset());
        } else if (i8 == 6) {
            v.offsetTopAndBottom(this.halfExpandedOffset);
        } else if (this.hideable && i8 == 5) {
            v.offsetTopAndBottom(this.parentHeight);
        } else if (i8 == 4) {
            v.offsetTopAndBottom(this.collapsedOffset);
        } else if (i8 == 1 || i8 == 2) {
            v.offsetTopAndBottom(top - v.getTop());
        }
        updateDrawableForTargetState(this.state, false);
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v));
        for (int i9 = 0; i9 < this.callbacks.size(); i9++) {
            this.callbacks.get(i9).onLayout(v);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.maxWidth, marginLayoutParams.width), getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.maxHeight, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference;
        if (!isNestedScrollingCheckEnabled() || (weakReference = this.nestedScrollingChildRef) == null || view != weakReference.get()) {
            return false;
        }
        if (this.state == 3 && !super.onNestedPreFling(coordinatorLayout, v, view, f, f2)) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        View view2;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (isNestedScrollingCheckEnabled() && view != view2) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < getExpandedOffset()) {
                int expandedOffset = top - getExpandedOffset();
                iArr[1] = expandedOffset;
                int i5 = -expandedOffset;
                WeakHashMap<View, r0> weakHashMap = g0.a;
                v.offsetTopAndBottom(i5);
                setStateInternal(3);
            } else if (!this.draggable) {
                return;
            } else {
                iArr[1] = i2;
                WeakHashMap<View, r0> weakHashMap2 = g0.a;
                v.offsetTopAndBottom(-i2);
                setStateInternal(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            if (i4 > this.collapsedOffset && !canBeHiddenByDragging()) {
                int i6 = top - this.collapsedOffset;
                iArr[1] = i6;
                int i7 = -i6;
                WeakHashMap<View, r0> weakHashMap3 = g0.a;
                v.offsetTopAndBottom(i7);
                setStateInternal(4);
            } else if (!this.draggable) {
                return;
            } else {
                iArr[1] = i2;
                WeakHashMap<View, r0> weakHashMap4 = g0.a;
                v.offsetTopAndBottom(-i2);
                setStateInternal(1);
            }
        }
        dispatchOnSlide(v.getTop());
        this.lastNestedScrollDy = i2;
        this.nestedScrolled = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        restoreOptionalState(savedState);
        int i = savedState.state;
        if (i != 1 && i != 2) {
            this.state = i;
            this.lastStableState = i;
            return;
        }
        this.state = 4;
        this.lastStableState = 4;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
        if (r4.getTop() <= r2.halfExpandedOffset) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
        if (java.lang.Math.abs(r3 - r2.fitToContentsOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
        if (shouldSkipHalfExpandedStateWhenDragging() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
        if (java.lang.Math.abs(r3 - r2.halfExpandedOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
        r0 = 6;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.getExpandedOffset()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.setStateInternal(r0)
            return
        Lf:
            boolean r3 = r2.isNestedScrollingCheckEnabled()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference<android.view.View> r3 = r2.nestedScrollingChildRef
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.nestedScrolled
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.lastNestedScrollDy
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.fitToContents
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.halfExpandedOffset
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.hideable
            if (r3 == 0) goto L49
            float r3 = r2.getYVelocity()
            boolean r3 = r2.shouldHide(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.lastNestedScrollDy
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.fitToContents
            if (r1 == 0) goto L68
            int r5 = r2.fitToContentsOffset
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.halfExpandedOffset
            if (r3 >= r1) goto L7e
            int r1 = r2.collapsedOffset
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.shouldSkipHalfExpandedStateWhenDragging()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.fitToContents
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.halfExpandedOffset
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.startSettling(r4, r0, r3)
            r2.nestedScrolled = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.viewDragHelper.k(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents) {
            float abs = Math.abs(this.initialY - motionEvent.getY());
            c cVar = this.viewDragHelper;
            if (abs > cVar.b) {
                cVar.b(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.ignoreEvents;
    }

    public void removeBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        this.callbacks.remove(bottomSheetCallback);
    }

    public void setAccessibilityDelegateView(View view) {
        WeakReference<View> weakReference;
        if (view == null && (weakReference = this.accessibilityDelegateViewRef) != null) {
            clearAccessibilityAction(weakReference.get(), 1);
            this.accessibilityDelegateViewRef = null;
            return;
        }
        this.accessibilityDelegateViewRef = new WeakReference<>(view);
        updateAccessibilityActions(view, 1);
    }

    @Deprecated
    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        this.callbacks.clear();
        if (bottomSheetCallback != null) {
            this.callbacks.add(bottomSheetCallback);
        }
    }

    public void setDraggable(boolean z) {
        this.draggable = z;
    }

    public void setExpandedOffset(int i) {
        if (i >= 0) {
            this.expandedOffset = i;
            updateDrawableForTargetState(this.state, true);
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void setFitToContents(boolean z) {
        int i;
        if (this.fitToContents == z) {
            return;
        }
        this.fitToContents = z;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        if (this.fitToContents && this.state == 6) {
            i = 3;
        } else {
            i = this.state;
        }
        setStateInternal(i);
        updateDrawableForTargetState(this.state, true);
        updateAccessibilityActions();
    }

    public void setGestureInsetBottomIgnored(boolean z) {
        this.gestureInsetBottomIgnored = z;
    }

    public void setHalfExpandedRatio(float f) {
        if (f > 0.0f && f < 1.0f) {
            this.halfExpandedRatio = f;
            if (this.viewRef != null) {
                calculateHalfExpandedOffset();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public void setHideFriction(float f) {
        this.hideFriction = f;
    }

    public void setHideable(boolean z) {
        if (this.hideable != z) {
            this.hideable = z;
            if (!z && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public void setHideableInternal(boolean z) {
        this.hideable = z;
    }

    public void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
    }

    public void setPeekHeight(int i) {
        setPeekHeight(i, false);
    }

    public void setSaveFlags(int i) {
        this.saveFlags = i;
    }

    public void setShouldRemoveExpandedCorners(boolean z) {
        if (this.shouldRemoveExpandedCorners != z) {
            this.shouldRemoveExpandedCorners = z;
            updateDrawableForTargetState(getState(), true);
        }
    }

    public void setSignificantVelocityThreshold(int i) {
        this.significantVelocityThreshold = i;
    }

    public void setSkipCollapsed(boolean z) {
        this.skipCollapsed = z;
    }

    public void setState(int i) {
        String str;
        final int i2;
        if (i != 1 && i != 2) {
            if (!this.hideable && i == 5) {
                return;
            }
            if (i == 6 && this.fitToContents && getTopOffsetForState(i) <= this.fitToContentsOffset) {
                i2 = 3;
            } else {
                i2 = i;
            }
            WeakReference<V> weakReference = this.viewRef;
            if (weakReference != null && weakReference.get() != null) {
                final V v = this.viewRef.get();
                runAfterLayout(v, new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
                    @Override // java.lang.Runnable
                    public void run() {
                        BottomSheetBehavior.this.startSettling(v, i2, false);
                    }
                });
                return;
            }
            setStateInternal(i);
            return;
        }
        StringBuilder sb = new StringBuilder("STATE_");
        if (i == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(b.c(sb, str, " should not be set externally."));
    }

    public void setStateInternal(int i) {
        V v;
        if (this.state == i) {
            return;
        }
        this.state = i;
        if (i == 4 || i == 3 || i == 6 || (this.hideable && i == 5)) {
            this.lastStableState = i;
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            updateImportantForAccessibility(true);
        } else if (i == 6 || i == 5 || i == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i, true);
        for (int i2 = 0; i2 < this.callbacks.size(); i2++) {
            this.callbacks.get(i2).onStateChanged(v, i);
        }
        updateAccessibilityActions();
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z) {
        this.updateImportantForAccessibilityOnSiblings = z;
    }

    public boolean shouldExpandOnUpwardDrag(long j, float f) {
        return false;
    }

    public boolean shouldHide(View view, float f) {
        if (this.skipCollapsed) {
            return true;
        }
        if (!isHideableWhenDragging() || view.getTop() < this.collapsedOffset) {
            return false;
        }
        int calculatePeekHeight = calculatePeekHeight();
        if (Math.abs(((f * this.hideFriction) + view.getTop()) - this.collapsedOffset) / calculatePeekHeight > HIDE_THRESHOLD) {
            return true;
        }
        return false;
    }

    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(b bVar) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.startBackProgress(bVar);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(b bVar) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.updateBackProgress(bVar);
    }

    public final void setPeekHeight(int i, boolean z) {
        boolean z2 = true;
        if (i == -1) {
            if (!this.peekHeightAuto) {
                this.peekHeightAuto = true;
            }
            z2 = false;
        } else {
            if (this.peekHeightAuto || this.peekHeight != i) {
                this.peekHeightAuto = false;
                this.peekHeight = Math.max(0, i);
            }
            z2 = false;
        }
        if (z2) {
            updatePeekHeight(z);
        }
    }

    private void updateAccessibilityActions(View view, int i) {
        if (view == null) {
            return;
        }
        clearAccessibilityAction(view, i);
        if (!this.fitToContents && this.state != 6) {
            this.expandHalfwayActionIds.put(i, addAccessibilityActionForState(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.hideable && isHideableWhenDragging() && this.state != 5) {
            replaceAccessibilityActionForState(view, l.a.n, 5);
        }
        int i2 = this.state;
        if (i2 == 3) {
            replaceAccessibilityActionForState(view, l.a.m, this.fitToContents ? 4 : 6);
        } else if (i2 == 4) {
            replaceAccessibilityActionForState(view, l.a.l, this.fitToContents ? 3 : 6);
        } else if (i2 != 6) {
        } else {
            replaceAccessibilityActionForState(view, l.a.m, 4);
            replaceAccessibilityActionForState(view, l.a.l, 3);
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = HIDE_THRESHOLD;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = HIDE_FRICTION;
        this.callbacks = new ArrayList<>();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new c.AbstractC0840c() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            private long viewCapturedMillis;

            private boolean releasedLow(View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (top > (bottomSheetBehavior.getExpandedOffset() + bottomSheetBehavior.parentHeight) / 2) {
                    return true;
                }
                return false;
            }

            @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
            public int clampViewPositionHorizontal(View view, int i2, int i22) {
                return view.getLeft();
            }

            @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
            public int clampViewPositionVertical(View view, int i2, int i22) {
                return w.q(i2, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
            }

            @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
            public int getViewVerticalDragRange(View view) {
                if (BottomSheetBehavior.this.canBeHiddenByDragging()) {
                    return BottomSheetBehavior.this.parentHeight;
                }
                return BottomSheetBehavior.this.collapsedOffset;
            }

            @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
            public void onViewDragStateChanged(int i2) {
                if (i2 == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
            public void onViewPositionChanged(View view, int i2, int i22, int i3, int i4) {
                BottomSheetBehavior.this.dispatchOnSlide(i22);
            }

            @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onViewReleased(android.view.View r8, float r9, float r10) {
                /*
                    Method dump skipped, instructions count: 308
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass5.onViewReleased(android.view.View, float, float):void");
            }

            @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
            public boolean tryCaptureView(View view, int i2) {
                View view2;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i22 = bottomSheetBehavior.state;
                if (i22 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i22 == 3 && bottomSheetBehavior.activePointerId == i2) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    if (weakReference != null) {
                        view2 = weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = System.currentTimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                if (weakReference2 == null || weakReference2.get() != view) {
                    return false;
                }
                return true;
            }
        };
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        if (obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_backgroundTint)) {
            this.backgroundTint = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.BottomSheetBehavior_Layout_backgroundTint);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.shapeAppearanceModelDefault = ShapeAppearanceModel.builder(context, attributeSet, R.attr.bottomSheetStyle, DEF_STYLE_RES).build();
        }
        createMaterialShapeDrawableIfNeeded(context);
        createShapeValueAnimator();
        this.elevation = obtainStyledAttributes.getDimension(R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_android_maxWidth)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_android_maxWidth, -1));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_android_maxHeight)) {
            setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_android_maxHeight, -1));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue != null && (i = peekValue.data) == -1) {
            setPeekHeight(i);
        } else {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        setHideable(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setGestureInsetBottomIgnored(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        setFitToContents(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setDraggable(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        setSaveFlags(obtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(obtainStyledAttributes.getFloat(R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, HIDE_THRESHOLD));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (peekValue2 != null && peekValue2.type == 16) {
            setExpandedOffset(peekValue2.data);
        } else {
            setExpandedOffset(obtainStyledAttributes.getDimensionPixelOffset(R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        }
        setSignificantVelocityThreshold(obtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, MediaError.DetailedErrorCode.SEGMENT_UNKNOWN));
        this.paddingBottomSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.paddingLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.paddingRightSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.paddingTopSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.marginLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.marginRightSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.marginTopSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.shouldRemoveExpandedCorners = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        obtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* loaded from: classes3.dex */
    public static abstract class BottomSheetCallback {
        public abstract void onSlide(View view, float f);

        public abstract void onStateChanged(View view, int i);

        public void onLayout(View view) {
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }
}
