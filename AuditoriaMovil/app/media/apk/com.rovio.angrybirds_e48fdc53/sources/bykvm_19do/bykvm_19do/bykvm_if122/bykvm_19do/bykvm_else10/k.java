package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10;

import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.l;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.msdk.adapter.util.Logger;
import com.facebook.appevents.AppEventsConstants;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class k implements Comparable<k> {
    private String a;
    private String b;
    private String c;
    private String d = "1";
    private String e = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    private int f;
    private int g;
    private int h;
    private int i;
    private String j;
    private String k;
    private String l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private i r;
    private Map<String, String> s;
    private int t;
    private String u;
    private int v;
    private bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.i w;
    private bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.g x;

    public String A() {
        return this.k;
    }

    public boolean B() {
        return this.f == 1;
    }

    public boolean C() {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().h(this.a);
    }

    public boolean D() {
        return this.v == 1;
    }

    public boolean E() {
        return this.f == 3;
    }

    public boolean F() {
        return this.f == 100;
    }

    public boolean G() {
        return this.f == 2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(k kVar) {
        if (kVar != null && this.g <= kVar.p()) {
            return this.g < kVar.p() ? -1 : 0;
        }
        return 1;
    }

    public void a(int i) {
        this.m = i;
    }

    public void a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.g gVar) {
        this.x = gVar;
    }

    public void a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.i iVar) {
        this.w = iVar;
    }

    public void a(i iVar) {
        this.r = iVar;
    }

    public void a(String str) {
        this.c = str;
    }

    public void a(Map<String, String> map) {
        this.s = map;
    }

    public boolean a() {
        int i = this.f;
        return i == 0 || i == 100;
    }

    public k b() {
        List<String> c = l.c();
        k kVar = new k();
        kVar.a = this.a;
        l.b(c, "mAdnetworkName");
        kVar.c = this.c;
        l.b(c, "mAdnetwokrSlotId");
        kVar.d = this.d;
        l.b(c, "mExchangeRate");
        kVar.e = this.e;
        l.b(c, "mEcpm");
        kVar.f = this.f;
        l.b(c, "mAdnetworkSlotType");
        kVar.g = this.g;
        l.b(c, "mLoadSort");
        kVar.h = this.h;
        l.b(c, "mShowSort");
        kVar.i = this.i;
        l.b(c, "mRitType");
        kVar.o = this.o;
        l.b(c, "originType");
        kVar.t = this.t;
        l.b(c, "mSubAdType");
        kVar.j = this.j;
        l.b(c, "mLoaderAdapterName");
        kVar.k = this.k;
        l.b(c, "mWaterfallAbTestParam");
        kVar.l = this.l;
        l.b(c, "mServerBiddingExtra");
        kVar.m = this.m;
        l.b(c, "adExpiredTime");
        kVar.n = this.n;
        l.b(c, "ifReuseAds");
        kVar.p = this.p;
        l.b(c, "ifPreRequest");
        kVar.q = this.q;
        l.b(c, "ifIsReady");
        kVar.b = this.b;
        l.b(c, "mCustomAdnetworkName");
        ConcurrentHashMap concurrentHashMap = null;
        Map<String, String> map = this.s;
        if (map != null && map.size() > 0) {
            concurrentHashMap = new ConcurrentHashMap();
            concurrentHashMap.putAll(this.s);
        }
        kVar.s = concurrentHashMap;
        l.b(c, "mMultilevelSlotCpm");
        kVar.u = this.u;
        l.b(c, "mCustomAdapterJson");
        kVar.v = this.v;
        l.b(c, "mAdnRitTimingMode");
        kVar.x = this.x;
        l.b(c, "mIntervalFreqctlBean");
        kVar.w = this.w;
        l.b(c, "mIntervalPacingBean");
        l.a(c, "WaterFallConfig");
        return kVar;
    }

    public void b(int i) {
        this.v = i;
    }

    public void b(String str) {
        this.a = str;
    }

    public int c() {
        int i = this.m;
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

    public void c(int i) {
        this.f = i;
    }

    public void c(String str) {
        this.u = str;
    }

    public String d() {
        return this.c;
    }

    public void d(int i) {
        this.q = i;
    }

    public void d(String str) {
        this.b = str;
    }

    public String e() {
        return this.a;
    }

    public void e(int i) {
        this.p = i;
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        this.e = str;
    }

    public int f() {
        int i = this.f;
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

    public void f(int i) {
        this.n = i;
    }

    public void f(String str) {
        this.d = str;
    }

    public String g() {
        return this.u;
    }

    public void g(int i) {
        this.g = i;
    }

    public void g(String str) {
        this.j = str;
    }

    public String h() {
        return this.b;
    }

    public void h(int i) {
        this.o = i;
    }

    public void h(String str) {
        this.l = str;
    }

    public double i() {
        try {
            return Double.valueOf(this.e).doubleValue() * Double.valueOf(this.d).doubleValue();
        } catch (Exception e) {
            Logger.e("WaterFallConfig", "getEcpm error " + e.toString());
            return PangleAdapterUtils.CPM_DEFLAUT_VALUE;
        }
    }

    public void i(int i) {
        this.i = i;
    }

    public void i(String str) {
        this.k = str;
    }

    public String j() {
        return this.d;
    }

    public void j(int i) {
        this.h = i;
    }

    public int k() {
        int i = this.q;
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

    public void k(int i) {
        this.t = i;
    }

    public int l() {
        int i = this.p;
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

    public int m() {
        int i = this.n;
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

    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.g n() {
        return this.x;
    }

    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.i o() {
        return this.w;
    }

    public int p() {
        int i = this.g;
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

    public String q() {
        return this.j;
    }

    public Map<String, String> r() {
        return this.s;
    }

    public int s() {
        int i = this.o;
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

    public int t() {
        int i = this.i;
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

    public String toString() {
        return "WaterFallConfig{mAdnetworkName='" + this.a + "', mCustomAdnetworkName='" + this.b + "', mAdnetwokrSlotId='" + this.c + "', mExchangeRate=" + this.d + ", mSlotEcpm=" + this.e + ", mAdnetworkSlotType=" + this.f + ", mLoadSort=" + this.g + ", mShowSort=" + this.h + '}';
    }

    public String u() {
        return this.l;
    }

    public double v() {
        i iVar = this.r;
        if (iVar != null && !TextUtils.isEmpty(iVar.f())) {
            try {
                return Double.valueOf(this.r.f()).doubleValue();
            } catch (Exception e) {
                Logger.e("WaterFallConfig", "getServerBiddingLoadEcpm error " + e.toString());
            }
        }
        return -1.0d;
    }

    public double w() {
        i iVar = this.r;
        if (iVar != null && !TextUtils.isEmpty(iVar.g())) {
            try {
                return Double.valueOf(this.r.g()).doubleValue();
            } catch (Exception e) {
                Logger.e("WaterFallConfig", "getServerBiddingShowEcpm error " + e.toString());
            }
        }
        return -1.0d;
    }

    public i x() {
        return this.r;
    }

    public int y() {
        int i = this.h;
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

    public int z() {
        int i = this.t;
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
}
