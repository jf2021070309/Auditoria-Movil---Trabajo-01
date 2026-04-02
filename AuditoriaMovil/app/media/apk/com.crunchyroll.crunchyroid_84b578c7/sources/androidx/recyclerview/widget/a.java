package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import java.util.ArrayList;
/* compiled from: AdapterHelper.java */
/* loaded from: classes.dex */
public final class a implements x.a {
    public final InterfaceC0054a d;
    public final com.amazon.aps.iva.o3.e a = new com.amazon.aps.iva.o3.e(30);
    public final ArrayList<b> b = new ArrayList<>();
    public final ArrayList<b> c = new ArrayList<>();
    public int f = 0;
    public final x e = new x(this);

    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0054a {
    }

    /* compiled from: AdapterHelper.java */
    /* loaded from: classes.dex */
    public static final class b {
        public int a;
        public int b;
        public Object c;
        public int d;

        public b(int i, Object obj, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.d = i3;
            this.c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.a;
            if (i != bVar.a) {
                return false;
            }
            if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == bVar.b && this.b == bVar.d) {
                return true;
            }
            if (this.d != bVar.d || this.b != bVar.b) {
                return false;
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.c)) {
                    return false;
                }
            } else if (bVar.c != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.d;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.a;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 8) {
                            str = "??";
                        } else {
                            str = "mv";
                        }
                    } else {
                        str = "up";
                    }
                } else {
                    str = "rm";
                }
            } else {
                str = "add";
            }
            sb.append(str);
            sb.append(",s:");
            sb.append(this.b);
            sb.append("c:");
            sb.append(this.d);
            sb.append(",p:");
            sb.append(this.c);
            sb.append("]");
            return sb.toString();
        }
    }

    public a(RecyclerView.f fVar) {
        this.d = fVar;
    }

    public final boolean a(int i) {
        ArrayList<b> arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = arrayList.get(i2);
            int i3 = bVar.a;
            if (i3 == 8) {
                if (f(bVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.b;
                int i5 = bVar.d + i4;
                while (i4 < i5) {
                    if (f(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<b> arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((RecyclerView.f) this.d).a(arrayList.get(i));
        }
        l(arrayList);
        this.f = 0;
    }

    public final void c() {
        b();
        ArrayList<b> arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b bVar = arrayList.get(i);
            int i2 = bVar.a;
            InterfaceC0054a interfaceC0054a = this.d;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            RecyclerView.f fVar = (RecyclerView.f) interfaceC0054a;
                            fVar.a(bVar);
                            int i3 = bVar.b;
                            int i4 = bVar.d;
                            RecyclerView recyclerView = RecyclerView.this;
                            recyclerView.offsetPositionRecordsForMove(i3, i4);
                            recyclerView.mItemsAddedOrRemoved = true;
                        }
                    } else {
                        RecyclerView.f fVar2 = (RecyclerView.f) interfaceC0054a;
                        fVar2.a(bVar);
                        int i5 = bVar.b;
                        int i6 = bVar.d;
                        Object obj = bVar.c;
                        RecyclerView recyclerView2 = RecyclerView.this;
                        recyclerView2.viewRangeUpdate(i5, i6, obj);
                        recyclerView2.mItemsChanged = true;
                    }
                } else {
                    RecyclerView.f fVar3 = (RecyclerView.f) interfaceC0054a;
                    fVar3.a(bVar);
                    int i7 = bVar.b;
                    int i8 = bVar.d;
                    RecyclerView recyclerView3 = RecyclerView.this;
                    recyclerView3.offsetPositionRecordsForRemove(i7, i8, true);
                    recyclerView3.mItemsAddedOrRemoved = true;
                    recyclerView3.mState.c += i8;
                }
            } else {
                RecyclerView.f fVar4 = (RecyclerView.f) interfaceC0054a;
                fVar4.a(bVar);
                int i9 = bVar.b;
                int i10 = bVar.d;
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.offsetPositionRecordsForInsert(i9, i10);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        l(arrayList);
        this.f = 0;
    }

    public final void d(b bVar) {
        int i;
        com.amazon.aps.iva.o3.e eVar;
        boolean z;
        int i2 = bVar.a;
        if (i2 != 1 && i2 != 8) {
            int m = m(bVar.b, i2);
            int i3 = bVar.b;
            int i4 = bVar.a;
            if (i4 != 2) {
                if (i4 == 4) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + bVar);
                }
            } else {
                i = 0;
            }
            int i5 = 1;
            int i6 = 1;
            while (true) {
                int i7 = bVar.d;
                eVar = this.a;
                if (i5 >= i7) {
                    break;
                }
                int m2 = m((i * i5) + bVar.b, bVar.a);
                int i8 = bVar.a;
                if (i8 == 2 ? m2 == m : !(i8 != 4 || m2 != m + 1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i6++;
                } else {
                    b h = h(i8, bVar.c, m, i6);
                    e(h, i3);
                    h.c = null;
                    eVar.a(h);
                    if (bVar.a == 4) {
                        i3 += i6;
                    }
                    i6 = 1;
                    m = m2;
                }
                i5++;
            }
            Object obj = bVar.c;
            bVar.c = null;
            eVar.a(bVar);
            if (i6 > 0) {
                b h2 = h(bVar.a, obj, m, i6);
                e(h2, i3);
                h2.c = null;
                eVar.a(h2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public final void e(b bVar, int i) {
        RecyclerView.f fVar = (RecyclerView.f) this.d;
        fVar.a(bVar);
        int i2 = bVar.a;
        if (i2 != 2) {
            if (i2 == 4) {
                int i3 = bVar.d;
                Object obj = bVar.c;
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.viewRangeUpdate(i, i3, obj);
                recyclerView.mItemsChanged = true;
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i4 = bVar.d;
        RecyclerView recyclerView2 = RecyclerView.this;
        recyclerView2.offsetPositionRecordsForRemove(i, i4, true);
        recyclerView2.mItemsAddedOrRemoved = true;
        recyclerView2.mState.c += i4;
    }

    public final int f(int i, int i2) {
        ArrayList<b> arrayList = this.c;
        int size = arrayList.size();
        while (i2 < size) {
            b bVar = arrayList.get(i2);
            int i3 = bVar.a;
            if (i3 == 8) {
                int i4 = bVar.b;
                if (i4 == i) {
                    i = bVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final boolean g() {
        if (this.b.size() > 0) {
            return true;
        }
        return false;
    }

    public final b h(int i, Object obj, int i2, int i3) {
        b bVar = (b) this.a.b();
        if (bVar == null) {
            return new b(i, obj, i2, i3);
        }
        bVar.a = i;
        bVar.b = i2;
        bVar.d = i3;
        bVar.c = obj;
        return bVar;
    }

    public final void i(b bVar) {
        this.c.add(bVar);
        int i = bVar.a;
        InterfaceC0054a interfaceC0054a = this.d;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        int i2 = bVar.b;
                        int i3 = bVar.d;
                        RecyclerView recyclerView = RecyclerView.this;
                        recyclerView.offsetPositionRecordsForMove(i2, i3);
                        recyclerView.mItemsAddedOrRemoved = true;
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + bVar);
                }
                int i4 = bVar.b;
                int i5 = bVar.d;
                Object obj = bVar.c;
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.viewRangeUpdate(i4, i5, obj);
                recyclerView2.mItemsChanged = true;
                return;
            }
            int i6 = bVar.b;
            int i7 = bVar.d;
            RecyclerView recyclerView3 = RecyclerView.this;
            recyclerView3.offsetPositionRecordsForRemove(i6, i7, false);
            recyclerView3.mItemsAddedOrRemoved = true;
            return;
        }
        int i8 = bVar.b;
        int i9 = bVar.d;
        RecyclerView recyclerView4 = RecyclerView.this;
        recyclerView4.offsetPositionRecordsForInsert(i8, i9);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:201:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.j():void");
    }

    public final void k(b bVar) {
        bVar.c = null;
        this.a.a(bVar);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            k((b) arrayList.get(i));
        }
        arrayList.clear();
    }

    public final int m(int i, int i2) {
        int i3;
        int i4;
        ArrayList<b> arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = arrayList.get(size);
            int i5 = bVar.a;
            if (i5 == 8) {
                int i6 = bVar.b;
                int i7 = bVar.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i >= i4 && i <= i3) {
                    if (i4 == i6) {
                        if (i2 == 1) {
                            bVar.d = i7 + 1;
                        } else if (i2 == 2) {
                            bVar.d = i7 - 1;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            bVar.b = i6 + 1;
                        } else if (i2 == 2) {
                            bVar.b = i6 - 1;
                        }
                        i--;
                    }
                } else if (i < i6) {
                    if (i2 == 1) {
                        bVar.b = i6 + 1;
                        bVar.d = i7 + 1;
                    } else if (i2 == 2) {
                        bVar.b = i6 - 1;
                        bVar.d = i7 - 1;
                    }
                }
            } else {
                int i8 = bVar.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= bVar.d;
                    } else if (i5 == 2) {
                        i += bVar.d;
                    }
                } else if (i2 == 1) {
                    bVar.b = i8 + 1;
                } else if (i2 == 2) {
                    bVar.b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            b bVar2 = arrayList.get(size2);
            if (bVar2.a == 8) {
                int i9 = bVar2.d;
                if (i9 == bVar2.b || i9 < 0) {
                    arrayList.remove(size2);
                    k(bVar2);
                }
            } else if (bVar2.d <= 0) {
                arrayList.remove(size2);
                k(bVar2);
            }
        }
        return i;
    }
}
