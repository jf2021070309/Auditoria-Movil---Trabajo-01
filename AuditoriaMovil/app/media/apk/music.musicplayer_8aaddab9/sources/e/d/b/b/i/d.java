package e.d.b.b.i;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import ch.qos.logback.classic.Level;
import com.applovin.sdk.AppLovinEventTypes;
import e.d.b.b.i.e.f;
import e.d.b.b.i.e.g;
import e.d.b.b.i.e.h;
import e.d.b.b.i.e.i;
import e.d.b.b.i.e.j;
import e.d.b.b.i.e.k;
import e.d.b.b.i.e.l;
import e.d.b.b.i.e.n;
import e.d.b.b.i.e.o;
import e.d.b.b.i.e.p;
import e.d.b.b.i.e.q;
import e.d.b.b.i.e.r;
import e.d.b.b.i.e.t;
import e.d.b.b.i.e.u;
import e.d.b.b.j.n;
import e.d.b.b.j.y.g;
import e.d.b.b.j.y.m;
import e.d.d.p.j.e;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
/* loaded from: classes.dex */
public final class d implements m {
    public final e.d.d.p.a a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectivityManager f6048b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f6049c;

    /* renamed from: d  reason: collision with root package name */
    public final URL f6050d;

    /* renamed from: e  reason: collision with root package name */
    public final e.d.b.b.j.e0.a f6051e;

    /* renamed from: f  reason: collision with root package name */
    public final e.d.b.b.j.e0.a f6052f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6053g;

    /* loaded from: classes.dex */
    public static final class a {
        public final URL a;

        /* renamed from: b  reason: collision with root package name */
        public final o f6054b;

        /* renamed from: c  reason: collision with root package name */
        public final String f6055c;

        public a(URL url, o oVar, String str) {
            this.a = url;
            this.f6054b = oVar;
            this.f6055c = str;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final URL f6056b;

        /* renamed from: c  reason: collision with root package name */
        public final long f6057c;

        public b(int i2, URL url, long j2) {
            this.a = i2;
            this.f6056b = url;
            this.f6057c = j2;
        }
    }

    public d(Context context, e.d.b.b.j.e0.a aVar, e.d.b.b.j.e0.a aVar2) {
        e eVar = new e();
        e.d.b.b.i.e.c cVar = e.d.b.b.i.e.c.a;
        eVar.registerEncoder(o.class, cVar);
        eVar.registerEncoder(i.class, cVar);
        f fVar = f.a;
        eVar.registerEncoder(r.class, fVar);
        eVar.registerEncoder(l.class, fVar);
        e.d.b.b.i.e.d dVar = e.d.b.b.i.e.d.a;
        eVar.registerEncoder(p.class, dVar);
        eVar.registerEncoder(j.class, dVar);
        e.d.b.b.i.e.b bVar = e.d.b.b.i.e.b.a;
        eVar.registerEncoder(e.d.b.b.i.e.a.class, bVar);
        eVar.registerEncoder(h.class, bVar);
        e.d.b.b.i.e.e eVar2 = e.d.b.b.i.e.e.a;
        eVar.registerEncoder(q.class, eVar2);
        eVar.registerEncoder(k.class, eVar2);
        g gVar = g.a;
        eVar.registerEncoder(t.class, gVar);
        eVar.registerEncoder(n.class, gVar);
        eVar.f7545e = true;
        this.a = new e.d.d.p.j.d(eVar);
        this.f6049c = context;
        this.f6048b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f6050d = c(c.a);
        this.f6051e = aVar2;
        this.f6052f = aVar;
        this.f6053g = Level.ERROR_INT;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(e.a.d.a.a.k("Invalid url: ", str), e2);
        }
    }

    @Override // e.d.b.b.j.y.m
    public e.d.b.b.j.y.g a(e.d.b.b.j.y.f fVar) {
        Integer num;
        String str;
        e.d.b.b.j.y.a aVar;
        k.b bVar;
        HashMap hashMap = new HashMap();
        e.d.b.b.j.y.a aVar2 = (e.d.b.b.j.y.a) fVar;
        for (e.d.b.b.j.n nVar : aVar2.a) {
            String h2 = nVar.h();
            if (hashMap.containsKey(h2)) {
                ((List) hashMap.get(h2)).add(nVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(nVar);
                hashMap.put(h2, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                e.d.b.b.j.y.a aVar3 = aVar2;
                i iVar = new i(arrayList2);
                URL url = this.f6050d;
                if (aVar3.f6295b != null) {
                    try {
                        c a2 = c.a(((e.d.b.b.j.y.a) fVar).f6295b);
                        String str2 = a2.f6047g;
                        r6 = str2 != null ? str2 : null;
                        String str3 = a2.f6046f;
                        if (str3 != null) {
                            url = c(str3);
                        }
                    } catch (IllegalArgumentException unused) {
                        return e.d.b.b.j.y.g.a();
                    }
                }
                try {
                    b bVar2 = (b) c.t.m.C(5, new a(url, iVar, r6), new e.d.b.b.i.b(this), new e.d.b.b.j.b0.a() { // from class: e.d.b.b.i.a
                    });
                    int i2 = bVar2.a;
                    if (i2 == 200) {
                        return new e.d.b.b.j.y.b(g.a.OK, bVar2.f6057c);
                    }
                    if (i2 < 500 && i2 != 404) {
                        return i2 == 400 ? new e.d.b.b.j.y.b(g.a.INVALID_PAYLOAD, -1L) : e.d.b.b.j.y.g.a();
                    }
                    return new e.d.b.b.j.y.b(g.a.TRANSIENT_ERROR, -1L);
                } catch (IOException e2) {
                    c.t.m.h("CctTransportBackend", "Could not make request to the backend", e2);
                    return new e.d.b.b.j.y.b(g.a.TRANSIENT_ERROR, -1L);
                }
            }
            Map.Entry entry = (Map.Entry) it.next();
            e.d.b.b.j.n nVar2 = (e.d.b.b.j.n) ((List) entry.getValue()).get(0);
            u uVar = u.DEFAULT;
            Long valueOf = Long.valueOf(this.f6052f.a());
            Long valueOf2 = Long.valueOf(this.f6051e.a());
            j jVar = new j(p.a.ANDROID_FIREBASE, new h(Integer.valueOf(nVar2.g("sdk-version")), nVar2.b("model"), nVar2.b("hardware"), nVar2.b("device"), nVar2.b(AppLovinEventTypes.USER_VIEWED_PRODUCT), nVar2.b("os-uild"), nVar2.b("manufacturer"), nVar2.b("fingerprint"), nVar2.b("locale"), nVar2.b("country"), nVar2.b("mcc_mnc"), nVar2.b("application_build"), null), null);
            try {
                str = null;
                num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused2) {
                num = null;
                str = (String) entry.getKey();
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = ((List) entry.getValue()).iterator();
            while (it2.hasNext()) {
                e.d.b.b.j.n nVar3 = (e.d.b.b.j.n) it2.next();
                e.d.b.b.j.m e3 = nVar3.e();
                Iterator it3 = it;
                e.d.b.b.b bVar3 = e3.a;
                Iterator it4 = it2;
                if (bVar3.equals(new e.d.b.b.b("proto"))) {
                    byte[] bArr = e3.f6280b;
                    bVar = new k.b();
                    bVar.f6109d = bArr;
                } else if (bVar3.equals(new e.d.b.b.b("json"))) {
                    String str4 = new String(e3.f6280b, Charset.forName("UTF-8"));
                    bVar = new k.b();
                    bVar.f6110e = str4;
                } else {
                    aVar = aVar2;
                    Log.w(c.t.m.m("CctTransportBackend"), String.format("Received event of unsupported encoding %s. Skipping...", bVar3));
                    it2 = it4;
                    it = it3;
                    aVar2 = aVar;
                }
                bVar.a = Long.valueOf(nVar3.f());
                bVar.f6108c = Long.valueOf(nVar3.i());
                String str5 = nVar3.c().get("tz-offset");
                bVar.f6111f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                aVar = aVar2;
                bVar.f6112g = new n(t.b.forNumber(nVar3.g("net-type")), t.a.forNumber(nVar3.g("mobile-subtype")), null);
                if (nVar3.d() != null) {
                    bVar.f6107b = nVar3.d();
                }
                String str6 = bVar.a == null ? " eventTimeMs" : "";
                if (bVar.f6108c == null) {
                    str6 = e.a.d.a.a.k(str6, " eventUptimeMs");
                }
                if (bVar.f6111f == null) {
                    str6 = e.a.d.a.a.k(str6, " timezoneOffsetSeconds");
                }
                if (!str6.isEmpty()) {
                    throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str6));
                }
                arrayList3.add(new k(bVar.a.longValue(), bVar.f6107b, bVar.f6108c.longValue(), bVar.f6109d, bVar.f6110e, bVar.f6111f.longValue(), bVar.f6112g, null));
                it2 = it4;
                it = it3;
                aVar2 = aVar;
            }
            Iterator it5 = it;
            e.d.b.b.j.y.a aVar4 = aVar2;
            String str7 = valueOf == null ? " requestTimeMs" : "";
            if (valueOf2 == null) {
                str7 = e.a.d.a.a.k(str7, " requestUptimeMs");
            }
            if (!str7.isEmpty()) {
                throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str7));
            }
            arrayList2.add(new l(valueOf.longValue(), valueOf2.longValue(), jVar, num, str, arrayList3, uVar, null));
            it = it5;
            aVar2 = aVar4;
        }
    }

    @Override // e.d.b.b.j.y.m
    public e.d.b.b.j.n b(e.d.b.b.j.n nVar) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.f6048b.getActiveNetworkInfo();
        n.a j2 = nVar.j();
        j2.c().put("sdk-version", String.valueOf(Build.VERSION.SDK_INT));
        j2.c().put("model", Build.MODEL);
        j2.c().put("hardware", Build.HARDWARE);
        j2.c().put("device", Build.DEVICE);
        j2.c().put(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT);
        j2.c().put("os-uild", Build.ID);
        j2.c().put("manufacturer", Build.MANUFACTURER);
        j2.c().put("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        j2.c().put("tz-offset", String.valueOf(TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000));
        j2.c().put("net-type", String.valueOf(activeNetworkInfo == null ? t.b.NONE.getValue() : activeNetworkInfo.getType()));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            subtype = t.a.UNKNOWN_MOBILE_SUBTYPE.getValue();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = t.a.COMBINED.getValue();
            } else if (t.a.forNumber(subtype) == null) {
                subtype = 0;
            }
        }
        j2.c().put("mobile-subtype", String.valueOf(subtype));
        j2.c().put("country", Locale.getDefault().getCountry());
        j2.c().put("locale", Locale.getDefault().getLanguage());
        j2.c().put("mcc_mnc", ((TelephonyManager) this.f6049c.getSystemService("phone")).getSimOperator());
        Context context = this.f6049c;
        try {
            i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            c.t.m.h("CctTransportBackend", "Unable to find version code for package", e2);
        }
        j2.c().put("application_build", Integer.toString(i2));
        return j2.b();
    }
}
