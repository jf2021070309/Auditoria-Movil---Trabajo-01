package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzasj {
    private final zzapo[] zza;
    private final zzapp zzb;
    private zzapo zzc;

    public zzasj(zzapo[] zzapoVarArr, zzapp zzappVar) {
        this.zza = zzapoVarArr;
        this.zzb = zzappVar;
    }

    public final void zza() {
        if (this.zzc != null) {
            this.zzc = null;
        }
    }

    public final zzapo zzb(zzapn zzapnVar, Uri uri) throws IOException, InterruptedException {
        zzapo zzapoVar = this.zzc;
        if (zzapoVar != null) {
            return zzapoVar;
        }
        zzapo[] zzapoVarArr = this.zza;
        int length = zzapoVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            zzapo zzapoVar2 = zzapoVarArr[i];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                zzapnVar.zzg();
                throw th;
            }
            if (zzapoVar2.zzf(zzapnVar)) {
                this.zzc = zzapoVar2;
                zzapnVar.zzg();
                break;
            }
            continue;
            zzapnVar.zzg();
            i++;
        }
        zzapo zzapoVar3 = this.zzc;
        if (zzapoVar3 == null) {
            String zzn = zzave.zzn(this.zza);
            StringBuilder sb = new StringBuilder(zzn.length() + 58);
            sb.append("None of the available extractors (");
            sb.append(zzn);
            sb.append(") could read the stream.");
            throw new zzath(sb.toString(), uri);
        }
        zzapoVar3.zzd(this.zzb);
        return this.zzc;
    }
}
