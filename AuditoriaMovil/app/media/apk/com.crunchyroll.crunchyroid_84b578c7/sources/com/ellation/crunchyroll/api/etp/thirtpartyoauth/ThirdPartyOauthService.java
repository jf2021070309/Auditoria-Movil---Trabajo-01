package com.ellation.crunchyroll.api.etp.thirtpartyoauth;

import com.amazon.aps.iva.jf0.a0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lf0.b;
import com.amazon.aps.iva.lf0.f;
import com.amazon.aps.iva.lf0.s;
import com.amazon.aps.iva.lf0.t;
import com.amazon.aps.iva.ob0.d;
import kotlin.Metadata;
/* compiled from: ThirdPartyOauthService.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/thirtpartyoauth/ThirdPartyOauthService;", "", "Lcom/ellation/crunchyroll/api/etp/thirtpartyoauth/ConnectedPlatforms;", "getConnectedPlatforms", "(Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "", "platform", "redirectDeeplink", "Lcom/ellation/crunchyroll/api/etp/thirtpartyoauth/ThirdPartyAppAuthUrls;", "getAuthenticationUrls", "(Ljava/lang/String;Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/amazon/aps/iva/jf0/a0;", "Lcom/amazon/aps/iva/kb0/q;", "disconnectPlatform", "(Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface ThirdPartyOauthService {

    /* compiled from: ThirdPartyOauthService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getAuthenticationUrls$default(ThirdPartyOauthService thirdPartyOauthService, String str, String str2, d dVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = "crunchyroll://settings/connected_apps";
                }
                return thirdPartyOauthService.getAuthenticationUrls(str, str2, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAuthenticationUrls");
        }
    }

    @b("/third-party-oauth/v1/{platform}/token")
    Object disconnectPlatform(@s("platform") String str, d<? super a0<q>> dVar);

    @f("/third-party-oauth/v1/{platform}/authorize_url")
    Object getAuthenticationUrls(@s("platform") String str, @t("callback_redirect") String str2, d<? super ThirdPartyAppAuthUrls> dVar);

    @f("/third-party-oauth/v1/connected_platforms")
    Object getConnectedPlatforms(d<? super ConnectedPlatforms> dVar);
}
