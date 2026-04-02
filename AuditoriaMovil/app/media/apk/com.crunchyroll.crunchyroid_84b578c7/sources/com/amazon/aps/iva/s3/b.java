package com.amazon.aps.iva.s3;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import com.amazon.aps.iva.f1.d0;
import com.amazon.aps.iva.p3.c;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.s3.d;
/* compiled from: InputConnectionCompat.java */
/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {
    public final /* synthetic */ c a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InputConnection inputConnection, d0 d0Var) {
        super(inputConnection, false);
        this.a = d0Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        d dVar;
        Bundle bundle2;
        c.b c0599c;
        if (inputContentInfo == null) {
            dVar = null;
        } else {
            dVar = new d(new d.a(inputContentInfo));
        }
        View view = (View) ((d0) this.a).c;
        boolean z = false;
        if ((i & 1) != 0) {
            try {
                ((d.a) dVar.a).b();
                Parcelable parcelable = (Parcelable) ((d.a) dVar.a).a();
                if (bundle == null) {
                    bundle2 = new Bundle();
                } else {
                    bundle2 = new Bundle(bundle);
                }
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((d.a) dVar.a).a.getDescription();
        d.a aVar = (d.a) dVar.a;
        ClipData clipData = new ClipData(description, new ClipData.Item(aVar.a.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            c0599c = new c.a(clipData, 2);
        } else {
            c0599c = new c.C0599c(clipData, 2);
        }
        c0599c.a(aVar.a.getLinkUri());
        c0599c.setExtras(bundle2);
        if (g0.j(view, c0599c.build()) == null) {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
