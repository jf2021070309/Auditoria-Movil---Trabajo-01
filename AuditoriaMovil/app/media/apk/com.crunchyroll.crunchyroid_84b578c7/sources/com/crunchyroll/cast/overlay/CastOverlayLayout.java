package com.crunchyroll.cast.overlay;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.cf.a;
import com.amazon.aps.iva.cf.c;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
/* compiled from: CastOverlayView.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001¨\u0006\u0007"}, d2 = {"Lcom/crunchyroll/cast/overlay/CastOverlayLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/cf/c;", "Lcom/amazon/aps/iva/cf/a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/aps/iva/kb0/q;", "setListener", "cast-api_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"InflateParams"})
/* loaded from: classes.dex */
public final class CastOverlayLayout extends g implements c {
    public final /* synthetic */ c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_cast_overlay, (ViewGroup) null, false);
        j.e(inflate, "from(context)\n        .i…ast_overlay, null, false)");
        this.b = (c) inflate;
        addView(inflate);
    }

    @Override // com.amazon.aps.iva.cf.c
    public void setListener(a aVar) {
        j.f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b.setListener(aVar);
    }
}
