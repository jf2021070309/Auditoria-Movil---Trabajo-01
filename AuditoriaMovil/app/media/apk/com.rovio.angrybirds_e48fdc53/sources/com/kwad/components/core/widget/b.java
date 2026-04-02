package com.kwad.components.core.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.kwad.components.core.widget.a;
import com.kwad.components.core.widget.c;
import com.kwad.components.model.FeedType;
import com.kwad.sdk.core.report.j;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.m.l;
import com.kwad.sdk.utils.bi;
import com.kwad.sdk.widget.KSFrameLayout;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class b<T extends AdTemplate> extends KSFrameLayout implements DialogInterface.OnDismissListener, DialogInterface.OnShowListener, com.kwad.sdk.core.h.c {
    public a XZ;
    private long Ya;
    private com.kwad.components.core.widget.a.b bG;
    private com.kwad.sdk.core.h.b bJ;
    public AdInfo mAdInfo;
    public T mAdTemplate;
    public Context mContext;
    protected boolean mE;
    private bi mTimerHelper;

    /* loaded from: classes.dex */
    public interface a {
        void onAdClicked();

        void onAdShow();

        void onDislikeClicked();

        void onDownloadTipsDialogDismiss();

        void onDownloadTipsDialogShow();
    }

    public b(Context context) {
        this(context, null);
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
        initView();
    }

    private void a(ViewGroup viewGroup) {
        if (!com.kwad.sdk.core.config.d.zI() && com.kwad.sdk.core.config.d.zH() >= 0.0f) {
            c(viewGroup);
            com.kwad.components.core.widget.a aVar = new com.kwad.components.core.widget.a(viewGroup.getContext(), viewGroup);
            viewGroup.addView(aVar);
            aVar.setViewCallback(new a.InterfaceC0223a() { // from class: com.kwad.components.core.widget.b.1
                @Override // com.kwad.components.core.widget.a.InterfaceC0223a
                public final void aa() {
                }

                @Override // com.kwad.components.core.widget.a.InterfaceC0223a
                public final void ab() {
                    if (b.this.mAdTemplate.mPvReported && b.this.mE) {
                        long Kb = b.this.getTimerHelper().Kb();
                        b.this.Ya += Kb;
                        com.kwad.sdk.core.report.a.a(b.this.mAdTemplate, Kb, (JSONObject) null);
                        b.this.mE = false;
                    }
                }

                @Override // com.kwad.components.core.widget.a.InterfaceC0223a
                public final void eJ() {
                    if (b.this.mAdTemplate.mPvReported && b.this.mE) {
                        long Kb = b.this.getTimerHelper().Kb();
                        b.this.Ya += Kb;
                        com.kwad.sdk.core.report.a.a(b.this.mAdTemplate, Kb, (JSONObject) null);
                        b.this.mE = false;
                    }
                }

                @Override // com.kwad.components.core.widget.a.InterfaceC0223a
                public final void k(View view) {
                    if (!b.this.mAdTemplate.mPvReported && b.this.XZ != null) {
                        b.this.mE = true;
                        b.this.bt();
                        b.this.getTimerHelper().startTiming();
                    }
                    if (!b.this.mE) {
                        b.this.getTimerHelper().startTiming();
                    }
                    b.this.mE = true;
                }
            });
            aVar.so();
            return;
        }
        c b = b(viewGroup);
        if (b == null) {
            b = new c(viewGroup.getContext(), viewGroup);
            viewGroup.addView(b);
        }
        b.setViewCallback(new c.a() { // from class: com.kwad.components.core.widget.b.2
            @Override // com.kwad.components.core.widget.c.a
            public final void eK() {
                b.this.bt();
            }
        });
        b.setNeedCheckingShow(true);
    }

    private static c b(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof c) {
                return (c) childAt;
            }
        }
        return null;
    }

    public static void c(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof com.kwad.components.core.widget.a) {
                viewGroup.removeView(childAt);
            }
        }
    }

    private void initView() {
        l.inflate(this.mContext, getLayoutId(), this);
        setRatio(getHWRatio());
        ba();
        this.bG = new com.kwad.components.core.widget.a.b(this, 70);
    }

    public void aK() {
    }

    public final void aK(int i) {
        com.kwad.sdk.core.report.a.a(this.mAdTemplate, i, getTouchCoords());
        a aVar = this.XZ;
        if (aVar != null) {
            aVar.onAdClicked();
        }
    }

    public void aL() {
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public void aa() {
        super.aa();
        this.bG.a(this);
        this.bG.a(this.bJ);
        this.bG.sB();
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public void ab() {
        super.ab();
        this.bG.b(this);
        this.bG.sC();
        bd();
    }

    public void b(T t) {
        this.mAdTemplate = t;
        this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(t);
        a((ViewGroup) this);
    }

    protected abstract void ba();

    public void bd() {
    }

    protected void bt() {
        a aVar;
        if (!this.mAdTemplate.mPvReported && (aVar = this.XZ) != null) {
            aVar.onAdShow();
        }
        j jVar = new j();
        z.a aVar2 = new z.a();
        FeedType fromInt = FeedType.fromInt(this.mAdTemplate.type);
        if (fromInt == FeedType.FEED_TYPE_TEXT_NEW) {
            fromInt = FeedType.FEED_TYPE_TEXT_BELOW;
        }
        aVar2.templateId = String.valueOf(fromInt.getType());
        jVar.a(aVar2);
        jVar.t(getHeight(), getWidth());
        com.kwad.components.core.t.b.ql().a(this.mAdTemplate, null, jVar);
    }

    public final void c(j jVar) {
        jVar.c(getTouchCoords());
        com.kwad.sdk.core.report.a.a(this.mAdTemplate, jVar, (JSONObject) null);
        a aVar = this.XZ;
        if (aVar != null) {
            aVar.onAdClicked();
        }
    }

    public final void ed() {
        a aVar = this.XZ;
        if (aVar != null) {
            aVar.onAdClicked();
        }
    }

    protected float getHWRatio() {
        return 0.0f;
    }

    protected abstract int getLayoutId();

    public long getStayTime() {
        return this.Ya + getTimerHelper().getTime();
    }

    public bi getTimerHelper() {
        if (this.mTimerHelper == null) {
            this.mTimerHelper = new bi();
        }
        return this.mTimerHelper;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        a aVar = this.XZ;
        if (aVar != null) {
            aVar.onDownloadTipsDialogDismiss();
        }
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        a aVar = this.XZ;
        if (aVar != null) {
            aVar.onDownloadTipsDialogShow();
        }
    }

    public void setInnerAdInteractionListener(a aVar) {
        this.XZ = aVar;
    }

    public void setMargin(int i) {
        setPadding(i, i, i, i);
        setBackgroundColor(-1);
    }

    public void setPageExitListener(com.kwad.sdk.core.h.b bVar) {
        this.bJ = bVar;
    }

    public final void sp() {
        com.kwad.sdk.core.report.a.aw(this.mAdTemplate);
        a aVar = this.XZ;
        if (aVar != null) {
            aVar.onDislikeClicked();
        }
    }
}
