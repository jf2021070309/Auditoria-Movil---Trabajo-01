package com.ellation.crunchyroll.presentation.update;

import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.g;
import androidx.lifecycle.m;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.x50.e;
import com.amazon.aps.iva.x50.p;
import com.amazon.aps.iva.z40.b;
import com.crunchyroll.crunchyroid.R;
/* compiled from: AppForceUpgradeView.kt */
/* loaded from: classes2.dex */
public final class a implements b, o {
    public final e b;
    public final /* synthetic */ m c = m.j;

    public a(p pVar) {
        this.b = pVar;
    }

    @Override // com.amazon.aps.iva.z40.b
    public final void T2() {
        Activity a = this.b.a();
        if (a != null) {
            UpdateAppActivity.e.getClass();
            Intent intent = new Intent(a, UpdateAppActivity.class);
            intent.addFlags(268468224);
            a.startActivity(intent);
            a.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        }
    }

    @Override // com.amazon.aps.iva.i5.o
    public final g getLifecycle() {
        return this.c.g;
    }
}
