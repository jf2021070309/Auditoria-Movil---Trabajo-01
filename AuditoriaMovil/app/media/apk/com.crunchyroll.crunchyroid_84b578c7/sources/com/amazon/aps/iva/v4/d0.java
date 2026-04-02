package com.amazon.aps.iva.v4;

import com.amazon.aps.iva.v4.p1;
import com.amazon.aps.iva.v4.y;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: LazyStringArrayList.java */
/* loaded from: classes.dex */
public final class d0 extends c<String> implements e0, RandomAccess {
    public final ArrayList c;

    static {
        new d0(10).b = false;
    }

    public d0(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        b();
        this.c.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.amazon.aps.iva.v4.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.amazon.aps.iva.v4.e0
    public final void c(h hVar) {
        b();
        this.c.add(hVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.amazon.aps.iva.v4.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.c;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            hVar.getClass();
            Charset charset = y.b;
            if (hVar.size() == 0) {
                str = "";
            } else {
                str = hVar.l(charset);
            }
            if (hVar.g()) {
                arrayList.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, y.b);
            p1.b bVar = p1.a;
            boolean z = false;
            if (p1.a.c(bArr, 0, bArr.length) == 0) {
                z = true;
            }
            if (z) {
                arrayList.set(i, str);
            }
        }
        return str;
    }

    @Override // com.amazon.aps.iva.v4.e0
    public final Object getRaw(int i) {
        return this.c.get(i);
    }

    @Override // com.amazon.aps.iva.v4.e0
    public final List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.c);
    }

    @Override // com.amazon.aps.iva.v4.e0
    public final e0 getUnmodifiableView() {
        if (this.b) {
            return new n1(this);
        }
        return this;
    }

    @Override // com.amazon.aps.iva.v4.y.d
    public final y.d mutableCopyWithCapacity(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.c);
            return new d0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.amazon.aps.iva.v4.c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        Object remove = this.c.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof h) {
            h hVar = (h) remove;
            hVar.getClass();
            Charset charset = y.b;
            if (hVar.size() == 0) {
                return "";
            }
            return hVar.l(charset);
        }
        return new String((byte[]) remove, y.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        Object obj2 = this.c.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof h) {
            h hVar = (h) obj2;
            hVar.getClass();
            Charset charset = y.b;
            if (hVar.size() == 0) {
                return "";
            }
            return hVar.l(charset);
        }
        return new String((byte[]) obj2, y.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    public d0(ArrayList<Object> arrayList) {
        this.c = arrayList;
    }

    @Override // com.amazon.aps.iva.v4.c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        b();
        if (collection instanceof e0) {
            collection = ((e0) collection).getUnderlyingElements();
        }
        boolean addAll = this.c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
