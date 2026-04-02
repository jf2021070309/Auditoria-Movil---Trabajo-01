package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzeb implements zzde {
    private boolean zzh;
    private ByteBuffer zzf = zza;
    private ByteBuffer zzg = zza;
    private zzdc zzd = zzdc.zza;
    private zzdc zze = zzdc.zza;
    protected zzdc zzb = zzdc.zza;
    protected zzdc zzc = zzdc.zza;

    @Override // com.google.android.gms.internal.ads.zzde
    public final zzdc zza(zzdc zzdcVar) throws zzdd {
        this.zzd = zzdcVar;
        this.zze = zzk(zzdcVar);
        return zzb() ? this.zze : zzdc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public boolean zzb() {
        return this.zze != zzdc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public ByteBuffer zze() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public boolean zzf() {
        return this.zzh && this.zzg == zza;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzg() {
        this.zzg = zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzh() {
        zzg();
        this.zzf = zza;
        this.zzd = zzdc.zza;
        this.zze = zzdc.zza;
        this.zzb = zzdc.zza;
        this.zzc = zzdc.zza;
        zzn();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ByteBuffer zzi(int i) {
        if (this.zzf.capacity() < i) {
            this.zzf = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzj() {
        return this.zzg.hasRemaining();
    }

    protected zzdc zzk(zzdc zzdcVar) throws zzdd {
        throw null;
    }

    protected void zzl() {
    }

    protected void zzm() {
    }

    protected void zzn() {
    }
}
