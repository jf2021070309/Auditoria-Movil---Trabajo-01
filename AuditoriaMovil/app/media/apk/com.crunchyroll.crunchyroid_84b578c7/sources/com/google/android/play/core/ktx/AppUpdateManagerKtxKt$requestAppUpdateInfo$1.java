package com.google.android.play.core.ktx;

import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.c;
import com.amazon.aps.iva.qb0.e;
import kotlin.Metadata;
/* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
@e(c = "com.google.android.play.core.ktx.AppUpdateManagerKtxKt", f = "AppUpdateManagerKtx.kt", l = {226}, m = "requestAppUpdateInfo")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppUpdateManagerKtxKt$requestAppUpdateInfo$1 extends c {
    int label;
    /* synthetic */ Object result;

    public AppUpdateManagerKtxKt$requestAppUpdateInfo$1(d<? super AppUpdateManagerKtxKt$requestAppUpdateInfo$1> dVar) {
        super(dVar);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AppUpdateManagerKtxKt.requestAppUpdateInfo(null, this);
    }
}
