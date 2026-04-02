package com.google.android.gms.common.data;

import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private T zamf;

    public SingleRefDataBufferIterator(DataBuffer<T> dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException(new StringBuilder(46).append("Cannot advance the iterator beyond ").append(this.zalk).toString());
        }
        this.zalk++;
        if (this.zalk == 0) {
            this.zamf = this.zalj.get(0);
            if (!(this.zamf instanceof DataBufferRef)) {
                String valueOf = String.valueOf(this.zamf.getClass());
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 44).append("DataBuffer reference of type ").append(valueOf).append(" is not movable").toString());
            }
        } else {
            ((DataBufferRef) this.zamf).zag(this.zalk);
        }
        return this.zamf;
    }
}
