package c.b.c;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import c.b.c.a;
import c.b.h.i.g;
import c.b.h.i.m;
import c.b.i.c1;
import c.b.i.d0;
import c.i.k.d0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class y extends c.b.c.a {
    public d0 a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f861b;

    /* renamed from: c  reason: collision with root package name */
    public Window.Callback f862c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f863d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f864e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<a.b> f865f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f866g = new a();

    /* renamed from: h  reason: collision with root package name */
    public final Toolbar.f f867h;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y yVar = y.this;
            Menu t = yVar.t();
            c.b.h.i.g gVar = t instanceof c.b.h.i.g ? (c.b.h.i.g) t : null;
            if (gVar != null) {
                gVar.z();
            }
            try {
                t.clear();
                if (!yVar.f862c.onCreatePanelMenu(0, t) || !yVar.f862c.onPreparePanel(0, null, t)) {
                    t.clear();
                }
            } finally {
                if (gVar != null) {
                    gVar.y();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Toolbar.f {
        public b() {
        }
    }

    /* loaded from: classes.dex */
    public final class c implements m.a {
        public boolean a;

        public c() {
        }

        @Override // c.b.h.i.m.a
        public void b(c.b.h.i.g gVar, boolean z) {
            if (this.a) {
                return;
            }
            this.a = true;
            y.this.a.i();
            Window.Callback callback = y.this.f862c;
            if (callback != null) {
                callback.onPanelClosed(108, gVar);
            }
            this.a = false;
        }

        @Override // c.b.h.i.m.a
        public boolean c(c.b.h.i.g gVar) {
            Window.Callback callback = y.this.f862c;
            if (callback != null) {
                callback.onMenuOpened(108, gVar);
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public final class d implements g.a {
        public d() {
        }

        @Override // c.b.h.i.g.a
        public boolean a(c.b.h.i.g gVar, MenuItem menuItem) {
            return false;
        }

        @Override // c.b.h.i.g.a
        public void b(c.b.h.i.g gVar) {
            y yVar = y.this;
            if (yVar.f862c != null) {
                if (yVar.a.b()) {
                    y.this.f862c.onPanelClosed(108, gVar);
                } else if (y.this.f862c.onPreparePanel(0, null, gVar)) {
                    y.this.f862c.onMenuOpened(108, gVar);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class e extends c.b.h.h {
        public e(Window.Callback callback) {
            super(callback);
        }

        @Override // c.b.h.h, android.view.Window.Callback
        public View onCreatePanelView(int i2) {
            return i2 == 0 ? new View(y.this.a.getContext()) : this.a.onCreatePanelView(i2);
        }

        @Override // android.view.Window.Callback
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            boolean onPreparePanel = this.a.onPreparePanel(i2, view, menu);
            if (onPreparePanel) {
                y yVar = y.this;
                if (!yVar.f861b) {
                    yVar.a.c();
                    y.this.f861b = true;
                }
            }
            return onPreparePanel;
        }
    }

    public y(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f867h = bVar;
        this.a = new c1(toolbar, false);
        e eVar = new e(callback);
        this.f862c = eVar;
        this.a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(bVar);
        this.a.setWindowTitle(charSequence);
    }

    @Override // c.b.c.a
    public boolean a() {
        return this.a.g();
    }

    @Override // c.b.c.a
    public boolean b() {
        if (this.a.k()) {
            this.a.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // c.b.c.a
    public void c(boolean z) {
        if (z == this.f864e) {
            return;
        }
        this.f864e = z;
        int size = this.f865f.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f865f.get(i2).a(z);
        }
    }

    @Override // c.b.c.a
    public int d() {
        return this.a.u();
    }

    @Override // c.b.c.a
    public Context e() {
        return this.a.getContext();
    }

    @Override // c.b.c.a
    public void f() {
        this.a.r(8);
    }

    @Override // c.b.c.a
    public boolean g() {
        this.a.s().removeCallbacks(this.f866g);
        ViewGroup s = this.a.s();
        Runnable runnable = this.f866g;
        AtomicInteger atomicInteger = c.i.k.d0.a;
        d0.c.m(s, runnable);
        return true;
    }

    @Override // c.b.c.a
    public void h(Configuration configuration) {
    }

    @Override // c.b.c.a
    public void i() {
        this.a.s().removeCallbacks(this.f866g);
    }

    @Override // c.b.c.a
    public boolean j(int i2, KeyEvent keyEvent) {
        Menu t = t();
        if (t != null) {
            t.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            return t.performShortcut(i2, keyEvent, 0);
        }
        return false;
    }

    @Override // c.b.c.a
    public boolean k(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.a.h();
        }
        return true;
    }

    @Override // c.b.c.a
    public boolean l() {
        return this.a.h();
    }

    @Override // c.b.c.a
    public void m(Drawable drawable) {
        this.a.e(drawable);
    }

    @Override // c.b.c.a
    public void n(boolean z) {
    }

    @Override // c.b.c.a
    public void o(boolean z) {
        this.a.l(((z ? 8 : 0) & 8) | ((-9) & this.a.u()));
    }

    @Override // c.b.c.a
    public void p(boolean z) {
    }

    @Override // c.b.c.a
    public void q(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }

    @Override // c.b.c.a
    public void r(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }

    public final Menu t() {
        if (!this.f863d) {
            this.a.q(new c(), new d());
            this.f863d = true;
        }
        return this.a.m();
    }
}
