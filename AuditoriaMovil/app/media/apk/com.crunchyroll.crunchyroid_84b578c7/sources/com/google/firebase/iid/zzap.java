package com.google.firebase.iid;

import android.os.Bundle;
/* compiled from: com.google.firebase:firebase-iid@@20.1.6 */
/* loaded from: classes4.dex */
final class zzap extends zzan<Bundle> {
    public zzap(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    @Override // com.google.firebase.iid.zzan
    public final boolean zza() {
        return false;
    }

    @Override // com.google.firebase.iid.zzan
    public final void zza(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        zza((zzap) bundle2);
    }
}
