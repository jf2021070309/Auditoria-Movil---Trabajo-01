package c.e;

import android.content.Context;
import android.view.View;
import c.g.a.i.d;
import c.g.a.i.f;
import c.g.a.i.h;
import c.g.a.i.l.n;
import ch.qos.logback.classic.spi.CallerData;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01eb, code lost:
        if (r5 == r6) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01fe, code lost:
        if (r5 == 2) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0200, code lost:
        r22 = r21;
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0206, code lost:
        r22 = r21;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02df, code lost:
        if (r3[r16].f1737f.f1735d == r6) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014d, code lost:
        if (r4[r2].f1737f.f1735d == r5) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0496 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0500 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0601 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x070c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x074d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x076a A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(c.g.a.i.e r34, c.g.a.d r35, java.util.ArrayList<c.g.a.i.d> r36, int r37) {
        /*
            Method dump skipped, instructions count: 1912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.a.a(c.g.a.i.e, c.g.a.d, java.util.ArrayList, int):void");
    }

    public static n b(d dVar, int i2, ArrayList<n> arrayList, n nVar) {
        int i3;
        int i4 = i2 == 0 ? dVar.p0 : dVar.q0;
        if (i4 != -1 && (nVar == null || i4 != nVar.f1794c)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                n nVar2 = arrayList.get(i5);
                if (nVar2.f1794c == i4) {
                    if (nVar != null) {
                        nVar.d(i2, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                } else {
                    i5++;
                }
            }
        } else if (i4 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if (dVar instanceof h) {
                h hVar = (h) dVar;
                int i6 = 0;
                while (true) {
                    if (i6 >= hVar.s0) {
                        i3 = -1;
                        break;
                    }
                    d dVar2 = hVar.r0[i6];
                    if ((i2 == 0 && (i3 = dVar2.p0) != -1) || (i2 == 1 && (i3 = dVar2.q0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        n nVar3 = arrayList.get(i7);
                        if (nVar3.f1794c == i3) {
                            nVar = nVar3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (nVar == null) {
                nVar = new n(i2);
            }
            arrayList.add(nVar);
        }
        if (nVar.a(dVar)) {
            if (dVar instanceof f) {
                f fVar = (f) dVar;
                fVar.u0.b(fVar.v0 == 0 ? 1 : 0, arrayList, nVar);
            }
            if (i2 == 0) {
                dVar.p0 = nVar.f1794c;
                dVar.J.b(i2, arrayList, nVar);
                dVar.L.b(i2, arrayList, nVar);
            } else {
                dVar.q0 = nVar.f1794c;
                dVar.K.b(i2, arrayList, nVar);
                dVar.N.b(i2, arrayList, nVar);
                dVar.M.b(i2, arrayList, nVar);
            }
            dVar.Q.b(i2, arrayList, nVar);
        }
        return nVar;
    }

    public static n c(ArrayList<n> arrayList, int i2) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            n nVar = arrayList.get(i3);
            if (i2 == nVar.f1794c) {
                return nVar;
            }
        }
        return null;
    }

    public static String d(Context context, int i2) {
        if (i2 != -1) {
            try {
                return context.getResources().getResourceEntryName(i2);
            } catch (Exception unused) {
                return e.a.d.a.a.e(CallerData.NA, i2);
            }
        }
        return "UNKNOWN";
    }

    public static String e(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static boolean f(d.a aVar, d.a aVar2, d.a aVar3, d.a aVar4) {
        d.a aVar5;
        d.a aVar6;
        d.a aVar7 = d.a.FIXED;
        return (aVar3 == aVar7 || aVar3 == (aVar6 = d.a.WRAP_CONTENT) || (aVar3 == d.a.MATCH_PARENT && aVar != aVar6)) || (aVar4 == aVar7 || aVar4 == (aVar5 = d.a.WRAP_CONTENT) || (aVar4 == d.a.MATCH_PARENT && aVar2 != aVar5));
    }
}
