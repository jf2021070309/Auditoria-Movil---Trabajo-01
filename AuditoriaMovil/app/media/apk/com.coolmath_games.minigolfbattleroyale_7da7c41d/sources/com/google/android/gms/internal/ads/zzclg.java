package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    protected static final String zzt(String str) {
        String valueOf = String.valueOf(zzcgm.zzd(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    private final void zzu() {
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round(zza2 * (position / zza));
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

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a2, code lost:
        r25.zzn = true;
        zzq(r26, r11, (int) r25.zzh.zza(r25.zzi));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d3, code lost:
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.google.android.gms.common.util.Clock] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:? -> B:45:0x013f). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzcla
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzd(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzclg.zzd(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzauo
    public final /* bridge */ /* synthetic */ void zzj(zzatz zzatzVar, zzaub zzaubVar) {
        this.zzg.zzb((zzaud) zzatzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzauo
    public final /* bridge */ /* synthetic */ void zzk(zzatz zzatzVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zzm() {
        this.zzf = true;
    }
}
