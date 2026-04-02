package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.error.InactiveClientException;
import com.ellation.crunchyroll.api.etp.error.InvalidRefreshTokenException;
import com.ellation.crunchyroll.api.etp.error.UnauthorizedAccessException;
import com.ellation.crunchyroll.api.etp.error.UserRestrictionException;
import kotlin.Metadata;
/* compiled from: UserTokenInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserTokenInteractorImpl$getJwtSuspend$2$1 extends l implements com.amazon.aps.iva.xb0.l<Throwable, Boolean> {
    public static final UserTokenInteractorImpl$getJwtSuspend$2$1 INSTANCE = new UserTokenInteractorImpl$getJwtSuspend$2$1();

    public UserTokenInteractorImpl$getJwtSuspend$2$1() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(Throwable th) {
        j.f(th, "it");
        return Boolean.valueOf((th instanceof InvalidRefreshTokenException) || (th instanceof UnauthorizedAccessException) || (th instanceof InactiveClientException) || (th instanceof UserRestrictionException));
    }
}
