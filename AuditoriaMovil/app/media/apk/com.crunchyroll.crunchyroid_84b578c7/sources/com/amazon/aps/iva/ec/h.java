package com.amazon.aps.iva.ec;

import com.amazon.aps.iva.ec.h;
import com.amazon.aps.iva.hd.l;
/* compiled from: TransitionOptions.java */
/* loaded from: classes.dex */
public abstract class h<CHILD extends h<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    public com.amazon.aps.iva.fd.e<? super TranscodeType> b = com.amazon.aps.iva.fd.c.b;

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return l.b(this.b, ((h) obj).b);
        }
        return false;
    }

    public int hashCode() {
        com.amazon.aps.iva.fd.e<? super TranscodeType> eVar = this.b;
        if (eVar != null) {
            return eVar.hashCode();
        }
        return 0;
    }
}
