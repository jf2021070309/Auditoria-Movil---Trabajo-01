package e.a.a.a;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.google.android.gms.internal.play_billing.zza;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class u implements Callable<Void> {
    public final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f5021b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f5022c;

    public u(d dVar, String str, l lVar) {
        this.f5022c = dVar;
        this.a = str;
        this.f5021b = lVar;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        z zVar;
        d dVar = this.f5022c;
        String str = this.a;
        String valueOf = String.valueOf(str);
        zza.zzj("BillingClient", valueOf.length() != 0 ? "Querying purchase history, item type: ".concat(valueOf) : new String("Querying purchase history, item type: "));
        ArrayList arrayList = new ArrayList();
        Bundle zzf = zza.zzf(dVar.f4987k, dVar.p, dVar.f4978b);
        String str2 = null;
        while (true) {
            if (!dVar.f4986j) {
                zza.zzk("BillingClient", "getPurchaseHistory is not supported on current device");
                zVar = new z(b0.f4972i, null);
                break;
            }
            try {
                Bundle zzh = dVar.f4982f.zzh(6, dVar.f4981e.getPackageName(), str, str2, zzf);
                j E = c.t.m.E(zzh, "BillingClient", "getPurchaseHistory()");
                if (E != b0.f4975l) {
                    zVar = new z(E, null);
                    break;
                }
                ArrayList<String> stringArrayList = zzh.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = zzh.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = zzh.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                    String str3 = stringArrayList2.get(i2);
                    String str4 = stringArrayList3.get(i2);
                    String valueOf2 = String.valueOf(stringArrayList.get(i2));
                    zza.zzj("BillingClient", valueOf2.length() != 0 ? "Purchase record found for sku : ".concat(valueOf2) : new String("Purchase record found for sku : "));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        JSONObject jSONObject = purchaseHistoryRecord.f2939c;
                        if (TextUtils.isEmpty(jSONObject.optString("token", jSONObject.optString("purchaseToken")))) {
                            zza.zzk("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (JSONException e2) {
                        String valueOf3 = String.valueOf(e2);
                        StringBuilder sb = new StringBuilder(valueOf3.length() + 48);
                        sb.append("Got an exception trying to decode the purchase: ");
                        sb.append(valueOf3);
                        zza.zzk("BillingClient", sb.toString());
                        zVar = new z(b0.f4974k, null);
                    }
                }
                str2 = zzh.getString("INAPP_CONTINUATION_TOKEN");
                String valueOf4 = String.valueOf(str2);
                zza.zzj("BillingClient", valueOf4.length() != 0 ? "Continuation token: ".concat(valueOf4) : new String("Continuation token: "));
                if (TextUtils.isEmpty(str2)) {
                    zVar = new z(b0.f4975l, arrayList);
                    break;
                }
            } catch (RemoteException e3) {
                String valueOf5 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(valueOf5.length() + 64);
                sb2.append("Got exception trying to get purchase history: ");
                sb2.append(valueOf5);
                sb2.append("; try to reconnect");
                zza.zzk("BillingClient", sb2.toString());
                zVar = new z(b0.f4976m, null);
            }
        }
        ((f) this.f5021b).a(zVar.f5026b, zVar.a);
        return null;
    }
}
