package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
/* loaded from: classes2.dex */
public class CrashProvider extends ContentProvider {
    private Context a;
    private f b;
    private String c;
    private Uri e;
    private String h;
    private String i;
    private UriMatcher d = new UriMatcher(-1);
    private int f = 1;
    private int g = 2;
    private String j = "REPORTS";

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int match = this.d.match(uri);
        if (match != 1) {
            if (match == 2) {
                return this.i;
            }
            throw new IllegalArgumentException("Invalid URI: " + uri);
        }
        return this.h;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.a = getContext();
        this.b = new f(this.a);
        this.c = this.a.getPackageName();
        this.e = Uri.parse("content://" + this.c + "/REPORTS");
        this.h = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.i = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int match = this.d.match(uri);
        if (match != 1) {
            if (match == 2) {
                return f.a(Integer.parseInt(uri.getLastPathSegment()));
            }
            throw new IllegalArgumentException("Invalid URI: " + uri);
        }
        return f.b();
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
