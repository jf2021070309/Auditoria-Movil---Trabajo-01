package com.kwad.library.solder.lib.c;
/* loaded from: classes.dex */
public final class a implements Comparable<a> {
    public String agJ;
    public boolean qF;
    public String version;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(a aVar) {
        return aVar.version.compareTo(this.version);
    }
}
