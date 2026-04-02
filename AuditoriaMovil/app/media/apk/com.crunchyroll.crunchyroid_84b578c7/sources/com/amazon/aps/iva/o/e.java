package com.amazon.aps.iva.o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.amazon.aps.iva.o.a;
import java.util.ArrayList;
/* compiled from: SupportActionModeWrapper.java */
/* loaded from: classes.dex */
public final class e extends ActionMode {
    public final Context a;
    public final com.amazon.aps.iva.o.a b;

    /* compiled from: SupportActionModeWrapper.java */
    /* loaded from: classes.dex */
    public static class a implements a.InterfaceC0549a {
        public final ActionMode.Callback a;
        public final Context b;
        public final ArrayList<e> c = new ArrayList<>();
        public final com.amazon.aps.iva.x.h<Menu, Menu> d = new com.amazon.aps.iva.x.h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        @Override // com.amazon.aps.iva.o.a.InterfaceC0549a
        public final void a(com.amazon.aps.iva.o.a aVar) {
            this.a.onDestroyActionMode(e(aVar));
        }

        @Override // com.amazon.aps.iva.o.a.InterfaceC0549a
        public final boolean b(com.amazon.aps.iva.o.a aVar, androidx.appcompat.view.menu.f fVar) {
            e e = e(aVar);
            com.amazon.aps.iva.x.h<Menu, Menu> hVar = this.d;
            Menu orDefault = hVar.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new com.amazon.aps.iva.p.e(this.b, fVar);
                hVar.put(fVar, orDefault);
            }
            return this.a.onCreateActionMode(e, orDefault);
        }

        @Override // com.amazon.aps.iva.o.a.InterfaceC0549a
        public final boolean c(com.amazon.aps.iva.o.a aVar, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(aVar), new com.amazon.aps.iva.p.c(this.b, (com.amazon.aps.iva.i3.b) menuItem));
        }

        @Override // com.amazon.aps.iva.o.a.InterfaceC0549a
        public final boolean d(com.amazon.aps.iva.o.a aVar, androidx.appcompat.view.menu.f fVar) {
            e e = e(aVar);
            com.amazon.aps.iva.x.h<Menu, Menu> hVar = this.d;
            Menu orDefault = hVar.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new com.amazon.aps.iva.p.e(this.b, fVar);
                hVar.put(fVar, orDefault);
            }
            return this.a.onPrepareActionMode(e, orDefault);
        }

        public final e e(com.amazon.aps.iva.o.a aVar) {
            ArrayList<e> arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                e eVar = arrayList.get(i);
                if (eVar != null && eVar.b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.b, aVar);
            arrayList.add(eVar2);
            return eVar2;
        }
    }

    public e(Context context, com.amazon.aps.iva.o.a aVar) {
        this.a = context;
        this.b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new com.amazon.aps.iva.p.e(this.a, this.b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.b.b;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.c;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.b.b = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.n(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.b.j(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.b.l(i);
    }
}
