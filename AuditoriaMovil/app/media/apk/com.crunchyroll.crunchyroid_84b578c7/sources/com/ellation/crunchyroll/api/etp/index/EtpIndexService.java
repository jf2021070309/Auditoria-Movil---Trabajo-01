package com.ellation.crunchyroll.api.etp.index;

import com.amazon.aps.iva.jf0.b;
import com.amazon.aps.iva.lf0.f;
import com.ellation.crunchyroll.api.etp.index.model.EtpIndex;
import kotlin.Metadata;
/* compiled from: EtpIndexService.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¨\u0006\u0005"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/index/EtpIndexService;", "", "Lcom/amazon/aps/iva/jf0/b;", "Lcom/ellation/crunchyroll/api/etp/index/model/EtpIndex;", "getIndex", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface EtpIndexService {
    @f("index/v2")
    b<EtpIndex> getIndex();
}
