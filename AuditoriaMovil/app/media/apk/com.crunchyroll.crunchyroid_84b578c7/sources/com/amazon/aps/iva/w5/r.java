package com.amazon.aps.iva.w5;

import com.amazon.aps.iva.q.c0;
import com.google.android.gms.cast.CastStatusCodes;
import java.util.List;
import java.util.Map;
/* compiled from: HttpDataSource.java */
/* loaded from: classes.dex */
public final class r extends p {
    public final int f;
    public final Map<String, List<String>> g;

    public r(int i, g gVar, Map map, i iVar) {
        super(c0.a("Response code: ", i), gVar, iVar, (int) CastStatusCodes.APPLICATION_NOT_FOUND);
        this.f = i;
        this.g = map;
    }
}
