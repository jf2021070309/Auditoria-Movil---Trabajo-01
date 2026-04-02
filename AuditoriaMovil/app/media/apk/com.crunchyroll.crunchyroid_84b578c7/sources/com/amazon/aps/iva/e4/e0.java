package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.s1;
import com.amazon.aps.iva.e4.z;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: LazyStringArrayList.java */
/* loaded from: classes.dex */
public final class e0 extends c<String> implements f0, RandomAccess {
    public final ArrayList c;

    static {
        new e0(10).b = false;
    }

    public e0(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        b();
        this.c.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.amazon.aps.iva.e4.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.amazon.aps.iva.e4.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
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
        if (obj instanceof i) {
            i iVar = (i) obj;
            iVar.getClass();
            Charset charset = z.a;
            if (iVar.size() == 0) {
                str = "";
            } else {
                str = iVar.k(charset);
            }
            if (iVar.g()) {
                arrayList.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, z.a);
            s1.b bVar = s1.a;
            boolean z = false;
            if (s1.a.c(bArr, 0, bArr.length) == 0) {
                z = true;
            }
            if (z) {
                arrayList.set(i, str);
            }
        }
        return str;
    }

    @Override // com.amazon.aps.iva.e4.f0
    public final Object getRaw(int i) {
        return this.c.get(i);
    }

    @Override // com.amazon.aps.iva.e4.f0
    public final List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.c);
    }

    @Override // com.amazon.aps.iva.e4.f0
    public final f0 getUnmodifiableView() {
        if (this.b) {
            return new q1(this);
        }
        return this;
    }

    @Override // com.amazon.aps.iva.e4.z.c
    public final z.c mutableCopyWithCapacity(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.c);
            return new e0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        Object remove = this.c.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof i) {
            i iVar = (i) remove;
            iVar.getClass();
            Charset charset = z.a;
            if (iVar.size() == 0) {
                return "";
            }
            return iVar.k(charset);
        }
        return new String((byte[]) remove, z.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        Object obj2 = this.c.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof i) {
            i iVar = (i) obj2;
            iVar.getClass();
            Charset charset = z.a;
            if (iVar.size() == 0) {
                return "";
            }
            return iVar.k(charset);
        }
        return new String((byte[]) obj2, z.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // com.amazon.aps.iva.e4.f0
    public final void v(i iVar) {
        b();
        this.c.add(iVar);
        ((AbstractList) this).modCount++;
    }

    public e0(ArrayList<Object> arrayList) {
        this.c = arrayList;
    }

    @Override // com.amazon.aps.iva.e4.c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        b();
        if (collection instanceof f0) {
            collection = ((f0) collection).getUnderlyingElements();
        }
        boolean addAll = this.c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
