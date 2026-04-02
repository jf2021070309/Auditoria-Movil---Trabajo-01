package com.kwad.components.ad.splashscreen.c;

import android.content.Context;
import android.os.Vibrator;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
public abstract class i extends e {
    private static long jO = 400;
    private com.kwad.components.ad.splashscreen.f.a De;
    private Vibrator dP;

    private void lh() {
        if (this.CS != null) {
            com.kwad.components.ad.splashscreen.f.a aVar = this.De;
            if (aVar == null) {
                this.De = new com.kwad.components.ad.splashscreen.f.a(getContext(), this.CS.mAdTemplate) { // from class: com.kwad.components.ad.splashscreen.c.i.1
                    @Override // com.kwad.components.ad.splashscreen.f.a
                    public final void aa(String str) {
                        i.this.Z(str);
                    }
                };
            } else {
                aVar.setAdTemplate(this.CS.mAdTemplate);
            }
            com.kwad.components.core.e.d.c cVar = this.CS.mApkDownloadHelper;
            if (cVar != null) {
                cVar.b(this.De);
            }
        }
    }

    protected abstract void Z(String str);

    @Override // com.kwad.components.ad.splashscreen.c.e, com.kwad.sdk.mvp.Presenter
    public void ah() {
        super.ah();
        if (this.CS == null) {
            return;
        }
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.CS.mAdTemplate);
        le();
        lc();
        if (com.kwad.sdk.core.response.b.a.ax(ck)) {
            lh();
        }
        ld();
        lf();
        lg();
    }

    protected abstract void initView();

    protected abstract void lc();

    protected abstract void ld();

    protected abstract void le();

    protected abstract void lf();

    protected abstract void lg();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void li() {
        Context context = getContext();
        if (context != null) {
            this.dP = (Vibrator) context.getSystemService("vibrator");
        }
        bj.a(getContext(), this.dP);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        initView();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public void onUnbind() {
        super.onUnbind();
        bj.b(getContext(), this.dP);
    }
}
