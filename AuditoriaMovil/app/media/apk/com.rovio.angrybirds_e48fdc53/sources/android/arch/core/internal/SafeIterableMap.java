package android.arch.core.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* JADX WARN: Classes with same name are omitted:
  classes2.dex
 */
/* loaded from: classes.dex */
public class SafeIterableMap<K, V> implements Iterable<Map.Entry<K, V>> {
    private Entry<K, V> mEnd;
    private WeakHashMap<SupportRemove<K, V>, Boolean> mIterators = new WeakHashMap<>();
    private int mSize = 0;
    private Entry<K, V> mStart;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface SupportRemove<K, V> {
        void supportRemove(Entry<K, V> entry);
    }

    /* loaded from: classes2.dex */
    interface f<K, V> {
        void a_(c<K, V> cVar);
    }

    protected Entry<K, V> get(K k) {
        Entry<K, V> currentNode = this.mStart;
        while (currentNode != null && !currentNode.mKey.equals(k)) {
            currentNode = currentNode.mNext;
        }
        return currentNode;
    }

    public V putIfAbsent(K key, V v) {
        Entry<K, V> entry = get(key);
        if (entry != null) {
            return entry.mValue;
        }
        put(key, v);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Entry<K, V> put(K key, V v) {
        Entry<K, V> newEntry = new Entry<>(key, v);
        this.mSize++;
        Entry<K, V> entry = this.mEnd;
        if (entry == null) {
            this.mStart = newEntry;
            this.mEnd = newEntry;
            return newEntry;
        }
        entry.mNext = newEntry;
        newEntry.mPrevious = this.mEnd;
        this.mEnd = newEntry;
        return newEntry;
    }

    public V remove(K key) {
        Entry<K, V> toRemove = get(key);
        if (toRemove == null) {
            return null;
        }
        this.mSize--;
        if (!this.mIterators.isEmpty()) {
            for (SupportRemove<K, V> iter : this.mIterators.keySet()) {
                iter.supportRemove(toRemove);
            }
        }
        if (toRemove.mPrevious != null) {
            toRemove.mPrevious.mNext = toRemove.mNext;
        } else {
            this.mStart = toRemove.mNext;
        }
        if (toRemove.mNext != null) {
            toRemove.mNext.mPrevious = toRemove.mPrevious;
        } else {
            this.mEnd = toRemove.mPrevious;
        }
        toRemove.mNext = null;
        toRemove.mPrevious = null;
        return toRemove.mValue;
    }

    public int size() {
        return this.mSize;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        ListIterator<K, V> iterator = new AscendingIterator<>(this.mStart, this.mEnd);
        this.mIterators.put(iterator, false);
        return iterator;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        DescendingIterator<K, V> iterator = new DescendingIterator<>(this.mEnd, this.mStart);
        this.mIterators.put(iterator, false);
        return iterator;
    }

    public SafeIterableMap<K, V>.IteratorWithAdditions iteratorWithAdditions() {
        SafeIterableMap<K, V>.IteratorWithAdditions iterator = new IteratorWithAdditions();
        this.mIterators.put(iterator, false);
        return iterator;
    }

    public Map.Entry<K, V> eldest() {
        return this.mStart;
    }

    public Map.Entry<K, V> newest() {
        return this.mEnd;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SafeIterableMap) {
            SafeIterableMap map = (SafeIterableMap) obj;
            if (size() != map.size()) {
                return false;
            }
            Iterator<Map.Entry<K, V>> iterator1 = iterator();
            Iterator iterator2 = map.iterator();
            while (iterator1.hasNext() && iterator2.hasNext()) {
                Map.Entry<K, V> next1 = iterator1.next();
                Object next2 = iterator2.next();
                if ((next1 == null && next2 != null) || (next1 != null && !next1.equals(next2))) {
                    return false;
                }
            }
            return (iterator1.hasNext() || iterator2.hasNext()) ? false : true;
        }
        return false;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        Iterator<Map.Entry<K, V>> iterator = iterator();
        while (iterator.hasNext()) {
            builder.append(iterator.next().toString());
            if (iterator.hasNext()) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    /* loaded from: classes.dex */
    private static abstract class ListIterator<K, V> implements Iterator<Map.Entry<K, V>>, SupportRemove<K, V> {
        Entry<K, V> mExpectedEnd;
        Entry<K, V> mNext;

        abstract Entry<K, V> backward(Entry<K, V> entry);

        abstract Entry<K, V> forward(Entry<K, V> entry);

        ListIterator(Entry<K, V> start, Entry<K, V> expectedEnd) {
            this.mExpectedEnd = expectedEnd;
            this.mNext = start;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.mNext != null;
        }

        @Override // android.arch.core.internal.SafeIterableMap.SupportRemove
        public void supportRemove(Entry<K, V> entry) {
            if (this.mExpectedEnd == entry && entry == this.mNext) {
                this.mNext = null;
                this.mExpectedEnd = null;
            }
            Entry<K, V> entry2 = this.mExpectedEnd;
            if (entry2 == entry) {
                this.mExpectedEnd = backward(entry2);
            }
            if (this.mNext == entry) {
                this.mNext = nextNode();
            }
        }

        private Entry<K, V> nextNode() {
            Entry<K, V> entry = this.mNext;
            Entry<K, V> entry2 = this.mExpectedEnd;
            if (entry == entry2 || entry2 == null) {
                return null;
            }
            return forward(entry);
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> result = this.mNext;
            this.mNext = nextNode();
            return result;
        }
    }

    /* loaded from: classes2.dex */
    private static abstract class e<K, V> implements f<K, V>, Iterator<Map.Entry<K, V>> {
        c<K, V> a;
        c<K, V> b;

        abstract c<K, V> a(c<K, V> cVar);

        abstract c<K, V> b(c<K, V> cVar);

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.a = cVar2;
            this.b = cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b != null;
        }

        @Override // android.arch.core.internal.SafeIterableMap.f
        public void a_(c<K, V> cVar) {
            if (this.a == cVar && cVar == this.b) {
                this.b = null;
                this.a = null;
            }
            if (this.a == cVar) {
                this.a = b(this.a);
            }
            if (this.b == cVar) {
                this.b = b();
            }
        }

        private c<K, V> b() {
            if (this.b == this.a || this.a == null) {
                return null;
            }
            return a(this.b);
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.b;
            this.b = b();
            return cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class AscendingIterator<K, V> extends ListIterator<K, V> {
        AscendingIterator(Entry<K, V> start, Entry<K, V> expectedEnd) {
            super(start, expectedEnd);
        }

        @Override // android.arch.core.internal.SafeIterableMap.ListIterator
        Entry<K, V> forward(Entry<K, V> entry) {
            return entry.mNext;
        }

        @Override // android.arch.core.internal.SafeIterableMap.ListIterator
        Entry<K, V> backward(Entry<K, V> entry) {
            return entry.mPrevious;
        }
    }

    /* loaded from: classes2.dex */
    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // android.arch.core.internal.SafeIterableMap.e
        c<K, V> a(c<K, V> cVar) {
            return cVar.c;
        }

        @Override // android.arch.core.internal.SafeIterableMap.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.d;
        }
    }

    /* loaded from: classes.dex */
    private static class DescendingIterator<K, V> extends ListIterator<K, V> {
        DescendingIterator(Entry<K, V> start, Entry<K, V> expectedEnd) {
            super(start, expectedEnd);
        }

        @Override // android.arch.core.internal.SafeIterableMap.ListIterator
        Entry<K, V> forward(Entry<K, V> entry) {
            return entry.mPrevious;
        }

        @Override // android.arch.core.internal.SafeIterableMap.ListIterator
        Entry<K, V> backward(Entry<K, V> entry) {
            return entry.mNext;
        }
    }

    /* loaded from: classes2.dex */
    private static class b<K, V> extends e<K, V> {
        b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // android.arch.core.internal.SafeIterableMap.e
        c<K, V> a(c<K, V> cVar) {
            return cVar.d;
        }

        @Override // android.arch.core.internal.SafeIterableMap.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class IteratorWithAdditions implements Iterator<Map.Entry<K, V>>, SupportRemove<K, V> {
        private boolean mBeforeStart;
        private Entry<K, V> mCurrent;

        private IteratorWithAdditions() {
            this.mBeforeStart = true;
        }

        @Override // android.arch.core.internal.SafeIterableMap.SupportRemove
        public void supportRemove(Entry<K, V> entry) {
            Entry<K, V> entry2 = this.mCurrent;
            if (entry == entry2) {
                Entry<K, V> entry3 = entry2.mPrevious;
                this.mCurrent = entry3;
                this.mBeforeStart = entry3 == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.mBeforeStart) {
                return SafeIterableMap.this.mStart != null;
            }
            Entry<K, V> entry = this.mCurrent;
            return (entry == null || entry.mNext == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (this.mBeforeStart) {
                this.mBeforeStart = false;
                this.mCurrent = SafeIterableMap.this.mStart;
            } else {
                Entry<K, V> entry = this.mCurrent;
                this.mCurrent = entry != null ? entry.mNext : null;
            }
            return this.mCurrent;
        }
    }

    /* loaded from: classes2.dex */
    private class d implements f<K, V>, Iterator<Map.Entry<K, V>> {
        private c<K, V> b;
        private boolean c;

        private d() {
            this.c = true;
        }

        @Override // android.arch.core.internal.SafeIterableMap.f
        public void a_(c<K, V> cVar) {
            if (cVar == this.b) {
                this.b = this.b.d;
                this.c = this.b == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c ? SafeIterableMap.a(SafeIterableMap.this) != null : (this.b == null || this.b.c == null) ? false : true;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (this.c) {
                this.c = false;
                this.b = SafeIterableMap.a(SafeIterableMap.this);
            } else {
                this.b = this.b != null ? this.b.c : null;
            }
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class Entry<K, V> implements Map.Entry<K, V> {
        final K mKey;
        Entry<K, V> mNext;
        Entry<K, V> mPrevious;
        final V mValue;

        Entry(K key, V value) {
            this.mKey = key;
            this.mValue = value;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.mKey;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.mValue;
        }

        @Override // java.util.Map.Entry
        public V setValue(V value) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.mKey + "=" + this.mValue;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                return this.mKey.equals(entry.mKey) && this.mValue.equals(entry.mValue);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class c<K, V> implements Map.Entry<K, V> {
        final K a;
        final V b;
        c<K, V> c;
        c<K, V> d;

        c(K k, V v) {
            this.a = k;
            this.b = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.a + "=" + this.b;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.a.equals(cVar.a) && this.b.equals(cVar.b);
            }
            return false;
        }
    }
}
