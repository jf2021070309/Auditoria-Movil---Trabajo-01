package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.ads.zzbyf;
import com.google.android.gms.internal.ads.zzbzo;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public class MobileAds {
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(Context context) {
        zzej.zzf().zzl(context);
    }

    public static void enableSameAppKey(boolean z) {
        zzej.zzf().zzm(z);
    }

    public static InitializationStatus getInitializationStatus() {
        return zzej.zzf().zze();
    }

    @KeepForSdk
    private static String getInternalVersion() {
        return zzej.zzf().zzh();
    }

    public static RequestConfiguration getRequestConfiguration() {
        return zzej.zzf().zzc();
    }

    public static VersionInfo getVersion() {
        zzej.zzf();
        String[] split = TextUtils.split("22.1.0", "\\.");
        if (split.length != 3) {
            return new VersionInfo(0, 0, 0);
        }
        try {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        } catch (NumberFormatException unused) {
            return new VersionInfo(0, 0, 0);
        }
    }

    public static void initialize(Context context) {
        zzej.zzf().zzn(context, null, null);
    }

    public static void openAdInspector(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        zzej.zzf().zzq(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(Context context, String str) {
        zzej.zzf().zzr(context, str);
    }

    @KeepForSdk
    public static void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        zzej.zzf().zzs(cls);
    }

    public static void registerWebView(WebView webView) {
        zzej.zzf();
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (webView == null) {
            zzbzo.zzg("The webview to be registered cannot be null.");
            return;
        }
        zzbyf zza = zzbsh.zza(webView.getContext());
        if (zza == null) {
            zzbzo.zzj("Internal error, query info generator is null.");
            return;
        }
        try {
            zza.zzi(ObjectWrapper.wrap(webView));
        } catch (RemoteException e) {
            zzbzo.zzh("", e);
        }
    }

    public static void setAppMuted(boolean z) {
        zzej.zzf().zzt(z);
    }

    public static void setAppVolume(float f) {
        zzej.zzf().zzu(f);
    }

    @KeepForSdk
    private static void setPlugin(String str) {
        zzej.zzf().zzv(str);
    }

    public static void setRequestConfiguration(RequestConfiguration requestConfiguration) {
        zzej.zzf().zzw(requestConfiguration);
    }

    public static void initialize(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
        zzej.zzf().zzn(context, null, onInitializationCompleteListener);
    }
}
