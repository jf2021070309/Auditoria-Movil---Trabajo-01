package com.ellation.crunchyroll.api.etp.error;

import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ApiError.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÂ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/error/ApiError;", "", "code", "", "_contexts", "", "Lcom/ellation/crunchyroll/api/etp/error/ApiErrorContext;", "error", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "contexts", "getContexts", "()Ljava/util/List;", "getError", "traceId", "getTraceId", "setTraceId", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ApiError {
    public static final int $stable = 8;
    @SerializedName("context")
    private final List<ApiErrorContext> _contexts;
    @SerializedName("code")
    private final String code;
    @SerializedName("error")
    private final String error;
    private String traceId;

    public ApiError() {
        this(null, null, null, 7, null);
    }

    private final List<ApiErrorContext> component2() {
        return this._contexts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiError copy$default(ApiError apiError, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiError.code;
        }
        if ((i & 2) != 0) {
            list = apiError._contexts;
        }
        if ((i & 4) != 0) {
            str2 = apiError.error;
        }
        return apiError.copy(str, list, str2);
    }

    public final String component1() {
        return this.code;
    }

    public final String component3() {
        return this.error;
    }

    public final ApiError copy(String str, List<ApiErrorContext> list, String str2) {
        return new ApiError(str, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiError)) {
            return false;
        }
        ApiError apiError = (ApiError) obj;
        if (j.a(this.code, apiError.code) && j.a(this._contexts, apiError._contexts) && j.a(this.error, apiError.error)) {
            return true;
        }
        return false;
    }

    public final String getCode() {
        return this.code;
    }

    public final List<ApiErrorContext> getContexts() {
        List<ApiErrorContext> list = this._contexts;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    public final String getError() {
        return this.error;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.code;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        List<ApiErrorContext> list = this._contexts;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.error;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 + i;
    }

    public final void setTraceId(String str) {
        this.traceId = str;
    }

    public String toString() {
        String str = this.code;
        List<ApiErrorContext> list = this._contexts;
        String str2 = this.error;
        StringBuilder sb = new StringBuilder("ApiError(code=");
        sb.append(str);
        sb.append(", _contexts=");
        sb.append(list);
        sb.append(", error=");
        return b.c(sb, str2, ")");
    }

    public ApiError(String str, List<ApiErrorContext> list, String str2) {
        this.code = str;
        this._contexts = list;
        this.error = str2;
    }

    public /* synthetic */ ApiError(String str, List list, String str2, int i, e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2);
    }
}
