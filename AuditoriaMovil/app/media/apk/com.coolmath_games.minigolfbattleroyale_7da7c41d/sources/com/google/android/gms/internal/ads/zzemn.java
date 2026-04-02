package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzemn implements zzfrk {
    static final zzfrk zza = new zzemn();

    private zzemn() {
    }

    @Override // com.google.android.gms.internal.ads.zzfrk
    public final zzfsm zza(Object obj) {
        final String str = (String) obj;
        return zzfsd.zza(new zzerx(str) { // from class: com.google.android.gms.internal.ads.zzemo
            private final String zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = str;
            }

            @Override // com.google.android.gms.internal.ads.zzerx
            public final void zzf(Object obj2) {
                ((Bundle) obj2).putString("ms", this.zza);
            }
        });
    }
}
