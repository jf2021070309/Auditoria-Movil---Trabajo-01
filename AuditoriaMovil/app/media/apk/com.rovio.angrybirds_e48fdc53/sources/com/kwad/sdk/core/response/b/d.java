package com.kwad.sdk.core.response.b;

import android.text.TextUtils;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.response.model.PhotoInfo;
import com.kwad.sdk.service.ServiceProvider;
import java.util.List;
/* loaded from: classes.dex */
public final class d {
    private static e Cz() {
        com.kwad.sdk.service.a.e eVar = (com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class);
        if (eVar != null) {
            return eVar.sI();
        }
        return null;
    }

    public static AdTemplate a(List<AdTemplate> list, long j, int i) {
        if (j >= 0 && list != null) {
            for (AdTemplate adTemplate : list) {
                if (b(adTemplate, j, i)) {
                    return adTemplate;
                }
            }
        }
        return null;
    }

    public static boolean b(AdTemplate adTemplate, long j, int i) {
        long cu = cu(adTemplate);
        int ce = ce(adTemplate);
        if (i > 0) {
            if (cu == j && ce == i) {
                return true;
            }
        } else if (cu == j) {
            return true;
        }
        return false;
    }

    public static boolean cA(AdTemplate adTemplate) {
        AdInfo ck = ck(adTemplate);
        return ck.adStyleConfInfo.adPushDownloadJumpType == 0 && ce(adTemplate) == 17 && a.ax(ck);
    }

    public static boolean cc(AdTemplate adTemplate) {
        return (adTemplate.realShowType != 2 || adTemplate.adInfoList.isEmpty() || adTemplate.adInfoList.get(0) == null) ? false : true;
    }

    public static long cd(AdTemplate adTemplate) {
        return adTemplate.posId;
    }

    public static int ce(AdTemplate adTemplate) {
        return adTemplate.adStyle;
    }

    @Deprecated
    public static int cf(AdTemplate adTemplate) {
        if (adTemplate == null || adTemplate.mAdScene == null) {
            return 0;
        }
        return adTemplate.mAdScene.getAdStyle();
    }

    public static int cg(AdTemplate adTemplate) {
        return adTemplate.contentType;
    }

    public static long ch(AdTemplate adTemplate) {
        return adTemplate.llsid;
    }

    public static String ci(AdTemplate adTemplate) {
        return adTemplate.extra;
    }

    public static String cj(AdTemplate adTemplate) {
        return adTemplate.impAdExtra;
    }

    public static AdInfo ck(AdTemplate adTemplate) {
        AdInfo adInfo = adTemplate.adInfoList.size() > 0 ? adTemplate.adInfoList.get(0) : null;
        if (adInfo == null) {
            com.kwad.sdk.core.e.c.e("AdTemplateHelper", "adInfo in null");
            return new AdInfo();
        }
        return adInfo;
    }

    public static PhotoInfo cl(AdTemplate adTemplate) {
        return adTemplate.photoInfo;
    }

    public static String cm(AdTemplate adTemplate) {
        return cc(adTemplate) ? a.F(ck(adTemplate)) : f.a(cl(adTemplate));
    }

    public static String cn(AdTemplate adTemplate) {
        return ck(adTemplate).adConversionInfo.appDownloadUrl;
    }

    public static String co(AdTemplate adTemplate) {
        e Cz = Cz();
        String CA = Cz == null ? "" : Cz.CA();
        return TextUtils.isEmpty(CA) ? CA : a.Q(ck(adTemplate));
    }

    public static String cp(AdTemplate adTemplate) {
        if (cc(adTemplate)) {
            return a.bQ(ck(adTemplate));
        }
        e Cz = Cz();
        return Cz == null ? "" : Cz.CB();
    }

    public static long cq(AdTemplate adTemplate) {
        if (cc(adTemplate)) {
            return a.T(ck(adTemplate));
        }
        e Cz = Cz();
        return Cz == null ? adTemplate.hashCode() : Cz.CC();
    }

    public static int cr(AdTemplate adTemplate) {
        e Cz = Cz();
        if (Cz == null) {
            return 0;
        }
        return Cz.CD();
    }

    public static int cs(AdTemplate adTemplate) {
        if (adTemplate == null) {
            return -1;
        }
        return ck(adTemplate).adBaseInfo.taskType;
    }

    public static String ct(AdTemplate adTemplate) {
        return cc(adTemplate) ? a.cn(ck(adTemplate)) : f.c(cl(adTemplate));
    }

    public static long cu(AdTemplate adTemplate) {
        if (adTemplate == null) {
            return 0L;
        }
        return ck(adTemplate).adBaseInfo.creativeId;
    }

    public static boolean cv(AdTemplate adTemplate) {
        return ck(adTemplate).adConversionInfo.blockCallbackIfSpam && adTemplate.mCheatingFlow;
    }

    public static boolean cw(AdTemplate adTemplate) {
        return cx(adTemplate) || cy(adTemplate);
    }

    public static boolean cx(AdTemplate adTemplate) {
        int g = g(adTemplate, true);
        return g == 1 || g == 2;
    }

    public static boolean cy(AdTemplate adTemplate) {
        int g = g(adTemplate, false);
        return g == 1 || g == 2;
    }

    public static int cz(AdTemplate adTemplate) {
        return ck(adTemplate).adBaseInfo.ecpm;
    }

    public static boolean f(AdTemplate adTemplate, boolean z) {
        if (adTemplate == null) {
            return false;
        }
        AdInfo ck = ck(adTemplate);
        return a.ax(ck) && !a.cA(ck) && !z && cs(adTemplate) == 2;
    }

    public static int g(AdTemplate adTemplate, boolean z) {
        AdInfo ck = ck(adTemplate);
        if (ce(adTemplate) == 3) {
            AdMatrixInfo.AdDataV2 adDataV2 = ck.adMatrixInfo.adDataV2;
            int i = z ? adDataV2.actionBarInfo.cardType : adDataV2.endCardInfo.cardType;
            if (i == 5) {
                return 1;
            }
            return i == 6 ? 2 : -1;
        }
        return ck.adBaseInfo.mABParams.playableStyle;
    }

    public static boolean u(AdTemplate adTemplate) {
        if (adTemplate == null) {
            return false;
        }
        AdInfo ck = ck(adTemplate);
        return (a.ax(ck) || a.cA(ck) || cs(adTemplate) != 3) ? false : true;
    }
}
