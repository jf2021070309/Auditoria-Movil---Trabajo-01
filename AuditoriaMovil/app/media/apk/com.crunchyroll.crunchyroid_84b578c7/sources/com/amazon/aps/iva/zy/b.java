package com.amazon.aps.iva.zy;

import android.content.SharedPreferences;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.ve0.g;
import com.amazon.aps.iva.ve0.l0;
/* compiled from: PreferencesFlowCollectorImpl.kt */
/* loaded from: classes2.dex */
public final class b<T> implements a<T> {
    public final T b;
    public final String c;
    public final SharedPreferences d;
    public final g<T> e;
    public T f;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Object obj, String str, SharedPreferences sharedPreferences, l0 l0Var) {
        this.b = obj;
        this.c = str;
        this.d = sharedPreferences;
        this.e = l0Var;
        this.f = (T) com.amazon.aps.iva.xw.l0.a(sharedPreferences, str, obj);
    }

    @Override // com.amazon.aps.iva.ve0.g
    public final Object a(T t, d<? super q> dVar) {
        this.f = t;
        com.amazon.aps.iva.xw.l0.b(this.d, this.c, t);
        Object a = this.e.a(t, dVar);
        if (a == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return a;
        }
        return q.a;
    }

    @Override // com.amazon.aps.iva.zy.a
    public final T getValue() {
        return this.f;
    }
}
