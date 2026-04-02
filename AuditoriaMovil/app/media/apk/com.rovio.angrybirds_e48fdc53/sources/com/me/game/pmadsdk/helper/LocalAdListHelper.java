package com.me.game.pmadsdk.helper;

import com.me.game.pmadsdk.bean.GameAdBean;
import com.me.game.pmadsdk.bean.LocalAdListBean;
import com.me.game.pmadsdk.cache.BaseCache;
import com.me.game.pmadsdk.cache.OnBaseCacheListener;
import com.me.game.pmadsdk.utils.LoggerUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class LocalAdListHelper extends BaseCache<LocalAdListBean, OnBaseCacheListener> {
    private static volatile LocalAdListHelper instance;

    public static LocalAdListHelper getInstance() {
        if (instance == null) {
            synchronized (LocalAdListHelper.class) {
                if (instance == null) {
                    instance = new LocalAdListHelper();
                }
            }
        }
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.me.game.pmadsdk.cache.BaseCache
    public LocalAdListBean buildBaseBean(String content) {
        LoggerUtils.i("wxx", "content: " + content);
        LocalAdListBean bean = new LocalAdListBean();
        bean.adList = new ArrayList();
        try {
            JSONArray jsonArray = new JSONArray(content);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject data = jsonArray.getJSONObject(i);
                if (data != null) {
                    GameAdBean gameAdBean = GameAdBean.parse(data);
                    bean.adList.add(gameAdBean);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }

    public void update(List<GameAdBean> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((LocalAdListBean) this.baseBean).adList == null || ((LocalAdListBean) this.baseBean).adList.isEmpty()) {
            ((LocalAdListBean) this.baseBean).adList.addAll(list);
        } else {
            List<GameAdBean> mergeList = new ArrayList<>();
            mergeList.addAll(list);
            for (int i = 0; i < mergeList.size(); i++) {
                for (int j = 0; j < ((LocalAdListBean) this.baseBean).adList.size(); j++) {
                    GameAdBean localBean = ((LocalAdListBean) this.baseBean).adList.get(j);
                    if (mergeList.get(i).id == localBean.id) {
                        mergeList.get(i).localShowStatus = localBean.localShowStatus;
                    }
                }
            }
            ((LocalAdListBean) this.baseBean).adList.clear();
            ((LocalAdListBean) this.baseBean).adList.addAll(mergeList);
        }
        saveInfo();
    }

    public GameAdBean getShowAdBean() {
        if (((LocalAdListBean) this.baseBean).adList != null && ((LocalAdListBean) this.baseBean).adList.size() > 0) {
            for (int i = 0; i < ((LocalAdListBean) this.baseBean).adList.size(); i++) {
                GameAdBean gameAdBean = ((LocalAdListBean) this.baseBean).adList.get(i);
                if (gameAdBean.localShowStatus == 0) {
                    return gameAdBean;
                }
            }
            return null;
        }
        return null;
    }

    public void showUpdateStatus(GameAdBean bean) {
        ((LocalAdListBean) this.baseBean).adList.remove(bean);
        if (bean.showLogic == 2) {
            bean.localShowStatus = 3;
        } else {
            bean.localShowStatus = 1;
        }
        ((LocalAdListBean) this.baseBean).adList.add(bean);
        checkCanShow();
    }

    private void checkCanShow() {
        boolean isCanShow = false;
        for (int i = 0; i < ((LocalAdListBean) this.baseBean).adList.size(); i++) {
            GameAdBean bean = ((LocalAdListBean) this.baseBean).adList.get(i);
            if (bean.localShowStatus == 0) {
                isCanShow = true;
            }
        }
        if (!isCanShow) {
            for (int i2 = 0; i2 < ((LocalAdListBean) this.baseBean).adList.size(); i2++) {
                GameAdBean bean2 = ((LocalAdListBean) this.baseBean).adList.get(i2);
                if (bean2.localShowStatus == 1) {
                    ((LocalAdListBean) this.baseBean).adList.get(i2).localShowStatus = 0;
                }
            }
        }
        saveInfo();
    }

    @Override // com.me.game.pmadsdk.cache.BaseCache
    protected String getCachePath() {
        return "local_ad_list.conf";
    }
}
