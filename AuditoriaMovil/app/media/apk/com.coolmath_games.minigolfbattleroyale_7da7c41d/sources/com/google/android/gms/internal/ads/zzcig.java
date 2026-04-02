package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.security.CertificateUtil;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcig extends zzcii implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    private static final Map<Integer, String> zzc = new HashMap();
    private final zzcjb zzd;
    private final zzcjc zze;
    private final boolean zzf;
    private int zzg;
    private int zzh;
    private MediaPlayer zzi;
    private Uri zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private zzciz zzp;
    private final boolean zzq;
    private int zzr;
    private zzcih zzs;
    private boolean zzt;
    private Integer zzu;

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            zzc.put(-1004, "MEDIA_ERROR_IO");
            zzc.put(-1007, "MEDIA_ERROR_MALFORMED");
            zzc.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            zzc.put(-110, "MEDIA_ERROR_TIMED_OUT");
            zzc.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        zzc.put(100, "MEDIA_ERROR_SERVER_DIED");
        zzc.put(1, "MEDIA_ERROR_UNKNOWN");
        zzc.put(1, "MEDIA_INFO_UNKNOWN");
        zzc.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        zzc.put(701, "MEDIA_INFO_BUFFERING_START");
        zzc.put(702, "MEDIA_INFO_BUFFERING_END");
        zzc.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        zzc.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        zzc.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (Build.VERSION.SDK_INT >= 19) {
            zzc.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            zzc.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public zzcig(Context context, zzcjb zzcjbVar, boolean z, boolean z2, zzcja zzcjaVar, zzcjc zzcjcVar) {
        super(context);
        this.zzg = 0;
        this.zzh = 0;
        this.zzt = false;
        this.zzu = null;
        setSurfaceTextureListener(this);
        this.zzd = zzcjbVar;
        this.zze = zzcjcVar;
        this.zzq = z;
        this.zzf = z2;
        zzcjcVar.zza(this);
    }

    private final void zzC() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzj == null || surfaceTexture == null) {
            return;
        }
        zzE(false);
        try {
            com.google.android.gms.ads.internal.zzt.zzs();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.zzi = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.zzi.setOnCompletionListener(this);
            this.zzi.setOnErrorListener(this);
            this.zzi.setOnInfoListener(this);
            this.zzi.setOnPreparedListener(this);
            this.zzi.setOnVideoSizeChangedListener(this);
            this.zzm = 0;
            if (this.zzq) {
                zzciz zzcizVar = new zzciz(getContext());
                this.zzp = zzcizVar;
                zzcizVar.zzb(surfaceTexture, getWidth(), getHeight());
                this.zzp.start();
                SurfaceTexture zze = this.zzp.zze();
                if (zze != null) {
                    surfaceTexture = zze;
                } else {
                    this.zzp.zzd();
                    this.zzp = null;
                }
            }
            this.zzi.setDataSource(getContext(), this.zzj);
            com.google.android.gms.ads.internal.zzt.zzt();
            this.zzi.setSurface(new Surface(surfaceTexture));
            this.zzi.setAudioStreamType(3);
            this.zzi.setScreenOnWhilePlaying(true);
            this.zzi.prepareAsync();
            zzH(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e) {
            String valueOf = String.valueOf(this.zzj);
            String.valueOf(valueOf).length();
            com.google.android.gms.ads.internal.util.zze.zzj("Failed to initialize MediaPlayer at ".concat(String.valueOf(valueOf)), e);
            onError(this.zzi, 1, 0);
        }
    }

    private final void zzD() {
        if (this.zzf && zzF() && this.zzi.getCurrentPosition() > 0 && this.zzh != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView nudging MediaPlayer");
            zzG(0.0f);
            this.zzi.start();
            int currentPosition = this.zzi.getCurrentPosition();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis();
            while (zzF() && this.zzi.getCurrentPosition() == currentPosition && com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis() - currentTimeMillis <= 250) {
            }
            this.zzi.pause();
            zzt();
        }
    }

    private final void zzE(boolean z) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView release");
        zzciz zzcizVar = this.zzp;
        if (zzcizVar != null) {
            zzcizVar.zzd();
            this.zzp = null;
        }
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzi.release();
            this.zzi = null;
            zzH(0);
            if (z) {
                this.zzh = 0;
            }
        }
    }

    private final boolean zzF() {
        int i;
        return (this.zzi == null || (i = this.zzg) == -1 || i == 0 || i == 1) ? false : true;
    }

    private final void zzG(float f) {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            return;
        }
        try {
            mediaPlayer.setVolume(f, f);
        } catch (IllegalStateException unused) {
        }
    }

    private final void zzH(int i) {
        if (i == 3) {
            this.zze.zze();
            this.zzb.zzd();
        } else if (this.zzg == 3) {
            this.zze.zzf();
            this.zzb.zze();
        }
        this.zzg = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzc(zzcig zzcigVar, boolean z) {
        zzcigVar.zzt = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzu(zzcig zzcigVar, MediaPlayer mediaPlayer) {
        MediaPlayer.TrackInfo[] trackInfo;
        MediaFormat format;
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue() || zzcigVar.zzd == null || mediaPlayer == null || Build.VERSION.SDK_INT < 19 || (trackInfo = mediaPlayer.getTrackInfo()) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
            if (trackInfo2 != null) {
                int trackType = trackInfo2.getTrackType();
                if (trackType == 1) {
                    MediaFormat format2 = trackInfo2.getFormat();
                    if (format2 != null) {
                        if (format2.containsKey("frame-rate")) {
                            try {
                                hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                            } catch (ClassCastException unused) {
                                hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                            }
                        }
                        if (format2.containsKey("bitrate")) {
                            Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                            zzcigVar.zzu = valueOf;
                            hashMap.put("bitRate", String.valueOf(valueOf));
                        }
                        if (format2.containsKey(ViewHierarchyConstants.DIMENSION_WIDTH_KEY) && format2.containsKey(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY)) {
                            int integer = format2.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
                            int integer2 = format2.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
                            StringBuilder sb = new StringBuilder(23);
                            sb.append(integer);
                            sb.append("x");
                            sb.append(integer2);
                            hashMap.put("resolution", sb.toString());
                        }
                        if (format2.containsKey("mime")) {
                            hashMap.put("videoMime", format2.getString("mime"));
                        }
                        if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                            hashMap.put("videoCodec", format2.getString("codecs-string"));
                        }
                    }
                } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                    if (format.containsKey("mime")) {
                        hashMap.put("audioMime", format.getString("mime"));
                    }
                    if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                        hashMap.put("audioCodec", format.getString("codecs-string"));
                    }
                }
            }
        }
        if (hashMap.isEmpty()) {
            return;
        }
        zzcigVar.zzd.zze("onMetadataEvent", hashMap);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.zzm = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView completion");
        zzH(5);
        this.zzh = 5;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzchz(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = zzc.get(Integer.valueOf(i));
        String str2 = zzc.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(CertificateUtil.DELIMITER);
        sb.append(str2);
        com.google.android.gms.ads.internal.util.zze.zzi(sb.toString());
        zzH(-1);
        this.zzh = -1;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcia(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = zzc.get(Integer.valueOf(i));
        String str2 = zzc.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(CertificateUtil.DELIMITER);
        sb.append(str2);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
        if (r1 > r6) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.zzk
            int r0 = getDefaultSize(r0, r6)
            int r1 = r5.zzl
            int r1 = getDefaultSize(r1, r7)
            int r2 = r5.zzk
            if (r2 <= 0) goto L7a
            int r2 = r5.zzl
            if (r2 <= 0) goto L7a
            com.google.android.gms.internal.ads.zzciz r2 = r5.zzp
            if (r2 != 0) goto L7a
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L42
            if (r1 != r2) goto L41
            int r0 = r5.zzk
            int r1 = r0 * r7
            int r2 = r5.zzl
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7a
        L3c:
            if (r1 <= r3) goto L60
            int r1 = r3 / r0
            goto L52
        L41:
            r0 = r2
        L42:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L54
            int r0 = r5.zzl
            int r0 = r0 * r6
            int r2 = r5.zzk
            int r0 = r0 / r2
            if (r1 != r3) goto L51
            if (r0 <= r7) goto L51
            goto L60
        L51:
            r1 = r0
        L52:
            r0 = r6
            goto L7a
        L54:
            if (r1 != r2) goto L64
            int r1 = r5.zzk
            int r1 = r1 * r7
            int r2 = r5.zzl
            int r1 = r1 / r2
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
        L60:
            r0 = r6
            goto L3a
        L62:
            r0 = r1
            goto L3a
        L64:
            int r2 = r5.zzk
            int r4 = r5.zzl
            if (r1 != r3) goto L70
            if (r4 <= r7) goto L70
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L72
        L70:
            r1 = r2
            r7 = r4
        L72:
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L52
        L7a:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.zzciz r6 = r5.zzp
            if (r6 == 0) goto L84
            r6.zzc(r0, r1)
        L84:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 16
            if (r6 != r7) goto L9d
            int r6 = r5.zzn
            if (r6 <= 0) goto L90
            if (r6 != r0) goto L96
        L90:
            int r6 = r5.zzo
            if (r6 <= 0) goto L99
            if (r6 == r1) goto L99
        L96:
            r5.zzD()
        L99:
            r5.zzn = r0
            r5.zzo = r1
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcig.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView prepared");
        zzH(2);
        this.zze.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzchy(this, mediaPlayer));
        this.zzk = mediaPlayer.getVideoWidth();
        this.zzl = mediaPlayer.getVideoHeight();
        int i = this.zzr;
        if (i != 0) {
            zzl(i);
        }
        zzD();
        int i2 = this.zzk;
        int i3 = this.zzl;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        com.google.android.gms.ads.internal.util.zze.zzh(sb.toString());
        if (this.zzh == 3) {
            zzh();
        }
        zzt();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface created");
        zzC();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcib(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null && this.zzr == 0) {
            this.zzr = mediaPlayer.getCurrentPosition();
        }
        zzciz zzcizVar = this.zzp;
        if (zzcizVar != null) {
            zzcizVar.zzd();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcid(this));
        zzE(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface changed");
        int i3 = this.zzh;
        boolean z = false;
        if (this.zzk == i && this.zzl == i2) {
            z = true;
        }
        if (this.zzi != null && i3 == 3 && z) {
            int i4 = this.zzr;
            if (i4 != 0) {
                zzl(i4);
            }
            zzh();
        }
        zzciz zzcizVar = this.zzp;
        if (zzcizVar != null) {
            zzcizVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcic(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zze.zzd(this);
        this.zza.zzb(surfaceTexture, this.zzs);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        this.zzk = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzl = videoHeight;
        if (this.zzk == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this, i) { // from class: com.google.android.gms.internal.ads.zzchx
            private final zzcig zza;
            private final int zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzv(this.zzb);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.View
    public final String toString() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final String zzd() {
        String str = true != this.zzq ? "" : " spherical";
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zze(zzcih zzcihVar) {
        this.zzs = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzf(String str) {
        Uri parse = Uri.parse(str);
        zzayn zza = zzayn.zza(parse);
        if (zza == null || zza.zza != null) {
            if (zza != null) {
                parse = Uri.parse(zza.zza);
            }
            this.zzj = parse;
            this.zzr = 0;
            zzC();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzg() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzi.release();
            this.zzi = null;
            zzH(0);
            this.zzh = 0;
        }
        this.zze.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzh() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView play");
        if (zzF()) {
            this.zzi.start();
            zzH(3);
            this.zza.zza();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcie(this));
        }
        this.zzh = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzi() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView pause");
        if (zzF() && this.zzi.isPlaying()) {
            this.zzi.pause();
            zzH(4);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcif(this));
        }
        this.zzh = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final int zzj() {
        if (zzF()) {
            return this.zzi.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final int zzk() {
        if (zzF()) {
            return this.zzi.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzl(int i) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        if (!zzF()) {
            this.zzr = i;
            return;
        }
        this.zzi.seekTo(i);
        this.zzr = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzm(float f, float f2) {
        zzciz zzcizVar = this.zzp;
        if (zzcizVar != null) {
            zzcizVar.zzf(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final int zzn() {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final int zzo() {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final long zzp() {
        if (this.zzu != null) {
            return (zzr() * this.zzm) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final long zzq() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final long zzr() {
        if (this.zzu != null) {
            return zzj() * this.zzu.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final int zzs() {
        if (Build.VERSION.SDK_INT < 26 || !zzF()) {
            return -1;
        }
        return this.zzi.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.zzcii, com.google.android.gms.internal.ads.zzcje
    public final void zzt() {
        zzG(this.zzb.zzc());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzv(int i) {
        zzcih zzcihVar = this.zzs;
        if (zzcihVar != null) {
            zzcihVar.onWindowVisibilityChanged(i);
        }
    }
}
