package com.ellation.crunchyroll.cast.dependencies;

import android.content.Context;
import com.amazon.aps.iva.cj.b;
import com.amazon.aps.iva.cj.l;
import com.amazon.aps.iva.ts.c;
import com.amazon.aps.iva.xb0.a;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.cast.expanded.ChromecastMaturePreferenceInteractor;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: CastDependencies.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0011R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/ellation/crunchyroll/cast/dependencies/CastDependencies;", "", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "", "getCastId", "()Ljava/lang/String;", "castId", "", "getMediaRouteMenuItemId", "()I", "mediaRouteMenuItemId", "Lkotlin/Function0;", "Ljava/util/Locale;", "getGetLocale", "()Lcom/amazon/aps/iva/xb0/a;", "getLocale", "", "getGetAutoplaySetting", "getAutoplaySetting", "getHasPremiumBenefit", "hasPremiumBenefit", "getSubtitleLanguage", "subtitleLanguage", "isClosedCaptionsEnabled", "Lcom/amazon/aps/iva/ts/c;", "getApiConfiguration", "()Lcom/amazon/aps/iva/ts/c;", "apiConfiguration", "Lcom/ellation/crunchyroll/api/etp/content/EtpContentService;", "getContentService", "()Lcom/ellation/crunchyroll/api/etp/content/EtpContentService;", "contentService", "Lcom/ellation/crunchyroll/api/etp/account/EtpAccountService;", "getAccountService", "()Lcom/ellation/crunchyroll/api/etp/account/EtpAccountService;", "accountService", "Lcom/amazon/aps/iva/bf/a;", "getNextAssetInteractor", "()Lcom/amazon/aps/iva/bf/a;", "nextAssetInteractor", "Lcom/ellation/crunchyroll/cast/dependencies/CastRouters;", "getRouters", "()Lcom/ellation/crunchyroll/cast/dependencies/CastRouters;", "routers", "Lcom/ellation/crunchyroll/cast/dependencies/CastResources;", "getResources", "()Lcom/ellation/crunchyroll/cast/dependencies/CastResources;", "resources", "Lcom/amazon/aps/iva/cj/l;", "getPlayerFeature", "()Lcom/amazon/aps/iva/cj/l;", "playerFeature", "Lcom/amazon/aps/iva/cj/b;", "getAdvertisingInfoProvider", "()Lcom/amazon/aps/iva/cj/b;", "advertisingInfoProvider", "Lcom/ellation/crunchyroll/cast/expanded/ChromecastMaturePreferenceInteractor;", "getMaturePreferenceInteractor", "()Lcom/ellation/crunchyroll/cast/expanded/ChromecastMaturePreferenceInteractor;", "maturePreferenceInteractor", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface CastDependencies {
    EtpAccountService getAccountService();

    b getAdvertisingInfoProvider();

    c getApiConfiguration();

    String getCastId();

    EtpContentService getContentService();

    Context getContext();

    a<Boolean> getGetAutoplaySetting();

    a<Locale> getGetLocale();

    a<Boolean> getHasPremiumBenefit();

    ChromecastMaturePreferenceInteractor getMaturePreferenceInteractor();

    int getMediaRouteMenuItemId();

    com.amazon.aps.iva.bf.a getNextAssetInteractor();

    l getPlayerFeature();

    CastResources getResources();

    CastRouters getRouters();

    a<String> getSubtitleLanguage();

    a<Boolean> isClosedCaptionsEnabled();
}
