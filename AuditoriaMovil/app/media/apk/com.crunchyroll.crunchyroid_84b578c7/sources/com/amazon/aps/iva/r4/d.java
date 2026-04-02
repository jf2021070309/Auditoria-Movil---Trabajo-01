package com.amazon.aps.iva.r4;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.RemoteViews;
import com.amazon.aps.iva.b5.c;
import com.amazon.aps.iva.p4.n;
import com.amazon.aps.iva.t3.j;
import com.crunchyroll.crunchyroid.R;
import java.util.Map;
import java.util.Objects;
/* compiled from: ApplyModifiers.kt */
/* loaded from: classes.dex */
public final class d {

    /* compiled from: ApplyModifiers.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.p4.s.values().length];
            iArr[com.amazon.aps.iva.p4.s.Visible.ordinal()] = 1;
            iArr[com.amazon.aps.iva.p4.s.Invisible.ordinal()] = 2;
            iArr[com.amazon.aps.iva.p4.s.Gone.ordinal()] = 3;
            a = iArr;
        }
    }

    /* compiled from: ApplyModifiers.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.kb0.q, n.c, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.q4.b> h;
        public final /* synthetic */ com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.y4.r> i;
        public final /* synthetic */ com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.y4.k> j;
        public final /* synthetic */ Context k;
        public final /* synthetic */ RemoteViews l;
        public final /* synthetic */ n0 m;
        public final /* synthetic */ com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.y4.m> n;
        public final /* synthetic */ com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.p4.s> o;
        public final /* synthetic */ com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.b5.c> p;
        public final /* synthetic */ com.amazon.aps.iva.yb0.d0<h> q;
        public final /* synthetic */ com.amazon.aps.iva.yb0.d0<u> r;
        public final /* synthetic */ com.amazon.aps.iva.yb0.z s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.q4.b> d0Var, com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.y4.r> d0Var2, com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.y4.k> d0Var3, Context context, RemoteViews remoteViews, n0 n0Var, com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.y4.m> d0Var4, com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.p4.s> d0Var5, com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.b5.c> d0Var6, a2 a2Var, com.amazon.aps.iva.yb0.d0<h> d0Var7, com.amazon.aps.iva.yb0.d0<u> d0Var8, com.amazon.aps.iva.yb0.z zVar) {
            super(2);
            this.h = d0Var;
            this.i = d0Var2;
            this.j = d0Var3;
            this.k = context;
            this.l = remoteViews;
            this.m = n0Var;
            this.n = d0Var4;
            this.o = d0Var5;
            this.p = d0Var6;
            this.q = d0Var7;
            this.r = d0Var8;
            this.s = zVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v1, types: [T, com.amazon.aps.iva.p4.n$c, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v3, types: [T, com.amazon.aps.iva.b5.c] */
        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.kb0.q qVar, n.c cVar) {
            T t;
            long j;
            n.c cVar2 = cVar;
            com.amazon.aps.iva.yb0.j.f(qVar, "<anonymous parameter 0>");
            com.amazon.aps.iva.yb0.j.f(cVar2, "modifier");
            if (cVar2 instanceof com.amazon.aps.iva.q4.b) {
                com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.q4.b> d0Var = this.h;
                com.amazon.aps.iva.q4.b bVar = d0Var.b;
                d0Var.b = cVar2;
            } else if (cVar2 instanceof com.amazon.aps.iva.y4.r) {
                this.i.b = cVar2;
            } else if (cVar2 instanceof com.amazon.aps.iva.y4.k) {
                this.j.b = cVar2;
            } else {
                boolean z = false;
                if (cVar2 instanceof com.amazon.aps.iva.p4.c) {
                    com.amazon.aps.iva.p4.c cVar3 = (com.amazon.aps.iva.p4.c) cVar2;
                    int i = this.m.a;
                    RemoteViews remoteViews = this.l;
                    com.amazon.aps.iva.p4.r rVar = cVar3.c;
                    if (rVar != null) {
                        if (rVar instanceof com.amazon.aps.iva.p4.a) {
                            com.amazon.aps.iva.yb0.j.f(remoteViews, "<this>");
                            remoteViews.setInt(i, "setBackgroundResource", ((com.amazon.aps.iva.p4.a) rVar).a);
                        }
                    } else {
                        com.amazon.aps.iva.b5.a aVar = cVar3.b;
                        if (aVar instanceof com.amazon.aps.iva.b5.d) {
                            int G = defpackage.i.G(((com.amazon.aps.iva.b5.d) aVar).a);
                            com.amazon.aps.iva.yb0.j.f(remoteViews, "<this>");
                            remoteViews.setInt(i, "setBackgroundColor", G);
                        } else if (aVar instanceof com.amazon.aps.iva.b5.e) {
                            int i2 = ((com.amazon.aps.iva.b5.e) aVar).a;
                            com.amazon.aps.iva.yb0.j.f(remoteViews, "<this>");
                            if (Build.VERSION.SDK_INT >= 31) {
                                j.a.d(remoteViews, i, "setBackgroundColor", i2);
                            } else {
                                remoteViews.setInt(i, "setBackgroundResource", i2);
                            }
                        } else if (aVar instanceof com.amazon.aps.iva.x4.c) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                com.amazon.aps.iva.x4.c cVar4 = (com.amazon.aps.iva.x4.c) aVar;
                                int G2 = defpackage.i.G(cVar4.a);
                                int G3 = defpackage.i.G(cVar4.b);
                                com.amazon.aps.iva.yb0.j.f(remoteViews, "<this>");
                                j.a.f(remoteViews, i, "setBackgroundColor", G2, G3);
                            } else {
                                com.amazon.aps.iva.x4.c cVar5 = (com.amazon.aps.iva.x4.c) aVar;
                                cVar5.getClass();
                                Context context = this.k;
                                com.amazon.aps.iva.yb0.j.f(context, "context");
                                if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
                                    z = true;
                                }
                                if (z) {
                                    j = cVar5.b;
                                } else {
                                    j = cVar5.a;
                                }
                                int G4 = defpackage.i.G(j);
                                com.amazon.aps.iva.yb0.j.f(remoteViews, "<this>");
                                remoteViews.setInt(i, "setBackgroundColor", G4);
                            }
                        } else {
                            Objects.toString(aVar);
                        }
                    }
                } else if (cVar2 instanceof com.amazon.aps.iva.y4.m) {
                    com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.y4.m> d0Var2 = this.n;
                    com.amazon.aps.iva.y4.m mVar = d0Var2.b;
                    if (mVar != null) {
                        com.amazon.aps.iva.y4.m mVar2 = (com.amazon.aps.iva.y4.m) cVar2;
                        t = new com.amazon.aps.iva.y4.m(mVar.b.a(mVar2.b), mVar.c.a(mVar2.c), mVar.d.a(mVar2.d), mVar.e.a(mVar2.e), mVar.f.a(mVar2.f), mVar.g.a(mVar2.g));
                    } else {
                        t = (com.amazon.aps.iva.y4.m) cVar2;
                    }
                    d0Var2.b = t;
                } else if (cVar2 instanceof com.amazon.aps.iva.p4.t) {
                    com.amazon.aps.iva.p4.t tVar = (com.amazon.aps.iva.p4.t) cVar2;
                    this.o.b = null;
                } else if (cVar2 instanceof l) {
                    this.p.b = ((l) cVar2).b;
                } else if (!(cVar2 instanceof com.amazon.aps.iva.r4.a)) {
                    if (cVar2 instanceof h) {
                        this.q.b = cVar2;
                    } else if (cVar2 instanceof u) {
                        this.r.b = cVar2;
                    } else if (cVar2 instanceof n) {
                        this.s.b = false;
                    } else {
                        cVar2.toString();
                    }
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.amazon.aps.iva.p4.s, T] */
    public static final void a(a2 a2Var, RemoteViews remoteViews, com.amazon.aps.iva.p4.n nVar, n0 n0Var) {
        boolean z;
        RemoteViews remoteViews2;
        boolean z2;
        com.amazon.aps.iva.b5.c cVar;
        com.amazon.aps.iva.b5.c cVar2;
        boolean z3;
        boolean z4;
        int i;
        boolean a2;
        boolean a3;
        boolean z5;
        boolean a4;
        boolean a5;
        boolean z6;
        boolean z7;
        int i2;
        float f;
        int i3;
        int i4;
        com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
        com.amazon.aps.iva.yb0.j.f(nVar, "modifiers");
        Context context = a2Var.a;
        com.amazon.aps.iva.yb0.d0 d0Var = new com.amazon.aps.iva.yb0.d0();
        com.amazon.aps.iva.yb0.d0 d0Var2 = new com.amazon.aps.iva.yb0.d0();
        com.amazon.aps.iva.yb0.d0 d0Var3 = new com.amazon.aps.iva.yb0.d0();
        com.amazon.aps.iva.yb0.d0 d0Var4 = new com.amazon.aps.iva.yb0.d0();
        com.amazon.aps.iva.yb0.d0 d0Var5 = new com.amazon.aps.iva.yb0.d0();
        d0Var5.b = com.amazon.aps.iva.p4.s.Visible;
        com.amazon.aps.iva.yb0.d0 d0Var6 = new com.amazon.aps.iva.yb0.d0();
        com.amazon.aps.iva.yb0.d0 d0Var7 = new com.amazon.aps.iva.yb0.d0();
        com.amazon.aps.iva.yb0.d0 d0Var8 = new com.amazon.aps.iva.yb0.d0();
        com.amazon.aps.iva.yb0.z zVar = new com.amazon.aps.iva.yb0.z();
        zVar.b = true;
        nVar.a(com.amazon.aps.iva.kb0.q.a, new b(d0Var6, d0Var, d0Var2, context, remoteViews, n0Var, d0Var3, d0Var5, d0Var4, a2Var, d0Var8, d0Var7, zVar));
        com.amazon.aps.iva.y4.r rVar = (com.amazon.aps.iva.y4.r) d0Var.b;
        com.amazon.aps.iva.y4.k kVar = (com.amazon.aps.iva.y4.k) d0Var2.b;
        Map<c1, Integer> map = y0.a;
        if (n0Var.b == -1) {
            z = true;
        } else {
            z = false;
        }
        int i5 = n0Var.a;
        Context context2 = a2Var.a;
        if (z) {
            if (rVar != null) {
                remoteViews2 = remoteViews;
                c(context2, remoteViews2, rVar, i5);
            } else {
                remoteViews2 = remoteViews;
            }
            if (kVar != null) {
                b(context2, remoteViews2, kVar, i5);
            }
        } else {
            remoteViews2 = remoteViews;
            if (Build.VERSION.SDK_INT < 31) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (rVar != null) {
                    cVar = rVar.b;
                } else {
                    cVar = null;
                }
                if (kVar != null) {
                    cVar2 = kVar.b;
                } else {
                    cVar2 = null;
                }
                if (d(cVar) || d(cVar2)) {
                    if (!(cVar instanceof c.C0130c) && !(cVar instanceof c.b)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!(cVar2 instanceof c.C0130c) && !(cVar2 instanceof c.b)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z3 && z4) {
                        i = R.layout.size_match_match;
                    } else if (z3) {
                        i = R.layout.size_match_wrap;
                    } else if (z4) {
                        i = R.layout.size_wrap_match;
                    } else {
                        i = R.layout.size_wrap_wrap;
                    }
                    int y = com.amazon.aps.iva.ff0.b.y(remoteViews2, a2Var, R.id.sizeViewStub, i, 8);
                    if (cVar instanceof c.a) {
                        float f2 = ((c.a) cVar).a;
                        com.amazon.aps.iva.yb0.j.f(context2, "context");
                        DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                        com.amazon.aps.iva.yb0.j.e(displayMetrics, "context.resources.displayMetrics");
                        remoteViews2.setInt(y, "setWidth", com.amazon.aps.iva.ff0.b.H(f2, displayMetrics));
                    } else if (cVar instanceof c.d) {
                        Resources resources = context2.getResources();
                        ((c.d) cVar).getClass();
                        remoteViews2.setInt(y, "setWidth", resources.getDimensionPixelSize(0));
                    } else {
                        if (com.amazon.aps.iva.yb0.j.a(cVar, c.b.a)) {
                            a2 = true;
                        } else {
                            a2 = com.amazon.aps.iva.yb0.j.a(cVar, c.C0130c.a);
                        }
                        if (a2) {
                            a3 = true;
                        } else {
                            a3 = com.amazon.aps.iva.yb0.j.a(cVar, c.e.a);
                        }
                        if (a3 || cVar == null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (!z5) {
                            throw new com.amazon.aps.iva.kb0.h();
                        }
                    }
                    if (cVar2 instanceof c.a) {
                        float f3 = ((c.a) cVar2).a;
                        com.amazon.aps.iva.yb0.j.f(context2, "context");
                        DisplayMetrics displayMetrics2 = context2.getResources().getDisplayMetrics();
                        com.amazon.aps.iva.yb0.j.e(displayMetrics2, "context.resources.displayMetrics");
                        remoteViews2.setInt(y, "setHeight", com.amazon.aps.iva.ff0.b.H(f3, displayMetrics2));
                    } else if (cVar2 instanceof c.d) {
                        Resources resources2 = context2.getResources();
                        ((c.d) cVar2).getClass();
                        remoteViews2.setInt(y, "setHeight", resources2.getDimensionPixelSize(0));
                    } else {
                        if (com.amazon.aps.iva.yb0.j.a(cVar2, c.b.a)) {
                            a4 = true;
                        } else {
                            a4 = com.amazon.aps.iva.yb0.j.a(cVar2, c.C0130c.a);
                        }
                        if (a4) {
                            a5 = true;
                        } else {
                            a5 = com.amazon.aps.iva.yb0.j.a(cVar2, c.e.a);
                        }
                        if (a5 || cVar2 == null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (!z6) {
                            throw new com.amazon.aps.iva.kb0.h();
                        }
                    }
                }
            } else {
                throw new IllegalStateException("There is currently no valid use case where a complex view is used on Android S".toString());
            }
        }
        com.amazon.aps.iva.q4.b bVar = (com.amazon.aps.iva.q4.b) d0Var6.b;
        com.amazon.aps.iva.s4.d dVar = com.amazon.aps.iva.s4.d.a;
        boolean z8 = a2Var.p;
        boolean z9 = a2Var.f;
        Integer num = a2Var.n;
        if (bVar != null) {
            com.amazon.aps.iva.q4.a aVar = bVar.b;
            com.amazon.aps.iva.yb0.j.f(aVar, "action");
            if (num != null) {
                i4 = num.intValue();
            } else {
                i4 = i5;
            }
            try {
                if (z9) {
                    Intent t = com.amazon.aps.iva.aq.j.t(aVar, a2Var, i4, com.amazon.aps.iva.s4.f.h);
                    if ((aVar instanceof com.amazon.aps.iva.s4.h) && Build.VERSION.SDK_INT >= 31) {
                        dVar.b(remoteViews2, i4, t);
                        remoteViews2.setOnClickFillInIntent(i4, null);
                    } else {
                        remoteViews2.setOnClickFillInIntent(i4, t);
                    }
                } else {
                    PendingIntent x = com.amazon.aps.iva.aq.j.x(aVar, a2Var, i4, com.amazon.aps.iva.s4.g.h);
                    if ((aVar instanceof com.amazon.aps.iva.s4.h) && Build.VERSION.SDK_INT >= 31) {
                        dVar.a(remoteViews2, i4, x);
                        remoteViews2.setOnClickPendingIntent(i4, null);
                    } else {
                        remoteViews2.setOnClickPendingIntent(i4, x);
                    }
                }
                if (z8 && !(aVar instanceof com.amazon.aps.iva.s4.h) && Build.VERSION.SDK_INT >= 31) {
                    dVar.c(remoteViews2, i4);
                }
            } catch (Throwable unused) {
                aVar.toString();
            }
        }
        if (d0Var6.b == 0 && zVar.b && !a2Var.o) {
            if (num != null) {
                i3 = num.intValue();
            } else {
                i3 = i5;
            }
            if (z8 && Build.VERSION.SDK_INT >= 31) {
                dVar.c(remoteViews2, i3);
                dVar.d(remoteViews2, i3);
            } else if (z9) {
                remoteViews2.setOnClickFillInIntent(i3, null);
            } else {
                remoteViews2.setOnClickPendingIntent(i3, null);
            }
        }
        com.amazon.aps.iva.b5.c cVar3 = (com.amazon.aps.iva.b5.c) d0Var4.b;
        if (cVar3 != null && Build.VERSION.SDK_INT >= 31) {
            c.a.a(remoteViews2, i5, cVar3);
        }
        com.amazon.aps.iva.y4.m mVar = (com.amazon.aps.iva.y4.m) d0Var3.b;
        if (mVar != null) {
            Resources resources3 = context.getResources();
            com.amazon.aps.iva.yb0.j.e(resources3, "context.resources");
            com.amazon.aps.iva.y4.l lVar = mVar.b;
            float k = com.amazon.aps.iva.e.w.k(lVar.b, resources3) + lVar.a;
            com.amazon.aps.iva.y4.l lVar2 = mVar.c;
            float k2 = com.amazon.aps.iva.e.w.k(lVar2.b, resources3) + lVar2.a;
            com.amazon.aps.iva.y4.l lVar3 = mVar.d;
            float k3 = com.amazon.aps.iva.e.w.k(lVar3.b, resources3) + lVar3.a;
            com.amazon.aps.iva.y4.l lVar4 = mVar.e;
            float k4 = com.amazon.aps.iva.e.w.k(lVar4.b, resources3) + lVar4.a;
            com.amazon.aps.iva.y4.l lVar5 = mVar.f;
            float k5 = com.amazon.aps.iva.e.w.k(lVar5.b, resources3) + lVar5.a;
            com.amazon.aps.iva.y4.l lVar6 = mVar.g;
            float k6 = com.amazon.aps.iva.e.w.k(lVar6.b, resources3) + lVar6.a;
            boolean z10 = a2Var.c;
            if (z10) {
                f = k5;
            } else {
                f = k2;
            }
            float f4 = f + k;
            if (!z10) {
                k2 = k5;
            }
            DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
            int i6 = n0Var.a;
            com.amazon.aps.iva.yb0.j.e(displayMetrics3, "displayMetrics");
            z7 = true;
            remoteViews.setViewPadding(i6, (int) TypedValue.applyDimension(1, f4, displayMetrics3), (int) TypedValue.applyDimension(1, k3, displayMetrics3), (int) TypedValue.applyDimension(1, k4 + k2, displayMetrics3), (int) TypedValue.applyDimension(1, k6, displayMetrics3));
        } else {
            z7 = true;
        }
        if (((h) d0Var8.b) != null && Build.VERSION.SDK_INT >= 31) {
            remoteViews2.setBoolean(i5, "setClipToOutline", z7);
        }
        u uVar = (u) d0Var7.b;
        if (uVar != null) {
            remoteViews2.setBoolean(i5, "setEnabled", uVar.b);
        }
        int i7 = a.a[((com.amazon.aps.iva.p4.s) d0Var5.b).ordinal()];
        if (i7 != z7) {
            if (i7 != 2) {
                if (i7 == 3) {
                    i2 = 8;
                } else {
                    throw new com.amazon.aps.iva.kb0.h();
                }
            } else {
                i2 = 4;
            }
        } else {
            i2 = 0;
        }
        remoteViews2.setViewVisibility(i5, i2);
    }

    public static final void b(Context context, RemoteViews remoteViews, com.amazon.aps.iva.y4.k kVar, int i) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
        int i2 = Build.VERSION.SDK_INT;
        com.amazon.aps.iva.b5.c cVar = kVar.b;
        if (i2 < 31) {
            if (com.amazon.aps.iva.ee0.f1.K(c.e.a, c.C0130c.a, c.b.a).contains(y0.d(cVar, context))) {
                return;
            }
            throw new IllegalArgumentException("Using a height of " + cVar + " requires a complex layout before API 31");
        } else if (i2 < 33 && com.amazon.aps.iva.ee0.f1.K(c.e.a, c.b.a).contains(cVar)) {
        } else {
            c.a.b(remoteViews, i, cVar);
        }
    }

    public static final void c(Context context, RemoteViews remoteViews, com.amazon.aps.iva.y4.r rVar, int i) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
        int i2 = Build.VERSION.SDK_INT;
        com.amazon.aps.iva.b5.c cVar = rVar.b;
        if (i2 < 31) {
            if (com.amazon.aps.iva.ee0.f1.K(c.e.a, c.C0130c.a, c.b.a).contains(y0.d(cVar, context))) {
                return;
            }
            throw new IllegalArgumentException("Using a width of " + cVar + " requires a complex layout before API 31");
        } else if (i2 < 33 && com.amazon.aps.iva.ee0.f1.K(c.e.a, c.b.a).contains(cVar)) {
        } else {
            c.a.c(remoteViews, i, cVar);
        }
    }

    public static final boolean d(com.amazon.aps.iva.b5.c cVar) {
        boolean z;
        boolean a2;
        boolean a3;
        boolean z2 = true;
        if (cVar instanceof c.a) {
            z = true;
        } else {
            z = cVar instanceof c.d;
        }
        if (z) {
            return true;
        }
        if (com.amazon.aps.iva.yb0.j.a(cVar, c.b.a)) {
            a2 = true;
        } else {
            a2 = com.amazon.aps.iva.yb0.j.a(cVar, c.C0130c.a);
        }
        if (a2) {
            a3 = true;
        } else {
            a3 = com.amazon.aps.iva.yb0.j.a(cVar, c.e.a);
        }
        if (!a3 && cVar != null) {
            z2 = false;
        }
        if (z2) {
            return false;
        }
        throw new com.amazon.aps.iva.kb0.h();
    }
}
