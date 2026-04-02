package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import e.a.a.a.a;
import e.a.a.a.c0;
import e.a.a.a.i;
import e.a.a.a.j;
import e.a.a.a.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
/* loaded from: classes2.dex */
public final class zza {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    public static int zza(Bundle bundle, String str) {
        if (bundle == null) {
            zzk(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzj(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            String name = obj.getClass().getName();
            zzk(str, name.length() != 0 ? "Unexpected type for bundle response code: ".concat(name) : new String("Unexpected type for bundle response code: "));
            return 6;
        }
    }

    public static Bundle zzb(a aVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        return bundle;
    }

    public static Bundle zzc(k kVar, boolean z, String str) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        return bundle;
    }

    public static Bundle zzd(int i2, boolean z, String str, String str2, ArrayList<c0> arrayList) {
        Bundle bundle = new Bundle();
        if (i2 >= 9) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        if (i2 >= 9 && z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (i2 >= 14) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            int size = arrayList.size();
            boolean z2 = false;
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.get(i3);
                arrayList2.add(null);
                z2 |= !TextUtils.isEmpty(null);
            }
            if (z2) {
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
            }
        }
        return bundle;
    }

    public static Bundle zze(i iVar, boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        int i2 = iVar.f5001e;
        if (i2 != 0) {
            bundle.putInt("prorationMode", i2);
        }
        if (!TextUtils.isEmpty(iVar.f4998b)) {
            bundle.putString("accountId", iVar.f4998b);
        }
        if (!TextUtils.isEmpty(iVar.f5000d)) {
            bundle.putString("obfuscatedProfileId", iVar.f5000d);
        }
        if (iVar.f5003g) {
            bundle.putBoolean("vr", true);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
        }
        if (!TextUtils.isEmpty(iVar.f4999c)) {
            bundle.putString("oldSkuPurchaseToken", iVar.f4999c);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("oldSkuPurchaseId", null);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("paymentsPurchaseParams", null);
        }
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static Bundle zzf(boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static j zzg(Intent intent, String str) {
        if (intent == null) {
            zzk("BillingHelper", "Got null intent!");
            j jVar = new j();
            jVar.a = 6;
            return jVar;
        }
        int zza2 = zza(intent.getExtras(), str);
        zzh(intent.getExtras(), str);
        j jVar2 = new j();
        jVar2.a = zza2;
        return jVar2;
    }

    public static String zzh(Bundle bundle, String str) {
        if (bundle == null) {
            zzk(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzj(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            String name = obj.getClass().getName();
            zzk(str, name.length() != 0 ? "Unexpected type for debug message: ".concat(name) : new String("Unexpected type for debug message: "));
            return "";
        }
    }

    public static List<Purchase> zzi(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            zzk("BillingHelper", "Couldn't find purchase lists, trying to find single data.");
            Purchase zzl = zzl(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (zzl == null) {
                zzk("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(zzl);
        } else {
            for (int i2 = 0; i2 < stringArrayList.size() && i2 < stringArrayList2.size(); i2++) {
                Purchase zzl2 = zzl(stringArrayList.get(i2), stringArrayList2.get(i2));
                if (zzl2 != null) {
                    arrayList.add(zzl2);
                }
            }
        }
        return arrayList;
    }

    public static void zzj(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
        }
    }

    public static void zzk(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    private static Purchase zzl(String str, String str2) {
        if (str == null || str2 == null) {
            zzk("BillingHelper", "Received a bad purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 47);
            sb.append("Got JSONException while parsing purchase data: ");
            sb.append(valueOf);
            zzk("BillingHelper", sb.toString());
            return null;
        }
    }
}
