package com.kwad.sdk.core.report;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.sdk.service.ServiceProvider;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class i extends c<r, h> {
    private static volatile boolean PI = false;
    private static volatile i arb;
    private static v<r, h> arc;

    private i() {
    }

    private static i BX() {
        if (arb == null) {
            synchronized (i.class) {
                if (arb == null) {
                    arb = new i();
                }
            }
        }
        arb.checkInit();
        return arb;
    }

    private static boolean P(long j) {
        w wVar = (w) ServiceProvider.get(w.class);
        return wVar != null && wVar.P(j);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public static void a2(r rVar) {
        a(rVar, false);
    }

    public static void a(r rVar, boolean z) {
        BX().b(rVar, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.report.c
    /* renamed from: b */
    public h a(r rVar) {
        v<r, h> vVar = arc;
        return (h) (vVar != null ? vVar.Ch() : super.a((i) rVar));
    }

    private void b(final r rVar, boolean z) {
        if (rVar == null || !PI) {
            return;
        }
        if (z || P(rVar.arw)) {
            arb.b(new n<r>() { // from class: com.kwad.sdk.core.report.i.1
                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.kwad.sdk.core.report.n
                /* renamed from: BY */
                public r BT() {
                    return rVar.Cd();
                }
            });
        } else {
            arb.a(new n<r>() { // from class: com.kwad.sdk.core.report.i.2
                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.kwad.sdk.core.report.n
                /* renamed from: BY */
                public r BT() {
                    return rVar.Cd();
                }
            });
        }
    }

    private synchronized void checkInit() {
        if (PI) {
            return;
        }
        com.kwad.sdk.service.a.e eVar = (com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class);
        if (eVar == null) {
            return;
        }
        com.kwad.sdk.service.a.f fVar = (com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class);
        if (fVar == null) {
            return;
        }
        Context context = eVar.getContext();
        if (context == null) {
            return;
        }
        int au = fVar.au(context);
        i(context, au);
        x.init(context);
        x.Cj();
        com.kwad.sdk.core.e.c.d("BatchReporter", "cache type = " + au);
        if (au == 2) {
            a(u.bf(context));
        }
        PI = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.report.c
    /* renamed from: u */
    public h s(List<r> list) {
        v<r, h> vVar = arc;
        if (vVar != null) {
            return vVar.Ci();
        }
        String v = v(list);
        return !TextUtils.isEmpty(v) ? new h(v) : new h(list);
    }

    private static String v(List<r> list) {
        if (list.get(0) == null || TextUtils.isEmpty(list.get(0).asE)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(",\"actionList\":[");
        for (r rVar : list) {
            sb.append(rVar.asE);
            sb.append(',');
        }
        int length = sb.length();
        sb.replace(length - 1, length, "]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.sdk.core.report.c
    public final Runnable a(Context context, o<r> oVar, AtomicInteger atomicInteger) {
        aa<r, h> Cg;
        v<r, h> vVar = arc;
        return (vVar == null || (Cg = vVar.Cg()) == null) ? super.a(context, oVar, atomicInteger) : Cg;
    }
}
