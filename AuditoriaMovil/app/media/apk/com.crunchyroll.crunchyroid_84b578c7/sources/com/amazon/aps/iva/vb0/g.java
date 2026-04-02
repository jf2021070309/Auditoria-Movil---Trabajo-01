package com.amazon.aps.iva.vb0;

import com.amazon.aps.iva.ne0.h;
import com.amazon.aps.iva.yb0.j;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: ReadWrite.kt */
/* loaded from: classes4.dex */
public final class g implements h<String> {
    public final BufferedReader a;

    /* compiled from: ReadWrite.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<String>, com.amazon.aps.iva.zb0.a {
        public String b;
        public boolean c;

        public a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.b == null && !this.c) {
                String readLine = g.this.a.readLine();
                this.b = readLine;
                if (readLine == null) {
                    this.c = true;
                }
            }
            if (this.b != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final String next() {
            if (hasNext()) {
                String str = this.b;
                this.b = null;
                j.c(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(BufferedReader bufferedReader) {
        this.a = bufferedReader;
    }

    @Override // com.amazon.aps.iva.ne0.h
    public final Iterator<String> iterator() {
        return new a();
    }
}
