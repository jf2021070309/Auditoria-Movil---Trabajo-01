package com.amazon.aps.iva.f5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e0;
import com.amazon.aps.iva.f5.b0;
import com.amazon.aps.iva.f5.j;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.Cast;
import java.util.ArrayList;
import okhttp3.internal.http2.Http2;
/* compiled from: BaseGridView.java */
/* loaded from: classes.dex */
public abstract class b extends RecyclerView {
    public final f b;
    public boolean c;
    public boolean d;
    public RecyclerView.m e;
    public RecyclerView.x f;
    public int g;

    /* compiled from: BaseGridView.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: BaseGridView.java */
    /* renamed from: com.amazon.aps.iva.f5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0239b {
    }

    /* compiled from: BaseGridView.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    /* compiled from: BaseGridView.java */
    /* loaded from: classes.dex */
    public interface d {
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = true;
        this.d = true;
        this.g = 4;
        f fVar = new f(this);
        this.b = fVar;
        setLayoutManager(fVar);
        setPreserveFocusAfterLayout(false);
        setDescendantFocusability(262144);
        setHasFixedSize(true);
        setChildrenDrawingOrderEnabled(true);
        setWillNotDraw(true);
        setOverScrollMode(2);
        ((e0) getItemAnimator()).g = false;
        super.setRecyclerListener(new com.amazon.aps.iva.f5.a(this));
    }

    public final void b1(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        int i3;
        int i4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.d5.a.c);
        boolean z = obtainStyledAttributes.getBoolean(4, false);
        boolean z2 = obtainStyledAttributes.getBoolean(3, false);
        f fVar = this.b;
        int i5 = fVar.k & (-6145);
        if (z) {
            i = 2048;
        } else {
            i = 0;
        }
        int i6 = i | i5;
        if (z2) {
            i2 = 4096;
        } else {
            i2 = 0;
        }
        fVar.k = i6 | i2;
        boolean z3 = obtainStyledAttributes.getBoolean(6, true);
        boolean z4 = obtainStyledAttributes.getBoolean(5, true);
        int i7 = fVar.k & (-24577);
        if (z3) {
            i3 = 8192;
        } else {
            i3 = 0;
        }
        int i8 = i3 | i7;
        if (z4) {
            i4 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i4 = 0;
        }
        fVar.k = i8 | i4;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, obtainStyledAttributes.getDimensionPixelSize(8, 0));
        if (fVar.c == 1) {
            fVar.z = dimensionPixelSize;
            fVar.A = dimensionPixelSize;
        } else {
            fVar.z = dimensionPixelSize;
            fVar.B = dimensionPixelSize;
        }
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, obtainStyledAttributes.getDimensionPixelSize(7, 0));
        if (fVar.c == 0) {
            fVar.y = dimensionPixelSize2;
            fVar.A = dimensionPixelSize2;
        } else {
            fVar.y = dimensionPixelSize2;
            fVar.B = dimensionPixelSize2;
        }
        if (obtainStyledAttributes.hasValue(0)) {
            setGravity(obtainStyledAttributes.getInt(0, 0));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchGenericFocusedEvent(MotionEvent motionEvent) {
        return super.dispatchGenericFocusedEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final View focusSearch(int i) {
        if (isFocused()) {
            f fVar = this.b;
            View findViewByPosition = fVar.findViewByPosition(fVar.m);
            if (findViewByPosition != null) {
                return focusSearch(findViewByPosition, i);
            }
        }
        return super.focusSearch(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int indexOfChild;
        f fVar = this.b;
        View findViewByPosition = fVar.findViewByPosition(fVar.m);
        if (findViewByPosition != null && i2 >= (indexOfChild = indexOfChild(findViewByPosition))) {
            if (i2 < i - 1) {
                indexOfChild = ((indexOfChild + i) - 1) - i2;
            }
            return indexOfChild;
        }
        return i2;
    }

    public int getExtraLayoutSpace() {
        return this.b.K;
    }

    public int getFocusScrollStrategy() {
        return this.b.G;
    }

    @Deprecated
    public int getHorizontalMargin() {
        return this.b.y;
    }

    public int getHorizontalSpacing() {
        return this.b.y;
    }

    public int getInitialPrefetchItemCount() {
        return this.g;
    }

    public int getItemAlignmentOffset() {
        return this.b.I.c.b;
    }

    public float getItemAlignmentOffsetPercent() {
        return this.b.I.c.c;
    }

    public int getItemAlignmentViewId() {
        return this.b.I.c.a;
    }

    public d getOnUnhandledKeyListener() {
        return null;
    }

    public final int getSaveChildrenLimitNumber() {
        return this.b.M.b;
    }

    public final int getSaveChildrenPolicy() {
        return this.b.M.a;
    }

    public int getSelectedPosition() {
        return this.b.m;
    }

    public int getSelectedSubPosition() {
        return this.b.n;
    }

    @Deprecated
    public int getVerticalMargin() {
        return this.b.z;
    }

    public int getVerticalSpacing() {
        return this.b.z;
    }

    public int getWindowAlignment() {
        return this.b.H.c.f;
    }

    public int getWindowAlignmentOffset() {
        return this.b.H.c.g;
    }

    public float getWindowAlignmentOffsetPercent() {
        return this.b.H.c.h;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.d;
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        f fVar = this.b;
        if (z) {
            int i2 = fVar.m;
            while (true) {
                View findViewByPosition = fVar.findViewByPosition(i2);
                if (findViewByPosition != null) {
                    if (findViewByPosition.getVisibility() == 0 && findViewByPosition.hasFocusable()) {
                        findViewByPosition.requestFocus();
                        return;
                    }
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            fVar.getClass();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        f fVar = this.b;
        int i5 = fVar.G;
        if (i5 != 1 && i5 != 2) {
            View findViewByPosition = fVar.findViewByPosition(fVar.m);
            if (findViewByPosition == null) {
                return false;
            }
            return findViewByPosition.requestFocus(i, rect);
        }
        int childCount = fVar.getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        b0.a aVar = fVar.H.c;
        int i6 = aVar.j;
        int i7 = ((aVar.i - i6) - aVar.k) + i6;
        while (i2 != i3) {
            View childAt = fVar.getChildAt(i2);
            if (childAt.getVisibility() == 0 && fVar.n(childAt) >= i6 && fVar.m(childAt) <= i7 && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        int i2;
        f fVar = this.b;
        boolean z = false;
        if (fVar.c == 0) {
            if (i == 1) {
                i2 = 262144;
            }
            i2 = 0;
        } else {
            if (i == 1) {
                i2 = 524288;
            }
            i2 = 0;
        }
        int i3 = fVar.k;
        if ((786432 & i3) != i2) {
            fVar.k = i2 | (i3 & (-786433)) | 256;
            b0.a aVar = fVar.H.b;
            if (i == 1) {
                z = true;
            }
            aVar.l = z;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void scrollToPosition(int i) {
        boolean z;
        f fVar = this.b;
        if ((fVar.k & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            fVar.H(i, false);
        } else {
            super.scrollToPosition(i);
        }
    }

    public void setAnimateChildLayout(boolean z) {
        if (this.c != z) {
            this.c = z;
            if (!z) {
                this.e = getItemAnimator();
                super.setItemAnimator(null);
                return;
            }
            super.setItemAnimator(this.e);
        }
    }

    public void setChildrenVisibility(int i) {
        f fVar = this.b;
        fVar.s = i;
        if (i != -1) {
            int childCount = fVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                fVar.getChildAt(i2).setVisibility(fVar.s);
            }
        }
    }

    public void setExtraLayoutSpace(int i) {
        f fVar = this.b;
        int i2 = fVar.K;
        if (i2 != i) {
            if (i2 >= 0) {
                fVar.K = i;
                fVar.requestLayout();
                return;
            }
            throw new IllegalArgumentException("ExtraLayoutSpace must >= 0");
        }
    }

    public void setFocusDrawingOrderEnabled(boolean z) {
        super.setChildrenDrawingOrderEnabled(z);
    }

    public void setFocusScrollStrategy(int i) {
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException("Invalid scrollStrategy");
        }
        this.b.G = i;
        requestLayout();
    }

    public final void setFocusSearchDisabled(boolean z) {
        int i;
        int i2;
        if (z) {
            i = 393216;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
        f fVar = this.b;
        int i3 = fVar.k & (-32769);
        if (z) {
            i2 = 32768;
        } else {
            i2 = 0;
        }
        fVar.k = i2 | i3;
    }

    public void setGravity(int i) {
        this.b.C = i;
        requestLayout();
    }

    public void setHasOverlappingRendering(boolean z) {
        this.d = z;
    }

    @Deprecated
    public void setHorizontalMargin(int i) {
        setHorizontalSpacing(i);
    }

    public void setHorizontalSpacing(int i) {
        f fVar = this.b;
        if (fVar.c == 0) {
            fVar.y = i;
            fVar.A = i;
        } else {
            fVar.y = i;
            fVar.B = i;
        }
        requestLayout();
    }

    public void setInitialPrefetchItemCount(int i) {
        this.g = i;
    }

    public void setItemAlignmentOffset(int i) {
        f fVar = this.b;
        fVar.I.c.b = i;
        fVar.I();
        requestLayout();
    }

    public void setItemAlignmentOffsetPercent(float f) {
        f fVar = this.b;
        j.a aVar = fVar.I.c;
        aVar.getClass();
        if ((f >= 0.0f && f <= 100.0f) || f == -1.0f) {
            aVar.c = f;
            fVar.I();
            requestLayout();
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setItemAlignmentOffsetWithPadding(boolean z) {
        f fVar = this.b;
        fVar.I.c.d = z;
        fVar.I();
        requestLayout();
    }

    public void setItemAlignmentViewId(int i) {
        f fVar = this.b;
        fVar.I.c.a = i;
        fVar.I();
    }

    @Deprecated
    public void setItemMargin(int i) {
        setItemSpacing(i);
    }

    public void setItemSpacing(int i) {
        f fVar = this.b;
        fVar.y = i;
        fVar.z = i;
        fVar.B = i;
        fVar.A = i;
        requestLayout();
    }

    public void setLayoutEnabled(boolean z) {
        boolean z2;
        f fVar = this.b;
        int i = fVar.k;
        int i2 = 0;
        if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            int i3 = i & (-513);
            if (z) {
                i2 = AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            fVar.k = i3 | i2;
            fVar.requestLayout();
        }
    }

    public void setOnChildLaidOutListener(n nVar) {
        this.b.getClass();
    }

    public void setOnChildSelectedListener(o oVar) {
        this.b.getClass();
    }

    public void setOnChildViewHolderSelectedListener(p pVar) {
        f fVar = this.b;
        if (pVar == null) {
            fVar.l = null;
            return;
        }
        ArrayList<p> arrayList = fVar.l;
        if (arrayList == null) {
            fVar.l = new ArrayList<>();
        } else {
            arrayList.clear();
        }
        fVar.l.add(pVar);
    }

    public void setPruneChild(boolean z) {
        boolean z2;
        f fVar = this.b;
        int i = fVar.k;
        int i2 = Cast.MAX_MESSAGE_LENGTH;
        if ((i & Cast.MAX_MESSAGE_LENGTH) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            int i3 = i & (-65537);
            if (!z) {
                i2 = 0;
            }
            fVar.k = i3 | i2;
            if (z) {
                fVar.requestLayout();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setRecyclerListener(RecyclerView.x xVar) {
        this.f = xVar;
    }

    public final void setSaveChildrenLimitNumber(int i) {
        a0 a0Var = this.b.M;
        a0Var.b = i;
        a0Var.a();
    }

    public final void setSaveChildrenPolicy(int i) {
        a0 a0Var = this.b.M;
        a0Var.a = i;
        a0Var.a();
    }

    public void setScrollEnabled(boolean z) {
        boolean z2;
        int i;
        f fVar = this.b;
        int i2 = fVar.k;
        int i3 = 0;
        if ((i2 & 131072) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            int i4 = i2 & (-131073);
            if (z) {
                i3 = 131072;
            }
            int i5 = i4 | i3;
            fVar.k = i5;
            if ((i5 & 131072) != 0 && fVar.G == 0 && (i = fVar.m) != -1) {
                fVar.D(i, fVar.n, fVar.r, true);
            }
        }
    }

    public void setSelectedPosition(int i) {
        this.b.H(i, false);
    }

    public void setSelectedPositionSmooth(int i) {
        this.b.H(i, true);
    }

    @Deprecated
    public void setVerticalMargin(int i) {
        setVerticalSpacing(i);
    }

    public void setVerticalSpacing(int i) {
        f fVar = this.b;
        if (fVar.c == 1) {
            fVar.z = i;
            fVar.A = i;
        } else {
            fVar.z = i;
            fVar.B = i;
        }
        requestLayout();
    }

    public void setWindowAlignment(int i) {
        this.b.H.c.f = i;
        requestLayout();
    }

    public void setWindowAlignmentOffset(int i) {
        this.b.H.c.g = i;
        requestLayout();
    }

    public void setWindowAlignmentOffsetPercent(float f) {
        b0.a aVar = this.b.H.c;
        aVar.getClass();
        if ((f >= 0.0f && f <= 100.0f) || f == -1.0f) {
            aVar.h = f;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setWindowAlignmentPreferKeyLineOverHighEdge(boolean z) {
        int i;
        b0.a aVar = this.b.H.c;
        if (z) {
            i = aVar.e | 2;
        } else {
            i = aVar.e & (-3);
        }
        aVar.e = i;
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverLowEdge(boolean z) {
        int i;
        b0.a aVar = this.b.H.c;
        if (z) {
            i = aVar.e | 1;
        } else {
            i = aVar.e & (-2);
        }
        aVar.e = i;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void smoothScrollToPosition(int i) {
        boolean z;
        f fVar = this.b;
        if ((fVar.k & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            fVar.H(i, false);
        } else {
            super.smoothScrollToPosition(i);
        }
    }

    public void setOnKeyInterceptListener(a aVar) {
    }

    public void setOnMotionInterceptListener(InterfaceC0239b interfaceC0239b) {
    }

    public void setOnTouchInterceptListener(c cVar) {
    }

    public void setOnUnhandledKeyListener(d dVar) {
    }
}
