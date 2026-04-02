package com.flurry.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.flurry.sdk.a;
import com.rovio.rcs.payment.google.Consts;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class ji {
    private static final String a = ji.class.getSimpleName();
    private static Object b = new Object();
    private static List<b> c = new ArrayList();
    private static com.flurry.sdk.a d;
    private static ServiceConnection e;

    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract void a(int i, c cVar);
    }

    static /* synthetic */ ServiceConnection d() {
        e = null;
        return null;
    }

    public static void a(final Context context, final String str, final a aVar) {
        b bVar = new b() { // from class: com.flurry.sdk.ji.1
            @Override // com.flurry.sdk.ji.b
            public final void a(int i, com.flurry.sdk.a aVar2) {
                if (i == 0) {
                    c b2 = ji.b(aVar2, context, Consts.ITEM_TYPE_INAPP, str);
                    if (b2 == null) {
                        b2 = ji.b(aVar2, context, Consts.ITEM_TYPE_SUBSCRIPTION, str);
                    }
                    aVar.a(i, b2);
                    return;
                }
                aVar.a(i, null);
            }
        };
        Boolean bool = false;
        synchronized (b) {
            if (e == null) {
                e = new ServiceConnection() { // from class: com.flurry.sdk.ji.2
                    @Override // android.content.ServiceConnection
                    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        synchronized (ji.b) {
                            com.flurry.sdk.a unused = ji.d = a.AbstractBinderC0127a.a(iBinder);
                            for (b bVar2 : ji.c) {
                                bVar2.b(0, ji.d);
                            }
                            ji.c.clear();
                        }
                    }

                    @Override // android.content.ServiceConnection
                    public final void onServiceDisconnected(ComponentName componentName) {
                        synchronized (ji.b) {
                            ji.d();
                            com.flurry.sdk.a unused = ji.d = null;
                            for (b bVar2 : ji.c) {
                                bVar2.b(1, null);
                            }
                            ji.c.clear();
                        }
                    }
                };
                bool = true;
            }
            if (d == null) {
                c.add(bVar);
            } else {
                bVar.b(0, d);
            }
            if (bool.booleanValue()) {
                Intent intent = new Intent(Consts.IN_APP_BILLING_SERVICE_ACTION);
                intent.setPackage("com.android.vending");
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    context.bindService(intent, e, 1);
                } else {
                    bVar.b(1, null);
                    e = null;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c b(com.flurry.sdk.a aVar, Context context, String str, String str2) {
        Bundle bundle = new Bundle();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str2);
        bundle.putStringArrayList(Consts.GET_SKU_DETAILS_ITEM_LIST, arrayList);
        try {
            Bundle a2 = aVar.a(3, context.getPackageName(), str, bundle);
            if (a2.containsKey(Consts.RESPONSE_GET_SKU_DETAILS_LIST)) {
                ArrayList<String> stringArrayList = a2.getStringArrayList(Consts.RESPONSE_GET_SKU_DETAILS_LIST);
                if (stringArrayList.size() > 0) {
                    return new c(str, stringArrayList.get(0));
                }
            }
            return null;
        } catch (RemoteException e2) {
            ko.a(a, "RemoteException getting SKU Details", e2);
            return null;
        } catch (JSONException e3) {
            ko.a(a, "JSONException parsing SKU Details", e3);
            return null;
        }
    }

    /* loaded from: classes2.dex */
    static abstract class b {
        public abstract void a(int i, com.flurry.sdk.a aVar);

        b() {
        }

        public final void b(final int i, final com.flurry.sdk.a aVar) {
            new Thread(new Runnable() { // from class: com.flurry.sdk.ji.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.a(i, aVar);
                }
            }).start();
        }
    }

    /* loaded from: classes2.dex */
    public static class c {
        public final String a;
        public final long b;
        public final String c;
        public final String d;
        private final String e;
        private final String f;
        private final String g;
        private final String h;
        private final String i;

        public c(String str, String str2) {
            this.e = str;
            this.i = str2;
            JSONObject jSONObject = new JSONObject(this.i);
            this.f = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            this.a = jSONObject.optString("type");
            this.g = jSONObject.optString(InAppPurchaseMetaData.KEY_PRICE);
            this.b = jSONObject.optLong("price_amount_micros");
            this.c = jSONObject.optString("price_currency_code");
            this.d = jSONObject.optString("title");
            this.h = jSONObject.optString("description");
        }

        public final String toString() {
            return "SkuDetails:" + this.i;
        }
    }
}
