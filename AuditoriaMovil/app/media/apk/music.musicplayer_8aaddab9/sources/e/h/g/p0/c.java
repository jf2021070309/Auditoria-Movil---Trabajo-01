package e.h.g.p0;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.FileNotFoundException;
/* loaded from: classes2.dex */
public class c extends a {
    public Context a;

    /* renamed from: b  reason: collision with root package name */
    public Uri f8352b;

    public c(a aVar, Context context, Uri uri) {
        super(null);
        this.a = context;
        this.f8352b = uri;
    }

    @Override // e.h.g.p0.a
    public boolean a() {
        try {
            Context context = this.a;
            return DocumentsContract.deleteDocument(context.getContentResolver(), this.f8352b);
        } catch (FileNotFoundException | IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // e.h.g.p0.a
    public boolean b() {
        return e.d.b.d.a.y(this.a, this.f8352b);
    }

    @Override // e.h.g.p0.a
    public String f() {
        return e.d.b.d.a.Y(this.a, this.f8352b, "_display_name", null);
    }

    @Override // e.h.g.p0.a
    public Uri g() {
        return this.f8352b;
    }

    @Override // e.h.g.p0.a
    public boolean h() {
        return "vnd.android.document/directory".equals(e.d.b.d.a.Y(this.a, this.f8352b, "mime_type", null));
    }

    @Override // e.h.g.p0.a
    public long i() {
        return e.d.b.d.a.Q(this.a, this.f8352b);
    }

    @Override // e.h.g.p0.a
    public a[] j() {
        throw new UnsupportedOperationException();
    }
}
