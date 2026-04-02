package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.jf0.a0;
import com.amazon.aps.iva.jf0.b;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lf0.a;
import com.amazon.aps.iva.lf0.c;
import com.amazon.aps.iva.lf0.e;
import com.amazon.aps.iva.lf0.i;
import com.amazon.aps.iva.lf0.o;
import com.amazon.aps.iva.ob0.d;
import com.ellation.crunchyroll.api.etp.account.model.SwitchProfileBody;
import com.ellation.crunchyroll.api.etp.account.model.SwitchProfileResponse;
import com.ellation.crunchyroll.api.etp.account.model.VerifyPhoneBody;
import com.ellation.crunchyroll.api.etp.auth.model.AnonymousTokenResponse;
import com.ellation.crunchyroll.api.etp.auth.model.UserTokenResponse;
import kotlin.Metadata;
/* compiled from: EtpAccountAuthService.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JD\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0002H'JX\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0002H'Jg\u0010\u0011\u001a\u00020\r2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\b\b\u0001\u0010\u0013\u001a\u00020\u0002H'J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\b\b\u0001\u0010\u0017\u001a\u00020\u0016H§@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJg\u0010\u001d\u001a\u00020\r2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u001b\u001a\u00020\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0012J\u001d\u0010!\u001a\u00020 2\b\b\u0001\u0010\u001f\u001a\u00020\u001eH§@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/EtpAccountAuthService;", "", "", "anonymousIdHeader", "grantType", "deviceId", "deviceName", "deviceType", "Lcom/amazon/aps/iva/jf0/b;", "Lcom/ellation/crunchyroll/api/etp/auth/model/AnonymousTokenResponse;", "getAnonymousUserJwt", "refreshToken", "scope", "Lcom/ellation/crunchyroll/api/etp/auth/model/UserTokenResponse;", "refreshUserJwt", "username", "password", "signIn", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "token", "Lcom/amazon/aps/iva/kb0/q;", "revokeRefreshToken", "Lcom/ellation/crunchyroll/api/etp/account/model/VerifyPhoneBody;", "verifyPhoneBody", "Lcom/amazon/aps/iva/jf0/a0;", "requestOtpCode", "(Lcom/ellation/crunchyroll/api/etp/account/model/VerifyPhoneBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "phoneNumber", "verificationCode", "signInOtp", "Lcom/ellation/crunchyroll/api/etp/account/model/SwitchProfileBody;", "body", "Lcom/ellation/crunchyroll/api/etp/account/model/SwitchProfileResponse;", "switchProfile", "(Lcom/ellation/crunchyroll/api/etp/account/model/SwitchProfileBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface EtpAccountAuthService {

    /* compiled from: EtpAccountAuthService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ b getAnonymousUserJwt$default(EtpAccountAuthService etpAccountAuthService, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = "client_id";
                }
                return etpAccountAuthService.getAnonymousUserJwt(str, str2, str3, str4, str5);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAnonymousUserJwt");
        }

        public static /* synthetic */ b refreshUserJwt$default(EtpAccountAuthService etpAccountAuthService, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            String str8;
            String str9;
            if (obj == null) {
                if ((i & 4) != 0) {
                    str8 = "refresh_token";
                } else {
                    str8 = str3;
                }
                if ((i & 8) != 0) {
                    str9 = "offline_access";
                } else {
                    str9 = str4;
                }
                return etpAccountAuthService.refreshUserJwt(str, str2, str8, str9, str5, str6, str7);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshUserJwt");
        }

        public static /* synthetic */ Object signIn$default(EtpAccountAuthService etpAccountAuthService, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, d dVar, int i, Object obj) {
            String str9;
            String str10;
            if (obj == null) {
                if ((i & 8) != 0) {
                    str9 = "password";
                } else {
                    str9 = str4;
                }
                if ((i & 16) != 0) {
                    str10 = "offline_access";
                } else {
                    str10 = str5;
                }
                return etpAccountAuthService.signIn(str, str2, str3, str9, str10, str6, str7, str8, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signIn");
        }

        public static /* synthetic */ Object signInOtp$default(EtpAccountAuthService etpAccountAuthService, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, d dVar, int i, Object obj) {
            String str9;
            String str10;
            if (obj == null) {
                if ((i & 8) != 0) {
                    str9 = "phone";
                } else {
                    str9 = str4;
                }
                if ((i & 16) != 0) {
                    str10 = "offline_access";
                } else {
                    str10 = str5;
                }
                return etpAccountAuthService.signInOtp(str, str2, str3, str9, str10, str6, str7, str8, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signInOtp");
        }
    }

    @o("auth/v1/token")
    @e
    b<AnonymousTokenResponse> getAnonymousUserJwt(@i("ETP-Anonymous-ID") String str, @c("grant_type") String str2, @c("device_id") String str3, @c("device_name") String str4, @c("device_type") String str5);

    @o("auth/v1/token")
    @e
    b<UserTokenResponse> refreshUserJwt(@i("ETP-Anonymous-ID") String str, @c("refresh_token") String str2, @c("grant_type") String str3, @c("scope") String str4, @c("device_id") String str5, @c("device_name") String str6, @c("device_type") String str7);

    @o("auth/v1/phone/verify")
    Object requestOtpCode(@a VerifyPhoneBody verifyPhoneBody, d<? super a0<q>> dVar);

    @o("auth/v1/revoke")
    @e
    b<q> revokeRefreshToken(@c("token") String str);

    @o("auth/v1/token")
    @e
    Object signIn(@i("ETP-Anonymous-ID") String str, @c("username") String str2, @c("password") String str3, @c("grant_type") String str4, @c("scope") String str5, @c("device_id") String str6, @c("device_name") String str7, @c("device_type") String str8, d<? super UserTokenResponse> dVar);

    @o("auth/v1/token")
    @e
    Object signInOtp(@i("ETP-Anonymous-ID") String str, @c("phone_number") String str2, @c("verification_code") String str3, @c("grant_type") String str4, @c("scope") String str5, @c("device_id") String str6, @c("device_name") String str7, @c("device_type") String str8, d<? super UserTokenResponse> dVar);

    @o("auth/v1/token")
    Object switchProfile(@a SwitchProfileBody switchProfileBody, d<? super SwitchProfileResponse> dVar);
}
