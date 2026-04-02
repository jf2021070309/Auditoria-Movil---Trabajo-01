package com.bytedance.sdk.openadsdk.downloadnew;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.EventListener;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.api.dr.bn;
import com.bytedance.sdk.openadsdk.api.dr.rb;
import com.bytedance.sdk.openadsdk.downloadnew.core.ExitInstallListener;
import com.bytedance.sdk.openadsdk.downloadnew.core.ITTDownloadAdapter;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
import com.ss.android.download.api.config.OnItemClickListener;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.download.DownloadStatusChangeListener;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class q extends dr implements Bridge {
    private static volatile q dr;
    private final Context ge;

    private q(Context context) {
        this.ge = context;
    }

    public static q dr(Context context) {
        if (dr == null) {
            synchronized (q.class) {
                if (dr == null) {
                    dr = new q(context);
                }
            }
        }
        return dr;
    }

    @Override // com.bytedance.sdk.openadsdk.downloadnew.dr, com.bytedance.sdk.openadsdk.TTAdBridge
    public <T> T callMethod(Class<T> cls, int i, Map<String, Object> map) {
        switch (i) {
            case 0:
                return (T) Boolean.valueOf(g.dr(getActivity(map.get(TTDownloadField.TT_ACTIVITY)), q(map.get(TTDownloadField.TT_EXIT_INSTALL_LISTENER))));
            case 1:
                return (T) g.dr().bn();
            case 2:
                try {
                    return (T) Boolean.valueOf(g.dr((String) map.get(TTDownloadField.TT_TAG_INTERCEPT), (String) map.get(TTDownloadField.TT_LABEL), new JSONObject((String) map.get(TTDownloadField.TT_META)), new HashMap()));
                } catch (JSONException e) {
                    return (T) Boolean.FALSE;
                }
            case 3:
                g.dr(((Integer) map.get(TTDownloadField.TT_HID)).intValue());
                return null;
            case 4:
                int intValue = ((Integer) map.get(TTDownloadField.TT_HASHCODE)).intValue();
                g.dr().dr((String) map.get(TTDownloadField.TT_DOWNLOAD_URL), intValue);
                return null;
            case 5:
                int intValue2 = ((Integer) map.get(TTDownloadField.TT_HASHCODE)).intValue();
                DownloadModel ge = ge(map.get(TTDownloadField.TT_DOWNLOAD_MODEL));
                g.dr().dr(this.ge, intValue2, dr(map.get(TTDownloadField.TT_DOWNLOAD_STATUSCHANGE_LISTENER)), ge);
                return null;
            case 6:
                return (T) Boolean.valueOf(g.dr(this.ge, (String) map.get(TTDownloadField.TT_DOWNLOAD_URL)));
            case 7:
                g.ge();
                return null;
            case 8:
                boolean booleanValue = ((Boolean) map.get("force")).booleanValue();
                g.dr().dr((String) map.get(TTDownloadField.TT_DOWNLOAD_URL), booleanValue);
                return null;
            case 9:
                g.dr(((Integer) map.get("id")).intValue(), (ITTDownloadAdapter.OnEventLogHandler) map.get(TTDownloadField.TT_ONEVENT_LOG_HANDLER));
                return null;
            case 10:
                g.dr((String) map.get(TTDownloadField.TT_DOWNLOAD_PATH));
                return null;
            case 11:
            default:
                return (T) super.callMethod(cls, i, map);
            case 12:
                Uri uri = (Uri) map.get("uri");
                DownloadModel ge2 = ge(map.get(TTDownloadField.TT_DOWNLOAD_MODEL));
                DownloadEventConfig o = o(map.get(TTDownloadField.TT_DOWNLOAD_EVENT_CONFIG));
                DownloadController g = g(map.get(TTDownloadField.TT_DOWNLOAD_CONTROLLER));
                IDownloadButtonClickListener rb = rb(map.get(TTDownloadField.TT_DOWNLOAD_BUTTON_CLICK_LISTENER));
                if (dr(rb)) {
                    return (T) Boolean.valueOf(g.dr(this.ge, uri, ge2, o, g, rb));
                }
                return (T) Boolean.valueOf(g.dr(this.ge, uri, ge2, o, g));
            case 13:
                int intValue3 = ((Integer) map.get(TTDownloadField.TT_HASHCODE)).intValue();
                boolean booleanValue2 = ((Boolean) map.get(TTDownloadField.TT_IS_DISABLE_DIALOG)).booleanValue();
                String str = (String) map.get(TTDownloadField.TT_USERAGENT);
                DownloadModel ge3 = ge(map.get(TTDownloadField.TT_DOWNLOAD_MODEL));
                DownloadEventConfig o2 = o(map.get(TTDownloadField.TT_DOWNLOAD_EVENT_CONFIG));
                DownloadController g2 = g(map.get(TTDownloadField.TT_DOWNLOAD_CONTROLLER));
                DownloadStatusChangeListener dr2 = dr(map.get(TTDownloadField.TT_DOWNLOAD_STATUSCHANGE_LISTENER));
                IDownloadButtonClickListener rb2 = rb(map.get(TTDownloadField.TT_DOWNLOAD_BUTTON_CLICK_LISTENER));
                if (dr(rb2)) {
                    g.dr().q().dr(this.ge, str, booleanValue2, ge3, o2, g2, dr2, intValue3, rb2);
                    return null;
                }
                g.dr().q().dr(this.ge, str, booleanValue2, ge3, o2, g2, dr2, intValue3);
                return null;
            case 14:
                int intValue4 = ((Integer) map.get(TTDownloadField.TT_HASHCODE)).intValue();
                return (T) Boolean.valueOf(g.dr().q().dr(this.ge, ((Long) map.get("id")).longValue(), (String) map.get(TTDownloadField.TT_LOG_EXTRA), (DownloadStatusChangeListener) null, intValue4));
            case 15:
                return (T) Boolean.valueOf(g.dr((Uri) map.get("uri")));
            case 16:
                g.dr().dr((String) map.get(TTDownloadField.TT_DOWNLOAD_URL), ((Long) map.get("id")).longValue(), ((Integer) map.get(TTDownloadField.TT_ACTION_TYPE_BUTTON)).intValue(), o(map.get(TTDownloadField.TT_DOWNLOAD_EVENT_CONFIG)), g(map.get(TTDownloadField.TT_DOWNLOAD_CONTROLLER)));
                return null;
            case 17:
                g.dr().dr((String) map.get(TTDownloadField.TT_DOWNLOAD_URL), ((Long) map.get("id")).longValue(), ((Integer) map.get(TTDownloadField.TT_ACTION_TYPE_BUTTON)).intValue(), o(map.get(TTDownloadField.TT_DOWNLOAD_EVENT_CONFIG)), g(map.get(TTDownloadField.TT_DOWNLOAD_CONTROLLER)), bn(map.get(TTDownloadField.TT_ITEM_CLICK_LISTENER)), rb(map.get(TTDownloadField.TT_DOWNLOAD_BUTTON_CLICK_LISTENER)));
                return null;
            case 18:
                return (T) Boolean.valueOf(g.dr().q().dr(((Long) map.get("id")).longValue(), ((Integer) map.get(TTDownloadField.TT_HASHCODE)).intValue()));
            case 19:
                return (T) Boolean.valueOf(g.dr().q().dr(((Long) map.get("id")).longValue()));
        }
    }

    private static boolean dr(IDownloadButtonClickListener iDownloadButtonClickListener) {
        if (iDownloadButtonClickListener == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.downloadnew.dr, com.bytedance.sdk.openadsdk.TTAdBridge
    public <T> T getObj(Class<T> cls, int i, Map<String, Object> map) {
        if (i != 0) {
            if (i == 1) {
                return (T) Boolean.valueOf(g.ge);
            }
            return (T) super.getObj(cls);
        }
        return (T) g.dr;
    }

    @Override // com.bytedance.sdk.openadsdk.downloadnew.dr, com.bytedance.sdk.openadsdk.TTAdBridge
    public void init(Bundle bundle) {
        super.init(bundle);
        g.dr(this.ge);
    }

    private DownloadStatusChangeListener dr(Object obj) {
        if (obj instanceof DownloadStatusChangeListener) {
            return (DownloadStatusChangeListener) obj;
        }
        if (obj instanceof EventListener) {
            return new com.bytedance.sdk.openadsdk.api.dr.q((EventListener) obj);
        }
        return null;
    }

    private DownloadModel ge(Object obj) {
        if (obj instanceof DownloadModel) {
            return (DownloadModel) obj;
        }
        return null;
    }

    private DownloadEventConfig o(Object obj) {
        if (obj instanceof DownloadEventConfig) {
            return (DownloadEventConfig) obj;
        }
        return null;
    }

    private DownloadController g(Object obj) {
        if (obj instanceof DownloadController) {
            return (DownloadController) obj;
        }
        return null;
    }

    private Activity getActivity(Object obj) {
        if (obj instanceof Activity) {
            return (Activity) obj;
        }
        return null;
    }

    private ExitInstallListener q(Object obj) {
        if (obj instanceof ExitInstallListener) {
            return (ExitInstallListener) obj;
        }
        return null;
    }

    private OnItemClickListener bn(Object obj) {
        if (obj instanceof OnItemClickListener) {
            return (OnItemClickListener) obj;
        }
        if (obj instanceof EventListener) {
            return new rb((EventListener) obj);
        }
        return null;
    }

    private IDownloadButtonClickListener rb(Object obj) {
        if (obj instanceof IDownloadButtonClickListener) {
            return (IDownloadButtonClickListener) obj;
        }
        if (obj instanceof EventListener) {
            return new bn((EventListener) obj);
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return com.bytedance.sdk.openadsdk.api.g.dr().dr(0, g.dr).dr(1, Boolean.valueOf(g.ge)).ge();
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
        if (i == 20) {
            init((Bundle) valueSet.objectValue(0, Bundle.class));
            return null;
        }
        return (T) callMethod(cls, i, (Map) valueSet.objectValue(0, Map.class));
    }
}
