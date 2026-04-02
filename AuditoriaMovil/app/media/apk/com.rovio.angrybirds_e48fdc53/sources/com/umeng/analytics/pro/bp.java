package com.umeng.analytics.pro;

import com.umeng.analytics.pro.bp;
import com.umeng.analytics.pro.bw;
import java.io.Serializable;
/* compiled from: TBase.java */
/* loaded from: classes3.dex */
public interface bp<T extends bp<?, ?>, F extends bw> extends Serializable {
    void clear();

    bp<T, F> deepCopy();

    F fieldForId(int i);

    void read(co coVar) throws bv;

    void write(co coVar) throws bv;
}
