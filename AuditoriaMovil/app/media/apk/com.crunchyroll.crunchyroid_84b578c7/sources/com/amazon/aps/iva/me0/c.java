package com.amazon.aps.iva.me0;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
/* compiled from: SmartList.java */
/* loaded from: classes4.dex */
public final class c<E> extends AbstractList<E> implements RandomAccess {
    public int b;
    public Object c;

    /* compiled from: SmartList.java */
    /* loaded from: classes4.dex */
    public static class a<T> implements Iterator<T> {
        public static final a b = new a();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new IllegalStateException();
        }
    }

    /* compiled from: SmartList.java */
    /* loaded from: classes4.dex */
    public class b extends AbstractC0514c<E> {
        public final int c;

        public b() {
            this.c = ((AbstractList) c.this).modCount;
        }

        @Override // com.amazon.aps.iva.me0.c.AbstractC0514c
        public final void a() {
            c cVar = c.this;
            int i = ((AbstractList) cVar).modCount;
            int i2 = this.c;
            if (i == i2) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) cVar).modCount + "; expected: " + i2);
        }

        @Override // java.util.Iterator
        public final void remove() {
            a();
            c.this.clear();
        }
    }

    /* compiled from: SmartList.java */
    /* renamed from: com.amazon.aps.iva.me0.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC0514c<T> implements Iterator<T> {
        public boolean b;

        public abstract void a();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.b;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.b) {
                this.b = true;
                a();
                return (T) c.this.c;
            }
            throw new NoSuchElementException();
        }
    }

    public static /* synthetic */ void b(int i) {
        String str;
        int i2;
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i != 2 && i != 3) {
            if (i != 5 && i != 6 && i != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
            } else {
                objArr[1] = "toArray";
            }
        } else {
            objArr[1] = "iterator";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) {
            throw new IllegalStateException(format);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        int i = this.b;
        if (i == 0) {
            this.c = e;
        } else if (i == 1) {
            this.c = new Object[]{this.c, e};
        } else {
            Object[] objArr = (Object[]) this.c;
            int length = objArr.length;
            if (i >= length) {
                int a2 = com.amazon.aps.iva.e4.e.a(length, 3, 2, 1);
                int i2 = i + 1;
                if (a2 < i2) {
                    a2 = i2;
                }
                Object[] objArr2 = new Object[a2];
                this.c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.b] = e;
        }
        this.b++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.c = null;
        this.b = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.b)) {
            if (i2 == 1) {
                return (E) this.c;
            }
            return (E) ((Object[]) this.c)[i];
        }
        StringBuilder d = com.amazon.aps.iva.e4.e.d("Index: ", i, ", Size: ");
        d.append(this.b);
        throw new IndexOutOfBoundsException(d.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        int i = this.b;
        if (i == 0) {
            return a.b;
        }
        if (i == 1) {
            return new b();
        }
        Iterator<E> it = super.iterator();
        if (it != null) {
            return it;
        }
        b(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        E e;
        if (i >= 0 && i < (i2 = this.b)) {
            if (i2 == 1) {
                e = (E) this.c;
                this.c = null;
            } else {
                Object[] objArr = (Object[]) this.c;
                Object obj = objArr[i];
                if (i2 == 2) {
                    this.c = objArr[1 - i];
                } else {
                    int i3 = (i2 - i) - 1;
                    if (i3 > 0) {
                        System.arraycopy(objArr, i + 1, objArr, i, i3);
                    }
                    objArr[this.b - 1] = null;
                }
                e = (E) obj;
            }
            this.b--;
            ((AbstractList) this).modCount++;
            return e;
        }
        StringBuilder d = com.amazon.aps.iva.e4.e.d("Index: ", i, ", Size: ");
        d.append(this.b);
        throw new IndexOutOfBoundsException(d.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        int i2;
        if (i >= 0 && i < (i2 = this.b)) {
            if (i2 == 1) {
                E e2 = (E) this.c;
                this.c = e;
                return e2;
            }
            Object[] objArr = (Object[]) this.c;
            E e3 = (E) objArr[i];
            objArr[i] = e;
            return e3;
        }
        StringBuilder d = com.amazon.aps.iva.e4.e.d("Index: ", i, ", Size: ");
        d.append(this.b);
        throw new IndexOutOfBoundsException(d.toString());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // java.util.List
    public final void sort(Comparator<? super E> comparator) {
        int i = this.b;
        if (i >= 2) {
            Arrays.sort((Object[]) this.c, 0, i, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        if (tArr != 0) {
            int length = tArr.length;
            int i = this.b;
            if (i == 1) {
                if (length != 0) {
                    tArr[0] = this.c;
                } else {
                    T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                    tArr2[0] = this.c;
                    return tArr2;
                }
            } else if (length < i) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.c, i, tArr.getClass());
                if (tArr3 != null) {
                    return tArr3;
                }
                b(6);
                throw null;
            } else if (i != 0) {
                System.arraycopy(this.c, 0, tArr, 0, i);
            }
            int i2 = this.b;
            if (length > i2) {
                tArr[i2] = 0;
            }
            return tArr;
        }
        b(4);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        if (i >= 0 && i <= (i2 = this.b)) {
            if (i2 == 0) {
                this.c = e;
            } else if (i2 == 1 && i == 0) {
                this.c = new Object[]{e, this.c};
            } else {
                Object[] objArr = new Object[i2 + 1];
                if (i2 == 1) {
                    objArr[0] = this.c;
                } else {
                    Object[] objArr2 = (Object[]) this.c;
                    System.arraycopy(objArr2, 0, objArr, 0, i);
                    System.arraycopy(objArr2, i, objArr, i + 1, this.b - i);
                }
                objArr[i] = e;
                this.c = objArr;
            }
            this.b++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder d = com.amazon.aps.iva.e4.e.d("Index: ", i, ", Size: ");
        d.append(this.b);
        throw new IndexOutOfBoundsException(d.toString());
    }
}
