package com.ellation.crunchyroll.api.etp.error;

import com.amazon.aps.iva.yb0.e;
import kotlin.Metadata;
/* compiled from: ApiError.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B+\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\t\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/error/UserRestrictionException;", "Lcom/ellation/crunchyroll/api/etp/error/HttpException;", "error", "Lcom/ellation/crunchyroll/api/etp/error/ApiError;", "httpStatusCode", "", "message", "", "requestPath", "(Lcom/ellation/crunchyroll/api/etp/error/ApiError;ILjava/lang/String;Ljava/lang/String;)V", "Lcom/ellation/crunchyroll/api/etp/error/ForcedToContactCustomerSupportException;", "Lcom/ellation/crunchyroll/api/etp/error/NoNewSessionsAllowedException;", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class UserRestrictionException extends HttpException {
    public static final int $stable = 0;

    public /* synthetic */ UserRestrictionException(ApiError apiError, int i, String str, String str2, e eVar) {
        this(apiError, i, str, str2);
    }

    public /* synthetic */ UserRestrictionException(ApiError apiError, int i, String str, String str2, int i2, e eVar) {
        this(apiError, i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, null);
    }

    private UserRestrictionException(ApiError apiError, int i, String str, String str2) {
        super(apiError, i, str, str2, null);
    }
}
