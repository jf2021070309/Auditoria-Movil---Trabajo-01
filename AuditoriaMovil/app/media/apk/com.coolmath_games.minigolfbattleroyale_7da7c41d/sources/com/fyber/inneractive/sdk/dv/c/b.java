package com.fyber.inneractive.sdk.dv.c;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.dv.g;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.h.n;
import com.fyber.inneractive.sdk.j.e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.m;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class b extends a<QueryInfo> {
    final HashMap<AdFormat, QueryInfo> a = new HashMap<>();
    boolean b = false;
    final Object c = new Object();
    int d = 0;

    private void a(final AdFormat adFormat) {
        m.a(new Runnable() { // from class: com.fyber.inneractive.sdk.dv.c.b.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    QueryInfo.generate(l.p(), adFormat, new AdRequest.Builder().build(), new QueryInfoGenerationCallback() { // from class: com.fyber.inneractive.sdk.dv.c.b.1.1
                        @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
                        public final void onSuccess(QueryInfo queryInfo) {
                            IAlog.b("DVHanlder - %s - put query: %s", adFormat.toString(), queryInfo.getQuery());
                            synchronized (b.this.c) {
                                b.this.d++;
                                b.this.a.put(adFormat, queryInfo);
                            }
                        }

                        @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
                        public final void onFailure(String str) {
                            if (b.this.b) {
                                return;
                            }
                            b bVar = b.this;
                            AdFormat adFormat2 = adFormat;
                            IAlog.b(String.format("Firing Event 1000 - Fetch error DV - msg  %s", str), new Object[0]);
                            new n.a(com.fyber.inneractive.sdk.h.l.FETCH_TOKEN_DV_ERROR, (InneractiveAdRequest) null, (e) null).a(new n.b().a("message", str).a("version", b.b()).a("adFormat", adFormat2.name()).a("success_count", Integer.valueOf(bVar.d))).b(null);
                            b.this.b = true;
                        }
                    });
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.c.b$2  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[UnitDisplayType.values().length];
            a = iArr;
            try {
                iArr[UnitDisplayType.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[UnitDisplayType.MRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[UnitDisplayType.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String b() {
        try {
            return MobileAds.getVersionString();
        } catch (Exception unused) {
            return "na";
        }
    }

    public static void a(String str, com.fyber.inneractive.sdk.dv.b.a aVar, InneractiveAdRequest inneractiveAdRequest, e eVar, String str2) {
        IAlog.b(String.format("Firing Event 1001 -Phase - %s  Fetch error DV - msg  %s", aVar.name(), str2), new Object[0]);
        new n.a(com.fyber.inneractive.sdk.h.l.DV_ERROR_PHASE, inneractiveAdRequest, eVar).a(new n.b().a("spot_id", str).a("phase", aVar.name().toLowerCase()).a("version", b()).a("message", str2)).b(null);
    }

    @Override // com.fyber.inneractive.sdk.dv.c.a
    public final void a() {
        AdFormat[] values;
        for (AdFormat adFormat : AdFormat.values()) {
            if (adFormat != AdFormat.NATIVE) {
                a(adFormat);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.dv.c.a
    public final g a(UnitDisplayType unitDisplayType) {
        AdFormat adFormat;
        g gVar;
        int i = AnonymousClass2.a[unitDisplayType.ordinal()];
        if (i == 1 || i == 2) {
            adFormat = AdFormat.BANNER;
        } else if (i == 3) {
            adFormat = AdFormat.REWARDED;
        } else {
            adFormat = AdFormat.INTERSTITIAL;
        }
        QueryInfo queryInfo = this.a.get(adFormat);
        if (queryInfo != null) {
            synchronized (this.c) {
                this.a.remove(adFormat);
            }
            gVar = new g(queryInfo);
        } else {
            gVar = null;
        }
        IAlog.b("DVHanlder - get query: %s", gVar);
        a(adFormat);
        return gVar;
    }
}
