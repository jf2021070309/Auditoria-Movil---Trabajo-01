package com.ellation.crunchyroll.api.etp.download;

import com.amazon.aps.iva.lf0.f;
import com.amazon.aps.iva.lf0.s;
import com.amazon.aps.iva.lf0.t;
import com.amazon.aps.iva.ob0.d;
import com.ellation.crunchyroll.api.etp.download.model.DownloadResponse;
import kotlin.Metadata;
/* compiled from: DownloadService.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J?\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/download/DownloadService;", "", "", "contentId", "", "resolution", "", "downloadExpirationSec", "playbackExpirationSec", "Lcom/ellation/crunchyroll/api/etp/download/model/DownloadResponse;", "getDownloadToken", "(Ljava/lang/String;ILjava/lang/Long;Ljava/lang/Long;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface DownloadService {
    @f("v1/{contentId}/android/phone/download")
    Object getDownloadToken(@s("contentId") String str, @t("resolution") int i, @t("relativeExpiration") Long l, @t("playDuration") Long l2, d<? super DownloadResponse> dVar);
}
