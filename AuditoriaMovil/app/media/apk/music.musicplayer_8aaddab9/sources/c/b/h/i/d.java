package c.b.h.i;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import c.b.h.i.m;
import c.b.i.l0;
import c.b.i.m0;
import c.i.k.d0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;

    /* renamed from: b  reason: collision with root package name */
    public final Context f971b;

    /* renamed from: c  reason: collision with root package name */
    public final int f972c;

    /* renamed from: d  reason: collision with root package name */
    public final int f973d;

    /* renamed from: e  reason: collision with root package name */
    public final int f974e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f975f;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f976g;
    public View o;
    public View p;
    public int q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public boolean w;
    public m.a x;
    public ViewTreeObserver y;
    public PopupWindow.OnDismissListener z;

    /* renamed from: h  reason: collision with root package name */
    public final List<g> f977h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final List<C0019d> f978i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f979j = new a();

    /* renamed from: k  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f980k = new b();

    /* renamed from: l  reason: collision with root package name */
    public final l0 f981l = new c();

    /* renamed from: m  reason: collision with root package name */
    public int f982m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f983n = 0;
    public boolean v = false;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d.this.a() || d.this.f978i.size() <= 0 || d.this.f978i.get(0).a.B) {
                return;
            }
            View view = d.this.p;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            for (C0019d c0019d : d.this.f978i) {
                c0019d.a.show();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.y = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.y.removeGlobalOnLayoutListener(dVar.f979j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public class c implements l0 {

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ C0019d a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ MenuItem f984b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ g f985c;

            public a(C0019d c0019d, MenuItem menuItem, g gVar) {
                this.a = c0019d;
                this.f984b = menuItem;
                this.f985c = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0019d c0019d = this.a;
                if (c0019d != null) {
                    d.this.A = true;
                    c0019d.f987b.c(false);
                    d.this.A = false;
                }
                if (this.f984b.isEnabled() && this.f984b.hasSubMenu()) {
                    this.f985c.r(this.f984b, 4);
                }
            }
        }

        public c() {
        }

        @Override // c.b.i.l0
        public void b(g gVar, MenuItem menuItem) {
            d.this.f976g.removeCallbacksAndMessages(null);
            int size = d.this.f978i.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (gVar == d.this.f978i.get(i2).f987b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return;
            }
            int i3 = i2 + 1;
            d.this.f976g.postAtTime(new a(i3 < d.this.f978i.size() ? d.this.f978i.get(i3) : null, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // c.b.i.l0
        public void c(g gVar, MenuItem menuItem) {
            d.this.f976g.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: c.b.h.i.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0019d {
        public final m0 a;

        /* renamed from: b  reason: collision with root package name */
        public final g f987b;

        /* renamed from: c  reason: collision with root package name */
        public final int f988c;

        public C0019d(m0 m0Var, g gVar, int i2) {
            this.a = m0Var;
            this.f987b = gVar;
            this.f988c = i2;
        }
    }

    public d(Context context, View view, int i2, int i3, boolean z) {
        this.f971b = context;
        this.o = view;
        this.f973d = i2;
        this.f974e = i3;
        this.f975f = z;
        AtomicInteger atomicInteger = d0.a;
        this.q = d0.d.d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f972c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f976g = new Handler();
    }

    @Override // c.b.h.i.p
    public boolean a() {
        return this.f978i.size() > 0 && this.f978i.get(0).a.a();
    }

    @Override // c.b.h.i.m
    public void b(g gVar, boolean z) {
        int size = this.f978i.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (gVar == this.f978i.get(i2).f987b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < this.f978i.size()) {
            this.f978i.get(i3).f987b.c(false);
        }
        C0019d remove = this.f978i.remove(i2);
        remove.f987b.u(this);
        if (this.A) {
            m0 m0Var = remove.a;
            Objects.requireNonNull(m0Var);
            if (Build.VERSION.SDK_INT >= 23) {
                m0Var.C.setExitTransition(null);
            }
            remove.a.C.setAnimationStyle(0);
        }
        remove.a.dismiss();
        int size2 = this.f978i.size();
        if (size2 > 0) {
            this.q = this.f978i.get(size2 - 1).f988c;
        } else {
            View view = this.o;
            AtomicInteger atomicInteger = d0.a;
            this.q = d0.d.d(view) == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                this.f978i.get(0).f987b.c(false);
                return;
            }
            return;
        }
        dismiss();
        m.a aVar = this.x;
        if (aVar != null) {
            aVar.b(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.y.removeGlobalOnLayoutListener(this.f979j);
            }
            this.y = null;
        }
        this.p.removeOnAttachStateChangeListener(this.f980k);
        this.z.onDismiss();
    }

    @Override // c.b.h.i.m
    public void c(boolean z) {
        for (C0019d c0019d : this.f978i) {
            ListAdapter adapter = c0019d.a.f1197f.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((f) adapter).notifyDataSetChanged();
        }
    }

    @Override // c.b.h.i.m
    public boolean d() {
        return false;
    }

    @Override // c.b.h.i.p
    public void dismiss() {
        int size = this.f978i.size();
        if (size > 0) {
            C0019d[] c0019dArr = (C0019d[]) this.f978i.toArray(new C0019d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0019d c0019d = c0019dArr[i2];
                if (c0019d.a.a()) {
                    c0019d.a.dismiss();
                }
            }
        }
    }

    @Override // c.b.h.i.m
    public void g(m.a aVar) {
        this.x = aVar;
    }

    @Override // c.b.h.i.m
    public boolean i(r rVar) {
        for (C0019d c0019d : this.f978i) {
            if (rVar == c0019d.f987b) {
                c0019d.a.f1197f.requestFocus();
                return true;
            }
        }
        if (rVar.hasVisibleItems()) {
            rVar.b(this, this.f971b);
            if (a()) {
                u(rVar);
            } else {
                this.f977h.add(rVar);
            }
            m.a aVar = this.x;
            if (aVar != null) {
                aVar.c(rVar);
            }
            return true;
        }
        return false;
    }

    @Override // c.b.h.i.p
    public ListView j() {
        if (this.f978i.isEmpty()) {
            return null;
        }
        List<C0019d> list = this.f978i;
        return list.get(list.size() - 1).a.f1197f;
    }

    @Override // c.b.h.i.k
    public void k(g gVar) {
        gVar.b(this, this.f971b);
        if (a()) {
            u(gVar);
        } else {
            this.f977h.add(gVar);
        }
    }

    @Override // c.b.h.i.k
    public void m(View view) {
        if (this.o != view) {
            this.o = view;
            int i2 = this.f982m;
            AtomicInteger atomicInteger = d0.a;
            this.f983n = Gravity.getAbsoluteGravity(i2, d0.d.d(view));
        }
    }

    @Override // c.b.h.i.k
    public void n(boolean z) {
        this.v = z;
    }

    @Override // c.b.h.i.k
    public void o(int i2) {
        if (this.f982m != i2) {
            this.f982m = i2;
            View view = this.o;
            AtomicInteger atomicInteger = d0.a;
            this.f983n = Gravity.getAbsoluteGravity(i2, d0.d.d(view));
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0019d c0019d;
        int size = this.f978i.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                c0019d = null;
                break;
            }
            c0019d = this.f978i.get(i2);
            if (!c0019d.a.a()) {
                break;
            }
            i2++;
        }
        if (c0019d != null) {
            c0019d.f987b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i2 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // c.b.h.i.k
    public void p(int i2) {
        this.r = true;
        this.t = i2;
    }

    @Override // c.b.h.i.k
    public void q(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // c.b.h.i.k
    public void r(boolean z) {
        this.w = z;
    }

    @Override // c.b.h.i.k
    public void s(int i2) {
        this.s = true;
        this.u = i2;
    }

    @Override // c.b.h.i.p
    public void show() {
        if (a()) {
            return;
        }
        for (g gVar : this.f977h) {
            u(gVar);
        }
        this.f977h.clear();
        View view = this.o;
        this.p = view;
        if (view != null) {
            boolean z = this.y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.y = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f979j);
            }
            this.p.addOnAttachStateChangeListener(this.f980k);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(c.b.h.i.g r17) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.h.i.d.u(c.b.h.i.g):void");
    }
}
