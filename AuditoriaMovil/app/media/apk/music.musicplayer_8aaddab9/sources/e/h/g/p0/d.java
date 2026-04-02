package e.h.g.p0;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class d extends a {
    public Context a;

    /* renamed from: b  reason: collision with root package name */
    public Uri f8353b;

    public d(a aVar, Context context, Uri uri) {
        super(aVar);
        this.a = context;
        this.f8353b = uri;
    }

    @Override // e.h.g.p0.a
    public boolean a() {
        try {
            Context context = this.a;
            return DocumentsContract.deleteDocument(context.getContentResolver(), this.f8353b);
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    @Override // e.h.g.p0.a
    public boolean b() {
        return e.d.b.d.a.y(this.a, this.f8353b);
    }

    @Override // e.h.g.p0.a
    public String f() {
        return e.d.b.d.a.Y(this.a, this.f8353b, "_display_name", null);
    }

    @Override // e.h.g.p0.a
    public Uri g() {
        return this.f8353b;
    }

    @Override // e.h.g.p0.a
    public boolean h() {
        return "vnd.android.document/directory".equals(e.d.b.d.a.Y(this.a, this.f8353b, "mime_type", null));
    }

    @Override // e.h.g.p0.a
    public long i() {
        return e.d.b.d.a.Q(this.a, this.f8353b);
    }

    @Override // e.h.g.p0.a
    public a[] j() {
        Context context = this.a;
        Uri uri = this.f8353b;
        ContentResolver contentResolver = context.getContentResolver();
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursor.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(uri, cursor.getString(0)));
                }
            } catch (Exception e2) {
                Log.w("DocumentFile", "Failed query: " + e2);
            }
            e.d.b.d.a.r(cursor);
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            a[] aVarArr = new a[uriArr.length];
            for (int i2 = 0; i2 < uriArr.length; i2++) {
                aVarArr[i2] = new d(this, this.a, uriArr[i2]);
            }
            return aVarArr;
        } catch (Throwable th) {
            e.d.b.d.a.r(cursor);
            throw th;
        }
    }
}
