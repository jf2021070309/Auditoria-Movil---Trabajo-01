package e.f.a;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import l.c.a.x.c;
import l.c.a.x.h;
import l.c.a.x.i;
/* loaded from: classes2.dex */
public final class b extends h {

    /* renamed from: c  reason: collision with root package name */
    public final Context f7968c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7969d;

    public b(Context context, String str) {
        this.f7968c = context;
        this.f7969d = str;
    }

    @Override // l.c.a.x.h
    public void a() {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.f7968c.getAssets().open(this.f7969d);
                c cVar = new c(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                i.d(cVar);
            } catch (IOException e2) {
                throw new IllegalStateException(this.f7969d + " missing from assets", e2);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
