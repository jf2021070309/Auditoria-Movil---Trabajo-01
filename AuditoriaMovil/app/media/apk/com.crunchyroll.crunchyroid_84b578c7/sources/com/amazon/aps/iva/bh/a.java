package com.amazon.aps.iva.bh;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.xb0.q;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import com.ellation.crunchyroll.api.etp.content.EmptyMeta;
import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import com.ellation.crunchyroll.api.model.HomeFeedItemResponseType;
import java.util.List;
/* compiled from: BaseFeedLayout.kt */
/* loaded from: classes.dex */
public abstract class a extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
    }

    public abstract void G4(Intent intent);

    public abstract void H6();

    public abstract void U2(Fragment fragment, com.amazon.aps.iva.xb0.a<Boolean> aVar, com.amazon.aps.iva.xb0.a<Boolean> aVar2, q<? super Integer, ? super Integer, ? super d<? super ContentApiResponse<HomeFeedItemRaw, EmptyMeta>>, ? extends Object> qVar, List<? extends HomeFeedItemResponseType> list, boolean z, boolean z2, com.amazon.aps.iva.ls.a aVar3);

    public abstract void b1();
}
