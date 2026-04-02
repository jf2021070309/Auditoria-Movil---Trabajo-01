package e.a.c;

import android.content.Context;
import com.jrtstudio.audio.Bookmark;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.Vector;
/* loaded from: classes.dex */
public class k6 implements e.h.d.z {
    public static final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<Long> f5106b;

    /* renamed from: c  reason: collision with root package name */
    public int f5107c;

    /* renamed from: d  reason: collision with root package name */
    public Bookmark f5108d;

    /* renamed from: e  reason: collision with root package name */
    public r6 f5109e;

    /* renamed from: f  reason: collision with root package name */
    public b f5110f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<Long> f5111g;

    /* loaded from: classes.dex */
    public static class b {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public final Random f5112b = new Random();

        public b(a aVar) {
        }

        public int a(int i2) {
            int nextInt;
            do {
                i2 = Math.max(1, i2);
                nextInt = this.f5112b.nextInt(i2);
                if (nextInt != this.a) {
                    break;
                }
            } while (i2 > 1);
            this.a = nextInt;
            return nextInt;
        }
    }

    public k6(k6 k6Var) {
        this.f5106b = null;
        this.f5107c = -1;
        this.f5109e = new r6();
        this.f5110f = new b(null);
        ArrayList<Long> arrayList = new ArrayList<>();
        this.f5111g = arrayList;
        arrayList.addAll(k6Var.f5111g);
        this.f5107c = k6Var.f5107c;
        ArrayList<Long> arrayList2 = k6Var.f5106b;
        if (arrayList2 != null) {
            this.f5106b = arrayList2;
        }
        this.f5108d = k6Var.f5108d;
        this.f5109e = k6Var.f5109e;
        this.f5110f = k6Var.f5110f;
    }

    public k6(ArrayList<e.h.d.t> arrayList, int i2) {
        this.f5106b = null;
        this.f5107c = -1;
        this.f5109e = new r6();
        this.f5110f = new b(null);
        this.f5111g = new ArrayList<>();
        Iterator<e.h.d.t> it = arrayList.iterator();
        while (it.hasNext()) {
            e.h.d.t next = it.next();
            if (next instanceof o6) {
                this.f5111g.add(Long.valueOf(((o6) next).f5145b));
            }
        }
        this.f5107c = i2;
    }

    public k6(long[] jArr, int i2) {
        this.f5106b = null;
        this.f5107c = -1;
        this.f5109e = new r6();
        this.f5110f = new b(null);
        this.f5111g = new ArrayList<>();
        for (long j2 : jArr) {
            this.f5111g.add(Long.valueOf(j2));
        }
        if (i2 < 0) {
            this.f5107c = new Random().nextInt(this.f5111g.size());
        } else {
            this.f5107c = i2;
        }
    }

    public static void b() {
        synchronized (a) {
            c.i.g.h.F("sAuto");
            c.i.g.h.F("seekpos");
            c.i.g.h.F("queue2");
            c.i.g.h.F("curpos");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0149 A[Catch: all -> 0x0160, TRY_ENTER, TryCatch #5 {, blocks: (B:4:0x0003, B:6:0x0011, B:8:0x0013, B:10:0x001e, B:12:0x0024, B:14:0x0035, B:15:0x0041, B:17:0x0047, B:19:0x0051, B:23:0x005e, B:22:0x0056, B:25:0x0064, B:26:0x0067, B:28:0x0088, B:32:0x0090, B:33:0x009b, B:43:0x00c3, B:46:0x00c6, B:47:0x00c7, B:78:0x015b, B:79:0x015e, B:48:0x00c8, B:50:0x00d0, B:53:0x00d8, B:55:0x00ea, B:70:0x0149, B:71:0x014c, B:75:0x0156, B:76:0x0159, B:59:0x010d, B:65:0x0118, B:66:0x011b, B:68:0x0128), top: B:92:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e.h.d.z v() {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.c.k6.v():e.h.d.z");
    }

    @Override // e.h.d.z
    public void C(Context context) {
    }

    @Override // e.h.d.z
    public e.h.d.t D(Context context, boolean z) {
        int t = t(false);
        if (t < 0 || t >= this.f5111g.size()) {
            return null;
        }
        return new o6(this.f5111g.get(t).longValue());
    }

    @Override // e.h.d.z
    public ArrayList<e.h.d.t> E() {
        ArrayList<e.h.d.t> arrayList = new ArrayList<>(this.f5111g.size());
        o6.a = false;
        Iterator<Long> it = this.f5111g.iterator();
        while (it.hasNext()) {
            arrayList.add(new o6(it.next().longValue()));
        }
        o6.a = true;
        return arrayList;
    }

    @Override // e.h.d.z
    public String F() {
        return "";
    }

    @Override // e.h.d.z
    public boolean H(Context context, e.h.d.t tVar, int i2) {
        if (i2 == -1 && (tVar instanceof o6)) {
            o6 o6Var = (o6) tVar;
            if (this.f5111g.contains(Long.valueOf(o6Var.f5145b))) {
                while (this.f5111g.contains(Long.valueOf(o6Var.f5145b))) {
                    int indexOf = this.f5111g.indexOf(Long.valueOf(o6Var.f5145b));
                    int i3 = this.f5107c;
                    if (indexOf <= i3 && i3 != 0) {
                        this.f5107c = i3 - 1;
                    }
                    this.f5111g.remove(indexOf);
                }
                return true;
            }
            return false;
        } else if (this.f5111g.size() > i2) {
            if (tVar == null || this.f5111g.get(i2).equals(Long.valueOf(((o6) tVar).f5145b))) {
                int i4 = this.f5107c;
                if (i2 <= i4 && i4 != 0) {
                    this.f5107c = i4 - 1;
                }
                this.f5111g.remove(i2);
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    @Override // e.h.d.z
    public boolean L(Context context, boolean z) {
        boolean z2;
        int t;
        if (!z) {
            Objects.requireNonNull(c.i.g.b.f2069b);
            if (c.i.g.h.o() == 1) {
                z2 = true;
                t = t(z2);
                if (t >= 0 || t >= this.f5111g.size()) {
                    this.f5107c = -1;
                    return true;
                }
                this.f5107c = t;
                return false;
            }
        }
        z2 = false;
        t = t(z2);
        if (t >= 0) {
        }
        this.f5107c = -1;
        return true;
    }

    @Override // e.h.d.z
    public void N(Context context, Bookmark bookmark) {
        if (bookmark != null) {
            this.f5108d = bookmark;
        }
    }

    @Override // e.h.d.z
    public void O(Context context) {
    }

    @Override // e.h.d.z
    public boolean R() {
        return true;
    }

    @Override // e.h.d.z
    public void S(Context context, boolean z) {
        e.h.g.s1.c("Asked to recalculate?");
        Objects.requireNonNull(c.i.g.b.f2069b);
        if (c.i.g.h.q() == 2 && this.f5106b == null) {
            this.f5106b = new ArrayList<>(this.f5111g);
            this.f5111g.clear();
            f();
        }
    }

    @Override // e.h.d.z
    public void U(Context context, int i2, int i3) {
        if (i2 >= this.f5111g.size()) {
            i2 = this.f5111g.size() - 1;
        }
        if (i3 >= this.f5111g.size()) {
            i3 = this.f5111g.size() - 1;
        }
        if (i2 < i3) {
            long longValue = this.f5111g.get(i2).longValue();
            int i4 = i2;
            while (i4 < i3) {
                ArrayList<Long> arrayList = this.f5111g;
                int i5 = i4 + 1;
                arrayList.set(i4, arrayList.get(i5));
                i4 = i5;
            }
            this.f5111g.set(i3, Long.valueOf(longValue));
            int i6 = this.f5107c;
            if (i6 == i2) {
                this.f5107c = i3;
            } else if (i6 >= i2 && i6 <= i3) {
                this.f5107c = i6 - 1;
            }
        } else if (i3 < i2) {
            long longValue2 = this.f5111g.get(i2).longValue();
            for (int i7 = i2; i7 > i3; i7--) {
                ArrayList<Long> arrayList2 = this.f5111g;
                arrayList2.set(i7, arrayList2.get(i7 - 1));
            }
            this.f5111g.set(i3, Long.valueOf(longValue2));
            int i8 = this.f5107c;
            if (i8 == i2) {
                this.f5107c = i3;
            } else if (i8 >= i3 && i8 <= i2) {
                this.f5107c = i8 + 1;
            }
        }
    }

    @Override // e.h.d.z
    public boolean Y(Context context, e.h.d.z zVar) {
        boolean z = false;
        if (this.f5111g.size() == zVar.size() && (zVar instanceof k6)) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f5111g.size()) {
                    break;
                } else if (this.f5111g.get(i2).longValue() != ((k6) zVar).f5111g.get(i2).longValue()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            return !z;
        }
        return false;
    }

    public synchronized void a() {
        this.f5111g.clear();
        this.f5107c = -1;
    }

    public final void f() {
        int a2;
        boolean z;
        int i2;
        if (h() > 10) {
            int h2 = h() - 9;
            synchronized (this) {
                if (h2 >= size()) {
                    h2 = size() - 1;
                }
                int i3 = h2 + 0 + 1;
                if (h() >= 0 && h() <= h2) {
                    z(0);
                } else if (h() > h2) {
                    this.f5107c -= i3;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    this.f5111g.remove(0);
                }
            }
        }
        int size = 7 - (size() - (h() < 0 ? -1 : h()));
        for (int i5 = 0; i5 < size; i5++) {
            int size2 = this.f5109e.a.size();
            while (true) {
                a2 = this.f5110f.a(this.f5106b.size());
                r6 r6Var = this.f5109e;
                synchronized (r6Var.a) {
                    if (size2 != 0) {
                        int size3 = r6Var.a.size();
                        if (size3 < size2) {
                            e.h.g.s1.b("lookback too big");
                            i2 = size3;
                        } else {
                            i2 = size2;
                        }
                        int i6 = size3 - 1;
                        for (int i7 = 0; i7 < i2; i7++) {
                            if (r6Var.a.get(i6 - i7).intValue() == a2) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                }
                if (!z) {
                    break;
                }
                size2 /= 2;
            }
            this.f5109e.c(a2);
            long[] jArr = {this.f5106b.get(a2).longValue()};
            synchronized (this) {
                ArrayList arrayList = new ArrayList(1);
                for (int i8 = 0; i8 < 1; i8++) {
                    arrayList.add(Long.valueOf(jArr[i8]));
                }
                if (Integer.MAX_VALUE >= this.f5111g.size()) {
                    this.f5111g.addAll(arrayList);
                } else {
                    this.f5111g.addAll(Integer.MAX_VALUE, arrayList);
                }
                if (this.f5107c < 0 && this.f5111g.size() > 0) {
                    this.f5107c = 0;
                }
            }
        }
    }

    @Override // e.h.d.z
    public e.h.d.z g() {
        return new k6(this);
    }

    @Override // e.h.d.z
    public int getPosition() {
        return this.f5107c;
    }

    public int h() {
        boolean z;
        synchronized (this) {
            if (this.f5111g.size() > 0) {
                int size = this.f5111g.size();
                int i2 = this.f5107c;
                z = size > i2 && i2 >= 0;
            }
        }
        if (z) {
            return this.f5107c;
        }
        return -1;
    }

    public synchronized e.h.c.a i() {
        e.h.c.a aVar;
        new l.a.a.a(this.f5111g.size());
        aVar = new e.h.c.a(this.f5111g.size());
        Iterator<Long> it = this.f5111g.iterator();
        while (it.hasNext()) {
            aVar.a.add(Long.valueOf(it.next().longValue()));
        }
        return aVar;
    }

    @Override // e.h.d.z
    public void k(Context context) {
        int intValue;
        if (c.i.g.h.q() != 1) {
            if (h() > 0) {
                z(h() - 1);
                return;
            } else {
                z(size() - 1);
                return;
            }
        }
        r6 r6Var = this.f5109e;
        synchronized (r6Var.a) {
            int size = r6Var.a.size();
            if (size < 2) {
                intValue = -1;
            } else {
                r6Var.a.remove(size - 1);
                intValue = r6Var.a.remove(size - 2).intValue();
            }
        }
        if (intValue < 0) {
            return;
        }
        z(intValue);
    }

    @Override // e.h.d.z
    public boolean m() {
        return true;
    }

    @Override // e.h.d.z
    public e.h.d.t n() {
        int size = this.f5111g.size();
        int i2 = this.f5107c;
        if (size <= i2 || i2 < 0) {
            return null;
        }
        return new o6(this.f5111g.get(i2).longValue());
    }

    @Override // e.h.d.z
    public void o(Context context, e.h.d.z zVar) {
        if (zVar instanceof k6) {
            int i2 = this.f5107c;
            int i3 = ((k6) zVar).f5107c;
            if (i2 != i3) {
                this.f5107c = i3;
                t(false);
            }
        }
    }

    @Override // e.h.d.z
    public Bookmark s(Context context) {
        return this.f5108d;
    }

    @Override // e.h.d.z
    public int size() {
        return this.f5111g.size();
    }

    public final int t(boolean z) {
        int h2;
        int i2 = 0;
        if (c.i.g.h.o() == 1) {
            if (h() < 0) {
                return 0;
            }
            if (!z) {
                return h();
            }
            if (h() >= size() - 1) {
                return -1;
            }
            h2 = h();
        } else if (c.i.g.h.q() == 1) {
            this.f5109e.c(h());
            r6 r6Var = this.f5109e;
            int h3 = h();
            int intValue = r6Var.f5174b.containsKey(Integer.valueOf(h3)) ? r6Var.f5174b.get(Integer.valueOf(h3)).intValue() : -1;
            if (intValue >= 0) {
                return intValue;
            }
            int size = size();
            int[] iArr = new int[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = i3;
            }
            int size2 = this.f5109e.a.size();
            int i4 = size;
            for (int i5 = 0; i5 < size2; i5++) {
                int intValue2 = this.f5109e.a.get(i5).intValue();
                if (intValue2 < size && iArr[intValue2] >= 0) {
                    i4--;
                    iArr[intValue2] = -1;
                }
            }
            if (i4 > 0) {
                size = i4;
            } else if (c.i.g.h.o() != 2 && !z) {
                return -1;
            } else {
                this.f5109e.a();
                for (int i6 = 0; i6 < size; i6++) {
                    iArr[i6] = i6;
                }
            }
            int a2 = this.f5110f.a(size);
            int i7 = 0;
            while (true) {
                i7++;
                try {
                    if (iArr[i7] >= 0 && a2 - 1 < 0) {
                        break;
                    }
                } catch (Throwable unused) {
                }
            }
            i2 = i7;
            r6 r6Var2 = this.f5109e;
            int h4 = h();
            Objects.requireNonNull(r6Var2);
            if (h4 != i2) {
                r6Var2.f5174b.put(Integer.valueOf(h4), Integer.valueOf(i2));
            }
            return i2;
        } else if (c.i.g.h.q() == 2) {
            f();
            h2 = h();
        } else if (h() >= size() - 1) {
            if (c.i.g.h.o() != 0 || z) {
                return (c.i.g.h.o() == 2 || z) ? 0 : -1;
            }
            return -1;
        } else {
            h2 = h();
        }
        return h2 + 1;
    }

    public final void u() {
        r6 r6Var = this.f5109e;
        e.h.g.l0 m2 = c.i.g.h.m();
        int size = size();
        r6Var.a();
        if (m2 != null) {
            synchronized (r6Var.a) {
                r6Var.a();
                String k2 = m2.k("history2", "");
                if (k2 != null && k2.length() > 0) {
                    try {
                        l.a.a.a aVar = (l.a.a.a) new l.a.a.e.b().e(k2);
                        Vector vector = new Vector(aVar.size());
                        for (int i2 = 0; i2 < aVar.size(); i2++) {
                            Object obj = aVar.get(i2);
                            int intValue = (obj instanceof Integer ? (Integer) obj : Integer.valueOf(obj.toString())).intValue();
                            if (intValue >= 0 && intValue < size) {
                                vector.add(Integer.valueOf(intValue));
                            }
                            r6Var.a();
                        }
                        r6Var.a();
                        r6Var.a.addAll(vector);
                    } catch (l.a.a.e.c e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    @Override // e.h.d.z
    public void x(Context context, int i2) {
        if (i2 < 0) {
            this.f5107c = new Random().nextInt(this.f5111g.size());
        } else {
            this.f5107c = i2;
        }
    }

    public void y() {
        synchronized (a) {
            Bookmark bookmark = this.f5108d;
            long j2 = bookmark != null ? bookmark.a : -1L;
            e.h.c.a i2 = i();
            c.i.g.h.F("queue");
            c.i.g.h.E("queue2", i2.toString());
            if (c.i.g.h.q() != 0) {
                this.f5109e.b(c.i.g.h.m());
            }
            c.i.g.h.C("curpos", this.f5107c);
            if (j2 >= 0) {
                c.i.g.h.m().o("seekpos", j2);
            } else {
                c.i.g.h.F("seekpos");
            }
            ArrayList<Long> arrayList = this.f5106b;
            if (arrayList != null && arrayList.size() > 0) {
                l.a.a.a aVar = new l.a.a.a(this.f5106b.size());
                Iterator<Long> it = this.f5106b.iterator();
                while (it.hasNext()) {
                    aVar.add(it.next());
                }
                c.i.g.h.E("sAuto", aVar.b());
            }
        }
    }

    public synchronized void z(int i2) {
        if (i2 >= 0) {
            if (i2 < this.f5111g.size()) {
                this.f5107c = i2;
            }
        }
    }
}
