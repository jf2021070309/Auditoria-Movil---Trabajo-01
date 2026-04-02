package com.fyber.inneractive.sdk.g.a;

import android.text.TextUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.fyber.inneractive.sdk.util.ap;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;
/* loaded from: classes.dex */
public class d {
    e a;
    public String b;
    public List<String> c = new ArrayList();
    public List<j> d = new ArrayList();

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Node node) {
        f fVar;
        l lVar;
        m mVar;
        if (node == null) {
            return;
        }
        Node a = ap.a(node, "AdSystem");
        if (a != null) {
            this.a = e.a(a);
        }
        Node a2 = ap.a(node, "Error");
        if (a2 != null) {
            String a3 = ap.a(a2);
            if (!TextUtils.isEmpty(a3)) {
                this.b = a3;
            }
        }
        for (Node node2 : ap.b(node, "Impression")) {
            String a4 = ap.a(node2);
            if (!TextUtils.isEmpty(a4)) {
                this.c.add(a4);
            }
        }
        Node a5 = ap.a(node, "Creatives");
        if (a5 != null) {
            for (Node node3 : ap.b(a5, "Creative")) {
                j jVar = null;
                if (node3 != null) {
                    j jVar2 = new j();
                    jVar2.a = ap.c(node3, "AdID");
                    jVar2.b = ap.c(node3, "id");
                    jVar2.c = ap.d(node3, "sequence");
                    Node a6 = ap.a(node3, "Linear");
                    if (a6 != null) {
                        if (a6 == null) {
                            lVar = null;
                        } else {
                            lVar = new l();
                            Node a7 = ap.a(a6, "MediaFiles");
                            if (a7 != null) {
                                List<Node> b = ap.b(a7, "MediaFile");
                                if (!b.isEmpty()) {
                                    lVar.a = new ArrayList();
                                    for (Node node4 : b) {
                                        if (node4 == null) {
                                            mVar = null;
                                        } else {
                                            mVar = new m();
                                            mVar.a = ap.c(node4, "delivery");
                                            mVar.b = ap.d(node4, ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
                                            mVar.c = ap.d(node4, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
                                            mVar.d = ap.c(node4, "type");
                                            mVar.e = ap.c(node4, "id");
                                            mVar.g = ap.c(node4, "apiFramework");
                                            mVar.f = ap.d(node4, "bitrate");
                                            mVar.h = ap.e(node4, "maintainAspectRatio");
                                            mVar.i = ap.e(node4, "scalable");
                                            mVar.j = ap.a(node4);
                                        }
                                        if (mVar != null) {
                                            lVar.a.add(mVar);
                                        }
                                    }
                                }
                            }
                            Node a8 = ap.a(a6, "VideoClicks");
                            if (a8 != null) {
                                lVar.c = ap.a(ap.a(a8, "ClickThrough"));
                                List<Node> b2 = ap.b(a8, "ClickTracking");
                                if (!b2.isEmpty()) {
                                    lVar.d = new ArrayList();
                                    for (Node node5 : b2) {
                                        String a9 = ap.a(node5);
                                        if (!TextUtils.isEmpty(a9)) {
                                            lVar.d.add(a9);
                                        }
                                    }
                                }
                            }
                            Node a10 = ap.a(a6, "TrackingEvents");
                            if (a10 != null) {
                                List<Node> b3 = ap.b(a10, "Tracking");
                                if (!b3.isEmpty()) {
                                    lVar.b = new ArrayList();
                                    for (Node node6 : b3) {
                                        q a11 = q.a(node6);
                                        if (a11 != null) {
                                            lVar.b.add(a11);
                                        }
                                    }
                                }
                            }
                            Node a12 = ap.a(a6, "Duration");
                            if (a12 != null) {
                                lVar.e = ap.a(a12);
                            }
                        }
                        jVar2.d = lVar;
                    }
                    Node a13 = ap.a(node3, "CompanionAds");
                    if (a13 != null) {
                        List<Node> b4 = ap.b(a13, "Companion");
                        jVar2.e = new ArrayList();
                        for (Node node7 : b4) {
                            if (node7 == null) {
                                fVar = null;
                            } else {
                                fVar = new f();
                                fVar.a(node7);
                            }
                            if (fVar != null) {
                                jVar2.e.add(fVar);
                            }
                        }
                    }
                    jVar = jVar2;
                }
                if (jVar != null) {
                    this.d.add(jVar);
                }
            }
        }
    }
}
