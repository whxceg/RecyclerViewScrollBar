
#### RecyclerViewScrollBar
```
RecyclerView添加ScrollBar。
```
###### 自定义属性
```
 <declare-styleable name="RecyclerViewScrollBar">
        <attr name="rsbTrackDrawable" format="reference|color"/>
        <attr name="rsbThumbDrawable" format="reference|color"/>
        <attr name="rsbRadio" format="dimension"/>
        <attr name="rsbTrackColor" format="color"/>
        <attr name="rsbThumbColor" format="color"/>
        <attr name="rsbOrientation" format="enum">
            <enum name="horizontal" value="0"/>
            <enum name="vertical" value="1"/>
        </attr>
    </declare-styleable>
```
属性|介绍
-|-
rsbTrackDrawable | ScrollBar背景
rsbThumbDrawable  | ScrollBar滚动条
rsbRadio  | ScrollBar背景和滚动条圆角
rsbThumbColor  | ScrollBar滚动条颜色
rsbTrackColor  | ScrollBar背景颜色
rsbOrientation |  ScrollBar方向（水平（默认）、垂直）

注意：RecyclerViewScrollBar优先使用rsbTrackDrawable、rsbThumbDrawable，没有设置时再根据颜色和角度设置滚动条样式。

###### 实例代码
* 通过drawable来设置Drawable 
```
<com.sam.lib.recyclerview.scrollbar.RecyclerViewScrollBar
            android:id="@+id/mScrollBar"
            android:layout_width="100dp"
            android:layout_height="5dp"
            app:rsbThumbDrawable="@drawable/scroll_bar_thumb"
            app:rsbTrackDrawable="@drawable/scroll_bar_track"
    />
```
* 自定义颜色和角度
```
    <com.sam.lib.recyclerview.scrollbar.RecyclerViewScrollBar
            android:id="@+id/mScrollBar2"
            android:layout_width="5dp"
            android:layout_height="100dp"
            app:rsbRadio="5dp"
            app:rsbThumbColor="@color/colorAccent"
            app:rsbOrientation="vertical"
            app:rsbTrackColor="@color/colorPrimaryDark"
    />
```
* 截图
![image](https://github.com/whxceg/RecyclerViewScrollBar/blob/master/screenshot/device-2019-05-15-164905.png)
