package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaib implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzmu, zzdq, zzakr, zzaiw, zzads, zzado, zzaif, zzahj, zzaeh {
    final /* synthetic */ zzaie zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaib(zzaie zzaieVar, zzaid zzaidVar) {
        this.zza = zzaieVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzaie.zzS(this.zza, surfaceTexture);
        zzaie.zzU(this.zza, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzaie.zzT(this.zza, null);
        zzaie.zzU(this.zza, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzaie.zzU(this.zza, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        zzaie.zzU(this.zza, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        zzaie.zzU(this.zza, 0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzA(Exception exc) {
        zzaie.zzf(this.zza).zzA(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzH(zzaiq zzaiqVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzI(zzagk zzagkVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzJ(zzs zzsVar, zzt zztVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzK(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzL(zzahi zzahiVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzM(boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzN(int i) {
        zzaie.zzY(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzO(boolean z, int i) {
        zzaie.zzY(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzP(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzQ(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzR(zzahc zzahcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzS(zzaho zzahoVar, zzaho zzahoVar2, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzT(zzahf zzahfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzU(zzago zzagoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzV() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zza(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzb(boolean z) {
        zzaie.zzY(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzg(zzaz zzazVar) {
        zzaie.zzl(this.zza, zzazVar);
        zzaie.zzf(this.zza).zzg(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzh(String str, long j, long j2) {
        zzaie.zzf(this.zza).zzh(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzi(zzafv zzafvVar, zzba zzbaVar) {
        zzaie.zzi(this.zza, zzafvVar);
        zzaie.zzf(this.zza).zzi(zzafvVar, zzbaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzj(long j) {
        zzaie.zzf(this.zza).zzj(j);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzk(int i, long j, long j2) {
        zzaie.zzf(this.zza).zzk(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzl(String str) {
        zzaie.zzf(this.zza).zzl(str);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzm(zzaz zzazVar) {
        zzaie.zzf(this.zza).zzm(zzazVar);
        zzaie.zzi(this.zza, null);
        zzaie.zzl(this.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzn(boolean z) {
        if (zzaie.zzm(this.zza) == z) {
            return;
        }
        zzaie.zzr(this.zza, z);
        zzaie.zzW(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzo(Exception exc) {
        zzaie.zzf(this.zza).zzo(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzp(Exception exc) {
        zzaie.zzf(this.zza).zzp(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzr(zzaz zzazVar) {
        zzaie.zzk(this.zza, zzazVar);
        zzaie.zzf(this.zza).zzr(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzs(String str, long j, long j2) {
        zzaie.zzf(this.zza).zzs(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzt(zzafv zzafvVar, zzba zzbaVar) {
        zzaie.zzh(this.zza, zzafvVar);
        zzaie.zzf(this.zza).zzt(zzafvVar, zzbaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzu(int i, long j) {
        zzaie.zzf(this.zza).zzu(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzv(String str) {
        zzaie.zzf(this.zza).zzv(str);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzw(zzaz zzazVar) {
        zzaie.zzf(this.zza).zzw(zzazVar);
        zzaie.zzh(this.zza, null);
        zzaie.zzk(this.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzx(zzy zzyVar) {
        zzaie.zzw(this.zza, zzyVar);
        zzaie.zzf(this.zza).zzx(zzyVar);
        Iterator it = zzaie.zze(this.zza).iterator();
        while (it.hasNext()) {
            ((zzahl) it.next()).zzx(zzyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzy(Object obj, long j) {
        zzaie.zzf(this.zza).zzy(obj, j);
        if (zzaie.zzj(this.zza) == obj) {
            Iterator it = zzaie.zze(this.zza).iterator();
            while (it.hasNext()) {
                ((zzahl) it.next()).zzae();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzz(long j, int i) {
        zzaie.zzf(this.zza).zzz(j, i);
    }
}
