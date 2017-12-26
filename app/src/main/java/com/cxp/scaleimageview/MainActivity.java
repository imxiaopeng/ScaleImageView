package com.cxp.scaleimageview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cxp.imageviewer.ImageViewer;
import com.cxp.imageviewer.ScaleImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ScaleImageView iv;
    private ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = (ScaleImageView) findViewById(R.id.iv);
        list = new ArrayList<>();
        list.add("http://f.hiphotos.baidu.com/image/h%3D300/sign=75d781e59ccad1c8cfbbfa274f3c67c4/83025aafa40f4bfbbe740f9e0a4f78f0f6361857.jpg");
        list.add("http://a.hiphotos.baidu.com/image/pic/item/8b13632762d0f70349e3eb3b02fa513d2797c580.jpg");
        list.add("http://b.hiphotos.baidu.com/image/h%3D300/sign=84d6dd714e10b912a0c1f0fef3fffcb5/42a98226cffc1e17c34516fb4390f603728de906.jpg");
        list.add("http://e.hiphotos.baidu.com/image/pic/item/2fdda3cc7cd98d10bd8a8dd82b3fb80e7aec90f9.jpg");
        list.add("http://e.hiphotos.baidu.com/image/pic/item/267f9e2f07082838939b6af2b299a9014d08f146.jpg");
        list.add("http://g.hiphotos.baidu.com/image/pic/item/8b13632762d0f7033f95d50c02fa513d2697c53f.jpg");
        list.add("http://f.hiphotos.baidu.com/image/pic/item/472309f7905298221fb7cb2cddca7bcb0b46d45d.jpg");
        list.add("http://g.hiphotos.baidu.com/image/pic/item/3b87e950352ac65cd664c398f1f2b21192138afc.jpg");
        list.add("http://g.hiphotos.baidu.com/image/pic/item/960a304e251f95caa71f9f58c3177f3e66095271.jpg");
    }

    public void 开始(View view) {
        ImageViewer imageViewer = ImageViewer.getInstance(this)
                .setData(list);
        imageViewer.setPosition(5).show();
    }
}
