package com.zipoapps.premiumhelper.ui.preferences;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.SwitchPreferenceCompat;
import c.t.l;
import ch.qos.logback.core.CoreConstants;
import e.j.d.k;
import h.o.c.j;
/* loaded from: classes2.dex */
public final class PremiumSwitchPreference extends SwitchPreferenceCompat {
    public final PreferenceHelper a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a0 = new PreferenceHelper(context, attributeSet);
    }

    @Override // androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public void r(l lVar) {
        j.e(lVar, "holder");
        super.r(lVar);
        this.a0.a(lVar);
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    public void s() {
        k.a aVar = k.a;
        if (aVar.a().e()) {
            super.s();
        } else if (this.a instanceof Activity) {
            k.l(aVar.a(), j.i("preference_", this.f484l), 0, 0, 6);
        }
    }
}
