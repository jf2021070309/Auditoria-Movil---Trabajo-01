package c.b.h;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import c.b.h.a;
import c.b.h.i.g;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class d extends a implements g.a {

    /* renamed from: c  reason: collision with root package name */
    public Context f912c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContextView f913d;

    /* renamed from: e  reason: collision with root package name */
    public a.InterfaceC0018a f914e;

    /* renamed from: f  reason: collision with root package name */
    public WeakReference<View> f915f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f916g;

    /* renamed from: h  reason: collision with root package name */
    public c.b.h.i.g f917h;

    public d(Context context, ActionBarContextView actionBarContextView, a.InterfaceC0018a interfaceC0018a, boolean z) {
        this.f912c = context;
        this.f913d = actionBarContextView;
        this.f914e = interfaceC0018a;
        c.b.h.i.g gVar = new c.b.h.i.g(actionBarContextView.getContext());
        gVar.f1011m = 1;
        this.f917h = gVar;
        gVar.f1004f = this;
    }

    @Override // c.b.h.i.g.a
    public boolean a(c.b.h.i.g gVar, MenuItem menuItem) {
        return this.f914e.d(this, menuItem);
    }

    @Override // c.b.h.i.g.a
    public void b(c.b.h.i.g gVar) {
        i();
        c.b.i.c cVar = this.f913d.f1063d;
        if (cVar != null) {
            cVar.n();
        }
    }

    @Override // c.b.h.a
    public void c() {
        if (this.f916g) {
            return;
        }
        this.f916g = true;
        this.f913d.sendAccessibilityEvent(32);
        this.f914e.a(this);
    }

    @Override // c.b.h.a
    public View d() {
        WeakReference<View> weakReference = this.f915f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // c.b.h.a
    public Menu e() {
        return this.f917h;
    }

    @Override // c.b.h.a
    public MenuInflater f() {
        return new f(this.f913d.getContext());
    }

    @Override // c.b.h.a
    public CharSequence g() {
        return this.f913d.getSubtitle();
    }

    @Override // c.b.h.a
    public CharSequence h() {
        return this.f913d.getTitle();
    }

    @Override // c.b.h.a
    public void i() {
        this.f914e.c(this, this.f917h);
    }

    @Override // c.b.h.a
    public boolean j() {
        return this.f913d.s;
    }

    @Override // c.b.h.a
    public void k(View view) {
        this.f913d.setCustomView(view);
        this.f915f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // c.b.h.a
    public void l(int i2) {
        this.f913d.setSubtitle(this.f912c.getString(i2));
    }

    @Override // c.b.h.a
    public void m(CharSequence charSequence) {
        this.f913d.setSubtitle(charSequence);
    }

    @Override // c.b.h.a
    public void n(int i2) {
        this.f913d.setTitle(this.f912c.getString(i2));
    }

    @Override // c.b.h.a
    public void o(CharSequence charSequence) {
        this.f913d.setTitle(charSequence);
    }

    @Override // c.b.h.a
    public void p(boolean z) {
        this.f907b = z;
        this.f913d.setTitleOptional(z);
    }
}
