package com.amazon.aps.iva.q;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.amazon.aps.iva.p3.g0;
import com.google.common.primitives.Ints;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* compiled from: ListPopupWindow.java */
/* loaded from: classes.dex */
public class o0 implements com.amazon.aps.iva.p.f {
    public static final Method B;
    public static final Method C;
    public final s A;
    public final Context b;
    public ListAdapter c;
    public k0 d;
    public int g;
    public int h;
    public boolean j;
    public boolean k;
    public boolean l;
    public d o;
    public View p;
    public AdapterView.OnItemClickListener q;
    public AdapterView.OnItemSelectedListener r;
    public final Handler w;
    public Rect y;
    public boolean z;
    public final int e = -2;
    public int f = -2;
    public final int i = 1002;
    public int m = 0;
    public final int n = Integer.MAX_VALUE;
    public final g s = new g();
    public final f t = new f();
    public final e u = new e();
    public final c v = new c();
    public final Rect x = new Rect();

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public static class a {
        public static int a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            k0 k0Var = o0.this.d;
            if (k0Var != null) {
                k0Var.setListSelectionHidden(true);
                k0Var.requestLayout();
            }
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            o0 o0Var = o0.this;
            if (o0Var.a()) {
                o0Var.show();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            o0.this.dismiss();
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            s sVar;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            o0 o0Var = o0.this;
            if (action == 0 && (sVar = o0Var.A) != null && sVar.isShowing() && x >= 0) {
                s sVar2 = o0Var.A;
                if (x < sVar2.getWidth() && y >= 0 && y < sVar2.getHeight()) {
                    o0Var.w.postDelayed(o0Var.s, 250L);
                    return false;
                }
            }
            if (action == 1) {
                o0Var.w.removeCallbacks(o0Var.s);
                return false;
            }
            return false;
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o0 o0Var = o0.this;
            k0 k0Var = o0Var.d;
            if (k0Var != null) {
                WeakHashMap<View, com.amazon.aps.iva.p3.r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
                if (g0.g.b(k0Var) && o0Var.d.getCount() > o0Var.d.getChildCount() && o0Var.d.getChildCount() <= o0Var.n) {
                    o0Var.A.setInputMethodMode(2);
                    o0Var.show();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                B = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public o0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.b = context;
        this.w = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.j.a.p, i, i2);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.j = true;
        }
        obtainStyledAttributes.recycle();
        s sVar = new s(context, attributeSet, i, i2);
        this.A = sVar;
        sVar.setInputMethodMode(1);
    }

    @Override // com.amazon.aps.iva.p.f
    public final boolean a() {
        return this.A.isShowing();
    }

    public final Drawable b() {
        return this.A.getBackground();
    }

    public final int c() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.p.f
    public final void dismiss() {
        s sVar = this.A;
        sVar.dismiss();
        sVar.setContentView(null);
        this.d = null;
        this.w.removeCallbacks(this.s);
    }

    public final void e(int i) {
        this.g = i;
    }

    public final void h(int i) {
        this.h = i;
        this.j = true;
    }

    public final int j() {
        if (!this.j) {
            return 0;
        }
        return this.h;
    }

    public void k(ListAdapter listAdapter) {
        d dVar = this.o;
        if (dVar == null) {
            this.o = new d();
        } else {
            ListAdapter listAdapter2 = this.c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.o);
        }
        k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.setAdapter(this.c);
        }
    }

    @Override // com.amazon.aps.iva.p.f
    public final k0 m() {
        return this.d;
    }

    public k0 n(Context context, boolean z) {
        return new k0(context, z);
    }

    public final void o(int i) {
        Drawable background = this.A.getBackground();
        if (background != null) {
            Rect rect = this.x;
            background.getPadding(rect);
            this.f = rect.left + rect.right + i;
            return;
        }
        this.f = i;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        this.A.setBackgroundDrawable(drawable);
    }

    @Override // com.amazon.aps.iva.p.f
    public final void show() {
        int i;
        boolean z;
        int makeMeasureSpec;
        int i2;
        int i3;
        boolean z2;
        k0 k0Var;
        int i4;
        int i5;
        k0 k0Var2 = this.d;
        s sVar = this.A;
        Context context = this.b;
        if (k0Var2 == null) {
            k0 n = n(context, !this.z);
            this.d = n;
            n.setAdapter(this.c);
            this.d.setOnItemClickListener(this.q);
            this.d.setFocusable(true);
            this.d.setFocusableInTouchMode(true);
            this.d.setOnItemSelectedListener(new n0(this));
            this.d.setOnScrollListener(this.u);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.r;
            if (onItemSelectedListener != null) {
                this.d.setOnItemSelectedListener(onItemSelectedListener);
            }
            sVar.setContentView(this.d);
        } else {
            ViewGroup viewGroup = (ViewGroup) sVar.getContentView();
        }
        Drawable background = sVar.getBackground();
        int i6 = 0;
        Rect rect = this.x;
        if (background != null) {
            background.getPadding(rect);
            int i7 = rect.top;
            i = rect.bottom + i7;
            if (!this.j) {
                this.h = -i7;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        if (sVar.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        int a2 = a.a(sVar, this.p, this.h, z);
        int i8 = this.e;
        if (i8 == -1) {
            i3 = a2 + i;
        } else {
            int i9 = this.f;
            if (i9 != -2) {
                if (i9 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, Ints.MAX_POWER_OF_TWO);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Ints.MAX_POWER_OF_TWO);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a3 = this.d.a(makeMeasureSpec, a2 + 0);
            if (a3 > 0) {
                i2 = this.d.getPaddingBottom() + this.d.getPaddingTop() + i + 0;
            } else {
                i2 = 0;
            }
            i3 = a3 + i2;
        }
        if (sVar.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.amazon.aps.iva.t3.i.d(sVar, this.i);
        if (sVar.isShowing()) {
            View view = this.p;
            WeakHashMap<View, com.amazon.aps.iva.p3.r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
            if (!g0.g.b(view)) {
                return;
            }
            int i10 = this.f;
            if (i10 == -1) {
                i10 = -1;
            } else if (i10 == -2) {
                i10 = this.p.getWidth();
            }
            if (i8 == -1) {
                if (z2) {
                    i8 = i3;
                } else {
                    i8 = -1;
                }
                if (z2) {
                    if (this.f == -1) {
                        i5 = -1;
                    } else {
                        i5 = 0;
                    }
                    sVar.setWidth(i5);
                    sVar.setHeight(0);
                } else {
                    if (this.f == -1) {
                        i6 = -1;
                    }
                    sVar.setWidth(i6);
                    sVar.setHeight(-1);
                }
            } else if (i8 == -2) {
                i8 = i3;
            }
            sVar.setOutsideTouchable(true);
            View view2 = this.p;
            int i11 = this.g;
            int i12 = this.h;
            if (i10 < 0) {
                i10 = -1;
            }
            if (i8 < 0) {
                i4 = -1;
            } else {
                i4 = i8;
            }
            sVar.update(view2, i11, i12, i10, i4);
            return;
        }
        int i13 = this.f;
        if (i13 == -1) {
            i13 = -1;
        } else if (i13 == -2) {
            i13 = this.p.getWidth();
        }
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = i3;
        }
        sVar.setWidth(i13);
        sVar.setHeight(i8);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = B;
            if (method != null) {
                try {
                    method.invoke(sVar, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        } else {
            b.b(sVar, true);
        }
        sVar.setOutsideTouchable(true);
        sVar.setTouchInterceptor(this.t);
        if (this.l) {
            com.amazon.aps.iva.t3.i.c(sVar, this.k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = C;
            if (method2 != null) {
                try {
                    method2.invoke(sVar, this.y);
                } catch (Exception unused2) {
                }
            }
        } else {
            b.a(sVar, this.y);
        }
        com.amazon.aps.iva.t3.h.a(sVar, this.p, this.g, this.h, this.m);
        this.d.setSelection(-1);
        if ((!this.z || this.d.isInTouchMode()) && (k0Var = this.d) != null) {
            k0Var.setListSelectionHidden(true);
            k0Var.requestLayout();
        }
        if (!this.z) {
            this.w.post(this.v);
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            boolean z = true;
            if (i == 1) {
                o0 o0Var = o0.this;
                if (o0Var.A.getInputMethodMode() != 2) {
                    z = false;
                }
                if (!z && o0Var.A.getContentView() != null) {
                    Handler handler = o0Var.w;
                    g gVar = o0Var.s;
                    handler.removeCallbacks(gVar);
                    gVar.run();
                }
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }
    }
}
