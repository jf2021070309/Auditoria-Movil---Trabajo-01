package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbsi;
import com.google.android.gms.internal.ads.zzcmc;
import com.google.android.gms.internal.ads.zzcml;
import com.google.android.gms.internal.ads.zzcni;
import com.google.android.gms.internal.ads.zzcnn;
import com.google.android.gms.internal.ads.zzcnr;
import com.google.android.gms.internal.ads.zzcnu;
import com.google.android.gms.internal.ads.zzcnw;
import com.google.android.gms.internal.ads.zzdio;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbqc<T extends zzbcv & zzcmc & zzcml & zzbsi & zzcni & zzcnn & zzcnr & zzdio & zzcnu & zzcnw> implements zzbpr<T> {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdvi zzb;
    private final zzffc zzc;
    private final zzbyj zze;
    private final zzedq zzf;
    private com.google.android.gms.ads.internal.overlay.zzt zzg = null;
    private final zzcgy zzd = new zzcgy(null);

    public zzbqc(com.google.android.gms.ads.internal.zzb zzbVar, zzbyj zzbyjVar, zzedq zzedqVar, zzdvi zzdviVar, zzffc zzffcVar) {
        this.zza = zzbVar;
        this.zze = zzbyjVar;
        this.zzf = zzedqVar;
        this.zzb = zzdviVar;
        this.zzc = zzffcVar;
    }

    public static boolean zzc(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    public static int zzd(Map<String, String> map) {
        String str = map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return 7;
            }
            if ("l".equalsIgnoreCase(str)) {
                return 6;
            }
            if ("c".equalsIgnoreCase(str)) {
                return com.google.android.gms.ads.internal.zzt.zze().zzh();
            }
            return -1;
        }
        return -1;
    }

    static Uri zze(Context context, zzaas zzaasVar, Uri uri, View view, Activity activity) {
        if (zzaasVar == null) {
            return uri;
        }
        try {
            return zzaasVar.zzf(uri) ? zzaasVar.zze(uri, context, view, activity) : uri;
        } catch (zzaat unused) {
            return uri;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    static Uri zzf(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            String valueOf = String.valueOf(uri.toString());
            com.google.android.gms.ads.internal.util.zze.zzg(valueOf.length() != 0 ? "Error adding click uptime parameter to url: ".concat(valueOf) : new String("Error adding click uptime parameter to url: "), e);
        }
        return uri;
    }

    private final boolean zzh(T t, Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zzI = com.google.android.gms.ads.internal.util.zzs.zzI(context);
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzbu zzD = com.google.android.gms.ads.internal.util.zzs.zzD(context);
        zzdvi zzdviVar = this.zzb;
        if (zzdviVar != null) {
            zzedy.zzd(context, zzdviVar, this.zzc, this.zzf, str2, "offline_open");
        }
        T t2 = t;
        boolean z = t2.zzP().zzg() && t2.zzj() == null;
        if (zzI) {
            this.zzf.zzc(this.zzd, str2);
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        if (NotificationManagerCompat.from(context).areNotificationsEnabled() && zzD != null && !z) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzga)).booleanValue()) {
                if (t2.zzP().zzg()) {
                    zzedy.zzc(t2.zzj(), null, zzD, this.zzf, this.zzb, this.zzc, str2, str);
                } else {
                    t.zzaJ(zzD, this.zzf, this.zzb, this.zzc, str2, str, com.google.android.gms.ads.internal.zzt.zze().zzh());
                }
                zzdvi zzdviVar2 = this.zzb;
                if (zzdviVar2 != null) {
                    zzedy.zzd(context, zzdviVar2, this.zzc, this.zzf, str2, "dialog_impression");
                }
                t.onAdClicked();
                return true;
            }
        }
        this.zzf.zzd(str2);
        if (this.zzb != null) {
            HashMap hashMap = new HashMap();
            com.google.android.gms.ads.internal.zzt.zzc();
            if (!NotificationManagerCompat.from(context).areNotificationsEnabled()) {
                hashMap.put("dialog_not_shown_reason", "notifications_disabled");
            } else if (zzD == null) {
                hashMap.put("dialog_not_shown_reason", "work_manager_unavailable");
            } else {
                if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzga)).booleanValue()) {
                    hashMap.put("dialog_not_shown_reason", "notification_flow_disabled");
                } else if (z) {
                    hashMap.put("dialog_not_shown_reason", "fullscreen_no_activity");
                }
            }
            zzedy.zzh(context, this.zzb, this.zzc, this.zzf, str2, "dialog_not_shown", hashMap);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00df, code lost:
        if (com.google.android.gms.internal.ads.zzbqb.zzb(r11, r5, r6, r7) == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
        r11 = r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzi(T r18, java.util.Map<java.lang.String, java.lang.String> r19, boolean r20, java.lang.String r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbqc.zzi(com.google.android.gms.internal.ads.zzbcv, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    private final void zzj(boolean z) {
        zzbyj zzbyjVar = this.zze;
        if (zzbyjVar != null) {
            zzbyjVar.zzb(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(int i) {
        if (this.zzb == null) {
            return;
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgi)).booleanValue()) {
            zzffc zzffcVar = this.zzc;
            zzffb zza = zzffb.zza("cct_action");
            zza.zzc("cct_open_status", zzbki.zza(i));
            zzffcVar.zza(zza);
            return;
        }
        zzdvh zzd = this.zzb.zzd();
        zzd.zzd("action", "cct_action");
        zzd.zzd("cct_open_status", zzbki.zza(i));
        zzd.zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ab  */
    @Override // com.google.android.gms.internal.ads.zzbpr
    /* renamed from: zzb */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r33, java.util.Map<java.lang.String, java.lang.String> r34) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbqc.zza(com.google.android.gms.internal.ads.zzbcv, java.util.Map):void");
    }
}
