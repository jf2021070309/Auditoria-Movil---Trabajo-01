package com.amazon.aps.iva.n5;

import android.content.Context;
import com.amazon.aps.iva.n5.e;
/* compiled from: MediaSessionManagerImplApi21.java */
/* loaded from: classes.dex */
public class c extends e {
    public c(Context context) {
        super(context);
        this.a = context;
    }

    @Override // com.amazon.aps.iva.n5.e, com.amazon.aps.iva.n5.b.a
    public boolean a(e.a aVar) {
        boolean z;
        if (this.a.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", aVar.b, aVar.c) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || super.a(aVar)) {
            return true;
        }
        return false;
    }
}
