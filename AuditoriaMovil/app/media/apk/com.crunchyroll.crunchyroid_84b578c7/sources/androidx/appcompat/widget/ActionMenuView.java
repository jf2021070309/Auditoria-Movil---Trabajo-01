package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.a;
import com.amazon.aps.iva.p3.n;
import com.amazon.aps.iva.q.m1;
import com.google.common.primitives.Ints;
import java.util.Iterator;
/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements f.b, k {
    public f b;
    public Context c;
    public int d;
    public boolean e;
    public androidx.appcompat.widget.a f;
    public j.a g;
    public f.a h;
    public boolean i;
    public int j;
    public final int k;
    public final int l;
    public e m;

    /* loaded from: classes.dex */
    public interface a {
        boolean G();

        boolean b1();
    }

    /* loaded from: classes.dex */
    public class d implements f.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean onMenuItemSelected(f fVar, MenuItem menuItem) {
            boolean z;
            boolean z2;
            e eVar = ActionMenuView.this.m;
            if (eVar == null) {
                return false;
            }
            Toolbar toolbar = Toolbar.this;
            Iterator<n> it = toolbar.mMenuHostHelper.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().c(menuItem)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                z2 = true;
            } else {
                Toolbar.h hVar = toolbar.mOnMenuItemClickListener;
                if (hVar != null) {
                    z2 = hVar.onMenuItemClick(menuItem);
                } else {
                    z2 = false;
                }
            }
            if (!z2) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void onMenuModeChange(f fVar) {
            f.a aVar = ActionMenuView.this.h;
            if (aVar != null) {
                aVar.onMenuModeChange(fVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    public ActionMenuView() {
        throw null;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.k = (int) (56.0f * f);
        this.l = (int) (f * 4.0f);
        this.c = context;
        this.d = 0;
    }

    public static c d(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams != null) {
            if (layoutParams instanceof c) {
                cVar = new c((c) layoutParams);
            } else {
                cVar = new c(layoutParams);
            }
            if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
            }
            return cVar;
        }
        c cVar2 = new c();
        ((LinearLayout.LayoutParams) cVar2).gravity = 16;
        return cVar2;
    }

    @Override // androidx.appcompat.view.menu.f.b
    public final boolean b(h hVar) {
        return this.b.performItemAction(hVar, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final boolean e(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            z = false | ((a) childAt).G();
        }
        if (i > 0 && (childAt2 instanceof a)) {
            return z | ((a) childAt2).b1();
        }
        return z;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c();
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return d(layoutParams);
    }

    public Menu getMenu() {
        if (this.b == null) {
            Context context = getContext();
            f fVar = new f(context);
            this.b = fVar;
            fVar.setCallback(new d());
            androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a(context);
            this.f = aVar;
            aVar.n = true;
            aVar.o = true;
            j.a aVar2 = this.g;
            if (aVar2 == null) {
                aVar2 = new b();
            }
            aVar.f = aVar2;
            this.b.addMenuPresenter(aVar, this.c);
            androidx.appcompat.widget.a aVar3 = this.f;
            aVar3.i = this;
            this.b = aVar3.d;
        }
        return this.b;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        androidx.appcompat.widget.a aVar = this.f;
        a.d dVar = aVar.k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (aVar.m) {
            return aVar.l;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.d;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void initialize(f fVar) {
        this.b = fVar;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.a aVar = this.f;
        if (aVar != null) {
            aVar.updateMenuView(false);
            if (this.f.c()) {
                this.f.b();
                this.f.e();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.a aVar = this.f;
        if (aVar != null) {
            aVar.b();
            a.C0007a c0007a = aVar.v;
            if (c0007a != null && c0007a.b()) {
                c0007a.j.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        if (!this.i) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = m1.a(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (e(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i6 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    e(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        if (i15 > 0) {
            i5 = paddingRight / i15;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (a2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.a) {
                    int i17 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.a) {
                int i20 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max + i20;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        int i6;
        int i7;
        int i8;
        ?? r4;
        boolean z6;
        int i9;
        int i10;
        int i11;
        ActionMenuItemView actionMenuItemView;
        boolean z7;
        int i12;
        boolean z8;
        f fVar;
        boolean z9 = this.i;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.i = z;
        if (z9 != z) {
            this.j = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.i && (fVar = this.b) != null && size != this.j) {
            this.j = size;
            fVar.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (this.i && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i);
            int size3 = View.MeasureSpec.getSize(i2);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
            int i13 = size2 - paddingRight;
            int i14 = this.k;
            int i15 = i13 / i14;
            int i16 = i13 % i14;
            if (i15 == 0) {
                setMeasuredDimension(i13, 0);
                return;
            }
            int i17 = (i16 / i15) + i14;
            int childCount2 = getChildCount();
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            boolean z10 = false;
            int i22 = 0;
            long j = 0;
            while (true) {
                i3 = this.l;
                if (i21 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i21);
                int i23 = size3;
                int i24 = i13;
                if (childAt.getVisibility() == 8) {
                    i10 = mode;
                    i11 = paddingBottom;
                } else {
                    boolean z11 = childAt instanceof ActionMenuItemView;
                    int i25 = i19 + 1;
                    if (z11) {
                        childAt.setPadding(i3, 0, i3, 0);
                    }
                    c cVar = (c) childAt.getLayoutParams();
                    cVar.f = false;
                    cVar.c = 0;
                    cVar.b = 0;
                    cVar.d = false;
                    ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
                    ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
                    if (z11 && ((ActionMenuItemView) childAt).U2()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    cVar.e = z6;
                    if (cVar.a) {
                        i9 = 1;
                    } else {
                        i9 = i15;
                    }
                    c cVar2 = (c) childAt.getLayoutParams();
                    i10 = mode;
                    i11 = paddingBottom;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z11) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && actionMenuItemView.U2()) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (i9 > 0 && (!z7 || i9 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i9 * i17, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i12 = measuredWidth / i17;
                        if (measuredWidth % i17 != 0) {
                            i12++;
                        }
                        if (z7 && i12 < 2) {
                            i12 = 2;
                        }
                    } else {
                        i12 = 0;
                    }
                    if (!cVar2.a && z7) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    cVar2.d = z8;
                    cVar2.b = i12;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17 * i12, Ints.MAX_POWER_OF_TWO), makeMeasureSpec);
                    i20 = Math.max(i20, i12);
                    if (cVar.d) {
                        i22++;
                    }
                    if (cVar.a) {
                        z10 = true;
                    }
                    i15 -= i12;
                    i18 = Math.max(i18, childAt.getMeasuredHeight());
                    if (i12 == 1) {
                        j |= 1 << i21;
                    }
                    i19 = i25;
                }
                i21++;
                size3 = i23;
                i13 = i24;
                paddingBottom = i11;
                mode = i10;
            }
            int i26 = mode;
            int i27 = i13;
            int i28 = size3;
            if (z10 && i19 == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z12 = false;
            while (i22 > 0 && i15 > 0) {
                int i29 = Integer.MAX_VALUE;
                int i30 = 0;
                int i31 = 0;
                long j2 = 0;
                while (i31 < childCount2) {
                    c cVar3 = (c) getChildAt(i31).getLayoutParams();
                    boolean z13 = z12;
                    if (cVar3.d) {
                        int i32 = cVar3.b;
                        if (i32 < i29) {
                            j2 = 1 << i31;
                            i29 = i32;
                            i30 = 1;
                        } else if (i32 == i29) {
                            j2 |= 1 << i31;
                            i30++;
                        }
                    }
                    i31++;
                    z12 = z13;
                }
                z3 = z12;
                j |= j2;
                if (i30 > i15) {
                    break;
                }
                int i33 = i29 + 1;
                int i34 = 0;
                while (i34 < childCount2) {
                    View childAt2 = getChildAt(i34);
                    c cVar4 = (c) childAt2.getLayoutParams();
                    int i35 = i18;
                    int i36 = childMeasureSpec;
                    int i37 = childCount2;
                    long j3 = 1 << i34;
                    if ((j2 & j3) == 0) {
                        if (cVar4.b == i33) {
                            j |= j3;
                        }
                    } else {
                        if (z2 && cVar4.e) {
                            r4 = 1;
                            r4 = 1;
                            if (i15 == 1) {
                                childAt2.setPadding(i3 + i17, 0, i3, 0);
                            }
                        } else {
                            r4 = 1;
                        }
                        cVar4.b += r4;
                        cVar4.f = r4;
                        i15--;
                    }
                    i34++;
                    childMeasureSpec = i36;
                    i18 = i35;
                    childCount2 = i37;
                }
                z12 = true;
            }
            z3 = z12;
            int i38 = i18;
            int i39 = childMeasureSpec;
            int i40 = childCount2;
            if (!z10 && i19 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i15 > 0 && j != 0 && (i15 < i19 - 1 || z4 || i20 > 1)) {
                float bitCount = Long.bitCount(j);
                if (!z4) {
                    if ((j & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).e) {
                        bitCount -= 0.5f;
                    }
                    int i41 = i40 - 1;
                    if ((j & (1 << i41)) != 0 && !((c) getChildAt(i41).getLayoutParams()).e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i8 = (int) ((i15 * i17) / bitCount);
                } else {
                    i8 = 0;
                }
                boolean z14 = z3;
                i4 = i40;
                for (int i42 = 0; i42 < i4; i42++) {
                    if ((j & (1 << i42)) != 0) {
                        View childAt3 = getChildAt(i42);
                        c cVar5 = (c) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            cVar5.c = i8;
                            cVar5.f = true;
                            if (i42 == 0 && !cVar5.e) {
                                ((LinearLayout.LayoutParams) cVar5).leftMargin = (-i8) / 2;
                            }
                            z14 = true;
                        } else {
                            if (cVar5.a) {
                                cVar5.c = i8;
                                cVar5.f = true;
                                ((LinearLayout.LayoutParams) cVar5).rightMargin = (-i8) / 2;
                                z14 = true;
                            } else {
                                if (i42 != 0) {
                                    ((LinearLayout.LayoutParams) cVar5).leftMargin = i8 / 2;
                                }
                                if (i42 != i4 - 1) {
                                    ((LinearLayout.LayoutParams) cVar5).rightMargin = i8 / 2;
                                }
                            }
                        }
                    }
                }
                z5 = z14;
            } else {
                i4 = i40;
                z5 = z3;
            }
            if (z5) {
                int i43 = 0;
                while (i43 < i4) {
                    View childAt4 = getChildAt(i43);
                    c cVar6 = (c) childAt4.getLayoutParams();
                    if (!cVar6.f) {
                        i7 = i39;
                    } else {
                        i7 = i39;
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar6.b * i17) + cVar6.c, Ints.MAX_POWER_OF_TWO), i7);
                    }
                    i43++;
                    i39 = i7;
                }
            }
            if (i26 != 1073741824) {
                i6 = i27;
                i5 = i38;
            } else {
                i5 = i28;
                i6 = i27;
            }
            setMeasuredDimension(i6, i5);
            return;
        }
        for (int i44 = 0; i44 < childCount; i44++) {
            c cVar7 = (c) getChildAt(i44).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar7).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar7).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f.s = z;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.m = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        androidx.appcompat.widget.a aVar = this.f;
        a.d dVar = aVar.k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        aVar.m = true;
        aVar.l = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.e = z;
    }

    public void setPopupTheme(int i) {
        if (this.d != i) {
            this.d = i;
            if (i == 0) {
                this.c = getContext();
            } else {
                this.c = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.a aVar) {
        this.f = aVar;
        aVar.i = this;
        this.b = aVar.d;
    }

    /* loaded from: classes.dex */
    public static class c extends LinearLayoutCompat.a {
        @ViewDebug.ExportedProperty
        public boolean a;
        @ViewDebug.ExportedProperty
        public int b;
        @ViewDebug.ExportedProperty
        public int c;
        @ViewDebug.ExportedProperty
        public boolean d;
        @ViewDebug.ExportedProperty
        public boolean e;
        public boolean f;

        public c(c cVar) {
            super(cVar);
            this.a = cVar.a;
        }

        public c() {
            super(-2, -2);
            this.a = false;
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return d(layoutParams);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final LinearLayoutCompat.a generateDefaultLayoutParams() {
        c cVar = new c();
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final LinearLayoutCompat.a generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* loaded from: classes.dex */
    public static class b implements j.a {
        @Override // androidx.appcompat.view.menu.j.a
        public final boolean a(f fVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void onCloseMenu(f fVar, boolean z) {
        }
    }
}
