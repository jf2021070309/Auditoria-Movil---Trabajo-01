package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzdyb;
import com.google.android.gms.internal.ads.zzdyc;
import com.google.android.gms.internal.ads.zzfsm;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzaz {
    private zzdyc zzg;
    private final Object zzb = new Object();
    @GuardedBy("lock")
    private String zzc = "";
    @GuardedBy("lock")
    private String zzd = "";
    @GuardedBy("lock")
    private boolean zze = false;
    @GuardedBy("lock")
    private boolean zzf = false;
    @VisibleForTesting
    public String zza = "";

    @VisibleForTesting
    public static final String zzo(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzc().zzi(context, str2));
        zzfsm<String> zzb = new zzbr(context).zzb(0, str, hashMap, null);
        try {
            return zzb.get(((Integer) zzbet.zzc().zzc(zzbjl.zzdh)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            String valueOf = String.valueOf(str);
            zzcgt.zzg(valueOf.length() != 0 ? "Interrupted while retrieving a response from: ".concat(valueOf) : new String("Interrupted while retrieving a response from: "), e2);
            zzb.cancel(true);
            return null;
        } catch (TimeoutException e3) {
            String valueOf2 = String.valueOf(str);
            zzcgt.zzg(valueOf2.length() != 0 ? "Timeout while retrieving a response from: ".concat(valueOf2) : new String("Timeout while retrieving a response from: "), e3);
            zzb.cancel(true);
            return null;
        } catch (Exception e4) {
            String valueOf3 = String.valueOf(str);
            zzcgt.zzg(valueOf3.length() != 0 ? "Error retrieving a response from: ".concat(valueOf3) : new String("Error retrieving a response from: "), e4);
            return null;
        }
    }

    private final Uri zzp(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.zzb) {
            if (TextUtils.isEmpty(this.zzc)) {
                com.google.android.gms.ads.internal.zzt.zzc();
                try {
                    str5 = new String(IOUtils.readInputStreamFully(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    zzcgt.zzd("Error reading from internal storage.");
                    str5 = "";
                }
                this.zzc = str5;
                if (TextUtils.isEmpty(str5)) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zzc = UUID.randomUUID().toString();
                    com.google.android.gms.ads.internal.zzt.zzc();
                    String str6 = this.zzc;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e2) {
                        zzcgt.zzg("Error writing to file in internal storage.", e2);
                    }
                }
            }
            str4 = this.zzc;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    public final void zza(zzdyc zzdycVar) {
        this.zzg = zzdycVar;
    }

    public final zzdyc zzb() {
        return this.zzg;
    }

    public final void zzc(Context context) {
        zzdyc zzdycVar;
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgE)).booleanValue() || (zzdycVar = this.zzg) == null) {
            return;
        }
        zzdycVar.zzk(new zzaw(this, context), zzdyb.DEBUG_MENU);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    @com.google.android.gms.common.util.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzd(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbjd<java.lang.String> r0 = com.google.android.gms.internal.ads.zzbjl.zzde
            com.google.android.gms.internal.ads.zzbjj r1 = com.google.android.gms.internal.ads.zzbet.zzc()
            java.lang.Object r0 = r1.zzc(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = r3.zzp(r4, r0, r5, r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = zzo(r4, r0, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r0 = 0
            if (r6 == 0) goto L25
            java.lang.String r4 = "Not linked for in app preview."
            com.google.android.gms.internal.ads.zzcgt.zzd(r4)
            return r0
        L25:
            java.lang.String r4 = r4.trim()
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L83
            r6.<init>(r4)     // Catch: org.json.JSONException -> L83
            java.lang.String r4 = "gct"
            java.lang.String r4 = r6.optString(r4)     // Catch: org.json.JSONException -> L83
            java.lang.String r1 = "status"
            java.lang.String r6 = r6.optString(r1)     // Catch: org.json.JSONException -> L83
            r3.zza = r6     // Catch: org.json.JSONException -> L83
            com.google.android.gms.internal.ads.zzbjd<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.zzbjl.zzgE     // Catch: org.json.JSONException -> L83
            com.google.android.gms.internal.ads.zzbjj r1 = com.google.android.gms.internal.ads.zzbet.zzc()     // Catch: org.json.JSONException -> L83
            java.lang.Object r6 = r1.zzc(r6)     // Catch: org.json.JSONException -> L83
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: org.json.JSONException -> L83
            boolean r6 = r6.booleanValue()     // Catch: org.json.JSONException -> L83
            r1 = 1
            if (r6 == 0) goto L79
            java.lang.String r6 = "0"
            java.lang.String r2 = r3.zza     // Catch: org.json.JSONException -> L83
            boolean r6 = r6.equals(r2)     // Catch: org.json.JSONException -> L83
            if (r6 != 0) goto L66
            java.lang.String r6 = "2"
            java.lang.String r2 = r3.zza     // Catch: org.json.JSONException -> L83
            boolean r6 = r6.equals(r2)     // Catch: org.json.JSONException -> L83
            if (r6 == 0) goto L64
            goto L66
        L64:
            r6 = 0
            goto L67
        L66:
            r6 = 1
        L67:
            r3.zzj(r6)     // Catch: org.json.JSONException -> L83
            com.google.android.gms.internal.ads.zzcge r2 = com.google.android.gms.ads.internal.zzt.zzg()     // Catch: org.json.JSONException -> L83
            com.google.android.gms.ads.internal.util.zzg r2 = r2.zzp()     // Catch: org.json.JSONException -> L83
            if (r1 == r6) goto L76
            java.lang.String r5 = ""
        L76:
            r2.zzL(r5)     // Catch: org.json.JSONException -> L83
        L79:
            java.lang.Object r5 = r3.zzb
            monitor-enter(r5)
            r3.zzd = r4     // Catch: java.lang.Throwable -> L80
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L80
            return r1
        L80:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L80
            throw r4
        L83:
            r4 = move-exception
            java.lang.String r5 = "Fail to get in app preview response json."
            com.google.android.gms.internal.ads.zzcgt.zzj(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzaz.zzd(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public final boolean zze(Context context, String str, String str2) {
        String zzo = zzo(context, zzp(context, (String) zzbet.zzc().zzc(zzbjl.zzdf), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzo)) {
            zzcgt.zzd("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(zzo.trim()).optString("debug_mode"));
            zzj(equals);
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgE)).booleanValue()) {
                zzg zzp = com.google.android.gms.ads.internal.zzt.zzg().zzp();
                if (true != equals) {
                    str = "";
                }
                zzp.zzL(str);
            }
            return equals;
        } catch (JSONException e2) {
            zzcgt.zzj("Fail to get debug mode response json.", e2);
            return false;
        }
    }

    public final void zzf(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzX(context, zzp(context, (String) zzbet.zzc().zzc(zzbjl.zzdd), str, str2));
    }

    public final boolean zzg(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzm()) {
            return false;
        }
        zzcgt.zzd("Sending troubleshooting signals to the server.");
        zzh(context, str, str2, str3);
        return true;
    }

    public final void zzh(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = zzp(context, (String) zzbet.zzc().zzc(zzbjl.zzdg), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzN(context, str, buildUpon.build().toString());
    }

    public final String zzi() {
        String str;
        synchronized (this.zzb) {
            str = this.zzd;
        }
        return str;
    }

    public final void zzj(boolean z) {
        synchronized (this.zzb) {
            this.zzf = z;
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgE)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzg().zzp().zzJ(z);
                zzdyc zzdycVar = this.zzg;
                if (zzdycVar != null) {
                    zzdycVar.zzb(z);
                }
            }
        }
    }

    public final boolean zzk() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zzf;
        }
        return z;
    }

    public final void zzl(boolean z) {
        synchronized (this.zzb) {
            this.zze = z;
        }
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zze;
        }
        return z;
    }

    @VisibleForTesting
    public final void zzn(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            zzs.zza.post(new zzay(this, context, str, z, z2));
        } else {
            zzcgt.zzh("Can not create dialog without Activity Context");
        }
    }
}
