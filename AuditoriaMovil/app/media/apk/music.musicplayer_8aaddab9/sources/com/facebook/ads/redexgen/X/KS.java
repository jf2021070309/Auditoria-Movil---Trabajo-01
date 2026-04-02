package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class KS extends L7 {
    public static String[] A02 = {"NpaKE5UdtAyMHqvaLPx4AGtZ31wY3C1j", "hZ", "QvlAFGERqyhtEWGueXr2oEhguGRVkueU", "1PB7Q2A0OVus1FFgj1K4N07XZBnviAmq", "QCLV5siYIKSB8enqXDrdMSWnSISBhPag", "u71qdrqstjoPYAgdzxDuhzTAB45rQyDC", "tsgBYsPi1Izoi1wW5rl36QAscdyZX4HE", "imzaDMEG6ltP9AayN9N6Pvq8SnbIyMdS"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ Q9 A01;

    public KS(Q9 q9, int i2) {
        this.A01 = q9;
        this.A00 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        Q8 videoView;
        Q8 videoView2;
        videoView = this.A01.A00.A00.getVideoView();
        if (videoView != null) {
            int i2 = this.A00;
            if (A02[1].length() == 23) {
                throw new RuntimeException();
            }
            A02[5] = "iSSYmESuchF7uAVhXaEYpov3466pRlYS";
            if (i2 <= 0) {
                videoView2 = this.A01.A00.A00.getVideoView();
                videoView2.A0e(false, 9);
            }
        }
    }
}
