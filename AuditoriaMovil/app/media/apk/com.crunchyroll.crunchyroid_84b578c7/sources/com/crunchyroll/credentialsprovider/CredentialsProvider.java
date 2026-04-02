package com.crunchyroll.credentialsprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.credentialsprovider.a;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenStorage;
import kotlin.Metadata;
/* compiled from: CredentialsProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/crunchyroll/credentialsprovider/CredentialsProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "credentials-provider_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CredentialsProvider extends ContentProvider {
    public final m b = f.b(a.h);

    /* compiled from: CredentialsProvider.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<RefreshTokenStorage> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final RefreshTokenStorage invoke() {
            int i = com.crunchyroll.credentialsprovider.a.a;
            com.amazon.aps.iva.zf.a aVar = a.C0955a.a;
            if (aVar != null) {
                return aVar.getRefreshTokenStorage();
            }
            j.m("dependencies");
            throw null;
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        j.f(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        j.f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        j.f(uri, "uri");
        return uri;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        j.f(uri, "uri");
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"cr_refresh_token"});
        matrixCursor.addRow(new String[]{((RefreshTokenStorage) this.b.getValue()).getRefreshToken()});
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        j.f(uri, "uri");
        return 0;
    }
}
