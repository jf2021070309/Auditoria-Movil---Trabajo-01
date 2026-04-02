package com.ellation.crunchyroll.presentation.legalinfo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazon.aps.iva.c8.h;
import com.amazon.aps.iva.ds.c;
import com.amazon.aps.iva.mh.i;
import com.amazon.aps.iva.mh.k;
import com.amazon.aps.iva.u10.a;
import com.amazon.aps.iva.u10.b;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ys.f;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.application.a;
import kotlin.Metadata;
/* compiled from: AppLegalInfoLayout.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/presentation/legalinfo/AppLegalInfoLayout;", "Landroid/widget/LinearLayout;", "Lcom/amazon/aps/iva/u10/b;", "", "appVersion", "Lcom/amazon/aps/iva/kb0/q;", "setAppVersionText", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AppLegalInfoLayout extends LinearLayout implements b {
    public static final /* synthetic */ int c = 0;
    public final k b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLegalInfoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.f(context, "context");
        a aVar = new a(new f(context), this);
        com.ellation.crunchyroll.application.a aVar2 = a.C0959a.a;
        if (aVar2 != null) {
            Object c2 = aVar2.c().c(com.amazon.aps.iva.cx.b.class, "app_legal_links");
            if (c2 != null) {
                com.amazon.aps.iva.mh.f fVar = new com.amazon.aps.iva.mh.f(context, (com.amazon.aps.iva.cx.b) c2);
                com.amazon.aps.iva.ls.a aVar3 = com.amazon.aps.iva.ls.a.SETTINGS;
                c cVar = c.b;
                j.f(aVar3, "screen");
                this.b = new k(fVar, new i(cVar, aVar3), this);
                View.inflate(context, R.layout.layout_app_legal_info, this);
                findViewById(R.id.tos_link).setOnClickListener(new h(this, 17));
                TextView textView = (TextView) findViewById(R.id.privacy_link);
                textView.setOnClickListener(new com.amazon.aps.iva.fe.a(this, 12));
                textView.setPaintFlags(textView.getPaintFlags() | 128);
                aVar.onCreate();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.AppLegalLinksConfigImpl");
        }
        j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.u10.b
    public void setAppVersionText(String str) {
        j.f(str, "appVersion");
        ((TextView) findViewById(R.id.version_text)).setText(getContext().getString(R.string.version, str));
    }
}
