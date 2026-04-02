package com.android.billingclient.api;

import android.os.Bundle;
import com.amazon.aps.iva.ab.v;
import com.google.android.gms.internal.play_billing.zzb;
import java.util.ArrayList;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class g {
    public static v a(Bundle bundle, String str) {
        c cVar = f.f;
        if (bundle == null) {
            zzb.zzj("BillingClient", String.format("%s got null owned items list", str));
            return new v(cVar, 54);
        }
        int zzb = zzb.zzb(bundle, "BillingClient");
        String zzf = zzb.zzf(bundle, "BillingClient");
        c cVar2 = new c();
        cVar2.a = zzb;
        cVar2.b = zzf;
        if (zzb != 0) {
            zzb.zzj("BillingClient", String.format("%s failed. Response code: %s", str, Integer.valueOf(zzb)));
            return new v(cVar2, 23);
        } else if (bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundle.containsKey("INAPP_PURCHASE_DATA_LIST") && bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            if (stringArrayList == null) {
                zzb.zzj("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str));
                return new v(cVar, 56);
            } else if (stringArrayList2 == null) {
                zzb.zzj("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str));
                return new v(cVar, 57);
            } else if (stringArrayList3 == null) {
                zzb.zzj("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str));
                return new v(cVar, 58);
            } else {
                return new v(f.g, 1);
            }
        } else {
            zzb.zzj("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str));
            return new v(cVar, 55);
        }
    }
}
