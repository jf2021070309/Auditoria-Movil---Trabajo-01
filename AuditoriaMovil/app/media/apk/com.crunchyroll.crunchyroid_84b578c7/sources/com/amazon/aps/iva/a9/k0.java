package com.amazon.aps.iva.a9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import com.amazon.aps.iva.ee0.a1;
import com.amazon.aps.iva.j0.f1;
import com.amazon.aps.iva.p3.s0;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.cast.dependencies.CastResources;
import java.lang.reflect.Field;
import java.util.List;
/* compiled from: ViewUtilsBase.java */
/* loaded from: classes.dex */
public class k0 implements CastResources, com.amazon.aps.iva.oq.b, s0 {
    public static Field a;
    public static boolean b;
    public static com.amazon.aps.iva.in.a c;
    public static com.ellation.crunchyroll.downloading.bulk.g d;
    public static final int[] e = new int[0];
    public static final long[] f = new long[0];
    public static final Object[] g = new Object[0];
    public static final int[] h = {16842912};
    public static final int[] i = {-16842912};

    public static int e(int i2, int i3, int[] iArr) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else if (i7 > i3) {
                i4 = i6 - 1;
            } else {
                return i6;
            }
        }
        return ~i5;
    }

    public static int f(long[] jArr, int i2, long j) {
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = (jArr[i5] > j ? 1 : (jArr[i5] == j ? 0 : -1));
            if (i6 < 0) {
                i4 = i5 + 1;
            } else if (i6 > 0) {
                i3 = i5 - 1;
            } else {
                return i5;
            }
        }
        return ~i4;
    }

    public static final long g(long j, boolean z, int i2, float f2) {
        int i3;
        boolean z2;
        boolean z3 = true;
        if (!z) {
            if (i2 == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z3 = false;
            }
        }
        if (z3 && com.amazon.aps.iva.o2.a.d(j)) {
            i3 = com.amazon.aps.iva.o2.a.h(j);
        } else {
            i3 = Integer.MAX_VALUE;
        }
        if (com.amazon.aps.iva.o2.a.j(j) != i3) {
            i3 = com.amazon.aps.iva.aq.j.j(f1.a(f2), com.amazon.aps.iva.o2.a.j(j), i3);
        }
        return com.amazon.aps.iva.o2.b.b(i3, com.amazon.aps.iva.o2.a.g(j), 5);
    }

    public static final void h(int i2, com.amazon.aps.iva.ka0.y yVar, boolean z) {
        com.amazon.aps.iva.yb0.j.f(yVar, "<this>");
        if (yVar.c == com.amazon.aps.iva.ka0.u.PLAYING_ADS) {
            return;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        com.amazon.aps.iva.ia0.b.a("PlayerUtils", "entering ENDED");
                        yVar.a(new com.amazon.aps.iva.fa0.r(null, 0));
                        yVar.a(new com.amazon.aps.iva.fa0.k(null, 0));
                        yVar.c = com.amazon.aps.iva.ka0.u.ENDED;
                        return;
                    }
                    return;
                }
                com.amazon.aps.iva.ia0.b.a("PlayerUtils", "entering READY");
                if (yVar.c == com.amazon.aps.iva.ka0.u.SEEKING) {
                    yVar.f();
                }
                if (z) {
                    yVar.e();
                    return;
                } else if (yVar.c != com.amazon.aps.iva.ka0.u.PAUSED) {
                    yVar.c();
                    return;
                } else {
                    return;
                }
            }
            com.amazon.aps.iva.ia0.b.a("PlayerUtils", "entering BUFFERING");
            com.amazon.aps.iva.ka0.u uVar = yVar.c;
            com.amazon.aps.iva.ka0.u uVar2 = com.amazon.aps.iva.ka0.u.BUFFERING;
            com.amazon.aps.iva.ka0.u uVar3 = com.amazon.aps.iva.ka0.u.REBUFFERING;
            if ((!com.amazon.aps.iva.lb0.o.N(new com.amazon.aps.iva.ka0.u[]{uVar2, uVar3, com.amazon.aps.iva.ka0.u.SEEKED}, uVar)) && !yVar.t) {
                if (yVar.c == com.amazon.aps.iva.ka0.u.PLAYING) {
                    yVar.c = uVar3;
                    yVar.a(new com.amazon.aps.iva.fa0.m(null, 1));
                    return;
                }
                yVar.c = uVar2;
                yVar.a(new com.amazon.aps.iva.fa0.s(null, 1));
                return;
            }
            return;
        }
        com.amazon.aps.iva.ia0.b.a("PlayerUtils", "entering IDLE");
        if (com.amazon.aps.iva.lb0.o.N(new com.amazon.aps.iva.ka0.u[]{com.amazon.aps.iva.ka0.u.PLAY, com.amazon.aps.iva.ka0.u.PLAYING}, yVar.c)) {
            yVar.c();
        }
    }

    public static final void i(com.amazon.aps.iva.ka0.y yVar, com.amazon.aps.iva.q5.d0 d0Var) {
        String obj;
        String uri;
        com.amazon.aps.iva.yb0.j.f(yVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(d0Var, "mediaMetadata");
        com.amazon.aps.iva.ga0.n nVar = new com.amazon.aps.iva.ga0.n();
        Uri uri2 = d0Var.m;
        if (uri2 != null && (uri = uri2.toString()) != null) {
            nVar.b("vpour", uri);
        }
        CharSequence charSequence = d0Var.b;
        if (charSequence != null && (obj = charSequence.toString()) != null) {
            nVar.b("vtt", obj);
        }
        com.amazon.aps.iva.ka0.a0 a0Var = yVar.a;
        a0Var.getClass();
        com.amazon.aps.iva.ea0.a aVar = new com.amazon.aps.iva.ea0.a();
        aVar.d = nVar;
        com.amazon.aps.iva.ca0.a.a(a0Var.d, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.amazon.aps.iva.ee0.a1 j(com.amazon.aps.iva.ee0.a1 r7, com.amazon.aps.iva.pc0.h r8) {
        /*
            java.lang.String r0 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r7, r0)
            com.amazon.aps.iva.pc0.h r0 = com.amazon.aps.iva.ee0.l.a(r7)
            if (r0 != r8) goto Lc
            return r7
        Lc:
            com.amazon.aps.iva.fc0.l<java.lang.Object>[] r0 = com.amazon.aps.iva.ee0.l.a
            r1 = 0
            r0 = r0[r1]
            com.amazon.aps.iva.ke0.q r2 = com.amazon.aps.iva.ee0.l.b
            java.lang.Object r0 = r2.getValue(r7, r0)
            com.amazon.aps.iva.ee0.k r0 = (com.amazon.aps.iva.ee0.k) r0
            r2 = 1
            if (r0 == 0) goto L61
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L23
            goto L52
        L23:
            com.amazon.aps.iva.ke0.c<T> r3 = r7.b
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L2e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r3.next()
            r6 = r5
            com.amazon.aps.iva.ee0.y0 r6 = (com.amazon.aps.iva.ee0.y0) r6
            boolean r6 = com.amazon.aps.iva.yb0.j.a(r6, r0)
            r6 = r6 ^ r2
            if (r6 == 0) goto L2e
            r4.add(r5)
            goto L2e
        L46:
            int r0 = r4.size()
            com.amazon.aps.iva.ke0.c<T> r3 = r7.b
            int r3 = r3.b()
            if (r0 != r3) goto L54
        L52:
            r0 = r7
            goto L5d
        L54:
            com.amazon.aps.iva.ee0.a1$a r0 = com.amazon.aps.iva.ee0.a1.c
            r0.getClass()
            com.amazon.aps.iva.ee0.a1 r0 = com.amazon.aps.iva.ee0.a1.a.c(r4)
        L5d:
            if (r0 != 0) goto L60
            goto L61
        L60:
            r7 = r0
        L61:
            java.util.Iterator r0 = r8.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L72
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L72
            return r7
        L72:
            com.amazon.aps.iva.ee0.k r0 = new com.amazon.aps.iva.ee0.k
            r0.<init>(r8)
            com.amazon.aps.iva.fc0.d r8 = r0.b()
            com.amazon.aps.iva.ee0.a1$a r3 = com.amazon.aps.iva.ee0.a1.c
            int r8 = r3.b(r8)
            com.amazon.aps.iva.ke0.c<T> r3 = r7.b
            java.lang.Object r8 = r3.get(r8)
            if (r8 == 0) goto L8a
            r1 = r2
        L8a:
            if (r1 == 0) goto L8d
            goto Lab
        L8d:
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L9d
            com.amazon.aps.iva.ee0.a1 r7 = new com.amazon.aps.iva.ee0.a1
            java.util.List r8 = com.amazon.aps.iva.ee0.f1.J(r0)
            r7.<init>(r8)
            goto Lab
        L9d:
            java.util.List r7 = com.amazon.aps.iva.lb0.x.X0(r7)
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.ArrayList r7 = com.amazon.aps.iva.lb0.x.M0(r7, r0)
            com.amazon.aps.iva.ee0.a1 r7 = com.amazon.aps.iva.ee0.a1.a.c(r7)
        Lab:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a9.k0.j(com.amazon.aps.iva.ee0.a1, com.amazon.aps.iva.pc0.h):com.amazon.aps.iva.ee0.a1");
    }

    public static final com.amazon.aps.iva.f1.x k(Context context, int i2, boolean z, Boolean bool) {
        int[] iArr;
        int i3;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        if (i2 == 0) {
            return null;
        }
        if (bool != null) {
            Configuration configuration = new Configuration();
            if (bool.booleanValue()) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            configuration.uiMode = i3;
            context = context.createConfigurationContext(configuration);
        }
        try {
            ColorStateList colorStateList = com.amazon.aps.iva.d3.a.getColorStateList(context, i2);
            if (colorStateList == null) {
                return null;
            }
            if (z) {
                iArr = h;
            } else {
                iArr = i;
            }
            return new com.amazon.aps.iva.f1.x(defpackage.i.d(colorStateList.getColorForState(iArr, colorStateList.getDefaultColor())));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static final a1 m(com.amazon.aps.iva.pc0.h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "<this>");
        if (hVar.isEmpty()) {
            a1.c.getClass();
            return a1.d;
        }
        a1.a aVar = a1.c;
        List J = com.amazon.aps.iva.ee0.f1.J(new com.amazon.aps.iva.ee0.k(hVar));
        aVar.getClass();
        return a1.a.c(J);
    }

    @Override // com.amazon.aps.iva.oq.d
    public com.amazon.aps.iva.eq.b b() {
        return new com.amazon.aps.iva.eq.b(0);
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastResources
    public int getFastForwardDrawableResId() {
        return R.drawable.ic_fast_forward_10;
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastResources
    public int getRewindBackDrawableResId() {
        return R.drawable.ic_rewind_back_10;
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastResources
    public int getSubscriptionButtonLayoutResId() {
        return R.layout.layout_subscription_button;
    }

    public void l(int i2, View view) {
        if (!b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            b = true;
        }
        Field field = a;
        if (field != null) {
            try {
                a.setInt(view, i2 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void c() {
    }

    public void a(View view) {
    }

    @Override // com.amazon.aps.iva.oq.b
    public void d(com.amazon.aps.iva.eq.b bVar) {
    }
}
