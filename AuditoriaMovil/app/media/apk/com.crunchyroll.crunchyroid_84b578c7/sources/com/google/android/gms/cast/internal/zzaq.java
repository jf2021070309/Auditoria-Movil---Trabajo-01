package com.google.android.gms.cast.internal;

import android.os.SystemClock;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.q.c0;
import com.google.android.gms.cast.AdBreakStatus;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaSeekOptions;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.internal.media.MediaCommon;
import com.google.android.gms.cast.tv.media.SeekRequestData;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzaq extends zzd {
    public static final String zzb;
    final zzau zzc;
    final zzau zzd;
    final zzau zze;
    final zzau zzf;
    final zzau zzg;
    final zzau zzh;
    final zzau zzi;
    final zzau zzj;
    final zzau zzk;
    final zzau zzl;
    final zzau zzm;
    final zzau zzn;
    final zzau zzo;
    final zzau zzp;
    final zzau zzq;
    final zzau zzr;
    final zzau zzs;
    final zzau zzt;
    final zzau zzu;
    private long zzv;
    private MediaStatus zzw;
    private Long zzx;
    private zzan zzy;
    private int zzz;

    static {
        int i = CastUtils.zza;
        zzb = "urn:x-cast:com.google.cast.media";
    }

    public zzaq(String str) {
        super(zzb, "MediaControlChannel", null);
        this.zzz = -1;
        zzau zzauVar = new zzau(86400000L, "load");
        this.zzc = zzauVar;
        zzau zzauVar2 = new zzau(86400000L, "pause");
        this.zzd = zzauVar2;
        zzau zzauVar3 = new zzau(86400000L, "play");
        this.zze = zzauVar3;
        zzau zzauVar4 = new zzau(86400000L, "stop");
        this.zzf = zzauVar4;
        zzau zzauVar5 = new zzau(NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS, "seek");
        this.zzg = zzauVar5;
        zzau zzauVar6 = new zzau(86400000L, "volume");
        this.zzh = zzauVar6;
        zzau zzauVar7 = new zzau(86400000L, "mute");
        this.zzi = zzauVar7;
        zzau zzauVar8 = new zzau(86400000L, "status");
        this.zzj = zzauVar8;
        zzau zzauVar9 = new zzau(86400000L, "activeTracks");
        this.zzk = zzauVar9;
        zzau zzauVar10 = new zzau(86400000L, "trackStyle");
        this.zzl = zzauVar10;
        zzau zzauVar11 = new zzau(86400000L, "queueInsert");
        this.zzm = zzauVar11;
        zzau zzauVar12 = new zzau(86400000L, "queueUpdate");
        this.zzn = zzauVar12;
        zzau zzauVar13 = new zzau(86400000L, "queueRemove");
        this.zzo = zzauVar13;
        zzau zzauVar14 = new zzau(86400000L, "queueReorder");
        this.zzp = zzauVar14;
        zzau zzauVar15 = new zzau(86400000L, "queueFetchItemIds");
        this.zzq = zzauVar15;
        zzau zzauVar16 = new zzau(86400000L, "queueFetchItemRange");
        this.zzs = zzauVar16;
        this.zzr = new zzau(86400000L, "queueFetchItems");
        zzau zzauVar17 = new zzau(86400000L, "setPlaybackRate");
        this.zzt = zzauVar17;
        zzau zzauVar18 = new zzau(86400000L, "skipAd");
        this.zzu = zzauVar18;
        zzc(zzauVar);
        zzc(zzauVar2);
        zzc(zzauVar3);
        zzc(zzauVar4);
        zzc(zzauVar5);
        zzc(zzauVar6);
        zzc(zzauVar7);
        zzc(zzauVar8);
        zzc(zzauVar9);
        zzc(zzauVar10);
        zzc(zzauVar11);
        zzc(zzauVar12);
        zzc(zzauVar13);
        zzc(zzauVar14);
        zzc(zzauVar15);
        zzc(zzauVar16);
        zzc(zzauVar16);
        zzc(zzauVar17);
        zzc(zzauVar18);
        zzT();
    }

    private final long zzR(double d, long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzv;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j;
        }
        long j3 = j + ((long) (elapsedRealtime * d));
        if (j2 <= 0 || j3 <= j2) {
            if (j3 < 0) {
                return 0L;
            }
            return j3;
        }
        return j2;
    }

    private static zzap zzS(c cVar) {
        c cVar2;
        MediaError zza = MediaError.zza(cVar);
        zzap zzapVar = new zzap();
        int i = CastUtils.zza;
        if (cVar.has("customData")) {
            cVar2 = cVar.optJSONObject("customData");
        } else {
            cVar2 = null;
        }
        zzapVar.zza = cVar2;
        zzapVar.zzb = zza;
        return zzapVar;
    }

    private final void zzT() {
        this.zzv = 0L;
        this.zzw = null;
        for (zzau zzauVar : zza()) {
            zzauVar.zzc(CastStatusCodes.CANCELED);
        }
    }

    private final void zzU(c cVar, String str) {
        if (cVar.has("sequenceNumber")) {
            this.zzz = cVar.optInt("sequenceNumber", -1);
        } else {
            this.zza.w(str.concat(" message is missing a sequence number."), new Object[0]);
        }
    }

    private final void zzV() {
        zzan zzanVar = this.zzy;
        if (zzanVar != null) {
            zzanVar.zzc();
        }
    }

    private final void zzW() {
        zzan zzanVar = this.zzy;
        if (zzanVar != null) {
            zzanVar.zzd();
        }
    }

    private final void zzX() {
        zzan zzanVar = this.zzy;
        if (zzanVar != null) {
            zzanVar.zzk();
        }
    }

    private final void zzY() {
        zzan zzanVar = this.zzy;
        if (zzanVar != null) {
            zzanVar.zzm();
        }
    }

    private final boolean zzZ() {
        if (this.zzz != -1) {
            return true;
        }
        return false;
    }

    private static int[] zzaa(a aVar) throws b {
        int parseInt;
        if (aVar == null) {
            return null;
        }
        int[] iArr = new int[aVar.e()];
        for (int i = 0; i < aVar.e(); i++) {
            Object obj = aVar.get(i);
            try {
                if (obj instanceof Number) {
                    parseInt = ((Number) obj).intValue();
                } else {
                    parseInt = Integer.parseInt((String) obj);
                }
                iArr[i] = parseInt;
            } catch (Exception e) {
                throw new b(com.amazon.aps.iva.c80.a.d("JSONArray[", i, "] is not a number."), e);
            }
        }
        return iArr;
    }

    public final long zzA(zzas zzasVar, int i, long j, MediaQueueItem[] mediaQueueItemArr, int i2, Boolean bool, Integer num, c cVar) throws IllegalArgumentException, IllegalStateException, zzao {
        int i3 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        if (i3 != 0 && j < 0) {
            throw new IllegalArgumentException(j0.f("playPosition cannot be negative: ", j));
        }
        c cVar2 = new c();
        long zzd = zzd();
        try {
            cVar2.put("requestId", zzd);
            cVar2.put("type", "QUEUE_UPDATE");
            cVar2.put("mediaSessionId", zzn());
            if (i != 0) {
                cVar2.put("currentItemId", i);
            }
            if (i2 != 0) {
                cVar2.put("jump", i2);
            }
            if (mediaQueueItemArr != null && mediaQueueItemArr.length > 0) {
                a aVar = new a();
                for (int i4 = 0; i4 < mediaQueueItemArr.length; i4++) {
                    aVar.o(i4, mediaQueueItemArr[i4].toJson());
                }
                cVar2.put(FirebaseAnalytics.Param.ITEMS, aVar);
            }
            if (bool != null) {
                cVar2.put("shuffle", bool);
            }
            String zza = MediaCommon.zza(num);
            if (zza != null) {
                cVar2.put("repeatMode", zza);
            }
            if (i3 != 0) {
                cVar2.put("currentTime", CastUtils.millisecToSec(j));
            }
            if (cVar != null) {
                cVar2.put("customData", cVar);
            }
            if (zzZ()) {
                cVar2.put("sequenceNumber", this.zzz);
            }
        } catch (b unused) {
        }
        zzg(cVar2.toString(), zzd, null);
        this.zzn.zzb(zzd, new zzam(this, zzasVar));
        return zzd;
    }

    public final long zzB(zzas zzasVar) throws IllegalStateException {
        c cVar = new c();
        long zzd = zzd();
        try {
            cVar.put("requestId", zzd);
            cVar.put("type", "GET_STATUS");
            MediaStatus mediaStatus = this.zzw;
            if (mediaStatus != null) {
                cVar.put("mediaSessionId", mediaStatus.zzb());
            }
        } catch (b unused) {
        }
        zzg(cVar.toString(), zzd, null);
        this.zzj.zzb(zzd, zzasVar);
        return zzd;
    }

    public final long zzC(zzas zzasVar, MediaSeekOptions mediaSeekOptions) throws IllegalStateException, zzao {
        long position;
        c cVar = new c();
        long zzd = zzd();
        if (mediaSeekOptions.isSeekToInfinite()) {
            position = SeekRequestData.SEEK_POSITION_INFINITE_MS;
        } else {
            position = mediaSeekOptions.getPosition();
        }
        try {
            cVar.put("requestId", zzd);
            cVar.put("type", "SEEK");
            cVar.put("mediaSessionId", zzn());
            cVar.put("currentTime", CastUtils.millisecToSec(position));
            if (mediaSeekOptions.getResumeState() == 1) {
                cVar.put("resumeState", "PLAYBACK_START");
            } else if (mediaSeekOptions.getResumeState() == 2) {
                cVar.put("resumeState", "PLAYBACK_PAUSE");
            }
            if (mediaSeekOptions.getCustomData() != null) {
                cVar.put("customData", mediaSeekOptions.getCustomData());
            }
        } catch (b unused) {
        }
        zzg(cVar.toString(), zzd, null);
        this.zzx = Long.valueOf(position);
        this.zzg.zzb(zzd, new zzal(this, zzasVar));
        return zzd;
    }

    public final long zzD(zzas zzasVar, long[] jArr) throws IllegalStateException, zzao {
        if (jArr != null) {
            c cVar = new c();
            long zzd = zzd();
            try {
                cVar.put("requestId", zzd);
                cVar.put("type", "EDIT_TRACKS_INFO");
                cVar.put("mediaSessionId", zzn());
                a aVar = new a();
                for (int i = 0; i < jArr.length; i++) {
                    aVar.o(i, new Long(jArr[i]));
                }
                cVar.put("activeTrackIds", aVar);
            } catch (b unused) {
            }
            zzg(cVar.toString(), zzd, null);
            this.zzk.zzb(zzd, zzasVar);
            return zzd;
        }
        throw new IllegalArgumentException("trackIds cannot be null");
    }

    public final long zzE(zzas zzasVar, double d, c cVar) throws IllegalStateException, zzao {
        if (this.zzw != null) {
            c cVar2 = new c();
            long zzd = zzd();
            try {
                cVar2.put("requestId", zzd);
                cVar2.put("type", "SET_PLAYBACK_RATE");
                cVar2.put("playbackRate", d);
                Preconditions.checkNotNull(this.zzw, "mediaStatus should not be null");
                cVar2.put("mediaSessionId", this.zzw.zzb());
                if (cVar != null) {
                    cVar2.put("customData", cVar);
                }
            } catch (b unused) {
            }
            zzg(cVar2.toString(), zzd, null);
            this.zzt.zzb(zzd, zzasVar);
            return zzd;
        }
        throw new zzao();
    }

    public final long zzF(zzas zzasVar, boolean z, c cVar) throws IllegalStateException, zzao {
        c cVar2 = new c();
        long zzd = zzd();
        try {
            cVar2.put("requestId", zzd);
            cVar2.put("type", "SET_VOLUME");
            cVar2.put("mediaSessionId", zzn());
            c cVar3 = new c();
            cVar3.put("muted", z);
            cVar2.put("volume", cVar3);
            if (cVar != null) {
                cVar2.put("customData", cVar);
            }
        } catch (b unused) {
        }
        zzg(cVar2.toString(), zzd, null);
        this.zzi.zzb(zzd, zzasVar);
        return zzd;
    }

    public final long zzG(zzas zzasVar, double d, c cVar) throws IllegalStateException, zzao, IllegalArgumentException {
        if (!Double.isInfinite(d) && !Double.isNaN(d)) {
            c cVar2 = new c();
            long zzd = zzd();
            try {
                cVar2.put("requestId", zzd);
                cVar2.put("type", "SET_VOLUME");
                cVar2.put("mediaSessionId", zzn());
                c cVar3 = new c();
                cVar3.put(FirebaseAnalytics.Param.LEVEL, d);
                cVar2.put("volume", cVar3);
                if (cVar != null) {
                    cVar2.put("customData", cVar);
                }
            } catch (b unused) {
            }
            zzg(cVar2.toString(), zzd, null);
            this.zzh.zzb(zzd, zzasVar);
            return zzd;
        }
        throw new IllegalArgumentException("Volume cannot be " + d);
    }

    public final long zzH(zzas zzasVar, TextTrackStyle textTrackStyle) throws IllegalStateException, zzao {
        if (textTrackStyle != null) {
            c cVar = new c();
            long zzd = zzd();
            try {
                cVar.put("requestId", zzd);
                cVar.put("type", "EDIT_TRACKS_INFO");
                cVar.put("textTrackStyle", textTrackStyle.zza());
                cVar.put("mediaSessionId", zzn());
            } catch (b unused) {
            }
            zzg(cVar.toString(), zzd, null);
            this.zzl.zzb(zzd, zzasVar);
            return zzd;
        }
        throw new IllegalArgumentException("trackStyle cannot be null");
    }

    public final long zzI(zzas zzasVar) throws IllegalStateException, zzao {
        c cVar = new c();
        long zzd = zzd();
        try {
            cVar.put("requestId", zzd);
            cVar.put("type", "SKIP_AD");
            cVar.put("mediaSessionId", zzn());
        } catch (b e) {
            this.zza.w(String.format(Locale.ROOT, "Error creating SkipAd message: %s", e.getMessage()), new Object[0]);
        }
        zzg(cVar.toString(), zzd, null);
        this.zzu.zzb(zzd, zzasVar);
        return zzd;
    }

    public final long zzJ(zzas zzasVar, c cVar) throws IllegalStateException, zzao {
        c cVar2 = new c();
        long zzd = zzd();
        try {
            cVar2.put("requestId", zzd);
            cVar2.put("type", "STOP");
            cVar2.put("mediaSessionId", zzn());
            if (cVar != null) {
                cVar2.put("customData", cVar);
            }
        } catch (b unused) {
        }
        zzg(cVar2.toString(), zzd, null);
        this.zzf.zzb(zzd, zzasVar);
        return zzd;
    }

    public final MediaInfo zzK() {
        MediaStatus mediaStatus = this.zzw;
        if (mediaStatus == null) {
            return null;
        }
        return mediaStatus.getMediaInfo();
    }

    public final MediaStatus zzL() {
        return this.zzw;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0258, code lost:
        r3 = r16.zzw;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x025a, code lost:
        if (r3 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x025d, code lost:
        r0 = r3.zza(r0, r14);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzO(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.internal.zzaq.zzO(java.lang.String):void");
    }

    public final void zzP(long j, int i) {
        for (zzau zzauVar : zza()) {
            zzauVar.zzd(j, i, null);
        }
    }

    public final void zzQ(zzan zzanVar) {
        this.zzy = zzanVar;
    }

    @Override // com.google.android.gms.cast.internal.zzp
    public final void zzf() {
        zzb();
        zzT();
    }

    public final long zzj() {
        MediaStatus mediaStatus;
        AdBreakStatus adBreakStatus;
        double d;
        if (this.zzv == 0 || (mediaStatus = this.zzw) == null || (adBreakStatus = mediaStatus.getAdBreakStatus()) == null) {
            return 0L;
        }
        double playbackRate = mediaStatus.getPlaybackRate();
        if (playbackRate == 0.0d) {
            playbackRate = 1.0d;
        }
        if (mediaStatus.getPlayerState() != 2) {
            d = 0.0d;
        } else {
            d = playbackRate;
        }
        return zzR(d, adBreakStatus.getCurrentBreakClipTimeInMs(), 0L);
    }

    public final long zzk() {
        MediaLiveSeekableRange liveSeekableRange;
        MediaStatus mediaStatus = this.zzw;
        if (mediaStatus == null || (liveSeekableRange = mediaStatus.getLiveSeekableRange()) == null) {
            return 0L;
        }
        long endTime = liveSeekableRange.getEndTime();
        if (!liveSeekableRange.isLiveDone()) {
            return zzR(1.0d, endTime, -1L);
        }
        return endTime;
    }

    public final long zzl() {
        MediaLiveSeekableRange liveSeekableRange;
        MediaStatus mediaStatus = this.zzw;
        if (mediaStatus == null || (liveSeekableRange = mediaStatus.getLiveSeekableRange()) == null) {
            return 0L;
        }
        long startTime = liveSeekableRange.getStartTime();
        if (liveSeekableRange.isMovingWindow()) {
            startTime = zzR(1.0d, startTime, -1L);
        }
        if (liveSeekableRange.isLiveDone()) {
            return Math.min(startTime, liveSeekableRange.getEndTime());
        }
        return startTime;
    }

    public final long zzm() {
        MediaStatus mediaStatus;
        MediaInfo zzK = zzK();
        if (zzK == null || (mediaStatus = this.zzw) == null) {
            return 0L;
        }
        Long l = this.zzx;
        if (l != null) {
            if (l.equals(Long.valueOf((long) SeekRequestData.SEEK_POSITION_INFINITE_MS))) {
                if (this.zzw.getLiveSeekableRange() != null) {
                    return Math.min(l.longValue(), zzk());
                }
                if (zzo() >= 0) {
                    return Math.min(l.longValue(), zzo());
                }
            }
            return l.longValue();
        } else if (this.zzv == 0) {
            return 0L;
        } else {
            double playbackRate = mediaStatus.getPlaybackRate();
            long streamPosition = mediaStatus.getStreamPosition();
            int playerState = mediaStatus.getPlayerState();
            if (playbackRate != 0.0d && playerState == 2) {
                return zzR(playbackRate, streamPosition, zzK.getStreamDuration());
            }
            return streamPosition;
        }
    }

    public final long zzn() throws zzao {
        MediaStatus mediaStatus = this.zzw;
        if (mediaStatus != null) {
            return mediaStatus.zzb();
        }
        throw new zzao();
    }

    public final long zzo() {
        MediaInfo zzK = zzK();
        if (zzK != null) {
            return zzK.getStreamDuration();
        }
        return 0L;
    }

    public final long zzp(zzas zzasVar, MediaLoadRequestData mediaLoadRequestData) throws IllegalStateException, IllegalArgumentException {
        if (mediaLoadRequestData.getMediaInfo() == null && mediaLoadRequestData.getQueueData() == null) {
            throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
        }
        c json = mediaLoadRequestData.toJson();
        if (json != null) {
            long zzd = zzd();
            try {
                json.put("requestId", zzd);
                json.put("type", "LOAD");
            } catch (b unused) {
            }
            zzg(json.toString(), zzd, null);
            this.zzc.zzb(zzd, zzasVar);
            return zzd;
        }
        throw new IllegalArgumentException("Failed to jsonify the load request due to malformed request");
    }

    public final long zzq(zzas zzasVar, c cVar) throws IllegalStateException, zzao {
        c cVar2 = new c();
        long zzd = zzd();
        try {
            cVar2.put("requestId", zzd);
            cVar2.put("type", "PAUSE");
            cVar2.put("mediaSessionId", zzn());
            if (cVar != null) {
                cVar2.put("customData", cVar);
            }
        } catch (b unused) {
        }
        zzg(cVar2.toString(), zzd, null);
        this.zzd.zzb(zzd, zzasVar);
        return zzd;
    }

    public final long zzr(zzas zzasVar, c cVar) throws IllegalStateException, zzao {
        c cVar2 = new c();
        long zzd = zzd();
        try {
            cVar2.put("requestId", zzd);
            cVar2.put("type", "PLAY");
            cVar2.put("mediaSessionId", zzn());
            if (cVar != null) {
                cVar2.put("customData", cVar);
            }
        } catch (b unused) {
        }
        zzg(cVar2.toString(), zzd, null);
        this.zze.zzb(zzd, zzasVar);
        return zzd;
    }

    public final long zzs(String str, List list) throws IllegalStateException {
        long zzd = zzd();
        c cVar = new c();
        try {
            cVar.put("requestId", zzd);
            cVar.put("type", "PRECACHE");
            cVar.put("precacheData", str);
        } catch (b unused) {
        }
        zzg(cVar.toString(), zzd, null);
        return zzd;
    }

    public final long zzt(zzas zzasVar, int i, int i2, int i3) throws zzao, IllegalArgumentException {
        if (i2 > 0 && i3 == 0) {
            i3 = 0;
        } else if (i2 != 0 || i3 <= 0) {
            throw new IllegalArgumentException("Exactly one of nextCount and prevCount must be positive and the other must be zero");
        }
        c cVar = new c();
        long zzd = zzd();
        try {
            cVar.put("requestId", zzd);
            cVar.put("type", "QUEUE_GET_ITEM_RANGE");
            cVar.put("mediaSessionId", zzn());
            cVar.put("itemId", i);
            if (i2 > 0) {
                cVar.put("nextCount", i2);
            }
            if (i3 > 0) {
                cVar.put("prevCount", i3);
            }
        } catch (b unused) {
        }
        zzg(cVar.toString(), zzd, null);
        this.zzs.zzb(zzd, zzasVar);
        return zzd;
    }

    public final long zzu(zzas zzasVar) throws zzao, IllegalStateException {
        c cVar = new c();
        long zzd = zzd();
        try {
            cVar.put("requestId", zzd);
            cVar.put("type", "QUEUE_GET_ITEM_IDS");
            cVar.put("mediaSessionId", zzn());
        } catch (b unused) {
        }
        zzg(cVar.toString(), zzd, null);
        this.zzq.zzb(zzd, zzasVar);
        return zzd;
    }

    public final long zzv(zzas zzasVar, int[] iArr) throws zzao, IllegalArgumentException {
        c cVar = new c();
        long zzd = zzd();
        try {
            cVar.put("requestId", zzd);
            cVar.put("type", "QUEUE_GET_ITEMS");
            cVar.put("mediaSessionId", zzn());
            a aVar = new a();
            for (int i : iArr) {
                aVar.put(new Integer(i));
            }
            cVar.put("itemIds", aVar);
        } catch (b unused) {
        }
        zzg(cVar.toString(), zzd, null);
        this.zzr.zzb(zzd, zzasVar);
        return zzd;
    }

    public final long zzw(zzas zzasVar, MediaQueueItem[] mediaQueueItemArr, int i, int i2, int i3, long j, c cVar) throws IllegalStateException, zzao, IllegalArgumentException {
        if (mediaQueueItemArr != null && mediaQueueItemArr.length != 0) {
            int i4 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            if (i4 != 0 && j < 0) {
                throw new IllegalArgumentException(j0.f("playPosition can not be negative: ", j));
            }
            c cVar2 = new c();
            long zzd = zzd();
            try {
                cVar2.put("requestId", zzd);
                cVar2.put("type", "QUEUE_INSERT");
                cVar2.put("mediaSessionId", zzn());
                a aVar = new a();
                for (int i5 = 0; i5 < mediaQueueItemArr.length; i5++) {
                    aVar.o(i5, mediaQueueItemArr[i5].toJson());
                }
                cVar2.put(FirebaseAnalytics.Param.ITEMS, aVar);
                if (i != 0) {
                    cVar2.put("insertBefore", i);
                }
                if (i3 != -1) {
                    cVar2.put("currentItemIndex", 0);
                }
                if (i4 != 0) {
                    cVar2.put("currentTime", CastUtils.millisecToSec(j));
                }
                if (cVar != null) {
                    cVar2.put("customData", cVar);
                }
                if (zzZ()) {
                    cVar2.put("sequenceNumber", this.zzz);
                }
            } catch (b unused) {
            }
            zzg(cVar2.toString(), zzd, null);
            this.zzm.zzb(zzd, new zzam(this, zzasVar));
            return zzd;
        }
        throw new IllegalArgumentException("itemsToInsert must not be null or empty.");
    }

    public final long zzx(zzas zzasVar, MediaQueueItem[] mediaQueueItemArr, int i, int i2, long j, c cVar) throws IllegalStateException, IllegalArgumentException {
        int length;
        String zza;
        if (mediaQueueItemArr != null && (length = mediaQueueItemArr.length) != 0) {
            if (i >= 0 && i < length) {
                int i3 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
                if (i3 != 0 && j < 0) {
                    throw new IllegalArgumentException(j0.f("playPosition can not be negative: ", j));
                }
                c cVar2 = new c();
                long zzd = zzd();
                this.zzc.zzb(zzd, zzasVar);
                try {
                    cVar2.put("requestId", zzd);
                    cVar2.put("type", "QUEUE_LOAD");
                    a aVar = new a();
                    for (int i4 = 0; i4 < mediaQueueItemArr.length; i4++) {
                        aVar.o(i4, mediaQueueItemArr[i4].toJson());
                    }
                    cVar2.put(FirebaseAnalytics.Param.ITEMS, aVar);
                    zza = MediaCommon.zza(Integer.valueOf(i2));
                } catch (b unused) {
                }
                if (zza != null) {
                    cVar2.put("repeatMode", zza);
                    cVar2.put("startIndex", i);
                    if (i3 != 0) {
                        cVar2.put("currentTime", CastUtils.millisecToSec(j));
                    }
                    if (cVar != null) {
                        cVar2.put("customData", cVar);
                    }
                    if (zzZ()) {
                        cVar2.put("sequenceNumber", this.zzz);
                    }
                    zzg(cVar2.toString(), zzd, null);
                    return zzd;
                }
                throw new IllegalArgumentException("Invalid repeat mode: " + i2);
            }
            throw new IllegalArgumentException(c0.a("Invalid startIndex: ", i));
        }
        throw new IllegalArgumentException("items must not be null or empty.");
    }

    public final long zzy(zzas zzasVar, int[] iArr, c cVar) throws IllegalStateException, zzao, IllegalArgumentException {
        if (iArr != null && iArr.length != 0) {
            c cVar2 = new c();
            long zzd = zzd();
            try {
                cVar2.put("requestId", zzd);
                cVar2.put("type", "QUEUE_REMOVE");
                cVar2.put("mediaSessionId", zzn());
                a aVar = new a();
                for (int i = 0; i < iArr.length; i++) {
                    aVar.o(i, new Integer(iArr[i]));
                }
                cVar2.put("itemIds", aVar);
                if (cVar != null) {
                    cVar2.put("customData", cVar);
                }
                if (zzZ()) {
                    cVar2.put("sequenceNumber", this.zzz);
                }
            } catch (b unused) {
            }
            zzg(cVar2.toString(), zzd, null);
            this.zzo.zzb(zzd, new zzam(this, zzasVar));
            return zzd;
        }
        throw new IllegalArgumentException("itemIdsToRemove must not be null or empty.");
    }

    public final long zzz(zzas zzasVar, int[] iArr, int i, c cVar) throws IllegalStateException, zzao, IllegalArgumentException {
        if (iArr != null && iArr.length != 0) {
            c cVar2 = new c();
            long zzd = zzd();
            try {
                cVar2.put("requestId", zzd);
                cVar2.put("type", "QUEUE_REORDER");
                cVar2.put("mediaSessionId", zzn());
                a aVar = new a();
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    aVar.o(i2, new Integer(iArr[i2]));
                }
                cVar2.put("itemIds", aVar);
                if (i != 0) {
                    cVar2.put("insertBefore", i);
                }
                if (cVar != null) {
                    cVar2.put("customData", cVar);
                }
                if (zzZ()) {
                    cVar2.put("sequenceNumber", this.zzz);
                }
            } catch (b unused) {
            }
            zzg(cVar2.toString(), zzd, null);
            this.zzp.zzb(zzd, new zzam(this, zzasVar));
            return zzd;
        }
        throw new IllegalArgumentException("itemIdsToReorder must not be null or empty.");
    }
}
