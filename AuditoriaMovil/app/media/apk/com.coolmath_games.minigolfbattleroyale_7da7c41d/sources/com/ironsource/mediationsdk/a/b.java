package com.ironsource.mediationsdk.a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.appevents.integrity.IntegrityManager;
import com.ironsource.environment.a;
import com.ironsource.environment.j;
import com.ironsource.mediationsdk.E;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.q;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public abstract class b {
    private com.ironsource.mediationsdk.a.a G;
    private int[] I;
    private IronSourceSegment K;
    private q L;
    public boolean a;
    com.ironsource.b.a d;
    ArrayList<com.ironsource.mediationsdk.adunit.a.a> e;
    int g;
    String h;
    Context i;
    int[] l;
    int[] m;
    int[] n;
    int q;
    String r;
    String s;
    Set<Integer> t;
    HandlerThreadC0085b u;
    private int v = 1;
    private int w = 100;
    private int x = 5000;
    private int y = 90000;
    private int z = 1024;
    private int A = 5;
    private String B = "supersonic_sdk.db";
    private String C = IronSourceConstants.EVENTS_PROVIDER;
    private String D = "placement";
    private final String E = "abt";
    private final String F = "mt";
    boolean b = false;
    public boolean c = false;
    public boolean f = true;
    int j = 100;
    private int H = 5000;
    int k = 1;
    private Map<String, String> J = new HashMap();
    Map<String, String> o = new HashMap();
    public String p = "";
    private final Object M = new Object();

    /* loaded from: classes2.dex */
    public enum a {
        NOT_SUPPORTED(-1),
        OFFERWALL(1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        BANNER(8);
        
        int f;

        a(int i) {
            this.f = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.mediationsdk.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class HandlerThreadC0085b extends HandlerThread {
        Handler a;

        HandlerThreadC0085b(String str) {
            super(str);
        }

        final void a(Runnable runnable) {
            this.a.post(runnable);
        }
    }

    private ArrayList<com.ironsource.mediationsdk.adunit.a.a> a(ArrayList<com.ironsource.mediationsdk.adunit.a.a> arrayList, ArrayList<com.ironsource.mediationsdk.adunit.a.a> arrayList2, int i) {
        ArrayList<com.ironsource.mediationsdk.adunit.a.a> arrayList3 = new ArrayList<>();
        try {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(arrayList);
            arrayList4.addAll(arrayList2);
            Collections.sort(arrayList4, new Comparator<com.ironsource.mediationsdk.adunit.a.a>() { // from class: com.ironsource.mediationsdk.a.b.3
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(com.ironsource.mediationsdk.adunit.a.a aVar, com.ironsource.mediationsdk.adunit.a.a aVar2) {
                    return aVar.b() >= aVar2.b() ? 1 : -1;
                }
            });
            if (arrayList4.size() <= i) {
                arrayList3.addAll(arrayList4);
            } else {
                arrayList3.addAll(arrayList4.subList(0, i));
                this.d.a(arrayList4.subList(i, arrayList4.size()), this.s);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("CombinedEventList exception: " + e.getMessage());
        }
        return arrayList3;
    }

    static /* synthetic */ void a(b bVar, com.ironsource.mediationsdk.adunit.a.a aVar, String str) {
        JSONObject d = aVar.d();
        if (d == null || !d.has(str)) {
            return;
        }
        try {
            String optString = d.optString(str, null);
            if (optString != null) {
                aVar.a(str, optString.substring(0, Math.min(optString.length(), 1024)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(String str) {
        com.ironsource.mediationsdk.a.a aVar = this.G;
        if (aVar == null || !aVar.c().equals(str)) {
            this.G = c.a(str, this.q);
        }
    }

    public static void a(Map<String, Object> map, int i, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        map.put(IronSourceConstants.AUCTION_FALLBACK, str);
    }

    static boolean a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int e(int i) {
        a aVar;
        int i2 = a.NOT_SUPPORTED.f;
        if (i == 15 || (i >= 300 && i < 400)) {
            aVar = a.OFFERWALL;
        } else if ((i >= 1000 && i < 2000) || (i >= 91000 && i < 92000)) {
            aVar = a.REWARDED_VIDEO;
        } else if ((i >= 2000 && i < 3000) || (i >= 92000 && i < 93000)) {
            aVar = a.INTERSTITIAL;
        } else if ((i < 3000 || i >= 4000) && (i < 93000 || i >= 94000)) {
            return i2;
        } else {
            aVar = a.BANNER;
        }
        return aVar.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ArrayList<com.ironsource.mediationsdk.adunit.a.a> a2;
        this.b = false;
        synchronized (this.M) {
            a2 = a(this.e, this.d.a(this.s), this.H);
            if (a2.size() > 0) {
                this.e.clear();
                this.d.b(this.s);
            }
        }
        if (a2.size() > 0) {
            this.g = 0;
            JSONObject b = com.ironsource.mediationsdk.sdk.e.a().b();
            try {
                try {
                    if (this.K != null) {
                        if (this.K.getAge() > 0) {
                            b.put("age", this.K.getAge());
                        }
                        if (!TextUtils.isEmpty(this.K.getGender())) {
                            b.put(IronSourceSegment.GENDER, this.K.getGender());
                        }
                        if (this.K.getLevel() > 0) {
                            b.put(IronSourceSegment.LEVEL, this.K.getLevel());
                        }
                        if (this.K.getIsPaying() != null) {
                            b.put(IronSourceSegment.PAYING, this.K.getIsPaying().get());
                        }
                        if (this.K.getIapt() > 0.0d) {
                            b.put(IronSourceSegment.IAPT, this.K.getIapt());
                        }
                        if (this.K.getUcd() > 0) {
                            b.put(IronSourceSegment.USER_CREATION_DATE, this.K.getUcd());
                        }
                    }
                    if (this.L != null) {
                        String str = this.L.b;
                        if (!TextUtils.isEmpty(str)) {
                            b.put("segmentId", str);
                        }
                        JSONObject jSONObject = this.L.c;
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            b.put(next, jSONObject.get(next));
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                String str2 = this.p;
                if (!TextUtils.isEmpty(str2)) {
                    b.put("abt", str2);
                }
                String str3 = E.a().o;
                if (!TextUtils.isEmpty(str3)) {
                    b.put("mt", str3);
                }
                Map<String, String> map = this.J;
                if (!map.isEmpty()) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (!b.has(entry.getKey())) {
                            b.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                JSONObject a3 = j.a(new com.ironsource.environment.b.b().a);
                Intrinsics.checkNotNullExpressionValue(a3, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
                Iterator<String> keys2 = a3.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    b.put(next2, a3.get(next2));
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            String a4 = this.G.a(a2, b);
            if (TextUtils.isEmpty(a4)) {
                IronLog.INTERNAL.error("Failed to parse events. Saving them back to storage.");
                a(a2);
                return;
            }
            if (this.c) {
                try {
                    a4 = Base64.encodeToString(a.AnonymousClass1.b(a4), 0);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            new com.ironsource.b.b(new com.ironsource.b.c() { // from class: com.ironsource.mediationsdk.a.b.2
                @Override // com.ironsource.b.c
                public final synchronized void a(final ArrayList<com.ironsource.mediationsdk.adunit.a.a> arrayList, final boolean z) {
                    b.this.u.a(new Runnable() { // from class: com.ironsource.mediationsdk.a.b.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (!z) {
                                IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                                b.this.a(arrayList);
                                return;
                            }
                            ArrayList<com.ironsource.mediationsdk.adunit.a.a> a5 = b.this.d.a(b.this.s);
                            b.this.g = a5.size() + b.this.e.size();
                        }
                    });
                }
            }).execute(a4, this.G.a(), a2);
        }
    }

    synchronized int a(com.ironsource.mediationsdk.adunit.a.a aVar) {
        return aVar.a() + 90000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.e = new ArrayList<>();
        this.g = 0;
        this.G = c.a(this.r, this.q);
        HandlerThreadC0085b handlerThreadC0085b = new HandlerThreadC0085b(this.s + "EventThread");
        this.u = handlerThreadC0085b;
        handlerThreadC0085b.start();
        HandlerThreadC0085b handlerThreadC0085b2 = this.u;
        handlerThreadC0085b2.a = new Handler(handlerThreadC0085b2.getLooper());
        this.h = IronSourceUtils.getSessionId();
        this.t = new HashSet();
        b();
    }

    public final void a(int i) {
        if (i > 0) {
            this.k = i;
        }
    }

    public final synchronized void a(Context context, IronSourceSegment ironSourceSegment) {
        String defaultEventsFormatterType = IronSourceUtils.getDefaultEventsFormatterType(context, this.s, this.r);
        this.r = defaultEventsFormatterType;
        a(defaultEventsFormatterType);
        this.G.c = IronSourceUtils.getDefaultEventsURL(context, this.s, null);
        this.d = com.ironsource.b.a.a(context, "supersonic_sdk.db", 5);
        c();
        this.l = IronSourceUtils.getDefaultOptOutEvents(context, this.s);
        this.m = IronSourceUtils.getDefaultOptInEvents(context, this.s);
        this.n = IronSourceUtils.getDefaultTriggerEvents(context, this.s);
        this.I = IronSourceUtils.getDefaultNonConnectivityEvents(context, this.s);
        this.K = ironSourceSegment;
        this.i = context;
    }

    public final synchronized void a(q qVar) {
        this.L = qVar;
    }

    public final void a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.ironsource.mediationsdk.a.a aVar = this.G;
        if (aVar != null) {
            aVar.c = str;
        }
        IronSourceUtils.saveDefaultEventsURL(context, this.s, str);
    }

    protected void a(ArrayList<com.ironsource.mediationsdk.adunit.a.a> arrayList) {
        if (arrayList != null) {
            synchronized (this.M) {
                this.d.a(arrayList, this.s);
                this.g = this.d.a(this.s).size() + this.e.size();
            }
        }
    }

    public final void a(Map<String, String> map) {
        this.J.putAll(map);
    }

    public final void a(int[] iArr, Context context) {
        this.l = iArr;
        IronSourceUtils.saveDefaultOptOutEvents(context, this.s, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(int i, int[] iArr) {
        if (a(iArr)) {
            for (int i2 : iArr) {
                if (i == i2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    synchronized boolean a(String str, com.ironsource.mediationsdk.adunit.a.a aVar) {
        if (str.equalsIgnoreCase(IntegrityManager.INTEGRITY_TYPE_NONE)) {
            return a(this.I) ? a(aVar.a(), this.I) : this.t.contains(Integer.valueOf(aVar.a()));
        }
        return false;
    }

    protected void b() {
    }

    public final void b(int i) {
        if (i > 0) {
            this.j = i;
        }
    }

    public final synchronized void b(final com.ironsource.mediationsdk.adunit.a.a aVar) {
        this.u.a(new Runnable() { // from class: com.ironsource.mediationsdk.a.b.1
            @Override // java.lang.Runnable
            public final void run() {
                if (aVar == null || !b.this.f) {
                    return;
                }
                aVar.a("eventSessionId", b.this.h);
                String connectionType = IronSourceUtils.getConnectionType(b.this.i);
                if (b.this.g(aVar)) {
                    aVar.a("connectionType", connectionType);
                }
                if (b.this.a(connectionType, aVar)) {
                    com.ironsource.mediationsdk.adunit.a.a aVar2 = aVar;
                    aVar2.a(b.this.a(aVar2));
                }
                int e = b.e(aVar.a());
                if (e != a.NOT_SUPPORTED.f) {
                    aVar.a(IronSourceConstants.EVENTS_AD_UNIT, Integer.valueOf(e));
                }
                b.a(b.this, aVar, IronSourceConstants.EVENTS_ERROR_REASON);
                b.a(b.this, aVar, IronSourceConstants.EVENTS_EXT1);
                if (!b.this.o.isEmpty()) {
                    for (Map.Entry<String, String> entry : b.this.o.entrySet()) {
                        if (!aVar.d().has(entry.getKey()) && entry.getKey() != "eventId" && entry.getKey() != VisionDataDBAdapter.VisionDataColumns.COLUMN_TIMESTAMP) {
                            aVar.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                b bVar = b.this;
                com.ironsource.mediationsdk.adunit.a.a aVar3 = aVar;
                boolean z = false;
                if (aVar3 != null ? b.a(bVar.l) ? !bVar.a(aVar3.a(), bVar.l) : b.a(bVar.m) ? bVar.a(aVar3.a(), bVar.m) : true : false) {
                    if (b.this.f(aVar)) {
                        JSONObject d = aVar.d();
                        if (!(d == null ? false : d.has(IronSourceConstants.KEY_SESSION_DEPTH))) {
                            aVar.a(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(b.this.e(aVar)));
                        }
                    }
                    if (!TextUtils.isEmpty(b.this.d(aVar.a())) && b.this.c(aVar)) {
                        com.ironsource.mediationsdk.adunit.a.a aVar4 = aVar;
                        aVar4.a("placement", b.this.d(aVar4.a()));
                    }
                    long firstSessionTimestamp = IronSourceUtils.getFirstSessionTimestamp(b.this.i);
                    if (firstSessionTimestamp != -1) {
                        aVar.a(IronSourceConstants.FIRST_SESSION_TIMESTAMP, Long.valueOf(firstSessionTimestamp));
                    }
                    try {
                        IronLog.EVENT.verbose(("{\"eventId\":" + aVar.a() + ",\"timestamp\":" + aVar.b() + "," + aVar.c().substring(1)).replace(",", "\n"));
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    b.this.e.add(aVar);
                    b.this.g++;
                }
                boolean a2 = b.a(b.this.n) ? b.this.a(aVar.a(), b.this.n) : b.this.d(aVar);
                if (!b.this.b && a2) {
                    b.this.b = true;
                }
                if (b.this.d != null) {
                    b bVar2 = b.this;
                    if ((bVar2.g >= bVar2.j || bVar2.b) && bVar2.a) {
                        b.this.e();
                        return;
                    }
                    b bVar3 = b.this;
                    ArrayList<com.ironsource.mediationsdk.adunit.a.a> arrayList = bVar3.e;
                    if (arrayList != null && arrayList.size() >= bVar3.k) {
                        z = true;
                    }
                    if (z || a2) {
                        b.this.c();
                    }
                }
            }
        });
    }

    public final void b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.r = str;
        IronSourceUtils.saveDefaultEventsFormatterType(context, this.s, str);
        a(str);
    }

    public final void b(Map<String, String> map) {
        this.o.putAll(map);
    }

    public final void b(int[] iArr, Context context) {
        this.m = iArr;
        IronSourceUtils.saveDefaultOptInEvents(context, this.s, iArr);
    }

    void c() {
        synchronized (this.M) {
            this.d.a(this.e, this.s);
            this.e.clear();
        }
    }

    public final void c(int i) {
        if (i > 0) {
            this.H = i;
        }
    }

    public final void c(int[] iArr, Context context) {
        this.n = iArr;
        IronSourceUtils.saveDefaultTriggerEvents(context, this.s, iArr);
    }

    protected abstract boolean c(com.ironsource.mediationsdk.adunit.a.a aVar);

    protected abstract String d(int i);

    public final void d() {
        e();
    }

    public final void d(int[] iArr, Context context) {
        this.I = iArr;
        IronSourceUtils.saveDefaultNonConnectivityEvents(context, this.s, iArr);
    }

    protected abstract boolean d(com.ironsource.mediationsdk.adunit.a.a aVar);

    protected abstract int e(com.ironsource.mediationsdk.adunit.a.a aVar);

    protected boolean f(com.ironsource.mediationsdk.adunit.a.a aVar) {
        return (aVar.a() == 14 || aVar.a() == 114 || aVar.a() == 514 || aVar.a() == 140 || aVar.a() == 40 || aVar.a() == 41 || aVar.a() == 50 || aVar.a() == 51 || aVar.a() == 52) ? false : true;
    }

    protected boolean g(com.ironsource.mediationsdk.adunit.a.a aVar) {
        return (aVar.a() == 40 || aVar.a() == 41 || aVar.a() == 50 || aVar.a() == 51 || aVar.a() == 52) ? false : true;
    }
}
