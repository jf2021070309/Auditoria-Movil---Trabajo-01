package com.ellation.crunchyroll.api.etp.error;

import com.amazon.aps.iva.jf0.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.JsonParseException;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* compiled from: HttpErrorInterceptor.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R&\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/error/HttpErrorInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Lkotlin/Function0;", "Lcom/amazon/aps/iva/jf0/f;", "Lokhttp3/ResponseBody;", "Lcom/ellation/crunchyroll/api/etp/error/ApiError;", "apiErrorResponseConverter", "Lcom/amazon/aps/iva/xb0/a;", "", "forceInactiveClient", "Z", "Lcom/amazon/aps/iva/kb0/q;", "onClientInactive", "<init>", "(Lcom/amazon/aps/iva/xb0/a;ZLcom/amazon/aps/iva/xb0/a;)V", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class HttpErrorInterceptor implements Interceptor {
    public static final int $stable = 0;
    private final a<f<ResponseBody, ApiError>> apiErrorResponseConverter;
    private final boolean forceInactiveClient;
    private final a<q> onClientInactive;

    /* JADX WARN: Multi-variable type inference failed */
    public HttpErrorInterceptor(a<? extends f<ResponseBody, ApiError>> aVar, boolean z, a<q> aVar2) {
        j.f(aVar, "apiErrorResponseConverter");
        j.f(aVar2, "onClientInactive");
        this.apiErrorResponseConverter = aVar;
        this.forceInactiveClient = z;
        this.onClientInactive = aVar2;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        String message;
        ApiError apiError;
        j.f(chain, "chain");
        if (this.forceInactiveClient) {
            this.onClientInactive.invoke();
        }
        Request request = chain.request();
        Response proceed = chain.proceed(request);
        if (!proceed.isSuccessful()) {
            String encodedPath = request.url().encodedPath();
            try {
                apiError = this.apiErrorResponseConverter.invoke().convert(proceed.peekBody(Long.MAX_VALUE));
                if (apiError != null) {
                    message = apiError.toString();
                } else {
                    message = proceed.message();
                    apiError = new ApiError(null, null, null, 7, null);
                }
            } catch (JsonParseException unused) {
                message = proceed.message();
                apiError = new ApiError(null, null, null, 7, null);
            }
            apiError.setTraceId(proceed.headers().get("x-trace-id"));
            int code = proceed.code();
            boolean z = false;
            if (500 <= code && code < 600) {
                z = true;
            }
            if (!z) {
                int code2 = proceed.code();
                if (code2 != 400) {
                    if (code2 != 401) {
                        if (code2 != 403) {
                            if (code2 != 404) {
                                if (code2 != 409) {
                                    if (code2 != 429) {
                                        throw new ErrorHttpException(apiError, proceed.code(), message, encodedPath);
                                    }
                                    throw new TooManyRequestsException(apiError, message, encodedPath);
                                }
                                throw new ConflictException(apiError, message, encodedPath);
                            }
                            throw new NotFoundException(apiError, message, encodedPath);
                        }
                        throw new ForbiddenAccessException(apiError, message, encodedPath);
                    }
                    String code3 = apiError.getCode();
                    if (code3 != null) {
                        switch (code3.hashCode()) {
                            case -1400402053:
                                if (code3.equals("auth.obtain_access_token.force_password_reset")) {
                                    throw new PasswordResetRequiredException(apiError, message, encodedPath);
                                }
                                break;
                            case -1298923001:
                                if (code3.equals("auth.obtain_access_token.no_new_sessions_allowed")) {
                                    throw new NoNewSessionsAllowedException(apiError, message, encodedPath);
                                }
                                break;
                            case -677389341:
                                if (code3.equals("auth.obtain_access_token.client_inactive")) {
                                    InactiveClientException inactiveClientException = new InactiveClientException(apiError, message, encodedPath);
                                    this.onClientInactive.invoke();
                                    throw inactiveClientException;
                                }
                                break;
                            case -290382979:
                                if (code3.equals("auth.obtain_access_token.force_contact_customer_support")) {
                                    throw new ForcedToContactCustomerSupportException(apiError, message, encodedPath);
                                }
                                break;
                        }
                    }
                    throw new UnauthorizedAccessException(apiError, message, encodedPath);
                } else if (!j.a(apiError.getCode(), "auth.obtain_access_token.oauth2_error") || !j.a(apiError.getError(), "invalid_grant")) {
                    throw new BadRequestException(apiError, message, encodedPath);
                } else {
                    throw new InvalidRefreshTokenException(apiError, message, encodedPath);
                }
            }
            throw new ServerException(apiError, proceed.code(), message, encodedPath);
        }
        return proceed;
    }
}
