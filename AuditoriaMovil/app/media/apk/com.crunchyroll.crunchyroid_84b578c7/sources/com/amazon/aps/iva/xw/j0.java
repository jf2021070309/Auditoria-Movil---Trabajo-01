package com.amazon.aps.iva.xw;

import android.content.SharedPreferences;
/* compiled from: SharedPreferencesExtensions.kt */
/* loaded from: classes2.dex */
public final class j0<T> extends com.amazon.aps.iva.i5.v<T> {
    public final SharedPreferences l;
    public final String m;
    public final T n;
    public final com.amazon.aps.iva.xb0.l<T, com.amazon.aps.iva.kb0.q> o;
    public final i0 p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.amazon.aps.iva.xw.i0] */
    public j0(SharedPreferences sharedPreferences, String str, Boolean bool, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        this.l = sharedPreferences;
        this.m = str;
        this.n = bool;
        this.o = lVar;
        this.p = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.amazon.aps.iva.xw.i0
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str2) {
                j0.l(j0.this, str2);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void l(j0 j0Var, String str) {
        com.amazon.aps.iva.yb0.j.f(j0Var, "this$0");
        if (com.amazon.aps.iva.yb0.j.a(str, j0Var.m)) {
            com.amazon.aps.iva.yb0.j.e(str, "key");
            super.k(l0.a(j0Var.l, str, j0Var.n));
        }
    }

    @Override // androidx.lifecycle.LiveData
    public final T d() {
        T t = (T) super.d();
        if (t == null) {
            String str = this.m;
            com.amazon.aps.iva.yb0.j.f(str, "key");
            return (T) l0.a(this.l, str, this.n);
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.LiveData
    public final void g() {
        String str = this.m;
        com.amazon.aps.iva.yb0.j.f(str, "key");
        SharedPreferences sharedPreferences = this.l;
        super.k(l0.a(sharedPreferences, str, this.n));
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.p);
    }

    @Override // androidx.lifecycle.LiveData
    public final void h() {
        this.l.unregisterOnSharedPreferenceChangeListener(this.p);
    }

    @Override // com.amazon.aps.iva.i5.v, androidx.lifecycle.LiveData
    public final void k(T t) {
        super.k(t);
        l0.b(this.l, this.m, t);
        this.o.invoke(t);
    }
}
