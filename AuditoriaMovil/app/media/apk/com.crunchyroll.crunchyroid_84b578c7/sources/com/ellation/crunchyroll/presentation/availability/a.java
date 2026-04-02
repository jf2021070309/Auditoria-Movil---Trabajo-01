package com.ellation.crunchyroll.presentation.availability;

import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.g;
import androidx.lifecycle.m;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.rz.b;
import com.amazon.aps.iva.x50.e;
import com.amazon.aps.iva.x50.p;
/* compiled from: ServiceAvailabilityView.kt */
/* loaded from: classes2.dex */
public final class a implements b, o {
    public final e b;
    public final /* synthetic */ m c = m.j;

    public a(p pVar) {
        this.b = pVar;
    }

    @Override // com.amazon.aps.iva.rz.b
    public final void Pa() {
        Activity a = this.b.a();
        if (a instanceof ServiceUnavailableActivity) {
            ((ServiceUnavailableActivity) a).finish();
        }
    }

    @Override // com.amazon.aps.iva.rz.b
    public final void R2() {
        Activity a = this.b.a();
        if (a != null && !(a instanceof ServiceUnavailableActivity)) {
            ServiceUnavailableActivity.o.getClass();
            a.startActivity(new Intent(a, ServiceUnavailableActivity.class));
        }
    }

    @Override // com.amazon.aps.iva.i5.o
    public final g getLifecycle() {
        return this.c.g;
    }
}
