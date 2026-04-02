package com.zipoapps.permissions;

import android.os.Build;
import c.a.h.b;
import c.b.c.l;
import c.i.c.c;
import ch.qos.logback.core.CoreConstants;
import h.o.c.j;
import n.a.a;
/* loaded from: classes2.dex */
public final class PermissionRequester extends BasePermissionRequester {
    @Override // com.zipoapps.permissions.BasePermissionRequester
    public b<?> g() {
        return null;
    }

    @Override // com.zipoapps.permissions.BasePermissionRequester
    public void i() {
        int i2;
        l lVar = this.a;
        j.e(lVar, CoreConstants.CONTEXT_SCOPE_VALUE);
        j.e(null, "permission");
        boolean z = true;
        if (j.a(null, "android.permission.WRITE_EXTERNAL_STORAGE") && (i2 = Build.VERSION.SDK_INT) > 28) {
            a.f9946d.l(j.i("Do not request WRITE_EXTERNAL_STORAGE on Android ", Integer.valueOf(i2)), new Object[0]);
        } else if (c.i.d.a.a(lVar, null) != 0) {
            z = false;
        }
        if (z) {
            return;
        }
        if (c.d(this.a, null)) {
            boolean z2 = this.f4888b;
        }
        try {
            throw null;
        } catch (Throwable th) {
            a.f9946d.c(th);
        }
    }
}
