package com.amazon.aps.iva.b8;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import com.amazon.aps.iva.b8.m0;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.d0;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements m0.g {
    public final /* synthetic */ m0 b;
    public final /* synthetic */ MediaDescriptionCompat c;
    public final /* synthetic */ int d;

    public /* synthetic */ y(m0 m0Var, MediaDescriptionCompat mediaDescriptionCompat, int i) {
        this.b = m0Var;
        this.c = mediaDescriptionCompat;
        this.d = i;
    }

    @Override // com.amazon.aps.iva.b8.m0.g
    public final void b(q.d dVar) {
        byte[] bArr;
        byte[] bArr2;
        m0 m0Var = this.b;
        m0Var.getClass();
        MediaDescriptionCompat mediaDescriptionCompat = this.c;
        if (TextUtils.isEmpty(mediaDescriptionCompat.b)) {
            com.amazon.aps.iva.t5.p.g();
            return;
        }
        b0.b bVar = new b0.b();
        String str = mediaDescriptionCompat.b;
        if (str == null) {
            str = "";
        }
        bVar.a = str;
        b0.h.a aVar = new b0.h.a();
        aVar.a = mediaDescriptionCompat.i;
        bVar.m = new b0.h(aVar);
        d0.a aVar2 = new d0.a();
        aVar2.a = mediaDescriptionCompat.c;
        aVar2.f = mediaDescriptionCompat.d;
        aVar2.g = mediaDescriptionCompat.e;
        aVar2.l = mediaDescriptionCompat.g;
        int i = 0;
        aVar2.h = q1.f(RatingCompat.e(0));
        Bundle bundle = null;
        Bitmap bitmap = mediaDescriptionCompat.f;
        if (bitmap != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (IOException e) {
                com.amazon.aps.iva.t5.p.h("Failed to convert iconBitmap to artworkData", e);
                bArr = null;
            }
            if (bArr == null) {
                bArr2 = null;
            } else {
                bArr2 = (byte[]) bArr.clone();
            }
            aVar2.j = bArr2;
            aVar2.k = 3;
        }
        Bundle bundle2 = mediaDescriptionCompat.h;
        if (bundle2 != null) {
            bundle = new Bundle(bundle2);
        }
        if (bundle != null && bundle.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            long j = bundle.getLong("android.media.extra.BT_FOLDER_TYPE");
            if (j != 0) {
                if (j == 1) {
                    i = 1;
                } else if (j == 2) {
                    i = 2;
                } else if (j == 3) {
                    i = 3;
                } else if (j == 4) {
                    i = 4;
                } else if (j == 5) {
                    i = 5;
                } else if (j == 6) {
                    i = 6;
                }
            }
            aVar2.o = Integer.valueOf(i);
            bundle.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        aVar2.p = Boolean.FALSE;
        if (bundle != null && bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            aVar2.F = Integer.valueOf((int) bundle.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null && !bundle.isEmpty()) {
            aVar2.G = bundle;
        }
        aVar2.q = Boolean.TRUE;
        bVar.k = new com.amazon.aps.iva.q5.d0(aVar2);
        Futures.addCallback(m0Var.b.h(ImmutableList.of(bVar.a())), new n0(this.d, dVar, m0Var), MoreExecutors.directExecutor());
    }
}
