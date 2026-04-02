package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import e.d.b.b.j.y.d;
import e.d.b.b.j.y.h;
import e.d.b.b.j.y.m;
@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements d {
    @Override // e.d.b.b.j.y.d
    public m create(h hVar) {
        return new e.d.b.b.i.d(hVar.a(), hVar.d(), hVar.c());
    }
}
