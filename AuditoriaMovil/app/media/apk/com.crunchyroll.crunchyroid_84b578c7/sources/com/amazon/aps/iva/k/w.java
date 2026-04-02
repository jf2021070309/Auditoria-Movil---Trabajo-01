package com.amazon.aps.iva.k;

import android.content.res.AssetManager;
import android.util.SparseArray;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: LayoutIncludeDetector.java */
/* loaded from: classes.dex */
public final class w implements com.amazon.aps.iva.ga.l, com.amazon.aps.iva.hb.i, com.amazon.aps.iva.ab0.a {
    public Object b;

    public /* synthetic */ w(Object obj) {
        this.b = obj;
    }

    @Override // com.amazon.aps.iva.hb.i
    public final com.amazon.aps.iva.hb.h a(int i) {
        com.amazon.aps.iva.hb.h hVar = (com.amazon.aps.iva.hb.h) ((SparseArray) this.b).get(i);
        if (hVar == null) {
            return (com.amazon.aps.iva.hb.h) ((SparseArray) this.b).get(16);
        }
        return hVar;
    }

    @Override // com.amazon.aps.iva.ab0.a
    public final InputStream b(String str) {
        try {
            return ((AssetManager) this.b).open(str.substring(1));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.amazon.aps.iva.ga.l
    public final com.amazon.aps.iva.ca.a d() {
        if (((com.amazon.aps.iva.na.a) ((List) this.b).get(0)).c()) {
            return new com.amazon.aps.iva.ca.k((List) this.b);
        }
        return new com.amazon.aps.iva.ca.j((List) this.b);
    }

    @Override // com.amazon.aps.iva.ga.l
    public final List e() {
        return (List) this.b;
    }

    @Override // com.amazon.aps.iva.ga.l
    public final boolean k() {
        if (((List) this.b).size() != 1 || !((com.amazon.aps.iva.na.a) ((List) this.b).get(0)).c()) {
            return false;
        }
        return true;
    }

    public w(com.amazon.aps.iva.jh.i iVar) {
        this.b = iVar;
    }

    public w(int i) {
        if (i == 2) {
            this.b = new HashMap();
        } else if (i != 5) {
            if (i != 7) {
                this.b = new ArrayDeque();
            }
        } else {
            SparseArray sparseArray = new SparseArray();
            this.b = sparseArray;
            com.amazon.aps.iva.hb.c cVar = new com.amazon.aps.iva.hb.c();
            com.amazon.aps.iva.hb.l lVar = new com.amazon.aps.iva.hb.l(1);
            com.amazon.aps.iva.hb.a aVar = new com.amazon.aps.iva.hb.a();
            sparseArray.put(48, lVar);
            ((SparseArray) this.b).put(80, aVar);
            ((SparseArray) this.b).put(17, cVar);
            ((SparseArray) this.b).put(16, cVar);
        }
    }

    public w() {
        this.b = new AtomicInteger(0);
    }
}
