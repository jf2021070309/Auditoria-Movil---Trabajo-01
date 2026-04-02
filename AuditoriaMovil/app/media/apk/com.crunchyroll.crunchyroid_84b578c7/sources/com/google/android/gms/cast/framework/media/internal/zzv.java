package com.google.android.gms.cast.framework.media.internal;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.amazon.aps.iva.x.a;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.R;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.ImagePicker;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.cast.framework.media.NotificationAction;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.cast.zzbf;
import com.google.android.gms.internal.cast.zzdy;
import com.google.android.gms.internal.cast.zzed;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzv {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = new Logger("MediaSessionManager");
    private final Context zzc;
    private final CastOptions zzd;
    private final zzbf zze;
    private final SessionManager zzf;
    private final NotificationOptions zzg;
    private final ComponentName zzh;
    private final ComponentName zzi;
    private final zzb zzj;
    private final zzb zzk;
    private final zzo zzl;
    private final Handler zzm;
    private final Runnable zzn;
    private final RemoteMediaClient.Callback zzo;
    private RemoteMediaClient zzp;
    private CastDevice zzq;
    private MediaSessionCompat zzr;
    private MediaSessionCompat.a zzs;
    private boolean zzt;
    private PlaybackStateCompat.CustomAction zzu;
    private PlaybackStateCompat.CustomAction zzv;
    private PlaybackStateCompat.CustomAction zzw;
    private PlaybackStateCompat.CustomAction zzx;

    public zzv(Context context, CastOptions castOptions, zzbf zzbfVar) {
        SessionManager sessionManager;
        NotificationOptions notificationOptions;
        String expandedControllerActivityClassName;
        ComponentName componentName;
        String mediaIntentReceiverClassName;
        ComponentName componentName2;
        this.zzc = context;
        this.zzd = castOptions;
        this.zze = zzbfVar;
        CastContext sharedInstance = CastContext.getSharedInstance();
        if (sharedInstance != null) {
            sessionManager = sharedInstance.getSessionManager();
        } else {
            sessionManager = null;
        }
        this.zzf = sessionManager;
        CastMediaOptions castMediaOptions = castOptions.getCastMediaOptions();
        if (castMediaOptions == null) {
            notificationOptions = null;
        } else {
            notificationOptions = castMediaOptions.getNotificationOptions();
        }
        this.zzg = notificationOptions;
        this.zzo = new zzu(this, null);
        if (castMediaOptions == null) {
            expandedControllerActivityClassName = null;
        } else {
            expandedControllerActivityClassName = castMediaOptions.getExpandedControllerActivityClassName();
        }
        if (!TextUtils.isEmpty(expandedControllerActivityClassName)) {
            componentName = new ComponentName(context, expandedControllerActivityClassName);
        } else {
            componentName = null;
        }
        this.zzh = componentName;
        if (castMediaOptions == null) {
            mediaIntentReceiverClassName = null;
        } else {
            mediaIntentReceiverClassName = castMediaOptions.getMediaIntentReceiverClassName();
        }
        if (!TextUtils.isEmpty(mediaIntentReceiverClassName)) {
            componentName2 = new ComponentName(context, mediaIntentReceiverClassName);
        } else {
            componentName2 = null;
        }
        this.zzi = componentName2;
        zzb zzbVar = new zzb(context);
        this.zzj = zzbVar;
        zzbVar.zzc(new zzq(this));
        zzb zzbVar2 = new zzb(context);
        this.zzk = zzbVar2;
        zzbVar2.zzc(new zzr(this));
        this.zzm = new zzed(Looper.getMainLooper());
        this.zzl = zzo.zze(castOptions) ? new zzo(context) : null;
        this.zzn = new Runnable() { // from class: com.google.android.gms.cast.framework.media.internal.zzp
            @Override // java.lang.Runnable
            public final void run() {
                zzv.this.zzj();
            }
        };
    }

    private final long zzm(String str, int i, Bundle bundle) {
        char c;
        long j;
        int hashCode = str.hashCode();
        if (hashCode != -945151566) {
            if (hashCode != -945080078) {
                if (hashCode == 235550565 && str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    c = 1;
                }
                c = 65535;
            }
        } else {
            if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return 0L;
                }
                RemoteMediaClient remoteMediaClient = this.zzp;
                if (remoteMediaClient != null && remoteMediaClient.zzt()) {
                    return 32L;
                }
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
                return 0L;
            }
            RemoteMediaClient remoteMediaClient2 = this.zzp;
            if (remoteMediaClient2 != null && remoteMediaClient2.zzu()) {
                return 16L;
            }
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
            return 0L;
        }
        if (i == 3) {
            j = 514;
            i = 3;
        } else {
            j = 512;
        }
        if (i != 2) {
            return j;
        }
        return 516L;
    }

    private final Uri zzn(MediaMetadata mediaMetadata, int i) {
        ImagePicker imagePicker;
        WebImage webImage;
        CastMediaOptions castMediaOptions = this.zzd.getCastMediaOptions();
        if (castMediaOptions == null) {
            imagePicker = null;
        } else {
            imagePicker = castMediaOptions.getImagePicker();
        }
        if (imagePicker != null) {
            webImage = imagePicker.onPickImage(mediaMetadata, i);
        } else if (mediaMetadata.hasImages()) {
            webImage = mediaMetadata.getImages().get(0);
        } else {
            webImage = null;
        }
        if (webImage == null) {
            return null;
        }
        return webImage.getUrl();
    }

    private final MediaMetadataCompat.b zzo() {
        MediaMetadataCompat a;
        MediaSessionCompat mediaSessionCompat = this.zzr;
        if (mediaSessionCompat == null) {
            a = null;
        } else {
            a = mediaSessionCompat.b.a();
        }
        if (a == null) {
            return new MediaMetadataCompat.b();
        }
        return new MediaMetadataCompat.b(a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzp(Bitmap bitmap, int i) {
        String str;
        MediaSessionCompat mediaSessionCompat = this.zzr;
        if (mediaSessionCompat == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        MediaMetadataCompat.b zzo = zzo();
        if (i == 0) {
            str = "android.media.metadata.DISPLAY_ICON";
        } else {
            str = "android.media.metadata.ALBUM_ART";
        }
        zzo.a(str, bitmap);
        mediaSessionCompat.g(new MediaMetadataCompat(zzo.a));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzq(PlaybackStateCompat.d dVar, String str, NotificationAction notificationAction) {
        char c;
        NotificationOptions notificationOptions;
        NotificationOptions notificationOptions2;
        NotificationOptions notificationOptions3;
        NotificationOptions notificationOptions4;
        switch (str.hashCode()) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        PlaybackStateCompat.CustomAction customAction = null;
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (notificationAction != null) {
                            String contentDescription = notificationAction.getContentDescription();
                            int iconResId = notificationAction.getIconResId();
                            if (!TextUtils.isEmpty(str)) {
                                if (!TextUtils.isEmpty(contentDescription)) {
                                    if (iconResId != 0) {
                                        customAction = new PlaybackStateCompat.CustomAction(str, contentDescription, iconResId, null);
                                    } else {
                                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                                    }
                                } else {
                                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                                }
                            } else {
                                throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                            }
                        }
                    } else {
                        if (this.zzx == null && (notificationOptions4 = this.zzg) != null) {
                            String string = this.zzc.getResources().getString(notificationOptions4.zza());
                            int disconnectDrawableResId = this.zzg.getDisconnectDrawableResId();
                            if (!TextUtils.isEmpty(MediaIntentReceiver.ACTION_DISCONNECT)) {
                                if (!TextUtils.isEmpty(string)) {
                                    if (disconnectDrawableResId != 0) {
                                        this.zzx = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_DISCONNECT, string, disconnectDrawableResId, null);
                                    } else {
                                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                                    }
                                } else {
                                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                                }
                            } else {
                                throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                            }
                        }
                        customAction = this.zzx;
                    }
                } else {
                    if (this.zzw == null && (notificationOptions3 = this.zzg) != null) {
                        String string2 = this.zzc.getResources().getString(notificationOptions3.zza());
                        int disconnectDrawableResId2 = this.zzg.getDisconnectDrawableResId();
                        if (!TextUtils.isEmpty(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                            if (!TextUtils.isEmpty(string2)) {
                                if (disconnectDrawableResId2 != 0) {
                                    this.zzw = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_STOP_CASTING, string2, disconnectDrawableResId2, null);
                                } else {
                                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                                }
                            } else {
                                throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                            }
                        } else {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                    }
                    customAction = this.zzw;
                }
            } else {
                if (this.zzv == null && (notificationOptions2 = this.zzg) != null) {
                    long skipStepMs = notificationOptions2.getSkipStepMs();
                    int zzd = zzw.zzd(notificationOptions2, skipStepMs);
                    int zzc = zzw.zzc(this.zzg, skipStepMs);
                    String string3 = this.zzc.getResources().getString(zzd);
                    if (!TextUtils.isEmpty(MediaIntentReceiver.ACTION_REWIND)) {
                        if (!TextUtils.isEmpty(string3)) {
                            if (zzc != 0) {
                                this.zzv = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_REWIND, string3, zzc, null);
                            } else {
                                throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                            }
                        } else {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                    } else {
                        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                    }
                }
                customAction = this.zzv;
            }
        } else {
            if (this.zzu == null && (notificationOptions = this.zzg) != null) {
                long skipStepMs2 = notificationOptions.getSkipStepMs();
                int zzb2 = zzw.zzb(notificationOptions, skipStepMs2);
                int zza2 = zzw.zza(this.zzg, skipStepMs2);
                String string4 = this.zzc.getResources().getString(zzb2);
                if (!TextUtils.isEmpty(MediaIntentReceiver.ACTION_FORWARD)) {
                    if (!TextUtils.isEmpty(string4)) {
                        if (zza2 != 0) {
                            this.zzu = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_FORWARD, string4, zza2, null);
                        } else {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                    } else {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                } else {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
            }
            customAction = this.zzu;
        }
        if (customAction != null) {
            dVar.a(customAction);
        }
    }

    private final void zzr(boolean z) {
        if (this.zzd.getEnableReconnectionService()) {
            Runnable runnable = this.zzn;
            if (runnable != null) {
                this.zzm.removeCallbacks(runnable);
            }
            Intent intent = new Intent(this.zzc, ReconnectionService.class);
            intent.setPackage(this.zzc.getPackageName());
            try {
                this.zzc.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    this.zzm.postDelayed(this.zzn, 1000L);
                }
            }
        }
    }

    private final void zzs() {
        zzo zzoVar = this.zzl;
        if (zzoVar != null) {
            zzb.d("Stopping media notification.", new Object[0]);
            zzoVar.zzc();
        }
    }

    private final void zzt() {
        if (!this.zzd.getEnableReconnectionService()) {
            return;
        }
        this.zzm.removeCallbacks(this.zzn);
        Intent intent = new Intent(this.zzc, ReconnectionService.class);
        intent.setPackage(this.zzc.getPackageName());
        this.zzc.stopService(intent);
    }

    private final void zzu(int i, MediaInfo mediaInfo) {
        PlaybackStateCompat b;
        MediaSessionCompat mediaSessionCompat;
        MediaMetadata metadata;
        PendingIntent activity;
        long j;
        com.google.android.gms.cast.framework.media.zzg zzgVar;
        long j2;
        MediaSessionCompat mediaSessionCompat2 = this.zzr;
        if (mediaSessionCompat2 != null) {
            Bundle bundle = new Bundle();
            PlaybackStateCompat.d dVar = new PlaybackStateCompat.d();
            RemoteMediaClient remoteMediaClient = this.zzp;
            long j3 = 0;
            if (remoteMediaClient != null && this.zzl != null) {
                if (remoteMediaClient.zza() != 0 && !remoteMediaClient.isLiveStream()) {
                    j = remoteMediaClient.getApproximateStreamPosition();
                } else {
                    j = 0;
                }
                dVar.h(1.0f, i, j, SystemClock.elapsedRealtime());
                if (i == 0) {
                    b = dVar.b();
                } else {
                    NotificationOptions notificationOptions = this.zzg;
                    if (notificationOptions != null) {
                        zzgVar = notificationOptions.zzm();
                    } else {
                        zzgVar = null;
                    }
                    RemoteMediaClient remoteMediaClient2 = this.zzp;
                    if (remoteMediaClient2 != null && !remoteMediaClient2.isLiveStream() && !this.zzp.isPlayingAd()) {
                        j2 = 256;
                    } else {
                        j2 = 0;
                    }
                    if (zzgVar != null) {
                        List<NotificationAction> zzf = zzw.zzf(zzgVar);
                        if (zzf != null) {
                            for (NotificationAction notificationAction : zzf) {
                                String action = notificationAction.getAction();
                                if (zzv(action)) {
                                    j2 |= zzm(action, i, bundle);
                                } else {
                                    zzq(dVar, action, notificationAction);
                                }
                            }
                        }
                    } else {
                        NotificationOptions notificationOptions2 = this.zzg;
                        if (notificationOptions2 != null) {
                            for (String str : notificationOptions2.getActions()) {
                                if (zzv(str)) {
                                    j2 |= zzm(str, i, bundle);
                                } else {
                                    zzq(dVar, str, null);
                                }
                            }
                        }
                    }
                    dVar.f = j2;
                    b = dVar.b();
                }
            } else {
                b = dVar.b();
            }
            mediaSessionCompat2.h(b);
            NotificationOptions notificationOptions3 = this.zzg;
            if (notificationOptions3 != null && notificationOptions3.zzp()) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
            }
            NotificationOptions notificationOptions4 = this.zzg;
            if (notificationOptions4 != null && notificationOptions4.zzo()) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
            }
            boolean containsKey = bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS");
            MediaSessionCompat.d dVar2 = mediaSessionCompat2.a;
            if (containsKey || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
                dVar2.a.setExtras(bundle);
            }
            if (i != 0) {
                if (this.zzp != null) {
                    if (this.zzh == null) {
                        activity = null;
                    } else {
                        Intent intent = new Intent();
                        intent.setComponent(this.zzh);
                        activity = PendingIntent.getActivity(this.zzc, 0, intent, zzdy.zza | 134217728);
                    }
                    if (activity != null) {
                        dVar2.a.setSessionActivity(activity);
                    }
                }
                if (this.zzp != null && (mediaSessionCompat = this.zzr) != null && mediaInfo != null && (metadata = mediaInfo.getMetadata()) != null) {
                    RemoteMediaClient remoteMediaClient3 = this.zzp;
                    if (remoteMediaClient3 == null || !remoteMediaClient3.isLiveStream()) {
                        j3 = mediaInfo.getStreamDuration();
                    }
                    String string = metadata.getString(MediaMetadata.KEY_TITLE);
                    String string2 = metadata.getString(MediaMetadata.KEY_SUBTITLE);
                    MediaMetadataCompat.b zzo = zzo();
                    zzo.b(j3, "android.media.metadata.DURATION");
                    if (string != null) {
                        zzo.d("android.media.metadata.TITLE", string);
                        zzo.d("android.media.metadata.DISPLAY_TITLE", string);
                    }
                    if (string2 != null) {
                        zzo.d("android.media.metadata.DISPLAY_SUBTITLE", string2);
                    }
                    mediaSessionCompat.g(new MediaMetadataCompat(zzo.a));
                    Uri zzn = zzn(metadata, 0);
                    if (zzn != null) {
                        this.zzj.zzd(zzn);
                    } else {
                        zzp(null, 0);
                    }
                    Uri zzn2 = zzn(metadata, 3);
                    if (zzn2 != null) {
                        this.zzk.zzd(zzn2);
                        return;
                    } else {
                        zzp(null, 3);
                        return;
                    }
                }
                return;
            }
            mediaSessionCompat2.g(new MediaMetadataCompat(new Bundle()));
        }
    }

    private static final boolean zzv(String str) {
        if (!TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) && !TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) && !TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
            return false;
        }
        return true;
    }

    public final void zzh(RemoteMediaClient remoteMediaClient, CastDevice castDevice) {
        CastMediaOptions castMediaOptions;
        AudioManager audioManager;
        CastOptions castOptions = this.zzd;
        if (castOptions == null) {
            castMediaOptions = null;
        } else {
            castMediaOptions = castOptions.getCastMediaOptions();
        }
        if (!this.zzt && this.zzd != null && castMediaOptions != null && this.zzg != null && remoteMediaClient != null && castDevice != null && this.zzi != null) {
            this.zzp = remoteMediaClient;
            remoteMediaClient.registerCallback(this.zzo);
            this.zzq = castDevice;
            if (!PlatformVersion.isAtLeastLollipop() && (audioManager = (AudioManager) this.zzc.getSystemService("audio")) != null) {
                audioManager.requestAudioFocus(null, 3, 3);
            }
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(this.zzi);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.zzc, 0, intent, zzdy.zza);
            if (castMediaOptions.getMediaSessionEnabled()) {
                MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(this.zzc, "CastMediaSession", this.zzi, broadcast, null);
                this.zzr = mediaSessionCompat;
                zzu(0, null);
                CastDevice castDevice2 = this.zzq;
                if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.getFriendlyName())) {
                    Bundle bundle = new Bundle();
                    String string = this.zzc.getResources().getString(R.string.cast_casting_to_device, this.zzq.getFriendlyName());
                    a<String, Integer> aVar = MediaMetadataCompat.e;
                    if (aVar.containsKey("android.media.metadata.ALBUM_ARTIST") && aVar.getOrDefault("android.media.metadata.ALBUM_ARTIST", null).intValue() != 1) {
                        throw new IllegalArgumentException(e.e("The ", "android.media.metadata.ALBUM_ARTIST", " key cannot be used to put a String"));
                    }
                    bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                    mediaSessionCompat.g(new MediaMetadataCompat(bundle));
                }
                zzs zzsVar = new zzs(this);
                this.zzs = zzsVar;
                mediaSessionCompat.f(zzsVar, null);
                mediaSessionCompat.e(true);
                this.zze.zzr(mediaSessionCompat);
            }
            this.zzt = true;
            zzl(false);
            return;
        }
        zzb.d("skip attaching media session", new Object[0]);
    }

    public final void zzi(int i) {
        AudioManager audioManager;
        if (this.zzt) {
            this.zzt = false;
            RemoteMediaClient remoteMediaClient = this.zzp;
            if (remoteMediaClient != null) {
                remoteMediaClient.unregisterCallback(this.zzo);
            }
            if (!PlatformVersion.isAtLeastLollipop() && (audioManager = (AudioManager) this.zzc.getSystemService("audio")) != null) {
                audioManager.abandonAudioFocus(null);
            }
            this.zze.zzr(null);
            zzb zzbVar = this.zzj;
            if (zzbVar != null) {
                zzbVar.zza();
            }
            zzb zzbVar2 = this.zzk;
            if (zzbVar2 != null) {
                zzbVar2.zza();
            }
            MediaSessionCompat mediaSessionCompat = this.zzr;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.f(null, null);
                this.zzr.g(new MediaMetadataCompat(new Bundle()));
                zzu(0, null);
            }
            MediaSessionCompat mediaSessionCompat2 = this.zzr;
            if (mediaSessionCompat2 != null) {
                mediaSessionCompat2.e(false);
                this.zzr.d();
                this.zzr = null;
            }
            this.zzp = null;
            this.zzq = null;
            this.zzs = null;
            zzs();
            if (i == 0) {
                zzt();
            }
        }
    }

    public final /* synthetic */ void zzj() {
        zzr(false);
    }

    public final void zzk(CastDevice castDevice) {
        zzb.i("update Cast device to %s", castDevice);
        this.zzq = castDevice;
        zzl(false);
    }

    public final void zzl(boolean z) {
        MediaQueueItem loadingItem;
        RemoteMediaClient remoteMediaClient = this.zzp;
        if (remoteMediaClient != null) {
            int zza2 = remoteMediaClient.zza();
            MediaInfo mediaInfo = remoteMediaClient.getMediaInfo();
            if (remoteMediaClient.isLoadingNextItem() && (loadingItem = remoteMediaClient.getLoadingItem()) != null && loadingItem.getMedia() != null) {
                mediaInfo = loadingItem.getMedia();
            }
            zzu(zza2, mediaInfo);
            if (!remoteMediaClient.hasMediaSession()) {
                zzs();
                zzt();
            } else if (zza2 != 0) {
                zzo zzoVar = this.zzl;
                if (zzoVar != null) {
                    zzb.d("Update media notification.", new Object[0]);
                    zzoVar.zzd(this.zzq, this.zzp, this.zzr, z);
                }
                if (!remoteMediaClient.isLoadingNextItem()) {
                    zzr(true);
                }
            }
        }
    }
}
