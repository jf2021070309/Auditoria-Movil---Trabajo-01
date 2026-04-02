package com.google.android.gms.ads;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.zzbcz;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AdError {
    @RecentlyNonNull
    public static final String UNDEFINED_DOMAIN = "undefined";
    private final int zza;
    private final String zzb;
    private final String zzc;
    private final AdError zzd;

    public AdError(int i2, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        this(i2, str, str2, null);
    }

    public AdError(int i2, @RecentlyNonNull String str, @RecentlyNonNull String str2, AdError adError) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = adError;
    }

    @RecentlyNullable
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

    @RecentlyNonNull
    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final zzbcz zza() {
        AdError adError = this.zzd;
        return new zzbcz(this.zza, this.zzb, this.zzc, adError == null ? null : new zzbcz(adError.zza, adError.zzb, adError.zzc, null, null), null);
    }

    @RecentlyNonNull
    public JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.zza);
        jSONObject.put("Message", this.zzb);
        jSONObject.put("Domain", this.zzc);
        AdError adError = this.zzd;
        if (adError == null) {
            jSONObject.put("Cause", "null");
        } else {
            jSONObject.put("Cause", adError.zzb());
        }
        return jSONObject;
    }
}
