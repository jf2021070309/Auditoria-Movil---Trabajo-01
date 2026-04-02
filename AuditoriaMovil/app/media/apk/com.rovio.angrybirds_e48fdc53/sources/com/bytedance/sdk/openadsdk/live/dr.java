package com.bytedance.sdk.openadsdk.live;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.base.api.ILiveHostContextParam;
import com.bytedance.android.live.base.api.ILiveInitCallback;
import com.bytedance.android.live.base.api.IOuterLiveService;
import com.bytedance.android.openliveplugin.LivePluginHelper;
import com.bytedance.pangle.Zeus;
import com.bytedance.sdk.openadsdk.TTAppContextHolder;
import com.bytedance.sdk.openadsdk.TTPluginListener;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.bytedance.sdk.openadsdk.api.plugin.bn;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class dr {
    private static SharedPreferences dr;

    public static Bundle dr(bn bnVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("app_id", str);
        String dr2 = bn.dr("com.byted.live.lite");
        if (TextUtils.isEmpty(dr2)) {
            dr2 = "0.0.0.0";
        }
        bundle.putString(PluginConstants.KEY_PLUGIN_VERSION, dr2);
        bundle.putString("sdk_version", dr(TTAppContextHolder.getContext()));
        return bundle;
    }

    public static void dr(bn bnVar, final Bundle bundle, final TTPluginListener tTPluginListener) {
        bnVar.ge(new TTPluginListener() { // from class: com.bytedance.sdk.openadsdk.live.dr.1
            @Override // com.bytedance.sdk.openadsdk.TTPluginListener
            public void onPluginListener(int i, ClassLoader classLoader, Resources resources, Bundle bundle2) {
                TTPluginListener tTPluginListener2 = TTPluginListener.this;
                if (tTPluginListener2 != null) {
                    tTPluginListener2.onPluginListener(i, classLoader, resources, bundle2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.TTPluginListener
            public String packageName() {
                return "com.byted.live.lite";
            }

            @Override // com.bytedance.sdk.openadsdk.TTPluginListener
            public Bundle config() {
                return bundle;
            }
        });
    }

    public static String dr(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null) {
                return null;
            }
            String string = applicationInfo.metaData.getString(TTLiveConstants.LIVE_META_KEY);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return bn.dr(new JSONObject(string).optInt(TTLiveConstants.LIVE_API_VERSION_KEY));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static boolean dr(final Context context, final String str, final ILiveHostContextParam.Builder builder, final ILiveInitCallback iLiveInitCallback) {
        try {
            com.bytedance.sdk.openadsdk.ge.dr.dr().dr(new Runnable() { // from class: com.bytedance.sdk.openadsdk.live.dr.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        LivePluginHelper.initLive((Application) context, str, builder, iLiveInitCallback);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean dr() {
        try {
            com.bytedance.sdk.openadsdk.ge.dr.dr().dr(new Runnable() { // from class: com.bytedance.sdk.openadsdk.live.dr.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        LivePluginHelper.initLiveCommerce();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean dr(Context context, Bundle bundle) {
        if (context == null || bundle == null || !bundle.containsKey(TTLiveConstants.ROOMID_KEY)) {
            return false;
        }
        long j = bundle.getLong(TTLiveConstants.ROOMID_KEY);
        try {
            IOuterLiveService iOuterLiveService = (IOuterLiveService) LivePluginHelper.getLiveRoomService();
            if (iOuterLiveService == null) {
                return false;
            }
            iOuterLiveService.enterLiveRoom(context, j, bundle);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean dr(Context context, Uri uri) {
        if (context == null || uri == null) {
            return false;
        }
        try {
            IOuterLiveService iOuterLiveService = (IOuterLiveService) LivePluginHelper.getLiveRoomService();
            if (iOuterLiveService == null) {
                return false;
            }
            return iOuterLiveService.handleSchema(context, uri);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static void dr(long j) {
        if (dr == null) {
            dr = TTAppContextHolder.getContext().getSharedPreferences("csj_live", 0);
        }
        try {
            SharedPreferences sharedPreferences = dr;
            if (sharedPreferences != null) {
                int i = sharedPreferences.getInt("live_init_" + j, 0);
                SharedPreferences.Editor edit = dr.edit();
                edit.putInt("live_init_" + j, i + 1);
                edit.commit();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void ge(long j) {
        if (dr == null) {
            dr = TTAppContextHolder.getContext().getSharedPreferences("csj_live", 0);
        }
        try {
            SharedPreferences sharedPreferences = dr;
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("live_init_" + j, 0);
                edit.commit();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean o(long j) {
        int i;
        if (dr == null) {
            dr = TTAppContextHolder.getContext().getSharedPreferences("csj_live", 0);
        }
        SharedPreferences sharedPreferences = dr;
        if (sharedPreferences != null) {
            i = sharedPreferences.getInt("live_init_" + j, 0);
        } else {
            i = 0;
        }
        return i < 5;
    }

    public static void g(long j) {
        try {
            Zeus.unInstallPlugin("com.byted.live.lite");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        ge(j);
    }
}
