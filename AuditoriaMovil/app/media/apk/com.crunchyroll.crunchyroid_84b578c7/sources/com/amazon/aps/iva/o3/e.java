package com.amazon.aps.iva.o3;
/* compiled from: Pools.java */
/* loaded from: classes.dex */
public class e implements d {
    public int a;
    public final Object b;

    public e(com.amazon.aps.iva.wy.e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // com.amazon.aps.iva.o3.d
    public boolean a(Object obj) {
        int i;
        Object obj2;
        boolean z;
        int i2 = 0;
        while (true) {
            i = this.a;
            obj2 = this.b;
            if (i2 < i) {
                if (((Object[]) obj2)[i2] == obj) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            if (i >= ((Object[]) obj2).length) {
                return false;
            }
            ((Object[]) obj2)[i] = obj;
            this.a = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    @Override // com.amazon.aps.iva.o3.d
    public Object b() {
        int i = this.a;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object obj = this.b;
        Object obj2 = ((Object[]) obj)[i2];
        ((Object[]) obj)[i2] = null;
        this.a = i - 1;
        return obj2;
    }

    public e(int i) {
        if (i > 0) {
            this.b = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }
}
