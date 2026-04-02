package com.amazon.aps.iva.lv;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
/* compiled from: CrunchylistsModule.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ks.e> {
    public final /* synthetic */ h h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar) {
        super(0);
        this.h = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.ks.e invoke() {
        Intent intent;
        com.amazon.aps.iva.bv.d dVar;
        Object obj;
        androidx.fragment.app.h activity = this.h.b.getActivity();
        if (activity == null || (intent = activity.getIntent()) == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                obj = extras.getSerializable("add_to_crunchylist_input_extras", com.amazon.aps.iva.bv.d.class);
            } else {
                obj = (com.amazon.aps.iva.bv.d) extras.getSerializable("add_to_crunchylist_input_extras");
            }
            dVar = (com.amazon.aps.iva.bv.d) obj;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            return null;
        }
        return com.amazon.aps.iva.e.w.v(dVar.e, dVar.b, dVar.d, dVar.c);
    }
}
