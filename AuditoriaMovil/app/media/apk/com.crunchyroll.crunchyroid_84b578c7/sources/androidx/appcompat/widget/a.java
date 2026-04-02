package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import com.amazon.aps.iva.h3.a;
import com.amazon.aps.iva.p3.b;
import com.amazon.aps.iva.q.h1;
import com.amazon.aps.iva.q.m0;
import com.amazon.aps.iva.q.q;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
/* compiled from: ActionMenuPresenter.java */
/* loaded from: classes.dex */
public final class a extends androidx.appcompat.view.menu.a implements b.a {
    public d k;
    public Drawable l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public final SparseBooleanArray t;
    public e u;
    public C0007a v;
    public c w;
    public b x;
    public final f y;
    public int z;

    /* compiled from: ActionMenuPresenter.java */
    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0007a extends i {
        public C0007a(Context context, m mVar, View view) {
            super(context, mVar, view, false);
            if (!((((h) mVar.getItem()).x & 32) == 32)) {
                View view2 = a.this.k;
                this.f = view2 == null ? (View) a.this.i : view2;
            }
            f fVar = a.this.y;
            this.i = fVar;
            com.amazon.aps.iva.p.d dVar = this.j;
            if (dVar != null) {
                dVar.setCallback(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            a aVar = a.this;
            aVar.v = null;
            aVar.z = 0;
            super.c();
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final e b;

        public c(e eVar) {
            this.b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            androidx.appcompat.view.menu.f fVar = aVar.d;
            if (fVar != null) {
                fVar.changeMenuMode();
            }
            View view = (View) aVar.i;
            if (view != null && view.getWindowToken() != null) {
                e eVar = this.b;
                boolean z = true;
                if (!eVar.b()) {
                    if (eVar.f == null) {
                        z = false;
                    } else {
                        eVar.d(0, 0, false, false);
                    }
                }
                if (z) {
                    aVar.u = eVar;
                }
            }
            aVar.w = null;
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class d extends q implements ActionMenuView.a {

        /* compiled from: ActionMenuPresenter.java */
        /* renamed from: androidx.appcompat.widget.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0008a extends m0 {
            public C0008a(View view) {
                super(view);
            }

            @Override // com.amazon.aps.iva.q.m0
            public final com.amazon.aps.iva.p.f b() {
                e eVar = a.this.u;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // com.amazon.aps.iva.q.m0
            public final boolean c() {
                a.this.e();
                return true;
            }

            @Override // com.amazon.aps.iva.q.m0
            public final boolean d() {
                a aVar = a.this;
                if (aVar.w != null) {
                    return false;
                }
                aVar.b();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            h1.a(this, getContentDescription());
            setOnTouchListener(new C0008a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean G() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean b1() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            a.this.e();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                a.b.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class e extends i {
        public e(Context context, androidx.appcompat.view.menu.f fVar, d dVar) {
            super(context, fVar, dVar, true);
            this.g = 8388613;
            f fVar2 = a.this.y;
            this.i = fVar2;
            com.amazon.aps.iva.p.d dVar2 = this.j;
            if (dVar2 != null) {
                dVar2.setCallback(fVar2);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            a aVar = a.this;
            androidx.appcompat.view.menu.f fVar = aVar.d;
            if (fVar != null) {
                fVar.close();
            }
            aVar.u = null;
            super.c();
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class f implements j.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean a(androidx.appcompat.view.menu.f fVar) {
            a aVar = a.this;
            if (fVar == aVar.d) {
                return false;
            }
            aVar.z = ((m) fVar).getItem().getItemId();
            j.a aVar2 = aVar.f;
            if (aVar2 == null) {
                return false;
            }
            return aVar2.a(fVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void onCloseMenu(androidx.appcompat.view.menu.f fVar, boolean z) {
            if (fVar instanceof m) {
                fVar.getRootMenu().close(false);
            }
            j.a aVar = a.this.f;
            if (aVar != null) {
                aVar.onCloseMenu(fVar, z);
            }
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new C0009a();
        public int b;

        /* compiled from: ActionMenuPresenter.java */
        /* renamed from: androidx.appcompat.widget.a$g$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0009a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i) {
                return new g[i];
            }
        }

        public g() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
        }

        public g(Parcel parcel) {
            this.b = parcel.readInt();
        }
    }

    public a(Context context) {
        super(context);
        this.t = new SparseBooleanArray();
        this.y = new f();
    }

    public final View a(h hVar, View view, ViewGroup viewGroup) {
        k.a aVar;
        View actionView = hVar.getActionView();
        int i = 0;
        if (actionView == null || hVar.e()) {
            if (view instanceof k.a) {
                aVar = (k.a) view;
            } else {
                aVar = (k.a) this.e.inflate(this.h, viewGroup, false);
            }
            aVar.initialize(hVar, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.i);
            if (this.x == null) {
                this.x = new b();
            }
            actionMenuItemView.setPopupCallback(this.x);
            actionView = (View) aVar;
        }
        if (hVar.C) {
            i = 8;
        }
        actionView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.d(layoutParams));
        }
        return actionView;
    }

    public final boolean b() {
        k kVar;
        c cVar = this.w;
        if (cVar != null && (kVar = this.i) != null) {
            ((View) kVar).removeCallbacks(cVar);
            this.w = null;
            return true;
        }
        e eVar = this.u;
        if (eVar != null) {
            if (eVar.b()) {
                eVar.j.dismiss();
            }
            return true;
        }
        return false;
    }

    public final boolean c() {
        e eVar = this.u;
        if (eVar != null && eVar.b()) {
            return true;
        }
        return false;
    }

    public final void d(boolean z) {
        if (z) {
            j.a aVar = this.f;
            if (aVar != null) {
                aVar.a(this.d);
                return;
            }
            return;
        }
        androidx.appcompat.view.menu.f fVar = this.d;
        if (fVar != null) {
            fVar.close(false);
        }
    }

    public final boolean e() {
        androidx.appcompat.view.menu.f fVar;
        if (this.n && !c() && (fVar = this.d) != null && this.i != null && this.w == null && !fVar.getNonActionItems().isEmpty()) {
            c cVar = new c(new e(this.c, this.d, this.k));
            this.w = cVar;
            ((View) this.i).post(cVar);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean flagActionItems() {
        int i;
        ArrayList<h> arrayList;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        a aVar = this;
        androidx.appcompat.view.menu.f fVar = aVar.d;
        if (fVar != null) {
            arrayList = fVar.getVisibleItems();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = aVar.r;
        int i4 = aVar.q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.i;
        int i5 = 0;
        boolean z9 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            h hVar = arrayList.get(i5);
            int i8 = hVar.y;
            if ((i8 & 2) == 2) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                i6++;
            } else {
                if ((i8 & 1) == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    i7++;
                } else {
                    z9 = true;
                }
            }
            if (aVar.s && hVar.C) {
                i3 = 0;
            }
            i5++;
        }
        if (aVar.n && (z9 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = aVar.t;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            h hVar2 = arrayList.get(i10);
            int i12 = hVar2.y;
            if ((i12 & 2) == i2) {
                z2 = z;
            } else {
                z2 = false;
            }
            int i13 = hVar2.b;
            if (z2) {
                View a = aVar.a(hVar2, null, viewGroup);
                a.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                hVar2.g(z);
            } else {
                if ((i12 & 1) == z) {
                    z3 = z;
                } else {
                    z3 = false;
                }
                if (z3) {
                    boolean z10 = sparseBooleanArray.get(i13);
                    if ((i9 > 0 || z10) && i4 > 0) {
                        z4 = z;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        View a2 = aVar.a(hVar2, null, viewGroup);
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = a2.getMeasuredWidth();
                        i4 -= measuredWidth2;
                        if (i11 == 0) {
                            i11 = measuredWidth2;
                        }
                        if (i4 + i11 > 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z4 &= z6;
                    }
                    if (z4 && i13 != 0) {
                        sparseBooleanArray.put(i13, true);
                    } else if (z10) {
                        sparseBooleanArray.put(i13, false);
                        for (int i14 = 0; i14 < i10; i14++) {
                            h hVar3 = arrayList.get(i14);
                            if (hVar3.b == i13) {
                                if ((hVar3.x & 32) == 32) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    i9++;
                                }
                                hVar3.g(false);
                            }
                        }
                    }
                    if (z4) {
                        i9--;
                    }
                    hVar2.g(z4);
                } else {
                    hVar2.g(false);
                    i10++;
                    i2 = 2;
                    aVar = this;
                    z = true;
                }
            }
            i10++;
            i2 = 2;
            aVar = this;
            z = true;
        }
        return z;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void initForMenu(Context context, androidx.appcompat.view.menu.f fVar) {
        this.c = context;
        LayoutInflater.from(context);
        this.d = fVar;
        Resources resources = context.getResources();
        if (!this.o) {
            this.n = true;
        }
        int i = 2;
        this.p = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i2 <= 600 && ((i2 <= 960 || i3 <= 720) && (i2 <= 720 || i3 <= 960))) {
            if (i2 < 500 && ((i2 <= 640 || i3 <= 480) && (i2 <= 480 || i3 <= 640))) {
                if (i2 >= 360) {
                    i = 3;
                }
            } else {
                i = 4;
            }
        } else {
            i = 5;
        }
        this.r = i;
        int i4 = this.p;
        if (this.n) {
            if (this.k == null) {
                d dVar = new d(this.b);
                this.k = dVar;
                if (this.m) {
                    dVar.setImageDrawable(this.l);
                    this.l = null;
                    this.m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.k.getMeasuredWidth();
        } else {
            this.k = null;
        }
        this.q = i4;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void onCloseMenu(androidx.appcompat.view.menu.f fVar, boolean z) {
        b();
        C0007a c0007a = this.v;
        if (c0007a != null && c0007a.b()) {
            c0007a.j.dismiss();
        }
        j.a aVar = this.f;
        if (aVar != null) {
            aVar.onCloseMenu(fVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof g) && (i = ((g) parcelable).b) > 0 && (findItem = this.d.findItem(i)) != null) {
            onSubMenuSelected((m) findItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable onSaveInstanceState() {
        g gVar = new g();
        gVar.b = this.z;
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    @Override // androidx.appcompat.view.menu.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onSubMenuSelected(androidx.appcompat.view.menu.m r8) {
        /*
            r7 = this;
            boolean r0 = r8.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r8
        L9:
            android.view.Menu r2 = r0.getParentMenu()
            androidx.appcompat.view.menu.f r3 = r7.d
            if (r2 == r3) goto L18
            android.view.Menu r0 = r0.getParentMenu()
            androidx.appcompat.view.menu.m r0 = (androidx.appcompat.view.menu.m) r0
            goto L9
        L18:
            android.view.MenuItem r0 = r0.getItem()
            androidx.appcompat.view.menu.k r2 = r7.i
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L23
            goto L3f
        L23:
            int r3 = r2.getChildCount()
            r4 = r1
        L28:
            if (r4 >= r3) goto L3f
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof androidx.appcompat.view.menu.k.a
            if (r6 == 0) goto L3c
            r6 = r5
            androidx.appcompat.view.menu.k$a r6 = (androidx.appcompat.view.menu.k.a) r6
            androidx.appcompat.view.menu.h r6 = r6.getItemData()
            if (r6 != r0) goto L3c
            goto L40
        L3c:
            int r4 = r4 + 1
            goto L28
        L3f:
            r5 = 0
        L40:
            if (r5 != 0) goto L43
            return r1
        L43:
            android.view.MenuItem r0 = r8.getItem()
            int r0 = r0.getItemId()
            r7.z = r0
            int r0 = r8.size()
            r2 = r1
        L52:
            r3 = 1
            if (r2 >= r0) goto L6a
            android.view.MenuItem r4 = r8.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L67
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L67
            r0 = r3
            goto L6b
        L67:
            int r2 = r2 + 1
            goto L52
        L6a:
            r0 = r1
        L6b:
            androidx.appcompat.widget.a$a r2 = new androidx.appcompat.widget.a$a
            android.content.Context r4 = r7.c
            r2.<init>(r4, r8, r5)
            r7.v = r2
            r2.h = r0
            com.amazon.aps.iva.p.d r2 = r2.j
            if (r2 == 0) goto L7d
            r2.e(r0)
        L7d:
            androidx.appcompat.widget.a$a r0 = r7.v
            boolean r2 = r0.b()
            if (r2 == 0) goto L86
            goto L8e
        L86:
            android.view.View r2 = r0.f
            if (r2 != 0) goto L8b
            goto L8f
        L8b:
            r0.d(r1, r1, r1, r1)
        L8e:
            r1 = r3
        L8f:
            if (r1 == 0) goto L99
            androidx.appcompat.view.menu.j$a r0 = r7.f
            if (r0 == 0) goto L98
            r0.a(r8)
        L98:
            return r3
        L99:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a.onSubMenuSelected(androidx.appcompat.view.menu.m):boolean");
    }

    @Override // androidx.appcompat.view.menu.j
    public final void updateMenuView(boolean z) {
        int i;
        boolean z2;
        boolean z3;
        h hVar;
        ViewGroup viewGroup = (ViewGroup) this.i;
        ArrayList<h> arrayList = null;
        boolean z4 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.f fVar = this.d;
            if (fVar != null) {
                fVar.flagActionItems();
                ArrayList<h> visibleItems = this.d.getVisibleItems();
                int size = visibleItems.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    h hVar2 = visibleItems.get(i2);
                    if ((hVar2.x & 32) == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof k.a) {
                            hVar = ((k.a) childAt).getItemData();
                        } else {
                            hVar = null;
                        }
                        View a = a(hVar2, childAt, viewGroup);
                        if (hVar2 != hVar) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.i).addView(a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.k) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z2 = true;
                }
                if (!z2) {
                    i++;
                }
            }
        }
        ((View) this.i).requestLayout();
        androidx.appcompat.view.menu.f fVar2 = this.d;
        if (fVar2 != null) {
            ArrayList<h> actionItems = fVar2.getActionItems();
            int size2 = actionItems.size();
            for (int i3 = 0; i3 < size2; i3++) {
                com.amazon.aps.iva.p3.b bVar = actionItems.get(i3).A;
                if (bVar != null) {
                    bVar.setSubUiVisibilityListener(this);
                }
            }
        }
        androidx.appcompat.view.menu.f fVar3 = this.d;
        if (fVar3 != null) {
            arrayList = fVar3.getNonActionItems();
        }
        if (this.n && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z4 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z4 = true;
            }
        }
        if (z4) {
            if (this.k == null) {
                this.k = new d(this.b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.k.getParent();
            if (viewGroup3 != this.i) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.i;
                d dVar = this.k;
                actionMenuView.getClass();
                ActionMenuView.c cVar = new ActionMenuView.c();
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
                cVar.a = true;
                actionMenuView.addView(dVar, cVar);
            }
        } else {
            d dVar2 = this.k;
            if (dVar2 != null) {
                ViewParent parent = dVar2.getParent();
                k kVar = this.i;
                if (parent == kVar) {
                    ((ViewGroup) kVar).removeView(this.k);
                }
            }
        }
        ((ActionMenuView) this.i).setOverflowReserved(this.n);
    }
}
