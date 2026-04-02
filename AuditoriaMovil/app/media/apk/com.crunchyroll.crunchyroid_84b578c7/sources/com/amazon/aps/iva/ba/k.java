package com.amazon.aps.iva.ba;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import com.amazon.aps.iva.ha.h;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/* compiled from: MergePathsContent.java */
@TargetApi(19)
/* loaded from: classes.dex */
public final class k implements l, i {
    public final Path a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final ArrayList d = new ArrayList();
    public final com.amazon.aps.iva.ha.h e;

    /* compiled from: MergePathsContent.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h.a.values().length];
            a = iArr;
            try {
                iArr[h.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[h.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[h.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[h.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public k(com.amazon.aps.iva.ha.h hVar) {
        hVar.getClass();
        this.e = hVar;
    }

    @TargetApi(19)
    public final void a(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        Path path = this.b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            l lVar = (l) arrayList.get(size);
            if (lVar instanceof c) {
                c cVar = (c) lVar;
                ArrayList arrayList2 = (ArrayList) cVar.g();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path b = ((l) arrayList2.get(size2)).b();
                    com.amazon.aps.iva.ca.q qVar = cVar.k;
                    if (qVar != null) {
                        matrix2 = qVar.d();
                    } else {
                        matrix2 = cVar.c;
                        matrix2.reset();
                    }
                    b.transform(matrix2);
                    path.addPath(b);
                }
            } else {
                path.addPath(lVar.b());
            }
        }
        int i = 0;
        l lVar2 = (l) arrayList.get(0);
        if (lVar2 instanceof c) {
            c cVar2 = (c) lVar2;
            List<l> g = cVar2.g();
            while (true) {
                ArrayList arrayList3 = (ArrayList) g;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path b2 = ((l) arrayList3.get(i)).b();
                com.amazon.aps.iva.ca.q qVar2 = cVar2.k;
                if (qVar2 != null) {
                    matrix = qVar2.d();
                } else {
                    matrix = cVar2.c;
                    matrix.reset();
                }
                b2.transform(matrix);
                path2.addPath(b2);
                i++;
            }
        } else {
            path2.set(lVar2.b());
        }
        this.c.op(path2, path, op);
    }

    @Override // com.amazon.aps.iva.ba.l
    public final Path b() {
        Path path = this.c;
        path.reset();
        com.amazon.aps.iva.ha.h hVar = this.e;
        if (hVar.b) {
            return path;
        }
        int i = a.a[hVar.a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            a(Path.Op.XOR);
                        }
                    } else {
                        a(Path.Op.INTERSECT);
                    }
                } else {
                    a(Path.Op.REVERSE_DIFFERENCE);
                }
            } else {
                a(Path.Op.UNION);
            }
        } else {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i2 >= arrayList.size()) {
                    break;
                }
                path.addPath(((l) arrayList.get(i2)).b());
                i2++;
            }
        }
        return path;
    }

    @Override // com.amazon.aps.iva.ba.b
    public final void c(List<b> list, List<b> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i < arrayList.size()) {
                ((l) arrayList.get(i)).c(list, list2);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.ba.i
    public final void g(ListIterator<b> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            b previous = listIterator.previous();
            if (previous instanceof l) {
                this.d.add((l) previous);
                listIterator.remove();
            }
        }
    }
}
