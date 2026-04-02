package c.b.c;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import c.b.c.a;
import c.b.h.a;
import c.b.h.i.g;
import c.b.i.d0;
import c.i.k.d0;
import c.i.k.f0;
import c.i.k.g0;
import c.i.k.h0;
import c.i.k.i0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class b0 extends c.b.c.a implements ActionBarOverlayLayout.d {
    public static final Interpolator a = new AccelerateInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final Interpolator f789b = new DecelerateInterpolator();
    public final g0 A;
    public final i0 B;

    /* renamed from: c  reason: collision with root package name */
    public Context f790c;

    /* renamed from: d  reason: collision with root package name */
    public Context f791d;

    /* renamed from: e  reason: collision with root package name */
    public ActionBarOverlayLayout f792e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContainer f793f;

    /* renamed from: g  reason: collision with root package name */
    public d0 f794g;

    /* renamed from: h  reason: collision with root package name */
    public ActionBarContextView f795h;

    /* renamed from: i  reason: collision with root package name */
    public View f796i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f797j;

    /* renamed from: k  reason: collision with root package name */
    public d f798k;

    /* renamed from: l  reason: collision with root package name */
    public c.b.h.a f799l;

    /* renamed from: m  reason: collision with root package name */
    public a.InterfaceC0018a f800m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f801n;
    public ArrayList<a.b> o;
    public boolean p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public c.b.h.g w;
    public boolean x;
    public boolean y;
    public final g0 z;

    /* loaded from: classes.dex */
    public class a extends h0 {
        public a() {
        }

        @Override // c.i.k.g0
        public void b(View view) {
            View view2;
            b0 b0Var = b0.this;
            if (b0Var.r && (view2 = b0Var.f796i) != null) {
                view2.setTranslationY(0.0f);
                b0.this.f793f.setTranslationY(0.0f);
            }
            b0.this.f793f.setVisibility(8);
            b0.this.f793f.setTransitioning(false);
            b0 b0Var2 = b0.this;
            b0Var2.w = null;
            a.InterfaceC0018a interfaceC0018a = b0Var2.f800m;
            if (interfaceC0018a != null) {
                interfaceC0018a.a(b0Var2.f799l);
                b0Var2.f799l = null;
                b0Var2.f800m = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = b0.this.f792e;
            if (actionBarOverlayLayout != null) {
                c.i.k.d0.y(actionBarOverlayLayout);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends h0 {
        public b() {
        }

        @Override // c.i.k.g0
        public void b(View view) {
            b0 b0Var = b0.this;
            b0Var.w = null;
            b0Var.f793f.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class c implements i0 {
        public c() {
        }
    }

    /* loaded from: classes.dex */
    public class d extends c.b.h.a implements g.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f802c;

        /* renamed from: d  reason: collision with root package name */
        public final c.b.h.i.g f803d;

        /* renamed from: e  reason: collision with root package name */
        public a.InterfaceC0018a f804e;

        /* renamed from: f  reason: collision with root package name */
        public WeakReference<View> f805f;

        public d(Context context, a.InterfaceC0018a interfaceC0018a) {
            this.f802c = context;
            this.f804e = interfaceC0018a;
            c.b.h.i.g gVar = new c.b.h.i.g(context);
            gVar.f1011m = 1;
            this.f803d = gVar;
            gVar.f1004f = this;
        }

        @Override // c.b.h.i.g.a
        public boolean a(c.b.h.i.g gVar, MenuItem menuItem) {
            a.InterfaceC0018a interfaceC0018a = this.f804e;
            if (interfaceC0018a != null) {
                return interfaceC0018a.d(this, menuItem);
            }
            return false;
        }

        @Override // c.b.h.i.g.a
        public void b(c.b.h.i.g gVar) {
            if (this.f804e == null) {
                return;
            }
            i();
            c.b.i.c cVar = b0.this.f795h.f1063d;
            if (cVar != null) {
                cVar.n();
            }
        }

        @Override // c.b.h.a
        public void c() {
            b0 b0Var = b0.this;
            if (b0Var.f798k != this) {
                return;
            }
            boolean z = true;
            if ((b0Var.s || b0Var.t) ? false : false) {
                this.f804e.a(this);
            } else {
                b0Var.f799l = this;
                b0Var.f800m = this.f804e;
            }
            this.f804e = null;
            b0.this.t(false);
            ActionBarContextView actionBarContextView = b0.this.f795h;
            if (actionBarContextView.f174k == null) {
                actionBarContextView.h();
            }
            b0.this.f794g.s().sendAccessibilityEvent(32);
            b0 b0Var2 = b0.this;
            b0Var2.f792e.setHideOnContentScrollEnabled(b0Var2.y);
            b0.this.f798k = null;
        }

        @Override // c.b.h.a
        public View d() {
            WeakReference<View> weakReference = this.f805f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // c.b.h.a
        public Menu e() {
            return this.f803d;
        }

        @Override // c.b.h.a
        public MenuInflater f() {
            return new c.b.h.f(this.f802c);
        }

        @Override // c.b.h.a
        public CharSequence g() {
            return b0.this.f795h.getSubtitle();
        }

        @Override // c.b.h.a
        public CharSequence h() {
            return b0.this.f795h.getTitle();
        }

        @Override // c.b.h.a
        public void i() {
            if (b0.this.f798k != this) {
                return;
            }
            this.f803d.z();
            try {
                this.f804e.c(this, this.f803d);
            } finally {
                this.f803d.y();
            }
        }

        @Override // c.b.h.a
        public boolean j() {
            return b0.this.f795h.s;
        }

        @Override // c.b.h.a
        public void k(View view) {
            b0.this.f795h.setCustomView(view);
            this.f805f = new WeakReference<>(view);
        }

        @Override // c.b.h.a
        public void l(int i2) {
            b0.this.f795h.setSubtitle(b0.this.f790c.getResources().getString(i2));
        }

        @Override // c.b.h.a
        public void m(CharSequence charSequence) {
            b0.this.f795h.setSubtitle(charSequence);
        }

        @Override // c.b.h.a
        public void n(int i2) {
            b0.this.f795h.setTitle(b0.this.f790c.getResources().getString(i2));
        }

        @Override // c.b.h.a
        public void o(CharSequence charSequence) {
            b0.this.f795h.setTitle(charSequence);
        }

        @Override // c.b.h.a
        public void p(boolean z) {
            this.f907b = z;
            b0.this.f795h.setTitleOptional(z);
        }
    }

    public b0(Activity activity, boolean z) {
        new ArrayList();
        this.o = new ArrayList<>();
        this.q = 0;
        this.r = true;
        this.v = true;
        this.z = new a();
        this.A = new b();
        this.B = new c();
        View decorView = activity.getWindow().getDecorView();
        u(decorView);
        if (z) {
            return;
        }
        this.f796i = decorView.findViewById(16908290);
    }

    public b0(Dialog dialog) {
        new ArrayList();
        this.o = new ArrayList<>();
        this.q = 0;
        this.r = true;
        this.v = true;
        this.z = new a();
        this.A = new b();
        this.B = new c();
        u(dialog.getWindow().getDecorView());
    }

    @Override // c.b.c.a
    public boolean b() {
        d0 d0Var = this.f794g;
        if (d0Var == null || !d0Var.k()) {
            return false;
        }
        this.f794g.collapseActionView();
        return true;
    }

    @Override // c.b.c.a
    public void c(boolean z) {
        if (z == this.f801n) {
            return;
        }
        this.f801n = z;
        int size = this.o.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.o.get(i2).a(z);
        }
    }

    @Override // c.b.c.a
    public int d() {
        return this.f794g.u();
    }

    @Override // c.b.c.a
    public Context e() {
        if (this.f791d == null) {
            TypedValue typedValue = new TypedValue();
            this.f790c.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f791d = new ContextThemeWrapper(this.f790c, i2);
            } else {
                this.f791d = this.f790c;
            }
        }
        return this.f791d;
    }

    @Override // c.b.c.a
    public void f() {
        if (this.s) {
            return;
        }
        this.s = true;
        x(false);
    }

    @Override // c.b.c.a
    public void h(Configuration configuration) {
        w(this.f790c.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
    }

    @Override // c.b.c.a
    public boolean j(int i2, KeyEvent keyEvent) {
        c.b.h.i.g gVar;
        d dVar = this.f798k;
        if (dVar == null || (gVar = dVar.f803d) == null) {
            return false;
        }
        gVar.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return gVar.performShortcut(i2, keyEvent, 0);
    }

    @Override // c.b.c.a
    public void m(Drawable drawable) {
        this.f793f.setPrimaryBackground(drawable);
    }

    @Override // c.b.c.a
    public void n(boolean z) {
        if (this.f797j) {
            return;
        }
        v(z ? 4 : 0, 4);
    }

    @Override // c.b.c.a
    public void o(boolean z) {
        v(z ? 8 : 0, 8);
    }

    @Override // c.b.c.a
    public void p(boolean z) {
        c.b.h.g gVar;
        this.x = z;
        if (z || (gVar = this.w) == null) {
            return;
        }
        gVar.a();
    }

    @Override // c.b.c.a
    public void q(CharSequence charSequence) {
        this.f794g.setTitle(charSequence);
    }

    @Override // c.b.c.a
    public void r(CharSequence charSequence) {
        this.f794g.setWindowTitle(charSequence);
    }

    @Override // c.b.c.a
    public c.b.h.a s(a.InterfaceC0018a interfaceC0018a) {
        d dVar = this.f798k;
        if (dVar != null) {
            dVar.c();
        }
        this.f792e.setHideOnContentScrollEnabled(false);
        this.f795h.h();
        d dVar2 = new d(this.f795h.getContext(), interfaceC0018a);
        dVar2.f803d.z();
        try {
            if (dVar2.f804e.b(dVar2, dVar2.f803d)) {
                this.f798k = dVar2;
                dVar2.i();
                this.f795h.f(dVar2);
                t(true);
                this.f795h.sendAccessibilityEvent(32);
                return dVar2;
            }
            return null;
        } finally {
            dVar2.f803d.y();
        }
    }

    public void t(boolean z) {
        f0 p;
        f0 e2;
        if (z) {
            if (!this.u) {
                this.u = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f792e;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                x(false);
            }
        } else if (this.u) {
            this.u = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f792e;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            x(false);
        }
        ActionBarContainer actionBarContainer = this.f793f;
        AtomicInteger atomicInteger = c.i.k.d0.a;
        if (!d0.f.c(actionBarContainer)) {
            if (z) {
                this.f794g.r(4);
                this.f795h.setVisibility(0);
                return;
            }
            this.f794g.r(0);
            this.f795h.setVisibility(8);
            return;
        }
        if (z) {
            e2 = this.f794g.p(4, 100L);
            p = this.f795h.e(0, 200L);
        } else {
            p = this.f794g.p(0, 200L);
            e2 = this.f795h.e(8, 100L);
        }
        c.b.h.g gVar = new c.b.h.g();
        gVar.a.add(e2);
        View view = e2.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = p.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        gVar.a.add(p);
        gVar.b();
    }

    public final void u(View view) {
        c.b.i.d0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f792e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof c.b.i.d0) {
            wrapper = (c.b.i.d0) findViewById;
        } else if (!(findViewById instanceof Toolbar)) {
            StringBuilder y = e.a.d.a.a.y("Can't make a decor toolbar out of ");
            y.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(y.toString());
        } else {
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f794g = wrapper;
        this.f795h = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f793f = actionBarContainer;
        c.b.i.d0 d0Var = this.f794g;
        if (d0Var == null || this.f795h == null || actionBarContainer == null) {
            throw new IllegalStateException(b0.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f790c = d0Var.getContext();
        boolean z = (this.f794g.u() & 4) != 0;
        if (z) {
            this.f797j = true;
        }
        Context context = this.f790c;
        this.f794g.t((context.getApplicationInfo().targetSdkVersion < 14) || z);
        w(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f790c.obtainStyledAttributes(null, c.b.b.a, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f792e;
            if (!actionBarOverlayLayout2.f185i) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.y = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            c.i.k.d0.B(this.f793f, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public void v(int i2, int i3) {
        int u = this.f794g.u();
        if ((i3 & 4) != 0) {
            this.f797j = true;
        }
        this.f794g.l((i2 & i3) | ((i3 ^ (-1)) & u));
    }

    public final void w(boolean z) {
        this.p = z;
        if (z) {
            this.f793f.setTabContainer(null);
            this.f794g.j(null);
        } else {
            this.f794g.j(null);
            this.f793f.setTabContainer(null);
        }
        boolean z2 = true;
        boolean z3 = this.f794g.o() == 2;
        this.f794g.x(!this.p && z3);
        this.f792e.setHasNonEmbeddedTabs((this.p || !z3) ? false : false);
    }

    public final void x(boolean z) {
        View view;
        int[] iArr;
        View view2;
        View view3;
        int[] iArr2;
        if (!(this.u || !(this.s || this.t))) {
            if (this.v) {
                this.v = false;
                c.b.h.g gVar = this.w;
                if (gVar != null) {
                    gVar.a();
                }
                if (this.q != 0 || (!this.x && !z)) {
                    this.z.b(null);
                    return;
                }
                this.f793f.setAlpha(1.0f);
                this.f793f.setTransitioning(true);
                c.b.h.g gVar2 = new c.b.h.g();
                float f2 = -this.f793f.getHeight();
                if (z) {
                    this.f793f.getLocationInWindow(new int[]{0, 0});
                    f2 -= iArr[1];
                }
                f0 b2 = c.i.k.d0.b(this.f793f);
                b2.g(f2);
                b2.f(this.B);
                if (!gVar2.f945e) {
                    gVar2.a.add(b2);
                }
                if (this.r && (view = this.f796i) != null) {
                    f0 b3 = c.i.k.d0.b(view);
                    b3.g(f2);
                    if (!gVar2.f945e) {
                        gVar2.a.add(b3);
                    }
                }
                Interpolator interpolator = a;
                boolean z2 = gVar2.f945e;
                if (!z2) {
                    gVar2.f943c = interpolator;
                }
                if (!z2) {
                    gVar2.f942b = 250L;
                }
                g0 g0Var = this.z;
                if (!z2) {
                    gVar2.f944d = g0Var;
                }
                this.w = gVar2;
                gVar2.b();
            }
        } else if (this.v) {
        } else {
            this.v = true;
            c.b.h.g gVar3 = this.w;
            if (gVar3 != null) {
                gVar3.a();
            }
            this.f793f.setVisibility(0);
            if (this.q == 0 && (this.x || z)) {
                this.f793f.setTranslationY(0.0f);
                float f3 = -this.f793f.getHeight();
                if (z) {
                    this.f793f.getLocationInWindow(new int[]{0, 0});
                    f3 -= iArr2[1];
                }
                this.f793f.setTranslationY(f3);
                c.b.h.g gVar4 = new c.b.h.g();
                f0 b4 = c.i.k.d0.b(this.f793f);
                b4.g(0.0f);
                b4.f(this.B);
                if (!gVar4.f945e) {
                    gVar4.a.add(b4);
                }
                if (this.r && (view3 = this.f796i) != null) {
                    view3.setTranslationY(f3);
                    f0 b5 = c.i.k.d0.b(this.f796i);
                    b5.g(0.0f);
                    if (!gVar4.f945e) {
                        gVar4.a.add(b5);
                    }
                }
                Interpolator interpolator2 = f789b;
                boolean z3 = gVar4.f945e;
                if (!z3) {
                    gVar4.f943c = interpolator2;
                }
                if (!z3) {
                    gVar4.f942b = 250L;
                }
                g0 g0Var2 = this.A;
                if (!z3) {
                    gVar4.f944d = g0Var2;
                }
                this.w = gVar4;
                gVar4.b();
            } else {
                this.f793f.setAlpha(1.0f);
                this.f793f.setTranslationY(0.0f);
                if (this.r && (view2 = this.f796i) != null) {
                    view2.setTranslationY(0.0f);
                }
                this.A.b(null);
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f792e;
            if (actionBarOverlayLayout != null) {
                c.i.k.d0.y(actionBarOverlayLayout);
            }
        }
    }
}
