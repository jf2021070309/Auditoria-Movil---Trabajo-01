package com.bytedance.msdk.api.v2.ad.draw;

import android.content.Context;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.e;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdLoadInfo;
import com.bytedance.msdk.api.GMAdEcpmInfo;
import com.bytedance.msdk.api.v2.ad.GMAdTokenCallback;
import com.bytedance.msdk.api.v2.ad.GMBaseAd;
import com.bytedance.msdk.api.v2.slot.GMAdSlotDraw;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class GMUnifiedDrawAd extends GMBaseAd {
    private e b;

    public GMUnifiedDrawAd(Context context, String str) {
        this.b = new e(context, str);
    }

    public void destroy() {
        e eVar = this.b;
        if (eVar != null) {
            eVar.D();
        }
    }

    public List<AdLoadInfo> getAdLoadInfoList() {
        e eVar = this.b;
        return eVar != null ? eVar.E() : new ArrayList();
    }

    public List<GMAdEcpmInfo> getCacheList() {
        e eVar = this.b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public List<GMAdEcpmInfo> getMultiBiddingEcpm() {
        e eVar = this.b;
        if (eVar != null) {
            return eVar.f();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.v2.ad.GMBaseAd
    public void loadAd(GMAdSlotDraw gMAdSlotDraw, GMDrawAdLoadCallback gMDrawAdLoadCallback) {
        super.loadAd(gMAdSlotDraw, gMDrawAdLoadCallback);
        if (this.b != null) {
            if (a.f().a(this.b.l(), 9) || gMDrawAdLoadCallback == null) {
                this.b.a(getAdSlot(), gMAdSlotDraw, gMDrawAdLoadCallback);
            } else {
                gMDrawAdLoadCallback.onAdLoadFail(new AdError(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME, AdError.getMessage(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME)));
            }
        }
    }

    public void loadAdByAdm(String str, GMDrawAdLoadCallback gMDrawAdLoadCallback) {
        e eVar = this.b;
        if (eVar != null) {
            eVar.a(str, gMDrawAdLoadCallback);
        }
    }

    public void loadToken(GMAdSlotDraw gMAdSlotDraw, GMAdTokenCallback gMAdTokenCallback) {
        super.loadAd(gMAdSlotDraw, (GMDrawAdLoadCallback) null);
        if (this.b != null) {
            if (a.f().a(this.b.l(), 9) || gMAdTokenCallback == null) {
                this.b.a(getAdSlot(), gMAdSlotDraw, gMAdTokenCallback);
            } else {
                gMAdTokenCallback.onAdTokenLoadedFail(new AdError(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME, AdError.getMessage(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME)));
            }
        }
    }
}
