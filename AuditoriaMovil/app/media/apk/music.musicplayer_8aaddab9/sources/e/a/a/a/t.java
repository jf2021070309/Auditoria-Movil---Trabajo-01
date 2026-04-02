package e.a.a.a;

import android.os.Bundle;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.zza;
import com.google.android.gms.internal.play_billing.zzp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
/* loaded from: classes.dex */
public final class t implements Callable<Void> {
    public final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f5019b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f5020c;

    public t(d dVar, String str, n nVar) {
        this.f5020c = dVar;
        this.a = str;
        this.f5019b = nVar;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        Purchase.a aVar;
        d dVar = this.f5020c;
        String str = this.a;
        String valueOf = String.valueOf(str);
        zza.zzj("BillingClient", valueOf.length() != 0 ? "Querying owned items, item type: ".concat(valueOf) : new String("Querying owned items, item type: "));
        ArrayList arrayList = new ArrayList();
        Bundle zzf = zza.zzf(dVar.f4987k, dVar.p, dVar.f4978b);
        String str2 = null;
        while (true) {
            try {
                Bundle zzj = dVar.f4987k ? dVar.f4982f.zzj(9, dVar.f4981e.getPackageName(), str, str2, zzf) : dVar.f4982f.zzi(3, dVar.f4981e.getPackageName(), str, str2);
                j E = c.t.m.E(zzj, "BillingClient", "getPurchase()");
                if (E != b0.f4975l) {
                    aVar = new Purchase.a(E, null);
                    break;
                }
                ArrayList<String> stringArrayList = zzj.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = zzj.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = zzj.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                    String str3 = stringArrayList2.get(i2);
                    String str4 = stringArrayList3.get(i2);
                    String valueOf2 = String.valueOf(stringArrayList.get(i2));
                    zza.zzj("BillingClient", valueOf2.length() != 0 ? "Sku is owned: ".concat(valueOf2) : new String("Sku is owned: "));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.a())) {
                            zza.zzk("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e2) {
                        String valueOf3 = String.valueOf(e2);
                        StringBuilder sb = new StringBuilder(valueOf3.length() + 48);
                        sb.append("Got an exception trying to decode the purchase: ");
                        sb.append(valueOf3);
                        zza.zzk("BillingClient", sb.toString());
                        aVar = new Purchase.a(b0.f4974k, null);
                    }
                }
                str2 = zzj.getString("INAPP_CONTINUATION_TOKEN");
                String valueOf4 = String.valueOf(str2);
                zza.zzj("BillingClient", valueOf4.length() != 0 ? "Continuation token: ".concat(valueOf4) : new String("Continuation token: "));
                if (TextUtils.isEmpty(str2)) {
                    aVar = new Purchase.a(b0.f4975l, arrayList);
                    break;
                }
            } catch (Exception e3) {
                String valueOf5 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(valueOf5.length() + 57);
                sb2.append("Got exception trying to get purchases: ");
                sb2.append(valueOf5);
                sb2.append("; try to reconnect");
                zza.zzk("BillingClient", sb2.toString());
                aVar = new Purchase.a(b0.f4976m, null);
            }
        }
        List<Purchase> list = aVar.a;
        if (list != null) {
            ((g) this.f5019b).a(aVar.f2937b, list);
        } else {
            ((g) this.f5019b).a(aVar.f2937b, zzp.zzg());
        }
        return null;
    }
}
