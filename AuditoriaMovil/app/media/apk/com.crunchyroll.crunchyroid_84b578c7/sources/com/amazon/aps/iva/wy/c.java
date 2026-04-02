package com.amazon.aps.iva.wy;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.amazon.aps.iva.lb0.t;
import java.util.Arrays;
import java.util.LinkedHashSet;
/* compiled from: BasePresenterActivity.kt */
/* loaded from: classes2.dex */
public abstract class c extends com.amazon.aps.iva.k.c implements com.amazon.aps.iva.cz.b {
    public final com.amazon.aps.iva.cz.d b = new com.amazon.aps.iva.cz.d(this);
    public final LinkedHashSet c = new LinkedHashSet();

    public abstract void d();

    public Integer ji() {
        return null;
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (k kVar : this.b.c) {
            kVar.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.amazon.aps.iva.k.c, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        com.amazon.aps.iva.yb0.j.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        for (k kVar : this.b.c) {
            kVar.onConfigurationChanged(configuration);
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        String[] stringArray;
        super.onCreate(bundle);
        Integer ji = ji();
        if (ji != null) {
            setContentView(ji.intValue());
        }
        k[] kVarArr = (k[]) setupPresenters().toArray(new k[0]);
        this.b.a((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        if (bundle != null && (stringArray = bundle.getStringArray("handled_extras")) != null) {
            t.e0(this.c, stringArray);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        super.onNewIntent(intent);
        for (k kVar : this.b.c) {
            kVar.onNewIntent(intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putStringArray("handled_extras", (String[]) this.c.toArray(new String[0]));
    }

    public void r0() {
        d();
    }
}
