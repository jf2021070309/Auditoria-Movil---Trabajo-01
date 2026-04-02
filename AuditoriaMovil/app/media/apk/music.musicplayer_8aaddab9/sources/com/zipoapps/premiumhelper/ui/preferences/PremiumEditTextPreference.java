package com.zipoapps.premiumhelper.ui.preferences;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.EditTextPreference;
import c.t.l;
import ch.qos.logback.core.CoreConstants;
import e.j.d.k;
import h.o.c.j;
/* loaded from: classes2.dex */
public final class PremiumEditTextPreference extends EditTextPreference {
    public final PreferenceHelper Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumEditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.Z = new PreferenceHelper(context, attributeSet);
    }

    @Override // androidx.preference.Preference
    public void r(l lVar) {
        j.e(lVar, "holder");
        super.r(lVar);
        this.Z.a(lVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void s() {
        k.a aVar = k.a;
        if (aVar.a().e()) {
            super.s();
        } else if (this.a instanceof Activity) {
            k.l(aVar.a(), j.i("preference_", this.f484l), 0, 0, 6);
        }
    }
}
