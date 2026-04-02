package com.amazon.aps.iva.ab;

import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.aps.iva.o0.n3;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class f0 implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ k b;
    public final /* synthetic */ com.android.billingclient.api.a c;

    public f0(com.android.billingclient.api.a aVar, String str, com.amazon.aps.iva.rs.j jVar) {
        this.c = aVar;
        this.a = str;
        this.b = jVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        u uVar;
        Bundle zzi;
        int i;
        com.android.billingclient.api.a aVar = this.c;
        String str = this.a;
        zzb.zzi("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        int i2 = 0;
        Bundle zzc = zzb.zzc(aVar.l, aVar.q, true, false, aVar.b);
        ArrayList arrayList2 = null;
        String str2 = null;
        while (true) {
            int i3 = 9;
            try {
                if (aVar.l) {
                    zze zzeVar = aVar.g;
                    if (z != aVar.q) {
                        i = 9;
                    } else {
                        i = 19;
                    }
                    zzi = zzeVar.zzj(i, aVar.e.getPackageName(), str, str2, zzc);
                } else {
                    zzi = aVar.g.zzi(3, aVar.e.getPackageName(), str, str2);
                }
                v a = com.android.billingclient.api.g.a(zzi, "getPurchase()");
                com.android.billingclient.api.c cVar = a.a;
                if (cVar != com.android.billingclient.api.f.g) {
                    aVar.f.f(com.amazon.aps.iva.e.w.V(a.b, 9, cVar));
                    uVar = new u(cVar, arrayList2);
                    break;
                }
                ArrayList<String> stringArrayList = zzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = zzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = zzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i4 = i2;
                int i5 = i4;
                while (i4 < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i4);
                    String str4 = stringArrayList3.get(i4);
                    zzb.zzi("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i4))));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.b())) {
                            zzb.zzj("BillingClient", "BUG: empty/null token!");
                            i5 = 1;
                        }
                        arrayList.add(purchase);
                        i4++;
                        i3 = 9;
                    } catch (com.amazon.aps.iva.if0.b e) {
                        zzb.zzk("BillingClient", "Got an exception trying to decode the purchase!", e);
                        n3 n3Var = aVar.f;
                        com.android.billingclient.api.c cVar2 = com.android.billingclient.api.f.f;
                        n3Var.f(com.amazon.aps.iva.e.w.V(51, 9, cVar2));
                        uVar = new u(cVar2, null);
                    }
                }
                int i6 = i3;
                if (i5 != 0) {
                    aVar.f.f(com.amazon.aps.iva.e.w.V(26, i6, com.android.billingclient.api.f.f));
                }
                str2 = zzi.getString("INAPP_CONTINUATION_TOKEN");
                zzb.zzi("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    uVar = new u(com.android.billingclient.api.f.g, arrayList);
                    break;
                }
                z = true;
                i2 = 0;
                arrayList2 = null;
            } catch (Exception e2) {
                n3 n3Var2 = aVar.f;
                com.android.billingclient.api.c cVar3 = com.android.billingclient.api.f.h;
                n3Var2.f(com.amazon.aps.iva.e.w.V(52, 9, cVar3));
                zzb.zzk("BillingClient", "Got exception trying to get purchasesm try to reconnect", e2);
                uVar = new u(cVar3, null);
            }
        }
        List<Purchase> list = (List) uVar.a;
        if (list != null) {
            this.b.a((com.android.billingclient.api.c) uVar.b, list);
            return null;
        }
        this.b.a((com.android.billingclient.api.c) uVar.b, zzu.zzk());
        return null;
    }
}
