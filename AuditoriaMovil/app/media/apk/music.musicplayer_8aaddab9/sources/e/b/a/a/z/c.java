package e.b.a.a.z;

import java.util.Arrays;
/* loaded from: classes.dex */
public class c {
    public b[] a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f5402b;

    public c() {
        i.values();
        b[] bVarArr = new b[11];
        this.a = bVarArr;
        int[] iArr = new int[bVarArr.length];
        this.f5402b = iArr;
        Arrays.fill(iArr, 0);
    }

    public <T extends b> T a(Class<T> cls) {
        i iVar = i.mapping.get(cls);
        synchronized (iVar) {
            T t = (T) this.a[iVar.ordinal()];
            if (t != null) {
                this.a[iVar.ordinal()] = t.f5401c;
                int[] iArr = this.f5402b;
                int ordinal = iVar.ordinal();
                iArr[ordinal] = iArr[ordinal] - 1;
                t.f5401c = null;
                return t;
            }
            try {
                try {
                    return cls.newInstance();
                } catch (InstantiationException e2) {
                    e.b.a.a.y.c.a.d(e2, "Cannot create an instance of " + cls + ". Make sure it has a empty constructor.", new Object[0]);
                    return null;
                }
            } catch (IllegalAccessException e3) {
                e.b.a.a.y.c.a.d(e3, "Cannot create an instance of " + cls + ". Make sure it has a public empty constructor.", new Object[0]);
                return null;
            }
        }
    }

    public void b(b bVar) {
        i iVar = bVar.f5400b;
        bVar.f5401c = null;
        bVar.a = Long.MIN_VALUE;
        bVar.a();
        synchronized (iVar) {
            if (this.f5402b[iVar.ordinal()] < 20) {
                bVar.f5401c = this.a[iVar.ordinal()];
                this.a[iVar.ordinal()] = bVar;
                int[] iArr = this.f5402b;
                int ordinal = iVar.ordinal();
                iArr[ordinal] = iArr[ordinal] + 1;
            }
        }
    }
}
