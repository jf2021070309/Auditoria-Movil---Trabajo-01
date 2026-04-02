package com.google.android.gms.internal.cast_tv;

import android.content.Context;
import android.media.session.MediaController;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.MediaError;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public abstract class zzfj {
    private int zza = 1;
    final MediaControllerCompat.a zzb = new zzfh(this, null);
    public final zzfl zzc = new zzfl();
    public final zzfk zzd = new zzfk();
    private boolean zze;
    private final Context zzf;
    private MediaControllerCompat zzg;

    public zzfj(Context context, zzfi zzfiVar) {
        this.zzf = context;
    }

    public static /* bridge */ /* synthetic */ void zzM(zzfj zzfjVar, long j) {
        c cVar = new c();
        try {
            cVar.put("type", "INVALID_REQUEST");
            cVar.put("requestId", j);
        } catch (b unused) {
        }
        zzfjVar.zzI(null, cVar);
    }

    public static /* bridge */ /* synthetic */ void zzN(zzfj zzfjVar) {
        zzfjVar.zzb();
        zzfjVar.zzP(zzfjVar.zzj(), 0L);
    }

    private final c zza(String str) {
        c cVar = new c();
        try {
            cVar.put("mediaSessionId", this.zza);
            cVar.put("playerState", "IDLE");
            if (TextUtils.isEmpty(str)) {
                str = "FINISHED";
            }
            cVar.put("idleReason", str);
        } catch (b unused) {
        }
        return cVar;
    }

    private final void zzb() {
        MediaControllerCompat mediaControllerCompat = this.zzg;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.e(this.zzb);
            this.zzg = null;
        }
    }

    private final void zzc() {
        this.zza++;
        this.zze = false;
    }

    public void zzH(String str, c cVar, zzeq zzeqVar) {
        String optString = cVar.optString("type");
        long optLong = cVar.optLong("requestId");
        if (optString.isEmpty()) {
            zzdu.zzc(zzeqVar, 4);
        } else if (optString.equals("GET_STATUS")) {
            zzP(zzj(), optLong);
            zzdu.zzc(zzeqVar, 2);
        } else if (!optString.equals("LOAD") && !optString.equals("RESUME_SESSION") && !optString.equals("PLAY_AGAIN") && !optString.equals("STORE_SESSION") && this.zzg == null) {
            c cVar2 = new c();
            try {
                cVar2.put("type", MediaError.ERROR_TYPE_INVALID_PLAYER_STATE);
                cVar2.put("requestId", optLong);
            } catch (b unused) {
            }
            zzI(null, cVar2);
            zzdu.zzc(zzeqVar, 7);
        } else {
            zzn(str, cVar, new zzff(this, optLong, zzeqVar));
        }
    }

    public abstract void zzI(String str, c cVar);

    public final int zzL() {
        return this.zza;
    }

    public final void zzO(long j) {
        zzP(zzj(), j);
    }

    public final void zzP(c cVar, long j) {
        String str;
        boolean z = false;
        if (cVar != null) {
            String optString = cVar.optString("playerState");
            boolean has = cVar.has("loadingItemId");
            if (!TextUtils.equals(optString, "IDLE") || has) {
                z = true;
            }
        }
        if (!z) {
            if (this.zze) {
                if (cVar != null) {
                    str = cVar.optString("idleReason");
                } else {
                    str = null;
                }
                cVar = zza(str);
                zzc();
            } else {
                cVar = null;
            }
        }
        this.zze = z;
        zzI(null, zzfl.zza(j, cVar));
    }

    public final void zzQ(String str) {
        if (this.zze) {
            zzI(null, zzfl.zza(0L, zza("INTERRUPTED")));
        }
        zzc();
    }

    public final void zzR(String str, String str2, zzeq zzeqVar) {
        try {
            c cVar = new c(str2);
            zzdu.zza(cVar);
            zzH(str, cVar, zzeqVar);
        } catch (b unused) {
            "Failed to parse cast message: ".concat(String.valueOf(str2));
            zzdu.zzc(zzeqVar, 4);
        }
    }

    public final void zzS(MediaSessionCompat.Token token) {
        zzb();
        if (token != null) {
            MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(this.zzf, token);
            this.zzg = mediaControllerCompat;
            mediaControllerCompat.d(this.zzb);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int zzT(String str, c cVar) {
        boolean z;
        long j;
        MediaControllerCompat mediaControllerCompat = this.zzg;
        MediaControllerCompat.g c = mediaControllerCompat.c();
        PlaybackStateCompat b = mediaControllerCompat.b();
        String optString = cVar.optString("type");
        switch (optString.hashCode()) {
            case 2458420:
                if (optString.equals("PLAY")) {
                    z = false;
                    break;
                }
                z = true;
                break;
            case 2541176:
                if (optString.equals("SEEK")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 2555906:
                if (optString.equals("STOP")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 75902422:
                if (optString.equals("PAUSE")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 677201879:
                if (optString.equals("QUEUE_UPDATE")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            default:
                z = true;
                break;
        }
        MediaController.TransportControls transportControls = c.a;
        if (z) {
            if (!z) {
                if (!z) {
                    if (!z) {
                        if (z && !cVar.has("currentItemId")) {
                            int optInt = cVar.optInt("jump");
                            if (optInt != -1) {
                                if (optInt != 0) {
                                    if (optInt == 1) {
                                        transportControls.skipToNext();
                                    }
                                }
                            } else {
                                transportControls.skipToPrevious();
                            }
                        }
                        return 5;
                    }
                    transportControls.stop();
                    return 2;
                }
                double optDouble = cVar.optDouble("relativeTime");
                double optDouble2 = cVar.optDouble("currentTime");
                if (!Double.isNaN(optDouble)) {
                    j = (long) ((optDouble * 1000.0d) + zzfl.zzb(b.c, b.i, b.e));
                } else if (Double.isNaN(optDouble2)) {
                    return 4;
                } else {
                    j = (long) (optDouble2 * 1000.0d);
                }
                transportControls.seekTo(j);
                String optString2 = cVar.optString("resumeState");
                optString2.getClass();
                if (!optString2.equals("PLAYBACK_START")) {
                    if (optString2.equals("PLAYBACK_PAUSE")) {
                        transportControls.pause();
                    }
                } else {
                    transportControls.play();
                }
                return 2;
            }
            transportControls.pause();
            return 2;
        }
        transportControls.play();
        return 2;
    }

    public c zzj() {
        return zzfl.zzc(this.zzg, this.zza);
    }

    public void zzn(String str, c cVar, zzeq zzeqVar) {
        throw null;
    }
}
