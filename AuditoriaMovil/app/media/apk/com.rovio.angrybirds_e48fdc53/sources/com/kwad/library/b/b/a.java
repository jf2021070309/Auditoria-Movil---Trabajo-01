package com.kwad.library.b.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import com.kwad.sdk.utils.s;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class a {
    private static Map<String, Resources> afq = new HashMap();
    private static final Object afr = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.library.b.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0237a {
        /* JADX INFO: Access modifiers changed from: private */
        public static Resources a(Resources resources, AssetManager assetManager) {
            try {
                Resources resources2 = (Resources) s.a(resources.getClass(), assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
                if (resources2 != null) {
                    return resources2;
                }
                throw new RuntimeException("Can not create Resources");
            } catch (Exception e) {
                return new Resources(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static Resources a(Resources resources, AssetManager assetManager) {
            try {
                return c(resources, assetManager);
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    return C0237a.a(resources, assetManager);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return new Resources(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
                }
            }
        }

        private static Resources c(Resources resources, AssetManager assetManager) {
            Resources resources2 = (Resources) s.g("android.content.res.HwResources", assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
            if (resources2 != null) {
                return resources2;
            }
            throw new RuntimeException("Can not create Resources");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c {
        /* JADX INFO: Access modifiers changed from: private */
        public static Resources a(Resources resources, AssetManager assetManager) {
            try {
                return e(resources, assetManager);
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    return C0237a.a(resources, assetManager);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return new Resources(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
                }
            }
        }

        private static Resources e(Resources resources, AssetManager assetManager) {
            Resources resources2 = (Resources) s.g("android.content.res.MiuiResourcesImpl", assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
            if (resources2 != null) {
                return resources2;
            }
            throw new RuntimeException("Can not create Resources");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d {
        /* JADX INFO: Access modifiers changed from: private */
        public static Resources a(Resources resources, AssetManager assetManager) {
            try {
                return g(resources, assetManager);
            } catch (Exception e) {
                try {
                    return C0237a.a(resources, assetManager);
                } catch (Exception e2) {
                    return new Resources(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
                }
            }
        }

        private static Resources g(Resources resources, AssetManager assetManager) {
            Resources resources2 = (Resources) s.g("android.content.res.MiuiResources", assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
            if (resources2 != null) {
                return resources2;
            }
            throw new RuntimeException("Can not create Resources");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e {
        /* JADX INFO: Access modifiers changed from: private */
        public static Resources a(Resources resources, AssetManager assetManager) {
            try {
                return i(resources, assetManager);
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    return C0237a.a(resources, assetManager);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return new Resources(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
                }
            }
        }

        private static Resources i(Resources resources, AssetManager assetManager) {
            Resources resources2 = (Resources) s.g("android.content.res.NubiaResources", assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
            if (resources2 != null) {
                return resources2;
            }
            throw new RuntimeException("Can not create Resources");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f {
        /* JADX INFO: Access modifiers changed from: private */
        public static Resources a(Context context, Resources resources, AssetManager assetManager) {
            try {
                return b(context, resources, assetManager);
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    return C0237a.a(resources, assetManager);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return new Resources(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
                }
            }
        }

        private static Resources b(Context context, Resources resources, AssetManager assetManager) {
            Resources resources2 = (Resources) s.g("android.content.res.VivoResources", assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
            if (resources2 != null) {
                try {
                    s.h(resources2, "init", context.getPackageName());
                } catch (Exception e) {
                    com.kwad.library.solder.lib.a.e("ResourcesManager", "createVivoResources init failed", e);
                }
                try {
                    s.b(resources2, "mThemeValues", s.g(resources, "mThemeValues"));
                } catch (Exception e2) {
                    com.kwad.library.solder.lib.a.e("ResourcesManager", "createVivoResources set mThemeValues failed", e2);
                }
                return resources2;
            }
            throw new RuntimeException("Can not create Resources");
        }
    }

    private static Resources a(Context context, AssetManager assetManager, DisplayMetrics displayMetrics, Configuration configuration) {
        Resources resources = context.getResources();
        return a(resources) ? d.a(resources, assetManager) : b(resources) ? c.a(resources, assetManager) : e(resources) ? b.a(resources, assetManager) : c(resources) ? f.a(context, resources, assetManager) : d(resources) ? e.a(resources, assetManager) : f(resources) ? C0237a.a(resources, assetManager) : new Resources(assetManager, displayMetrics, configuration);
    }

    public static Resources a(Context context, Resources resources, String str) {
        Resources resources2;
        synchronized (afr) {
            resources2 = afq.get(str);
            if (resources2 == null) {
                resources2 = b(context, resources, str);
                if (resources2 == null) {
                    throw new RuntimeException("Can not createResources for " + str);
                }
                afq.put(str, resources);
            }
        }
        return resources2;
    }

    private static void a(AssetManager assetManager, String str) {
        try {
            s.h(assetManager, "addOverlayPath", str);
        } catch (Throwable th) {
            s.h(assetManager, "addAssetPath", str);
        }
    }

    private static boolean a(Resources resources) {
        return "android.content.res.MiuiResources".equals(resources.getClass().getName());
    }

    private static int b(AssetManager assetManager, String str) {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                s.h(assetManager, "addAssetPathAsSharedLibrary", str);
            } else {
                s.h(assetManager, "addAssetPath", str);
            }
        } catch (Throwable th) {
            s.h(assetManager, "addAssetPath", str);
        }
        return 0;
    }

    private static Resources b(Context context, Resources resources, String str) {
        String[] strArr;
        AssetManager assetManager = (AssetManager) s.i(AssetManager.class);
        s.h(assetManager, "addAssetPath", str);
        if (Build.VERSION.SDK_INT >= 21) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            try {
                Object f2 = s.f(applicationInfo, "resourceDirs");
                if (f2 != null && f2.getClass().isArray()) {
                    Object[] objArr = (Object[]) f2;
                    if (objArr.length > 0) {
                        for (Object obj : objArr) {
                            if (obj instanceof String) {
                                a(assetManager, (String) obj);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                if (applicationInfo.sharedLibraryFiles != null && applicationInfo.sharedLibraryFiles.length > 0) {
                    for (String str2 : applicationInfo.sharedLibraryFiles) {
                        if (str2 != null && str2.endsWith(".apk")) {
                            b(assetManager, str2);
                        }
                    }
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return a(context, assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
    }

    private static boolean b(Resources resources) {
        return "android.content.res.MiuiResourcesImpl".equals(resources.getClass().getName());
    }

    private static boolean c(Resources resources) {
        return "android.content.res.VivoResources".equals(resources.getClass().getName());
    }

    private static boolean d(Resources resources) {
        return "android.content.res.NubiaResources".equals(resources.getClass().getName());
    }

    private static boolean e(Resources resources) {
        return "android.content.res.HwResources".equals(resources.getClass().getName());
    }

    private static boolean f(Resources resources) {
        return !"android.content.res.Resources".equals(resources.getClass().getName());
    }
}
