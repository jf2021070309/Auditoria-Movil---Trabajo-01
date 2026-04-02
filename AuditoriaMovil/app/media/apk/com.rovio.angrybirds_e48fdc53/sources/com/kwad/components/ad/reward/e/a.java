package com.kwad.components.ad.reward.e;
/* loaded from: classes.dex */
public abstract class a implements f {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(f fVar) {
        return getPriority() - fVar.getPriority();
    }

    @Override // com.kwad.components.ad.reward.e.f
    public int getPriority() {
        return 0;
    }
}
