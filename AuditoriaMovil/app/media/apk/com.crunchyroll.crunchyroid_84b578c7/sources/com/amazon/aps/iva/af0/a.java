package com.amazon.aps.iva.af0;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.na0.b;
import com.amazon.aps.iva.oa0.f1;
import com.amazon.aps.iva.oa0.u0;
import com.amazon.aps.iva.oa0.y;
import com.segment.analytics.Analytics;
import com.segment.analytics.ValueMap;
import com.segment.analytics.integrations.IdentifyPayload;
import com.segment.analytics.integrations.Integration;
import com.segment.analytics.integrations.TrackPayload;
/* compiled from: SingularIntegration.java */
/* loaded from: classes4.dex */
public class a extends Integration<com.amazon.aps.iva.na0.a> {
    public a(ValueMap valueMap, Analytics analytics) {
        String string = valueMap.getString("apiKey");
        String string2 = valueMap.getString("secret");
        if (string != null && string2 != null) {
            Context applicationContext = analytics.getApplication().getApplicationContext();
            u0 u0Var = com.amazon.aps.iva.na0.a.a;
            if (applicationContext != null) {
                com.amazon.aps.iva.na0.a.b(applicationContext, new b(string, string2));
            }
        }
    }

    @Override // com.segment.analytics.integrations.Integration
    public final void identify(IdentifyPayload identifyPayload) {
        super.identify(identifyPayload);
        String userId = identifyPayload.userId();
        try {
            if (com.amazon.aps.iva.na0.a.c()) {
                u0 u0Var = com.amazon.aps.iva.na0.a.a;
                SharedPreferences.Editor edit = u0Var.b().edit();
                edit.putString("custom_user_id", userId);
                edit.commit();
                y yVar = u0Var.f;
                if (yVar != null) {
                    yVar.E = userId;
                }
            }
        } catch (RuntimeException e) {
            com.amazon.aps.iva.na0.a.d(e);
            u0 u0Var2 = com.amazon.aps.iva.na0.a.a;
            f1.b(e);
        }
    }

    @Override // com.segment.analytics.integrations.Integration
    public final void reset() {
        super.reset();
        try {
            if (com.amazon.aps.iva.na0.a.c()) {
                u0 u0Var = com.amazon.aps.iva.na0.a.a;
                SharedPreferences.Editor edit = u0Var.b().edit();
                edit.putString("custom_user_id", "");
                edit.commit();
                y yVar = u0Var.f;
                if (yVar != null) {
                    yVar.E = "";
                }
            }
        } catch (RuntimeException e) {
            com.amazon.aps.iva.na0.a.d(e);
            u0 u0Var2 = com.amazon.aps.iva.na0.a.a;
            f1.b(e);
        }
    }

    @Override // com.segment.analytics.integrations.Integration
    public void track(TrackPayload trackPayload) {
        super.track(trackPayload);
        if (trackPayload.properties().revenue() != 0.0d) {
            String currency = trackPayload.properties().currency();
            if (f1.i(currency)) {
                currency = "USD";
            }
            String str = currency;
            String event = trackPayload.event();
            Object[] objArr = {"pcc", str, "r", Double.valueOf(trackPayload.properties().revenue()), "is_revenue_event", Boolean.TRUE};
            u0 u0Var = com.amazon.aps.iva.na0.a.a;
            try {
                if (com.amazon.aps.iva.na0.a.c() && !f1.i(event)) {
                    try {
                        c cVar = new c();
                        for (int i = 0; i < 6; i += 2) {
                            cVar.put((String) objArr[i], objArr[i + 1]);
                        }
                        com.amazon.aps.iva.na0.a.a(event, cVar);
                        return;
                    } catch (com.amazon.aps.iva.if0.b unused) {
                        return;
                    }
                }
            } catch (RuntimeException e) {
                com.amazon.aps.iva.na0.a.d(e);
                return;
            }
        }
        String event2 = trackPayload.event();
        u0 u0Var2 = com.amazon.aps.iva.na0.a.a;
        try {
            if (com.amazon.aps.iva.na0.a.c() && !f1.i(event2)) {
                com.amazon.aps.iva.na0.a.a.d(event2, null);
            }
        } catch (RuntimeException e2) {
            com.amazon.aps.iva.na0.a.d(e2);
            f1.b(e2);
        }
    }
}
