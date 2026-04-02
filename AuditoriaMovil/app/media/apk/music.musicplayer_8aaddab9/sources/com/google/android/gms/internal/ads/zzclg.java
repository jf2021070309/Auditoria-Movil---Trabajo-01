package com.google.android.gms.internal.ads;

import android.net.Uri;
import ch.qos.logback.core.rolling.helper.Compressor;
import com.google.android.gms.common.util.Clock;
import e.a.d.a.a;
import java.io.IOException;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class zzclg extends zzcla implements zzauo<zzatz> {
    private String zzd;
    private final zzcja zze;
    private boolean zzf;
    private final zzclf zzg;
    private final zzckl zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzclg(zzcjb zzcjbVar, zzcja zzcjaVar) {
        super(zzcjbVar);
        this.zze = zzcjaVar;
        this.zzg = new zzclf();
        this.zzh = new zzckl();
        this.zzk = new Object();
        this.zzl = zzcjbVar != null ? zzcjbVar.zzn() : "";
        this.zzm = zzcjbVar != null ? zzcjbVar.zzp() : 0;
    }

    public static final String zzt(String str) {
        String valueOf = String.valueOf(zzcgm.zzd(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    private final void zzu() {
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round((position / zza) * zza2);
        boolean z = round > 0;
        int zzP = zzcis.zzP();
        int zzQ = zzcis.zzQ();
        String str = this.zzd;
        zzo(str, zzt(str), position, zza, round, zza2, z, zzP, zzQ);
    }

    public final String zza() {
        return this.zzd;
    }

    public final boolean zzb() {
        return this.zzn;
    }

    public final ByteBuffer zzc() {
        synchronized (this.zzk) {
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && !this.zzj) {
                byteBuffer.flip();
                this.zzj = true;
            }
            this.zzf = true;
        }
        return this.zzi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcla
    public final boolean zzd(String str) {
        String str2;
        String str3;
        String str4;
        zzclg zzclgVar;
        String str5;
        String str6 = str;
        this.zzd = str6;
        String zzt = zzt(str);
        int i2 = 0;
        try {
            String str7 = this.zzb;
            zzcja zzcjaVar = this.zze;
            zzatz zzaudVar = new zzaud(str7, null, this, zzcjaVar.zzd, zzcjaVar.zzf, true, null);
            if (this.zze.zzj) {
                zzaudVar = new zzcjx(this.zza, zzaudVar, this.zzl, this.zzm, null, null);
            }
            zzaudVar.zza(new zzaub(Uri.parse(str), null, 0L, 0L, -1L, null, 0));
            zzcjb zzcjbVar = this.zzc.get();
            if (zzcjbVar != null) {
                zzcjbVar.zzu(zzt, this);
            }
            Clock zzj = com.google.android.gms.ads.internal.zzt.zzj();
            long currentTimeMillis = zzj.currentTimeMillis();
            long longValue = ((Long) zzbet.zzc().zzc(zzbjl.zzt)).longValue();
            long longValue2 = ((Long) zzbet.zzc().zzc(zzbjl.zzs)).longValue();
            this.zzi = ByteBuffer.allocate(this.zze.zzc);
            int i3 = Compressor.BUFFER_SIZE;
            byte[] bArr = new byte[Compressor.BUFFER_SIZE];
            long j2 = currentTimeMillis;
            str2 = "error";
            while (true) {
                try {
                    int zzb = zzaudVar.zzb(bArr, i2, Math.min(this.zzi.remaining(), i3));
                    if (zzb == -1) {
                        this.zzn = true;
                        zzq(str6, zzt, (int) this.zzh.zza(this.zzi));
                        return true;
                    }
                    synchronized (this.zzk) {
                        try {
                            if (!this.zzf) {
                                this.zzi.put(bArr, 0, zzb);
                            }
                        } finally {
                            th = th;
                            str3 = str;
                            str4 = str3;
                            zzclgVar = this;
                            str5 = str2;
                            while (true) {
                                try {
                                    try {
                                        break;
                                    } catch (Exception e2) {
                                        e = e2;
                                        String canonicalName = e.getClass().getCanonicalName();
                                        String message = e.getMessage();
                                        String s = a.s(new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length()), canonicalName, ":", message);
                                        StringBuilder sb = new StringBuilder(s.length() + String.valueOf(str4).length() + 34);
                                        sb.append("Failed to preload url ");
                                        sb.append(str3);
                                        sb.append(" Exception: ");
                                        sb.append(s);
                                        zzcgt.zzi(sb.toString());
                                        zzclgVar.zzr(str3, zzt, str5, s);
                                        return false;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                }
                            }
                        }
                    }
                    if (this.zzi.remaining() <= 0) {
                        zzu();
                        return true;
                    }
                    try {
                        if (this.zzf) {
                            int limit = this.zzi.limit();
                            StringBuilder sb2 = new StringBuilder(35);
                            sb2.append("Precache abort at ");
                            sb2.append(limit);
                            sb2.append(" bytes");
                            throw new IOException(sb2.toString());
                        }
                        long currentTimeMillis2 = zzj.currentTimeMillis();
                        if (currentTimeMillis2 - j2 >= longValue) {
                            zzu();
                            j2 = currentTimeMillis2;
                        }
                        if (currentTimeMillis2 - currentTimeMillis > 1000 * longValue2) {
                            StringBuilder sb3 = new StringBuilder(49);
                            sb3.append("Timeout exceeded. Limit: ");
                            sb3.append(longValue2);
                            sb3.append(" sec");
                            throw new IOException(sb3.toString());
                        }
                        i3 = Compressor.BUFFER_SIZE;
                        i2 = 0;
                        str6 = str;
                    } catch (Exception e3) {
                        e = e3;
                        str4 = str;
                        str5 = zzj;
                        zzclgVar = this;
                        str3 = str4;
                        String canonicalName2 = e.getClass().getCanonicalName();
                        String message2 = e.getMessage();
                        String s2 = a.s(new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length()), canonicalName2, ":", message2);
                        StringBuilder sb4 = new StringBuilder(s2.length() + String.valueOf(str4).length() + 34);
                        sb4.append("Failed to preload url ");
                        sb4.append(str3);
                        sb4.append(" Exception: ");
                        sb4.append(s2);
                        zzcgt.zzi(sb4.toString());
                        zzclgVar.zzr(str3, zzt, str5, s2);
                        return false;
                    }
                } catch (Exception e4) {
                    e = e4;
                    String canonicalName22 = e.getClass().getCanonicalName();
                    String message22 = e.getMessage();
                    String s22 = a.s(new StringBuilder(String.valueOf(canonicalName22).length() + 1 + String.valueOf(message22).length()), canonicalName22, ":", message22);
                    StringBuilder sb42 = new StringBuilder(s22.length() + String.valueOf(str4).length() + 34);
                    sb42.append("Failed to preload url ");
                    sb42.append(str3);
                    sb42.append(" Exception: ");
                    sb42.append(s22);
                    zzcgt.zzi(sb42.toString());
                    zzclgVar.zzr(str3, zzt, str5, s22);
                    return false;
                }
            }
        } catch (Exception e5) {
            e = e5;
            str2 = "error";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauo
    public final /* bridge */ /* synthetic */ void zzj(zzatz zzatzVar, zzaub zzaubVar) {
        this.zzg.zzb((zzaud) zzatzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzauo
    public final /* bridge */ /* synthetic */ void zzk(zzatz zzatzVar, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zzm() {
        this.zzf = true;
    }
}
