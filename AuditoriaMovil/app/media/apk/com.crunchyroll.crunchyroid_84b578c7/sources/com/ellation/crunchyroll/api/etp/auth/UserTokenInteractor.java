package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import kotlin.Metadata;
/* compiled from: UserTokenInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H&J\u0013\u0010\u0005\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/UserTokenInteractor;", "Lcom/ellation/crunchyroll/api/etp/auth/JwtProvider;", "Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenProvider;", "Lcom/amazon/aps/iva/kb0/q;", "invalidateJwt", "refreshJwt", "(Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface UserTokenInteractor extends JwtProvider, RefreshTokenProvider {
    void invalidateJwt();

    Object refreshJwt(d<? super q> dVar);
}
