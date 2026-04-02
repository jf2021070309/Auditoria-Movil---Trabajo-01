package com.ellation.crunchyroll.api.etp.playback;

import com.amazon.aps.iva.jf0.a0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lf0.b;
import com.amazon.aps.iva.lf0.f;
import com.amazon.aps.iva.lf0.i;
import com.amazon.aps.iva.lf0.n;
import com.amazon.aps.iva.lf0.s;
import com.amazon.aps.iva.lf0.t;
import com.amazon.aps.iva.ob0.d;
import com.ellation.crunchyroll.api.etp.playback.model.PlayResponse;
import com.ellation.crunchyroll.api.etp.playback.model.SessionState;
import kotlin.Metadata;
/* compiled from: PlayService.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J1\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ1\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ'\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ1\u0010\u0014\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/playback/PlayService;", "", "", "contentId", "", "enableStreamLimit", "queue", "Lcom/ellation/crunchyroll/api/etp/playback/model/PlayResponse;", "getPlayStream", "(Ljava/lang/String;ZZLcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "getMusicPlayStream", "videoToken", "Lcom/ellation/crunchyroll/api/etp/playback/model/SessionState;", "activateToken", "(Ljava/lang/String;Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/amazon/aps/iva/jf0/a0;", "Lcom/amazon/aps/iva/kb0/q;", "deactivateToken", "", "position", "keepTokenAlive", "(Ljava/lang/String;Ljava/lang/String;JLcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "deleteToken", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface PlayService {
    @n("v1/token/{contentId}/{videoToken}/active")
    Object activateToken(@s("contentId") String str, @s("videoToken") String str2, d<? super SessionState> dVar);

    @n("v1/token/{contentId}/{videoToken}/inactive")
    Object deactivateToken(@s("contentId") String str, @s("videoToken") String str2, d<? super a0<q>> dVar);

    @b("v1/token/{contentId}/{videoToken}")
    Object deleteToken(@s("contentId") String str, @s("videoToken") String str2, d<? super a0<q>> dVar);

    @f("v1/music/{contentId}/android/phone/play")
    Object getMusicPlayStream(@s("contentId") String str, @i("x-cr-stream-limits") boolean z, @t("queue") boolean z2, d<? super PlayResponse> dVar);

    @f("v1/{contentId}/android/phone/play")
    Object getPlayStream(@s("contentId") String str, @i("x-cr-stream-limits") boolean z, @t("queue") boolean z2, d<? super PlayResponse> dVar);

    @n("v1/token/{contentId}/{videoToken}/keepAlive")
    Object keepTokenAlive(@s("contentId") String str, @s("videoToken") String str2, @t("playhead") long j, d<? super SessionState> dVar);
}
