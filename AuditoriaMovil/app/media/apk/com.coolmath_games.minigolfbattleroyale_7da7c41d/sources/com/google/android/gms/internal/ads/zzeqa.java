package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzeqa implements zzery<zzeqb> {
    private final zzfsn zza;
    private final zzfar zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzeqa(zzfsn zzfsnVar, zzfar zzfarVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfsnVar;
        this.zzb = zzfarVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzeqb> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzepw
            private final zzeqa zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
        if (r9 == 3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void zzb(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeqa.zzb(java.util.ArrayList, android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ zzeqb zzc() throws Exception {
        final ArrayList<String> arrayList = this.zzb.zzg;
        return arrayList == null ? zzepx.zza : arrayList.isEmpty() ? zzepy.zza : new zzeqb(this, arrayList) { // from class: com.google.android.gms.internal.ads.zzepz
            private final zzeqa zza;
            private final ArrayList zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzerx
            public final void zzf(Bundle bundle) {
                this.zza.zzb(this.zzb, bundle);
            }
        };
    }
}
