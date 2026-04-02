package com.amazon.aps.iva.o;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContextView;
import com.amazon.aps.iva.o.a;
import java.lang.ref.WeakReference;
/* compiled from: StandaloneActionMode.java */
/* loaded from: classes.dex */
public final class d extends a implements f.a {
    public final Context d;
    public final ActionBarContextView e;
    public final a.InterfaceC0549a f;
    public WeakReference<View> g;
    public boolean h;
    public final androidx.appcompat.view.menu.f i;

    public d(Context context, ActionBarContextView actionBarContextView, a.InterfaceC0549a interfaceC0549a) {
        this.d = context;
        this.e = actionBarContextView;
        this.f = interfaceC0549a;
        androidx.appcompat.view.menu.f defaultShowAsAction = new androidx.appcompat.view.menu.f(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.i = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
    }

    @Override // com.amazon.aps.iva.o.a
    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.a(this);
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
        return this.i;
    }

    @Override // com.amazon.aps.iva.o.a
    public final MenuInflater d() {
        return new f(this.e.getContext());
    }

    @Override // com.amazon.aps.iva.o.a
    public final CharSequence e() {
        return this.e.getSubtitle();
    }

    @Override // com.amazon.aps.iva.o.a
    public final CharSequence f() {
        return this.e.getTitle();
    }

    @Override // com.amazon.aps.iva.o.a
    public final void g() {
        this.f.d(this, this.i);
    }

    @Override // com.amazon.aps.iva.o.a
    public final boolean h() {
        return this.e.t;
    }

    @Override // com.amazon.aps.iva.o.a
    public final void i(View view) {
        WeakReference<View> weakReference;
        this.e.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            weakReference = null;
        }
        this.g = weakReference;
    }

    @Override // com.amazon.aps.iva.o.a
    public final void j(int i) {
        k(this.d.getString(i));
    }

    @Override // com.amazon.aps.iva.o.a
    public final void k(CharSequence charSequence) {
        this.e.setSubtitle(charSequence);
    }

    @Override // com.amazon.aps.iva.o.a
    public final void l(int i) {
        m(this.d.getString(i));
    }

    @Override // com.amazon.aps.iva.o.a
    public final void m(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // com.amazon.aps.iva.o.a
    public final void n(boolean z) {
        this.c = z;
        this.e.setTitleOptional(z);
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean onMenuItemSelected(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        return this.f.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void onMenuModeChange(androidx.appcompat.view.menu.f fVar) {
        g();
        androidx.appcompat.widget.a aVar = this.e.e;
        if (aVar != null) {
            aVar.e();
        }
    }
}
