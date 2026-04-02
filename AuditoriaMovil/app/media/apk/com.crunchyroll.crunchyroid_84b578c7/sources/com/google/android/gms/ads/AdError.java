package com.google.android.gms.ads;

import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public class AdError {
    public static final String UNDEFINED_DOMAIN = "undefined";
    private final int zza;
    private final String zzb;
    private final String zzc;
    private final AdError zzd;

    public AdError(int i, String str, String str2, AdError adError) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = adError;
    }

    public AdError getCause() {
        return this.zzd;
    }

    public int getCode() {
        return this.zza;
    }

    public String getDomain() {
        return this.zzc;
    }

    public String getMessage() {
        return this.zzb;
    }

    public String toString() {
        try {
            return zzb().toString(2);
        } catch (b unused) {
            return "Error forming toString output.";
        }
    }

    public final com.google.android.gms.ads.internal.client.zze zza() {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        if (this.zzd == null) {
            zzeVar = null;
        } else {
            AdError adError = this.zzd;
            zzeVar = new com.google.android.gms.ads.internal.client.zze(adError.zza, adError.zzb, adError.zzc, null, null);
        }
        return new com.google.android.gms.ads.internal.client.zze(this.zza, this.zzb, this.zzc, zzeVar, null);
    }

    public c zzb() throws b {
        c cVar = new c();
        cVar.put("Code", this.zza);
        cVar.put("Message", this.zzb);
        cVar.put("Domain", this.zzc);
        AdError adError = this.zzd;
        if (adError == null) {
            cVar.put("Cause", "null");
        } else {
            cVar.put("Cause", adError.zzb());
        }
        return cVar;
    }

    public AdError(int i, String str, String str2) {
        this(i, str, str2, null);
    }
}
