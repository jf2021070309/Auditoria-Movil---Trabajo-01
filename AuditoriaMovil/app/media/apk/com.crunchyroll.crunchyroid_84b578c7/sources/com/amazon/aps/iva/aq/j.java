package com.amazon.aps.iva.aq;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.node.p;
import androidx.fragment.app.Fragment;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import com.amazon.aps.iva.a0.m1;
import com.amazon.aps.iva.a0.n1;
import com.amazon.aps.iva.a0.o1;
import com.amazon.aps.iva.a0.p1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.q1;
import com.amazon.aps.iva.ef0.a0;
import com.amazon.aps.iva.g1.u;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.lb0.c0;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.pd0.n;
import com.amazon.aps.iva.q4.c;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.qm.y;
import com.amazon.aps.iva.r4.a2;
import com.amazon.aps.iva.s4.q;
import com.amazon.aps.iva.s4.s;
import com.amazon.aps.iva.s4.t;
import com.amazon.aps.iva.v1.d1;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.xw.w;
import com.amazon.aps.iva.y.i1;
import com.amazon.aps.iva.y.j1;
import com.amazon.aps.iva.yw.d0;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.search.SearchItemsContainer;
import com.ellation.crunchyroll.mvp.lifecycle.LifecycleAwareLazy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: NoOpAppVersionProvider.kt */
/* loaded from: classes2.dex */
public class j implements b, com.amazon.aps.iva.sp.b {
    public static com.amazon.aps.iva.ql.i a;
    public static final com.amazon.aps.iva.o2.d b = new com.amazon.aps.iva.o2.d(1.0f, 1.0f);

    public static final com.amazon.aps.iva.wm.a A(com.amazon.aps.iva.ym.c cVar, boolean z) {
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        com.amazon.aps.iva.wm.a aVar = com.amazon.aps.iva.wm.a.SWITCH_PROFILE_ADD;
        com.amazon.aps.iva.wm.a aVar2 = cVar.e;
        if (aVar2 == aVar) {
            return aVar2;
        }
        boolean z2 = cVar.h;
        if (z) {
            if (z2) {
                return com.amazon.aps.iva.wm.a.SWITCH_PROFILE_EDIT;
            }
            return com.amazon.aps.iva.wm.a.SWITCH_PROFILE_DELETE;
        }
        if (com.amazon.aps.iva.yb0.j.a(cVar.f, Boolean.TRUE)) {
            return com.amazon.aps.iva.wm.a.SWITCH_PROFILE_SELECTED;
        }
        if (!z2) {
            return com.amazon.aps.iva.wm.a.SWITCH_PROFILE_PREMIUM_BLOCKED;
        }
        return com.amazon.aps.iva.wm.a.SWITCH_PROFILE_DEFAULT;
    }

    public static final boolean B(e0 e0Var) {
        y0 y0Var;
        com.amazon.aps.iva.oc0.h k = e0Var.I0().k();
        if (k instanceof y0) {
            y0Var = (y0) k;
        } else {
            y0Var = null;
        }
        if (y0Var == null) {
            return false;
        }
        return L(com.amazon.aps.iva.da0.a.o(y0Var));
    }

    public static final com.amazon.aps.iva.lb0.e0 C(Object[] objArr) {
        com.amazon.aps.iva.yb0.j.f(objArr, "array");
        return new com.amazon.aps.iva.lb0.e0(objArr);
    }

    public static final byte[] D(Collection collection, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i;
        com.amazon.aps.iva.yb0.j.f(collection, "<this>");
        com.amazon.aps.iva.yb0.j.f(bArr, "separator");
        com.amazon.aps.iva.yb0.j.f(bArr2, "prefix");
        com.amazon.aps.iva.yb0.j.f(bArr3, "suffix");
        Collection<byte[]> collection2 = collection;
        int i2 = 0;
        for (byte[] bArr4 : collection2) {
            i2 += bArr4.length;
        }
        if (!collection.isEmpty()) {
            i = (collection.size() - 1) * bArr.length;
        } else {
            i = 0;
        }
        byte[] bArr5 = new byte[bArr2.length + i2 + i + bArr3.length];
        n(bArr2, bArr5, 0, bArr2.length);
        int length = bArr2.length + 0;
        Iterator it = x.d1(collection2).iterator();
        while (true) {
            com.amazon.aps.iva.lb0.e0 e0Var = (com.amazon.aps.iva.lb0.e0) it;
            if (e0Var.hasNext()) {
                c0 c0Var = (c0) e0Var.next();
                byte[] bArr6 = (byte[]) c0Var.b;
                n(bArr6, bArr5, length, bArr6.length);
                length += ((byte[]) c0Var.b).length;
                if (c0Var.a != collection.size() - 1) {
                    n(bArr, bArr5, length, bArr.length);
                    length += bArr.length;
                }
            } else {
                n(bArr3, bArr5, length, bArr3.length);
                return bArr5;
            }
        }
    }

    public static final com.amazon.aps.iva.md0.e E(com.amazon.aps.iva.ae0.m mVar) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        mVar.c();
        return com.amazon.aps.iva.md0.e.g;
    }

    public static final LifecycleAwareLazy F(o oVar, com.amazon.aps.iva.xb0.a aVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(aVar, "initializer");
        return new LifecycleAwareLazy(oVar, aVar);
    }

    public static p1 G(com.amazon.aps.iva.o0.i iVar) {
        p1 p1Var;
        iVar.s(1809802212);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        com.amazon.aps.iva.a1.f fVar = com.amazon.aps.iva.a0.d.a;
        iVar.s(-81138291);
        Context context = (Context) iVar.i(androidx.compose.ui.platform.d.b);
        n1 n1Var = (n1) iVar.i(o1.a);
        if (n1Var != null) {
            iVar.s(511388516);
            boolean H = iVar.H(context) | iVar.H(n1Var);
            Object t = iVar.t();
            if (H || t == i.a.a) {
                t = new com.amazon.aps.iva.a0.b(context, n1Var);
                iVar.n(t);
            }
            iVar.G();
            p1Var = (p1) t;
        } else {
            p1Var = m1.a;
        }
        iVar.G();
        iVar.G();
        return p1Var;
    }

    public static final String H(com.amazon.aps.iva.nd0.f fVar) {
        boolean z;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
        String b2 = fVar.b();
        com.amazon.aps.iva.yb0.j.e(b2, "asString()");
        boolean z3 = true;
        if (!n.a.contains(b2)) {
            int i = 0;
            while (true) {
                if (i < b2.length()) {
                    char charAt = b2.charAt(i);
                    if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                z3 = false;
            }
        }
        if (z3) {
            StringBuilder sb = new StringBuilder();
            String b3 = fVar.b();
            com.amazon.aps.iva.yb0.j.e(b3, "asString()");
            sb.append("`".concat(b3));
            sb.append('`');
            return sb.toString();
        }
        String b4 = fVar.b();
        com.amazon.aps.iva.yb0.j.e(b4, "asString()");
        return b4;
    }

    public static final String I(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.nd0.f fVar = (com.amazon.aps.iva.nd0.f) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(H(fVar));
        }
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final String J(String str, String str2, String str3, String str4, String str5) {
        com.amazon.aps.iva.yb0.j.f(str, "lowerRendered");
        com.amazon.aps.iva.yb0.j.f(str2, "lowerPrefix");
        com.amazon.aps.iva.yb0.j.f(str3, "upperRendered");
        com.amazon.aps.iva.yb0.j.f(str4, "upperPrefix");
        com.amazon.aps.iva.yb0.j.f(str5, "foldedPrefix");
        if (com.amazon.aps.iva.oe0.m.h0(str, str2, false) && com.amazon.aps.iva.oe0.m.h0(str3, str4, false)) {
            String substring = str.substring(str2.length());
            com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String).substring(startIndex)");
            String substring2 = str3.substring(str4.length());
            com.amazon.aps.iva.yb0.j.e(substring2, "this as java.lang.String).substring(startIndex)");
            String concat = str5.concat(substring);
            if (com.amazon.aps.iva.yb0.j.a(substring, substring2)) {
                return concat;
            }
            if (S(substring, substring2)) {
                return concat + '!';
            }
            return null;
        }
        return null;
    }

    public static final p K(androidx.compose.ui.node.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "<this>");
        p pVar = eVar.j;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }

    public static final boolean L(com.amazon.aps.iva.ee0.e0 e0Var) {
        boolean z;
        boolean z2;
        com.amazon.aps.iva.oc0.h k = e0Var.I0().k();
        if (k != null) {
            if (com.amazon.aps.iva.qd0.k.b(k) && !com.amazon.aps.iva.yb0.j.a(com.amazon.aps.iva.ud0.b.g((com.amazon.aps.iva.oc0.e) k), com.amazon.aps.iva.lc0.o.g)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                z = true;
                if (z && !B(e0Var)) {
                    return false;
                }
            }
        }
        z = false;
        return z ? true : true;
    }

    public static final void M(Object obj) {
        com.amazon.aps.iva.yb0.j.f(obj, "target");
        WeakHashMap<Object, Collection<v<?, ?>>> weakHashMap = w.a;
        Collection<v<?, ?>> collection = w.a.get(obj);
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                ((v) it.next()).b = v.a.a;
            }
        }
    }

    public static final int N(a0 a0Var, int i) {
        int i2;
        com.amazon.aps.iva.yb0.j.f(a0Var, "<this>");
        int i3 = i + 1;
        int length = a0Var.f.length;
        int[] iArr = a0Var.g;
        com.amazon.aps.iva.yb0.j.f(iArr, "<this>");
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 < i3) {
                    i5 = i2 + 1;
                } else if (i6 <= i3) {
                    break;
                } else {
                    i4 = i2 - 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        if (i2 < 0) {
            return ~i2;
        }
        return i2;
    }

    public static final com.amazon.aps.iva.ec0.h O(com.amazon.aps.iva.ec0.j jVar, int i) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(jVar, "<this>");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Integer valueOf = Integer.valueOf(i);
        com.amazon.aps.iva.yb0.j.f(valueOf, "step");
        if (z) {
            if (jVar.d <= 0) {
                i = -i;
            }
            return new com.amazon.aps.iva.ec0.h(jVar.b, jVar.c, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static q1 P(List list, com.amazon.aps.iva.ee0.m1 m1Var, com.amazon.aps.iva.oc0.k kVar, List list2) {
        if (m1Var != null) {
            if (kVar != null) {
                if (list2 != null) {
                    q1 Q = Q(list, m1Var, kVar, list2, null);
                    if (Q != null) {
                        return Q;
                    }
                    throw new AssertionError("Substitution failed");
                }
                e(3);
                throw null;
            }
            e(2);
            throw null;
        }
        e(1);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.aps.iva.ee0.q1 Q(java.util.List r16, com.amazon.aps.iva.ee0.m1 r17, com.amazon.aps.iva.oc0.k r18, java.util.List r19, boolean[] r20) {
        /*
            r0 = r17
            r1 = r19
            r2 = 0
            if (r0 == 0) goto Le8
            if (r18 == 0) goto Le3
            if (r1 == 0) goto Ldd
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.Iterator r12 = r16.iterator()
            r13 = 0
            r8 = r13
        L1b:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r12.next()
            r14 = r3
            com.amazon.aps.iva.oc0.y0 r14 = (com.amazon.aps.iva.oc0.y0) r14
            com.amazon.aps.iva.pc0.h r4 = r14.getAnnotations()
            boolean r5 = r14.w()
            com.amazon.aps.iva.ee0.v1 r6 = r14.i()
            com.amazon.aps.iva.nd0.f r7 = r14.getName()
            int r15 = r8 + 1
            com.amazon.aps.iva.de0.l r9 = r14.K()
            r3 = r18
            com.amazon.aps.iva.rc0.t0 r3 = com.amazon.aps.iva.rc0.t0.J0(r3, r4, r5, r6, r7, r8, r9)
            com.amazon.aps.iva.ee0.c1 r4 = r14.h()
            com.amazon.aps.iva.ee0.l1 r5 = new com.amazon.aps.iva.ee0.l1
            com.amazon.aps.iva.ee0.m0 r6 = r3.m()
            r5.<init>(r6)
            r10.put(r4, r5)
            r11.put(r14, r3)
            r1.add(r3)
            r8 = r15
            goto L1b
        L5c:
            com.amazon.aps.iva.ee0.e1$a r1 = com.amazon.aps.iva.ee0.e1.b
            com.amazon.aps.iva.ee0.d1 r1 = new com.amazon.aps.iva.ee0.d1
            r1.<init>(r10, r13)
            com.amazon.aps.iva.ee0.q1 r3 = com.amazon.aps.iva.ee0.q1.f(r0, r1)
            com.amazon.aps.iva.ee0.n1 r4 = new com.amazon.aps.iva.ee0.n1
            r4.<init>(r0)
            com.amazon.aps.iva.ee0.q1 r0 = com.amazon.aps.iva.ee0.q1.f(r4, r1)
            java.util.Iterator r1 = r16.iterator()
        L74:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Ldc
            java.lang.Object r4 = r1.next()
            com.amazon.aps.iva.oc0.y0 r4 = (com.amazon.aps.iva.oc0.y0) r4
            java.lang.Object r5 = r11.get(r4)
            com.amazon.aps.iva.rc0.t0 r5 = (com.amazon.aps.iva.rc0.t0) r5
            java.util.List r4 = r4.getUpperBounds()
            java.util.Iterator r4 = r4.iterator()
        L8e:
            boolean r6 = r4.hasNext()
            r7 = 1
            if (r6 == 0) goto Ld6
            java.lang.Object r6 = r4.next()
            com.amazon.aps.iva.ee0.e0 r6 = (com.amazon.aps.iva.ee0.e0) r6
            com.amazon.aps.iva.ee0.c1 r8 = r6.I0()
            com.amazon.aps.iva.oc0.h r8 = r8.k()
            boolean r9 = r8 instanceof com.amazon.aps.iva.oc0.y0
            if (r9 == 0) goto Lb6
            com.amazon.aps.iva.oc0.y0 r8 = (com.amazon.aps.iva.oc0.y0) r8
            java.lang.String r9 = "typeParameter"
            com.amazon.aps.iva.yb0.j.f(r8, r9)
            boolean r8 = com.amazon.aps.iva.da0.a.q(r8, r2, r2)
            if (r8 == 0) goto Lb6
            r8 = r3
            goto Lb7
        Lb6:
            r8 = r0
        Lb7:
            com.amazon.aps.iva.ee0.v1 r9 = com.amazon.aps.iva.ee0.v1.OUT_VARIANCE
            com.amazon.aps.iva.ee0.e0 r8 = r8.k(r6, r9)
            if (r8 != 0) goto Lc0
            return r2
        Lc0:
            if (r8 == r6) goto Lc6
            if (r20 == 0) goto Lc6
            r20[r13] = r7
        Lc6:
            r5.I0()
            boolean r6 = com.amazon.aps.iva.e4.l1.D(r8)
            if (r6 == 0) goto Ld0
            goto L8e
        Ld0:
            java.util.ArrayList r6 = r5.m
            r6.add(r8)
            goto L8e
        Ld6:
            r5.I0()
            r5.n = r7
            goto L74
        Ldc:
            return r3
        Ldd:
            r0 = 8
            e(r0)
            throw r2
        Le3:
            r0 = 7
            e(r0)
            throw r2
        Le8:
            r0 = 6
            e(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.aq.j.Q(java.util.List, com.amazon.aps.iva.ee0.m1, com.amazon.aps.iva.oc0.k, java.util.List, boolean[]):com.amazon.aps.iva.ee0.q1");
    }

    public static final List R(List list, List list2) {
        List items;
        String id;
        com.amazon.aps.iva.yb0.j.f(list, "<this>");
        com.amazon.aps.iva.yb0.j.f(list2, "loadingItems");
        SearchItemsContainer searchItemsContainer = (SearchItemsContainer) x.v0(list);
        if (searchItemsContainer != null && (items = searchItemsContainer.getItems()) != null) {
            List list3 = items;
            ArrayList arrayList = new ArrayList(r.Y(list3));
            int i = 0;
            for (Object obj : list3) {
                int i2 = i + 1;
                if (i >= 0) {
                    Panel panel = (Panel) obj;
                    com.amazon.aps.iva.iv.a aVar = (com.amazon.aps.iva.iv.a) x.w0(i, list2);
                    if (aVar == null || (id = aVar.b) == null) {
                        id = panel.getId();
                    }
                    arrayList.add(new com.amazon.aps.iva.iv.c(id, panel));
                    i = i2;
                } else {
                    f1.S();
                    throw null;
                }
            }
            return arrayList;
        }
        return z.b;
    }

    public static final boolean S(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "lower");
        com.amazon.aps.iva.yb0.j.f(str2, "upper");
        if (!com.amazon.aps.iva.yb0.j.a(str, com.amazon.aps.iva.oe0.m.f0(str2, "?", "")) && (!com.amazon.aps.iva.oe0.m.Y(str2, "?", false) || !com.amazon.aps.iva.yb0.j.a(str.concat("?"), str2))) {
            if (!com.amazon.aps.iva.yb0.j.a("(" + str + ")?", str2)) {
                return false;
            }
        }
        return true;
    }

    public static final com.amazon.aps.iva.ec0.j T(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            com.amazon.aps.iva.ec0.j jVar = com.amazon.aps.iva.ec0.j.e;
            return com.amazon.aps.iva.ec0.j.e;
        }
        return new com.amazon.aps.iva.ec0.j(i, i2 - 1);
    }

    public static /* synthetic */ void e(int i) {
        String str;
        int i2;
        if (i != 4) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        if (i != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static com.amazon.aps.iva.f1.i f(int i, int i2, int i3, int i4) {
        u uVar;
        boolean z = false;
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        if ((i4 & 8) != 0) {
            z = true;
        }
        if ((i4 & 16) != 0) {
            uVar = com.amazon.aps.iva.g1.g.c;
        } else {
            uVar = null;
        }
        com.amazon.aps.iva.yb0.j.f(uVar, "colorSpace");
        com.amazon.aps.iva.f1.j.b(i3);
        return new com.amazon.aps.iva.f1.i(com.amazon.aps.iva.f1.o.b(i, i2, i3, z, uVar));
    }

    public static final void g(l0 l0Var, b0 b0Var, int i) {
        com.amazon.aps.iva.yb0.j.f(b0Var, "mediaItem");
        String str = b0Var.b;
        com.amazon.aps.iva.yb0.j.e(str, "mediaItem.mediaId");
        Integer u = u(l0Var, str);
        if (u != null) {
            l0Var.E(u.intValue());
        }
        l0Var.A0(i, b0Var);
    }

    public static final double h(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            if (d > d3) {
                return d3;
            }
            return d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static final float i(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            if (f > f3) {
                return f3;
            }
            return f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static final int j(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            if (i > i3) {
                return i3;
            }
            return i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static final long k(long j, long j2) {
        if (0 <= j2) {
            if (j < 0) {
                return 0L;
            }
            if (j > j2) {
                return j2;
            }
            return j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j2 + " is less than minimum 0.");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Comparable] */
    public static final Comparable l(Comparable comparable, com.amazon.aps.iva.ec0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(comparable, "<this>");
        com.amazon.aps.iva.yb0.j.f(fVar, "range");
        if (!fVar.isEmpty()) {
            if (fVar.b(comparable, fVar.d()) && !fVar.b(fVar.d(), comparable)) {
                return fVar.d();
            }
            if (fVar.b(fVar.e(), comparable) && !fVar.b(comparable, fVar.e())) {
                return fVar.e();
            }
            return comparable;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + fVar + '.');
    }

    public static final com.amazon.aps.iva.o0.q1 m(com.amazon.aps.iva.c0.k kVar, com.amazon.aps.iva.o0.i iVar, int i) {
        com.amazon.aps.iva.yb0.j.f(kVar, "<this>");
        iVar.s(-1805515472);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        iVar.s(-492369756);
        Object t = iVar.t();
        Object obj = i.a.a;
        if (t == obj) {
            t = com.amazon.aps.iva.cq.b.c0(Boolean.FALSE);
            iVar.n(t);
        }
        iVar.G();
        com.amazon.aps.iva.o0.q1 q1Var = (com.amazon.aps.iva.o0.q1) t;
        iVar.s(511388516);
        boolean H = iVar.H(kVar) | iVar.H(q1Var);
        Object t2 = iVar.t();
        if (H || t2 == obj) {
            t2 = new com.amazon.aps.iva.c0.f(kVar, q1Var, null);
            iVar.n(t2);
        }
        iVar.G();
        x0.c(kVar, (com.amazon.aps.iva.xb0.p) t2, iVar);
        iVar.G();
        return q1Var;
    }

    public static final void n(byte[] bArr, byte[] bArr2, int i, int i2) {
        com.amazon.aps.iva.yb0.j.f(bArr, "<this>");
        if (i + i2 > bArr2.length) {
            com.amazon.aps.iva.iq.a.e(com.amazon.aps.iva.dq.c.a, "Cannot copy ByteArray, dest doesn't have enough space", null, 6);
        } else if (0 + i2 > bArr.length) {
            com.amazon.aps.iva.iq.a.e(com.amazon.aps.iva.dq.c.a, "Cannot copy ByteArray, src doesn't have enough data", null, 6);
        } else {
            System.arraycopy(bArr, 0, bArr2, i, i2);
        }
    }

    public static y o(Fragment fragment) {
        com.amazon.aps.iva.yb0.j.f(fragment, "fragment");
        com.amazon.aps.iva.ox.b bVar = new com.amazon.aps.iva.ox.b(fragment);
        com.amazon.aps.iva.fm.f fVar = com.amazon.aps.iva.fm.g.e;
        if (fVar != null) {
            com.amazon.aps.iva.qm.i iVar = new com.amazon.aps.iva.qm.i(new com.amazon.aps.iva.qm.a(fVar.f()), com.amazon.aps.iva.qm.b.h, bVar);
            com.amazon.aps.iva.pm.e b2 = ((d0) com.ellation.crunchyroll.application.e.a()).c.b();
            com.amazon.aps.iva.fm.g gVar = com.amazon.aps.iva.fm.g.f;
            if (gVar != null) {
                com.amazon.aps.iva.yb0.j.f(b2, "userProfileStore");
                com.amazon.aps.iva.fm.e eVar = gVar.c;
                com.amazon.aps.iva.yb0.j.f(eVar, "profileActivationFlowMonitor");
                return new y(b2, iVar, eVar);
            }
            com.amazon.aps.iva.yb0.j.m("feature");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    public static com.amazon.aps.iva.b0.e p(com.amazon.aps.iva.o0.i iVar) {
        iVar.s(1107739818);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        float f = j1.a;
        iVar.s(904445851);
        com.amazon.aps.iva.o2.c cVar = (com.amazon.aps.iva.o2.c) iVar.i(d1.e);
        Object valueOf = Float.valueOf(cVar.getDensity());
        iVar.s(1157296644);
        boolean H = iVar.H(valueOf);
        Object t = iVar.t();
        Object obj = i.a.a;
        if (H || t == obj) {
            t = new com.amazon.aps.iva.z.v(new i1(cVar));
            iVar.n(t);
        }
        iVar.G();
        com.amazon.aps.iva.z.u uVar = (com.amazon.aps.iva.z.u) t;
        iVar.G();
        iVar.s(1157296644);
        boolean H2 = iVar.H(uVar);
        Object t2 = iVar.t();
        if (H2 || t2 == obj) {
            t2 = new com.amazon.aps.iva.b0.e(uVar);
            iVar.n(t2);
        }
        iVar.G();
        com.amazon.aps.iva.b0.e eVar = (com.amazon.aps.iva.b0.e) t2;
        iVar.G();
        return eVar;
    }

    public static final Intent q(com.amazon.aps.iva.s4.k kVar, a2 a2Var) {
        if (kVar instanceof com.amazon.aps.iva.s4.n) {
            Intent intent = new Intent();
            ((com.amazon.aps.iva.s4.n) kVar).getClass();
            Intent component = intent.setComponent(null);
            com.amazon.aps.iva.yb0.j.e(component, "Intent().setComponent(action.componentName)");
            return component;
        } else if (kVar instanceof com.amazon.aps.iva.s4.m) {
            ((com.amazon.aps.iva.s4.m) kVar).getClass();
            return new Intent(a2Var.a, (Class<?>) null);
        } else if (kVar instanceof com.amazon.aps.iva.s4.o) {
            ((com.amazon.aps.iva.s4.o) kVar).getClass();
            return null;
        } else if (kVar instanceof com.amazon.aps.iva.s4.l) {
            ((com.amazon.aps.iva.s4.l) kVar).getClass();
            Intent component2 = new Intent((String) null).setComponent(null);
            com.amazon.aps.iva.yb0.j.e(component2, "Intent(action.action).se…ent(action.componentName)");
            return component2;
        } else {
            throw new com.amazon.aps.iva.kb0.h();
        }
    }

    public static final String r(PlayableAsset playableAsset) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "<this>");
        return playableAsset.getId();
    }

    public static final com.amazon.aps.iva.nd0.b s(com.amazon.aps.iva.kd0.c cVar, int i) {
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        return com.amazon.aps.iva.nd0.b.f(cVar.b(i), cVar.a(i));
    }

    public static final Intent t(com.amazon.aps.iva.q4.a aVar, a2 a2Var, int i, com.amazon.aps.iva.xb0.l lVar) {
        if (aVar instanceof com.amazon.aps.iva.q4.e) {
            com.amazon.aps.iva.q4.e eVar = (com.amazon.aps.iva.q4.e) aVar;
            return com.amazon.aps.iva.s4.b.a(z(eVar, a2Var, (com.amazon.aps.iva.q4.c) lVar.invoke(eVar.getParameters())), a2Var, i, com.amazon.aps.iva.s4.c.ACTIVITY);
        } else if (aVar instanceof q) {
            q qVar = (q) aVar;
            Intent y = y(qVar, a2Var);
            qVar.a();
            return com.amazon.aps.iva.s4.b.a(y, a2Var, i, com.amazon.aps.iva.s4.c.SERVICE);
        } else if (aVar instanceof com.amazon.aps.iva.s4.k) {
            return com.amazon.aps.iva.s4.b.a(q((com.amazon.aps.iva.s4.k) aVar, a2Var), a2Var, i, com.amazon.aps.iva.s4.c.BROADCAST);
        } else {
            if (aVar instanceof com.amazon.aps.iva.s4.j) {
                int i2 = ActionCallbackBroadcastReceiver.a;
                com.amazon.aps.iva.s4.j jVar = (com.amazon.aps.iva.s4.j) aVar;
                int i3 = a2Var.b;
                return com.amazon.aps.iva.s4.b.a(ActionCallbackBroadcastReceiver.a.a(a2Var.a, jVar.a, i3, (com.amazon.aps.iva.q4.c) lVar.invoke(jVar.b)), a2Var, i, com.amazon.aps.iva.s4.c.BROADCAST);
            } else if (aVar instanceof com.amazon.aps.iva.s4.h) {
                com.amazon.aps.iva.s4.h hVar = (com.amazon.aps.iva.s4.h) aVar;
                hVar.getClass();
                return t(null, a2Var, i, new com.amazon.aps.iva.s4.e(hVar));
            } else {
                throw new IllegalStateException(("Cannot create fill-in Intent for action type: " + aVar).toString());
            }
        }
    }

    public static final Integer u(l0 l0Var, String str) {
        Object obj;
        ArrayList v = v(l0Var);
        Iterator it = v.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (com.amazon.aps.iva.yb0.j.a(((b0) obj).b, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        b0 b0Var = (b0) obj;
        if (b0Var == null) {
            return null;
        }
        return Integer.valueOf(v.indexOf(b0Var));
    }

    public static final ArrayList v(l0 l0Var) {
        com.amazon.aps.iva.ec0.j T = T(0, l0Var.F());
        ArrayList arrayList = new ArrayList(r.Y(T));
        com.amazon.aps.iva.ec0.i it = T.iterator();
        while (it.d) {
            arrayList.add(l0Var.m0(it.b()));
        }
        return arrayList;
    }

    public static final com.amazon.aps.iva.nd0.f w(com.amazon.aps.iva.kd0.c cVar, int i) {
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        return com.amazon.aps.iva.nd0.f.f(cVar.getString(i));
    }

    public static final PendingIntent x(com.amazon.aps.iva.q4.a aVar, a2 a2Var, int i, com.amazon.aps.iva.xb0.l lVar) {
        boolean z = aVar instanceof com.amazon.aps.iva.q4.e;
        Context context = a2Var.a;
        if (z) {
            com.amazon.aps.iva.q4.e eVar = (com.amazon.aps.iva.q4.e) aVar;
            com.amazon.aps.iva.q4.c cVar = (com.amazon.aps.iva.q4.c) lVar.invoke(eVar.getParameters());
            Intent z2 = z(eVar, a2Var, cVar);
            if (!(aVar instanceof com.amazon.aps.iva.s4.p) && !cVar.c()) {
                z2 = com.amazon.aps.iva.s4.b.a(z2, a2Var, i, com.amazon.aps.iva.s4.c.ACTIVITY);
            }
            PendingIntent activity = PendingIntent.getActivity(context, 0, z2, 167772160);
            com.amazon.aps.iva.yb0.j.e(activity, "getActivity(\n           …TE_CURRENT,\n            )");
            return activity;
        } else if (aVar instanceof q) {
            q qVar = (q) aVar;
            Intent y = y(qVar, a2Var);
            qVar.a();
            PendingIntent service = PendingIntent.getService(context, 0, y, 167772160);
            com.amazon.aps.iva.yb0.j.e(service, "{\n                Pendin…          )\n            }");
            return service;
        } else if (aVar instanceof com.amazon.aps.iva.s4.k) {
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, q((com.amazon.aps.iva.s4.k) aVar, a2Var), 167772160);
            com.amazon.aps.iva.yb0.j.e(broadcast, "getBroadcast(\n          …TE_CURRENT,\n            )");
            return broadcast;
        } else if (aVar instanceof com.amazon.aps.iva.s4.j) {
            int i2 = ActionCallbackBroadcastReceiver.a;
            com.amazon.aps.iva.s4.j jVar = (com.amazon.aps.iva.s4.j) aVar;
            Intent a2 = ActionCallbackBroadcastReceiver.a.a(context, jVar.a, a2Var.b, (com.amazon.aps.iva.q4.c) lVar.invoke(jVar.b));
            a2.setData(com.amazon.aps.iva.s4.b.b(a2Var, i, com.amazon.aps.iva.s4.c.CALLBACK));
            com.amazon.aps.iva.kb0.q qVar2 = com.amazon.aps.iva.kb0.q.a;
            PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, a2, 167772160);
            com.amazon.aps.iva.yb0.j.e(broadcast2, "getBroadcast(\n          …TE_CURRENT,\n            )");
            return broadcast2;
        } else if (aVar instanceof com.amazon.aps.iva.s4.h) {
            com.amazon.aps.iva.s4.h hVar = (com.amazon.aps.iva.s4.h) aVar;
            hVar.getClass();
            return x(null, a2Var, i, new com.amazon.aps.iva.s4.e(hVar));
        } else {
            throw new IllegalStateException(("Cannot create PendingIntent for action type: " + aVar).toString());
        }
    }

    public static final Intent y(q qVar, a2 a2Var) {
        if (qVar instanceof s) {
            Intent intent = new Intent();
            ((s) qVar).getClass();
            Intent component = intent.setComponent(null);
            com.amazon.aps.iva.yb0.j.e(component, "Intent().setComponent(action.componentName)");
            return component;
        } else if (qVar instanceof com.amazon.aps.iva.s4.r) {
            ((com.amazon.aps.iva.s4.r) qVar).getClass();
            return new Intent(a2Var.a, (Class<?>) null);
        } else if (qVar instanceof t) {
            ((t) qVar).getClass();
            return null;
        } else {
            throw new com.amazon.aps.iva.kb0.h();
        }
    }

    public static final Intent z(com.amazon.aps.iva.q4.e eVar, a2 a2Var, com.amazon.aps.iva.q4.c cVar) {
        Intent intent = null;
        if (eVar instanceof com.amazon.aps.iva.q4.g) {
            Intent intent2 = new Intent();
            ((com.amazon.aps.iva.q4.g) eVar).getClass();
            intent = intent2.setComponent(null);
        } else if (eVar instanceof com.amazon.aps.iva.q4.f) {
            ((com.amazon.aps.iva.q4.f) eVar).getClass();
            intent = new Intent(a2Var.a, (Class<?>) null);
        } else if (eVar instanceof com.amazon.aps.iva.s4.p) {
            ((com.amazon.aps.iva.s4.p) eVar).getClass();
        } else {
            throw new IllegalStateException(("Action type not defined in app widget package: " + eVar).toString());
        }
        com.amazon.aps.iva.yb0.j.e(intent, "when (action) {\n        … package: $action\")\n    }");
        Map<c.a<? extends Object>, Object> a2 = cVar.a();
        ArrayList arrayList = new ArrayList(a2.size());
        for (Map.Entry<c.a<? extends Object>, Object> entry : a2.entrySet()) {
            arrayList.add(new com.amazon.aps.iva.kb0.j(entry.getKey().a, entry.getValue()));
        }
        Object[] array = arrayList.toArray(new com.amazon.aps.iva.kb0.j[0]);
        com.amazon.aps.iva.yb0.j.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        com.amazon.aps.iva.kb0.j[] jVarArr = (com.amazon.aps.iva.kb0.j[]) array;
        intent.putExtras(com.amazon.aps.iva.k3.e.a((com.amazon.aps.iva.kb0.j[]) Arrays.copyOf(jVarArr, jVarArr.length)));
        return intent;
    }

    @Override // com.amazon.aps.iva.aq.b
    public void a(String str) {
    }

    @Override // com.amazon.aps.iva.sp.b
    public void b(com.amazon.aps.iva.sp.a aVar) {
    }

    @Override // com.amazon.aps.iva.sp.b
    public void c(com.amazon.aps.iva.sp.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "data");
    }

    @Override // com.amazon.aps.iva.sp.b
    public com.amazon.aps.iva.sp.a d() {
        return null;
    }

    @Override // com.amazon.aps.iva.aq.b
    public String getVersion() {
        return "";
    }
}
