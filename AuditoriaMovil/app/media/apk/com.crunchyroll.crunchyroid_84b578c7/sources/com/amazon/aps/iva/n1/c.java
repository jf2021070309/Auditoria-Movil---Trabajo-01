package com.amazon.aps.iva.n1;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.KeyEvent;
import android.widget.RemoteViews;
import androidx.compose.foundation.l;
import com.amazon.aps.iva.a0.c2;
import com.amazon.aps.iva.a0.w1;
import com.amazon.aps.iva.b5.c;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.jm.y;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.ob0.g;
import com.amazon.aps.iva.p4.i;
import com.amazon.aps.iva.p4.k;
import com.amazon.aps.iva.p4.n;
import com.amazon.aps.iva.p4.r;
import com.amazon.aps.iva.r4.a2;
import com.amazon.aps.iva.r4.b2;
import com.amazon.aps.iva.r4.c1;
import com.amazon.aps.iva.r4.m;
import com.amazon.aps.iva.r4.n0;
import com.amazon.aps.iva.r4.o;
import com.amazon.aps.iva.r4.o0;
import com.amazon.aps.iva.r4.q1;
import com.amazon.aps.iva.r4.r1;
import com.amazon.aps.iva.r4.s;
import com.amazon.aps.iva.r4.s0;
import com.amazon.aps.iva.r4.s1;
import com.amazon.aps.iva.r4.t;
import com.amazon.aps.iva.r4.t0;
import com.amazon.aps.iva.r4.u0;
import com.amazon.aps.iva.r4.v0;
import com.amazon.aps.iva.r4.w0;
import com.amazon.aps.iva.r4.x0;
import com.amazon.aps.iva.r4.x1;
import com.amazon.aps.iva.r4.y0;
import com.amazon.aps.iva.r4.y1;
import com.amazon.aps.iva.r4.z0;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.t3.j;
import com.amazon.aps.iva.t4.f;
import com.amazon.aps.iva.v1.t1;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.y4.a;
import com.amazon.aps.iva.y4.h;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: KeyEvent.android.kt */
/* loaded from: classes.dex */
public final class c implements com.amazon.aps.iva.br.b, com.amazon.aps.iva.x90.e, com.amazon.aps.iva.k70.c {
    public static final com.amazon.aps.iva.j60.d a = new com.amazon.aps.iva.j60.d(R.string.watchlist_empty_title, R.string.watchlist_empty_subtitle);
    public static final int[] b;
    public static final Object[] c;
    public static final c d;

    static {
        new com.amazon.aps.iva.j60.c(R.string.empty_cta_primary_text, R.string.empty_cta_primary_text);
        b = new int[0];
        c = new Object[0];
        d = new c();
    }

    public static final int e(int i, int i2, int[] iArr) {
        j.f(iArr, "<this>");
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 > i2) {
                i3 = i5 - 1;
            } else {
                return i5;
            }
        }
        return ~i4;
    }

    public static final void f(ArrayList arrayList) {
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (iVar instanceof s) {
                    ((s) iVar).getClass();
                }
            }
        }
    }

    public static void g(com.amazon.aps.iva.w5.f fVar) {
        if (fVar != null) {
            try {
                fVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final com.amazon.aps.iva.pm.c h(EtpAccountService etpAccountService, com.amazon.aps.iva.pm.e eVar, y yVar) {
        j.f(etpAccountService, "accountService");
        j.f(eVar, "userProfileStore");
        j.f(yVar, "avatarProvider");
        return new com.amazon.aps.iva.pm.c(etpAccountService, eVar, yVar);
    }

    public static final long i(KeyEvent keyEvent) {
        j.f(keyEvent, "$this$key");
        return n.k(keyEvent.getKeyCode());
    }

    public static final int j(KeyEvent keyEvent) {
        j.f(keyEvent, "$this$type");
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    public static void k(BroadcastReceiver broadcastReceiver, p pVar) {
        com.amazon.aps.iva.ye0.c cVar = r0.a;
        j.f(broadcastReceiver, "<this>");
        j.f(cVar, "coroutineContext");
        com.amazon.aps.iva.xe0.d i = z.i(g.a.a(com.amazon.aps.iva.se0.i.a(), cVar));
        com.amazon.aps.iva.se0.i.d(i, null, null, new m(pVar, i, broadcastReceiver.goAsync(), null), 3);
    }

    public static final c2 l(com.amazon.aps.iva.o0.i iVar) {
        iVar.s(-1464256199);
        e0.b bVar = e0.a;
        Object[] objArr = new Object[0];
        com.amazon.aps.iva.x0.n nVar = c2.i;
        iVar.s(1157296644);
        boolean H = iVar.H(0);
        Object t = iVar.t();
        if (H || t == i.a.a) {
            t = new w1(0);
            iVar.n(t);
        }
        iVar.G();
        c2 c2Var = (c2) i.A(objArr, nVar, (com.amazon.aps.iva.xb0.a) t, iVar, 4);
        iVar.G();
        return c2Var;
    }

    public static final RemoteViews m(a2 a2Var, int i) {
        return new RemoteViews(a2Var.a.getPackageName(), i);
    }

    public static final void n(RemoteViews remoteViews, a2 a2Var, n0 n0Var, ArrayList arrayList) {
        j.f(remoteViews, "<this>");
        j.f(arrayList, "children");
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                p(remoteViews, a2Var.d(n0Var, i), (com.amazon.aps.iva.p4.i) obj);
                i = i2;
            } else {
                f1.S();
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int o(com.amazon.aps.iva.y4.a r5) {
        /*
            r0 = 1
            r1 = 0
            int r2 = r5.a
            if (r2 != 0) goto L8
            r3 = r0
            goto L9
        L8:
            r3 = r1
        L9:
            r4 = 2
            if (r3 == 0) goto Ld
            goto L24
        Ld:
            if (r2 != r4) goto L11
            r3 = r0
            goto L12
        L11:
            r3 = r1
        L12:
            if (r3 == 0) goto L18
            r2 = 8388613(0x800005, float:1.175495E-38)
            goto L27
        L18:
            if (r2 != r0) goto L1c
            r3 = r0
            goto L1d
        L1c:
            r3 = r1
        L1d:
            if (r3 == 0) goto L21
            r2 = r0
            goto L27
        L21:
            com.amazon.aps.iva.y4.a.C0884a.b(r2)
        L24:
            r2 = 8388611(0x800003, float:1.1754948E-38)
        L27:
            int r5 = r5.b
            if (r5 != 0) goto L2d
            r3 = r0
            goto L2e
        L2d:
            r3 = r1
        L2e:
            if (r3 == 0) goto L31
            goto L47
        L31:
            if (r5 != r4) goto L35
            r3 = r0
            goto L36
        L35:
            r3 = r1
        L36:
            if (r3 == 0) goto L3b
            r5 = 80
            goto L49
        L3b:
            if (r5 != r0) goto L3e
            goto L3f
        L3e:
            r0 = r1
        L3f:
            if (r0 == 0) goto L44
            r5 = 16
            goto L49
        L44:
            com.amazon.aps.iva.y4.a.b.b(r5)
        L47:
            r5 = 48
        L49:
            r5 = r5 | r2
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.n1.c.o(com.amazon.aps.iva.y4.a):int");
    }

    public static final void p(RemoteViews remoteViews, a2 a2Var, com.amazon.aps.iva.p4.i iVar) {
        c1 c1Var;
        int i;
        boolean z;
        c1 c1Var2;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        c1 c1Var3;
        c1 c1Var4;
        int y;
        c1 c1Var5;
        int y2;
        int i3;
        c1 c1Var6;
        c1 c1Var7;
        j.f(remoteViews, "<this>");
        j.f(iVar, "element");
        if (iVar instanceof com.amazon.aps.iva.y4.g) {
            com.amazon.aps.iva.y4.g gVar = (com.amazon.aps.iva.y4.g) iVar;
            c1 c1Var8 = c1.Box;
            ArrayList arrayList = gVar.c;
            int size = arrayList.size();
            com.amazon.aps.iva.p4.n nVar = gVar.d;
            com.amazon.aps.iva.y4.a aVar = gVar.e;
            n0 a2 = y0.a(remoteViews, a2Var, c1Var8, size, nVar, new a.C0884a(aVar.a), new a.b(aVar.b));
            com.amazon.aps.iva.r4.d.a(a2Var, remoteViews, gVar.d, a2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.amazon.aps.iva.p4.i iVar2 = (com.amazon.aps.iva.p4.i) it.next();
                iVar2.b(iVar2.a().d(new com.amazon.aps.iva.r4.a(gVar.e)));
            }
            n(remoteViews, a2Var, a2, arrayList);
        } else if (iVar instanceof com.amazon.aps.iva.p4.j) {
            com.amazon.aps.iva.p4.j jVar = (com.amazon.aps.iva.p4.j) iVar;
            com.amazon.aps.iva.a5.a aVar2 = new com.amazon.aps.iva.a5.a();
            String str = jVar.b;
            j.f(str, "<set-?>");
            aVar2.b = str;
            aVar2.c = null;
            aVar2.d = jVar.e;
            com.amazon.aps.iva.p4.n L = w.L(com.amazon.aps.iva.ff0.b.p(n.a.b), 16, 8);
            j.f(L, "<this>");
            aVar2.b(L.d(com.amazon.aps.iva.r4.n.b));
            com.amazon.aps.iva.cq.b.s0(remoteViews, a2Var, aVar2);
        } else if (iVar instanceof com.amazon.aps.iva.y4.i) {
            com.amazon.aps.iva.y4.i iVar3 = (com.amazon.aps.iva.y4.i) iVar;
            if (Build.VERSION.SDK_INT >= 31 && r1.a(iVar3.d)) {
                c1Var7 = c1.RadioRow;
            } else {
                c1Var7 = c1.Row;
            }
            ArrayList arrayList2 = iVar3.c;
            n0 a3 = y0.a(remoteViews, a2Var, c1Var7, arrayList2.size(), iVar3.d, null, new a.b(iVar3.f));
            remoteViews.setInt(a3.a, "setGravity", o(new com.amazon.aps.iva.y4.a(iVar3.e, iVar3.f)));
            com.amazon.aps.iva.r4.d.a(a2Var.a(), remoteViews, iVar3.d, a3);
            n(remoteViews, a2Var, a3, arrayList2);
            if (r1.a(iVar3.d)) {
                f(arrayList2);
            }
        } else if (iVar instanceof h) {
            h hVar = (h) iVar;
            if (Build.VERSION.SDK_INT >= 31 && r1.a(hVar.d)) {
                c1Var6 = c1.RadioColumn;
            } else {
                c1Var6 = c1.Column;
            }
            ArrayList arrayList3 = hVar.c;
            n0 a4 = y0.a(remoteViews, a2Var, c1Var6, arrayList3.size(), hVar.d, new a.C0884a(hVar.f), null);
            remoteViews.setInt(a4.a, "setGravity", o(new com.amazon.aps.iva.y4.a(hVar.f, hVar.e)));
            com.amazon.aps.iva.r4.d.a(a2Var.a(), remoteViews, hVar.d, a4);
            n(remoteViews, a2Var, a4, arrayList3);
            if (r1.a(hVar.d)) {
                f(arrayList3);
            }
        } else if (iVar instanceof com.amazon.aps.iva.a5.a) {
            com.amazon.aps.iva.cq.b.s0(remoteViews, a2Var, (com.amazon.aps.iva.a5.a) iVar);
        } else {
            boolean z5 = iVar instanceof com.amazon.aps.iva.t4.c;
            com.amazon.aps.iva.y4.a aVar3 = com.amazon.aps.iva.y4.a.d;
            boolean z6 = true;
            boolean z7 = false;
            if (z5) {
                com.amazon.aps.iva.t4.c cVar = (com.amazon.aps.iva.t4.c) iVar;
                ArrayList arrayList4 = cVar.c;
                if (arrayList4.size() != 1 || !j.a(cVar.d, aVar3)) {
                    z6 = false;
                }
                if (z6) {
                    p(remoteViews, a2Var, (com.amazon.aps.iva.p4.i) x.t0(arrayList4));
                    return;
                }
                throw new IllegalArgumentException("Lazy list items can only have a single child align at the center start of the view. The normalization of the composition tree failed.".toString());
            } else if (iVar instanceof com.amazon.aps.iva.t4.a) {
                com.amazon.aps.iva.ab.x.q0(remoteViews, a2Var, (com.amazon.aps.iva.t4.a) iVar);
            } else if (iVar instanceof o) {
                o oVar = (o) iVar;
                if (!oVar.c.isEmpty()) {
                    if (oVar.e == -1) {
                        z6 = false;
                    }
                    if (!z6) {
                        throw new IllegalStateException("To add children to an `AndroidRemoteViews`, its `containerViewId` must be set.".toString());
                    }
                    j.m("remoteViews");
                    throw null;
                }
                j.m("remoteViews");
                throw null;
            } else {
                boolean z8 = iVar instanceof com.amazon.aps.iva.r4.p;
                com.amazon.aps.iva.w4.a aVar4 = com.amazon.aps.iva.w4.a.a;
                Context context = a2Var.a;
                if (z8) {
                    com.amazon.aps.iva.r4.p pVar = (com.amazon.aps.iva.r4.p) iVar;
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 31) {
                        c1Var5 = c1.CheckBox;
                    } else {
                        c1Var5 = c1.CheckBoxBackport;
                    }
                    n0 b2 = y0.b(remoteViews, a2Var, c1Var5, pVar.a);
                    com.amazon.aps.iva.r4.f fVar = pVar.c;
                    if (i4 >= 31) {
                        int y3 = com.amazon.aps.iva.ff0.b.y(remoteViews, a2Var, R.id.checkBox, 0, 12);
                        aVar4.a(remoteViews, y3, false);
                        com.amazon.aps.iva.x4.a aVar5 = fVar.a;
                        if (aVar5 instanceof com.amazon.aps.iva.x4.b) {
                            com.amazon.aps.iva.w4.b F = com.amazon.aps.iva.ff0.b.F((com.amazon.aps.iva.x4.b) aVar5, context);
                            j.a.i(remoteViews, y3, "setButtonTintList", F.a, F.b);
                        } else if (aVar5 instanceof com.amazon.aps.iva.x4.d) {
                            j.a.g(remoteViews, y3, "setButtonTintList", ((com.amazon.aps.iva.x4.d) aVar5).a);
                        }
                        y2 = y3;
                        i3 = y2;
                    } else {
                        int y4 = com.amazon.aps.iva.ff0.b.y(remoteViews, a2Var, R.id.checkBoxIcon, 0, 12);
                        y2 = com.amazon.aps.iva.ff0.b.y(remoteViews, a2Var, R.id.checkBoxText, 0, 12);
                        remoteViews.setBoolean(y4, "setEnabled", false);
                        com.amazon.aps.iva.ff0.b.D(remoteViews, y4, com.amazon.aps.iva.ff0.b.u(fVar.a, context));
                        i3 = b2.a;
                    }
                    com.amazon.aps.iva.cq.b.l0(remoteViews, a2Var, y2, pVar.b, null, pVar.d, 16);
                    com.amazon.aps.iva.r4.d.a(a2.b(a2Var.e(), 0, false, null, null, 0, false, Integer.valueOf(i3), false, false, 57343), remoteViews, pVar.a, b2);
                } else if (iVar instanceof com.amazon.aps.iva.y4.j) {
                    com.amazon.aps.iva.y4.j jVar2 = (com.amazon.aps.iva.y4.j) iVar;
                    com.amazon.aps.iva.r4.d.a(a2Var, remoteViews, jVar2.a, y0.b(remoteViews, a2Var, c1.Frame, jVar2.a));
                } else if (iVar instanceof t) {
                    t tVar = (t) iVar;
                    int i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 31) {
                        c1Var4 = c1.Swtch;
                    } else {
                        c1Var4 = c1.SwtchBackport;
                    }
                    n0 b3 = y0.b(remoteViews, a2Var, c1Var4, tVar.a);
                    y1 y1Var = tVar.c;
                    if (i5 >= 31) {
                        y = b3.a;
                        aVar4.a(remoteViews, y, false);
                        com.amazon.aps.iva.x4.a aVar6 = y1Var.a;
                        if (aVar6 instanceof com.amazon.aps.iva.x4.b) {
                            com.amazon.aps.iva.w4.b F2 = com.amazon.aps.iva.ff0.b.F((com.amazon.aps.iva.x4.b) aVar6, context);
                            j.a.i(remoteViews, y, "setThumbTintList", F2.a, F2.b);
                        } else if (aVar6 instanceof com.amazon.aps.iva.x4.d) {
                            j.a.g(remoteViews, y, "setThumbTintList", ((com.amazon.aps.iva.x4.d) aVar6).a);
                        } else {
                            throw new com.amazon.aps.iva.kb0.h();
                        }
                        q qVar = q.a;
                        com.amazon.aps.iva.x4.a aVar7 = y1Var.b;
                        if (aVar7 instanceof com.amazon.aps.iva.x4.b) {
                            com.amazon.aps.iva.w4.b F3 = com.amazon.aps.iva.ff0.b.F((com.amazon.aps.iva.x4.b) aVar7, context);
                            j.a.i(remoteViews, y, "setTrackTintList", F3.a, F3.b);
                        } else if (aVar7 instanceof com.amazon.aps.iva.x4.d) {
                            j.a.g(remoteViews, y, "setTrackTintList", ((com.amazon.aps.iva.x4.d) aVar7).a);
                        } else {
                            throw new com.amazon.aps.iva.kb0.h();
                        }
                    } else {
                        y = com.amazon.aps.iva.ff0.b.y(remoteViews, a2Var, R.id.switchText, 0, 12);
                        int y5 = com.amazon.aps.iva.ff0.b.y(remoteViews, a2Var, R.id.switchThumb, 0, 12);
                        int y6 = com.amazon.aps.iva.ff0.b.y(remoteViews, a2Var, R.id.switchTrack, 0, 12);
                        remoteViews.setBoolean(y5, "setEnabled", false);
                        remoteViews.setBoolean(y6, "setEnabled", false);
                        com.amazon.aps.iva.ff0.b.D(remoteViews, y5, com.amazon.aps.iva.ff0.b.u(y1Var.a, context));
                        com.amazon.aps.iva.ff0.b.D(remoteViews, y6, com.amazon.aps.iva.ff0.b.u(y1Var.b, context));
                    }
                    com.amazon.aps.iva.cq.b.l0(remoteViews, a2Var, y, tVar.b, null, tVar.d, 16);
                    com.amazon.aps.iva.r4.d.a(a2Var.e(), remoteViews, tVar.a, b3);
                } else if (iVar instanceof k) {
                    k kVar = (k) iVar;
                    int i6 = kVar.d;
                    if (i6 == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        c1Var3 = c1.ImageCrop;
                    } else {
                        if (i6 == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            c1Var3 = c1.ImageFit;
                        } else {
                            if (i6 != 2) {
                                z6 = false;
                            }
                            if (z6) {
                                c1Var3 = c1.ImageFillBounds;
                            } else {
                                com.amazon.aps.iva.y4.f.a(i6);
                                c1Var3 = c1.ImageFit;
                            }
                        }
                    }
                    n0 b4 = y0.b(remoteViews, a2Var, c1Var3, kVar.a);
                    String str2 = kVar.c;
                    int i7 = b4.a;
                    remoteViews.setContentDescription(i7, str2);
                    r rVar = kVar.b;
                    if (rVar instanceof com.amazon.aps.iva.p4.a) {
                        remoteViews.setImageViewResource(i7, ((com.amazon.aps.iva.p4.a) rVar).a);
                    } else if (rVar instanceof com.amazon.aps.iva.p4.d) {
                        remoteViews.setImageViewBitmap(i7, ((com.amazon.aps.iva.p4.d) rVar).a);
                    } else if (rVar instanceof b2) {
                        ((b2) rVar).getClass();
                        remoteViews.setImageViewUri(i7, null);
                    } else if (rVar instanceof com.amazon.aps.iva.p4.p) {
                        com.amazon.aps.iva.w4.c cVar2 = com.amazon.aps.iva.w4.c.a;
                        ((com.amazon.aps.iva.p4.p) rVar).getClass();
                        cVar2.a(remoteViews, i7, null);
                    } else {
                        throw new IllegalArgumentException("An unsupported ImageProvider type was used.");
                    }
                    com.amazon.aps.iva.r4.d.a(a2Var, remoteViews, kVar.a, b4);
                } else if (iVar instanceof com.amazon.aps.iva.r4.r) {
                    com.amazon.aps.iva.r4.r rVar2 = (com.amazon.aps.iva.r4.r) iVar;
                    n0 b5 = y0.b(remoteViews, a2Var, c1.LinearProgressIndicator, rVar2.a);
                    int i8 = b5.a;
                    remoteViews.setProgressBar(i8, 100, (int) (100 * 0.0f), false);
                    if (Build.VERSION.SDK_INT >= 31) {
                        com.amazon.aps.iva.b5.d dVar = rVar2.b;
                        if (dVar instanceof com.amazon.aps.iva.b5.d) {
                            j.a.h(remoteViews, i8, "setProgressTintList", ColorStateList.valueOf(i.G(dVar.a)));
                        } else if (dVar instanceof com.amazon.aps.iva.b5.e) {
                            j.a.h(remoteViews, i8, "setProgressTintList", ColorStateList.valueOf(((com.amazon.aps.iva.b5.e) dVar).a));
                        }
                        com.amazon.aps.iva.b5.d dVar2 = rVar2.c;
                        if (dVar2 instanceof com.amazon.aps.iva.b5.d) {
                            j.a.h(remoteViews, i8, "setProgressBackgroundTintList", ColorStateList.valueOf(i.G(dVar2.a)));
                        } else if (dVar2 instanceof com.amazon.aps.iva.b5.e) {
                            j.a.h(remoteViews, i8, "setProgressBackgroundTintList", ColorStateList.valueOf(((com.amazon.aps.iva.b5.e) dVar2).a));
                        }
                    }
                    com.amazon.aps.iva.r4.d.a(a2Var, remoteViews, rVar2.a, b5);
                } else if (iVar instanceof com.amazon.aps.iva.r4.q) {
                    com.amazon.aps.iva.r4.q qVar2 = (com.amazon.aps.iva.r4.q) iVar;
                    n0 b6 = y0.b(remoteViews, a2Var, c1.CircularProgressIndicator, qVar2.a);
                    int i9 = b6.a;
                    remoteViews.setProgressBar(i9, 0, 0, true);
                    if (Build.VERSION.SDK_INT >= 31) {
                        com.amazon.aps.iva.b5.a aVar8 = qVar2.b;
                        if (aVar8 instanceof com.amazon.aps.iva.b5.d) {
                            j.a.h(remoteViews, i9, "setIndeterminateTintList", ColorStateList.valueOf(i.G(((com.amazon.aps.iva.b5.d) aVar8).a)));
                        } else if (aVar8 instanceof com.amazon.aps.iva.b5.e) {
                            j.a.h(remoteViews, i9, "setIndeterminateTintList", ColorStateList.valueOf(((com.amazon.aps.iva.b5.e) aVar8).a));
                        }
                    }
                    com.amazon.aps.iva.r4.d.a(a2Var, remoteViews, qVar2.a, b6);
                } else if (iVar instanceof com.amazon.aps.iva.t4.d) {
                    com.amazon.aps.iva.t4.d dVar3 = (com.amazon.aps.iva.t4.d) iVar;
                    f.b bVar = new f.b(1);
                    f.b bVar2 = dVar3.e;
                    if (com.amazon.aps.iva.yb0.j.a(bVar2, bVar)) {
                        c1Var2 = c1.VerticalGridOneColumn;
                    } else if (com.amazon.aps.iva.yb0.j.a(bVar2, new f.b(2))) {
                        c1Var2 = c1.VerticalGridTwoColumns;
                    } else if (com.amazon.aps.iva.yb0.j.a(bVar2, new f.b(3))) {
                        c1Var2 = c1.VerticalGridThreeColumns;
                    } else if (com.amazon.aps.iva.yb0.j.a(bVar2, new f.b(4))) {
                        c1Var2 = c1.VerticalGridFourColumns;
                    } else if (com.amazon.aps.iva.yb0.j.a(bVar2, new f.b(5))) {
                        c1Var2 = c1.VerticalGridFiveColumns;
                    } else {
                        c1Var2 = c1.VerticalGridAutoFit;
                    }
                    n0 b7 = y0.b(remoteViews, a2Var, c1Var2, dVar3.d);
                    if (!a2Var.f) {
                        if (bVar2 instanceof f.b) {
                            int i10 = bVar2.a;
                            if (1 <= i10 && i10 < 6) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                throw new IllegalArgumentException("Only counts from 1 to 5 are supported.".toString());
                            }
                        }
                        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(), 167772168);
                        int i11 = b7.a;
                        remoteViews.setPendingIntentTemplate(i11, activity);
                        j.c.a aVar9 = new j.c.a();
                        a2 f = a2Var.f(i11);
                        Iterator it2 = dVar3.c.iterator();
                        int i12 = 0;
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int i13 = i12 + 1;
                            if (i12 >= 0) {
                                com.amazon.aps.iva.p4.i iVar4 = (com.amazon.aps.iva.p4.i) next;
                                com.amazon.aps.iva.yb0.j.d(iVar4, "null cannot be cast to non-null type androidx.glance.appwidget.lazy.EmittableLazyVerticalGridListItem");
                                com.amazon.aps.iva.t4.e eVar = (com.amazon.aps.iva.t4.e) iVar4;
                                a2 g = f.g(i12);
                                List J = f1.J(iVar4);
                                o0 o0Var = a2Var.d;
                                if (o0Var != null) {
                                    i2 = o0Var.a(iVar4);
                                } else {
                                    i2 = -1;
                                }
                                RemoteViews q = q(g, J, i2);
                                aVar9.a.add(0L);
                                aVar9.b.add(q);
                                i12 = i13;
                                z7 = true;
                            } else {
                                f1.S();
                                throw null;
                            }
                        }
                        aVar9.c = z7;
                        aVar9.d = y0.c;
                        com.amazon.aps.iva.t3.j.a(context, remoteViews, a2Var.b, i11, aVar9.a());
                        if (Build.VERSION.SDK_INT >= 31 && (bVar2 instanceof f.a)) {
                            ((f.a) bVar2).getClass();
                            j.a.o(remoteViews, i11, "setColumnWidth", 0.0f, 1);
                        }
                        com.amazon.aps.iva.r4.d.a(a2Var.c(), remoteViews, dVar3.d, b7);
                        return;
                    }
                    throw new IllegalStateException("Glance does not support nested list views.".toString());
                } else if (iVar instanceof com.amazon.aps.iva.t4.e) {
                    com.amazon.aps.iva.t4.e eVar2 = (com.amazon.aps.iva.t4.e) iVar;
                    ArrayList arrayList5 = eVar2.c;
                    if (arrayList5.size() == 1 && com.amazon.aps.iva.yb0.j.a(eVar2.d, aVar3)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        p(remoteViews, a2Var, (com.amazon.aps.iva.p4.i) x.t0(arrayList5));
                        return;
                    }
                    throw new IllegalArgumentException("Lazy vertical grid items can only have a single child align at the center start of the view. The normalization of the composition tree failed.".toString());
                } else if (iVar instanceof s) {
                    s sVar = (s) iVar;
                    int i14 = Build.VERSION.SDK_INT;
                    if (i14 >= 31) {
                        c1Var = c1.RadioButton;
                    } else {
                        c1Var = c1.RadioButtonBackport;
                    }
                    n0 b8 = y0.b(remoteViews, a2Var, c1Var, sVar.a);
                    q1 q1Var = sVar.d;
                    int i15 = b8.a;
                    if (i14 >= 31) {
                        aVar4.a(remoteViews, i15, false);
                        com.amazon.aps.iva.x4.a aVar10 = q1Var.a;
                        if (aVar10 instanceof com.amazon.aps.iva.x4.b) {
                            com.amazon.aps.iva.w4.b F4 = com.amazon.aps.iva.ff0.b.F((com.amazon.aps.iva.x4.b) aVar10, context);
                            j.a.i(remoteViews, i15, "setButtonTintList", F4.a, F4.b);
                        } else if (aVar10 instanceof com.amazon.aps.iva.x4.d) {
                            j.a.g(remoteViews, i15, "setButtonTintList", ((com.amazon.aps.iva.x4.d) aVar10).a);
                        }
                        i = i15;
                    } else {
                        int y7 = com.amazon.aps.iva.ff0.b.y(remoteViews, a2Var, R.id.radioText, 0, 12);
                        int y8 = com.amazon.aps.iva.ff0.b.y(remoteViews, a2Var, R.id.radioIcon, 0, 12);
                        remoteViews.setBoolean(y8, "setEnabled", false);
                        com.amazon.aps.iva.ff0.b.D(remoteViews, y8, com.amazon.aps.iva.ff0.b.u(q1Var.a, context));
                        i = y7;
                    }
                    com.amazon.aps.iva.cq.b.l0(remoteViews, a2Var, i, sVar.c, null, sVar.e, 16);
                    remoteViews.setBoolean(i15, "setEnabled", sVar.b);
                    com.amazon.aps.iva.r4.d.a(a2Var, remoteViews, sVar.a, b8);
                } else {
                    throw new IllegalArgumentException("Unknown element type " + iVar.getClass().getCanonicalName());
                }
            }
        }
    }

    public static final RemoteViews q(a2 a2Var, List list, int i) {
        boolean z;
        int i2;
        Object obj;
        Object obj2;
        z0 z0Var;
        z0 z0Var2;
        z0 z0Var3;
        z0 z0Var4;
        s1 s1Var;
        com.amazon.aps.iva.b5.c cVar;
        com.amazon.aps.iva.b5.c cVar2;
        com.amazon.aps.iva.yb0.j.f(list, "children");
        boolean z2 = true;
        if (list.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            com.amazon.aps.iva.p4.i iVar = (com.amazon.aps.iva.p4.i) x.t0(list);
            com.amazon.aps.iva.p4.n a2 = iVar.a();
            Map<c1, Integer> map = y0.a;
            com.amazon.aps.iva.yb0.j.f(a2, "modifier");
            int i3 = Build.VERSION.SDK_INT;
            Context context = a2Var.a;
            if (i3 >= 33) {
                RemoteViews m = m(a2Var, com.amazon.aps.iva.r4.y.g);
                com.amazon.aps.iva.y4.r rVar = (com.amazon.aps.iva.y4.r) a2.a(null, u0.h);
                if (rVar != null) {
                    com.amazon.aps.iva.r4.d.c(context, m, rVar, R.id.rootView);
                }
                com.amazon.aps.iva.y4.k kVar = (com.amazon.aps.iva.y4.k) a2.a(null, v0.h);
                if (kVar != null) {
                    com.amazon.aps.iva.r4.d.b(context, m, kVar, R.id.rootView);
                }
                m.removeAllViews(R.id.rootView);
                s1Var = new s1(m, new n0(R.id.rootView, 0, null, 6));
            } else if (i3 >= 31) {
                int i4 = com.amazon.aps.iva.r4.y.h;
                if (i >= i4) {
                    z2 = false;
                }
                if (z2) {
                    z0 z0Var5 = z0.Wrap;
                    x1 x1Var = new x1(z0Var5, z0Var5);
                    RemoteViews m2 = m(a2Var, com.amazon.aps.iva.r4.y.g + i);
                    com.amazon.aps.iva.y4.r rVar2 = (com.amazon.aps.iva.y4.r) a2.a(null, w0.h);
                    if (rVar2 != null) {
                        com.amazon.aps.iva.r4.d.c(context, m2, rVar2, R.id.rootView);
                    }
                    com.amazon.aps.iva.y4.k kVar2 = (com.amazon.aps.iva.y4.k) a2.a(null, x0.h);
                    if (kVar2 != null) {
                        com.amazon.aps.iva.r4.d.b(context, m2, kVar2, R.id.rootView);
                    }
                    s1Var = new s1(m2, new n0(R.id.rootView, 0, com.amazon.aps.iva.aq.k.x(new com.amazon.aps.iva.kb0.j(0, com.amazon.aps.iva.aq.k.x(new com.amazon.aps.iva.kb0.j(x1Var, Integer.valueOf((int) R.id.rootStubId))))), 2));
                } else {
                    throw new IllegalArgumentException(j0.e("Index of the root view cannot be more than ", i4, ", currently ", i).toString());
                }
            } else {
                int i5 = y0.b * i;
                if (i5 >= com.amazon.aps.iva.r4.y.h) {
                    z2 = false;
                }
                if (z2) {
                    com.amazon.aps.iva.y4.r rVar3 = (com.amazon.aps.iva.y4.r) a2.a(null, s0.h);
                    if (rVar3 == null || (cVar2 = rVar3.b) == null || (obj = y0.d(cVar2, context)) == null) {
                        obj = c.e.a;
                    }
                    com.amazon.aps.iva.y4.k kVar3 = (com.amazon.aps.iva.y4.k) a2.a(null, t0.h);
                    if (kVar3 == null || (cVar = kVar3.b) == null || (obj2 = y0.d(cVar, context)) == null) {
                        obj2 = c.e.a;
                    }
                    c.C0130c c0130c = c.C0130c.a;
                    if (com.amazon.aps.iva.yb0.j.a(obj, c0130c)) {
                        z0Var = z0.MatchParent;
                    } else {
                        z0Var = z0.Wrap;
                    }
                    if (com.amazon.aps.iva.yb0.j.a(obj2, c0130c)) {
                        z0Var2 = z0.MatchParent;
                    } else {
                        z0Var2 = z0.Wrap;
                    }
                    z0 z0Var6 = z0.Fixed;
                    if (z0Var == z0Var6) {
                        z0Var3 = z0.Wrap;
                    } else {
                        z0Var3 = z0Var;
                    }
                    if (z0Var2 == z0Var6) {
                        z0Var4 = z0.Wrap;
                    } else {
                        z0Var4 = z0Var2;
                    }
                    x1 x1Var2 = new x1(z0Var3, z0Var4);
                    Integer num = com.amazon.aps.iva.r4.y.f.get(x1Var2);
                    if (num != null) {
                        s1Var = new s1(m(a2Var, i5 + com.amazon.aps.iva.r4.y.g + num.intValue()), new n0(0, 0, com.amazon.aps.iva.aq.k.x(new com.amazon.aps.iva.kb0.j(0, com.amazon.aps.iva.aq.k.x(new com.amazon.aps.iva.kb0.j(x1Var2, Integer.valueOf((int) R.id.rootStubId))))), 3));
                    } else {
                        throw new IllegalStateException("Cannot find root element for size [" + z0Var + ", " + z0Var2 + ']');
                    }
                } else {
                    throw new IllegalArgumentException(("Index of the root view cannot be more than " + (i2 / 4) + ", currently " + i).toString());
                }
            }
            a2 d2 = a2Var.d(s1Var.b, 0);
            RemoteViews remoteViews = s1Var.a;
            p(remoteViews, d2, iVar);
            return remoteViews;
        }
        throw new IllegalArgumentException("The root of the tree must have exactly one child. The normalization of the composition tree failed.".toString());
    }

    public static com.amazon.aps.iva.a1.f r(com.amazon.aps.iva.a1.f fVar, c2 c2Var) {
        com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(c2Var, "state");
        return com.amazon.aps.iva.a1.e.a(fVar, t1.a, new l(c2Var, null, false, true));
    }

    @Override // com.amazon.aps.iva.br.b
    public void a(com.amazon.aps.iva.sp.c cVar, com.amazon.aps.iva.sp.c cVar2) {
        com.amazon.aps.iva.yb0.j.f(cVar, "logWriter");
        com.amazon.aps.iva.yb0.j.f(cVar2, "rumWriter");
    }

    @Override // com.amazon.aps.iva.k70.c
    public boolean b(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "password");
        if (str.length() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.x90.e
    public void c(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "host");
    }

    @Override // com.amazon.aps.iva.x90.e
    public void d(String str, Throwable th) {
        com.amazon.aps.iva.yb0.j.f(str, "host");
        String concat = "Kronos onError @host:".concat(str);
        Map x = com.amazon.aps.iva.aq.k.x(new com.amazon.aps.iva.kb0.j("kronos.sync.host", str));
        com.amazon.aps.iva.iq.a aVar = com.amazon.aps.iva.dq.c.a;
        aVar.getClass();
        com.amazon.aps.iva.yb0.j.f(concat, "message");
        com.amazon.aps.iva.iq.a.c(aVar, 6, concat, th, x);
    }

    @Override // com.amazon.aps.iva.x90.e
    public void onSuccess() {
    }
}
