package com.bytedance.msdk.util.multiprocess.sp.provider;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_for12.bykvm_19do.d;
/* loaded from: classes.dex */
public class c implements b {
    private final d a = new d();

    @Override // com.bytedance.msdk.util.multiprocess.sp.provider.b
    public int a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.a.a(uri, contentValues, str, strArr);
    }

    @Override // com.bytedance.msdk.util.multiprocess.sp.provider.b
    public int a(Uri uri, String str, String[] strArr) {
        return this.a.a(uri, str, strArr);
    }

    @Override // com.bytedance.msdk.util.multiprocess.sp.provider.b
    public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.a.a(uri, strArr, str, strArr2, str2);
    }

    @Override // com.bytedance.msdk.util.multiprocess.sp.provider.b
    public Uri a(Uri uri, ContentValues contentValues) {
        return this.a.a(uri, contentValues);
    }

    public String a() {
        return this.a.a();
    }

    @Override // com.bytedance.msdk.util.multiprocess.sp.provider.b
    public String a(Uri uri) {
        return this.a.a(uri);
    }
}
