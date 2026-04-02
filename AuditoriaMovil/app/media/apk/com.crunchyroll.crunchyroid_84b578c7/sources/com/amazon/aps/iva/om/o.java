package com.amazon.aps.iva.om;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: ProfilesOnboardingModalStoreImpl.kt */
/* loaded from: classes2.dex */
public final class o implements n {
    public final com.amazon.aps.iva.xb0.a<String> a;
    public final SharedPreferences b;

    public o(Context context, com.amazon.aps.iva.xb0.a<String> aVar) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(aVar, "getUserId");
        this.a = aVar;
        this.b = context.getSharedPreferences("onboarding_modal_store", 0);
    }

    @Override // com.amazon.aps.iva.om.n
    public final void a() {
        SharedPreferences.Editor edit = this.b.edit();
        String invoke = this.a.invoke();
        edit.putBoolean("should_show_modal_" + ((Object) invoke), false).apply();
    }

    @Override // com.amazon.aps.iva.om.n
    public final boolean b() {
        String invoke = this.a.invoke();
        return this.b.getBoolean("should_show_modal_" + ((Object) invoke), true);
    }
}
