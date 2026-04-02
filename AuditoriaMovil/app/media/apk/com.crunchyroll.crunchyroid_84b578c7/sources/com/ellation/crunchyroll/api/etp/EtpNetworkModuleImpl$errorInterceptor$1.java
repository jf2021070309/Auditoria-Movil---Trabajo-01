package com.ellation.crunchyroll.api.etp;

import com.amazon.aps.iva.jf0.b0;
import com.amazon.aps.iva.jf0.f;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.error.ApiError;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import okhttp3.ResponseBody;
/* compiled from: EtpNetworkModule.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/amazon/aps/iva/jf0/f;", "Lokhttp3/ResponseBody;", "Lcom/ellation/crunchyroll/api/etp/error/ApiError;", "invoke", "()Lcom/amazon/aps/iva/jf0/f;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class EtpNetworkModuleImpl$errorInterceptor$1 extends l implements a<f<ResponseBody, ApiError>> {
    final /* synthetic */ EtpNetworkModuleImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EtpNetworkModuleImpl$errorInterceptor$1(EtpNetworkModuleImpl etpNetworkModuleImpl) {
        super(0);
        this.this$0 = etpNetworkModuleImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.aps.iva.xb0.a
    public final f<ResponseBody, ApiError> invoke() {
        b0 b0Var;
        b0Var = this.this$0.etpRetrofit;
        return b0Var.e(ApiError.class, new Annotation[0]);
    }
}
