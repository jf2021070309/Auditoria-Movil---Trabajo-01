package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.h0;
import androidx.recyclerview.widget.i0;
import androidx.recyclerview.widget.p;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.k3.m;
import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.q3.l;
import com.crunchyroll.crunchyroid.R;
import com.google.common.primitives.Ints;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements com.amazon.aps.iva.p3.z, com.amazon.aps.iva.p3.o {
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final c0 sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    androidx.recyclerview.widget.c0 mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    h mAdapter;
    androidx.recyclerview.widget.a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private k mChildDrawingOrderCallback;
    androidx.recyclerview.widget.e mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private l mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.p mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private t mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    m mItemAnimator;
    private m.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<o> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    p mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final y mObserver;
    private List<r> mOnChildAttachStateListeners;
    private s mOnFlingListener;
    private final ArrayList<t> mOnItemTouchListeners;
    final List<f0> mPendingAccessibilityImportanceChange;
    z mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    p.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final w mRecycler;
    x mRecyclerListener;
    final List<x> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private u mScrollListener;
    private List<u> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private com.amazon.aps.iva.p3.q mScrollingChildHelper;
    final b0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final e0 mViewFlinger;
    private final i0.b mViewInfoProcessCallback;
    final i0 mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                if (!recyclerView.mIsAttached) {
                    recyclerView.requestLayout();
                } else if (recyclerView.mLayoutSuppressed) {
                    recyclerView.mLayoutWasDefered = true;
                } else {
                    recyclerView.consumePendingUpdateOperations();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a0 {
        private p mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final a mRecyclingAction = new a();

        /* loaded from: classes.dex */
        public static class a {
            public int d = -1;
            public boolean f = false;
            public int a = 0;
            public int b = 0;
            public int c = Integer.MIN_VALUE;
            public Interpolator e = null;

            public final void a(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f = false;
                } else if (this.f) {
                    Interpolator interpolator = this.e;
                    if (interpolator != null && this.c < 1) {
                        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                    }
                    int i2 = this.c;
                    if (i2 >= 1) {
                        recyclerView.mViewFlinger.c(this.a, this.b, interpolator, i2);
                        this.f = false;
                        return;
                    }
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public final void b(int i, int i2, BaseInterpolator baseInterpolator, int i3) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = baseInterpolator;
                this.f = true;
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            PointF computeScrollVectorForPosition(int i);
        }

        public PointF computeScrollVectorForPosition(int i) {
            p layoutManager = getLayoutManager();
            if (layoutManager instanceof b) {
                return ((b) layoutManager).computeScrollVectorForPosition(i);
            }
            return null;
        }

        public View findViewByPosition(int i) {
            return this.mRecyclerView.mLayout.findViewByPosition(i);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        public p getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i) {
            this.mRecyclerView.scrollToPosition(i);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public void normalize(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        public void onAnimation(int i, int i2) {
            PointF computeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (computeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f = computeScrollVectorForPosition.x;
                if (f != RecyclerView.DECELERATION_RATE || computeScrollVectorForPosition.y != RecyclerView.DECELERATION_RATE) {
                    recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(computeScrollVectorForPosition.y), null);
                }
            }
            boolean z = false;
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.a(recyclerView);
                    stop();
                } else {
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i, i2, recyclerView.mState, this.mRecyclingAction);
                a aVar = this.mRecyclingAction;
                if (aVar.d >= 0) {
                    z = true;
                }
                aVar.a(recyclerView);
                if (z && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.b();
                }
            }
        }

        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        public abstract void onSeekTargetStep(int i, int i2, b0 b0Var, a aVar);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(View view, b0 b0Var, a aVar);

        public void setTargetPosition(int i) {
            this.mTargetPosition = i;
        }

        public void start(RecyclerView recyclerView, p pVar) {
            e0 e0Var = recyclerView.mViewFlinger;
            RecyclerView.this.removeCallbacks(e0Var);
            e0Var.d.abortAnimation();
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = pVar;
            int i = this.mTargetPosition;
            if (i != -1) {
                recyclerView.mState.a = i;
                this.mRunning = true;
                this.mPendingInitialRun = true;
                this.mTargetView = findViewByPosition(getTargetPosition());
                onStart();
                this.mRecyclerView.mViewFlinger.b();
                this.mStarted = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public final void stop() {
            if (!this.mRunning) {
                return;
            }
            this.mRunning = false;
            onStop();
            this.mRecyclerView.mState.a = -1;
            this.mTargetView = null;
            this.mTargetPosition = -1;
            this.mPendingInitialRun = false;
            this.mLayoutManager.onSmoothScrollerStopped(this);
            this.mLayoutManager = null;
            this.mRecyclerView = null;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            m mVar = recyclerView.mItemAnimator;
            if (mVar != null) {
                mVar.h();
            }
            recyclerView.mPostedAnimatorRunner = false;
        }
    }

    /* loaded from: classes.dex */
    public static class b0 {
        public int a = -1;
        public int b = 0;
        public int c = 0;
        public int d = 1;
        public int e = 0;
        public boolean f = false;
        public boolean g = false;
        public boolean h = false;
        public boolean i = false;
        public boolean j = false;
        public boolean k = false;
        public int l;
        public long m;
        public int n;
        public int o;
        public int p;

        public final void a(int i) {
            if ((this.d & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
        }

        public final int b() {
            if (this.g) {
                return this.b - this.c;
            }
            return this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State{mTargetPosition=");
            sb.append(this.a);
            sb.append(", mData=null, mItemCount=");
            sb.append(this.e);
            sb.append(", mIsMeasuring=");
            sb.append(this.i);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.b);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.c);
            sb.append(", mStructureChanged=");
            sb.append(this.f);
            sb.append(", mInPreLayout=");
            sb.append(this.g);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.j);
            sb.append(", mRunPredictiveAnimations=");
            return defpackage.a.b(sb, this.k, '}');
        }
    }

    /* loaded from: classes.dex */
    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public static class c0 extends l {
    }

    /* loaded from: classes.dex */
    public class d implements i0.b {
        public d() {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d0 {
    }

    /* loaded from: classes.dex */
    public class e implements e.b {
        public e() {
        }

        public final int a() {
            return RecyclerView.this.getChildCount();
        }

        public final void b(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                recyclerView.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeViewAt(i);
        }
    }

    /* loaded from: classes.dex */
    public class e0 implements Runnable {
        public int b;
        public int c;
        public OverScroller d;
        public Interpolator e;
        public boolean f;
        public boolean g;

        public e0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.e = interpolator;
            this.f = false;
            this.g = false;
            this.d = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final void a(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.c = 0;
            this.b = 0;
            Interpolator interpolator = this.e;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.e = interpolator2;
                this.d = new OverScroller(recyclerView.getContext(), interpolator2);
            }
            this.d.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            b();
        }

        public final void b() {
            if (this.f) {
                this.g = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
            g0.d.m(recyclerView, this);
        }

        public final void c(int i, int i2, Interpolator interpolator, int i3) {
            boolean z;
            int height;
            RecyclerView recyclerView = RecyclerView.this;
            if (i3 == Integer.MIN_VALUE) {
                int abs = Math.abs(i);
                int abs2 = Math.abs(i2);
                if (abs > abs2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    height = recyclerView.getWidth();
                } else {
                    height = recyclerView.getHeight();
                }
                if (!z) {
                    abs = abs2;
                }
                i3 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.e != interpolator) {
                this.e = interpolator;
                this.d = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.c = 0;
            this.b = 0;
            recyclerView.setScrollState(2);
            this.d.startScroll(0, 0, i, i2, i4);
            b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i2;
            int i3;
            int i4;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int i5;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                recyclerView.removeCallbacks(this);
                this.d.abortAnimation();
                return;
            }
            this.g = false;
            this.f = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                this.b = currX;
                this.c = currY;
                int consumeFlingInHorizontalStretch = recyclerView.consumeFlingInHorizontalStretch(currX - this.b);
                int consumeFlingInVerticalStretch = recyclerView.consumeFlingInVerticalStretch(currY - this.c);
                int[] iArr = recyclerView.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView.dispatchNestedPreScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = recyclerView.mReusableIntPair;
                    consumeFlingInHorizontalStretch -= iArr2[0];
                    consumeFlingInVerticalStretch -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.considerReleasingGlowsOnScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch);
                }
                if (recyclerView.mAdapter != null) {
                    int[] iArr3 = recyclerView.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView.scrollStep(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr3);
                    int[] iArr4 = recyclerView.mReusableIntPair;
                    int i6 = iArr4[0];
                    int i7 = iArr4[1];
                    int i8 = consumeFlingInHorizontalStretch - i6;
                    int i9 = consumeFlingInVerticalStretch - i7;
                    a0 a0Var = recyclerView.mLayout.mSmoothScroller;
                    if (a0Var != null && !a0Var.isPendingInitialRun() && a0Var.isRunning()) {
                        int b = recyclerView.mState.b();
                        if (b == 0) {
                            a0Var.stop();
                        } else if (a0Var.getTargetPosition() >= b) {
                            a0Var.setTargetPosition(b - 1);
                            a0Var.onAnimation(i6, i7);
                        } else {
                            a0Var.onAnimation(i6, i7);
                        }
                    }
                    i3 = i7;
                    i4 = i6;
                    i = i8;
                    i2 = i9;
                } else {
                    i = consumeFlingInHorizontalStretch;
                    i2 = consumeFlingInVerticalStretch;
                    i3 = 0;
                    i4 = 0;
                }
                if (!recyclerView.mItemDecorations.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr5 = recyclerView.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView.dispatchNestedScroll(i4, i3, i, i2, null, 1, iArr5);
                int[] iArr6 = recyclerView.mReusableIntPair;
                int i10 = i - iArr6[0];
                int i11 = i2 - iArr6[1];
                if (i4 != 0 || i3 != 0) {
                    recyclerView.dispatchOnScrolled(i4, i3);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z = true;
                } else {
                    z = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!overScroller.isFinished() && ((!z && i10 == 0) || (!z2 && i11 == 0))) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                a0 a0Var2 = recyclerView.mLayout.mSmoothScroller;
                if (a0Var2 != null && a0Var2.isPendingInitialRun()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4 && z3) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i10 < 0) {
                            i5 = -currVelocity;
                        } else if (i10 > 0) {
                            i5 = currVelocity;
                        } else {
                            i5 = 0;
                        }
                        if (i11 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i11 <= 0) {
                            currVelocity = 0;
                        }
                        recyclerView.absorbGlows(i5, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        p.b bVar = recyclerView.mPrefetchRegistry;
                        int[] iArr7 = bVar.c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.d = 0;
                    }
                } else {
                    b();
                    androidx.recyclerview.widget.p pVar = recyclerView.mGapWorker;
                    if (pVar != null) {
                        pVar.a(recyclerView, i4, i3);
                    }
                }
            }
            a0 a0Var3 = recyclerView.mLayout.mSmoothScroller;
            if (a0Var3 != null && a0Var3.isPendingInitialRun()) {
                a0Var3.onAnimation(0, 0);
            }
            this.f = false;
            if (this.g) {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
                g0.d.m(recyclerView, this);
                return;
            }
            recyclerView.setScrollState(0);
            recyclerView.stopNestedScroll(1);
        }
    }

    /* loaded from: classes.dex */
    public class f implements a.InterfaceC0054a {
        public f() {
        }

        public final void a(a.b bVar) {
            int i = bVar.a;
            RecyclerView recyclerView = RecyclerView.this;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i == 8) {
                            recyclerView.mLayout.onItemsMoved(recyclerView, bVar.b, bVar.d, 1);
                            return;
                        }
                        return;
                    }
                    recyclerView.mLayout.onItemsUpdated(recyclerView, bVar.b, bVar.d, bVar.c);
                    return;
                }
                recyclerView.mLayout.onItemsRemoved(recyclerView, bVar.b, bVar.d);
                return;
            }
            recyclerView.mLayout.onItemsAdded(recyclerView, bVar.b, bVar.d);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        h<? extends f0> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        f0 mShadowedHolder = null;
        f0 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        w mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public f0(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(FLAG_ADAPTER_FULLUPDATE);
            } else if ((FLAG_ADAPTER_FULLUPDATE & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
                if (g0.d.i(view)) {
                    return true;
                }
            }
            return false;
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final h<? extends f0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            h adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            if (i == -1) {
                return this.mPosition;
            }
            return i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            if (i == -1) {
                return this.mPosition;
            }
            return i;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) == 0) {
                List<Object> list = this.mPayloads;
                if (list != null && list.size() != 0) {
                    return this.mUnmodifiedPayloads;
                }
                return FULLUPDATE_PAYLOADS;
            }
            return FULLUPDATE_PAYLOADS;
        }

        public boolean hasAnyOfTheFlags(int i) {
            if ((i & this.mFlags) != 0) {
                return true;
            }
            return false;
        }

        public boolean isAdapterPositionUnknown() {
            if ((this.mFlags & 512) == 0 && !isInvalid()) {
                return false;
            }
            return true;
        }

        public boolean isAttachedToTransitionOverlay() {
            if (this.itemView.getParent() != null && this.itemView.getParent() != this.mOwnerRecyclerView) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isBound() {
            if ((this.mFlags & 1) != 0) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isInvalid() {
            if ((this.mFlags & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
                if (!g0.d.i(view)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isRemoved() {
            if ((this.mFlags & 8) != 0) {
                return true;
            }
            return false;
        }

        public boolean isScrap() {
            if (this.mScrapContainer != null) {
                return true;
            }
            return false;
        }

        public boolean isTmpDetached() {
            if ((this.mFlags & FLAG_TMP_DETACHED) != 0) {
                return true;
            }
            return false;
        }

        public boolean isUpdated() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        public boolean needsUpdate() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((q) this.itemView.getLayoutParams()).c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                View view = this.itemView;
                WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
                this.mWasImportantForAccessibilityBeforeHidden = g0.d.c(view);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i;
            int i2 = this.mIsRecyclableCount;
            if (z) {
                i = i2 - 1;
            } else {
                i = i2 + 1;
            }
            this.mIsRecyclableCount = i;
            if (i < 0) {
                this.mIsRecyclableCount = 0;
                toString();
            } else if (!z && i == 1) {
                this.mFlags |= 16;
            } else if (z && i == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(w wVar, boolean z) {
            this.mScrapContainer = wVar;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            if ((this.mFlags & 16) != 0) {
                return true;
            }
            return false;
        }

        public boolean shouldIgnore() {
            if ((this.mFlags & 128) != 0) {
                return true;
            }
            return false;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String simpleName;
            String str;
            if (getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            } else {
                simpleName = getClass().getSimpleName();
            }
            StringBuilder b = com.amazon.aps.iva.b6.x.b(simpleName, "{");
            b.append(Integer.toHexString(hashCode()));
            b.append(" position=");
            b.append(this.mPosition);
            b.append(" id=");
            b.append(this.mItemId);
            b.append(", oldPos=");
            b.append(this.mOldPosition);
            b.append(", pLpos:");
            b.append(this.mPreLayoutPosition);
            StringBuilder sb = new StringBuilder(b.toString());
            if (isScrap()) {
                sb.append(" scrap ");
                if (this.mInChangeScrap) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb.append(str);
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.n(this);
        }

        public boolean wasReturnedFromScrap() {
            if ((this.mFlags & 32) != 0) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class g {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h.a.values().length];
            a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class i extends Observable<j> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public final void c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i, i2, 1);
            }
        }

        public final void d(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i, i2, obj);
            }
        }

        public final void e(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i, i2);
            }
        }

        public final void f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i, i2);
            }
        }

        public final void g() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class j {
        public void onItemRangeChanged(int i, int i2) {
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            onItemRangeChanged(i, i2);
        }

        public void onChanged() {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeInserted(int i, int i2) {
        }

        public void onItemRangeRemoved(int i, int i2) {
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
        }
    }

    /* loaded from: classes.dex */
    public interface k {
    }

    /* loaded from: classes.dex */
    public static class l {
    }

    /* loaded from: classes.dex */
    public static abstract class m {
        public b a = null;
        public final ArrayList<a> b = new ArrayList<>();
        public final long c = 120;
        public final long d = 120;
        public final long e = 250;
        public long f = 250;

        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        /* loaded from: classes.dex */
        public interface b {
        }

        /* loaded from: classes.dex */
        public static class c {
            public int a;
            public int b;

            public final void a(f0 f0Var) {
                View view = f0Var.itemView;
                this.a = view.getLeft();
                this.b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void b(f0 f0Var) {
            int i = f0Var.mFlags & 14;
            if (!f0Var.isInvalid() && (i & 4) == 0) {
                f0Var.getOldPosition();
                f0Var.getAbsoluteAdapterPosition();
            }
        }

        public abstract boolean a(f0 f0Var, f0 f0Var2, c cVar, c cVar2);

        public boolean c(f0 f0Var, List<Object> list) {
            if (((androidx.recyclerview.widget.e0) this).g && !f0Var.isInvalid()) {
                return false;
            }
            return true;
        }

        public final void d(f0 f0Var) {
            b bVar = this.a;
            if (bVar != null) {
                n nVar = (n) bVar;
                nVar.getClass();
                f0Var.setIsRecyclable(true);
                if (f0Var.mShadowedHolder != null && f0Var.mShadowingHolder == null) {
                    f0Var.mShadowedHolder = null;
                }
                f0Var.mShadowingHolder = null;
                if (!f0Var.shouldBeKeptAsChild()) {
                    View view = f0Var.itemView;
                    RecyclerView recyclerView = RecyclerView.this;
                    if (!recyclerView.removeAnimatingView(view) && f0Var.isTmpDetached()) {
                        recyclerView.removeDetachedView(f0Var.itemView, false);
                    }
                }
            }
        }

        public abstract void e(f0 f0Var);

        public abstract void f();

        public abstract boolean g();

        public abstract void h();
    }

    /* loaded from: classes.dex */
    public class n implements m.b {
        public n() {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o {
        @Deprecated
        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, b0 b0Var) {
            getItemOffsets(rect, ((q) view.getLayoutParams()).b(), recyclerView);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            onDrawOver(canvas, recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class p {
        boolean mAutoMeasure;
        androidx.recyclerview.widget.e mChildHelper;
        private int mHeight;
        private int mHeightMode;
        h0 mHorizontalBoundCheck;
        private final h0.b mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        a0 mSmoothScroller;
        h0 mVerticalBoundCheck;
        private final h0.b mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        /* loaded from: classes.dex */
        public class a implements h0.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.h0.b
            public final int a(View view) {
                return p.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.h0.b
            public final int b() {
                return p.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.h0.b
            public final int c() {
                p pVar = p.this;
                return pVar.getWidth() - pVar.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.h0.b
            public final View d(int i) {
                return p.this.getChildAt(i);
            }

            @Override // androidx.recyclerview.widget.h0.b
            public final int e(View view) {
                return p.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: classes.dex */
        public class b implements h0.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.h0.b
            public final int a(View view) {
                return p.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.h0.b
            public final int b() {
                return p.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.h0.b
            public final int c() {
                p pVar = p.this;
                return pVar.getHeight() - pVar.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.h0.b
            public final View d(int i) {
                return p.this.getChildAt(i);
            }

            @Override // androidx.recyclerview.widget.h0.b
            public final int e(View view) {
                return p.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
        }

        /* loaded from: classes.dex */
        public static class d {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public p() {
            a aVar = new a();
            this.mHorizontalBoundCheckCallback = aVar;
            b bVar = new b();
            this.mVerticalBoundCheckCallback = bVar;
            this.mHorizontalBoundCheck = new h0(aVar);
            this.mVerticalBoundCheck = new h0(bVar);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        private void addViewInt(View view, int i, boolean z) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!z && !childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
            } else {
                com.amazon.aps.iva.x.h<f0, i0.a> hVar = this.mRecyclerView.mViewInfoStore.a;
                i0.a orDefault = hVar.getOrDefault(childViewHolderInt, null);
                if (orDefault == null) {
                    orDefault = i0.a.a();
                    hVar.put(childViewHolderInt, orDefault);
                }
                orDefault.a |= 1;
            }
            q qVar = (q) view.getLayoutParams();
            if (!childViewHolderInt.wasReturnedFromScrap() && !childViewHolderInt.isScrap()) {
                if (view.getParent() == this.mRecyclerView) {
                    int j = this.mChildHelper.j(view);
                    if (i == -1) {
                        i = this.mChildHelper.e();
                    }
                    if (j != -1) {
                        if (j != i) {
                            this.mRecyclerView.mLayout.moveView(j, i);
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        sb.append(this.mRecyclerView.indexOfChild(view));
                        throw new IllegalStateException(t1.a(this.mRecyclerView, sb));
                    }
                } else {
                    this.mChildHelper.a(view, i, false);
                    qVar.c = true;
                    a0 a0Var = this.mSmoothScroller;
                    if (a0Var != null && a0Var.isRunning()) {
                        this.mSmoothScroller.onChildAttachedToWindow(view);
                    }
                }
            } else {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.b(view, i, view.getLayoutParams(), false);
            }
            if (qVar.d) {
                childViewHolderInt.itemView.invalidate();
                qVar.d = false;
            }
        }

        public static int chooseSize(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    return Math.max(i2, i3);
                }
                return size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        private void detachViewInternal(int i, View view) {
            this.mChildHelper.c(i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
            if (r3 >= 0) goto L8;
         */
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto Lf
                if (r3 < 0) goto Ld
                goto L11
            Ld:
                r3 = r2
                goto L1e
            Lf:
                if (r3 < 0) goto L13
            L11:
                r2 = r0
                goto L1e
            L13:
                r4 = -1
                if (r3 != r4) goto L18
                r3 = r1
                goto L11
            L18:
                r4 = -2
                if (r3 != r4) goto Ld
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1
            L1e:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.getChildMeasureSpec(int, int, int, boolean):int");
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width2 = rect.width() + left;
            int height2 = rect.height() + top;
            int i = left - paddingLeft;
            int min = Math.min(0, i);
            int i2 = top - paddingTop;
            int min2 = Math.min(0, i2);
            int i3 = width2 - width;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height2 - height);
            if (getLayoutDirection() == 1) {
                if (max == 0) {
                    max = Math.max(min, i3);
                }
            } else {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public static d getProperties(Context context, AttributeSet attributeSet, int i, int i2) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.n8.a.a, i, i2);
            dVar.a = obtainStyledAttributes.getInt(0, 1);
            dVar.b = obtainStyledAttributes.getInt(10, 1);
            dVar.c = obtainStyledAttributes.getBoolean(9, false);
            dVar.d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            if (rect.left - i >= width || rect.right - i <= paddingLeft || rect.top - i2 >= height || rect.bottom - i2 <= paddingTop) {
                return false;
            }
            return true;
        }

        private static boolean isMeasurementUpToDate(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode != 1073741824 || size != i) {
                    return false;
                }
                return true;
            } else if (size < i) {
                return false;
            } else {
                return true;
            }
        }

        private void scrapOrRecycleView(w wVar, int i, View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i);
                wVar.k(childViewHolderInt);
                return;
            }
            detachViewAt(i);
            wVar.l(view);
            this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(View view, int i, q qVar) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                com.amazon.aps.iva.x.h<f0, i0.a> hVar = this.mRecyclerView.mViewInfoStore.a;
                i0.a orDefault = hVar.getOrDefault(childViewHolderInt, null);
                if (orDefault == null) {
                    orDefault = i0.a.a();
                    hVar.put(childViewHolderInt, orDefault);
                }
                orDefault.a |= 1;
            } else {
                this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
            }
            this.mChildHelper.b(view, i, qVar, childViewHolderInt.isRemoved());
        }

        public void calculateItemDecorationsForChild(View view, Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(q qVar) {
            if (qVar != null) {
                return true;
            }
            return false;
        }

        public int computeHorizontalScrollExtent(b0 b0Var) {
            return 0;
        }

        public int computeHorizontalScrollOffset(b0 b0Var) {
            return 0;
        }

        public int computeHorizontalScrollRange(b0 b0Var) {
            return 0;
        }

        public int computeVerticalScrollExtent(b0 b0Var) {
            return 0;
        }

        public int computeVerticalScrollOffset(b0 b0Var) {
            return 0;
        }

        public int computeVerticalScrollRange(b0 b0Var) {
            return 0;
        }

        public void detachAndScrapAttachedViews(w wVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(wVar, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(View view, w wVar) {
            scrapOrRecycleView(wVar, this.mChildHelper.j(view), view);
        }

        public void detachAndScrapViewAt(int i, w wVar) {
            scrapOrRecycleView(wVar, i, getChildAt(i));
        }

        public void detachView(View view) {
            int j = this.mChildHelper.j(view);
            if (j >= 0) {
                detachViewInternal(j, view);
            }
        }

        public void detachViewAt(int i) {
            detachViewInternal(i, getChildAt(i));
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, w wVar) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, wVar);
        }

        @SuppressLint({"UnknownNullness"})
        public void endAnimation(View view) {
            m mVar = this.mRecyclerView.mItemAnimator;
            if (mVar != null) {
                mVar.e(RecyclerView.getChildViewHolderInt(view));
            }
        }

        public View findContainingItemView(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.k(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        public View findViewByPosition(int i) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.g || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public abstract q generateDefaultLayoutParams();

        @SuppressLint({"UnknownNullness"})
        public q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof q) {
                return new q((q) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new q((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new q(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(View view) {
            return ((q) view.getLayoutParams()).b.bottom;
        }

        public View getChildAt(int i) {
            androidx.recyclerview.widget.e eVar = this.mChildHelper;
            if (eVar != null) {
                return eVar.d(i);
            }
            return null;
        }

        public int getChildCount() {
            androidx.recyclerview.widget.e eVar = this.mChildHelper;
            if (eVar != null) {
                return eVar.e();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null && recyclerView.mClipToPadding) {
                return true;
            }
            return false;
        }

        public int getColumnCountForAccessibility(w wVar, b0 b0Var) {
            return -1;
        }

        public int getDecoratedBottom(View view) {
            return getBottomDecorationHeight(view) + view.getBottom();
        }

        public void getDecoratedBoundsWithMargins(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(View view) {
            Rect rect = ((q) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(View view) {
            Rect rect = ((q) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(View view) {
            return getRightDecorationWidth(view) + view.getRight();
        }

        public int getDecoratedTop(View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.k(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            h hVar;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                hVar = recyclerView.getAdapter();
            } else {
                hVar = null;
            }
            if (hVar != null) {
                return hVar.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
            return g0.e.d(recyclerView);
        }

        public int getLeftDecorationWidth(View view) {
            return ((q) view.getLayoutParams()).b.left;
        }

        public int getMinimumHeight() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
            return g0.d.d(recyclerView);
        }

        public int getMinimumWidth() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
            return g0.d.e(recyclerView);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
                return g0.e.e(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
                return g0.e.f(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(View view) {
            return ((q) view.getLayoutParams()).b();
        }

        public int getRightDecorationWidth(View view) {
            return ((q) view.getLayoutParams()).b.right;
        }

        public int getRowCountForAccessibility(w wVar, b0 b0Var) {
            return -1;
        }

        public int getSelectionModeForAccessibility(w wVar, b0 b0Var) {
            return 0;
        }

        public int getTopDecorationHeight(View view) {
            return ((q) view.getLayoutParams()).b.top;
        }

        public void getTransformedBoundingBox(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((q) view.getLayoutParams()).b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null && recyclerView.hasFocus()) {
                return true;
            }
            return false;
        }

        public void ignoreView(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
                f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                childViewHolderInt.addFlags(128);
                this.mRecyclerView.mViewInfoStore.d(childViewHolderInt);
                return;
            }
            throw new IllegalArgumentException(t1.a(this.mRecyclerView, new StringBuilder("View should be fully attached to be ignored")));
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null && recyclerView.isFocused()) {
                return true;
            }
            return false;
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(w wVar, b0 b0Var) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            a0 a0Var = this.mSmoothScroller;
            if (a0Var != null && a0Var.isRunning()) {
                return true;
            }
            return false;
        }

        public boolean isViewPartiallyVisible(View view, boolean z, boolean z2) {
            boolean z3;
            if (this.mHorizontalBoundCheck.b(view) && this.mVerticalBoundCheck.b(view)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z) {
                return z3;
            }
            return !z3;
        }

        public void layoutDecorated(View view, int i, int i2, int i3, int i4) {
            Rect rect = ((q) view.getLayoutParams()).b;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        public void measureChild(View view, int i, int i2) {
            q qVar = (q) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
            int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i3, ((ViewGroup.MarginLayoutParams) qVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i4, ((ViewGroup.MarginLayoutParams) qVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, qVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(View view, int i, int i2) {
            q qVar = (q) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
            int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i3, ((ViewGroup.MarginLayoutParams) qVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) qVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, qVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                detachViewAt(i);
                attachView(childAt, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.mRecyclerView.toString());
        }

        public void offsetChildrenHorizontal(int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        public void offsetChildrenVertical(int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public View onFocusSearchFailed(View view, int i, w wVar, b0 b0Var) {
            return null;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(com.amazon.aps.iva.q3.l lVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, lVar);
        }

        public void onInitializeAccessibilityNodeInfoForItem(w wVar, b0 b0Var, View view, com.amazon.aps.iva.q3.l lVar) {
        }

        public View onInterceptFocusSearch(View view, int i) {
            return null;
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        }

        public void onMeasure(w wVar, b0 b0Var, int i, int i2) {
            this.mRecyclerView.defaultOnMeasure(i, i2);
        }

        @Deprecated
        public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onSmoothScrollerStopped(a0 a0Var) {
            if (this.mSmoothScroller == a0Var) {
                this.mSmoothScroller = null;
            }
        }

        public boolean performAccessibilityAction(int i, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        public boolean performAccessibilityActionForItem(w wVar, b0 b0Var, View view, int i, Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
                g0.d.m(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.l(childCount);
            }
        }

        public void removeAndRecycleAllViews(w wVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, wVar);
                }
            }
        }

        public void removeAndRecycleScrapInt(w wVar) {
            ArrayList<f0> arrayList;
            int size = wVar.a.size();
            int i = size - 1;
            while (true) {
                arrayList = wVar.a;
                if (i < 0) {
                    break;
                }
                View view = arrayList.get(i).itemView;
                f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(view, false);
                    }
                    m mVar = this.mRecyclerView.mItemAnimator;
                    if (mVar != null) {
                        mVar.e(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    f0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.mScrapContainer = null;
                    childViewHolderInt2.mInChangeScrap = false;
                    childViewHolderInt2.clearReturnedFromScrapFlag();
                    wVar.k(childViewHolderInt2);
                }
                i--;
            }
            arrayList.clear();
            ArrayList<f0> arrayList2 = wVar.b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(View view, w wVar) {
            removeView(view);
            wVar.j(view);
        }

        public void removeAndRecycleViewAt(int i, w wVar) {
            View childAt = getChildAt(i);
            removeViewAt(i);
            wVar.j(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        @SuppressLint({"UnknownNullness"})
        public void removeView(View view) {
            androidx.recyclerview.widget.e eVar = this.mChildHelper;
            e eVar2 = (e) eVar.a;
            int indexOfChild = RecyclerView.this.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (eVar.b.f(indexOfChild)) {
                    eVar.m(view);
                }
                eVar2.b(indexOfChild);
            }
        }

        public void removeViewAt(int i) {
            if (getChildAt(i) != null) {
                this.mChildHelper.l(i);
            }
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollHorizontallyBy(int i, w wVar, b0 b0Var) {
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollVerticallyBy(int i, w wVar, b0 b0Var) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z) {
            this.mAutoMeasure = z;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), Ints.MAX_POWER_OF_TWO));
        }

        public final void setItemPrefetchEnabled(boolean z) {
            if (z != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.o();
                }
            }
        }

        public void setMeasureSpecs(int i, int i2) {
            this.mWidth = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mHeightMode = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mHeight = 0;
            }
        }

        public void setMeasuredDimension(Rect rect, int i, int i2) {
            setMeasuredDimension(chooseSize(i, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i2, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
        }

        public void setMeasuredDimensionFromChildren(int i, int i2) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.mRecyclerView.mTempRect.set(i6, i4, i3, i5);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i, i2);
        }

        public void setMeasurementCacheEnabled(boolean z) {
            this.mMeasurementCacheEnabled = z;
        }

        public void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = Ints.MAX_POWER_OF_TWO;
            this.mHeightMode = Ints.MAX_POWER_OF_TWO;
        }

        public boolean shouldMeasureChild(View view, int i, int i2, q qVar) {
            if (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) qVar).width) && isMeasurementUpToDate(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) qVar).height)) {
                return false;
            }
            return true;
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean shouldReMeasureChild(View view, int i, int i2, q qVar) {
            if (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) qVar).width) && isMeasurementUpToDate(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) qVar).height)) {
                return false;
            }
            return true;
        }

        @SuppressLint({"UnknownNullness"})
        public void startSmoothScroll(a0 a0Var) {
            a0 a0Var2 = this.mSmoothScroller;
            if (a0Var2 != null && a0Var != a0Var2 && a0Var2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = a0Var;
            a0Var.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        public void stopSmoothScroller() {
            a0 a0Var = this.mSmoothScroller;
            if (a0Var != null) {
                a0Var.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view, int i) {
            addViewInt(view, i, true);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view, int i) {
            addViewInt(view, i, false);
        }

        @SuppressLint({"UnknownNullness"})
        public void onDetachedFromWindow(RecyclerView recyclerView, w wVar) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityEvent(w wVar, b0 b0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            h hVar = this.mRecyclerView.mAdapter;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(w wVar, b0 b0Var, com.amazon.aps.iva.q3.l lVar) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                lVar.a(8192);
                lVar.l(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                lVar.a(4096);
                lVar.l(true);
            }
            lVar.i(l.f.a(getRowCountForAccessibility(wVar, b0Var), getColumnCountForAccessibility(wVar, b0Var), getSelectionModeForAccessibility(wVar, b0Var), isLayoutHierarchical(wVar, b0Var)));
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, com.amazon.aps.iva.q3.l lVar) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.k(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, lVar);
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
            onItemsUpdated(recyclerView, i, i2);
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, b0 b0Var, View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public boolean performAccessibilityAction(w wVar, b0 b0Var, int i, Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            int i2;
            int i3;
            if (this.mRecyclerView == null) {
                return false;
            }
            int height = getHeight();
            int width = getWidth();
            Rect rect = new Rect();
            if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
                height = rect.height();
                width = rect.width();
            }
            if (i == 4096) {
                paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                    i2 = paddingTop;
                    i3 = paddingLeft;
                }
                i2 = paddingTop;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                    i2 = paddingTop;
                    i3 = paddingLeft;
                }
                i2 = paddingTop;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean performAccessibilityActionForItem(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i = childRectangleOnScreenScrollAmount[0];
            int i2 = childRectangleOnScreenScrollAmount[1];
            if ((!z2 || isFocusedChildVisibleAfterScrolling(recyclerView, i, i2)) && !(i == 0 && i2 == 0)) {
                if (z) {
                    recyclerView.scrollBy(i, i2);
                } else {
                    recyclerView.smoothScrollBy(i, i2);
                }
                return true;
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r5 == 1073741824) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L20
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L20
                goto L2f
            L1a:
                if (r7 < 0) goto L1e
            L1c:
                r5 = r3
                goto L31
            L1e:
                if (r7 != r1) goto L22
            L20:
                r7 = r4
                goto L31
            L22:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L29
                goto L2c
            L29:
                r7 = r4
                r5 = r6
                goto L31
            L2c:
                r7 = r4
                r5 = r2
                goto L31
            L2f:
                r5 = r6
                r7 = r5
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.getChildMeasureSpec(int, int, int, int, boolean):int");
        }

        @SuppressLint({"UnknownNullness"})
        public q generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public void setMeasuredDimension(int i, int i2) {
            this.mRecyclerView.setMeasuredDimension(i, i2);
        }

        public void attachView(View view, int i) {
            attachView(view, i, (q) view.getLayoutParams());
        }

        public void attachView(View view) {
            attachView(view, -1);
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutCompleted(b0 b0Var) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public void onScrollStateChanged(int i) {
        }

        public void scrollToPosition(int i) {
        }

        @SuppressLint({"UnknownNullness"})
        public void collectInitialPrefetchPositions(int i, c cVar) {
        }

        public void onAdapterChanged(h hVar, h hVar2) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutChildren(w wVar, b0 b0Var) {
        }

        public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        }

        @SuppressLint({"UnknownNullness"})
        public void smoothScrollToPosition(RecyclerView recyclerView, b0 b0Var, int i) {
        }

        @SuppressLint({"UnknownNullness"})
        public void collectAdjacentPrefetchPositions(int i, int i2, b0 b0Var, c cVar) {
        }

        public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes.dex */
    public interface r {
        void a(View view);

        void b(View view);
    }

    /* loaded from: classes.dex */
    public static abstract class s {
        public abstract boolean onFling(int i, int i2);
    }

    /* loaded from: classes.dex */
    public interface t {
        void c(boolean z);

        void d(MotionEvent motionEvent);

        boolean e(MotionEvent motionEvent);
    }

    /* loaded from: classes.dex */
    public static class v {
        public final SparseArray<a> a = new SparseArray<>();
        public int b = 0;
        public final Set<h<?>> c = Collections.newSetFromMap(new IdentityHashMap());

        /* loaded from: classes.dex */
        public static class a {
            public final ArrayList<f0> a = new ArrayList<>();
            public int b = 5;
            public long c = 0;
            public long d = 0;
        }

        public final void a() {
            int i = 0;
            while (true) {
                SparseArray<a> sparseArray = this.a;
                if (i < sparseArray.size()) {
                    a valueAt = sparseArray.valueAt(i);
                    Iterator<f0> it = valueAt.a.iterator();
                    while (it.hasNext()) {
                        com.amazon.aps.iva.dg.b.j(it.next().itemView);
                    }
                    valueAt.a.clear();
                    i++;
                } else {
                    return;
                }
            }
        }

        public final a b(int i) {
            SparseArray<a> sparseArray = this.a;
            a aVar = sparseArray.get(i);
            if (aVar == null) {
                a aVar2 = new a();
                sparseArray.put(i, aVar2);
                return aVar2;
            }
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public final class w {
        public final ArrayList<f0> a;
        public ArrayList<f0> b;
        public final ArrayList<f0> c;
        public final List<f0> d;
        public int e;
        public int f;
        public v g;

        public w() {
            ArrayList<f0> arrayList = new ArrayList<>();
            this.a = arrayList;
            this.b = null;
            this.c = new ArrayList<>();
            this.d = Collections.unmodifiableList(arrayList);
            this.e = 2;
            this.f = 2;
        }

        public static void e(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    e((ViewGroup) childAt, true);
                }
            }
            if (!z) {
                return;
            }
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
                return;
            }
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }

        public final void a(f0 f0Var, boolean z) {
            com.amazon.aps.iva.p3.a aVar;
            RecyclerView.clearNestedRecyclerViewIfNotNested(f0Var);
            View view = f0Var.itemView;
            RecyclerView recyclerView = RecyclerView.this;
            androidx.recyclerview.widget.c0 c0Var = recyclerView.mAccessibilityDelegate;
            if (c0Var != null) {
                com.amazon.aps.iva.p3.a itemDelegate = c0Var.getItemDelegate();
                if (itemDelegate instanceof c0.a) {
                    aVar = (com.amazon.aps.iva.p3.a) ((c0.a) itemDelegate).b.remove(view);
                } else {
                    aVar = null;
                }
                com.amazon.aps.iva.p3.g0.n(view, aVar);
            }
            if (z) {
                x xVar = recyclerView.mRecyclerListener;
                if (xVar != null) {
                    xVar.a(f0Var);
                }
                int size = recyclerView.mRecyclerListeners.size();
                for (int i = 0; i < size; i++) {
                    recyclerView.mRecyclerListeners.get(i).a(f0Var);
                }
                h hVar = recyclerView.mAdapter;
                if (hVar != null) {
                    hVar.onViewRecycled(f0Var);
                }
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.d(f0Var);
                }
            }
            f0Var.mBindingAdapter = null;
            f0Var.mOwnerRecyclerView = null;
            v c = c();
            c.getClass();
            int itemViewType = f0Var.getItemViewType();
            ArrayList<f0> arrayList = c.b(itemViewType).a;
            if (c.a.get(itemViewType).b <= arrayList.size()) {
                com.amazon.aps.iva.dg.b.j(f0Var.itemView);
                return;
            }
            f0Var.resetInternal();
            arrayList.add(f0Var);
        }

        public final int b(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i >= 0 && i < recyclerView.mState.b()) {
                if (!recyclerView.mState.g) {
                    return i;
                }
                return recyclerView.mAdapterHelper.f(i, 0);
            }
            StringBuilder d = com.amazon.aps.iva.e4.e.d("invalid position ", i, ". State item count is ");
            d.append(recyclerView.mState.b());
            d.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(d.toString());
        }

        public final v c() {
            if (this.g == null) {
                this.g = new v();
                f();
            }
            return this.g;
        }

        public final View d(int i) {
            return m(i, RecyclerView.FOREVER_NS).itemView;
        }

        public final void f() {
            if (this.g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mAdapter != null && recyclerView.isAttachedToWindow()) {
                    v vVar = this.g;
                    vVar.c.add(recyclerView.mAdapter);
                }
            }
        }

        public final void g(h<?> hVar, boolean z) {
            v vVar = this.g;
            if (vVar != null) {
                Set<h<?>> set = vVar.c;
                set.remove(hVar);
                if (set.size() == 0 && !z) {
                    int i = 0;
                    while (true) {
                        SparseArray<v.a> sparseArray = vVar.a;
                        if (i < sparseArray.size()) {
                            ArrayList<f0> arrayList = sparseArray.get(sparseArray.keyAt(i)).a;
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                com.amazon.aps.iva.dg.b.j(arrayList.get(i2).itemView);
                            }
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        public final void h() {
            ArrayList<f0> arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                i(size);
            }
            arrayList.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                p.b bVar = RecyclerView.this.mPrefetchRegistry;
                int[] iArr = bVar.c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.d = 0;
            }
        }

        public final void i(int i) {
            ArrayList<f0> arrayList = this.c;
            a(arrayList.get(i), true);
            arrayList.remove(i);
        }

        public final void j(View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean isTmpDetached = childViewHolderInt.isTmpDetached();
            RecyclerView recyclerView = RecyclerView.this;
            if (isTmpDetached) {
                recyclerView.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            k(childViewHolderInt);
            if (recyclerView.mItemAnimator != null && !childViewHolderInt.isRecyclable()) {
                recyclerView.mItemAnimator.e(childViewHolderInt);
            }
        }

        public final void k(f0 f0Var) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean isScrap = f0Var.isScrap();
            boolean z6 = false;
            RecyclerView recyclerView = RecyclerView.this;
            if (!isScrap && f0Var.itemView.getParent() == null) {
                if (!f0Var.isTmpDetached()) {
                    if (!f0Var.shouldIgnore()) {
                        boolean doesTransientStatePreventRecycling = f0Var.doesTransientStatePreventRecycling();
                        h hVar = recyclerView.mAdapter;
                        if (hVar != null && doesTransientStatePreventRecycling && hVar.onFailedToRecycleView(f0Var)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z && !f0Var.isRecyclable()) {
                            z3 = false;
                        } else {
                            if (this.f > 0 && !f0Var.hasAnyOfTheFlags(526)) {
                                ArrayList<f0> arrayList = this.c;
                                int size = arrayList.size();
                                if (size >= this.f && size > 0) {
                                    i(0);
                                    size--;
                                }
                                if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0) {
                                    p.b bVar = recyclerView.mPrefetchRegistry;
                                    int i = f0Var.mPosition;
                                    if (bVar.c != null) {
                                        int i2 = bVar.d * 2;
                                        for (int i3 = 0; i3 < i2; i3 += 2) {
                                            if (bVar.c[i3] == i) {
                                                z4 = true;
                                                break;
                                            }
                                        }
                                    }
                                    z4 = false;
                                    if (!z4) {
                                        do {
                                            size--;
                                            if (size < 0) {
                                                break;
                                            }
                                            int i4 = arrayList.get(size).mPosition;
                                            p.b bVar2 = recyclerView.mPrefetchRegistry;
                                            if (bVar2.c != null) {
                                                int i5 = bVar2.d * 2;
                                                for (int i6 = 0; i6 < i5; i6 += 2) {
                                                    if (bVar2.c[i6] == i4) {
                                                        z5 = true;
                                                        continue;
                                                        break;
                                                    }
                                                }
                                            }
                                            z5 = false;
                                            continue;
                                        } while (z5);
                                        size++;
                                    }
                                }
                                arrayList.add(size, f0Var);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                a(f0Var, true);
                                z6 = true;
                            }
                            z3 = z6;
                            z6 = z2;
                        }
                        recyclerView.mViewInfoStore.d(f0Var);
                        if (!z6 && !z3 && doesTransientStatePreventRecycling) {
                            com.amazon.aps.iva.dg.b.j(f0Var.itemView);
                            f0Var.mBindingAdapter = null;
                            f0Var.mOwnerRecyclerView = null;
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException(t1.a(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
                }
                StringBuilder sb = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb.append(f0Var);
                throw new IllegalArgumentException(t1.a(recyclerView, sb));
            }
            StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(f0Var.isScrap());
            sb2.append(" isAttached:");
            if (f0Var.itemView.getParent() != null) {
                z6 = true;
            }
            sb2.append(z6);
            sb2.append(recyclerView.exceptionLabel());
            throw new IllegalArgumentException(sb2.toString());
        }

        public final void l(View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean hasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
            RecyclerView recyclerView = RecyclerView.this;
            if (!hasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.b == null) {
                    this.b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.b.add(childViewHolderInt);
            } else if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException(t1.a(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            } else {
                childViewHolderInt.setScrapContainer(this, false);
                this.a.add(childViewHolderInt);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:233:0x0418, code lost:
            if (r8 == false) goto L222;
         */
        /* JADX WARN: Removed duplicated region for block: B:125:0x0217  */
        /* JADX WARN: Removed duplicated region for block: B:212:0x03ae  */
        /* JADX WARN: Removed duplicated region for block: B:226:0x0401  */
        /* JADX WARN: Removed duplicated region for block: B:238:0x043b  */
        /* JADX WARN: Removed duplicated region for block: B:241:0x044b  */
        /* JADX WARN: Removed duplicated region for block: B:262:0x0491  */
        /* JADX WARN: Removed duplicated region for block: B:265:0x0498  */
        /* JADX WARN: Removed duplicated region for block: B:269:0x04a3  */
        /* JADX WARN: Removed duplicated region for block: B:270:0x04af  */
        /* JADX WARN: Removed duplicated region for block: B:276:0x04c8 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.recyclerview.widget.RecyclerView.f0 m(int r20, long r21) {
            /*
                Method dump skipped, instructions count: 1266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.m(int, long):androidx.recyclerview.widget.RecyclerView$f0");
        }

        public final void n(f0 f0Var) {
            if (f0Var.mInChangeScrap) {
                this.b.remove(f0Var);
            } else {
                this.a.remove(f0Var);
            }
            f0Var.mScrapContainer = null;
            f0Var.mInChangeScrap = false;
            f0Var.clearReturnedFromScrapFlag();
        }

        public final void o() {
            int i;
            p pVar = RecyclerView.this.mLayout;
            if (pVar != null) {
                i = pVar.mPrefetchMaxCountObserved;
            } else {
                i = 0;
            }
            this.f = this.e + i;
            ArrayList<f0> arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
                i(size);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface x {
        void a(f0 f0Var);
    }

    /* loaded from: classes.dex */
    public class y extends j {
        public y() {
        }

        public final void a() {
            boolean z = RecyclerView.POST_UPDATES_ON_ANIMATION;
            RecyclerView recyclerView = RecyclerView.this;
            if (z && recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
                WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
                g0.d.m(recyclerView, runnable);
                return;
            }
            recyclerView.mAdapterUpdateDuringMeasure = true;
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onChanged() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            recyclerView.mState.f = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (!recyclerView.mAdapterHelper.g()) {
                recyclerView.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = recyclerView.mAdapterHelper;
            boolean z = false;
            if (i2 < 1) {
                aVar.getClass();
            } else {
                ArrayList<a.b> arrayList = aVar.b;
                arrayList.add(aVar.h(4, obj, i, i2));
                aVar.f |= 4;
                if (arrayList.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeInserted(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = recyclerView.mAdapterHelper;
            boolean z = false;
            if (i2 < 1) {
                aVar.getClass();
            } else {
                ArrayList<a.b> arrayList = aVar.b;
                arrayList.add(aVar.h(1, null, i, i2));
                aVar.f |= 1;
                if (arrayList.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeMoved(int i, int i2, int i3) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = recyclerView.mAdapterHelper;
            aVar.getClass();
            boolean z = false;
            if (i != i2) {
                if (i3 == 1) {
                    ArrayList<a.b> arrayList = aVar.b;
                    arrayList.add(aVar.h(8, null, i, i2));
                    aVar.f |= 8;
                    if (arrayList.size() == 1) {
                        z = true;
                    }
                } else {
                    throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
                }
            }
            if (z) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeRemoved(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = recyclerView.mAdapterHelper;
            boolean z = false;
            if (i2 < 1) {
                aVar.getClass();
            } else {
                ArrayList<a.b> arrayList = aVar.b;
                arrayList.add(aVar.h(2, null, i, i2));
                aVar.f |= 2;
                if (arrayList.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onStateRestorationPolicyChanged() {
            h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState != null && (hVar = recyclerView.mAdapter) != null && hVar.canRestoreState()) {
                recyclerView.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class z extends com.amazon.aps.iva.w3.a {
        public static final Parcelable.Creator<z> CREATOR = new a();
        public Parcelable b;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<z> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new z[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new z(parcel, null);
            }
        }

        public z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.b = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        @Override // com.amazon.aps.iva.w3.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.b, 0);
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new c();
        sDefaultEdgeEffectFactory = new c0();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(f0 f0Var) {
        boolean z2;
        View view = f0Var.itemView;
        if (view.getParent() == this) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mRecycler.n(getChildViewHolder(view));
        if (f0Var.isTmpDetached()) {
            this.mChildHelper.b(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            this.mChildHelper.a(view, -1, true);
        } else {
            androidx.recyclerview.widget.e eVar = this.mChildHelper;
            int indexOfChild = RecyclerView.this.indexOfChild(view);
            if (indexOfChild >= 0) {
                eVar.b.h(indexOfChild);
                eVar.i(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    private void animateChange(f0 f0Var, f0 f0Var2, m.c cVar, m.c cVar2, boolean z2, boolean z3) {
        f0Var.setIsRecyclable(false);
        if (z2) {
            addAnimatingView(f0Var);
        }
        if (f0Var != f0Var2) {
            if (z3) {
                addAnimatingView(f0Var2);
            }
            f0Var.mShadowedHolder = f0Var2;
            addAnimatingView(f0Var);
            this.mRecycler.n(f0Var);
            f0Var2.setIsRecyclable(false);
            f0Var2.mShadowingHolder = f0Var;
        }
        if (this.mItemAnimator.a(f0Var, f0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(f0 f0Var) {
        WeakReference<RecyclerView> weakReference = f0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == f0Var.itemView) {
                    return;
                }
                ViewParent parent = recyclerView.getParent();
                if (parent instanceof View) {
                    recyclerView = (View) parent;
                } else {
                    recyclerView = null;
                }
            }
            f0Var.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i2, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i3) {
        if (i2 > 0 && edgeEffect != null && com.amazon.aps.iva.t3.d.a(edgeEffect) != DECELERATION_RATE) {
            int round = Math.round(com.amazon.aps.iva.t3.d.b(edgeEffect, ((-i2) * FLING_DESTRETCH_FACTOR) / i3, 0.5f) * ((-i3) / FLING_DESTRETCH_FACTOR));
            if (round != i2) {
                edgeEffect.finish();
            }
            return i2 - round;
        } else if (i2 < 0 && edgeEffect2 != null && com.amazon.aps.iva.t3.d.a(edgeEffect2) != DECELERATION_RATE) {
            float f2 = i3;
            int round2 = Math.round(com.amazon.aps.iva.t3.d.b(edgeEffect2, (i2 * FLING_DESTRETCH_FACTOR) / f2, 0.5f) * (f2 / FLING_DESTRETCH_FACTOR));
            if (round2 != i2) {
                edgeEffect2.finish();
            }
            return i2 - round2;
        } else {
            return i2;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(p.class);
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                    } catch (NoSuchMethodException e2) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e3) {
                            e3.initCause(e2);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e3);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((p) constructor.newInstance(objArr));
                } catch (ClassCastException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e4);
                } catch (ClassNotFoundException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e6);
                } catch (InstantiationException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e7);
                } catch (InvocationTargetException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e8);
                }
            }
        }
    }

    private boolean didChildRangeChange(int i2, int i3) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        if (iArr[0] == i2 && iArr[1] == i3) {
            return false;
        }
        return true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i2 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i2 != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            com.amazon.aps.iva.q3.b.b(obtain, i2);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        boolean z2;
        boolean z3;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.i = false;
        startInterceptRequestLayout();
        i0 i0Var = this.mViewInfoStore;
        i0Var.a.clear();
        i0Var.b.a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        b0 b0Var = this.mState;
        if (b0Var.j && this.mItemsChanged) {
            z2 = true;
        } else {
            z2 = false;
        }
        b0Var.h = z2;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        b0Var.g = b0Var.k;
        b0Var.e = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.j) {
            int e2 = this.mChildHelper.e();
            for (int i2 = 0; i2 < e2; i2++) {
                f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    m mVar = this.mItemAnimator;
                    m.b(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    mVar.getClass();
                    m.c cVar = new m.c();
                    cVar.a(childViewHolderInt);
                    com.amazon.aps.iva.x.h<f0, i0.a> hVar = this.mViewInfoStore.a;
                    i0.a orDefault = hVar.getOrDefault(childViewHolderInt, null);
                    if (orDefault == null) {
                        orDefault = i0.a.a();
                        hVar.put(childViewHolderInt, orDefault);
                    }
                    orDefault.b = cVar;
                    orDefault.a |= 4;
                    if (this.mState.h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.b.f(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.k) {
            saveOldPositions();
            b0 b0Var2 = this.mState;
            boolean z4 = b0Var2.f;
            b0Var2.f = false;
            this.mLayout.onLayoutChildren(this.mRecycler, b0Var2);
            this.mState.f = z4;
            for (int i3 = 0; i3 < this.mChildHelper.e(); i3++) {
                f0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i3));
                if (!childViewHolderInt2.shouldIgnore()) {
                    i0.a orDefault2 = this.mViewInfoStore.a.getOrDefault(childViewHolderInt2, null);
                    if (orDefault2 != null && (orDefault2.a & 4) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        m.b(childViewHolderInt2);
                        boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                        m mVar2 = this.mItemAnimator;
                        childViewHolderInt2.getUnmodifiedPayloads();
                        mVar2.getClass();
                        m.c cVar2 = new m.c();
                        cVar2.a(childViewHolderInt2);
                        if (hasAnyOfTheFlags) {
                            recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, cVar2);
                        } else {
                            com.amazon.aps.iva.x.h<f0, i0.a> hVar2 = this.mViewInfoStore.a;
                            i0.a orDefault3 = hVar2.getOrDefault(childViewHolderInt2, null);
                            if (orDefault3 == null) {
                                orDefault3 = i0.a.a();
                                hVar2.put(childViewHolderInt2, orDefault3);
                            }
                            orDefault3.a |= 2;
                            orDefault3.b = cVar2;
                        }
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.d = 2;
    }

    private void dispatchLayoutStep2() {
        boolean z2;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.c();
        this.mState.e = this.mAdapter.getItemCount();
        this.mState.c = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.b;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        b0 b0Var = this.mState;
        b0Var.g = false;
        this.mLayout.onLayoutChildren(this.mRecycler, b0Var);
        b0 b0Var2 = this.mState;
        b0Var2.f = false;
        if (b0Var2.j && this.mItemAnimator != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        b0Var2.j = z2;
        b0Var2.d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        boolean k2;
        boolean z2;
        boolean z3;
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        b0 b0Var = this.mState;
        b0Var.d = 1;
        if (b0Var.j) {
            for (int e2 = this.mChildHelper.e() - 1; e2 >= 0; e2--) {
                f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(e2));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    this.mItemAnimator.getClass();
                    m.c cVar = new m.c();
                    cVar.a(childViewHolderInt);
                    f0 f0Var = (f0) this.mViewInfoStore.b.d(changedHolderKey, null);
                    if (f0Var != null && !f0Var.shouldIgnore()) {
                        i0.a orDefault = this.mViewInfoStore.a.getOrDefault(f0Var, null);
                        if (orDefault != null && (orDefault.a & 1) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        i0.a orDefault2 = this.mViewInfoStore.a.getOrDefault(childViewHolderInt, null);
                        if (orDefault2 != null && (orDefault2.a & 1) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2 && f0Var == childViewHolderInt) {
                            this.mViewInfoStore.a(childViewHolderInt, cVar);
                        } else {
                            m.c b2 = this.mViewInfoStore.b(f0Var, 4);
                            this.mViewInfoStore.a(childViewHolderInt, cVar);
                            m.c b3 = this.mViewInfoStore.b(childViewHolderInt, 8);
                            if (b2 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, f0Var);
                            } else {
                                animateChange(f0Var, childViewHolderInt, b2, b3, z2, z3);
                            }
                        }
                    } else {
                        this.mViewInfoStore.a(childViewHolderInt, cVar);
                    }
                }
            }
            i0 i0Var = this.mViewInfoStore;
            i0.b bVar = this.mViewInfoProcessCallback;
            com.amazon.aps.iva.x.h<f0, i0.a> hVar = i0Var.a;
            for (int i2 = hVar.d - 1; i2 >= 0; i2--) {
                f0 j2 = hVar.j(i2);
                i0.a l2 = hVar.l(i2);
                int i3 = l2.a;
                if ((i3 & 3) == 3) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.mLayout.removeAndRecycleView(j2.itemView, recyclerView.mRecycler);
                } else if ((i3 & 1) != 0) {
                    m.c cVar2 = l2.b;
                    if (cVar2 == null) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        recyclerView2.mLayout.removeAndRecycleView(j2.itemView, recyclerView2.mRecycler);
                    } else {
                        m.c cVar3 = l2.c;
                        RecyclerView recyclerView3 = RecyclerView.this;
                        recyclerView3.mRecycler.n(j2);
                        recyclerView3.animateDisappearance(j2, cVar2, cVar3);
                    }
                } else if ((i3 & 14) == 14) {
                    RecyclerView.this.animateAppearance(j2, l2.b, l2.c);
                } else if ((i3 & 12) == 12) {
                    m.c cVar4 = l2.b;
                    m.c cVar5 = l2.c;
                    d dVar = (d) bVar;
                    dVar.getClass();
                    j2.setIsRecyclable(false);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    if (recyclerView4.mDataSetHasChangedAfterLayout) {
                        if (recyclerView4.mItemAnimator.a(j2, j2, cVar4, cVar5)) {
                            recyclerView4.postAnimationRunner();
                        }
                    } else {
                        androidx.recyclerview.widget.e0 e0Var = (androidx.recyclerview.widget.e0) recyclerView4.mItemAnimator;
                        e0Var.getClass();
                        int i4 = cVar4.a;
                        int i5 = cVar5.a;
                        if (i4 == i5 && cVar4.b == cVar5.b) {
                            e0Var.d(j2);
                            k2 = false;
                        } else {
                            k2 = e0Var.k(j2, i4, cVar4.b, i5, cVar5.b);
                        }
                        if (k2) {
                            recyclerView4.postAnimationRunner();
                        }
                    }
                } else if ((i3 & 4) != 0) {
                    m.c cVar6 = l2.b;
                    RecyclerView recyclerView5 = RecyclerView.this;
                    recyclerView5.mRecycler.n(j2);
                    recyclerView5.animateDisappearance(j2, cVar6, null);
                } else if ((i3 & 8) != 0) {
                    RecyclerView.this.animateAppearance(j2, l2.b, l2.c);
                }
                l2.a = 0;
                l2.b = null;
                l2.c = null;
                i0.a.d.a(l2);
            }
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        b0 b0Var2 = this.mState;
        b0Var2.b = b0Var2.e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        b0Var2.j = false;
        b0Var2.k = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<f0> arrayList = this.mRecycler.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = this.mLayout;
        if (pVar.mPrefetchMaxObservedInInitialPrefetch) {
            pVar.mPrefetchMaxCountObserved = 0;
            pVar.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.o();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        i0 i0Var2 = this.mViewInfoStore;
        i0Var2.a.clear();
        i0Var2.b.a();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        t tVar = this.mInterceptingOnItemTouchListener;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        tVar.d(motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            t tVar = this.mOnItemTouchListeners.get(i2);
            if (tVar.e(motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = tVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int e2 = this.mChildHelper.e();
        if (e2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < e2; i4++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i4));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i2) {
                    i2 = layoutPosition;
                }
                if (layoutPosition > i3) {
                    i3 = layoutPosition;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i2));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        f0 findViewHolderForAdapterPosition;
        b0 b0Var = this.mState;
        int i2 = b0Var.l;
        if (i2 == -1) {
            i2 = 0;
        }
        int b2 = b0Var.b();
        for (int i3 = i2; i3 < b2; i3++) {
            f0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i3);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(b2, i2);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition.itemView;
            }
        }
    }

    public static f0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private com.amazon.aps.iva.p3.q getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new com.amazon.aps.iva.p3.q(this);
        }
        return this.mScrollingChildHelper;
    }

    private float getSplineFlingDistance(int i2) {
        double log = Math.log((Math.abs(i2) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f2 = DECELERATION_RATE;
        return (float) (Math.exp((f2 / (f2 - 1.0d)) * log) * this.mPhysicalCoef * SCROLL_FRICTION);
    }

    private void handleMissingPreInfoForChangeError(long j2, f0 f0Var, f0 f0Var2) {
        int e2 = this.mChildHelper.e();
        for (int i2 = 0; i2 < e2; i2++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
            if (childViewHolderInt != f0Var && getChangedHolderKey(childViewHolderInt) == j2) {
                h hVar = this.mAdapter;
                if (hVar != null && hVar.hasStableIds()) {
                    StringBuilder sb = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(" \n View Holder 2:");
                    sb.append(f0Var);
                    throw new IllegalStateException(t1.a(this, sb));
                }
                StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(" \n View Holder 2:");
                sb2.append(f0Var);
                throw new IllegalStateException(t1.a(this, sb2));
            }
        }
        Objects.toString(f0Var2);
        Objects.toString(f0Var);
        exceptionLabel();
    }

    private boolean hasUpdatedView() {
        int e2 = this.mChildHelper.e();
        for (int i2 = 0; i2 < e2; i2++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
        if (g0.l.c(this) == 0) {
            g0.l.m(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new androidx.recyclerview.widget.e(new e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i2) {
        int i3;
        int i4;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c2 = 65535;
        if (this.mLayout.getLayoutDirection() == 1) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        Rect rect = this.mTempRect;
        int i5 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i6 = rect2.left;
        if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
            i4 = 1;
        } else {
            int i7 = rect.right;
            int i8 = rect2.right;
            if ((i7 > i8 || i5 >= i8) && i5 > i6) {
                i4 = -1;
            } else {
                i4 = 0;
            }
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
            c2 = 1;
        } else {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if ((i11 <= i12 && i9 < i12) || i9 <= i10) {
                c2 = 0;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 17) {
                    if (i2 != 33) {
                        if (i2 != 66) {
                            if (i2 == 130) {
                                if (c2 <= 0) {
                                    return false;
                                }
                                return true;
                            }
                            StringBuilder sb = new StringBuilder("Invalid direction: ");
                            sb.append(i2);
                            throw new IllegalArgumentException(t1.a(this, sb));
                        } else if (i4 <= 0) {
                            return false;
                        } else {
                            return true;
                        }
                    } else if (c2 >= 0) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (i4 >= 0) {
                    return false;
                } else {
                    return true;
                }
            } else if (c2 <= 0 && (c2 != 0 || i4 * i3 <= 0)) {
                return false;
            } else {
                return true;
            }
        } else if (c2 >= 0 && (c2 != 0 || i4 * i3 >= 0)) {
            return false;
        } else {
            return true;
        }
    }

    private void nestedScrollByInternal(int i2, int i3, MotionEvent motionEvent, int i4) {
        int i5;
        float y2;
        float x2;
        int i6;
        int i7;
        int i8;
        p pVar = this.mLayout;
        if (pVar == null || this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        int i9 = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean canScrollHorizontally = pVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollVertically) {
            i5 = canScrollHorizontally | 2;
        } else {
            i5 = canScrollHorizontally;
        }
        if (motionEvent == null) {
            y2 = getHeight() / 2.0f;
        } else {
            y2 = motionEvent.getY();
        }
        if (motionEvent == null) {
            x2 = getWidth() / 2.0f;
        } else {
            x2 = motionEvent.getX();
        }
        int releaseHorizontalGlow = i2 - releaseHorizontalGlow(i2, y2);
        int releaseVerticalGlow = i3 - releaseVerticalGlow(i3, x2);
        startNestedScroll(i5, i4);
        if (canScrollHorizontally != 0) {
            i6 = releaseHorizontalGlow;
        } else {
            i6 = 0;
        }
        if (canScrollVertically) {
            i7 = releaseVerticalGlow;
        } else {
            i7 = 0;
        }
        if (dispatchNestedPreScroll(i6, i7, this.mReusableIntPair, this.mScrollOffset, i4)) {
            int[] iArr2 = this.mReusableIntPair;
            releaseHorizontalGlow -= iArr2[0];
            releaseVerticalGlow -= iArr2[1];
        }
        if (canScrollHorizontally != 0) {
            i8 = releaseHorizontalGlow;
        } else {
            i8 = 0;
        }
        if (canScrollVertically) {
            i9 = releaseVerticalGlow;
        }
        scrollByInternal(i8, i9, motionEvent, i4);
        androidx.recyclerview.widget.p pVar2 = this.mGapWorker;
        if (pVar2 != null && (releaseHorizontalGlow != 0 || releaseVerticalGlow != 0)) {
            pVar2.a(this, releaseHorizontalGlow, releaseVerticalGlow);
        }
        stopNestedScroll(i4);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.mScrollPointerId = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.mLastTouchX = x2;
            this.mInitialTouchX = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        if (this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations()) {
            return true;
        }
        return false;
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
            aVar.l(aVar.b);
            aVar.l(aVar.c);
            aVar.f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.j();
        } else {
            this.mAdapterHelper.c();
        }
        if (!this.mItemsAddedOrRemoved && !this.mItemsChanged) {
            z2 = false;
        } else {
            z2 = true;
        }
        b0 b0Var = this.mState;
        if (this.mFirstLayoutComplete && this.mItemAnimator != null && (((z4 = this.mDataSetHasChangedAfterLayout) || z2 || this.mLayout.mRequestedSimpleAnimations) && (!z4 || this.mAdapter.hasStableIds()))) {
            z3 = true;
        } else {
            z3 = false;
        }
        b0Var.j = z3;
        b0 b0Var2 = this.mState;
        if (b0Var2.j && z2 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z5 = true;
        }
        b0Var2.k = z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r1 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            com.amazon.aps.iva.t3.d.b(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r1 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            com.amazon.aps.iva.t3.d.b(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            com.amazon.aps.iva.t3.d.b(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            com.amazon.aps.iva.t3.d.b(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L81
        L7c:
            java.util.WeakHashMap<android.view.View, com.amazon.aps.iva.p3.r0> r7 = com.amazon.aps.iva.p3.g0.a
            com.amazon.aps.iva.p3.g0.d.k(r6)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        f0 f0Var;
        View findViewById;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (IGNORE_DETACHED_FOCUSED_CHILD && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                        if (this.mChildHelper.e() == 0) {
                            requestFocus();
                            return;
                        }
                    } else if (!this.mChildHelper.k(focusedChild)) {
                        return;
                    }
                }
                View view = null;
                if (this.mState.m != -1 && this.mAdapter.hasStableIds()) {
                    f0Var = findViewHolderForItemId(this.mState.m);
                } else {
                    f0Var = null;
                }
                if (f0Var != null && !this.mChildHelper.k(f0Var.itemView) && f0Var.itemView.hasFocusable()) {
                    view = f0Var.itemView;
                } else if (this.mChildHelper.e() > 0) {
                    view = findNextViewToFocus();
                }
                if (view != null) {
                    int i2 = this.mState.n;
                    if (i2 != -1 && (findViewById = view.findViewById(i2)) != null && findViewById.isFocusable()) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void releaseGlows() {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.mLeftGlow.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
            g0.d.k(this);
        }
    }

    private int releaseHorizontalGlow(int i2, float f2) {
        float height = f2 / getHeight();
        float width = i2 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f3 = DECELERATION_RATE;
        if (edgeEffect != null && com.amazon.aps.iva.t3.d.a(edgeEffect) != DECELERATION_RATE) {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f4 = -com.amazon.aps.iva.t3.d.b(this.mLeftGlow, -width, 1.0f - height);
                if (com.amazon.aps.iva.t3.d.a(this.mLeftGlow) == DECELERATION_RATE) {
                    this.mLeftGlow.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && com.amazon.aps.iva.t3.d.a(edgeEffect2) != DECELERATION_RATE) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float b2 = com.amazon.aps.iva.t3.d.b(this.mRightGlow, width, height);
                    if (com.amazon.aps.iva.t3.d.a(this.mRightGlow) == DECELERATION_RATE) {
                        this.mRightGlow.onRelease();
                    }
                    f3 = b2;
                }
                invalidate();
            }
        }
        return Math.round(f3 * getWidth());
    }

    private int releaseVerticalGlow(int i2, float f2) {
        float width = f2 / getWidth();
        float height = i2 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f3 = DECELERATION_RATE;
        if (edgeEffect != null && com.amazon.aps.iva.t3.d.a(edgeEffect) != DECELERATION_RATE) {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f4 = -com.amazon.aps.iva.t3.d.b(this.mTopGlow, -height, width);
                if (com.amazon.aps.iva.t3.d.a(this.mTopGlow) == DECELERATION_RATE) {
                    this.mTopGlow.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && com.amazon.aps.iva.t3.d.a(edgeEffect2) != DECELERATION_RATE) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float b2 = com.amazon.aps.iva.t3.d.b(this.mBottomGlow, height, 1.0f - width);
                    if (com.amazon.aps.iva.t3.d.a(this.mBottomGlow) == DECELERATION_RATE) {
                        this.mBottomGlow.onRelease();
                    }
                    f3 = b2;
                }
                invalidate();
            }
        }
        return Math.round(f3 * getHeight());
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3;
        boolean z2;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.c) {
                Rect rect = this.mTempRect;
                int i2 = rect.left;
                Rect rect2 = qVar.b;
                rect.left = i2 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        p pVar = this.mLayout;
        Rect rect3 = this.mTempRect;
        boolean z3 = !this.mFirstLayoutComplete;
        if (view2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        pVar.requestChildRectangleOnScreen(this, view, rect3, z3, z2);
    }

    private void resetFocusInfo() {
        b0 b0Var = this.mState;
        b0Var.m = -1L;
        b0Var.l = -1;
        b0Var.n = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View view;
        long j2;
        int absoluteAdapterPosition;
        f0 f0Var = null;
        if (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view != null) {
            f0Var = findContainingViewHolder(view);
        }
        if (f0Var == null) {
            resetFocusInfo();
            return;
        }
        b0 b0Var = this.mState;
        if (this.mAdapter.hasStableIds()) {
            j2 = f0Var.getItemId();
        } else {
            j2 = -1;
        }
        b0Var.m = j2;
        b0 b0Var2 = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else if (f0Var.isRemoved()) {
            absoluteAdapterPosition = f0Var.mOldPosition;
        } else {
            absoluteAdapterPosition = f0Var.getAbsoluteAdapterPosition();
        }
        b0Var2.l = absoluteAdapterPosition;
        this.mState.n = getDeepestFocusedViewWithId(f0Var.itemView);
    }

    private void setAdapterInternal(h<?> hVar, boolean z2, boolean z3) {
        h hVar2 = this.mAdapter;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z2 || z3) {
            removeAndRecycleViews();
        }
        androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
        aVar.l(aVar.b);
        aVar.l(aVar.c);
        aVar.f = 0;
        h<?> hVar3 = this.mAdapter;
        this.mAdapter = hVar;
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.mObserver);
            hVar.onAttachedToRecyclerView(this);
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.onAdapterChanged(hVar3, this.mAdapter);
        }
        w wVar = this.mRecycler;
        h hVar4 = this.mAdapter;
        wVar.a.clear();
        wVar.h();
        wVar.g(hVar3, true);
        v c2 = wVar.c();
        if (hVar3 != null) {
            c2.b--;
        }
        if (!z2 && c2.b == 0) {
            c2.a();
        }
        if (hVar4 != null) {
            c2.b++;
        } else {
            c2.getClass();
        }
        wVar.f();
        this.mState.f = true;
    }

    private boolean shouldAbsorb(EdgeEffect edgeEffect, int i2, int i3) {
        if (i2 > 0) {
            return true;
        }
        if (getSplineFlingDistance(-i2) < com.amazon.aps.iva.t3.d.a(edgeEffect) * i3) {
            return true;
        }
        return false;
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null && com.amazon.aps.iva.t3.d.a(edgeEffect) != DECELERATION_RATE && !canScrollHorizontally(-1)) {
            com.amazon.aps.iva.t3.d.b(this.mLeftGlow, DECELERATION_RATE, 1.0f - (motionEvent.getY() / getHeight()));
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && com.amazon.aps.iva.t3.d.a(edgeEffect2) != DECELERATION_RATE && !canScrollHorizontally(1)) {
            com.amazon.aps.iva.t3.d.b(this.mRightGlow, DECELERATION_RATE, motionEvent.getY() / getHeight());
            z2 = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && com.amazon.aps.iva.t3.d.a(edgeEffect3) != DECELERATION_RATE && !canScrollVertically(-1)) {
            com.amazon.aps.iva.t3.d.b(this.mTopGlow, DECELERATION_RATE, motionEvent.getX() / getWidth());
            z2 = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && com.amazon.aps.iva.t3.d.a(edgeEffect4) != DECELERATION_RATE && !canScrollVertically(1)) {
            com.amazon.aps.iva.t3.d.b(this.mBottomGlow, DECELERATION_RATE, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z2;
    }

    private void stopScrollersInternal() {
        e0 e0Var = this.mViewFlinger;
        RecyclerView.this.removeCallbacks(e0Var);
        e0Var.d.abortAnimation();
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.stopSmoothScroller();
        }
    }

    public boolean G() {
        return isChildrenDrawingOrderEnabled();
    }

    public void absorbGlows(int i2, int i3) {
        if (i2 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i3);
            }
        }
        if (i2 != 0 || i3 != 0) {
            WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
            g0.d.k(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        p pVar = this.mLayout;
        if (pVar == null || !pVar.onAddFocusables(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public void addItemDecoration(o oVar, int i2) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.mItemDecorations.add(oVar);
        } else {
            this.mItemDecorations.add(i2, oVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(r rVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(rVar);
    }

    public void addOnItemTouchListener(t tVar) {
        this.mOnItemTouchListeners.add(tVar);
    }

    public void addOnScrollListener(u uVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(uVar);
    }

    public void addRecyclerListener(x xVar) {
        boolean z2;
        if (xVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.amazon.aps.iva.cq.b.u(z2, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(xVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void animateAppearance(androidx.recyclerview.widget.RecyclerView.f0 r8, androidx.recyclerview.widget.RecyclerView.m.c r9, androidx.recyclerview.widget.RecyclerView.m.c r10) {
        /*
            r7 = this;
            r0 = 0
            r8.setIsRecyclable(r0)
            androidx.recyclerview.widget.RecyclerView$m r0 = r7.mItemAnimator
            r1 = r0
            androidx.recyclerview.widget.e0 r1 = (androidx.recyclerview.widget.e0) r1
            if (r9 == 0) goto L24
            r1.getClass()
            int r3 = r9.a
            int r5 = r10.a
            if (r3 != r5) goto L1a
            int r0 = r9.b
            int r2 = r10.b
            if (r0 == r2) goto L24
        L1a:
            int r4 = r9.b
            int r6 = r10.b
            r2 = r8
            boolean r8 = r1.k(r2, r3, r4, r5, r6)
            goto L28
        L24:
            r1.i(r8)
            r8 = 1
        L28:
            if (r8 == 0) goto L2d
            r7.postAnimationRunner()
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.animateAppearance(androidx.recyclerview.widget.RecyclerView$f0, androidx.recyclerview.widget.RecyclerView$m$c, androidx.recyclerview.widget.RecyclerView$m$c):void");
    }

    public void animateDisappearance(f0 f0Var, m.c cVar, m.c cVar2) {
        int i2;
        int i3;
        boolean z2;
        addAnimatingView(f0Var);
        f0Var.setIsRecyclable(false);
        androidx.recyclerview.widget.e0 e0Var = (androidx.recyclerview.widget.e0) this.mItemAnimator;
        e0Var.getClass();
        int i4 = cVar.a;
        int i5 = cVar.b;
        View view = f0Var.itemView;
        if (cVar2 == null) {
            i2 = view.getLeft();
        } else {
            i2 = cVar2.a;
        }
        int i6 = i2;
        if (cVar2 == null) {
            i3 = view.getTop();
        } else {
            i3 = cVar2.b;
        }
        int i7 = i3;
        if (!f0Var.isRemoved() && (i4 != i6 || i5 != i7)) {
            view.layout(i6, i7, view.getWidth() + i6, view.getHeight() + i7);
            z2 = e0Var.k(f0Var, i4, i5, i6, i7);
        } else {
            e0Var.l(f0Var);
            z2 = true;
        }
        if (z2) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException(t1.a(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(t1.a(this, defpackage.c.b(str)));
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException(t1.a(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            new IllegalStateException(t1.a(this, new StringBuilder("")));
        }
    }

    public boolean canReuseUpdatedViewHolder(f0 f0Var) {
        m mVar = this.mItemAnimator;
        if (mVar != null && !mVar.c(f0Var, f0Var.getUnmodifiedPayloads())) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof q) && this.mLayout.checkLayoutParams((q) layoutParams)) {
            return true;
        }
        return false;
    }

    public void clearOldPositions() {
        int h2 = this.mChildHelper.h();
        for (int i2 = 0; i2 < h2; i2++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i2));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        w wVar = this.mRecycler;
        ArrayList<f0> arrayList = wVar.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.get(i3).clearOldPosition();
        }
        ArrayList<f0> arrayList2 = wVar.a;
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            arrayList2.get(i4).clearOldPosition();
        }
        ArrayList<f0> arrayList3 = wVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                wVar.b.get(i5).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<u> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        p pVar = this.mLayout;
        if (pVar == null || !pVar.canScrollHorizontally()) {
            return 0;
        }
        return this.mLayout.computeHorizontalScrollExtent(this.mState);
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        p pVar = this.mLayout;
        if (pVar == null || !pVar.canScrollHorizontally()) {
            return 0;
        }
        return this.mLayout.computeHorizontalScrollOffset(this.mState);
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        p pVar = this.mLayout;
        if (pVar == null || !pVar.canScrollHorizontally()) {
            return 0;
        }
        return this.mLayout.computeHorizontalScrollRange(this.mState);
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        p pVar = this.mLayout;
        if (pVar == null || !pVar.canScrollVertically()) {
            return 0;
        }
        return this.mLayout.computeVerticalScrollExtent(this.mState);
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        p pVar = this.mLayout;
        if (pVar == null || !pVar.canScrollVertically()) {
            return 0;
        }
        return this.mLayout.computeVerticalScrollOffset(this.mState);
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        p pVar = this.mLayout;
        if (pVar == null || !pVar.canScrollVertically()) {
            return 0;
        }
        return this.mLayout.computeVerticalScrollRange(this.mState);
    }

    public void considerReleasingGlowsOnScroll(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null && !edgeEffect.isFinished() && i2 > 0) {
            this.mLeftGlow.onRelease();
            z2 = this.mLeftGlow.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.mRightGlow.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.mTopGlow.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.mBottomGlow.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
            g0.d.k(this);
        }
    }

    public int consumeFlingInHorizontalStretch(int i2) {
        return consumeFlingInStretch(i2, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    int consumeFlingInVerticalStretch(int i2) {
        return consumeFlingInStretch(i2, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        boolean z2;
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout) {
            if (!this.mAdapterHelper.g()) {
                return;
            }
            androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
            int i2 = aVar.f;
            boolean z3 = false;
            if ((4 & i2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if ((i2 & 11) != 0) {
                    z3 = true;
                }
                if (!z3) {
                    int i3 = com.amazon.aps.iva.k3.m.a;
                    m.a.a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                    startInterceptRequestLayout();
                    onEnterLayoutOrScroll();
                    this.mAdapterHelper.j();
                    if (!this.mLayoutWasDefered) {
                        if (hasUpdatedView()) {
                            dispatchLayout();
                        } else {
                            this.mAdapterHelper.b();
                        }
                    }
                    stopInterceptRequestLayout(true);
                    onExitLayoutOrScroll();
                    m.a.b();
                    return;
                }
            }
            if (aVar.g()) {
                int i4 = com.amazon.aps.iva.k3.m.a;
                m.a.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                m.a.b();
                return;
            }
            return;
        }
        int i5 = com.amazon.aps.iva.k3.m.a;
        m.a.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
        dispatchLayout();
        m.a.b();
    }

    public void defaultOnMeasure(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
        setMeasuredDimension(p.chooseSize(i2, paddingRight, g0.d.e(this)), p.chooseSize(i3, getPaddingBottom() + getPaddingTop(), g0.d.d(this)));
    }

    public void dispatchChildAttached(View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.onViewAttachedToWindow(childViewHolderInt);
        }
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).b(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).a(view);
            }
        }
    }

    public void dispatchLayout() {
        boolean z2;
        if (this.mAdapter == null || this.mLayout == null) {
            return;
        }
        boolean z3 = false;
        this.mState.i = false;
        if (this.mLastAutoMeasureSkippedDueToExact && (this.mLastAutoMeasureNonExactMeasuredWidth != getWidth() || this.mLastAutoMeasureNonExactMeasuredHeight != getHeight())) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.d == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
            if (!aVar.c.isEmpty() && !aVar.b.isEmpty()) {
                z3 = true;
            }
            if (!z3 && !z2 && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            }
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().e(i2, i3, i4, i5, iArr);
    }

    public void dispatchOnScrollStateChanged(int i2) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.onScrollStateChanged(i2);
        }
        onScrollStateChanged(i2);
        u uVar = this.mScrollListener;
        if (uVar != null) {
            uVar.onScrollStateChanged(this, i2);
        }
        List<u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i2);
            }
        }
    }

    public void dispatchOnScrolled(int i2, int i3) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        onScrolled(i2, i3);
        u uVar = this.mScrollListener;
        if (uVar != null) {
            uVar.onScrolled(this, i2, i3);
        }
        List<u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i2, i3);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i2;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            f0 f0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (f0Var.itemView.getParent() == this && !f0Var.shouldIgnore() && (i2 = f0Var.mPendingAccessibilityState) != -1) {
                View view = f0Var.itemView;
                WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
                g0.d.s(view, i2);
                f0Var.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        int i3;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z5 = false;
        for (int i4 = 0; i4 < size; i4++) {
            this.mItemDecorations.get(i4).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z6 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.mClipToPadding) {
                i3 = getPaddingBottom();
            } else {
                i3 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i3, DECELERATION_RATE);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z2 = true;
            } else {
                z2 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z4 = true;
            } else {
                z4 = false;
            }
            z2 |= z4;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.mClipToPadding) {
                i2 = getPaddingTop();
            } else {
                i2 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i2, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            z2 |= z3;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z5 = true;
            }
            z2 |= z5;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.g()) {
            z6 = z2;
        }
        if (z6) {
            WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
            g0.d.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        ((c0) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mBottomGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        ((c0) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mLeftGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        ((c0) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mRightGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        ((c0) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mTopGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(b0 b0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.d;
            b0Var.o = overScroller.getFinalX() - overScroller.getCurrX();
            b0Var.p = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        b0Var.o = 0;
        b0Var.p = 0;
    }

    public View findChildViewUnder(float f2, float f3) {
        for (int e2 = this.mChildHelper.e() - 1; e2 >= 0; e2--) {
            View d2 = this.mChildHelper.d(e2);
            float translationX = d2.getTranslationX();
            float translationY = d2.getTranslationY();
            if (f2 >= d2.getLeft() + translationX && f2 <= d2.getRight() + translationX && f3 >= d2.getTop() + translationY && f3 <= d2.getBottom() + translationY) {
                return d2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View findContainingItemView(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    public f0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public f0 findViewHolderForAdapterPosition(int i2) {
        f0 f0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int h2 = this.mChildHelper.h();
        for (int i3 = 0; i3 < h2; i3++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i3));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i2) {
                if (this.mChildHelper.k(childViewHolderInt.itemView)) {
                    f0Var = childViewHolderInt;
                } else {
                    return childViewHolderInt;
                }
            }
        }
        return f0Var;
    }

    public f0 findViewHolderForItemId(long j2) {
        h hVar = this.mAdapter;
        f0 f0Var = null;
        if (hVar != null && hVar.hasStableIds()) {
            int h2 = this.mChildHelper.h();
            for (int i2 = 0; i2 < h2; i2++) {
                f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i2));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j2) {
                    if (this.mChildHelper.k(childViewHolderInt.itemView)) {
                        f0Var = childViewHolderInt;
                    } else {
                        return childViewHolderInt;
                    }
                }
            }
        }
        return f0Var;
    }

    public f0 findViewHolderForLayoutPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    @Deprecated
    public f0 findViewHolderForPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e9  */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean fling(int r8, int r9) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.fling(int, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        boolean z2;
        View view2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        View onInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i2);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z6 = true;
        if (this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed) {
            z2 = true;
        } else {
            z2 = false;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z2 && (i2 == 2 || i2 == 1)) {
            if (this.mLayout.canScrollVertically()) {
                if (i2 == 2) {
                    i4 = 130;
                } else {
                    i4 = 33;
                }
                if (focusFinder.findNextFocus(this, view, i4) == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i4;
                }
            } else {
                z3 = false;
            }
            if (!z3 && this.mLayout.canScrollHorizontally()) {
                if (this.mLayout.getLayoutDirection() == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i2 == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z4 ^ z5) {
                    i3 = 66;
                } else {
                    i3 = 17;
                }
                if (focusFinder.findNextFocus(this, view, i3) != null) {
                    z6 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i3;
                }
                z3 = z6;
            }
            if (z3) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i2);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (findNextFocus == null && z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.onFocusSearchFailed(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i2);
            }
            requestChildOnScreen(view2, null);
            return view;
        } else if (!isPreferredNextFocus(view, view2, i2)) {
            return super.focusSearch(view, i2);
        } else {
            return view2;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(t1.a(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(t1.a(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(f0 f0Var) {
        if (f0Var.hasAnyOfTheFlags(524) || !f0Var.isBound()) {
            return -1;
        }
        androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
        int i2 = f0Var.mPosition;
        ArrayList<a.b> arrayList = aVar.b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            a.b bVar = arrayList.get(i3);
            int i4 = bVar.a;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 8) {
                        int i5 = bVar.b;
                        if (i5 == i2) {
                            i2 = bVar.d;
                        } else {
                            if (i5 < i2) {
                                i2--;
                            }
                            if (bVar.d <= i2) {
                                i2++;
                            }
                        }
                    }
                } else {
                    int i6 = bVar.b;
                    if (i6 <= i2) {
                        int i7 = bVar.d;
                        if (i6 + i7 > i2) {
                            return -1;
                        }
                        i2 -= i7;
                    } else {
                        continue;
                    }
                }
            } else if (bVar.b <= i2) {
                i2 += bVar.d;
            }
        }
        return i2;
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.getBaseline();
        }
        return super.getBaseline();
    }

    public long getChangedHolderKey(f0 f0Var) {
        if (this.mAdapter.hasStableIds()) {
            return f0Var.getItemId();
        }
        return f0Var.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    public long getChildItemId(View view) {
        f0 childViewHolderInt;
        h hVar = this.mAdapter;
        if (hVar == null || !hVar.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public f0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return getChildViewHolderInt(view);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public androidx.recyclerview.widget.c0 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public l getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public m getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        q qVar = (q) view.getLayoutParams();
        boolean z2 = qVar.c;
        Rect rect = qVar.b;
        if (!z2) {
            return rect;
        }
        if (this.mState.g && (qVar.c() || qVar.a.isInvalid())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i2).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i3 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.c = false;
        return rect;
    }

    public o getItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            return this.mItemDecorations.get(i2);
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public p getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public v getRecycledViewPool() {
        return this.mRecycler.c();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().h(0);
    }

    public boolean hasPendingAdapterUpdates() {
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout && !this.mAdapterHelper.g()) {
            return false;
        }
        return true;
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new androidx.recyclerview.widget.a(new f());
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.o(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
            return;
        }
        throw new IllegalArgumentException(t1.a(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            return true;
        }
        return false;
    }

    public boolean isAnimating() {
        m mVar = this.mItemAnimator;
        if (mVar != null && mVar.g()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        if (this.mLayoutOrScrollCounter > 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public void jumpToPositionForSmoothScroller(int i2) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i2);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int h2 = this.mChildHelper.h();
        for (int i2 = 0; i2 < h2; i2++) {
            ((q) this.mChildHelper.g(i2).getLayoutParams()).c = true;
        }
        ArrayList<f0> arrayList = this.mRecycler.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            q qVar = (q) arrayList.get(i3).itemView.getLayoutParams();
            if (qVar != null) {
                qVar.c = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int h2 = this.mChildHelper.h();
        for (int i2 = 0; i2 < h2; i2++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i2));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        w wVar = this.mRecycler;
        ArrayList<f0> arrayList = wVar.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            f0 f0Var = arrayList.get(i3);
            if (f0Var != null) {
                f0Var.addFlags(6);
                f0Var.addChangePayload(null);
            }
        }
        h hVar = RecyclerView.this.mAdapter;
        if (hVar == null || !hVar.hasStableIds()) {
            wVar.h();
        }
    }

    public void nestedScrollBy(int i2, int i3) {
        nestedScrollByInternal(i2, i3, null, 1);
    }

    public void offsetChildrenHorizontal(int i2) {
        int e2 = this.mChildHelper.e();
        for (int i3 = 0; i3 < e2; i3++) {
            this.mChildHelper.d(i3).offsetLeftAndRight(i2);
        }
    }

    public void offsetChildrenVertical(int i2) {
        int e2 = this.mChildHelper.e();
        for (int i3 = 0; i3 < e2; i3++) {
            this.mChildHelper.d(i3).offsetTopAndBottom(i2);
        }
    }

    public void offsetPositionRecordsForInsert(int i2, int i3) {
        int h2 = this.mChildHelper.h();
        for (int i4 = 0; i4 < h2; i4++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i2) {
                childViewHolderInt.offsetPosition(i3, false);
                this.mState.f = true;
            }
        }
        ArrayList<f0> arrayList = this.mRecycler.c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            f0 f0Var = arrayList.get(i5);
            if (f0Var != null && f0Var.mPosition >= i2) {
                f0Var.offsetPosition(i3, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int h2 = this.mChildHelper.h();
        int i11 = -1;
        if (i2 < i3) {
            i5 = i2;
            i4 = i3;
            i6 = -1;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i12 = 0; i12 < h2; i12++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i12));
            if (childViewHolderInt != null && (i10 = childViewHolderInt.mPosition) >= i5 && i10 <= i4) {
                if (i10 == i2) {
                    childViewHolderInt.offsetPosition(i3 - i2, false);
                } else {
                    childViewHolderInt.offsetPosition(i6, false);
                }
                this.mState.f = true;
            }
        }
        w wVar = this.mRecycler;
        wVar.getClass();
        if (i2 < i3) {
            i8 = i2;
            i7 = i3;
        } else {
            i7 = i2;
            i11 = 1;
            i8 = i3;
        }
        ArrayList<f0> arrayList = wVar.c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            f0 f0Var = arrayList.get(i13);
            if (f0Var != null && (i9 = f0Var.mPosition) >= i8 && i9 <= i7) {
                if (i9 == i2) {
                    f0Var.offsetPosition(i3 - i2, false);
                } else {
                    f0Var.offsetPosition(i11, false);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int h2 = this.mChildHelper.h();
        for (int i5 = 0; i5 < h2; i5++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i5));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i6 = childViewHolderInt.mPosition;
                if (i6 >= i4) {
                    childViewHolderInt.offsetPosition(-i3, z2);
                    this.mState.f = true;
                } else if (i6 >= i2) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i2 - 1, -i3, z2);
                    this.mState.f = true;
                }
            }
        }
        w wVar = this.mRecycler;
        ArrayList<f0> arrayList = wVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                f0 f0Var = arrayList.get(size);
                if (f0Var != null) {
                    int i7 = f0Var.mPosition;
                    if (i7 >= i4) {
                        f0Var.offsetPosition(-i3, z2);
                    } else if (i7 >= i2) {
                        f0Var.addFlags(8);
                        wVar.i(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r1 >= 30.0f) goto L17;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.mLayoutOrScrollCounter = r0
            r1 = 1
            r5.mIsAttached = r1
            boolean r2 = r5.mFirstLayoutComplete
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.mFirstLayoutComplete = r1
            androidx.recyclerview.widget.RecyclerView$w r1 = r5.mRecycler
            r1.f()
            androidx.recyclerview.widget.RecyclerView$p r1 = r5.mLayout
            if (r1 == 0) goto L23
            r1.dispatchAttachedToWindow(r5)
        L23:
            r5.mPostedAnimatorRunner = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L6a
            java.lang.ThreadLocal<androidx.recyclerview.widget.p> r0 = androidx.recyclerview.widget.p.f
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.p r1 = (androidx.recyclerview.widget.p) r1
            r5.mGapWorker = r1
            if (r1 != 0) goto L63
            androidx.recyclerview.widget.p r1 = new androidx.recyclerview.widget.p
            r1.<init>()
            r5.mGapWorker = r1
            java.util.WeakHashMap<android.view.View, com.amazon.aps.iva.p3.r0> r1 = com.amazon.aps.iva.p3.g0.a
            android.view.Display r1 = com.amazon.aps.iva.p3.g0.e.b(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L55
            if (r1 == 0) goto L55
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L55
            goto L57
        L55:
            r1 = 1114636288(0x42700000, float:60.0)
        L57:
            androidx.recyclerview.widget.p r2 = r5.mGapWorker
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.d = r3
            r0.set(r2)
        L63:
            androidx.recyclerview.widget.p r0 = r5.mGapWorker
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r0.b
            r0.add(r5)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        boolean z2;
        androidx.recyclerview.widget.p pVar;
        super.onDetachedFromWindow();
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.f();
        }
        stopScroll();
        this.mIsAttached = false;
        p pVar2 = this.mLayout;
        if (pVar2 != null) {
            pVar2.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        do {
        } while (i0.a.d.b() != null);
        w wVar = this.mRecycler;
        int i2 = 0;
        while (true) {
            ArrayList<f0> arrayList = wVar.c;
            if (i2 >= arrayList.size()) {
                break;
            }
            com.amazon.aps.iva.dg.b.j(arrayList.get(i2).itemView);
            i2++;
        }
        wVar.g(RecyclerView.this.mAdapter, false);
        int i3 = 0;
        while (true) {
            if (i3 < getChildCount()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i4 = i3 + 1;
                View childAt = getChildAt(i3);
                if (childAt != null) {
                    ArrayList<com.amazon.aps.iva.v3.a> arrayList2 = com.amazon.aps.iva.dg.b.v(childAt).a;
                    for (int B = f1.B(arrayList2); -1 < B; B--) {
                        arrayList2.get(B).a();
                    }
                    i3 = i4;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else if (ALLOW_THREAD_GAP_WORK && (pVar = this.mGapWorker) != null) {
                pVar.b.remove(this);
                this.mGapWorker = null;
                return;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.nestedScrollByInternal(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        p pVar = this.mLayout;
        if (pVar == null) {
            return false;
        }
        boolean canScrollHorizontally = pVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                onPointerUp(motionEvent);
                            }
                        } else {
                            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                            int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.mLastTouchX = x2;
                            this.mInitialTouchX = x2;
                            int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.mLastTouchY = y2;
                            this.mInitialTouchY = y2;
                        }
                    } else {
                        cancelScroll();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.mScrollState != 1) {
                        int i2 = x3 - this.mInitialTouchX;
                        int i3 = y3 - this.mInitialTouchY;
                        if (canScrollHorizontally && Math.abs(i2) > this.mTouchSlop) {
                            this.mLastTouchX = x3;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (canScrollVertically && Math.abs(i3) > this.mTouchSlop) {
                            this.mLastTouchY = y3;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                }
            } else {
                this.mVelocityTracker.clear();
                stopNestedScroll(0);
            }
        } else {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x4 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x4;
            this.mInitialTouchX = x4;
            int y4 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y4;
            this.mInitialTouchY = y4;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i4 = canScrollHorizontally;
            if (canScrollVertically) {
                i4 = (canScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i4, 0);
        }
        if (this.mScrollState != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = com.amazon.aps.iva.k3.m.a;
        m.a.a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        m.a.b();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        p pVar = this.mLayout;
        if (pVar == null) {
            defaultOnMeasure(i2, i3);
            return;
        }
        boolean z2 = false;
        if (pVar.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z2;
            if (!z2 && this.mAdapter != null) {
                if (this.mState.d == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.setMeasureSpecs(i2, i3);
                this.mState.i = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i2, i3);
                if (this.mLayout.shouldMeasureTwice()) {
                    this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Ints.MAX_POWER_OF_TWO));
                    this.mState.i = true;
                    dispatchLayoutStep2();
                    this.mLayout.setMeasuredDimensionFromChildren(i2, i3);
                }
                this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
                this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i2, i3);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                b0 b0Var = this.mState;
                if (b0Var.k) {
                    b0Var.g = true;
                } else {
                    this.mAdapterHelper.c();
                    this.mState.g = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            h hVar = this.mAdapter;
            if (hVar != null) {
                this.mState.e = hVar.getItemCount();
            } else {
                this.mState.e = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.onMeasure(this.mRecycler, this.mState, i2, i3);
            stopInterceptRequestLayout(false);
            this.mState.g = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.mPendingSavedState = zVar;
        super.onRestoreInstanceState(zVar.getSuperState());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.mPendingSavedState;
        if (zVar2 != null) {
            zVar.b = zVar2.b;
        } else {
            p pVar = this.mLayout;
            if (pVar != null) {
                zVar.b = pVar.onSaveInstanceState();
            } else {
                zVar.b = null;
            }
        }
        return zVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            invalidateGlows();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            Runnable runnable = this.mItemAnimatorRunner;
            WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
            g0.d.m(this, runnable);
            this.mPostedAnimatorRunner = true;
        }
    }

    public void processDataSetCompletelyChanged(boolean z2) {
        this.mDispatchItemsChangedEvent = z2 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(f0 f0Var, m.c cVar) {
        f0Var.setFlags(0, 8192);
        if (this.mState.h && f0Var.isUpdated() && !f0Var.isRemoved() && !f0Var.shouldIgnore()) {
            this.mViewInfoStore.b.f(getChangedHolderKey(f0Var), f0Var);
        }
        com.amazon.aps.iva.x.h<f0, i0.a> hVar = this.mViewInfoStore.a;
        i0.a orDefault = hVar.getOrDefault(f0Var, null);
        if (orDefault == null) {
            orDefault = i0.a.a();
            hVar.put(f0Var, orDefault);
        }
        orDefault.b = cVar;
        orDefault.a |= 4;
    }

    public void removeAndRecycleViews() {
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.f();
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        w wVar = this.mRecycler;
        wVar.a.clear();
        wVar.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean removeAnimatingView(android.view.View r6) {
        /*
            r5 = this;
            r5.startInterceptRequestLayout()
            androidx.recyclerview.widget.e r0 = r5.mChildHelper
            androidx.recyclerview.widget.e$b r1 = r0.a
            androidx.recyclerview.widget.RecyclerView$e r1 = (androidx.recyclerview.widget.RecyclerView.e) r1
            androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
            int r2 = r2.indexOfChild(r6)
            r3 = -1
            if (r2 != r3) goto L16
            r0.m(r6)
            goto L27
        L16:
            androidx.recyclerview.widget.e$a r3 = r0.b
            boolean r4 = r3.d(r2)
            if (r4 == 0) goto L29
            r3.f(r2)
            r0.m(r6)
            r1.b(r2)
        L27:
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            if (r0 == 0) goto L3a
            androidx.recyclerview.widget.RecyclerView$f0 r6 = getChildViewHolderInt(r6)
            androidx.recyclerview.widget.RecyclerView$w r1 = r5.mRecycler
            r1.n(r6)
            androidx.recyclerview.widget.RecyclerView$w r1 = r5.mRecycler
            r1.k(r6)
        L3a:
            r6 = r0 ^ 1
            r5.stopInterceptRequestLayout(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.removeAnimatingView(android.view.View):boolean");
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z2) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(t1.a(this, sb));
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z2);
    }

    public void removeItemDecoration(o oVar) {
        boolean z2;
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(oVar);
        if (this.mItemDecorations.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            setWillNotDraw(z2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i2));
            return;
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(r rVar) {
        List<r> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(rVar);
    }

    public void removeOnItemTouchListener(t tVar) {
        this.mOnItemTouchListeners.remove(tVar);
        if (this.mInterceptingOnItemTouchListener == tVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(u uVar) {
        List<u> list = this.mScrollListeners;
        if (list != null) {
            list.remove(uVar);
        }
    }

    public void removeRecyclerListener(x xVar) {
        this.mRecyclerListeners.remove(xVar);
    }

    public void repositionShadowingViews() {
        f0 f0Var;
        int e2 = this.mChildHelper.e();
        for (int i2 = 0; i2 < e2; i2++) {
            View d2 = this.mChildHelper.d(i2);
            f0 childViewHolder = getChildViewHolder(d2);
            if (childViewHolder != null && (f0Var = childViewHolder.mShadowingHolder) != null) {
                View view = f0Var.itemView;
                int left = d2.getLeft();
                int top = d2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mOnItemTouchListeners.get(i2).c(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth == 0 && !this.mLayoutSuppressed) {
            super.requestLayout();
        } else {
            this.mLayoutWasDefered = true;
        }
    }

    public void saveOldPositions() {
        int h2 = this.mChildHelper.h();
        for (int i2 = 0; i2 < h2; i2++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i2));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        p pVar = this.mLayout;
        if (pVar == null || this.mLayoutSuppressed) {
            return;
        }
        boolean canScrollHorizontally = pVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollHorizontally || canScrollVertically) {
            if (!canScrollHorizontally) {
                i2 = 0;
            }
            if (!canScrollVertically) {
                i3 = 0;
            }
            scrollByInternal(i2, i3, null, 0);
        }
    }

    public boolean scrollByInternal(int i2, int i3, MotionEvent motionEvent, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        boolean z3;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i2, i3, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i5 = i10;
            i6 = i9;
            i7 = i2 - i9;
            i8 = i3 - i10;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i6, i5, i7, i8, this.mScrollOffset, i4, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i11 = iArr4[0];
        int i12 = i7 - i11;
        int i13 = iArr4[1];
        int i14 = i8 - i13;
        if (i11 == 0 && i13 == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        int i15 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i16 = iArr5[0];
        this.mLastTouchX = i15 - i16;
        int i17 = this.mLastTouchY;
        int i18 = iArr5[1];
        this.mLastTouchY = i17 - i18;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i16;
        iArr6[1] = iArr6[1] + i18;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null) {
                if ((motionEvent.getSource() & 8194) == 8194) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    pullGlows(motionEvent.getX(), i12, motionEvent.getY(), i14);
                }
            }
            considerReleasingGlowsOnScroll(i2, i3);
        }
        if (i6 != 0 || i5 != 0) {
            dispatchOnScrolled(i6, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (z2 || i6 != 0 || i5 != 0) {
            return true;
        }
        return false;
    }

    public void scrollStep(int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i6 = com.amazon.aps.iva.k3.m.a;
        m.a.a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        if (i2 != 0) {
            i4 = this.mLayout.scrollHorizontallyBy(i2, this.mRecycler, this.mState);
        } else {
            i4 = 0;
        }
        if (i3 != 0) {
            i5 = this.mLayout.scrollVerticallyBy(i3, this.mRecycler, this.mState);
        } else {
            i5 = 0;
        }
        m.a.b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = i4;
            iArr[1] = i5;
        }
    }

    public void scrollToPosition(int i2) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        p pVar = this.mLayout;
        if (pVar == null) {
            return;
        }
        pVar.scrollToPosition(i2);
        awakenScrollBars();
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.c0 c0Var) {
        this.mAccessibilityDelegate = c0Var;
        com.amazon.aps.iva.p3.g0.n(this, c0Var);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        setAdapterInternal(hVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        boolean z2;
        if (kVar == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = kVar;
        if (kVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        setChildrenDrawingOrderEnabled(z2);
    }

    public boolean setChildImportantForAccessibilityInternal(f0 f0Var, int i2) {
        if (isComputingLayout()) {
            f0Var.mPendingAccessibilityState = i2;
            this.mPendingAccessibilityImportanceChange.add(f0Var);
            return false;
        }
        View view = f0Var.itemView;
        WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
        g0.d.s(view, i2);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z2;
        super.setClipToPadding(z2);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        lVar.getClass();
        this.mEdgeEffectFactory = lVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z2) {
        this.mHasFixedSize = z2;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.mItemAnimator;
        if (mVar2 != null) {
            mVar2.f();
            this.mItemAnimator.a = null;
        }
        this.mItemAnimator = mVar;
        if (mVar != null) {
            mVar.a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i2) {
        w wVar = this.mRecycler;
        wVar.e = i2;
        wVar.o();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(p pVar) {
        e.b bVar;
        RecyclerView recyclerView;
        if (pVar == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            m mVar = this.mItemAnimator;
            if (mVar != null) {
                mVar.f();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            w wVar = this.mRecycler;
            wVar.a.clear();
            wVar.h();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            w wVar2 = this.mRecycler;
            wVar2.a.clear();
            wVar2.h();
        }
        androidx.recyclerview.widget.e eVar = this.mChildHelper;
        eVar.b.g();
        ArrayList arrayList = eVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            bVar = eVar.a;
            if (size < 0) {
                break;
            }
            e eVar2 = (e) bVar;
            eVar2.getClass();
            f0 childViewHolderInt = getChildViewHolderInt((View) arrayList.get(size));
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
            arrayList.remove(size);
        }
        e eVar3 = (e) bVar;
        int a2 = eVar3.a();
        int i2 = 0;
        while (true) {
            recyclerView = RecyclerView.this;
            if (i2 >= a2) {
                break;
            }
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
            i2++;
        }
        recyclerView.removeAllViews();
        this.mLayout = pVar;
        if (pVar != null) {
            if (pVar.mRecyclerView == null) {
                pVar.setRecyclerView(this);
                if (this.mIsAttached) {
                    this.mLayout.dispatchAttachedToWindow(this);
                }
            } else {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(pVar);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(t1.a(pVar.mRecyclerView, sb));
            }
        }
        this.mRecycler.o();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().i(z2);
    }

    public void setOnFlingListener(s sVar) {
        this.mOnFlingListener = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.mScrollListener = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.mPreserveFocusAfterLayout = z2;
    }

    public void setRecycledViewPool(v vVar) {
        v vVar2;
        w wVar = this.mRecycler;
        RecyclerView recyclerView = RecyclerView.this;
        wVar.g(recyclerView.mAdapter, false);
        if (wVar.g != null) {
            vVar2.b--;
        }
        wVar.g = vVar;
        if (vVar != null && recyclerView.getAdapter() != null) {
            wVar.g.b++;
        }
        wVar.f();
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
        this.mRecyclerListener = xVar;
    }

    void setScrollState(int i2) {
        if (i2 == this.mScrollState) {
            return;
        }
        this.mScrollState = i2;
        if (i2 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 1) {
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(d0 d0Var) {
        this.mRecycler.getClass();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i2;
        int i3 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        if (accessibilityEvent != null) {
            i2 = com.amazon.aps.iva.q3.b.a(accessibilityEvent);
        } else {
            i2 = 0;
        }
        if (i2 != 0) {
            i3 = i2;
        }
        this.mEatenAccessibilityChangeFlags |= i3;
        return true;
    }

    public void smoothScrollBy(int i2, int i3) {
        smoothScrollBy(i2, i3, null);
    }

    public void smoothScrollToPosition(int i2) {
        p pVar;
        if (this.mLayoutSuppressed || (pVar = this.mLayout) == null) {
            return;
        }
        pVar.smoothScrollToPosition(this, this.mState, i2);
    }

    public void startInterceptRequestLayout() {
        int i2 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i2;
        if (i2 == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().j(i2, 0);
    }

    public void stopInterceptRequestLayout(boolean z2) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z2 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z2 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().k(0);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.mLayoutSuppressed = false;
                if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, DECELERATION_RATE, DECELERATION_RATE, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(h hVar, boolean z2) {
        setLayoutFrozen(false);
        setAdapterInternal(hVar, true, z2);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i2, int i3, Object obj) {
        int i4;
        int i5;
        int h2 = this.mChildHelper.h();
        int i6 = i3 + i2;
        for (int i7 = 0; i7 < h2; i7++) {
            View g2 = this.mChildHelper.g(i7);
            f0 childViewHolderInt = getChildViewHolderInt(g2);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i5 = childViewHolderInt.mPosition) >= i2 && i5 < i6) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((q) g2.getLayoutParams()).c = true;
            }
        }
        w wVar = this.mRecycler;
        ArrayList<f0> arrayList = wVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                f0 f0Var = arrayList.get(size);
                if (f0Var != null && (i4 = f0Var.mPosition) >= i2 && i4 < i6) {
                    f0Var.addFlags(2);
                    wVar.i(size);
                }
            } else {
                return;
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class h<VH extends f0> {
        private final i mObservable = new i();
        private boolean mHasStableIds = false;
        private a mStateRestorationPolicy = a.ALLOW;

        /* loaded from: classes.dex */
        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(VH vh, int i) {
            boolean z;
            if (vh.mBindingAdapter == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                int i2 = com.amazon.aps.iva.k3.m.a;
                m.a.a(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).c = true;
                }
                int i3 = com.amazon.aps.iva.k3.m.a;
                m.a.b();
            }
        }

        public boolean canRestoreState() {
            int i = g.a[this.mStateRestorationPolicy.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2 && getItemCount() <= 0) {
                return false;
            }
            return true;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                int i2 = com.amazon.aps.iva.k3.m.a;
                m.a.a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    m.a.b();
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } catch (Throwable th) {
                int i3 = com.amazon.aps.iva.k3.m.a;
                m.a.b();
                throw th;
            }
        }

        public int findRelativeAdapterPositionIn(h<? extends f0> hVar, f0 f0Var, int i) {
            if (hVar == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.d(i, 1, null);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.e(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.c(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.d(i, i2, null);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.e(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.f(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.f(i, 1);
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void registerAdapterDataObserver(j jVar) {
            this.mObservable.registerObserver(jVar);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void setStateRestorationPolicy(a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.g();
        }

        public void unregisterAdapterDataObserver(j jVar) {
            this.mObservable.unregisterObserver(jVar);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.d(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.d(i, i2, obj);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return getScrollingChildHelper().f(i2, i3, i4, i5, iArr, i6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.recyclerview.widget.RecyclerView.f0 findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.e r0 = r5.mChildHelper
            int r0 = r0.h()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.e r3 = r5.mChildHelper
            android.view.View r3 = r3.g(r2)
            androidx.recyclerview.widget.RecyclerView$f0 r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.e r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.k(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$f0");
    }

    public void onExitLayoutOrScroll(boolean z2) {
        int i2 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i2;
        if (i2 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z2) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator) {
        smoothScrollBy(i2, i3, interpolator, Integer.MIN_VALUE);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mObserver = new y();
        this.mRecycler = new w();
        this.mViewInfoStore = new i0();
        this.mUpdateChildViewsRunnable = new a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new androidx.recyclerview.widget.h();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new e0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new p.b() : null;
        this.mState = new b0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new n();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new b();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = com.amazon.aps.iva.p3.i0.a(viewConfiguration);
        this.mScaledVerticalScrollFactor = com.amazon.aps.iva.p3.i0.b(viewConfiguration);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.a = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
        if (g0.d.c(this) == 0) {
            g0.d.s(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.c0(this));
        int[] iArr = com.amazon.aps.iva.n8.a.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        com.amazon.aps.iva.p3.g0.m(this, context, iArr, attributeSet, obtainStyledAttributes, i2);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(1, true);
        boolean z2 = obtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z2;
        if (z2) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(6), obtainStyledAttributes.getDrawable(7), (StateListDrawable) obtainStyledAttributes.getDrawable(4), obtainStyledAttributes.getDrawable(5));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i2, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        com.amazon.aps.iva.p3.g0.m(this, context, iArr2, attributeSet, obtainStyledAttributes2, i2);
        boolean z3 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
        setTag(R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, i4);
    }

    public boolean hasNestedScrollingParent(int i2) {
        return getScrollingChildHelper().h(i2);
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4) {
        smoothScrollBy(i2, i3, interpolator, i4, false);
    }

    public boolean startNestedScroll(int i2, int i3) {
        return getScrollingChildHelper().j(i2, i3);
    }

    @Override // com.amazon.aps.iva.p3.o
    public void stopNestedScroll(int i2) {
        getScrollingChildHelper().k(i2);
    }

    /* loaded from: classes.dex */
    public static class q extends ViewGroup.MarginLayoutParams {
        public f0 a;
        public final Rect b;
        public boolean c;
        public boolean d;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        @Deprecated
        public final int a() {
            return this.a.getBindingAdapterPosition();
        }

        public final int b() {
            return this.a.getLayoutPosition();
        }

        public final boolean c() {
            return this.a.isUpdated();
        }

        public final boolean d() {
            return this.a.isRemoved();
        }

        public q(int i, int i2) {
            super(i, i2);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }
    }

    public final void dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().f(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        p pVar = this.mLayout;
        if (pVar == null || this.mLayoutSuppressed) {
            return;
        }
        if (!pVar.canScrollHorizontally()) {
            i2 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (i4 == Integer.MIN_VALUE || i4 > 0) {
            if (z2) {
                int i5 = i2 != 0 ? 1 : 0;
                if (i3 != 0) {
                    i5 |= 2;
                }
                startNestedScroll(i5, 1);
            }
            this.mViewFlinger.c(i2, i3, interpolator, i4);
            return;
        }
        scrollBy(i2, i3);
    }

    public void addItemDecoration(o oVar) {
        addItemDecoration(oVar, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(t1.a(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onScrollStateChanged(int i2) {
    }

    /* loaded from: classes.dex */
    public static abstract class u {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public void onScrolled(int i2, int i3) {
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
    }
}
