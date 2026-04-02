package com.google.firebase.iid;

import android.os.Bundle;
/* loaded from: classes2.dex */
final class i extends j<Void> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.iid.j
    public final boolean a() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.iid.j
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            a((i) null);
        } else {
            a(new zzal(4, "Invalid response to one way request"));
        }
    }
}
