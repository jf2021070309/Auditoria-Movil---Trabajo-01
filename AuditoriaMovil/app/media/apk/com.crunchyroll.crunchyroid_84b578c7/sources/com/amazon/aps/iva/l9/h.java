package com.amazon.aps.iva.l9;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.aps.iva.u8.b;
/* compiled from: WorkDatabase.java */
/* loaded from: classes.dex */
public final class h implements b.c {
    public final /* synthetic */ Context a;

    public h(Context context) {
        this.a = context;
    }

    @Override // com.amazon.aps.iva.u8.b.c
    public final com.amazon.aps.iva.u8.b a(b.C0760b c0760b) {
        b.a aVar = c0760b.c;
        if (aVar != null) {
            Context context = this.a;
            if (context != null) {
                String str = c0760b.b;
                if (!TextUtils.isEmpty(str)) {
                    return new com.amazon.aps.iva.v8.b(context, str, aVar, true);
                }
                throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
            }
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.");
    }
}
