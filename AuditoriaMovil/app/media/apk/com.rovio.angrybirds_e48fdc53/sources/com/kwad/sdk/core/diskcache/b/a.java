package com.kwad.sdk.core.diskcache.b;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.sdk.core.network.a.a;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.service.a.e;
import com.kwad.sdk.utils.ao;
import com.kwad.sdk.utils.av;
import java.io.File;
import java.io.IOException;
/* loaded from: classes.dex */
public final class a {
    private com.kwad.sdk.core.diskcache.a.a anE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.sdk.core.diskcache.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0251a {
        static final a anF = new a((byte) 0);
    }

    private a() {
    }

    /* synthetic */ a(byte b) {
        this();
    }

    public static a At() {
        return C0251a.anF;
    }

    private boolean Au() {
        init(((e) ServiceProvider.get(e.class)).getContext());
        return this.anE == null;
    }

    private File cD(String str) {
        if (Au() || TextUtils.isEmpty(str)) {
            return null;
        }
        return b.a(this.anE, str);
    }

    private synchronized void init(Context context) {
        if (this.anE != null || context == null) {
            return;
        }
        try {
            this.anE = com.kwad.sdk.core.diskcache.a.a.a(av.cL(context), 1, 1, 209715200L);
        } catch (Throwable th) {
        }
    }

    public final boolean a(String str, a.C0256a c0256a) {
        File cD;
        if (!Au() && !TextUtils.isEmpty(str)) {
            String cE = c.cE(str);
            if (b.a(this.anE, str, cE, c0256a) && (cD = cD(cE)) != null && cD.exists()) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(String str, String str2, a.C0256a c0256a) {
        File cD;
        if (!Au() && !TextUtils.isEmpty(str)) {
            String cE = c.cE(str2);
            if (b.a(this.anE, str, cE, c0256a) && (cD = cD(cE)) != null && cD.exists()) {
                return true;
            }
        }
        return false;
    }

    public final File bP(String str) {
        if (Au() || TextUtils.isEmpty(str)) {
            return null;
        }
        return cD(c.cE(str));
    }

    public final void cC(String str) {
        if (Au() || TextUtils.isEmpty(str)) {
            return;
        }
        b.a(this.anE, str, c.cE(str));
    }

    public final void delete() {
        if (Au()) {
            return;
        }
        try {
            this.anE.delete();
        } catch (IOException e) {
        }
    }

    public final boolean remove(String str) {
        if (Au()) {
            return false;
        }
        try {
            ao.ar(str, "cacheKey is not allowed empty");
            return this.anE.remove(c.cE(str));
        } catch (IOException e) {
            return false;
        }
    }
}
