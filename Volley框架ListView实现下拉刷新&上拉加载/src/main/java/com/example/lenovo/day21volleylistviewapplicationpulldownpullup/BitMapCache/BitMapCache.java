package com.example.lenovo.day21volleylistviewapplicationpulldownpullup.BitMapCache;

import android.graphics.Bitmap;
import android.util.LruCache;

import com.android.volley.toolbox.ImageLoader;

/**
 * Created by lenovo on 2016/5/7.
 * 用于图片的缓存  一般手机的ROM 在3个G左右
 */
public class BitMapCache implements ImageLoader.ImageCache{
    private LruCache<String,Bitmap> cache;//图片缓存

    public BitMapCache() {
        //估计图片的大小为8M 超过8兆则由GI负责释放缓存
        cache = new LruCache<String, Bitmap>(8*1024*1024){
            @Override
            //获取图片的实际大小
            protected int sizeOf(String key, Bitmap value) {
                return value.getRowBytes()*value.getHeight();
            }
        };
    }

    @Override
    public Bitmap getBitmap(String url) {
        //url图片的网络地址
        return cache.get(url);
    }

    @Override
    public void putBitmap(String url, Bitmap bitmap) {
        cache.put(url,bitmap);
    }
}
