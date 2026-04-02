package com.zipoapps.premiumhelper.ui.preferences;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import c.t.l;
import ch.qos.logback.core.CoreConstants;
import com.zipoapps.premiumhelper.ui.preferences.PremiumPreference;
import e.j.d.k;
import h.o.c.j;
/* loaded from: classes2.dex */
public class PremiumPreference extends Preference {
    public final PreferenceHelper O;
    public Preference.d P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumPreference(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.O = new PreferenceHelper(context, attributeSet);
        this.f478f = new Preference.d() { // from class: e.j.d.b0.b.a
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                PremiumPreference premiumPreference = PremiumPreference.this;
                Context context2 = context;
                j.e(premiumPreference, "this$0");
                j.e(context2, "$context");
                j.e(preference, "preference");
                k.a aVar = k.a;
                if (!aVar.a().e()) {
                    if (context2 instanceof Activity) {
                        k.l(aVar.a(), j.i("preference_", premiumPreference.f484l), 0, 0, 6);
                    }
                    return true;
                }
                Preference.d dVar = premiumPreference.P;
                if (dVar == null) {
                    return false;
                }
                return dVar.a(preference);
            }
        };
    }

    @Override // androidx.preference.Preference
    public void r(l lVar) {
        j.e(lVar, "holder");
        super.r(lVar);
        this.O.a(lVar);
    }
}
