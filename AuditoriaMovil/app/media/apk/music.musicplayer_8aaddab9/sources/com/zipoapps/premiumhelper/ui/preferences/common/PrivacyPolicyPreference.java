package com.zipoapps.premiumhelper.ui.preferences.common;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import ch.qos.logback.core.CoreConstants;
import e.j.d.c0.b0;
import e.j.d.k;
import h.o.c.j;
/* loaded from: classes2.dex */
public final class PrivacyPolicyPreference extends Preference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivacyPolicyPreference(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f478f = new Preference.d() { // from class: e.j.d.b0.b.c.b
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                Context context2 = context;
                j.e(context2, "$context");
                j.e(preference, "it");
                if (context2 instanceof Activity) {
                    k a = k.a.a();
                    Activity activity = (Activity) context2;
                    j.e(activity, "activity");
                    b0.n(activity, (String) a.f8812i.f(e.j.d.y.b.r));
                    return true;
                }
                return true;
            }
        };
    }
}
