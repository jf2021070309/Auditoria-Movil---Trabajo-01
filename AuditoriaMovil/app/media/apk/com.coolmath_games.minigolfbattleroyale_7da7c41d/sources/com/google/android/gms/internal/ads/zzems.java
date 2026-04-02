package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzems implements zzery<zzemt> {
    private final zzery<zzesd> zza;
    private final zzfar zzb;
    private final Context zzc;
    private final zzcge zzd;

    public zzems(zzeoh<zzesd> zzeohVar, zzfar zzfarVar, Context context, zzcge zzcgeVar) {
        this.zza = zzeohVar;
        this.zzb = zzfarVar;
        this.zzc = context;
        this.zzd = zzcgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzemt> zza() {
        return zzfsd.zzj(this.zza.zza(), new zzfln(this) { // from class: com.google.android.gms.internal.ads.zzemr
            private final zzems zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzfln
            public final Object apply(Object obj) {
                return this.zza.zzb((zzesd) obj);
            }
        }, zzchg.zzf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzemt zzb(zzesd zzesdVar) {
        String str;
        boolean z;
        String str2;
        float f;
        int i;
        int i2;
        int i3;
        DisplayMetrics displayMetrics;
        zzbdl zzbdlVar = this.zzb.zze;
        zzbdl[] zzbdlVarArr = zzbdlVar.zzg;
        if (zzbdlVarArr == null) {
            str = zzbdlVar.zza;
            z = zzbdlVar.zzi;
        } else {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (zzbdl zzbdlVar2 : zzbdlVarArr) {
                boolean z4 = zzbdlVar2.zzi;
                if (!z4 && !z2) {
                    str = zzbdlVar2.zza;
                    z2 = true;
                }
                if (z4) {
                    if (z3) {
                        z3 = true;
                    } else {
                        z3 = true;
                        z = true;
                    }
                }
                if (z2 && z3) {
                    break;
                }
            }
        }
        Resources resources = this.zzc.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f = 0.0f;
            i = 0;
            i2 = 0;
        } else {
            float f2 = displayMetrics.density;
            int i4 = displayMetrics.widthPixels;
            i2 = displayMetrics.heightPixels;
            str2 = this.zzd.zzp().zzz();
            i = i4;
            f = f2;
        }
        StringBuilder sb = new StringBuilder();
        zzbdl[] zzbdlVarArr2 = zzbdlVar.zzg;
        if (zzbdlVarArr2 != null) {
            boolean z5 = false;
            for (zzbdl zzbdlVar3 : zzbdlVarArr2) {
                if (zzbdlVar3.zzi) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i5 = zzbdlVar3.zze;
                    if (i5 == -1) {
                        i5 = f != 0.0f ? (int) (zzbdlVar3.zzf / f) : -1;
                    }
                    sb.append(i5);
                    sb.append("x");
                    int i6 = zzbdlVar3.zzb;
                    if (i6 == -2) {
                        i6 = f != 0.0f ? (int) (zzbdlVar3.zzc / f) : -2;
                    }
                    sb.append(i6);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new zzemt(zzbdlVar, str, z, sb.toString(), f, i, i2, str2, this.zzb.zzp);
    }
}
