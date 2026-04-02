package c.b.i;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import c.b.h.i.g;
import c.b.h.i.m;
import c.b.h.i.n;
import java.util.ArrayList;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class c extends c.b.h.i.b {

    /* renamed from: i  reason: collision with root package name */
    public d f1087i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f1088j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1089k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1090l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1091m;

    /* renamed from: n  reason: collision with root package name */
    public int f1092n;
    public int o;
    public int p;
    public boolean q;
    public int r;
    public final SparseBooleanArray s;
    public e t;
    public a u;
    public RunnableC0021c v;
    public b w;
    public final f x;

    /* loaded from: classes.dex */
    public class a extends c.b.h.i.l {
        public a(Context context, c.b.h.i.r rVar, View view) {
            super(context, rVar, view, false, R.attr.actionOverflowMenuStyle, 0);
            if (!rVar.A.g()) {
                View view2 = c.this.f1087i;
                this.f1039f = view2 == null ? (View) c.this.f968h : view2;
            }
            d(c.this.x);
        }

        @Override // c.b.h.i.l
        public void c() {
            c cVar = c.this;
            cVar.u = null;
            Objects.requireNonNull(cVar);
            super.c();
        }
    }

    /* loaded from: classes.dex */
    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* renamed from: c.b.i.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0021c implements Runnable {
        public e a;

        public RunnableC0021c(e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.a aVar;
            c.b.h.i.g gVar = c.this.f963c;
            if (gVar != null && (aVar = gVar.f1004f) != null) {
                aVar.b(gVar);
            }
            View view = (View) c.this.f968h;
            if (view != null && view.getWindowToken() != null && this.a.f()) {
                c.this.t = this.a;
            }
            c.this.v = null;
        }
    }

    /* loaded from: classes.dex */
    public class d extends n implements ActionMenuView.a {

        /* loaded from: classes.dex */
        public class a extends h0 {
            public a(View view, c cVar) {
                super(view);
            }

            @Override // c.b.i.h0
            public c.b.h.i.p b() {
                e eVar = c.this.t;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // c.b.i.h0
            public boolean c() {
                c.this.n();
                return true;
            }

            @Override // c.b.i.h0
            public boolean d() {
                c cVar = c.this;
                if (cVar.v != null) {
                    return false;
                }
                cVar.k();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            c.b.a.c(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.n();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                c.i.a.b0(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* loaded from: classes.dex */
    public class e extends c.b.h.i.l {
        public e(Context context, c.b.h.i.g gVar, View view, boolean z) {
            super(context, gVar, view, z, R.attr.actionOverflowMenuStyle, 0);
            this.f1040g = 8388613;
            d(c.this.x);
        }

        @Override // c.b.h.i.l
        public void c() {
            c.b.h.i.g gVar = c.this.f963c;
            if (gVar != null) {
                gVar.c(true);
            }
            c.this.t = null;
            super.c();
        }
    }

    /* loaded from: classes.dex */
    public class f implements m.a {
        public f() {
        }

        @Override // c.b.h.i.m.a
        public void b(c.b.h.i.g gVar, boolean z) {
            if (gVar instanceof c.b.h.i.r) {
                gVar.k().c(false);
            }
            m.a aVar = c.this.f965e;
            if (aVar != null) {
                aVar.b(gVar, z);
            }
        }

        @Override // c.b.h.i.m.a
        public boolean c(c.b.h.i.g gVar) {
            c cVar = c.this;
            if (gVar == cVar.f963c) {
                return false;
            }
            int i2 = ((c.b.h.i.r) gVar).A.a;
            m.a aVar = cVar.f965e;
            if (aVar != null) {
                return aVar.c(gVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
        this.s = new SparseBooleanArray();
        this.x = new f();
    }

    public boolean a() {
        return k() | l();
    }

    @Override // c.b.h.i.m
    public void b(c.b.h.i.g gVar, boolean z) {
        a();
        m.a aVar = this.f965e;
        if (aVar != null) {
            aVar.b(gVar, z);
        }
    }

    @Override // c.b.h.i.m
    public void c(boolean z) {
        int i2;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.f968h;
        ArrayList<c.b.h.i.i> arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            c.b.h.i.g gVar = this.f963c;
            if (gVar != null) {
                gVar.i();
                ArrayList<c.b.h.i.i> l2 = this.f963c.l();
                int size = l2.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    c.b.h.i.i iVar = l2.get(i3);
                    if (iVar.g()) {
                        View childAt = viewGroup.getChildAt(i2);
                        c.b.h.i.i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                        View j2 = j(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            j2.setPressed(false);
                            j2.jumpDrawablesToCurrentState();
                        }
                        if (j2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) j2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(j2);
                            }
                            ((ViewGroup) this.f968h).addView(j2, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == this.f1087i) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i2);
                    z2 = true;
                }
                if (!z2) {
                    i2++;
                }
            }
        }
        ((View) this.f968h).requestLayout();
        c.b.h.i.g gVar2 = this.f963c;
        if (gVar2 != null) {
            gVar2.i();
            ArrayList<c.b.h.i.i> arrayList2 = gVar2.f1008j;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                c.i.k.f fVar = arrayList2.get(i4).A;
            }
        }
        c.b.h.i.g gVar3 = this.f963c;
        if (gVar3 != null) {
            gVar3.i();
            arrayList = gVar3.f1009k;
        }
        if (this.f1090l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.f1087i == null) {
                this.f1087i = new d(this.a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f1087i.getParent();
            if (viewGroup3 != this.f968h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f1087i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f968h;
                d dVar = this.f1087i;
                ActionMenuView.c h2 = actionMenuView.h();
                h2.a = true;
                actionMenuView.addView(dVar, h2);
            }
        } else {
            d dVar2 = this.f1087i;
            if (dVar2 != null) {
                ViewParent parent = dVar2.getParent();
                c.b.h.i.n nVar = this.f968h;
                if (parent == nVar) {
                    ((ViewGroup) nVar).removeView(this.f1087i);
                }
            }
        }
        ((ActionMenuView) this.f968h).setOverflowReserved(this.f1090l);
    }

    @Override // c.b.h.i.m
    public boolean d() {
        ArrayList<c.b.h.i.i> arrayList;
        int i2;
        int i3;
        boolean z;
        c.b.h.i.g gVar = this.f963c;
        if (gVar != null) {
            arrayList = gVar.l();
            i2 = arrayList.size();
        } else {
            arrayList = null;
            i2 = 0;
        }
        int i4 = this.p;
        int i5 = this.o;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f968h;
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i3 = 2;
            z = true;
            if (i6 >= i2) {
                break;
            }
            c.b.h.i.i iVar = arrayList.get(i6);
            int i9 = iVar.y;
            if ((i9 & 2) == 2) {
                i8++;
            } else if ((i9 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (this.q && iVar.C) {
                i4 = 0;
            }
            i6++;
        }
        if (this.f1090l && (z2 || i7 + i8 > i4)) {
            i4--;
        }
        int i10 = i4 - i8;
        SparseBooleanArray sparseBooleanArray = this.s;
        sparseBooleanArray.clear();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i2) {
            c.b.h.i.i iVar2 = arrayList.get(i11);
            int i13 = iVar2.y;
            if ((i13 & 2) == i3) {
                View j2 = j(iVar2, null, viewGroup);
                j2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = j2.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                int i14 = iVar2.f1015b;
                if (i14 != 0) {
                    sparseBooleanArray.put(i14, z);
                }
                iVar2.k(z);
            } else if ((i13 & 1) == z) {
                int i15 = iVar2.f1015b;
                boolean z3 = sparseBooleanArray.get(i15);
                boolean z4 = (i10 > 0 || z3) && i5 > 0;
                if (z4) {
                    View j3 = j(iVar2, null, viewGroup);
                    j3.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = j3.getMeasuredWidth();
                    i5 -= measuredWidth2;
                    if (i12 == 0) {
                        i12 = measuredWidth2;
                    }
                    z4 &= i5 + i12 > 0;
                }
                if (z4 && i15 != 0) {
                    sparseBooleanArray.put(i15, true);
                } else if (z3) {
                    sparseBooleanArray.put(i15, false);
                    for (int i16 = 0; i16 < i11; i16++) {
                        c.b.h.i.i iVar3 = arrayList.get(i16);
                        if (iVar3.f1015b == i15) {
                            if (iVar3.g()) {
                                i10++;
                            }
                            iVar3.k(false);
                        }
                    }
                }
                if (z4) {
                    i10--;
                }
                iVar2.k(z4);
            } else {
                iVar2.k(false);
                i11++;
                i3 = 2;
                z = true;
            }
            i11++;
            i3 = 2;
            z = true;
        }
        return true;
    }

    @Override // c.b.h.i.m
    public void h(Context context, c.b.h.i.g gVar) {
        this.f962b = context;
        LayoutInflater.from(context);
        this.f963c = gVar;
        Resources resources = context.getResources();
        if (!this.f1091m) {
            this.f1090l = true;
        }
        int i2 = 2;
        this.f1092n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
            i2 = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
            i2 = 4;
        } else if (i3 >= 360) {
            i2 = 3;
        }
        this.p = i2;
        int i5 = this.f1092n;
        if (this.f1090l) {
            if (this.f1087i == null) {
                d dVar = new d(this.a);
                this.f1087i = dVar;
                if (this.f1089k) {
                    dVar.setImageDrawable(this.f1088j);
                    this.f1088j = null;
                    this.f1089k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1087i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i5 -= this.f1087i.getMeasuredWidth();
        } else {
            this.f1087i = null;
        }
        this.o = i5;
        this.r = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // c.b.h.i.m
    public boolean i(c.b.h.i.r rVar) {
        boolean z = false;
        if (rVar.hasVisibleItems()) {
            c.b.h.i.r rVar2 = rVar;
            while (true) {
                c.b.h.i.g gVar = rVar2.z;
                if (gVar == this.f963c) {
                    break;
                }
                rVar2 = (c.b.h.i.r) gVar;
            }
            c.b.h.i.i iVar = rVar2.A;
            ViewGroup viewGroup = (ViewGroup) this.f968h;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i2);
                    if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == iVar) {
                        view = childAt;
                        break;
                    }
                    i2++;
                }
            }
            if (view == null) {
                return false;
            }
            int i3 = rVar.A.a;
            int size = rVar.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                MenuItem item = rVar.getItem(i4);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i4++;
            }
            a aVar = new a(this.f962b, rVar, view);
            this.u = aVar;
            aVar.f1041h = z;
            c.b.h.i.k kVar = aVar.f1043j;
            if (kVar != null) {
                kVar.n(z);
            }
            if (this.u.f()) {
                m.a aVar2 = this.f965e;
                if (aVar2 != null) {
                    aVar2.c(rVar);
                }
                return true;
            }
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        return false;
    }

    public View j(c.b.h.i.i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.f()) {
            n.a aVar = view instanceof n.a ? (n.a) view : (n.a) this.f964d.inflate(this.f967g, viewGroup, false);
            aVar.d(iVar, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f968h);
            if (this.w == null) {
                this.w = new b();
            }
            actionMenuItemView.setPopupCallback(this.w);
            actionView = (View) aVar;
        }
        actionView.setVisibility(iVar.C ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.j(layoutParams));
        }
        return actionView;
    }

    public boolean k() {
        c.b.h.i.n nVar;
        RunnableC0021c runnableC0021c = this.v;
        if (runnableC0021c != null && (nVar = this.f968h) != null) {
            ((View) nVar).removeCallbacks(runnableC0021c);
            this.v = null;
            return true;
        }
        e eVar = this.t;
        if (eVar != null) {
            if (eVar.b()) {
                eVar.f1043j.dismiss();
            }
            return true;
        }
        return false;
    }

    public boolean l() {
        a aVar = this.u;
        if (aVar != null) {
            if (aVar.b()) {
                aVar.f1043j.dismiss();
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean m() {
        e eVar = this.t;
        return eVar != null && eVar.b();
    }

    public boolean n() {
        c.b.h.i.g gVar;
        if (!this.f1090l || m() || (gVar = this.f963c) == null || this.f968h == null || this.v != null) {
            return false;
        }
        gVar.i();
        if (gVar.f1009k.isEmpty()) {
            return false;
        }
        RunnableC0021c runnableC0021c = new RunnableC0021c(new e(this.f962b, this.f963c, this.f1087i, true));
        this.v = runnableC0021c;
        ((View) this.f968h).post(runnableC0021c);
        return true;
    }
}
