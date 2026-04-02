package com.amazon.aps.iva.u2;

import com.amazon.aps.iva.s2.h;
import com.amazon.aps.iva.v2.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: ConstraintAnchor.java */
/* loaded from: classes.dex */
public final class d {
    public int b;
    public boolean c;
    public final e d;
    public final b e;
    public d f;
    public com.amazon.aps.iva.s2.h i;
    public HashSet<d> a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    /* compiled from: ConstraintAnchor.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: ConstraintAnchor.java */
    /* loaded from: classes.dex */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.d = eVar;
        this.e = bVar;
    }

    public final void a(d dVar, int i) {
        b(dVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(d dVar, int i, int i2, boolean z) {
        if (dVar == null) {
            j();
            return true;
        } else if (!z && !i(dVar)) {
            return false;
        } else {
            this.f = dVar;
            if (dVar.a == null) {
                dVar.a = new HashSet<>();
            }
            HashSet<d> hashSet = this.f.a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.g = i;
            this.h = i2;
            return true;
        }
    }

    public final void c(int i, o oVar, ArrayList arrayList) {
        HashSet<d> hashSet = this.a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                com.amazon.aps.iva.v2.i.a(it.next().d, i, arrayList, oVar);
            }
        }
    }

    public final int d() {
        if (!this.c) {
            return 0;
        }
        return this.b;
    }

    public final int e() {
        d dVar;
        if (this.d.j0 == 8) {
            return 0;
        }
        int i = this.h;
        if (i != Integer.MIN_VALUE && (dVar = this.f) != null && dVar.d.j0 == 8) {
            return i;
        }
        return this.g;
    }

    public final d f() {
        int[] iArr = a.a;
        b bVar = this.e;
        int i = iArr[bVar.ordinal()];
        e eVar = this.d;
        switch (i) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return eVar.M;
            case 3:
                return eVar.K;
            case 4:
                return eVar.N;
            case 5:
                return eVar.L;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public final boolean g() {
        HashSet<d> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    public final boolean i(d dVar) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (dVar == null) {
            return false;
        }
        b bVar = this.e;
        e eVar = dVar.d;
        b bVar2 = dVar.e;
        if (bVar2 == bVar) {
            if (bVar == b.BASELINE && (!eVar.F || !this.d.F)) {
                return false;
            }
            return true;
        }
        switch (a.a[bVar.ordinal()]) {
            case 1:
                if (bVar2 == b.BASELINE || bVar2 == b.CENTER_X || bVar2 == b.CENTER_Y) {
                    return false;
                }
                return true;
            case 2:
            case 3:
                if (bVar2 != b.LEFT && bVar2 != b.RIGHT) {
                    z = false;
                } else {
                    z = true;
                }
                if (eVar instanceof h) {
                    if (z || bVar2 == b.CENTER_X) {
                        z3 = true;
                    }
                    return z3;
                }
                return z;
            case 4:
            case 5:
                if (bVar2 != b.TOP && bVar2 != b.BOTTOM) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (eVar instanceof h) {
                    if (z2 || bVar2 == b.CENTER_Y) {
                        z3 = true;
                    }
                    return z3;
                }
                return z2;
            case 6:
                if (bVar2 == b.LEFT || bVar2 == b.RIGHT) {
                    return false;
                }
                return true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public final void j() {
        HashSet<d> hashSet;
        d dVar = this.f;
        if (dVar != null && (hashSet = dVar.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        com.amazon.aps.iva.s2.h hVar = this.i;
        if (hVar == null) {
            this.i = new com.amazon.aps.iva.s2.h(h.a.UNRESTRICTED);
        } else {
            hVar.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.k0 + ":" + this.e.toString();
    }
}
