package com.rovio.rcs.ads;

import android.content.Intent;
import android.util.Log;
import com.rovio.fusion.Globals;
import com.rovio.fusion.IActivityListener;
import com.rovio.rcs.ads.AdsSdkBase;
import com.rovio.rcs.ads.AdsSdkConstants;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class AdsSdk implements IActivityListener, AdsSdkBase.Listener {
    private static final String TAG = "AdsSdk";
    private static final boolean VERBOSE_LOGGING = false;
    private long a;
    private AdsSdkBase b = null;
    private AdType c;

    /* loaded from: classes4.dex */
    public enum AdType {
        INTERSTITIAL,
        BANNER,
        REWARDVIDEO
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void onAdError(long j, int i, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onAdHidden(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onAdReady(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onAdShown(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onAdSizeChanged(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onClick(long j);

    public AdsSdk(long j, int i) {
        this.a = 0L;
        this.c = null;
        this.a = j;
        switch (i) {
            case 0:
                this.c = AdType.INTERSTITIAL;
                break;
            case 1:
                this.c = AdType.BANNER;
                break;
            case 2:
                this.c = AdType.REWARDVIDEO;
                break;
            default:
                Log.e(TAG, "Failed to map ad type to enum");
                this.c = null;
                break;
        }
        Globals.registerActivityListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        try {
            this.b = (AdsSdkBase) Class.forName("com.rovio.rcs.ads." + str + "Sdk").getMethod("createSdk", AdType.class).invoke(null, this.c);
        } catch (Exception e) {
            Log.e(TAG, "Failed to handle SDK " + str + " : " + e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> b(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            Log.e(TAG, "Failed to parse config" + str);
        }
        return hashMap;
    }

    public void load(final String str, final String str2) {
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.ads.AdsSdk.1
            @Override // java.lang.Runnable
            public void run() {
                if (AdsSdk.this.b != null) {
                    AdsSdk.this.b.a((AdsSdkBase.Listener) null);
                    AdsSdk.this.b.d();
                    AdsSdk.this.b = null;
                }
                AdsSdk.this.a(str);
                if (AdsSdk.this.b != null) {
                    AdsSdk.this.b.a(AdsSdk.this);
                    AdsSdk.this.b.a(AdsSdk.this.b(str2));
                    return;
                }
                AdsSdk.this.onAdError(AdsSdkConstants.ERROR_NO_SUCH_SDK);
                AdsSdk.this.onAdReady(false);
            }
        });
    }

    public void poke() {
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.ads.AdsSdk.2
            @Override // java.lang.Runnable
            public void run() {
                if (AdsSdk.this.b != null) {
                    AdsSdk.this.b.a();
                }
            }
        });
    }

    public void show() {
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.ads.AdsSdk.3
            @Override // java.lang.Runnable
            public void run() {
                if (AdsSdk.this.b != null) {
                    AdsSdk.this.b.b();
                }
            }
        });
    }

    public void hide() {
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.ads.AdsSdk.4
            @Override // java.lang.Runnable
            public void run() {
                if (AdsSdk.this.b != null) {
                    AdsSdk.this.b.c();
                }
            }
        });
    }

    public void destroy() {
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.ads.AdsSdk.5
            @Override // java.lang.Runnable
            public void run() {
                if (AdsSdk.this.b != null) {
                    AdsSdk.this.b.a((AdsSdkBase.Listener) null);
                    AdsSdk.this.b.d();
                    AdsSdk.this.b = null;
                }
            }
        });
        this.a = 0L;
        Globals.unregisterActivityListener(this);
    }

    @Override // com.rovio.rcs.ads.AdsSdkBase.Listener
    public void onAdReady(final boolean z) {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.ads.AdsSdk.6
            @Override // java.lang.Runnable
            public void run() {
                if (AdsSdk.this.a != 0) {
                    AdsSdk.this.onAdReady(AdsSdk.this.a, z);
                }
            }
        });
    }

    @Override // com.rovio.rcs.ads.AdsSdkBase.Listener
    public void onAdError(final int i, final String str) {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.ads.AdsSdk.7
            @Override // java.lang.Runnable
            public void run() {
                if (AdsSdk.this.a != 0) {
                    AdsSdk.this.onAdError(AdsSdk.this.a, i, str != null ? str : "");
                }
            }
        });
    }

    @Override // com.rovio.rcs.ads.AdsSdkBase.Listener
    public void onAdError(AdsSdkConstants.Error error) {
        onAdError(error.code(), error.message());
    }

    @Override // com.rovio.rcs.ads.AdsSdkBase.Listener
    public void onAdShown() {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.ads.AdsSdk.8
            @Override // java.lang.Runnable
            public void run() {
                if (AdsSdk.this.a != 0) {
                    AdsSdk.this.onAdShown(AdsSdk.this.a);
                }
            }
        });
    }

    @Override // com.rovio.rcs.ads.AdsSdkBase.Listener
    public void onAdHidden(final boolean z) {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.ads.AdsSdk.9
            @Override // java.lang.Runnable
            public void run() {
                if (AdsSdk.this.a != 0) {
                    AdsSdk.this.onAdHidden(AdsSdk.this.a, z);
                }
            }
        });
    }

    @Override // com.rovio.rcs.ads.AdsSdkBase.Listener
    public void onClick() {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.ads.AdsSdk.10
            @Override // java.lang.Runnable
            public void run() {
                if (AdsSdk.this.a != 0) {
                    AdsSdk.this.onClick(AdsSdk.this.a);
                }
            }
        });
    }

    @Override // com.rovio.rcs.ads.AdsSdkBase.Listener
    public void onAdSizeChanged(final int i, final int i2) {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.ads.AdsSdk.11
            @Override // java.lang.Runnable
            public void run() {
                if (AdsSdk.this.a != 0) {
                    AdsSdk.this.onAdSizeChanged(AdsSdk.this.a, i, i2);
                }
            }
        });
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onResume() {
        if (this.b != null) {
            this.b.onResume();
        }
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onPause() {
        if (this.b != null) {
            this.b.onPause();
        }
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onNewIntent(Intent intent) {
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.b != null) {
            this.b.a(i, i2, intent);
        }
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onDestroy() {
        if (this.b != null) {
            this.b.e();
        }
    }
}
