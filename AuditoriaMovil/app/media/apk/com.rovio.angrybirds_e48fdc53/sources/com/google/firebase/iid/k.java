package com.google.firebase.iid;

import android.os.Bundle;
import com.facebook.share.internal.ShareConstants;
/* loaded from: classes2.dex */
final class k extends j<Bundle> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public k(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.iid.j
    public final boolean a() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.iid.j
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(ShareConstants.WEB_DIALOG_PARAM_DATA);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        a((k) bundle2);
    }
}
