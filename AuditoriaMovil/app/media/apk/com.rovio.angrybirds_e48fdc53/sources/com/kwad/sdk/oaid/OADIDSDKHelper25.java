package com.kwad.sdk.oaid;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.bun.miitmdid.core.MdidSdkHelper;
import com.bun.miitmdid.interfaces.IIdentifierListener;
import com.bun.miitmdid.interfaces.IdSupplier;
/* loaded from: classes3.dex */
public class OADIDSDKHelper25 {
    private static final String SUB_TAG = "OADIDSDKHelper25:";
    private static final String TAG = "KSAdSDK";
    private static boolean mIsRequestIng;
    private static boolean sGetOaidFail = false;

    /* loaded from: classes3.dex */
    static class IIdentifierListener25 implements IIdentifierListener {
        private final a mOaidListener;
        private final long mStartTime;

        public IIdentifierListener25(long j, a aVar) {
            this.mStartTime = j;
            this.mOaidListener = aVar;
        }

        public void OnSupport(boolean z, IdSupplier idSupplier) {
            long currentTimeMillis = System.currentTimeMillis() - this.mStartTime;
            if (idSupplier != null) {
                String oaid = idSupplier.getOAID();
                if (TextUtils.isEmpty(oaid)) {
                    boolean unused = OADIDSDKHelper25.sGetOaidFail = true;
                } else {
                    Log.d(OADIDSDKHelper25.TAG, "OADIDSDKHelper25:oaid time=" + currentTimeMillis + "--OAID:" + oaid);
                    this.mOaidListener.dr(oaid);
                }
            }
            boolean unused2 = OADIDSDKHelper25.mIsRequestIng = false;
        }
    }

    /* loaded from: classes3.dex */
    public interface a {
        void dr(String str);
    }

    public static void getOAId(Context context, a aVar) {
        if (context == null || sGetOaidFail) {
            return;
        }
        if (!isSupport()) {
            sGetOaidFail = true;
        } else if (mIsRequestIng) {
        } else {
            mIsRequestIng = true;
            try {
                long currentTimeMillis = System.currentTimeMillis();
                int InitSdk = MdidSdkHelper.InitSdk(context.getApplicationContext(), true, new IIdentifierListener25(currentTimeMillis, aVar));
                Log.d(TAG, "OADIDSDKHelper25:sdk init time=" + (System.currentTimeMillis() - currentTimeMillis) + "--result=" + InitSdk);
            } catch (Throwable th) {
                Log.d(TAG, "OADIDSDKHelper25:oaid sdk not find ");
                mIsRequestIng = false;
                sGetOaidFail = true;
            }
        }
    }

    public static boolean isSupport() {
        String str;
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        try {
            new IIdentifierListener() { // from class: com.kwad.sdk.oaid.OADIDSDKHelper25.1
                public final void OnSupport(boolean z, IdSupplier idSupplier) {
                }
            }.OnSupport(true, (IdSupplier) null);
            try {
                Class.forName("com.bun.miitmdid.core.MdidSdkHelper", false, OADIDSDKHelper25.class.getClassLoader());
                return true;
            } catch (Throwable th) {
                str = "OADIDSDKHelper25:com.bun.miitmdid.core.MdidSdkHelper oaid sdk not find ";
                Log.d(TAG, str);
                return false;
            }
        } catch (Throwable th2) {
            str = "OADIDSDKHelper25:isSupport oaid sdk not find ";
        }
    }
}
