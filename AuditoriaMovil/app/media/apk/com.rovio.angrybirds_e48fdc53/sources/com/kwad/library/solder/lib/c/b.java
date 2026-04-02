package com.kwad.library.solder.lib.c;

import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class b implements Comparable<b> {
    public boolean IO;
    public String agJ;
    public String agK;
    public long agL;
    public String agM;
    public boolean agN = false;
    public boolean agO = true;
    public HashMap<String, String> agP = new HashMap<>(10);
    public List<String> agQ;
    public List<String> agR;
    public ClassLoader agS;
    public String agp;
    public boolean agq;
    public String version;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(b bVar) {
        return -this.version.compareTo(bVar.version);
    }

    public final String toString() {
        return "RemotePluginInfo{pluginId='" + this.agJ + "', version='" + this.version + "', downloadUrl='" + this.agK + "', fileSize=" + this.agL + ", enable=" + this.IO + ", md5sum='" + this.agM + "', onlyWifiDownload=" + this.agN + ", onlyWifiRetryDownload=" + this.agO + ", soMd5s=" + this.agP + ", hostPackages=" + this.agQ + ", hostInterfaces=" + this.agR + '}';
    }
}
