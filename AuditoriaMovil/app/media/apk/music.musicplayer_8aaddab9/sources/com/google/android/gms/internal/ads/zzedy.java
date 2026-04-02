package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import c.i.c.m;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzedy extends zzbzd {
    private final Context zza;
    private final zzdvi zzb;
    private final zzcgy zzc;
    private final zzedq zzd;
    private final zzffc zze;

    public zzedy(Context context, zzedq zzedqVar, zzcgy zzcgyVar, zzdvi zzdviVar, zzffc zzffcVar) {
        this.zza = context;
        this.zzb = zzdviVar;
        this.zzc = zzcgyVar;
        this.zzd = zzedqVar;
        this.zze = zzffcVar;
    }

    public static void zzc(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzl zzlVar, final com.google.android.gms.ads.internal.util.zzbu zzbuVar, final zzedq zzedqVar, final zzdvi zzdviVar, final zzffc zzffcVar, final String str, final String str2) {
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, com.google.android.gms.ads.internal.zzt.zze().zzm());
        final Resources zzj = com.google.android.gms.ads.internal.zzt.zzg().zzj();
        builder.setTitle(zzj == null ? "Open ad when you're back online." : zzj.getString(R.string.offline_opt_in_title)).setMessage(zzj == null ? "We'll send you a notification with a link to the advertiser site." : zzj.getString(R.string.offline_opt_in_message)).setPositiveButton(zzj == null ? "OK" : zzj.getString(R.string.offline_opt_in_confirm), new DialogInterface.OnClickListener(zzdviVar, activity, zzffcVar, zzedqVar, str, zzbuVar, str2, zzj, zzlVar) { // from class: com.google.android.gms.internal.ads.zzedt
            private final zzdvi zza;
            private final Activity zzb;
            private final zzffc zzc;
            private final zzedq zzd;
            private final String zze;
            private final com.google.android.gms.ads.internal.util.zzbu zzf;
            private final String zzg;
            private final Resources zzh;
            private final com.google.android.gms.ads.internal.overlay.zzl zzi;

            {
                this.zza = zzdviVar;
                this.zzb = activity;
                this.zzc = zzffcVar;
                this.zzd = zzedqVar;
                this.zze = str;
                this.zzf = zzbuVar;
                this.zzg = str2;
                this.zzh = zzj;
                this.zzi = zzlVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
                if (r0.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(r10), r14, r13) == false) goto L14;
             */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.content.DialogInterface r19, int r20) {
                /*
                    r18 = this;
                    r1 = r18
                    com.google.android.gms.internal.ads.zzdvi r9 = r1.zza
                    android.app.Activity r10 = r1.zzb
                    com.google.android.gms.internal.ads.zzffc r11 = r1.zzc
                    com.google.android.gms.internal.ads.zzedq r12 = r1.zzd
                    java.lang.String r13 = r1.zze
                    com.google.android.gms.ads.internal.util.zzbu r0 = r1.zzf
                    java.lang.String r14 = r1.zzg
                    android.content.res.Resources r15 = r1.zzh
                    com.google.android.gms.ads.internal.overlay.zzl r8 = r1.zzi
                    if (r9 == 0) goto L34
                    java.util.HashMap r7 = new java.util.HashMap
                    r7.<init>()
                    java.lang.String r2 = "dialog_action"
                    java.lang.String r3 = "confirm"
                    r7.put(r2, r3)
                    java.lang.String r16 = "dialog_click"
                    r2 = r10
                    r3 = r9
                    r4 = r11
                    r5 = r12
                    r6 = r13
                    r17 = r7
                    r7 = r16
                    r1 = r8
                    r8 = r17
                    com.google.android.gms.internal.ads.zzedy.zzh(r2, r3, r4, r5, r6, r7, r8)
                    goto L35
                L34:
                    r1 = r8
                L35:
                    com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch: android.os.RemoteException -> L40
                    boolean r0 = r0.zze(r2, r14, r13)     // Catch: android.os.RemoteException -> L40
                    if (r0 != 0) goto L55
                    goto L46
                L40:
                    r0 = move-exception
                    java.lang.String r2 = "Failed to schedule offline notification poster."
                    com.google.android.gms.internal.ads.zzcgt.zzg(r2, r0)
                L46:
                    r12.zzd(r13)
                    if (r9 == 0) goto L55
                    java.lang.String r7 = "offline_notification_worker_not_scheduled"
                    r2 = r10
                    r3 = r9
                    r4 = r11
                    r5 = r12
                    r6 = r13
                    com.google.android.gms.internal.ads.zzedy.zzd(r2, r3, r4, r5, r6, r7)
                L55:
                    com.google.android.gms.ads.internal.zzt.zzc()
                    com.google.android.gms.ads.internal.util.zzad r0 = com.google.android.gms.ads.internal.zzt.zze()
                    android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
                    int r0 = r0.zzm()
                    r2.<init>(r10, r0)
                    if (r15 != 0) goto L6a
                    java.lang.String r0 = "You'll get a notification with the link when you're back online"
                    goto L70
                L6a:
                    int r0 = com.google.android.gms.ads.impl.R.string.offline_opt_in_confirmation
                    java.lang.String r0 = r15.getString(r0)
                L70:
                    android.app.AlertDialog$Builder r0 = r2.setMessage(r0)
                    com.google.android.gms.internal.ads.zzedw r3 = new com.google.android.gms.internal.ads.zzedw
                    r3.<init>(r1)
                    r0.setOnCancelListener(r3)
                    android.app.AlertDialog r0 = r2.create()
                    r0.show()
                    java.util.Timer r2 = new java.util.Timer
                    r2.<init>()
                    com.google.android.gms.internal.ads.zzedx r3 = new com.google.android.gms.internal.ads.zzedx
                    r3.<init>(r0, r2, r1)
                    r0 = 3000(0xbb8, double:1.482E-320)
                    r2.schedule(r3, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzedt.onClick(android.content.DialogInterface, int):void");
            }
        }).setNegativeButton(zzj == null ? "No thanks" : zzj.getString(R.string.offline_opt_in_decline), new DialogInterface.OnClickListener(zzedqVar, str, zzdviVar, activity, zzffcVar, zzlVar) { // from class: com.google.android.gms.internal.ads.zzedu
            private final zzedq zza;
            private final String zzb;
            private final zzdvi zzc;
            private final Activity zzd;
            private final zzffc zze;
            private final com.google.android.gms.ads.internal.overlay.zzl zzf;

            {
                this.zza = zzedqVar;
                this.zzb = str;
                this.zzc = zzdviVar;
                this.zzd = activity;
                this.zze = zzffcVar;
                this.zzf = zzlVar;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                zzedq zzedqVar2 = this.zza;
                String str3 = this.zzb;
                zzdvi zzdviVar2 = this.zzc;
                Activity activity2 = this.zzd;
                zzffc zzffcVar2 = this.zze;
                com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = this.zzf;
                zzedqVar2.zzd(str3);
                if (zzdviVar2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "dismiss");
                    zzedy.zzh(activity2, zzdviVar2, zzffcVar2, zzedqVar2, str3, "dialog_click", hashMap);
                }
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener(zzedqVar, str, zzdviVar, activity, zzffcVar, zzlVar) { // from class: com.google.android.gms.internal.ads.zzedv
            private final zzedq zza;
            private final String zzb;
            private final zzdvi zzc;
            private final Activity zzd;
            private final zzffc zze;
            private final com.google.android.gms.ads.internal.overlay.zzl zzf;

            {
                this.zza = zzedqVar;
                this.zzb = str;
                this.zzc = zzdviVar;
                this.zzd = activity;
                this.zze = zzffcVar;
                this.zzf = zzlVar;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzedq zzedqVar2 = this.zza;
                String str3 = this.zzb;
                zzdvi zzdviVar2 = this.zzc;
                Activity activity2 = this.zzd;
                zzffc zzffcVar2 = this.zze;
                com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = this.zzf;
                zzedqVar2.zzd(str3);
                if (zzdviVar2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "dismiss");
                    zzedy.zzh(activity2, zzdviVar2, zzffcVar2, zzedqVar2, str3, "dialog_click", hashMap);
                }
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        });
        builder.create().show();
    }

    public static void zzd(Context context, zzdvi zzdviVar, zzffc zzffcVar, zzedq zzedqVar, String str, String str2) {
        zzh(context, zzdviVar, zzffcVar, zzedqVar, str, str2, new HashMap());
    }

    public static void zzh(Context context, zzdvi zzdviVar, zzffc zzffcVar, zzedq zzedqVar, String str, String str2, Map<String, String> map) {
        String zzf;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgi)).booleanValue()) {
            zzffb zza = zzffb.zza(str2);
            zza.zzc("gqi", str);
            com.google.android.gms.ads.internal.zzt.zzc();
            zza.zzc("device_connectivity", true == com.google.android.gms.ads.internal.util.zzs.zzI(context) ? "online" : "offline");
            zza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis()));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                zza.zzc(entry.getKey(), entry.getValue());
            }
            zzf = zzffcVar.zzb(zza);
        } else {
            zzdvh zzd = zzdviVar.zzd();
            zzd.zzd("gqi", str);
            zzd.zzd("action", str2);
            com.google.android.gms.ads.internal.zzt.zzc();
            zzd.zzd("device_connectivity", true == com.google.android.gms.ads.internal.util.zzs.zzI(context) ? "online" : "offline");
            zzd.zzd("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis()));
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                zzd.zzd(entry2.getKey(), entry2.getValue());
            }
            zzf = zzd.zzf();
        }
        zzedqVar.zze(new zzeds(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis(), str, zzf, 2));
    }

    private final void zzi(String str, String str2, Map<String, String> map) {
        zzh(this.zza, this.zzb, this.zze, this.zzd, str, str2, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbze
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            com.google.android.gms.ads.internal.zzt.zzc();
            boolean zzI = com.google.android.gms.ads.internal.util.zzs.zzI(this.zza);
            HashMap hashMap = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                r8 = true == zzI ? (char) 1 : (char) 2;
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Context context = this.zza;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzi(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.zzd.getWritableDatabase();
                if (r8 == 1) {
                    this.zzd.zzb(writableDatabase, this.zzc, stringExtra2);
                } else {
                    zzedq.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e2) {
                zzcgt.zzf("Failed to get writable offline buffering database: ".concat(e2.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbze
    public final void zzf(IObjectWrapper iObjectWrapper, String str, String str2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.ads.internal.zzt.zzc();
        if (PlatformVersion.isAtLeastO()) {
            NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", 2);
            notificationChannel.setShowBadge(false);
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
        Intent intent = new Intent();
        intent.setClass(context, AdService.class);
        intent.setAction("offline_notification_clicked");
        intent.putExtra("offline_notification_action", "offline_notification_clicked");
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str);
        int i2 = zzfld.zza | 1073741824;
        PendingIntent zza = zzfld.zza(context, 0, intent, i2, 0);
        Intent intent2 = new Intent();
        intent2.setClass(context, AdService.class);
        intent2.setAction("offline_notification_dismissed");
        intent2.putExtra("offline_notification_action", "offline_notification_dismissed");
        intent2.putExtra("gws_query_id", str2);
        PendingIntent zza2 = zzfld.zza(context, 0, intent2, i2, 0);
        Resources zzj = com.google.android.gms.ads.internal.zzt.zzg().zzj();
        m mVar = new m(context, "offline_notification_channel");
        mVar.i(zzj == null ? "View the ad you saved when you were offline" : zzj.getString(R.string.offline_notification_title));
        mVar.h(zzj == null ? "Tap to open ad" : zzj.getString(R.string.offline_notification_text));
        mVar.j(16, true);
        mVar.v.deleteIntent = zza2;
        mVar.f1978g = zza;
        mVar.v.icon = context.getApplicationInfo().icon;
        ((NotificationManager) context.getSystemService("notification")).notify(str2, 54321, mVar.c());
        zzi(str2, "offline_notification_impression", new HashMap());
    }

    @Override // com.google.android.gms.internal.ads.zzbze
    public final void zzg() {
        zzedq zzedqVar = this.zzd;
        final zzcgy zzcgyVar = this.zzc;
        zzedqVar.zza(new zzfdw(zzcgyVar) { // from class: com.google.android.gms.internal.ads.zzedk
            private final zzcgy zza;

            {
                this.zza = zzcgyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfdw
            public final Object zza(Object obj) {
                zzedq.zzh(this.zza, (SQLiteDatabase) obj);
                return null;
            }
        });
    }
}
