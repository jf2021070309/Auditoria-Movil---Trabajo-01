package com.rovio.rcs.payment.google;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.android.vending.billing.IInAppBillingService;
import com.rovio.fusion.Globals;
import com.rovio.fusion.IActivityListener;
import com.rovio.rcs.payment.Payment;
import com.rovio.rcs.payment.google.Consts;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class GooglePlayPaymentProvider implements ServiceConnection, IActivityListener {
    private static final String TAG = "GooglePlayPaymentProvider";
    IInAppBillingService a;
    long b;
    private Activity c = Globals.getActivity();
    private boolean d = false;
    private HashMap<Integer, String> e = new HashMap<>();
    private ArrayList<Runnable> f = new ArrayList<>();
    private BroadcastReceiver g;
    private String h;

    /* JADX INFO: Access modifiers changed from: private */
    public static native void initFinished(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void paymentFinished(long j, String str, int i, String str2, String str3, String str4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void restoreDone(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void restoreFailed(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void skuDetailsLoaded(long j, SkuDetails[] skuDetailsArr);

    /* loaded from: classes4.dex */
    private class PurchaseRequest implements Runnable {
        private boolean b;
        private String c;
        private String d;
        private String e;

        public PurchaseRequest(boolean z, String str, String str2, String str3) {
            this.b = z;
            this.c = str;
            this.d = str2;
            this.e = a(str3);
        }

        private String a(String str) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(str.getBytes());
                return android.util.Base64.encodeToString(messageDigest.digest(), 0);
            } catch (Exception e) {
                GooglePlayPaymentProvider.logError("Failed to hash: " + e);
                return "";
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.b) {
                    GooglePlayPaymentProvider.this.a(Consts.ITEM_TYPE_SUBSCRIPTION, false);
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(this.e)) {
                    bundle.putString(Consts.EXTRA_PARAMS_KEY_ACCOUNT_ID, this.e);
                }
                if (!this.b || TextUtils.isEmpty(GooglePlayPaymentProvider.this.h) || GooglePlayPaymentProvider.this.h.equals(this.c)) {
                    GooglePlayPaymentProvider.log("purchasing '" + this.c + "', developerPayload " + this.d);
                } else {
                    GooglePlayPaymentProvider.log("replacing '" + GooglePlayPaymentProvider.this.h + "' with '" + this.c + "', developerPayload " + this.d);
                    bundle.putStringArrayList(Consts.EXTRA_PARAMS_KEY_SKUS_TO_REPLACE, new ArrayList<>(Arrays.asList(GooglePlayPaymentProvider.this.h)));
                }
                final Bundle buyIntentExtraParams = GooglePlayPaymentProvider.this.a.getBuyIntentExtraParams(6, GooglePlayPaymentProvider.this.c.getPackageName(), this.c, this.b ? Consts.ITEM_TYPE_SUBSCRIPTION : Consts.ITEM_TYPE_INAPP, this.d, bundle);
                Consts.ResponseCode a = GooglePlayPaymentProvider.this.a(buyIntentExtraParams);
                if (a != Consts.ResponseCode.RESULT_OK) {
                    GooglePlayPaymentProvider.logError("purchase failed: " + a);
                    GooglePlayPaymentProvider.this.a(this.c, GooglePlayPaymentProvider.this.a(a));
                    return;
                }
                GooglePlayPaymentProvider.this.c.runOnUiThread(new Runnable() { // from class: com.rovio.rcs.payment.google.GooglePlayPaymentProvider.PurchaseRequest.1
                    @Override // java.lang.Runnable
                    public void run() {
                        int round = (int) Math.round(Math.random() * 65535.0d);
                        try {
                            Integer num = 0;
                            Integer num2 = 0;
                            Integer num3 = 0;
                            GooglePlayPaymentProvider.this.c.startIntentSenderForResult(((PendingIntent) buyIntentExtraParams.getParcelable(Consts.RESPONSE_BUY_INTENT)).getIntentSender(), round, new Intent(), num.intValue(), num2.intValue(), num3.intValue());
                            GooglePlayPaymentProvider.this.e.put(Integer.valueOf(round), PurchaseRequest.this.c);
                        } catch (IntentSender.SendIntentException e) {
                            GooglePlayPaymentProvider.logError("failed to start purchase intent: " + e);
                            GooglePlayPaymentProvider.this.a(PurchaseRequest.this.c, Payment.PurchaseStatus.FAILED);
                        }
                    }
                });
            } catch (RemoteException e) {
                GooglePlayPaymentProvider.logError("purchase failed with exception " + e);
                GooglePlayPaymentProvider.this.a(this.c, Payment.PurchaseStatus.FAILED);
            } catch (RuntimeException e2) {
                GooglePlayPaymentProvider.logError("purchase failed with runtime exception " + e2);
                GooglePlayPaymentProvider.this.a(this.c, Payment.PurchaseStatus.FAILED);
            }
        }
    }

    /* loaded from: classes4.dex */
    private class GetSkuDetailsRequest implements Runnable {
        private ArrayList<String> b = new ArrayList<>();
        private ArrayList<String> c = new ArrayList<>();
        private ArrayList<SkuDetails> d = new ArrayList<>();

        public GetSkuDetailsRequest(ArrayList<Product> arrayList) {
            Iterator<Product> it = arrayList.iterator();
            while (it.hasNext()) {
                Product next = it.next();
                if (next.isSubscription) {
                    this.c.add(next.id);
                } else {
                    this.b.add(next.id);
                }
            }
        }

        void a(String str, ArrayList<String> arrayList) {
            for (int i = 0; i < arrayList.size(); i += 20) {
                this.d.addAll(getDetailsBatch(str, new ArrayList<>(arrayList.subList(i, Math.min(arrayList.size(), i + 20)))));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = true;
            try {
                if (!this.b.isEmpty()) {
                    a(Consts.ITEM_TYPE_INAPP, this.b);
                }
                if (!this.c.isEmpty()) {
                    a(Consts.ITEM_TYPE_SUBSCRIPTION, this.c);
                }
            } catch (RuntimeException e) {
                GooglePlayPaymentProvider.logError("Error getting SKU details: " + e);
                z = false;
            }
            final SkuDetails[] skuDetailsArr = z ? (SkuDetails[]) this.d.toArray(new SkuDetails[this.d.size()]) : null;
            Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.payment.google.GooglePlayPaymentProvider.GetSkuDetailsRequest.1
                @Override // java.lang.Runnable
                public void run() {
                    if (GooglePlayPaymentProvider.this.b != 0) {
                        GooglePlayPaymentProvider.skuDetailsLoaded(GooglePlayPaymentProvider.this.b, skuDetailsArr);
                    }
                }
            });
        }

        public ArrayList<SkuDetails> getDetailsBatch(String str, ArrayList<String> arrayList) {
            ArrayList<SkuDetails> arrayList2 = new ArrayList<>();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(Consts.GET_SKU_DETAILS_ITEM_LIST, arrayList);
            try {
                Bundle skuDetails = GooglePlayPaymentProvider.this.a.getSkuDetails(3, GooglePlayPaymentProvider.this.c.getPackageName(), str, bundle);
                Consts.ResponseCode a = GooglePlayPaymentProvider.this.a(skuDetails);
                if (a != Consts.ResponseCode.RESULT_OK || !skuDetails.containsKey(Consts.RESPONSE_GET_SKU_DETAILS_LIST)) {
                    throw new RuntimeException("Failed to load catalog: " + a);
                }
                Iterator<String> it = skuDetails.getStringArrayList(Consts.RESPONSE_GET_SKU_DETAILS_LIST).iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    try {
                        arrayList2.add(new SkuDetails(next));
                    } catch (JSONException e) {
                        throw new RuntimeException("Failed to parse SKUs: '" + next + "': " + e);
                    }
                }
                return arrayList2;
            } catch (RemoteException e2) {
                throw new RuntimeException("Remote exception: " + e2);
            } catch (NullPointerException e3) {
                throw new RuntimeException("Service not bound");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z) {
        try {
            Bundle purchases = this.a.getPurchases(3, this.c.getPackageName(), str, null);
            Consts.ResponseCode a = a(purchases);
            if (a != Consts.ResponseCode.RESULT_OK) {
                throw new RuntimeException("Failed to restore, response code: " + a);
            }
            ArrayList<String> stringArrayList = purchases.getStringArrayList(Consts.RESPONSE_INAPP_ITEM_LIST);
            ArrayList<String> stringArrayList2 = purchases.getStringArrayList(Consts.RESPONSE_INAPP_PURCHASE_DATA_LIST);
            ArrayList<String> stringArrayList3 = purchases.getStringArrayList(Consts.RESPONSE_INAPP_SIGNATURE_LIST);
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < stringArrayList.size()) {
                    String str2 = stringArrayList.get(i2);
                    String str3 = stringArrayList2.get(i2);
                    String str4 = stringArrayList3.get(i2);
                    if (z) {
                        a(str2, Payment.PurchaseStatus.RESTORED, str3, str4);
                    } else if (a(str3)) {
                        this.h = str2;
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        } catch (RemoteException e) {
            throw new RuntimeException("Remote exception: " + e);
        } catch (NullPointerException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class GetPurchasesRequest implements Runnable {
        private GetPurchasesRequest() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GooglePlayPaymentProvider.log("restorePurchases()");
            try {
                GooglePlayPaymentProvider.this.a(Consts.ITEM_TYPE_INAPP, true);
                GooglePlayPaymentProvider.this.a(Consts.ITEM_TYPE_SUBSCRIPTION, true);
                a(true);
            } catch (RuntimeException e) {
                GooglePlayPaymentProvider.logError("Restore failed: " + e);
                a(false);
            }
        }

        private void a(final boolean z) {
            Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.payment.google.GooglePlayPaymentProvider.GetPurchasesRequest.1
                @Override // java.lang.Runnable
                public void run() {
                    if (GooglePlayPaymentProvider.this.b != 0) {
                        if (z) {
                            GooglePlayPaymentProvider.restoreDone(GooglePlayPaymentProvider.this.b);
                        } else {
                            GooglePlayPaymentProvider.restoreFailed(GooglePlayPaymentProvider.this.b);
                        }
                    }
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    private class ConsumePurchaseRequest implements Runnable {
        private String b;

        public ConsumePurchaseRequest(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GooglePlayPaymentProvider.log("consuming " + this.b);
            try {
                JSONObject jSONObject = new JSONObject(this.b);
                String optString = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
                GooglePlayPaymentProvider.log("consumed '" + jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID) + "' (" + optString + ") with status: " + Consts.ResponseCode.valueOf(GooglePlayPaymentProvider.this.a.consumePurchase(3, GooglePlayPaymentProvider.this.c.getPackageName(), optString)));
            } catch (RemoteException e) {
                GooglePlayPaymentProvider.logError("failed to consume purchase: " + e);
            } catch (NullPointerException e2) {
                GooglePlayPaymentProvider.logError("failed to consume purchase: service not bound");
            } catch (JSONException e3) {
                GooglePlayPaymentProvider.logError("failed to parse purchase data: " + e3);
            }
        }
    }

    public GooglePlayPaymentProvider(long j) {
        this.b = j;
        Globals.registerActivityListener(this);
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASE_UPDATED");
        this.g = new BroadcastReceiver() { // from class: com.rovio.rcs.payment.google.GooglePlayPaymentProvider.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                GooglePlayPaymentProvider.log("PURCHASE_UPDATED broadcast message received");
                GooglePlayPaymentProvider.this.restorePurchases();
            }
        };
        this.c.registerReceiver(this.g, intentFilter);
        new Thread(new Runnable() { // from class: com.rovio.rcs.payment.google.GooglePlayPaymentProvider.2
            @Override // java.lang.Runnable
            public void run() {
                if (!GooglePlayPaymentProvider.this.a()) {
                    GooglePlayPaymentProvider.logError("failed to bind to InAppBillingService");
                    GooglePlayPaymentProvider.this.a(false);
                }
            }
        }).start();
    }

    public void loadCatalog(ArrayList<Product> arrayList) {
        a(new GetSkuDetailsRequest(arrayList));
    }

    public void startPurchase(boolean z, String str, String str2, String str3) {
        a(new PurchaseRequest(z, str, str2, str3));
    }

    public void restorePurchases() {
        a(new GetPurchasesRequest());
    }

    public void unregisterBroadcastReceiver() {
        log("unregisterBroadcastReceiver()");
        this.b = 0L;
        if (this.g != null) {
            this.c.unregisterReceiver(this.g);
            this.g = null;
        }
    }

    public void consumePurchase(String str) {
        a(new ConsumePurchaseRequest(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        log("bindToService()");
        Intent intent = new Intent(Consts.IN_APP_BILLING_SERVICE_ACTION);
        intent.setPackage("com.android.vending");
        return this.c.bindService(intent, this, 1);
    }

    private void a(Runnable runnable) {
        if (this.a != null) {
            log("runRequest(): running immediately");
            new Thread(runnable).start();
            return;
        }
        synchronized (this.f) {
            log("runRequesst(): adding request to queue");
            this.f.add(runnable);
        }
        a();
    }

    private void b() {
        synchronized (this.f) {
            Iterator<Runnable> it = this.f.iterator();
            while (it.hasNext()) {
                log("runPendingRequests(): running request");
                new Thread(it.next()).start();
            }
            this.f.clear();
        }
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onResume() {
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onPause() {
        if (this.a != null) {
            log("onPause(): unbind");
            this.c.unbindService(this);
            this.a = null;
        }
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onDestroy() {
        if (this.a != null) {
            log("onDestroy(): unbind");
            this.c.unbindService(this);
        }
        unregisterBroadcastReceiver();
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onNewIntent(Intent intent) {
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onActivityResult(int i, int i2, Intent intent) {
        log("onActivityResult(" + i + "," + i2 + "," + intent + ")");
        String remove = this.e.remove(Integer.valueOf(i));
        if (remove == null) {
            logError("no such pending request: '" + i + "'");
        } else if (intent == null) {
            a(remove, Payment.PurchaseStatus.FAILED);
        } else {
            Consts.ResponseCode a = a(intent.getExtras());
            log("response code " + a);
            if (i2 == -1) {
                String stringExtra = intent.getStringExtra(Consts.RESPONSE_INAPP_PURCHASE_DATA);
                String stringExtra2 = intent.getStringExtra(Consts.RESPONSE_INAPP_SIGNATURE);
                if (stringExtra == null || stringExtra2 == null) {
                    a(remove, Payment.PurchaseStatus.FAILED);
                    return;
                } else {
                    a(remove, Payment.PurchaseStatus.SUCCESS, stringExtra, stringExtra2);
                    return;
                }
            }
            a(remove, a(a));
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.a = null;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        log("onServiceConnected()");
        this.a = IInAppBillingService.Stub.asInterface(iBinder);
        if (!this.d) {
            this.d = true;
            try {
                int isBillingSupported = this.a.isBillingSupported(6, this.c.getPackageName(), Consts.ITEM_TYPE_INAPP);
                boolean z = Consts.ResponseCode.valueOf(isBillingSupported) == Consts.ResponseCode.RESULT_OK;
                if (!z) {
                    logError("IABv6 not supported, response: " + isBillingSupported);
                }
                a(z);
            } catch (RemoteException e) {
                logError("RemoteException while setting up IAP v6: " + e);
                a(false);
            } catch (NullPointerException e2) {
                logError("error: service not bound");
                a(false);
            }
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Consts.ResponseCode a(Bundle bundle) {
        Number number = (Number) bundle.get(Consts.RESPONSE_CODE);
        return number == null ? Consts.ResponseCode.RESULT_OK : Consts.ResponseCode.valueOf(number.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Payment.PurchaseStatus a(Consts.ResponseCode responseCode) {
        switch (responseCode) {
            case RESULT_OK:
                return Payment.PurchaseStatus.SUCCESS;
            case RESULT_USER_CANCELED:
                return Payment.PurchaseStatus.CANCELED;
            default:
                return Payment.PurchaseStatus.FAILED;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void log(String str) {
        Log.d(TAG, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logError(String str) {
        Log.e(TAG, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Payment.PurchaseStatus purchaseStatus) {
        a(str, purchaseStatus, null, null);
    }

    private boolean a(String str) {
        if (str == null) {
            return false;
        }
        try {
            return new JSONObject(str).has("autoRenewing");
        } catch (Exception e) {
            return false;
        }
    }

    private void a(final String str, final Payment.PurchaseStatus purchaseStatus, final String str2, final String str3) {
        final String str4 = null;
        if (purchaseStatus == Payment.PurchaseStatus.SUCCESS && a(str2) && !TextUtils.isEmpty(this.h) && !this.h.equals(str)) {
            str4 = this.h;
        }
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.payment.google.GooglePlayPaymentProvider.3
            @Override // java.lang.Runnable
            public void run() {
                if (GooglePlayPaymentProvider.this.b != 0) {
                    GooglePlayPaymentProvider.paymentFinished(GooglePlayPaymentProvider.this.b, str, purchaseStatus.intValue(), str2, str3, str4);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final boolean z) {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.payment.google.GooglePlayPaymentProvider.4
            @Override // java.lang.Runnable
            public void run() {
                if (GooglePlayPaymentProvider.this.b != 0) {
                    GooglePlayPaymentProvider.initFinished(GooglePlayPaymentProvider.this.b, z);
                }
            }
        });
    }
}
