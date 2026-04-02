package com.amazon.aps.iva.qy;

import com.amazon.aps.iva.aq.j;
import com.amazon.aps.iva.wy.e;
import kotlin.Metadata;
/* compiled from: BaseFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/aps/iva/qy/a;", "Lcom/amazon/aps/iva/wy/e;", "<init>", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class a extends e {
    public a() {
        super(0);
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        j.M(this);
    }
}
