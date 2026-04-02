package c.b.h;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import c.b.h.a;
import c.b.h.i.j;
import c.b.h.i.o;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class e extends ActionMode {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final c.b.h.a f918b;

    /* loaded from: classes.dex */
    public static class a implements a.InterfaceC0018a {
        public final ActionMode.Callback a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f919b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<e> f920c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final c.f.h<Menu, Menu> f921d = new c.f.h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f919b = context;
            this.a = callback;
        }

        @Override // c.b.h.a.InterfaceC0018a
        public void a(c.b.h.a aVar) {
            this.a.onDestroyActionMode(e(aVar));
        }

        @Override // c.b.h.a.InterfaceC0018a
        public boolean b(c.b.h.a aVar, Menu menu) {
            return this.a.onCreateActionMode(e(aVar), f(menu));
        }

        @Override // c.b.h.a.InterfaceC0018a
        public boolean c(c.b.h.a aVar, Menu menu) {
            return this.a.onPrepareActionMode(e(aVar), f(menu));
        }

        @Override // c.b.h.a.InterfaceC0018a
        public boolean d(c.b.h.a aVar, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(aVar), new j(this.f919b, (c.i.f.a.b) menuItem));
        }

        public ActionMode e(c.b.h.a aVar) {
            int size = this.f920c.size();
            for (int i2 = 0; i2 < size; i2++) {
                e eVar = this.f920c.get(i2);
                if (eVar != null && eVar.f918b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f919b, aVar);
            this.f920c.add(eVar2);
            return eVar2;
        }

        public final Menu f(Menu menu) {
            Menu orDefault = this.f921d.getOrDefault(menu, null);
            if (orDefault == null) {
                o oVar = new o(this.f919b, (c.i.f.a.a) menu);
                this.f921d.put(menu, oVar);
                return oVar;
            }
            return orDefault;
        }
    }

    public e(Context context, c.b.h.a aVar) {
        this.a = context;
        this.f918b = aVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f918b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f918b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new o(this.a, (c.i.f.a.a) this.f918b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f918b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f918b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f918b.a;
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f918b.h();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f918b.f907b;
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f918b.i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f918b.j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f918b.k(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i2) {
        this.f918b.l(i2);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f918b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f918b.a = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(int i2) {
        this.f918b.n(i2);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f918b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f918b.p(z);
    }
}
