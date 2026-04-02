package com.google.firebase.iid;

import android.os.Bundle;
/* compiled from: com.google.firebase:firebase-iid@@20.1.6 */
/* loaded from: classes4.dex */
final class zzak extends zzan<Void> {
    public zzak(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    @Override // com.google.firebase.iid.zzan
    public final boolean zza() {
        return true;
    }

    @Override // com.google.firebase.iid.zzan
    public final void zza(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            zza((zzak) null);
        } else {
            zza(new zzam(4, "Invalid response to one way request"));
        }
    }
}
