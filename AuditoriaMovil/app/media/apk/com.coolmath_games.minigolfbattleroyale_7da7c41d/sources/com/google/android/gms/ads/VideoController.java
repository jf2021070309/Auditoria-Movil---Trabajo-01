package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbir;
import com.google.android.gms.internal.ads.zzcgt;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes.dex */
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object zza = new Object();
    private zzbhc zzb;
    private VideoLifecycleCallbacks zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
    /* loaded from: classes.dex */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.zza) {
            videoLifecycleCallbacks = this.zzc;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z;
        synchronized (this.zza) {
            z = this.zzb != null;
        }
        return z;
    }

    public void mute(boolean z) {
        synchronized (this.zza) {
            zzbhc zzbhcVar = this.zzb;
            if (zzbhcVar != null) {
                try {
                    zzbhcVar.zzg(z);
                } catch (RemoteException e) {
                    zzcgt.zzg("Unable to call mute on video controller.", e);
                }
            }
        }
    }

    public void pause() {
        synchronized (this.zza) {
            zzbhc zzbhcVar = this.zzb;
            if (zzbhcVar != null) {
                try {
                    zzbhcVar.zzf();
                } catch (RemoteException e) {
                    zzcgt.zzg("Unable to call pause on video controller.", e);
                }
            }
        }
    }

    public void play() {
        synchronized (this.zza) {
            zzbhc zzbhcVar = this.zzb;
            if (zzbhcVar != null) {
                try {
                    zzbhcVar.zze();
                } catch (RemoteException e) {
                    zzcgt.zzg("Unable to call play on video controller.", e);
                }
            }
        }
    }

    public void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        Preconditions.checkNotNull(videoLifecycleCallbacks, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.zza) {
            this.zzc = videoLifecycleCallbacks;
            zzbhc zzbhcVar = this.zzb;
            if (zzbhcVar != null) {
                try {
                    zzbhcVar.zzl(new zzbir(videoLifecycleCallbacks));
                } catch (RemoteException e) {
                    zzcgt.zzg("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                }
            }
        }
    }

    public void stop() {
        synchronized (this.zza) {
            zzbhc zzbhcVar = this.zzb;
            if (zzbhcVar != null) {
                try {
                    zzbhcVar.zzq();
                } catch (RemoteException e) {
                    zzcgt.zzg("Unable to call stop on video controller.", e);
                }
            }
        }
    }

    public final void zza(zzbhc zzbhcVar) {
        synchronized (this.zza) {
            this.zzb = zzbhcVar;
            VideoLifecycleCallbacks videoLifecycleCallbacks = this.zzc;
            if (videoLifecycleCallbacks != null) {
                setVideoLifecycleCallbacks(videoLifecycleCallbacks);
            }
        }
    }

    public final zzbhc zzb() {
        zzbhc zzbhcVar;
        synchronized (this.zza) {
            zzbhcVar = this.zzb;
        }
        return zzbhcVar;
    }

    public int getPlaybackState() {
        synchronized (this.zza) {
            zzbhc zzbhcVar = this.zzb;
            if (zzbhcVar == null) {
                return 0;
            }
            try {
                return zzbhcVar.zzi();
            } catch (RemoteException e) {
                zzcgt.zzg("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.zza) {
            zzbhc zzbhcVar = this.zzb;
            if (zzbhcVar == null) {
                return false;
            }
            try {
                return zzbhcVar.zzp();
            } catch (RemoteException e) {
                zzcgt.zzg("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.zza) {
            zzbhc zzbhcVar = this.zzb;
            if (zzbhcVar == null) {
                return false;
            }
            try {
                return zzbhcVar.zzn();
            } catch (RemoteException e) {
                zzcgt.zzg("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.zza) {
            zzbhc zzbhcVar = this.zzb;
            if (zzbhcVar == null) {
                return true;
            }
            try {
                return zzbhcVar.zzh();
            } catch (RemoteException e) {
                zzcgt.zzg("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }
}
