package com.fyber.inneractive.sdk.config.a;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
/* loaded from: classes.dex */
public class a {
    private static final String c = a.class.getSimpleName();
    r a;
    public l b;
    private s d;

    public a(r rVar) {
        this.a = rVar;
    }

    public final void a(s sVar) {
        k kVar;
        this.d = sVar;
        for (com.fyber.inneractive.sdk.config.a.a.d dVar : sVar.b.values()) {
            l lVar = this.b;
            if (dVar != null && lVar != null) {
                q qVar = lVar.a.get(dVar.a);
                if (qVar != null) {
                    dVar.a(qVar.b());
                    IAlog.b("%s: Feature before variant merge: %s", c, dVar);
                    Map<String, b> map = qVar.b;
                    for (String str : map.keySet()) {
                        b bVar = map.get(str);
                        if (dVar != null && bVar != null && !a(dVar, bVar)) {
                            if (bVar != null) {
                                List<k> list = bVar.c;
                                int a = a();
                                IAlog.b("%s: selectVariant for experiment '%s' generated random number: %d", c, bVar.a, Integer.valueOf(a));
                                Iterator<k> it = list.iterator();
                                int i = 0;
                                while (it.hasNext()) {
                                    kVar = it.next();
                                    i += kVar.b;
                                    IAlog.b("%s: selectVariant variant found: %s", c, kVar);
                                    if (i >= a) {
                                        break;
                                    }
                                    IAlog.b("%s: selectVariant variant '%s' percentage outside selected range", c, kVar.a);
                                }
                            }
                            kVar = null;
                            if (kVar != null) {
                                IAlog.b("%s: experiment '%s' variant selected! %s", c, bVar.a, kVar);
                            } else {
                                IAlog.b("%s: experiment '%s' no variant was selected! using control group", c, bVar.a);
                            }
                            dVar.b.add(bVar);
                            if (kVar != null) {
                                dVar.d.put(bVar.a, kVar);
                            }
                        }
                    }
                }
                IAlog.b("%s: Feature after variant merge: %s", c, dVar);
            }
        }
    }

    private boolean a(com.fyber.inneractive.sdk.config.a.a.d dVar, b bVar) {
        e eVar;
        int a = a();
        if (bVar.b < a) {
            IAlog.b("%s: Experiment '%s' filtered! rand: %d, with perc: %d", c, bVar.a, Integer.valueOf(a), Integer.valueOf(bVar.b));
            return true;
        }
        List<d> list = bVar.d;
        if (list != null) {
            for (d dVar2 : list) {
                try {
                    Long valueOf = Long.valueOf(IAConfigManager.k());
                    eVar = new e();
                    eVar.b = valueOf;
                    eVar.c = com.fyber.inneractive.sdk.l.a.a(this.d.a);
                } catch (NumberFormatException unused) {
                    IAlog.b("%s: invalid publisherId", c);
                }
                if (dVar2.a(eVar)) {
                    IAlog.b("%s: Experiment '%s' filtered! with %s", c, bVar.a, dVar2);
                    return true;
                }
                continue;
            }
        }
        if (dVar instanceof com.fyber.inneractive.sdk.config.a.a.f) {
            for (k kVar : bVar.c) {
                if (kVar.a("use_fmp_cache_mechanism") && !IAConfigManager.a(r.b.Video, "vid_cache")) {
                    return true;
                }
            }
        }
        IAlog.b("%s: Experiment '%s' NOT filtered! rand: %d, with perc: %d", c, bVar.a, Integer.valueOf(a), Integer.valueOf(bVar.b));
        return false;
    }

    private static int a() {
        return new Random().nextInt(100) + 1;
    }
}
