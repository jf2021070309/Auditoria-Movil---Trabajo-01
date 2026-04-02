package com.bytedance.msdk.util.multiprocess.sp.provider;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.msdk.adapter.util.Logger;
/* loaded from: classes.dex */
public class a implements b {
    private bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_if122.a a;

    public a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_if122.a aVar) {
        this.a = aVar;
    }

    @Override // com.bytedance.msdk.util.multiprocess.sp.provider.b
    public int a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_if122.a aVar = this.a;
        if (aVar != null) {
            return aVar.a(uri, contentValues, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.msdk.util.multiprocess.sp.provider.b
    public int a(Uri uri, String str, String[] strArr) {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_if122.a aVar = this.a;
        if (aVar != null) {
            return aVar.a(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.msdk.util.multiprocess.sp.provider.b
    public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_if122.a aVar = this.a;
        if (aVar != null) {
            return aVar.a(uri, strArr, str, strArr2, str2);
        }
        return null;
    }

    @Override // com.bytedance.msdk.util.multiprocess.sp.provider.b
    public Uri a(Uri uri, ContentValues contentValues) {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_if122.a aVar = this.a;
        if (aVar != null) {
            return aVar.a(uri, contentValues);
        }
        return null;
    }

    public String a() {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_if122.a aVar = this.a;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    @Override // com.bytedance.msdk.util.multiprocess.sp.provider.b
    public String a(Uri uri) {
        Logger.d("wrapper getType1");
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_if122.a aVar = this.a;
        if (aVar != null) {
            return aVar.a(uri);
        }
        return null;
    }
}
