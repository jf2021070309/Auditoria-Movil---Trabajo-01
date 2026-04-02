package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
/* loaded from: classes.dex */
public final class zbb implements PendingResultUtil.ResultConverter {
    private zbb() {
    }

    public /* synthetic */ zbb(zba zbaVar) {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ Object convert(Result result) {
        return ((GoogleSignInResult) result).getSignInAccount();
    }
}
