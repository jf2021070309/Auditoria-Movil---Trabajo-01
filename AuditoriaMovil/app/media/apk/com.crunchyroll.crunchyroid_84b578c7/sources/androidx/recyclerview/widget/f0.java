package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: SnapHelper.java */
/* loaded from: classes.dex */
public abstract class f0 extends RecyclerView.s {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final RecyclerView.u mScrollListener = new a();

    /* compiled from: SnapHelper.java */
    /* loaded from: classes.dex */
    public class a extends RecyclerView.u {
        public boolean b = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.b) {
                this.b = false;
                f0.this.snapToTargetExistingView();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.b = true;
            }
        }
    }

    /* compiled from: SnapHelper.java */
    /* loaded from: classes.dex */
    public class b extends u {
        public b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.u
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return f0.MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.u, androidx.recyclerview.widget.RecyclerView.a0
        public final void onTargetFound(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
            f0 f0Var = f0.this;
            RecyclerView recyclerView = f0Var.mRecyclerView;
            if (recyclerView == null) {
                return;
            }
            int[] calculateDistanceToFinalSnap = f0Var.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
            int i = calculateDistanceToFinalSnap[0];
            int i2 = calculateDistanceToFinalSnap[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (calculateTimeForDeceleration > 0) {
                aVar.b(i, i2, this.mDecelerateInterpolator, calculateTimeForDeceleration);
            }
        }
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    }

    private void setupCallbacks() throws IllegalStateException {
        if (this.mRecyclerView.getOnFlingListener() == null) {
            this.mRecyclerView.addOnScrollListener(this.mScrollListener);
            this.mRecyclerView.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    private boolean snapFromFling(RecyclerView.p pVar, int i, int i2) {
        RecyclerView.a0 createScroller;
        int findTargetSnapPosition;
        if (!(pVar instanceof RecyclerView.a0.b) || (createScroller = createScroller(pVar)) == null || (findTargetSnapPosition = findTargetSnapPosition(pVar, i, i2)) == -1) {
            return false;
        }
        createScroller.setTargetPosition(findTargetSnapPosition);
        pVar.startSmoothScroll(createScroller);
        return true;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            destroyCallbacks();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            setupCallbacks();
            this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    public abstract int[] calculateDistanceToFinalSnap(RecyclerView.p pVar, View view);

    @SuppressLint({"UnknownNullness"})
    public int[] calculateScrollDistance(int i, int i2) {
        this.mGravityScroller.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    public RecyclerView.a0 createScroller(RecyclerView.p pVar) {
        return createSnapScroller(pVar);
    }

    @Deprecated
    public u createSnapScroller(RecyclerView.p pVar) {
        if (!(pVar instanceof RecyclerView.a0.b)) {
            return null;
        }
        return new b(this.mRecyclerView.getContext());
    }

    @SuppressLint({"UnknownNullness"})
    public abstract View findSnapView(RecyclerView.p pVar);

    @SuppressLint({"UnknownNullness"})
    public abstract int findTargetSnapPosition(RecyclerView.p pVar, int i, int i2);

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean onFling(int i, int i2) {
        RecyclerView.p layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        if ((Math.abs(i2) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) || !snapFromFling(layoutManager, i, i2)) {
            return false;
        }
        return true;
    }

    public void snapToTargetExistingView() {
        RecyclerView.p layoutManager;
        View findSnapView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (findSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] calculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, findSnapView);
        int i = calculateDistanceToFinalSnap[0];
        if (i != 0 || calculateDistanceToFinalSnap[1] != 0) {
            this.mRecyclerView.smoothScrollBy(i, calculateDistanceToFinalSnap[1]);
        }
    }
}
