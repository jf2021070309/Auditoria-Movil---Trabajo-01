package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10;

import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.l;
import com.bytedance.msdk.adapter.util.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c {
    private boolean A;
    private boolean B;
    private int C;
    private double D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.i K;
    private bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.g L;
    private int M;
    private JSONObject N;
    private int O;
    private String a;
    private int b;
    private int c;
    private long d;
    private long e;
    private long f;
    private long g;
    private String h;
    private int o;
    private int p;
    private long q;
    private int r;
    private String s;
    private String t;
    private int u;
    private int v;
    private int w;
    private String x;
    private int y;
    private long z;
    private List<k> i = new CopyOnWriteArrayList();
    private Map<Integer, List<k>> j = new HashMap();
    private Map<Integer, List<k>> k = new HashMap();
    private List<Integer> l = new ArrayList();
    private double m = -1.0d;
    private double n = -1.0d;
    private Map<String, Object> P = new HashMap();

    /* JADX WARN: Can't wrap try/catch for region: R(8:(12:26|27|(1:29)(1:84)|30|(5:32|(1:34)|35|(1:37)(1:39)|38)|40|41|42|43|44|45|46)|(6:58|59|(2:76|77)(3:61|62|(2:64|(4:66|(1:75)|70|(1:74))))|51|53|54)(1:48)|49|50|51|53|54|24) */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0429, code lost:
        r0 = e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c b(org.json.JSONObject r30) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c.b(org.json.JSONObject):bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c");
    }

    private static Map<String, String> c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            Iterator<String> keys = jSONObject.keys();
            if (keys == null) {
                return null;
            }
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = jSONObject.optString(next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString)) {
                    hashMap.put(next, optString);
                }
            }
            if (hashMap.size() == 0) {
                return null;
            }
            return hashMap;
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0013 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L28
            r0 = 95
            r7 = r0
        L5:
            r1 = 84
            r2 = 83
        L9:
            switch(r1) {
                case 84: goto Ld;
                case 85: goto L13;
                case 86: goto L21;
                default: goto Lc;
            }
        Lc:
            goto L5
        Ld:
            switch(r2) {
                case 82: goto L6e;
                case 83: goto L21;
                case 84: goto L11;
                default: goto L10;
            }
        L10:
            goto L13
        L11:
            goto L11
        L13:
            switch(r2) {
                case 94: goto L6e;
                case 95: goto L21;
                case 96: goto L18;
                default: goto L16;
            }
        L16:
            r2 = r0
            goto L13
        L18:
            r1 = 41
            if (r7 == r1) goto L18
            r1 = 42
            if (r7 == r1) goto L21
            goto L6e
        L21:
            r1 = 85
            r2 = 96
            r7 = 40
            goto L9
        L28:
            java.util.Map<java.lang.Integer, java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k>> r0 = r6.k
            r0.clear()
            r0 = 0
            r1 = -1000(0xfffffffffffffc18, float:NaN)
        L30:
            int r2 = r7.size()
            if (r0 >= r2) goto L6e
            java.lang.Object r2 = r7.get(r0)
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k r2 = (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) r2
            if (r2 == 0) goto L6b
            int r3 = r2.p()
            if (r3 == r1) goto L51
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r2.p()
            r5 = r3
            r3 = r1
            r1 = r5
            goto L5d
        L51:
            java.util.Map<java.lang.Integer, java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k>> r3 = r6.k
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r3.get(r4)
            java.util.List r3 = (java.util.List) r3
        L5d:
            if (r3 == 0) goto L6b
            r3.add(r2)
            java.util.Map<java.lang.Integer, java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k>> r2 = r6.k
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r2.put(r4, r3)
        L6b:
            int r0 = r0 + 1
            goto L30
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c.c(java.util.List):void");
    }

    public static c g(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.d("AdsenseRitConfig", "TMe jsonStr is null or empty");
        } else {
            try {
                return b(new JSONObject(str));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private static Long o(int i) {
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 5) {
                    if (i != 7) {
                    }
                }
            }
            return 0L;
        }
        return 1000L;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002b A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0020 -> B:18:0x0024). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0028 -> B:25:0x0033). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0031 -> B:25:0x0033). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Long p(int r5) {
        /*
        L0:
            r0 = 1
            r1 = 10000(0x2710, double:4.9407E-320)
            if (r5 == r0) goto L39
            r0 = 2
            if (r5 == r0) goto L39
            r0 = 3
            r3 = 95
            if (r5 == r0) goto L20
            r0 = 5
            if (r5 == r0) goto L39
            r0 = 7
            if (r5 == r0) goto L18
            r0 = 8
            if (r5 == r0) goto L18
            goto L33
        L18:
            r0 = 600000(0x927c0, double:2.964394E-318)
        L1b:
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            goto L3d
        L20:
            r0 = 94
            r4 = 125(0x7d, float:1.75E-43)
        L24:
            switch(r0) {
                case 94: goto L2f;
                case 95: goto L28;
                case 96: goto L2b;
                default: goto L27;
            }
        L27:
            goto L20
        L28:
            switch(r4) {
                case 94: goto L33;
                case 95: goto L39;
                case 96: goto L33;
                default: goto L2b;
            }
        L2b:
            switch(r4) {
                case 55: goto L0;
                case 56: goto L20;
                case 57: goto L0;
                default: goto L2e;
            }
        L2e:
            goto L36
        L2f:
            r0 = 39
            if (r4 != r0) goto L36
        L33:
            r0 = r3
            r4 = r0
            goto L24
        L36:
            r0 = 5000(0x1388, double:2.4703E-320)
            goto L1b
        L39:
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
        L3d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c.p(int):java.lang.Long");
    }

    public int A() {
        int i = this.E;
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                if (c == '\\') {
                    switch (c2) {
                        case 22:
                        case 23:
                            c = ']';
                            c2 = ']';
                    }
                } else if (c != ']') {
                    c = ']';
                    c2 = ']';
                }
            }
            while (true) {
                switch (c2) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return i;
    }

    public long B() {
        long j = this.f;
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                if (c == '\\') {
                    switch (c2) {
                        case 22:
                        case 23:
                            c = ']';
                            c2 = ']';
                    }
                } else if (c != ']') {
                    c = ']';
                    c2 = ']';
                }
            }
            while (true) {
                switch (c2) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return j;
    }

    public int C() {
        int i = this.p;
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c2) {
                    case '\\':
                        switch (c) {
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case ']':
                        while (true) {
                            switch (c) {
                                case '[':
                                case ']':
                                    break;
                                case '\\':
                                    break;
                                default:
                                    c = '[';
                            }
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case '^':
                        if (c <= 4) {
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        return i;
    }

    public String D() {
        return this.h;
    }

    public Map<Integer, List<k>> E() {
        HashMap hashMap = new HashMap();
        Map<Integer, List<k>> map = this.j;
        if (map != null) {
            for (Map.Entry<Integer, List<k>> entry : map.entrySet()) {
                hashMap.put(Integer.valueOf(entry.getKey().intValue()), new ArrayList(entry.getValue()));
            }
        }
        return hashMap;
    }

    public List<k> F() {
        return this.i;
    }

    public String G() {
        return this.t;
    }

    public String H() {
        return this.x;
    }

    public long I() {
        long j = this.q;
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                if (c == '\\') {
                    switch (c2) {
                        case 22:
                        case 23:
                            c = ']';
                            c2 = ']';
                    }
                } else if (c != ']') {
                    c = ']';
                    c2 = ']';
                }
            }
            while (true) {
                switch (c2) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return j;
    }

    public boolean J() {
        boolean z = this.B;
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                if (c == '\\') {
                    switch (c2) {
                        case 22:
                        case 23:
                            c = ']';
                            c2 = ']';
                    }
                } else if (c != ']') {
                    c = ']';
                    c2 = ']';
                }
            }
            while (true) {
                switch (c2) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return z;
    }

    public boolean K() {
        boolean z = this.A;
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                if (c == '\\') {
                    switch (c2) {
                        case 22:
                        case 23:
                            c = ']';
                            c2 = ']';
                    }
                } else if (c != ']') {
                    c = ']';
                    c2 = ']';
                }
            }
            while (true) {
                switch (c2) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return z;
    }

    public boolean L() {
        return this.J == 1;
    }

    public boolean M() {
        return this.M == 1;
    }

    public boolean N() {
        return this.G == 3;
    }

    public c a() {
        List<String> b = l.b();
        c cVar = new c();
        cVar.a = this.a;
        l.b(b, "mRitId");
        cVar.b = this.b;
        l.b(b, "mRitType");
        cVar.c = this.c;
        l.b(b, "mLookType");
        cVar.d = this.d;
        l.b(b, "mMinWaitTime");
        cVar.e = this.e;
        l.b(b, "mLayerTimeOut");
        cVar.f = this.f;
        l.b(b, "mTotalTimeOut");
        cVar.g = this.g;
        l.b(b, "mCacheTimeOut");
        cVar.h = this.h;
        l.b(b, "mVersion");
        cVar.q = this.q;
        l.b(b, "mWaterFallId");
        cVar.w = this.w;
        l.b(b, "reqType");
        cVar.t = this.t;
        l.b(b, "mWaterfallAbTestParam");
        cVar.r = this.r;
        l.b(b, "segmentId");
        cVar.s = this.s;
        l.b(b, "segmentVersion");
        cVar.u = this.u;
        l.b(b, "preLoadSortControl");
        cVar.v = this.v;
        l.b(b, "preShowSortControl");
        cVar.x = this.x;
        l.b(b, "waterfallExtra");
        cVar.y = this.y;
        l.b(b, "mMultilevelAfterP");
        cVar.z = this.z;
        l.b(b, "mMultilevelTimeOut");
        cVar.C = this.C;
        l.b(b, "mRefreshTime");
        cVar.D = this.D;
        l.b(b, "mBidFloor");
        cVar.G = this.G;
        l.b(b, "mParallelType");
        cVar.H = this.H;
        l.b(b, "mReqParallelNum");
        cVar.I = this.I;
        l.b(b, "mAdCount");
        cVar.E = this.E;
        l.b(b, "serverSideVerifyPreRequestTime");
        cVar.F = this.F;
        l.b(b, "serverSideRewardType");
        cVar.M = this.M;
        l.b(b, "mAdPrime");
        cVar.L = this.L;
        l.b(b, "mIntervalFreqctlBean");
        cVar.K = this.K;
        l.b(b, "mIntervalPacingBean");
        cVar.J = this.J;
        l.b(b, "mWaterFallTimingMode");
        cVar.P = new HashMap(this.P);
        cVar.O = this.O;
        cVar.n = this.n;
        cVar.k = new HashMap(this.k);
        l.a(b, "AdsenseRitConfig");
        return cVar;
    }

    public k a(String str) {
        List<k> list;
        if (TextUtils.isEmpty(str) || (list = this.i) == null || list.size() == 0) {
            return null;
        }
        for (k kVar : this.i) {
            if (str.equals(kVar.d())) {
                return kVar;
            }
        }
        return null;
    }

    public void a(double d) {
        this.D = d;
    }

    public void a(int i) {
        this.I = i;
    }

    public void a(long j) {
        this.g = j;
    }

    public void a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.g gVar) {
        this.L = gVar;
    }

    public void a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.i iVar) {
        this.K = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> r7) {
        /*
            r6 = this;
            r6.c(r7)
            r6.i = r7
            if (r7 != 0) goto L9
            goto L90
        L9:
            r0 = 0
            r6.o = r0
            java.util.Map<java.lang.Integer, java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k>> r1 = r6.j
            r1.clear()
            java.util.List<java.lang.Integer> r1 = r6.l
            r1.clear()
            java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> r1 = r6.i
            int r1 = r1.size()
            r6.p = r1
            r1 = -1000(0xfffffffffffffc18, float:NaN)
        L20:
            java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> r2 = r6.i
            int r2 = r2.size()
            if (r0 >= r2) goto L85
            java.lang.Object r2 = r7.get(r0)
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k r2 = (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) r2
            if (r2 == 0) goto L82
            int r3 = r2.f()
            r4 = 100
            if (r3 == r4) goto L62
            int r3 = r2.f()
            if (r3 != 0) goto L3f
            goto L62
        L3f:
            int r3 = r2.p()
            if (r3 == r1) goto L55
            int r1 = r6.o
            int r1 = r1 + 1
            r6.o = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r2.p()
            goto L71
        L55:
            java.util.Map<java.lang.Integer, java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k>> r3 = r6.j
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r3.get(r4)
            java.util.List r3 = (java.util.List) r3
            goto L74
        L62:
            int r1 = r6.o
            int r1 = r1 + 1
            r6.o = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r2.y()
        L71:
            r5 = r3
            r3 = r1
            r1 = r5
        L74:
            if (r3 == 0) goto L82
            r3.add(r2)
            java.util.Map<java.lang.Integer, java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k>> r2 = r6.j
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r2.put(r4, r3)
        L82:
            int r0 = r0 + 1
            goto L20
        L85:
            java.util.List<java.lang.Integer> r7 = r6.l
            java.util.Map<java.lang.Integer, java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k>> r0 = r6.j
            java.util.Set r0 = r0.keySet()
            r7.addAll(r0)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c.a(java.util.List):void");
    }

    public void a(JSONObject jSONObject) {
        this.N = jSONObject;
    }

    public void a(boolean z) {
        this.B = z;
    }

    public int b() {
        int i = this.I;
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c2) {
                    case '\\':
                        switch (c) {
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case ']':
                        while (true) {
                            switch (c) {
                                case '[':
                                case ']':
                                    break;
                                case '\\':
                                    break;
                                default:
                                    c = '[';
                            }
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case '^':
                        if (c <= 4) {
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        return i;
    }

    public void b(double d) {
        this.m = d;
    }

    public void b(int i) {
        this.M = i;
    }

    public void b(long j) {
        this.e = j;
    }

    public void b(String str) {
        this.a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080 A[PHI: r0 
      PHI: (r0v7 char) = (r0v6 char), (r0v8 char) binds: [B:19:0x0077, B:4:0x0007] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0073 -> B:19:0x0077). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0077 -> B:24:0x0080). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> r7) {
        /*
            r6 = this;
            r6.c(r7)
            r6.i = r7
            if (r7 != 0) goto Lb
            r7 = 3
            r0 = r7
            goto L80
        Lb:
            r0 = 0
            r6.o = r0
            java.util.Map<java.lang.Integer, java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k>> r1 = r6.j
            r1.clear()
            java.util.List<java.lang.Integer> r1 = r6.l
            r1.clear()
            java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> r1 = r6.i
            int r1 = r1.size()
            r6.p = r1
            r1 = -1000(0xfffffffffffffc18, float:NaN)
        L22:
            java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> r2 = r6.i
            int r2 = r2.size()
            if (r0 >= r2) goto L68
            java.lang.Object r2 = r7.get(r0)
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k r2 = (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) r2
            if (r2 == 0) goto L65
            int r3 = r2.p()
            if (r3 == r1) goto L4b
            int r1 = r6.o
            int r1 = r1 + 1
            r6.o = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r2.p()
            r5 = r3
            r3 = r1
            r1 = r5
            goto L57
        L4b:
            java.util.Map<java.lang.Integer, java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k>> r3 = r6.j
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r3.get(r4)
            java.util.List r3 = (java.util.List) r3
        L57:
            if (r3 == 0) goto L65
            r3.add(r2)
            java.util.Map<java.lang.Integer, java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k>> r2 = r6.j
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r2.put(r4, r3)
        L65:
            int r0 = r0 + 1
            goto L22
        L68:
            java.util.List<java.lang.Integer> r7 = r6.l
            java.util.Map<java.lang.Integer, java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k>> r0 = r6.j
            java.util.Set r0 = r0.keySet()
            r7.addAll(r0)
        L73:
            r7 = 8
            r0 = 47
        L77:
            switch(r7) {
                case 8: goto L7b;
                case 9: goto L7f;
                case 10: goto L7f;
                default: goto L7a;
            }
        L7a:
            goto L80
        L7b:
            r7 = 45
            if (r0 == r7) goto L73
        L7f:
            return
        L80:
            r7 = 10
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c.b(java.util.List):void");
    }

    public void b(boolean z) {
        this.A = z;
    }

    public double c() {
        double d = this.D;
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c2) {
                    case '\\':
                        switch (c) {
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case ']':
                        while (true) {
                            switch (c) {
                                case '[':
                                case ']':
                                    break;
                                case '\\':
                                    break;
                                default:
                                    c = '[';
                            }
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case '^':
                        if (c <= 4) {
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        return d;
    }

    public void c(double d) {
        this.n = d;
    }

    public void c(int i) {
        this.O = i;
    }

    public void c(long j) {
        this.d = j;
    }

    public void c(String str) {
        this.s = str;
    }

    /* renamed from: clone */
    public c m9clone() {
        c cVar = new c();
        cVar.a = this.a;
        cVar.b = this.b;
        cVar.c = this.c;
        cVar.d = this.d;
        cVar.e = this.e;
        cVar.f = this.f;
        cVar.g = this.g;
        cVar.h = this.h;
        cVar.q = this.q;
        cVar.w = this.w;
        cVar.t = this.t;
        cVar.r = this.r;
        cVar.s = this.s;
        cVar.u = this.u;
        cVar.v = this.v;
        cVar.x = this.x;
        cVar.y = this.y;
        cVar.z = this.z;
        cVar.C = this.C;
        cVar.D = this.D;
        cVar.G = this.G;
        cVar.H = this.H;
        cVar.I = this.I;
        cVar.E = this.E;
        cVar.F = this.F;
        cVar.M = this.M;
        cVar.L = this.L;
        cVar.K = this.K;
        cVar.J = this.J;
        cVar.A = this.A;
        cVar.B = this.B;
        cVar.N = this.N;
        cVar.m = this.m;
        cVar.p = this.p;
        cVar.i = new CopyOnWriteArrayList(this.i);
        cVar.j = new HashMap(this.j);
        cVar.o = this.o;
        cVar.l = new ArrayList(this.l);
        cVar.P = new HashMap(this.P);
        cVar.k = new HashMap(this.k);
        cVar.O = this.O;
        cVar.n = this.n;
        return cVar;
    }

    public long d() {
        long j = this.g;
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c2) {
                    case '\\':
                        switch (c) {
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case ']':
                        while (true) {
                            switch (c) {
                                case '[':
                                case ']':
                                    break;
                                case '\\':
                                    break;
                                default:
                                    c = '[';
                            }
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case '^':
                        if (c <= 4) {
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        return j;
    }

    public void d(int i) {
        this.c = i;
    }

    public void d(long j) {
        this.z = j;
    }

    public void d(String str) {
        this.h = str;
    }

    public Map<Integer, List<k>> e() {
        return this.k;
    }

    public void e(int i) {
        this.y = i;
    }

    public void e(long j) {
        this.f = j;
    }

    public void e(String str) {
        this.t = str;
    }

    public double f() {
        double d = this.m;
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                if (c == '\\') {
                    switch (c2) {
                        case 22:
                        case 23:
                            c = ']';
                            c2 = ']';
                    }
                } else if (c != ']') {
                    c = ']';
                    c2 = ']';
                }
            }
            while (true) {
                switch (c2) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return d;
    }

    public void f(int i) {
        this.G = i;
    }

    public void f(long j) {
        this.q = j;
    }

    public void f(String str) {
        this.x = str;
    }

    public double g() {
        double d = this.n;
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                if (c == '\\') {
                    switch (c2) {
                        case 22:
                        case 23:
                            c = ']';
                            c2 = ']';
                    }
                } else if (c != ']') {
                    c = ']';
                    c2 = ']';
                }
            }
            while (true) {
                switch (c2) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return d;
    }

    public void g(int i) {
        this.C = i;
    }

    public Map<String, Object> h() {
        return this.P;
    }

    public void h(int i) {
        this.H = i;
    }

    public int i() {
        int i = this.O;
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c2) {
                    case '\\':
                        switch (c) {
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case ']':
                        while (true) {
                            switch (c) {
                                case '[':
                                case ']':
                                    break;
                                case '\\':
                                    break;
                                default:
                                    c = '[';
                            }
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case '^':
                        if (c <= 4) {
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        return i;
    }

    public void i(int i) {
        this.w = i;
    }

    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.g j() {
        return this.L;
    }

    public void j(int i) {
        this.b = i;
    }

    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.i k() {
        return this.K;
    }

    public void k(int i) {
        this.r = i;
    }

    public long l() {
        long j = this.e;
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                if (c == '\\') {
                    switch (c2) {
                        case 22:
                        case 23:
                            c = ']';
                            c2 = ']';
                    }
                } else if (c != ']') {
                    c = ']';
                    c2 = ']';
                }
            }
            while (true) {
                switch (c2) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return j;
    }

    public void l(int i) {
        this.F = i;
    }

    public List<Integer> m() {
        return this.l;
    }

    public void m(int i) {
        this.E = i;
    }

    public long n() {
        long j = this.d;
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                if (c == '\\') {
                    switch (c2) {
                        case 22:
                        case 23:
                            c = ']';
                            c2 = ']';
                    }
                } else if (c != ']') {
                    c = ']';
                    c2 = ']';
                }
            }
            while (true) {
                switch (c2) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return j;
    }

    public void n(int i) {
        this.J = i;
    }

    public int o() {
        int i = this.y;
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                if (c == '\\') {
                    switch (c2) {
                        case 22:
                        case 23:
                            c = ']';
                            c2 = ']';
                    }
                } else if (c != ']') {
                    c = ']';
                    c2 = ']';
                }
            }
            while (true) {
                switch (c2) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return i;
    }

    public long p() {
        long j = this.z;
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c2) {
                    case '\\':
                        switch (c) {
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case ']':
                        while (true) {
                            switch (c) {
                                case '[':
                                case ']':
                                    break;
                                case '\\':
                                    break;
                                default:
                                    c = '[';
                            }
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case '^':
                        if (c <= 4) {
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        return j;
    }

    public int q() {
        int i = this.G;
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                if (c == '\\') {
                    switch (c2) {
                        case 22:
                        case 23:
                            c = ']';
                            c2 = ']';
                    }
                } else if (c != ']') {
                    c = ']';
                    c2 = ']';
                }
            }
            while (true) {
                switch (c2) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return i;
    }

    public int r() {
        if (i() == 2) {
            int a = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.d.a(this.a, 1, h());
            if (this.C != 0 && a != 0) {
                return a;
            }
        }
        return this.C;
    }

    public int s() {
        int i = this.H;
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                if (c == '\\') {
                    switch (c2) {
                        case 22:
                        case 23:
                            c = ']';
                            c2 = ']';
                    }
                } else if (c != ']') {
                    c = ']';
                    c2 = ']';
                }
            }
            while (true) {
                switch (c2) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return i;
    }

    public int t() {
        int i = this.w;
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c2) {
                    case '\\':
                        switch (c) {
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case ']':
                        while (true) {
                            switch (c) {
                                case '[':
                                case ']':
                                    break;
                                case '\\':
                                    break;
                                default:
                                    c = '[';
                            }
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case '^':
                        if (c <= 4) {
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        return i;
    }

    public String toString() {
        char c;
        while (true) {
            while (c != 18) {
                c = c != 20 ? (char) 18 : (char) 19;
            }
            return "AdsenseRitConfig{mRitId='" + this.a + "', mRitType=" + this.b + ", mLookType=" + this.c + ", mMinWaitTime=" + this.d + ", mLayerTimeOut=" + this.e + ", mTotalTimeOut=" + this.f + ", mWaterFallConfigList=" + this.i + ", mWaterFallConfMap=" + this.j + ", mLoadSortLevelList=" + this.l + ", mCurrentCommonAdMaxCpm=" + this.m + ", mTotalLoadLevelCount=" + this.o + ", mTotalWaterFallCount=" + this.p + ", mWaterfallAbTestParam=" + this.t + ", mServerSideVerifyPreRequestTime=" + this.E + ", mServerSideVerifyRewardType=" + this.F + '}';
        }
    }

    public String u() {
        return this.a;
    }

    public JSONObject v() {
        return this.N;
    }

    public int w() {
        int i = this.b;
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c2) {
                    case '\\':
                        switch (c) {
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case ']':
                        while (true) {
                            switch (c) {
                                case '[':
                                case ']':
                                    break;
                                case '\\':
                                    break;
                                default:
                                    c = '[';
                            }
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case '^':
                        if (c <= 4) {
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        return i;
    }

    public int x() {
        int i = this.r;
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c2) {
                    case '\\':
                        switch (c) {
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case ']':
                        while (true) {
                            switch (c) {
                                case '[':
                                case ']':
                                    break;
                                case '\\':
                                    break;
                                default:
                                    c = '[';
                            }
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case '^':
                        if (c <= 4) {
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        return i;
    }

    public String y() {
        return this.s;
    }

    public int z() {
        int i = this.F;
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c2) {
                    case '\\':
                        switch (c) {
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case ']':
                        while (true) {
                            switch (c) {
                                case '[':
                                case ']':
                                    break;
                                case '\\':
                                    break;
                                default:
                                    c = '[';
                            }
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case '^':
                        if (c <= 4) {
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        return i;
    }
}
