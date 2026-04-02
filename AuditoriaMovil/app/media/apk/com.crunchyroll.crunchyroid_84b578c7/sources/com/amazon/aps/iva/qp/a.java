package com.amazon.aps.iva.qp;

import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
/* compiled from: DataOkHttpUploaderV2.kt */
/* loaded from: classes2.dex */
public abstract class a implements c {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Call.Factory f;
    public final String g;
    public final com.amazon.aps.iva.aq.a h;
    public final com.amazon.aps.iva.iq.a i;
    public final String j;
    public final m k;

    /* compiled from: DataOkHttpUploaderV2.kt */
    /* renamed from: com.amazon.aps.iva.qp.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0653a {
        LOGS("logs"),
        RUM("rum"),
        SPANS("spans");
        
        private final String trackName;

        EnumC0653a(String str) {
            this.trackName = str;
        }

        public final String getTrackName() {
            return this.trackName;
        }
    }

    public a(String str, String str2, String str3, String str4, OkHttpClient okHttpClient, String str5, com.amazon.aps.iva.aq.a aVar, com.amazon.aps.iva.iq.a aVar2) {
        j.f(str2, "clientToken");
        j.f(str3, FirebaseAnalytics.Param.SOURCE);
        j.f(str4, "sdkVersion");
        j.f(aVar2, "internalLogger");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = okHttpClient;
        this.g = str5;
        this.h = aVar;
        this.i = aVar2;
        this.j = getClass().getSimpleName();
        this.k = com.amazon.aps.iva.kb0.f.b(new b(this));
    }

    public Map<String, Object> a() {
        return a0.b;
    }

    public final f b(String str, byte[] bArr) {
        Request.Builder builder = new Request.Builder();
        Map<String, Object> a = a();
        boolean isEmpty = a.isEmpty();
        String str2 = this.b;
        if (!isEmpty) {
            ArrayList arrayList = new ArrayList(a.size());
            for (Map.Entry<String, Object> entry : a.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                arrayList.add(((Object) key) + "=" + value);
            }
            str2 = com.amazon.aps.iva.c80.a.f(str2, x.B0(arrayList, "&", "?", null, null, 60));
        }
        Request.Builder post = builder.url(str2).post(RequestBody.create((MediaType) null, bArr));
        j.e(post, "builder");
        post.addHeader("DD-API-KEY", this.c);
        post.addHeader("DD-EVP-ORIGIN", this.d);
        post.addHeader("DD-EVP-ORIGIN-VERSION", this.e);
        post.addHeader(HttpHeaders.USER_AGENT, (String) this.k.getValue());
        post.addHeader(HttpHeaders.CONTENT_TYPE, this.g);
        post.addHeader("DD-REQUEST-ID", str);
        Request build = post.build();
        j.e(build, "builder.build()");
        Response execute = this.f.newCall(build).execute();
        execute.close();
        int code = execute.code();
        if (code != 202) {
            if (code != 403) {
                if (code != 408) {
                    if (code != 413) {
                        if (code != 429) {
                            if (code != 500) {
                                if (code != 503) {
                                    if (code != 400) {
                                        if (code != 401) {
                                            return f.UNKNOWN_ERROR;
                                        }
                                        return f.INVALID_TOKEN_ERROR;
                                    }
                                    return f.HTTP_CLIENT_ERROR;
                                }
                                return f.HTTP_SERVER_ERROR;
                            }
                            return f.HTTP_SERVER_ERROR;
                        }
                        return f.HTTP_CLIENT_RATE_LIMITING;
                    }
                    return f.HTTP_CLIENT_ERROR;
                }
                return f.HTTP_CLIENT_RATE_LIMITING;
            }
            return f.INVALID_TOKEN_ERROR;
        }
        return f.SUCCESS;
    }

    @Override // com.amazon.aps.iva.qp.c
    public final f c(byte[] bArr) {
        f fVar;
        j.f(bArr, "data");
        String uuid = UUID.randomUUID().toString();
        j.e(uuid, "randomUUID().toString()");
        try {
            fVar = b(uuid, bArr);
        } catch (Throwable th) {
            com.amazon.aps.iva.iq.a.a(this.i, "Unable to upload batch data.", th, 4);
            fVar = f.NETWORK_ERROR;
        }
        f fVar2 = fVar;
        String str = this.j;
        j.e(str, "uploaderName");
        fVar2.logStatus(str, bArr.length, com.amazon.aps.iva.dq.c.b, false, false, uuid);
        fVar2.logStatus(str, bArr.length, this.i, true, true, uuid);
        return fVar2;
    }
}
