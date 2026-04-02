package okhttp3.internal.http;

import com.amazon.aps.iva.ef0.e;
import com.amazon.aps.iva.ef0.i;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
/* compiled from: HttpHeaders.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\n\u001a\u00020\t*\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u0006H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u001a\u0010\u0016\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000\u001a\n\u0010\u0018\u001a\u00020\u000b*\u00020\u0017\u001a\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0017H\u0007\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lokhttp3/Headers;", "", "headerName", "", "Lokhttp3/Challenge;", "parseChallenges", "Lcom/amazon/aps/iva/ef0/e;", "", "result", "Lcom/amazon/aps/iva/kb0/q;", "readChallengeHeader", "", "skipCommasAndWhitespace", "", "prefix", "startsWith", "readQuotedString", "readToken", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", ImagesContract.URL, "headers", "receiveHeaders", "Lokhttp3/Response;", "promisesBody", "response", "hasBody", "Lcom/amazon/aps/iva/ef0/i;", "QUOTED_STRING_DELIMITERS", "Lcom/amazon/aps/iva/ef0/i;", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class HttpHeaders {
    private static final i QUOTED_STRING_DELIMITERS;
    private static final i TOKEN_DELIMITERS;

    static {
        i iVar = i.e;
        QUOTED_STRING_DELIMITERS = i.a.c("\"\\");
        TOKEN_DELIMITERS = i.a.c("\t ,=");
    }

    public static final boolean hasBody(Response response) {
        j.f(response, "response");
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        j.f(headers, "<this>");
        j.f(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if (m.Z(str, headers.name(i))) {
                e eVar = new e();
                eVar.c0(headers.value(i));
                try {
                    readChallengeHeader(eVar, arrayList);
                } catch (EOFException e) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        j.f(response, "<this>");
        if (j.a(response.request().method(), "HEAD")) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.headersContentLength(response) == -1 && !m.Z("chunked", Response.header$default(response, com.google.common.net.HttpHeaders.TRANSFER_ENCODING, null, 2, null))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b5, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b5, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void readChallengeHeader(com.amazon.aps.iva.ef0.e r7, java.util.List<okhttp3.Challenge> r8) throws java.io.EOFException {
        /*
        L0:
            r0 = 0
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            skipCommasAndWhitespace(r7)
            java.lang.String r1 = readToken(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = skipCommasAndWhitespace(r7)
            java.lang.String r3 = readToken(r7)
            if (r3 != 0) goto L2a
            boolean r7 = r7.Y()
            if (r7 != 0) goto L1f
            return
        L1f:
            okhttp3.Challenge r7 = new okhttp3.Challenge
            com.amazon.aps.iva.lb0.a0 r0 = com.amazon.aps.iva.lb0.a0.b
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2a:
            r4 = 61
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r2 != 0) goto L61
            if (r6 != 0) goto L3e
            boolean r2 = r7.Y()
            if (r2 == 0) goto L61
        L3e:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.StringBuilder r3 = defpackage.c.b(r3)
            java.lang.String r4 = "="
            java.lang.String r4 = com.amazon.aps.iva.oe0.m.d0(r5, r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.util.Map r0 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r3 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            com.amazon.aps.iva.yb0.j.e(r0, r3)
            r2.<init>(r1, r0)
            r8.add(r2)
            goto L0
        L61:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = okhttp3.internal.Util.skipAll(r7, r4)
            int r6 = r6 + r5
        L6b:
            if (r3 != 0) goto L7c
            java.lang.String r3 = readToken(r7)
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 != 0) goto Lb5
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
            r6 = r5
        L7c:
            if (r6 == 0) goto Lb5
            r5 = 1
            if (r6 <= r5) goto L82
            return
        L82:
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 == 0) goto L89
            return
        L89:
            r5 = 34
            boolean r5 = startsWith(r7, r5)
            if (r5 == 0) goto L96
            java.lang.String r5 = readQuotedString(r7)
            goto L9a
        L96:
            java.lang.String r5 = readToken(r7)
        L9a:
            if (r5 != 0) goto L9d
            return
        L9d:
            java.lang.Object r3 = r2.put(r3, r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto La6
            return
        La6:
            boolean r3 = skipCommasAndWhitespace(r7)
            if (r3 != 0) goto Lb3
            boolean r3 = r7.Y()
            if (r3 != 0) goto Lb3
            return
        Lb3:
            r3 = r0
            goto L6b
        Lb5:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.readChallengeHeader(com.amazon.aps.iva.ef0.e, java.util.List):void");
    }

    private static final String readQuotedString(e eVar) throws EOFException {
        boolean z;
        if (eVar.readByte() == 34) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            e eVar2 = new e();
            while (true) {
                long U = eVar.U(QUOTED_STRING_DELIMITERS);
                if (U == -1) {
                    return null;
                }
                if (eVar.i(U) == 34) {
                    eVar2.write(eVar, U);
                    eVar.readByte();
                    return eVar2.A();
                } else if (eVar.c == U + 1) {
                    return null;
                } else {
                    eVar2.write(eVar, U);
                    eVar.readByte();
                    eVar2.write(eVar, 1L);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private static final String readToken(e eVar) {
        long U = eVar.U(TOKEN_DELIMITERS);
        if (U == -1) {
            U = eVar.c;
        }
        if (U != 0) {
            return eVar.B(U);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        j.f(cookieJar, "<this>");
        j.f(httpUrl, ImagesContract.URL);
        j.f(headers, "headers");
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> parseAll = Cookie.Companion.parseAll(httpUrl, headers);
        if (parseAll.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, parseAll);
    }

    private static final boolean skipCommasAndWhitespace(e eVar) {
        boolean z = false;
        while (!eVar.Y()) {
            byte i = eVar.i(0L);
            boolean z2 = true;
            if (i == 44) {
                eVar.readByte();
                z = true;
            } else {
                if (i != 32 && i != 9) {
                    z2 = false;
                }
                if (!z2) {
                    break;
                }
                eVar.readByte();
            }
        }
        return z;
    }

    private static final boolean startsWith(e eVar, byte b) {
        if (!eVar.Y() && eVar.i(0L) == b) {
            return true;
        }
        return false;
    }
}
