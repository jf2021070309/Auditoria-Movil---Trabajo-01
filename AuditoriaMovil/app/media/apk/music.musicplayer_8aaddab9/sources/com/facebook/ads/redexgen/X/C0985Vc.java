package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Vc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0985Vc implements EG {
    @Override // com.facebook.ads.redexgen.X.EG
    public final Metadata A4g(D2 d2) {
        ByteBuffer buffer = d2.A01;
        byte[] array = buffer.array();
        int size = buffer.limit();
        C0660Ii c0660Ii = new C0660Ii(array, size);
        String A0Q = c0660Ii.A0Q();
        String A0Q2 = c0660Ii.A0Q();
        long A0M = c0660Ii.A0M();
        long timescale = C0676Iy.A0F(c0660Ii.A0M(), 1000000L, A0M);
        long presentationTimeUs = c0660Ii.A0M();
        long id = C0676Iy.A0F(presentationTimeUs, 1000L, A0M);
        return new Metadata(new EventMessage(A0Q, A0Q2, id, c0660Ii.A0M(), Arrays.copyOfRange(array, c0660Ii.A06(), size), timescale));
    }
}
