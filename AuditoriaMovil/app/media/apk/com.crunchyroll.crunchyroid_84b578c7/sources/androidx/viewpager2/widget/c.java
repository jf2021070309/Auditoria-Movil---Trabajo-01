package androidx.viewpager2.widget;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
/* compiled from: ScrollEventAdapter.java */
/* loaded from: classes.dex */
public final class c extends RecyclerView.u {
    public ViewPager2.e b;
    public final ViewPager2 c;
    public final RecyclerView d;
    public final LinearLayoutManager e;
    public int f;
    public int g;
    public final a h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;

    /* compiled from: ScrollEventAdapter.java */
    /* loaded from: classes.dex */
    public static final class a {
        public int a;
        public float b;
        public int c;
    }

    public c(ViewPager2 viewPager2) {
        this.c = viewPager2;
        ViewPager2.i iVar = viewPager2.k;
        this.d = iVar;
        this.e = (LinearLayoutManager) iVar.getLayoutManager();
        this.h = new a();
        U2();
    }

    public final void G(int i) {
        ViewPager2.e eVar = this.b;
        if (eVar != null) {
            eVar.onPageSelected(i);
        }
    }

    public final void G4(boolean z) {
        int i;
        this.n = z;
        if (z) {
            i = 4;
        } else {
            i = 1;
        }
        this.f = i;
        int i2 = this.j;
        if (i2 != -1) {
            this.i = i2;
            this.j = -1;
        } else if (this.i == -1) {
            this.i = this.e.findFirstVisibleItemPosition();
        }
        b1(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0120, code lost:
        if (r5[r1 - 1][1] >= r6) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0144 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H6() {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.c.H6():void");
    }

    public final void U2() {
        this.f = 0;
        this.g = 0;
        a aVar = this.h;
        aVar.a = -1;
        aVar.b = 0.0f;
        aVar.c = 0;
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.l = false;
        this.n = false;
        this.m = false;
    }

    public final void b1(int i) {
        if ((this.f == 3 && this.g == 0) || this.g == i) {
            return;
        }
        this.g = i;
        ViewPager2.e eVar = this.b;
        if (eVar != null) {
            eVar.onPageScrollStateChanged(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        boolean z;
        boolean z2;
        ViewPager2.e eVar;
        int i2 = this.f;
        boolean z3 = true;
        if ((i2 != 1 || this.g != 1) && i == 1) {
            G4(false);
            return;
        }
        if (i2 != 1 && i2 != 4) {
            z = false;
        } else {
            z = true;
        }
        if (z && i == 2) {
            if (this.l) {
                b1(2);
                this.k = true;
                return;
            }
            return;
        }
        if (i2 != 1 && i2 != 4) {
            z2 = false;
        } else {
            z2 = true;
        }
        a aVar = this.h;
        if (z2 && i == 0) {
            H6();
            if (!this.l) {
                int i3 = aVar.a;
                if (i3 != -1 && (eVar = this.b) != null) {
                    eVar.onPageScrolled(i3, 0.0f, 0);
                }
            } else if (aVar.c == 0) {
                int i4 = this.i;
                int i5 = aVar.a;
                if (i4 != i5) {
                    G(i5);
                }
            } else {
                z3 = false;
            }
            if (z3) {
                b1(0);
                U2();
            }
        }
        if (this.f == 2 && i == 0 && this.m) {
            H6();
            if (aVar.c == 0) {
                int i6 = this.j;
                int i7 = aVar.a;
                if (i6 != i7) {
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    G(i7);
                }
                b1(0);
                U2();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r7 == r8) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    @Override // androidx.recyclerview.widget.RecyclerView.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.l = r6
            r5.H6()
            boolean r0 = r5.k
            r1 = -1
            androidx.viewpager2.widget.c$a r2 = r5.h
            r3 = 0
            if (r0 == 0) goto L42
            r5.k = r3
            if (r8 > 0) goto L2b
            if (r8 != 0) goto L29
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.c
            androidx.viewpager2.widget.ViewPager2$d r8 = r8.h
            int r8 = r8.getLayoutDirection()
            if (r8 != r6) goto L25
            r8 = r6
            goto L26
        L25:
            r8 = r3
        L26:
            if (r7 != r8) goto L29
            goto L2b
        L29:
            r7 = r3
            goto L2c
        L2b:
            r7 = r6
        L2c:
            if (r7 == 0) goto L36
            int r7 = r2.c
            if (r7 == 0) goto L36
            int r7 = r2.a
            int r7 = r7 + r6
            goto L38
        L36:
            int r7 = r2.a
        L38:
            r5.j = r7
            int r8 = r5.i
            if (r8 == r7) goto L4e
            r5.G(r7)
            goto L4e
        L42:
            int r7 = r5.f
            if (r7 != 0) goto L4e
            int r7 = r2.a
            if (r7 != r1) goto L4b
            r7 = r3
        L4b:
            r5.G(r7)
        L4e:
            int r7 = r2.a
            if (r7 != r1) goto L53
            r7 = r3
        L53:
            float r8 = r2.b
            int r0 = r2.c
            androidx.viewpager2.widget.ViewPager2$e r4 = r5.b
            if (r4 == 0) goto L5e
            r4.onPageScrolled(r7, r8, r0)
        L5e:
            int r7 = r2.a
            int r8 = r5.j
            if (r7 == r8) goto L66
            if (r8 != r1) goto L74
        L66:
            int r7 = r2.c
            if (r7 != 0) goto L74
            int r7 = r5.g
            if (r7 == r6) goto L74
            r5.b1(r3)
            r5.U2()
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.c.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
