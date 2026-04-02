package com.ellation.crunchyroll.api.etp.error;

import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: ApiError.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getTraceId", "", "Lcom/ellation/crunchyroll/api/etp/error/HttpException;", "api_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ApiErrorKt {
    public static final String getTraceId(HttpException httpException) {
        j.f(httpException, "<this>");
        return httpException.getError().getTraceId();
    }
}
