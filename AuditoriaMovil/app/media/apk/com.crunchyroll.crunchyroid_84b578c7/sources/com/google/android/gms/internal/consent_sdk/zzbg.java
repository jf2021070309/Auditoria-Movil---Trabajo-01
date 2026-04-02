package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;
import com.amazon.aps.iva.ab.f;
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes3.dex */
public final class zzbg extends WebView {
    private final Handler zza;
    private final zzbm zzb;
    private boolean zzc;

    public zzbg(zzbi zzbiVar, Handler handler, zzbm zzbmVar) {
        super(zzbiVar);
        this.zzc = false;
        this.zza = handler;
        this.zzb = zzbmVar;
    }

    public static /* synthetic */ boolean zzc(zzbg zzbgVar, String str) {
        if (str != null && str.startsWith("consent://")) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean zze(zzbg zzbgVar, boolean z) {
        zzbgVar.zzc = true;
        return true;
    }

    public final void zzb(String str, String str2) {
        final String a = f.a(new StringBuilder(str.length() + 3 + String.valueOf(str2).length()), str, "(", str2, ");");
        this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbd
            @Override // java.lang.Runnable
            public final void run() {
                zzce.zza(zzbg.this, a);
            }
        });
    }
}
