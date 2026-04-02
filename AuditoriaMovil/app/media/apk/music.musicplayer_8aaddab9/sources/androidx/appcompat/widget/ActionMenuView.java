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
import androidx.appcompat.widget.Toolbar;
import c.b.c.y;
import c.b.h.i.g;
import c.b.h.i.i;
import c.b.h.i.m;
import c.b.h.i.n;
import c.b.i.c;
import c.b.i.g1;
import c.b.i.i0;
import ch.qos.logback.classic.Level;
/* loaded from: classes.dex */
public class ActionMenuView extends i0 implements g.b, n {
    public e A;
    public g p;
    public Context q;
    public int r;
    public boolean s;
    public c.b.i.c t;
    public m.a u;
    public g.a v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public static class b implements m.a {
        @Override // c.b.h.i.m.a
        public void b(g gVar, boolean z) {
        }

        @Override // c.b.h.i.m.a
        public boolean c(g gVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends i0.a {
        @ViewDebug.ExportedProperty
        public boolean a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f191b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f192c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f193d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f194e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f195f;

        public c(int i2, int i3) {
            super(i2, i3);
            this.a = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.a = cVar.a;
        }
    }

    /* loaded from: classes.dex */
    public class d implements g.a {
        public d() {
        }

        @Override // c.b.h.i.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.A;
            if (eVar != null) {
                Toolbar.f fVar = Toolbar.this.G;
                return fVar != null ? y.this.f862c.onMenuItemSelected(0, menuItem) : false;
            }
            return false;
        }

        @Override // c.b.h.i.g.a
        public void b(g gVar) {
            g.a aVar = ActionMenuView.this.v;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.y = (int) (56.0f * f2);
        this.z = (int) (f2 * 4.0f);
        this.q = context;
        this.r = 0;
    }

    public static int t(View view, int i2, int i3, int i4, int i5) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4) - i5, View.MeasureSpec.getMode(i4));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.c();
        int i6 = 2;
        if (i3 <= 0 || (z2 && i3 < 2)) {
            i6 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i2, Level.ALL_INT), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i7 = measuredWidth / i2;
            if (measuredWidth % i2 != 0) {
                i7++;
            }
            if (!z2 || i7 >= 2) {
                i6 = i7;
            }
        }
        if (!cVar.a && z2) {
            z = true;
        }
        cVar.f193d = z;
        cVar.f191b = i6;
        view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i6, 1073741824), makeMeasureSpec);
        return i6;
    }

    @Override // c.b.h.i.g.b
    public boolean a(i iVar) {
        return this.p.s(iVar, null, 0);
    }

    @Override // c.b.h.i.n
    public void b(g gVar) {
        this.p = gVar;
    }

    @Override // c.b.i.i0, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // c.b.i.i0, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.p == null) {
            Context context = getContext();
            g gVar = new g(context);
            this.p = gVar;
            gVar.f1004f = new d();
            c.b.i.c cVar = new c.b.i.c(context);
            this.t = cVar;
            cVar.f1090l = true;
            cVar.f1091m = true;
            m.a aVar = this.u;
            if (aVar == null) {
                aVar = new b();
            }
            cVar.f965e = aVar;
            this.p.b(cVar, this.q);
            c.b.i.c cVar2 = this.t;
            cVar2.f968h = this;
            this.p = cVar2.f963c;
        }
        return this.p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        c.b.i.c cVar = this.t;
        c.d dVar = cVar.f1087i;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (cVar.f1089k) {
            return cVar.f1088j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // c.b.i.i0
    public i0.a i(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c.b.i.c cVar = this.t;
        if (cVar != null) {
            cVar.c(false);
            if (this.t.m()) {
                this.t.k();
                this.t.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c.b.i.c cVar = this.t;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // c.b.i.i0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int width;
        int i6;
        if (!this.w) {
            super.onLayout(z, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i4 - i2;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = g1.a(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (s(i11)) {
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
                    s(i11);
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
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
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
                paddingLeft = e.a.d.a.a.b(measuredWidth4, ((LinearLayout.LayoutParams) cVar3).rightMargin, max, i20);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v39 */
    @Override // c.b.i.i0, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        boolean z;
        int i5;
        int i6;
        boolean z2;
        int i7;
        ?? r3;
        g gVar;
        boolean z3 = this.w;
        boolean z4 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.w = z4;
        if (z3 != z4) {
            this.x = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.w && (gVar = this.p) != null && size != this.x) {
            this.x = size;
            gVar.q(true);
        }
        int childCount = getChildCount();
        if (!this.w || childCount <= 0) {
            for (int i8 = 0; i8 < childCount; i8++) {
                c cVar = (c) getChildAt(i8).getLayoutParams();
                ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i3);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
        int i9 = size2 - paddingRight;
        int i10 = this.y;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = (i12 / i11) + i10;
        int childCount2 = getChildCount();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z5 = false;
        long j2 = 0;
        while (i18 < childCount2) {
            View childAt = getChildAt(i18);
            int i19 = size3;
            int i20 = i9;
            if (childAt.getVisibility() != 8) {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i21 = i14 + 1;
                if (z6) {
                    int i22 = this.z;
                    i7 = i21;
                    r3 = 0;
                    childAt.setPadding(i22, 0, i22, 0);
                } else {
                    i7 = i21;
                    r3 = 0;
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.f195f = r3;
                cVar2.f192c = r3;
                cVar2.f191b = r3;
                cVar2.f193d = r3;
                ((LinearLayout.LayoutParams) cVar2).leftMargin = r3;
                ((LinearLayout.LayoutParams) cVar2).rightMargin = r3;
                cVar2.f194e = z6 && ((ActionMenuItemView) childAt).c();
                int t = t(childAt, i13, cVar2.a ? 1 : i11, childMeasureSpec, paddingBottom);
                i16 = Math.max(i16, t);
                if (cVar2.f193d) {
                    i17++;
                }
                if (cVar2.a) {
                    z5 = true;
                }
                i11 -= t;
                i15 = Math.max(i15, childAt.getMeasuredHeight());
                if (t == 1) {
                    j2 |= 1 << i18;
                }
                i14 = i7;
            }
            i18++;
            size3 = i19;
            i9 = i20;
        }
        int i23 = i9;
        int i24 = size3;
        boolean z7 = z5 && i14 == 2;
        boolean z8 = false;
        while (i17 > 0 && i11 > 0) {
            int i25 = Integer.MAX_VALUE;
            int i26 = 0;
            int i27 = 0;
            long j3 = 0;
            while (i26 < childCount2) {
                int i28 = i15;
                c cVar3 = (c) getChildAt(i26).getLayoutParams();
                boolean z9 = z8;
                if (cVar3.f193d) {
                    int i29 = cVar3.f191b;
                    if (i29 < i25) {
                        j3 = 1 << i26;
                        i25 = i29;
                        i27 = 1;
                    } else if (i29 == i25) {
                        i27++;
                        j3 |= 1 << i26;
                    }
                }
                i26++;
                z8 = z9;
                i15 = i28;
            }
            i4 = i15;
            z = z8;
            j2 |= j3;
            if (i27 > i11) {
                break;
            }
            int i30 = i25 + 1;
            int i31 = 0;
            while (i31 < childCount2) {
                View childAt2 = getChildAt(i31);
                c cVar4 = (c) childAt2.getLayoutParams();
                int i32 = i17;
                long j4 = 1 << i31;
                if ((j3 & j4) == 0) {
                    if (cVar4.f191b == i30) {
                        j2 |= j4;
                    }
                    z2 = z7;
                } else {
                    if (z7 && cVar4.f194e && i11 == 1) {
                        int i33 = this.z;
                        z2 = z7;
                        childAt2.setPadding(i33 + i13, 0, i33, 0);
                    } else {
                        z2 = z7;
                    }
                    cVar4.f191b++;
                    cVar4.f195f = true;
                    i11--;
                }
                i31++;
                i17 = i32;
                z7 = z2;
            }
            i15 = i4;
            z8 = true;
        }
        i4 = i15;
        z = z8;
        boolean z10 = !z5 && i14 == 1;
        if (i11 > 0 && j2 != 0 && (i11 < i14 - 1 || z10 || i16 > 1)) {
            float bitCount = Long.bitCount(j2);
            if (!z10) {
                if ((j2 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f194e) {
                    bitCount -= 0.5f;
                }
                int i34 = childCount2 - 1;
                if ((j2 & (1 << i34)) != 0 && !((c) getChildAt(i34).getLayoutParams()).f194e) {
                    bitCount -= 0.5f;
                }
            }
            int i35 = bitCount > 0.0f ? (int) ((i11 * i13) / bitCount) : 0;
            for (int i36 = 0; i36 < childCount2; i36++) {
                if ((j2 & (1 << i36)) != 0) {
                    View childAt3 = getChildAt(i36);
                    c cVar5 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar5.f192c = i35;
                        cVar5.f195f = true;
                        if (i36 == 0 && !cVar5.f194e) {
                            ((LinearLayout.LayoutParams) cVar5).leftMargin = (-i35) / 2;
                        }
                    } else if (cVar5.a) {
                        cVar5.f192c = i35;
                        cVar5.f195f = true;
                        ((LinearLayout.LayoutParams) cVar5).rightMargin = (-i35) / 2;
                    } else {
                        if (i36 != 0) {
                            ((LinearLayout.LayoutParams) cVar5).leftMargin = i35 / 2;
                        }
                        if (i36 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) cVar5).rightMargin = i35 / 2;
                        }
                    }
                    z = true;
                }
            }
        }
        if (z) {
            for (int i37 = 0; i37 < childCount2; i37++) {
                View childAt4 = getChildAt(i37);
                c cVar6 = (c) childAt4.getLayoutParams();
                if (cVar6.f195f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar6.f191b * i13) + cVar6.f192c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i6 = i23;
            i5 = i4;
        } else {
            i5 = i24;
            i6 = i23;
        }
        setMeasuredDimension(i6, i5);
    }

    @Override // c.b.i.i0
    /* renamed from: q */
    public c h() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // c.b.i.i0
    /* renamed from: r */
    public c j(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
            if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
            }
            return cVar;
        }
        return h();
    }

    public boolean s(int i2) {
        boolean z = false;
        if (i2 == 0) {
            return false;
        }
        View childAt = getChildAt(i2 - 1);
        View childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof a)) {
            z = false | ((a) childAt).a();
        }
        return (i2 <= 0 || !(childAt2 instanceof a)) ? z : z | ((a) childAt2).b();
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.t.q = z;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        c.b.i.c cVar = this.t;
        c.d dVar = cVar.f1087i;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        cVar.f1089k = true;
        cVar.f1088j = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.s = z;
    }

    public void setPopupTheme(int i2) {
        if (this.r != i2) {
            this.r = i2;
            if (i2 == 0) {
                this.q = getContext();
            } else {
                this.q = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(c.b.i.c cVar) {
        this.t = cVar;
        cVar.f968h = this;
        this.p = cVar.f963c;
    }
}
