package com.ellation.crunchyroll.api.etp.externalparteners;

import com.amazon.aps.iva.lf0.c;
import com.amazon.aps.iva.lf0.e;
import com.amazon.aps.iva.lf0.k;
import com.amazon.aps.iva.lf0.o;
import com.amazon.aps.iva.ob0.d;
import com.ellation.crunchyroll.api.etp.externalparteners.model.VerifyPurchaseResponse;
import kotlin.Metadata;
/* compiled from: ExternalPartnersService.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/externalparteners/ExternalPartnersService;", "", "", "packageName", "sku", "purchaseToken", "Lcom/ellation/crunchyroll/api/etp/externalparteners/model/VerifyPurchaseResponse;", "verifyPurchase", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface ExternalPartnersService {
    @k({"read_timeout: 30000"})
    @o("partners/v2/google-play/verify-purchase")
    @e
    Object verifyPurchase(@c("package_name") String str, @c("sku") String str2, @c("purchase_token") String str3, d<? super VerifyPurchaseResponse> dVar);
}
