package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.amazon.aps.iva.b6.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.g3.e;
import com.amazon.aps.iva.q.c0;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.KeylineState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public class CarouselLayoutManager extends RecyclerView.p implements Carousel, RecyclerView.a0.b {
    public static final int HORIZONTAL = 0;
    private static final String TAG = "CarouselLayoutManager";
    public static final int VERTICAL = 1;
    private CarouselStrategy carouselStrategy;
    private int currentFillStartPosition;
    private KeylineState currentKeylineState;
    private final DebugItemDecoration debugItemDecoration;
    private boolean isDebuggingEnabled;
    private KeylineStateList keylineStateList;
    private Map<Integer, KeylineState> keylineStatePositionMap;
    int maxScroll;
    int minScroll;
    private CarouselOrientationHelper orientationHelper;
    int scrollOffset;

    /* loaded from: classes3.dex */
    public static final class ChildCalculations {
        final float center;
        final View child;
        final float offsetCenter;
        final KeylineRange range;

        public ChildCalculations(View view, float f, float f2, KeylineRange keylineRange) {
            this.child = view;
            this.center = f;
            this.offsetCenter = f2;
            this.range = keylineRange;
        }
    }

    /* loaded from: classes3.dex */
    public static class DebugItemDecoration extends RecyclerView.o {
        private List<KeylineState.Keyline> keylines;
        private final Paint linePaint;

        public DebugItemDecoration() {
            Paint paint = new Paint();
            this.linePaint = paint;
            this.keylines = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            super.onDrawOver(canvas, recyclerView, b0Var);
            this.linePaint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (KeylineState.Keyline keyline : this.keylines) {
                this.linePaint.setColor(e.c(-65281, -16776961, keyline.mask));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).isHorizontal()) {
                    canvas.drawLine(keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentTop(), keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentBottom(), this.linePaint);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentLeft(), keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentRight(), keyline.locOffset, this.linePaint);
                }
            }
        }

        public void setKeylines(List<KeylineState.Keyline> list) {
            this.keylines = Collections.unmodifiableList(list);
        }
    }

    /* loaded from: classes3.dex */
    public static class KeylineRange {
        final KeylineState.Keyline leftOrTop;
        final KeylineState.Keyline rightOrBottom;

        public KeylineRange(KeylineState.Keyline keyline, KeylineState.Keyline keyline2) {
            boolean z;
            if (keyline.loc <= keyline2.loc) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.leftOrTop = keyline;
                this.rightOrBottom = keyline2;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    public CarouselLayoutManager() {
        this(new MultiBrowseCarouselStrategy());
    }

    private void addAndLayoutView(View view, int i, ChildCalculations childCalculations) {
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        addView(view, i);
        float f = childCalculations.offsetCenter;
        this.orientationHelper.layoutDecoratedWithMargins(view, (int) (f - itemSize), (int) (f + itemSize));
        updateChildMaskForLocation(view, childCalculations.center, childCalculations.range);
    }

    private int addEnd(int i, int i2) {
        if (isLayoutRtl()) {
            return i - i2;
        }
        return i + i2;
    }

    private int addStart(int i, int i2) {
        if (isLayoutRtl()) {
            return i + i2;
        }
        return i - i2;
    }

    private void addViewsEnd(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i) {
        int calculateChildStartForFill = calculateChildStartForFill(i);
        while (i < b0Var.b()) {
            ChildCalculations makeChildCalculations = makeChildCalculations(wVar, calculateChildStartForFill, i);
            if (!isLocOffsetOutOfFillBoundsEnd(makeChildCalculations.offsetCenter, makeChildCalculations.range)) {
                calculateChildStartForFill = addEnd(calculateChildStartForFill, (int) this.currentKeylineState.getItemSize());
                if (!isLocOffsetOutOfFillBoundsStart(makeChildCalculations.offsetCenter, makeChildCalculations.range)) {
                    addAndLayoutView(makeChildCalculations.child, -1, makeChildCalculations);
                }
                i++;
            } else {
                return;
            }
        }
    }

    private void addViewsStart(RecyclerView.w wVar, int i) {
        int calculateChildStartForFill = calculateChildStartForFill(i);
        while (i >= 0) {
            ChildCalculations makeChildCalculations = makeChildCalculations(wVar, calculateChildStartForFill, i);
            if (!isLocOffsetOutOfFillBoundsStart(makeChildCalculations.offsetCenter, makeChildCalculations.range)) {
                calculateChildStartForFill = addStart(calculateChildStartForFill, (int) this.currentKeylineState.getItemSize());
                if (!isLocOffsetOutOfFillBoundsEnd(makeChildCalculations.offsetCenter, makeChildCalculations.range)) {
                    addAndLayoutView(makeChildCalculations.child, 0, makeChildCalculations);
                }
                i--;
            } else {
                return;
            }
        }
    }

    private float calculateChildOffsetCenterForLocation(View view, float f, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.leftOrTop;
        float f2 = keyline.locOffset;
        KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
        float lerp = AnimationUtils.lerp(f2, keyline2.locOffset, keyline.loc, keyline2.loc, f);
        if (keylineRange.rightOrBottom == this.currentKeylineState.getFirstKeyline() || keylineRange.leftOrTop == this.currentKeylineState.getLastKeyline()) {
            float maskMargins = this.orientationHelper.getMaskMargins((RecyclerView.q) view.getLayoutParams()) / this.currentKeylineState.getItemSize();
            KeylineState.Keyline keyline3 = keylineRange.rightOrBottom;
            return lerp + (((1.0f - keyline3.mask) + maskMargins) * (f - keyline3.loc));
        }
        return lerp;
    }

    private int calculateChildStartForFill(int i) {
        return addEnd(getParentStart() - this.scrollOffset, (int) (this.currentKeylineState.getItemSize() * i));
    }

    private int calculateEndScroll(RecyclerView.b0 b0Var, KeylineStateList keylineStateList) {
        KeylineState endState;
        KeylineState.Keyline lastFocalKeyline;
        float f;
        boolean isLayoutRtl = isLayoutRtl();
        if (isLayoutRtl) {
            endState = keylineStateList.getStartState();
        } else {
            endState = keylineStateList.getEndState();
        }
        if (isLayoutRtl) {
            lastFocalKeyline = endState.getFirstFocalKeyline();
        } else {
            lastFocalKeyline = endState.getLastFocalKeyline();
        }
        float b = ((b0Var.b() - 1) * endState.getItemSize()) + getPaddingEnd();
        if (isLayoutRtl) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        float f2 = b * f;
        float parentStart = lastFocalKeyline.loc - getParentStart();
        float parentEnd = getParentEnd() - lastFocalKeyline.loc;
        if (Math.abs(parentStart) > Math.abs(f2)) {
            return 0;
        }
        return (int) ((f2 - parentStart) + parentEnd);
    }

    private static int calculateShouldScrollBy(int i, int i2, int i3, int i4) {
        int i5 = i2 + i;
        if (i5 < i3) {
            return i3 - i2;
        }
        if (i5 > i4) {
            return i4 - i2;
        }
        return i;
    }

    private int calculateStartScroll(KeylineStateList keylineStateList) {
        KeylineState startState;
        KeylineState.Keyline firstFocalKeyline;
        int i;
        boolean isLayoutRtl = isLayoutRtl();
        if (isLayoutRtl) {
            startState = keylineStateList.getEndState();
        } else {
            startState = keylineStateList.getStartState();
        }
        if (isLayoutRtl) {
            firstFocalKeyline = startState.getLastFocalKeyline();
        } else {
            firstFocalKeyline = startState.getFirstFocalKeyline();
        }
        int paddingStart = getPaddingStart();
        if (isLayoutRtl) {
            i = 1;
        } else {
            i = -1;
        }
        return (int) (((paddingStart * i) + getParentStart()) - addStart((int) firstFocalKeyline.loc, (int) (startState.getItemSize() / 2.0f)));
    }

    private void fill(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        removeAndRecycleOutOfBoundsViews(wVar);
        if (getChildCount() == 0) {
            addViewsStart(wVar, this.currentFillStartPosition - 1);
            addViewsEnd(wVar, b0Var, this.currentFillStartPosition);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            addViewsStart(wVar, position - 1);
            addViewsEnd(wVar, b0Var, position2 + 1);
        }
        validateChildOrderIfDebugging();
    }

    private int getContainerSize() {
        if (isHorizontal()) {
            return getContainerWidth();
        }
        return getContainerHeight();
    }

    private float getDecoratedCenterXWithMargins(View view) {
        Rect rect = new Rect();
        super.getDecoratedBoundsWithMargins(view, rect);
        return rect.centerX();
    }

    private KeylineState getKeylineStateForPosition(int i) {
        KeylineState keylineState;
        Map<Integer, KeylineState> map = this.keylineStatePositionMap;
        if (map != null && (keylineState = map.get(Integer.valueOf(w.q(i, 0, Math.max(0, getItemCount() - 1))))) != null) {
            return keylineState;
        }
        return this.keylineStateList.getDefaultState();
    }

    private float getMaskedItemSizeForLocOffset(float f, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.leftOrTop;
        float f2 = keyline.maskedItemSize;
        KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
        return AnimationUtils.lerp(f2, keyline2.maskedItemSize, keyline.locOffset, keyline2.locOffset, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentBottom() {
        return this.orientationHelper.getParentBottom();
    }

    private int getParentEnd() {
        return this.orientationHelper.getParentEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentLeft() {
        return this.orientationHelper.getParentLeft();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentRight() {
        return this.orientationHelper.getParentRight();
    }

    private int getParentStart() {
        return this.orientationHelper.getParentStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentTop() {
        return this.orientationHelper.getParentTop();
    }

    private int getScrollOffsetForPosition(int i, KeylineState keylineState) {
        if (isLayoutRtl()) {
            return (int) (((getContainerSize() - keylineState.getLastFocalKeyline().loc) - (i * keylineState.getItemSize())) - (keylineState.getItemSize() / 2.0f));
        }
        return (int) ((keylineState.getItemSize() / 2.0f) + ((i * keylineState.getItemSize()) - keylineState.getFirstFocalKeyline().loc));
    }

    private static KeylineRange getSurroundingKeylineRange(List<KeylineState.Keyline> list, float f, boolean z) {
        float f2;
        float f3 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f4 = -3.4028235E38f;
        float f5 = Float.MAX_VALUE;
        float f6 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            KeylineState.Keyline keyline = list.get(i5);
            if (z) {
                f2 = keyline.locOffset;
            } else {
                f2 = keyline.loc;
            }
            float abs = Math.abs(f2 - f);
            if (f2 <= f && abs <= f3) {
                i = i5;
                f3 = abs;
            }
            if (f2 > f && abs <= f5) {
                i3 = i5;
                f5 = abs;
            }
            if (f2 <= f6) {
                i2 = i5;
                f6 = f2;
            }
            if (f2 > f4) {
                i4 = i5;
                f4 = f2;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new KeylineRange(list.get(i), list.get(i3));
    }

    private boolean isLocOffsetOutOfFillBoundsEnd(float f, KeylineRange keylineRange) {
        int addStart = addStart((int) f, (int) (getMaskedItemSizeForLocOffset(f, keylineRange) / 2.0f));
        if (isLayoutRtl()) {
            if (addStart < 0) {
                return true;
            }
        } else if (addStart > getContainerSize()) {
            return true;
        }
        return false;
    }

    private boolean isLocOffsetOutOfFillBoundsStart(float f, KeylineRange keylineRange) {
        int addEnd = addEnd((int) f, (int) (getMaskedItemSizeForLocOffset(f, keylineRange) / 2.0f));
        if (isLayoutRtl()) {
            if (addEnd > getContainerSize()) {
                return true;
            }
        } else if (addEnd < 0) {
            return true;
        }
        return false;
    }

    private void logChildrenIfDebugging() {
        if (this.isDebuggingEnabled && Log.isLoggable(TAG, 3)) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                getDecoratedCenterXWithMargins(childAt);
                getPosition(childAt);
            }
        }
    }

    private ChildCalculations makeChildCalculations(RecyclerView.w wVar, float f, int i) {
        View d = wVar.d(i);
        measureChildWithMargins(d, 0, 0);
        float addEnd = addEnd((int) f, (int) (this.currentKeylineState.getItemSize() / 2.0f));
        KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), addEnd, false);
        return new ChildCalculations(d, addEnd, calculateChildOffsetCenterForLocation(d, addEnd, surroundingKeylineRange), surroundingKeylineRange);
    }

    private void offsetChild(View view, float f, float f2, Rect rect) {
        float addEnd = addEnd((int) f, (int) f2);
        KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), addEnd, false);
        float calculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(view, addEnd, surroundingKeylineRange);
        super.getDecoratedBoundsWithMargins(view, rect);
        updateChildMaskForLocation(view, addEnd, surroundingKeylineRange);
        this.orientationHelper.offsetChild(view, rect, f2, calculateChildOffsetCenterForLocation);
    }

    private void refreshKeylineState() {
        this.keylineStateList = null;
        requestLayout();
    }

    private void removeAndRecycleOutOfBoundsViews(RecyclerView.w wVar) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            float decoratedCenterXWithMargins = getDecoratedCenterXWithMargins(childAt);
            if (!isLocOffsetOutOfFillBoundsStart(decoratedCenterXWithMargins, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterXWithMargins, true))) {
                break;
            }
            removeAndRecycleView(childAt, wVar);
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            float decoratedCenterXWithMargins2 = getDecoratedCenterXWithMargins(childAt2);
            if (isLocOffsetOutOfFillBoundsEnd(decoratedCenterXWithMargins2, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterXWithMargins2, true))) {
                removeAndRecycleView(childAt2, wVar);
            } else {
                return;
            }
        }
    }

    private int scrollBy(int i, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        int calculateShouldScrollBy = calculateShouldScrollBy(i, this.scrollOffset, this.minScroll, this.maxScroll);
        this.scrollOffset += calculateShouldScrollBy;
        updateCurrentKeylineStateForScrollOffset();
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        int calculateChildStartForFill = calculateChildStartForFill(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            offsetChild(getChildAt(i2), calculateChildStartForFill, itemSize, rect);
            calculateChildStartForFill = addEnd(calculateChildStartForFill, (int) this.currentKeylineState.getItemSize());
        }
        fill(wVar, b0Var);
        return calculateShouldScrollBy;
    }

    private void updateChildMaskForLocation(View view, float f, KeylineRange keylineRange) {
        if (!(view instanceof Maskable)) {
            return;
        }
        KeylineState.Keyline keyline = keylineRange.leftOrTop;
        float f2 = keyline.mask;
        KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
        float lerp = AnimationUtils.lerp(f2, keyline2.mask, keyline.loc, keyline2.loc, f);
        float height = view.getHeight();
        float width = view.getWidth();
        RectF maskRect = this.orientationHelper.getMaskRect(height, width, AnimationUtils.lerp(0.0f, height / 2.0f, 0.0f, 1.0f, lerp), AnimationUtils.lerp(0.0f, width / 2.0f, 0.0f, 1.0f, lerp));
        float calculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(view, f, keylineRange);
        RectF rectF = new RectF(calculateChildOffsetCenterForLocation - (maskRect.width() / 2.0f), calculateChildOffsetCenterForLocation - (maskRect.height() / 2.0f), (maskRect.width() / 2.0f) + calculateChildOffsetCenterForLocation, (maskRect.height() / 2.0f) + calculateChildOffsetCenterForLocation);
        RectF rectF2 = new RectF(getParentLeft(), getParentTop(), getParentRight(), getParentBottom());
        if (this.carouselStrategy.isContained()) {
            this.orientationHelper.containMaskWithinBounds(maskRect, rectF, rectF2);
        }
        this.orientationHelper.moveMaskOnEdgeOutsideBounds(maskRect, rectF, rectF2);
        ((Maskable) view).setMaskRectF(maskRect);
    }

    private void updateCurrentKeylineStateForScrollOffset() {
        KeylineState startState;
        int i = this.maxScroll;
        int i2 = this.minScroll;
        if (i <= i2) {
            if (isLayoutRtl()) {
                startState = this.keylineStateList.getEndState();
            } else {
                startState = this.keylineStateList.getStartState();
            }
            this.currentKeylineState = startState;
        } else {
            this.currentKeylineState = this.keylineStateList.getShiftedState(this.scrollOffset, i2, i);
        }
        this.debugItemDecoration.setKeylines(this.currentKeylineState.getKeylines());
    }

    private void validateChildOrderIfDebugging() {
        if (this.isDebuggingEnabled && getChildCount() >= 1) {
            int i = 0;
            while (i < getChildCount() - 1) {
                int position = getPosition(getChildAt(i));
                int i2 = i + 1;
                int position2 = getPosition(getChildAt(i2));
                if (position <= position2) {
                    i = i2;
                } else {
                    logChildrenIfDebugging();
                    StringBuilder a = x.a("Detected invalid child order. Child at index [", i, "] had adapter position [", position, "] and child at index [");
                    a.append(i2);
                    a.append("] had adapter position [");
                    a.append(position2);
                    a.append("].");
                    throw new IllegalStateException(a.toString());
                }
            }
        }
    }

    public int calculateScrollDeltaToMakePositionVisible(int i) {
        return (int) (this.scrollOffset - getScrollOffsetForPosition(i, getKeylineStateForPosition(i)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollHorizontally() {
        return isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollVertically() {
        return !isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollExtent(RecyclerView.b0 b0Var) {
        return (int) this.keylineStateList.getDefaultState().getItemSize();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollOffset(RecyclerView.b0 b0Var) {
        return this.scrollOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollRange(RecyclerView.b0 b0Var) {
        return this.maxScroll - this.minScroll;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF computeScrollVectorForPosition(int i) {
        if (this.keylineStateList == null) {
            return null;
        }
        int offsetToScrollToPosition = getOffsetToScrollToPosition(i, getKeylineStateForPosition(i));
        if (isHorizontal()) {
            return new PointF(offsetToScrollToPosition, 0.0f);
        }
        return new PointF(0.0f, offsetToScrollToPosition);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollExtent(RecyclerView.b0 b0Var) {
        return (int) this.keylineStateList.getDefaultState().getItemSize();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollOffset(RecyclerView.b0 b0Var) {
        return this.scrollOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollRange(RecyclerView.b0 b0Var) {
        return this.maxScroll - this.minScroll;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateDefaultLayoutParams() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerHeight() {
        return getHeight();
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerWidth() {
        return getWidth();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float centerX = rect.centerX();
        float width = (rect.width() - getMaskedItemSizeForLocOffset(centerX, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), centerX, true))) / 2.0f;
        rect.set((int) (rect.left + width), rect.top, (int) (rect.right - width), rect.bottom);
    }

    public int getOffsetToScrollToPosition(int i, KeylineState keylineState) {
        return getScrollOffsetForPosition(i, keylineState) - this.scrollOffset;
    }

    public int getOffsetToScrollToPositionForSnap(int i, boolean z) {
        int i2;
        int offsetToScrollToPosition = getOffsetToScrollToPosition(i, this.keylineStateList.getShiftedState(this.scrollOffset, this.minScroll, this.maxScroll, true));
        if (this.keylineStatePositionMap != null) {
            i2 = getOffsetToScrollToPosition(i, getKeylineStateForPosition(i));
        } else {
            i2 = offsetToScrollToPosition;
        }
        if (z && Math.abs(i2) < Math.abs(offsetToScrollToPosition)) {
            return i2;
        }
        return offsetToScrollToPosition;
    }

    public int getOrientation() {
        return this.orientationHelper.orientation;
    }

    @Override // com.google.android.material.carousel.Carousel
    public boolean isHorizontal() {
        if (this.orientationHelper.orientation == 0) {
            return true;
        }
        return false;
    }

    public boolean isLayoutRtl() {
        if (isHorizontal() && getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void measureChildWithMargins(View view, int i, int i2) {
        float f;
        float f2;
        if (view instanceof Maskable) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            Rect rect = new Rect();
            calculateItemDecorationsForChild(view, rect);
            int i3 = rect.left + rect.right + i;
            int i4 = rect.top + rect.bottom + i2;
            KeylineStateList keylineStateList = this.keylineStateList;
            if (keylineStateList != null && this.orientationHelper.orientation == 0) {
                f = keylineStateList.getDefaultState().getItemSize();
            } else {
                f = ((ViewGroup.MarginLayoutParams) qVar).width;
            }
            KeylineStateList keylineStateList2 = this.keylineStateList;
            if (keylineStateList2 != null && this.orientationHelper.orientation == 1) {
                f2 = keylineStateList2.getDefaultState().getItemSize();
            } else {
                f2 = ((ViewGroup.MarginLayoutParams) qVar).height;
            }
            view.measure(RecyclerView.p.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i3, (int) f, canScrollHorizontally()), RecyclerView.p.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i4, (int) f2, canScrollVertically()));
            return;
        }
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutChildren(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        boolean z;
        int i;
        if (b0Var.b() <= 0) {
            removeAndRecycleAllViews(wVar);
            this.currentFillStartPosition = 0;
            return;
        }
        boolean isLayoutRtl = isLayoutRtl();
        if (this.keylineStateList == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View d = wVar.d(0);
            measureChildWithMargins(d, 0, 0);
            KeylineState onFirstChildMeasuredWithMargins = this.carouselStrategy.onFirstChildMeasuredWithMargins(this, d);
            if (isLayoutRtl) {
                onFirstChildMeasuredWithMargins = KeylineState.reverse(onFirstChildMeasuredWithMargins);
            }
            this.keylineStateList = KeylineStateList.from(this, onFirstChildMeasuredWithMargins);
        }
        int calculateStartScroll = calculateStartScroll(this.keylineStateList);
        int calculateEndScroll = calculateEndScroll(b0Var, this.keylineStateList);
        if (isLayoutRtl) {
            i = calculateEndScroll;
        } else {
            i = calculateStartScroll;
        }
        this.minScroll = i;
        if (isLayoutRtl) {
            calculateEndScroll = calculateStartScroll;
        }
        this.maxScroll = calculateEndScroll;
        if (z) {
            this.scrollOffset = calculateStartScroll;
            this.keylineStatePositionMap = this.keylineStateList.getKeylineStateForPositionMap(getItemCount(), this.minScroll, this.maxScroll, isLayoutRtl());
        } else {
            int i2 = this.scrollOffset;
            this.scrollOffset = i2 + calculateShouldScrollBy(0, i2, i, calculateEndScroll);
        }
        this.currentFillStartPosition = w.q(this.currentFillStartPosition, 0, b0Var.b());
        updateCurrentKeylineStateForScrollOffset();
        detachAndScrapAttachedViews(wVar);
        fill(wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutCompleted(RecyclerView.b0 b0Var) {
        super.onLayoutCompleted(b0Var);
        if (getChildCount() == 0) {
            this.currentFillStartPosition = 0;
        } else {
            this.currentFillStartPosition = getPosition(getChildAt(0));
        }
        validateChildOrderIfDebugging();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        if (this.keylineStateList == null) {
            return false;
        }
        int offsetToScrollToPosition = getOffsetToScrollToPosition(getPosition(view), getKeylineStateForPosition(getPosition(view)));
        if (z2 || offsetToScrollToPosition == 0) {
            return false;
        }
        recyclerView.scrollBy(offsetToScrollToPosition, 0);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollHorizontallyBy(int i, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (canScrollHorizontally()) {
            return scrollBy(i, wVar, b0Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void scrollToPosition(int i) {
        if (this.keylineStateList == null) {
            return;
        }
        this.scrollOffset = getScrollOffsetForPosition(i, getKeylineStateForPosition(i));
        this.currentFillStartPosition = w.q(i, 0, Math.max(0, getItemCount() - 1));
        updateCurrentKeylineStateForScrollOffset();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollVerticallyBy(int i, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (canScrollVertically()) {
            return scrollBy(i, wVar, b0Var);
        }
        return 0;
    }

    public void setCarouselStrategy(CarouselStrategy carouselStrategy) {
        this.carouselStrategy = carouselStrategy;
        refreshKeylineState();
    }

    public void setDebuggingEnabled(RecyclerView recyclerView, boolean z) {
        this.isDebuggingEnabled = z;
        recyclerView.removeItemDecoration(this.debugItemDecoration);
        if (z) {
            recyclerView.addItemDecoration(this.debugItemDecoration);
        }
        recyclerView.invalidateItemDecorations();
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(c0.a("invalid orientation:", i));
        }
        assertNotInLayoutOrScroll(null);
        CarouselOrientationHelper carouselOrientationHelper = this.orientationHelper;
        if (carouselOrientationHelper == null || i != carouselOrientationHelper.orientation) {
            this.orientationHelper = CarouselOrientationHelper.createOrientationHelper(this, i);
            refreshKeylineState();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i) {
        u uVar = new u(recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselLayoutManager.1
            @Override // androidx.recyclerview.widget.u
            public int calculateDxToMakeVisible(View view, int i2) {
                if (CarouselLayoutManager.this.keylineStateList != null && CarouselLayoutManager.this.isHorizontal()) {
                    CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                    return carouselLayoutManager.calculateScrollDeltaToMakePositionVisible(carouselLayoutManager.getPosition(view));
                }
                return 0;
            }

            @Override // androidx.recyclerview.widget.u
            public int calculateDyToMakeVisible(View view, int i2) {
                if (CarouselLayoutManager.this.keylineStateList != null && !CarouselLayoutManager.this.isHorizontal()) {
                    CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                    return carouselLayoutManager.calculateScrollDeltaToMakePositionVisible(carouselLayoutManager.getPosition(view));
                }
                return 0;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.a0
            public PointF computeScrollVectorForPosition(int i2) {
                return CarouselLayoutManager.this.computeScrollVectorForPosition(i2);
            }
        };
        uVar.setTargetPosition(i);
        startSmoothScroll(uVar);
    }

    public CarouselLayoutManager(CarouselStrategy carouselStrategy) {
        this(carouselStrategy, 0);
    }

    public CarouselLayoutManager(CarouselStrategy carouselStrategy, int i) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new DebugItemDecoration();
        this.currentFillStartPosition = 0;
        setCarouselStrategy(carouselStrategy);
        setOrientation(i);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new DebugItemDecoration();
        this.currentFillStartPosition = 0;
        setOrientation(RecyclerView.p.getProperties(context, attributeSet, i, i2).a);
        setCarouselStrategy(new MultiBrowseCarouselStrategy());
    }
}
