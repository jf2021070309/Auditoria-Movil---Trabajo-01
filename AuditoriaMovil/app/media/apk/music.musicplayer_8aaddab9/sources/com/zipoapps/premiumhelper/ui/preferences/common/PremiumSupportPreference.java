package com.zipoapps.premiumhelper.ui.preferences.common;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.Preference;
import ch.qos.logback.core.CoreConstants;
import com.zipoapps.premiumhelper.ui.preferences.PremiumPreference;
import e.j.d.c0.u;
import e.j.d.x;
import h.o.c.j;
/* loaded from: classes2.dex */
public final class PremiumSupportPreference extends PremiumPreference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumSupportPreference(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.a);
        final String string = obtainStyledAttributes.getString(5);
        if (string == null) {
            throw new IllegalStateException("You have to set support_email value for Support Preference".toString());
        }
        obtainStyledAttributes.recycle();
        this.P = new Preference.d() { // from class: e.j.d.b0.b.c.a
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                Context context2 = context;
                String str = string;
                j.e(context2, "$context");
                j.e(str, "$email");
                j.e(preference, "it");
                if (context2 instanceof Activity) {
                    u.b((Activity) context2, str);
                    return true;
                }
                return true;
            }
        };
    }
}
