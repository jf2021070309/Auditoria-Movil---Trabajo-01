package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.jf0.a0;
import com.amazon.aps.iva.jf0.b;
import com.amazon.aps.iva.jf0.i;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.ob0.h;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.se0.b1;
import com.amazon.aps.iva.se0.c1;
import com.amazon.aps.iva.se0.m0;
import com.amazon.aps.iva.ts.c;
import com.amazon.aps.iva.ww.f;
import com.amazon.aps.iva.ww.g;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.auth.EtpAccountAuthService;
import com.ellation.crunchyroll.api.etp.auth.model.AnonymousTokenResponse;
import com.ellation.crunchyroll.api.etp.auth.model.UserTokenResponse;
import com.ellation.crunchyroll.api.etp.error.InvalidRefreshTokenException;
import com.ellation.crunchyroll.api.etp.error.UserRestrictionException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.Scopes;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* compiled from: UserTokenInteractorImpl.kt */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010:\u001a\u000209\u0012\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<\u0012\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000f0<\u0012\u000e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020<\u0012\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001d0\u0015\u0012\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001d0\u0015\u0012\u0006\u0010F\u001a\u00020E\u0012\u000e\b\u0002\u0010I\u001a\b\u0012\u0004\u0012\u00020H0<\u0012\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bY\u0010ZJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\f\u0010\u0010\u001a\u00020\u000f*\u00020\u000fH\u0002J\f\u0010\u0011\u001a\u00020\u0007*\u00020\tH\u0002JS\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00152\u001c\u0010\u0019\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0002H\u0016J\u0013\u0010\u001e\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0004J#\u0010!\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J#\u0010%\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b%\u0010\"J#\u0010&\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b&\u0010\"J\b\u0010'\u001a\u00020\u001dH\u0016J$\u0010,\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010+\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000f0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u001c\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010?R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001d0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR \u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001d0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010CR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020H0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010?R\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001e\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010UR\u0014\u0010W\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010X\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006["}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/UserTokenInteractorImpl;", "Lcom/ellation/crunchyroll/api/etp/auth/UserTokenInteractor;", "", "getJwtSuspend", "(Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "", "throwable", "", "shouldFailAuth", "Lcom/ellation/crunchyroll/api/etp/auth/Token;", "getNewToken", "Lcom/ellation/crunchyroll/api/etp/auth/model/UserTokenResponse;", "getNewTokenForUser", "Lcom/ellation/crunchyroll/api/etp/auth/model/AnonymousTokenResponse;", "getNewTokenForAnonymousUser", "", "toExpirationTimeInMs", "shouldRefreshToken", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "maxAttempts", "Lkotlin/Function1;", "shouldAbortRetry", "Lcom/amazon/aps/iva/ob0/d;", "", "block", "runWithExponentialBackoff", "(ILcom/amazon/aps/iva/xb0/l;Lcom/amazon/aps/iva/xb0/l;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "getJwt", "Lcom/amazon/aps/iva/kb0/q;", "refreshJwt", "username", "password", "signIn", "(Ljava/lang/String;Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "phoneNumber", "otp", "signInWithPhone", "signInWithFun", "invalidateJwt", "signInFailed", "Ljava/io/IOException;", "exception", Scopes.EMAIL, "signOut", "Lcom/ellation/crunchyroll/api/etp/auth/EtpAccountAuthService;", "etpAccountAuthService", "Lcom/ellation/crunchyroll/api/etp/auth/EtpAccountAuthService;", "Lcom/ellation/crunchyroll/api/etp/auth/FunAccountAuthService;", "funAccountAuthService", "Lcom/ellation/crunchyroll/api/etp/auth/FunAccountAuthService;", "Lcom/amazon/aps/iva/ts/c;", "etpApiConfiguration", "Lcom/amazon/aps/iva/ts/c;", "Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenStorage;", "refreshTokenStorage", "Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenStorage;", "Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenMonitor;", "refreshTokenMonitor", "Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenMonitor;", "Lkotlin/Function0;", "Lcom/ellation/crunchyroll/api/etp/auth/ApiFunUserStore;", "getFunUserStorage", "Lcom/amazon/aps/iva/xb0/a;", "getCurrentTimeInMillis", "getAnonymousId", "onAuthSuccess", "Lcom/amazon/aps/iva/xb0/l;", "onAuthFailure", "Lcom/ellation/crunchyroll/api/etp/auth/Device;", "device", "Lcom/ellation/crunchyroll/api/etp/auth/Device;", "Lcom/amazon/aps/iva/ww/g;", "newSleepTimeProvider", "Lcom/ellation/crunchyroll/api/etp/auth/CountryCodeProvider;", "countryCodeProvider", "Lcom/ellation/crunchyroll/api/etp/auth/CountryCodeProvider;", "token", "Lcom/ellation/crunchyroll/api/etp/auth/Token;", "Lcom/amazon/aps/iva/se0/b1;", "worker", "Lcom/amazon/aps/iva/se0/b1;", "Lcom/amazon/aps/iva/se0/m0;", "job", "Lcom/amazon/aps/iva/se0/m0;", "()Lcom/ellation/crunchyroll/api/etp/auth/ApiFunUserStore;", "funUserStorage", "isRefreshTokenPresent", "()Z", "<init>", "(Lcom/ellation/crunchyroll/api/etp/auth/EtpAccountAuthService;Lcom/ellation/crunchyroll/api/etp/auth/FunAccountAuthService;Lcom/amazon/aps/iva/ts/c;Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenStorage;Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenMonitor;Lcom/amazon/aps/iva/xb0/a;Lcom/amazon/aps/iva/xb0/a;Lcom/amazon/aps/iva/xb0/a;Lcom/amazon/aps/iva/xb0/l;Lcom/amazon/aps/iva/xb0/l;Lcom/ellation/crunchyroll/api/etp/auth/Device;Lcom/amazon/aps/iva/xb0/a;Lcom/ellation/crunchyroll/api/etp/auth/CountryCodeProvider;)V", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class UserTokenInteractorImpl implements UserTokenInteractor {
    public static final int $stable = 8;
    private final CountryCodeProvider countryCodeProvider;
    private final Device device;
    private final EtpAccountAuthService etpAccountAuthService;
    private final c etpApiConfiguration;
    private final FunAccountAuthService funAccountAuthService;
    private final a<String> getAnonymousId;
    private final a<Long> getCurrentTimeInMillis;
    private final a<ApiFunUserStore> getFunUserStorage;
    private m0<String> job;
    private final a<g> newSleepTimeProvider;
    private final l<Throwable, q> onAuthFailure;
    private final l<Token, q> onAuthSuccess;
    private final RefreshTokenMonitor refreshTokenMonitor;
    private final RefreshTokenStorage refreshTokenStorage;
    private Token token;
    private final b1 worker;

    /* compiled from: UserTokenInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/amazon/aps/iva/ww/f;", "invoke", "()Lcom/amazon/aps/iva/ww/f;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends com.amazon.aps.iva.yb0.l implements a<f> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.aps.iva.xb0.a
        public final f invoke() {
            return new f(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserTokenInteractorImpl(EtpAccountAuthService etpAccountAuthService, FunAccountAuthService funAccountAuthService, c cVar, RefreshTokenStorage refreshTokenStorage, RefreshTokenMonitor refreshTokenMonitor, a<? extends ApiFunUserStore> aVar, a<Long> aVar2, a<String> aVar3, l<? super Token, q> lVar, l<? super Throwable, q> lVar2, Device device, a<? extends g> aVar4, CountryCodeProvider countryCodeProvider) {
        j.f(etpAccountAuthService, "etpAccountAuthService");
        j.f(funAccountAuthService, "funAccountAuthService");
        j.f(cVar, "etpApiConfiguration");
        j.f(refreshTokenStorage, "refreshTokenStorage");
        j.f(refreshTokenMonitor, "refreshTokenMonitor");
        j.f(aVar, "getFunUserStorage");
        j.f(aVar2, "getCurrentTimeInMillis");
        j.f(aVar3, "getAnonymousId");
        j.f(lVar, "onAuthSuccess");
        j.f(lVar2, "onAuthFailure");
        j.f(device, "device");
        j.f(aVar4, "newSleepTimeProvider");
        j.f(countryCodeProvider, "countryCodeProvider");
        this.etpAccountAuthService = etpAccountAuthService;
        this.funAccountAuthService = funAccountAuthService;
        this.etpApiConfiguration = cVar;
        this.refreshTokenStorage = refreshTokenStorage;
        this.refreshTokenMonitor = refreshTokenMonitor;
        this.getFunUserStorage = aVar;
        this.getCurrentTimeInMillis = aVar2;
        this.getAnonymousId = aVar3;
        this.onAuthSuccess = lVar;
        this.onAuthFailure = lVar2;
        this.device = device;
        this.newSleepTimeProvider = aVar4;
        this.countryCodeProvider = countryCodeProvider;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        j.e(newSingleThreadExecutor, "newSingleThreadExecutor()");
        this.worker = new c1(newSingleThreadExecutor);
    }

    private final ApiFunUserStore getFunUserStorage() {
        return this.getFunUserStorage.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getJwtSuspend(com.amazon.aps.iva.ob0.d<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$getJwtSuspend$1
            if (r0 == 0) goto L13
            r0 = r6
            com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$getJwtSuspend$1 r0 = (com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$getJwtSuspend$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$getJwtSuspend$1 r0 = new com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$getJwtSuspend$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.L$1
            com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl r1 = (com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl) r1
            java.lang.Object r0 = r0.L$0
            com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl r0 = (com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl) r0
            com.amazon.aps.iva.ab.x.i0(r6)     // Catch: java.lang.Throwable -> L2f
            goto L61
        L2f:
            r6 = move-exception
            goto L6a
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L39:
            com.amazon.aps.iva.ab.x.i0(r6)
            com.ellation.crunchyroll.api.etp.auth.Token r6 = r5.token
            if (r6 == 0) goto L49
            boolean r6 = r5.shouldRefreshToken(r6)
            if (r6 == 0) goto L47
            goto L49
        L47:
            r0 = r5
            goto L80
        L49:
            com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$getJwtSuspend$2$1 r6 = com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$getJwtSuspend$2$1.INSTANCE     // Catch: java.lang.Throwable -> L68
            com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$getJwtSuspend$2$2 r2 = new com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$getJwtSuspend$2$2     // Catch: java.lang.Throwable -> L68
            r4 = 0
            r2.<init>(r5, r4)     // Catch: java.lang.Throwable -> L68
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L68
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L68
            r0.label = r3     // Catch: java.lang.Throwable -> L68
            r3 = 5
            java.lang.Object r6 = r5.runWithExponentialBackoff(r3, r6, r2, r0)     // Catch: java.lang.Throwable -> L68
            if (r6 != r1) goto L5f
            return r1
        L5f:
            r0 = r5
            r1 = r0
        L61:
            com.ellation.crunchyroll.api.etp.auth.Token r6 = (com.ellation.crunchyroll.api.etp.auth.Token) r6     // Catch: java.lang.Throwable -> L2f
            r1.token = r6     // Catch: java.lang.Throwable -> L2f
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a     // Catch: java.lang.Throwable -> L2f
            goto L6e
        L68:
            r6 = move-exception
            r0 = r5
        L6a:
            com.amazon.aps.iva.kb0.k$a r6 = com.amazon.aps.iva.ab.x.H(r6)
        L6e:
            java.lang.Throwable r6 = com.amazon.aps.iva.kb0.k.a(r6)
            if (r6 == 0) goto L80
            boolean r1 = r0.shouldFailAuth(r6)
            if (r1 == 0) goto L7f
            com.amazon.aps.iva.xb0.l<java.lang.Throwable, com.amazon.aps.iva.kb0.q> r0 = r0.onAuthFailure
            r0.invoke(r6)
        L7f:
            throw r6
        L80:
            boolean r6 = r0.isRefreshTokenPresent()
            if (r6 == 0) goto L90
            com.amazon.aps.iva.xb0.l<com.ellation.crunchyroll.api.etp.auth.Token, com.amazon.aps.iva.kb0.q> r6 = r0.onAuthSuccess
            com.ellation.crunchyroll.api.etp.auth.Token r1 = r0.token
            com.amazon.aps.iva.yb0.j.c(r1)
            r6.invoke(r1)
        L90:
            com.ellation.crunchyroll.api.etp.auth.Token r6 = r0.token
            com.amazon.aps.iva.yb0.j.c(r6)
            java.lang.String r6 = r6.getAccessToken()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl.getJwtSuspend(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Token getNewToken() {
        if (!m.b0(this.refreshTokenStorage.getRefreshToken())) {
            UserTokenResponse newTokenForUser = getNewTokenForUser();
            this.countryCodeProvider.updateCountryCode(newTokenForUser.getCountry());
            String refreshToken = newTokenForUser.getRefreshToken();
            if (refreshToken != null) {
                this.refreshTokenStorage.setRefreshToken(refreshToken);
            }
            this.refreshTokenStorage.saveLastUsedTime();
            getFunUserStorage().setFunUser(newTokenForUser.getFunUser());
            return new Token(newTokenForUser.getAccessToken(), toExpirationTimeInMs(newTokenForUser.getExpiresInSec()), newTokenForUser.getAccountId(), newTokenForUser.getSelectedProfileId());
        }
        AnonymousTokenResponse newTokenForAnonymousUser = getNewTokenForAnonymousUser();
        this.countryCodeProvider.updateCountryCode(newTokenForAnonymousUser.getCountry());
        getFunUserStorage().setFunUser(newTokenForAnonymousUser.getFunUser());
        return new Token(newTokenForAnonymousUser.getAccessToken(), toExpirationTimeInMs(newTokenForAnonymousUser.getExpiresInSec()), null, null);
    }

    private final AnonymousTokenResponse getNewTokenForAnonymousUser() {
        a0 execute = EtpAccountAuthService.DefaultImpls.getAnonymousUserJwt$default(this.etpAccountAuthService, this.getAnonymousId.invoke(), null, this.device.getId(), this.device.getName(), this.device.getType(), 2, null).execute();
        AnonymousTokenResponse anonymousTokenResponse = (AnonymousTokenResponse) execute.b;
        if (anonymousTokenResponse != null) {
            return anonymousTokenResponse;
        }
        throw new i(execute);
    }

    private final UserTokenResponse getNewTokenForUser() {
        a0 execute = EtpAccountAuthService.DefaultImpls.refreshUserJwt$default(this.etpAccountAuthService, this.getAnonymousId.invoke(), this.refreshTokenStorage.getRefreshToken(), null, null, this.device.getId(), this.device.getName(), this.device.getType(), 12, null).execute();
        UserTokenResponse userTokenResponse = (UserTokenResponse) execute.b;
        if (userTokenResponse != null) {
            return userTokenResponse;
        }
        throw new i(execute);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00cb -> B:17:0x004d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object runWithExponentialBackoff(int r12, com.amazon.aps.iva.xb0.l<? super java.lang.Throwable, java.lang.Boolean> r13, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.ob0.d<? super T>, ? extends java.lang.Object> r14, com.amazon.aps.iva.ob0.d<? super T> r15) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl.runWithExponentialBackoff(int, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    private final boolean shouldFailAuth(Throwable th) {
        if (((th instanceof UserRestrictionException) || (th instanceof InvalidRefreshTokenException)) && isRefreshTokenPresent()) {
            return true;
        }
        return false;
    }

    private final boolean shouldRefreshToken(Token token) {
        if (this.getCurrentTimeInMillis.invoke().longValue() >= token.getExpireDateInMs() - 10000) {
            return true;
        }
        return false;
    }

    private final long toExpirationTimeInMs(long j) {
        return TimeUnit.SECONDS.toMillis(j) + this.getCurrentTimeInMillis.invoke().longValue();
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.JwtProvider
    public String getJwt() {
        Object e;
        e = com.amazon.aps.iva.se0.i.e(h.b, new UserTokenInteractorImpl$getJwt$1(this, null));
        return (String) e;
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.UserTokenInteractor
    public void invalidateJwt() {
        this.token = null;
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider
    public boolean isRefreshTokenPresent() {
        return this.refreshTokenStorage.isPresent();
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.UserTokenInteractor
    public Object refreshJwt(d<? super q> dVar) {
        try {
            getNewToken();
        } catch (Throwable th) {
            x.H(th);
        }
        return q.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    @Override // com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object signIn(java.lang.String r16, java.lang.String r17, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r18) {
        /*
            r15 = this;
            r0 = r15
            r1 = r18
            boolean r2 = r1 instanceof com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$signIn$1
            if (r2 == 0) goto L16
            r2 = r1
            com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$signIn$1 r2 = (com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$signIn$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
            goto L1b
        L16:
            com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$signIn$1 r2 = new com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$signIn$1
            r2.<init>(r15, r1)
        L1b:
            r12 = r2
            java.lang.Object r1 = r12.result
            com.amazon.aps.iva.pb0.a r2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r3 = r12.label
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            java.lang.Object r2 = r12.L$0
            com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl r2 = (com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl) r2
            com.amazon.aps.iva.ab.x.i0(r1)
            goto L6c
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            com.amazon.aps.iva.ab.x.i0(r1)
            com.ellation.crunchyroll.api.etp.auth.EtpAccountAuthService r3 = r0.etpAccountAuthService
            com.amazon.aps.iva.xb0.a<java.lang.String> r1 = r0.getAnonymousId
            java.lang.Object r1 = r1.invoke()
            java.lang.String r1 = (java.lang.String) r1
            r7 = 0
            r8 = 0
            com.ellation.crunchyroll.api.etp.auth.Device r5 = r0.device
            java.lang.String r9 = r5.getId()
            com.ellation.crunchyroll.api.etp.auth.Device r5 = r0.device
            java.lang.String r10 = r5.getName()
            com.ellation.crunchyroll.api.etp.auth.Device r5 = r0.device
            java.lang.String r11 = r5.getType()
            r13 = 24
            r14 = 0
            r12.L$0 = r0
            r12.label = r4
            r4 = r1
            r5 = r16
            r6 = r17
            java.lang.Object r1 = com.ellation.crunchyroll.api.etp.auth.EtpAccountAuthService.DefaultImpls.signIn$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r1 != r2) goto L6b
            return r2
        L6b:
            r2 = r0
        L6c:
            com.ellation.crunchyroll.api.etp.auth.model.UserTokenResponse r1 = (com.ellation.crunchyroll.api.etp.auth.model.UserTokenResponse) r1
            java.lang.String r3 = r1.getRefreshToken()
            if (r3 == 0) goto L79
            com.ellation.crunchyroll.api.etp.auth.RefreshTokenStorage r4 = r2.refreshTokenStorage
            r4.setRefreshToken(r3)
        L79:
            com.ellation.crunchyroll.api.etp.auth.ApiFunUserStore r3 = r2.getFunUserStorage()
            com.ellation.crunchyroll.api.etp.auth.model.FunUser r4 = r1.getFunUser()
            r3.setFunUser(r4)
            java.lang.String r6 = r1.getAccessToken()
            long r3 = r1.getExpiresInSec()
            long r7 = r2.toExpirationTimeInMs(r3)
            java.lang.String r10 = r1.getSelectedProfileId()
            java.lang.String r9 = r1.getAccountId()
            com.ellation.crunchyroll.api.etp.auth.Token r1 = new com.ellation.crunchyroll.api.etp.auth.Token
            r5 = r1
            r5.<init>(r6, r7, r9, r10)
            r2.token = r1
            com.amazon.aps.iva.kb0.q r1 = com.amazon.aps.iva.kb0.q.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl.signIn(java.lang.String, java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    @Override // com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object signInWithFun(java.lang.String r19, java.lang.String r20, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            boolean r2 = r1 instanceof com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$signInWithFun$1
            if (r2 == 0) goto L17
            r2 = r1
            com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$signInWithFun$1 r2 = (com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$signInWithFun$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$signInWithFun$1 r2 = new com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$signInWithFun$1
            r2.<init>(r0, r1)
        L1c:
            r15 = r2
            java.lang.Object r1 = r15.result
            com.amazon.aps.iva.pb0.a r2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r3 = r15.label
            r4 = 1
            if (r3 == 0) goto L38
            if (r3 != r4) goto L30
            java.lang.Object r2 = r15.L$0
            com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl r2 = (com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl) r2
            com.amazon.aps.iva.ab.x.i0(r1)
            goto L84
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            com.amazon.aps.iva.ab.x.i0(r1)
            com.ellation.crunchyroll.api.etp.auth.FunAccountAuthService r3 = r0.funAccountAuthService
            com.amazon.aps.iva.xb0.a<java.lang.String> r1 = r0.getAnonymousId
            java.lang.Object r1 = r1.invoke()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r5 = r18.getJwt()
            java.lang.String r6 = "Bearer "
            java.lang.String r5 = com.amazon.aps.iva.oa.a.a(r6, r5)
            r8 = 0
            r9 = 0
            com.ellation.crunchyroll.api.etp.auth.Device r6 = r0.device
            java.lang.String r10 = r6.getId()
            com.ellation.crunchyroll.api.etp.auth.Device r6 = r0.device
            java.lang.String r11 = r6.getName()
            com.ellation.crunchyroll.api.etp.auth.Device r6 = r0.device
            java.lang.String r12 = r6.getType()
            com.amazon.aps.iva.ts.c r6 = r0.etpApiConfiguration
            java.lang.String r13 = r6.getClientId()
            com.amazon.aps.iva.ts.c r6 = r0.etpApiConfiguration
            java.lang.String r14 = r6.getClientSecret()
            r16 = 48
            r17 = 0
            r15.L$0 = r0
            r15.label = r4
            r4 = r1
            r6 = r19
            r7 = r20
            java.lang.Object r1 = com.ellation.crunchyroll.api.etp.auth.FunAccountAuthService.DefaultImpls.signInWithFun$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r1 != r2) goto L83
            return r2
        L83:
            r2 = r0
        L84:
            com.ellation.crunchyroll.api.etp.auth.model.UserTokenResponse r1 = (com.ellation.crunchyroll.api.etp.auth.model.UserTokenResponse) r1
            java.lang.String r3 = r1.getRefreshToken()
            if (r3 == 0) goto L91
            com.ellation.crunchyroll.api.etp.auth.RefreshTokenStorage r4 = r2.refreshTokenStorage
            r4.setRefreshToken(r3)
        L91:
            com.ellation.crunchyroll.api.etp.auth.ApiFunUserStore r3 = r2.getFunUserStorage()
            com.ellation.crunchyroll.api.etp.auth.model.FunUser r4 = r1.getFunUser()
            r3.setFunUser(r4)
            java.lang.String r6 = r1.getAccessToken()
            long r3 = r1.getExpiresInSec()
            long r7 = r2.toExpirationTimeInMs(r3)
            java.lang.String r10 = r1.getSelectedProfileId()
            java.lang.String r9 = r1.getAccountId()
            com.ellation.crunchyroll.api.etp.auth.Token r1 = new com.ellation.crunchyroll.api.etp.auth.Token
            r5 = r1
            r5.<init>(r6, r7, r9, r10)
            r2.token = r1
            com.amazon.aps.iva.kb0.q r1 = com.amazon.aps.iva.kb0.q.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl.signInWithFun(java.lang.String, java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    @Override // com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object signInWithPhone(java.lang.String r16, java.lang.String r17, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r18) {
        /*
            r15 = this;
            r0 = r15
            r1 = r18
            boolean r2 = r1 instanceof com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$signInWithPhone$1
            if (r2 == 0) goto L16
            r2 = r1
            com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$signInWithPhone$1 r2 = (com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$signInWithPhone$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
            goto L1b
        L16:
            com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$signInWithPhone$1 r2 = new com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$signInWithPhone$1
            r2.<init>(r15, r1)
        L1b:
            r12 = r2
            java.lang.Object r1 = r12.result
            com.amazon.aps.iva.pb0.a r2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r3 = r12.label
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            java.lang.Object r2 = r12.L$0
            com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl r2 = (com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl) r2
            com.amazon.aps.iva.ab.x.i0(r1)
            goto L6c
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            com.amazon.aps.iva.ab.x.i0(r1)
            com.ellation.crunchyroll.api.etp.auth.EtpAccountAuthService r3 = r0.etpAccountAuthService
            com.amazon.aps.iva.xb0.a<java.lang.String> r1 = r0.getAnonymousId
            java.lang.Object r1 = r1.invoke()
            java.lang.String r1 = (java.lang.String) r1
            r7 = 0
            r8 = 0
            com.ellation.crunchyroll.api.etp.auth.Device r5 = r0.device
            java.lang.String r9 = r5.getId()
            com.ellation.crunchyroll.api.etp.auth.Device r5 = r0.device
            java.lang.String r10 = r5.getName()
            com.ellation.crunchyroll.api.etp.auth.Device r5 = r0.device
            java.lang.String r11 = r5.getType()
            r13 = 24
            r14 = 0
            r12.L$0 = r0
            r12.label = r4
            r4 = r1
            r5 = r16
            r6 = r17
            java.lang.Object r1 = com.ellation.crunchyroll.api.etp.auth.EtpAccountAuthService.DefaultImpls.signInOtp$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r1 != r2) goto L6b
            return r2
        L6b:
            r2 = r0
        L6c:
            com.ellation.crunchyroll.api.etp.auth.model.UserTokenResponse r1 = (com.ellation.crunchyroll.api.etp.auth.model.UserTokenResponse) r1
            java.lang.String r3 = r1.getRefreshToken()
            if (r3 == 0) goto L79
            com.ellation.crunchyroll.api.etp.auth.RefreshTokenStorage r4 = r2.refreshTokenStorage
            r4.setRefreshToken(r3)
        L79:
            com.ellation.crunchyroll.api.etp.auth.ApiFunUserStore r3 = r2.getFunUserStorage()
            com.ellation.crunchyroll.api.etp.auth.model.FunUser r4 = r1.getFunUser()
            r3.setFunUser(r4)
            java.lang.String r6 = r1.getAccessToken()
            long r3 = r1.getExpiresInSec()
            long r7 = r2.toExpirationTimeInMs(r3)
            java.lang.String r10 = r1.getSelectedProfileId()
            java.lang.String r9 = r1.getAccountId()
            com.ellation.crunchyroll.api.etp.auth.Token r1 = new com.ellation.crunchyroll.api.etp.auth.Token
            r5 = r1
            r5.<init>(r6, r7, r9, r10)
            r2.token = r1
            com.amazon.aps.iva.kb0.q r1 = com.amazon.aps.iva.kb0.q.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl.signInWithPhone(java.lang.String, java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider
    public void signOut(boolean z, IOException iOException, String str) {
        boolean z2;
        try {
            String refreshToken = this.refreshTokenStorage.getRefreshToken();
            if (refreshToken.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                refreshToken = null;
            }
            if (refreshToken != null) {
                this.etpAccountAuthService.revokeRefreshToken(refreshToken).n(new com.amazon.aps.iva.jf0.d<q>() { // from class: com.ellation.crunchyroll.api.etp.auth.UserTokenInteractorImpl$signOut$2$1
                    @Override // com.amazon.aps.iva.jf0.d
                    public void onFailure(b<q> bVar, Throwable th) {
                        j.f(bVar, "call");
                        j.f(th, "t");
                    }

                    @Override // com.amazon.aps.iva.jf0.d
                    public void onResponse(b<q> bVar, a0<q> a0Var) {
                        j.f(bVar, "call");
                        j.f(a0Var, "response");
                    }
                });
            }
        } finally {
            this.refreshTokenStorage.clearToken();
            this.refreshTokenMonitor.onAuthFailure(z, iOException, str);
            getFunUserStorage().clear();
            this.token = null;
        }
    }

    public /* synthetic */ UserTokenInteractorImpl(EtpAccountAuthService etpAccountAuthService, FunAccountAuthService funAccountAuthService, c cVar, RefreshTokenStorage refreshTokenStorage, RefreshTokenMonitor refreshTokenMonitor, a aVar, a aVar2, a aVar3, l lVar, l lVar2, Device device, a aVar4, CountryCodeProvider countryCodeProvider, int i, e eVar) {
        this(etpAccountAuthService, funAccountAuthService, cVar, refreshTokenStorage, refreshTokenMonitor, aVar, aVar2, aVar3, lVar, lVar2, device, (i & 2048) != 0 ? AnonymousClass1.INSTANCE : aVar4, countryCodeProvider);
    }
}
