package com.kwad.sdk.core.network.idc;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.utils.ag;
import com.kwad.sdk.utils.aw;
import com.kwad.sdk.utils.g;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class a {
    private final Map<String, String> apZ;
    private final com.kwad.sdk.core.network.idc.a.a aqa;
    private final Random aqb;
    private final Map<String, AtomicBoolean> aqc;
    private Context mContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.sdk.core.network.idc.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0257a {
        private static final a aqe = new a((byte) 0);
    }

    private a() {
        this.apZ = new ConcurrentHashMap(8);
        this.aqa = new com.kwad.sdk.core.network.idc.a.a();
        this.aqb = new Random(System.currentTimeMillis());
        HashMap hashMap = new HashMap();
        this.aqc = hashMap;
        hashMap.put("api", new AtomicBoolean(false));
        hashMap.put("ulog", new AtomicBoolean(false));
        hashMap.put("zt", new AtomicBoolean(false));
        hashMap.put("cdn", new AtomicBoolean(false));
    }

    /* synthetic */ a(byte b) {
        this();
    }

    public static a Bm() {
        return C0257a.aqe;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bn() {
        com.kwad.sdk.core.network.idc.a.a ba = b.ba(this.mContext);
        if (ba.isEmpty()) {
            ba = b.aZ(this.mContext);
        }
        this.aqa.b(ba);
    }

    private void L(String str, String str2) {
        String host;
        StringBuilder sb;
        List<String> dd = this.aqa.dd(str2);
        if (dd.isEmpty() || (host = Uri.parse(str).getHost()) == null || host.isEmpty()) {
            return;
        }
        c.d("IdcManager", ">>> switchHost start, type = " + str2 + ", old host = " + host);
        AtomicBoolean atomicBoolean = this.aqc.get(str2);
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                String db = db(str2);
                if ((TextUtils.isEmpty(db) || host.equals(db)) ? false : true) {
                    atomicBoolean.set(false);
                    sb = new StringBuilder("<<< switchHost end, type = ");
                } else {
                    int size = dd.size();
                    int indexOf = dd.indexOf(host);
                    boolean z = indexOf >= 0;
                    if (z) {
                        size--;
                    }
                    if (size <= 0) {
                        atomicBoolean.set(false);
                        sb = new StringBuilder("<<< switchHost end, type = ");
                    } else {
                        int nextInt = this.aqb.nextInt(size) + 1;
                        if (z) {
                            nextInt += indexOf;
                        }
                        int size2 = nextInt % dd.size();
                        String str3 = dd.get(size2);
                        c.d("IdcManager", "switchHost success, type = " + str2 + ", old host = " + host + ",new host = " + str3 + ",hostList = " + dd + ", key = " + size2);
                        N(str2, str3);
                        atomicBoolean.set(false);
                        sb = new StringBuilder("<<< switchHost end, type = ");
                    }
                }
                sb.append(str2);
                sb.append(", old host = ");
                sb.append(host);
                c.d("IdcManager", sb.toString());
            } catch (Throwable th) {
                atomicBoolean.set(false);
                c.d("IdcManager", "<<< switchHost end, type = " + str2 + ", old host = " + host);
                throw th;
            }
        }
    }

    private void N(String str, String str2) {
        this.apZ.put(str, str2);
        g.execute(new Runnable() { // from class: com.kwad.sdk.core.network.idc.a.3
            @Override // java.lang.Runnable
            public final void run() {
                b.a(a.this.mContext, a.this.apZ);
            }
        });
    }

    private static boolean a(DomainException domainException) {
        if (domainException.getHttpCode() >= 500) {
            return true;
        }
        return domainException.isConnectException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void da(String str) {
        String db = db(str);
        List<String> dd = this.aqa.dd(str);
        if (dd.isEmpty()) {
            return;
        }
        String str2 = dd.get(0);
        if (!TextUtils.equals(str2, db) && ag.fC(str2)) {
            N(str, str2);
        }
    }

    private String db(String str) {
        return this.apZ.get(str);
    }

    public final String M(String str, String str2) {
        String str3 = this.apZ.get(str);
        return TextUtils.isEmpty(str3) ? str2 : str3;
    }

    public final String O(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String db = db(str2);
        if (db == null || db.isEmpty()) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (TextUtils.isEmpty(parse.getPath()) || db.equals(parse.getHost())) {
            return str;
        }
        Uri.Builder builder = new Uri.Builder();
        builder.authority(db);
        builder.scheme(TextUtils.isEmpty(parse.getScheme()) ? "https" : parse.getScheme());
        builder.path(parse.getPath());
        if (!TextUtils.isEmpty(parse.getQuery())) {
            builder.query(parse.getQuery());
        }
        return URLDecoder.decode(builder.build().toString());
    }

    public final void a(com.kwad.sdk.core.network.idc.a.a aVar) {
        this.aqa.b(aVar);
        g.execute(new Runnable() { // from class: com.kwad.sdk.core.network.idc.a.2
            @Override // java.lang.Runnable
            public final void run() {
                b.a(a.this.mContext, a.this.aqa);
            }
        });
    }

    public final void a(String str, int i, Throwable th) {
        a(str, "ulog", new DomainException(i, th));
    }

    public final void a(String str, String str2, DomainException domainException) {
        if (str != null && a(domainException)) {
            L(str, str2);
        }
    }

    public final String dc(String str) {
        return O(str, "cdn");
    }

    public final void f(String str, Throwable th) {
        a(str, "cdn", new DomainException(th));
    }

    public final void init(final Context context) {
        this.mContext = context.getApplicationContext();
        g.execute(new aw() { // from class: com.kwad.sdk.core.network.idc.a.1
            @Override // com.kwad.sdk.utils.aw
            public final void doTask() {
                a.this.apZ.putAll(b.bb(context));
                a.this.Bn();
                if (a.this.aqa.isEmpty()) {
                    return;
                }
                for (String str : a.this.aqa.Bq()) {
                    a.this.da(str);
                }
            }
        });
    }
}
