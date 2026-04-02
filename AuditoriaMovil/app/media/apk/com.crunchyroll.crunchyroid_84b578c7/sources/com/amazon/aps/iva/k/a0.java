package com.amazon.aps.iva.k;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.amazon.aps.iva.a9.k0;
import com.amazon.aps.iva.k.a;
import com.amazon.aps.iva.k.g;
import com.amazon.aps.iva.o.a;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.p3.t0;
import com.amazon.aps.iva.q.i0;
import com.crunchyroll.crunchyroid.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: WindowDecorActionBar.java */
/* loaded from: classes.dex */
public final class a0 extends com.amazon.aps.iva.k.a implements ActionBarOverlayLayout.d {
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public i0 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public d i;
    public d j;
    public a.InterfaceC0549a k;
    public boolean l;
    public final ArrayList<a.b> m;
    public boolean n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public com.amazon.aps.iva.o.g t;
    public boolean u;
    public boolean v;
    public final a w;
    public final b x;
    public final c y;
    public static final AccelerateInterpolator z = new AccelerateInterpolator();
    public static final DecelerateInterpolator A = new DecelerateInterpolator();

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class a extends k0 {
        public a() {
        }

        @Override // com.amazon.aps.iva.p3.s0
        public final void onAnimationEnd() {
            View view;
            a0 a0Var = a0.this;
            if (a0Var.p && (view = a0Var.g) != null) {
                view.setTranslationY(0.0f);
                a0Var.d.setTranslationY(0.0f);
            }
            a0Var.d.setVisibility(8);
            a0Var.d.setTransitioning(false);
            a0Var.t = null;
            a.InterfaceC0549a interfaceC0549a = a0Var.k;
            if (interfaceC0549a != null) {
                interfaceC0549a.a(a0Var.j);
                a0Var.j = null;
                a0Var.k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = a0Var.c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, r0> weakHashMap = g0.a;
                g0.h.c(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class b extends k0 {
        public b() {
        }

        @Override // com.amazon.aps.iva.p3.s0
        public final void onAnimationEnd() {
            a0 a0Var = a0.this;
            a0Var.t = null;
            a0Var.d.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class c implements t0 {
        public c() {
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class d extends com.amazon.aps.iva.o.a implements f.a {
        public final Context d;
        public final androidx.appcompat.view.menu.f e;
        public a.InterfaceC0549a f;
        public WeakReference<View> g;

        public d(Context context, g.e eVar) {
            this.d = context;
            this.f = eVar;
            androidx.appcompat.view.menu.f defaultShowAsAction = new androidx.appcompat.view.menu.f(context).setDefaultShowAsAction(1);
            this.e = defaultShowAsAction;
            defaultShowAsAction.setCallback(this);
        }

        @Override // com.amazon.aps.iva.o.a
        public final void a() {
            a0 a0Var = a0.this;
            if (a0Var.i != this) {
                return;
            }
            if (!(!a0Var.q)) {
                a0Var.j = this;
                a0Var.k = this.f;
            } else {
                this.f.a(this);
            }
            this.f = null;
            a0Var.v(false);
            ActionBarContextView actionBarContextView = a0Var.f;
            if (actionBarContextView.l == null) {
                actionBarContextView.h();
            }
            a0Var.c.setHideOnContentScrollEnabled(a0Var.v);
            a0Var.i = null;
        }

        @Override // com.amazon.aps.iva.o.a
        public final View b() {
            WeakReference<View> weakReference = this.g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // com.amazon.aps.iva.o.a
        public final androidx.appcompat.view.menu.f c() {
            return this.e;
        }

        @Override // com.amazon.aps.iva.o.a
        public final MenuInflater d() {
            return new com.amazon.aps.iva.o.f(this.d);
        }

        @Override // com.amazon.aps.iva.o.a
        public final CharSequence e() {
            return a0.this.f.getSubtitle();
        }

        @Override // com.amazon.aps.iva.o.a
        public final CharSequence f() {
            return a0.this.f.getTitle();
        }

        @Override // com.amazon.aps.iva.o.a
        public final void g() {
            if (a0.this.i != this) {
                return;
            }
            androidx.appcompat.view.menu.f fVar = this.e;
            fVar.stopDispatchingItemsChanged();
            try {
                this.f.d(this, fVar);
            } finally {
                fVar.startDispatchingItemsChanged();
            }
        }

        @Override // com.amazon.aps.iva.o.a
        public final boolean h() {
            return a0.this.f.t;
        }

        @Override // com.amazon.aps.iva.o.a
        public final void i(View view) {
            a0.this.f.setCustomView(view);
            this.g = new WeakReference<>(view);
        }

        @Override // com.amazon.aps.iva.o.a
        public final void j(int i) {
            k(a0.this.a.getResources().getString(i));
        }

        @Override // com.amazon.aps.iva.o.a
        public final void k(CharSequence charSequence) {
            a0.this.f.setSubtitle(charSequence);
        }

        @Override // com.amazon.aps.iva.o.a
        public final void l(int i) {
            m(a0.this.a.getResources().getString(i));
        }

        @Override // com.amazon.aps.iva.o.a
        public final void m(CharSequence charSequence) {
            a0.this.f.setTitle(charSequence);
        }

        @Override // com.amazon.aps.iva.o.a
        public final void n(boolean z) {
            this.c = z;
            a0.this.f.setTitleOptional(z);
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean onMenuItemSelected(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            a.InterfaceC0549a interfaceC0549a = this.f;
            if (interfaceC0549a != null) {
                return interfaceC0549a.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void onMenuModeChange(androidx.appcompat.view.menu.f fVar) {
            if (this.f == null) {
                return;
            }
            g();
            androidx.appcompat.widget.a aVar = a0.this.f.e;
            if (aVar != null) {
                aVar.e();
            }
        }
    }

    public a0(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList<>();
        this.o = 0;
        this.p = true;
        this.s = true;
        this.w = new a();
        this.x = new b();
        this.y = new c();
        View decorView = activity.getWindow().getDecorView();
        w(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(16908290);
    }

    @Override // com.amazon.aps.iva.k.a
    public final boolean b() {
        i0 i0Var = this.e;
        if (i0Var != null && i0Var.h()) {
            this.e.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.k.a
    public final void c(boolean z2) {
        if (z2 == this.l) {
            return;
        }
        this.l = z2;
        ArrayList<a.b> arrayList = this.m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
    }

    @Override // com.amazon.aps.iva.k.a
    public final int d() {
        return this.e.u();
    }

    @Override // com.amazon.aps.iva.k.a
    public final Context e() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // com.amazon.aps.iva.k.a
    public final void g() {
        y(this.a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
    }

    @Override // com.amazon.aps.iva.k.a
    public final boolean i(int i, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        int i2;
        d dVar = this.i;
        if (dVar == null || (fVar = dVar.e) == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z2 = false;
        }
        fVar.setQwertyMode(z2);
        return fVar.performShortcut(i, keyEvent, 0);
    }

    @Override // com.amazon.aps.iva.k.a
    public final void l(boolean z2) {
        if (!this.h) {
            m(z2);
        }
    }

    @Override // com.amazon.aps.iva.k.a
    public final void m(boolean z2) {
        int i;
        if (z2) {
            i = 4;
        } else {
            i = 0;
        }
        x(i, 4);
    }

    @Override // com.amazon.aps.iva.k.a
    public final void n(boolean z2) {
        int i;
        if (z2) {
            i = 2;
        } else {
            i = 0;
        }
        x(i, 2);
    }

    @Override // com.amazon.aps.iva.k.a
    public final void o() {
        x(0, 8);
    }

    @Override // com.amazon.aps.iva.k.a
    public final void p(int i) {
        this.e.s(i);
    }

    @Override // com.amazon.aps.iva.k.a
    public final void q(boolean z2) {
        com.amazon.aps.iva.o.g gVar;
        this.u = z2;
        if (!z2 && (gVar = this.t) != null) {
            gVar.a();
        }
    }

    @Override // com.amazon.aps.iva.k.a
    public final void r(String str) {
        this.e.j(str);
    }

    @Override // com.amazon.aps.iva.k.a
    public final void s(String str) {
        this.e.setTitle(str);
    }

    @Override // com.amazon.aps.iva.k.a
    public final void t(CharSequence charSequence) {
        this.e.setWindowTitle(charSequence);
    }

    @Override // com.amazon.aps.iva.k.a
    public final com.amazon.aps.iva.o.a u(g.e eVar) {
        d dVar = this.i;
        if (dVar != null) {
            dVar.a();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.h();
        d dVar2 = new d(this.f.getContext(), eVar);
        androidx.appcompat.view.menu.f fVar = dVar2.e;
        fVar.stopDispatchingItemsChanged();
        try {
            if (dVar2.f.b(dVar2, fVar)) {
                this.i = dVar2;
                dVar2.g();
                this.f.f(dVar2);
                v(true);
                return dVar2;
            }
            return null;
        } finally {
            fVar.startDispatchingItemsChanged();
        }
    }

    public final void v(boolean z2) {
        r0 l;
        r0 e;
        long j;
        if (z2) {
            if (!this.r) {
                this.r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                z(false);
            }
        } else if (this.r) {
            this.r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            z(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap<View, r0> weakHashMap = g0.a;
        if (g0.g.c(actionBarContainer)) {
            if (z2) {
                e = this.e.l(4, 100L);
                l = this.f.e(0, 200L);
            } else {
                l = this.e.l(0, 200L);
                e = this.f.e(8, 100L);
            }
            com.amazon.aps.iva.o.g gVar = new com.amazon.aps.iva.o.g();
            ArrayList<r0> arrayList = gVar.a;
            arrayList.add(e);
            View view = e.a.get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            View view2 = l.a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j);
            }
            arrayList.add(l);
            gVar.b();
        } else if (z2) {
            this.e.t(4);
            this.f.setVisibility(0);
        } else {
            this.e.t(0);
            this.f.setVisibility(8);
        }
    }

    public final void w(View view) {
        String str;
        i0 wrapper;
        boolean z2;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof i0) {
            wrapper = (i0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.d = actionBarContainer;
        i0 i0Var = this.e;
        if (i0Var != null && this.f != null && actionBarContainer != null) {
            this.a = i0Var.getContext();
            if ((this.e.u() & 4) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.h = true;
            }
            Context context = this.a;
            if (context.getApplicationInfo().targetSdkVersion < 14) {
            }
            this.e.p();
            y(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, com.amazon.aps.iva.j.a.a, R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
                if (actionBarOverlayLayout2.i) {
                    this.v = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap<View, r0> weakHashMap = g0.a;
                g0.i.s(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(a0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void x(int i, int i2) {
        int u = this.e.u();
        if ((i2 & 4) != 0) {
            this.h = true;
        }
        this.e.i((i & i2) | ((~i2) & u));
    }

    public final void y(boolean z2) {
        this.n = z2;
        if (!z2) {
            this.e.q();
            this.d.setTabContainer(null);
        } else {
            this.d.setTabContainer(null);
            this.e.q();
        }
        this.e.k();
        i0 i0Var = this.e;
        boolean z3 = this.n;
        i0Var.n(false);
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        boolean z4 = this.n;
        actionBarOverlayLayout.setHasNonEmbeddedTabs(false);
    }

    public final void z(boolean z2) {
        boolean z3;
        int[] iArr;
        int[] iArr2;
        boolean z4 = this.q;
        if (this.r || !z4) {
            z3 = true;
        } else {
            z3 = false;
        }
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        View view = this.g;
        final c cVar = this.y;
        if (z3) {
            if (!this.s) {
                this.s = true;
                com.amazon.aps.iva.o.g gVar = this.t;
                if (gVar != null) {
                    gVar.a();
                }
                this.d.setVisibility(0);
                int i = this.o;
                b bVar = this.x;
                if (i == 0 && (this.u || z2)) {
                    this.d.setTranslationY(0.0f);
                    float f = -this.d.getHeight();
                    if (z2) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f -= iArr2[1];
                    }
                    this.d.setTranslationY(f);
                    com.amazon.aps.iva.o.g gVar2 = new com.amazon.aps.iva.o.g();
                    r0 a2 = g0.a(this.d);
                    a2.e(0.0f);
                    final View view2 = a2.a.get();
                    if (view2 != null) {
                        if (cVar != null) {
                            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(cVar, view2) { // from class: com.amazon.aps.iva.p3.p0
                                public final /* synthetic */ t0 a;

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    ((View) com.amazon.aps.iva.k.a0.this.d.getParent()).invalidate();
                                }
                            };
                        }
                        r0.a.a(view2.animate(), animatorUpdateListener);
                    }
                    boolean z5 = gVar2.e;
                    ArrayList<r0> arrayList = gVar2.a;
                    if (!z5) {
                        arrayList.add(a2);
                    }
                    if (this.p && view != null) {
                        view.setTranslationY(f);
                        r0 a3 = g0.a(view);
                        a3.e(0.0f);
                        if (!gVar2.e) {
                            arrayList.add(a3);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = A;
                    boolean z6 = gVar2.e;
                    if (!z6) {
                        gVar2.c = decelerateInterpolator;
                    }
                    if (!z6) {
                        gVar2.b = 250L;
                    }
                    if (!z6) {
                        gVar2.d = bVar;
                    }
                    this.t = gVar2;
                    gVar2.b();
                } else {
                    this.d.setAlpha(1.0f);
                    this.d.setTranslationY(0.0f);
                    if (this.p && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    bVar.onAnimationEnd();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap<View, r0> weakHashMap = g0.a;
                    g0.h.c(actionBarOverlayLayout);
                }
            }
        } else if (this.s) {
            this.s = false;
            com.amazon.aps.iva.o.g gVar3 = this.t;
            if (gVar3 != null) {
                gVar3.a();
            }
            int i2 = this.o;
            a aVar = this.w;
            if (i2 == 0 && (this.u || z2)) {
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                com.amazon.aps.iva.o.g gVar4 = new com.amazon.aps.iva.o.g();
                float f2 = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f2 -= iArr[1];
                }
                r0 a4 = g0.a(this.d);
                a4.e(f2);
                final View view3 = a4.a.get();
                if (view3 != null) {
                    if (cVar != null) {
                        animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(cVar, view3) { // from class: com.amazon.aps.iva.p3.p0
                            public final /* synthetic */ t0 a;

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ((View) com.amazon.aps.iva.k.a0.this.d.getParent()).invalidate();
                            }
                        };
                    }
                    r0.a.a(view3.animate(), animatorUpdateListener);
                }
                boolean z7 = gVar4.e;
                ArrayList<r0> arrayList2 = gVar4.a;
                if (!z7) {
                    arrayList2.add(a4);
                }
                if (this.p && view != null) {
                    r0 a5 = g0.a(view);
                    a5.e(f2);
                    if (!gVar4.e) {
                        arrayList2.add(a5);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = z;
                boolean z8 = gVar4.e;
                if (!z8) {
                    gVar4.c = accelerateInterpolator;
                }
                if (!z8) {
                    gVar4.b = 250L;
                }
                if (!z8) {
                    gVar4.d = aVar;
                }
                this.t = gVar4;
                gVar4.b();
                return;
            }
            aVar.onAnimationEnd();
        }
    }

    public a0(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList<>();
        this.o = 0;
        this.p = true;
        this.s = true;
        this.w = new a();
        this.x = new b();
        this.y = new c();
        w(dialog.getWindow().getDecorView());
    }
}
