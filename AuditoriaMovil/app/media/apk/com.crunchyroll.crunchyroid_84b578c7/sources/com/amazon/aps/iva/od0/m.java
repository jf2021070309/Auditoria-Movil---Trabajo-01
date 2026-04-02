package com.amazon.aps.iva.od0;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import org.apache.commons.codec.binary.Hex;
/* compiled from: LazyStringArrayList.java */
/* loaded from: classes4.dex */
public final class m extends AbstractList<String> implements RandomAccess, n {
    public static final w c = new w(new m());
    public final ArrayList b;

    public m() {
        this.b = new ArrayList();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            cVar.getClass();
            try {
                str = cVar.r();
                if (cVar.k()) {
                    arrayList.set(i, str);
                }
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 not supported?", e);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = i.a;
            try {
                str = new String(bArr, Hex.DEFAULT_CHARSET_NAME);
                boolean z = false;
                if (com.amazon.aps.iva.a60.b.u(bArr, 0, bArr.length) == 0) {
                    z = true;
                }
                if (z) {
                    arrayList.set(i, str);
                }
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException("UTF-8 not supported?", e2);
            }
        }
        return str;
    }

    @Override // com.amazon.aps.iva.od0.n
    public final c getByteString(int i) {
        c oVar;
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof c) {
            oVar = (c) obj;
        } else if (obj instanceof String) {
            String str = (String) obj;
            o oVar2 = c.b;
            try {
                oVar = new o(str.getBytes(Hex.DEFAULT_CHARSET_NAME));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 not supported?", e);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            o oVar3 = c.b;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            oVar = new o(bArr2);
        }
        if (oVar != obj) {
            arrayList.set(i, oVar);
        }
        return oVar;
    }

    @Override // com.amazon.aps.iva.od0.n
    public final List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // com.amazon.aps.iva.od0.n
    public final w getUnmodifiableView() {
        return new w(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof c) {
            c cVar = (c) remove;
            cVar.getClass();
            try {
                return cVar.r();
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 not supported?", e);
            }
        }
        byte[] bArr = (byte[]) remove;
        byte[] bArr2 = i.a;
        try {
            return new String(bArr, Hex.DEFAULT_CHARSET_NAME);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    @Override // com.amazon.aps.iva.od0.n
    public final void s(o oVar) {
        this.b.add(oVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof c) {
            c cVar = (c) obj2;
            cVar.getClass();
            try {
                return cVar.r();
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 not supported?", e);
            }
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = i.a;
        try {
            return new String(bArr, Hex.DEFAULT_CHARSET_NAME);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof n) {
            collection = ((n) collection).getUnderlyingElements();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public m(n nVar) {
        this.b = new ArrayList(nVar.size());
        addAll(nVar);
    }
}
