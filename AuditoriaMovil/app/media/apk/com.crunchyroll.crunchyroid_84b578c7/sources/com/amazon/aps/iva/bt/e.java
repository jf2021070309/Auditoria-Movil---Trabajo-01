package com.amazon.aps.iva.bt;

import com.amazon.aps.iva.u70.i;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: SuccessMessage.kt */
/* loaded from: classes2.dex */
public class e extends i {
    public /* synthetic */ e(int i, String str, String[] strArr, int i2, com.amazon.aps.iva.yb0.e eVar) {
        this(i, (i2 & 2) != 0 ? null : str, strArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i, String str, String... strArr) {
        super(R.layout.layout_snackbar, com.ellation.crunchyroll.ui.R.drawable.ic_confirmation, str, i, strArr);
        j.f(strArr, "messageArgs");
    }
}
