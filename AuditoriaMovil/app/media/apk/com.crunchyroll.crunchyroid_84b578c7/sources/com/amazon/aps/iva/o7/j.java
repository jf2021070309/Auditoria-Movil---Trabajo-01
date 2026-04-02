package com.amazon.aps.iva.o7;

import com.google.common.base.Splitter;
import java.util.ArrayList;
/* compiled from: SefReader.java */
/* loaded from: classes.dex */
public final class j {
    public static final Splitter d = Splitter.on(':');
    public static final Splitter e = Splitter.on('*');
    public final ArrayList a = new ArrayList();
    public int b = 0;
    public int c;

    /* compiled from: SefReader.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final long a;
        public final int b;

        public a(long j, int i) {
            this.a = j;
            this.b = i;
        }
    }
}
