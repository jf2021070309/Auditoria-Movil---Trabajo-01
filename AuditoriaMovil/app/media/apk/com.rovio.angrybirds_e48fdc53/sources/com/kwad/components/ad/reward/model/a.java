package com.kwad.components.ad.reward.model;

import android.text.TextUtils;
import com.kwad.components.ad.reward.m.r;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import com.kwad.sdk.core.response.model.AdProductInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.response.model.CouponInfo;
import java.util.List;
/* loaded from: classes.dex */
public final class a {
    private String liveStartTime;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private String originPrice;
    private int playableStyle;
    private String price;
    private String qp;
    private String qq;
    private List<String> rQ;
    private String rR;
    private String rS;
    private String rT;
    private boolean rU;
    private String rV;
    private String rW = "查看详情";
    private String rX = "立即预约";
    private List<String> rY;
    private AdTemplate rZ;
    private String title;

    private void P(String str) {
        this.rS = str;
    }

    private void Q(String str) {
        this.rT = str;
    }

    public static a a(r rVar, boolean z) {
        AdTemplate adTemplate;
        if (rVar == null || (adTemplate = rVar.getAdTemplate()) == null) {
            return null;
        }
        AdInfo ck = d.ck(adTemplate);
        a aVar = new a();
        aVar.title = com.kwad.sdk.core.response.b.a.bO(ck);
        aVar.qp = com.kwad.sdk.core.response.b.a.bQ(ck);
        aVar.qq = com.kwad.sdk.core.response.b.a.an(ck);
        aVar.rQ = com.kwad.sdk.core.response.b.c.cb(adTemplate);
        aVar.rR = com.kwad.sdk.core.response.b.a.aw(ck);
        aVar.playableStyle = d.g(adTemplate, z);
        aVar.rZ = adTemplate;
        aVar.mApkDownloadHelper = rVar.hk();
        return aVar;
    }

    public static a x(AdTemplate adTemplate) {
        CouponInfo firstCouponList;
        if (adTemplate == null) {
            return null;
        }
        AdInfo ck = d.ck(adTemplate);
        AdProductInfo cy = com.kwad.sdk.core.response.b.a.cy(ck);
        a aVar = new a();
        String name = cy.getName();
        aVar.title = name;
        if (TextUtils.isEmpty(name)) {
            aVar.title = com.kwad.sdk.core.response.b.a.ap(ck);
        }
        aVar.qp = cy.getIcon();
        aVar.qq = com.kwad.sdk.core.response.b.a.an(ck);
        aVar.price = cy.getPrice();
        aVar.originPrice = cy.getOriginPrice();
        if (!cy.isCouponListEmpty() && (firstCouponList = cy.getFirstCouponList()) != null) {
            aVar.Q(CouponInfo.jinniuFormatCoupon(firstCouponList));
            aVar.P(firstCouponList.getFormattedJinniuPrefix());
        }
        return aVar;
    }

    public static a y(AdTemplate adTemplate) {
        AdMatrixInfo.MerchantLiveReservationInfo bP = com.kwad.sdk.core.response.b.b.bP(adTemplate);
        a aVar = new a();
        aVar.qp = bP.userHeadUrl;
        aVar.liveStartTime = bP.liveStartTime;
        aVar.title = bP.title;
        aVar.rU = bP.needShowSubscriberCount();
        aVar.rV = bP.getFormattedLiveSubscribeCount();
        aVar.rY = bP.bookUserUrlList;
        aVar.rW = bP.playEndCard.detailBtnTitle;
        aVar.rX = bP.playEndCard.reservationBtnTitle;
        aVar.rZ = adTemplate;
        return aVar;
    }

    public final String getOriginPrice() {
        return this.originPrice;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String gw() {
        return this.qp;
    }

    public final String gx() {
        return this.qq;
    }

    public final String hh() {
        return this.rT;
    }

    public final String hi() {
        return this.rS;
    }

    public final AdTemplate hj() {
        return this.rZ;
    }

    public final com.kwad.components.core.e.d.c hk() {
        return this.mApkDownloadHelper;
    }

    public final List<String> hl() {
        return this.rQ;
    }

    public final boolean hm() {
        List<String> list = this.rQ;
        return list == null || list.size() == 0;
    }

    public final int hn() {
        return this.playableStyle;
    }

    public final String ho() {
        return this.rV;
    }

    public final String hp() {
        return this.rX;
    }

    public final boolean hq() {
        return this.rU;
    }

    public final List<String> hr() {
        return this.rY;
    }

    public final String hs() {
        return this.liveStartTime;
    }
}
