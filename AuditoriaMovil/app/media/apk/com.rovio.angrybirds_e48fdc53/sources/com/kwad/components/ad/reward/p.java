package com.kwad.components.ad.reward;
/* loaded from: classes.dex */
public final class p {
    public static void a(int i, int i2, j jVar, com.kwad.components.ad.reward.model.c cVar) {
        if (i == 0) {
            com.kwad.sdk.core.report.a.m(cVar.getAdTemplate(), 1);
        } else if (i == 1) {
            boolean jJ = jVar.pF.jJ();
            if (i2 == 0) {
                if (jJ) {
                    com.kwad.sdk.core.report.a.m(cVar.getAdTemplate(), 1);
                }
            } else if (jJ) {
                com.kwad.sdk.core.report.a.m(cVar.getAdTemplate(), 5);
            } else {
                com.kwad.sdk.core.report.a.m(cVar.getAdTemplate(), 4);
            }
        } else if (i != 2) {
        } else {
            boolean jJ2 = jVar.pE.jJ();
            if (i2 == 0) {
                if (jJ2) {
                    com.kwad.sdk.core.report.a.m(cVar.getAdTemplate(), 1);
                }
            } else if (jJ2) {
                com.kwad.sdk.core.report.a.m(cVar.getAdTemplate(), 3);
            } else {
                com.kwad.sdk.core.report.a.m(cVar.getAdTemplate(), 2);
            }
        }
    }
}
