package e.j.d.z;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import e.d.d.g;
import e.d.d.m.i;
import e.d.d.m.j.j.z;
import h.o.c.j;
import java.util.Objects;
import n.a.a;
/* loaded from: classes2.dex */
public final class b extends a.c {

    /* renamed from: b  reason: collision with root package name */
    public final Context f8907b;

    public b(Context context) {
        j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f8907b = context;
    }

    @Override // n.a.a.c
    public void i(int i2, String str, String str2, Throwable th) {
        i iVar;
        j.e(str2, "message");
        if (i2 == 2 || i2 == 3) {
            return;
        }
        i iVar2 = null;
        try {
            iVar = i.a();
        } catch (IllegalStateException unused) {
            g.f(this.f8907b);
            try {
                iVar = i.a();
            } catch (IllegalStateException unused2) {
                iVar = null;
            }
        }
        if (iVar != null) {
            String str3 = ((Object) str) + CoreConstants.COLON_CHAR + str2;
            z zVar = iVar.a;
            Objects.requireNonNull(zVar);
            zVar.f7226f.k(System.currentTimeMillis() - zVar.f7223c, str3);
        }
        if (th == null || i2 != 6) {
            return;
        }
        try {
            iVar2 = i.a();
        } catch (IllegalStateException unused3) {
            g.f(this.f8907b);
            try {
                iVar2 = i.a();
            } catch (IllegalStateException unused4) {
            }
        }
        if (iVar2 == null) {
            return;
        }
        iVar2.b(th);
    }
}
