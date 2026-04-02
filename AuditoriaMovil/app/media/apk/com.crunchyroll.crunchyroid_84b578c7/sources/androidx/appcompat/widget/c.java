package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import com.amazon.aps.iva.a9.k0;
import com.amazon.aps.iva.k.g;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.q.d1;
import com.amazon.aps.iva.q.g1;
import com.amazon.aps.iva.q.i0;
import com.crunchyroll.crunchyroid.R;
/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes.dex */
public final class c implements i0 {
    public final Toolbar a;
    public int b;
    public b c;
    public View d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public boolean h;
    public CharSequence i;
    public CharSequence j;
    public CharSequence k;
    public Window.Callback l;
    public boolean m;
    public androidx.appcompat.widget.a n;
    public int o;
    public Drawable p;

    /* compiled from: ToolbarWidgetWrapper.java */
    /* loaded from: classes.dex */
    public class a extends k0 {
        public boolean j = false;
        public final /* synthetic */ int k;

        public a(int i) {
            this.k = i;
        }

        @Override // com.amazon.aps.iva.a9.k0, com.amazon.aps.iva.p3.s0
        public final void a(View view) {
            this.j = true;
        }

        @Override // com.amazon.aps.iva.a9.k0, com.amazon.aps.iva.p3.s0
        public final void c() {
            c.this.a.setVisibility(0);
        }

        @Override // com.amazon.aps.iva.p3.s0
        public final void onAnimationEnd() {
            if (!this.j) {
                c.this.a.setVisibility(this.k);
            }
        }
    }

    public c(Toolbar toolbar, boolean z) {
        boolean z2;
        Drawable drawable;
        this.o = 0;
        this.a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        if (this.i != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.h = z2;
        this.g = toolbar.getNavigationIcon();
        d1 m = d1.m(toolbar.getContext(), null, com.amazon.aps.iva.j.a.a, R.attr.actionBarStyle);
        int i = 15;
        this.p = m.e(15);
        if (z) {
            CharSequence k = m.k(27);
            if (!TextUtils.isEmpty(k)) {
                setTitle(k);
            }
            CharSequence k2 = m.k(25);
            if (!TextUtils.isEmpty(k2)) {
                j(k2);
            }
            Drawable e = m.e(20);
            if (e != null) {
                this.f = e;
                w();
            }
            Drawable e2 = m.e(17);
            if (e2 != null) {
                setIcon(e2);
            }
            if (this.g == null && (drawable = this.p) != null) {
                this.g = drawable;
                if ((this.b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            i(m.h(10, 0));
            int i2 = m.i(9, 0);
            if (i2 != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(i2, (ViewGroup) toolbar, false);
                View view = this.d;
                if (view != null && (this.b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.d = inflate;
                if (inflate != null && (this.b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                i(this.b | 16);
            }
            int layoutDimension = m.b.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int c = m.c(7, -1);
            int c2 = m.c(3, -1);
            if (c >= 0 || c2 >= 0) {
                toolbar.setContentInsetsRelative(Math.max(c, 0), Math.max(c2, 0));
            }
            int i3 = m.i(28, 0);
            if (i3 != 0) {
                toolbar.setTitleTextAppearance(toolbar.getContext(), i3);
            }
            int i4 = m.i(26, 0);
            if (i4 != 0) {
                toolbar.setSubtitleTextAppearance(toolbar.getContext(), i4);
            }
            int i5 = m.i(22, 0);
            if (i5 != 0) {
                toolbar.setPopupTheme(i5);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.p = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.b = i;
        }
        m.n();
        if (R.string.abc_action_bar_up_description != this.o) {
            this.o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i6 = this.o;
                String string = i6 != 0 ? getContext().getString(i6) : null;
                this.k = string;
                if ((this.b & 4) != 0) {
                    if (TextUtils.isEmpty(string)) {
                        toolbar.setNavigationContentDescription(this.o);
                    } else {
                        toolbar.setNavigationContentDescription(this.k);
                    }
                }
            }
        }
        this.k = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new g1(this));
    }

    @Override // com.amazon.aps.iva.q.i0
    public final boolean a() {
        return this.a.canShowOverflowMenu();
    }

    @Override // com.amazon.aps.iva.q.i0
    public final boolean b() {
        return this.a.hideOverflowMenu();
    }

    @Override // com.amazon.aps.iva.q.i0
    public final boolean c() {
        return this.a.showOverflowMenu();
    }

    @Override // com.amazon.aps.iva.q.i0
    public final void collapseActionView() {
        this.a.collapseActionView();
    }

    @Override // com.amazon.aps.iva.q.i0
    public final boolean d() {
        return this.a.isOverflowMenuShowing();
    }

    @Override // com.amazon.aps.iva.q.i0
    public final void e() {
        this.m = true;
    }

    @Override // com.amazon.aps.iva.q.i0
    public final void f(f fVar, g.d dVar) {
        androidx.appcompat.widget.a aVar = this.n;
        Toolbar toolbar = this.a;
        if (aVar == null) {
            androidx.appcompat.widget.a aVar2 = new androidx.appcompat.widget.a(toolbar.getContext());
            this.n = aVar2;
            aVar2.j = R.id.action_menu_presenter;
        }
        androidx.appcompat.widget.a aVar3 = this.n;
        aVar3.f = dVar;
        toolbar.setMenu(fVar, aVar3);
    }

    @Override // com.amazon.aps.iva.q.i0
    public final boolean g() {
        return this.a.isOverflowMenuShowPending();
    }

    @Override // com.amazon.aps.iva.q.i0
    public final Context getContext() {
        return this.a.getContext();
    }

    @Override // com.amazon.aps.iva.q.i0
    public final CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // com.amazon.aps.iva.q.i0
    public final boolean h() {
        return this.a.hasExpandedActionView();
    }

    @Override // com.amazon.aps.iva.q.i0
    public final void i(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            Toolbar toolbar = this.a;
            if (i3 != 0) {
                if ((i & 4) != 0 && (i & 4) != 0) {
                    if (TextUtils.isEmpty(this.k)) {
                        toolbar.setNavigationContentDescription(this.o);
                    } else {
                        toolbar.setNavigationContentDescription(this.k);
                    }
                }
                if ((this.b & 4) != 0) {
                    Drawable drawable = this.g;
                    if (drawable == null) {
                        drawable = this.p;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                w();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.i);
                    toolbar.setSubtitle(this.j);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.d) != null) {
                if ((i & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.q.i0
    public final void j(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    @Override // com.amazon.aps.iva.q.i0
    public final r0 l(int i, long j) {
        float f;
        r0 a2 = g0.a(this.a);
        if (i == 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        a2.a(f);
        a2.c(j);
        a2.d(new a(i));
        return a2;
    }

    @Override // com.amazon.aps.iva.q.i0
    public final void n(boolean z) {
        this.a.setCollapsible(z);
    }

    @Override // com.amazon.aps.iva.q.i0
    public final void o() {
        this.a.dismissPopupMenus();
    }

    @Override // com.amazon.aps.iva.q.i0
    public final void q() {
        b bVar = this.c;
        if (bVar != null) {
            ViewParent parent = bVar.getParent();
            Toolbar toolbar = this.a;
            if (parent == toolbar) {
                toolbar.removeView(this.c);
            }
        }
        this.c = null;
    }

    @Override // com.amazon.aps.iva.q.i0
    public final void r(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = com.amazon.aps.iva.l.a.a(getContext(), i);
        } else {
            drawable = null;
        }
        this.f = drawable;
        w();
    }

    @Override // com.amazon.aps.iva.q.i0
    public final void s(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = com.amazon.aps.iva.l.a.a(getContext(), i);
        } else {
            drawable = null;
        }
        this.g = drawable;
        int i2 = this.b & 4;
        Toolbar toolbar = this.a;
        if (i2 != 0) {
            if (drawable == null) {
                drawable = this.p;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        toolbar.setNavigationIcon((Drawable) null);
    }

    @Override // com.amazon.aps.iva.q.i0
    public final void setIcon(int i) {
        setIcon(i != 0 ? com.amazon.aps.iva.l.a.a(getContext(), i) : null);
    }

    @Override // com.amazon.aps.iva.q.i0
    public final void setTitle(CharSequence charSequence) {
        this.h = true;
        this.i = charSequence;
        if ((this.b & 8) != 0) {
            Toolbar toolbar = this.a;
            toolbar.setTitle(charSequence);
            if (this.h) {
                g0.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // com.amazon.aps.iva.q.i0
    public final void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // com.amazon.aps.iva.q.i0
    public final void setWindowTitle(CharSequence charSequence) {
        if (!this.h) {
            this.i = charSequence;
            if ((this.b & 8) != 0) {
                Toolbar toolbar = this.a;
                toolbar.setTitle(charSequence);
                if (this.h) {
                    g0.o(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.q.i0
    public final void t(int i) {
        this.a.setVisibility(i);
    }

    @Override // com.amazon.aps.iva.q.i0
    public final int u() {
        return this.b;
    }

    public final void w() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) != 0) {
            if ((i & 1) != 0) {
                drawable = this.f;
                if (drawable == null) {
                    drawable = this.e;
                }
            } else {
                drawable = this.e;
            }
        } else {
            drawable = null;
        }
        this.a.setLogo(drawable);
    }

    @Override // com.amazon.aps.iva.q.i0
    public final void setIcon(Drawable drawable) {
        this.e = drawable;
        w();
    }

    @Override // com.amazon.aps.iva.q.i0
    public final void k() {
    }

    @Override // com.amazon.aps.iva.q.i0
    public final void m() {
    }

    @Override // com.amazon.aps.iva.q.i0
    public final void p() {
    }

    @Override // com.amazon.aps.iva.q.i0
    public final void v() {
    }
}
