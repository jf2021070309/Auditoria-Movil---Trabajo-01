package com.amazon.aps.iva.d1;

import androidx.compose.ui.focus.FocusTargetNode;
import java.util.Arrays;
import java.util.Comparator;
/* compiled from: OneDimensionalFocusSearch.kt */
/* loaded from: classes.dex */
public final class b0 implements Comparator<FocusTargetNode> {
    public static final b0 b = new b0();

    @Override // java.util.Comparator
    public final int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        androidx.compose.ui.node.e eVar;
        FocusTargetNode focusTargetNode3 = focusTargetNode;
        FocusTargetNode focusTargetNode4 = focusTargetNode2;
        if (focusTargetNode3 != null) {
            if (focusTargetNode4 != null) {
                int i = 0;
                if (a0.d(focusTargetNode3) && a0.d(focusTargetNode4)) {
                    androidx.compose.ui.node.o oVar = focusTargetNode3.i;
                    androidx.compose.ui.node.e eVar2 = null;
                    if (oVar != null) {
                        eVar = oVar.i;
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        androidx.compose.ui.node.o oVar2 = focusTargetNode4.i;
                        if (oVar2 != null) {
                            eVar2 = oVar2.i;
                        }
                        if (eVar2 != null) {
                            if (com.amazon.aps.iva.yb0.j.a(eVar, eVar2)) {
                                return 0;
                            }
                            Object[] objArr = new androidx.compose.ui.node.e[16];
                            int i2 = 0;
                            while (eVar != null) {
                                int i3 = i2 + 1;
                                if (objArr.length < i3) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i3, objArr.length * 2));
                                    com.amazon.aps.iva.yb0.j.e(objArr, "copyOf(this, newSize)");
                                }
                                if (i2 != 0) {
                                    com.amazon.aps.iva.lb0.m.F(objArr, 0 + 1, objArr, 0, i2);
                                }
                                objArr[0] = eVar;
                                i2++;
                                eVar = eVar.v();
                            }
                            Object[] objArr2 = new androidx.compose.ui.node.e[16];
                            int i4 = 0;
                            while (eVar2 != null) {
                                int i5 = i4 + 1;
                                if (objArr2.length < i5) {
                                    objArr2 = Arrays.copyOf(objArr2, Math.max(i5, objArr2.length * 2));
                                    com.amazon.aps.iva.yb0.j.e(objArr2, "copyOf(this, newSize)");
                                }
                                if (i4 != 0) {
                                    com.amazon.aps.iva.lb0.m.F(objArr2, 0 + 1, objArr2, 0, i4);
                                }
                                objArr2[0] = eVar2;
                                i4++;
                                eVar2 = eVar2.v();
                            }
                            int min = Math.min(i2 - 1, i4 - 1);
                            if (min >= 0) {
                                while (com.amazon.aps.iva.yb0.j.a(objArr[i], objArr2[i])) {
                                    if (i != min) {
                                        i++;
                                    }
                                }
                                return com.amazon.aps.iva.yb0.j.h(((androidx.compose.ui.node.e) objArr[i]).w(), ((androidx.compose.ui.node.e) objArr2[i]).w());
                            }
                            throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                } else if (a0.d(focusTargetNode3)) {
                    return -1;
                } else {
                    if (!a0.d(focusTargetNode4)) {
                        return 0;
                    }
                    return 1;
                }
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
