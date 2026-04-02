package com.amazon.aps.iva.ab;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.aps.iva.o0.n3;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzbn;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.List;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class w extends BroadcastReceiver {
    public static final /* synthetic */ int e = 0;
    public final com.amazon.aps.iva.n4.f0 a;
    public final n3 b;
    public boolean c;
    public final /* synthetic */ n3 d;

    public /* synthetic */ w(n3 n3Var, com.amazon.aps.iva.n4.f0 f0Var, n3 n3Var2) {
        this.d = n3Var;
        this.a = f0Var;
        this.b = n3Var2;
    }

    public final void a(Bundle bundle, com.android.billingclient.api.c cVar, int i) {
        byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
        n3 n3Var = this.b;
        if (byteArray != null) {
            try {
                n3Var.f(zzfb.zzx(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzbn.zza()));
                return;
            } catch (Throwable unused) {
                zzb.zzj("BillingBroadcastManager", "Failed parsing Api failure.");
                return;
            }
        }
        n3Var.f(com.amazon.aps.iva.e.w.V(23, i, cVar));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        int i = 1;
        n3 n3Var = this.b;
        com.amazon.aps.iva.n4.f0 f0Var = this.a;
        if (extras == null) {
            zzb.zzj("BillingBroadcastManager", "Bundle is null.");
            com.android.billingclient.api.c cVar = com.android.billingclient.api.f.f;
            n3Var.f(com.amazon.aps.iva.e.w.V(11, 1, cVar));
            if (f0Var != null) {
                f0Var.b(cVar, null);
                return;
            }
            return;
        }
        com.android.billingclient.api.c zzd = zzb.zzd(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        String string = extras.getString("INTENT_SOURCE");
        if (string == "LAUNCH_BILLING_FLOW" || (string != null && string.equals("LAUNCH_BILLING_FLOW"))) {
            i = 2;
        }
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            List zzh = zzb.zzh(extras);
            if (zzd.a == 0) {
                n3Var.g(com.amazon.aps.iva.e.w.W(i));
            } else {
                a(extras, zzd, i);
            }
            f0Var.b(zzd, zzh);
        } else if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (zzd.a != 0) {
                a(extras, zzd, i);
                f0Var.b(zzd, zzu.zzk());
                return;
            }
            zzb.zzj("BillingBroadcastManager", "AlternativeBillingListener is null.");
            com.android.billingclient.api.c cVar2 = com.android.billingclient.api.f.f;
            n3Var.f(com.amazon.aps.iva.e.w.V(15, i, cVar2));
            f0Var.b(cVar2, zzu.zzk());
        }
    }
}
