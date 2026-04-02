package c.u.b;

import androidx.recyclerview.widget.RecyclerView;
import c.u.b.u;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class a implements u.a {

    /* renamed from: d  reason: collision with root package name */
    public final InterfaceC0054a f2581d;
    public c.i.j.c<b> a = new c.i.j.d(30);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f2579b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f2580c = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public int f2583f = 0;

    /* renamed from: e  reason: collision with root package name */
    public final u f2582e = new u(this);

    /* renamed from: c.u.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0054a {
    }

    /* loaded from: classes.dex */
    public static final class b {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f2584b;

        /* renamed from: c  reason: collision with root package name */
        public Object f2585c;

        /* renamed from: d  reason: collision with root package name */
        public int f2586d;

        public b(int i2, int i3, int i4, Object obj) {
            this.a = i2;
            this.f2584b = i3;
            this.f2586d = i4;
            this.f2585c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i2 = this.a;
                if (i2 != bVar.a) {
                    return false;
                }
                if (i2 == 8 && Math.abs(this.f2586d - this.f2584b) == 1 && this.f2586d == bVar.f2584b && this.f2584b == bVar.f2586d) {
                    return true;
                }
                if (this.f2586d == bVar.f2586d && this.f2584b == bVar.f2584b) {
                    Object obj2 = this.f2585c;
                    if (obj2 != null) {
                        if (!obj2.equals(bVar.f2585c)) {
                            return false;
                        }
                    } else if (bVar.f2585c != null) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a * 31) + this.f2584b) * 31) + this.f2586d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i2 = this.a;
            sb.append(i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.f2584b);
            sb.append("c:");
            sb.append(this.f2586d);
            sb.append(",p:");
            sb.append(this.f2585c);
            sb.append("]");
            return sb.toString();
        }
    }

    public a(InterfaceC0054a interfaceC0054a) {
        this.f2581d = interfaceC0054a;
    }

    public final boolean a(int i2) {
        int size = this.f2580c.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.f2580c.get(i3);
            int i4 = bVar.a;
            if (i4 == 8) {
                if (f(bVar.f2586d, i3 + 1) == i2) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = bVar.f2584b;
                int i6 = bVar.f2586d + i5;
                while (i5 < i6) {
                    if (f(i5, i3 + 1) == i2) {
                        return true;
                    }
                    i5++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void b() {
        int size = this.f2580c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((b0) this.f2581d).a(this.f2580c.get(i2));
        }
        l(this.f2580c);
        this.f2583f = 0;
    }

    public void c() {
        b();
        int size = this.f2579b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f2579b.get(i2);
            int i3 = bVar.a;
            if (i3 == 1) {
                ((b0) this.f2581d).a(bVar);
                ((b0) this.f2581d).d(bVar.f2584b, bVar.f2586d);
            } else if (i3 == 2) {
                ((b0) this.f2581d).a(bVar);
                InterfaceC0054a interfaceC0054a = this.f2581d;
                int i4 = bVar.f2584b;
                int i5 = bVar.f2586d;
                b0 b0Var = (b0) interfaceC0054a;
                b0Var.a.V(i4, i5, true);
                RecyclerView recyclerView = b0Var.a;
                recyclerView.w0 = true;
                recyclerView.t0.f592c += i5;
            } else if (i3 == 4) {
                ((b0) this.f2581d).a(bVar);
                ((b0) this.f2581d).c(bVar.f2584b, bVar.f2586d, bVar.f2585c);
            } else if (i3 == 8) {
                ((b0) this.f2581d).a(bVar);
                ((b0) this.f2581d).e(bVar.f2584b, bVar.f2586d);
            }
        }
        l(this.f2579b);
        this.f2583f = 0;
    }

    public final void d(b bVar) {
        int i2;
        int i3 = bVar.a;
        if (i3 == 1 || i3 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m2 = m(bVar.f2584b, i3);
        int i4 = bVar.f2584b;
        int i5 = bVar.a;
        if (i5 == 2) {
            i2 = 0;
        } else if (i5 != 4) {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        } else {
            i2 = 1;
        }
        int i6 = 1;
        for (int i7 = 1; i7 < bVar.f2586d; i7++) {
            int m3 = m((i2 * i7) + bVar.f2584b, bVar.a);
            int i8 = bVar.a;
            if (i8 == 2 ? m3 == m2 : i8 == 4 && m3 == m2 + 1) {
                i6++;
            } else {
                b h2 = h(i8, m2, i6, bVar.f2585c);
                e(h2, i4);
                k(h2);
                if (bVar.a == 4) {
                    i4 += i6;
                }
                m2 = m3;
                i6 = 1;
            }
        }
        Object obj = bVar.f2585c;
        k(bVar);
        if (i6 > 0) {
            b h3 = h(bVar.a, m2, i6, obj);
            e(h3, i4);
            k(h3);
        }
    }

    public void e(b bVar, int i2) {
        ((b0) this.f2581d).a(bVar);
        int i3 = bVar.a;
        if (i3 != 2) {
            if (i3 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            ((b0) this.f2581d).c(i2, bVar.f2586d, bVar.f2585c);
            return;
        }
        InterfaceC0054a interfaceC0054a = this.f2581d;
        int i4 = bVar.f2586d;
        b0 b0Var = (b0) interfaceC0054a;
        b0Var.a.V(i2, i4, true);
        RecyclerView recyclerView = b0Var.a;
        recyclerView.w0 = true;
        recyclerView.t0.f592c += i4;
    }

    public int f(int i2, int i3) {
        int size = this.f2580c.size();
        while (i3 < size) {
            b bVar = this.f2580c.get(i3);
            int i4 = bVar.a;
            if (i4 == 8) {
                int i5 = bVar.f2584b;
                if (i5 == i2) {
                    i2 = bVar.f2586d;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (bVar.f2586d <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = bVar.f2584b;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = bVar.f2586d;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += bVar.f2586d;
                }
            }
            i3++;
        }
        return i2;
    }

    public boolean g() {
        return this.f2579b.size() > 0;
    }

    public b h(int i2, int i3, int i4, Object obj) {
        b b2 = this.a.b();
        if (b2 == null) {
            return new b(i2, i3, i4, obj);
        }
        b2.a = i2;
        b2.f2584b = i3;
        b2.f2586d = i4;
        b2.f2585c = obj;
        return b2;
    }

    public final void i(b bVar) {
        this.f2580c.add(bVar);
        int i2 = bVar.a;
        if (i2 == 1) {
            ((b0) this.f2581d).d(bVar.f2584b, bVar.f2586d);
        } else if (i2 == 2) {
            InterfaceC0054a interfaceC0054a = this.f2581d;
            b0 b0Var = (b0) interfaceC0054a;
            b0Var.a.V(bVar.f2584b, bVar.f2586d, false);
            b0Var.a.w0 = true;
        } else if (i2 == 4) {
            ((b0) this.f2581d).c(bVar.f2584b, bVar.f2586d, bVar.f2585c);
        } else if (i2 == 8) {
            ((b0) this.f2581d).e(bVar.f2584b, bVar.f2586d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j() {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.u.b.a.j():void");
    }

    public void k(b bVar) {
        bVar.f2585c = null;
        this.a.a(bVar);
    }

    public void l(List<b> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            k(list.get(i2));
        }
        list.clear();
    }

    public final int m(int i2, int i3) {
        int i4;
        int i5;
        for (int size = this.f2580c.size() - 1; size >= 0; size--) {
            b bVar = this.f2580c.get(size);
            int i6 = bVar.a;
            if (i6 == 8) {
                int i7 = bVar.f2584b;
                int i8 = bVar.f2586d;
                if (i7 < i8) {
                    i5 = i7;
                    i4 = i8;
                } else {
                    i4 = i7;
                    i5 = i8;
                }
                if (i2 < i5 || i2 > i4) {
                    if (i2 < i7) {
                        if (i3 == 1) {
                            bVar.f2584b = i7 + 1;
                            bVar.f2586d = i8 + 1;
                        } else if (i3 == 2) {
                            bVar.f2584b = i7 - 1;
                            bVar.f2586d = i8 - 1;
                        }
                    }
                } else if (i5 == i7) {
                    if (i3 == 1) {
                        bVar.f2586d = i8 + 1;
                    } else if (i3 == 2) {
                        bVar.f2586d = i8 - 1;
                    }
                    i2++;
                } else {
                    if (i3 == 1) {
                        bVar.f2584b = i7 + 1;
                    } else if (i3 == 2) {
                        bVar.f2584b = i7 - 1;
                    }
                    i2--;
                }
            } else {
                int i9 = bVar.f2584b;
                if (i9 <= i2) {
                    if (i6 == 1) {
                        i2 -= bVar.f2586d;
                    } else if (i6 == 2) {
                        i2 += bVar.f2586d;
                    }
                } else if (i3 == 1) {
                    bVar.f2584b = i9 + 1;
                } else if (i3 == 2) {
                    bVar.f2584b = i9 - 1;
                }
            }
        }
        for (int size2 = this.f2580c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f2580c.get(size2);
            if (bVar2.a == 8) {
                int i10 = bVar2.f2586d;
                if (i10 == bVar2.f2584b || i10 < 0) {
                    this.f2580c.remove(size2);
                    k(bVar2);
                }
            } else if (bVar2.f2586d <= 0) {
                this.f2580c.remove(size2);
                k(bVar2);
            }
        }
        return i2;
    }
}
