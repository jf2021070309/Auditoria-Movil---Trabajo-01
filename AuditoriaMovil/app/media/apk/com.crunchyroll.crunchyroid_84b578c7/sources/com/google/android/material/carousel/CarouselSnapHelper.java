package com.google.android.material.carousel;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;
import androidx.recyclerview.widget.u;
/* loaded from: classes3.dex */
public class CarouselSnapHelper extends f0 {
    private final boolean disableFling;
    private RecyclerView recyclerView;

    public CarouselSnapHelper() {
        this(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] calculateDistanceToSnap(RecyclerView.p pVar, View view, boolean z) {
        if (!(pVar instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        int distanceToFirstFocalKeyline = distanceToFirstFocalKeyline(view, (CarouselLayoutManager) pVar, z);
        if (pVar.canScrollHorizontally()) {
            return new int[]{distanceToFirstFocalKeyline, 0};
        }
        if (pVar.canScrollVertically()) {
            return new int[]{0, distanceToFirstFocalKeyline};
        }
        return new int[]{0, 0};
    }

    private int distanceToFirstFocalKeyline(View view, CarouselLayoutManager carouselLayoutManager, boolean z) {
        return carouselLayoutManager.getOffsetToScrollToPositionForSnap(carouselLayoutManager.getPosition(view), z);
    }

    private View findViewNearestFirstKeyline(RecyclerView.p pVar) {
        int childCount = pVar.getChildCount();
        View view = null;
        if (childCount != 0 && (pVar instanceof CarouselLayoutManager)) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) pVar;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = pVar.getChildAt(i2);
                int abs = Math.abs(carouselLayoutManager.getOffsetToScrollToPositionForSnap(pVar.getPosition(childAt), false));
                if (abs < i) {
                    view = childAt;
                    i = abs;
                }
            }
        }
        return view;
    }

    private boolean isForwardFling(RecyclerView.p pVar, int i, int i2) {
        if (pVar.canScrollHorizontally()) {
            if (i > 0) {
                return true;
            }
            return false;
        } else if (i2 > 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isReverseLayout(RecyclerView.p pVar) {
        PointF computeScrollVectorForPosition;
        int itemCount = pVar.getItemCount();
        if (!(pVar instanceof RecyclerView.a0.b) || (computeScrollVectorForPosition = ((RecyclerView.a0.b) pVar).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        if (computeScrollVectorForPosition.x >= 0.0f && computeScrollVectorForPosition.y >= 0.0f) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.f0
    public void attachToRecyclerView(RecyclerView recyclerView) {
        super.attachToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }

    @Override // androidx.recyclerview.widget.f0
    public int[] calculateDistanceToFinalSnap(RecyclerView.p pVar, View view) {
        return calculateDistanceToSnap(pVar, view, false);
    }

    @Override // androidx.recyclerview.widget.f0
    public RecyclerView.a0 createScroller(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.a0.b) {
            return new u(this.recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselSnapHelper.1
                @Override // androidx.recyclerview.widget.u
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.u, androidx.recyclerview.widget.RecyclerView.a0
                public void onTargetFound(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
                    if (CarouselSnapHelper.this.recyclerView != null) {
                        CarouselSnapHelper carouselSnapHelper = CarouselSnapHelper.this;
                        int[] calculateDistanceToSnap = carouselSnapHelper.calculateDistanceToSnap(carouselSnapHelper.recyclerView.getLayoutManager(), view, true);
                        int i = calculateDistanceToSnap[0];
                        int i2 = calculateDistanceToSnap[1];
                        int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                        if (calculateTimeForDeceleration > 0) {
                            aVar.b(i, i2, this.mDecelerateInterpolator, calculateTimeForDeceleration);
                        }
                    }
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.f0
    public View findSnapView(RecyclerView.p pVar) {
        return findViewNearestFirstKeyline(pVar);
    }

    @Override // androidx.recyclerview.widget.f0
    public int findTargetSnapPosition(RecyclerView.p pVar, int i, int i2) {
        int itemCount;
        int i3;
        if (!this.disableFling || (itemCount = pVar.getItemCount()) == 0) {
            return -1;
        }
        int childCount = pVar.getChildCount();
        View view = null;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = pVar.getChildAt(i6);
            if (childAt != null) {
                int distanceToFirstFocalKeyline = distanceToFirstFocalKeyline(childAt, (CarouselLayoutManager) pVar, false);
                if (distanceToFirstFocalKeyline <= 0 && distanceToFirstFocalKeyline > i5) {
                    view2 = childAt;
                    i5 = distanceToFirstFocalKeyline;
                }
                if (distanceToFirstFocalKeyline >= 0 && distanceToFirstFocalKeyline < i4) {
                    view = childAt;
                    i4 = distanceToFirstFocalKeyline;
                }
            }
        }
        boolean isForwardFling = isForwardFling(pVar, i, i2);
        if (isForwardFling && view != null) {
            return pVar.getPosition(view);
        }
        if (!isForwardFling && view2 != null) {
            return pVar.getPosition(view2);
        }
        if (isForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = pVar.getPosition(view);
        if (isReverseLayout(pVar) == isForwardFling) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i7 = position + i3;
        if (i7 < 0 || i7 >= itemCount) {
            return -1;
        }
        return i7;
    }

    public CarouselSnapHelper(boolean z) {
        this.disableFling = z;
    }
}
