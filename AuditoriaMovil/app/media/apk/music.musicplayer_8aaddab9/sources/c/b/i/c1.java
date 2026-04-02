package c.b.i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import c.b.h.i.g;
import c.b.h.i.m;
import c.i.k.d0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class c1 implements d0 {
    public Toolbar a;

    /* renamed from: b  reason: collision with root package name */
    public int f1098b;

    /* renamed from: c  reason: collision with root package name */
    public View f1099c;

    /* renamed from: d  reason: collision with root package name */
    public View f1100d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f1101e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f1102f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f1103g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1104h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f1105i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1106j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1107k;

    /* renamed from: l  reason: collision with root package name */
    public Window.Callback f1108l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1109m;

    /* renamed from: n  reason: collision with root package name */
    public c f1110n;
    public int o;
    public Drawable p;

    /* loaded from: classes.dex */
    public class a extends c.i.k.h0 {
        public boolean a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f1111b;

        public a(int i2) {
            this.f1111b = i2;
        }

        @Override // c.i.k.h0, c.i.k.g0
        public void a(View view) {
            this.a = true;
        }

        @Override // c.i.k.g0
        public void b(View view) {
            if (this.a) {
                return;
            }
            c1.this.a.setVisibility(this.f1111b);
        }

        @Override // c.i.k.h0, c.i.k.g0
        public void c(View view) {
            c1.this.a.setVisibility(0);
        }
    }

    public c1(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.o = 0;
        this.a = toolbar;
        this.f1105i = toolbar.getTitle();
        this.f1106j = toolbar.getSubtitle();
        this.f1104h = this.f1105i != null;
        this.f1103g = toolbar.getNavigationIcon();
        a1 q = a1.q(toolbar.getContext(), null, c.b.b.a, R.attr.actionBarStyle, 0);
        int i2 = 15;
        this.p = q.g(15);
        if (z) {
            CharSequence n2 = q.n(27);
            if (!TextUtils.isEmpty(n2)) {
                setTitle(n2);
            }
            CharSequence n3 = q.n(25);
            if (!TextUtils.isEmpty(n3)) {
                this.f1106j = n3;
                if ((this.f1098b & 8) != 0) {
                    this.a.setSubtitle(n3);
                }
            }
            Drawable g2 = q.g(20);
            if (g2 != null) {
                this.f1102f = g2;
                A();
            }
            Drawable g3 = q.g(17);
            if (g3 != null) {
                this.f1101e = g3;
                A();
            }
            if (this.f1103g == null && (drawable = this.p) != null) {
                this.f1103g = drawable;
                z();
            }
            l(q.j(10, 0));
            int l2 = q.l(9, 0);
            if (l2 != 0) {
                View inflate = LayoutInflater.from(this.a.getContext()).inflate(l2, (ViewGroup) this.a, false);
                View view = this.f1100d;
                if (view != null && (this.f1098b & 16) != 0) {
                    this.a.removeView(view);
                }
                this.f1100d = inflate;
                if (inflate != null && (this.f1098b & 16) != 0) {
                    this.a.addView(inflate);
                }
                l(this.f1098b | 16);
            }
            int k2 = q.k(13, 0);
            if (k2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = k2;
                this.a.setLayoutParams(layoutParams);
            }
            int e2 = q.e(7, -1);
            int e3 = q.e(3, -1);
            if (e2 >= 0 || e3 >= 0) {
                Toolbar toolbar2 = this.a;
                int max = Math.max(e2, 0);
                int max2 = Math.max(e3, 0);
                toolbar2.d();
                toolbar2.t.a(max, max2);
            }
            int l3 = q.l(28, 0);
            if (l3 != 0) {
                Toolbar toolbar3 = this.a;
                Context context = toolbar3.getContext();
                toolbar3.f256l = l3;
                TextView textView = toolbar3.f246b;
                if (textView != null) {
                    textView.setTextAppearance(context, l3);
                }
            }
            int l4 = q.l(26, 0);
            if (l4 != 0) {
                Toolbar toolbar4 = this.a;
                Context context2 = toolbar4.getContext();
                toolbar4.f257m = l4;
                TextView textView2 = toolbar4.f247c;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, l4);
                }
            }
            int l5 = q.l(22, 0);
            if (l5 != 0) {
                this.a.setPopupTheme(l5);
            }
        } else {
            if (this.a.getNavigationIcon() != null) {
                this.p = this.a.getNavigationIcon();
            } else {
                i2 = 11;
            }
            this.f1098b = i2;
        }
        q.f1083b.recycle();
        if (R.string.abc_action_bar_up_description != this.o) {
            this.o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                int i3 = this.o;
                this.f1107k = i3 != 0 ? getContext().getString(i3) : null;
                y();
            }
        }
        this.f1107k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new b1(this));
    }

    public final void A() {
        Drawable drawable;
        int i2 = this.f1098b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f1102f;
            if (drawable == null) {
                drawable = this.f1101e;
            }
        } else {
            drawable = this.f1101e;
        }
        this.a.setLogo(drawable);
    }

    @Override // c.b.i.d0
    public void a(Menu menu, m.a aVar) {
        c.b.h.i.i iVar;
        if (this.f1110n == null) {
            c cVar = new c(this.a.getContext());
            this.f1110n = cVar;
            Objects.requireNonNull(cVar);
        }
        c cVar2 = this.f1110n;
        cVar2.f965e = aVar;
        Toolbar toolbar = this.a;
        c.b.h.i.g gVar = (c.b.h.i.g) menu;
        if (gVar == null && toolbar.a == null) {
            return;
        }
        toolbar.f();
        c.b.h.i.g gVar2 = toolbar.a.p;
        if (gVar2 == gVar) {
            return;
        }
        if (gVar2 != null) {
            gVar2.u(toolbar.J);
            gVar2.u(toolbar.K);
        }
        if (toolbar.K == null) {
            toolbar.K = new Toolbar.d();
        }
        cVar2.q = true;
        if (gVar != null) {
            gVar.b(cVar2, toolbar.f254j);
            gVar.b(toolbar.K, toolbar.f254j);
        } else {
            cVar2.h(toolbar.f254j, null);
            Toolbar.d dVar = toolbar.K;
            c.b.h.i.g gVar3 = dVar.a;
            if (gVar3 != null && (iVar = dVar.f261b) != null) {
                gVar3.d(iVar);
            }
            dVar.a = null;
            cVar2.c(true);
            toolbar.K.c(true);
        }
        toolbar.a.setPopupTheme(toolbar.f255k);
        toolbar.a.setPresenter(cVar2);
        toolbar.J = cVar2;
    }

    @Override // c.b.i.d0
    public boolean b() {
        return this.a.p();
    }

    @Override // c.b.i.d0
    public void c() {
        this.f1109m = true;
    }

    @Override // c.b.i.d0
    public void collapseActionView() {
        Toolbar.d dVar = this.a.K;
        c.b.h.i.i iVar = dVar == null ? null : dVar.f261b;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    @Override // c.b.i.d0
    public boolean d() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.s;
    }

    @Override // c.b.i.d0
    public void e(Drawable drawable) {
        Toolbar toolbar = this.a;
        AtomicInteger atomicInteger = c.i.k.d0.a;
        d0.c.q(toolbar, drawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0021 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // c.b.i.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.a
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L22
            c.b.i.c r0 = r0.t
            if (r0 == 0) goto L1e
            c.b.i.c$c r3 = r0.v
            if (r3 != 0) goto L19
            boolean r0 = r0.m()
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            if (r0 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 == 0) goto L22
            r1 = 1
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.i.c1.f():boolean");
    }

    @Override // c.b.i.d0
    public boolean g() {
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView != null) {
            c cVar = actionMenuView.t;
            return cVar != null && cVar.k();
        }
        return false;
    }

    @Override // c.b.i.d0
    public Context getContext() {
        return this.a.getContext();
    }

    @Override // c.b.i.d0
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // c.b.i.d0
    public boolean h() {
        return this.a.v();
    }

    @Override // c.b.i.d0
    public void i() {
        c cVar;
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView == null || (cVar = actionMenuView.t) == null) {
            return;
        }
        cVar.a();
    }

    @Override // c.b.i.d0
    public void j(t0 t0Var) {
        View view = this.f1099c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1099c);
            }
        }
        this.f1099c = null;
    }

    @Override // c.b.i.d0
    public boolean k() {
        Toolbar.d dVar = this.a.K;
        return (dVar == null || dVar.f261b == null) ? false : true;
    }

    @Override // c.b.i.d0
    public void l(int i2) {
        View view;
        int i3 = this.f1098b ^ i2;
        this.f1098b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    y();
                }
                z();
            }
            if ((i3 & 3) != 0) {
                A();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.a.setTitle(this.f1105i);
                    this.a.setSubtitle(this.f1106j);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f1100d) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    @Override // c.b.i.d0
    public Menu m() {
        return this.a.getMenu();
    }

    @Override // c.b.i.d0
    public void n(int i2) {
        this.f1102f = i2 != 0 ? c.b.d.a.a.b(getContext(), i2) : null;
        A();
    }

    @Override // c.b.i.d0
    public int o() {
        return 0;
    }

    @Override // c.b.i.d0
    public c.i.k.f0 p(int i2, long j2) {
        c.i.k.f0 b2 = c.i.k.d0.b(this.a);
        b2.a(i2 == 0 ? 1.0f : 0.0f);
        b2.c(j2);
        a aVar = new a(i2);
        View view = b2.a.get();
        if (view != null) {
            b2.e(view, aVar);
        }
        return b2;
    }

    @Override // c.b.i.d0
    public void q(m.a aVar, g.a aVar2) {
        Toolbar toolbar = this.a;
        toolbar.L = aVar;
        toolbar.M = aVar2;
        ActionMenuView actionMenuView = toolbar.a;
        if (actionMenuView != null) {
            actionMenuView.u = aVar;
            actionMenuView.v = aVar2;
        }
    }

    @Override // c.b.i.d0
    public void r(int i2) {
        this.a.setVisibility(i2);
    }

    @Override // c.b.i.d0
    public ViewGroup s() {
        return this.a;
    }

    @Override // c.b.i.d0
    public void setIcon(int i2) {
        this.f1101e = i2 != 0 ? c.b.d.a.a.b(getContext(), i2) : null;
        A();
    }

    @Override // c.b.i.d0
    public void setIcon(Drawable drawable) {
        this.f1101e = drawable;
        A();
    }

    @Override // c.b.i.d0
    public void setTitle(CharSequence charSequence) {
        this.f1104h = true;
        this.f1105i = charSequence;
        if ((this.f1098b & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    @Override // c.b.i.d0
    public void setWindowCallback(Window.Callback callback) {
        this.f1108l = callback;
    }

    @Override // c.b.i.d0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1104h) {
            return;
        }
        this.f1105i = charSequence;
        if ((this.f1098b & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    @Override // c.b.i.d0
    public void t(boolean z) {
    }

    @Override // c.b.i.d0
    public int u() {
        return this.f1098b;
    }

    @Override // c.b.i.d0
    public void v() {
    }

    @Override // c.b.i.d0
    public void w() {
    }

    @Override // c.b.i.d0
    public void x(boolean z) {
        this.a.setCollapsible(z);
    }

    public final void y() {
        if ((this.f1098b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1107k)) {
                this.a.setNavigationContentDescription(this.o);
            } else {
                this.a.setNavigationContentDescription(this.f1107k);
            }
        }
    }

    public final void z() {
        if ((this.f1098b & 4) == 0) {
            this.a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.a;
        Drawable drawable = this.f1103g;
        if (drawable == null) {
            drawable = this.p;
        }
        toolbar.setNavigationIcon(drawable);
    }
}
