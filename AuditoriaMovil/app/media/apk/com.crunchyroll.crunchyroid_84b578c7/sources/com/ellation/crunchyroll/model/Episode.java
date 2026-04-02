package com.ellation.crunchyroll.model;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.model.Href;
import com.ellation.crunchyroll.model.links.EpisodeLinks;
import com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaTrack;
import com.google.common.primitives.Ints;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
/* compiled from: PlayableAsset.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\bV\b\u0087\b\u0018\u00002\u00020\u0001B³\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\b\b\u0002\u0010&\u001a\u00020\n\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010(\u001a\u00020\n\u0012\b\b\u0002\u0010)\u001a\u00020\n\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104\u0012\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\b\u0002\u00107\u001a\u00020\u0018\u0012\b\b\u0002\u00108\u001a\u00020\u001a\u0012\b\b\u0002\u00109\u001a\u00020\n\u0012\b\b\u0002\u0010:\u001a\u00020\n\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010?\u001a\u00020\n\u0012\u0010\b\u0002\u0010A\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010\u0015\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÄ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÄ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÄ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÄ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÄ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÄ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\nHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\nHÆ\u0003J\t\u0010\u0010\u001a\u00020\nHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0018HÆ\u0003J\t\u0010\u001b\u001a\u00020\u001aHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J³\u0003\u0010D\u001a\u00020\u00002\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010%\u001a\u00020\n2\b\b\u0002\u0010&\u001a\u00020\n2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010(\u001a\u00020\n2\b\b\u0002\u0010)\u001a\u00020\n2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00105\u001a\u0004\u0018\u0001042\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\b\b\u0002\u00107\u001a\u00020\u00182\b\b\u0002\u00108\u001a\u00020\u001a2\b\b\u0002\u00109\u001a\u00020\n2\b\b\u0002\u0010:\u001a\u00020\n2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00152\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010?\u001a\u00020\n2\u0010\b\u0002\u0010A\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010\u00152\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015HÆ\u0001J\t\u0010E\u001a\u00020\u0002HÖ\u0001J\t\u0010G\u001a\u00020FHÖ\u0001J\u0013\u0010J\u001a\u00020\n2\b\u0010I\u001a\u0004\u0018\u00010HHÖ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\u000b\u0010R\u001a\u0004\u0018\u000104HÂ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\u0011\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015HÂ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\u0011\u0010W\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010\u0015HÂ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\u0011\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015HÂ\u0003R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0014X\u0095\u0004¢\u0006\f\n\u0004\b\u001f\u0010Z\u001a\u0004\b[\u0010\\R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0014X\u0095\u0004¢\u0006\f\n\u0004\b \u0010Z\u001a\u0004\b]\u0010\\R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0014X\u0095\u0004¢\u0006\f\n\u0004\b!\u0010Z\u001a\u0004\b^\u0010\\R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0014X\u0095\u0004¢\u0006\f\n\u0004\b\"\u0010Z\u001a\u0004\b_\u0010\\R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0014X\u0095\u0004¢\u0006\f\n\u0004\b#\u0010Z\u001a\u0004\b`\u0010\\R\u001c\u0010$\u001a\u0004\u0018\u00010\b8\u0014X\u0095\u0004¢\u0006\f\n\u0004\b$\u0010a\u001a\u0004\bb\u0010cR\u001a\u0010%\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b%\u0010d\u001a\u0004\b%\u0010eR\u001a\u0010&\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b&\u0010d\u001a\u0004\b&\u0010eR\u001c\u0010'\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b'\u0010f\u001a\u0004\bg\u0010hR\u001a\u0010(\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b(\u0010d\u001a\u0004\b(\u0010eR\u001a\u0010)\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b)\u0010d\u001a\u0004\b)\u0010eR\u001c\u0010*\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\f\n\u0004\b*\u0010i\u001a\u0004\bj\u0010kR\u001c\u0010+\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\f\n\u0004\b+\u0010i\u001a\u0004\bl\u0010kR\u001c\u0010,\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\f\n\u0004\b,\u0010i\u001a\u0004\bm\u0010kR\u0016\u0010-\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010ZR\u0016\u0010.\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010ZR\u0016\u0010/\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u0010ZR\u0016\u00100\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010ZR\u0016\u00101\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u0010ZR\u0016\u00102\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u0010ZR\u0016\u00103\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u0010ZR\u0016\u00105\u001a\u0004\u0018\u0001048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u0010nR\"\u00106\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b6\u0010o\u001a\u0004\bp\u0010qR\u001a\u00107\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010r\u001a\u0004\bs\u0010tR\u001a\u00108\u001a\u00020\u001a8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b8\u0010u\u001a\u0004\bv\u0010wR\u001a\u00109\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b9\u0010d\u001a\u0004\b9\u0010eR\u001a\u0010:\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b:\u0010d\u001a\u0004\b:\u0010eR\u0016\u0010;\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010ZR\u0016\u0010<\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010ZR\u001c\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010oR\u0016\u0010>\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010ZR\u001a\u0010?\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b?\u0010d\u001a\u0004\b?\u0010eR\u001c\u0010A\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010oR\u0016\u0010B\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010ZR\u001c\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010oR\u001a\u0010x\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\bx\u0010r\u001a\u0004\by\u0010tR\u0011\u0010{\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bz\u0010\\R\u0011\u0010}\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b|\u0010\\R\u0011\u0010\u007f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b~\u0010\\R\u0013\u0010\u0081\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\\R\u0013\u0010\u0083\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\\R\u0013\u0010\u0085\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010\\R\u0013\u0010\u0087\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010\\R\u0013\u0010\u0089\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010\\R\u0016\u0010\u008b\u0001\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010\\R\u0016\u0010\u008d\u0001\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010\\R\u001c\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020@0\u00158VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010qR\u0018\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010\\R\u001c\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010qR\u0016\u0010\u0095\u0001\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010\\R\u0018\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010\\R\u001c\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010qR\u001c\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010q¨\u0006\u009e\u0001"}, d2 = {"Lcom/ellation/crunchyroll/model/Episode;", "Lcom/ellation/crunchyroll/model/PlayableAsset;", "", "component1", "component2", "component3", "component4", "component5", "Lcom/ellation/crunchyroll/model/Images;", "component6", "", "component7", "component8", "Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "component9", "component10", "component11", "Ljava/util/Date;", "component12", "component13", "component14", "", "Lcom/ellation/crunchyroll/model/EpisodeAdBreak;", "component23", "Lcom/amazon/aps/iva/x50/t;", "component24", "", "component25", "component26", "component27", "component32", "_id", "_channelId", "_title", "_type", "_description", "_images", "isMature", "isMatureBlocked", "extendedMaturityRating", "isPremiumOnly", "isAvailableOffline", "availableDate", "freeAvailableDate", "premiumAvailableDate", "_seasonId", "_seriesId", "_seasonNumber", "_seasonTitle", "_seriesTitle", "_episodeNumberLegacy", "_episodeNumber", "Lcom/ellation/crunchyroll/model/links/EpisodeLinks;", "links", "episodeAdBreaks", "parentType", "durationMs", "isDubbed", "isSubbed", "_nextEpisodeId", "_audioLocale", "_subtitleLocales", "_variant", "isOriginal", "Lcom/ellation/crunchyroll/model/PlayableAssetVersion;", "_versions", "_streamsLink", "_contentDescriptors", "copy", "toString", "", "hashCode", "", "other", "equals", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component28", "component29", "component30", "component31", "component33", "component34", "component35", "Ljava/lang/String;", "get_id", "()Ljava/lang/String;", "get_channelId", "get_title", "get_type", "get_description", "Lcom/ellation/crunchyroll/model/Images;", "get_images", "()Lcom/ellation/crunchyroll/model/Images;", "Z", "()Z", "Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "getExtendedMaturityRating", "()Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "Ljava/util/Date;", "getAvailableDate", "()Ljava/util/Date;", "getFreeAvailableDate", "getPremiumAvailableDate", "Lcom/ellation/crunchyroll/model/links/EpisodeLinks;", "Ljava/util/List;", "getEpisodeAdBreaks", "()Ljava/util/List;", "Lcom/amazon/aps/iva/x50/t;", "getParentType", "()Lcom/amazon/aps/iva/x50/t;", "J", "getDurationMs", "()J", "resourceType", "getResourceType", "getSeasonId", "seasonId", "getSeriesId", "seriesId", "getSeasonNumber", "seasonNumber", "getSeasonTitle", "seasonTitle", "getSeriesTitle", "seriesTitle", "getEpisodeNumberLegacy", "episodeNumberLegacy", "getEpisodeNumber", "episodeNumber", "getNextEpisodeId", "nextEpisodeId", "getAudioLocale", "audioLocale", "getVariant", "variant", "getVersions", "versions", "getStreamHref", "streamHref", "getContentDescriptors", "contentDescriptors", "getParentId", "parentId", "getOriginalAudio", "originalAudio", "getAvailableAudioLocales", "availableAudioLocales", "getAvailableSubtitleLocales", "availableSubtitleLocales", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/model/Images;ZZLcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;ZZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/model/links/EpisodeLinks;Ljava/util/List;Lcom/amazon/aps/iva/x50/t;JZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/util/List;)V", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Episode extends PlayableAsset {
    public static final int $stable = 8;
    @SerializedName("audio_locale")
    private final String _audioLocale;
    @SerializedName("channel_id")
    private final String _channelId;
    @SerializedName("content_descriptors")
    private final List<String> _contentDescriptors;
    @SerializedName(MediaTrack.ROLE_DESCRIPTION)
    private final String _description;
    @SerializedName("episode")
    private final String _episodeNumber;
    @SerializedName("episode_number")
    private final String _episodeNumberLegacy;
    @SerializedName("id")
    private final String _id;
    @SerializedName("images")
    private final Images _images;
    @SerializedName("next_episode_id")
    private final String _nextEpisodeId;
    @SerializedName("season_id")
    private final String _seasonId;
    @SerializedName("season_number")
    private final String _seasonNumber;
    @SerializedName("season_title")
    private final String _seasonTitle;
    @SerializedName("series_id")
    private final String _seriesId;
    @SerializedName("series_title")
    private final String _seriesTitle;
    @SerializedName("streams_link")
    private final String _streamsLink;
    @SerializedName("subtitle_locales")
    private final List<String> _subtitleLocales;
    @SerializedName("title")
    private final String _title;
    @SerializedName("media_type")
    private final String _type;
    @SerializedName("variant")
    private final String _variant;
    @SerializedName("versions")
    private final List<PlayableAssetVersion> _versions;
    @SerializedName("available_date")
    private final Date availableDate;
    @SerializedName("duration_ms")
    private final long durationMs;
    @SerializedName("ad_breaks")
    private final List<EpisodeAdBreak> episodeAdBreaks;
    @SerializedName("extended_maturity_rating")
    private final ExtendedMaturityRating extendedMaturityRating;
    @SerializedName("free_available_date")
    private final Date freeAvailableDate;
    @SerializedName("available_offline")
    private final boolean isAvailableOffline;
    @SerializedName("is_dubbed")
    private final boolean isDubbed;
    @SerializedName("is_mature")
    private final boolean isMature;
    @SerializedName("mature_blocked")
    private final boolean isMatureBlocked;
    @SerializedName("original")
    private final boolean isOriginal;
    @SerializedName("is_premium_only")
    private final boolean isPremiumOnly;
    @SerializedName("is_subbed")
    private final boolean isSubbed;
    @SerializedName("__links__")
    private final EpisodeLinks links;
    private final t parentType;
    @SerializedName("premium_available_date")
    private final Date premiumAvailableDate;
    private final t resourceType;

    public Episode() {
        this(null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, false, false, null, null, null, null, false, null, null, null, -1, 7, null);
    }

    private final String component15() {
        return this._seasonId;
    }

    private final String component16() {
        return this._seriesId;
    }

    private final String component17() {
        return this._seasonNumber;
    }

    private final String component18() {
        return this._seasonTitle;
    }

    private final String component19() {
        return this._seriesTitle;
    }

    private final String component20() {
        return this._episodeNumberLegacy;
    }

    private final String component21() {
        return this._episodeNumber;
    }

    private final EpisodeLinks component22() {
        return this.links;
    }

    private final String component28() {
        return this._nextEpisodeId;
    }

    private final String component29() {
        return this._audioLocale;
    }

    private final List<String> component30() {
        return this._subtitleLocales;
    }

    private final String component31() {
        return this._variant;
    }

    private final List<PlayableAssetVersion> component33() {
        return this._versions;
    }

    private final String component34() {
        return this._streamsLink;
    }

    private final List<String> component35() {
        return this._contentDescriptors;
    }

    public final String component1() {
        return this._id;
    }

    public final boolean component10() {
        return this.isPremiumOnly;
    }

    public final boolean component11() {
        return this.isAvailableOffline;
    }

    public final Date component12() {
        return this.availableDate;
    }

    public final Date component13() {
        return this.freeAvailableDate;
    }

    public final Date component14() {
        return this.premiumAvailableDate;
    }

    public final String component2() {
        return this._channelId;
    }

    public final List<EpisodeAdBreak> component23() {
        return this.episodeAdBreaks;
    }

    public final t component24() {
        return this.parentType;
    }

    public final long component25() {
        return this.durationMs;
    }

    public final boolean component26() {
        return this.isDubbed;
    }

    public final boolean component27() {
        return this.isSubbed;
    }

    public final String component3() {
        return this._title;
    }

    public final boolean component32() {
        return this.isOriginal;
    }

    public final String component4() {
        return this._type;
    }

    public final String component5() {
        return this._description;
    }

    public final Images component6() {
        return this._images;
    }

    public final boolean component7() {
        return this.isMature;
    }

    public final boolean component8() {
        return this.isMatureBlocked;
    }

    public final ExtendedMaturityRating component9() {
        return this.extendedMaturityRating;
    }

    public final Episode copy(String str, String str2, String str3, String str4, String str5, Images images, boolean z, boolean z2, ExtendedMaturityRating extendedMaturityRating, boolean z3, boolean z4, Date date, Date date2, Date date3, String str6, String str7, String str8, String str9, String str10, String str11, String str12, EpisodeLinks episodeLinks, List<EpisodeAdBreak> list, t tVar, long j, boolean z5, boolean z6, String str13, String str14, List<String> list2, String str15, boolean z7, List<PlayableAssetVersion> list3, String str16, List<String> list4) {
        j.f(tVar, "parentType");
        return new Episode(str, str2, str3, str4, str5, images, z, z2, extendedMaturityRating, z3, z4, date, date2, date3, str6, str7, str8, str9, str10, str11, str12, episodeLinks, list, tVar, j, z5, z6, str13, str14, list2, str15, z7, list3, str16, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Episode)) {
            return false;
        }
        Episode episode = (Episode) obj;
        if (j.a(this._id, episode._id) && j.a(this._channelId, episode._channelId) && j.a(this._title, episode._title) && j.a(this._type, episode._type) && j.a(this._description, episode._description) && j.a(this._images, episode._images) && this.isMature == episode.isMature && this.isMatureBlocked == episode.isMatureBlocked && j.a(this.extendedMaturityRating, episode.extendedMaturityRating) && this.isPremiumOnly == episode.isPremiumOnly && this.isAvailableOffline == episode.isAvailableOffline && j.a(this.availableDate, episode.availableDate) && j.a(this.freeAvailableDate, episode.freeAvailableDate) && j.a(this.premiumAvailableDate, episode.premiumAvailableDate) && j.a(this._seasonId, episode._seasonId) && j.a(this._seriesId, episode._seriesId) && j.a(this._seasonNumber, episode._seasonNumber) && j.a(this._seasonTitle, episode._seasonTitle) && j.a(this._seriesTitle, episode._seriesTitle) && j.a(this._episodeNumberLegacy, episode._episodeNumberLegacy) && j.a(this._episodeNumber, episode._episodeNumber) && j.a(this.links, episode.links) && j.a(this.episodeAdBreaks, episode.episodeAdBreaks) && this.parentType == episode.parentType && this.durationMs == episode.durationMs && this.isDubbed == episode.isDubbed && this.isSubbed == episode.isSubbed && j.a(this._nextEpisodeId, episode._nextEpisodeId) && j.a(this._audioLocale, episode._audioLocale) && j.a(this._subtitleLocales, episode._subtitleLocales) && j.a(this._variant, episode._variant) && this.isOriginal == episode.isOriginal && j.a(this._versions, episode._versions) && j.a(this._streamsLink, episode._streamsLink) && j.a(this._contentDescriptors, episode._contentDescriptors)) {
            return true;
        }
        return false;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public String getAudioLocale() {
        String str = this._audioLocale;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public List<String> getAvailableAudioLocales() {
        return f1.J(getAudioLocale());
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public Date getAvailableDate() {
        return this.availableDate;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public List<String> getAvailableSubtitleLocales() {
        List<String> list = this._subtitleLocales;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public List<String> getContentDescriptors() {
        List<String> list = this._contentDescriptors;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    @Override // com.ellation.crunchyroll.model.DurationProvider
    public long getDurationMs() {
        return this.durationMs;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public List<EpisodeAdBreak> getEpisodeAdBreaks() {
        return this.episodeAdBreaks;
    }

    public final String getEpisodeNumber() {
        String str = this._episodeNumber;
        if (str == null) {
            return getEpisodeNumberLegacy();
        }
        return str;
    }

    public final String getEpisodeNumberLegacy() {
        String str = this._episodeNumberLegacy;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public ExtendedMaturityRating getExtendedMaturityRating() {
        return this.extendedMaturityRating;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public Date getFreeAvailableDate() {
        return this.freeAvailableDate;
    }

    public final String getNextEpisodeId() {
        String str = this._nextEpisodeId;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public String getOriginalAudio() {
        Object obj;
        Iterator<T> it = getVersions().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((PlayableAssetVersion) obj).getOriginal()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        PlayableAssetVersion playableAssetVersion = (PlayableAssetVersion) obj;
        if (playableAssetVersion == null) {
            return null;
        }
        return playableAssetVersion.getAudioLocale();
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public String getParentId() {
        return getSeriesId();
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public t getParentType() {
        return this.parentType;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public Date getPremiumAvailableDate() {
        return this.premiumAvailableDate;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public t getResourceType() {
        return this.resourceType;
    }

    public final String getSeasonId() {
        String str = this._seasonId;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getSeasonNumber() {
        String str = this._seasonNumber;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getSeasonTitle() {
        String str = this._seasonTitle;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getSeriesId() {
        String str = this._seriesId;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getSeriesTitle() {
        String str = this._seriesTitle;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public String getStreamHref() {
        Href streamsHref;
        String str = this._streamsLink;
        if (str == null) {
            EpisodeLinks episodeLinks = this.links;
            if (episodeLinks != null && (streamsHref = episodeLinks.getStreamsHref()) != null) {
                return streamsHref.getHref();
            }
            return null;
        }
        return str;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public String getVariant() {
        String str = this._variant;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public List<PlayableAssetVersion> getVersions() {
        List<PlayableAssetVersion> list = this._versions;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public String get_channelId() {
        return this._channelId;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public String get_description() {
        return this._description;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public String get_id() {
        return this._id;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public Images get_images() {
        return this._images;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public String get_title() {
        return this._title;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public String get_type() {
        return this._type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        String str = this._id;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this._channelId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this._title;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this._type;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this._description;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Images images = this._images;
        if (images == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = images.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        boolean z = this.isMature;
        int i8 = 1;
        int i9 = z;
        if (z != 0) {
            i9 = 1;
        }
        int i10 = (i7 + i9) * 31;
        boolean z2 = this.isMatureBlocked;
        int i11 = z2;
        if (z2 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ExtendedMaturityRating extendedMaturityRating = this.extendedMaturityRating;
        if (extendedMaturityRating == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = extendedMaturityRating.hashCode();
        }
        int i13 = (i12 + hashCode7) * 31;
        boolean z3 = this.isPremiumOnly;
        int i14 = z3;
        if (z3 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z4 = this.isAvailableOffline;
        int i16 = z4;
        if (z4 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        Date date = this.availableDate;
        if (date == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = date.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        Date date2 = this.freeAvailableDate;
        if (date2 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = date2.hashCode();
        }
        int i19 = (i18 + hashCode9) * 31;
        Date date3 = this.premiumAvailableDate;
        if (date3 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = date3.hashCode();
        }
        int i20 = (i19 + hashCode10) * 31;
        String str6 = this._seasonId;
        if (str6 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str6.hashCode();
        }
        int i21 = (i20 + hashCode11) * 31;
        String str7 = this._seriesId;
        if (str7 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str7.hashCode();
        }
        int i22 = (i21 + hashCode12) * 31;
        String str8 = this._seasonNumber;
        if (str8 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str8.hashCode();
        }
        int i23 = (i22 + hashCode13) * 31;
        String str9 = this._seasonTitle;
        if (str9 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str9.hashCode();
        }
        int i24 = (i23 + hashCode14) * 31;
        String str10 = this._seriesTitle;
        if (str10 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str10.hashCode();
        }
        int i25 = (i24 + hashCode15) * 31;
        String str11 = this._episodeNumberLegacy;
        if (str11 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str11.hashCode();
        }
        int i26 = (i25 + hashCode16) * 31;
        String str12 = this._episodeNumber;
        if (str12 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str12.hashCode();
        }
        int i27 = (i26 + hashCode17) * 31;
        EpisodeLinks episodeLinks = this.links;
        if (episodeLinks == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = episodeLinks.hashCode();
        }
        int i28 = (i27 + hashCode18) * 31;
        List<EpisodeAdBreak> list = this.episodeAdBreaks;
        if (list == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = list.hashCode();
        }
        int a = i.a(this.durationMs, l1.a(this.parentType, (i28 + hashCode19) * 31, 31), 31);
        boolean z5 = this.isDubbed;
        int i29 = z5;
        if (z5 != 0) {
            i29 = 1;
        }
        int i30 = (a + i29) * 31;
        boolean z6 = this.isSubbed;
        int i31 = z6;
        if (z6 != 0) {
            i31 = 1;
        }
        int i32 = (i30 + i31) * 31;
        String str13 = this._nextEpisodeId;
        if (str13 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str13.hashCode();
        }
        int i33 = (i32 + hashCode20) * 31;
        String str14 = this._audioLocale;
        if (str14 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = str14.hashCode();
        }
        int i34 = (i33 + hashCode21) * 31;
        List<String> list2 = this._subtitleLocales;
        if (list2 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = list2.hashCode();
        }
        int i35 = (i34 + hashCode22) * 31;
        String str15 = this._variant;
        if (str15 == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = str15.hashCode();
        }
        int i36 = (i35 + hashCode23) * 31;
        boolean z7 = this.isOriginal;
        if (!z7) {
            i8 = z7 ? 1 : 0;
        }
        int i37 = (i36 + i8) * 31;
        List<PlayableAssetVersion> list3 = this._versions;
        if (list3 == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = list3.hashCode();
        }
        int i38 = (i37 + hashCode24) * 31;
        String str16 = this._streamsLink;
        if (str16 == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = str16.hashCode();
        }
        int i39 = (i38 + hashCode25) * 31;
        List<String> list4 = this._contentDescriptors;
        if (list4 != null) {
            i = list4.hashCode();
        }
        return i39 + i;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public boolean isAvailableOffline() {
        return this.isAvailableOffline;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public boolean isDubbed() {
        return this.isDubbed;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset, com.ellation.crunchyroll.model.LabeledContent
    public boolean isMature() {
        return this.isMature;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset, com.ellation.crunchyroll.model.LabeledContent
    public boolean isMatureBlocked() {
        return this.isMatureBlocked;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public boolean isOriginal() {
        return this.isOriginal;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public boolean isPremiumOnly() {
        return this.isPremiumOnly;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public boolean isSubbed() {
        return this.isSubbed;
    }

    public String toString() {
        String str = this._id;
        String str2 = this._channelId;
        String str3 = this._title;
        String str4 = this._type;
        String str5 = this._description;
        Images images = this._images;
        boolean z = this.isMature;
        boolean z2 = this.isMatureBlocked;
        ExtendedMaturityRating extendedMaturityRating = this.extendedMaturityRating;
        boolean z3 = this.isPremiumOnly;
        boolean z4 = this.isAvailableOffline;
        Date date = this.availableDate;
        Date date2 = this.freeAvailableDate;
        Date date3 = this.premiumAvailableDate;
        String str6 = this._seasonId;
        String str7 = this._seriesId;
        String str8 = this._seasonNumber;
        String str9 = this._seasonTitle;
        String str10 = this._seriesTitle;
        String str11 = this._episodeNumberLegacy;
        String str12 = this._episodeNumber;
        EpisodeLinks episodeLinks = this.links;
        List<EpisodeAdBreak> list = this.episodeAdBreaks;
        t tVar = this.parentType;
        long j = this.durationMs;
        boolean z5 = this.isDubbed;
        boolean z6 = this.isSubbed;
        String str13 = this._nextEpisodeId;
        String str14 = this._audioLocale;
        List<String> list2 = this._subtitleLocales;
        String str15 = this._variant;
        boolean z7 = this.isOriginal;
        List<PlayableAssetVersion> list3 = this._versions;
        String str16 = this._streamsLink;
        List<String> list4 = this._contentDescriptors;
        StringBuilder b = a.b("Episode(_id=", str, ", _channelId=", str2, ", _title=");
        com.amazon.aps.iva.m80.a.c(b, str3, ", _type=", str4, ", _description=");
        b.append(str5);
        b.append(", _images=");
        b.append(images);
        b.append(", isMature=");
        b.append(z);
        b.append(", isMatureBlocked=");
        b.append(z2);
        b.append(", extendedMaturityRating=");
        b.append(extendedMaturityRating);
        b.append(", isPremiumOnly=");
        b.append(z3);
        b.append(", isAvailableOffline=");
        b.append(z4);
        b.append(", availableDate=");
        b.append(date);
        b.append(", freeAvailableDate=");
        b.append(date2);
        b.append(", premiumAvailableDate=");
        b.append(date3);
        b.append(", _seasonId=");
        com.amazon.aps.iva.m80.a.c(b, str6, ", _seriesId=", str7, ", _seasonNumber=");
        com.amazon.aps.iva.m80.a.c(b, str8, ", _seasonTitle=", str9, ", _seriesTitle=");
        com.amazon.aps.iva.m80.a.c(b, str10, ", _episodeNumberLegacy=", str11, ", _episodeNumber=");
        b.append(str12);
        b.append(", links=");
        b.append(episodeLinks);
        b.append(", episodeAdBreaks=");
        b.append(list);
        b.append(", parentType=");
        b.append(tVar);
        b.append(", durationMs=");
        b.append(j);
        b.append(", isDubbed=");
        b.append(z5);
        b.append(", isSubbed=");
        b.append(z6);
        b.append(", _nextEpisodeId=");
        b.append(str13);
        b.append(", _audioLocale=");
        b.append(str14);
        b.append(", _subtitleLocales=");
        b.append(list2);
        b.append(", _variant=");
        b.append(str15);
        b.append(", isOriginal=");
        b.append(z7);
        b.append(", _versions=");
        b.append(list3);
        b.append(", _streamsLink=");
        b.append(str16);
        b.append(", _contentDescriptors=");
        b.append(list4);
        b.append(")");
        return b.toString();
    }

    public /* synthetic */ Episode(String str, String str2, String str3, String str4, String str5, Images images, boolean z, boolean z2, ExtendedMaturityRating extendedMaturityRating, boolean z3, boolean z4, Date date, Date date2, Date date3, String str6, String str7, String str8, String str9, String str10, String str11, String str12, EpisodeLinks episodeLinks, List list, t tVar, long j, boolean z5, boolean z6, String str13, String str14, List list2, String str15, boolean z7, List list3, String str16, List list4, int i, int i2, e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : images, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : extendedMaturityRating, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? false : z3, (i & 1024) != 0 ? false : z4, (i & 2048) != 0 ? null : date, (i & 4096) != 0 ? null : date2, (i & 8192) != 0 ? null : date3, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? "" : str6, (i & 32768) == 0 ? str7 : "", (i & Cast.MAX_MESSAGE_LENGTH) != 0 ? null : str8, (i & 131072) != 0 ? null : str9, (i & 262144) != 0 ? null : str10, (i & 524288) != 0 ? null : str11, (i & 1048576) != 0 ? null : str12, (i & 2097152) != 0 ? null : episodeLinks, (i & 4194304) != 0 ? null : list, (i & 8388608) != 0 ? t.SERIES : tVar, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? 0L : j, (i & 33554432) != 0 ? false : z5, (i & 67108864) != 0 ? false : z6, (i & 134217728) != 0 ? null : str13, (i & 268435456) != 0 ? null : str14, (i & 536870912) != 0 ? null : list2, (i & Ints.MAX_POWER_OF_TWO) != 0 ? null : str15, (i & Integer.MIN_VALUE) != 0 ? false : z7, (i2 & 1) != 0 ? null : list3, (i2 & 2) != 0 ? null : str16, (i2 & 4) != 0 ? null : list4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Episode(String str, String str2, String str3, String str4, String str5, Images images, boolean z, boolean z2, ExtendedMaturityRating extendedMaturityRating, boolean z3, boolean z4, Date date, Date date2, Date date3, String str6, String str7, String str8, String str9, String str10, String str11, String str12, EpisodeLinks episodeLinks, List<EpisodeAdBreak> list, t tVar, long j, boolean z5, boolean z6, String str13, String str14, List<String> list2, String str15, boolean z7, List<PlayableAssetVersion> list3, String str16, List<String> list4) {
        super(null);
        j.f(tVar, "parentType");
        this._id = str;
        this._channelId = str2;
        this._title = str3;
        this._type = str4;
        this._description = str5;
        this._images = images;
        this.isMature = z;
        this.isMatureBlocked = z2;
        this.extendedMaturityRating = extendedMaturityRating;
        this.isPremiumOnly = z3;
        this.isAvailableOffline = z4;
        this.availableDate = date;
        this.freeAvailableDate = date2;
        this.premiumAvailableDate = date3;
        this._seasonId = str6;
        this._seriesId = str7;
        this._seasonNumber = str8;
        this._seasonTitle = str9;
        this._seriesTitle = str10;
        this._episodeNumberLegacy = str11;
        this._episodeNumber = str12;
        this.links = episodeLinks;
        this.episodeAdBreaks = list;
        this.parentType = tVar;
        this.durationMs = j;
        this.isDubbed = z5;
        this.isSubbed = z6;
        this._nextEpisodeId = str13;
        this._audioLocale = str14;
        this._subtitleLocales = list2;
        this._variant = str15;
        this.isOriginal = z7;
        this._versions = list3;
        this._streamsLink = str16;
        this._contentDescriptors = list4;
        this.resourceType = t.EPISODE;
    }
}
