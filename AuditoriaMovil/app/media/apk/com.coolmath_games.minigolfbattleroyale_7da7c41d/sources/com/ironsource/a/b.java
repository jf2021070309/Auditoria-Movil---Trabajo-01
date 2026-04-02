package com.ironsource.a;

import android.net.Uri;
import android.util.Log;
import com.ironsource.c.b;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes2.dex */
public final class b {
    a a;
    private c b;
    private d c;
    private ExecutorService d;

    public b(a aVar, c cVar) {
        if (aVar == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        }
        if (aVar.d == null) {
            throw new InvalidParameterException("Null formatter not supported ");
        }
        this.a = aVar;
        this.b = cVar;
        this.c = aVar.d;
        this.d = Executors.newSingleThreadExecutor();
    }

    private static void a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception unused) {
        }
    }

    void a(String str) {
        if (this.a.e) {
            Log.d("EventsTracker", str);
        }
    }

    public final void a(String str, Map<String, Object> map) {
        a(String.format(Locale.ENGLISH, "%s %s", str, map.toString()));
        if (this.a.b && !str.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put("eventname", str);
            a(hashMap, this.b.a());
            a(hashMap, map);
            final String a = this.c.a(hashMap);
            this.d.submit(new Runnable() { // from class: com.ironsource.a.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        com.ironsource.c.c cVar = new com.ironsource.c.c();
                        ArrayList arrayList = new ArrayList(b.this.a.f);
                        if ("POST".equals(b.this.a.c)) {
                            cVar = com.ironsource.c.b.a(b.this.a.a, a, arrayList);
                        } else if ("GET".equals(b.this.a.c)) {
                            String str2 = b.this.a.a;
                            String str3 = a;
                            Uri build = Uri.parse(str2).buildUpon().encodedQuery(str3).build();
                            b.a.C0082a c0082a = new b.a.C0082a();
                            c0082a.b = build.toString();
                            c0082a.d = str3;
                            c0082a.c = "GET";
                            c0082a.a(arrayList);
                            cVar = com.ironsource.c.b.a(c0082a.a());
                        }
                        b bVar = b.this;
                        bVar.a("response status code: " + cVar.a);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
