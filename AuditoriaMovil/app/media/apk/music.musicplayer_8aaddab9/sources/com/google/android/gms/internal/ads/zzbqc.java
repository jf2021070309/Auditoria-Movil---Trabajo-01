package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import c.i.c.q;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
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
import e.c.a.l.e;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
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

    @VisibleForTesting
    public static Uri zze(Context context, zzaas zzaasVar, Uri uri, View view, Activity activity) {
        if (zzaasVar == null) {
            return uri;
        }
        try {
            return zzaasVar.zzf(uri) ? zzaasVar.zze(uri, context, view, activity) : uri;
        } catch (zzaat unused) {
            return uri;
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.zzt.zzg().zzk(e2, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    @VisibleForTesting
    public static Uri zzf(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e2) {
            String valueOf = String.valueOf(uri.toString());
            zzcgt.zzg(valueOf.length() != 0 ? "Error adding click uptime parameter to url: ".concat(valueOf) : new String("Error adding click uptime parameter to url: "), e2);
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
        if (new q(context).a() && zzD != null && !z) {
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
                return true;
            }
        }
        this.zzf.zzd(str2);
        if (this.zzb != null) {
            HashMap hashMap = new HashMap();
            com.google.android.gms.ads.internal.zzt.zzc();
            if (!new q(context).a()) {
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
    public final void zzk(int i2) {
        if (this.zzb == null) {
            return;
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgi)).booleanValue()) {
            zzffc zzffcVar = this.zzc;
            zzffb zza = zzffb.zza("cct_action");
            zza.zzc("cct_open_status", zzbki.zza(i2));
            zzffcVar.zza(zza);
            return;
        }
        zzdvh zzd = this.zzb.zzd();
        zzd.zzd("action", "cct_action");
        zzd.zzd("cct_open_status", zzbki.zza(i2));
        zzd.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    /* renamed from: zzb */
    public final void zza(T t, Map<String, String> map) {
        String str;
        boolean z;
        HashMap hashMap;
        Object obj;
        T t2 = t;
        String zza = zzcfc.zza(map.get("u"), t2.getContext(), true);
        String str2 = map.get("a");
        if (str2 == null) {
            zzcgt.zzi("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar != null && !zzbVar.zzb()) {
            this.zza.zzc(zza);
            return;
        }
        zzezz zzF = t2.zzF();
        zzfac zzaB = t2.zzaB();
        boolean z2 = false;
        if (zzF == null || zzaB == null) {
            str = "";
            z = false;
        } else {
            z = zzF.zzaf;
            str = zzaB.zzb;
        }
        boolean z3 = (((Boolean) zzbet.zzc().zzc(zzbjl.zzgZ)).booleanValue() && map.containsKey("sc") && map.get("sc").equals("0")) ? false : true;
        if ("expand".equalsIgnoreCase(str2)) {
            if (t2.zzW()) {
                zzcgt.zzi("Cannot expand WebView that is already expanded.");
                return;
            }
            zzj(false);
            t.zzaG(zzc(map), zzd(map), z3);
        } else if ("webapp".equalsIgnoreCase(str2)) {
            zzj(false);
            if (zza != null) {
                t.zzaH(zzc(map), zzd(map), zza, z3);
            } else {
                t.zzaI(zzc(map), zzd(map), map.get("html"), map.get("baseurl"), z3);
            }
        } else if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = t2.getContext();
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzcV)).booleanValue()) {
                if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdb)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                } else {
                    if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzcZ)).booleanValue()) {
                        z2 = true;
                        break;
                    }
                    String str3 = (String) zzbet.zzc().zzc(zzbjl.zzda);
                    if (!str3.isEmpty() && context != null) {
                        String packageName = context.getPackageName();
                        for (String str4 : zzfmg.zzb(zzflk.zzb(';')).zzd(str3)) {
                            if (str4.equals(packageName)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                }
            }
            boolean zza2 = zzbkj.zza(t2.getContext());
            if (z2) {
                if (zza2) {
                    zzj(true);
                    if (TextUtils.isEmpty(zza)) {
                        zzcgt.zzi("Cannot open browser with null or empty url");
                        zzk(7);
                        return;
                    }
                    Uri zzf = zzf(zze(t2.getContext(), t2.zzU(), Uri.parse(zza), t2.zzH(), t2.zzj()));
                    if (z && this.zzf != null && zzh(t, t2.getContext(), zzf.toString(), str)) {
                        return;
                    }
                    this.zzg = new zzbpz(this);
                    t.zzaF(new com.google.android.gms.ads.internal.overlay.zzc(null, zzf.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzg).asBinder(), true), z3);
                    return;
                }
                zzk(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzi(t, map, z, str, z3);
        } else if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase(map.get("system_browser"))) {
            zzi(t, map, z, str, z3);
        } else if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfS)).booleanValue()) {
                zzj(true);
                String str5 = map.get("p");
                if (str5 == null) {
                    zzcgt.zzi("Package name missing from open app action.");
                } else if (!z || this.zzf == null || !zzh(t, t2.getContext(), str5, str)) {
                    PackageManager packageManager = t2.getContext().getPackageManager();
                    if (packageManager == null) {
                        zzcgt.zzi("Cannot get package manager from open app action.");
                        return;
                    }
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                    if (launchIntentForPackage != null) {
                        t.zzaF(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzg), z3);
                    }
                }
            }
        } else {
            zzj(true);
            String str6 = map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str6)) {
                try {
                    intent = Intent.parseUri(str6, 0);
                } catch (URISyntaxException e2) {
                    String valueOf = String.valueOf(str6);
                    zzcgt.zzg(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e2);
                }
            }
            Intent intent2 = intent;
            if (intent2 != null && intent2.getData() != null) {
                Uri data = intent2.getData();
                if (!Uri.EMPTY.equals(data)) {
                    Uri zzf2 = zzf(zze(t2.getContext(), t2.zzU(), data, t2.zzH(), t2.zzj()));
                    if (!TextUtils.isEmpty(intent2.getType())) {
                        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfT)).booleanValue()) {
                            intent2.setDataAndType(zzf2, intent2.getType());
                        }
                    }
                    intent2.setData(zzf2);
                }
            }
            boolean z4 = ((Boolean) zzbet.zzc().zzc(zzbjl.zzge)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
            HashMap hashMap2 = new HashMap();
            if (z4) {
                hashMap = hashMap2;
                obj = "p";
                this.zzg = new zzbqa(this, z3, t, hashMap2, map);
                z3 = false;
            } else {
                hashMap = hashMap2;
                obj = "p";
            }
            if (intent2 != null) {
                if (!z || this.zzf == null || !zzh(t, t2.getContext(), intent2.getData().toString(), str)) {
                    t.zzaF(new com.google.android.gms.ads.internal.overlay.zzc(intent2, this.zzg), z3);
                    return;
                } else if (z4) {
                    HashMap hashMap3 = hashMap;
                    hashMap3.put(map.get("event_id"), Boolean.TRUE);
                    t.zze("openIntentAsync", hashMap3);
                    return;
                } else {
                    return;
                }
            }
            HashMap hashMap4 = hashMap;
            if (!TextUtils.isEmpty(zza)) {
                zza = zzf(zze(t2.getContext(), t2.zzU(), Uri.parse(zza), t2.zzH(), t2.zzj())).toString();
            }
            if (!z || this.zzf == null || !zzh(t, t2.getContext(), zza, str)) {
                t.zzaF(new com.google.android.gms.ads.internal.overlay.zzc(map.get(IntegerTokenConverter.CONVERTER_KEY), zza, map.get("m"), map.get(obj), map.get("c"), map.get("f"), map.get(e.a), this.zzg), z3);
            } else if (z4) {
                hashMap4.put(map.get("event_id"), Boolean.TRUE);
                t.zze("openIntentAsync", hashMap4);
            }
        }
    }
}
