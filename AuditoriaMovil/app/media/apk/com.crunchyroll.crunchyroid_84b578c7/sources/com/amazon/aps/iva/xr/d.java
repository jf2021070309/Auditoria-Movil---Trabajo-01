package com.amazon.aps.iva.xr;

import java.math.BigInteger;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ExtractedContext.java */
/* loaded from: classes2.dex */
public final class d extends h {
    public final BigInteger c;
    public final BigInteger d;
    public final int e;
    public final Map<String, String> f;
    public final AtomicBoolean g;

    public d(BigInteger bigInteger, BigInteger bigInteger2, int i, String str, Map<String, String> map, Map<String, String> map2) {
        super(str, map2);
        this.g = new AtomicBoolean(false);
        this.c = bigInteger;
        this.d = bigInteger2;
        this.e = i;
        this.f = map;
    }
}
