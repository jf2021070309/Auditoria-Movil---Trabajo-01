package com.amazon.aps.iva.k;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import com.amazon.aps.iva.k.a;
import com.amazon.aps.iva.k.g;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: ToolbarActionBar.java */
/* loaded from: classes.dex */
public final class x extends com.amazon.aps.iva.k.a {
    public final androidx.appcompat.widget.c a;
    public final Window.Callback b;
    public final e c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList<a.b> g = new ArrayList<>();
    public final a h = new a();

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.appcompat.view.menu.f fVar;
            x xVar = x.this;
            Window.Callback callback = xVar.b;
            Menu v = xVar.v();
            if (v instanceof androidx.appcompat.view.menu.f) {
                fVar = (androidx.appcompat.view.menu.f) v;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                fVar.stopDispatchingItemsChanged();
            }
            try {
                v.clear();
                if (!callback.onCreatePanelMenu(0, v) || !callback.onPreparePanel(0, null, v)) {
                    v.clear();
                }
            } finally {
                if (fVar != null) {
                    fVar.startDispatchingItemsChanged();
                }
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public class b implements Toolbar.h {
        public b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return x.this.b.onMenuItemSelected(0, menuItem);
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public final class c implements j.a {
        public boolean b;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean a(androidx.appcompat.view.menu.f fVar) {
            x.this.b.onMenuOpened(108, fVar);
            return true;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void onCloseMenu(androidx.appcompat.view.menu.f fVar, boolean z) {
            if (this.b) {
                return;
            }
            this.b = true;
            x xVar = x.this;
            xVar.a.o();
            xVar.b.onPanelClosed(108, fVar);
            this.b = false;
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public final class d implements f.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean onMenuItemSelected(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void onMenuModeChange(androidx.appcompat.view.menu.f fVar) {
            x xVar = x.this;
            boolean d = xVar.a.d();
            Window.Callback callback = xVar.b;
            if (d) {
                callback.onPanelClosed(108, fVar);
            } else if (callback.onPreparePanel(0, null, fVar)) {
                callback.onMenuOpened(108, fVar);
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public class e implements g.c {
        public e() {
        }
    }

    public x(Toolbar toolbar, CharSequence charSequence, g.h hVar) {
        b bVar = new b();
        toolbar.getClass();
        androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(toolbar, false);
        this.a = cVar;
        hVar.getClass();
        this.b = hVar;
        cVar.l = hVar;
        toolbar.setOnMenuItemClickListener(bVar);
        cVar.setWindowTitle(charSequence);
        this.c = new e();
    }

    @Override // com.amazon.aps.iva.k.a
    public final boolean a() {
        return this.a.b();
    }

    @Override // com.amazon.aps.iva.k.a
    public final boolean b() {
        androidx.appcompat.widget.c cVar = this.a;
        if (cVar.h()) {
            cVar.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.k.a
    public final void c(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        ArrayList<a.b> arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
    }

    @Override // com.amazon.aps.iva.k.a
    public final int d() {
        return this.a.b;
    }

    @Override // com.amazon.aps.iva.k.a
    public final Context e() {
        return this.a.getContext();
    }

    @Override // com.amazon.aps.iva.k.a
    public final boolean f() {
        androidx.appcompat.widget.c cVar = this.a;
        Toolbar toolbar = cVar.a;
        a aVar = this.h;
        toolbar.removeCallbacks(aVar);
        Toolbar toolbar2 = cVar.a;
        WeakHashMap<View, r0> weakHashMap = g0.a;
        g0.d.m(toolbar2, aVar);
        return true;
    }

    @Override // com.amazon.aps.iva.k.a
    public final void h() {
        this.a.a.removeCallbacks(this.h);
    }

    @Override // com.amazon.aps.iva.k.a
    public final boolean i(int i, KeyEvent keyEvent) {
        int i2;
        Menu v = v();
        if (v == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        v.setQwertyMode(z);
        return v.performShortcut(i, keyEvent, 0);
    }

    @Override // com.amazon.aps.iva.k.a
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // com.amazon.aps.iva.k.a
    public final boolean k() {
        return this.a.c();
    }

    @Override // com.amazon.aps.iva.k.a
    public final void m(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        w(i, 4);
    }

    @Override // com.amazon.aps.iva.k.a
    public final void n(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        w(i, 2);
    }

    @Override // com.amazon.aps.iva.k.a
    public final void o() {
        w(0, 8);
    }

    @Override // com.amazon.aps.iva.k.a
    public final void p(int i) {
        this.a.s(i);
    }

    @Override // com.amazon.aps.iva.k.a
    public final void r(String str) {
        this.a.j(str);
    }

    @Override // com.amazon.aps.iva.k.a
    public final void s(String str) {
        this.a.setTitle(str);
    }

    @Override // com.amazon.aps.iva.k.a
    public final void t(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }

    public final Menu v() {
        boolean z = this.e;
        androidx.appcompat.widget.c cVar = this.a;
        if (!z) {
            cVar.a.setMenuCallbacks(new c(), new d());
            this.e = true;
        }
        return cVar.a.getMenu();
    }

    public final void w(int i, int i2) {
        androidx.appcompat.widget.c cVar = this.a;
        cVar.i((i & i2) | ((~i2) & cVar.b));
    }

    @Override // com.amazon.aps.iva.k.a
    public final void g() {
    }

    @Override // com.amazon.aps.iva.k.a
    public final void l(boolean z) {
    }

    @Override // com.amazon.aps.iva.k.a
    public final void q(boolean z) {
    }
}
