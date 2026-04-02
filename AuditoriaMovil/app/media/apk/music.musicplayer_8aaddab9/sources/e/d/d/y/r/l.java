package e.d.d.y.r;

import com.google.android.gms.common.util.Clock;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import e.d.d.y.r.n;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class l {
    public static final long a = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f7778b = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: c  reason: collision with root package name */
    public final e.d.d.u.h f7779c;

    /* renamed from: d  reason: collision with root package name */
    public final e.d.d.t.b<e.d.d.k.a.a> f7780d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f7781e;

    /* renamed from: f  reason: collision with root package name */
    public final Clock f7782f;

    /* renamed from: g  reason: collision with root package name */
    public final Random f7783g;

    /* renamed from: h  reason: collision with root package name */
    public final j f7784h;

    /* renamed from: i  reason: collision with root package name */
    public final ConfigFetchHttpClient f7785i;

    /* renamed from: j  reason: collision with root package name */
    public final n f7786j;

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, String> f7787k;

    /* loaded from: classes2.dex */
    public static class a {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final k f7788b;

        /* renamed from: c  reason: collision with root package name */
        public final String f7789c;

        public a(Date date, int i2, k kVar, String str) {
            this.a = i2;
            this.f7788b = kVar;
            this.f7789c = str;
        }
    }

    public l(e.d.d.u.h hVar, e.d.d.t.b<e.d.d.k.a.a> bVar, Executor executor, Clock clock, Random random, j jVar, ConfigFetchHttpClient configFetchHttpClient, n nVar, Map<String, String> map) {
        this.f7779c = hVar;
        this.f7780d = bVar;
        this.f7781e = executor;
        this.f7782f = clock;
        this.f7783g = random;
        this.f7784h = jVar;
        this.f7785i = configFetchHttpClient;
        this.f7786j = nVar;
        this.f7787k = map;
    }

    public final a a(String str, String str2, Date date) throws e.d.d.y.l {
        String str3;
        boolean z = false;
        try {
            a fetch = this.f7785i.fetch(this.f7785i.b(), str, str2, b(), this.f7786j.f7796c.getString("last_fetch_etag", null), this.f7787k, date);
            String str4 = fetch.f7789c;
            if (str4 != null) {
                n nVar = this.f7786j;
                synchronized (nVar.f7797d) {
                    nVar.f7796c.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.f7786j.b(0, n.f7795b);
            return fetch;
        } catch (e.d.d.y.n e2) {
            int i2 = e2.a;
            if (i2 == 429 || i2 == 502 || i2 == 503 || i2 == 504) {
                int i3 = this.f7786j.a().a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f7778b;
                long millis = timeUnit.toMillis(iArr[Math.min(i3, iArr.length) - 1]);
                this.f7786j.b(i3, new Date(date.getTime() + (millis / 2) + this.f7783g.nextInt((int) millis)));
            }
            n.a a2 = this.f7786j.a();
            int i4 = e2.a;
            if ((a2.a > 1 || i4 == 429) ? true : true) {
                throw new e.d.d.y.m(a2.f7799b.getTime());
            }
            if (i4 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i4 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else if (i4 == 429) {
                throw new e.d.d.y.k("The throttled response from the server was not handled correctly by the FRC SDK.");
            } else {
                if (i4 != 500) {
                    switch (i4) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new e.d.d.y.n(e2.a, e.a.d.a.a.k("Fetch failed: ", str3), e2);
        }
    }

    public final Map<String, String> b() {
        HashMap hashMap = new HashMap();
        e.d.d.k.a.a aVar = this.f7780d.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : aVar.a(false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }
}
