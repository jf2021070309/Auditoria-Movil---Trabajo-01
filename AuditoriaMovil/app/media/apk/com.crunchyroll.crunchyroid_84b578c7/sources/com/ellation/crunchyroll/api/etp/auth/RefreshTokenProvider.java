package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.google.android.gms.common.Scopes;
import java.io.IOException;
import kotlin.Metadata;
/* compiled from: UserTokenInteractorImpl.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007J#\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0007J*\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002H&R\u0014\u0010\u0012\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenProvider;", "", "", "username", "password", "Lcom/amazon/aps/iva/kb0/q;", "signIn", "(Ljava/lang/String;Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "phoneNumber", "otp", "signInWithPhone", "signInWithFun", "", "signInFailed", "Ljava/io/IOException;", "exception", Scopes.EMAIL, "signOut", "isRefreshTokenPresent", "()Z", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface RefreshTokenProvider {

    /* compiled from: UserTokenInteractorImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void signOut$default(RefreshTokenProvider refreshTokenProvider, boolean z, IOException iOException, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    iOException = null;
                }
                if ((i & 4) != 0) {
                    str = null;
                }
                refreshTokenProvider.signOut(z, iOException, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signOut");
        }
    }

    boolean isRefreshTokenPresent();

    Object signIn(String str, String str2, d<? super q> dVar);

    Object signInWithFun(String str, String str2, d<? super q> dVar);

    Object signInWithPhone(String str, String str2, d<? super q> dVar);

    void signOut(boolean z, IOException iOException, String str);
}
