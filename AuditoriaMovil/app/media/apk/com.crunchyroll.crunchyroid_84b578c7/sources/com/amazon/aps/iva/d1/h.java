package com.amazon.aps.iva.d1;

import androidx.compose.ui.focus.FocusTargetNode;
import com.amazon.aps.iva.a1.f;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: FocusInvalidationManager.kt */
/* loaded from: classes.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(0);
        this.h = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        int i;
        char c;
        x xVar;
        boolean z;
        com.amazon.aps.iva.p0.f fVar;
        boolean z2;
        com.amazon.aps.iva.p0.f fVar2;
        int i2;
        int i3;
        com.amazon.aps.iva.p0.f fVar3;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        i iVar = this.h;
        Iterator it = iVar.d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            LinkedHashSet<FocusTargetNode> linkedHashSet = iVar.b;
            char c2 = 16;
            int i4 = 1;
            if (hasNext) {
                p pVar = (p) it.next();
                if (pVar.V().n) {
                    f.c V = pVar.V();
                    com.amazon.aps.iva.p0.f fVar4 = null;
                    while (V != null) {
                        if (V instanceof FocusTargetNode) {
                            linkedHashSet.add((FocusTargetNode) V);
                        } else {
                            if ((V.d & 1024) != 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5 && (V instanceof com.amazon.aps.iva.u1.j)) {
                                int i5 = 0;
                                for (f.c cVar = ((com.amazon.aps.iva.u1.j) V).p; cVar != null; cVar = cVar.g) {
                                    if ((cVar.d & 1024) != 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        i5++;
                                        if (i5 == 1) {
                                            V = cVar;
                                        } else {
                                            if (fVar4 == null) {
                                                fVar4 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                            }
                                            if (V != null) {
                                                fVar4.b(V);
                                                V = null;
                                            }
                                            fVar4.b(cVar);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                        }
                        V = com.amazon.aps.iva.u1.i.b(fVar4);
                    }
                    if (pVar.V().n) {
                        com.amazon.aps.iva.p0.f fVar5 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                        f.c cVar2 = pVar.V().g;
                        if (cVar2 == null) {
                            com.amazon.aps.iva.u1.i.a(fVar5, pVar.V());
                        } else {
                            fVar5.b(cVar2);
                        }
                        while (fVar5.j()) {
                            f.c cVar3 = (f.c) fVar5.l(fVar5.d - 1);
                            if ((cVar3.e & 1024) == 0) {
                                com.amazon.aps.iva.u1.i.a(fVar5, cVar3);
                            } else {
                                while (true) {
                                    if (cVar3 == null) {
                                        break;
                                    } else if ((cVar3.d & 1024) != 0) {
                                        com.amazon.aps.iva.p0.f fVar6 = null;
                                        while (cVar3 != null) {
                                            if (cVar3 instanceof FocusTargetNode) {
                                                linkedHashSet.add((FocusTargetNode) cVar3);
                                            } else {
                                                if ((cVar3.d & 1024) != 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (z3 && (cVar3 instanceof com.amazon.aps.iva.u1.j)) {
                                                    int i6 = 0;
                                                    for (f.c cVar4 = ((com.amazon.aps.iva.u1.j) cVar3).p; cVar4 != null; cVar4 = cVar4.g) {
                                                        if ((cVar4.d & 1024) != 0) {
                                                            z4 = true;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                        if (z4) {
                                                            i6++;
                                                            if (i6 == 1) {
                                                                cVar3 = cVar4;
                                                            } else {
                                                                if (fVar6 == null) {
                                                                    fVar6 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                                }
                                                                if (cVar3 != null) {
                                                                    fVar6.b(cVar3);
                                                                    cVar3 = null;
                                                                }
                                                                fVar6.b(cVar4);
                                                            }
                                                        }
                                                    }
                                                    if (i6 == 1) {
                                                    }
                                                }
                                            }
                                            cVar3 = com.amazon.aps.iva.u1.i.b(fVar6);
                                        }
                                    } else {
                                        cVar3 = cVar3.g;
                                    }
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("visitChildren called on an unattached node".toString());
                    }
                }
            } else {
                LinkedHashSet linkedHashSet2 = iVar.d;
                linkedHashSet2.clear();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                LinkedHashSet<f> linkedHashSet4 = iVar.c;
                for (f fVar7 : linkedHashSet4) {
                    if (!fVar7.V().n) {
                        fVar7.p0(x.Inactive);
                        c = c2;
                        i = i4;
                    } else {
                        f.c V2 = fVar7.V();
                        int i7 = i4;
                        FocusTargetNode focusTargetNode = null;
                        int i8 = 0;
                        com.amazon.aps.iva.p0.f fVar8 = null;
                        while (V2 != null) {
                            if (V2 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) V2;
                                if (focusTargetNode != null) {
                                    i8 = i4;
                                }
                                if (linkedHashSet.contains(focusTargetNode2)) {
                                    linkedHashSet3.add(focusTargetNode2);
                                    i7 = 0;
                                }
                                focusTargetNode = focusTargetNode2;
                            } else {
                                if ((V2.d & 1024) != 0) {
                                    i2 = i4;
                                } else {
                                    i2 = 0;
                                }
                                if (i2 != 0 && (V2 instanceof com.amazon.aps.iva.u1.j)) {
                                    f.c cVar5 = ((com.amazon.aps.iva.u1.j) V2).p;
                                    int i9 = 0;
                                    while (cVar5 != null) {
                                        if ((cVar5.d & 1024) != 0) {
                                            i3 = i4;
                                        } else {
                                            i3 = 0;
                                        }
                                        if (i3 != 0) {
                                            i9++;
                                            if (i9 == i4) {
                                                V2 = cVar5;
                                            } else {
                                                if (fVar8 == null) {
                                                    fVar3 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                } else {
                                                    fVar3 = fVar8;
                                                }
                                                if (V2 != null) {
                                                    fVar3.b(V2);
                                                    V2 = null;
                                                }
                                                fVar3.b(cVar5);
                                                fVar8 = fVar3;
                                            }
                                        }
                                        cVar5 = cVar5.g;
                                        i4 = 1;
                                    }
                                    if (i9 == i4) {
                                        i4 = 1;
                                    }
                                }
                            }
                            V2 = com.amazon.aps.iva.u1.i.b(fVar8);
                            i4 = 1;
                        }
                        if (fVar7.V().n) {
                            com.amazon.aps.iva.p0.f fVar9 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                            f.c cVar6 = fVar7.V().g;
                            if (cVar6 == null) {
                                com.amazon.aps.iva.u1.i.a(fVar9, fVar7.V());
                            } else {
                                fVar9.b(cVar6);
                            }
                            while (fVar9.j()) {
                                f.c cVar7 = (f.c) fVar9.l(fVar9.d - 1);
                                if ((cVar7.e & 1024) == 0) {
                                    com.amazon.aps.iva.u1.i.a(fVar9, cVar7);
                                } else {
                                    while (true) {
                                        if (cVar7 == null) {
                                            break;
                                        } else if ((cVar7.d & 1024) != 0) {
                                            com.amazon.aps.iva.p0.f fVar10 = null;
                                            while (cVar7 != null) {
                                                if (cVar7 instanceof FocusTargetNode) {
                                                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVar7;
                                                    if (focusTargetNode != null) {
                                                        i8 = 1;
                                                    }
                                                    if (linkedHashSet.contains(focusTargetNode3)) {
                                                        linkedHashSet3.add(focusTargetNode3);
                                                        i7 = 0;
                                                    }
                                                    fVar = fVar9;
                                                    focusTargetNode = focusTargetNode3;
                                                } else {
                                                    if ((cVar7.d & 1024) != 0) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (z && (cVar7 instanceof com.amazon.aps.iva.u1.j)) {
                                                        f.c cVar8 = ((com.amazon.aps.iva.u1.j) cVar7).p;
                                                        int i10 = 0;
                                                        while (cVar8 != null) {
                                                            if ((cVar8.d & 1024) != 0) {
                                                                z2 = true;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            if (z2) {
                                                                i10++;
                                                                if (i10 == 1) {
                                                                    fVar2 = fVar9;
                                                                    cVar7 = cVar8;
                                                                } else {
                                                                    if (fVar10 == null) {
                                                                        fVar2 = fVar9;
                                                                        fVar10 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                                    } else {
                                                                        fVar2 = fVar9;
                                                                    }
                                                                    if (cVar7 != null) {
                                                                        fVar10.b(cVar7);
                                                                        cVar7 = null;
                                                                    }
                                                                    fVar10.b(cVar8);
                                                                    cVar8 = cVar8.g;
                                                                    fVar9 = fVar2;
                                                                }
                                                            } else {
                                                                fVar2 = fVar9;
                                                            }
                                                            cVar8 = cVar8.g;
                                                            fVar9 = fVar2;
                                                        }
                                                        fVar = fVar9;
                                                        if (i10 == 1) {
                                                            fVar9 = fVar;
                                                        }
                                                        cVar7 = com.amazon.aps.iva.u1.i.b(fVar10);
                                                        fVar9 = fVar;
                                                    } else {
                                                        fVar = fVar9;
                                                    }
                                                }
                                                cVar7 = com.amazon.aps.iva.u1.i.b(fVar10);
                                                fVar9 = fVar;
                                            }
                                        } else {
                                            cVar7 = cVar7.g;
                                            fVar9 = fVar9;
                                        }
                                    }
                                }
                                fVar9 = fVar9;
                            }
                            i = 1;
                            c = 16;
                            if (i7 != 0) {
                                if (i8 != 0) {
                                    xVar = g.a(fVar7);
                                } else if (focusTargetNode == null || (xVar = focusTargetNode.q) == null) {
                                    xVar = x.Inactive;
                                }
                                fVar7.p0(xVar);
                            }
                        } else {
                            throw new IllegalStateException("visitChildren called on an unattached node".toString());
                        }
                    }
                    i4 = i;
                    c2 = c;
                }
                linkedHashSet4.clear();
                for (FocusTargetNode focusTargetNode4 : linkedHashSet) {
                    if (focusTargetNode4.n) {
                        x xVar2 = focusTargetNode4.q;
                        focusTargetNode4.u1();
                        if (xVar2 != focusTargetNode4.q || linkedHashSet3.contains(focusTargetNode4)) {
                            g.c(focusTargetNode4);
                        }
                    }
                }
                linkedHashSet.clear();
                linkedHashSet3.clear();
                if (linkedHashSet2.isEmpty()) {
                    if (linkedHashSet4.isEmpty()) {
                        if (linkedHashSet.isEmpty()) {
                            return com.amazon.aps.iva.kb0.q.a;
                        }
                        throw new IllegalStateException("Unprocessed FocusTarget nodes".toString());
                    }
                    throw new IllegalStateException("Unprocessed FocusEvent nodes".toString());
                }
                throw new IllegalStateException("Unprocessed FocusProperties nodes".toString());
            }
        }
    }
}
