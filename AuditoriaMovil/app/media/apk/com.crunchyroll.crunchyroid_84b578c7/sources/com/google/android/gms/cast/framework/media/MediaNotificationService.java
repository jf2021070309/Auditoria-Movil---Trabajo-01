package com.google.android.gms.cast.framework.media;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import com.amazon.aps.iva.c3.g0;
import com.amazon.aps.iva.c3.p;
import com.amazon.aps.iva.c3.s;
import com.amazon.aps.iva.o5.b;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.R;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.cast.zzdy;
import com.google.android.gms.internal.cast.zzml;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public class MediaNotificationService extends Service {
    public static final String ACTION_UPDATE_NOTIFICATION = "com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION";
    private static final Logger zza = new Logger("MediaNotificationService");
    private static Runnable zzb;
    private NotificationOptions zzc;
    private ImagePicker zzd;
    private ComponentName zze;
    private ComponentName zzf;
    private List zzg = new ArrayList();
    private int[] zzh;
    private long zzi;
    private com.google.android.gms.cast.framework.media.internal.zzb zzj;
    private ImageHints zzk;
    private Resources zzl;
    private zzm zzm;
    private zzn zzn;
    private NotificationManager zzo;
    private Notification zzp;
    private CastContext zzq;

    public static boolean isNotificationOptionsValid(CastOptions castOptions) {
        NotificationOptions notificationOptions;
        int size;
        CastMediaOptions castMediaOptions = castOptions.getCastMediaOptions();
        if (castMediaOptions == null || (notificationOptions = castMediaOptions.getNotificationOptions()) == null) {
            return false;
        }
        zzg zzm = notificationOptions.zzm();
        if (zzm == null) {
            return true;
        }
        List zzf = com.google.android.gms.cast.framework.media.internal.zzw.zzf(zzm);
        int[] zzg = com.google.android.gms.cast.framework.media.internal.zzw.zzg(zzm);
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
    private final p zzc(String str) {
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
                zzm zzmVar = this.zzm;
                int i = zzmVar.zzc;
                boolean z = zzmVar.zzb;
                if (i == 2) {
                    pauseDrawableResId = this.zzc.getStopLiveStreamDrawableResId();
                    zzf = this.zzc.getStopLiveStreamTitleResId();
                } else {
                    pauseDrawableResId = this.zzc.getPauseDrawableResId();
                    zzf = this.zzc.zzf();
                }
                if (!z) {
                    pauseDrawableResId = this.zzc.getPlayDrawableResId();
                }
                if (!z) {
                    zzf = this.zzc.zzg();
                }
                Intent intent = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                intent.setComponent(this.zze);
                return new p.a(pauseDrawableResId, this.zzl.getString(zzf), PendingIntent.getBroadcast(this, 0, intent, zzdy.zza)).a();
            case 1:
                if (this.zzm.zzf) {
                    Intent intent2 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                    intent2.setComponent(this.zze);
                    pendingIntent = PendingIntent.getBroadcast(this, 0, intent2, zzdy.zza);
                }
                return new p.a(this.zzc.getSkipNextDrawableResId(), this.zzl.getString(this.zzc.zzk()), pendingIntent).a();
            case 2:
                if (this.zzm.zzg) {
                    Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                    intent3.setComponent(this.zze);
                    pendingIntent = PendingIntent.getBroadcast(this, 0, intent3, zzdy.zza);
                }
                return new p.a(this.zzc.getSkipPrevDrawableResId(), this.zzl.getString(this.zzc.zzl()), pendingIntent).a();
            case 3:
                long j = this.zzi;
                Intent intent4 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                intent4.setComponent(this.zze);
                intent4.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                return new p.a(com.google.android.gms.cast.framework.media.internal.zzw.zza(this.zzc, j), this.zzl.getString(com.google.android.gms.cast.framework.media.internal.zzw.zzb(this.zzc, j)), PendingIntent.getBroadcast(this, 0, intent4, zzdy.zza | 134217728)).a();
            case 4:
                long j2 = this.zzi;
                Intent intent5 = new Intent(MediaIntentReceiver.ACTION_REWIND);
                intent5.setComponent(this.zze);
                intent5.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j2);
                return new p.a(com.google.android.gms.cast.framework.media.internal.zzw.zzc(this.zzc, j2), this.zzl.getString(com.google.android.gms.cast.framework.media.internal.zzw.zzd(this.zzc, j2)), PendingIntent.getBroadcast(this, 0, intent5, zzdy.zza | 134217728)).a();
            case 5:
                Intent intent6 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                intent6.setComponent(this.zze);
                return new p.a(this.zzc.getDisconnectDrawableResId(), this.zzl.getString(this.zzc.zza()), PendingIntent.getBroadcast(this, 0, intent6, zzdy.zza)).a();
            case 6:
                Intent intent7 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                intent7.setComponent(this.zze);
                return new p.a(this.zzc.getDisconnectDrawableResId(), this.zzl.getString(this.zzc.zza(), ""), PendingIntent.getBroadcast(this, 0, intent7, zzdy.zza)).a();
            default:
                zza.e("Action: %s is not a pre-defined action.", str);
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd() {
        Bitmap bitmap;
        PendingIntent e;
        p zzc;
        if (this.zzm == null) {
            return;
        }
        zzn zznVar = this.zzn;
        int[] iArr = null;
        if (zznVar == null) {
            bitmap = null;
        } else {
            bitmap = zznVar.zzb;
        }
        s sVar = new s(this, "cast_media_notification");
        sVar.g(bitmap);
        sVar.E.icon = this.zzc.getSmallIconDrawableResId();
        sVar.e(this.zzm.zzd);
        sVar.d(this.zzl.getString(this.zzc.getCastingToDeviceStringResId(), this.zzm.zze));
        sVar.f(2, true);
        sVar.k = false;
        sVar.w = 1;
        ComponentName componentName = this.zzf;
        if (componentName == null) {
            e = null;
        } else {
            Intent intent = new Intent();
            intent.putExtra("targetActivity", componentName);
            intent.setAction(componentName.flattenToString());
            intent.setComponent(componentName);
            g0 g0Var = new g0(this);
            g0Var.b(intent);
            e = g0Var.e(zzdy.zza | 134217728);
        }
        if (e != null) {
            sVar.g = e;
        }
        zzg zzm = this.zzc.zzm();
        if (zzm != null) {
            zza.i("actionsProvider != null", new Object[0]);
            int[] zzg = com.google.android.gms.cast.framework.media.internal.zzw.zzg(zzm);
            if (zzg != null) {
                iArr = (int[]) zzg.clone();
            }
            this.zzh = iArr;
            List<NotificationAction> zzf = com.google.android.gms.cast.framework.media.internal.zzw.zzf(zzm);
            this.zzg = new ArrayList();
            if (zzf != null) {
                for (NotificationAction notificationAction : zzf) {
                    String action = notificationAction.getAction();
                    if (!action.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) && !action.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) && !action.equals(MediaIntentReceiver.ACTION_SKIP_PREV) && !action.equals(MediaIntentReceiver.ACTION_FORWARD) && !action.equals(MediaIntentReceiver.ACTION_REWIND) && !action.equals(MediaIntentReceiver.ACTION_STOP_CASTING) && !action.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                        Intent intent2 = new Intent(notificationAction.getAction());
                        intent2.setComponent(this.zze);
                        zzc = new p.a(notificationAction.getIconResId(), notificationAction.getContentDescription(), PendingIntent.getBroadcast(this, 0, intent2, zzdy.zza)).a();
                    } else {
                        zzc = zzc(notificationAction.getAction());
                    }
                    if (zzc != null) {
                        this.zzg.add(zzc);
                    }
                }
            }
        } else {
            zza.i("actionsProvider == null", new Object[0]);
            this.zzg = new ArrayList();
            for (String str : this.zzc.getActions()) {
                p zzc2 = zzc(str);
                if (zzc2 != null) {
                    this.zzg.add(zzc2);
                }
            }
            this.zzh = (int[]) this.zzc.getCompatActionIndices().clone();
        }
        for (p pVar : this.zzg) {
            if (pVar != null) {
                sVar.b.add(pVar);
            }
        }
        b bVar = new b();
        int[] iArr2 = this.zzh;
        if (iArr2 != null) {
            bVar.a = iArr2;
        }
        MediaSessionCompat.Token token = this.zzm.zza;
        if (token != null) {
            bVar.b = token;
        }
        sVar.h(bVar);
        Notification b = sVar.b();
        this.zzp = b;
        startForeground(1, b);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.zzo = (NotificationManager) getSystemService("notification");
        CastContext sharedInstance = CastContext.getSharedInstance(this);
        this.zzq = sharedInstance;
        CastMediaOptions castMediaOptions = (CastMediaOptions) Preconditions.checkNotNull(sharedInstance.getCastOptions().getCastMediaOptions());
        this.zzc = (NotificationOptions) Preconditions.checkNotNull(castMediaOptions.getNotificationOptions());
        this.zzd = castMediaOptions.getImagePicker();
        this.zzl = getResources();
        this.zze = new ComponentName(getApplicationContext(), castMediaOptions.getMediaIntentReceiverClassName());
        if (!TextUtils.isEmpty(this.zzc.getTargetActivityClassName())) {
            this.zzf = new ComponentName(getApplicationContext(), this.zzc.getTargetActivityClassName());
        } else {
            this.zzf = null;
        }
        this.zzi = this.zzc.getSkipStepMs();
        int dimensionPixelSize = this.zzl.getDimensionPixelSize(this.zzc.zze());
        this.zzk = new ImageHints(1, dimensionPixelSize, dimensionPixelSize);
        this.zzj = new com.google.android.gms.cast.framework.media.internal.zzb(getApplicationContext(), this.zzk);
        if (PlatformVersion.isAtLeastO()) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", getResources().getString(R.string.media_notification_channel_name), 2);
            notificationChannel.setShowBadge(false);
            this.zzo.createNotificationChannel(notificationChannel);
        }
        com.google.android.gms.internal.cast.zzo.zzd(zzml.CAF_NOTIFICATION_SERVICE);
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.google.android.gms.cast.framework.media.internal.zzb zzbVar = this.zzj;
        if (zzbVar != null) {
            zzbVar.zza();
        }
        zzb = null;
        this.zzo.cancel(1);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, final int i2) {
        boolean z;
        WebImage webImage;
        zzm zzmVar;
        MediaInfo mediaInfo = (MediaInfo) Preconditions.checkNotNull((MediaInfo) intent.getParcelableExtra("extra_media_info"));
        MediaMetadata mediaMetadata = (MediaMetadata) Preconditions.checkNotNull(mediaInfo.getMetadata());
        int intExtra = intent.getIntExtra("extra_remote_media_client_player_state", 0);
        int streamType = mediaInfo.getStreamType();
        String string = mediaMetadata.getString(MediaMetadata.KEY_TITLE);
        String friendlyName = ((CastDevice) Preconditions.checkNotNull((CastDevice) intent.getParcelableExtra("extra_cast_device"))).getFriendlyName();
        MediaSessionCompat.Token token = (MediaSessionCompat.Token) intent.getParcelableExtra("extra_media_session_token");
        if (intExtra == 2) {
            z = true;
        } else {
            z = false;
        }
        zzm zzmVar2 = new zzm(z, streamType, string, friendlyName, token, intent.getBooleanExtra("extra_can_skip_next", false), intent.getBooleanExtra("extra_can_skip_prev", false));
        if (intent.getBooleanExtra("extra_media_notification_force_update", false) || (zzmVar = this.zzm) == null || zzmVar2.zzb != zzmVar.zzb || zzmVar2.zzc != zzmVar.zzc || !CastUtils.zze(zzmVar2.zzd, zzmVar.zzd) || !CastUtils.zze(zzmVar2.zze, zzmVar.zze) || zzmVar2.zzf != zzmVar.zzf || zzmVar2.zzg != zzmVar.zzg) {
            this.zzm = zzmVar2;
            zzd();
        }
        ImagePicker imagePicker = this.zzd;
        if (imagePicker != null) {
            webImage = imagePicker.onPickImage(mediaMetadata, this.zzk);
        } else if (mediaMetadata.hasImages()) {
            webImage = mediaMetadata.getImages().get(0);
        } else {
            webImage = null;
        }
        zzn zznVar = new zzn(webImage);
        zzn zznVar2 = this.zzn;
        if (zznVar2 == null || !CastUtils.zze(zznVar.zza, zznVar2.zza)) {
            this.zzj.zzc(new zzl(this, zznVar));
            this.zzj.zzd(zznVar.zza);
        }
        startForeground(1, this.zzp);
        zzb = new Runnable() { // from class: com.google.android.gms.cast.framework.media.zzk
            @Override // java.lang.Runnable
            public final void run() {
                MediaNotificationService.this.stopSelf(i2);
            }
        };
        return 2;
    }
}
