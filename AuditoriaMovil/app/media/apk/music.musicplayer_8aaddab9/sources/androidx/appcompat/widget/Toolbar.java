package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import c.b.c.a;
import c.b.h.i.g;
import c.b.h.i.i;
import c.b.h.i.m;
import c.b.h.i.r;
import c.b.i.a1;
import c.b.i.c1;
import c.b.i.l;
import c.b.i.n;
import c.b.i.s0;
import c.i.k.d0;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.net.SyslogConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList<View> D;
    public final ArrayList<View> E;
    public final int[] F;
    public f G;
    public final ActionMenuView.e H;
    public c1 I;
    public c.b.i.c J;
    public d K;
    public m.a L;
    public g.a M;
    public boolean N;
    public final Runnable O;
    public ActionMenuView a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f246b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f247c;

    /* renamed from: d  reason: collision with root package name */
    public ImageButton f248d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f249e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f250f;

    /* renamed from: g  reason: collision with root package name */
    public CharSequence f251g;

    /* renamed from: h  reason: collision with root package name */
    public ImageButton f252h;

    /* renamed from: i  reason: collision with root package name */
    public View f253i;

    /* renamed from: j  reason: collision with root package name */
    public Context f254j;

    /* renamed from: k  reason: collision with root package name */
    public int f255k;

    /* renamed from: l  reason: collision with root package name */
    public int f256l;

    /* renamed from: m  reason: collision with root package name */
    public int f257m;

    /* renamed from: n  reason: collision with root package name */
    public int f258n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public s0 t;
    public int u;
    public int v;
    public int w;
    public CharSequence x;
    public CharSequence y;
    public ColorStateList z;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f259c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f260d;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f259c = parcel.readInt();
            this.f260d = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f369b, i2);
            parcel.writeInt(this.f259c);
            parcel.writeInt(this.f260d ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.v();
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = Toolbar.this.K;
            i iVar = dVar == null ? null : dVar.f261b;
            if (iVar != null) {
                iVar.collapseActionView();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements m {
        public g a;

        /* renamed from: b  reason: collision with root package name */
        public i f261b;

        public d() {
        }

        @Override // c.b.h.i.m
        public void b(g gVar, boolean z) {
        }

        @Override // c.b.h.i.m
        public void c(boolean z) {
            if (this.f261b != null) {
                g gVar = this.a;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        } else if (this.a.getItem(i2) == this.f261b) {
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (z2) {
                    return;
                }
                e(this.a, this.f261b);
            }
        }

        @Override // c.b.h.i.m
        public boolean d() {
            return false;
        }

        @Override // c.b.h.i.m
        public boolean e(g gVar, i iVar) {
            View view = Toolbar.this.f253i;
            if (view instanceof c.b.h.b) {
                ((c.b.h.b) view).e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f253i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f252h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f253i = null;
            int size = toolbar3.E.size();
            while (true) {
                size--;
                if (size < 0) {
                    toolbar3.E.clear();
                    this.f261b = null;
                    Toolbar.this.requestLayout();
                    iVar.C = false;
                    iVar.f1027n.q(false);
                    return true;
                }
                toolbar3.addView(toolbar3.E.get(size));
            }
        }

        @Override // c.b.h.i.m
        public boolean f(g gVar, i iVar) {
            Toolbar.this.c();
            ViewParent parent = Toolbar.this.f252h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f252h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f252h);
            }
            Toolbar.this.f253i = iVar.getActionView();
            this.f261b = iVar;
            ViewParent parent2 = Toolbar.this.f253i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f253i);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.a = 8388611 | (toolbar4.f258n & SyslogConstants.LOG_ALERT);
                generateDefaultLayoutParams.f263b = 2;
                toolbar4.f253i.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f253i);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (((e) childAt.getLayoutParams()).f263b != 2 && childAt != toolbar6.a) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.E.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            iVar.C = true;
            iVar.f1027n.q(false);
            View view = Toolbar.this.f253i;
            if (view instanceof c.b.h.b) {
                ((c.b.h.b) view).c();
            }
            return true;
        }

        @Override // c.b.h.i.m
        public void h(Context context, g gVar) {
            i iVar;
            g gVar2 = this.a;
            if (gVar2 != null && (iVar = this.f261b) != null) {
                gVar2.d(iVar);
            }
            this.a = gVar;
        }

        @Override // c.b.h.i.m
        public boolean i(r rVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a.C0014a {

        /* renamed from: b  reason: collision with root package name */
        public int f263b;

        public e(int i2, int i3) {
            super(i2, i3);
            this.f263b = 0;
            this.a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f263b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f263b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f263b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(e eVar) {
            super((a.C0014a) eVar);
            this.f263b = 0;
            this.f263b = eVar.f263b;
        }

        public e(a.C0014a c0014a) {
            super(c0014a);
            this.f263b = 0;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.w = 8388627;
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = new int[2];
        this.H = new a();
        this.O = new b();
        Context context2 = getContext();
        int[] iArr = c.b.b.x;
        a1 q = a1.q(context2, attributeSet, iArr, i2, 0);
        d0.z(this, context, iArr, attributeSet, q.f1083b, i2, 0);
        this.f256l = q.l(28, 0);
        this.f257m = q.l(19, 0);
        this.w = q.f1083b.getInteger(0, this.w);
        this.f258n = q.f1083b.getInteger(2, 48);
        int e2 = q.e(22, 0);
        e2 = q.o(27) ? q.e(27, e2) : e2;
        this.s = e2;
        this.r = e2;
        this.q = e2;
        this.p = e2;
        int e3 = q.e(25, -1);
        if (e3 >= 0) {
            this.p = e3;
        }
        int e4 = q.e(24, -1);
        if (e4 >= 0) {
            this.q = e4;
        }
        int e5 = q.e(26, -1);
        if (e5 >= 0) {
            this.r = e5;
        }
        int e6 = q.e(23, -1);
        if (e6 >= 0) {
            this.s = e6;
        }
        this.o = q.f(13, -1);
        int e7 = q.e(9, Level.ALL_INT);
        int e8 = q.e(5, Level.ALL_INT);
        int f2 = q.f(7, 0);
        int f3 = q.f(8, 0);
        d();
        s0 s0Var = this.t;
        s0Var.f1236h = false;
        if (f2 != Integer.MIN_VALUE) {
            s0Var.f1233e = f2;
            s0Var.a = f2;
        }
        if (f3 != Integer.MIN_VALUE) {
            s0Var.f1234f = f3;
            s0Var.f1230b = f3;
        }
        if (e7 != Integer.MIN_VALUE || e8 != Integer.MIN_VALUE) {
            s0Var.a(e7, e8);
        }
        this.u = q.e(10, Level.ALL_INT);
        this.v = q.e(6, Level.ALL_INT);
        this.f250f = q.g(4);
        this.f251g = q.n(3);
        CharSequence n2 = q.n(21);
        if (!TextUtils.isEmpty(n2)) {
            setTitle(n2);
        }
        CharSequence n3 = q.n(18);
        if (!TextUtils.isEmpty(n3)) {
            setSubtitle(n3);
        }
        this.f254j = getContext();
        setPopupTheme(q.l(17, 0));
        Drawable g2 = q.g(16);
        if (g2 != null) {
            setNavigationIcon(g2);
        }
        CharSequence n4 = q.n(15);
        if (!TextUtils.isEmpty(n4)) {
            setNavigationContentDescription(n4);
        }
        Drawable g3 = q.g(11);
        if (g3 != null) {
            setLogo(g3);
        }
        CharSequence n5 = q.n(12);
        if (!TextUtils.isEmpty(n5)) {
            setLogoDescription(n5);
        }
        if (q.o(29)) {
            setTitleTextColor(q.c(29));
        }
        if (q.o(20)) {
            setSubtitleTextColor(q.c(20));
        }
        if (q.o(14)) {
            getMenuInflater().inflate(q.l(14, 0), getMenu());
        }
        q.f1083b.recycle();
    }

    private MenuInflater getMenuInflater() {
        return new c.b.h.f(getContext());
    }

    public final void a(List<View> list, int i2) {
        AtomicInteger atomicInteger = d0.a;
        boolean z = d0.d.d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, d0.d.d(this));
        list.clear();
        if (!z) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f263b == 0 && u(childAt) && j(eVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f263b == 0 && u(childAt2) && j(eVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        generateDefaultLayoutParams.f263b = 1;
        if (!z || this.f253i == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.E.add(view);
    }

    public void c() {
        if (this.f252h == null) {
            l lVar = new l(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f252h = lVar;
            lVar.setImageDrawable(this.f250f);
            this.f252h.setContentDescription(this.f251g);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388611 | (this.f258n & SyslogConstants.LOG_ALERT);
            generateDefaultLayoutParams.f263b = 2;
            this.f252h.setLayoutParams(generateDefaultLayoutParams);
            this.f252h.setOnClickListener(new c());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public final void d() {
        if (this.t == null) {
            this.t = new s0();
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.p == null) {
            g gVar = (g) actionMenuView.getMenu();
            if (this.K == null) {
                this.K = new d();
            }
            this.a.setExpandedActionViewsExclusive(true);
            gVar.b(this.K, this.f254j);
        }
    }

    public final void f() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.f255k);
            this.a.setOnMenuItemClickListener(this.H);
            ActionMenuView actionMenuView2 = this.a;
            m.a aVar = this.L;
            g.a aVar2 = this.M;
            actionMenuView2.u = aVar;
            actionMenuView2.v = aVar2;
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388613 | (this.f258n & SyslogConstants.LOG_ALERT);
            this.a.setLayoutParams(generateDefaultLayoutParams);
            b(this.a, false);
        }
    }

    public final void g() {
        if (this.f248d == null) {
            this.f248d = new l(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388611 | (this.f258n & SyslogConstants.LOG_ALERT);
            this.f248d.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f252h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f252h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        s0 s0Var = this.t;
        if (s0Var != null) {
            return s0Var.f1235g ? s0Var.a : s0Var.f1230b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        s0 s0Var = this.t;
        if (s0Var != null) {
            return s0Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        s0 s0Var = this.t;
        if (s0Var != null) {
            return s0Var.f1230b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        s0 s0Var = this.t;
        if (s0Var != null) {
            return s0Var.f1235g ? s0Var.f1230b : s0Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.u;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        g gVar;
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && (gVar = actionMenuView.p) != null && gVar.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.v, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        AtomicInteger atomicInteger = d0.a;
        return d0.d.d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        AtomicInteger atomicInteger = d0.a;
        return d0.d.d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f249e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f249e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f248d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f248d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public c.b.i.c getOuterActionMenuPresenter() {
        return this.J;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f254j;
    }

    public int getPopupTheme() {
        return this.f255k;
    }

    public CharSequence getSubtitle() {
        return this.y;
    }

    public final TextView getSubtitleTextView() {
        return this.f247c;
    }

    public CharSequence getTitle() {
        return this.x;
    }

    public int getTitleMarginBottom() {
        return this.s;
    }

    public int getTitleMarginEnd() {
        return this.q;
    }

    public int getTitleMarginStart() {
        return this.p;
    }

    public int getTitleMarginTop() {
        return this.r;
    }

    public final TextView getTitleTextView() {
        return this.f246b;
    }

    public c.b.i.d0 getWrapper() {
        if (this.I == null) {
            this.I = new c1(this, true);
        }
        return this.I;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0014a ? new e((a.C0014a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public final int j(int i2) {
        AtomicInteger atomicInteger = d0.a;
        int d2 = d0.d.d(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, d2) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : d2 == 1 ? 5 : 3;
    }

    public final int k(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = eVar.a & SyslogConstants.LOG_ALERT;
        if (i4 != 16 && i4 != 48 && i4 != 80) {
            i4 = this.w & SyslogConstants.LOG_ALERT;
        }
        if (i4 != 48) {
            if (i4 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                if (i5 < i6) {
                    i5 = i6;
                } else {
                    int i7 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
                    int i8 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    if (i7 < i8) {
                        i5 = Math.max(0, i5 - (i8 - i7));
                    }
                }
                return paddingTop + i5;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i3;
        }
        return getPaddingTop() - i3;
    }

    public final int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public final int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public void n(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.O);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02a1 A[LOOP:0: B:104:0x029f->B:105:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c3 A[LOOP:1: B:107:0x02c1->B:108:0x02c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e8 A[LOOP:2: B:110:0x02e6->B:111:0x02e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x033a A[LOOP:3: B:119:0x0338->B:120:0x033a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0296  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f369b);
        ActionMenuView actionMenuView = this.a;
        g gVar = actionMenuView != null ? actionMenuView.p : null;
        int i2 = savedState.f259c;
        if (i2 != 0 && this.K != null && gVar != null && (findItem = gVar.findItem(i2)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f260d) {
            removeCallbacks(this.O);
            post(this.O);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        d();
        s0 s0Var = this.t;
        boolean z = i2 == 1;
        if (z == s0Var.f1235g) {
            return;
        }
        s0Var.f1235g = z;
        if (!s0Var.f1236h) {
            s0Var.a = s0Var.f1233e;
            s0Var.f1230b = s0Var.f1234f;
        } else if (z) {
            int i3 = s0Var.f1232d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = s0Var.f1233e;
            }
            s0Var.a = i3;
            int i4 = s0Var.f1231c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = s0Var.f1234f;
            }
            s0Var.f1230b = i4;
        } else {
            int i5 = s0Var.f1231c;
            if (i5 == Integer.MIN_VALUE) {
                i5 = s0Var.f1233e;
            }
            s0Var.a = i5;
            int i6 = s0Var.f1232d;
            if (i6 == Integer.MIN_VALUE) {
                i6 = s0Var.f1234f;
            }
            s0Var.f1230b = i6;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        d dVar = this.K;
        if (dVar != null && (iVar = dVar.f261b) != null) {
            savedState.f259c = iVar.a;
        }
        savedState.f260d = p();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    public boolean p() {
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            c.b.i.c cVar = actionMenuView.t;
            if (cVar != null && cVar.m()) {
                return true;
            }
        }
        return false;
    }

    public final int q(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int k2 = k(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, k2, max + measuredWidth, view.getMeasuredHeight() + k2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin + max;
    }

    public final int r(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int k2 = k(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, k2, max, view.getMeasuredHeight() + k2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    public final int s(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        ImageButton imageButton = this.f252h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(c.b.d.a.a.b(getContext(), i2));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f252h.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f252h;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f250f);
        }
    }

    public void setCollapsible(boolean z) {
        this.N = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Level.ALL_INT;
        }
        if (i2 != this.v) {
            this.v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Level.ALL_INT;
        }
        if (i2 != this.u) {
            this.u = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(c.b.d.a.a.b(getContext(), i2));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f249e == null) {
                this.f249e = new n(getContext(), null, 0);
            }
            if (!o(this.f249e)) {
                b(this.f249e, true);
            }
        } else {
            ImageView imageView = this.f249e;
            if (imageView != null && o(imageView)) {
                removeView(this.f249e);
                this.E.remove(this.f249e);
            }
        }
        ImageView imageView2 = this.f249e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f249e == null) {
            this.f249e = new n(getContext(), null, 0);
        }
        ImageView imageView = this.f249e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f248d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(c.b.d.a.a.b(getContext(), i2));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f248d)) {
                b(this.f248d, true);
            }
        } else {
            ImageButton imageButton = this.f248d;
            if (imageButton != null && o(imageButton)) {
                removeView(this.f248d);
                this.E.remove(this.f248d);
            }
        }
        ImageButton imageButton2 = this.f248d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f248d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.G = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f255k != i2) {
            this.f255k = i2;
            if (i2 == 0) {
                this.f254j = getContext();
            } else {
                this.f254j = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f247c;
            if (textView != null && o(textView)) {
                removeView(this.f247c);
                this.E.remove(this.f247c);
            }
        } else {
            if (this.f247c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.f247c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f247c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f257m;
                if (i2 != 0) {
                    this.f247c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f247c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f247c)) {
                b(this.f247c, true);
            }
        }
        TextView textView2 = this.f247c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f247c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f246b;
            if (textView != null && o(textView)) {
                removeView(this.f246b);
                this.E.remove(this.f246b);
            }
        } else {
            if (this.f246b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.f246b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f246b.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f256l;
                if (i2 != 0) {
                    this.f246b.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.z;
                if (colorStateList != null) {
                    this.f246b.setTextColor(colorStateList);
                }
            }
            if (!o(this.f246b)) {
                b(this.f246b, true);
            }
        }
        TextView textView2 = this.f246b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.x = charSequence;
    }

    public void setTitleMarginBottom(int i2) {
        this.s = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.q = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.p = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.r = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.z = colorStateList;
        TextView textView = this.f246b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final void t(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean v() {
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            c.b.i.c cVar = actionMenuView.t;
            if (cVar != null && cVar.n()) {
                return true;
            }
        }
        return false;
    }
}
