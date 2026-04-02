package com.facebook.appevents.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.internal.Utility;
import com.rovio.rcs.payment.google.Consts;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes2.dex */
public class InAppPurchaseEventManager {
    private static final String DETAILS_LIST = "DETAILS_LIST";
    private static final String GET_INTERFACE_METHOD = "iap_get_interface";
    private static final String GET_SKU_DETAILS_METHOD = "iap_get_sku_details";
    private static final String IN_APP_BILLING_SERVICE = "com.android.vending.billing.IInAppBillingService";
    private static final String IN_APP_BILLING_SERVICE_STUB = "com.android.vending.billing.IInAppBillingService$Stub";
    private static final String ITEM_ID_LIST = "ITEM_ID_LIST";
    private static final String RESPONSE_CODE = "RESPONSE_CODE";
    private static final HashMap<String, Method> methodMap = new HashMap<>();
    private static final HashMap<String, Class<?>> classMap = new HashMap<>();
    private static final String TAG = InAppPurchaseEventManager.class.getCanonicalName();

    public static Object getServiceInterface(Context context, IBinder iBinder) {
        try {
            Method method = methodMap.get(GET_INTERFACE_METHOD);
            if (method == null) {
                method = context.getClassLoader().loadClass(IN_APP_BILLING_SERVICE_STUB).getDeclaredMethod("asInterface", IBinder.class);
                methodMap.put(GET_INTERFACE_METHOD, method);
            }
            Object[] objArr = {iBinder};
            Utility.logd(TAG, "In-app billing service connected");
            return method.invoke(null, objArr);
        } catch (ClassNotFoundException e) {
            Log.e(TAG, "com.android.vending.billing.IInAppBillingService$Stub is not available, please add com.android.vending.billing.IInAppBillingService to the project.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.e(TAG, "Illegal access to method com.android.vending.billing.IInAppBillingService$Stub.asInterface", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e(TAG, "com.android.vending.billing.IInAppBillingService$Stub.asInterface method not found", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e(TAG, "Invocation target exception in com.android.vending.billing.IInAppBillingService$Stub.asInterface", e4);
            return null;
        }
    }

    public static String getPurchaseDetails(Context context, String str, Object obj, boolean z) {
        if (obj == null || str == "") {
            return "";
        }
        try {
            Method method = methodMap.get(GET_SKU_DETAILS_METHOD);
            Class<?> cls = classMap.get(IN_APP_BILLING_SERVICE);
            if (method == null || cls == null) {
                cls = context.getClassLoader().loadClass(IN_APP_BILLING_SERVICE);
                method = cls.getDeclaredMethod("getSkuDetails", Integer.TYPE, String.class, String.class, Bundle.class);
                methodMap.put(GET_SKU_DETAILS_METHOD, method);
                classMap.put(IN_APP_BILLING_SERVICE, cls);
            }
            Method method2 = method;
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(str);
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Object cast = cls.cast(obj);
            Object[] objArr = new Object[4];
            objArr[0] = 3;
            objArr[1] = context.getPackageName();
            objArr[2] = z ? Consts.ITEM_TYPE_SUBSCRIPTION : Consts.ITEM_TYPE_INAPP;
            objArr[3] = bundle;
            Bundle bundle2 = (Bundle) method2.invoke(cast, objArr);
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                return stringArrayList.size() < 1 ? "" : stringArrayList.get(0);
            }
        } catch (ClassNotFoundException e) {
            Log.e(TAG, "com.android.vending.billing.IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to the project, and import the IInAppBillingService.aidl file into this package", e);
        } catch (IllegalAccessException e2) {
            Log.e(TAG, "Illegal access to method com.android.vending.billing.IInAppBillingService.getSkuDetails", e2);
        } catch (NoSuchMethodException e3) {
            Log.e(TAG, "com.android.vending.billing.IInAppBillingService.getSkuDetails method is not available", e3);
        } catch (InvocationTargetException e4) {
            Log.e(TAG, "Invocation target exception in com.android.vending.billing.IInAppBillingService.getSkuDetails", e4);
        }
        return "";
    }
}
