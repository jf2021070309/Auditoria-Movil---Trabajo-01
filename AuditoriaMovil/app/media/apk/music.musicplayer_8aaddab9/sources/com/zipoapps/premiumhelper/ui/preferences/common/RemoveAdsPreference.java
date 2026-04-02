package com.zipoapps.premiumhelper.ui.preferences.common;

import android.content.Context;
import android.util.AttributeSet;
import c.p.c;
import c.p.d;
import c.p.p;
import ch.qos.logback.core.CoreConstants;
import com.zipoapps.premiumhelper.ui.preferences.PremiumPreference;
import e.j.d.k;
import h.o.c.j;
/* loaded from: classes2.dex */
public final class RemoveAdsPreference extends PremiumPreference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveAdsPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.O.f4915f = false;
        if (context instanceof p) {
            ((p) context).getLifecycle().a(new d() { // from class: com.zipoapps.premiumhelper.ui.preferences.common.RemoveAdsPreference.1
                @Override // c.p.h
                public void a(p pVar) {
                    j.e(pVar, "owner");
                    if (k.a.a().e()) {
                        RemoveAdsPreference.this.K(false);
                    }
                }

                @Override // c.p.h
                public void b(p pVar) {
                    j.e(pVar, "owner");
                    if (k.a.a().e()) {
                        RemoveAdsPreference.this.K(false);
                    }
                }

                @Override // c.p.h
                public /* synthetic */ void d(p pVar) {
                    c.c(this, pVar);
                }

                @Override // c.p.h
                public /* synthetic */ void e(p pVar) {
                    c.f(this, pVar);
                }

                @Override // c.p.h
                public /* synthetic */ void f(p pVar) {
                    c.b(this, pVar);
                }

                @Override // c.p.h
                public /* synthetic */ void h(p pVar) {
                    c.e(this, pVar);
                }
            });
        }
    }
}
