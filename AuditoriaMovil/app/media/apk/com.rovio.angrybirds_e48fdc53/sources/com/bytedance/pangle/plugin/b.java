package com.bytedance.pangle.plugin;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import com.bytedance.pangle.GlobalParam;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.ZeusPluginEventCallback;
import com.bytedance.pangle.a.a;
import com.bytedance.pangle.c.b;
import com.bytedance.pangle.e.f;
import com.bytedance.pangle.e.g;
import com.bytedance.pangle.h;
import com.bytedance.pangle.log.ZeusLogger;
import com.bytedance.pangle.util.e;
import com.bytedance.pangle.util.g;
import com.bytedance.pangle.util.i;
import com.bytedance.pangle.util.l;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.share.internal.ShareConstants;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b {
    private static final h a = h.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(final File file, final String str, final int i) {
        final StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("useOpt;");
        final boolean[] zArr = {false};
        try {
            h hVar = a;
            hVar.a(1000, 0, str, i, null);
            com.bytedance.pangle.log.a a2 = com.bytedance.pangle.log.a.a(ZeusLogger.TAG_INSTALL, "PluginInstaller", "install:".concat(String.valueOf(str)));
            a(com.bytedance.pangle.c.b.e, b.a.r, str, i, -1L, null);
            int b = l.a().b(str, i, "install");
            int b2 = l.a().b(str, i, "load");
            int removeApkEntryFlag = GlobalParam.getInstance().getRemoveApkEntryFlag(str);
            if (b > 3 || b2 > 3) {
                removeApkEntryFlag = 0;
            }
            SharedPreferences.Editor edit = l.a().a.edit();
            edit.putInt("remove_entry_flag_" + str + "_" + i, removeApkEntryFlag);
            edit.apply();
            l.a().c(str, i, false);
            g.a(com.bytedance.pangle.d.c.a(str, i));
            com.bytedance.pangle.a.a.a(new a.InterfaceC0088a() { // from class: com.bytedance.pangle.plugin.b.1
                @Override // com.bytedance.pangle.a.a.InterfaceC0088a
                public final void a() {
                    b.a(file, str, i, stringBuffer);
                }
            }, new a.InterfaceC0088a() { // from class: com.bytedance.pangle.plugin.b.2
                @Override // com.bytedance.pangle.a.a.InterfaceC0088a
                public final void a() {
                    final Map f = b.f(file, str, i, stringBuffer);
                    b.c(file, str, i, stringBuffer);
                    b.a(b.g(file, str, i, stringBuffer), str, i, stringBuffer);
                    if (i.f() || i.b()) {
                        final boolean[] zArr2 = {false};
                        com.bytedance.pangle.a.a.a(new a.InterfaceC0088a() { // from class: com.bytedance.pangle.plugin.b.2.1
                            @Override // com.bytedance.pangle.a.a.InterfaceC0088a
                            public final void a() {
                                b.a(str, i, f, stringBuffer);
                            }
                        }, new a.InterfaceC0088a() { // from class: com.bytedance.pangle.plugin.b.2.2
                            @Override // com.bytedance.pangle.a.a.InterfaceC0088a
                            public final void a() {
                                zArr2[0] = b.h(file, str, i, stringBuffer);
                            }
                        });
                        zArr[0] = b.a(str, i, zArr2[0], stringBuffer);
                        return;
                    }
                    b.a(str, i, f, stringBuffer);
                    zArr[0] = b.a(str, i, false, stringBuffer);
                    b.a(str, i);
                }
            });
            g.a(file);
            a(com.bytedance.pangle.c.b.f, b.a.s, str, i, a2.a(), stringBuffer.toString());
            a2.a("success");
            hVar.a(ZeusPluginEventCallback.EVENT_FINISH_INSTALLATION, 0, str, i, null);
            return true;
        } catch (Throwable th) {
            if (th instanceof a) {
                ZeusLogger.w(ZeusLogger.TAG_INSTALL, "PluginInstaller " + str + " install failed.", th);
            } else {
                ZeusLogger.w(ZeusLogger.TAG_INSTALL, "PluginInstaller " + str + " install failed unknown error.", th);
                a(com.bytedance.pangle.c.b.f, b.a.t, str, i, -1L, stringBuffer.toString());
                a.a(ZeusPluginEventCallback.EVENT_FINISH_INSTALLATION, -1, str, i, th);
            }
            if (zArr[0]) {
                l.a().a(str, i, "install");
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, List<ZipEntry>> f(File file, String str, int i, StringBuffer stringBuffer) {
        if (GlobalParam.getInstance().checkMatchHostAbi()) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                try {
                    e<Boolean, Map<String, List<ZipEntry>>> a2 = com.bytedance.pangle.d.b.a(file);
                    boolean booleanValue = a2.a.booleanValue();
                    Map<String, List<ZipEntry>> map = a2.b;
                    if (!booleanValue) {
                        throw new a("插件包包含so不符合宿主ABI类型", (byte) 0);
                    }
                    return map;
                } catch (Exception e) {
                    a(com.bytedance.pangle.c.b.f, b.a.A, str, i, -1L, null);
                    a.a(ZeusPluginEventCallback.EVENT_FINISH_INSTALLATION, -5, str, i, e);
                    throw new a("插件包包含so不符合宿主ABI类型", e, (byte) 0);
                }
            } finally {
                stringBuffer.append("checkMatchHostAbi cost:");
                stringBuffer.append(System.currentTimeMillis() - currentTimeMillis);
                stringBuffer.append(";");
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(File file, String str, int i, StringBuffer stringBuffer) {
        long currentTimeMillis = System.currentTimeMillis();
        String b = com.bytedance.pangle.d.c.b(str, i);
        try {
            try {
                com.bytedance.pangle.util.h.a(file.getAbsolutePath(), b);
                return b;
            } catch (Exception e) {
                a(com.bytedance.pangle.c.b.f, b.a.w, str, i, -1L, null);
                a.a(ZeusPluginEventCallback.EVENT_FINISH_INSTALLATION, -6, str, i, e);
                throw new a("安装包拷贝失败", e, (byte) 0);
            }
        } finally {
            stringBuffer.append("copyApk cost:");
            stringBuffer.append(System.currentTimeMillis() - currentTimeMillis);
            stringBuffer.append(";");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x024c: MOVE  (r9 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]), block:B:74:0x024c */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x0250: MOVE  (r9 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]), block:B:76:0x0250 */
    public static boolean h(File file, String str, int i, StringBuffer stringBuffer) {
        String str2;
        String str3;
        String b;
        String str4;
        File file2;
        String str5 = ".dex";
        String str6 = "classes";
        String str7 = ";";
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            if (i.b()) {
                if (!file.exists() || str == null) {
                    throw new IOException("Could not check apk info " + file.getAbsolutePath());
                }
                ZipFile zipFile = null;
                try {
                    ZipFile zipFile2 = new ZipFile(file);
                    try {
                        ArrayList arrayList = new ArrayList();
                        File file3 = new File(com.bytedance.pangle.d.c.i(str, i));
                        com.bytedance.pangle.e.g.a(file3);
                        int i2 = 1;
                        while (true) {
                            StringBuilder sb = new StringBuilder(str6);
                            Object obj = "";
                            sb.append(i2 == 1 ? "" : Integer.valueOf(i2));
                            sb.append(str5);
                            ZipEntry entry = zipFile2.getEntry(sb.toString());
                            if (entry == null) {
                                String str8 = str7;
                                file.getName();
                                SharedPreferences.Editor edit = com.bytedance.pangle.e.g.a().edit();
                                edit.putInt((str + "-" + i) + ".dex.number", arrayList.size());
                                edit.commit();
                                g.a(zipFile2);
                                com.bytedance.pangle.e.b.a(Zeus.getAppApplication()).edit().putInt(str, i).apply();
                                f.a();
                                str3 = str8;
                                break;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str6);
                            String str9 = str7;
                            if (i2 != 1) {
                                try {
                                    obj = Integer.valueOf(i2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    zipFile = zipFile2;
                                    g.a(zipFile);
                                    throw th;
                                }
                            }
                            sb2.append(obj);
                            sb2.append(str5);
                            g.a aVar = new g.a(file3, sb2.toString());
                            String str10 = str5;
                            int i3 = 0;
                            boolean z = false;
                            while (i3 < 3 && !z) {
                                try {
                                    com.bytedance.pangle.e.g.a(zipFile2, entry, aVar, str6);
                                    str4 = str6;
                                    file2 = file3;
                                    z = true;
                                } catch (IOException e2) {
                                    str4 = str6;
                                    file2 = file3;
                                    ZeusLogger.w(ZeusLogger.TAG_INSTALL, "Plugin-MultiDex Failed to extract entry from " + aVar.getAbsolutePath(), e2);
                                }
                                int i4 = i3 + 1;
                                StringBuilder sb3 = new StringBuilder("Plugin-MultiDex Extraction ");
                                sb3.append(z ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : "failed");
                                sb3.append(" '");
                                sb3.append(aVar.getAbsolutePath());
                                sb3.append("': length ");
                                sb3.append(aVar.length());
                                ZeusLogger.i(ZeusLogger.TAG_INSTALL, sb3.toString());
                                if (!z) {
                                    aVar.delete();
                                    if (aVar.exists()) {
                                        ZeusLogger.w(ZeusLogger.TAG_INSTALL, "Plugin-MultiDex Failed to delete corrupted secondary dex '" + aVar.getPath() + "'");
                                    }
                                }
                                i3 = i4;
                                str6 = str4;
                                file3 = file2;
                            }
                            String str11 = str6;
                            File file4 = file3;
                            if (!z) {
                                throw new IOException("Could not create zip file " + aVar.getAbsolutePath() + " for secondary dex (" + i2 + ")");
                            }
                            arrayList.add(aVar);
                            i2++;
                            str5 = str10;
                            str7 = str9;
                            str6 = str11;
                            file3 = file4;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } else if (i.f()) {
                String c = com.bytedance.pangle.d.c.c(str, i);
                String str12 = c + File.separator + com.bytedance.pangle.e.b.a(b);
                if (com.bytedance.pangle.e.b.a(com.bytedance.pangle.d.c.b(str, i), c + File.separator + com.bytedance.pangle.e.b.a(b)) && com.bytedance.pangle.e.b.a(str12)) {
                    stringBuffer.append("dexOpt1 cost:");
                    stringBuffer.append(System.currentTimeMillis() - currentTimeMillis);
                    stringBuffer.append(";");
                    return true;
                }
                str3 = ";";
            } else {
                str3 = ";";
            }
            stringBuffer.append("dexOpt1 cost:");
            stringBuffer.append(System.currentTimeMillis() - currentTimeMillis);
            stringBuffer.append(str3);
            return false;
        } catch (Exception e3) {
            e = e3;
            a(com.bytedance.pangle.c.b.f, b.a.z, str, i, -1L, null);
            throw new a("dexOpt1失败", e, (byte) 0);
        } catch (Throwable th5) {
            th = th5;
            str7 = str2;
            stringBuffer.append("dexOpt1 cost:");
            stringBuffer.append(System.currentTimeMillis() - currentTimeMillis);
            stringBuffer.append(str7);
            throw th;
        }
    }

    private static void a(String str, int i, String str2, int i2, long j, String str3) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.putOpt(MonitorConstants.STATUS_CODE, com.bytedance.pangle.log.b.a(Integer.valueOf(i)));
            jSONObject.putOpt("plugin_package_name", com.bytedance.pangle.log.b.a(str2));
            jSONObject.putOpt("version_code", com.bytedance.pangle.log.b.a(Integer.valueOf(i2)));
            jSONObject3.putOpt("duration", Integer.valueOf(com.bytedance.pangle.log.b.b(Long.valueOf(j))));
            jSONObject2.putOpt(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, com.bytedance.pangle.log.b.a(str3));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.bytedance.pangle.c.b.a().a(str, jSONObject, jSONObject3, jSONObject2);
    }

    /* loaded from: classes.dex */
    public static class a extends IOException {
        /* synthetic */ a(String str, byte b) {
            this(str);
        }

        /* synthetic */ a(String str, Throwable th, byte b) {
            this(str, th);
        }

        private a(String str) {
            super(str);
        }

        private a(String str, Throwable th) {
            super(str, th);
        }
    }

    static /* synthetic */ void a(File file, String str, int i, StringBuffer stringBuffer) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                if (!com.bytedance.pangle.g.e.a(file.getAbsolutePath(), str)) {
                    throw new RuntimeException("安装包签名校验失败[1]");
                }
            } catch (Exception e) {
                a(com.bytedance.pangle.c.b.f, b.a.u, str, i, -1L, null);
                a.a(ZeusPluginEventCallback.EVENT_FINISH_INSTALLATION, -3, str, i, e);
                throw new a(e.getMessage(), e, (byte) 0);
            }
        } finally {
            stringBuffer.append("checkSignature cost:");
            stringBuffer.append(System.currentTimeMillis() - currentTimeMillis);
            stringBuffer.append(";");
        }
    }

    static /* synthetic */ void c(File file, String str, int i, StringBuffer stringBuffer) {
        String[] strArr;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                PackageInfo packageInfo = Zeus.getAppApplication().getPackageManager().getPackageInfo(Zeus.getAppApplication().getPackageName(), 4096);
                PackageInfo packageArchiveInfo = Zeus.getAppApplication().getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 4096);
                List asList = Arrays.asList(packageInfo.requestedPermissions);
                if (packageArchiveInfo.requestedPermissions != null && packageArchiveInfo.requestedPermissions.length > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : packageArchiveInfo.requestedPermissions) {
                        if (!asList.contains(str2)) {
                            arrayList.add(str2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        ZeusLogger.w("PluginInstaller", "The following permissions are declared in the plugin but not in the host: ".concat(String.valueOf(arrayList)));
                        if (GlobalParam.getInstance().checkPermission()) {
                            throw new a("The following permissions are declared in the plugin but not in the host: ".concat(String.valueOf(arrayList)), (byte) 0);
                        }
                    }
                }
            } catch (Exception e) {
                a(com.bytedance.pangle.c.b.f, b.a.v, str, i, -1L, null);
                a.a(ZeusPluginEventCallback.EVENT_FINISH_INSTALLATION, -4, str, i, e);
                throw new a("安装包权限校验失败", e, (byte) 0);
            }
        } finally {
            stringBuffer.append("checkPermissions cost:");
            stringBuffer.append(System.currentTimeMillis() - currentTimeMillis);
            stringBuffer.append(";");
        }
    }

    static /* synthetic */ void a(String str, String str2, int i, StringBuffer stringBuffer) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        int a2 = new com.bytedance.pangle.res.a.c().a(new File(str), false, sb);
        stringBuffer.append(a2 == 100 ? "modifyRes" : "noModifyRes");
        stringBuffer.append(" cost:");
        stringBuffer.append(System.currentTimeMillis() - currentTimeMillis);
        stringBuffer.append(";");
        if (a2 == 100 || a2 == 200) {
            return;
        }
        String sb2 = sb.toString();
        a(com.bytedance.pangle.c.b.f, b.a.B, str2, i, -1L, sb2);
        a.a(ZeusPluginEventCallback.EVENT_FINISH_INSTALLATION, -2, str2, i, null);
        throw new a("modifyRes failed. result = " + a2 + ", errorLog = " + sb2, (byte) 0);
    }

    static /* synthetic */ void a(String str, int i, Map map, StringBuffer stringBuffer) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                com.bytedance.pangle.d.b.a(new File(com.bytedance.pangle.d.c.b(str, i)), new File(com.bytedance.pangle.d.c.d(str, i)), str, map);
            } catch (Exception e) {
                a(com.bytedance.pangle.c.b.f, b.a.x, str, i, -1L, null);
                a.a(ZeusPluginEventCallback.EVENT_FINISH_INSTALLATION, -7, str, i, e);
                throw new a("安装包动态库拷贝失败", e, (byte) 0);
            }
        } finally {
            stringBuffer.append("copySo cost:");
            stringBuffer.append(System.currentTimeMillis() - currentTimeMillis);
            stringBuffer.append(";");
        }
    }

    static /* synthetic */ boolean a(String str, int i, boolean z, StringBuffer stringBuffer) {
        int b = l.a().b(str, i);
        boolean z2 = (b & 1) != 0;
        boolean z3 = (b & 2) != 0;
        if (!z2 && !z3) {
            stringBuffer.append("removeEntry skip;");
            return false;
        }
        boolean z4 = z && z2;
        String b2 = com.bytedance.pangle.d.c.b(str, i);
        long currentTimeMillis = System.currentTimeMillis();
        boolean a2 = com.bytedance.pangle.util.b.b.a(b2, z4, z3, str, i, 1);
        stringBuffer.append("removeEntry cost:");
        stringBuffer.append(System.currentTimeMillis() - currentTimeMillis);
        stringBuffer.append(";");
        return a2;
    }

    static /* synthetic */ void a(String str, int i) {
        try {
            if (i.e() || i.g()) {
                l.a().b(str, i, false);
                com.bytedance.pangle.e.b.a(Zeus.getAppApplication()).edit().putInt(str, i).apply();
                f.a();
            }
        } catch (Exception e) {
            a(com.bytedance.pangle.c.b.f, b.a.z, str, i, -1L, null);
            throw new a("dexOpt2失败", e, (byte) 0);
        }
    }
}
