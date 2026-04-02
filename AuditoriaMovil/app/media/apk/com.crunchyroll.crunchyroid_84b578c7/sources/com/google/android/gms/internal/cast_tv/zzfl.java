package com.google.android.gms.internal.cast_tv;

import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.internal.ImagesContract;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzfl {
    public static final c zza(long j, c cVar) {
        c cVar2 = new c();
        zzd(cVar2, "requestId", Long.valueOf(j));
        zzd(cVar2, "type", "MEDIA_STATUS");
        a aVar = new a();
        if (cVar != null) {
            aVar.put(cVar);
        }
        zzd(cVar2, "status", aVar);
        return cVar2;
    }

    public static final double zzb(long j, long j2, double d) {
        return Math.max(0L, j + ((long) ((SystemClock.elapsedRealtime() - j2) * d)));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.amazon.aps.iva.if0.c zzc(android.support.v4.media.session.MediaControllerCompat r10, int r11) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast_tv.zzfl.zzc(android.support.v4.media.session.MediaControllerCompat, int):com.amazon.aps.iva.if0.c");
    }

    private static void zzd(c cVar, String str, Object obj) {
        try {
            cVar.putOpt(str, obj);
        } catch (b unused) {
            String.valueOf(obj);
        }
    }

    private static final c zze(MediaMetadataCompat mediaMetadataCompat) {
        c cVar = new c();
        String c = mediaMetadataCompat.c("android.media.metadata.MEDIA_ID");
        if (c == null) {
            c = mediaMetadataCompat.c("android.media.metadata.MEDIA_URI");
        }
        if (c == null) {
            c = "";
        }
        zzd(cVar, "contentId", c);
        zzd(cVar, "streamType", "BUFFERED");
        zzd(cVar, "duration", Double.valueOf(mediaMetadataCompat.b.getLong("android.media.metadata.DURATION", 0L) / 1000.0d));
        c cVar2 = new c();
        zzd(cVar2, "metadataType", 0);
        String c2 = mediaMetadataCompat.c("android.media.metadata.DISPLAY_TITLE");
        if (c2 == null) {
            c2 = mediaMetadataCompat.c("android.media.metadata.TITLE");
        }
        zzd(cVar2, "title", c2);
        zzd(cVar2, MediaTrack.ROLE_SUBTITLE, mediaMetadataCompat.c("android.media.metadata.DISPLAY_SUBTITLE"));
        zzd(cVar2, "artist", mediaMetadataCompat.c("android.media.metadata.ARTIST"));
        zzd(cVar2, "albumName", mediaMetadataCompat.c("android.media.metadata.ALBUM"));
        String c3 = mediaMetadataCompat.c("android.media.metadata.DISPLAY_ICON_URI");
        if (c3 != null) {
            try {
                c cVar3 = new c();
                cVar3.put(ImagesContract.URL, c3);
                a aVar = new a();
                aVar.put(cVar3);
                cVar2.put("images", aVar);
            } catch (b unused) {
            }
        }
        zzd(cVar, "metadata", cVar2);
        return cVar;
    }
}
