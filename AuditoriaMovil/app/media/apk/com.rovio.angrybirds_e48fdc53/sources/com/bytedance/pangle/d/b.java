package com.bytedance.pangle.d;

import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.log.ZeusLogger;
import com.bytedance.pangle.util.FieldUtils;
import com.bytedance.pangle.util.g;
import com.bytedance.pangle.util.i;
import com.facebook.appevents.AppEventsConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b {
    private static String a;
    private static Map<String, Integer> b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put("arm64-v8a", 64);
        b.put("armeabi-v7a", 32);
        b.put("armeabi", 32);
        b.put("x86_64", 64);
        b.put("x86", 32);
        b.put("mips64", 64);
        b.put("mips", 32);
        a = c();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014e, code lost:
        if (r1.isEmpty() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0155, code lost:
        if (r17.exists() != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0157, code lost:
        r17.mkdirs();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015a, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0162, code lost:
        if (r1.hasNext() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0164, code lost:
        a(r2, (java.util.zip.ZipEntry) r1.next(), r17);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.io.File r16, java.io.File r17, java.lang.String r18, java.util.Map<java.lang.String, java.util.List<java.util.zip.ZipEntry>> r19) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.d.b.a(java.io.File, java.io.File, java.lang.String, java.util.Map):void");
    }

    private static Map<String, List<ZipEntry>> a(ZipFile zipFile) {
        String[] split;
        HashMap hashMap = new HashMap();
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        Pattern compile = Pattern.compile("^lib/[^/]+/lib[^/]+.so$");
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            if (!nextElement.isDirectory() && !nextElement.getName().contains("../") && nextElement.getName().startsWith("lib/") && compile.matcher(nextElement.getName()).matches() && (split = nextElement.getName().split(File.separator)) != null && split.length >= 2) {
                String str = split[split.length - 2];
                if (b.containsKey(str)) {
                    if (hashMap.get(str) == null) {
                        hashMap.put(str, new LinkedList());
                    }
                    ((List) hashMap.get(str)).add(nextElement);
                }
            }
        }
        ZeusLogger.i(ZeusLogger.TAG_SO, "NativeLibHelper getAllSoZipEntries, zipFile=" + zipFile.getName() + ", soEntries=" + hashMap.toString());
        return hashMap;
    }

    private static void a(Map<String, List<ZipEntry>> map, String str, List<ZipEntry> list, Set<String> set) {
        List<ZipEntry> list2 = map.get(str);
        if (list2 == null || list2.size() == 0) {
            return;
        }
        for (ZipEntry zipEntry : list2) {
            String substring = zipEntry.getName().substring(zipEntry.getName().lastIndexOf(File.separator) + 1);
            if (!set.contains(substring)) {
                list.add(zipEntry);
                set.add(substring);
            }
        }
    }

    private static void a(ZipFile zipFile, ZipEntry zipEntry, File file) {
        String name = zipEntry.getName();
        if (name.contains("..")) {
            return;
        }
        File file2 = new File(file, name.substring(name.lastIndexOf(File.separator) + 1));
        int i = 0;
        boolean z = false;
        do {
            if (file2.exists()) {
                file2.delete();
            }
            try {
                ZeusLogger.i(ZeusLogger.TAG_INSTALL, "NativeLibHelper copySoZipEntry, soZipEntry=" + zipEntry + ", targetSoFile=" + file2);
                g.a(zipFile.getInputStream(zipEntry), new FileOutputStream(file2));
                z = true;
                continue;
            } catch (IOException e) {
                if (i >= 3) {
                    throw e;
                }
                i++;
                continue;
            }
        } while (!z);
    }

    public static String a() {
        String str = a;
        if (str != null) {
            return str;
        }
        String c = c();
        a = c;
        return c;
    }

    public static int b() {
        return b.get(a()).intValue();
    }

    private static String c() {
        JSONObject d = d();
        String a2 = a(d);
        if (a2 == null) {
            return b(d);
        }
        return a2;
    }

    private static String a(JSONObject jSONObject) {
        if (i.a()) {
            try {
                String str = (String) FieldUtils.readField(Zeus.getAppApplication().getApplicationInfo(), "primaryCpuAbi");
                ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper inferHostAbiAuto, primaryCpuAbi=".concat(String.valueOf(str)));
                a(jSONObject, "primaryCpuAbi", str);
                if (str != null) {
                    int i = 0;
                    if (Build.VERSION.SDK_INT >= 23) {
                        try {
                            i = Process.is64Bit() ? 64 : 32;
                            ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper inferHostAbiAuto, processMode=".concat(String.valueOf(i)));
                        } catch (Exception e) {
                            ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper inferHostAbiAuto, processMode exception default=".concat(String.valueOf(i)));
                        }
                    } else {
                        ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper inferHostAbiAuto, processMode default=0");
                    }
                    a(jSONObject, "processMode", String.valueOf(i));
                    if (i != 0) {
                        if (b.get(str).intValue() == i) {
                            ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper inferHostAbiAuto2, sHostAbi=".concat(String.valueOf(str)));
                            return str;
                        }
                        return null;
                    }
                    ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper inferHostAbiAuto1, sHostAbi=".concat(String.valueOf(str)));
                    return str;
                }
                return null;
            } catch (Exception e2) {
                ZeusLogger.errReport(ZeusLogger.TAG_SO, "NativeLibHelper inferHostAbiAuto failed!", e2);
                a(jSONObject, "autoError", "1");
                return null;
            }
        }
        return null;
    }

    private static String b(JSONObject jSONObject) {
        HashSet hashSet;
        String[] strArr;
        try {
            ZipFile zipFile = new ZipFile(new File(Zeus.getAppApplication().getPackageManager().getPackageInfo(Zeus.getAppApplication().getPackageName(), 0).applicationInfo.sourceDir));
            hashSet = new HashSet(a(zipFile).keySet());
            try {
                zipFile.close();
            } catch (IOException e) {
                ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper inferHostAbiManual, close sourceApkZipFile error!");
            }
            strArr = i.a() ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2};
        } catch (Throwable th) {
            ZeusLogger.errReport(ZeusLogger.TAG_SO, "NativeLibHelper inferHostAbiManual failed!", th);
            a(jSONObject, "manualError", "1");
        }
        if (hashSet.isEmpty()) {
            ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper inferHostAbiManual, host source apk .so is empty, use supportedABIs[0]=" + strArr[0]);
            a(jSONObject, "supportedABI0", strArr[0]);
            return strArr[0];
        }
        for (String str : strArr) {
            if (hashSet.contains(str)) {
                ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper inferHostAbiManual, match cpuAbi=".concat(String.valueOf(str)));
                a(jSONObject, "matchCpuAbi", str);
                return str;
            }
        }
        if (i.a()) {
            a(jSONObject, "defaultABI0", Build.SUPPORTED_ABIS[0]);
            return Build.SUPPORTED_ABIS[0];
        }
        a(jSONObject, "defaultABI", Build.CPU_ABI);
        return Build.CPU_ABI;
    }

    public static com.bytedance.pangle.util.e<Boolean, Map<String, List<ZipEntry>>> a(File file) {
        ZipFile zipFile;
        boolean a2;
        HashMap hashMap = new HashMap();
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            hashMap.putAll(a(zipFile));
            if (hashMap.isEmpty()) {
                a2 = true;
                ZeusLogger.i(ZeusLogger.TAG_SO, "NativeLibHelper isPluginApkMatchHostAbi [true] soEntries empty, ".concat(String.valueOf(file)));
            } else {
                a2 = a(hashMap, a);
                if (a2) {
                    ZeusLogger.i(ZeusLogger.TAG_SO, "NativeLibHelper isPluginApkMatchHostAbi [" + a2 + "], " + file);
                } else {
                    ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper isPluginApkMatchHostAbi [" + a2 + "], " + file);
                }
            }
            com.bytedance.pangle.util.e<Boolean, Map<String, List<ZipEntry>>> eVar = new com.bytedance.pangle.util.e<>(Boolean.valueOf(a2), hashMap);
            try {
                zipFile.close();
            } catch (IOException e2) {
                ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper isPluginApkMatchHostAbi, close sourceApkZipFile error!");
            }
            return eVar;
        } catch (IOException e3) {
            e = e3;
            zipFile2 = zipFile;
            ZeusLogger.errReport(ZeusLogger.TAG_SO, "NativeLibHelper isPluginApkMatchHostAbi, get sourceApk ZipFile failed!", e);
            com.bytedance.pangle.util.e<Boolean, Map<String, List<ZipEntry>>> eVar2 = new com.bytedance.pangle.util.e<>(Boolean.FALSE, hashMap);
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException e4) {
                    ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper isPluginApkMatchHostAbi, close sourceApkZipFile error!");
                }
            }
            return eVar2;
        } catch (Throwable th2) {
            th = th2;
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException e5) {
                    ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper isPluginApkMatchHostAbi, close sourceApkZipFile error!");
                }
            }
            throw th;
        }
    }

    private static boolean a(Map<String, List<ZipEntry>> map, String str) {
        if (TextUtils.equals(str, "armeabi") || TextUtils.equals(str, "armeabi-v7a")) {
            return map.containsKey("armeabi") || map.containsKey("armeabi-v7a");
        }
        return map.containsKey(str);
    }

    public static boolean b(File file) {
        ZipFile zipFile;
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            Pattern compile = Pattern.compile("^lib/[^/]+/lib[^/]+.so$");
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                if (!nextElement.isDirectory() && compile.matcher(nextElement.getName()).matches()) {
                    try {
                        zipFile.close();
                        return true;
                    } catch (IOException e2) {
                        ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper hasNativeLib, close sourceApkZipFile error!");
                        return true;
                    }
                }
            }
            try {
                zipFile.close();
            } catch (IOException e3) {
                ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper hasNativeLib, close sourceApkZipFile error!");
            }
            return false;
        } catch (IOException e4) {
            e = e4;
            zipFile2 = zipFile;
            ZeusLogger.errReport(ZeusLogger.TAG_SO, "NativeLibHelper hasNativeLib, get sourceApk ZipFile failed!", e);
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException e5) {
                    ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper hasNativeLib, close sourceApkZipFile error!");
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException e6) {
                    ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper hasNativeLib, close sourceApkZipFile error!");
                }
            }
            throw th;
        }
    }

    private static void a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("primaryCpuAbi", AppEventsConstants.EVENT_PARAM_VALUE_NO);
            jSONObject.put("processMode", AppEventsConstants.EVENT_PARAM_VALUE_NO);
            jSONObject.put("supportedABI0", AppEventsConstants.EVENT_PARAM_VALUE_NO);
            jSONObject.put("matchCpuAbi", AppEventsConstants.EVENT_PARAM_VALUE_NO);
            jSONObject.put("defaultABI0", AppEventsConstants.EVENT_PARAM_VALUE_NO);
            jSONObject.put("defaultABI", AppEventsConstants.EVENT_PARAM_VALUE_NO);
            jSONObject.put("autoError", AppEventsConstants.EVENT_PARAM_VALUE_NO);
            jSONObject.put("manualError", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
