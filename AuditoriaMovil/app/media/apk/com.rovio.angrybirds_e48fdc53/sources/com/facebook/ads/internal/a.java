package com.facebook.ads.internal;

import android.content.Context;
import android.os.Handler;
import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.ab;
import com.facebook.ads.internal.adapters.ac;
import com.facebook.ads.internal.o.c;
import com.facebook.ads.internal.o.g;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.d;
import com.facebook.ads.internal.protocol.f;
import com.facebook.ads.internal.protocol.h;
import com.facebook.ads.internal.q.a.k;
import com.facebook.ads.internal.q.a.n;
import com.facebook.ads.internal.q.a.w;
import com.facebook.share.internal.ShareConstants;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes2.dex */
public class a implements c.a {
    private final Context a;
    private final String b;
    private final c c;
    private final f d;
    private final d e;
    private final AdSize f;
    private final int g;
    private boolean h;
    private final Handler i;
    private final Runnable j;
    private final com.facebook.ads.internal.m.c k;
    private InterfaceC0107a l;
    private com.facebook.ads.internal.h.c m;

    /* renamed from: com.facebook.ads.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0107a {
        void a(com.facebook.ads.internal.protocol.a aVar);

        void a(List<ab> list);
    }

    /* loaded from: classes2.dex */
    private static final class b extends w<a> {
        public b(a aVar) {
            super(aVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            a a = a();
            if (a == null) {
                return;
            }
            if (com.facebook.ads.internal.q.e.a.a(a.a)) {
                a.a();
            } else {
                a.i.postDelayed(a.j, PushUIConfig.dismissTime);
            }
        }
    }

    static {
        com.facebook.ads.internal.q.a.d.a();
    }

    public a(Context context, String str, f fVar, AdSize adSize, d dVar, int i, EnumSet<NativeAd.MediaCacheFlag> enumSet) {
        this.a = context;
        this.b = str;
        this.d = fVar;
        this.f = adSize;
        this.e = dVar;
        this.g = i;
        this.c = new c(context);
        this.c.a(this);
        this.h = true;
        this.i = new Handler();
        this.j = new b(this);
        this.k = com.facebook.ads.internal.m.d.a(context);
        com.facebook.ads.internal.i.a.a(context).a();
    }

    private List<ab> d() {
        com.facebook.ads.internal.h.c cVar = this.m;
        com.facebook.ads.internal.h.a d = cVar.d();
        final ArrayList arrayList = new ArrayList(cVar.c());
        for (com.facebook.ads.internal.h.a aVar = d; aVar != null; aVar = cVar.d()) {
            AdAdapter a = com.facebook.ads.internal.adapters.f.a(aVar.a(), AdPlacementType.NATIVE);
            if (a != null && a.getPlacementType() == AdPlacementType.NATIVE) {
                HashMap hashMap = new HashMap();
                hashMap.put(ShareConstants.WEB_DIALOG_PARAM_DATA, aVar.b());
                hashMap.put("definition", cVar.a());
                ((ab) a).a(this.a, new ac() { // from class: com.facebook.ads.internal.a.1
                    @Override // com.facebook.ads.internal.adapters.ac
                    public void a(ab abVar) {
                        arrayList.add(abVar);
                    }

                    @Override // com.facebook.ads.internal.adapters.ac
                    public void a(ab abVar, com.facebook.ads.internal.protocol.a aVar2) {
                    }

                    @Override // com.facebook.ads.internal.adapters.ac
                    public void b(ab abVar) {
                    }

                    @Override // com.facebook.ads.internal.adapters.ac
                    public void c(ab abVar) {
                    }
                }, this.k, hashMap, NativeAd.getViewTraversalPredicate());
            }
        }
        return arrayList;
    }

    public void a() {
        try {
            this.c.a(new com.facebook.ads.internal.o.b(this.a, new com.facebook.ads.internal.i.c(this.a, false), this.b, this.f != null ? new k(this.f.getHeight(), this.f.getWidth()) : null, this.d, this.e, null, com.facebook.ads.internal.adapters.f.a(com.facebook.ads.internal.protocol.c.a(this.d).a()), this.g, AdSettings.isTestMode(this.a), AdSettings.isChildDirected(), new h(this.a, null, null, null), n.a(com.facebook.ads.internal.l.a.m(this.a))));
        } catch (com.facebook.ads.internal.protocol.b e) {
            a(com.facebook.ads.internal.protocol.a.a(e));
        }
    }

    public void a(InterfaceC0107a interfaceC0107a) {
        this.l = interfaceC0107a;
    }

    @Override // com.facebook.ads.internal.o.c.a
    public void a(g gVar) {
        com.facebook.ads.internal.h.c a = gVar.a();
        if (a == null) {
            throw new IllegalStateException("no placement in response");
        }
        if (this.h) {
            long c = a.a().c();
            if (c == 0) {
                c = 1800000;
            }
            this.i.postDelayed(this.j, c);
        }
        this.m = a;
        List<ab> d = d();
        if (this.l != null) {
            if (d.isEmpty()) {
                this.l.a(com.facebook.ads.internal.protocol.a.a(AdErrorType.NO_FILL, ""));
            } else {
                this.l.a(d);
            }
        }
    }

    @Override // com.facebook.ads.internal.o.c.a
    public void a(com.facebook.ads.internal.protocol.a aVar) {
        if (this.h) {
            this.i.postDelayed(this.j, 1800000L);
        }
        if (this.l != null) {
            this.l.a(aVar);
        }
    }

    public void b() {
    }

    public void c() {
        this.h = false;
        this.i.removeCallbacks(this.j);
    }
}
