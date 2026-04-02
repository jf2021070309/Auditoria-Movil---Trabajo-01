package com.ellation.crunchyroll.api.drm;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.Gson;
import java.util.Date;
import kotlin.Metadata;
/* compiled from: DrmProxyService.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B-\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/ellation/crunchyroll/api/drm/DrmProxyServiceImpl;", "Lcom/ellation/crunchyroll/api/drm/DrmProxyService;", "", "userId", "generateSessionId", "assetId", "generateBase64EncodedString", "getWidevineLicense", "getSecurePlayWidevineLicenceUrl", "Lkotlin/Function0;", "getAccountId", "Lcom/amazon/aps/iva/xb0/a;", "Lcom/ellation/crunchyroll/api/drm/DrmAuthParamsEncoder;", "drmAuthParamsEncoder", "Lcom/ellation/crunchyroll/api/drm/DrmAuthParamsEncoder;", "svcEnvironment", "Ljava/lang/String;", "drmEndpoint", "<init>", "(Lcom/amazon/aps/iva/xb0/a;Lcom/ellation/crunchyroll/api/drm/DrmAuthParamsEncoder;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DrmProxyServiceImpl implements DrmProxyService {
    public static final String ACCOUNTING_ID = "crunchyroll";
    public static final String DRM_PROXY_PARAM_KEY = "?drmAuthParams=";
    public static final String DRM_SPEC_CONFORM_PARAM = "specConform=true";
    public static final String LICENCE_PATH = "/v1/license/widevine";
    public static final String LICENCE_PROXY_PREFIX = "https://cr-license-proxy";
    public static final String WIDEVINE_PATH = "/drm/v1/widevine";
    private final DrmAuthParamsEncoder drmAuthParamsEncoder;
    private final String drmEndpoint;
    private final a<String> getAccountId;
    private final String svcEnvironment;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DrmProxyService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/api/drm/DrmProxyServiceImpl$Companion;", "", "()V", "ACCOUNTING_ID", "", "DRM_PROXY_PARAM_KEY", "DRM_SPEC_CONFORM_PARAM", "LICENCE_PATH", "LICENCE_PROXY_PREFIX", "WIDEVINE_PATH", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }
    }

    public DrmProxyServiceImpl(a<String> aVar, DrmAuthParamsEncoder drmAuthParamsEncoder, String str, String str2) {
        j.f(aVar, "getAccountId");
        j.f(drmAuthParamsEncoder, "drmAuthParamsEncoder");
        j.f(str, "svcEnvironment");
        j.f(str2, "drmEndpoint");
        this.getAccountId = aVar;
        this.drmAuthParamsEncoder = drmAuthParamsEncoder;
        this.svcEnvironment = str;
        this.drmEndpoint = str2;
    }

    private final String generateBase64EncodedString(String str) {
        String invoke = this.getAccountId.invoke();
        String json = new Gson().toJson(new DrmAuthHeader(invoke, generateSessionId(invoke), str, ACCOUNTING_ID));
        DrmAuthParamsEncoder drmAuthParamsEncoder = this.drmAuthParamsEncoder;
        j.e(json, "drmAuthParams");
        return drmAuthParamsEncoder.encode(json);
    }

    private final String generateSessionId(String str) {
        long time = new Date().getTime();
        return time + "-" + str;
    }

    @Override // com.ellation.crunchyroll.api.drm.DrmProxyService
    public String getSecurePlayWidevineLicenceUrl() {
        return e.e(LICENCE_PROXY_PREFIX, this.svcEnvironment, "/v1/license/widevine?specConform=true");
    }

    @Override // com.ellation.crunchyroll.api.drm.DrmProxyService
    public String getWidevineLicense(String str) {
        j.f(str, "assetId");
        String generateBase64EncodedString = generateBase64EncodedString(str);
        String str2 = this.drmEndpoint;
        return str2 + "/drm/v1/widevine?drmAuthParams=" + generateBase64EncodedString + "&specConform=true";
    }
}
