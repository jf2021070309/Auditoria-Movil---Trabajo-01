package com.facebook.internal;

import android.content.Intent;
import android.util.Log;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class CallbackManagerImpl implements CallbackManager {
    private static final String INAPP_PURCHASE_DATA = "INAPP_PURCHASE_DATA";
    private static final String TAG = CallbackManagerImpl.class.getSimpleName();
    private static Map<Integer, Callback> staticCallbacks = new HashMap();
    private Map<Integer, Callback> callbacks = new HashMap();

    /* loaded from: classes2.dex */
    public interface Callback {
        boolean onActivityResult(int i, Intent intent);
    }

    public static synchronized void registerStaticCallback(int i, Callback callback) {
        synchronized (CallbackManagerImpl.class) {
            Validate.notNull(callback, "callback");
            if (!staticCallbacks.containsKey(Integer.valueOf(i))) {
                staticCallbacks.put(Integer.valueOf(i), callback);
            }
        }
    }

    private static synchronized Callback getStaticCallback(Integer num) {
        Callback callback;
        synchronized (CallbackManagerImpl.class) {
            callback = staticCallbacks.get(num);
        }
        return callback;
    }

    private static boolean runStaticCallback(int i, int i2, Intent intent) {
        Callback staticCallback = getStaticCallback(Integer.valueOf(i));
        if (staticCallback != null) {
            return staticCallback.onActivityResult(i2, intent);
        }
        return false;
    }

    public void registerCallback(int i, Callback callback) {
        Validate.notNull(callback, "callback");
        this.callbacks.put(Integer.valueOf(i), callback);
    }

    public void unregisterCallback(int i) {
        this.callbacks.remove(Integer.valueOf(i));
    }

    @Override // com.facebook.CallbackManager
    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (isPurchaseIntent(intent)) {
            i = RequestCodeOffset.InAppPurchase.toRequestCode();
        }
        Callback callback = this.callbacks.get(Integer.valueOf(i));
        return callback != null ? callback.onActivityResult(i2, intent) : runStaticCallback(i, i2, intent);
    }

    /* loaded from: classes2.dex */
    public enum RequestCodeOffset {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        InAppPurchase(9);
        
        private final int offset;

        RequestCodeOffset(int i) {
            this.offset = i;
        }

        public int toRequestCode() {
            return FacebookSdk.getCallbackRequestCodeOffset() + this.offset;
        }
    }

    private static boolean isPurchaseIntent(Intent intent) {
        String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA")) == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(stringExtra);
            if (jSONObject.has("orderId") && jSONObject.has(DBDefinition.PACKAGE_NAME) && jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID) && jSONObject.has("purchaseTime") && jSONObject.has("purchaseState") && jSONObject.has("developerPayload")) {
                return jSONObject.has("purchaseToken");
            }
            return false;
        } catch (JSONException e) {
            Log.e(TAG, "Error parsing intent data.", e);
            return false;
        }
    }
}
