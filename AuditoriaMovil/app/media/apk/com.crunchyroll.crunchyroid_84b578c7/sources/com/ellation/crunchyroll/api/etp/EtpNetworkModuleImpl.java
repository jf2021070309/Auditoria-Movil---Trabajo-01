package com.ellation.crunchyroll.api.etp;

import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.b50.v;
import com.amazon.aps.iva.ct.h;
import com.amazon.aps.iva.ct.l;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.i5.g;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.jf0.b0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.nz.b;
import com.amazon.aps.iva.nz.e;
import com.amazon.aps.iva.nz.f;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.se0.t1;
import com.amazon.aps.iva.t50.c;
import com.amazon.aps.iva.ts.b;
import com.amazon.aps.iva.ts.c;
import com.amazon.aps.iva.us.w;
import com.amazon.aps.iva.ww.d;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.t;
import com.crunchyroll.connectivity.d;
import com.ellation.crunchyroll.api.AccountIdInterceptor;
import com.ellation.crunchyroll.api.ApiExtensionsKt;
import com.ellation.crunchyroll.api.AudioLocaleInterceptor;
import com.ellation.crunchyroll.api.DateFormatKt;
import com.ellation.crunchyroll.api.DateTypeAdapter;
import com.ellation.crunchyroll.api.FakePlayServiceKt;
import com.ellation.crunchyroll.api.FmsImagesDeserializer;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.api.HomeFeedResponseDeserializer;
import com.ellation.crunchyroll.api.LocaleInterceptor;
import com.ellation.crunchyroll.api.SearchResponseDeserializer;
import com.ellation.crunchyroll.api.TimeoutInterceptor;
import com.ellation.crunchyroll.api.TokenHeadersInterceptor;
import com.ellation.crunchyroll.api.TryCatchInterceptor;
import com.ellation.crunchyroll.api.UserAgentInterceptor;
import com.ellation.crunchyroll.api.drm.DrmAuthParamsEncoderImpl;
import com.ellation.crunchyroll.api.drm.DrmProxyService;
import com.ellation.crunchyroll.api.drm.DrmProxyServiceImpl;
import com.ellation.crunchyroll.api.etp.RetrofitFactory;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.assets.DigitalAssetManagementService;
import com.ellation.crunchyroll.api.etp.auth.ApiFunUserStore;
import com.ellation.crunchyroll.api.etp.auth.CountryCodeProvider;
import com.ellation.crunchyroll.api.etp.auth.Device;
import com.ellation.crunchyroll.api.etp.auth.EtpAccountAuthService;
import com.ellation.crunchyroll.api.etp.auth.EtpAuthInterceptor;
import com.ellation.crunchyroll.api.etp.auth.EtpAuthenticator;
import com.ellation.crunchyroll.api.etp.auth.FunAccountAuthService;
import com.ellation.crunchyroll.api.etp.auth.JwtInvalidator;
import com.ellation.crunchyroll.api.etp.auth.JwtProvider;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenMonitor;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenStorage;
import com.ellation.crunchyroll.api.etp.auth.SharedPreferencesTokenStorage;
import com.ellation.crunchyroll.api.etp.auth.UserTokenInteractor;
import com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl;
import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import com.ellation.crunchyroll.api.etp.content.ContentServiceMonitorImpl;
import com.ellation.crunchyroll.api.etp.content.EmptyMeta;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.content.EtpContentServiceDecorator;
import com.ellation.crunchyroll.api.etp.contentreviews.ContentReviewsService;
import com.ellation.crunchyroll.api.etp.error.HttpErrorInterceptor;
import com.ellation.crunchyroll.api.etp.externalparteners.ExternalPartnersService;
import com.ellation.crunchyroll.api.etp.funmigration.FunMigrationService;
import com.ellation.crunchyroll.api.etp.index.EtpIndexProvider;
import com.ellation.crunchyroll.api.etp.index.EtpIndexService;
import com.ellation.crunchyroll.api.etp.index.EtpIndexStore;
import com.ellation.crunchyroll.api.etp.index.EtpServiceMonitor;
import com.ellation.crunchyroll.api.etp.index.PolicyChangeMonitor;
import com.ellation.crunchyroll.api.etp.index.SharedPreferencesEtpIndexStore;
import com.ellation.crunchyroll.api.etp.index.model.EtpIndex;
import com.ellation.crunchyroll.api.etp.playback.PlayService;
import com.ellation.crunchyroll.api.etp.playback.PlayServiceDecorator;
import com.ellation.crunchyroll.api.etp.playback.PlaybackSessionsInterceptor;
import com.ellation.crunchyroll.api.etp.playback.SkipEventsService;
import com.ellation.crunchyroll.api.etp.subscription.SubscriptionProcessorService;
import com.ellation.crunchyroll.api.etp.thirtpartyoauth.ThirdPartyOauthService;
import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import com.ellation.crunchyroll.api.panelsinterceptor.PanelsInterceptor;
import com.ellation.crunchyroll.api.panelsinterceptor.WatchlistStatusLoaderImpl;
import com.ellation.crunchyroll.api.panelsinterceptor.WatchlistStatusProviderImpl;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.application.d;
import com.ellation.crunchyroll.model.FmsImages;
import com.ellation.crunchyroll.model.search.SearchResponse;
import com.ellation.crunchyroll.presentation.watchlist.f;
import com.ellation.crunchyroll.watchlist.a;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EtpNetworkModule.kt */
@Metadata(d1 = {"\u0000¢\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u000e\u0010ä\u0001\u001a\t\u0012\u0005\u0012\u00030ã\u00010\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0006\bå\u0001\u0010æ\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00101\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u0002050\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u000eR\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010A\u001a\u00020@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010R\u001a\u00020Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010\"R\u001c\u0010Y\u001a\n X*\u0004\u0018\u00010W0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001a\u0010\\\u001a\u00020[8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001a\u0010a\u001a\u00020`8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001a\u0010f\u001a\u00020e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010k\u001a\u00020j8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u001a\u0010p\u001a\u00020o8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u001a\u0010u\u001a\u00020t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u001a\u0010z\u001a\u00020y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u001d\u0010\u007f\u001a\u00020~8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R \u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R \u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R \u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R \u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R \u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R \u0010 \u0001\u001a\u00030\u009f\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R \u0010¥\u0001\u001a\u00030¤\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R \u0010ª\u0001\u001a\u00030©\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R \u0010¯\u0001\u001a\u00030®\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001R\u0018\u0010´\u0001\u001a\u00030³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R*\u0010·\u0001\u001a\u00030¶\u00018\u0016@\u0016X\u0096.¢\u0006\u0018\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R*\u0010¾\u0001\u001a\u00030½\u00018\u0016@\u0016X\u0096.¢\u0006\u0018\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R*\u0010Å\u0001\u001a\u00030Ä\u00018\u0016@\u0016X\u0096.¢\u0006\u0018\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001R \u0010Ì\u0001\u001a\u00030Ë\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001R \u0010Ñ\u0001\u001a\u00030Ð\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001R\u001d\u0010Õ\u0001\u001a\u00020Q8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bÕ\u0001\u0010S\u001a\u0005\bÖ\u0001\u0010UR \u0010Ø\u0001\u001a\u00030×\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001R\u0018\u0010ß\u0001\u001a\u00030Ü\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÝ\u0001\u0010Þ\u0001R\u0017\u0010â\u0001\u001a\u00020:8VX\u0096\u0004¢\u0006\b\u001a\u0006\bà\u0001\u0010á\u0001¨\u0006ç\u0001"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/EtpNetworkModuleImpl;", "Lcom/ellation/crunchyroll/api/etp/EtpNetworkModule;", "Lcom/ellation/crunchyroll/api/etp/OkHttpClientFactory;", "okHttpClientFactory", "Lcom/ellation/crunchyroll/api/etp/OkHttpClientFactory;", "Lcom/ellation/crunchyroll/application/CrunchyrollApplication;", "application", "Lcom/ellation/crunchyroll/application/CrunchyrollApplication;", "Lcom/amazon/aps/iva/ts/c;", "configuration", "Lcom/amazon/aps/iva/ts/c;", "Lkotlin/Function0;", "", "isUserLoggedIn", "Lcom/amazon/aps/iva/xb0/a;", "Lcom/ellation/crunchyroll/api/etp/error/HttpErrorInterceptor;", "errorInterceptor", "Lcom/ellation/crunchyroll/api/etp/error/HttpErrorInterceptor;", "Lcom/ellation/crunchyroll/api/UserAgentInterceptor;", "userAgentInterceptor", "Lcom/ellation/crunchyroll/api/UserAgentInterceptor;", "Lcom/ellation/crunchyroll/api/TokenHeadersInterceptor;", "tokenHeadersInterceptor", "Lcom/ellation/crunchyroll/api/TokenHeadersInterceptor;", "Lcom/ellation/crunchyroll/api/etp/auth/CountryCodeProvider;", "countryCodeProvider", "Lcom/ellation/crunchyroll/api/etp/auth/CountryCodeProvider;", "getCountryCodeProvider", "()Lcom/ellation/crunchyroll/api/etp/auth/CountryCodeProvider;", "accountStateProvider", "getAccountStateProvider", "()Lcom/ellation/crunchyroll/api/TokenHeadersInterceptor;", "Lcom/amazon/aps/iva/jf0/b0;", "authRetrofit", "Lcom/amazon/aps/iva/jf0/b0;", "Lcom/ellation/crunchyroll/api/etp/auth/EtpAccountAuthService;", "accountAuthService", "Lcom/ellation/crunchyroll/api/etp/auth/EtpAccountAuthService;", "getAccountAuthService", "()Lcom/ellation/crunchyroll/api/etp/auth/EtpAccountAuthService;", "Lcom/ellation/crunchyroll/api/etp/auth/FunAccountAuthService;", "funAccountAuthService", "Lcom/ellation/crunchyroll/api/etp/auth/FunAccountAuthService;", "Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenMonitor;", "refreshTokenMonitor", "Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenMonitor;", "getRefreshTokenMonitor", "()Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenMonitor;", "Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenStorage;", "refreshTokenStorage", "Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenStorage;", "getRefreshTokenStorage", "()Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenStorage;", "Lcom/ellation/crunchyroll/api/etp/auth/ApiFunUserStore;", "getFunUserStorage", "Lcom/amazon/aps/iva/ww/d;", "exponentialBackoffInterceptor", "Lcom/amazon/aps/iva/ww/d;", "Lcom/ellation/crunchyroll/api/etp/auth/UserTokenInteractor;", "userTokenProvider", "Lcom/ellation/crunchyroll/api/etp/auth/UserTokenInteractor;", "Lcom/ellation/crunchyroll/api/etp/auth/EtpAuthenticator;", "authenticator", "Lcom/ellation/crunchyroll/api/etp/auth/EtpAuthenticator;", "Lcom/ellation/crunchyroll/api/etp/auth/EtpAuthInterceptor;", "authInterceptor", "Lcom/ellation/crunchyroll/api/etp/auth/EtpAuthInterceptor;", "getAuthInterceptor", "()Lcom/ellation/crunchyroll/api/etp/auth/EtpAuthInterceptor;", "Lcom/ellation/crunchyroll/api/AccountIdInterceptor;", "accountIdInterceptor", "Lcom/ellation/crunchyroll/api/AccountIdInterceptor;", "Lcom/ellation/crunchyroll/api/LocaleInterceptor;", "localeInterceptor", "Lcom/ellation/crunchyroll/api/LocaleInterceptor;", "Lcom/ellation/crunchyroll/api/AudioLocaleInterceptor;", "audioLocaleInterceptor", "Lcom/ellation/crunchyroll/api/AudioLocaleInterceptor;", "Lcom/ellation/crunchyroll/api/TimeoutInterceptor;", "timeoutInterceptor", "Lcom/ellation/crunchyroll/api/TimeoutInterceptor;", "Lokhttp3/OkHttpClient;", "etpOkHttpClient", "Lokhttp3/OkHttpClient;", "getEtpOkHttpClient", "()Lokhttp3/OkHttpClient;", "etpRetrofit", "Lcom/amazon/aps/iva/kf0/a;", "kotlin.jvm.PlatformType", "gsonConverterFactory", "Lcom/amazon/aps/iva/kf0/a;", "Lcom/ellation/crunchyroll/api/etp/index/EtpIndexService;", "etpIndexService", "Lcom/ellation/crunchyroll/api/etp/index/EtpIndexService;", "getEtpIndexService", "()Lcom/ellation/crunchyroll/api/etp/index/EtpIndexService;", "Lcom/ellation/crunchyroll/api/etp/account/EtpAccountService;", "accountService", "Lcom/ellation/crunchyroll/api/etp/account/EtpAccountService;", "getAccountService", "()Lcom/ellation/crunchyroll/api/etp/account/EtpAccountService;", "Lcom/ellation/crunchyroll/api/etp/assets/DigitalAssetManagementService;", "assetsService", "Lcom/ellation/crunchyroll/api/etp/assets/DigitalAssetManagementService;", "getAssetsService", "()Lcom/ellation/crunchyroll/api/etp/assets/DigitalAssetManagementService;", "Lcom/ellation/crunchyroll/api/etp/commenting/TalkboxService;", "talkboxService", "Lcom/ellation/crunchyroll/api/etp/commenting/TalkboxService;", "getTalkboxService", "()Lcom/ellation/crunchyroll/api/etp/commenting/TalkboxService;", "Lcom/ellation/crunchyroll/api/etp/contentreviews/ContentReviewsService;", "contentReviewService", "Lcom/ellation/crunchyroll/api/etp/contentreviews/ContentReviewsService;", "getContentReviewService", "()Lcom/ellation/crunchyroll/api/etp/contentreviews/ContentReviewsService;", "Lcom/ellation/crunchyroll/api/etp/subscription/SubscriptionProcessorService;", "subscriptionProcessorService", "Lcom/ellation/crunchyroll/api/etp/subscription/SubscriptionProcessorService;", "getSubscriptionProcessorService", "()Lcom/ellation/crunchyroll/api/etp/subscription/SubscriptionProcessorService;", "Lcom/ellation/crunchyroll/api/etp/externalparteners/ExternalPartnersService;", "externalPartnersService", "Lcom/ellation/crunchyroll/api/etp/externalparteners/ExternalPartnersService;", "getExternalPartnersService", "()Lcom/ellation/crunchyroll/api/etp/externalparteners/ExternalPartnersService;", "Lcom/ellation/crunchyroll/api/etp/thirtpartyoauth/ThirdPartyOauthService;", "thirdPartyOauthService", "Lcom/ellation/crunchyroll/api/etp/thirtpartyoauth/ThirdPartyOauthService;", "getThirdPartyOauthService", "()Lcom/ellation/crunchyroll/api/etp/thirtpartyoauth/ThirdPartyOauthService;", "Lcom/ellation/crunchyroll/api/etp/funmigration/FunMigrationService;", "funMigrationService", "Lcom/ellation/crunchyroll/api/etp/funmigration/FunMigrationService;", "getFunMigrationService", "()Lcom/ellation/crunchyroll/api/etp/funmigration/FunMigrationService;", "Lcom/ellation/crunchyroll/api/etp/playback/PlayServiceDecorator;", "playService", "Lcom/ellation/crunchyroll/api/etp/playback/PlayServiceDecorator;", "getPlayService", "()Lcom/ellation/crunchyroll/api/etp/playback/PlayServiceDecorator;", "Lcom/ellation/crunchyroll/api/etp/playback/SkipEventsService;", "skipEventsService", "Lcom/ellation/crunchyroll/api/etp/playback/SkipEventsService;", "getSkipEventsService", "()Lcom/ellation/crunchyroll/api/etp/playback/SkipEventsService;", "Lcom/ellation/crunchyroll/api/etp/index/EtpIndexStore;", "etpIndexStore", "Lcom/ellation/crunchyroll/api/etp/index/EtpIndexStore;", "Lcom/amazon/aps/iva/ct/l;", "userBenefitsSynchronizer", "Lcom/amazon/aps/iva/ct/l;", "getUserBenefitsSynchronizer", "()Lcom/amazon/aps/iva/ct/l;", "Lcom/amazon/aps/iva/ct/d;", "userBenefitsChangeMonitor", "Lcom/amazon/aps/iva/ct/d;", "getUserBenefitsChangeMonitor", "()Lcom/amazon/aps/iva/ct/d;", "Lcom/ellation/crunchyroll/api/etp/index/EtpServiceMonitor;", "etpServiceMonitor", "Lcom/ellation/crunchyroll/api/etp/index/EtpServiceMonitor;", "getEtpServiceMonitor", "()Lcom/ellation/crunchyroll/api/etp/index/EtpServiceMonitor;", "Lcom/ellation/crunchyroll/api/etp/index/PolicyChangeMonitor;", "policyChangeMonitor", "Lcom/ellation/crunchyroll/api/etp/index/PolicyChangeMonitor;", "getPolicyChangeMonitor", "()Lcom/ellation/crunchyroll/api/etp/index/PolicyChangeMonitor;", "Lcom/ellation/crunchyroll/api/etp/index/EtpIndexProvider;", "etpIndexProvider", "Lcom/ellation/crunchyroll/api/etp/index/EtpIndexProvider;", "getEtpIndexProvider", "()Lcom/ellation/crunchyroll/api/etp/index/EtpIndexProvider;", "Lcom/amazon/aps/iva/z40/c;", "inactiveClientMonitor", "Lcom/amazon/aps/iva/z40/c;", "getInactiveClientMonitor", "()Lcom/amazon/aps/iva/z40/c;", "Lcom/ellation/crunchyroll/api/panelsinterceptor/PanelsInterceptor;", "panelsInterceptor", "Lcom/ellation/crunchyroll/api/panelsinterceptor/PanelsInterceptor;", "Lcom/amazon/aps/iva/nz/f;", "playheadsSynchronizerAgent", "Lcom/amazon/aps/iva/nz/f;", "getPlayheadsSynchronizerAgent", "()Lcom/amazon/aps/iva/nz/f;", "setPlayheadsSynchronizerAgent", "(Lcom/amazon/aps/iva/nz/f;)V", "Lcom/amazon/aps/iva/nz/e;", "playheadsSynchronizer", "Lcom/amazon/aps/iva/nz/e;", "getPlayheadsSynchronizer", "()Lcom/amazon/aps/iva/nz/e;", "setPlayheadsSynchronizer", "(Lcom/amazon/aps/iva/nz/e;)V", "Lcom/ellation/crunchyroll/api/etp/content/EtpContentService;", "etpContentService", "Lcom/ellation/crunchyroll/api/etp/content/EtpContentService;", "getEtpContentService", "()Lcom/ellation/crunchyroll/api/etp/content/EtpContentService;", "setEtpContentService", "(Lcom/ellation/crunchyroll/api/etp/content/EtpContentService;)V", "Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenProvider;", "refreshTokenProvider", "Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenProvider;", "getRefreshTokenProvider", "()Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenProvider;", "Lcom/ellation/crunchyroll/api/etp/auth/JwtInvalidator;", "jwtInvalidator", "Lcom/ellation/crunchyroll/api/etp/auth/JwtInvalidator;", "getJwtInvalidator", "()Lcom/ellation/crunchyroll/api/etp/auth/JwtInvalidator;", "simpleOkHttpClient", "getSimpleOkHttpClient", "Lcom/ellation/crunchyroll/api/drm/DrmProxyService;", "drmProxyService", "Lcom/ellation/crunchyroll/api/drm/DrmProxyService;", "getDrmProxyService", "()Lcom/ellation/crunchyroll/api/drm/DrmProxyService;", "Lcom/ellation/crunchyroll/api/etp/auth/JwtProvider;", "getJwtProvider", "()Lcom/ellation/crunchyroll/api/etp/auth/JwtProvider;", "jwtProvider", "getUserTokenInteractor", "()Lcom/ellation/crunchyroll/api/etp/auth/UserTokenInteractor;", "userTokenInteractor", "Ljava/util/Locale;", "getLocale", "<init>", "(Lcom/amazon/aps/iva/xb0/a;Lcom/ellation/crunchyroll/api/etp/OkHttpClientFactory;Lcom/ellation/crunchyroll/application/CrunchyrollApplication;)V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class EtpNetworkModuleImpl implements EtpNetworkModule {
    private final EtpAccountAuthService accountAuthService;
    private final AccountIdInterceptor accountIdInterceptor;
    private final EtpAccountService accountService;
    private final TokenHeadersInterceptor accountStateProvider;
    private final CrunchyrollApplication application;
    private final DigitalAssetManagementService assetsService;
    private final AudioLocaleInterceptor audioLocaleInterceptor;
    private final EtpAuthInterceptor authInterceptor;
    private final b0 authRetrofit;
    private final EtpAuthenticator authenticator;
    private final c configuration;
    private final ContentReviewsService contentReviewService;
    private final CountryCodeProvider countryCodeProvider;
    private final DrmProxyService drmProxyService;
    private final HttpErrorInterceptor errorInterceptor;
    public EtpContentService etpContentService;
    private final EtpIndexProvider etpIndexProvider;
    private final EtpIndexService etpIndexService;
    private final EtpIndexStore etpIndexStore;
    private final OkHttpClient etpOkHttpClient;
    private final b0 etpRetrofit;
    private final EtpServiceMonitor etpServiceMonitor;
    private final d exponentialBackoffInterceptor;
    private final ExternalPartnersService externalPartnersService;
    private final FunAccountAuthService funAccountAuthService;
    private final FunMigrationService funMigrationService;
    private final a<ApiFunUserStore> getFunUserStorage;
    private final com.amazon.aps.iva.kf0.a gsonConverterFactory;
    private final com.amazon.aps.iva.z40.c inactiveClientMonitor;
    private final a<Boolean> isUserLoggedIn;
    private final JwtInvalidator jwtInvalidator;
    private final LocaleInterceptor localeInterceptor;
    private final OkHttpClientFactory okHttpClientFactory;
    private final PanelsInterceptor panelsInterceptor;
    private final PlayServiceDecorator playService;
    public e playheadsSynchronizer;
    public f playheadsSynchronizerAgent;
    private final PolicyChangeMonitor policyChangeMonitor;
    private final RefreshTokenMonitor refreshTokenMonitor;
    private final RefreshTokenProvider refreshTokenProvider;
    private final RefreshTokenStorage refreshTokenStorage;
    private final OkHttpClient simpleOkHttpClient;
    private final SkipEventsService skipEventsService;
    private final SubscriptionProcessorService subscriptionProcessorService;
    private final TalkboxService talkboxService;
    private final ThirdPartyOauthService thirdPartyOauthService;
    private final TimeoutInterceptor timeoutInterceptor;
    private final TokenHeadersInterceptor tokenHeadersInterceptor;
    private final UserAgentInterceptor userAgentInterceptor;
    private final com.amazon.aps.iva.ct.d userBenefitsChangeMonitor;
    private final l userBenefitsSynchronizer;
    private final UserTokenInteractor userTokenProvider;

    /* compiled from: EtpNetworkModule.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.ellation.crunchyroll.api.etp.EtpNetworkModuleImpl$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class AnonymousClass2 extends i implements com.amazon.aps.iva.xb0.l<EtpIndex, q> {
        public AnonymousClass2(Object obj) {
            super(1, obj, EtpServiceMonitor.class, "onIndexRefresh", "onIndexRefresh(Lcom/ellation/crunchyroll/api/etp/index/model/EtpIndex;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public /* bridge */ /* synthetic */ q invoke(EtpIndex etpIndex) {
            invoke2(etpIndex);
            return q.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(EtpIndex etpIndex) {
            j.f(etpIndex, "p0");
            ((EtpServiceMonitor) this.receiver).onIndexRefresh(etpIndex);
        }
    }

    public EtpNetworkModuleImpl(a<Locale> aVar, OkHttpClientFactory okHttpClientFactory, CrunchyrollApplication crunchyrollApplication) {
        j.f(aVar, "getLocale");
        j.f(okHttpClientFactory, "okHttpClientFactory");
        j.f(crunchyrollApplication, "application");
        this.okHttpClientFactory = okHttpClientFactory;
        this.application = crunchyrollApplication;
        com.amazon.aps.iva.ts.a aVar2 = b.c;
        this.configuration = aVar2;
        EtpNetworkModuleImpl$isUserLoggedIn$1 etpNetworkModuleImpl$isUserLoggedIn$1 = new EtpNetworkModuleImpl$isUserLoggedIn$1(this);
        this.isUserLoggedIn = etpNetworkModuleImpl$isUserLoggedIn$1;
        EtpNetworkModuleImpl$errorInterceptor$1 etpNetworkModuleImpl$errorInterceptor$1 = new EtpNetworkModuleImpl$errorInterceptor$1(this);
        b.a.getClass();
        HttpErrorInterceptor httpErrorInterceptor = new HttpErrorInterceptor(etpNetworkModuleImpl$errorInterceptor$1, false, new EtpNetworkModuleImpl$errorInterceptor$2(this));
        this.errorInterceptor = httpErrorInterceptor;
        String str = Build.VERSION.RELEASE;
        j.e(str, "RELEASE");
        UserAgentInterceptor userAgentInterceptor = new UserAgentInterceptor("3.46.2", str);
        this.userAgentInterceptor = userAgentInterceptor;
        TokenHeadersInterceptor tokenHeadersInterceptor = new TokenHeadersInterceptor(EtpNetworkModuleImpl$tokenHeadersInterceptor$1.INSTANCE);
        this.tokenHeadersInterceptor = tokenHeadersInterceptor;
        this.countryCodeProvider = CountryCodeProvider.Companion.create(new EtpNetworkModuleImpl$countryCodeProvider$1(this));
        this.accountStateProvider = tokenHeadersInterceptor;
        RetrofitFactory.Companion companion = RetrofitFactory.Companion;
        b0 buildEtpRetrofit$default = RetrofitFactory.DefaultImpls.buildEtpRetrofit$default(companion.create(aVar2, okHttpClientFactory.newBasicAuthClientBuilder(httpErrorInterceptor).addNetworkInterceptor(new TryCatchInterceptor(userAgentInterceptor)).addNetworkInterceptor(tokenHeadersInterceptor).addInterceptor(new PlaybackSessionsInterceptor(new EtpNetworkModuleImpl$authRetrofit$1(this))).build()), null, 1, null);
        this.authRetrofit = buildEtpRetrofit$default;
        this.accountAuthService = (EtpAccountAuthService) buildEtpRetrofit$default.b(EtpAccountAuthService.class);
        FunAccountAuthService funAccountAuthService = (FunAccountAuthService) RetrofitFactory.DefaultImpls.buildEtpRetrofit$default(companion.create(aVar2, ApiExtensionsKt.addCountryOverrideInterceptor(okHttpClientFactory.newClientBuilder(httpErrorInterceptor, new TryCatchInterceptor(userAgentInterceptor), tokenHeadersInterceptor), aVar2).build()), null, 1, null).b(FunAccountAuthService.class);
        this.funAccountAuthService = funAccountAuthService;
        this.refreshTokenMonitor = RefreshTokenMonitor.Companion.create();
        CrunchyrollApplication crunchyrollApplication2 = CrunchyrollApplication.m;
        CrunchyrollApplication a = CrunchyrollApplication.a.a();
        c.b bVar = c.b.a;
        String str2 = com.amazon.aps.iva.ts.a.e;
        SharedPreferencesTokenStorage sharedPreferencesTokenStorage = new SharedPreferencesTokenStorage(a, bVar, str2);
        String str3 = com.amazon.aps.iva.ts.a.u;
        str3 = m.b0(str3) ^ true ? str3 : null;
        if (str3 != null) {
            sharedPreferencesTokenStorage.setRefreshToken(str3);
        }
        this.refreshTokenStorage = sharedPreferencesTokenStorage;
        EtpNetworkModuleImpl$getFunUserStorage$1 etpNetworkModuleImpl$getFunUserStorage$1 = EtpNetworkModuleImpl$getFunUserStorage$1.INSTANCE;
        this.getFunUserStorage = etpNetworkModuleImpl$getFunUserStorage$1;
        d dVar = new d();
        this.exponentialBackoffInterceptor = dVar;
        EtpAccountAuthService accountAuthService = getAccountAuthService();
        RefreshTokenStorage refreshTokenStorage = getRefreshTokenStorage();
        RefreshTokenMonitor refreshTokenMonitor = getRefreshTokenMonitor();
        EtpNetworkModuleImpl$userTokenProvider$1 etpNetworkModuleImpl$userTokenProvider$1 = EtpNetworkModuleImpl$userTokenProvider$1.INSTANCE;
        EtpNetworkModuleImpl$userTokenProvider$2 etpNetworkModuleImpl$userTokenProvider$2 = EtpNetworkModuleImpl$userTokenProvider$2.INSTANCE;
        EtpNetworkModuleImpl$userTokenProvider$3 etpNetworkModuleImpl$userTokenProvider$3 = new EtpNetworkModuleImpl$userTokenProvider$3(this);
        EtpNetworkModuleImpl$userTokenProvider$4 etpNetworkModuleImpl$userTokenProvider$4 = new EtpNetworkModuleImpl$userTokenProvider$4(this);
        String deviceId = k.n(crunchyrollApplication).c.b.getDeviceId();
        String string = Settings.Global.getString(k.n(crunchyrollApplication).c.a.getContentResolver(), "device_name");
        k.n(crunchyrollApplication).c.getClass();
        String str4 = Build.MANUFACTURER;
        j.e(str4, "MANUFACTURER");
        k.n(crunchyrollApplication).c.getClass();
        String str5 = Build.MODEL;
        j.e(str5, "MODEL");
        UserTokenInteractorImpl userTokenInteractorImpl = new UserTokenInteractorImpl(accountAuthService, funAccountAuthService, aVar2, refreshTokenStorage, refreshTokenMonitor, etpNetworkModuleImpl$getFunUserStorage$1, etpNetworkModuleImpl$userTokenProvider$1, etpNetworkModuleImpl$userTokenProvider$2, etpNetworkModuleImpl$userTokenProvider$3, etpNetworkModuleImpl$userTokenProvider$4, new Device(deviceId, string, str4, str5), null, getCountryCodeProvider(), 2048, null);
        this.userTokenProvider = userTokenInteractorImpl;
        EtpAuthenticator etpAuthenticator = new EtpAuthenticator(userTokenInteractorImpl);
        this.authenticator = etpAuthenticator;
        this.authInterceptor = new EtpAuthInterceptor(userTokenInteractorImpl);
        AccountIdInterceptor accountIdInterceptor = new AccountIdInterceptor(new EtpNetworkModuleImpl$accountIdInterceptor$1(this));
        this.accountIdInterceptor = accountIdInterceptor;
        LocaleInterceptor localeInterceptor = new LocaleInterceptor(aVar);
        this.localeInterceptor = localeInterceptor;
        AudioLocaleInterceptor audioLocaleInterceptor = new AudioLocaleInterceptor(EtpNetworkModuleImpl$audioLocaleInterceptor$1.INSTANCE);
        this.audioLocaleInterceptor = audioLocaleInterceptor;
        TimeoutInterceptor timeoutInterceptor = new TimeoutInterceptor();
        this.timeoutInterceptor = timeoutInterceptor;
        this.etpOkHttpClient = okHttpClientFactory.newClientBuilder(getAuthInterceptor(), accountIdInterceptor, dVar, httpErrorInterceptor, timeoutInterceptor).addNetworkInterceptor(userAgentInterceptor).authenticator(etpAuthenticator).build();
        b0 buildEtpRetrofit$default2 = RetrofitFactory.DefaultImpls.buildEtpRetrofit$default(companion.create(aVar2, getEtpOkHttpClient()), null, 1, null);
        this.etpRetrofit = buildEtpRetrofit$default2;
        com.amazon.aps.iva.kf0.a c = com.amazon.aps.iva.kf0.a.c(GsonHolder.getInstance());
        this.gsonConverterFactory = c;
        this.etpIndexService = (EtpIndexService) buildEtpRetrofit$default2.b(EtpIndexService.class);
        this.accountService = (EtpAccountService) buildEtpRetrofit$default2.b(EtpAccountService.class);
        this.assetsService = (DigitalAssetManagementService) buildEtpRetrofit$default2.b(DigitalAssetManagementService.class);
        RetrofitFactory create = companion.create(aVar2, okHttpClientFactory.newClientBuilder(getAuthInterceptor(), accountIdInterceptor, localeInterceptor, dVar, httpErrorInterceptor, timeoutInterceptor).addNetworkInterceptor(userAgentInterceptor).authenticator(etpAuthenticator).build());
        Locale locale = Locale.US;
        this.talkboxService = (TalkboxService) create.buildEtpRetrofit(new TypeAdapter(Date.class, new DateTypeAdapter(new SimpleDateFormat(DateFormatKt.TALKBOX_DATE_FORMAT, locale), new SimpleDateFormat(DateFormatKt.TALKBOX_DATE_FORMAT, locale), null, 4, null))).b(TalkboxService.class);
        this.contentReviewService = (ContentReviewsService) RetrofitFactory.DefaultImpls.buildEtpRetrofit$default(companion.create(aVar2, okHttpClientFactory.newClientBuilder(getAuthInterceptor(), accountIdInterceptor, localeInterceptor, dVar, httpErrorInterceptor, timeoutInterceptor).addNetworkInterceptor(userAgentInterceptor).authenticator(etpAuthenticator).build()), null, 1, null).b(ContentReviewsService.class);
        this.subscriptionProcessorService = (SubscriptionProcessorService) buildEtpRetrofit$default2.b(SubscriptionProcessorService.class);
        this.externalPartnersService = (ExternalPartnersService) buildEtpRetrofit$default2.b(ExternalPartnersService.class);
        this.thirdPartyOauthService = (ThirdPartyOauthService) buildEtpRetrofit$default2.b(ThirdPartyOauthService.class);
        this.funMigrationService = (FunMigrationService) buildEtpRetrofit$default2.b(FunMigrationService.class);
        PlayServiceDecorator.Companion companion2 = PlayServiceDecorator.Companion;
        b0.b bVar2 = new b0.b();
        aVar2.getClass();
        String str6 = com.amazon.aps.iva.ts.a.h;
        bVar2.b("https://cr-play-service" + str6);
        bVar2.d(okHttpClientFactory.newClientBuilder(getAuthInterceptor(), accountIdInterceptor, dVar, httpErrorInterceptor, timeoutInterceptor).addNetworkInterceptor(userAgentInterceptor).authenticator(etpAuthenticator).build());
        bVar2.a(c);
        this.playService = PlayServiceDecorator.Companion.create$default(companion2, FakePlayServiceKt.mockStreamsLimitExceededIfNeeded((PlayService) bVar2.c().b(PlayService.class)), null, null, 6, null);
        b0.b bVar3 = new b0.b();
        aVar2.getClass();
        String str7 = com.amazon.aps.iva.ts.a.k;
        String str8 = com.amazon.aps.iva.ts.a.g;
        bVar3.b(str7 + str8);
        bVar3.d(getEtpOkHttpClient());
        bVar3.a(c);
        this.skipEventsService = (SkipEventsService) bVar3.c().b(SkipEventsService.class);
        Gson gsonHolder = GsonHolder.getInstance();
        SharedPreferences sharedPreferences = crunchyrollApplication.getSharedPreferences("index_store", 0);
        j.e(sharedPreferences, "application.getSharedPre…e\", Context.MODE_PRIVATE)");
        SharedPreferencesEtpIndexStore sharedPreferencesEtpIndexStore = new SharedPreferencesEtpIndexStore(str2, gsonHolder, sharedPreferences);
        this.etpIndexStore = sharedPreferencesEtpIndexStore;
        this.inactiveClientMonitor = new com.amazon.aps.iva.z40.e();
        v vVar = new v(new EtpNetworkModuleImpl$panelsInterceptor$1(this), z.j());
        f.a.a = vVar;
        PanelsInterceptor panelsInterceptor = new PanelsInterceptor(new WatchlistStatusProviderImpl(new WatchlistStatusLoaderImpl(vVar), null, 2, null));
        this.panelsInterceptor = panelsInterceptor;
        this.refreshTokenProvider = userTokenInteractorImpl;
        androidx.lifecycle.m mVar = androidx.lifecycle.m.j;
        j.f(mVar, "lifecycleOwner");
        g gVar = new g() { // from class: com.ellation.crunchyroll.presentation.watchlist.WatchlistItemsLoader$Companion$subscribe$1
            @Override // com.amazon.aps.iva.i5.g
            public final void onResume(o oVar) {
                v vVar2 = f.a.a;
                if (vVar2 != null) {
                    vVar2.invalidate();
                } else {
                    j.m("instance");
                    throw null;
                }
            }
        };
        androidx.lifecycle.k kVar = mVar.g;
        kVar.addObserver(gVar);
        com.ellation.crunchyroll.watchlist.a.u0.getClass();
        com.ellation.crunchyroll.watchlist.a aVar3 = a.C0975a.b;
        v vVar2 = f.a.a;
        if (vVar2 != null) {
            aVar3.a(vVar2, mVar);
            EtpAuthInterceptor authInterceptor = getAuthInterceptor();
            com.ellation.crunchyroll.application.d a2 = d.a.a();
            j.f(authInterceptor, "authInterceptor");
            j.f(a2, "appLifecycle");
            a.C0959a.a = new com.ellation.crunchyroll.application.b(authInterceptor, etpAuthenticator, okHttpClientFactory, a2);
            SubscriptionProcessorService subscriptionProcessorService = getSubscriptionProcessorService();
            j.f(subscriptionProcessorService, "subscriptionProcessorService");
            h hVar = new h(subscriptionProcessorService);
            AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
            com.amazon.aps.iva.ct.k a3 = com.ellation.crunchyroll.application.f.a(null, 3);
            t1 t1Var = com.amazon.aps.iva.xe0.k.a;
            com.ellation.crunchyroll.application.d a4 = d.a.a();
            com.ellation.crunchyroll.application.a aVar4 = a.C0959a.a;
            if (aVar4 != null) {
                Object c2 = aVar4.c().c(com.amazon.aps.iva.ct.f.class, "user_benefits");
                if (c2 != null) {
                    j.f(anonymousClass1, "identifyUser");
                    j.f(t1Var, "dispatcher");
                    j.f(a4, "appLifecycle");
                    this.userBenefitsSynchronizer = new com.amazon.aps.iva.ct.m(a4, (com.amazon.aps.iva.ct.f) c2, hVar, a3, t1Var, anonymousClass1, etpNetworkModuleImpl$isUserLoggedIn$1);
                    this.userBenefitsChangeMonitor = getUserBenefitsSynchronizer();
                    this.etpServiceMonitor = new EtpServiceMonitor(false);
                    this.policyChangeMonitor = new PolicyChangeMonitorImpl(getUserBenefitsSynchronizer(), null, null, null, 14, null);
                    this.etpIndexProvider = EtpIndexProvider.Companion.create(sharedPreferencesEtpIndexStore, getEtpIndexService(), userTokenInteractorImpl, new AnonymousClass2(getEtpServiceMonitor()));
                    this.jwtInvalidator = JwtInvalidator.Companion.create$default(JwtInvalidator.Companion, userTokenInteractorImpl, getPolicyChangeMonitor(), getEtpIndexProvider(), new t(d.a.a()) { // from class: com.ellation.crunchyroll.api.etp.EtpNetworkModuleImpl.3
                        @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
                        public Object get() {
                            return Boolean.valueOf(((com.ellation.crunchyroll.application.d) this.receiver).isResumed());
                        }
                    }, null, null, 48, null);
                    d.a.a(crunchyrollApplication, kVar).a(new com.amazon.aps.iva.mf.a() { // from class: com.ellation.crunchyroll.api.etp.EtpNetworkModuleImpl.4
                        @Override // com.amazon.aps.iva.mf.a
                        public void onConnectionLost() {
                        }

                        @Override // com.amazon.aps.iva.mf.a
                        public void onConnectionRefresh(boolean z) {
                        }

                        @Override // com.amazon.aps.iva.mf.a
                        public void onConnectionRestored() {
                            EtpNetworkModuleImpl.this.getJwtInvalidator().onConnectionRestored();
                        }

                        @Override // com.amazon.aps.iva.mf.a
                        public void onConnectionUpdated(boolean z) {
                        }
                    });
                    RetrofitFactory create2 = companion.create(aVar2, okHttpClientFactory.newClientBuilder(getAuthInterceptor(), accountIdInterceptor, localeInterceptor, audioLocaleInterceptor, new com.amazon.aps.iva.nz.d(new EtpNetworkModuleImpl$5$etpContentService$1(this)), panelsInterceptor, dVar, httpErrorInterceptor, timeoutInterceptor).addNetworkInterceptor(userAgentInterceptor).authenticator(etpAuthenticator).build());
                    TypeAdapter typeAdapter = new TypeAdapter(Date.class, new DateTypeAdapter(null, null, null, 7, null));
                    TypeAdapter typeAdapter2 = new TypeAdapter(SearchResponse.class, new SearchResponseDeserializer());
                    Type type = new TypeToken<ContentApiResponse<HomeFeedItemRaw, EmptyMeta>>() { // from class: com.ellation.crunchyroll.api.etp.EtpNetworkModuleImpl$5$etpContentService$2
                    }.getType();
                    j.e(type, "object : TypeToken<Conte…                    .type");
                    EtpContentService etpContentService = (EtpContentService) create2.buildEtpRetrofit(typeAdapter, typeAdapter2, new TypeAdapter(type, new HomeFeedResponseDeserializer(EtpNetworkModuleImpl$5$etpContentService$3.INSTANCE)), new TypeAdapter(FmsImages.class, new FmsImagesDeserializer(str7))).b(EtpContentService.class);
                    j.e(etpContentService, "etpContentService");
                    setEtpContentService(new EtpContentServiceDecorator(etpContentService, new ContentServiceMonitorImpl(EtpNetworkModuleImpl$5$1.INSTANCE), null, 0, 12, null));
                    setPlayheadsSynchronizer(new com.amazon.aps.iva.kw.g(com.ellation.crunchyroll.application.e.b(), getEtpContentService()));
                    com.ellation.crunchyroll.application.d a5 = d.a.a();
                    com.crunchyroll.connectivity.d a6 = d.a.a(crunchyrollApplication, kVar);
                    e playheadsSynchronizer = getPlayheadsSynchronizer();
                    com.amazon.aps.iva.ye0.c cVar = r0.a;
                    j.f(t1Var, "dispatcher");
                    com.amazon.aps.iva.nz.c cVar2 = b.a.a;
                    if (cVar2 == null) {
                        cVar2 = new com.amazon.aps.iva.nz.c(t1Var);
                        b.a.a = cVar2;
                    }
                    j.f(a5, "appLifecycle");
                    j.f(playheadsSynchronizer, "playheadsSynchronizer");
                    setPlayheadsSynchronizerAgent(new com.amazon.aps.iva.nz.h(a5, a6, playheadsSynchronizer, cVar2, etpNetworkModuleImpl$isUserLoggedIn$1));
                    this.simpleOkHttpClient = okHttpClientFactory.newClientBuilder(new Interceptor[0]).build();
                    this.drmProxyService = new DrmProxyServiceImpl(EtpNetworkModuleImpl$drmProxyService$1.INSTANCE, new DrmAuthParamsEncoderImpl(), str6, com.amazon.aps.iva.ts.a.l);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.benefits.UserBenefitsConfigImpl");
            }
            j.m("instance");
            throw null;
        }
        j.m("instance");
        throw null;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public EtpAccountAuthService getAccountAuthService() {
        return this.accountAuthService;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public EtpAccountService getAccountService() {
        return this.accountService;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public DigitalAssetManagementService getAssetsService() {
        return this.assetsService;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public EtpAuthInterceptor getAuthInterceptor() {
        return this.authInterceptor;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public ContentReviewsService getContentReviewService() {
        return this.contentReviewService;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public CountryCodeProvider getCountryCodeProvider() {
        return this.countryCodeProvider;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public DrmProxyService getDrmProxyService() {
        return this.drmProxyService;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public EtpContentService getEtpContentService() {
        EtpContentService etpContentService = this.etpContentService;
        if (etpContentService != null) {
            return etpContentService;
        }
        j.m("etpContentService");
        throw null;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public EtpIndexProvider getEtpIndexProvider() {
        return this.etpIndexProvider;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public EtpIndexService getEtpIndexService() {
        return this.etpIndexService;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public OkHttpClient getEtpOkHttpClient() {
        return this.etpOkHttpClient;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public ExternalPartnersService getExternalPartnersService() {
        return this.externalPartnersService;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public FunMigrationService getFunMigrationService() {
        return this.funMigrationService;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public com.amazon.aps.iva.z40.c getInactiveClientMonitor() {
        return this.inactiveClientMonitor;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public JwtInvalidator getJwtInvalidator() {
        return this.jwtInvalidator;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public JwtProvider getJwtProvider() {
        return this.userTokenProvider;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public e getPlayheadsSynchronizer() {
        e eVar = this.playheadsSynchronizer;
        if (eVar != null) {
            return eVar;
        }
        j.m("playheadsSynchronizer");
        throw null;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public com.amazon.aps.iva.nz.f getPlayheadsSynchronizerAgent() {
        com.amazon.aps.iva.nz.f fVar = this.playheadsSynchronizerAgent;
        if (fVar != null) {
            return fVar;
        }
        j.m("playheadsSynchronizerAgent");
        throw null;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public PolicyChangeMonitor getPolicyChangeMonitor() {
        return this.policyChangeMonitor;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public RefreshTokenMonitor getRefreshTokenMonitor() {
        return this.refreshTokenMonitor;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public RefreshTokenProvider getRefreshTokenProvider() {
        return this.refreshTokenProvider;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public RefreshTokenStorage getRefreshTokenStorage() {
        return this.refreshTokenStorage;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public OkHttpClient getSimpleOkHttpClient() {
        return this.simpleOkHttpClient;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public SkipEventsService getSkipEventsService() {
        return this.skipEventsService;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public SubscriptionProcessorService getSubscriptionProcessorService() {
        return this.subscriptionProcessorService;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public TalkboxService getTalkboxService() {
        return this.talkboxService;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public ThirdPartyOauthService getThirdPartyOauthService() {
        return this.thirdPartyOauthService;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public com.amazon.aps.iva.ct.d getUserBenefitsChangeMonitor() {
        return this.userBenefitsChangeMonitor;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public l getUserBenefitsSynchronizer() {
        return this.userBenefitsSynchronizer;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public UserTokenInteractor getUserTokenInteractor() {
        return this.userTokenProvider;
    }

    public void setEtpContentService(EtpContentService etpContentService) {
        j.f(etpContentService, "<set-?>");
        this.etpContentService = etpContentService;
    }

    public void setPlayheadsSynchronizer(e eVar) {
        j.f(eVar, "<set-?>");
        this.playheadsSynchronizer = eVar;
    }

    public void setPlayheadsSynchronizerAgent(com.amazon.aps.iva.nz.f fVar) {
        j.f(fVar, "<set-?>");
        this.playheadsSynchronizerAgent = fVar;
    }

    /* compiled from: EtpNetworkModule.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/amazon/aps/iva/kb0/q;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.ellation.crunchyroll.api.etp.EtpNetworkModuleImpl$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            w.a.a.b();
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ q invoke() {
            invoke2();
            return q.a;
        }
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public TokenHeadersInterceptor getAccountStateProvider() {
        return this.accountStateProvider;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public EtpServiceMonitor getEtpServiceMonitor() {
        return this.etpServiceMonitor;
    }

    @Override // com.ellation.crunchyroll.api.etp.EtpNetworkModule
    public PlayServiceDecorator getPlayService() {
        return this.playService;
    }
}
