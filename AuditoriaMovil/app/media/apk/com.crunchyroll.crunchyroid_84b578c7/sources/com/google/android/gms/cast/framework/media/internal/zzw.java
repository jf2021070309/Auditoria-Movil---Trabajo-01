package com.google.android.gms.cast.framework.media.internal;

import android.os.RemoteException;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.internal.Logger;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzw {
    private static final Logger zza = new Logger("MediaSessionUtils");

    public static int zza(NotificationOptions notificationOptions, long j) {
        int i = (j > NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS ? 1 : (j == NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS ? 0 : -1));
        int forwardDrawableResId = notificationOptions.getForwardDrawableResId();
        if (i == 0) {
            return notificationOptions.getForward10DrawableResId();
        }
        if (j != NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS) {
            return forwardDrawableResId;
        }
        return notificationOptions.getForward30DrawableResId();
    }

    public static int zzb(NotificationOptions notificationOptions, long j) {
        int i = (j > NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS ? 1 : (j == NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS ? 0 : -1));
        int zzd = notificationOptions.zzd();
        if (i == 0) {
            return notificationOptions.zzb();
        }
        if (j != NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS) {
            return zzd;
        }
        return notificationOptions.zzc();
    }

    public static int zzc(NotificationOptions notificationOptions, long j) {
        int i = (j > NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS ? 1 : (j == NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS ? 0 : -1));
        int rewindDrawableResId = notificationOptions.getRewindDrawableResId();
        if (i == 0) {
            return notificationOptions.getRewind10DrawableResId();
        }
        if (j != NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS) {
            return rewindDrawableResId;
        }
        return notificationOptions.getRewind30DrawableResId();
    }

    public static int zzd(NotificationOptions notificationOptions, long j) {
        int i = (j > NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS ? 1 : (j == NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS ? 0 : -1));
        int zzj = notificationOptions.zzj();
        if (i == 0) {
            return notificationOptions.zzh();
        }
        if (j != NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS) {
            return zzj;
        }
        return notificationOptions.zzi();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r1 != 4) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r4.containsKey(com.google.android.gms.cast.MediaMetadata.KEY_COMPOSER) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String zze(com.google.android.gms.cast.MediaMetadata r4) {
        /*
            java.lang.String r0 = "com.google.android.gms.cast.metadata.SUBTITLE"
            boolean r1 = r4.containsKey(r0)
            if (r1 != 0) goto L3c
            int r1 = r4.getMediaType()
            r2 = 1
            if (r1 == r2) goto L3a
            r2 = 2
            if (r1 == r2) goto L37
            r2 = 3
            java.lang.String r3 = "com.google.android.gms.cast.metadata.ARTIST"
            if (r1 == r2) goto L1d
            r2 = 4
            if (r1 == r2) goto L1b
            goto L3c
        L1b:
            r0 = r3
            goto L3c
        L1d:
            boolean r1 = r4.containsKey(r3)
            if (r1 == 0) goto L24
            goto L1b
        L24:
            java.lang.String r1 = "com.google.android.gms.cast.metadata.ALBUM_ARTIST"
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L2e
        L2c:
            r0 = r1
            goto L3c
        L2e:
            java.lang.String r1 = "com.google.android.gms.cast.metadata.COMPOSER"
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L3c
            goto L2c
        L37:
            java.lang.String r0 = "com.google.android.gms.cast.metadata.SERIES_TITLE"
            goto L3c
        L3a:
            java.lang.String r0 = "com.google.android.gms.cast.metadata.STUDIO"
        L3c:
            java.lang.String r4 = r4.getString(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.internal.zzw.zze(com.google.android.gms.cast.MediaMetadata):java.lang.String");
    }

    public static List zzf(com.google.android.gms.cast.framework.media.zzg zzgVar) {
        try {
            return zzgVar.zzf();
        } catch (RemoteException e) {
            zza.e(e, "Unable to call %s on %s.", "getNotificationActions", "zzg");
            return null;
        }
    }

    public static int[] zzg(com.google.android.gms.cast.framework.media.zzg zzgVar) {
        try {
            return zzgVar.zzg();
        } catch (RemoteException e) {
            zza.e(e, "Unable to call %s on %s.", "getCompactViewActionIndices", "zzg");
            return null;
        }
    }
}
