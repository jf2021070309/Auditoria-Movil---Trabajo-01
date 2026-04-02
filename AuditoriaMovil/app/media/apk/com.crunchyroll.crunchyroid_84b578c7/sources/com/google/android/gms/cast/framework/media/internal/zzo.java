package com.google.android.gms.cast.framework.media.internal;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import com.amazon.aps.iva.c3.g0;
import com.amazon.aps.iva.c3.p;
import com.amazon.aps.iva.c3.s;
import com.amazon.aps.iva.o5.b;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.R;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.cast.framework.media.ImagePicker;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.cast.framework.media.NotificationAction;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.cast.zzdy;
import com.google.android.gms.internal.cast.zzml;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
final class zzo {
    private static final Logger zza = new Logger("MediaNotificationProxy");
    private final Context zzb;
    private final NotificationManager zzc;
    private final CastContext zzd;
    private final NotificationOptions zze;
    private final ImagePicker zzf;
    private final ComponentName zzg;
    private final ComponentName zzh;
    private List zzi = new ArrayList();
    private int[] zzj;
    private final long zzk;
    private final zzb zzl;
    private final ImageHints zzm;
    private final Resources zzn;
    private zzm zzo;
    private zzn zzp;
    private Notification zzq;
    private p zzr;
    private p zzs;
    private p zzt;
    private p zzu;
    private p zzv;
    private p zzw;
    private p zzx;
    private p zzy;

    public zzo(Context context) {
        this.zzb = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.zzc = notificationManager;
        CastContext castContext = (CastContext) Preconditions.checkNotNull(CastContext.getSharedInstance());
        this.zzd = castContext;
        CastMediaOptions castMediaOptions = (CastMediaOptions) Preconditions.checkNotNull(((CastOptions) Preconditions.checkNotNull(castContext.getCastOptions())).getCastMediaOptions());
        NotificationOptions notificationOptions = (NotificationOptions) Preconditions.checkNotNull(castMediaOptions.getNotificationOptions());
        this.zze = notificationOptions;
        this.zzf = castMediaOptions.getImagePicker();
        Resources resources = context.getResources();
        this.zzn = resources;
        this.zzg = new ComponentName(context.getApplicationContext(), castMediaOptions.getMediaIntentReceiverClassName());
        if (!TextUtils.isEmpty(notificationOptions.getTargetActivityClassName())) {
            this.zzh = new ComponentName(context.getApplicationContext(), notificationOptions.getTargetActivityClassName());
        } else {
            this.zzh = null;
        }
        this.zzk = notificationOptions.getSkipStepMs();
        int dimensionPixelSize = resources.getDimensionPixelSize(notificationOptions.zze());
        ImageHints imageHints = new ImageHints(1, dimensionPixelSize, dimensionPixelSize);
        this.zzm = imageHints;
        this.zzl = new zzb(context.getApplicationContext(), imageHints);
        if (PlatformVersion.isAtLeastO() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", ((Context) Preconditions.checkNotNull(context)).getResources().getString(R.string.media_notification_channel_name), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        com.google.android.gms.internal.cast.zzo.zzd(zzml.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    public static boolean zze(CastOptions castOptions) {
        NotificationOptions notificationOptions;
        int size;
        CastMediaOptions castMediaOptions = castOptions.getCastMediaOptions();
        if (castMediaOptions == null || (notificationOptions = castMediaOptions.getNotificationOptions()) == null) {
            return false;
        }
        com.google.android.gms.cast.framework.media.zzg zzm = notificationOptions.zzm();
        if (zzm == null) {
            return true;
        }
        List zzf = zzw.zzf(zzm);
        int[] zzg = zzw.zzg(zzm);
        if (zzf == null) {
            size = 0;
        } else {
            size = zzf.size();
        }
        if (zzf != null && !zzf.isEmpty()) {
            if (zzf.size() > 5) {
                zza.e("NotificationActionsProvider".concat(" provides more than 5 actions."), new Object[0]);
            } else if (zzg != null && (r2 = zzg.length) != 0) {
                for (int i : zzg) {
                    if (i < 0 || i >= size) {
                        zza.e("NotificationActionsProvider".concat("provides a compact view action whose index is out of bounds."), new Object[0]);
                    }
                }
                return true;
            } else {
                zza.e("NotificationActionsProvider".concat(" doesn't provide any actions for compact view."), new Object[0]);
            }
        } else {
            zza.e("NotificationActionsProvider".concat(" doesn't provide any action."), new Object[0]);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final p zzf(String str) {
        char c;
        int pauseDrawableResId;
        int zzf;
        switch (str.hashCode()) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -945151566:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -945080078:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 235550565:
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        PendingIntent pendingIntent = null;
        switch (c) {
            case 0:
                zzm zzmVar = this.zzo;
                int i = zzmVar.zzc;
                if (zzmVar.zzb) {
                    if (this.zzs == null) {
                        if (i == 2) {
                            NotificationOptions notificationOptions = this.zze;
                            pauseDrawableResId = notificationOptions.getStopLiveStreamDrawableResId();
                            zzf = notificationOptions.getStopLiveStreamTitleResId();
                        } else {
                            NotificationOptions notificationOptions2 = this.zze;
                            pauseDrawableResId = notificationOptions2.getPauseDrawableResId();
                            zzf = notificationOptions2.zzf();
                        }
                        Intent intent = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                        intent.setComponent(this.zzg);
                        this.zzs = new p.a(pauseDrawableResId, this.zzn.getString(zzf), PendingIntent.getBroadcast(this.zzb, 0, intent, zzdy.zza)).a();
                    }
                    return this.zzs;
                }
                if (this.zzr == null) {
                    Intent intent2 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                    intent2.setComponent(this.zzg);
                    PendingIntent broadcast = PendingIntent.getBroadcast(this.zzb, 0, intent2, zzdy.zza);
                    NotificationOptions notificationOptions3 = this.zze;
                    this.zzr = new p.a(notificationOptions3.getPlayDrawableResId(), this.zzn.getString(notificationOptions3.zzg()), broadcast).a();
                }
                return this.zzr;
            case 1:
                boolean z = this.zzo.zzf;
                if (this.zzt == null) {
                    if (z) {
                        Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                        intent3.setComponent(this.zzg);
                        pendingIntent = PendingIntent.getBroadcast(this.zzb, 0, intent3, zzdy.zza);
                    }
                    NotificationOptions notificationOptions4 = this.zze;
                    this.zzt = new p.a(notificationOptions4.getSkipNextDrawableResId(), this.zzn.getString(notificationOptions4.zzk()), pendingIntent).a();
                }
                return this.zzt;
            case 2:
                boolean z2 = this.zzo.zzg;
                if (this.zzu == null) {
                    if (z2) {
                        Intent intent4 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                        intent4.setComponent(this.zzg);
                        pendingIntent = PendingIntent.getBroadcast(this.zzb, 0, intent4, zzdy.zza);
                    }
                    NotificationOptions notificationOptions5 = this.zze;
                    this.zzu = new p.a(notificationOptions5.getSkipPrevDrawableResId(), this.zzn.getString(notificationOptions5.zzl()), pendingIntent).a();
                }
                return this.zzu;
            case 3:
                long j = this.zzk;
                if (this.zzv == null) {
                    Intent intent5 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                    intent5.setComponent(this.zzg);
                    intent5.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                    this.zzv = new p.a(zzw.zza(this.zze, j), this.zzn.getString(zzw.zzb(this.zze, j)), PendingIntent.getBroadcast(this.zzb, 0, intent5, zzdy.zza | 134217728)).a();
                }
                return this.zzv;
            case 4:
                long j2 = this.zzk;
                if (this.zzw == null) {
                    Intent intent6 = new Intent(MediaIntentReceiver.ACTION_REWIND);
                    intent6.setComponent(this.zzg);
                    intent6.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j2);
                    this.zzw = new p.a(zzw.zzc(this.zze, j2), this.zzn.getString(zzw.zzd(this.zze, j2)), PendingIntent.getBroadcast(this.zzb, 0, intent6, zzdy.zza | 134217728)).a();
                }
                return this.zzw;
            case 5:
                if (this.zzy == null) {
                    Intent intent7 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                    intent7.setComponent(this.zzg);
                    PendingIntent broadcast2 = PendingIntent.getBroadcast(this.zzb, 0, intent7, zzdy.zza);
                    NotificationOptions notificationOptions6 = this.zze;
                    this.zzy = new p.a(notificationOptions6.getDisconnectDrawableResId(), this.zzn.getString(notificationOptions6.zza()), broadcast2).a();
                }
                return this.zzy;
            case 6:
                if (this.zzx == null) {
                    Intent intent8 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                    intent8.setComponent(this.zzg);
                    PendingIntent broadcast3 = PendingIntent.getBroadcast(this.zzb, 0, intent8, zzdy.zza);
                    NotificationOptions notificationOptions7 = this.zze;
                    this.zzx = new p.a(notificationOptions7.getDisconnectDrawableResId(), this.zzn.getString(notificationOptions7.zza(), ""), broadcast3).a();
                }
                return this.zzx;
            default:
                zza.e("Action: %s is not a pre-defined action.", str);
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        Bitmap bitmap;
        PendingIntent e;
        p zzf;
        if (this.zzc != null && this.zzo != null) {
            zzn zznVar = this.zzp;
            int[] iArr = null;
            if (zznVar == null) {
                bitmap = null;
            } else {
                bitmap = zznVar.zzb;
            }
            s sVar = new s(this.zzb, "cast_media_notification");
            sVar.g(bitmap);
            sVar.E.icon = this.zze.getSmallIconDrawableResId();
            sVar.e(this.zzo.zzd);
            sVar.d(this.zzn.getString(this.zze.getCastingToDeviceStringResId(), this.zzo.zze));
            sVar.f(2, true);
            sVar.k = false;
            sVar.w = 1;
            ComponentName componentName = this.zzh;
            if (componentName == null) {
                e = null;
            } else {
                Intent intent = new Intent();
                intent.putExtra("targetActivity", componentName);
                intent.setAction(componentName.flattenToString());
                intent.setComponent(componentName);
                g0 g0Var = new g0(this.zzb);
                g0Var.b(intent);
                e = g0Var.e(zzdy.zza | 134217728);
            }
            if (e != null) {
                sVar.g = e;
            }
            com.google.android.gms.cast.framework.media.zzg zzm = this.zze.zzm();
            if (zzm != null) {
                zza.d("actionsProvider != null", new Object[0]);
                int[] zzg = zzw.zzg(zzm);
                if (zzg != null) {
                    iArr = (int[]) zzg.clone();
                }
                this.zzj = iArr;
                List<NotificationAction> zzf2 = zzw.zzf(zzm);
                this.zzi = new ArrayList();
                if (zzf2 != null) {
                    for (NotificationAction notificationAction : zzf2) {
                        String action = notificationAction.getAction();
                        if (!action.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) && !action.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) && !action.equals(MediaIntentReceiver.ACTION_SKIP_PREV) && !action.equals(MediaIntentReceiver.ACTION_FORWARD) && !action.equals(MediaIntentReceiver.ACTION_REWIND) && !action.equals(MediaIntentReceiver.ACTION_STOP_CASTING) && !action.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                            Intent intent2 = new Intent(notificationAction.getAction());
                            intent2.setComponent(this.zzg);
                            zzf = new p.a(notificationAction.getIconResId(), notificationAction.getContentDescription(), PendingIntent.getBroadcast(this.zzb, 0, intent2, zzdy.zza)).a();
                        } else {
                            zzf = zzf(notificationAction.getAction());
                        }
                        if (zzf != null) {
                            this.zzi.add(zzf);
                        }
                    }
                }
            } else {
                zza.d("actionsProvider == null", new Object[0]);
                this.zzi = new ArrayList();
                for (String str : this.zze.getActions()) {
                    p zzf3 = zzf(str);
                    if (zzf3 != null) {
                        this.zzi.add(zzf3);
                    }
                }
                this.zzj = (int[]) this.zze.getCompatActionIndices().clone();
            }
            for (p pVar : this.zzi) {
                if (pVar != null) {
                    sVar.b.add(pVar);
                }
            }
            b bVar = new b();
            int[] iArr2 = this.zzj;
            if (iArr2 != null) {
                bVar.a = iArr2;
            }
            MediaSessionCompat.Token token = this.zzo.zza;
            if (token != null) {
                bVar.b = token;
            }
            sVar.h(bVar);
            Notification b = sVar.b();
            this.zzq = b;
            this.zzc.notify("castMediaNotification", 1, b);
        }
    }

    public final void zzc() {
        this.zzl.zza();
        NotificationManager notificationManager = this.zzc;
        if (notificationManager != null) {
            notificationManager.cancel("castMediaNotification", 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.cast.CastDevice r19, com.google.android.gms.cast.framework.media.RemoteMediaClient r20, android.support.v4.media.session.MediaSessionCompat r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.internal.zzo.zzd(com.google.android.gms.cast.CastDevice, com.google.android.gms.cast.framework.media.RemoteMediaClient, android.support.v4.media.session.MediaSessionCompat, boolean):void");
    }
}
