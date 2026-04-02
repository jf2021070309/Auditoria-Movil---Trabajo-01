package com.amazon.aps.iva.aq;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.f0;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.u1;
import com.amazon.aps.iva.ee0.y;
import com.amazon.aps.iva.fe0.b;
import com.amazon.aps.iva.fe0.p;
import com.amazon.aps.iva.g1.w;
import com.amazon.aps.iva.he0.n;
import com.amazon.aps.iva.k9.c;
import com.amazon.aps.iva.k9.o;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.oe0.q;
import com.datadog.android.core.internal.data.upload.UploadWorker;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.watchlist.WatchlistPanel;
import com.google.ads.interactivemedia.v3.api.Ad;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: NoOpSystemInfoProvider.kt */
/* loaded from: classes2.dex */
public class k implements m, com.amazon.aps.iva.np.c {
    public static final w b = new w(0.31006f, 0.31616f);
    public static final w c = new w(0.34567f, 0.3585f);
    public static final w d = new w(0.32168f, 0.33767f);
    public static final w e = new w(0.31271f, 0.32902f);
    public static final float[] f = {0.964212f, 1.0f, 0.825188f};

    public static final void A(float[] fArr) {
        float f2;
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                if (i == i2) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                fArr[(i2 * 4) + i] = f2;
            }
        }
    }

    public static final void B(int i, int i2, Object[] objArr) {
        com.amazon.aps.iva.yb0.j.f(objArr, "<this>");
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final void C(ScheduledExecutorService scheduledExecutorService, String str, long j, TimeUnit timeUnit, Runnable runnable) {
        com.amazon.aps.iva.yb0.j.f(scheduledExecutorService, "<this>");
        com.amazon.aps.iva.yb0.j.f(timeUnit, "unit");
        com.amazon.aps.iva.yb0.j.f(runnable, "runnable");
        try {
            scheduledExecutorService.schedule(runnable, j, timeUnit);
        } catch (RejectedExecutionException e2) {
            com.amazon.aps.iva.iq.a aVar = com.amazon.aps.iva.dq.c.a;
            String format = String.format(Locale.US, "Unable to schedule %s task on the executor", Arrays.copyOf(new Object[]{str}, 1));
            com.amazon.aps.iva.yb0.j.e(format, "format(locale, this, *args)");
            l1.z(aVar, format, e2, 4);
        }
    }

    public static final void D(Field field, com.amazon.aps.iva.za0.c cVar, Object obj) {
        com.amazon.aps.iva.yb0.j.g(field, "receiver$0");
        try {
            field.set(cVar, obj);
        } catch (IllegalAccessException unused) {
        }
    }

    public static final int E(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (!z && !z5) {
            i = 0;
        } else {
            i = 1;
        }
        int i5 = i | 0;
        if (!z2 && !z6) {
            i2 = 0;
        } else {
            i2 = 2;
        }
        int i6 = i5 | i2;
        if (!z3 && !z5) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        return i6 | i3 | ((z4 || z6) ? 8 : 8);
    }

    public static final String F(com.amazon.aps.iva.oc0.e eVar, String str) {
        String k;
        com.amazon.aps.iva.yb0.j.f(eVar, "classDescriptor");
        com.amazon.aps.iva.yb0.j.f(str, "jvmDescriptor");
        String str2 = com.amazon.aps.iva.nc0.c.a;
        com.amazon.aps.iva.nd0.d i = com.amazon.aps.iva.ud0.b.g(eVar).i();
        com.amazon.aps.iva.yb0.j.e(i, "fqNameSafe.toUnsafe()");
        com.amazon.aps.iva.nd0.b g = com.amazon.aps.iva.nc0.c.g(i);
        if (g != null) {
            k = com.amazon.aps.iva.vd0.b.b(g).e();
            com.amazon.aps.iva.yb0.j.e(k, "byClassId(it).internalName");
        } else {
            k = t.k(eVar, t.b);
        }
        com.amazon.aps.iva.yb0.j.f(k, "internalName");
        return k + '.' + str;
    }

    public static final String G(Throwable th) {
        com.amazon.aps.iva.yb0.j.f(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        com.amazon.aps.iva.yb0.j.e(stringWriter2, "sw.toString()");
        return stringWriter2;
    }

    public static boolean H(n nVar, com.amazon.aps.iva.he0.i iVar, com.amazon.aps.iva.he0.i iVar2) {
        boolean z;
        boolean z2;
        if (nVar.m(iVar) == nVar.m(iVar2) && nVar.o(iVar) == nVar.o(iVar2)) {
            if (nVar.h(iVar) == null) {
                z = true;
            } else {
                z = false;
            }
            if (nVar.h(iVar2) == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z == z2 && nVar.w(nVar.i(iVar), nVar.i(iVar2))) {
                if (nVar.O(iVar, iVar2)) {
                    return true;
                }
                int m = nVar.m(iVar);
                for (int i = 0; i < m; i++) {
                    com.amazon.aps.iva.he0.k N = nVar.N(iVar, i);
                    com.amazon.aps.iva.he0.k N2 = nVar.N(iVar2, i);
                    if (nVar.g(N) != nVar.g(N2)) {
                        return false;
                    }
                    if (!nVar.g(N) && (nVar.e0(N) != nVar.e0(N2) || !I(nVar, nVar.g0(N), nVar.g0(N2)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean I(n nVar, com.amazon.aps.iva.he0.h hVar, com.amazon.aps.iva.he0.h hVar2) {
        if (hVar == hVar2) {
            return true;
        }
        m0 R = nVar.R(hVar);
        m0 R2 = nVar.R(hVar2);
        if (R != null && R2 != null) {
            return H(nVar, R, R2);
        }
        y n = nVar.n(hVar);
        y n2 = nVar.n(hVar2);
        if (n == null || n2 == null) {
            return false;
        }
        if (H(nVar, nVar.s(n), nVar.s(n2)) && H(nVar, nVar.U(n), nVar.U(n2))) {
            return true;
        }
        return false;
    }

    public static final com.amazon.aps.iva.kb0.j J(Object obj, Object obj2) {
        return new com.amazon.aps.iva.kb0.j(obj, obj2);
    }

    public static final com.amazon.aps.iva.nk.a K(Ad ad) {
        double maxDuration;
        if (ad != null) {
            if (ad.getAdPodInfo().getTotalAds() == 1) {
                maxDuration = ad.getDuration();
            } else {
                maxDuration = ad.getAdPodInfo().getMaxDuration();
            }
            double d2 = maxDuration;
            int adPosition = ad.getAdPodInfo().getAdPosition();
            int totalAds = ad.getAdPodInfo().getTotalAds();
            double duration = ad.getDuration();
            String adSystem = ad.getAdSystem();
            com.amazon.aps.iva.yb0.j.e(adSystem, "adSystem");
            return new com.amazon.aps.iva.nk.a(z.b, adPosition, totalAds, d2, duration, q.i0(adSystem, "trueX", true));
        }
        return null;
    }

    public static final String[] L(List list) {
        com.amazon.aps.iva.yb0.j.f(list, "<this>");
        List<PlayableAsset> list2 = list;
        ArrayList arrayList = new ArrayList(r.Y(list2));
        for (PlayableAsset playableAsset : list2) {
            arrayList.add(playableAsset.getId());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final Playhead M(com.amazon.aps.iva.ig.a aVar, PlayableAsset playableAsset) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(aVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        long c2 = aVar.c();
        String id = playableAsset.getId();
        if (com.amazon.aps.iva.gr.n.z(aVar.c()) > playableAsset.getDurationMs() * 0.9d) {
            z = true;
        } else {
            z = false;
        }
        return new Playhead(c2, z, aVar.b(), id);
    }

    public static final Map N(Map map) {
        com.amazon.aps.iva.yb0.j.f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        com.amazon.aps.iva.yb0.j.e(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    public static final com.amazon.aps.iva.b60.k O(WatchlistPanel watchlistPanel, String str) {
        com.amazon.aps.iva.yb0.j.f(watchlistPanel, "<this>");
        com.amazon.aps.iva.yb0.j.f(str, "adapterId");
        Panel panel = watchlistPanel.getPanel();
        if (panel != null) {
            return new com.amazon.aps.iva.b60.k(str, watchlistPanel.getPlayheadSec(), watchlistPanel.isFullyWatched(), watchlistPanel.isFavorite(), watchlistPanel.isNew(), watchlistPanel.getNeverWatched(), panel, null);
        }
        return null;
    }

    public static void P(float[] fArr, float f2, float f3) {
        float f4 = (fArr[8] * 0.0f) + (fArr[4] * f3) + (fArr[0] * f2) + fArr[12];
        float f5 = (fArr[9] * 0.0f) + (fArr[5] * f3) + (fArr[1] * f2) + fArr[13];
        float f6 = (fArr[10] * 0.0f) + (fArr[6] * f3) + (fArr[2] * f2) + fArr[14];
        float f7 = fArr[3] * f2;
        float f8 = fArr[11] * 0.0f;
        fArr[12] = f4;
        fArr[13] = f5;
        fArr[14] = f6;
        fArr[15] = f8 + (fArr[7] * f3) + f7 + fArr[15];
    }

    public static final void Q(Context context) {
        try {
            com.amazon.aps.iva.l9.k c2 = com.amazon.aps.iva.l9.k.c(context);
            com.amazon.aps.iva.yb0.j.e(c2, "getInstance(context)");
            c.a aVar = new c.a();
            aVar.a = com.amazon.aps.iva.k9.n.CONNECTED;
            com.amazon.aps.iva.k9.c cVar = new com.amazon.aps.iva.k9.c(aVar);
            o.a aVar2 = new o.a(UploadWorker.class);
            aVar2.b.j = cVar;
            aVar2.c.add("DatadogBackgroundUpload");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            aVar2.b.g = timeUnit.toMillis(5000L);
            if (Long.MAX_VALUE - System.currentTimeMillis() > aVar2.b.g) {
                o a = aVar2.a();
                com.amazon.aps.iva.yb0.j.e(a, "Builder(UploadWorker::cl…NDS)\n            .build()");
                c2.b(com.amazon.aps.iva.k9.f.REPLACE, Collections.singletonList(a));
                com.amazon.aps.iva.iq.a.b(com.amazon.aps.iva.dq.c.a, "UploadWorker was scheduled.");
                return;
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        } catch (Exception e2) {
            l1.z(com.amazon.aps.iva.dq.c.a, "Error while trying to setup the UploadWorker", e2, 4);
        }
    }

    public static final double R(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    public static final float e(long j) {
        return new BigDecimal(j / 1000.0d).setScale(3, RoundingMode.HALF_DOWN).floatValue();
    }

    public static final void f(Throwable th, Throwable th2) {
        com.amazon.aps.iva.yb0.j.f(th, "<this>");
        com.amazon.aps.iva.yb0.j.f(th2, "exception");
        if (th != th2) {
            com.amazon.aps.iva.sb0.b.a.a(th, th2);
        }
    }

    public static final void g(Appendable appendable, Object obj, com.amazon.aps.iva.xb0.l lVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(appendable, "<this>");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof CharSequence;
        }
        if (z) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }

    public static final Object[] h(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public static final com.amazon.aps.iva.pc0.h i(com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.pc0.h hVar2) {
        com.amazon.aps.iva.yb0.j.f(hVar, "first");
        com.amazon.aps.iva.yb0.j.f(hVar2, "second");
        if (hVar.isEmpty()) {
            return hVar2;
        }
        if (!hVar2.isEmpty()) {
            return new com.amazon.aps.iva.pc0.k(hVar, hVar2);
        }
        return hVar;
    }

    public static final com.amazon.aps.iva.he0.h j(com.amazon.aps.iva.he0.h hVar, HashSet hashSet) {
        com.amazon.aps.iva.he0.h j;
        boolean z;
        p pVar = p.a;
        c1 D = pVar.D(hVar);
        if (!hashSet.add(D)) {
            return null;
        }
        y0 x = b.a.x(D);
        if (x != null) {
            e0 u = b.a.u(x);
            j = j(u, hashSet);
            if (j == null) {
                return null;
            }
            if (!b.a.K(pVar.D(u)) && (!(u instanceof com.amazon.aps.iva.he0.i) || !b.a.Q((com.amazon.aps.iva.he0.i) u))) {
                z = false;
            } else {
                z = true;
            }
            if ((j instanceof com.amazon.aps.iva.he0.i) && b.a.Q((com.amazon.aps.iva.he0.i) j) && b.a.P(hVar) && z) {
                return pVar.n0(u);
            }
            if (!b.a.P(j) && pVar.m0(hVar)) {
                return pVar.n0(j);
            }
        } else if (b.a.K(D)) {
            m0 y = b.a.y(hVar);
            if (y == null || (j = j(y, hashSet)) == null) {
                return null;
            }
            if (b.a.P(hVar)) {
                if (!b.a.P(j)) {
                    if (!(j instanceof com.amazon.aps.iva.he0.i) || !b.a.Q((com.amazon.aps.iva.he0.i) j)) {
                        return pVar.n0(j);
                    }
                    return hVar;
                }
                return hVar;
            }
        } else {
            return hVar;
        }
        return j;
    }

    public static float[] k() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final int l(com.amazon.aps.iva.h2.y yVar, int i) {
        boolean z;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(yVar, "fontWeight");
        if (yVar.compareTo(com.amazon.aps.iva.h2.y.e) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        if (!z2) {
            return 0;
        }
        return 2;
    }

    public static final int m(com.amazon.aps.iva.jc0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
        return fVar.a().size();
    }

    public static final com.amazon.aps.iva.rv.e n(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "<this>");
        return new com.amazon.aps.iva.rv.e(context);
    }

    public static final com.amazon.aps.iva.se0.n o(com.amazon.aps.iva.ob0.d dVar) {
        if (!(dVar instanceof com.amazon.aps.iva.xe0.e)) {
            return new com.amazon.aps.iva.se0.n(1, dVar);
        }
        com.amazon.aps.iva.se0.n j = ((com.amazon.aps.iva.xe0.e) dVar).j();
        if (j != null) {
            if (!j.y()) {
                j = null;
            }
            if (j != null) {
                return j;
            }
        }
        return new com.amazon.aps.iva.se0.n(2, dVar);
    }

    public static final int p(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
            return i2;
        } else if (i3 < 0) {
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i2 + i10;
            }
            return i2;
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    public static final u1 q(ArrayList arrayList) {
        m0 m0Var;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                ArrayList arrayList2 = new ArrayList(r.Y(arrayList));
                Iterator it = arrayList.iterator();
                boolean z = false;
                boolean z2 = false;
                while (it.hasNext()) {
                    u1 u1Var = (u1) it.next();
                    if (!z && !l1.D(u1Var)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (u1Var instanceof m0) {
                        m0Var = (m0) u1Var;
                    } else if (u1Var instanceof y) {
                        if (com.amazon.aps.iva.ee0.w.a(u1Var)) {
                            return u1Var;
                        }
                        m0Var = ((y) u1Var).c;
                        z2 = true;
                    } else {
                        throw new com.amazon.aps.iva.kb0.h();
                    }
                    arrayList2.add(m0Var);
                }
                if (z) {
                    return com.amazon.aps.iva.ge0.k.c(com.amazon.aps.iva.ge0.j.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
                }
                if (!z2) {
                    return com.amazon.aps.iva.fe0.r.a.b(arrayList2);
                }
                ArrayList arrayList3 = new ArrayList(r.Y(arrayList));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(com.amazon.aps.iva.dg.b.J((u1) it2.next()));
                }
                com.amazon.aps.iva.fe0.r rVar = com.amazon.aps.iva.fe0.r.a;
                return f0.c(rVar.b(arrayList2), rVar.b(arrayList3));
            }
            return (u1) x.P0(arrayList);
        }
        throw new IllegalStateException("Expected some types".toString());
    }

    public static final boolean r(com.amazon.aps.iva.y30.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        if (cVar == com.amazon.aps.iva.y30.c.DEFAULT) {
            return true;
        }
        return false;
    }

    public static final boolean s(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "<this>");
        View decorView = activity.getWindow().getDecorView();
        com.amazon.aps.iva.yb0.j.e(decorView, "this.window.decorView");
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int i = rect.bottom;
        int height = activity.getWindow().getDecorView().getHeight();
        if (height - i > height * 0.15d) {
            return true;
        }
        return false;
    }

    public static final boolean t(Throwable th) {
        Class<?> cls = th.getClass();
        while (!com.amazon.aps.iva.yb0.j.a(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    public static final long u(float[] fArr, long j) {
        boolean z;
        float c2 = com.amazon.aps.iva.e1.c.c(j);
        float d2 = com.amazon.aps.iva.e1.c.d(j);
        float f2 = 1 / (((fArr[7] * d2) + (fArr[3] * c2)) + fArr[15]);
        if (!Float.isInfinite(f2) && !Float.isNaN(f2)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            f2 = 0.0f;
        }
        return com.amazon.aps.iva.e1.d.d(((fArr[4] * d2) + (fArr[0] * c2) + fArr[12]) * f2, ((fArr[5] * d2) + (fArr[1] * c2) + fArr[13]) * f2);
    }

    public static final void v(float[] fArr, com.amazon.aps.iva.e1.b bVar) {
        long u = u(fArr, com.amazon.aps.iva.e1.d.d(bVar.a, bVar.b));
        long u2 = u(fArr, com.amazon.aps.iva.e1.d.d(bVar.a, bVar.d));
        long u3 = u(fArr, com.amazon.aps.iva.e1.d.d(bVar.c, bVar.b));
        long u4 = u(fArr, com.amazon.aps.iva.e1.d.d(bVar.c, bVar.d));
        bVar.a = Math.min(Math.min(com.amazon.aps.iva.e1.c.c(u), com.amazon.aps.iva.e1.c.c(u2)), Math.min(com.amazon.aps.iva.e1.c.c(u3), com.amazon.aps.iva.e1.c.c(u4)));
        bVar.b = Math.min(Math.min(com.amazon.aps.iva.e1.c.d(u), com.amazon.aps.iva.e1.c.d(u2)), Math.min(com.amazon.aps.iva.e1.c.d(u3), com.amazon.aps.iva.e1.c.d(u4)));
        bVar.c = Math.max(Math.max(com.amazon.aps.iva.e1.c.c(u), com.amazon.aps.iva.e1.c.c(u2)), Math.max(com.amazon.aps.iva.e1.c.c(u3), com.amazon.aps.iva.e1.c.c(u4)));
        bVar.d = Math.max(Math.max(com.amazon.aps.iva.e1.c.d(u), com.amazon.aps.iva.e1.c.d(u2)), Math.max(com.amazon.aps.iva.e1.c.d(u3), com.amazon.aps.iva.e1.c.d(u4)));
    }

    public static final int w(int i) {
        if (i >= 0) {
            if (i < 3) {
                return i + 1;
            }
            if (i < 1073741824) {
                return (int) ((i / 0.75f) + 1.0f);
            }
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public static final Map x(com.amazon.aps.iva.kb0.j jVar) {
        com.amazon.aps.iva.yb0.j.f(jVar, "pair");
        Map singletonMap = Collections.singletonMap(jVar.b, jVar.c);
        com.amazon.aps.iva.yb0.j.e(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final String y(Reader reader) {
        com.amazon.aps.iva.yb0.j.f(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        com.amazon.aps.iva.yb0.j.e(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    public static final Object z(Object obj) {
        if (obj instanceof com.amazon.aps.iva.se0.w) {
            return com.amazon.aps.iva.ab.x.H(((com.amazon.aps.iva.se0.w) obj).a);
        }
        return obj;
    }

    @Override // com.amazon.aps.iva.aq.m
    public void a(Context context) {
    }

    @Override // com.amazon.aps.iva.np.c
    public void b() {
    }

    @Override // com.amazon.aps.iva.np.c
    public void c() {
    }

    @Override // com.amazon.aps.iva.aq.m
    public l d() {
        return new l(0);
    }
}
