package com.bytedance.msdk.util.multiprocess.sp.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.msdk.adapter.util.Logger;
/* loaded from: classes.dex */
public class GMMultiProvider extends ContentProvider {
    private final c a = new c();
    private final a b = new a(new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_if122.a());

    private b a(Uri uri) {
        String str;
        if (uri != null) {
            String[] split = uri.getPath().split("/");
            if (split.length < 2) {
                str = "uri is error2";
            } else {
                String str2 = split[1];
                if (TextUtils.isEmpty(str2)) {
                    str = "uri is error3";
                } else if (str2.equals(this.b.a())) {
                    return this.b;
                } else {
                    if (str2.equals(this.a.a())) {
                        return this.a;
                    }
                    str = "uri is error4";
                }
            }
            Logger.d("TTMediationSDK", str);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        b a = a(uri);
        if (a != null) {
            return a.a(uri, str, strArr);
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        b a = a(uri);
        if (a != null) {
            return a.a(uri);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        b a = a(uri);
        if (a != null) {
            return a.a(uri, contentValues);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        b a = a(uri);
        if (a != null) {
            return a.a(uri, strArr, str, strArr2, str2);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        b a = a(uri);
        if (a != null) {
            return a.a(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
