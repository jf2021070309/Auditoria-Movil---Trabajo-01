package com.kwad.sdk.ranger;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.apm.common.utility.Logger;
import com.kwad.sdk.utils.s;
import com.tencent.matrix.Matrix;
import com.tencent.matrix.plugin.Plugin;
import com.tencent.matrix.plugin.PluginListener;
import com.tencent.matrix.report.Issue;
import com.tencent.matrix.trace.TracePlugin;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class RangerInjector {

    /* loaded from: classes3.dex */
    public interface a {
        void eD(String str);
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(String str, long j, long j2, String str2, String str3);

        void onError(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String G(JSONObject jSONObject) {
        try {
            return jSONObject.optString("threadStack");
        } catch (Exception e) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long H(JSONObject jSONObject) {
        try {
            return jSONObject.optLong("cost");
        } catch (Exception e) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long I(JSONObject jSONObject) {
        try {
            return jSONObject.optLong("time");
        } catch (Exception e) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String J(JSONObject jSONObject) {
        try {
            return jSONObject.optString("scene");
        } catch (Exception e) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String K(JSONObject jSONObject) {
        try {
            return jSONObject.optString(UMModuleRegister.PROCESS);
        } catch (Exception e) {
            return "";
        }
    }

    public static void a(String str, final String str2, final b bVar) {
        try {
            TracePlugin pluginByClass = Matrix.with().getPluginByClass(TracePlugin.class);
            if (pluginByClass == null) {
                bVar.onError("getPluginByClass is null");
                return;
            }
            final PluginListener pluginListener = (PluginListener) s.f(pluginByClass, "pluginListener");
            if (pluginListener != null) {
                try {
                    s.a(pluginByClass, "pluginListener", Proxy.newProxyInstance(pluginByClass.getClass().getClassLoader(), new Class[]{Class.forName(str)}, new InvocationHandler() { // from class: com.kwad.sdk.ranger.RangerInjector.1
                        @Override // java.lang.reflect.InvocationHandler
                        public final Object invoke(Object obj, Method method, Object[] objArr) {
                            if (method != null) {
                                try {
                                    com.kwad.sdk.core.e.c.i("perfMonitor.RangerInjector", "originPluginListener callback:" + method.getName());
                                } catch (Throwable th) {
                                    b bVar2 = bVar;
                                    if (bVar2 != null) {
                                        bVar2.onError(Log.getStackTraceString(th));
                                    }
                                    return null;
                                }
                            }
                            if (method.getName().contains(str2)) {
                                Issue issue = (Issue) objArr[0];
                                com.kwad.sdk.core.e.c.i("perfMonitor.RangerInjector", "originPluginListener callback:" + issue.toString());
                                try {
                                    JSONObject content = issue.getContent();
                                    String G = RangerInjector.G(content);
                                    long H = RangerInjector.H(content);
                                    long I = RangerInjector.I(content);
                                    String J = RangerInjector.J(content);
                                    String K = RangerInjector.K(content);
                                    b bVar3 = bVar;
                                    if (bVar3 != null) {
                                        bVar3.a(G, I, H, J, K);
                                    }
                                } catch (Throwable th2) {
                                }
                                pluginListener.onReportIssue(issue);
                            } else if (TextUtils.equals(method.getName(), "onInit")) {
                                pluginListener.onInit((Plugin) objArr[0]);
                            } else if (TextUtils.equals(method.getName(), "onStart")) {
                                pluginListener.onStart((Plugin) objArr[0]);
                            } else if (TextUtils.equals(method.getName(), "onStop")) {
                                pluginListener.onStop((Plugin) objArr[0]);
                            } else if (TextUtils.equals(method.getName(), "onDestroy")) {
                                pluginListener.onDestroy((Plugin) objArr[0]);
                            } else {
                                method.invoke(pluginListener, objArr);
                            }
                            return null;
                        }
                    }));
                } catch (Exception e) {
                    bVar.onError(Log.getStackTraceString(e));
                }
            }
        } catch (Exception e2) {
            bVar.onError(Log.getStackTraceString(e2));
        }
    }

    public static void tryProxyOtherOutput(String str, String str2, String str3, final String str4, final a aVar) {
        try {
            final Logger.ILogWritter iLogWritter = (Logger.ILogWritter) s.ak(str, str2);
            if (iLogWritter == null) {
                return;
            }
            Integer num = (Integer) s.ak(str, str3);
            final int intValue = num != null ? num.intValue() : 4;
            s.a(Class.forName(str), str2, (Object) new Logger.ILogWritter() { // from class: com.kwad.sdk.ranger.RangerInjector.2
                public final boolean isLoggable(int i) {
                    return true;
                }

                public final void logD(String str5, String str6) {
                    try {
                        if (intValue > 3) {
                            return;
                        }
                        iLogWritter.logD(str5, str6);
                    } catch (Throwable th) {
                    }
                }

                public final void logD(String str5, String str6, Throwable th) {
                    try {
                        if (intValue > 3) {
                            return;
                        }
                        iLogWritter.logD(str5, str6, th);
                    } catch (Throwable th2) {
                    }
                }

                public final void logE(String str5, String str6) {
                    try {
                        if (intValue > 6) {
                            return;
                        }
                        iLogWritter.logE(str5, str6);
                    } catch (Throwable th) {
                    }
                }

                public final void logE(String str5, String str6, Throwable th) {
                    a aVar2;
                    try {
                        if (TextUtils.equals(str5, str4) && (aVar2 = aVar) != null) {
                            aVar2.eD(Log.getStackTraceString(th));
                        }
                        if (intValue > 6) {
                            return;
                        }
                        iLogWritter.logE(str5, str6, th);
                    } catch (Throwable th2) {
                    }
                }

                public final void logI(String str5, String str6) {
                    try {
                        if (intValue > 4) {
                            return;
                        }
                        iLogWritter.logI(str5, str6);
                    } catch (Throwable th) {
                    }
                }

                public final void logI(String str5, String str6, Throwable th) {
                    try {
                        if (intValue > 4) {
                            return;
                        }
                        iLogWritter.logI(str5, str6, th);
                    } catch (Throwable th2) {
                    }
                }

                public final void logK(String str5, String str6) {
                    try {
                        iLogWritter.logK(str5, str6);
                    } catch (Throwable th) {
                    }
                }

                public final void logV(String str5, String str6) {
                    try {
                        if (intValue > 2) {
                            return;
                        }
                        iLogWritter.logV(str5, str6);
                    } catch (Throwable th) {
                    }
                }

                public final void logV(String str5, String str6, Throwable th) {
                    try {
                        if (intValue > 2) {
                            return;
                        }
                        iLogWritter.logV(str5, str6, th);
                    } catch (Throwable th2) {
                    }
                }

                public final void logW(String str5, String str6) {
                    try {
                        if (intValue > 5) {
                            return;
                        }
                        iLogWritter.logW(str5, str6);
                    } catch (Throwable th) {
                    }
                }

                public final void logW(String str5, String str6, Throwable th) {
                    try {
                        if (intValue > 5) {
                            return;
                        }
                        iLogWritter.logW(str5, str6, th);
                    } catch (Throwable th2) {
                    }
                }
            });
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.w("perfMonitor.RangerInjector", Log.getStackTraceString(th));
        }
    }
}
