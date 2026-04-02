package com.amazon.aps.iva.b6;

import android.util.Base64;
import com.google.common.base.Supplier;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements Supplier {
    @Override // com.google.common.base.Supplier
    public final Object get() {
        byte[] bArr = new byte[12];
        m0.i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }
}
