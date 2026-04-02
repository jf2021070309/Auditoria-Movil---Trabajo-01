package com.amazon.aps.iva.km;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: CustomizeProfileTooltipStore.kt */
/* loaded from: classes2.dex */
public final class c implements b {
    public final Context a;
    public final com.amazon.aps.iva.xb0.a<String> b;
    public final m c;

    /* compiled from: CustomizeProfileTooltipStore.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<SharedPreferences> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final SharedPreferences invoke() {
            return c.this.a.getSharedPreferences("customize_profile_tooltip_store", 0);
        }
    }

    public c(Context context, com.amazon.aps.iva.xb0.a<String> aVar) {
        j.f(context, "context");
        this.a = context;
        this.b = aVar;
        this.c = f.b(new a());
    }

    @Override // com.amazon.aps.iva.km.b
    public final boolean a() {
        String invoke = this.b.invoke();
        return ((SharedPreferences) this.c.getValue()).getBoolean("show_customize_tooltip_value_" + ((Object) invoke), true);
    }

    @Override // com.amazon.aps.iva.km.b
    public final void b() {
        SharedPreferences.Editor edit = ((SharedPreferences) this.c.getValue()).edit();
        String invoke = this.b.invoke();
        edit.putBoolean("show_customize_tooltip_value_" + ((Object) invoke), false).apply();
    }
}
