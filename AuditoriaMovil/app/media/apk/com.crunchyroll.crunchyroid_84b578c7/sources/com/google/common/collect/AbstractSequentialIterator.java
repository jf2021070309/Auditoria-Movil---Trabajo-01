package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.NoSuchElementException;
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public abstract class AbstractSequentialIterator<T> extends UnmodifiableIterator<T> {
    private T nextOrNull;

    public AbstractSequentialIterator(T t) {
        this.nextOrNull = t;
    }

    public abstract T computeNext(T t);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.nextOrNull != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t = this.nextOrNull;
        if (t != null) {
            this.nextOrNull = computeNext(t);
            return t;
        }
        throw new NoSuchElementException();
    }
}
