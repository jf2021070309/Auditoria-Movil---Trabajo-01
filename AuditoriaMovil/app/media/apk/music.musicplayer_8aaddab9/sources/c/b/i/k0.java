package c.b.i;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import c.i.k.d0;
import ch.qos.logback.classic.Level;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class k0 implements c.b.h.i.p {
    public static Method a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f1193b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f1194c;
    public Rect A;
    public boolean B;
    public PopupWindow C;

    /* renamed from: d  reason: collision with root package name */
    public Context f1195d;

    /* renamed from: e  reason: collision with root package name */
    public ListAdapter f1196e;

    /* renamed from: f  reason: collision with root package name */
    public f0 f1197f;

    /* renamed from: i  reason: collision with root package name */
    public int f1200i;

    /* renamed from: j  reason: collision with root package name */
    public int f1201j;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1203l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1204m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1205n;
    public DataSetObserver r;
    public View s;
    public AdapterView.OnItemClickListener t;
    public final Handler y;

    /* renamed from: g  reason: collision with root package name */
    public int f1198g = -2;

    /* renamed from: h  reason: collision with root package name */
    public int f1199h = -2;

    /* renamed from: k  reason: collision with root package name */
    public int f1202k = 1002;
    public int o = 0;
    public int p = Integer.MAX_VALUE;
    public int q = 0;
    public final e u = new e();
    public final d v = new d();
    public final c w = new c();
    public final a x = new a();
    public final Rect z = new Rect();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = k0.this.f1197f;
            if (f0Var != null) {
                f0Var.setListSelectionHidden(true);
                f0Var.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (k0.this.a()) {
                k0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            k0.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class c implements AbsListView.OnScrollListener {
        public c() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 == 1) {
                if ((k0.this.C.getInputMethodMode() == 2) || k0.this.C.getContentView() == null) {
                    return;
                }
                k0 k0Var = k0.this;
                k0Var.y.removeCallbacks(k0Var.u);
                k0.this.u.run();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = k0.this.C) != null && popupWindow.isShowing() && x >= 0 && x < k0.this.C.getWidth() && y >= 0 && y < k0.this.C.getHeight()) {
                k0 k0Var = k0.this;
                k0Var.y.postDelayed(k0Var.u, 250L);
                return false;
            } else if (action == 1) {
                k0 k0Var2 = k0.this;
                k0Var2.y.removeCallbacks(k0Var2.u);
                return false;
            } else {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = k0.this.f1197f;
            if (f0Var != null) {
                AtomicInteger atomicInteger = c.i.k.d0.a;
                if (!d0.f.b(f0Var) || k0.this.f1197f.getCount() <= k0.this.f1197f.getChildCount()) {
                    return;
                }
                int childCount = k0.this.f1197f.getChildCount();
                k0 k0Var = k0.this;
                if (childCount <= k0Var.p) {
                    k0Var.C.setInputMethodMode(2);
                    k0.this.show();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f1194c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f1193b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public k0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1195d = context;
        this.y = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.b.f783n, i2, i3);
        this.f1200i = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f1201j = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1203l = true;
        }
        obtainStyledAttributes.recycle();
        p pVar = new p(context, attributeSet, i2, i3);
        this.C = pVar;
        pVar.setInputMethodMode(1);
    }

    @Override // c.b.h.i.p
    public boolean a() {
        return this.C.isShowing();
    }

    public f0 d(Context context, boolean z) {
        return new f0(context, z);
    }

    @Override // c.b.h.i.p
    public void dismiss() {
        this.C.dismiss();
        this.C.setContentView(null);
        this.f1197f = null;
        this.y.removeCallbacks(this.u);
    }

    public void e(Drawable drawable) {
        this.C.setBackgroundDrawable(drawable);
    }

    public int f() {
        return this.f1200i;
    }

    public void g(int i2) {
        this.f1200i = i2;
    }

    public Drawable i() {
        return this.C.getBackground();
    }

    @Override // c.b.h.i.p
    public ListView j() {
        return this.f1197f;
    }

    public void l(int i2) {
        this.f1201j = i2;
        this.f1203l = true;
    }

    public int o() {
        if (this.f1203l) {
            return this.f1201j;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.r;
        if (dataSetObserver == null) {
            this.r = new b();
        } else {
            ListAdapter listAdapter2 = this.f1196e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1196e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.r);
        }
        f0 f0Var = this.f1197f;
        if (f0Var != null) {
            f0Var.setAdapter(this.f1196e);
        }
    }

    public void q(int i2) {
        Drawable background = this.C.getBackground();
        if (background == null) {
            this.f1199h = i2;
            return;
        }
        background.getPadding(this.z);
        Rect rect = this.z;
        this.f1199h = rect.left + rect.right + i2;
    }

    public void r(boolean z) {
        this.B = z;
        this.C.setFocusable(z);
    }

    @Override // c.b.h.i.p
    public void show() {
        int i2;
        int maxAvailableHeight;
        int makeMeasureSpec;
        int paddingBottom;
        f0 f0Var;
        if (this.f1197f == null) {
            f0 d2 = d(this.f1195d, !this.B);
            this.f1197f = d2;
            d2.setAdapter(this.f1196e);
            this.f1197f.setOnItemClickListener(this.t);
            this.f1197f.setFocusable(true);
            this.f1197f.setFocusableInTouchMode(true);
            this.f1197f.setOnItemSelectedListener(new j0(this));
            this.f1197f.setOnScrollListener(this.w);
            this.C.setContentView(this.f1197f);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.C.getContentView();
        }
        Drawable background = this.C.getBackground();
        if (background != null) {
            background.getPadding(this.z);
            Rect rect = this.z;
            int i3 = rect.top;
            i2 = rect.bottom + i3;
            if (!this.f1203l) {
                this.f1201j = -i3;
            }
        } else {
            this.z.setEmpty();
            i2 = 0;
        }
        boolean z = this.C.getInputMethodMode() == 2;
        View view = this.s;
        int i4 = this.f1201j;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f1193b;
            if (method != null) {
                try {
                    maxAvailableHeight = ((Integer) method.invoke(this.C, view, Integer.valueOf(i4), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                }
            }
            maxAvailableHeight = this.C.getMaxAvailableHeight(view, i4);
        } else {
            maxAvailableHeight = this.C.getMaxAvailableHeight(view, i4, z);
        }
        if (this.f1198g == -1) {
            paddingBottom = maxAvailableHeight + i2;
        } else {
            int i5 = this.f1199h;
            if (i5 == -2) {
                int i6 = this.f1195d.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.z;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6 - (rect2.left + rect2.right), Level.ALL_INT);
            } else if (i5 != -1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            } else {
                int i7 = this.f1195d.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.z;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7 - (rect3.left + rect3.right), 1073741824);
            }
            int a2 = this.f1197f.a(makeMeasureSpec, maxAvailableHeight - 0, -1);
            paddingBottom = a2 + (a2 > 0 ? this.f1197f.getPaddingBottom() + this.f1197f.getPaddingTop() + i2 + 0 : 0);
        }
        boolean z2 = this.C.getInputMethodMode() == 2;
        c.i.a.l0(this.C, this.f1202k);
        if (this.C.isShowing()) {
            View view2 = this.s;
            AtomicInteger atomicInteger = c.i.k.d0.a;
            if (d0.f.b(view2)) {
                int i8 = this.f1199h;
                if (i8 == -1) {
                    i8 = -1;
                } else if (i8 == -2) {
                    i8 = this.s.getWidth();
                }
                int i9 = this.f1198g;
                if (i9 == -1) {
                    if (!z2) {
                        paddingBottom = -1;
                    }
                    if (z2) {
                        this.C.setWidth(this.f1199h == -1 ? -1 : 0);
                        this.C.setHeight(0);
                    } else {
                        this.C.setWidth(this.f1199h == -1 ? -1 : 0);
                        this.C.setHeight(-1);
                    }
                } else if (i9 != -2) {
                    paddingBottom = i9;
                }
                this.C.setOutsideTouchable(true);
                this.C.update(this.s, this.f1200i, this.f1201j, i8 < 0 ? -1 : i8, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i10 = this.f1199h;
        if (i10 == -1) {
            i10 = -1;
        } else if (i10 == -2) {
            i10 = this.s.getWidth();
        }
        int i11 = this.f1198g;
        if (i11 == -1) {
            paddingBottom = -1;
        } else if (i11 != -2) {
            paddingBottom = i11;
        }
        this.C.setWidth(i10);
        this.C.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = a;
            if (method2 != null) {
                try {
                    method2.invoke(this.C, Boolean.TRUE);
                } catch (Exception unused2) {
                }
            }
        } else {
            this.C.setIsClippedToScreen(true);
        }
        this.C.setOutsideTouchable(true);
        this.C.setTouchInterceptor(this.v);
        if (this.f1205n) {
            c.i.a.f0(this.C, this.f1204m);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f1194c;
            if (method3 != null) {
                try {
                    method3.invoke(this.C, this.A);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.C.setEpicenterBounds(this.A);
        }
        c.i.l.e.a(this.C, this.s, this.f1200i, this.f1201j, this.o);
        this.f1197f.setSelection(-1);
        if ((!this.B || this.f1197f.isInTouchMode()) && (f0Var = this.f1197f) != null) {
            f0Var.setListSelectionHidden(true);
            f0Var.requestLayout();
        }
        if (this.B) {
            return;
        }
        this.y.post(this.x);
    }
}
