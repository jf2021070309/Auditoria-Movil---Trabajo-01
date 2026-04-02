package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.internal.ads.zzaas;
import com.google.android.gms.internal.ads.zzbjl;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzaas zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TaggingLibraryJsInterface(WebView webView, zzaas zzaasVar) {
        this.zzb = webView;
        this.zza = webView.getContext();
        this.zzc = zzaasVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        zzbjl.zza(this.zza);
        try {
            return this.zzc.zzb().zzm(this.zza, str, this.zzb);
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Exception getting click signals. ", e);
            com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
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
    public String getViewSignals() {
        zzbjl.zza(this.zza);
        try {
            return this.zzc.zzb().zzo(this.zza, this.zzb, null);
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Exception getting view signals. ", e);
            com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        int i;
        int i2;
        zzbjl.zza(this.zza);
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i3 = jSONObject.getInt("x");
            int i4 = jSONObject.getInt("y");
            int i5 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i6 = jSONObject.getInt("type");
            if (i6 != 0) {
                if (i6 == 1) {
                    i2 = 1;
                } else if (i6 == 2) {
                    i2 = 2;
                } else if (i6 != 3) {
                    i = -1;
                } else {
                    i2 = 3;
                }
                this.zzc.zzd(MotionEvent.obtain(0L, i5, i2, i3, i4, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            }
            i = 0;
            i2 = i;
            this.zzc.zzd(MotionEvent.obtain(0L, i5, i2, i3, i4, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException | JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
