package com.ellation.crunchyroll.api.etp.error;

import com.amazon.aps.iva.yb0.e;
import java.io.IOException;
import kotlin.Metadata;
/* compiled from: ApiError.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B+\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/error/HttpException;", "Ljava/io/IOException;", "error", "Lcom/ellation/crunchyroll/api/etp/error/ApiError;", "httpStatusCode", "", "requestPath", "", "message", "(Lcom/ellation/crunchyroll/api/etp/error/ApiError;ILjava/lang/String;Ljava/lang/String;)V", "getError", "()Lcom/ellation/crunchyroll/api/etp/error/ApiError;", "getHttpStatusCode", "()I", "getRequestPath", "()Ljava/lang/String;", "Lcom/ellation/crunchyroll/api/etp/error/BadRequestException;", "Lcom/ellation/crunchyroll/api/etp/error/ConflictException;", "Lcom/ellation/crunchyroll/api/etp/error/ErrorHttpException;", "Lcom/ellation/crunchyroll/api/etp/error/ForbiddenAccessException;", "Lcom/ellation/crunchyroll/api/etp/error/InactiveClientException;", "Lcom/ellation/crunchyroll/api/etp/error/InvalidRefreshTokenException;", "Lcom/ellation/crunchyroll/api/etp/error/NotFoundException;", "Lcom/ellation/crunchyroll/api/etp/error/PasswordResetRequiredException;", "Lcom/ellation/crunchyroll/api/etp/error/ServerException;", "Lcom/ellation/crunchyroll/api/etp/error/TooManyRequestsException;", "Lcom/ellation/crunchyroll/api/etp/error/UnauthorizedAccessException;", "Lcom/ellation/crunchyroll/api/etp/error/UserRestrictionException;", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class HttpException extends IOException {
    public static final int $stable = 8;
    private final ApiError error;
    private final int httpStatusCode;
    private final String requestPath;

    public /* synthetic */ HttpException(ApiError apiError, int i, String str, String str2, e eVar) {
        this(apiError, i, str, str2);
    }

    public final ApiError getError() {
        return this.error;
    }

    public final int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public final String getRequestPath() {
        return this.requestPath;
    }

    public /* synthetic */ HttpException(ApiError apiError, int i, String str, String str2, int i2, e eVar) {
        this(apiError, i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private HttpException(com.ellation.crunchyroll.api.etp.error.ApiError r2, int r3, java.lang.String r4, java.lang.String r5) {
        /*
            r1 = this;
            java.lang.String r0 = r2.getCode()
            if (r0 != 0) goto L8
            java.lang.String r0 = ""
        L8:
            java.lang.String r5 = com.amazon.aps.iva.c80.a.f(r0, r5)
            r1.<init>(r5)
            r1.error = r2
            r1.httpStatusCode = r3
            r1.requestPath = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.api.etp.error.HttpException.<init>(com.ellation.crunchyroll.api.etp.error.ApiError, int, java.lang.String, java.lang.String):void");
    }
}
