package com.amazon.aps.iva.p8;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: RoomSQLiteQuery.java */
/* loaded from: classes.dex */
public final class i implements com.amazon.aps.iva.u8.c, Closeable {
    public static final TreeMap<Integer, i> j = new TreeMap<>();
    public volatile String b;
    public final long[] c;
    public final double[] d;
    public final String[] e;
    public final byte[][] f;
    public final int[] g;
    public final int h;
    public int i;

    public i(int i) {
        this.h = i;
        int i2 = i + 1;
        this.g = new int[i2];
        this.c = new long[i2];
        this.d = new double[i2];
        this.e = new String[i2];
        this.f = new byte[i2];
    }

    public static i f(int i, String str) {
        TreeMap<Integer, i> treeMap = j;
        synchronized (treeMap) {
            Map.Entry<Integer, i> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                i value = ceilingEntry.getValue();
                value.b = str;
                value.i = i;
                return value;
            }
            i iVar = new i(i);
            iVar.b = str;
            iVar.i = i;
            return iVar;
        }
    }

    @Override // com.amazon.aps.iva.u8.c
    public final void a(com.amazon.aps.iva.v8.d dVar) {
        for (int i = 1; i <= this.i; i++) {
            int i2 = this.g[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                dVar.a(i, this.f[i]);
                            }
                        } else {
                            dVar.i(i, this.e[i]);
                        }
                    } else {
                        dVar.c(this.d[i], i);
                    }
                } else {
                    dVar.f(i, this.c[i]);
                }
            } else {
                dVar.h(i);
            }
        }
    }

    @Override // com.amazon.aps.iva.u8.c
    public final String c() {
        return this.b;
    }

    public final void h(int i, long j2) {
        this.g[i] = 2;
        this.c[i] = j2;
    }

    public final void i(int i) {
        this.g[i] = 1;
    }

    public final void k(int i, String str) {
        this.g[i] = 4;
        this.e[i] = str;
    }

    public final void release() {
        TreeMap<Integer, i> treeMap = j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.h), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
