package com.unity3d.services.store;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.store.core.StoreException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class StoreBilling {
    public static Object asInterface(Context context, IBinder iBinder) {
        Object[] objArr = new Object[1];
        try {
            try {
                try {
                    return Class.forName("com.android.vending.billing.IInAppBillingService$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder);
                } catch (IllegalAccessException e) {
                    DeviceLog.exception("Illegal access exception while invoking asInterface", e);
                    return null;
                } catch (InvocationTargetException e2) {
                    DeviceLog.exception("Invocation target exception while invoking asInterface", e2);
                    return null;
                }
            } catch (NoSuchMethodException e3) {
                DeviceLog.exception("asInterface method not found", e3);
                return null;
            }
        } catch (ClassNotFoundException e4) {
            DeviceLog.exception("Billing service stub not found", e4);
            return null;
        }
    }

    public static int isBillingSupported(Context context, Object obj, String str) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, StoreException {
        Object invoke = Class.forName("com.android.vending.billing.IInAppBillingService").getMethod("isBillingSupported", Integer.TYPE, String.class, String.class).invoke(obj, 3, ClientProperties.getAppName(), str);
        if (invoke != null) {
            return ((Integer) invoke).intValue();
        }
        throw new StoreException();
    }

    public static JSONObject getPurchases(Context context, Object obj, String str) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, JSONException, StoreException {
        Method method = Class.forName("com.android.vending.billing.IInAppBillingService").getMethod("getPurchases", Integer.TYPE, String.class, String.class, String.class);
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        String str2 = null;
        do {
            Object invoke = method.invoke(obj, 3, ClientProperties.getAppName(), str, str2);
            if (invoke instanceof Bundle) {
                Bundle bundle = (Bundle) invoke;
                int i = bundle.getInt("RESPONSE_CODE");
                DeviceLog.debug("getPurchases responds with code " + i);
                if (i == 0) {
                    Iterator<String> it = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST").iterator();
                    while (it.hasNext()) {
                        jSONArray.put(new JSONObject(it.next()));
                    }
                    Iterator<String> it2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST").iterator();
                    while (it2.hasNext()) {
                        jSONArray2.put(it2.next());
                    }
                    Iterator<String> it3 = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST").iterator();
                    while (it3.hasNext()) {
                        jSONArray3.put(it3.next());
                    }
                    str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                } else {
                    throw new StoreException(i);
                }
            } else {
                throw new StoreException();
            }
        } while (str2 != null);
        jSONObject.put("purchaseDataList", jSONArray);
        jSONObject.put("signatureList", jSONArray2);
        jSONObject.put("purchaseItemList", jSONArray3);
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d9, code lost:
        r3.put("purchaseDataList", r4);
        r3.put("signatureList", r10);
        r3.put("purchaseItemList", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e8, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject getPurchaseHistory(android.content.Context r17, java.lang.Object r18, java.lang.String r19, int r20) throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException, org.json.JSONException, com.unity3d.services.store.core.StoreException {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.StoreBilling.getPurchaseHistory(android.content.Context, java.lang.Object, java.lang.String, int):org.json.JSONObject");
    }

    public static JSONArray getSkuDetails(Context context, Object obj, String str, ArrayList<String> arrayList) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, StoreException, JSONException {
        Method method = Class.forName("com.android.vending.billing.IInAppBillingService").getMethod("getSkuDetails", Integer.TYPE, String.class, String.class, Bundle.class);
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
        Object invoke = method.invoke(obj, 3, ClientProperties.getAppName(), str, bundle);
        JSONArray jSONArray = new JSONArray();
        if (invoke instanceof Bundle) {
            Bundle bundle2 = (Bundle) invoke;
            int i = bundle2.getInt("RESPONSE_CODE");
            if (i == 0) {
                Iterator<String> it = bundle2.getStringArrayList("DETAILS_LIST").iterator();
                while (it.hasNext()) {
                    jSONArray.put(new JSONObject(it.next()));
                }
                return jSONArray;
            }
            throw new StoreException(i);
        }
        throw new StoreException();
    }
}
