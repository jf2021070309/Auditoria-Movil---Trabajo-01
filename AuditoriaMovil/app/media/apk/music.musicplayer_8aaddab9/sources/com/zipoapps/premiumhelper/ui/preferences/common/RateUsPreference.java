package com.zipoapps.premiumhelper.ui.preferences.common;

import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.FragmentManager;
import androidx.preference.Preference;
import c.b.c.l;
import ch.qos.logback.core.CoreConstants;
import e.j.d.k;
import h.o.c.j;
/* loaded from: classes2.dex */
public final class RateUsPreference extends Preference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateUsPreference(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f478f = new Preference.d() { // from class: e.j.d.b0.b.c.c
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                Context context2 = context;
                j.e(context2, "$context");
                j.e(preference, "it");
                if (context2 instanceof l) {
                    k a = k.a.a();
                    FragmentManager supportFragmentManager = ((l) context2).getSupportFragmentManager();
                    j.d(supportFragmentManager, "context.supportFragmentManager");
                    k.m(a, supportFragmentManager, 0, null, 6);
                    return true;
                }
                String i2 = j.i("Please use AppCompatActivity for ", context2.getClass().getName());
                j.e(i2, "message");
                if (k.a.a().f8812i.j()) {
                    throw new IllegalStateException(i2.toString());
                }
                n.a.a.f9946d.b(i2, new Object[0]);
                return true;
            }
        };
    }
}
