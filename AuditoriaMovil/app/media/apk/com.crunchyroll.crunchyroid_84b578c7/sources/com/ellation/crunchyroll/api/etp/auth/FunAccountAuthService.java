package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.lf0.c;
import com.amazon.aps.iva.lf0.e;
import com.amazon.aps.iva.lf0.i;
import com.amazon.aps.iva.lf0.o;
import com.amazon.aps.iva.ob0.d;
import com.ellation.crunchyroll.api.etp.auth.model.UserTokenResponse;
import kotlin.Metadata;
/* compiled from: FunAccountAuthService.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0085\u0001\u0010\u000f\u001a\u00020\u000e2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/FunAccountAuthService;", "", "", "anonymousIdHeader", "jwt", "username", "password", "grantType", "scope", "deviceId", "deviceName", "deviceType", "clientId", "clientSecret", "Lcom/ellation/crunchyroll/api/etp/auth/model/UserTokenResponse;", "signInWithFun", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface FunAccountAuthService {

    /* compiled from: FunAccountAuthService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object signInWithFun$default(FunAccountAuthService funAccountAuthService, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, d dVar, int i, Object obj) {
            String str12;
            String str13;
            if (obj == null) {
                if ((i & 16) != 0) {
                    str12 = "password";
                } else {
                    str12 = str5;
                }
                if ((i & 32) != 0) {
                    str13 = "offline_access";
                } else {
                    str13 = str6;
                }
                return funAccountAuthService.signInWithFun(str, str2, str3, str4, str12, str13, str7, str8, str9, str10, str11, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signInWithFun");
        }
    }

    @o("auth/v1/login/funimation")
    @e
    Object signInWithFun(@i("ETP-Anonymous-ID") String str, @i("Authorization") String str2, @c("username") String str3, @c("password") String str4, @c("grant_type") String str5, @c("scope") String str6, @c("device_id") String str7, @c("device_name") String str8, @c("device_type") String str9, @c("client_id") String str10, @c("client_secret") String str11, d<? super UserTokenResponse> dVar);
}
