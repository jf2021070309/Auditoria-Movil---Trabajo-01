package com.amazon.aps.iva.u1;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.f;
/* compiled from: OnPositionedDispatcher.kt */
/* loaded from: classes.dex */
public final class t0 {
    public final com.amazon.aps.iva.p0.f<androidx.compose.ui.node.e> a = new com.amazon.aps.iva.p0.f<>(new androidx.compose.ui.node.e[16]);

    public static void a(androidx.compose.ui.node.e eVar) {
        boolean z;
        boolean z2;
        androidx.compose.ui.node.f fVar = eVar.A;
        int i = 0;
        if (fVar.b == e.d.Idle && !fVar.d && !fVar.c && eVar.G()) {
            f.c cVar = eVar.z.e;
            if ((cVar.e & 256) != 0) {
                while (cVar != null) {
                    if ((cVar.d & 256) != 0) {
                        f.c cVar2 = cVar;
                        com.amazon.aps.iva.p0.f fVar2 = null;
                        while (cVar2 != null) {
                            if (cVar2 instanceof r) {
                                r rVar = (r) cVar2;
                                rVar.z(i.d(rVar, 256));
                            } else {
                                if ((cVar2.d & 256) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z && (cVar2 instanceof j)) {
                                    int i2 = 0;
                                    for (f.c cVar3 = ((j) cVar2).p; cVar3 != null; cVar3 = cVar3.g) {
                                        if ((cVar3.d & 256) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVar2 = cVar3;
                                            } else {
                                                if (fVar2 == null) {
                                                    fVar2 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                }
                                                if (cVar2 != null) {
                                                    fVar2.b(cVar2);
                                                    cVar2 = null;
                                                }
                                                fVar2.b(cVar3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                            }
                            cVar2 = i.b(fVar2);
                        }
                    }
                    if ((cVar.e & 256) == 0) {
                        break;
                    }
                    cVar = cVar.g;
                }
            }
        }
        eVar.H = false;
        com.amazon.aps.iva.p0.f<androidx.compose.ui.node.e> y = eVar.y();
        int i3 = y.d;
        if (i3 > 0) {
            androidx.compose.ui.node.e[] eVarArr = y.b;
            do {
                a(eVarArr[i]);
                i++;
            } while (i < i3);
        }
    }
}
