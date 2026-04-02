package com.amazon.aps.iva.ec0;

import com.amazon.aps.iva.aq.k;
import java.util.Iterator;
/* compiled from: Progressions.kt */
/* loaded from: classes4.dex */
public class a implements Iterable<Character>, com.amazon.aps.iva.zb0.a {
    public final char b;
    public final char c;
    public final int d = 1;

    public a(char c, char c2) {
        this.b = c;
        this.c = (char) k.p(c, c2, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new b(this.b, this.c, this.d);
    }
}
