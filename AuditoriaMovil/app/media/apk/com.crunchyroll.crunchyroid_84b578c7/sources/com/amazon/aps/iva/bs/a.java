package com.amazon.aps.iva.bs;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: AbstractSampler.java */
@Deprecated
/* loaded from: classes2.dex */
public abstract class a implements g {
    public final HashMap a = new HashMap();

    @Override // com.amazon.aps.iva.bs.g
    public final boolean c(com.amazon.aps.iva.ur.a aVar) {
        for (Map.Entry entry : this.a.entrySet()) {
            Object obj = aVar.h().get(entry.getKey());
            if (obj != null) {
                if (((Pattern) entry.getValue()).matcher(String.valueOf(obj)).matches()) {
                    return false;
                }
            }
        }
        return true;
    }
}
