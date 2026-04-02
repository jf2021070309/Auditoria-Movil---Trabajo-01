package com.amazon.aps.iva.qm;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.crunchyroll.profiles.presentation.profileactivation.ProfileActivationActivity;
import com.crunchyroll.profiles.presentation.profileactivation.ProfileActivationActivityLegacy;
/* compiled from: ProfileActivationFlowRouter.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.i.a<com.amazon.aps.iva.kb0.q, Integer> {
    public final com.amazon.aps.iva.fm.c a;

    public a(com.amazon.aps.iva.fm.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "lupinConfig");
        this.a = cVar;
    }

    @Override // com.amazon.aps.iva.i.a
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        Class cls;
        com.amazon.aps.iva.yb0.j.f(componentActivity, "context");
        com.amazon.aps.iva.yb0.j.f((com.amazon.aps.iva.kb0.q) obj, "input");
        if (this.a.isEnabled()) {
            cls = ProfileActivationActivity.class;
        } else {
            cls = ProfileActivationActivityLegacy.class;
        }
        return new Intent(componentActivity, cls);
    }

    @Override // com.amazon.aps.iva.i.a
    public final Integer c(int i, Intent intent) {
        return Integer.valueOf(i);
    }
}
