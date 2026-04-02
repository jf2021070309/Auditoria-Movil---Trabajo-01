package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.c;
import com.amazon.aps.iva.qb0.e;
import com.google.android.gms.cast.MediaError;
import kotlin.Metadata;
import okhttp3.internal.http.StatusLine;
/* compiled from: UserTokenInteractorImpl.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl", f = "UserTokenInteractorImpl.kt", l = {StatusLine.HTTP_PERM_REDIRECT, MediaError.DetailedErrorCode.HLS_NETWORK_KEY_LOAD, MediaError.DetailedErrorCode.HLS_SEGMENT_PARSING}, m = "runWithExponentialBackoff")
/* loaded from: classes2.dex */
public final class UserTokenInteractorImpl$runWithExponentialBackoff$1<T> extends c {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserTokenInteractorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserTokenInteractorImpl$runWithExponentialBackoff$1(UserTokenInteractorImpl userTokenInteractorImpl, d<? super UserTokenInteractorImpl$runWithExponentialBackoff$1> dVar) {
        super(dVar);
        this.this$0 = userTokenInteractorImpl;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object runWithExponentialBackoff;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        runWithExponentialBackoff = this.this$0.runWithExponentialBackoff(0, null, null, this);
        return runWithExponentialBackoff;
    }
}
