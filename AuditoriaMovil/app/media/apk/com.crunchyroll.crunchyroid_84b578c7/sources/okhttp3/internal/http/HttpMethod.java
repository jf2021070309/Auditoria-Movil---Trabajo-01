package okhttp3.internal.http;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
/* compiled from: HttpMethod.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "()V", "invalidatesCache", "", FirebaseAnalytics.Param.METHOD, "", "permitsRequestBody", "redirectsToGet", "redirectsWithBody", "requiresRequestBody", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(String str) {
        j.f(str, FirebaseAnalytics.Param.METHOD);
        if (!j.a(str, "GET") && !j.a(str, "HEAD")) {
            return true;
        }
        return false;
    }

    public static final boolean requiresRequestBody(String str) {
        j.f(str, FirebaseAnalytics.Param.METHOD);
        if (!j.a(str, "POST") && !j.a(str, "PUT") && !j.a(str, "PATCH") && !j.a(str, "PROPPATCH") && !j.a(str, "REPORT")) {
            return false;
        }
        return true;
    }

    public final boolean invalidatesCache(String str) {
        j.f(str, FirebaseAnalytics.Param.METHOD);
        if (!j.a(str, "POST") && !j.a(str, "PATCH") && !j.a(str, "PUT") && !j.a(str, "DELETE") && !j.a(str, "MOVE")) {
            return false;
        }
        return true;
    }

    public final boolean redirectsToGet(String str) {
        j.f(str, FirebaseAnalytics.Param.METHOD);
        return !j.a(str, "PROPFIND");
    }

    public final boolean redirectsWithBody(String str) {
        j.f(str, FirebaseAnalytics.Param.METHOD);
        return j.a(str, "PROPFIND");
    }
}
