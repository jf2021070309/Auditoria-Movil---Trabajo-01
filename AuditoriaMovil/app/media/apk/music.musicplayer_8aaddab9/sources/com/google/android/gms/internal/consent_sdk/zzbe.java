package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzbe extends WebView {
    private final Handler zza;
    private final zzbj zzb;
    private boolean zzc;

    public zzbe(zzbh zzbhVar, Handler handler, zzbj zzbjVar) {
        super(zzbhVar);
        this.zzc = false;
        this.zza = handler;
        this.zzb = zzbjVar;
    }

    public static /* synthetic */ boolean zza(zzbe zzbeVar, boolean z) {
        zzbeVar.zzc = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zza(String str) {
        return str != null && str.startsWith("consent://");
    }

    public final void zza(String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(jSONObject2).length() + String.valueOf(str).length() + 3);
        sb.append(str);
        sb.append("(");
        sb.append(jSONObject2);
        sb.append(");");
        final String sb2 = sb.toString();
        this.zza.post(new Runnable(this, sb2) { // from class: com.google.android.gms.internal.consent_sdk.zzbd
            private final zzbe zza;
            private final String zzb;

            {
                this.zza = this;
                this.zzb = sb2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzch.zza(this.zza, this.zzb);
            }
        });
    }
}
