package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
public class BillingClientImpl extends BillingClient {
    private int zza;
    private final String zzb;
    private final Handler zzc;
    private zze zzd;
    private Context zze;
    private Context zzf;
    private com.google.android.gms.internal.play_billing.zzd zzg;
    private zzah zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private ExecutorService zzu;

    private BillingClientImpl(Activity activity, boolean z, String str) {
        this(activity.getApplicationContext(), z, new zzaj(), str, null);
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, boolean z) {
        this.zzf = context.getApplicationContext();
        this.zzd = new zze(this.zzf, purchasesUpdatedListener);
        this.zze = context;
        this.zzt = z;
    }

    private int launchBillingFlowCpp(Activity activity, BillingFlowParams billingFlowParams) {
        return launchBillingFlow(activity, billingFlowParams).getResponseCode();
    }

    private void launchPriceChangeConfirmationFlow(Activity activity, PriceChangeFlowParams priceChangeFlowParams, long j) {
        launchPriceChangeConfirmationFlow(activity, priceChangeFlowParams, new zzaj(j));
    }

    private void startConnection(long j) {
        zzaj zzajVar = new zzaj(j);
        if (isReady()) {
            com.google.android.gms.internal.play_billing.zza.zza("BillingClient", "Service connection is valid. No need to re-initialize.");
            zzajVar.onBillingSetupFinished(zzam.zzp);
            return;
        }
        int i = this.zza;
        if (i == 1) {
            com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "Client is already in the process of connecting to billing service.");
            zzajVar.onBillingSetupFinished(zzam.zzd);
        } else if (i == 3) {
            com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            zzajVar.onBillingSetupFinished(zzam.zzq);
        } else {
            this.zza = 1;
            this.zzd.zza();
            com.google.android.gms.internal.play_billing.zza.zza("BillingClient", "Starting in-app billing setup.");
            this.zzh = new zzah(this, zzajVar, null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.zzf.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ResolveInfo resolveInfo = queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null) {
                        com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "The device doesn't have valid Play Store.");
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.zzb);
                        if (this.zzf.bindService(intent2, this.zzh, 1)) {
                            com.google.android.gms.internal.play_billing.zza.zza("BillingClient", "Service was bonded successfully.");
                            return;
                        }
                        com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "Connection to Billing service is blocked.");
                    }
                }
            }
            this.zza = 0;
            com.google.android.gms.internal.play_billing.zza.zza("BillingClient", "Billing service unavailable on device.");
            zzajVar.onBillingSetupFinished(zzam.zzc);
        }
    }

    private final BillingResult zzA(String str) {
        try {
            if (((Integer) zzz(new zzt(this, str), 5000L, null).get(5000L, TimeUnit.MILLISECONDS)).intValue() != 0) {
                return zzam.zzi;
            }
            return zzam.zzp;
        } catch (Exception unused) {
            com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "Exception while checking if billing is supported; try to reconnect");
            return zzam.zzq;
        }
    }

    public final void zzB(Runnable runnable) {
        if (Thread.interrupted()) {
            return;
        }
        this.zzc.post(runnable);
    }

    public static /* synthetic */ Context zzb(BillingClientImpl billingClientImpl) {
        return billingClientImpl.zzf;
    }

    public static /* synthetic */ com.google.android.gms.internal.play_billing.zzd zzc(BillingClientImpl billingClientImpl) {
        return billingClientImpl.zzg;
    }

    public static /* synthetic */ Purchase.PurchasesResult zzd(BillingClientImpl billingClientImpl, String str) {
        Bundle zzd;
        String valueOf = String.valueOf(str);
        com.google.android.gms.internal.play_billing.zza.zza("BillingClient", valueOf.length() != 0 ? "Querying owned items, item type: ".concat(valueOf) : new String("Querying owned items, item type: "));
        ArrayList arrayList = new ArrayList();
        Bundle zzh = com.google.android.gms.internal.play_billing.zza.zzh(billingClientImpl.zzn, billingClientImpl.zzt, billingClientImpl.zzb);
        String str2 = null;
        do {
            try {
                if (billingClientImpl.zzn) {
                    zzd = billingClientImpl.zzg.zzk(9, billingClientImpl.zzf.getPackageName(), str, str2, zzh);
                } else {
                    zzd = billingClientImpl.zzg.zzd(3, billingClientImpl.zzf.getPackageName(), str, str2);
                }
                BillingResult zza = zzao.zza(zzd, "BillingClient", "getPurchase()");
                if (zza == zzam.zzp) {
                    ArrayList<String> stringArrayList = zzd.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList2 = zzd.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList3 = zzd.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    for (int i = 0; i < stringArrayList2.size(); i++) {
                        String str3 = stringArrayList2.get(i);
                        String str4 = stringArrayList3.get(i);
                        String valueOf2 = String.valueOf(stringArrayList.get(i));
                        com.google.android.gms.internal.play_billing.zza.zza("BillingClient", valueOf2.length() != 0 ? "Sku is owned: ".concat(valueOf2) : new String("Sku is owned: "));
                        try {
                            Purchase purchase = new Purchase(str3, str4);
                            if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                                com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "BUG: empty/null token!");
                            }
                            arrayList.add(purchase);
                        } catch (JSONException e) {
                            String valueOf3 = String.valueOf(e);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 48);
                            sb.append("Got an exception trying to decode the purchase: ");
                            sb.append(valueOf3);
                            com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", sb.toString());
                            return new Purchase.PurchasesResult(zzam.zzl, null);
                        }
                    }
                    str2 = zzd.getString("INAPP_CONTINUATION_TOKEN");
                    String valueOf4 = String.valueOf(str2);
                    com.google.android.gms.internal.play_billing.zza.zza("BillingClient", valueOf4.length() != 0 ? "Continuation token: ".concat(valueOf4) : new String("Continuation token: "));
                } else {
                    return new Purchase.PurchasesResult(zza, null);
                }
            } catch (Exception e2) {
                String valueOf5 = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf5).length() + 57);
                sb2.append("Got exception trying to get purchases: ");
                sb2.append(valueOf5);
                sb2.append("; try to reconnect");
                com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", sb2.toString());
                return new Purchase.PurchasesResult(zzam.zzq, null);
            }
        } while (!TextUtils.isEmpty(str2));
        return new Purchase.PurchasesResult(zzam.zzp, arrayList);
    }

    public static /* synthetic */ void zzf(BillingClientImpl billingClientImpl, ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {
        int zze;
        String str;
        String purchaseToken = consumeParams.getPurchaseToken();
        try {
            String valueOf = String.valueOf(purchaseToken);
            com.google.android.gms.internal.play_billing.zza.zza("BillingClient", valueOf.length() != 0 ? "Consuming purchase with token: ".concat(valueOf) : new String("Consuming purchase with token: "));
            if (billingClientImpl.zzn) {
                Bundle zzl = billingClientImpl.zzg.zzl(9, billingClientImpl.zzf.getPackageName(), purchaseToken, com.google.android.gms.internal.play_billing.zza.zzj(consumeParams, billingClientImpl.zzn, billingClientImpl.zzb));
                int i = zzl.getInt("RESPONSE_CODE");
                str = com.google.android.gms.internal.play_billing.zza.zze(zzl, "BillingClient");
                zze = i;
            } else {
                zze = billingClientImpl.zzg.zze(3, billingClientImpl.zzf.getPackageName(), purchaseToken);
                str = "";
            }
            BillingResult.Builder newBuilder = BillingResult.newBuilder();
            newBuilder.setResponseCode(zze);
            newBuilder.setDebugMessage(str);
            BillingResult build = newBuilder.build();
            if (zze != 0) {
                billingClientImpl.zzB(new zzv(billingClientImpl, zze, consumeResponseListener, build, purchaseToken));
            } else {
                billingClientImpl.zzB(new zzu(billingClientImpl, consumeResponseListener, build, purchaseToken));
            }
        } catch (Exception e) {
            billingClientImpl.zzB(new zzw(billingClientImpl, e, consumeResponseListener, purchaseToken));
        }
    }

    public static /* synthetic */ zzai zzg(BillingClientImpl billingClientImpl, String str) {
        String valueOf = String.valueOf(str);
        com.google.android.gms.internal.play_billing.zza.zza("BillingClient", valueOf.length() != 0 ? "Querying purchase history, item type: ".concat(valueOf) : new String("Querying purchase history, item type: "));
        ArrayList arrayList = new ArrayList();
        Bundle zzh = com.google.android.gms.internal.play_billing.zza.zzh(billingClientImpl.zzn, billingClientImpl.zzt, billingClientImpl.zzb);
        String str2 = null;
        while (billingClientImpl.zzl) {
            try {
                Bundle zzh2 = billingClientImpl.zzg.zzh(6, billingClientImpl.zzf.getPackageName(), str, str2, zzh);
                BillingResult zza = zzao.zza(zzh2, "BillingClient", "getPurchaseHistory()");
                if (zza == zzam.zzp) {
                    ArrayList<String> stringArrayList = zzh2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList2 = zzh2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList3 = zzh2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    for (int i = 0; i < stringArrayList2.size(); i++) {
                        String str3 = stringArrayList2.get(i);
                        String str4 = stringArrayList3.get(i);
                        String valueOf2 = String.valueOf(stringArrayList.get(i));
                        com.google.android.gms.internal.play_billing.zza.zza("BillingClient", valueOf2.length() != 0 ? "Purchase record found for sku : ".concat(valueOf2) : new String("Purchase record found for sku : "));
                        try {
                            PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                            if (TextUtils.isEmpty(purchaseHistoryRecord.getPurchaseToken())) {
                                com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "BUG: empty/null token!");
                            }
                            arrayList.add(purchaseHistoryRecord);
                        } catch (JSONException e) {
                            String valueOf3 = String.valueOf(e);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 48);
                            sb.append("Got an exception trying to decode the purchase: ");
                            sb.append(valueOf3);
                            com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", sb.toString());
                            return new zzai(zzam.zzl, null);
                        }
                    }
                    str2 = zzh2.getString("INAPP_CONTINUATION_TOKEN");
                    String valueOf4 = String.valueOf(str2);
                    com.google.android.gms.internal.play_billing.zza.zza("BillingClient", valueOf4.length() != 0 ? "Continuation token: ".concat(valueOf4) : new String("Continuation token: "));
                    if (TextUtils.isEmpty(str2)) {
                        return new zzai(zzam.zzp, arrayList);
                    }
                } else {
                    return new zzai(zza, null);
                }
            } catch (RemoteException e2) {
                String valueOf5 = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf5).length() + 64);
                sb2.append("Got exception trying to get purchase history: ");
                sb2.append(valueOf5);
                sb2.append("; try to reconnect");
                com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", sb2.toString());
                return new zzai(zzam.zzq, null);
            }
        }
        com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "getPurchaseHistory is not supported on current device");
        return new zzai(zzam.zzj, null);
    }

    private final BillingResult zzy(BillingResult billingResult) {
        this.zzd.zzb().onPurchasesUpdated(billingResult, null);
        return billingResult;
    }

    public final <T> Future<T> zzz(Callable<T> callable, long j, Runnable runnable) {
        long j2 = (long) (j * 0.95d);
        if (this.zzu == null) {
            this.zzu = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.zza.zza, new zzq(this));
        }
        try {
            Future<T> submit = this.zzu.submit(callable);
            this.zzc.postDelayed(new zzr(this, submit, runnable), j2);
            return submit;
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Async task throws exception ");
            sb.append(valueOf);
            com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", sb.toString());
            return null;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void acknowledgePurchase(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (!isReady()) {
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzam.zzq);
        } else if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
            com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "Please provide a valid purchase token.");
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzam.zzk);
        } else if (!this.zzn) {
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzam.zzb);
        } else if (zzz(new zzo(this, acknowledgePurchaseParams, acknowledgePurchaseResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzp(this, acknowledgePurchaseResponseListener)) == null) {
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzC());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void consumeAsync(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {
        if (!isReady()) {
            consumeResponseListener.onConsumeResponse(zzam.zzq, consumeParams.getPurchaseToken());
        } else if (zzz(new zzh(this, consumeParams, consumeResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzi(this, consumeResponseListener, consumeParams)) == null) {
            consumeResponseListener.onConsumeResponse(zzC(), consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void endConnection() {
        try {
            this.zze = null;
            this.zzd.zzc();
            zzah zzahVar = this.zzh;
            if (zzahVar != null) {
                zzahVar.zza();
            }
            if (this.zzh != null && this.zzg != null) {
                com.google.android.gms.internal.play_billing.zza.zza("BillingClient", "Unbinding from service.");
                this.zzf.unbindService(this.zzh);
                this.zzh = null;
            }
            this.zzg = null;
            ExecutorService executorService = this.zzu;
            if (executorService != null) {
                executorService.shutdownNow();
                this.zzu = null;
            }
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
            sb.append("There was an exception while ending connection: ");
            sb.append(valueOf);
            com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", sb.toString());
        } finally {
            this.zza = 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult isFeatureSupported(String str) {
        char c;
        if (!isReady()) {
            return zzam.zzq;
        }
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS_UPDATE)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 96321:
                if (str.equals("aaa")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 97314:
                if (str.equals("bbb")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 98307:
                if (str.equals("ccc")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 99300:
                if (str.equals("ddd")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 100293:
                if (str.equals("eee")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 207616302:
                if (str.equals(BillingClient.FeatureType.PRICE_CHANGE_CONFIRMATION)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 292218239:
                if (str.equals(BillingClient.FeatureType.IN_APP_ITEMS_ON_VR)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1219490065:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS_ON_VR)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1987365622:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return this.zzi ? zzam.zzp : zzam.zzi;
            case 1:
                if (this.zzj) {
                    return zzam.zzp;
                }
                return zzam.zzi;
            case 2:
                return zzA(BillingClient.SkuType.INAPP);
            case 3:
                return zzA(BillingClient.SkuType.SUBS);
            case 4:
                return this.zzm ? zzam.zzp : zzam.zzi;
            case 5:
                return this.zzp ? zzam.zzp : zzam.zzi;
            case 6:
                return this.zzr ? zzam.zzp : zzam.zzi;
            case 7:
                return this.zzq ? zzam.zzp : zzam.zzi;
            case '\b':
            case '\t':
                return this.zzs ? zzam.zzp : zzam.zzi;
            default:
                String valueOf = String.valueOf(str);
                com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", valueOf.length() != 0 ? "Unsupported feature: ".concat(valueOf) : new String("Unsupported feature: "));
                return zzam.zzv;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        return (this.zza != 2 || this.zzg == null || this.zzh == null) ? false : true;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult launchBillingFlow(Activity activity, BillingFlowParams billingFlowParams) {
        String str;
        String str2;
        String str3;
        long j;
        Future zzz;
        boolean z;
        int i;
        int i2;
        String str4;
        String str5 = "BUY_INTENT";
        if (!isReady()) {
            BillingResult billingResult = zzam.zzq;
            zzy(billingResult);
            return billingResult;
        }
        ArrayList<SkuDetails> zza = billingFlowParams.zza();
        SkuDetails skuDetails = zza.get(0);
        String type = skuDetails.getType();
        if (!type.equals(BillingClient.SkuType.SUBS) || this.zzi) {
            String oldSku = billingFlowParams.getOldSku();
            if (oldSku == null || this.zzj) {
                if (!billingFlowParams.zzc() || this.zzl) {
                    if (zza.size() <= 1 || this.zzs) {
                        String str6 = "";
                        int i3 = 0;
                        String str7 = "";
                        while (i3 < zza.size()) {
                            String valueOf = String.valueOf(str7);
                            String valueOf2 = String.valueOf(zza.get(i3));
                            String str8 = str6;
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
                            sb.append(valueOf);
                            sb.append(valueOf2);
                            String sb2 = sb.toString();
                            if (i3 < zza.size() - 1) {
                                sb2 = String.valueOf(sb2).concat(", ");
                            }
                            str7 = sb2;
                            i3++;
                            str6 = str8;
                        }
                        String str9 = str6;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str7).length() + 41 + String.valueOf(type).length());
                        sb3.append("Constructing buy intent for ");
                        sb3.append(str7);
                        sb3.append(", item type: ");
                        sb3.append(type);
                        com.google.android.gms.internal.play_billing.zza.zza("BillingClient", sb3.toString());
                        if (this.zzl) {
                            Bundle zzg = com.google.android.gms.internal.play_billing.zza.zzg(billingFlowParams, this.zzn, this.zzt, this.zzb);
                            ArrayList<String> arrayList = new ArrayList<>();
                            ArrayList<String> arrayList2 = new ArrayList<>();
                            ArrayList<String> arrayList3 = new ArrayList<>();
                            ArrayList<Integer> arrayList4 = new ArrayList<>();
                            str2 = "; try to reconnect";
                            int size = zza.size();
                            str3 = str7;
                            int i4 = 0;
                            boolean z2 = false;
                            boolean z3 = false;
                            boolean z4 = false;
                            while (i4 < size) {
                                SkuDetails skuDetails2 = zza.get(i4);
                                if (skuDetails2.zzb().isEmpty()) {
                                    i2 = size;
                                } else {
                                    i2 = size;
                                    arrayList.add(skuDetails2.zzb());
                                }
                                String str10 = str5;
                                try {
                                    str4 = new JSONObject(skuDetails2.getOriginalJson()).optString("offer_id_token");
                                } catch (JSONException unused) {
                                    str4 = str9;
                                }
                                String zzc = skuDetails2.zzc();
                                int zzd = skuDetails2.zzd();
                                arrayList2.add(str4);
                                z2 |= !TextUtils.isEmpty(str4);
                                arrayList3.add(zzc);
                                z3 |= !TextUtils.isEmpty(zzc);
                                arrayList4.add(Integer.valueOf(zzd));
                                z4 |= zzd != 0;
                                i4++;
                                size = i2;
                                str5 = str10;
                            }
                            str = str5;
                            if (!arrayList.isEmpty()) {
                                zzg.putStringArrayList("skuDetailsTokens", arrayList);
                            }
                            if (z2) {
                                if (!this.zzq) {
                                    BillingResult billingResult2 = zzam.zzi;
                                    zzy(billingResult2);
                                    return billingResult2;
                                }
                                zzg.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
                            }
                            if (z3) {
                                zzg.putStringArrayList("SKU_OFFER_ID_LIST", arrayList3);
                            }
                            if (z4) {
                                zzg.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList4);
                            }
                            if (TextUtils.isEmpty(skuDetails.zza())) {
                                z = false;
                            } else {
                                zzg.putString("skuPackageName", skuDetails.zza());
                                z = true;
                            }
                            if (!TextUtils.isEmpty(null)) {
                                zzg.putString("accountName", null);
                            }
                            if (zza.size() > 1) {
                                ArrayList<String> arrayList5 = new ArrayList<>(zza.size() - 1);
                                ArrayList<String> arrayList6 = new ArrayList<>(zza.size() - 1);
                                for (int i5 = 1; i5 < zza.size(); i5++) {
                                    arrayList5.add(zza.get(i5).getSku());
                                    arrayList6.add(zza.get(i5).getType());
                                }
                                zzg.putStringArrayList("additionalSkus", arrayList5);
                                zzg.putStringArrayList("additionalSkuTypes", arrayList6);
                            }
                            if (!TextUtils.isEmpty(activity.getIntent().getStringExtra("PROXY_PACKAGE"))) {
                                String stringExtra = activity.getIntent().getStringExtra("PROXY_PACKAGE");
                                zzg.putString("proxyPackage", stringExtra);
                                try {
                                    zzg.putString("proxyPackageVersion", this.zzf.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                                } catch (PackageManager.NameNotFoundException unused2) {
                                    zzg.putString("proxyPackageVersion", "package not found");
                                }
                            }
                            if (this.zzr && z) {
                                i = 15;
                            } else if (this.zzn) {
                                i = 9;
                            } else {
                                i = billingFlowParams.getVrPurchaseFlow() ? 7 : 6;
                            }
                            j = 5000;
                            zzz = zzz(new zzy(this, i, skuDetails, type, billingFlowParams, zzg), 5000L, null);
                        } else {
                            str = "BUY_INTENT";
                            str2 = "; try to reconnect";
                            str3 = str7;
                            j = 5000;
                            if (oldSku != null) {
                                zzz = zzz(new zzz(this, billingFlowParams, skuDetails), 5000L, null);
                            } else {
                                zzz = zzz(new zzaa(this, skuDetails, type), 5000L, null);
                            }
                        }
                        try {
                            Bundle bundle = (Bundle) zzz.get(j, TimeUnit.MILLISECONDS);
                            int zzd2 = com.google.android.gms.internal.play_billing.zza.zzd(bundle, "BillingClient");
                            String zze = com.google.android.gms.internal.play_billing.zza.zze(bundle, "BillingClient");
                            if (zzd2 != 0) {
                                StringBuilder sb4 = new StringBuilder(52);
                                sb4.append("Unable to buy item, Error response code: ");
                                sb4.append(zzd2);
                                com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", sb4.toString());
                                BillingResult.Builder newBuilder = BillingResult.newBuilder();
                                newBuilder.setResponseCode(zzd2);
                                newBuilder.setDebugMessage(zze);
                                BillingResult build = newBuilder.build();
                                zzy(build);
                                return build;
                            }
                            Intent intent = new Intent(activity, ProxyBillingActivity.class);
                            String str11 = str;
                            intent.putExtra(str11, (PendingIntent) bundle.getParcelable(str11));
                            activity.startActivity(intent);
                            return zzam.zzp;
                        } catch (CancellationException | TimeoutException unused3) {
                            String str12 = str3;
                            StringBuilder sb5 = new StringBuilder(String.valueOf(str12).length() + 68);
                            sb5.append("Time out while launching billing flow: ; for sku: ");
                            sb5.append(str12);
                            sb5.append(str2);
                            com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", sb5.toString());
                            BillingResult billingResult3 = zzam.zzr;
                            zzy(billingResult3);
                            return billingResult3;
                        } catch (Exception unused4) {
                            StringBuilder sb6 = new StringBuilder(String.valueOf(str3).length() + 69);
                            sb6.append("Exception while launching billing flow: ; for sku: ");
                            sb6.append(str3);
                            sb6.append(str2);
                            com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", sb6.toString());
                            BillingResult billingResult4 = zzam.zzq;
                            zzy(billingResult4);
                            return billingResult4;
                        }
                    }
                    com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "Current client doesn't support multi-item purchases.");
                    BillingResult billingResult5 = zzam.zzu;
                    zzy(billingResult5);
                    return billingResult5;
                }
                com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "Current client doesn't support extra params for buy intent.");
                BillingResult billingResult6 = zzam.zzh;
                zzy(billingResult6);
                return billingResult6;
            }
            com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "Current client doesn't support subscriptions update.");
            BillingResult billingResult7 = zzam.zzt;
            zzy(billingResult7);
            return billingResult7;
        }
        com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "Current client doesn't support subscriptions.");
        BillingResult billingResult8 = zzam.zzs;
        zzy(billingResult8);
        return billingResult8;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzam.zzq, null);
        } else if (zzz(new zzk(this, str, purchaseHistoryResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzl(this, purchaseHistoryResponseListener)) == null) {
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzC(), null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final Purchase.PurchasesResult queryPurchases(String str) {
        if (!isReady()) {
            return new Purchase.PurchasesResult(zzam.zzq, null);
        }
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "Please provide a valid SKU type.");
            return new Purchase.PurchasesResult(zzam.zzg, null);
        }
        try {
            return (Purchase.PurchasesResult) zzz(new zzab(this, str), 5000L, null).get(5000L, TimeUnit.MILLISECONDS);
        } catch (CancellationException | TimeoutException unused) {
            return new Purchase.PurchasesResult(zzam.zzr, null);
        } catch (Exception unused2) {
            return new Purchase.PurchasesResult(zzam.zzl, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!isReady()) {
            skuDetailsResponseListener.onSkuDetailsResponse(zzam.zzq, null);
            return;
        }
        String skuType = skuDetailsParams.getSkuType();
        List<String> skusList = skuDetailsParams.getSkusList();
        if (TextUtils.isEmpty(skuType)) {
            com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "Please fix the input params. SKU type can't be empty.");
            skuDetailsResponseListener.onSkuDetailsResponse(zzam.zzg, null);
        } else if (skusList != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : skusList) {
                zzas zzasVar = new zzas(null);
                zzasVar.zza(str);
                arrayList.add(zzasVar.zzb());
            }
            if (zzz(new zzad(this, skuType, arrayList, null, skuDetailsResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzg(this, skuDetailsResponseListener)) == null) {
                skuDetailsResponseListener.onSkuDetailsResponse(zzC(), null);
            }
        } else {
            com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
            skuDetailsResponseListener.onSkuDetailsResponse(zzam.zzf, null);
        }
    }

    public final zzap zza(String str, List<zzat> list, String str2) {
        Bundle zzb;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 20;
            ArrayList arrayList2 = new ArrayList(list.subList(i, i2 > size ? size : i2));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(((zzat) arrayList2.get(i3)).zza());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.zzb);
            try {
                if (this.zzo) {
                    zzb = this.zzg.zzm(10, this.zzf.getPackageName(), str, bundle, com.google.android.gms.internal.play_billing.zza.zzi(this.zzk, this.zzt, this.zzb, null, arrayList2));
                } else {
                    zzb = this.zzg.zzb(3, this.zzf.getPackageName(), str, bundle);
                }
                if (zzb != null) {
                    if (zzb.containsKey("DETAILS_LIST")) {
                        ArrayList<String> stringArrayList = zzb.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null) {
                            for (int i4 = 0; i4 < stringArrayList.size(); i4++) {
                                try {
                                    SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i4));
                                    String valueOf = String.valueOf(skuDetails);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
                                    sb.append("Got sku details: ");
                                    sb.append(valueOf);
                                    com.google.android.gms.internal.play_billing.zza.zza("BillingClient", sb.toString());
                                    arrayList.add(skuDetails);
                                } catch (JSONException unused) {
                                    com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "Got a JSON exception trying to decode SkuDetails.");
                                    return new zzap(6, "Error trying to decode SkuDetails.", null);
                                }
                            }
                            i = i2;
                        } else {
                            com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "querySkuDetailsAsync got null response list");
                            return new zzap(4, "Item is unavailable for purchase.", null);
                        }
                    } else {
                        int zzd = com.google.android.gms.internal.play_billing.zza.zzd(zzb, "BillingClient");
                        String zze = com.google.android.gms.internal.play_billing.zza.zze(zzb, "BillingClient");
                        if (zzd != 0) {
                            StringBuilder sb2 = new StringBuilder(50);
                            sb2.append("getSkuDetails() failed. Response code: ");
                            sb2.append(zzd);
                            com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", sb2.toString());
                            return new zzap(zzd, zze, arrayList);
                        }
                        com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                        return new zzap(6, zze, arrayList);
                    }
                } else {
                    com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "querySkuDetailsAsync got null sku details list");
                    return new zzap(4, "Item is unavailable for purchase.", null);
                }
            } catch (Exception e) {
                String valueOf2 = String.valueOf(e);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 63);
                sb3.append("querySkuDetailsAsync got a remote exception (try to reconnect).");
                sb3.append(valueOf2);
                com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", sb3.toString());
                return new zzap(-1, "Service connection is disconnected.", null);
            }
        }
        return new zzap(0, "", arrayList);
    }

    public final BillingResult zzC() {
        int i = this.zza;
        if (i == 0 || i == 3) {
            return zzam.zzq;
        }
        return zzam.zzl;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void launchPriceChangeConfirmationFlow(Activity activity, PriceChangeFlowParams priceChangeFlowParams, PriceChangeConfirmationListener priceChangeConfirmationListener) {
        if (!isReady()) {
            priceChangeConfirmationListener.onPriceChangeConfirmationResult(zzam.zzq);
        } else if (priceChangeFlowParams == null || priceChangeFlowParams.getSkuDetails() == null) {
            com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "Please fix the input params. priceChangeFlowParams must contain valid sku.");
            priceChangeConfirmationListener.onPriceChangeConfirmationResult(zzam.zzn);
        } else {
            String sku = priceChangeFlowParams.getSkuDetails().getSku();
            if (sku == null) {
                com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "Please fix the input params. priceChangeFlowParams must contain valid sku.");
                priceChangeConfirmationListener.onPriceChangeConfirmationResult(zzam.zzn);
            } else if (!this.zzm) {
                com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "Current client doesn't support price change confirmation flow.");
                priceChangeConfirmationListener.onPriceChangeConfirmationResult(zzam.zzi);
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("playBillingLibraryVersion", this.zzb);
                bundle.putBoolean("subs_price_change", true);
                try {
                    Bundle bundle2 = (Bundle) zzz(new zzs(this, sku, bundle), 5000L, null).get(5000L, TimeUnit.MILLISECONDS);
                    int zzd = com.google.android.gms.internal.play_billing.zza.zzd(bundle2, "BillingClient");
                    String zze = com.google.android.gms.internal.play_billing.zza.zze(bundle2, "BillingClient");
                    BillingResult.Builder newBuilder = BillingResult.newBuilder();
                    newBuilder.setResponseCode(zzd);
                    newBuilder.setDebugMessage(zze);
                    BillingResult build = newBuilder.build();
                    if (zzd == 0) {
                        zzx zzxVar = new zzx(this, this.zzc, priceChangeConfirmationListener);
                        Intent intent = new Intent(activity, ProxyBillingActivity.class);
                        intent.putExtra("SUBS_MANAGEMENT_INTENT", (PendingIntent) bundle2.getParcelable("SUBS_MANAGEMENT_INTENT"));
                        intent.putExtra("result_receiver", zzxVar);
                        activity.startActivity(intent);
                        return;
                    }
                    StringBuilder sb = new StringBuilder(68);
                    sb.append("Unable to launch price change flow, error response code: ");
                    sb.append(zzd);
                    com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", sb.toString());
                    priceChangeConfirmationListener.onPriceChangeConfirmationResult(build);
                } catch (CancellationException | TimeoutException unused) {
                    StringBuilder sb2 = new StringBuilder(sku.length() + 70);
                    sb2.append("Time out while launching Price Change Flow for sku: ");
                    sb2.append(sku);
                    sb2.append("; try to reconnect");
                    com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", sb2.toString());
                    priceChangeConfirmationListener.onPriceChangeConfirmationResult(zzam.zzr);
                } catch (Exception unused2) {
                    StringBuilder sb3 = new StringBuilder(sku.length() + 78);
                    sb3.append("Exception caught while launching Price Change Flow for sku: ");
                    sb3.append(sku);
                    sb3.append("; try to reconnect");
                    com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", sb3.toString());
                    priceChangeConfirmationListener.onPriceChangeConfirmationResult(zzam.zzq);
                }
            }
        }
    }

    private BillingClientImpl(Context context, boolean z, PurchasesUpdatedListener purchasesUpdatedListener, String str, String str2) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
        initialize(context, purchasesUpdatedListener, z);
    }

    private BillingClientImpl(String str) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BillingClientImpl(java.lang.String r7, boolean r8, android.content.Context r9, com.android.billingclient.api.PurchasesUpdatedListener r10) {
        /*
            r6 = this;
            java.lang.String r7 = "com.android.billingclient.ktx.BuildConfig"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Exception -> L14
            java.lang.String r8 = "VERSION_NAME"
            java.lang.reflect.Field r7 = r7.getField(r8)     // Catch: java.lang.Exception -> L14
            r8 = 0
            java.lang.Object r7 = r7.get(r8)     // Catch: java.lang.Exception -> L14
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L14
            goto L16
        L14:
            java.lang.String r7 = "3.0.3"
        L16:
            r4 = r7
            r2 = 1
            r5 = 0
            r0 = r6
            r1 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.<init>(java.lang.String, boolean, android.content.Context, com.android.billingclient.api.PurchasesUpdatedListener):void");
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        if (isReady()) {
            com.google.android.gms.internal.play_billing.zza.zza("BillingClient", "Service connection is valid. No need to re-initialize.");
            billingClientStateListener.onBillingSetupFinished(zzam.zzp);
            return;
        }
        int i = this.zza;
        if (i == 1) {
            com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "Client is already in the process of connecting to billing service.");
            billingClientStateListener.onBillingSetupFinished(zzam.zzd);
        } else if (i == 3) {
            com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            billingClientStateListener.onBillingSetupFinished(zzam.zzq);
        } else {
            this.zza = 1;
            this.zzd.zza();
            com.google.android.gms.internal.play_billing.zza.zza("BillingClient", "Starting in-app billing setup.");
            this.zzh = new zzah(this, billingClientStateListener, null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.zzf.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ResolveInfo resolveInfo = queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null) {
                        com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "The device doesn't have valid Play Store.");
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.zzb);
                        if (this.zzf.bindService(intent2, this.zzh, 1)) {
                            com.google.android.gms.internal.play_billing.zza.zza("BillingClient", "Service was bonded successfully.");
                            return;
                        }
                        com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", "Connection to Billing service is blocked.");
                    }
                }
            }
            this.zza = 0;
            com.google.android.gms.internal.play_billing.zza.zza("BillingClient", "Billing service unavailable on device.");
            billingClientStateListener.onBillingSetupFinished(zzam.zzc);
        }
    }
}
