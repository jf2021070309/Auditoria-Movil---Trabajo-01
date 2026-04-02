package com.ss.android.downloadlib.ge;
/* loaded from: classes3.dex */
public class ge {
    public void dr(final com.ss.android.downloadad.api.dr.ge geVar, final rb rbVar, int i) {
        com.ss.android.downloadlib.g.dr().dr(new Runnable() { // from class: com.ss.android.downloadlib.ge.ge.1
            @Override // java.lang.Runnable
            public void run() {
                if (ll.dr(geVar)) {
                    rbVar.dr(false);
                } else if (!bn.dr(geVar)) {
                    rbVar.dr(false);
                } else {
                    bn.dr(geVar, new xu() { // from class: com.ss.android.downloadlib.ge.ge.1.1
                        @Override // com.ss.android.downloadlib.ge.xu
                        public void dr(boolean z) {
                            rbVar.dr(z);
                        }
                    });
                }
            }
        }, i);
    }
}
