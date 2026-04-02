package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.AsyncTask;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* renamed from: com.ironsource.mediationsdk.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0114h {
    ISBannerSize a;
    private String g;
    private com.ironsource.mediationsdk.utils.b i;
    private InterfaceC0113g j;
    private final String b = "1";
    private final String c = "102";
    private final String d = "103";
    private final String e = "102";
    private final String f = "GenericNotifications";
    private String h = IronSourceUtils.getSessionId();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.mediationsdk.h$a */
    /* loaded from: classes2.dex */
    public static class a extends AsyncTask<Object, Void, Boolean> {
        private WeakReference<InterfaceC0113g> a;
        private JSONObject b;
        private int c;
        private String d;
        private String e;
        private List<com.ironsource.mediationsdk.a.c> f;
        private com.ironsource.mediationsdk.a.c g;
        private JSONObject h;
        private long i;
        private int j;
        private int l;
        private String k = "other";
        private String m = "";
        private int n = 0;

        a(InterfaceC0113g interfaceC0113g) {
            this.a = new WeakReference<>(interfaceC0113g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:113:0x02a2  */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference failed for: r6v8 */
        /* JADX WARN: Type inference failed for: r6v9, types: [java.io.BufferedWriter] */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1, types: [int, boolean] */
        /* JADX WARN: Type inference failed for: r7v2 */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Boolean doInBackground(java.lang.Object... r23) {
            /*
                Method dump skipped, instructions count: 726
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C0114h.a.doInBackground(java.lang.Object[]):java.lang.Boolean");
        }

        private String a() {
            return this.l == 2 ? com.ironsource.mediationsdk.utils.g.a().c() : com.ironsource.mediationsdk.utils.g.a().b();
        }

        private static String a(HttpURLConnection httpURLConnection) {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
                sb.append(readLine);
            }
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(Boolean bool) {
            Boolean bool2 = bool;
            InterfaceC0113g interfaceC0113g = this.a.get();
            if (interfaceC0113g != null) {
                long time = new Date().getTime() - this.i;
                if (bool2.booleanValue()) {
                    interfaceC0113g.a(this.f, this.e, this.g, this.h, this.j + 1, time, this.n, this.m);
                } else {
                    interfaceC0113g.a(this.c, this.d, this.j + 1, this.k, time);
                }
            }
        }
    }

    public C0114h(String str, com.ironsource.mediationsdk.utils.b bVar, InterfaceC0113g interfaceC0113g) {
        this.g = str;
        this.i = bVar;
        this.j = interfaceC0113g;
    }

    private JSONObject a(Context context, Map<String, Object> map, List<String> list, C0115i c0115i, int i, boolean z) {
        new JSONObject();
        if (E.a().i.c.e.c().c) {
            return C0112f.a().a(this.g, z, map, list, c0115i, i, this.a);
        }
        JSONObject a2 = C0112f.a().a(context, map, list, c0115i, i, this.h, this.i, this.a);
        a2.put(IronSourceConstants.EVENTS_AD_UNIT, this.g);
        a2.put("doNotEncryptResponse", z ? "false" : "true");
        return a2;
    }

    public static void a(com.ironsource.mediationsdk.a.c cVar, int i, com.ironsource.mediationsdk.a.c cVar2) {
        for (String str : cVar.f()) {
            String a2 = C0112f.a().a(str, i, cVar, "", "", "");
            C0112f.a();
            C0112f.a("reportLoadSuccess", cVar.a(), a2);
        }
        if (cVar2 != null) {
            for (String str2 : cVar2.f()) {
                String a3 = C0112f.a().a(str2, i, cVar, "", "102", "");
                C0112f.a();
                C0112f.a("reportLoadSuccess", "GenericNotifications", a3);
            }
        }
    }

    public static void a(com.ironsource.mediationsdk.a.c cVar, int i, com.ironsource.mediationsdk.a.c cVar2, String str) {
        for (String str2 : cVar.d()) {
            String a2 = C0112f.a().a(str2, i, cVar, "", "", str);
            C0112f.a();
            C0112f.a("reportImpression", cVar.a(), a2);
        }
        if (cVar2 != null) {
            for (String str3 : cVar2.d()) {
                String a3 = C0112f.a().a(str3, i, cVar, "", "102", str);
                C0112f.a();
                C0112f.a("reportImpression", "GenericNotifications", a3);
            }
        }
    }

    public static void a(ArrayList<String> arrayList, ConcurrentHashMap<String, com.ironsource.mediationsdk.a.c> concurrentHashMap, int i, com.ironsource.mediationsdk.a.c cVar, com.ironsource.mediationsdk.a.c cVar2) {
        Iterator<String> it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals(cVar2.a())) {
                z2 = i == 2;
                z = true;
            } else {
                com.ironsource.mediationsdk.a.c cVar3 = concurrentHashMap.get(next);
                String c = cVar3.c();
                String str = z ? z2 ? "102" : "103" : "1";
                for (String str2 : cVar3.e()) {
                    String a2 = C0112f.a().a(str2, i, cVar2, c, str, "");
                    C0112f.a();
                    C0112f.a("reportAuctionLose", cVar3.a(), a2);
                }
            }
        }
        if (cVar != null) {
            for (String str3 : cVar.e()) {
                String a3 = C0112f.a().a(str3, i, cVar2, "", "102", "");
                C0112f.a();
                C0112f.a("reportAuctionLose", "GenericNotifications", a3);
            }
        }
    }

    public final void a(Context context, Map<String, Object> map, List<String> list, C0115i c0115i, int i) {
        try {
            boolean z = IronSourceUtils.getSerr() == 1;
            new a(this.j).execute(this.i.d, a(context, map, list, c0115i, i, z), Boolean.valueOf(z), Integer.valueOf(this.i.e), Long.valueOf(this.i.h), Boolean.valueOf(this.i.p), Boolean.valueOf(this.i.q), Integer.valueOf(this.i.r));
        } catch (Exception e) {
            this.j.a(1000, e.getMessage(), 0, "other", 0L);
        }
    }

    public final void a(CopyOnWriteArrayList<V> copyOnWriteArrayList, ConcurrentHashMap<String, com.ironsource.mediationsdk.a.c> concurrentHashMap, int i, com.ironsource.mediationsdk.a.c cVar, com.ironsource.mediationsdk.a.c cVar2) {
        ArrayList arrayList = new ArrayList();
        Iterator<V> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().k());
        }
        a(arrayList, concurrentHashMap, i, cVar, cVar2);
    }
}
