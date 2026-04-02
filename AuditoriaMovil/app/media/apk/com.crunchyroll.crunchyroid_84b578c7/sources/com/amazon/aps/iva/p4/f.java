package com.amazon.aps.iva.p4;

import android.content.Context;
import android.view.Window;
import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.h2.e;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.ob0.e;
import com.amazon.aps.iva.ob0.g;
import com.amazon.aps.iva.se0.h2;
import com.amazon.aps.iva.se0.i2;
import com.amazon.aps.iva.se0.l0;
import com.amazon.aps.iva.se0.o0;
import com.amazon.aps.iva.se0.v0;
import com.amazon.aps.iva.se0.w;
import com.amazon.aps.iva.yb0.h0;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.Channel;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.Movie;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: Button.kt */
/* loaded from: classes.dex */
public final class f implements com.amazon.aps.iva.zq.c {
    public static final e a = new e(new com.amazon.aps.iva.b5.e(R.color.glance_colorPrimary), new com.amazon.aps.iva.b5.e(R.color.glance_colorOnPrimary));
    public static com.amazon.aps.iva.xb0.l b;

    public static final com.amazon.aps.iva.ks.e c(com.amazon.aps.iva.hg.g gVar) {
        Episode episode;
        com.amazon.aps.iva.js.p pVar;
        String title;
        com.amazon.aps.iva.yb0.j.f(gVar, "toDownload");
        PlayableAsset playableAsset = (PlayableAsset) x.t0(gVar.d);
        boolean z = playableAsset instanceof Episode;
        String str = null;
        if (z) {
            episode = (Episode) playableAsset;
        } else {
            episode = null;
        }
        if (episode != null) {
            str = episode.getSeasonTitle();
        }
        String str2 = str;
        String name = new Channel(null, null, null, 7, null).getName();
        if (gVar.c != null) {
            pVar = com.amazon.aps.iva.js.p.SEASON;
        } else if (playableAsset instanceof Movie) {
            pVar = com.amazon.aps.iva.js.p.MOVIE;
        } else {
            pVar = com.amazon.aps.iva.js.p.SERIES;
        }
        com.amazon.aps.iva.js.p pVar2 = pVar;
        if (z) {
            title = ((Episode) playableAsset).getSeriesTitle();
        } else {
            title = playableAsset.getTitle();
        }
        return new com.amazon.aps.iva.ks.e(name, pVar2, gVar.c, "", title, str2, "", "", 256);
    }

    public static final q1 d(LiveData liveData, Object obj, com.amazon.aps.iva.o0.i iVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(liveData, "<this>");
        iVar.s(411178300);
        e0.b bVar = e0.a;
        com.amazon.aps.iva.i5.o oVar = (com.amazon.aps.iva.i5.o) iVar.i(androidx.compose.ui.platform.d.d);
        iVar.s(-492369756);
        Object t = iVar.t();
        if (t == i.a.a) {
            if (liveData.e != LiveData.k) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                obj = liveData.d();
            }
            t = com.amazon.aps.iva.cq.b.c0(obj);
            iVar.n(t);
        }
        iVar.G();
        q1 q1Var = (q1) t;
        x0.b(liveData, oVar, new com.amazon.aps.iva.w0.c(liveData, oVar, q1Var), iVar);
        iVar.G();
        return q1Var;
    }

    public static final Object e(i2 i2Var, e.d dVar) {
        o0 o0Var;
        Object wVar;
        Object h0;
        g.b bVar = i2Var.d.getContext().get(e.a.b);
        if (bVar instanceof o0) {
            o0Var = (o0) bVar;
        } else {
            o0Var = null;
        }
        if (o0Var == null) {
            o0Var = l0.a;
        }
        i2Var.s0(new v0(o0Var.h(i2Var.e, i2Var, i2Var.c)));
        boolean z = false;
        try {
            h0.e(2, dVar);
            wVar = dVar.invoke(i2Var, i2Var);
        } catch (Throwable th) {
            wVar = new w(th, false);
        }
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        if (wVar != aVar && (h0 = i2Var.h0(wVar)) != com.amazon.aps.iva.ab.t.e) {
            if (h0 instanceof w) {
                Throwable th2 = ((w) h0).a;
                if (!(((th2 instanceof h2) && ((h2) th2).b == i2Var) ? true : true)) {
                    if (wVar instanceof w) {
                        throw ((w) wVar).a;
                    }
                } else {
                    throw th2;
                }
            } else {
                wVar = com.amazon.aps.iva.ab.t.w(h0);
            }
            return wVar;
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.amazon.aps.iva.se0.i2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(long r7, com.amazon.aps.iva.h2.e.d r9, com.amazon.aps.iva.ob0.d r10) {
        /*
            boolean r0 = r10 instanceof com.amazon.aps.iva.se0.j2
            if (r0 == 0) goto L13
            r0 = r10
            com.amazon.aps.iva.se0.j2 r0 = (com.amazon.aps.iva.se0.j2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.se0.j2 r0 = new com.amazon.aps.iva.se0.j2
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            com.amazon.aps.iva.yb0.d0 r7 = r0.i
            com.amazon.aps.iva.ab.x.i0(r10)     // Catch: com.amazon.aps.iva.se0.h2 -> L2a
            goto L57
        L2a:
            r8 = move-exception
            goto L5b
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            com.amazon.aps.iva.ab.x.i0(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L3e
            return r3
        L3e:
            com.amazon.aps.iva.yb0.d0 r10 = new com.amazon.aps.iva.yb0.d0
            r10.<init>()
            r0.h = r9     // Catch: com.amazon.aps.iva.se0.h2 -> L58
            r0.i = r10     // Catch: com.amazon.aps.iva.se0.h2 -> L58
            r0.k = r4     // Catch: com.amazon.aps.iva.se0.h2 -> L58
            com.amazon.aps.iva.se0.i2 r2 = new com.amazon.aps.iva.se0.i2     // Catch: com.amazon.aps.iva.se0.h2 -> L58
            r2.<init>(r7, r0)     // Catch: com.amazon.aps.iva.se0.h2 -> L58
            r10.b = r2     // Catch: com.amazon.aps.iva.se0.h2 -> L58
            java.lang.Object r10 = e(r2, r9)     // Catch: com.amazon.aps.iva.se0.h2 -> L58
            if (r10 != r1) goto L57
            return r1
        L57:
            return r10
        L58:
            r7 = move-exception
            r8 = r7
            r7 = r10
        L5b:
            com.amazon.aps.iva.se0.j1 r9 = r8.b
            T r7 = r7.b
            if (r9 != r7) goto L62
            return r3
        L62:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.p4.f.f(long, com.amazon.aps.iva.h2.e$d, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.zq.c
    public void a(Context context, Window window) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.zq.c
    public void b(Context context, Window window) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
    }
}
