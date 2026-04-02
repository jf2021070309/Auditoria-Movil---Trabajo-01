package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.internal.ads.zzaas;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzcgt;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzaas zzc;

    public TaggingLibraryJsInterface(WebView webView, zzaas zzaasVar) {
        this.zzb = webView;
        this.zza = webView.getContext();
        this.zzc = zzaasVar;
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public String getClickSignals(String str) {
        zzbjl.zza(this.zza);
        try {
            return this.zzc.zzb().zzm(this.zza, str, this.zzb);
        } catch (RuntimeException e2) {
            zzcgt.zzg("Exception getting click signals. ", e2);
            com.google.android.gms.ads.internal.zzt.zzg().zzk(e2, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzt.zzc();
        String uuid = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        Context context = this.zza;
        AdFormat adFormat = AdFormat.BANNER;
        AdRequest.Builder builder = new AdRequest.Builder();
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        QueryInfo.generate(context, adFormat, builder.build(), new zzai(this, uuid));
        return uuid;
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public String getViewSignals() {
        zzbjl.zza(this.zza);
        try {
            return this.zzc.zzb().zzo(this.zza, this.zzb, null);
        } catch (RuntimeException e2) {
            zzcgt.zzg("Exception getting view signals. ", e2);
            com.google.android.gms.ads.internal.zzt.zzg().zzk(e2, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public void reportTouchEvent(String str) {
        zzbjl.zza(this.zza);
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i2 = jSONObject.getInt("x");
            int i3 = jSONObject.getInt("y");
            int i4 = jSONObject.getInt("duration_ms");
            float f2 = (float) jSONObject.getDouble("force");
            int i5 = jSONObject.getInt("type");
            this.zzc.zzd(MotionEvent.obtain(0L, i4, i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? -1 : 3 : 2 : 1 : 0, i2, i3, f2, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException | JSONException e2) {
            zzcgt.zzg("Failed to parse the touch string. ", e2);
            com.google.android.gms.ads.internal.zzt.zzg().zzk(e2, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
