package com.ellation.crunchyroll.api.etp.staticfiles;

import com.amazon.aps.iva.lf0.f;
import com.amazon.aps.iva.lf0.y;
import com.amazon.aps.iva.ob0.d;
import kotlin.Metadata;
import okhttp3.ResponseBody;
/* compiled from: StaticFilesService.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/staticfiles/StaticFilesService;", "", "", "filePath", "Lokhttp3/ResponseBody;", "getFile", "(Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface StaticFilesService {
    @f
    Object getFile(@y String str, d<? super ResponseBody> dVar);
}
