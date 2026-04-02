package com.ellation.crunchyroll.api.etp.error;

import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: ApiError.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÂ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/error/ApiErrorContext;", "", "code", "", "field", "_violatedConstraints", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCode", "()Ljava/lang/String;", "getField", "violatedConstraints", "getViolatedConstraints", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ApiErrorContext {
    public static final int $stable = 8;
    @SerializedName("violated_constraints")
    private final Map<String, String> _violatedConstraints;
    @SerializedName("code")
    private final String code;
    @SerializedName("field")
    private final String field;

    public ApiErrorContext() {
        this(null, null, null, 7, null);
    }

    private final Map<String, String> component3() {
        return this._violatedConstraints;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiErrorContext copy$default(ApiErrorContext apiErrorContext, String str, String str2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiErrorContext.code;
        }
        if ((i & 2) != 0) {
            str2 = apiErrorContext.field;
        }
        if ((i & 4) != 0) {
            map = apiErrorContext._violatedConstraints;
        }
        return apiErrorContext.copy(str, str2, map);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.field;
    }

    public final ApiErrorContext copy(String str, String str2, Map<String, String> map) {
        return new ApiErrorContext(str, str2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiErrorContext)) {
            return false;
        }
        ApiErrorContext apiErrorContext = (ApiErrorContext) obj;
        if (j.a(this.code, apiErrorContext.code) && j.a(this.field, apiErrorContext.field) && j.a(this._violatedConstraints, apiErrorContext._violatedConstraints)) {
            return true;
        }
        return false;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getField() {
        return this.field;
    }

    public final Map<String, String> getViolatedConstraints() {
        Map<String, String> map = this._violatedConstraints;
        if (map == null) {
            return a0.b;
        }
        return map;
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
        String str2 = this.field;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Map<String, String> map = this._violatedConstraints;
        if (map != null) {
            i = map.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        String str = this.code;
        String str2 = this.field;
        Map<String, String> map = this._violatedConstraints;
        StringBuilder b = a.b("ApiErrorContext(code=", str, ", field=", str2, ", _violatedConstraints=");
        b.append(map);
        b.append(")");
        return b.toString();
    }

    public ApiErrorContext(String str, String str2, Map<String, String> map) {
        this.code = str;
        this.field = str2;
        this._violatedConstraints = map;
    }

    public /* synthetic */ ApiErrorContext(String str, String str2, Map map, int i, e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : map);
    }
}
