package com.google.android.gms.ads.nonagon.signalgeneration;

import android.webkit.WebView;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
final class zzai extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ TaggingLibraryJsInterface zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzai(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.zzb = taggingLibraryJsInterface;
        this.zza = str;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        WebView webView;
        String valueOf = String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zzi(valueOf.length() != 0 ? "Failed to generate query info for the tagging library, error: ".concat(valueOf) : new String("Failed to generate query info for the tagging library, error: "));
        String format = String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", this.zza, str);
        webView = this.zzb.zzb;
        webView.evaluateJavascript(format, null);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        String format;
        WebView webView;
        String query = queryInfo.getQuery();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.zza);
            jSONObject.put("signal", query);
            format = String.format("window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            format = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", this.zza, queryInfo.getQuery());
        }
        webView = this.zzb.zzb;
        webView.evaluateJavascript(format, null);
    }
}
