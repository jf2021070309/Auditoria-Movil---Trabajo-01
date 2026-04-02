package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import e.a.d.a.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
@TargetApi(16)
/* loaded from: classes.dex */
public final class zzcjs extends zzcii implements TextureView.SurfaceTextureListener, zzcir {
    private final zzcjb zzc;
    private final zzcjc zzd;
    private final boolean zze;
    private final zzcja zzf;
    private zzcih zzg;
    private Surface zzh;
    private zzcis zzi;
    private String zzj;
    private String[] zzk;
    private boolean zzl;
    private int zzm;
    private zzciz zzn;
    private final boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private float zzv;

    public zzcjs(Context context, zzcjc zzcjcVar, zzcjb zzcjbVar, boolean z, boolean z2, zzcja zzcjaVar) {
        super(context);
        this.zzm = 1;
        this.zze = z2;
        this.zzc = zzcjbVar;
        this.zzd = zzcjcVar;
        this.zzo = z;
        this.zzf = zzcjaVar;
        setSurfaceTextureListener(this);
        zzcjcVar.zza(this);
    }

    private final boolean zzR() {
        zzcis zzcisVar = this.zzi;
        return (zzcisVar == null || !zzcisVar.zzA() || this.zzl) ? false : true;
    }

    private final boolean zzS() {
        return zzR() && this.zzm != 1;
    }

    private final void zzT(boolean z) {
        if ((this.zzi != null && !z) || this.zzj == null || this.zzh == null) {
            return;
        }
        if (z) {
            if (!zzR()) {
                zzcgt.zzi("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                this.zzi.zzv();
                zzU();
            }
        }
        if (this.zzj.startsWith("cache:")) {
            zzcla zzs = this.zzc.zzs(this.zzj);
            if (zzs instanceof zzclj) {
                zzcis zzj = ((zzclj) zzs).zzj();
                this.zzi = zzj;
                if (!zzj.zzA()) {
                    zzcgt.zzi("Precached video player has been released.");
                    return;
                }
            } else if (!(zzs instanceof zzclg)) {
                String valueOf = String.valueOf(this.zzj);
                zzcgt.zzi(valueOf.length() != 0 ? "Stream cache miss: ".concat(valueOf) : new String("Stream cache miss: "));
                return;
            } else {
                zzclg zzclgVar = (zzclg) zzs;
                String zzE = zzE();
                ByteBuffer zzc = zzclgVar.zzc();
                boolean zzb = zzclgVar.zzb();
                String zza = zzclgVar.zza();
                if (zza == null) {
                    zzcgt.zzi("Stream cache URL is null.");
                    return;
                }
                zzcis zzD = zzD();
                this.zzi = zzD;
                zzD.zzq(new Uri[]{Uri.parse(zza)}, zzE, zzc, zzb);
            }
        } else {
            this.zzi = zzD();
            String zzE2 = zzE();
            Uri[] uriArr = new Uri[this.zzk.length];
            int i2 = 0;
            while (true) {
                String[] strArr = this.zzk;
                if (i2 >= strArr.length) {
                    break;
                }
                uriArr[i2] = Uri.parse(strArr[i2]);
                i2++;
            }
            this.zzi.zzp(uriArr, zzE2);
        }
        this.zzi.zzr(this);
        zzV(this.zzh, false);
        if (this.zzi.zzA()) {
            int zzB = this.zzi.zzB();
            this.zzm = zzB;
            if (zzB == 3) {
                zzX();
            }
        }
    }

    private final void zzU() {
        if (this.zzi != null) {
            zzV(null, true);
            zzcis zzcisVar = this.zzi;
            if (zzcisVar != null) {
                zzcisVar.zzr(null);
                this.zzi.zzs();
                this.zzi = null;
            }
            this.zzm = 1;
            this.zzl = false;
            this.zzp = false;
            this.zzq = false;
        }
    }

    private final void zzV(Surface surface, boolean z) {
        zzcis zzcisVar = this.zzi;
        if (zzcisVar == null) {
            zzcgt.zzi("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcisVar.zzt(surface, z);
        } catch (IOException e2) {
            zzcgt.zzj("", e2);
        }
    }

    private final void zzW(float f2, boolean z) {
        zzcis zzcisVar = this.zzi;
        if (zzcisVar == null) {
            zzcgt.zzi("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcisVar.zzu(f2, z);
        } catch (IOException e2) {
            zzcgt.zzj("", e2);
        }
    }

    private final void zzX() {
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcjg
            private final zzcjs zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzQ();
            }
        });
        zzt();
        this.zzd.zzb();
        if (this.zzq) {
            zzh();
        }
    }

    private static String zzY(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 2 + length + String.valueOf(message).length());
        a.M(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    private final void zzZ() {
        zzaa(this.zzr, this.zzs);
    }

    private final void zzaa(int i2, int i3) {
        float f2 = i3 > 0 ? i2 / i3 : 1.0f;
        if (this.zzv != f2) {
            this.zzv = f2;
            requestLayout();
        }
    }

    private final void zzab() {
        zzcis zzcisVar = this.zzi;
        if (zzcisVar != null) {
            zzcisVar.zzM(true);
        }
    }

    private final void zzac() {
        zzcis zzcisVar = this.zzi;
        if (zzcisVar != null) {
            zzcisVar.zzM(false);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f2 = this.zzv;
        if (f2 != 0.0f && this.zzn == null) {
            float f3 = measuredWidth;
            float f4 = f3 / measuredHeight;
            if (f2 > f4) {
                measuredHeight = (int) (f3 / f2);
            }
            if (f2 < f4) {
                measuredWidth = (int) (measuredHeight * f2);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzciz zzcizVar = this.zzn;
        if (zzcizVar != null) {
            zzcizVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (this.zzo) {
            zzciz zzcizVar = new zzciz(getContext());
            this.zzn = zzcizVar;
            zzcizVar.zzb(surfaceTexture, i2, i3);
            this.zzn.start();
            SurfaceTexture zze = this.zzn.zze();
            if (zze != null) {
                surfaceTexture = zze;
            } else {
                this.zzn.zzd();
                this.zzn = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzh = surface;
        if (this.zzi == null) {
            zzT(false);
        } else {
            zzV(surface, true);
            if (!this.zzf.zza) {
                zzab();
            }
        }
        if (this.zzr == 0 || this.zzs == 0) {
            zzaa(i2, i3);
        } else {
            zzZ();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcjn
            private final zzcjs zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzL();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzi();
        zzciz zzcizVar = this.zzn;
        if (zzcizVar != null) {
            zzcizVar.zzd();
            this.zzn = null;
        }
        if (this.zzi != null) {
            zzac();
            Surface surface = this.zzh;
            if (surface != null) {
                surface.release();
            }
            this.zzh = null;
            zzV(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcjp
            private final zzcjs zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzJ();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i2, final int i3) {
        zzciz zzcizVar = this.zzn;
        if (zzcizVar != null) {
            zzcizVar.zzc(i2, i3);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this, i2, i3) { // from class: com.google.android.gms.internal.ads.zzcjo
            private final zzcjs zza;
            private final int zzb;
            private final int zzc;

            {
                this.zza = this;
                this.zzb = i2;
                this.zzc = i3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzK(this.zzb, this.zzc);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzd(this);
        this.zza.zzb(surfaceTexture, this.zzg);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i2);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this, i2) { // from class: com.google.android.gms.internal.ads.zzcjq
            private final zzcjs zza;
            private final int zzb;

            {
                this.zza = this;
                this.zzb = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzI(this.zzb);
            }
        });
        super.onWindowVisibilityChanged(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzA(int i2) {
        zzcis zzcisVar = this.zzi;
        if (zzcisVar != null) {
            zzcisVar.zzy(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzB(int i2) {
        zzcis zzcisVar = this.zzi;
        if (zzcisVar != null) {
            zzcisVar.zzz(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzC() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcji
            private final zzcjs zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzF();
            }
        });
    }

    public final zzcis zzD() {
        return this.zzf.zzm ? new zzcmb(this.zzc.getContext(), this.zzf, this.zzc) : new zzcki(this.zzc.getContext(), this.zzf, this.zzc);
    }

    public final String zzE() {
        return com.google.android.gms.ads.internal.zzt.zzc().zzi(this.zzc.getContext(), this.zzc.zzt().zza);
    }

    public final /* synthetic */ void zzF() {
        zzcih zzcihVar = this.zzg;
        if (zzcihVar != null) {
            zzcihVar.zzk();
        }
    }

    public final /* synthetic */ void zzG(String str) {
        zzcih zzcihVar = this.zzg;
        if (zzcihVar != null) {
            zzcihVar.zzg("ExoPlayerAdapter exception", str);
        }
    }

    public final /* synthetic */ void zzH(boolean z, long j2) {
        this.zzc.zzv(z, j2);
    }

    public final /* synthetic */ void zzI(int i2) {
        zzcih zzcihVar = this.zzg;
        if (zzcihVar != null) {
            zzcihVar.onWindowVisibilityChanged(i2);
        }
    }

    public final /* synthetic */ void zzJ() {
        zzcih zzcihVar = this.zzg;
        if (zzcihVar != null) {
            zzcihVar.zzh();
        }
    }

    public final /* synthetic */ void zzK(int i2, int i3) {
        zzcih zzcihVar = this.zzg;
        if (zzcihVar != null) {
            zzcihVar.zzj(i2, i3);
        }
    }

    public final /* synthetic */ void zzL() {
        zzcih zzcihVar = this.zzg;
        if (zzcihVar != null) {
            zzcihVar.zza();
        }
    }

    public final /* synthetic */ void zzM() {
        zzcih zzcihVar = this.zzg;
        if (zzcihVar != null) {
            zzcihVar.zzd();
        }
    }

    public final /* synthetic */ void zzN() {
        zzcih zzcihVar = this.zzg;
        if (zzcihVar != null) {
            zzcihVar.zzc();
        }
    }

    public final /* synthetic */ void zzO(String str) {
        zzcih zzcihVar = this.zzg;
        if (zzcihVar != null) {
            zzcihVar.zzf("ExoPlayerAdapter error", str);
        }
    }

    public final /* synthetic */ void zzP() {
        zzcih zzcihVar = this.zzg;
        if (zzcihVar != null) {
            zzcihVar.zze();
        }
    }

    public final /* synthetic */ void zzQ() {
        zzcih zzcihVar = this.zzg;
        if (zzcihVar != null) {
            zzcihVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zza(final boolean z, final long j2) {
        if (this.zzc != null) {
            zzchg.zze.execute(new Runnable(this, z, j2) { // from class: com.google.android.gms.internal.ads.zzcjr
                private final zzcjs zza;
                private final boolean zzb;
                private final long zzc;

                {
                    this.zza = this;
                    this.zzb = z;
                    this.zzc = j2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzH(this.zzb, this.zzc);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzb(int i2) {
        if (this.zzm != i2) {
            this.zzm = i2;
            if (i2 == 3) {
                zzX();
            } else if (i2 != 4) {
            } else {
                if (this.zzf.zza) {
                    zzac();
                }
                this.zzd.zzf();
                this.zzb.zze();
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcjj
                    private final zzcjs zza;

                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzP();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzc(int i2, int i3) {
        this.zzr = i2;
        this.zzs = i3;
        zzZ();
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final String zzd() {
        String str = true != this.zzo ? "" : " spherical";
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zze(zzcih zzcihVar) {
        this.zzg = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzf(String str) {
        if (str != null) {
            zzw(str, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzg() {
        if (zzR()) {
            this.zzi.zzv();
            zzU();
        }
        this.zzd.zzf();
        this.zzb.zze();
        this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzh() {
        if (!zzS()) {
            this.zzq = true;
            return;
        }
        if (this.zzf.zza) {
            zzab();
        }
        this.zzi.zzE(true);
        this.zzd.zze();
        this.zzb.zzd();
        this.zza.zza();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcjl
            private final zzcjs zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzN();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzi() {
        if (zzS()) {
            if (this.zzf.zza) {
                zzac();
            }
            this.zzi.zzE(false);
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcjm
                private final zzcjs zza;

                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzM();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final int zzj() {
        if (zzS()) {
            return (int) this.zzi.zzH();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final int zzk() {
        if (zzS()) {
            return (int) this.zzi.zzC();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzl(int i2) {
        if (zzS()) {
            this.zzi.zzw(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzm(float f2, float f3) {
        zzciz zzcizVar = this.zzn;
        if (zzcizVar != null) {
            zzcizVar.zzf(f2, f3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final int zzn() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final int zzo() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final long zzp() {
        zzcis zzcisVar = this.zzi;
        if (zzcisVar != null) {
            return zzcisVar.zzI();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final long zzq() {
        zzcis zzcisVar = this.zzi;
        if (zzcisVar != null) {
            return zzcisVar.zzJ();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final long zzr() {
        zzcis zzcisVar = this.zzi;
        if (zzcisVar != null) {
            return zzcisVar.zzK();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final int zzs() {
        zzcis zzcisVar = this.zzi;
        if (zzcisVar != null) {
            return zzcisVar.zzL();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcii, com.google.android.gms.internal.ads.zzcje
    public final void zzt() {
        zzW(this.zzb.zzc(), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzu(String str, Exception exc) {
        final String zzY = zzY(str, exc);
        zzcgt.zzi(zzY.length() != 0 ? "ExoPlayerAdapter error: ".concat(zzY) : new String("ExoPlayerAdapter error: "));
        this.zzl = true;
        if (this.zzf.zza) {
            zzac();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this, zzY) { // from class: com.google.android.gms.internal.ads.zzcjk
            private final zzcjs zza;
            private final String zzb;

            {
                this.zza = this;
                this.zzb = zzY;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzO(this.zzb);
            }
        });
        com.google.android.gms.ads.internal.zzt.zzg().zzl(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzv(String str, Exception exc) {
        final String zzY = zzY("onLoadException", exc);
        zzcgt.zzi(zzY.length() != 0 ? "ExoPlayerAdapter exception: ".concat(zzY) : new String("ExoPlayerAdapter exception: "));
        com.google.android.gms.ads.internal.zzt.zzg().zzl(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this, zzY) { // from class: com.google.android.gms.internal.ads.zzcjh
            private final zzcjs zza;
            private final String zzb;

            {
                this.zza = this;
                this.zzb = zzY;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzG(this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzw(String str, String[] strArr) {
        if (str == null) {
            return;
        }
        boolean z = true;
        if (strArr == null) {
            this.zzk = new String[]{str};
        } else {
            this.zzk = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzj;
        z = (!this.zzf.zzn || str2 == null || str.equals(str2) || this.zzm != 4) ? false : false;
        this.zzj = str;
        zzT(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzx(int i2) {
        zzcis zzcisVar = this.zzi;
        if (zzcisVar != null) {
            zzcisVar.zzF(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzy(int i2) {
        zzcis zzcisVar = this.zzi;
        if (zzcisVar != null) {
            zzcisVar.zzG(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzz(int i2) {
        zzcis zzcisVar = this.zzi;
        if (zzcisVar != null) {
            zzcisVar.zzx(i2);
        }
    }
}
