package com.amazon.aps.iva.q6;

import java.util.NoSuchElementException;
/* compiled from: MediaChunkIterator.java */
/* loaded from: classes.dex */
public interface n {
    public static final a a = new a();

    /* compiled from: MediaChunkIterator.java */
    /* loaded from: classes.dex */
    public class a implements n {
        @Override // com.amazon.aps.iva.q6.n
        public final long a() {
            throw new NoSuchElementException();
        }

        @Override // com.amazon.aps.iva.q6.n
        public final long b() {
            throw new NoSuchElementException();
        }

        @Override // com.amazon.aps.iva.q6.n
        public final boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
